<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f990bf7(checkpoints/jetbrains.mps.make.script.constraints@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <languages />
  <imports>
    <import index="2zc0" ref="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
    <import index="o8zo" ref="r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)" />
    <import index="79pl" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.base(MPS.Core/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="2k9e" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.structure(MPS.Core/)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="e8bb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.ids(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="q9ra" ref="r:308041c6-80bc-4e26-b4b1-473fd45c9339(jetbrains.mps.make.script.structure)" />
    <import index="35tq" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.scope(MPS.Core/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1224848483129" name="jetbrains.mps.baseLanguage.structure.IBLDeprecatable" flags="ng" index="IEa8$">
        <property id="1224848525476" name="isDeprecated" index="IEkAT" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="4269842503726207156" name="jetbrains.mps.baseLanguage.structure.LongLiteral" flags="nn" index="1adDum">
        <property id="4269842503726207157" name="value" index="1adDun" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
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
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
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
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
        <child id="1201186121363" name="typeParameter" index="2Ghqu4" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE" />
    </language>
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1238251434034" name="jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantExpression" flags="ng" index="1dyn4i">
        <property id="1238251449050" name="fieldName" index="1dyqJU" />
        <property id="8835849473318867199" name="makeUnique" index="1zomUR" />
        <child id="1238251454130" name="expression" index="1dyrYi" />
      </concept>
      <concept id="1173996401517" name="jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression" flags="nn" index="1nCR9W">
        <property id="1173996588177" name="fqClassName" index="1nD$Q0" />
        <child id="1179332974947" name="type" index="2lIhxL" />
      </concept>
      <concept id="1174294166120" name="jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall" flags="nn" index="1DoJHT">
        <property id="1174294288199" name="methodName" index="1Dpdpm" />
        <child id="1174313653259" name="returnType" index="1Ez5kq" />
        <child id="1174317636233" name="instance" index="1EMhIo" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1171305280644" name="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" flags="nn" index="2Rf3mk" />
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1154546920561" name="jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList" flags="ng" index="3gmYPX">
        <child id="1154546920563" name="concept" index="3gmYPZ" />
      </concept>
      <concept id="1154546950173" name="jetbrains.mps.lang.smodel.structure.ConceptReference" flags="ng" index="3gn64h">
        <reference id="1154546997487" name="concept" index="3gnhBz" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="6039268229364358244" name="jetbrains.mps.lang.smodel.structure.ExactConceptCase" flags="ng" index="1pnPoh">
        <child id="6039268229364358388" name="body" index="1pnPq1" />
        <child id="6039268229364358387" name="concept" index="1pnPq6" />
      </concept>
      <concept id="1172008320231" name="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" flags="nn" index="3x8VRR" />
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="5944356402132808749" name="jetbrains.mps.lang.smodel.structure.ConceptSwitchStatement" flags="nn" index="1_3QMa">
        <child id="6039268229365417680" name="defaultBlock" index="1prKM_" />
        <child id="5944356402132808753" name="case" index="1_3QMm" />
        <child id="5944356402132808752" name="expression" index="1_3QMn" />
      </concept>
      <concept id="1172326502327" name="jetbrains.mps.lang.smodel.structure.Concept_IsExactlyOperation" flags="nn" index="3O6GUB">
        <child id="1206733650006" name="conceptArgument" index="3QVz_e" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
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
  </registry>
  <node concept="312cEu" id="0">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="AdvanceWorkStatement_Constraints" />
    <node concept="3Tm1VV" id="1" role="1B3o_S" />
    <node concept="3uibUv" id="2" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="3" role="jymVt">
      <node concept="3cqZAl" id="6" role="3clF45" />
      <node concept="3clFbS" id="7" role="3clF47">
        <node concept="XkiVB" id="9" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="a" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="b" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="c" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="d" role="37wK5m">
              <property role="1adDun" value="0x29929a95c9e6984L" />
            </node>
            <node concept="Xl_RD" id="e" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.AdvanceWorkStatement" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="8" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="4" role="jymVt" />
    <node concept="3clFb_" id="5" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedReferences" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="f" role="1B3o_S" />
      <node concept="3uibUv" id="g" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="j" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
        </node>
        <node concept="3uibUv" id="k" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="h" role="3clF47">
        <node concept="3cpWs8" id="l" role="3cqZAp">
          <node concept="3cpWsn" id="o" role="3cpWs9">
            <property role="TrG5h" value="references" />
            <node concept="3uibUv" id="p" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="r" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
              </node>
              <node concept="3uibUv" id="s" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="q" role="33vP2m">
              <node concept="1pGfFk" id="t" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="u" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
                </node>
                <node concept="3uibUv" id="v" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="m" role="3cqZAp">
          <node concept="2OqwBi" id="w" role="3clFbG">
            <node concept="37vLTw" id="x" role="2Oq$k0">
              <ref role="3cqZAo" node="o" resolve="references" />
            </node>
            <node concept="liA8E" id="y" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="z" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getReferenceLink(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getReferenceLink" />
                <node concept="1adDum" id="_" role="37wK5m">
                  <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
                </node>
                <node concept="1adDum" id="A" role="37wK5m">
                  <property role="1adDun" value="0xa65e763c9bae2d3bL" />
                </node>
                <node concept="1adDum" id="B" role="37wK5m">
                  <property role="1adDun" value="0x29929a95c9e6984L" />
                </node>
                <node concept="1adDum" id="C" role="37wK5m">
                  <property role="1adDun" value="0x97a1ce11862bf5aL" />
                </node>
                <node concept="Xl_RD" id="D" role="37wK5m">
                  <property role="Xl_RC" value="workStatement" />
                </node>
              </node>
              <node concept="2ShNRf" id="$" role="37wK5m">
                <node concept="YeOm9" id="E" role="2ShVmc">
                  <node concept="1Y3b0j" id="F" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BaseReferenceConstraintsDescriptor" resolve="BaseReferenceConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BaseReferenceConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SReferenceLinkId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BaseReferenceConstraintsDescriptor" />
                    <node concept="2YIFZM" id="G" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.refId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SReferenceLinkId" resolve="refId" />
                      <node concept="1adDum" id="L" role="37wK5m">
                        <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
                      </node>
                      <node concept="1adDum" id="M" role="37wK5m">
                        <property role="1adDun" value="0xa65e763c9bae2d3bL" />
                      </node>
                      <node concept="1adDum" id="N" role="37wK5m">
                        <property role="1adDun" value="0x29929a95c9e6984L" />
                      </node>
                      <node concept="1adDum" id="O" role="37wK5m">
                        <property role="1adDun" value="0x97a1ce11862bf5aL" />
                      </node>
                    </node>
                    <node concept="3Tm1VV" id="H" role="1B3o_S" />
                    <node concept="Xjq3P" id="I" role="37wK5m" />
                    <node concept="3clFb_" id="J" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="P" role="1B3o_S" />
                      <node concept="10P_77" id="Q" role="3clF45" />
                      <node concept="3clFbS" id="R" role="3clF47">
                        <node concept="3clFbF" id="T" role="3cqZAp">
                          <node concept="3clFbT" id="U" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="S" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="K" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="V" role="1B3o_S" />
                      <node concept="3uibUv" id="W" role="3clF45">
                        <ref role="3uigEE" to="ze1i:~ReferenceScopeProvider" resolve="ReferenceScopeProvider" />
                      </node>
                      <node concept="2AHcQZ" id="X" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      </node>
                      <node concept="3clFbS" id="Y" role="3clF47">
                        <node concept="3cpWs6" id="10" role="3cqZAp">
                          <node concept="2ShNRf" id="11" role="3cqZAk">
                            <node concept="YeOm9" id="12" role="2ShVmc">
                              <node concept="1Y3b0j" id="13" role="YeSDq">
                                <property role="2bfB8j" value="true" />
                                <ref role="1Y3XeK" to="79pl:~BaseScopeProvider" resolve="BaseScopeProvider" />
                                <ref role="37wK5l" to="79pl:~BaseScopeProvider.&lt;init&gt;()" resolve="BaseScopeProvider" />
                                <node concept="3Tm1VV" id="14" role="1B3o_S" />
                                <node concept="3clFb_" id="15" role="jymVt">
                                  <property role="TrG5h" value="hasPresentation" />
                                  <node concept="3Tm1VV" id="19" role="1B3o_S" />
                                  <node concept="10P_77" id="1a" role="3clF45" />
                                  <node concept="3clFbS" id="1b" role="3clF47">
                                    <node concept="3clFbF" id="1d" role="3cqZAp">
                                      <node concept="3clFbT" id="1e" role="3clFbG">
                                        <property role="3clFbU" value="true" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="1c" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="16" role="jymVt">
                                  <property role="TrG5h" value="getPresentation" />
                                  <node concept="3Tm1VV" id="1f" role="1B3o_S" />
                                  <node concept="3uibUv" id="1g" role="3clF45">
                                    <ref role="3uigEE" to="wyt6:~String" resolve="String" />
                                  </node>
                                  <node concept="37vLTG" id="1h" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="1l" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="1i" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="1m" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferencePresentationContext" resolve="ReferencePresentationContext" />
                                    </node>
                                  </node>
                                  <node concept="3clFbS" id="1j" role="3clF47">
                                    <node concept="3clFbF" id="1n" role="3cqZAp">
                                      <node concept="2OqwBi" id="1o" role="3clFbG">
                                        <node concept="1DoJHT" id="1p" role="2Oq$k0">
                                          <property role="1Dpdpm" value="getParameterNode" />
                                          <node concept="3uibUv" id="1r" role="1Ez5kq">
                                            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                          </node>
                                          <node concept="37vLTw" id="1s" role="1EMhIo">
                                            <ref role="3cqZAo" node="1i" resolve="_context" />
                                          </node>
                                        </node>
                                        <node concept="3TrcHB" id="1q" role="2OqNvi">
                                          <ref role="3TsBF5" to="q9ra:_U7e4opu$h" resolve="workName" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="1k" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="17" role="jymVt">
                                  <property role="TrG5h" value="getSearchScopeValidatorNode" />
                                  <node concept="3Tm1VV" id="1t" role="1B3o_S" />
                                  <node concept="3clFbS" id="1u" role="3clF47">
                                    <node concept="3cpWs6" id="1x" role="3cqZAp">
                                      <node concept="1dyn4i" id="1y" role="3cqZAk">
                                        <property role="1zomUR" value="true" />
                                        <property role="1dyqJU" value="breakingNode" />
                                        <node concept="2ShNRf" id="1z" role="1dyrYi">
                                          <node concept="1pGfFk" id="1$" role="2ShVmc">
                                            <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                            <node concept="Xl_RD" id="1_" role="37wK5m">
                                              <property role="Xl_RC" value="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
                                            </node>
                                            <node concept="Xl_RD" id="1A" role="37wK5m">
                                              <property role="Xl_RC" value="6836281137582794566" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3uibUv" id="1v" role="3clF45">
                                    <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                                  </node>
                                  <node concept="2AHcQZ" id="1w" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="18" role="jymVt">
                                  <property role="IEkAT" value="false" />
                                  <property role="1EzhhJ" value="false" />
                                  <property role="TrG5h" value="createScope" />
                                  <property role="DiZV1" value="false" />
                                  <node concept="37vLTG" id="1B" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="1H" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="1C" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="1I" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferenceConstraintsContext" resolve="ReferenceConstraintsContext" />
                                    </node>
                                  </node>
                                  <node concept="3Tm1VV" id="1D" role="1B3o_S" />
                                  <node concept="3uibUv" id="1E" role="3clF45">
                                    <ref role="3uigEE" to="35tq:~Scope" resolve="Scope" />
                                  </node>
                                  <node concept="3clFbS" id="1F" role="3clF47">
                                    <node concept="9aQIb" id="1J" role="3cqZAp">
                                      <node concept="3clFbS" id="1K" role="9aQI4">
                                        <node concept="3clFbF" id="1L" role="3cqZAp">
                                          <node concept="2YIFZM" id="1M" role="3clFbG">
                                            <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
                                            <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
                                            <node concept="2OqwBi" id="1N" role="37wK5m">
                                              <node concept="2OqwBi" id="1O" role="2Oq$k0">
                                                <node concept="2OqwBi" id="1Q" role="2Oq$k0">
                                                  <node concept="1DoJHT" id="1S" role="2Oq$k0">
                                                    <property role="1Dpdpm" value="getContextNode" />
                                                    <node concept="3uibUv" id="1U" role="1Ez5kq">
                                                      <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                    </node>
                                                    <node concept="37vLTw" id="1V" role="1EMhIo">
                                                      <ref role="3cqZAo" node="1C" resolve="_context" />
                                                    </node>
                                                  </node>
                                                  <node concept="2Xjw5R" id="1T" role="2OqNvi">
                                                    <node concept="1xMEDy" id="1W" role="1xVPHs">
                                                      <node concept="chp4Y" id="1X" role="ri$Ld">
                                                        <ref role="cht4Q" to="q9ra:230qvwa_MQF" resolve="JobDefinition" />
                                                      </node>
                                                    </node>
                                                  </node>
                                                </node>
                                                <node concept="3TrEf2" id="1R" role="2OqNvi">
                                                  <ref role="3Tt5mk" to="tpee:gyVODHa" resolve="body" />
                                                </node>
                                              </node>
                                              <node concept="2Rf3mk" id="1P" role="2OqNvi">
                                                <node concept="1xMEDy" id="1Y" role="1xVPHs">
                                                  <node concept="chp4Y" id="1Z" role="ri$Ld">
                                                    <ref role="cht4Q" to="q9ra:apaq_sBAA2" resolve="BeginWorkStatement" />
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="1G" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="Z" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="n" role="3cqZAp">
          <node concept="37vLTw" id="20" role="3clFbG">
            <ref role="3cqZAo" node="o" resolve="references" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="i" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="21">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="ConfigDefinition_Constraints" />
    <node concept="3Tm1VV" id="22" role="1B3o_S" />
    <node concept="3uibUv" id="23" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="24" role="jymVt">
      <node concept="3cqZAl" id="28" role="3clF45" />
      <node concept="3clFbS" id="29" role="3clF47">
        <node concept="XkiVB" id="2b" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="2c" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="2d" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="2e" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="2f" role="37wK5m">
              <property role="1adDun" value="0x1b731b4510dcbee4L" />
            </node>
            <node concept="Xl_RD" id="2g" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.ConfigDefinition" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2a" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="25" role="jymVt" />
    <node concept="3clFb_" id="26" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeAncestorConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tmbuc" id="2h" role="1B3o_S" />
      <node concept="3uibUv" id="2i" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <node concept="3uibUv" id="2l" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeAncestor" resolve="ConstraintContext_CanBeAncestor" />
        </node>
        <node concept="3uibUv" id="2m" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
        </node>
      </node>
      <node concept="3clFbS" id="2j" role="3clF47">
        <node concept="3clFbF" id="2n" role="3cqZAp">
          <node concept="2ShNRf" id="2o" role="3clFbG">
            <node concept="YeOm9" id="2p" role="2ShVmc">
              <node concept="1Y3b0j" id="2q" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <node concept="3Tm1VV" id="2r" role="1B3o_S" />
                <node concept="3clFb_" id="2s" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <node concept="3Tm1VV" id="2v" role="1B3o_S" />
                  <node concept="2AHcQZ" id="2w" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                  </node>
                  <node concept="3uibUv" id="2x" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  </node>
                  <node concept="37vLTG" id="2y" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <node concept="3uibUv" id="2_" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeAncestor" resolve="ConstraintContext_CanBeAncestor" />
                    </node>
                    <node concept="2AHcQZ" id="2A" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="2z" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <node concept="3uibUv" id="2B" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                    </node>
                    <node concept="2AHcQZ" id="2C" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="2$" role="3clF47">
                    <node concept="3cpWs8" id="2D" role="3cqZAp">
                      <node concept="3cpWsn" id="2I" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <node concept="10P_77" id="2J" role="1tU5fm" />
                        <node concept="1rXfSq" id="2K" role="33vP2m">
                          <ref role="37wK5l" node="27" resolve="staticCanBeAnAncestor" />
                          <node concept="2OqwBi" id="2L" role="37wK5m">
                            <node concept="37vLTw" id="2Q" role="2Oq$k0">
                              <ref role="3cqZAo" node="2y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="2R" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getNode():org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="2M" role="37wK5m">
                            <node concept="37vLTw" id="2S" role="2Oq$k0">
                              <ref role="3cqZAo" node="2y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="2T" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getChildNode():org.jetbrains.mps.openapi.model.SNode" resolve="getChildNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="2N" role="37wK5m">
                            <node concept="37vLTw" id="2U" role="2Oq$k0">
                              <ref role="3cqZAo" node="2y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="2V" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getChildConcept():org.jetbrains.mps.openapi.language.SAbstractConcept" resolve="getChildConcept" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="2O" role="37wK5m">
                            <node concept="37vLTw" id="2W" role="2Oq$k0">
                              <ref role="3cqZAo" node="2y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="2X" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getParentNode():org.jetbrains.mps.openapi.model.SNode" resolve="getParentNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="2P" role="37wK5m">
                            <node concept="37vLTw" id="2Y" role="2Oq$k0">
                              <ref role="3cqZAo" node="2y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="2Z" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getLink():org.jetbrains.mps.openapi.language.SContainmentLink" resolve="getLink" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="2E" role="3cqZAp" />
                    <node concept="3clFbJ" id="2F" role="3cqZAp">
                      <node concept="3clFbS" id="30" role="3clFbx">
                        <node concept="3clFbF" id="32" role="3cqZAp">
                          <node concept="2OqwBi" id="33" role="3clFbG">
                            <node concept="37vLTw" id="34" role="2Oq$k0">
                              <ref role="3cqZAo" node="2z" resolve="checkingNodeContext" />
                            </node>
                            <node concept="liA8E" id="35" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference):void" resolve="setBreakingNode" />
                              <node concept="1dyn4i" id="36" role="37wK5m">
                                <property role="1dyqJU" value="canBeRootBreakingPoint" />
                                <node concept="2ShNRf" id="37" role="1dyrYi">
                                  <node concept="1pGfFk" id="38" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <node concept="Xl_RD" id="39" role="37wK5m">
                                      <property role="Xl_RC" value="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
                                    </node>
                                    <node concept="Xl_RD" id="3a" role="37wK5m">
                                      <property role="Xl_RC" value="5579506316679949085" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="31" role="3clFbw">
                        <node concept="3y3z36" id="3b" role="3uHU7w">
                          <node concept="10Nm6u" id="3d" role="3uHU7w" />
                          <node concept="37vLTw" id="3e" role="3uHU7B">
                            <ref role="3cqZAo" node="2z" resolve="checkingNodeContext" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="3c" role="3uHU7B">
                          <node concept="37vLTw" id="3f" role="3fr31v">
                            <ref role="3cqZAo" node="2I" resolve="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="2G" role="3cqZAp" />
                    <node concept="3clFbF" id="2H" role="3cqZAp">
                      <node concept="37vLTw" id="3g" role="3clFbG">
                        <ref role="3cqZAo" node="2I" resolve="result" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="2t" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeAncestor" resolve="ConstraintContext_CanBeAncestor" />
                </node>
                <node concept="3uibUv" id="2u" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2k" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2YIFZL" id="27" role="jymVt">
      <property role="TrG5h" value="staticCanBeAnAncestor" />
      <node concept="37vLTG" id="3h" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="3p" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3i" role="3clF46">
        <property role="TrG5h" value="childNode" />
        <node concept="3uibUv" id="3q" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3j" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <node concept="3uibUv" id="3r" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="37vLTG" id="3k" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <node concept="3uibUv" id="3s" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="3l" role="3clF46">
        <property role="TrG5h" value="link" />
        <node concept="3uibUv" id="3t" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
        </node>
      </node>
      <node concept="10P_77" id="3m" role="3clF45" />
      <node concept="3Tm6S6" id="3n" role="1B3o_S" />
      <node concept="3clFbS" id="3o" role="3clF47">
        <node concept="3cpWs8" id="3u" role="3cqZAp">
          <node concept="3cpWsn" id="3x" role="3cpWs9">
            <property role="TrG5h" value="ancestor" />
            <node concept="3Tqbb2" id="3y" role="1tU5fm">
              <ref role="ehGHo" to="tpee:htgVS9_" resolve="IStatementListContainer" />
            </node>
            <node concept="2OqwBi" id="3z" role="33vP2m">
              <node concept="37vLTw" id="3$" role="2Oq$k0">
                <ref role="3cqZAo" node="3k" resolve="parentNode" />
              </node>
              <node concept="2Xjw5R" id="3_" role="2OqNvi">
                <node concept="1xMEDy" id="3A" role="1xVPHs">
                  <node concept="chp4Y" id="3C" role="ri$Ld">
                    <ref role="cht4Q" to="tpee:htgVS9_" resolve="IStatementListContainer" />
                  </node>
                </node>
                <node concept="1xIGOp" id="3B" role="1xVPHs" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="3v" role="3cqZAp">
          <node concept="3clFbS" id="3D" role="3clFbx">
            <node concept="3cpWs6" id="3F" role="3cqZAp">
              <node concept="3fqX7Q" id="3G" role="3cqZAk">
                <node concept="2OqwBi" id="3H" role="3fr31v">
                  <node concept="37vLTw" id="3I" role="2Oq$k0">
                    <ref role="3cqZAo" node="3j" resolve="childConcept" />
                  </node>
                  <node concept="3O6GUB" id="3J" role="2OqNvi">
                    <node concept="chp4Y" id="3K" role="3QVz_e">
                      <ref role="cht4Q" to="tpee:fzcpWvY" resolve="ReturnStatement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="3E" role="3clFbw">
            <node concept="37vLTw" id="3L" role="3uHU7w">
              <ref role="3cqZAo" node="3h" resolve="node" />
            </node>
            <node concept="37vLTw" id="3M" role="3uHU7B">
              <ref role="3cqZAo" node="3x" resolve="ancestor" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="3w" role="3cqZAp">
          <node concept="3clFbT" id="3N" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="3O">
    <property role="TrG5h" value="ConstraintsAspectDescriptor" />
    <property role="3GE5qa" value="Constraints" />
    <node concept="3uibUv" id="3P" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseConstraintsAspectDescriptor" resolve="BaseConstraintsAspectDescriptor" />
    </node>
    <node concept="3Tm1VV" id="3Q" role="1B3o_S" />
    <node concept="3clFbW" id="3R" role="jymVt">
      <node concept="3cqZAl" id="3U" role="3clF45" />
      <node concept="3Tm1VV" id="3V" role="1B3o_S" />
      <node concept="3clFbS" id="3W" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="3S" role="jymVt" />
    <node concept="3clFb_" id="3T" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getConstraints" />
      <property role="DiZV1" value="false" />
      <node concept="2AHcQZ" id="3X" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3Tm1VV" id="3Y" role="1B3o_S" />
      <node concept="3uibUv" id="3Z" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
      </node>
      <node concept="37vLTG" id="40" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="42" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="41" role="3clF47">
        <node concept="1_3QMa" id="43" role="3cqZAp">
          <node concept="37vLTw" id="45" role="1_3QMn">
            <ref role="3cqZAo" node="40" resolve="concept" />
          </node>
          <node concept="1pnPoh" id="46" role="1_3QMm">
            <node concept="3clFbS" id="4f" role="1pnPq1">
              <node concept="3cpWs6" id="4h" role="3cqZAp">
                <node concept="1nCR9W" id="4i" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.RelayQueryExpression_Constraints" />
                  <node concept="3uibUv" id="4j" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4g" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:1HN6OkgQWmv" resolve="RelayQueryExpression" />
            </node>
          </node>
          <node concept="1pnPoh" id="47" role="1_3QMm">
            <node concept="3clFbS" id="4k" role="1pnPq1">
              <node concept="3cpWs6" id="4m" role="3cqZAp">
                <node concept="1nCR9W" id="4n" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.ResultStatement_Constraints" />
                  <node concept="3uibUv" id="4o" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4l" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:68RPrIbaDgH" resolve="ResultStatement" />
            </node>
          </node>
          <node concept="1pnPoh" id="48" role="1_3QMm">
            <node concept="3clFbS" id="4p" role="1pnPq1">
              <node concept="3cpWs6" id="4r" role="3cqZAp">
                <node concept="1nCR9W" id="4s" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.AdvanceWorkStatement_Constraints" />
                  <node concept="3uibUv" id="4t" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4q" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:apaq_sBAA4" resolve="AdvanceWorkStatement" />
            </node>
          </node>
          <node concept="1pnPoh" id="49" role="1_3QMm">
            <node concept="3clFbS" id="4u" role="1pnPq1">
              <node concept="3cpWs6" id="4w" role="3cqZAp">
                <node concept="1nCR9W" id="4x" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.FinishWorkStatement_Constraints" />
                  <node concept="3uibUv" id="4y" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4v" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:apaq_sBAA7" resolve="FinishWorkStatement" />
            </node>
          </node>
          <node concept="1pnPoh" id="4a" role="1_3QMm">
            <node concept="3clFbS" id="4z" role="1pnPq1">
              <node concept="3cpWs6" id="4_" role="3cqZAp">
                <node concept="1nCR9W" id="4A" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.ResourceType_Constraints" />
                  <node concept="3uibUv" id="4B" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4$" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:230qvwa_7a2" resolve="ResourceType" />
            </node>
          </node>
          <node concept="1pnPoh" id="4b" role="1_3QMm">
            <node concept="3clFbS" id="4C" role="1pnPq1">
              <node concept="3cpWs6" id="4E" role="3cqZAp">
                <node concept="1nCR9W" id="4F" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.JobDefinition_Constraints" />
                  <node concept="3uibUv" id="4G" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4D" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:230qvwa_MQF" resolve="JobDefinition" />
            </node>
          </node>
          <node concept="1pnPoh" id="4c" role="1_3QMm">
            <node concept="3clFbS" id="4H" role="1pnPq1">
              <node concept="3cpWs6" id="4J" role="3cqZAp">
                <node concept="1nCR9W" id="4K" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.ConfigDefinition_Constraints" />
                  <node concept="3uibUv" id="4L" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4I" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:1HN6OkgRbV$" resolve="ConfigDefinition" />
            </node>
          </node>
          <node concept="1pnPoh" id="4d" role="1_3QMm">
            <node concept="3clFbS" id="4M" role="1pnPq1">
              <node concept="3cpWs6" id="4O" role="3cqZAp">
                <node concept="1nCR9W" id="4P" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.make.script.constraints.GetMakeSessionExpression_Constraints" />
                  <node concept="3uibUv" id="4Q" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="4N" role="1pnPq6">
              <ref role="3gnhBz" to="q9ra:671CX74nUMc" resolve="GetMakeSessionExpression" />
            </node>
          </node>
          <node concept="3clFbS" id="4e" role="1prKM_" />
        </node>
        <node concept="3cpWs6" id="44" role="3cqZAp">
          <node concept="2ShNRf" id="4R" role="3cqZAk">
            <node concept="1pGfFk" id="4S" role="2ShVmc">
              <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
              <node concept="37vLTw" id="4T" role="37wK5m">
                <ref role="3cqZAo" node="40" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="4U">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="FinishWorkStatement_Constraints" />
    <node concept="3Tm1VV" id="4V" role="1B3o_S" />
    <node concept="3uibUv" id="4W" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="4X" role="jymVt">
      <node concept="3cqZAl" id="50" role="3clF45" />
      <node concept="3clFbS" id="51" role="3clF47">
        <node concept="XkiVB" id="53" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="54" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="55" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="56" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="57" role="37wK5m">
              <property role="1adDun" value="0x29929a95c9e6987L" />
            </node>
            <node concept="Xl_RD" id="58" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.FinishWorkStatement" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="52" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="4Y" role="jymVt" />
    <node concept="3clFb_" id="4Z" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedReferences" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="59" role="1B3o_S" />
      <node concept="3uibUv" id="5a" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="5d" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
        </node>
        <node concept="3uibUv" id="5e" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="5b" role="3clF47">
        <node concept="3cpWs8" id="5f" role="3cqZAp">
          <node concept="3cpWsn" id="5i" role="3cpWs9">
            <property role="TrG5h" value="references" />
            <node concept="3uibUv" id="5j" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="5l" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
              </node>
              <node concept="3uibUv" id="5m" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="5k" role="33vP2m">
              <node concept="1pGfFk" id="5n" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="5o" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
                </node>
                <node concept="3uibUv" id="5p" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5g" role="3cqZAp">
          <node concept="2OqwBi" id="5q" role="3clFbG">
            <node concept="37vLTw" id="5r" role="2Oq$k0">
              <ref role="3cqZAo" node="5i" resolve="references" />
            </node>
            <node concept="liA8E" id="5s" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="5t" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getReferenceLink(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getReferenceLink" />
                <node concept="1adDum" id="5v" role="37wK5m">
                  <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
                </node>
                <node concept="1adDum" id="5w" role="37wK5m">
                  <property role="1adDun" value="0xa65e763c9bae2d3bL" />
                </node>
                <node concept="1adDum" id="5x" role="37wK5m">
                  <property role="1adDun" value="0x29929a95c9e6987L" />
                </node>
                <node concept="1adDum" id="5y" role="37wK5m">
                  <property role="1adDun" value="0x97a1ce11862c6ddL" />
                </node>
                <node concept="Xl_RD" id="5z" role="37wK5m">
                  <property role="Xl_RC" value="workStatement" />
                </node>
              </node>
              <node concept="2ShNRf" id="5u" role="37wK5m">
                <node concept="YeOm9" id="5$" role="2ShVmc">
                  <node concept="1Y3b0j" id="5_" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BaseReferenceConstraintsDescriptor" resolve="BaseReferenceConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BaseReferenceConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SReferenceLinkId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BaseReferenceConstraintsDescriptor" />
                    <node concept="2YIFZM" id="5A" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.refId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SReferenceLinkId" resolve="refId" />
                      <node concept="1adDum" id="5F" role="37wK5m">
                        <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
                      </node>
                      <node concept="1adDum" id="5G" role="37wK5m">
                        <property role="1adDun" value="0xa65e763c9bae2d3bL" />
                      </node>
                      <node concept="1adDum" id="5H" role="37wK5m">
                        <property role="1adDun" value="0x29929a95c9e6987L" />
                      </node>
                      <node concept="1adDum" id="5I" role="37wK5m">
                        <property role="1adDun" value="0x97a1ce11862c6ddL" />
                      </node>
                    </node>
                    <node concept="3Tm1VV" id="5B" role="1B3o_S" />
                    <node concept="Xjq3P" id="5C" role="37wK5m" />
                    <node concept="3clFb_" id="5D" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="5J" role="1B3o_S" />
                      <node concept="10P_77" id="5K" role="3clF45" />
                      <node concept="3clFbS" id="5L" role="3clF47">
                        <node concept="3clFbF" id="5N" role="3cqZAp">
                          <node concept="3clFbT" id="5O" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="5M" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="5E" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="5P" role="1B3o_S" />
                      <node concept="3uibUv" id="5Q" role="3clF45">
                        <ref role="3uigEE" to="ze1i:~ReferenceScopeProvider" resolve="ReferenceScopeProvider" />
                      </node>
                      <node concept="2AHcQZ" id="5R" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      </node>
                      <node concept="3clFbS" id="5S" role="3clF47">
                        <node concept="3cpWs6" id="5U" role="3cqZAp">
                          <node concept="2ShNRf" id="5V" role="3cqZAk">
                            <node concept="YeOm9" id="5W" role="2ShVmc">
                              <node concept="1Y3b0j" id="5X" role="YeSDq">
                                <property role="2bfB8j" value="true" />
                                <ref role="1Y3XeK" to="79pl:~BaseScopeProvider" resolve="BaseScopeProvider" />
                                <ref role="37wK5l" to="79pl:~BaseScopeProvider.&lt;init&gt;()" resolve="BaseScopeProvider" />
                                <node concept="3Tm1VV" id="5Y" role="1B3o_S" />
                                <node concept="3clFb_" id="5Z" role="jymVt">
                                  <property role="TrG5h" value="hasPresentation" />
                                  <node concept="3Tm1VV" id="63" role="1B3o_S" />
                                  <node concept="10P_77" id="64" role="3clF45" />
                                  <node concept="3clFbS" id="65" role="3clF47">
                                    <node concept="3clFbF" id="67" role="3cqZAp">
                                      <node concept="3clFbT" id="68" role="3clFbG">
                                        <property role="3clFbU" value="true" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="66" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="60" role="jymVt">
                                  <property role="TrG5h" value="getPresentation" />
                                  <node concept="3Tm1VV" id="69" role="1B3o_S" />
                                  <node concept="3uibUv" id="6a" role="3clF45">
                                    <ref role="3uigEE" to="wyt6:~String" resolve="String" />
                                  </node>
                                  <node concept="37vLTG" id="6b" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="6f" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="6c" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="6g" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferencePresentationContext" resolve="ReferencePresentationContext" />
                                    </node>
                                  </node>
                                  <node concept="3clFbS" id="6d" role="3clF47">
                                    <node concept="3clFbF" id="6h" role="3cqZAp">
                                      <node concept="2OqwBi" id="6i" role="3clFbG">
                                        <node concept="1DoJHT" id="6j" role="2Oq$k0">
                                          <property role="1Dpdpm" value="getParameterNode" />
                                          <node concept="3uibUv" id="6l" role="1Ez5kq">
                                            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                          </node>
                                          <node concept="37vLTw" id="6m" role="1EMhIo">
                                            <ref role="3cqZAo" node="6c" resolve="_context" />
                                          </node>
                                        </node>
                                        <node concept="3TrcHB" id="6k" role="2OqNvi">
                                          <ref role="3TsBF5" to="q9ra:_U7e4opu$h" resolve="workName" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="6e" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="61" role="jymVt">
                                  <property role="TrG5h" value="getSearchScopeValidatorNode" />
                                  <node concept="3Tm1VV" id="6n" role="1B3o_S" />
                                  <node concept="3clFbS" id="6o" role="3clF47">
                                    <node concept="3cpWs6" id="6r" role="3cqZAp">
                                      <node concept="1dyn4i" id="6s" role="3cqZAk">
                                        <property role="1zomUR" value="true" />
                                        <property role="1dyqJU" value="breakingNode" />
                                        <node concept="2ShNRf" id="6t" role="1dyrYi">
                                          <node concept="1pGfFk" id="6u" role="2ShVmc">
                                            <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                            <node concept="Xl_RD" id="6v" role="37wK5m">
                                              <property role="Xl_RC" value="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
                                            </node>
                                            <node concept="Xl_RD" id="6w" role="37wK5m">
                                              <property role="Xl_RC" value="6836281137582794403" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3uibUv" id="6p" role="3clF45">
                                    <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                                  </node>
                                  <node concept="2AHcQZ" id="6q" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="62" role="jymVt">
                                  <property role="IEkAT" value="false" />
                                  <property role="1EzhhJ" value="false" />
                                  <property role="TrG5h" value="createScope" />
                                  <property role="DiZV1" value="false" />
                                  <node concept="37vLTG" id="6x" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="6B" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="6y" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="6C" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferenceConstraintsContext" resolve="ReferenceConstraintsContext" />
                                    </node>
                                  </node>
                                  <node concept="3Tm1VV" id="6z" role="1B3o_S" />
                                  <node concept="3uibUv" id="6$" role="3clF45">
                                    <ref role="3uigEE" to="35tq:~Scope" resolve="Scope" />
                                  </node>
                                  <node concept="3clFbS" id="6_" role="3clF47">
                                    <node concept="9aQIb" id="6D" role="3cqZAp">
                                      <node concept="3clFbS" id="6E" role="9aQI4">
                                        <node concept="3clFbF" id="6F" role="3cqZAp">
                                          <node concept="2YIFZM" id="6G" role="3clFbG">
                                            <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
                                            <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
                                            <node concept="2OqwBi" id="6H" role="37wK5m">
                                              <node concept="2OqwBi" id="6I" role="2Oq$k0">
                                                <node concept="2OqwBi" id="6K" role="2Oq$k0">
                                                  <node concept="2Xjw5R" id="6M" role="2OqNvi">
                                                    <node concept="1xMEDy" id="6O" role="1xVPHs">
                                                      <node concept="chp4Y" id="6P" role="ri$Ld">
                                                        <ref role="cht4Q" to="q9ra:230qvwa_MQF" resolve="JobDefinition" />
                                                      </node>
                                                    </node>
                                                  </node>
                                                  <node concept="1DoJHT" id="6N" role="2Oq$k0">
                                                    <property role="1Dpdpm" value="getContextNode" />
                                                    <node concept="3uibUv" id="6Q" role="1Ez5kq">
                                                      <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                    </node>
                                                    <node concept="37vLTw" id="6R" role="1EMhIo">
                                                      <ref role="3cqZAo" node="6y" resolve="_context" />
                                                    </node>
                                                  </node>
                                                </node>
                                                <node concept="3TrEf2" id="6L" role="2OqNvi">
                                                  <ref role="3Tt5mk" to="tpee:gyVODHa" resolve="body" />
                                                </node>
                                              </node>
                                              <node concept="2Rf3mk" id="6J" role="2OqNvi">
                                                <node concept="1xMEDy" id="6S" role="1xVPHs">
                                                  <node concept="chp4Y" id="6T" role="ri$Ld">
                                                    <ref role="cht4Q" to="q9ra:apaq_sBAA2" resolve="BeginWorkStatement" />
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="6A" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="5T" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5h" role="3cqZAp">
          <node concept="37vLTw" id="6U" role="3clFbG">
            <ref role="3cqZAo" node="5i" resolve="references" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="5c" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="6V" />
  <node concept="312cEu" id="6W">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="GetMakeSessionExpression_Constraints" />
    <node concept="3Tm1VV" id="6X" role="1B3o_S" />
    <node concept="3uibUv" id="6Y" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="6Z" role="jymVt">
      <node concept="3cqZAl" id="73" role="3clF45" />
      <node concept="3clFbS" id="74" role="3clF47">
        <node concept="XkiVB" id="76" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="77" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="78" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="79" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="7a" role="37wK5m">
              <property role="1adDun" value="0x61c1a3d1c45fac8cL" />
            </node>
            <node concept="Xl_RD" id="7b" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.GetMakeSessionExpression" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="75" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="70" role="jymVt" />
    <node concept="3clFb_" id="71" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tmbuc" id="7c" role="1B3o_S" />
      <node concept="3uibUv" id="7d" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <node concept="3uibUv" id="7g" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
        </node>
        <node concept="3uibUv" id="7h" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
        </node>
      </node>
      <node concept="3clFbS" id="7e" role="3clF47">
        <node concept="3clFbF" id="7i" role="3cqZAp">
          <node concept="2ShNRf" id="7j" role="3clFbG">
            <node concept="YeOm9" id="7k" role="2ShVmc">
              <node concept="1Y3b0j" id="7l" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <node concept="3Tm1VV" id="7m" role="1B3o_S" />
                <node concept="3clFb_" id="7n" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <node concept="3Tm1VV" id="7q" role="1B3o_S" />
                  <node concept="2AHcQZ" id="7r" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                  </node>
                  <node concept="3uibUv" id="7s" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  </node>
                  <node concept="37vLTG" id="7t" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <node concept="3uibUv" id="7w" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                    </node>
                    <node concept="2AHcQZ" id="7x" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="7u" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <node concept="3uibUv" id="7y" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                    </node>
                    <node concept="2AHcQZ" id="7z" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="7v" role="3clF47">
                    <node concept="3cpWs8" id="7$" role="3cqZAp">
                      <node concept="3cpWsn" id="7D" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <node concept="10P_77" id="7E" role="1tU5fm" />
                        <node concept="1rXfSq" id="7F" role="33vP2m">
                          <ref role="37wK5l" node="72" resolve="staticCanBeAChild" />
                          <node concept="2OqwBi" id="7G" role="37wK5m">
                            <node concept="37vLTw" id="7K" role="2Oq$k0">
                              <ref role="3cqZAo" node="7t" resolve="context" />
                            </node>
                            <node concept="liA8E" id="7L" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getNode():org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="7H" role="37wK5m">
                            <node concept="37vLTw" id="7M" role="2Oq$k0">
                              <ref role="3cqZAo" node="7t" resolve="context" />
                            </node>
                            <node concept="liA8E" id="7N" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getParentNode():org.jetbrains.mps.openapi.model.SNode" resolve="getParentNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="7I" role="37wK5m">
                            <node concept="37vLTw" id="7O" role="2Oq$k0">
                              <ref role="3cqZAo" node="7t" resolve="context" />
                            </node>
                            <node concept="liA8E" id="7P" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getConcept():org.jetbrains.mps.openapi.language.SAbstractConcept" resolve="getConcept" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="7J" role="37wK5m">
                            <node concept="37vLTw" id="7Q" role="2Oq$k0">
                              <ref role="3cqZAo" node="7t" resolve="context" />
                            </node>
                            <node concept="liA8E" id="7R" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getLink():org.jetbrains.mps.openapi.language.SContainmentLink" resolve="getLink" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="7_" role="3cqZAp" />
                    <node concept="3clFbJ" id="7A" role="3cqZAp">
                      <node concept="3clFbS" id="7S" role="3clFbx">
                        <node concept="3clFbF" id="7U" role="3cqZAp">
                          <node concept="2OqwBi" id="7V" role="3clFbG">
                            <node concept="37vLTw" id="7W" role="2Oq$k0">
                              <ref role="3cqZAo" node="7u" resolve="checkingNodeContext" />
                            </node>
                            <node concept="liA8E" id="7X" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference):void" resolve="setBreakingNode" />
                              <node concept="1dyn4i" id="7Y" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <node concept="2ShNRf" id="7Z" role="1dyrYi">
                                  <node concept="1pGfFk" id="80" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <node concept="Xl_RD" id="81" role="37wK5m">
                                      <property role="Xl_RC" value="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
                                    </node>
                                    <node concept="Xl_RD" id="82" role="37wK5m">
                                      <property role="Xl_RC" value="7044091413522263289" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="7T" role="3clFbw">
                        <node concept="3y3z36" id="83" role="3uHU7w">
                          <node concept="10Nm6u" id="85" role="3uHU7w" />
                          <node concept="37vLTw" id="86" role="3uHU7B">
                            <ref role="3cqZAo" node="7u" resolve="checkingNodeContext" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="84" role="3uHU7B">
                          <node concept="37vLTw" id="87" role="3fr31v">
                            <ref role="3cqZAo" node="7D" resolve="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="7B" role="3cqZAp" />
                    <node concept="3clFbF" id="7C" role="3cqZAp">
                      <node concept="37vLTw" id="88" role="3clFbG">
                        <ref role="3cqZAo" node="7D" resolve="result" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="7o" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                </node>
                <node concept="3uibUv" id="7p" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="7f" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2YIFZL" id="72" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <node concept="10P_77" id="89" role="3clF45" />
      <node concept="3Tm6S6" id="8a" role="1B3o_S" />
      <node concept="3clFbS" id="8b" role="3clF47">
        <node concept="3clFbF" id="8g" role="3cqZAp">
          <node concept="2OqwBi" id="8h" role="3clFbG">
            <node concept="2OqwBi" id="8i" role="2Oq$k0">
              <node concept="37vLTw" id="8k" role="2Oq$k0">
                <ref role="3cqZAo" node="8d" resolve="parentNode" />
              </node>
              <node concept="2Xjw5R" id="8l" role="2OqNvi">
                <node concept="3gmYPX" id="8m" role="1xVPHs">
                  <node concept="3gn64h" id="8n" role="3gmYPZ">
                    <ref role="3gnhBz" to="q9ra:230qvwa_MQF" resolve="JobDefinition" />
                  </node>
                  <node concept="3gn64h" id="8o" role="3gmYPZ">
                    <ref role="3gnhBz" to="q9ra:1HN6OkgRbV$" resolve="ConfigDefinition" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3x8VRR" id="8j" role="2OqNvi" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="8c" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="8p" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="8d" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <node concept="3uibUv" id="8q" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="8e" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <node concept="3uibUv" id="8r" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="37vLTG" id="8f" role="3clF46">
        <property role="TrG5h" value="link" />
        <node concept="3uibUv" id="8s" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="8t">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="JobDefinition_Constraints" />
    <node concept="3Tm1VV" id="8u" role="1B3o_S" />
    <node concept="3uibUv" id="8v" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="8w" role="jymVt">
      <node concept="3cqZAl" id="8$" role="3clF45" />
      <node concept="3clFbS" id="8_" role="3clF47">
        <node concept="XkiVB" id="8B" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="8C" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="8D" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="8E" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="8F" role="37wK5m">
              <property role="1adDun" value="0x20c069f80a972dabL" />
            </node>
            <node concept="Xl_RD" id="8G" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.JobDefinition" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="8A" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="8x" role="jymVt" />
    <node concept="3clFb_" id="8y" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeAncestorConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tmbuc" id="8H" role="1B3o_S" />
      <node concept="3uibUv" id="8I" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <node concept="3uibUv" id="8L" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeAncestor" resolve="ConstraintContext_CanBeAncestor" />
        </node>
        <node concept="3uibUv" id="8M" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
        </node>
      </node>
      <node concept="3clFbS" id="8J" role="3clF47">
        <node concept="3clFbF" id="8N" role="3cqZAp">
          <node concept="2ShNRf" id="8O" role="3clFbG">
            <node concept="YeOm9" id="8P" role="2ShVmc">
              <node concept="1Y3b0j" id="8Q" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <node concept="3Tm1VV" id="8R" role="1B3o_S" />
                <node concept="3clFb_" id="8S" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <node concept="3Tm1VV" id="8V" role="1B3o_S" />
                  <node concept="2AHcQZ" id="8W" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                  </node>
                  <node concept="3uibUv" id="8X" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  </node>
                  <node concept="37vLTG" id="8Y" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <node concept="3uibUv" id="91" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeAncestor" resolve="ConstraintContext_CanBeAncestor" />
                    </node>
                    <node concept="2AHcQZ" id="92" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="8Z" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <node concept="3uibUv" id="93" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                    </node>
                    <node concept="2AHcQZ" id="94" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="90" role="3clF47">
                    <node concept="3cpWs8" id="95" role="3cqZAp">
                      <node concept="3cpWsn" id="9a" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <node concept="10P_77" id="9b" role="1tU5fm" />
                        <node concept="1rXfSq" id="9c" role="33vP2m">
                          <ref role="37wK5l" node="8z" resolve="staticCanBeAnAncestor" />
                          <node concept="2OqwBi" id="9d" role="37wK5m">
                            <node concept="37vLTw" id="9i" role="2Oq$k0">
                              <ref role="3cqZAo" node="8Y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="9j" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getNode():org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="9e" role="37wK5m">
                            <node concept="37vLTw" id="9k" role="2Oq$k0">
                              <ref role="3cqZAo" node="8Y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="9l" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getChildNode():org.jetbrains.mps.openapi.model.SNode" resolve="getChildNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="9f" role="37wK5m">
                            <node concept="37vLTw" id="9m" role="2Oq$k0">
                              <ref role="3cqZAo" node="8Y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="9n" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getChildConcept():org.jetbrains.mps.openapi.language.SAbstractConcept" resolve="getChildConcept" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="9g" role="37wK5m">
                            <node concept="37vLTw" id="9o" role="2Oq$k0">
                              <ref role="3cqZAo" node="8Y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="9p" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getParentNode():org.jetbrains.mps.openapi.model.SNode" resolve="getParentNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="9h" role="37wK5m">
                            <node concept="37vLTw" id="9q" role="2Oq$k0">
                              <ref role="3cqZAo" node="8Y" resolve="context" />
                            </node>
                            <node concept="liA8E" id="9r" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeAncestor.getLink():org.jetbrains.mps.openapi.language.SContainmentLink" resolve="getLink" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="96" role="3cqZAp" />
                    <node concept="3clFbJ" id="97" role="3cqZAp">
                      <node concept="3clFbS" id="9s" role="3clFbx">
                        <node concept="3clFbF" id="9u" role="3cqZAp">
                          <node concept="2OqwBi" id="9v" role="3clFbG">
                            <node concept="37vLTw" id="9w" role="2Oq$k0">
                              <ref role="3cqZAo" node="8Z" resolve="checkingNodeContext" />
                            </node>
                            <node concept="liA8E" id="9x" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference):void" resolve="setBreakingNode" />
                              <node concept="1dyn4i" id="9y" role="37wK5m">
                                <property role="1dyqJU" value="canBeRootBreakingPoint" />
                                <node concept="2ShNRf" id="9z" role="1dyrYi">
                                  <node concept="1pGfFk" id="9$" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <node concept="Xl_RD" id="9_" role="37wK5m">
                                      <property role="Xl_RC" value="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
                                    </node>
                                    <node concept="Xl_RD" id="9A" role="37wK5m">
                                      <property role="Xl_RC" value="5579506316679941758" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="9t" role="3clFbw">
                        <node concept="3y3z36" id="9B" role="3uHU7w">
                          <node concept="10Nm6u" id="9D" role="3uHU7w" />
                          <node concept="37vLTw" id="9E" role="3uHU7B">
                            <ref role="3cqZAo" node="8Z" resolve="checkingNodeContext" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="9C" role="3uHU7B">
                          <node concept="37vLTw" id="9F" role="3fr31v">
                            <ref role="3cqZAo" node="9a" resolve="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="98" role="3cqZAp" />
                    <node concept="3clFbF" id="99" role="3cqZAp">
                      <node concept="37vLTw" id="9G" role="3clFbG">
                        <ref role="3cqZAo" node="9a" resolve="result" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="8T" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeAncestor" resolve="ConstraintContext_CanBeAncestor" />
                </node>
                <node concept="3uibUv" id="8U" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="8K" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2YIFZL" id="8z" role="jymVt">
      <property role="TrG5h" value="staticCanBeAnAncestor" />
      <node concept="37vLTG" id="9H" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="9P" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="9I" role="3clF46">
        <property role="TrG5h" value="childNode" />
        <node concept="3uibUv" id="9Q" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="9J" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <node concept="3uibUv" id="9R" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="37vLTG" id="9K" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <node concept="3uibUv" id="9S" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="9L" role="3clF46">
        <property role="TrG5h" value="link" />
        <node concept="3uibUv" id="9T" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
        </node>
      </node>
      <node concept="10P_77" id="9M" role="3clF45" />
      <node concept="3Tm6S6" id="9N" role="1B3o_S" />
      <node concept="3clFbS" id="9O" role="3clF47">
        <node concept="3cpWs8" id="9U" role="3cqZAp">
          <node concept="3cpWsn" id="9X" role="3cpWs9">
            <property role="TrG5h" value="ancestor" />
            <node concept="3Tqbb2" id="9Y" role="1tU5fm">
              <ref role="ehGHo" to="tpee:htgVS9_" resolve="IStatementListContainer" />
            </node>
            <node concept="2OqwBi" id="9Z" role="33vP2m">
              <node concept="37vLTw" id="a0" role="2Oq$k0">
                <ref role="3cqZAo" node="9K" resolve="parentNode" />
              </node>
              <node concept="2Xjw5R" id="a1" role="2OqNvi">
                <node concept="1xMEDy" id="a2" role="1xVPHs">
                  <node concept="chp4Y" id="a4" role="ri$Ld">
                    <ref role="cht4Q" to="tpee:htgVS9_" resolve="IStatementListContainer" />
                  </node>
                </node>
                <node concept="1xIGOp" id="a3" role="1xVPHs" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="9V" role="3cqZAp">
          <node concept="3clFbS" id="a5" role="3clFbx">
            <node concept="3cpWs6" id="a7" role="3cqZAp">
              <node concept="3fqX7Q" id="a8" role="3cqZAk">
                <node concept="2OqwBi" id="a9" role="3fr31v">
                  <node concept="37vLTw" id="aa" role="2Oq$k0">
                    <ref role="3cqZAo" node="9J" resolve="childConcept" />
                  </node>
                  <node concept="3O6GUB" id="ab" role="2OqNvi">
                    <node concept="chp4Y" id="ac" role="3QVz_e">
                      <ref role="cht4Q" to="tpee:fzcpWvY" resolve="ReturnStatement" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbC" id="a6" role="3clFbw">
            <node concept="37vLTw" id="ad" role="3uHU7w">
              <ref role="3cqZAo" node="9H" resolve="node" />
            </node>
            <node concept="37vLTw" id="ae" role="3uHU7B">
              <ref role="3cqZAo" node="9X" resolve="ancestor" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="9W" role="3cqZAp">
          <node concept="3clFbT" id="af" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="ag">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="RelayQueryExpression_Constraints" />
    <node concept="3Tm1VV" id="ah" role="1B3o_S" />
    <node concept="3uibUv" id="ai" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="aj" role="jymVt">
      <node concept="3cqZAl" id="an" role="3clF45" />
      <node concept="3clFbS" id="ao" role="3clF47">
        <node concept="XkiVB" id="aq" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="ar" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="as" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="at" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="au" role="37wK5m">
              <property role="1adDun" value="0x1b731b4510dbc59fL" />
            </node>
            <node concept="Xl_RD" id="av" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.RelayQueryExpression" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="ap" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="ak" role="jymVt" />
    <node concept="3clFb_" id="al" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tmbuc" id="aw" role="1B3o_S" />
      <node concept="3uibUv" id="ax" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <node concept="3uibUv" id="a$" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
        </node>
        <node concept="3uibUv" id="a_" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
        </node>
      </node>
      <node concept="3clFbS" id="ay" role="3clF47">
        <node concept="3clFbF" id="aA" role="3cqZAp">
          <node concept="2ShNRf" id="aB" role="3clFbG">
            <node concept="YeOm9" id="aC" role="2ShVmc">
              <node concept="1Y3b0j" id="aD" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <node concept="3Tm1VV" id="aE" role="1B3o_S" />
                <node concept="3clFb_" id="aF" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <node concept="3Tm1VV" id="aI" role="1B3o_S" />
                  <node concept="2AHcQZ" id="aJ" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                  </node>
                  <node concept="3uibUv" id="aK" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  </node>
                  <node concept="37vLTG" id="aL" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <node concept="3uibUv" id="aO" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                    </node>
                    <node concept="2AHcQZ" id="aP" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="aM" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <node concept="3uibUv" id="aQ" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                    </node>
                    <node concept="2AHcQZ" id="aR" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="aN" role="3clF47">
                    <node concept="3cpWs8" id="aS" role="3cqZAp">
                      <node concept="3cpWsn" id="aX" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <node concept="10P_77" id="aY" role="1tU5fm" />
                        <node concept="1rXfSq" id="aZ" role="33vP2m">
                          <ref role="37wK5l" node="am" resolve="staticCanBeAChild" />
                          <node concept="2OqwBi" id="b0" role="37wK5m">
                            <node concept="37vLTw" id="b4" role="2Oq$k0">
                              <ref role="3cqZAo" node="aL" resolve="context" />
                            </node>
                            <node concept="liA8E" id="b5" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getNode():org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="b1" role="37wK5m">
                            <node concept="37vLTw" id="b6" role="2Oq$k0">
                              <ref role="3cqZAo" node="aL" resolve="context" />
                            </node>
                            <node concept="liA8E" id="b7" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getParentNode():org.jetbrains.mps.openapi.model.SNode" resolve="getParentNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="b2" role="37wK5m">
                            <node concept="37vLTw" id="b8" role="2Oq$k0">
                              <ref role="3cqZAo" node="aL" resolve="context" />
                            </node>
                            <node concept="liA8E" id="b9" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getConcept():org.jetbrains.mps.openapi.language.SAbstractConcept" resolve="getConcept" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="b3" role="37wK5m">
                            <node concept="37vLTw" id="ba" role="2Oq$k0">
                              <ref role="3cqZAo" node="aL" resolve="context" />
                            </node>
                            <node concept="liA8E" id="bb" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getLink():org.jetbrains.mps.openapi.language.SContainmentLink" resolve="getLink" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="aT" role="3cqZAp" />
                    <node concept="3clFbJ" id="aU" role="3cqZAp">
                      <node concept="3clFbS" id="bc" role="3clFbx">
                        <node concept="3clFbF" id="be" role="3cqZAp">
                          <node concept="2OqwBi" id="bf" role="3clFbG">
                            <node concept="37vLTw" id="bg" role="2Oq$k0">
                              <ref role="3cqZAo" node="aM" resolve="checkingNodeContext" />
                            </node>
                            <node concept="liA8E" id="bh" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference):void" resolve="setBreakingNode" />
                              <node concept="1dyn4i" id="bi" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <node concept="2ShNRf" id="bj" role="1dyrYi">
                                  <node concept="1pGfFk" id="bk" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <node concept="Xl_RD" id="bl" role="37wK5m">
                                      <property role="Xl_RC" value="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
                                    </node>
                                    <node concept="Xl_RD" id="bm" role="37wK5m">
                                      <property role="Xl_RC" value="1227128029536561915" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="bd" role="3clFbw">
                        <node concept="3y3z36" id="bn" role="3uHU7w">
                          <node concept="10Nm6u" id="bp" role="3uHU7w" />
                          <node concept="37vLTw" id="bq" role="3uHU7B">
                            <ref role="3cqZAo" node="aM" resolve="checkingNodeContext" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="bo" role="3uHU7B">
                          <node concept="37vLTw" id="br" role="3fr31v">
                            <ref role="3cqZAo" node="aX" resolve="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="aV" role="3cqZAp" />
                    <node concept="3clFbF" id="aW" role="3cqZAp">
                      <node concept="37vLTw" id="bs" role="3clFbG">
                        <ref role="3cqZAo" node="aX" resolve="result" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="aG" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                </node>
                <node concept="3uibUv" id="aH" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="az" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2YIFZL" id="am" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <node concept="10P_77" id="bt" role="3clF45" />
      <node concept="3Tm6S6" id="bu" role="1B3o_S" />
      <node concept="3clFbS" id="bv" role="3clF47">
        <node concept="3clFbF" id="b$" role="3cqZAp">
          <node concept="2OqwBi" id="b_" role="3clFbG">
            <node concept="2OqwBi" id="bA" role="2Oq$k0">
              <node concept="37vLTw" id="bC" role="2Oq$k0">
                <ref role="3cqZAo" node="bx" resolve="parentNode" />
              </node>
              <node concept="2Xjw5R" id="bD" role="2OqNvi">
                <node concept="3gmYPX" id="bE" role="1xVPHs">
                  <node concept="3gn64h" id="bF" role="3gmYPZ">
                    <ref role="3gnhBz" to="tpee:htgVS9_" resolve="IStatementListContainer" />
                  </node>
                  <node concept="3gn64h" id="bG" role="3gmYPZ">
                    <ref role="3gnhBz" to="q9ra:1HN6OkgRbV$" resolve="ConfigDefinition" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3x8VRR" id="bB" role="2OqNvi" />
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="bw" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="bH" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="bx" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <node concept="3uibUv" id="bI" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="by" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <node concept="3uibUv" id="bJ" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="37vLTG" id="bz" role="3clF46">
        <property role="TrG5h" value="link" />
        <node concept="3uibUv" id="bK" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="bL">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="ResourceType_Constraints" />
    <node concept="3Tm1VV" id="bM" role="1B3o_S" />
    <node concept="3uibUv" id="bN" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="bO" role="jymVt">
      <node concept="3cqZAl" id="bQ" role="3clF45" />
      <node concept="3clFbS" id="bR" role="3clF47">
        <node concept="XkiVB" id="bT" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="bU" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="bV" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="bW" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="bX" role="37wK5m">
              <property role="1adDun" value="0x20c069f80a947282L" />
            </node>
            <node concept="Xl_RD" id="bY" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.ResourceType" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="bS" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="bP" role="jymVt" />
  </node>
  <node concept="312cEu" id="bZ">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="ResultStatement_Constraints" />
    <node concept="3Tm1VV" id="c0" role="1B3o_S" />
    <node concept="3uibUv" id="c1" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="c2" role="jymVt">
      <node concept="3cqZAl" id="c6" role="3clF45" />
      <node concept="3clFbS" id="c7" role="3clF47">
        <node concept="XkiVB" id="c9" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="ca" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="cb" role="37wK5m">
              <property role="1adDun" value="0x95f8a3e6f9944ca0L" />
            </node>
            <node concept="1adDum" id="cc" role="37wK5m">
              <property role="1adDun" value="0xa65e763c9bae2d3bL" />
            </node>
            <node concept="1adDum" id="cd" role="37wK5m">
              <property role="1adDun" value="0x6237d5bb8b2a942dL" />
            </node>
            <node concept="Xl_RD" id="ce" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.make.script.structure.ResultStatement" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="c8" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="c3" role="jymVt" />
    <node concept="3clFb_" id="c4" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tmbuc" id="cf" role="1B3o_S" />
      <node concept="3uibUv" id="cg" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <node concept="3uibUv" id="cj" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
        </node>
        <node concept="3uibUv" id="ck" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
        </node>
      </node>
      <node concept="3clFbS" id="ch" role="3clF47">
        <node concept="3clFbF" id="cl" role="3cqZAp">
          <node concept="2ShNRf" id="cm" role="3clFbG">
            <node concept="YeOm9" id="cn" role="2ShVmc">
              <node concept="1Y3b0j" id="co" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <node concept="3Tm1VV" id="cp" role="1B3o_S" />
                <node concept="3clFb_" id="cq" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <node concept="3Tm1VV" id="ct" role="1B3o_S" />
                  <node concept="2AHcQZ" id="cu" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                  </node>
                  <node concept="3uibUv" id="cv" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  </node>
                  <node concept="37vLTG" id="cw" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <node concept="3uibUv" id="cz" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                    </node>
                    <node concept="2AHcQZ" id="c$" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="cx" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <node concept="3uibUv" id="c_" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                    </node>
                    <node concept="2AHcQZ" id="cA" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="cy" role="3clF47">
                    <node concept="3cpWs8" id="cB" role="3cqZAp">
                      <node concept="3cpWsn" id="cG" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <node concept="10P_77" id="cH" role="1tU5fm" />
                        <node concept="1rXfSq" id="cI" role="33vP2m">
                          <ref role="37wK5l" node="c5" resolve="staticCanBeAChild" />
                          <node concept="2OqwBi" id="cJ" role="37wK5m">
                            <node concept="37vLTw" id="cN" role="2Oq$k0">
                              <ref role="3cqZAo" node="cw" resolve="context" />
                            </node>
                            <node concept="liA8E" id="cO" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getNode():org.jetbrains.mps.openapi.model.SNode" resolve="getNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="cK" role="37wK5m">
                            <node concept="37vLTw" id="cP" role="2Oq$k0">
                              <ref role="3cqZAo" node="cw" resolve="context" />
                            </node>
                            <node concept="liA8E" id="cQ" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getParentNode():org.jetbrains.mps.openapi.model.SNode" resolve="getParentNode" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="cL" role="37wK5m">
                            <node concept="37vLTw" id="cR" role="2Oq$k0">
                              <ref role="3cqZAo" node="cw" resolve="context" />
                            </node>
                            <node concept="liA8E" id="cS" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getConcept():org.jetbrains.mps.openapi.language.SAbstractConcept" resolve="getConcept" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="cM" role="37wK5m">
                            <node concept="37vLTw" id="cT" role="2Oq$k0">
                              <ref role="3cqZAo" node="cw" resolve="context" />
                            </node>
                            <node concept="liA8E" id="cU" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~ConstraintContext_CanBeChild.getLink():org.jetbrains.mps.openapi.language.SContainmentLink" resolve="getLink" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="cC" role="3cqZAp" />
                    <node concept="3clFbJ" id="cD" role="3cqZAp">
                      <node concept="3clFbS" id="cV" role="3clFbx">
                        <node concept="3clFbF" id="cX" role="3cqZAp">
                          <node concept="2OqwBi" id="cY" role="3clFbG">
                            <node concept="37vLTw" id="cZ" role="2Oq$k0">
                              <ref role="3cqZAo" node="cx" resolve="checkingNodeContext" />
                            </node>
                            <node concept="liA8E" id="d0" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference):void" resolve="setBreakingNode" />
                              <node concept="1dyn4i" id="d1" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <node concept="2ShNRf" id="d2" role="1dyrYi">
                                  <node concept="1pGfFk" id="d3" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <node concept="Xl_RD" id="d4" role="37wK5m">
                                      <property role="Xl_RC" value="r:56325792-0540-48ec-8d52-897a8821cc64(jetbrains.mps.make.script.constraints)" />
                                    </node>
                                    <node concept="Xl_RD" id="d5" role="37wK5m">
                                      <property role="Xl_RC" value="1227128029536561926" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="cW" role="3clFbw">
                        <node concept="3y3z36" id="d6" role="3uHU7w">
                          <node concept="10Nm6u" id="d8" role="3uHU7w" />
                          <node concept="37vLTw" id="d9" role="3uHU7B">
                            <ref role="3cqZAo" node="cx" resolve="checkingNodeContext" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="d7" role="3uHU7B">
                          <node concept="37vLTw" id="da" role="3fr31v">
                            <ref role="3cqZAo" node="cG" resolve="result" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="cE" role="3cqZAp" />
                    <node concept="3clFbF" id="cF" role="3cqZAp">
                      <node concept="37vLTw" id="db" role="3clFbG">
                        <ref role="3cqZAo" node="cG" resolve="result" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="cr" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1i:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                </node>
                <node concept="3uibUv" id="cs" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="ci" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2YIFZL" id="c5" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <node concept="10P_77" id="dc" role="3clF45" />
      <node concept="3Tm6S6" id="dd" role="1B3o_S" />
      <node concept="3clFbS" id="de" role="3clF47">
        <node concept="3cpWs8" id="dj" role="3cqZAp">
          <node concept="3cpWsn" id="dl" role="3cpWs9">
            <property role="TrG5h" value="anc" />
            <node concept="3Tqbb2" id="dm" role="1tU5fm">
              <ref role="ehGHo" to="tpee:htgVS9_" resolve="IStatementListContainer" />
            </node>
            <node concept="2OqwBi" id="dn" role="33vP2m">
              <node concept="37vLTw" id="do" role="2Oq$k0">
                <ref role="3cqZAo" node="dg" resolve="parentNode" />
              </node>
              <node concept="2Xjw5R" id="dp" role="2OqNvi">
                <node concept="3gmYPX" id="dq" role="1xVPHs">
                  <node concept="3gn64h" id="dr" role="3gmYPZ">
                    <ref role="3gnhBz" to="q9ra:230qvwa_MQF" resolve="JobDefinition" />
                  </node>
                  <node concept="3gn64h" id="ds" role="3gmYPZ">
                    <ref role="3gnhBz" to="q9ra:1HN6OkgRbV$" resolve="ConfigDefinition" />
                  </node>
                  <node concept="3gn64h" id="dt" role="3gmYPZ">
                    <ref role="3gnhBz" to="tpee:htgVS9_" resolve="IStatementListContainer" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dk" role="3cqZAp">
          <node concept="22lmx$" id="du" role="3clFbG">
            <node concept="2OqwBi" id="dv" role="3uHU7w">
              <node concept="37vLTw" id="dx" role="2Oq$k0">
                <ref role="3cqZAo" node="dl" resolve="anc" />
              </node>
              <node concept="1mIQ4w" id="dy" role="2OqNvi">
                <node concept="chp4Y" id="dz" role="cj9EA">
                  <ref role="cht4Q" to="q9ra:1HN6OkgRbV$" resolve="ConfigDefinition" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="dw" role="3uHU7B">
              <node concept="37vLTw" id="d$" role="2Oq$k0">
                <ref role="3cqZAo" node="dl" resolve="anc" />
              </node>
              <node concept="1mIQ4w" id="d_" role="2OqNvi">
                <node concept="chp4Y" id="dA" role="cj9EA">
                  <ref role="cht4Q" to="q9ra:230qvwa_MQF" resolve="JobDefinition" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="df" role="3clF46">
        <property role="TrG5h" value="node" />
        <node concept="3uibUv" id="dB" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="dg" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <node concept="3uibUv" id="dC" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
        </node>
      </node>
      <node concept="37vLTG" id="dh" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <node concept="3uibUv" id="dD" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="37vLTG" id="di" role="3clF46">
        <property role="TrG5h" value="link" />
        <node concept="3uibUv" id="dE" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
        </node>
      </node>
    </node>
  </node>
</model>

