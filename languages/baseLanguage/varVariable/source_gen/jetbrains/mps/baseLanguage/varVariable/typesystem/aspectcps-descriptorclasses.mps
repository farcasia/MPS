<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f9081c6(checkpoints/jetbrains.mps.baseLanguage.varVariable.typesystem@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <languages />
  <imports>
    <import index="5m4x" ref="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="tp2g" ref="r:00000000-0000-4000-0000-011c89590334(jetbrains.mps.baseLanguage.closures.constraints)" />
    <import index="2gg1" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.errors(MPS.Core/)" />
    <import index="qurh" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.typesystem.runtime(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="u78q" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.typesystem.inference(MPS.Core/)" />
    <import index="zavc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.errors.messageTargets(MPS.Core/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="dvap" ref="r:931e38db-856b-4b95-8ae0-a7cd13da6d32(jetbrains.mps.baseLanguage.varVariable.structure)" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1197029447546" name="jetbrains.mps.baseLanguage.structure.FieldReferenceOperation" flags="nn" index="2OwXpG">
        <reference id="1197029500499" name="fieldDeclaration" index="2Oxat5" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1095933932569" name="implementedInterface" index="EKbjA" />
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
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_" />
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
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
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
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="9032177546941580387" name="jetbrains.mps.lang.generator.structure.TrivialNodeId" flags="nn" index="2$VJBW">
        <property id="9032177546941580392" name="nodeId" index="2$VJBR" />
        <child id="8557539026538618631" name="cncpt" index="3iCydw" />
      </concept>
      <concept id="5808518347809715508" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_InputNode" flags="nn" index="385nmt">
        <property id="5808518347809748738" name="presentation" index="385vuF" />
        <child id="5808518347809747118" name="node" index="385v07" />
      </concept>
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE">
        <child id="3864140621129713349" name="labels" index="39e2AI" />
      </concept>
      <concept id="3864140621129713351" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry" flags="nn" index="39e2AG">
        <property id="5843998055530255671" name="isNewRoot" index="2mV_xN" />
        <reference id="3864140621129713371" name="inputOrigin" index="39e2AK" />
        <child id="5808518347809748862" name="inputNode" index="385vvn" />
        <child id="3864140621129713365" name="outputNode" index="39e2AY" />
      </concept>
      <concept id="3864140621129713348" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_LabelEntry" flags="nn" index="39e2AJ">
        <property id="3864140621129715945" name="label" index="39e3Y2" />
        <child id="3864140621129715947" name="entries" index="39e3Y0" />
      </concept>
      <concept id="3864140621129713362" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeRef" flags="nn" index="39e2AT">
        <reference id="3864140621129713363" name="node" index="39e2AS" />
      </concept>
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="2990591960991114251" name="jetbrains.mps.lang.typesystem.structure.OriginalNodeId" flags="ng" index="6wLe0">
        <property id="2990591960991114264" name="nodeId" index="6wLej" />
        <property id="2990591960991114295" name="modelId" index="6wLeW" />
      </concept>
    </language>
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1174294166120" name="jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall" flags="nn" index="1DoJHT">
        <property id="1174294288199" name="methodName" index="1Dpdpm" />
        <child id="1174313653259" name="returnType" index="1Ez5kq" />
        <child id="1174317636233" name="instance" index="1EMhIo" />
        <child id="1174318197094" name="actualArgument" index="1EOqxR" />
      </concept>
      <concept id="1176743162354" name="jetbrains.mps.baseLanguageInternal.structure.InternalVariableReference" flags="nn" index="3VmV3z">
        <property id="1176743296073" name="name" index="3VnrPo" />
        <child id="1176743202636" name="type" index="3Vn4Tt" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="6911370362349121511" name="jetbrains.mps.lang.smodel.structure.ConceptId" flags="nn" index="2x4n5u">
        <property id="6911370362349122519" name="conceptName" index="2x4mPI" />
        <property id="6911370362349121516" name="conceptId" index="2x4n5l" />
        <property id="6911370362349133804" name="isInterface" index="2x4o5l" />
        <child id="6911370362349121514" name="languageIdentity" index="2x4n5j" />
      </concept>
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1145404486709" name="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" flags="nn" index="2JrnkZ">
        <child id="1145404616321" name="leftExpression" index="2JrQYb" />
      </concept>
      <concept id="3542851458883438784" name="jetbrains.mps.lang.smodel.structure.LanguageId" flags="nn" index="2V$Bhx">
        <property id="3542851458883439831" name="namespace" index="2V$B1Q" />
        <property id="3542851458883439832" name="languageId" index="2V$B1T" />
      </concept>
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1172008320231" name="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" flags="nn" index="3x8VRR" />
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="39dXUE" id="0">
    <node concept="39e2AJ" id="1" role="39e2AI">
      <property role="39e3Y2" value="classForRule" />
      <node concept="39e2AG" id="6" role="39e3Y0">
        <ref role="39e2AK" to="5m4x:6ZQeJ8QF890" resolve="check_VarVariableDeclaration" />
        <node concept="385nmt" id="8" role="385vvn">
          <property role="385vuF" value="check_VarVariableDeclaration" />
          <node concept="2$VJBW" id="a" role="385v07">
            <property role="2$VJBR" value="8067700594454594112" />
            <node concept="2x4n5u" id="b" role="3iCydw">
              <property role="2x4mPI" value="NonTypesystemRule" />
              <property role="2x4o5l" value="false" />
              <property role="2x4n5l" value="f92nru9m" />
              <node concept="2V$Bhx" id="c" role="2x4n5j">
                <property role="2V$B1T" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="39e2AT" id="9" role="39e2AY">
          <ref role="39e2AS" node="1l" resolve="check_VarVariableDeclaration_NonTypesystemRule" />
        </node>
      </node>
      <node concept="39e2AG" id="7" role="39e3Y0">
        <ref role="39e2AK" to="5m4x:hZKR1qA" resolve="typeof_VarVariableDeclaration" />
        <node concept="385nmt" id="d" role="385vvn">
          <property role="385vuF" value="typeof_VarVariableDeclaration" />
          <node concept="2$VJBW" id="f" role="385v07">
            <property role="2$VJBR" value="1236696569510" />
            <node concept="2x4n5u" id="g" role="3iCydw">
              <property role="2x4mPI" value="InferenceRule" />
              <property role="2x4o5l" value="false" />
              <property role="2x4n5l" value="ezmg6cxm" />
              <node concept="2V$Bhx" id="h" role="2x4n5j">
                <property role="2V$B1T" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="39e2AT" id="e" role="39e2AY">
          <ref role="39e2AS" node="2x" resolve="typeof_VarVariableDeclaration_InferenceRule" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="2" role="39e2AI">
      <property role="39e3Y2" value="isApplicableMethod" />
      <node concept="39e2AG" id="i" role="39e3Y0">
        <ref role="39e2AK" to="5m4x:6ZQeJ8QF890" resolve="check_VarVariableDeclaration" />
        <node concept="385nmt" id="k" role="385vvn">
          <property role="385vuF" value="check_VarVariableDeclaration" />
          <node concept="2$VJBW" id="m" role="385v07">
            <property role="2$VJBR" value="8067700594454594112" />
            <node concept="2x4n5u" id="n" role="3iCydw">
              <property role="2x4mPI" value="NonTypesystemRule" />
              <property role="2x4o5l" value="false" />
              <property role="2x4n5l" value="f92nru9m" />
              <node concept="2V$Bhx" id="o" role="2x4n5j">
                <property role="2V$B1T" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="39e2AT" id="l" role="39e2AY">
          <ref role="39e2AS" node="1p" resolve="isApplicableAndPattern" />
        </node>
      </node>
      <node concept="39e2AG" id="j" role="39e3Y0">
        <ref role="39e2AK" to="5m4x:hZKR1qA" resolve="typeof_VarVariableDeclaration" />
        <node concept="385nmt" id="p" role="385vvn">
          <property role="385vuF" value="typeof_VarVariableDeclaration" />
          <node concept="2$VJBW" id="r" role="385v07">
            <property role="2$VJBR" value="1236696569510" />
            <node concept="2x4n5u" id="s" role="3iCydw">
              <property role="2x4mPI" value="InferenceRule" />
              <property role="2x4o5l" value="false" />
              <property role="2x4n5l" value="ezmg6cxm" />
              <node concept="2V$Bhx" id="t" role="2x4n5j">
                <property role="2V$B1T" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="39e2AT" id="q" role="39e2AY">
          <ref role="39e2AS" node="2_" resolve="isApplicableAndPattern" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="3" role="39e2AI">
      <property role="39e3Y2" value="mainMethodForRule" />
      <node concept="39e2AG" id="u" role="39e3Y0">
        <ref role="39e2AK" to="5m4x:6ZQeJ8QF890" resolve="check_VarVariableDeclaration" />
        <node concept="385nmt" id="w" role="385vvn">
          <property role="385vuF" value="check_VarVariableDeclaration" />
          <node concept="2$VJBW" id="y" role="385v07">
            <property role="2$VJBR" value="8067700594454594112" />
            <node concept="2x4n5u" id="z" role="3iCydw">
              <property role="2x4mPI" value="NonTypesystemRule" />
              <property role="2x4o5l" value="false" />
              <property role="2x4n5l" value="f92nru9m" />
              <node concept="2V$Bhx" id="$" role="2x4n5j">
                <property role="2V$B1T" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="39e2AT" id="x" role="39e2AY">
          <ref role="39e2AS" node="1n" resolve="applyRule" />
        </node>
      </node>
      <node concept="39e2AG" id="v" role="39e3Y0">
        <ref role="39e2AK" to="5m4x:hZKR1qA" resolve="typeof_VarVariableDeclaration" />
        <node concept="385nmt" id="_" role="385vvn">
          <property role="385vuF" value="typeof_VarVariableDeclaration" />
          <node concept="2$VJBW" id="B" role="385v07">
            <property role="2$VJBR" value="1236696569510" />
            <node concept="2x4n5u" id="C" role="3iCydw">
              <property role="2x4mPI" value="InferenceRule" />
              <property role="2x4o5l" value="false" />
              <property role="2x4n5l" value="ezmg6cxm" />
              <node concept="2V$Bhx" id="D" role="2x4n5j">
                <property role="2V$B1T" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="39e2AT" id="A" role="39e2AY">
          <ref role="39e2AS" node="2z" resolve="applyRule" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="4" role="39e2AI">
      <property role="39e3Y2" value="typeVarDeclaration" />
      <node concept="39e2AG" id="E" role="39e3Y0">
        <ref role="39e2AK" to="5m4x:7jH_x$qzxVD" resolve="initializerType" />
        <node concept="385nmt" id="F" role="385vvn">
          <property role="385vuF" value="initializerType" />
          <node concept="2$VJBW" id="H" role="385v07">
            <property role="2$VJBR" value="8425555512443936489" />
            <node concept="2x4n5u" id="I" role="3iCydw">
              <property role="2x4mPI" value="TypeVarDeclaration" />
              <property role="2x4o5l" value="false" />
              <property role="2x4n5l" value="ezmtjgjf" />
              <node concept="2V$Bhx" id="J" role="2x4n5j">
                <property role="2V$B1T" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                <property role="2V$B1Q" value="jetbrains.mps.lang.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="39e2AT" id="G" role="39e2AY">
          <ref role="39e2AS" node="2Q" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="5" role="39e2AI">
      <property role="39e3Y2" value="descriptorClass" />
      <node concept="39e2AG" id="K" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="L" role="39e2AY">
          <ref role="39e2AS" node="M" resolve="TypesystemDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="M">
    <property role="TrG5h" value="TypesystemDescriptor" />
    <node concept="3clFbW" id="N" role="jymVt">
      <node concept="3clFbS" id="Q" role="3clF47">
        <node concept="9aQIb" id="T" role="3cqZAp">
          <node concept="3clFbS" id="V" role="9aQI4">
            <node concept="3cpWs8" id="W" role="3cqZAp">
              <node concept="3cpWsn" id="Y" role="3cpWs9">
                <property role="TrG5h" value="inferenceRule" />
                <node concept="2ShNRf" id="Z" role="33vP2m">
                  <node concept="1pGfFk" id="11" role="2ShVmc">
                    <ref role="37wK5l" node="2y" resolve="typeof_VarVariableDeclaration_InferenceRule" />
                  </node>
                </node>
                <node concept="3uibUv" id="10" role="1tU5fm">
                  <ref role="3uigEE" to="qurh:~InferenceRule_Runtime" resolve="InferenceRule_Runtime" />
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="X" role="3cqZAp">
              <node concept="2OqwBi" id="12" role="3clFbG">
                <node concept="liA8E" id="13" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="37vLTw" id="15" role="37wK5m">
                    <ref role="3cqZAo" node="Y" resolve="inferenceRule" />
                  </node>
                </node>
                <node concept="2OqwBi" id="14" role="2Oq$k0">
                  <node concept="Xjq3P" id="16" role="2Oq$k0" />
                  <node concept="2OwXpG" id="17" role="2OqNvi">
                    <ref role="2Oxat5" to="qurh:~BaseHelginsDescriptor.myInferenceRules" resolve="myInferenceRules" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="9aQIb" id="U" role="3cqZAp">
          <node concept="3clFbS" id="18" role="9aQI4">
            <node concept="3cpWs8" id="19" role="3cqZAp">
              <node concept="3cpWsn" id="1b" role="3cpWs9">
                <property role="TrG5h" value="nonTypesystemRule" />
                <node concept="3uibUv" id="1c" role="1tU5fm">
                  <ref role="3uigEE" to="qurh:~NonTypesystemRule_Runtime" resolve="NonTypesystemRule_Runtime" />
                </node>
                <node concept="2ShNRf" id="1d" role="33vP2m">
                  <node concept="1pGfFk" id="1e" role="2ShVmc">
                    <ref role="37wK5l" node="1m" resolve="check_VarVariableDeclaration_NonTypesystemRule" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="1a" role="3cqZAp">
              <node concept="2OqwBi" id="1f" role="3clFbG">
                <node concept="2OqwBi" id="1g" role="2Oq$k0">
                  <node concept="Xjq3P" id="1i" role="2Oq$k0" />
                  <node concept="2OwXpG" id="1j" role="2OqNvi">
                    <ref role="2Oxat5" to="qurh:~BaseHelginsDescriptor.myNonTypesystemRules" resolve="myNonTypesystemRules" />
                  </node>
                </node>
                <node concept="liA8E" id="1h" role="2OqNvi">
                  <ref role="37wK5l" to="33ny:~Set.add(java.lang.Object):boolean" resolve="add" />
                  <node concept="37vLTw" id="1k" role="37wK5m">
                    <ref role="3cqZAo" node="1b" resolve="nonTypesystemRule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="R" role="1B3o_S" />
      <node concept="3cqZAl" id="S" role="3clF45" />
    </node>
    <node concept="3Tm1VV" id="O" role="1B3o_S" />
    <node concept="3uibUv" id="P" role="1zkMxy">
      <ref role="3uigEE" to="qurh:~BaseHelginsDescriptor" resolve="BaseHelginsDescriptor" />
    </node>
  </node>
  <node concept="312cEu" id="1l">
    <property role="3GE5qa" value="definition.rule" />
    <property role="TrG5h" value="check_VarVariableDeclaration_NonTypesystemRule" />
    <node concept="3clFbW" id="1m" role="jymVt">
      <node concept="3clFbS" id="1u" role="3clF47" />
      <node concept="3Tm1VV" id="1v" role="1B3o_S" />
      <node concept="3cqZAl" id="1w" role="3clF45" />
    </node>
    <node concept="3clFb_" id="1n" role="jymVt">
      <property role="TrG5h" value="applyRule" />
      <node concept="3cqZAl" id="1x" role="3clF45" />
      <node concept="37vLTG" id="1y" role="3clF46">
        <property role="3TUv4t" value="true" />
        <property role="TrG5h" value="declaration" />
        <node concept="3Tqbb2" id="1B" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="1z" role="3clF46">
        <property role="TrG5h" value="typeCheckingContext" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="1C" role="1tU5fm">
          <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
        </node>
      </node>
      <node concept="37vLTG" id="1$" role="3clF46">
        <property role="TrG5h" value="status" />
        <node concept="3uibUv" id="1D" role="1tU5fm">
          <ref role="3uigEE" to="qurh:~IsApplicableStatus" resolve="IsApplicableStatus" />
        </node>
      </node>
      <node concept="3clFbS" id="1_" role="3clF47">
        <node concept="3clFbJ" id="1E" role="3cqZAp">
          <node concept="3fqX7Q" id="1F" role="3clFbw">
            <node concept="2OqwBi" id="1I" role="3fr31v">
              <node concept="2OqwBi" id="1J" role="2Oq$k0">
                <node concept="37vLTw" id="1L" role="2Oq$k0">
                  <ref role="3cqZAo" node="1y" resolve="declaration" />
                </node>
                <node concept="3TrEf2" id="1M" role="2OqNvi">
                  <ref role="3Tt5mk" to="tpee:fz3vP1I" resolve="initializer" />
                </node>
              </node>
              <node concept="3x8VRR" id="1K" role="2OqNvi" />
            </node>
          </node>
          <node concept="3clFbS" id="1G" role="3clFbx">
            <node concept="3cpWs8" id="1N" role="3cqZAp">
              <node concept="3cpWsn" id="1P" role="3cpWs9">
                <property role="TrG5h" value="errorTarget" />
                <node concept="3uibUv" id="1Q" role="1tU5fm">
                  <ref role="3uigEE" to="zavc:~MessageTarget" resolve="MessageTarget" />
                </node>
                <node concept="2ShNRf" id="1R" role="33vP2m">
                  <node concept="1pGfFk" id="1S" role="2ShVmc">
                    <ref role="37wK5l" to="zavc:~NodeMessageTarget.&lt;init&gt;()" resolve="NodeMessageTarget" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="1O" role="3cqZAp">
              <node concept="3cpWsn" id="1T" role="3cpWs9">
                <property role="TrG5h" value="_reporter_2309309498" />
                <node concept="3uibUv" id="1U" role="1tU5fm">
                  <ref role="3uigEE" to="2gg1:~IErrorReporter" resolve="IErrorReporter" />
                </node>
                <node concept="2OqwBi" id="1V" role="33vP2m">
                  <node concept="3VmV3z" id="1W" role="2Oq$k0">
                    <property role="3VnrPo" value="typeCheckingContext" />
                    <node concept="3uibUv" id="1Y" role="3Vn4Tt">
                      <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                    </node>
                  </node>
                  <node concept="liA8E" id="1X" role="2OqNvi">
                    <ref role="37wK5l" to="u78q:~TypeCheckingContext.reportTypeError(org.jetbrains.mps.openapi.model.SNode,java.lang.String,java.lang.String,java.lang.String,jetbrains.mps.errors.QuickFixProvider,jetbrains.mps.errors.messageTargets.MessageTarget):jetbrains.mps.errors.IErrorReporter" resolve="reportTypeError" />
                    <node concept="37vLTw" id="1Z" role="37wK5m">
                      <ref role="3cqZAo" node="1y" resolve="declaration" />
                    </node>
                    <node concept="Xl_RD" id="20" role="37wK5m">
                      <property role="Xl_RC" value="Initializer should not be empty" />
                    </node>
                    <node concept="Xl_RD" id="21" role="37wK5m">
                      <property role="Xl_RC" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                    </node>
                    <node concept="Xl_RD" id="22" role="37wK5m">
                      <property role="Xl_RC" value="8067700594454596069" />
                    </node>
                    <node concept="10Nm6u" id="23" role="37wK5m" />
                    <node concept="37vLTw" id="24" role="37wK5m">
                      <ref role="3cqZAo" node="1P" resolve="errorTarget" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="6wLe0" id="1H" role="lGtFl">
            <property role="6wLej" value="8067700594454596069" />
            <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="1A" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="1o" role="jymVt">
      <property role="TrG5h" value="getApplicableConcept" />
      <node concept="3bZ5Sz" id="25" role="3clF45" />
      <node concept="3clFbS" id="26" role="3clF47">
        <node concept="3cpWs6" id="28" role="3cqZAp">
          <node concept="35c_gC" id="29" role="3cqZAk">
            <ref role="35c_gD" to="dvap:hZKEzqp" resolve="VarVariableDeclaration" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="27" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="1p" role="jymVt">
      <property role="TrG5h" value="isApplicableAndPattern" />
      <node concept="37vLTG" id="2a" role="3clF46">
        <property role="TrG5h" value="argument" />
        <node concept="3Tqbb2" id="2e" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="2b" role="3clF47">
        <node concept="9aQIb" id="2f" role="3cqZAp">
          <node concept="3clFbS" id="2g" role="9aQI4">
            <node concept="3cpWs6" id="2h" role="3cqZAp">
              <node concept="2ShNRf" id="2i" role="3cqZAk">
                <node concept="1pGfFk" id="2j" role="2ShVmc">
                  <ref role="37wK5l" to="qurh:~IsApplicableStatus.&lt;init&gt;(boolean,jetbrains.mps.lang.pattern.GeneratedMatchingPattern)" resolve="IsApplicableStatus" />
                  <node concept="2OqwBi" id="2k" role="37wK5m">
                    <node concept="2OqwBi" id="2m" role="2Oq$k0">
                      <node concept="liA8E" id="2o" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SNode.getConcept():org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
                      </node>
                      <node concept="2JrnkZ" id="2p" role="2Oq$k0">
                        <node concept="37vLTw" id="2q" role="2JrQYb">
                          <ref role="3cqZAo" node="2a" resolve="argument" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="2n" role="2OqNvi">
                      <ref role="37wK5l" to="c17a:~SAbstractConcept.isSubConceptOf(org.jetbrains.mps.openapi.language.SAbstractConcept):boolean" resolve="isSubConceptOf" />
                      <node concept="1rXfSq" id="2r" role="37wK5m">
                        <ref role="37wK5l" node="1o" resolve="getApplicableConcept" />
                      </node>
                    </node>
                  </node>
                  <node concept="10Nm6u" id="2l" role="37wK5m" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="2c" role="3clF45">
        <ref role="3uigEE" to="qurh:~IsApplicableStatus" resolve="IsApplicableStatus" />
      </node>
      <node concept="3Tm1VV" id="2d" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="1q" role="jymVt">
      <property role="TrG5h" value="overrides" />
      <node concept="3clFbS" id="2s" role="3clF47">
        <node concept="3cpWs6" id="2v" role="3cqZAp">
          <node concept="3clFbT" id="2w" role="3cqZAk">
            <property role="3clFbU" value="false" />
          </node>
        </node>
      </node>
      <node concept="10P_77" id="2t" role="3clF45" />
      <node concept="3Tm1VV" id="2u" role="1B3o_S" />
    </node>
    <node concept="3uibUv" id="1r" role="EKbjA">
      <ref role="3uigEE" to="qurh:~NonTypesystemRule_Runtime" resolve="NonTypesystemRule_Runtime" />
    </node>
    <node concept="3uibUv" id="1s" role="1zkMxy">
      <ref role="3uigEE" to="qurh:~AbstractNonTypesystemRule_Runtime" resolve="AbstractNonTypesystemRule_Runtime" />
    </node>
    <node concept="3Tm1VV" id="1t" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="2x">
    <property role="3GE5qa" value="definition.rule" />
    <property role="TrG5h" value="typeof_VarVariableDeclaration_InferenceRule" />
    <node concept="3clFbW" id="2y" role="jymVt">
      <node concept="3clFbS" id="2E" role="3clF47" />
      <node concept="3Tm1VV" id="2F" role="1B3o_S" />
      <node concept="3cqZAl" id="2G" role="3clF45" />
    </node>
    <node concept="3clFb_" id="2z" role="jymVt">
      <property role="TrG5h" value="applyRule" />
      <node concept="3cqZAl" id="2H" role="3clF45" />
      <node concept="37vLTG" id="2I" role="3clF46">
        <property role="3TUv4t" value="true" />
        <property role="TrG5h" value="varVariableDeclaration" />
        <node concept="3Tqbb2" id="2N" role="1tU5fm" />
      </node>
      <node concept="37vLTG" id="2J" role="3clF46">
        <property role="TrG5h" value="typeCheckingContext" />
        <property role="3TUv4t" value="true" />
        <node concept="3uibUv" id="2O" role="1tU5fm">
          <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
        </node>
      </node>
      <node concept="37vLTG" id="2K" role="3clF46">
        <property role="TrG5h" value="status" />
        <node concept="3uibUv" id="2P" role="1tU5fm">
          <ref role="3uigEE" to="qurh:~IsApplicableStatus" resolve="IsApplicableStatus" />
        </node>
      </node>
      <node concept="3clFbS" id="2L" role="3clF47">
        <node concept="3cpWs8" id="2Q" role="3cqZAp">
          <node concept="3cpWsn" id="2T" role="3cpWs9">
            <property role="3TUv4t" value="true" />
            <property role="TrG5h" value="initializerType_typevar_8425555512443936489" />
            <node concept="2OqwBi" id="2U" role="33vP2m">
              <node concept="3VmV3z" id="2W" role="2Oq$k0">
                <property role="3VnrPo" value="typeCheckingContext" />
                <node concept="3uibUv" id="2Y" role="3Vn4Tt">
                  <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                </node>
              </node>
              <node concept="liA8E" id="2X" role="2OqNvi">
                <ref role="37wK5l" to="u78q:~TypeCheckingContext.createNewRuntimeTypesVariable():org.jetbrains.mps.openapi.model.SNode" resolve="createNewRuntimeTypesVariable" />
              </node>
            </node>
            <node concept="3Tqbb2" id="2V" role="1tU5fm" />
          </node>
        </node>
        <node concept="9aQIb" id="2R" role="3cqZAp">
          <node concept="3clFbS" id="2Z" role="9aQI4">
            <node concept="3cpWs8" id="31" role="3cqZAp">
              <node concept="3cpWsn" id="34" role="3cpWs9">
                <property role="TrG5h" value="_nodeToCheck_1029348928467" />
                <node concept="2OqwBi" id="35" role="33vP2m">
                  <node concept="37vLTw" id="37" role="2Oq$k0">
                    <ref role="3cqZAo" node="2I" resolve="varVariableDeclaration" />
                  </node>
                  <node concept="3TrEf2" id="38" role="2OqNvi">
                    <ref role="3Tt5mk" to="tpee:fz3vP1I" resolve="initializer" />
                  </node>
                  <node concept="6wLe0" id="39" role="lGtFl">
                    <property role="6wLej" value="1236696586241" />
                    <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                  </node>
                </node>
                <node concept="3uibUv" id="36" role="1tU5fm">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
            <node concept="3cpWs8" id="32" role="3cqZAp">
              <node concept="3cpWsn" id="3a" role="3cpWs9">
                <property role="TrG5h" value="_info_12389875345" />
                <node concept="3uibUv" id="3b" role="1tU5fm">
                  <ref role="3uigEE" to="u78q:~EquationInfo" resolve="EquationInfo" />
                </node>
                <node concept="2ShNRf" id="3c" role="33vP2m">
                  <node concept="1pGfFk" id="3d" role="2ShVmc">
                    <ref role="37wK5l" to="u78q:~EquationInfo.&lt;init&gt;(org.jetbrains.mps.openapi.model.SNode,java.lang.String,java.lang.String,java.lang.String,int,jetbrains.mps.errors.QuickFixProvider)" resolve="EquationInfo" />
                    <node concept="37vLTw" id="3e" role="37wK5m">
                      <ref role="3cqZAo" node="34" resolve="_nodeToCheck_1029348928467" />
                    </node>
                    <node concept="10Nm6u" id="3f" role="37wK5m" />
                    <node concept="Xl_RD" id="3g" role="37wK5m">
                      <property role="Xl_RC" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                    </node>
                    <node concept="Xl_RD" id="3h" role="37wK5m">
                      <property role="Xl_RC" value="1236696586241" />
                    </node>
                    <node concept="3cmrfG" id="3i" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="10Nm6u" id="3j" role="37wK5m" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="33" role="3cqZAp">
              <node concept="1DoJHT" id="3k" role="3clFbG">
                <property role="1Dpdpm" value="createEquation" />
                <node concept="10QFUN" id="3l" role="1EOqxR">
                  <node concept="3uibUv" id="3q" role="10QFUM">
                    <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                  </node>
                  <node concept="2OqwBi" id="3r" role="10QFUP">
                    <node concept="3VmV3z" id="3s" role="2Oq$k0">
                      <property role="3VnrPo" value="typeCheckingContext" />
                      <node concept="3uibUv" id="3u" role="3Vn4Tt">
                        <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                      </node>
                    </node>
                    <node concept="liA8E" id="3t" role="2OqNvi">
                      <ref role="37wK5l" to="u78q:~TypeCheckingContext.getRepresentative(org.jetbrains.mps.openapi.model.SNode):org.jetbrains.mps.openapi.model.SNode" resolve="getRepresentative" />
                      <node concept="37vLTw" id="3v" role="37wK5m">
                        <ref role="3cqZAo" node="2T" resolve="initializerType_typevar_8425555512443936489" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="10QFUN" id="3m" role="1EOqxR">
                  <node concept="3uibUv" id="3w" role="10QFUM">
                    <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                  </node>
                  <node concept="2OqwBi" id="3x" role="10QFUP">
                    <node concept="3VmV3z" id="3y" role="2Oq$k0">
                      <property role="3VnrPo" value="typeCheckingContext" />
                      <node concept="3uibUv" id="3_" role="3Vn4Tt">
                        <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                      </node>
                    </node>
                    <node concept="liA8E" id="3z" role="2OqNvi">
                      <ref role="37wK5l" to="u78q:~TypeCheckingContext.typeOf(org.jetbrains.mps.openapi.model.SNode,java.lang.String,java.lang.String,boolean):org.jetbrains.mps.openapi.model.SNode" resolve="typeOf" />
                      <node concept="3VmV3z" id="3A" role="37wK5m">
                        <property role="3VnrPo" value="_nodeToCheck_1029348928467" />
                        <node concept="3uibUv" id="3E" role="3Vn4Tt">
                          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                        </node>
                      </node>
                      <node concept="Xl_RD" id="3B" role="37wK5m">
                        <property role="Xl_RC" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                      </node>
                      <node concept="Xl_RD" id="3C" role="37wK5m">
                        <property role="Xl_RC" value="1236696598890" />
                      </node>
                      <node concept="3clFbT" id="3D" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                    <node concept="6wLe0" id="3$" role="lGtFl">
                      <property role="6wLej" value="1236696598890" />
                      <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                    </node>
                  </node>
                </node>
                <node concept="37vLTw" id="3n" role="1EOqxR">
                  <ref role="3cqZAo" node="3a" resolve="_info_12389875345" />
                </node>
                <node concept="3cqZAl" id="3o" role="1Ez5kq" />
                <node concept="3VmV3z" id="3p" role="1EMhIo">
                  <property role="3VnrPo" value="typeCheckingContext" />
                  <node concept="3uibUv" id="3F" role="3Vn4Tt">
                    <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="6wLe0" id="30" role="lGtFl">
            <property role="6wLej" value="1236696586241" />
            <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
          </node>
        </node>
        <node concept="9aQIb" id="2S" role="3cqZAp">
          <node concept="3clFbS" id="3G" role="9aQI4">
            <node concept="3cpWs8" id="3I" role="3cqZAp">
              <node concept="3cpWsn" id="3K" role="3cpWs9">
                <property role="3TUv4t" value="true" />
                <property role="TrG5h" value="_concreteInitializerType" />
                <node concept="3uibUv" id="3L" role="1tU5fm">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
                <node concept="2OqwBi" id="3M" role="33vP2m">
                  <node concept="3VmV3z" id="3N" role="2Oq$k0">
                    <property role="3VnrPo" value="typeCheckingContext" />
                    <node concept="3uibUv" id="3P" role="3Vn4Tt">
                      <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                    </node>
                  </node>
                  <node concept="liA8E" id="3O" role="2OqNvi">
                    <ref role="37wK5l" to="u78q:~TypeCheckingContext.getRepresentative(org.jetbrains.mps.openapi.model.SNode):org.jetbrains.mps.openapi.model.SNode" resolve="getRepresentative" />
                    <node concept="37vLTw" id="3Q" role="37wK5m">
                      <ref role="3cqZAo" node="2T" resolve="initializerType_typevar_8425555512443936489" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="3J" role="3cqZAp">
              <node concept="2OqwBi" id="3R" role="3clFbG">
                <node concept="3VmV3z" id="3S" role="2Oq$k0">
                  <property role="3VnrPo" value="typeCheckingContext" />
                  <node concept="3uibUv" id="3U" role="3Vn4Tt">
                    <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                  </node>
                </node>
                <node concept="liA8E" id="3T" role="2OqNvi">
                  <ref role="37wK5l" to="u78q:~TypeCheckingContext.whenConcrete(org.jetbrains.mps.openapi.model.SNode,java.lang.Runnable,java.lang.String,java.lang.String,boolean,boolean):void" resolve="whenConcrete" />
                  <node concept="37vLTw" id="3V" role="37wK5m">
                    <ref role="3cqZAo" node="3K" resolve="_concreteInitializerType" />
                  </node>
                  <node concept="2ShNRf" id="3W" role="37wK5m">
                    <node concept="YeOm9" id="41" role="2ShVmc">
                      <node concept="1Y3b0j" id="42" role="YeSDq">
                        <ref role="1Y3XeK" to="wyt6:~Runnable" resolve="Runnable" />
                        <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                        <node concept="3clFb_" id="43" role="jymVt">
                          <property role="TrG5h" value="run" />
                          <node concept="3Tm1VV" id="45" role="1B3o_S" />
                          <node concept="3cqZAl" id="46" role="3clF45" />
                          <node concept="3clFbS" id="47" role="3clF47">
                            <node concept="3cpWs8" id="48" role="3cqZAp">
                              <node concept="3cpWsn" id="4b" role="3cpWs9">
                                <property role="TrG5h" value="concreteInitializerType" />
                                <node concept="3Tqbb2" id="4c" role="1tU5fm">
                                  <ref role="ehGHo" to="tpee:fz3vP1H" resolve="Type" />
                                </node>
                                <node concept="1PxgMI" id="4d" role="33vP2m">
                                  <node concept="2OqwBi" id="4e" role="1m5AlR">
                                    <node concept="3VmV3z" id="4g" role="2Oq$k0">
                                      <property role="3VnrPo" value="typeCheckingContext" />
                                      <node concept="3uibUv" id="4i" role="3Vn4Tt">
                                        <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                                      </node>
                                    </node>
                                    <node concept="liA8E" id="4h" role="2OqNvi">
                                      <ref role="37wK5l" to="u78q:~TypeCheckingContext.getExpandedNode(org.jetbrains.mps.openapi.model.SNode):org.jetbrains.mps.openapi.model.SNode" resolve="getExpandedNode" />
                                      <node concept="3VmV3z" id="4j" role="37wK5m">
                                        <property role="3VnrPo" value="_concreteInitializerType" />
                                        <node concept="3uibUv" id="4k" role="3Vn4Tt">
                                          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="chp4Y" id="4f" role="3oSUPX">
                                    <ref role="cht4Q" to="tpee:fz3vP1H" resolve="Type" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3clFbF" id="49" role="3cqZAp">
                              <node concept="37vLTI" id="4l" role="3clFbG">
                                <node concept="37vLTw" id="4m" role="37vLTJ">
                                  <ref role="3cqZAo" node="4b" resolve="concreteInitializerType" />
                                </node>
                                <node concept="2YIFZM" id="4n" role="37vLTx">
                                  <ref role="1Pybhc" to="tp2g:hv18zCR" resolve="ClassifierTypeUtil" />
                                  <ref role="37wK5l" to="tp2g:hwak6Ex" resolve="copyTypeRecursively" />
                                  <node concept="2YIFZM" id="4o" role="37wK5m">
                                    <ref role="1Pybhc" to="tp2g:hv18zCR" resolve="ClassifierTypeUtil" />
                                    <ref role="37wK5l" to="tp2g:hv18AMC" resolve="getTypeCoercedToClassifierType" />
                                    <node concept="37vLTw" id="4p" role="37wK5m">
                                      <ref role="3cqZAo" node="4b" resolve="concreteInitializerType" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="9aQIb" id="4a" role="3cqZAp">
                              <node concept="3clFbS" id="4q" role="9aQI4">
                                <node concept="3cpWs8" id="4s" role="3cqZAp">
                                  <node concept="3cpWsn" id="4v" role="3cpWs9">
                                    <property role="TrG5h" value="_nodeToCheck_1029348928467" />
                                    <node concept="37vLTw" id="4w" role="33vP2m">
                                      <ref role="3cqZAo" node="2I" resolve="varVariableDeclaration" />
                                      <node concept="6wLe0" id="4y" role="lGtFl">
                                        <property role="6wLej" value="8425555512443936533" />
                                        <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                                      </node>
                                    </node>
                                    <node concept="3uibUv" id="4x" role="1tU5fm">
                                      <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="3cpWs8" id="4t" role="3cqZAp">
                                  <node concept="3cpWsn" id="4z" role="3cpWs9">
                                    <property role="TrG5h" value="_info_12389875345" />
                                    <node concept="3uibUv" id="4$" role="1tU5fm">
                                      <ref role="3uigEE" to="u78q:~EquationInfo" resolve="EquationInfo" />
                                    </node>
                                    <node concept="2ShNRf" id="4_" role="33vP2m">
                                      <node concept="1pGfFk" id="4A" role="2ShVmc">
                                        <ref role="37wK5l" to="u78q:~EquationInfo.&lt;init&gt;(org.jetbrains.mps.openapi.model.SNode,java.lang.String,java.lang.String,java.lang.String,int,jetbrains.mps.errors.QuickFixProvider)" resolve="EquationInfo" />
                                        <node concept="37vLTw" id="4B" role="37wK5m">
                                          <ref role="3cqZAo" node="4v" resolve="_nodeToCheck_1029348928467" />
                                        </node>
                                        <node concept="10Nm6u" id="4C" role="37wK5m" />
                                        <node concept="Xl_RD" id="4D" role="37wK5m">
                                          <property role="Xl_RC" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                                        </node>
                                        <node concept="Xl_RD" id="4E" role="37wK5m">
                                          <property role="Xl_RC" value="8425555512443936533" />
                                        </node>
                                        <node concept="3cmrfG" id="4F" role="37wK5m">
                                          <property role="3cmrfH" value="0" />
                                        </node>
                                        <node concept="10Nm6u" id="4G" role="37wK5m" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="3clFbF" id="4u" role="3cqZAp">
                                  <node concept="1DoJHT" id="4H" role="3clFbG">
                                    <property role="1Dpdpm" value="createEquation" />
                                    <node concept="10QFUN" id="4I" role="1EOqxR">
                                      <node concept="3uibUv" id="4N" role="10QFUM">
                                        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                      </node>
                                      <node concept="2OqwBi" id="4O" role="10QFUP">
                                        <node concept="3VmV3z" id="4P" role="2Oq$k0">
                                          <property role="3VnrPo" value="typeCheckingContext" />
                                          <node concept="3uibUv" id="4S" role="3Vn4Tt">
                                            <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                                          </node>
                                        </node>
                                        <node concept="liA8E" id="4Q" role="2OqNvi">
                                          <ref role="37wK5l" to="u78q:~TypeCheckingContext.typeOf(org.jetbrains.mps.openapi.model.SNode,java.lang.String,java.lang.String,boolean):org.jetbrains.mps.openapi.model.SNode" resolve="typeOf" />
                                          <node concept="3VmV3z" id="4T" role="37wK5m">
                                            <property role="3VnrPo" value="_nodeToCheck_1029348928467" />
                                            <node concept="3uibUv" id="4X" role="3Vn4Tt">
                                              <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                            </node>
                                          </node>
                                          <node concept="Xl_RD" id="4U" role="37wK5m">
                                            <property role="Xl_RC" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                                          </node>
                                          <node concept="Xl_RD" id="4V" role="37wK5m">
                                            <property role="Xl_RC" value="8425555512443936528" />
                                          </node>
                                          <node concept="3clFbT" id="4W" role="37wK5m">
                                            <property role="3clFbU" value="true" />
                                          </node>
                                        </node>
                                        <node concept="6wLe0" id="4R" role="lGtFl">
                                          <property role="6wLej" value="8425555512443936528" />
                                          <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="10QFUN" id="4J" role="1EOqxR">
                                      <node concept="3uibUv" id="4Y" role="10QFUM">
                                        <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                      </node>
                                      <node concept="37vLTw" id="4Z" role="10QFUP">
                                        <ref role="3cqZAo" node="4b" resolve="concreteInitializerType" />
                                      </node>
                                    </node>
                                    <node concept="37vLTw" id="4K" role="1EOqxR">
                                      <ref role="3cqZAo" node="4z" resolve="_info_12389875345" />
                                    </node>
                                    <node concept="3cqZAl" id="4L" role="1Ez5kq" />
                                    <node concept="3VmV3z" id="4M" role="1EMhIo">
                                      <property role="3VnrPo" value="typeCheckingContext" />
                                      <node concept="3uibUv" id="50" role="3Vn4Tt">
                                        <ref role="3uigEE" to="u78q:~TypeCheckingContext" resolve="TypeCheckingContext" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="6wLe0" id="4r" role="lGtFl">
                                <property role="6wLej" value="8425555512443936533" />
                                <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3Tm1VV" id="44" role="1B3o_S" />
                      </node>
                    </node>
                  </node>
                  <node concept="Xl_RD" id="3X" role="37wK5m">
                    <property role="Xl_RC" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
                  </node>
                  <node concept="Xl_RD" id="3Y" role="37wK5m">
                    <property role="Xl_RC" value="8425555512443936496" />
                  </node>
                  <node concept="3clFbT" id="3Z" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                  <node concept="3clFbT" id="40" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="6wLe0" id="3H" role="lGtFl">
            <property role="6wLej" value="8425555512443936496" />
            <property role="6wLeW" value="r:376aaabb-efff-403a-9afa-fc63fa67c6b3(jetbrains.mps.baseLanguage.varVariable.typesystem)" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2M" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2$" role="jymVt">
      <property role="TrG5h" value="getApplicableConcept" />
      <node concept="3bZ5Sz" id="51" role="3clF45" />
      <node concept="3clFbS" id="52" role="3clF47">
        <node concept="3cpWs6" id="54" role="3cqZAp">
          <node concept="35c_gC" id="55" role="3cqZAk">
            <ref role="35c_gD" to="dvap:hZKEzqp" resolve="VarVariableDeclaration" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="53" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2_" role="jymVt">
      <property role="TrG5h" value="isApplicableAndPattern" />
      <node concept="37vLTG" id="56" role="3clF46">
        <property role="TrG5h" value="argument" />
        <node concept="3Tqbb2" id="5a" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="57" role="3clF47">
        <node concept="9aQIb" id="5b" role="3cqZAp">
          <node concept="3clFbS" id="5c" role="9aQI4">
            <node concept="3cpWs6" id="5d" role="3cqZAp">
              <node concept="2ShNRf" id="5e" role="3cqZAk">
                <node concept="1pGfFk" id="5f" role="2ShVmc">
                  <ref role="37wK5l" to="qurh:~IsApplicableStatus.&lt;init&gt;(boolean,jetbrains.mps.lang.pattern.GeneratedMatchingPattern)" resolve="IsApplicableStatus" />
                  <node concept="2OqwBi" id="5g" role="37wK5m">
                    <node concept="2OqwBi" id="5i" role="2Oq$k0">
                      <node concept="liA8E" id="5k" role="2OqNvi">
                        <ref role="37wK5l" to="mhbf:~SNode.getConcept():org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
                      </node>
                      <node concept="2JrnkZ" id="5l" role="2Oq$k0">
                        <node concept="37vLTw" id="5m" role="2JrQYb">
                          <ref role="3cqZAo" node="56" resolve="argument" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="5j" role="2OqNvi">
                      <ref role="37wK5l" to="c17a:~SAbstractConcept.isSubConceptOf(org.jetbrains.mps.openapi.language.SAbstractConcept):boolean" resolve="isSubConceptOf" />
                      <node concept="1rXfSq" id="5n" role="37wK5m">
                        <ref role="37wK5l" node="2$" resolve="getApplicableConcept" />
                      </node>
                    </node>
                  </node>
                  <node concept="10Nm6u" id="5h" role="37wK5m" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="58" role="3clF45">
        <ref role="3uigEE" to="qurh:~IsApplicableStatus" resolve="IsApplicableStatus" />
      </node>
      <node concept="3Tm1VV" id="59" role="1B3o_S" />
    </node>
    <node concept="3clFb_" id="2A" role="jymVt">
      <property role="TrG5h" value="overrides" />
      <node concept="3clFbS" id="5o" role="3clF47">
        <node concept="3cpWs6" id="5r" role="3cqZAp">
          <node concept="3clFbT" id="5s" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="10P_77" id="5p" role="3clF45" />
      <node concept="3Tm1VV" id="5q" role="1B3o_S" />
    </node>
    <node concept="3uibUv" id="2B" role="EKbjA">
      <ref role="3uigEE" to="qurh:~InferenceRule_Runtime" resolve="InferenceRule_Runtime" />
    </node>
    <node concept="3uibUv" id="2C" role="1zkMxy">
      <ref role="3uigEE" to="qurh:~AbstractInferenceRule_Runtime" resolve="AbstractInferenceRule_Runtime" />
    </node>
    <node concept="3Tm1VV" id="2D" role="1B3o_S" />
  </node>
</model>

