package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.lang.editor.menus.substitute.SingleItemSubstituteMenuPart;
import org.jetbrains.annotations.Nullable;
import org.apache.log4j.Logger;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.EditorMenuTraceInfo;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.baseLanguage.actions.ExpectedType_FactoryUtil;
import jetbrains.mps.baseLanguage.actions.PrecedenceUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class smartCast extends SubstituteMenuBase {
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new smartCast.SMP_Action_nkius4_a(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new smartCast.SMP_Action_nkius4_b(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
    return result;
  }

  @NotNull
  @Override
  public List<SubstituteMenuItem> createMenuItems(@NotNull SubstituteMenuContext context) {
    context.getEditorMenuTrace().pushTraceInfo();
    context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase("named substitute menu " + "smartCast", new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586960298")));
    try {
      return super.createMenuItems(context);
    } finally {
      context.getEditorMenuTrace().popTraceInfo();
    }
  }


  private class SMP_Action_nkius4_a extends SingleItemSubstituteMenuPart {

    @Nullable
    @Override
    protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
      smartCast.SMP_Action_nkius4_a.Item item = new smartCast.SMP_Action_nkius4_a.Item(_context);
      String description;
      try {
        description = "Substitute item: " + item.getMatchingText("");
      } catch (Throwable t) {
        Logger.getLogger(getClass()).error("Exception while executing getMatchingText() of the item " + item, t);
        return null;
      }

      _context.getEditorMenuTrace().pushTraceInfo();
      try {
        _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586960300")));
        item.setTraceInfo(_context.getEditorMenuTrace().getTraceInfo());
      } finally {
        _context.getEditorMenuTrace().popTraceInfo();
      }

      return item;
    }
    private class Item extends DefaultSubstituteMenuItem {
      private final SubstituteMenuContext _context;
      private EditorMenuTraceInfo myTraceInfo;
      public Item(SubstituteMenuContext context) {
        super(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
        _context = context;
      }

      private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
        myTraceInfo = traceInfo;
      }

      @Nullable
      @Override
      public SNode createNode(@NotNull String pattern) {
        if (!(SNodeOperations.isInstanceOf(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")))) {
          return SNodeFactoryOperations.createNewNode(SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression")), null);
        }
        SNode originalExpression = ExpectedType_FactoryUtil.getOriginalExpression(_context.getParentNode(), SNodeOperations.cast(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
        SNode castType = null;
        if ((originalExpression != null)) {
          castType = ExpectedType_FactoryUtil.createExpectedType(SNodeOperations.cast(originalExpression, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
        }
        if (SNodeOperations.isInstanceOf(_context.getParentNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")) && !(SNodeOperations.isInstanceOf(_context.getParentNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")))) {
          SNode p = _quotation_createNode_nkius4_a0a0e0a0(SNodeOperations.copyNode(castType), SNodeOperations.copyNode(_context.getCurrentTargetNode()));
          PrecedenceUtil.parenthesiseIfNecessary(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(p, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression")));
          return p;
        } else {
          SNode c = _quotation_createNode_nkius4_a0a0a4a0a(SNodeOperations.copyNode(castType), SNodeOperations.copyNode(_context.getCurrentTargetNode()));
          PrecedenceUtil.parenthesiseIfNecessary(SLinkOperations.getTarget(c, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression")));
          return c;
        }
      }

      @Override
      public EditorMenuTraceInfo getTraceInfo() {
        return myTraceInfo;
      }
      @Nullable
      @Override
      public String getMatchingText(@NotNull String pattern) {
        return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression").getConceptAlias();
      }
      @Nullable
      @Override
      public String getDescriptionText(@NotNull String pattern) {
        return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression").getShortDescription();
      }
    }
  }
  private class SMP_Action_nkius4_b extends SingleItemSubstituteMenuPart {

    @Nullable
    @Override
    protected SubstituteMenuItem createItem(SubstituteMenuContext _context) {
      smartCast.SMP_Action_nkius4_b.Item item = new smartCast.SMP_Action_nkius4_b.Item(_context);
      String description;
      try {
        description = "Substitute item: " + item.getMatchingText("");
      } catch (Throwable t) {
        Logger.getLogger(getClass()).error("Exception while executing getMatchingText() of the item " + item, t);
        return null;
      }

      _context.getEditorMenuTrace().pushTraceInfo();
      try {
        _context.getEditorMenuTrace().setDescriptor(new EditorMenuDescriptorBase(description, new SNodePointer("r:00000000-0000-4000-0000-011c895902c3(jetbrains.mps.baseLanguage.editor)", "1741258697586960470")));
        item.setTraceInfo(_context.getEditorMenuTrace().getTraceInfo());
      } finally {
        _context.getEditorMenuTrace().popTraceInfo();
      }

      return item;
    }
    private class Item extends DefaultSubstituteMenuItem {
      private final SubstituteMenuContext _context;
      private EditorMenuTraceInfo myTraceInfo;
      public Item(SubstituteMenuContext context) {
        super(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"), context.getParentNode(), context.getCurrentTargetNode(), context.getEditorContext());
        _context = context;
      }

      private void setTraceInfo(EditorMenuTraceInfo traceInfo) {
        myTraceInfo = traceInfo;
      }

      @Nullable
      @Override
      public SNode createNode(@NotNull String pattern) {
        SNode cast = SNodeFactoryOperations.createNewNode(_context.getModel(), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression")), null);
        SNode parens = SNodeFactoryOperations.createNewNode(_context.getModel(), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression")), null);
        SLinkOperations.setTarget(parens, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression"), cast);
        SNode instanceOf = ExpectedType_FactoryUtil.getCorrespondingInstanceOf((_context.getCurrentTargetNode() != null && SNodeOperations.getParent(_context.getCurrentTargetNode()) == _context.getParentNode() ? _context.getCurrentTargetNode() : _context.getParentNode()));
        if ((instanceOf != null)) {
          SLinkOperations.setTarget(cast, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4bL, "type"), SNodeOperations.copyNode(SLinkOperations.getTarget(instanceOf, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbff03700L, 0xfbbff06219L, "classType"))));
          SLinkOperations.setTarget(cast, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"), (_context.getCurrentTargetNode() == null || SNodeOperations.getConcept(_context.getCurrentTargetNode()).isAbstract() ? SNodeOperations.copyNode(SLinkOperations.getTarget(instanceOf, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbff03700L, 0xfbbff06218L, "leftExpression"))) : null));
          if ((SLinkOperations.getTarget(cast, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression")) == null) && SNodeOperations.isInstanceOf(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"))) {
            SLinkOperations.setTarget(cast, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"), SNodeOperations.copyNode(_context.getCurrentTargetNode()));
          }
        } else if (SNodeOperations.isInstanceOf(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"))) {
          SNode originalExpression = ExpectedType_FactoryUtil.getOriginalExpression(_context.getParentNode(), SNodeOperations.cast(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
          if ((originalExpression != null)) {
            SNode castType = ExpectedType_FactoryUtil.createExpectedType(SNodeOperations.cast(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
            if (castType != null) {
              SLinkOperations.setTarget(cast, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4bL, "type"), castType);
            }
          }

          SLinkOperations.setTarget(cast, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"), SNodeOperations.copyNode(_context.getCurrentTargetNode()));
        }
        SNode expr = SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(parens, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, "jetbrains.mps.baseLanguage.structure.CastExpression")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"));
        if (expr != null) {
          PrecedenceUtil.parenthesiseIfNecessary(expr);
        }
        return parens;
      }

      @Override
      public EditorMenuTraceInfo getTraceInfo() {
        return myTraceInfo;
      }
      @Nullable
      @Override
      public String getMatchingText(@NotNull String pattern) {
        if (pattern.startsWith("(")) {
          String typeName = "type";
          String varName = "expr";
          SNode instanceOf = ExpectedType_FactoryUtil.getCorrespondingInstanceOf((_context.getCurrentTargetNode() != null && SNodeOperations.getParent(_context.getCurrentTargetNode()) == _context.getParentNode() ? _context.getCurrentTargetNode() : _context.getParentNode()));
          SNode var;
          if (instanceOf != null) {
            if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(instanceOf, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbff03700L, 0xfbbff06219L, "classType")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
              typeName = BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(SNodeOperations.cast(SLinkOperations.getTarget(instanceOf, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbff03700L, 0xfbbff06219L, "classType")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType")));
            }
            var = (_context.getCurrentTargetNode() == null || SNodeOperations.getConcept(_context.getCurrentTargetNode()).isAbstract() ? SLinkOperations.getTarget(instanceOf, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbbff03700L, 0xfbbff06218L, "leftExpression")) : _context.getCurrentTargetNode());
          } else {
            if (SNodeOperations.isInstanceOf(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression"))) {
              SNode originalExpression = ExpectedType_FactoryUtil.getOriginalExpression(_context.getParentNode(), SNodeOperations.cast(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
              if ((originalExpression != null)) {
                SNode castType = ExpectedType_FactoryUtil.createExpectedType(SNodeOperations.cast(_context.getCurrentTargetNode(), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37f506fL, "jetbrains.mps.baseLanguage.structure.Expression")));
                if (castType != null) {
                  if (SNodeOperations.isInstanceOf(castType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType"))) {
                    typeName = BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke((SNodeOperations.cast(castType, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, "jetbrains.mps.baseLanguage.structure.ClassifierType"))));
                  } else {
                    typeName = SConceptOperations.conceptAlias(SNodeOperations.getConcept(castType));
                  }
                }
              }
            }

            var = _context.getCurrentTargetNode();
          }
          if ((SNodeOperations.isInstanceOf(var, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(var, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7efL, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")))) {
            varName = SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(var, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
          } else if ((SNodeOperations.isInstanceOf(var, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")) && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(var, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e94L, "jetbrains.mps.baseLanguage.structure.ParameterDeclaration")))) {
            varName = SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(var, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, 0xf8cc6bf960L, "variableDeclaration")), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
          }
          return "((" + typeName + ")" + varName + ")";
        }
        return "((type)expr)";

      }
      @Nullable
      @Override
      public String getDescriptionText(@NotNull String pattern) {
        return "smart type cast expression";
      }
    }
  }
  private static SNode _quotation_createNode_nkius4_a0a0e0a0(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    SNode quotedNode_6 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xfb4ed32b7fL, "ParenthesizedExpression"), null, null, false);
    quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940dabe4aL, "CastExpression"), null, null, false);
    quotedNode_5 = (SNode) parameter_1;
    if (quotedNode_5 != null) {
      quotedNode_4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4bL, "type"), HUtil.copyIfNecessary(quotedNode_5));
    }
    quotedNode_6 = (SNode) parameter_2;
    if (quotedNode_6 != null) {
      quotedNode_4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"), HUtil.copyIfNecessary(quotedNode_6));
    }
    quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression"), quotedNode_4);
    return quotedNode_3;
  }
  private static SNode _quotation_createNode_nkius4_a0a0a4a0a(Object parameter_1, Object parameter_2) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_3 = null;
    SNode quotedNode_4 = null;
    SNode quotedNode_5 = null;
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, "jetbrains.mps.baseLanguage"), 0xf940dabe4aL, "CastExpression"), null, null, false);
    quotedNode_4 = (SNode) parameter_1;
    if (quotedNode_4 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4bL, "type"), HUtil.copyIfNecessary(quotedNode_4));
    }
    quotedNode_5 = (SNode) parameter_2;
    if (quotedNode_5 != null) {
      quotedNode_3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940dabe4aL, 0xf940dabe4cL, "expression"), HUtil.copyIfNecessary(quotedNode_5));
    }
    return quotedNode_3;
  }
}
