package jetbrains.mps.build.mps.util;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.build.util.Context;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.vfs.openapi.FileSystem;
import jetbrains.mps.project.io.DescriptorIOFacade;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.build.behavior.BuildSourcePath__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.io.File;
import java.io.IOException;
import jetbrains.mps.vfs.IFile;
import jetbrains.mps.project.structure.modules.ModuleDescriptor;
import jetbrains.mps.util.MacroHelper;

public final class ModuleLoader {
  private final SNode myBuildProject;
  private final PathConverter myPathConverter;
  private final VisibleModules myVisibleModules;
  private final Context myBuildContext;
  private final IMessageHandler myMsgHandler;
  private FileSystem myFS;
  private final DescriptorIOFacade myDescriptorIO;

  public ModuleLoader(@NotNull SNode buildProject, @Nullable TemplateQueryContext genContext, IMessageHandler msgHandler) {
    myBuildProject = buildProject;
    myBuildContext = (genContext != null ? Context.defaultContext(genContext) : Context.defaultContext());
    myPathConverter = new PathConverter(myBuildContext, buildProject);
    myVisibleModules = new VisibleModules(buildProject);
    myVisibleModules.collect();
    myMsgHandler = msgHandler;
    // TODO enforce outer code to specify FS to avoid singleton access 
    myFS = jetbrains.mps.vfs.FileSystem.getInstance();
    // TODO need access to plafrom to obtain DescriptorIOFacade instance, or supply from caller. 
    myDescriptorIO = DescriptorIOFacade.getInstance();
  }

  public ModuleLoader useFileSystem(jetbrains.mps.vfs.FileSystem fs) {
    myFS = fs;
    return this;
  }

  private void reportError(String msg, SNode node) {
    myMsgHandler.handle(Message.createMessage(MessageKind.ERROR, getClass().getName(), msg, SNodeOperations.getPointer(node)));
  }

  public void checkAllModules(final ModuleChecker.CheckType type) {
    Iterable<SNode> parts = SLinkOperations.getChildren(myBuildProject, MetaAdapterFactory.getContainmentLink(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, 0x668c6cfbafacf6f2L, "parts"));

    Sequence.fromIterable(SLinkOperations.collectMany(SNodeOperations.ofConcept(parts, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x14d3fb6fb843ebddL, "jetbrains.mps.build.mps.structure.BuildMps_Group")), MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x14d3fb6fb843ebddL, 0x14d3fb6fb843ebdeL, "modules"))).union(Sequence.fromIterable(SNodeOperations.ofConcept(parts, MetaAdapterFactory.getConcept(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d333ebL, "jetbrains.mps.build.mps.structure.BuildMps_AbstractModule")))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return (SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d333ebL, 0x4780308f5d47f25L, "path")) != null);
      }
    }).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        createModuleChecker(it).check(type);
      }
    });
  }

  public ModuleChecker createModuleChecker(SNode module) {
    assert SNodeOperations.getNodeAncestor(module, MetaAdapterFactory.getConcept(0x798100da4f0a421aL, 0xb99171f8c50ce5d2L, 0x4df58c6f18f84a13L, "jetbrains.mps.build.structure.BuildProject"), false, false) == myBuildProject;
    String moduleFilePath = BuildSourcePath__BehaviorDescriptor.getLocalPath_id4Kip2_918Y$.invoke(SLinkOperations.getTarget(module, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d333ebL, 0x4780308f5d47f25L, "path")), myBuildContext);
    if (moduleFilePath == null) {
      reportError(String.format("cannot import module file for %s: file doesn't exist (%s)", SPropertyOperations.getString(module, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), BuildSourcePath__BehaviorDescriptor.getAntPath_id7ro1ZztyOh5.invoke(SLinkOperations.getTarget(module, MetaAdapterFactory.getContainmentLink(0xcf935df46994e9cL, 0xa132fa109541cba3L, 0x4780308f5d333ebL, 0x4780308f5d47f25L, "path")), myBuildContext)), module);
      return new ModuleChecker(module, myVisibleModules, myPathConverter, null, null, myMsgHandler);
    }

    try {
      moduleFilePath = new File(moduleFilePath).getCanonicalPath();
    } catch (IOException ex) {
      // ignore 
    }

    IFile file = myFS.getFile(moduleFilePath);
    if (!(file.exists())) {
      reportError(String.format("cannot import module file for %s: file doesn't exist (%s)", SPropertyOperations.getString(module, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), moduleFilePath), module);
      return new ModuleChecker(module, myVisibleModules, myPathConverter, null, null, myMsgHandler);
    }
    if (file.isDirectory()) {
      reportError(String.format("cannot import module file for %s: file is a directory (%s)", SPropertyOperations.getString(module, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), moduleFilePath), module);
      return new ModuleChecker(module, myVisibleModules, myPathConverter, null, null, myMsgHandler);
    }

    ModuleDescriptor md = null;
    try {
      MacroHelper helper = new ModuleLoaderUtils.ModuleMacroHelper(file.getParent(), myBuildContext, myBuildProject, myMsgHandler);
      md = myDescriptorIO.readFromModuleFile(helper, file);
      if (md.getLoadException() != null) {
        reportError(String.format("cannot import module file for %s: exception: %s", SPropertyOperations.getString(module, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), md.getLoadException().getMessage()), module);
      }
    } catch (Exception ex) {
      reportError(String.format("cannot import module file for %s: exception: %s", SPropertyOperations.getString(module, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")), ex.getMessage()), module);
    }

    return new ModuleChecker(module, myVisibleModules, myPathConverter, file, md, myMsgHandler);
  }
}
