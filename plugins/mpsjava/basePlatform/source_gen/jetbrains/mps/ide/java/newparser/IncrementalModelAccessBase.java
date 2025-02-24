package jetbrains.mps.ide.java.newparser;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.ModelAccess;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.messages.IMessageHandler;
import java.util.List;
import jetbrains.mps.smodel.loading.UpdateModeSupport;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.extapi.model.SModelData;
import jetbrains.mps.extapi.model.SModelBase;
import jetbrains.mps.messages.Message;
import jetbrains.mps.messages.MessageKind;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

/*package*/ abstract class IncrementalModelAccessBase implements IncrementalModelAccess {
  protected final ModelAccess myModelAccess;
  private Iterable<SModel> myModels;
  private IMessageHandler myMessageHandler;

  public IncrementalModelAccessBase(ModelAccess modelAccess, Iterable<SModel> models, IMessageHandler messageHandler) {
    myModelAccess = modelAccess;
    myModels = models;
    myMessageHandler = messageHandler;
  }

  @Override
  public void accessModel(Runnable runnable) {
    myModelAccess.runReadAction(runnable);
  }

  @Override
  public void replaceReferences(Runnable runnable) {
    executeInUpdateMode(runnable);
  }

  protected void executeInUpdateMode(final Runnable runnable) {
    myModelAccess.runWriteAction(new Runnable() {
      public void run() {
        final List<UpdateModeSupport> modelsInUpdateMode = ListSequence.fromList(new ArrayList<UpdateModeSupport>());
        try {
          // here we assume that runnable changes a lot of models, so we enter update mode for all of them 
          Sequence.fromIterable(myModels).visitAll(new IVisitor<SModel>() {
            public void visit(SModel model) {
              SModelData modelData = ((SModelBase) model).getModelData();
              if (modelData instanceof UpdateModeSupport) {
                ((UpdateModeSupport) modelData).enterUpdateMode();
                ListSequence.fromList(modelsInUpdateMode).addElement((UpdateModeSupport) modelData);
              } else {
                // ignoring the model 
                myMessageHandler.handle(new Message(MessageKind.ERROR, String.format("model %s doesn't support update mode which java import relies on", SModelOperations.getModelName(model))));
              }
            }
          });

          runnable.run();
        } finally {
          ListSequence.fromList(modelsInUpdateMode).visitAll(new IVisitor<UpdateModeSupport>() {
            public void visit(UpdateModeSupport it) {
              it.leaveUpdateMode();
            }
          });
        }
      }
    });
  }
}
