<?xml version="1.0" encoding="UTF-8"?>
<model ref="c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:686da497-9d31-49eb-a30e-63814e3d3c62(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.constraints)">
  <persistence version="9" />
  <languages>
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="oubp" ref="c7d5b9dd-a05f-4be2-bc73-f2e16994cc67/r:7cc2086d-c7d0-49c7-811c-ebbaf40d9195(jetbrains.mps.lang.classLike/jetbrains.mps.baseLanguage.lightweightdsl.structure)" />
    <import index="o8zo" ref="r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" />
    <import index="tpcg" ref="r:00000000-0000-4000-0000-011c8959028c(jetbrains.mps.lang.structure.constraints)" />
    <import index="n1o" ref="r:74b3d011-b0fb-4dc0-ae17-fdfbde0e6086(jetbrains.mps.baseLanguage.lightweightdsl.util)" />
    <import index="tpce" ref="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" implicit="true" />
    <import index="tpcn" ref="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.lang.structure.behavior)" implicit="true" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="tpcu" ref="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081506773034" name="jetbrains.mps.baseLanguage.structure.LessThanExpression" flags="nn" index="3eOVzh" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="6702802731807351367" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild" flags="in" index="9S07l" />
      <concept id="1202989658459" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode" flags="nn" index="nLn13" />
      <concept id="8966504967485224688" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_contextNode" flags="nn" index="2rP1CM" />
      <concept id="4303308395523096213" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_childConcept" flags="ng" index="2DD5aU" />
      <concept id="1147467115080" name="jetbrains.mps.lang.constraints.structure.NodePropertyConstraint" flags="ng" index="EnEH3">
        <reference id="1147467295099" name="applicableProperty" index="EomxK" />
        <child id="1147468630220" name="propertyGetter" index="EtsB7" />
        <child id="1152963095733" name="propertySetter" index="1LXaQT" />
      </concept>
      <concept id="1147467790433" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertyGetter" flags="in" index="Eqf_E" />
      <concept id="1147468365020" name="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_node" flags="nn" index="EsrRn" />
      <concept id="5564765827938091039" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Scope" flags="ig" index="3dgokm" />
      <concept id="1159285995602" name="jetbrains.mps.lang.constraints.structure.NodeDefaultSearchScope" flags="ng" index="3EP7_v">
        <child id="1159286114227" name="searchScopeFactory" index="3EP$qY" />
      </concept>
      <concept id="1152959968041" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertySetter" flags="in" index="1LLf8_" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="6702802731807737306" name="canBeChild" index="9Vyp8" />
        <child id="1213098023997" name="property" index="1MhHOB" />
        <child id="1213100494875" name="referent" index="1Mr941" />
        <child id="1213101058038" name="defaultScope" index="1MtirG" />
      </concept>
      <concept id="1148687176410" name="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" flags="ng" index="1N5Pfh">
        <reference id="1148687202698" name="applicableLink" index="1N5Vy1" />
        <child id="1148687345559" name="searchScopeFactory" index="1N6uqs" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1204834851141" name="jetbrains.mps.lang.smodel.structure.PoundExpression" flags="ng" index="25Kdxt">
        <child id="1204834868751" name="expression" index="25KhWn" />
      </concept>
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="4693937538533521280" name="jetbrains.mps.lang.smodel.structure.OfConceptOperation" flags="ng" index="v3k3i">
        <child id="4693937538533538124" name="requestedConcept" index="v3oSu" />
      </concept>
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1143234257716" name="jetbrains.mps.lang.smodel.structure.Node_GetModelOperation" flags="nn" index="I4A8Y" />
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="334628810661441841" name="jetbrains.mps.lang.smodel.structure.AsSConcept" flags="nn" index="1rGIog" />
      <concept id="1172008320231" name="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" flags="nn" index="3x8VRR" />
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1219352745532" name="jetbrains.mps.lang.smodel.structure.NodeRefExpression" flags="nn" index="3B5_sB">
        <reference id="1219352800908" name="referentNode" index="3B5MYn" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI">
        <property id="1238684351431" name="asCast" index="1BlNFB" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
    </language>
  </registry>
  <node concept="1M2fIO" id="3geGFOI1yLF">
    <property role="3GE5qa" value="instances" />
    <ref role="1M2myG" to="oubp:3geGFOI0X5k" resolve="MethodInstance" />
    <node concept="9S07l" id="147CB3QsUnj" role="9Vyp8">
      <node concept="3clFbS" id="147CB3QsUnk" role="2VODD2">
        <node concept="3clFbF" id="147CB3QsUnl" role="3cqZAp">
          <node concept="1Wc70l" id="147CB3QsUnm" role="3clFbG">
            <node concept="3y3z36" id="147CB3QsUnn" role="3uHU7w">
              <node concept="10Nm6u" id="147CB3QsUno" role="3uHU7w" />
              <node concept="2YIFZM" id="147CB3QsUnp" role="3uHU7B">
                <ref role="37wK5l" to="n1o:4oVmO$Dp24i" resolve="getDescriptor" />
                <ref role="1Pybhc" to="n1o:4oVmO$Dp23N" resolve="DSLDescriptorUtil" />
                <node concept="1PxgMI" id="147CB3QsUnq" role="37wK5m">
                  <node concept="nLn13" id="147CB3QsUnr" role="1m5AlR" />
                  <node concept="chp4Y" id="147CB3QsUns" role="3oSUPX">
                    <ref role="cht4Q" to="tpee:fz12cDA" resolve="ClassConcept" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="147CB3QsUnt" role="3uHU7B">
              <node concept="nLn13" id="147CB3QsUnu" role="2Oq$k0" />
              <node concept="1mIQ4w" id="147CB3QsUnv" role="2OqNvi">
                <node concept="chp4Y" id="147CB3QsUnw" role="cj9EA">
                  <ref role="cht4Q" to="tpee:fz12cDA" resolve="ClassConcept" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="2WSWNq1TGrt">
    <property role="3GE5qa" value="member.modifier" />
    <ref role="1M2myG" to="oubp:2WSWNq1TGom" resolve="RequiredModifier" />
  </node>
  <node concept="1M2fIO" id="4auf8pY9$1T">
    <property role="3GE5qa" value="" />
    <ref role="1M2myG" to="oubp:3geGFOI0X5w" resolve="DSLDescriptor" />
    <node concept="1N5Pfh" id="2iCqkkxCXUO" role="1Mr941">
      <ref role="1N5Vy1" to="oubp:1_lSsE3TuQi" resolve="preferredConcept" />
      <node concept="3dgokm" id="5Vvmn_QkLYf" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_QkLYg" role="2VODD2">
          <node concept="3clFbF" id="5Vvmn_QkLYh" role="3cqZAp">
            <node concept="2ShNRf" id="5Vvmn_QkLYi" role="3clFbG">
              <node concept="YeOm9" id="5Vvmn_QkLYj" role="2ShVmc">
                <node concept="1Y3b0j" id="5Vvmn_QkLYk" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="1Y3XeK" to="o8zo:3rV3sBXetA0" resolve="FilteringScope" />
                  <ref role="37wK5l" to="o8zo:3rV3sBXetA2" resolve="FilteringScope" />
                  <node concept="3Tm1VV" id="5Vvmn_QkLYl" role="1B3o_S" />
                  <node concept="2YIFZM" id="5Vvmn_QkLYm" role="37wK5m">
                    <ref role="1Pybhc" to="tpcg:6dmIS6MscR9" resolve="Scopes" />
                    <ref role="37wK5l" to="tpcg:50vK5YapkBB" resolve="forConcepts" />
                    <node concept="2rP1CM" id="5Vvmn_QkLYn" role="37wK5m" />
                    <node concept="35c_gC" id="5Vvmn_QkLYo" role="37wK5m">
                      <ref role="35c_gD" to="tpce:h0PkWnZ" resolve="AbstractConceptDeclaration" />
                    </node>
                  </node>
                  <node concept="3clFb_" id="5Vvmn_QkLYp" role="jymVt">
                    <property role="TrG5h" value="isExcluded" />
                    <property role="1EzhhJ" value="false" />
                    <node concept="10P_77" id="5Vvmn_QkLYq" role="3clF45" />
                    <node concept="3Tm1VV" id="5Vvmn_QkLYr" role="1B3o_S" />
                    <node concept="37vLTG" id="5Vvmn_QkLYs" role="3clF46">
                      <property role="TrG5h" value="node" />
                      <node concept="3Tqbb2" id="5Vvmn_QkLYt" role="1tU5fm" />
                    </node>
                    <node concept="3clFbS" id="5Vvmn_QkLYu" role="3clF47">
                      <node concept="3clFbJ" id="5Vvmn_QkLYv" role="3cqZAp">
                        <node concept="3clFbS" id="5Vvmn_QkLYw" role="3clFbx">
                          <node concept="3cpWs6" id="5Vvmn_QkLYx" role="3cqZAp">
                            <node concept="3clFbT" id="5Vvmn_QkLYy" role="3cqZAk">
                              <property role="3clFbU" value="false" />
                            </node>
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="5Vvmn_QkLYz" role="3clFbw">
                          <node concept="2OqwBi" id="5Vvmn_QkLY$" role="3fr31v">
                            <node concept="37vLTw" id="5Vvmn_QkLY_" role="2Oq$k0">
                              <ref role="3cqZAo" node="5Vvmn_QkLYs" resolve="node" />
                            </node>
                            <node concept="1mIQ4w" id="5Vvmn_QkLYA" role="2OqNvi">
                              <node concept="chp4Y" id="5Vvmn_QkLYB" role="cj9EA">
                                <ref role="cht4Q" to="tpce:h0PkWnZ" resolve="AbstractConceptDeclaration" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="3clFbF" id="5Vvmn_QkLYC" role="3cqZAp">
                        <node concept="3fqX7Q" id="5Vvmn_QkLYD" role="3clFbG">
                          <node concept="1eOMI4" id="5Vvmn_QkLYE" role="3fr31v">
                            <node concept="2OqwBi" id="5Vvmn_QkLYF" role="1eOMHV">
                              <node concept="1PxgMI" id="5Vvmn_QkLYG" role="2Oq$k0">
                                <node concept="37vLTw" id="5Vvmn_QkLYH" role="1m5AlR">
                                  <ref role="3cqZAo" node="5Vvmn_QkLYs" resolve="node" />
                                </node>
                                <node concept="chp4Y" id="5Vvmn_QkLYI" role="3oSUPX">
                                  <ref role="cht4Q" to="tpce:h0PkWnZ" resolve="AbstractConceptDeclaration" />
                                </node>
                              </node>
                              <node concept="2qgKlT" id="5Vvmn_QkLYJ" role="2OqNvi">
                                <ref role="37wK5l" to="tpcn:73yVtVlWOga" resolve="isSubconceptOf" />
                                <node concept="3B5_sB" id="5Vvmn_QkLYK" role="37wK5m">
                                  <ref role="3B5MYn" to="tpee:fz12cDA" resolve="ClassConcept" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="2AHcQZ" id="5Vvmn_QkLYL" role="2AJF6D">
                      <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3EP7_v" id="4auf8pY9$1U" role="1MtirG">
      <node concept="3dgokm" id="5Vvmn_QkLY4" role="3EP$qY">
        <node concept="3clFbS" id="5Vvmn_QkLY5" role="2VODD2">
          <node concept="3clFbF" id="5Vvmn_QkLY6" role="3cqZAp">
            <node concept="2ShNRf" id="5Vvmn_QkLY7" role="3clFbG">
              <node concept="1pGfFk" id="5Vvmn_QkLY8" role="2ShVmc">
                <ref role="37wK5l" to="o8zo:4k9eBec$QVW" resolve="ModelPlusImportedScope" />
                <node concept="2OqwBi" id="5Vvmn_QkLYc" role="37wK5m">
                  <node concept="2rP1CM" id="5Vvmn_QkLYd" role="2Oq$k0" />
                  <node concept="I4A8Y" id="5Vvmn_QkLYe" role="2OqNvi" />
                </node>
                <node concept="3clFbT" id="5Vvmn_QkLYa" role="37wK5m">
                  <property role="3clFbU" value="true" />
                </node>
                <node concept="35c_gC" id="5Vvmn_QkLYb" role="37wK5m">
                  <ref role="35c_gD" to="oubp:3geGFOI0X5w" resolve="DSLDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="1QReUKII9ud">
    <property role="3GE5qa" value="member.customDescriptor" />
    <ref role="1M2myG" to="oubp:7aMlq14w5Qs" resolve="CustomMemberDescriptor" />
    <node concept="EnEH3" id="3JYspdAJSoH" role="1MhHOB">
      <ref role="EomxK" to="tpck:h0TrG11" resolve="name" />
      <node concept="1LLf8_" id="3JYspdAJStk" role="1LXaQT">
        <node concept="3clFbS" id="3JYspdAJStl" role="2VODD2" />
      </node>
      <node concept="Eqf_E" id="3JYspdAJSzo" role="EtsB7">
        <node concept="3clFbS" id="3JYspdAJSzp" role="2VODD2">
          <node concept="3clFbF" id="5KZRo2kmo7U" role="3cqZAp">
            <node concept="2OqwBi" id="5KZRo2kmP25" role="3clFbG">
              <node concept="EsrRn" id="5KZRo2kmOX7" role="2Oq$k0" />
              <node concept="2qgKlT" id="5KZRo2kmPoT" role="2OqNvi">
                <ref role="37wK5l" to="tpcu:hEwIMiw" resolve="getPresentation" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1N5Pfh" id="1QReUKII9ue" role="1Mr941">
      <ref role="1N5Vy1" to="oubp:7aMlq14w5Qv" resolve="cncpt" />
      <node concept="3dgokm" id="5Vvmn_QkLYM" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_QkLYN" role="2VODD2">
          <node concept="3clFbF" id="5Vvmn_QkLYO" role="3cqZAp">
            <node concept="2ShNRf" id="5Vvmn_QkLYP" role="3clFbG">
              <node concept="YeOm9" id="5Vvmn_QkLYQ" role="2ShVmc">
                <node concept="1Y3b0j" id="5Vvmn_QkLYR" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="1Y3XeK" to="o8zo:3rV3sBXetA0" resolve="FilteringScope" />
                  <ref role="37wK5l" to="o8zo:3rV3sBXetA2" resolve="FilteringScope" />
                  <node concept="3Tm1VV" id="5Vvmn_QkLYS" role="1B3o_S" />
                  <node concept="2YIFZM" id="5Vvmn_QkLYT" role="37wK5m">
                    <ref role="37wK5l" to="tpcg:50vK5YapkBB" resolve="forConcepts" />
                    <ref role="1Pybhc" to="tpcg:6dmIS6MscR9" resolve="Scopes" />
                    <node concept="2rP1CM" id="5Vvmn_QkLYU" role="37wK5m" />
                    <node concept="35c_gC" id="5Vvmn_QkLYV" role="37wK5m">
                      <ref role="35c_gD" to="tpck:h0TrEE$" resolve="INamedConcept" />
                    </node>
                  </node>
                  <node concept="3clFb_" id="5Vvmn_QkLYW" role="jymVt">
                    <property role="TrG5h" value="isExcluded" />
                    <property role="1EzhhJ" value="false" />
                    <node concept="10P_77" id="5Vvmn_QkLYX" role="3clF45" />
                    <node concept="3Tm1VV" id="5Vvmn_QkLYY" role="1B3o_S" />
                    <node concept="37vLTG" id="5Vvmn_QkLYZ" role="3clF46">
                      <property role="TrG5h" value="node" />
                      <node concept="3Tqbb2" id="5Vvmn_QkLZ0" role="1tU5fm" />
                    </node>
                    <node concept="3clFbS" id="5Vvmn_QkLZ1" role="3clF47">
                      <node concept="3clFbF" id="5Vvmn_QkLZ2" role="3cqZAp">
                        <node concept="3fqX7Q" id="5Vvmn_QkLZ3" role="3clFbG">
                          <node concept="2OqwBi" id="5Vvmn_QkLZ4" role="3fr31v">
                            <node concept="1PxgMI" id="5Vvmn_QkLZ5" role="2Oq$k0">
                              <property role="1BlNFB" value="true" />
                              <node concept="37vLTw" id="5Vvmn_QkLZ6" role="1m5AlR">
                                <ref role="3cqZAo" node="5Vvmn_QkLYZ" resolve="node" />
                              </node>
                              <node concept="chp4Y" id="5Vvmn_QkLZ7" role="3oSUPX">
                                <ref role="cht4Q" to="tpce:h0PkWnZ" resolve="AbstractConceptDeclaration" />
                              </node>
                            </node>
                            <node concept="2qgKlT" id="5Vvmn_QkLZ8" role="2OqNvi">
                              <ref role="37wK5l" to="tpcn:73yVtVlWOga" resolve="isSubconceptOf" />
                              <node concept="3B5_sB" id="5Vvmn_QkLZ9" role="37wK5m">
                                <ref role="3B5MYn" to="tpee:h9ngReX" resolve="ClassifierMember" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="2AHcQZ" id="5Vvmn_QkLZa" role="2AJF6D">
                      <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="3CPpk7pFP3t">
    <property role="3GE5qa" value="member.modifier" />
    <ref role="1M2myG" to="oubp:1QReUKIFP7I" resolve="MultipleModifier" />
    <node concept="9S07l" id="147CB3QsUnx" role="9Vyp8">
      <node concept="3clFbS" id="147CB3QsUny" role="2VODD2">
        <node concept="3clFbF" id="147CB3QsUnz" role="3cqZAp">
          <node concept="2OqwBi" id="147CB3QsUn$" role="3clFbG">
            <node concept="2OqwBi" id="147CB3QsUn_" role="2Oq$k0">
              <node concept="nLn13" id="147CB3QsUnA" role="2Oq$k0" />
              <node concept="2Xjw5R" id="147CB3QsUnB" role="2OqNvi">
                <node concept="1xMEDy" id="147CB3QsUnC" role="1xVPHs">
                  <node concept="chp4Y" id="147CB3QsUnD" role="ri$Ld">
                    <ref role="cht4Q" to="oubp:7aMlq14w5Qs" resolve="CustomMemberDescriptor" />
                  </node>
                </node>
                <node concept="1xIGOp" id="147CB3QsUnE" role="1xVPHs" />
              </node>
            </node>
            <node concept="3x8VRR" id="147CB3QsUnF" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="5u1dFJQHOt0">
    <property role="3GE5qa" value="member.modifier" />
    <ref role="1M2myG" to="oubp:2WSWNq1TGnY" resolve="MemberModifier" />
    <node concept="9S07l" id="147CB3QsUmX" role="9Vyp8">
      <node concept="3clFbS" id="147CB3QsUmY" role="2VODD2">
        <node concept="3clFbF" id="147CB3QsUmZ" role="3cqZAp">
          <node concept="3eOVzh" id="147CB3QsUn0" role="3clFbG">
            <node concept="3cmrfG" id="147CB3QsUn1" role="3uHU7w">
              <property role="3cmrfH" value="2" />
            </node>
            <node concept="2OqwBi" id="147CB3QsUn2" role="3uHU7B">
              <node concept="2OqwBi" id="147CB3QsUn3" role="2Oq$k0">
                <node concept="2OqwBi" id="147CB3QsUn4" role="2Oq$k0">
                  <node concept="2OqwBi" id="147CB3QsUn5" role="2Oq$k0">
                    <node concept="nLn13" id="147CB3QsUn6" role="2Oq$k0" />
                    <node concept="2Xjw5R" id="147CB3QsUn7" role="2OqNvi">
                      <node concept="1xMEDy" id="147CB3QsUn8" role="1xVPHs">
                        <node concept="chp4Y" id="147CB3QsUn9" role="ri$Ld">
                          <ref role="cht4Q" to="oubp:7aMlq14vYj7" resolve="DSLClassMember" />
                        </node>
                      </node>
                      <node concept="1xIGOp" id="147CB3QsUna" role="1xVPHs" />
                    </node>
                  </node>
                  <node concept="3Tsc0h" id="147CB3QsUnb" role="2OqNvi">
                    <ref role="3TtcxE" to="oubp:2WSWNq1TGlC" resolve="modifier" />
                  </node>
                </node>
                <node concept="v3k3i" id="147CB3QsUnc" role="2OqNvi">
                  <node concept="25Kdxt" id="147CB3QsUnd" role="v3oSu">
                    <node concept="2OqwBi" id="147CB3QsUne" role="25KhWn">
                      <node concept="2DD5aU" id="147CB3QsUni" role="2Oq$k0" />
                      <node concept="1rGIog" id="147CB3QsUng" role="2OqNvi" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="34oBXx" id="147CB3QsUnh" role="2OqNvi" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

