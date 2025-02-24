package jetbrains.mps.lang.actions.migration;

/*Generated by MPS */

import org.jetbrains.mps.openapi.module.SModule;
import jetbrains.mps.smodel.Language;
import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.util.Pair;
import java.util.List;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import org.jetbrains.mps.openapi.module.SearchScope;
import jetbrains.mps.lang.smodel.query.runtime.CommandUtil;
import jetbrains.mps.lang.smodel.query.runtime.QueryExecutionContext;
import java.util.Collection;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.CollectionSequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import org.jetbrains.mps.openapi.model.SModel;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import java.util.ArrayList;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

/*package*/ class SideTransformActionsMigrationHelper {
  private SModule myModule;
  private Language myLanguage;

  private Map<SNode, Map<Pair<SNode, String>, List<SNode>>> myActionsToConceptAndTagToBuilder = new HashMap<SNode, Map<Pair<SNode, String>, List<SNode>>>();
  private Map<Pair<SNode, String>, Set<SNode>> myConceptAndTagToActions = new HashMap<Pair<SNode, String>, Set<SNode>>();

  private Map<Pair<SNode, String>, SNode> myMainMenus = new HashMap<Pair<SNode, String>, SNode>();
  private Set<SNode> myNewlyCreatedMenus = new HashSet<SNode>();

  private boolean myMigrateConceptFromSameLanguage;



  /*package*/ SideTransformActionsMigrationHelper(SModule m, boolean migrateConceptFromThisLanguage) {
    myModule = m;
    myMigrateConceptFromSameLanguage = migrateConceptFromThisLanguage;
    if (myModule instanceof Language) {
      myLanguage = ((Language) myModule);
    }
  }
  public void migrate() {
    if (myLanguage == null) {
      return;
    }
    {
      final SearchScope scope = CommandUtil.createScope(myModule);
      QueryExecutionContext context = new QueryExecutionContext() {
        public SearchScope getDefaultSearchScope() {
          return scope;
        }
      };
      Collection<SNode> allSideTransformActions = CommandUtil.instances(CommandUtil.selectScope(null, context), MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108fad1c116L, "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActions"), false);
      for (SNode actions : CollectionSequence.fromCollection(allSideTransformActions)) {
        for (SNode builder : ListSequence.fromList(SLinkOperations.getChildren(actions, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108fad1c116L, 0x108fad1c117L, "actionsBuilder"))).where(new IWhereFilter<SNode>() {
          public boolean accept(SNode it) {
            return myMigrateConceptFromSameLanguage == isDefinedInSameLanguage(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x108facec6d6L, "applicableConcept")));
          }
        })) {
          if (!(SConceptOperations.isExactly(SNodeOperations.asSConcept(SNodeOperations.getConcept(builder)), MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, "jetbrains.mps.lang.actions.structure.SideTransformHintSubstituteActionsBuilder")))) {
            AttributeOperations.setAttribute(builder, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x7ce019826543db5L, "jetbrains.mps.lang.actions.structure.MigrateManuallyAnnotation")), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x7ce019826543db5L, "jetbrains.mps.lang.actions.structure.MigrateManuallyAnnotation")));
            continue;
          }

          addToConceptAndTagToBuilderMap(actions, builder);
          addToBuilderToMenuMap(actions, builder);
        }
      }
      Set<SNode> actionsKeySet = myActionsToConceptAndTagToBuilder.keySet();
      for (SNode actions : SetSequence.fromSet(actionsKeySet)) {
        Map<Pair<SNode, String>, List<SNode>> conceptAndTagToBuilder = myActionsToConceptAndTagToBuilder.get(actions);
        for (Pair<SNode, String> key : SetSequence.fromSet(conceptAndTagToBuilder.keySet())) {
          migrateSideTransformActions(actions, key.o1, key.o2, conceptAndTagToBuilder.get(key));
        }
      }

    }
    ActionMigrationHelper.addMissingImports(myNewlyCreatedMenus, ActionMigrationHelper.getEditorAspect(myLanguage), ActionMigrationHelper.getActionsAspect(myLanguage), myLanguage.getRepository());
    if (!(myNewlyCreatedMenus.isEmpty())) {
      ActionMigrationHelper.addModelImport(ActionMigrationHelper.getActionsAspect(myLanguage), ActionMigrationHelper.getEditorAspect(myLanguage));
    }
  }

  private SNode getOrCreateMainMenu(SNode concept, String tag, SModel editorAspect) {
    Pair<SNode, String> pair = new Pair<SNode, String>(concept, tag);
    SNode menu = myMainMenus.get(pair);
    if ((menu != null)) {
      return menu;
    }
    Set<SNode> actions = myConceptAndTagToActions.get(pair);
    assert actions.size() > 0;
    if (!(myMigrateConceptFromSameLanguage)) {
      return createMainContribution(tag, concept, editorAspect);
    } else {
      return findOrCreateMainMenu(tag, concept, editorAspect);
    }
  }
  private SNode findOrCreateMainMenu(String tag, SNode concept, SModel editorAspect) {
    SNode mainMenu;
    if (Objects.equals(tag, "default_RTransform")) {
      mainMenu = findDefaultMenu(concept);
      if (mainMenu == null) {
        mainMenu = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384efce1L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Default"));
        SLinkOperations.setTarget(SNodeOperations.cast(mainMenu, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384efce1L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Default")), MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a9048c53L, 0x5b7b4c4d511049b4L, "conceptDeclaration"), concept);
        SNode leftRightSection = findOrCreateLeftRightSection(mainMenu);
        SLinkOperations.addNewChild(leftRightSection, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbfL, "parts"), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7541587144d24773L, "jetbrains.mps.lang.editor.structure.TransformationMenuPart_Super"));
        myNewlyCreatedMenus.add(mainMenu);
        editorAspect.addRootNode(mainMenu);
      }
    } else {
      mainMenu = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0ac4ee8L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Named"));
      SPropertyOperations.set(mainMenu, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), getMainMenuName(concept, tag));
      SLinkOperations.setTarget(SNodeOperations.cast(mainMenu, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0ac4ee8L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Named")), MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a9048c53L, 0x5b7b4c4d511049b4L, "conceptDeclaration"), concept);
      AttributeOperations.createAndSetAttrbiute(SNodeOperations.cast(mainMenu, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0ac4ee8L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Named")), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce019825aa4e82L, "jetbrains.mps.lang.editor.structure.MigratedSideTransformMenuAttribute")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce019825aa4e82L, "jetbrains.mps.lang.editor.structure.MigratedSideTransformMenuAttribute"));
      SPropertyOperations.set(AttributeOperations.getAttribute(SNodeOperations.cast(mainMenu, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0ac4ee8L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Named")), new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce019825aa4e82L, "jetbrains.mps.lang.editor.structure.MigratedSideTransformMenuAttribute"))), MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce019825aa4e82L, 0x7ce019825aa4f13L, "transformTag"), tag);
      editorAspect.addRootNode(mainMenu);
    }
    myMainMenus.put(new Pair(concept, tag), mainMenu);
    return mainMenu;
  }
  private SNode createMainContribution(String tag, SNode concept, SModel editorAspect) {
    SNode contribution = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c10ff0L, "jetbrains.mps.lang.editor.structure.TransformationMenuContribution"));
    if (Objects.equals(tag, "default_RTransform")) {
      SLinkOperations.setTarget(contribution, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c10ff0L, 0x5d3b34577b60a0bfL, "menuReference"), _quotation_createNode_syzi2_a0a0b0s(concept));
    } else {
      SModule module = SNodeOperations.getModel(concept).getModule();
      if (module instanceof Language) {
        SNode mainMenu = ActionMigrationHelper.findMainNamedMenu(concept, tag);
        if (mainMenu != null) {
          SLinkOperations.setTarget(contribution, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c10ff0L, 0x5d3b34577b60a0bfL, "menuReference"), _quotation_createNode_syzi2_a0a0b0b0a1a81(mainMenu));
          ActionMigrationHelper.addModelImport(editorAspect, SNodeOperations.getModel(mainMenu));
        } else {
          AttributeOperations.setAttribute(contribution, new IAttributeDescriptor.NodeAttribute(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce0198267c4eb2L, "jetbrains.mps.lang.editor.structure.MigrateManuallyAnnotation")), SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x7ce0198267c4eb2L, "jetbrains.mps.lang.editor.structure.MigrateManuallyAnnotation")));
        }
      }
    }
    SPropertyOperations.set(contribution, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), ActionMigrationHelper.getMainMenuContributionName(concept, tag));
    myMainMenus.put(new Pair(concept, tag), contribution);
    myNewlyCreatedMenus.add(contribution);
    editorAspect.addRootNode(contribution);
    return contribution;
  }
  private SNode findDefaultMenu(final SNode concept) {
    SModel conceptEditorAspect = ActionMigrationHelper.getEditorAspect(myLanguage);
    return ListSequence.fromList(SModelOperations.roots(conceptEditorAspect, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x16be955f384efce1L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Default"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return Objects.equals(SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a9048c53L, 0x5b7b4c4d511049b4L, "conceptDeclaration")), concept);
      }
    }).first();
  }
  private String getMainMenuName(SNode concept, String tag) {
    return SPropertyOperations.getString(concept, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_" + tag + "_Menu";
  }


  private SNode createAdditionalMenu(SNode concept, String tag, SNode actions, SModel editorAspect) {
    String newName = getAdditionalMenuName(actions, concept, tag);
    SNode menu = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0ac4ee8L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Named"));
    SPropertyOperations.set(menu, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), newName);
    myNewlyCreatedMenus.add(menu);
    SLinkOperations.setTarget(menu, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a9048c53L, 0x5b7b4c4d511049b4L, "conceptDeclaration"), concept);
    editorAspect.addRootNode(menu);
    return menu;
  }
  private String getAdditionalMenuName(SNode actions, SNode concept, String tag) {
    boolean isUniqueConcept = true;
    boolean isUniqueTag = true;
    for (SNode builder : ListSequence.fromList(SLinkOperations.getChildren(actions, MetaAdapterFactory.getContainmentLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108fad1c116L, 0x108fad1c117L, "actionsBuilder")))) {
      if (!(Objects.equals(SLinkOperations.getTarget(builder, MetaAdapterFactory.getReferenceLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x108facec6d6L, "applicableConcept")), concept))) {
        isUniqueConcept = false;
      }
      if (!(Objects.equals(SPropertyOperations.getString_def(builder, MetaAdapterFactory.getProperty(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1099eb798f9L, "transformTag"), "default_RTransform"), tag))) {
        isUniqueTag = false;
      }
      if (!(isUniqueConcept) && !(isUniqueTag)) {
        break;
      }
    }
    String oldName = ActionMigrationHelper.getValidName(SPropertyOperations.getString(actions, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));


    if (oldName == null) {
      return SPropertyOperations.getString(concept, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_" + shortTag(tag) + "_" + "TransformMenu";
    }
    String newName;
    if (isUniqueConcept) {
      if (isUniqueTag) {
        newName = oldName;
      } else {
        newName = oldName + "_" + shortTag(tag);
      }
    } else {
      if (isUniqueTag) {
        newName = oldName + "_" + SPropertyOperations.getString(concept, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
      } else {
        newName = oldName + "_" + SPropertyOperations.getString(concept, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + "_" + shortTag(tag);
      }
    }
    return newName;
  }
  private String shortTag(String tag) {
    if (tag == null || !(tag.endsWith("_RTransform"))) {
      return tag;
    }
    return tag.substring(0, tag.length() - 11);
  }

  private boolean isDefinedInSameLanguage(SNode concept) {
    if (concept == null) {
      return true;
    }
    return ActionMigrationHelper.isDefinedInLanguage(concept, myLanguage);
  }

  private void migrateSideTransformActions(SNode actions, SNode concept, String tag, List<SNode> actionBuilders) {
    int size = actionBuilders.size();
    if (size == 0) {
      return;
    }

    SModel editorAspect = ActionMigrationHelper.getOrCreateEditorAspect(myLanguage);

    Set<SNode> actionsRoots = myConceptAndTagToActions.get(new Pair<SNode, String>(concept, tag));
    int numberOfActionRoots = actionsRoots.size();
    SNode mainMenu = getOrCreateMainMenu(concept, tag, editorAspect);
    if (numberOfActionRoots > 1) {
      SNode additionalMenu = createAdditionalMenu(concept, tag, actions, editorAspect);
      migrateBuilders(additionalMenu, actionBuilders);
      includeAdditionalMenu(mainMenu, additionalMenu);
    } else {
      migrateBuilders(mainMenu, actionBuilders);
      if (SNodeOperations.isInstanceOf(mainMenu, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c10ff0L, "jetbrains.mps.lang.editor.structure.TransformationMenuContribution"))) {
        SPropertyOperations.set(mainMenu, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), getAdditionalMenuName(actions, concept, tag) + "_Contribution");
      } else if (SNodeOperations.isInstanceOf(mainMenu, MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0ac4ee8L, "jetbrains.mps.lang.editor.structure.TransformationMenu_Named"))) {
        SPropertyOperations.set(mainMenu, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), getAdditionalMenuName(actions, concept, tag));
      }
    }
  }
  private void includeAdditionalMenu(SNode mainMenu, SNode additionalMenu) {
    SNode section = findOrCreateLeftRightSection(mainMenu);
    SNode includePart = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xae2d2fe1c9d6be2L, "jetbrains.mps.lang.editor.structure.TransformationMenuPart_IncludeMenu"));
    SNode menuReference = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x5d3b34577b3cff09L, "jetbrains.mps.lang.editor.structure.TransformationMenuReference_Named"));
    SLinkOperations.setTarget(menuReference, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x5d3b34577b3cff09L, 0x5d3b34577b3cff0aL, "menu"), additionalMenu);
    SLinkOperations.setTarget(includePart, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0xae2d2fe1c9d6be2L, 0x5d3b34577b3f7ee5L, "menuReference"), menuReference);
    ListSequence.fromList(SLinkOperations.getChildren(section, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbfL, "parts"))).addElement(includePart);
  }
  private SNode findOrCreateLeftRightSection(SNode mainMenu) {
    SNode section = findLeftRightSection(mainMenu);
    if (section == null) {
      section = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, "jetbrains.mps.lang.editor.structure.TransformationMenuSection"));
      ListSequence.fromList(SLinkOperations.getChildren(section, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbdL, "locations"))).addElement(_quotation_createNode_syzi2_a0a1a1a13());
      ListSequence.fromList(SLinkOperations.getChildren(mainMenu, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c11832L, 0x16be955f384efffcL, "sections"))).addElement(section);
    }
    return section;
  }

  private SNode findLeftRightSection(SNode mainMenu) {
    return ListSequence.fromList(SLinkOperations.getChildren(mainMenu, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c11832L, 0x16be955f384efffcL, "sections"))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        Iterable<SNode> locations = SNodeOperations.ofConcept(SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbdL, "locations")), MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x28336854e4c19a06L, "jetbrains.mps.lang.editor.structure.TransformationLocation_SideTransform"));
        for (SNode location : Sequence.fromIterable(locations)) {
          boolean isLeft = false;
          boolean isRight = false;
          for (SNode place : ListSequence.fromList(SLinkOperations.getChildren(location, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x28336854e4c19a06L, 0x30335f3d1845bdcfL, "placeInCell")))) {
            if (SPropertyOperations.hasValue(place, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x30335f3d1845bdccL, 0x30335f3d1845bdcdL, "placeInCell"), "LEFT", null)) {
              isLeft = true;
            } else if (SPropertyOperations.hasValue(place, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x30335f3d1845bdccL, 0x30335f3d1845bdcdL, "placeInCell"), "RIGHT", null)) {
              isRight = true;
            }
            if (isLeft && isRight) {
              return true;
            }
          }
        }
        return false;
      }
    }).first();
  }

  private void migrateBuilders(SNode root, Iterable<SNode> builders) {
    migrateBuilders(root, builders, "left");
    migrateBuilders(root, builders, "");
    migrateBuilders(root, builders, "both");
  }

  private void migrateBuilders(SNode root, Iterable<SNode> builders, String side) {
    final Wrappers._T<String> _side = new Wrappers._T<String>(side);
    if (Objects.equals(_side.value, "")) {
      _side.value = null;
    }
    Iterable<SNode> filteredBuilders = Sequence.fromIterable(builders).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return Objects.equals(SPropertyOperations.getString_def(it, MetaAdapterFactory.getProperty(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x11b07b83602L, "side"), null), _side.value);
      }
    });
    if (Sequence.fromIterable(filteredBuilders).isEmpty()) {
      return;
    }
    SNode location = ActionMigrationHelper.createLocation(_side.value);
    SNode section = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, "jetbrains.mps.lang.editor.structure.TransformationMenuSection"));
    ListSequence.fromList(SLinkOperations.getChildren(section, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbdL, "locations"))).addElement(location);
    ListSequence.fromList(SLinkOperations.getChildren(root, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x4e0f93d8a0c11832L, 0x16be955f384efffcL, "sections"))).addElement(section);
    for (SNode builder : Sequence.fromIterable(filteredBuilders)) {
      List<SNode> parts = new SideTransformBuildersMigrationHelper(builder, root).createMenuParts();
      ListSequence.fromList(SLinkOperations.getChildren(section, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbfL, "parts"))).addSequence(ListSequence.fromList(parts));
    }
    if (ListSequence.fromList(SLinkOperations.getChildren(section, MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x6ec02d9918b4efbcL, 0x6ec02d9918b4efbfL, "parts"))).isEmpty()) {
      SNodeOperations.deleteNode(section);
    }
  }



  private void addToConceptAndTagToBuilderMap(SNode actions, SNode builder) {
    Map<Pair<SNode, String>, List<SNode>> conceptAndTagToBuilder = myActionsToConceptAndTagToBuilder.get(actions);
    if (conceptAndTagToBuilder == null) {
      conceptAndTagToBuilder = new HashMap<Pair<SNode, String>, List<SNode>>();
      myActionsToConceptAndTagToBuilder.put(actions, conceptAndTagToBuilder);
    }
    Pair<SNode, String> key = new Pair<SNode, String>(SLinkOperations.getTarget(builder, MetaAdapterFactory.getReferenceLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x108facec6d6L, "applicableConcept")), SPropertyOperations.getString_def(builder, MetaAdapterFactory.getProperty(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1099eb798f9L, "transformTag"), "default_RTransform"));
    List<SNode> value = conceptAndTagToBuilder.get(key);
    if (value == null) {
      value = new ArrayList<SNode>();
      conceptAndTagToBuilder.put(key, value);
    }
    value.add(builder);
  }
  private void addToBuilderToMenuMap(SNode actions, SNode builder) {
    Pair<SNode, String> key = new Pair<SNode, String>(SLinkOperations.getTarget(builder, MetaAdapterFactory.getReferenceLink(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x108facec6d6L, "applicableConcept")), SPropertyOperations.getString_def(builder, MetaAdapterFactory.getProperty(0xaee9cad2acd44608L, 0xaef20004f6a1cdbdL, 0x108facec6d2L, 0x1099eb798f9L, "transformTag"), "default_RTransform"));
    Set<SNode> value = myConceptAndTagToActions.get(key);
    if (value == null) {
      value = new HashSet<SNode>();
      myConceptAndTagToActions.put(key, value);
    }
    value.add(actions);
  }
  private static SNode _quotation_createNode_syzi2_a0a0b0s(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0x5d3b34577b3cff0cL, "TransformationMenuReference_Default"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x169efbc9a90a41c1L, 0x169efbc9a91440deL, "concept"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_syzi2_a0a0b0b0a1a81(Object parameter_1) {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_2 = null;
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0x5d3b34577b3cff09L, "TransformationMenuReference_Named"), null, null, false);
    SNodeAccessUtil.setReferenceTarget(quotedNode_2, MetaAdapterFactory.getReferenceLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x5d3b34577b3cff09L, 0x5d3b34577b3cff0aL, "menu"), (SNode) parameter_1);
    return quotedNode_2;
  }
  private static SNode _quotation_createNode_syzi2_a0a1a1a13() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    SNode quotedNode_2 = null;
    SNode quotedNode_3 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0x28336854e4c19a06L, "TransformationLocation_SideTransform"), null, null, false);
    quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0x30335f3d1845bdccL, "TransformationLocation_SideTransform_PlaceInCellHolder"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_2, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x30335f3d1845bdccL, 0x30335f3d1845bdcdL, "placeInCell"), "LEFT");
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x28336854e4c19a06L, 0x30335f3d1845bdcfL, "placeInCell"), quotedNode_2);
    quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, "jetbrains.mps.lang.editor"), 0x30335f3d1845bdccL, "TransformationLocation_SideTransform_PlaceInCellHolder"), null, null, false);
    SNodeAccessUtil.setProperty(quotedNode_3, MetaAdapterFactory.getProperty(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x30335f3d1845bdccL, 0x30335f3d1845bdcdL, "placeInCell"), "RIGHT");
    quotedNode_1.addChild(MetaAdapterFactory.getContainmentLink(0x18bc659203a64e29L, 0xa83a7ff23bde13baL, 0x28336854e4c19a06L, 0x30335f3d1845bdcfL, "placeInCell"), quotedNode_3);
    return quotedNode_1;
  }
}
