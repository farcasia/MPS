package jetbrains.mps.smodel.test.reflection;

/*Generated by MPS */

import jetbrains.mps.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.ClassRule;
import jetbrains.mps.lang.test.runtime.TestParametersCache;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import junit.framework.Assert;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.jetbrains.mps.openapi.model.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.smodel.references.UnregisteredNodes;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;

@MPSLaunch
public class SNodeGetReferencesOperation_Test extends BaseTransformationTest {
  @ClassRule
  public static final TestParametersCache ourParamCache = new TestParametersCache(SNodeGetReferencesOperation_Test.class, "${mps_home}", "r:8ac706c2-cfd2-4da3-8b63-a741ed2733d4(jetbrains.mps.smodel.test.reflection@tests)", false);


  public SNodeGetReferencesOperation_Test() {
    super(ourParamCache);
  }

  @Test
  public void test_size() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_size", true);
  }
  @Test
  public void test_target() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_target", true);
  }
  @Test
  public void test_linkDeclaration() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_linkDeclaration", true);
  }
  @Test
  public void test_roles() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_roles", true);
  }
  @Test
  public void test_resolveInfo() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_resolveInfo", true);
  }
  @Test
  public void test_unspecifiedReferences() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_unspecifiedReferences", true);
  }
  @Test
  public void test_unresolvedReference() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_unresolvedReference", true);
  }
  @Test
  public void test_forNull() throws Throwable {
    runTest("jetbrains.mps.smodel.test.reflection.SNodeGetReferencesOperation_Test$TestBody", "test_forNull", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public void test_size() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      Assert.assertTrue(ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022219808"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).isEmpty());
      Assert.assertEquals(3, ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).count());
    }
    public void test_target() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      TestUtilities.assertEquals(Sequence.fromArray(new SNode[]{SNodeOperations.cast(getNodeById("2906110183022219847"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc5L, "Root"))), SNodeOperations.cast(getNodeById("2906110183022219848"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fbfL, "Child"))), SNodeOperations.cast(getNodeById("2906110183022311236"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x7a02788de4ab4dL, "ChildSubConcept")))}), ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).select(new ISelector<SReference, SNode>() {
        public SNode select(SReference it) {
          return SLinkOperations.getTargetNode(it);
        }
      }));
    }
    public void test_linkDeclaration() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      TestUtilities.assertEquals(Sequence.fromArray(new SReferenceLink[]{MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac7L, "root"), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac8L, "leftChild"), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac9L, "rightChild")}), ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).select(new ISelector<SReference, SReferenceLink>() {
        public SReferenceLink select(SReference it) {
          return SLinkOperations.getRefLink(it);
        }
      }));
    }
    public void test_roles() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      TestUtilities.assertEquals(Sequence.fromArray(new SReferenceLink[]{MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac7L, "root"), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac8L, "leftChild"), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac9L, "rightChild")}), ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).select(new ISelector<SReference, SReferenceLink>() {
        public SReferenceLink select(SReference it) {
          return SLinkOperations.getRefLink(it);
        }
      }));
    }
    public void test_resolveInfo() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      // Resolving references by accessing .target node: 
      ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).visitAll(new IVisitor<SReference>() {
        public void visit(SReference it) {
          SLinkOperations.getTargetNode(it);
        }
      });
      ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).select(new ISelector<SReference, String>() {
        public String select(SReference it) {
          return SLinkOperations.getResolveInfo(it);
        }
      }).visitAll(new IVisitor<String>() {
        public void visit(String it) {
          Assert.assertNotNull(it);
        }
      });
    }
    public void test_unspecifiedReferences() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      // Adding one unspecified reference and checking if it was added properly 
      int initialSize = ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).count();
      String unspecifiedReferenceName = this.addUnspecifiedReference(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))), SNodeOperations.cast(getNodeById("2906110183022219849"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc4L, "GrandChild"))));
      Assert.assertEquals(initialSize + 1, ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).count());
      // Checking if unspecified reference is working properly 
      Iterable<SReference> unspecifiedReferences = ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).where(new IWhereFilter<SReference>() {
        public boolean accept(SReference it) {
          return (SLinkOperations.findLinkDeclaration(it) == null);
        }
      });
      Assert.assertEquals(1, Sequence.fromIterable(unspecifiedReferences).count());
      SReference theReference = Sequence.fromIterable(unspecifiedReferences).first();
      Assert.assertEquals(unspecifiedReferenceName, check_s3ecl5_a31a5o(SLinkOperations.getRefLink(theReference)));
      Assert.assertEquals(SNodeOperations.cast(getNodeById("2906110183022219849"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x3dd540b968e9fc4L, "GrandChild"))), SLinkOperations.getTargetNode(theReference));
    }
    public void test_unresolvedReference() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      SLinkOperations.getTarget(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac7L, "root"));
      SLinkOperations.getTarget(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac8L, "leftChild"));
      SLinkOperations.getTarget(SNodeOperations.cast(getNodeById("2906110183022219844"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac9L, "rightChild"));

      SLinkOperations.getTarget(SNodeOperations.cast(getNodeById("2906110183022354866"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x279bb63b8ca8b7feL, "ReferenceContainerSubConcept"))), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac7L, "root"));
      SLinkOperations.getTarget(SNodeOperations.cast(getNodeById("2906110183022354866"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x279bb63b8ca8b7feL, "ReferenceContainerSubConcept"))), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac8L, "leftChild"));
      SLinkOperations.getTarget(SNodeOperations.cast(getNodeById("2906110183022354866"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x279bb63b8ca8b7feL, "ReferenceContainerSubConcept"))), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac9L, "rightChild"));

      int initialSize = ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).count();
      Assert.assertTrue(ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).where(new IWhereFilter<SReference>() {
        public boolean accept(SReference it) {
          return (SLinkOperations.getTargetNode(it) == null);
        }
      }).isEmpty());
      SLinkOperations.getTarget(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))), MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac7L, "root")).delete();
      UnregisteredNodes.instance().clear();
      Assert.assertEquals(initialSize, ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).count());
      Iterable<SReference> brokenReferences = ListSequence.fromList(SNodeOperations.getReferences(SNodeOperations.cast(getNodeById("2906110183022432277"), SNodeOperations.asSConcept(MetaAdapterFactory.getConcept(MetaAdapterFactory.getLanguage(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, "jetbrains.mps.lang.smodelTests"), 0x798c0d67da965ac6L, "ReferenceContainer"))))).where(new IWhereFilter<SReference>() {
        public boolean accept(SReference it) {
          return jetbrains.mps.util.SNodeOperations.getTargetNodeSilently(it) == null;
        }
      });
      Assert.assertEquals(1, Sequence.fromIterable(brokenReferences).count());
      SReference theReference = Sequence.fromIterable(brokenReferences).first();
      Assert.assertEquals(MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac7L, "root"), SLinkOperations.getRefLink(theReference));
      Assert.assertEquals(SLinkOperations.findLinkDeclaration(MetaAdapterFactory.getReferenceLink(0xb02ae39f4c164545L, 0x8dfa88df16804e7eL, 0x798c0d67da965ac6L, 0x798c0d67da965ac7L, "root")), SLinkOperations.findLinkDeclaration(theReference));
      Assert.assertNotNull(SLinkOperations.getResolveInfo(theReference));
    }
    public void test_forNull() throws Exception {
      addNodeById("2906110183022219846");
      addNodeById("2906110183022219807");
      addNodeById("2906110183022219843");
      addNodeById("2906110183022354865");
      addNodeById("2906110183022432276");
      SNode nullNode = null;
      Assert.assertTrue(ListSequence.fromList(SNodeOperations.getReferences(nullNode)).isEmpty());
      SReference nullReference = null;
      Assert.assertNull(SLinkOperations.findLinkDeclaration(nullReference));
      Assert.assertNull(SLinkOperations.getRefLink(nullReference));
      Assert.assertNull(SLinkOperations.getTargetNode(nullReference));
      Assert.assertNull(SLinkOperations.getResolveInfo(nullReference));
    }


    public String addUnspecifiedReference(SNode input, SNode referenceTarget) {
      String referenceName = "unspecifiedReference";
      SNodeAccessUtil.setReferenceTarget(input, referenceName, referenceTarget);
      return referenceName;
    }
    private static String check_s3ecl5_a31a5o(SReferenceLink checkedDotOperand) {
      if (null != checkedDotOperand) {
        return checkedDotOperand.getName();
      }
      return null;
    }
  }
}
