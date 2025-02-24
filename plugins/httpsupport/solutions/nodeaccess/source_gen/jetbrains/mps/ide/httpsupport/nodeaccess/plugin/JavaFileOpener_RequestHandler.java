package jetbrains.mps.ide.httpsupport.nodeaccess.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.httpsupport.runtime.base.HttpRequestHandlerBase;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.project.Project;
import jetbrains.mps.ide.httpsupport.manager.plugin.HttpRequest;
import jetbrains.mps.ide.httpsupport.runtime.base.HttpSupportUtil;
import jetbrains.mps.project.MPSProject;
import java.util.Iterator;
import jetbrains.mps.textgen.trace.DebugInfo;
import jetbrains.mps.textgen.trace.DefaultTraceInfoProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.textgen.trace.BaseLanguageNodeLookup;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.buffer.Unpooled;
import jetbrains.mps.textgen.trace.DebugInfoRoot;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.common.FileOpenUtil;

public class JavaFileOpener_RequestHandler extends HttpRequestHandlerBase {

  private static final List<String> QUERY_PREFIX = ListSequence.fromListAndArray(new ArrayList<String>(), "file");

  private final boolean myCorrectRequest;
  private final String file;
  private final Integer line;
  private final Project project;

  public JavaFileOpener_RequestHandler(HttpRequest request) {
    super(request);
    boolean correctRequest = true;
    {
      String file_serialized = ListSequence.fromList(this.request.getParameterValue("file")).getElement(0);
      if (file_serialized != null) {
        this.file = file_serialized;
      } else {
        correctRequest = false;
        this.file = null;
      }
    }
    {
      String line_serialized = ListSequence.fromList(this.request.getParameterValue("line")).getElement(0);
      if (line_serialized != null) {
        this.line = HttpSupportUtil.parseInt(line_serialized);
      } else {
        this.line = null;
      }
    }
    {
      String project_serialized = ListSequence.fromList(this.request.getParameterValue("project")).getElement(0);
      if (project_serialized != null) {
        this.project = HttpSupportUtil.getProjectByName(project_serialized);
      } else {
        this.project = HttpSupportUtil.getSomeProject();
      }
    }
    myCorrectRequest = correctRequest;
  }


  @Override
  protected List<String> getQueryPrefix() {
    return QUERY_PREFIX;
  }


  @Override
  public boolean canHandle() {
    if (!(myCorrectRequest) || !(super.canHandle())) {
      return false;
    }

    return this.file.endsWith(".java");
  }

  @Override
  public void handle() throws Exception {

    if (this.project != null) {
      final com.intellij.openapi.project.Project ideaProject = ((this.project instanceof MPSProject) ? ((MPSProject) this.project).getProject() : null);


      int sourceGen = this.file.lastIndexOf(HandlerUtil.SOURCE_GEN);
      int unitNamePosition = (sourceGen == -1 ? 0 : sourceGen + HandlerUtil.SOURCE_GEN.length());
      int unitNameEndPostion = this.file.length() - ".java".length();
      String unitName = this.file.substring(unitNamePosition, unitNameEndPostion).replace('/', '.');
      String namespace = unitName.substring(0, unitName.lastIndexOf("."));

      final String fileName = this.file.substring(this.file.lastIndexOf("/") + 1);

      Iterator<DebugInfo> it = new DefaultTraceInfoProvider(this.project.getRepository()).debugInfo(namespace).iterator();
      if (this.line != null) {
        while (it.hasNext()) {
          final SNodeReference nodeReference = new BaseLanguageNodeLookup(it.next()).getNodeAt(fileName, this.line);
          if (HandlerUtil.openNode(this.project, nodeReference) != null) {
            this.request.sendResponse(HttpResponseStatus.OK, "image/gif", Unpooled.copiedBuffer(HandlerUtil.SUCCESS_STREAM));
            return;
          }
        }
      } else {
        while (it.hasNext()) {
          Iterable<DebugInfoRoot> debugInfoRoots = it.next().getRoots();
          SNodeReference nodeReference = Sequence.fromIterable(debugInfoRoots).where(new IWhereFilter<DebugInfoRoot>() {
            public boolean accept(DebugInfoRoot debugInfoRoot) {
              return debugInfoRoot.getFileNames().contains(fileName);
            }
          }).first().getNodeRef();
          if (HandlerUtil.openNode(this.project, nodeReference) != null) {
            this.request.sendResponse(HttpResponseStatus.OK, "image/gif", Unpooled.copiedBuffer(HandlerUtil.SUCCESS_STREAM));
            return;
          }
        }
      }

      final VirtualFile virtualFile = FileOpenUtil.findFile(ideaProject, unitName, fileName);
      if (virtualFile != null) {
        this.request.sendResponse(HttpResponseStatus.OK, "image/gif", Unpooled.copiedBuffer(HandlerUtil.SUCCESS_STREAM));
        this.project.getModelAccess().runWriteInEDT(new Runnable() {
          public void run() {
            FileOpenUtil.openFile(ideaProject, virtualFile, (JavaFileOpener_RequestHandler.this.line == null ? 1 : JavaFileOpener_RequestHandler.this.line));
            HandlerUtil.requestFocus(JavaFileOpener_RequestHandler.this.project);
          }
        });
        return;
      }
      this.request.sendResponse(HttpResponseStatus.OK, "image/gif", Unpooled.copiedBuffer(HandlerUtil.FAILURE_STREAM));
    } else {
      HandlerUtil.showNoProjectIsAvailablePopup();
      this.request.sendResponse(HttpResponseStatus.OK, "image/gif", Unpooled.copiedBuffer(HandlerUtil.FAILURE_STREAM));
    }
  }
}
