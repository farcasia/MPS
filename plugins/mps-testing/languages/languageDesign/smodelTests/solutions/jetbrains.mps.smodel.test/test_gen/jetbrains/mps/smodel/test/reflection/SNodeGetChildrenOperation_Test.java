package jetbrains.mps.smodel.test.reflection;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.model.SNode;
import junit.framework.Assert;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.List;

@MPSLaunch
public class SNodeGetChildrenOperation_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(SNodeGetChildrenOperation_Test.class, "${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)", false);


  public SNodeGetChildrenOperation_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_childContainingLinks() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childContainingLinks", true);
  }
  @Test
  public void test_childContaininLinksForSpecializedChildren() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childContaininLinksForSpecializedChildren", true);
  }
  @Test
  public void test_childContainingRoles() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childContainingRoles", true);
  }
  @Test
  public void test_unspecifiedChildren() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_unspecifiedChildren", true);
  }
  @Test
  public void test_childOperationsOnNull() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childOperationsOnNull", true);
  }
  @Test
  public void test_childrenByLinkDeclaration() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childrenByLinkDeclaration", true);
  }
  @Test
  public void test_childrenByLinkDeclarationSpecialized() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childrenByLinkDeclarationSpecialized", true);
  }
  @Test
  public void test_childrenByLinkDeclarationOnNull() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetChildrenOperation_Test$TestBody", "test_childrenByLinkDeclarationOnNull", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_childContainingLinks() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      TestUtilities.assertEquals(Sequence.fromArray(new SContainmentLink[]{MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc7L, "child_1_n"), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x7a02788de4ab50L, "childSubConcept_0_n")}), ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("8758390115029078426"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))))).select(new ISelector<SNode, SContainmentLink>() {
        public SContainmentLink select(SNode it) {
          return it.getContainmentLink();
        }
      }));
    }
    public void test_childContaininLinksForSpecializedChildren() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      Assert.assertEquals(MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fbfL, 0x3dd540b968e9fc0L, "grandChild_0_1"), SNodeOperations.cast(getNodeById("2600026384779198859"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc4L, "GrandChild"))).getContainmentLink());
    }
    public void test_childContainingRoles() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      TestUtilities.assertEquals(Sequence.fromArray(new SContainmentLink[]{MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc7L, "child_1_n"), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x7a02788de4ab50L, "childSubConcept_0_n")}), ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("8758390115029078426"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))))).select(new ISelector<SNode, SContainmentLink>() {
        public SContainmentLink select(SNode it) {
          return it.getContainmentLink();
        }
      }));
    }
    public void test_unspecifiedChildren() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      int initialSize = ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("2166349271756548531"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))))).count();
      SNode unspecifiedChild = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc4L, "jetbrains.mps.lang.smodelTests.structure.GrandChild"));
      SContainmentLink unspecifiedChildRole = this.addUnspecifiedChild(SNodeOperations.cast(getNodeById("2166349271756548531"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))), unspecifiedChild);
      Assert.assertEquals(initialSize + 1, ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("2166349271756548531"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))))).count());
      Iterable<SNode> unspecifiedChildren = ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("2166349271756548531"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))))).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return !(SNodeOperations.getContainingLink(it).isValid());
        }
      });
      Assert.assertEquals(1, Sequence.fromIterable(unspecifiedChildren).count());
      SNode theChild = Sequence.fromIterable(unspecifiedChildren).first();
      Assert.assertEquals(unspecifiedChildRole, theChild.getContainmentLink());
      Assert.assertEquals(unspecifiedChild, theChild);
    }
    public void test_childOperationsOnNull() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      SNode nullNode = null;
      Assert.assertNull(SNodeOperations.getContainingLink(nullNode));
      Assert.assertNull(check_vfao6t_a5a4o(SNodeOperations.getContainingLink(nullNode)));
    }
    public void test_childrenByLinkDeclaration() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      List<SNode> singleChild = SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("8758390115029078426"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc7L, "child_1_n"));
      Assert.assertEquals(1, ListSequence.fromList(singleChild).count());
      Assert.assertEquals(SNodeOperations.cast(getNodeById("8758390115029078427"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fbfL, "Child"))), ListSequence.fromList(singleChild).first());
      List<SNode> twins = SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("5815925154349132137"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc7L, "child_1_n"));
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SNodeOperations.cast(getNodeById("5815925154349132142"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fbfL, "Child"))), SNodeOperations.cast(getNodeById("5815925154349132138"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fbfL, "Child")))}), twins);
    }
    public void test_childrenByLinkDeclarationSpecialized() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SNodeOperations.cast(getNodeById("2600026384779198859"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc4L, "GrandChild")))}), SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("8758390115029078430"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x7a02788de4ab4dL, "ChildSubConcept"))), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fbfL, 0x3dd540b968e9fc0L, "grandChild_0_1")));
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SNodeOperations.cast(getNodeById("2600026384779198859"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc4L, "GrandChild")))}), SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("8758390115029078430"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x7a02788de4ab4dL, "ChildSubConcept"))), MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fbfL, 0x3dd540b968e9fc0L, "grandChild_0_1")));
    }
    public void test_childrenByLinkDeclarationOnNull() throws Exception {
      addNodeById("8758390115029078425");
      addNodeById("5815925154349132136");
      addNodeById("2166349271756548530");
      SNode nullNode = null;
      Assert.assertTrue(ListSequence.fromList(SNodeOperations.getChildren(nullNode, MetaAdapterFactory.getContainmentLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x3dd540b968e9fc5L, 0x3dd540b968e9fc6L, "child_0_n"))).isEmpty());
      SContainmentLink nullLinkDeclaration = null;
      Assert.assertTrue(ListSequence.fromList(SNodeOperations.getChildren(SNodeOperations.cast(getNodeById("8758390115029078426"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))), nullLinkDeclaration)).isEmpty());
    }


    public SContainmentLink addUnspecifiedChild(SNode input, SNode unspecifiedChild) {
      SContainmentLink link = MetaAdapterFactory.getContainmentLink(1, 1, 1, 1, "unspecifiedChild");
      input.addChild(link, unspecifiedChild);
      return link;
    }
    private static String check_vfao6t_a5a4o(SContainmentLink checkedDotOperand) {
      if (null != checkedDotOperand) {
        return checkedDotOperand.getName();
      }
      return null;
    }
  }
}
