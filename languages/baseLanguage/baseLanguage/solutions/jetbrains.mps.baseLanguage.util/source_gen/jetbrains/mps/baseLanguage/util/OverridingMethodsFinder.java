package jetbrains.mps.baseLanguage.util;

/*Generated by MPS */

import java.util.Map;
import org.jetbrains.mps.openapi.model.SNode;
import java.util.Set;
import jetbrains.mps.baseLanguage.tuples.runtime.Tuples;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.smodel.behaviour.BHReflection;
import jetbrains.mps.core.aspects.behaviour.SMethodTrimmedId;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.tuples.runtime.MultiTuple;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.baseLanguage.search.VisibilityUtil;
import java.util.LinkedHashSet;

public class OverridingMethodsFinder {
  private Map<SNode, Set<Tuples._2<SNode, SNode>>> myOverridingToOverridenMethodsMap = MapSequence.fromMap(new HashMap<SNode, Set<Tuples._2<SNode, SNode>>>());

  public OverridingMethodsFinder(SNode container) {
    this(container, getInstanceMethods(container));
  }

  public OverridingMethodsFinder(SNode container, SNode enumConstant) {
    Iterable<SNode> result = SLinkOperations.getChildren(enumConstant, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc367388b3L, 0x6d60019ab157734L, "method"));

    Map<String, Set<SNode>> nameToMethodsMap = MapSequence.fromMap(new HashMap<String, Set<SNode>>());
    for (SNode methodToCheck : Sequence.fromIterable(result).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return canOverride(it);
      }
    })) {
      SetSequence.fromSet(safeGet(nameToMethodsMap, SPropertyOperations.getString(methodToCheck, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))).addElement(methodToCheck);
    }
    if (MapSequence.fromMap(nameToMethodsMap).isNotEmpty()) {
      SNode dummy = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass"));
      SLinkOperations.setTarget(dummy, MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, 0x1107e0fd2a0L, "classifier"), container);
      collectOverridingMethodsInClassifierHierarchy(dummy, nameToMethodsMap, SetSequence.fromSet(new HashSet<SNode>()));
    }
  }

  public OverridingMethodsFinder(SNode container, Iterable<SNode> methods) {
    Map<String, Set<SNode>> nameToMethodsMap = MapSequence.fromMap(new HashMap<String, Set<SNode>>());
    for (SNode methodToCheck : Sequence.fromIterable(methods).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return canOverride(it);
      }
    })) {
      SetSequence.fromSet(safeGet(nameToMethodsMap, SPropertyOperations.getString(methodToCheck, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")))).addElement(methodToCheck);
    }
    if (MapSequence.fromMap(nameToMethodsMap).isNotEmpty()) {
      collectOverridingMethodsInClassifierHierarchy(container, nameToMethodsMap, SetSequence.fromSet(new HashSet<SNode>()));
    }
  }

  public Set<SNode> getOverridingMethods() {
    return MapSequence.fromMap(this.myOverridingToOverridenMethodsMap).keySet();
  }
  public Set<Tuples._2<SNode, SNode>> getOverridenMethods(SNode overridingMethod) {
    return MapSequence.fromMap(this.myOverridingToOverridenMethodsMap).get(overridingMethod);
  }
  private void collectOverridingMethodsInClassifierHierarchy(final SNode classifier, final Map<String, Set<SNode>> nameToMethodsMap, final Set<SNode> visitedClassifiers) {
    if (SNodeOperations.isInstanceOf(classifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"))) {
      SNode clazz = SNodeOperations.cast(classifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, "jetbrains.mps.baseLanguage.structure.ClassConcept"));
      SNode superClass;
      if (SNodeOperations.isInstanceOf(clazz, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass"))) {
        superClass = SLinkOperations.getTarget(SNodeOperations.cast(clazz, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, 0x1107e0fd2a0L, "classifier"));
      } else {
        superClass = ((SLinkOperations.getTarget(SLinkOperations.getTarget(clazz, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")) != null) ? SLinkOperations.getTarget(SLinkOperations.getTarget(clazz, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0x10f6353296dL, "superclass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier")) : SNodeOperations.getNode("6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)", "~Object"));
      }
      if (addIfNotContains(visitedClassifiers, superClass)) {
        collectOverridingMethods(classifier, superClass, nameToMethodsMap, visitedClassifiers);
      }
      Sequence.fromIterable(SLinkOperations.collect(SLinkOperations.getChildren(clazz, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca66L, 0xff2ac0b419L, "implementedInterface")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return it != null && addIfNotContains(visitedClassifiers, it);
        }
      }).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          collectOverridingMethods(classifier, it, nameToMethodsMap, visitedClassifiers);
        }
      });
      SNode anonymousClassSuperClassifier = SLinkOperations.getTarget(SNodeOperations.as(classifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, 0x1107e0fd2a0L, "classifier"));
      if (anonymousClassSuperClassifier != null) {
        if (addIfNotContains(visitedClassifiers, anonymousClassSuperClassifier)) {
          collectOverridingMethods(classifier, anonymousClassSuperClassifier, nameToMethodsMap, visitedClassifiers);
        }
      }
    } else if (SNodeOperations.isInstanceOf(classifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, "jetbrains.mps.baseLanguage.structure.Interface"))) {
      Sequence.fromIterable(SLinkOperations.collect(SLinkOperations.getChildren(SNodeOperations.cast(classifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, "jetbrains.mps.baseLanguage.structure.Interface")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101edd46144L, 0x101eddadad7L, "extendedInterface")), MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101de48bf9eL, 0x101de490babL, "classifier"))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return it != null && addIfNotContains(visitedClassifiers, it);
        }
      }).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          collectOverridingMethods(classifier, it, nameToMethodsMap, visitedClassifiers);
        }
      });
    }
  }
  private void collectOverridingMethods(final SNode classifier, final SNode superClassifier, Map<String, Set<SNode>> nameToMethodsMap, Set<SNode> visitedClassifiers) {
    Map<String, Set<SNode>> methodNameToMethodMapCopy = MapSequence.fromMap(new HashMap<String, Set<SNode>>());
    for (String methodName : MapSequence.fromMap(nameToMethodsMap).keySet()) {
      SetSequence.fromSet(safeGet(methodNameToMethodMapCopy, methodName)).addSequence(SetSequence.fromSet(MapSequence.fromMap(nameToMethodsMap).get(methodName)));
    }
    for (final SNode classifierMethod : Sequence.fromIterable(((Iterable<SNode>) BHReflection.invoke0(superClassifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), SMethodTrimmedId.create("methods", MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), "4_LVZ3pBKCn")))).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return canBeOverriden(it) && ((SLinkOperations.getTarget(it, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")) != null) || (SNodeOperations.isInstanceOf(classifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x1107e0cb103L, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) && SNodeOperations.getModel(classifier) == null) || isVisiblePackagePrivateMethod(superClassifier, classifier));
      }
    })) {
      Set<SNode> similarMethods = MapSequence.fromMap(methodNameToMethodMapCopy).get(SPropertyOperations.getString(classifierMethod, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      if (similarMethods == null) {
        continue;
      }
      List<SNode> overridingMethods = new ArrayList<SNode>();
      for (SNode overridingMethod : SetSequence.fromSet(similarMethods).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return ((boolean) (Boolean) BHReflection.invoke0(classifierMethod, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), SMethodTrimmedId.create("hasSameSignature", MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b1fcL, "jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"), "hEwIB0z"), it));
        }
      })) {
        SetSequence.fromSet(safeGet(this.myOverridingToOverridenMethodsMap, overridingMethod)).addElement(MultiTuple.<SNode,SNode>from(classifierMethod, superClassifier));
        ListSequence.fromList(overridingMethods).addElement(overridingMethod);
      }
      SetSequence.fromSet(similarMethods).removeSequence(ListSequence.fromList(overridingMethods));
      if (SetSequence.fromSet(similarMethods).isEmpty()) {
        MapSequence.fromMap(methodNameToMethodMapCopy).removeKey(SPropertyOperations.getString(classifierMethod, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
      }
    }
    if (!(MapSequence.fromMap(methodNameToMethodMapCopy).isEmpty())) {
      collectOverridingMethodsInClassifierHierarchy(superClassifier, methodNameToMethodMapCopy, visitedClassifiers);
    }
  }

  private boolean isVisiblePackagePrivateMethod(SNode superClassifier, SNode classifier) {
    return VisibilityUtil.packageName(classifier).equals(VisibilityUtil.packageName(superClassifier));
  }

  public static Iterable<SNode> getInstanceMethods(SNode containingClassifier) {
    Iterable<SNode> result = ((Iterable<SNode>) BHReflection.invoke0(containingClassifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), SMethodTrimmedId.create("methods", MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x101d9d3ca30L, "jetbrains.mps.baseLanguage.structure.Classifier"), "4_LVZ3pBKCn")));
    if (SNodeOperations.isInstanceOf(containingClassifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc367070a5L, "jetbrains.mps.baseLanguage.structure.EnumClass"))) {
      for (SNode enumConstant : ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(containingClassifier, MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc367070a5L, "jetbrains.mps.baseLanguage.structure.EnumClass")), MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc367070a5L, 0xfc367503acL, "enumConstant")))) {
        result = Sequence.fromIterable(result).concat(ListSequence.fromList(SLinkOperations.getChildren(enumConstant, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc367388b3L, 0x6d60019ab157734L, "method"))));
      }
    }
    return result;
  }
  public static boolean canOverride(SNode method) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9586f0cL, "jetbrains.mps.baseLanguage.structure.PrivateVisibility"))) && isNotEmptyString(SPropertyOperations.getString(method, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static boolean canBeOverriden(SNode method) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(method, MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x112670d273fL, 0x112670d886aL, "visibility")), MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10af9586f0cL, "jetbrains.mps.baseLanguage.structure.PrivateVisibility"))) && isNotEmptyString(SPropertyOperations.getString(method, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")));
  }
  public static <K, V> Set<V> safeGet(Map<K, Set<V>> map, K key) {
    if (!(MapSequence.fromMap(map).containsKey(key))) {
      MapSequence.fromMap(map).put(key, SetSequence.fromSet(new LinkedHashSet<V>()));
    }
    return MapSequence.fromMap(map).get(key);
  }
  private static boolean addIfNotContains(Set<SNode> classifierSet, SNode classifier) {
    if (!(SetSequence.fromSet(classifierSet).contains(classifier))) {
      SetSequence.fromSet(classifierSet).addElement(classifier);
      return true;
    }
    return false;
  }
  private static boolean isNotEmptyString(String str) {
    return str != null && str.length() > 0;
  }
}
