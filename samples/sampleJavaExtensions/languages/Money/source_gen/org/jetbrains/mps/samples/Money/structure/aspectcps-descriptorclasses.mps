<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:ff8f6bf(checkpoints/org.jetbrains.mps.samples.Money.structure@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <languages />
  <imports>
    <import index="v0h4" ref="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)" />
    <import index="ksn4" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.lang.smodel(MPS.Core/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="e8bb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.ids(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="vndm" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.language(MPS.Core/)" />
    <import index="bzg8" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.impl(MPS.Core/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
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
      <concept id="1083260308424" name="jetbrains.mps.baseLanguage.structure.EnumConstantReference" flags="nn" index="Rm8GO">
        <reference id="1083260308426" name="enumConstantDeclaration" index="Rm8GQ" />
        <reference id="1144432896254" name="enumClass" index="1Px2BO" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070462154015" name="jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration" flags="ig" index="Wx3nA">
        <property id="6468716278899126575" name="isVolatile" index="2dlcS1" />
        <property id="6468716278899125786" name="isTransient" index="2dld4O" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg">
        <property id="8606350594693632173" name="isTransient" index="eg7rD" />
        <property id="1240249534625" name="isVolatile" index="34CwA1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1221565133444" name="isFinal" index="1EXbeo" />
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
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025416" name="jetbrains.mps.baseLanguage.structure.MethodDeclaration" flags="ng" index="1rXfSm">
        <property id="8355037393041754995" name="isNative" index="2aFKle" />
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
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1163670490218" name="jetbrains.mps.baseLanguage.structure.SwitchStatement" flags="nn" index="3KaCP$">
        <child id="1163670592366" name="defaultBlock" index="3Kb1Dw" />
        <child id="1163670766145" name="expression" index="3KbGdf" />
        <child id="1163670772911" name="case" index="3KbHQx" />
      </concept>
      <concept id="1163670641947" name="jetbrains.mps.baseLanguage.structure.SwitchCase" flags="ng" index="3KbdKl">
        <child id="1163670677455" name="expression" index="3Kbmr1" />
        <child id="1163670683720" name="body" index="3Kbo56" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1116615150612" name="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" flags="nn" index="3VsKOn">
        <reference id="1116615189566" name="classifier" index="3VsUkX" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE">
        <child id="3864140621129713349" name="labels" index="39e2AI" />
      </concept>
      <concept id="3864140621129713351" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry" flags="nn" index="39e2AG">
        <property id="5843998055530255671" name="isNewRoot" index="2mV_xN" />
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
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="ConceptPresentationAspectImpl" />
    <node concept="3uibUv" id="1" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~ConceptPresentationAspectBase" resolve="ConceptPresentationAspectBase" />
    </node>
    <node concept="312cEg" id="2" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_ConvertTo" />
      <node concept="3uibUv" id="f" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="g" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_CurrencyDefTable" />
      <node concept="3uibUv" id="h" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="i" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="4" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_CurrencyUnit" />
      <node concept="3uibUv" id="j" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="k" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_CurrentStockPrice" />
      <node concept="3uibUv" id="l" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="m" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_GetAmount" />
      <node concept="3uibUv" id="n" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="o" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="7" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_GetCurrency" />
      <node concept="3uibUv" id="p" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="q" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="8" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_MoneyLiteral" />
      <node concept="3uibUv" id="r" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="s" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="9" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_MoneyType" />
      <node concept="3uibUv" id="t" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="u" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="a" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_MovingAverage" />
      <node concept="3uibUv" id="v" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="w" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="b" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_StockSymbol" />
      <node concept="3uibUv" id="x" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="y" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="c" role="1B3o_S" />
    <node concept="2tJIrI" id="d" role="jymVt" />
    <node concept="3clFb_" id="e" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="z" role="1B3o_S" />
      <node concept="37vLTG" id="$" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="D" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="3clFbS" id="_" role="3clF47">
        <node concept="3cpWs8" id="E" role="3cqZAp">
          <node concept="3cpWsn" id="H" role="3cpWs9">
            <property role="TrG5h" value="structureDescriptor" />
            <node concept="3uibUv" id="I" role="1tU5fm">
              <ref role="3uigEE" node="7m" resolve="StructureAspectDescriptor" />
            </node>
            <node concept="10QFUN" id="J" role="33vP2m">
              <node concept="3uibUv" id="K" role="10QFUM">
                <ref role="3uigEE" node="7m" resolve="StructureAspectDescriptor" />
              </node>
              <node concept="2OqwBi" id="L" role="10QFUP">
                <node concept="37vLTw" id="M" role="2Oq$k0">
                  <ref role="3cqZAo" to="ze1i:~ConceptPresentationAspectBase.myLanguageRuntime" resolve="myLanguageRuntime" />
                </node>
                <node concept="liA8E" id="N" role="2OqNvi">
                  <ref role="37wK5l" to="vndm:~LanguageRuntime.getAspect(java.lang.Class):jetbrains.mps.smodel.runtime.ILanguageAspect" resolve="getAspect" />
                  <node concept="3VsKOn" id="O" role="37wK5m">
                    <ref role="3VsUkX" to="ze1i:~StructureAspectDescriptor" resolve="StructureAspectDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="F" role="3cqZAp">
          <node concept="2OqwBi" id="P" role="3KbGdf">
            <node concept="37vLTw" id="10" role="2Oq$k0">
              <ref role="3cqZAo" node="H" resolve="structureDescriptor" />
            </node>
            <node concept="liA8E" id="11" role="2OqNvi">
              <ref role="37wK5l" node="7F" resolve="internalIndex" />
              <node concept="37vLTw" id="12" role="37wK5m">
                <ref role="3cqZAo" node="$" resolve="c" />
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="Q" role="3KbHQx">
            <node concept="3clFbS" id="13" role="3Kbo56">
              <node concept="3clFbJ" id="15" role="3cqZAp">
                <node concept="3clFbS" id="17" role="3clFbx">
                  <node concept="3cpWs8" id="19" role="3cqZAp">
                    <node concept="3cpWsn" id="1c" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1d" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1e" role="33vP2m">
                        <node concept="1pGfFk" id="1f" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1a" role="3cqZAp">
                    <node concept="2OqwBi" id="1g" role="3clFbG">
                      <node concept="37vLTw" id="1h" role="2Oq$k0">
                        <ref role="3cqZAo" node="1c" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1i" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="1j" role="37wK5m">
                          <property role="Xl_RC" value="convert to" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1b" role="3cqZAp">
                    <node concept="37vLTI" id="1k" role="3clFbG">
                      <node concept="2OqwBi" id="1l" role="37vLTx">
                        <node concept="37vLTw" id="1n" role="2Oq$k0">
                          <ref role="3cqZAo" node="1c" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1o" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1m" role="37vLTJ">
                        <ref role="3cqZAo" node="2" resolve="props_ConvertTo" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="18" role="3clFbw">
                  <node concept="10Nm6u" id="1p" role="3uHU7w" />
                  <node concept="37vLTw" id="1q" role="3uHU7B">
                    <ref role="3cqZAo" node="2" resolve="props_ConvertTo" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="16" role="3cqZAp">
                <node concept="37vLTw" id="1r" role="3cqZAk">
                  <ref role="3cqZAo" node="2" resolve="props_ConvertTo" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="14" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="56" resolve="ConvertTo" />
            </node>
          </node>
          <node concept="3KbdKl" id="R" role="3KbHQx">
            <node concept="3clFbS" id="1s" role="3Kbo56">
              <node concept="3clFbJ" id="1u" role="3cqZAp">
                <node concept="3clFbS" id="1w" role="3clFbx">
                  <node concept="3cpWs8" id="1y" role="3cqZAp">
                    <node concept="3cpWsn" id="1_" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1A" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1B" role="33vP2m">
                        <node concept="1pGfFk" id="1C" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1z" role="3cqZAp">
                    <node concept="2OqwBi" id="1D" role="3clFbG">
                      <node concept="37vLTw" id="1E" role="2Oq$k0">
                        <ref role="3cqZAo" node="1_" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1F" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="1G" role="37wK5m">
                          <property role="Xl_RC" value="CurrencyDefTable" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1$" role="3cqZAp">
                    <node concept="37vLTI" id="1H" role="3clFbG">
                      <node concept="2OqwBi" id="1I" role="37vLTx">
                        <node concept="37vLTw" id="1K" role="2Oq$k0">
                          <ref role="3cqZAo" node="1_" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1L" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1J" role="37vLTJ">
                        <ref role="3cqZAo" node="3" resolve="props_CurrencyDefTable" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1x" role="3clFbw">
                  <node concept="10Nm6u" id="1M" role="3uHU7w" />
                  <node concept="37vLTw" id="1N" role="3uHU7B">
                    <ref role="3cqZAo" node="3" resolve="props_CurrencyDefTable" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1v" role="3cqZAp">
                <node concept="37vLTw" id="1O" role="3cqZAk">
                  <ref role="3cqZAo" node="3" resolve="props_CurrencyDefTable" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1t" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="57" resolve="CurrencyDefTable" />
            </node>
          </node>
          <node concept="3KbdKl" id="S" role="3KbHQx">
            <node concept="3clFbS" id="1P" role="3Kbo56">
              <node concept="3clFbJ" id="1R" role="3cqZAp">
                <node concept="3clFbS" id="1T" role="3clFbx">
                  <node concept="3cpWs8" id="1V" role="3cqZAp">
                    <node concept="3cpWsn" id="1Y" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1Z" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="20" role="33vP2m">
                        <node concept="1pGfFk" id="21" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1W" role="3cqZAp">
                    <node concept="2OqwBi" id="22" role="3clFbG">
                      <node concept="37vLTw" id="23" role="2Oq$k0">
                        <ref role="3cqZAo" node="1Y" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="24" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1X" role="3cqZAp">
                    <node concept="37vLTI" id="25" role="3clFbG">
                      <node concept="2OqwBi" id="26" role="37vLTx">
                        <node concept="37vLTw" id="28" role="2Oq$k0">
                          <ref role="3cqZAo" node="1Y" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="29" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="27" role="37vLTJ">
                        <ref role="3cqZAo" node="4" resolve="props_CurrencyUnit" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1U" role="3clFbw">
                  <node concept="10Nm6u" id="2a" role="3uHU7w" />
                  <node concept="37vLTw" id="2b" role="3uHU7B">
                    <ref role="3cqZAo" node="4" resolve="props_CurrencyUnit" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1S" role="3cqZAp">
                <node concept="37vLTw" id="2c" role="3cqZAk">
                  <ref role="3cqZAo" node="4" resolve="props_CurrencyUnit" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1Q" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="58" resolve="CurrencyUnit" />
            </node>
          </node>
          <node concept="3KbdKl" id="T" role="3KbHQx">
            <node concept="3clFbS" id="2d" role="3Kbo56">
              <node concept="3clFbJ" id="2f" role="3cqZAp">
                <node concept="3clFbS" id="2h" role="3clFbx">
                  <node concept="3cpWs8" id="2j" role="3cqZAp">
                    <node concept="3cpWsn" id="2m" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="2n" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="2o" role="33vP2m">
                        <node concept="1pGfFk" id="2p" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2k" role="3cqZAp">
                    <node concept="2OqwBi" id="2q" role="3clFbG">
                      <node concept="37vLTw" id="2r" role="2Oq$k0">
                        <ref role="3cqZAo" node="2m" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2s" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="2t" role="37wK5m">
                          <property role="Xl_RC" value="current stock price" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2l" role="3cqZAp">
                    <node concept="37vLTI" id="2u" role="3clFbG">
                      <node concept="2OqwBi" id="2v" role="37vLTx">
                        <node concept="37vLTw" id="2x" role="2Oq$k0">
                          <ref role="3cqZAo" node="2m" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="2y" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="2w" role="37vLTJ">
                        <ref role="3cqZAo" node="5" resolve="props_CurrentStockPrice" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2i" role="3clFbw">
                  <node concept="10Nm6u" id="2z" role="3uHU7w" />
                  <node concept="37vLTw" id="2$" role="3uHU7B">
                    <ref role="3cqZAo" node="5" resolve="props_CurrentStockPrice" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2g" role="3cqZAp">
                <node concept="37vLTw" id="2_" role="3cqZAk">
                  <ref role="3cqZAo" node="5" resolve="props_CurrentStockPrice" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="2e" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="59" resolve="CurrentStockPrice" />
            </node>
          </node>
          <node concept="3KbdKl" id="U" role="3KbHQx">
            <node concept="3clFbS" id="2A" role="3Kbo56">
              <node concept="3clFbJ" id="2C" role="3cqZAp">
                <node concept="3clFbS" id="2E" role="3clFbx">
                  <node concept="3cpWs8" id="2G" role="3cqZAp">
                    <node concept="3cpWsn" id="2J" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="2K" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="2L" role="33vP2m">
                        <node concept="1pGfFk" id="2M" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2H" role="3cqZAp">
                    <node concept="2OqwBi" id="2N" role="3clFbG">
                      <node concept="37vLTw" id="2O" role="2Oq$k0">
                        <ref role="3cqZAo" node="2J" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2P" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="2Q" role="37wK5m">
                          <property role="Xl_RC" value="amount" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2I" role="3cqZAp">
                    <node concept="37vLTI" id="2R" role="3clFbG">
                      <node concept="2OqwBi" id="2S" role="37vLTx">
                        <node concept="37vLTw" id="2U" role="2Oq$k0">
                          <ref role="3cqZAo" node="2J" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="2V" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="2T" role="37vLTJ">
                        <ref role="3cqZAo" node="6" resolve="props_GetAmount" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2F" role="3clFbw">
                  <node concept="10Nm6u" id="2W" role="3uHU7w" />
                  <node concept="37vLTw" id="2X" role="3uHU7B">
                    <ref role="3cqZAo" node="6" resolve="props_GetAmount" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2D" role="3cqZAp">
                <node concept="37vLTw" id="2Y" role="3cqZAk">
                  <ref role="3cqZAo" node="6" resolve="props_GetAmount" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="2B" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5a" resolve="GetAmount" />
            </node>
          </node>
          <node concept="3KbdKl" id="V" role="3KbHQx">
            <node concept="3clFbS" id="2Z" role="3Kbo56">
              <node concept="3clFbJ" id="31" role="3cqZAp">
                <node concept="3clFbS" id="33" role="3clFbx">
                  <node concept="3cpWs8" id="35" role="3cqZAp">
                    <node concept="3cpWsn" id="38" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="39" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="3a" role="33vP2m">
                        <node concept="1pGfFk" id="3b" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="36" role="3cqZAp">
                    <node concept="2OqwBi" id="3c" role="3clFbG">
                      <node concept="37vLTw" id="3d" role="2Oq$k0">
                        <ref role="3cqZAo" node="38" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3e" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="3f" role="37wK5m">
                          <property role="Xl_RC" value="currency" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="37" role="3cqZAp">
                    <node concept="37vLTI" id="3g" role="3clFbG">
                      <node concept="2OqwBi" id="3h" role="37vLTx">
                        <node concept="37vLTw" id="3j" role="2Oq$k0">
                          <ref role="3cqZAo" node="38" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="3k" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3i" role="37vLTJ">
                        <ref role="3cqZAo" node="7" resolve="props_GetCurrency" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="34" role="3clFbw">
                  <node concept="10Nm6u" id="3l" role="3uHU7w" />
                  <node concept="37vLTw" id="3m" role="3uHU7B">
                    <ref role="3cqZAo" node="7" resolve="props_GetCurrency" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="32" role="3cqZAp">
                <node concept="37vLTw" id="3n" role="3cqZAk">
                  <ref role="3cqZAo" node="7" resolve="props_GetCurrency" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="30" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5b" resolve="GetCurrency" />
            </node>
          </node>
          <node concept="3KbdKl" id="W" role="3KbHQx">
            <node concept="3clFbS" id="3o" role="3Kbo56">
              <node concept="3clFbJ" id="3q" role="3cqZAp">
                <node concept="3clFbS" id="3s" role="3clFbx">
                  <node concept="3cpWs8" id="3u" role="3cqZAp">
                    <node concept="3cpWsn" id="3x" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="3y" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="3z" role="33vP2m">
                        <node concept="1pGfFk" id="3$" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3v" role="3cqZAp">
                    <node concept="2OqwBi" id="3_" role="3clFbG">
                      <node concept="37vLTw" id="3A" role="2Oq$k0">
                        <ref role="3cqZAo" node="3x" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="3B" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="3C" role="37wK5m">
                          <property role="Xl_RC" value="money" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3w" role="3cqZAp">
                    <node concept="37vLTI" id="3D" role="3clFbG">
                      <node concept="2OqwBi" id="3E" role="37vLTx">
                        <node concept="37vLTw" id="3G" role="2Oq$k0">
                          <ref role="3cqZAo" node="3x" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="3H" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="3F" role="37vLTJ">
                        <ref role="3cqZAo" node="8" resolve="props_MoneyLiteral" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="3t" role="3clFbw">
                  <node concept="10Nm6u" id="3I" role="3uHU7w" />
                  <node concept="37vLTw" id="3J" role="3uHU7B">
                    <ref role="3cqZAo" node="8" resolve="props_MoneyLiteral" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="3r" role="3cqZAp">
                <node concept="37vLTw" id="3K" role="3cqZAk">
                  <ref role="3cqZAo" node="8" resolve="props_MoneyLiteral" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="3p" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5c" resolve="MoneyLiteral" />
            </node>
          </node>
          <node concept="3KbdKl" id="X" role="3KbHQx">
            <node concept="3clFbS" id="3L" role="3Kbo56">
              <node concept="3clFbJ" id="3N" role="3cqZAp">
                <node concept="3clFbS" id="3P" role="3clFbx">
                  <node concept="3cpWs8" id="3R" role="3cqZAp">
                    <node concept="3cpWsn" id="3U" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="3V" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="3W" role="33vP2m">
                        <node concept="1pGfFk" id="3X" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3S" role="3cqZAp">
                    <node concept="2OqwBi" id="3Y" role="3clFbG">
                      <node concept="37vLTw" id="3Z" role="2Oq$k0">
                        <ref role="3cqZAo" node="3U" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="40" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="41" role="37wK5m">
                          <property role="Xl_RC" value="Money" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="3T" role="3cqZAp">
                    <node concept="37vLTI" id="42" role="3clFbG">
                      <node concept="2OqwBi" id="43" role="37vLTx">
                        <node concept="37vLTw" id="45" role="2Oq$k0">
                          <ref role="3cqZAo" node="3U" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="46" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="44" role="37vLTJ">
                        <ref role="3cqZAo" node="9" resolve="props_MoneyType" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="3Q" role="3clFbw">
                  <node concept="10Nm6u" id="47" role="3uHU7w" />
                  <node concept="37vLTw" id="48" role="3uHU7B">
                    <ref role="3cqZAo" node="9" resolve="props_MoneyType" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="3O" role="3cqZAp">
                <node concept="37vLTw" id="49" role="3cqZAk">
                  <ref role="3cqZAo" node="9" resolve="props_MoneyType" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="3M" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5d" resolve="MoneyType" />
            </node>
          </node>
          <node concept="3KbdKl" id="Y" role="3KbHQx">
            <node concept="3clFbS" id="4a" role="3Kbo56">
              <node concept="3clFbJ" id="4c" role="3cqZAp">
                <node concept="3clFbS" id="4e" role="3clFbx">
                  <node concept="3cpWs8" id="4g" role="3cqZAp">
                    <node concept="3cpWsn" id="4j" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="4k" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="4l" role="33vP2m">
                        <node concept="1pGfFk" id="4m" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4h" role="3cqZAp">
                    <node concept="2OqwBi" id="4n" role="3clFbG">
                      <node concept="37vLTw" id="4o" role="2Oq$k0">
                        <ref role="3cqZAo" node="4j" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="4p" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="4q" role="37wK5m">
                          <property role="Xl_RC" value="moving average" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4i" role="3cqZAp">
                    <node concept="37vLTI" id="4r" role="3clFbG">
                      <node concept="2OqwBi" id="4s" role="37vLTx">
                        <node concept="37vLTw" id="4u" role="2Oq$k0">
                          <ref role="3cqZAo" node="4j" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="4v" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="4t" role="37vLTJ">
                        <ref role="3cqZAo" node="a" resolve="props_MovingAverage" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="4f" role="3clFbw">
                  <node concept="10Nm6u" id="4w" role="3uHU7w" />
                  <node concept="37vLTw" id="4x" role="3uHU7B">
                    <ref role="3cqZAo" node="a" resolve="props_MovingAverage" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="4d" role="3cqZAp">
                <node concept="37vLTw" id="4y" role="3cqZAk">
                  <ref role="3cqZAo" node="a" resolve="props_MovingAverage" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="4b" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5e" resolve="MovingAverage" />
            </node>
          </node>
          <node concept="3KbdKl" id="Z" role="3KbHQx">
            <node concept="3clFbS" id="4z" role="3Kbo56">
              <node concept="3clFbJ" id="4_" role="3cqZAp">
                <node concept="3clFbS" id="4B" role="3clFbx">
                  <node concept="3cpWs8" id="4D" role="3cqZAp">
                    <node concept="3cpWsn" id="4G" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="4H" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="4I" role="33vP2m">
                        <node concept="1pGfFk" id="4J" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4E" role="3cqZAp">
                    <node concept="2OqwBi" id="4K" role="3clFbG">
                      <node concept="37vLTw" id="4L" role="2Oq$k0">
                        <ref role="3cqZAo" node="4G" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="4M" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="4N" role="37wK5m">
                          <property role="Xl_RC" value="symbol" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="4F" role="3cqZAp">
                    <node concept="37vLTI" id="4O" role="3clFbG">
                      <node concept="2OqwBi" id="4P" role="37vLTx">
                        <node concept="37vLTw" id="4R" role="2Oq$k0">
                          <ref role="3cqZAo" node="4G" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="4S" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="4Q" role="37vLTJ">
                        <ref role="3cqZAo" node="b" resolve="props_StockSymbol" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="4C" role="3clFbw">
                  <node concept="10Nm6u" id="4T" role="3uHU7w" />
                  <node concept="37vLTw" id="4U" role="3uHU7B">
                    <ref role="3cqZAo" node="b" resolve="props_StockSymbol" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="4A" role="3cqZAp">
                <node concept="37vLTw" id="4V" role="3cqZAk">
                  <ref role="3cqZAo" node="b" resolve="props_StockSymbol" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="4$" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5f" resolve="StockSymbol" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="G" role="3cqZAp">
          <node concept="10Nm6u" id="4W" role="3cqZAk" />
        </node>
      </node>
      <node concept="3uibUv" id="A" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="2AHcQZ" id="B" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="C" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="4X">
    <node concept="39e2AJ" id="4Y" role="39e2AI">
      <property role="39e3Y2" value="ConceptPresentationAspectClass" />
      <node concept="39e2AG" id="50" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="51" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="ConceptPresentationAspectImpl" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="4Z" role="39e2AI">
      <property role="39e3Y2" value="StructureAspectDescriptorCons" />
      <node concept="39e2AG" id="52" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="53" role="39e2AY">
          <ref role="39e2AS" node="7_" resolve="StructureAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="54">
    <property role="TrG5h" value="LanguageConceptSwitch" />
    <property role="1EXbeo" value="true" />
    <node concept="312cEg" id="55" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="5n" role="1B3o_S" />
      <node concept="3uibUv" id="5o" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~LanguageConceptIndex" resolve="LanguageConceptIndex" />
      </node>
    </node>
    <node concept="Wx3nA" id="56" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ConvertTo" />
      <node concept="3Tm1VV" id="5p" role="1B3o_S" />
      <node concept="10Oyi0" id="5q" role="1tU5fm" />
      <node concept="3cmrfG" id="5r" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="Wx3nA" id="57" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="CurrencyDefTable" />
      <node concept="3Tm1VV" id="5s" role="1B3o_S" />
      <node concept="10Oyi0" id="5t" role="1tU5fm" />
      <node concept="3cmrfG" id="5u" role="33vP2m">
        <property role="3cmrfH" value="1" />
      </node>
    </node>
    <node concept="Wx3nA" id="58" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="CurrencyUnit" />
      <node concept="3Tm1VV" id="5v" role="1B3o_S" />
      <node concept="10Oyi0" id="5w" role="1tU5fm" />
      <node concept="3cmrfG" id="5x" role="33vP2m">
        <property role="3cmrfH" value="2" />
      </node>
    </node>
    <node concept="Wx3nA" id="59" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="CurrentStockPrice" />
      <node concept="3Tm1VV" id="5y" role="1B3o_S" />
      <node concept="10Oyi0" id="5z" role="1tU5fm" />
      <node concept="3cmrfG" id="5$" role="33vP2m">
        <property role="3cmrfH" value="3" />
      </node>
    </node>
    <node concept="Wx3nA" id="5a" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="GetAmount" />
      <node concept="3Tm1VV" id="5_" role="1B3o_S" />
      <node concept="10Oyi0" id="5A" role="1tU5fm" />
      <node concept="3cmrfG" id="5B" role="33vP2m">
        <property role="3cmrfH" value="4" />
      </node>
    </node>
    <node concept="Wx3nA" id="5b" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="GetCurrency" />
      <node concept="3Tm1VV" id="5C" role="1B3o_S" />
      <node concept="10Oyi0" id="5D" role="1tU5fm" />
      <node concept="3cmrfG" id="5E" role="33vP2m">
        <property role="3cmrfH" value="5" />
      </node>
    </node>
    <node concept="Wx3nA" id="5c" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="MoneyLiteral" />
      <node concept="3Tm1VV" id="5F" role="1B3o_S" />
      <node concept="10Oyi0" id="5G" role="1tU5fm" />
      <node concept="3cmrfG" id="5H" role="33vP2m">
        <property role="3cmrfH" value="6" />
      </node>
    </node>
    <node concept="Wx3nA" id="5d" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="MoneyType" />
      <node concept="3Tm1VV" id="5I" role="1B3o_S" />
      <node concept="10Oyi0" id="5J" role="1tU5fm" />
      <node concept="3cmrfG" id="5K" role="33vP2m">
        <property role="3cmrfH" value="7" />
      </node>
    </node>
    <node concept="Wx3nA" id="5e" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="MovingAverage" />
      <node concept="3Tm1VV" id="5L" role="1B3o_S" />
      <node concept="10Oyi0" id="5M" role="1tU5fm" />
      <node concept="3cmrfG" id="5N" role="33vP2m">
        <property role="3cmrfH" value="8" />
      </node>
    </node>
    <node concept="Wx3nA" id="5f" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="StockSymbol" />
      <node concept="3Tm1VV" id="5O" role="1B3o_S" />
      <node concept="10Oyi0" id="5P" role="1tU5fm" />
      <node concept="3cmrfG" id="5Q" role="33vP2m">
        <property role="3cmrfH" value="9" />
      </node>
    </node>
    <node concept="2tJIrI" id="5g" role="jymVt" />
    <node concept="3clFbW" id="5h" role="jymVt">
      <node concept="3cqZAl" id="5R" role="3clF45" />
      <node concept="3Tm1VV" id="5S" role="1B3o_S" />
      <node concept="3clFbS" id="5T" role="3clF47">
        <node concept="3cpWs8" id="5U" role="3cqZAp">
          <node concept="3cpWsn" id="66" role="3cpWs9">
            <property role="TrG5h" value="builder" />
            <node concept="3uibUv" id="67" role="1tU5fm">
              <ref role="3uigEE" to="ksn4:~LanguageConceptIndexBuilder" resolve="LanguageConceptIndexBuilder" />
            </node>
            <node concept="2ShNRf" id="68" role="33vP2m">
              <node concept="1pGfFk" id="69" role="2ShVmc">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.&lt;init&gt;(long,long)" resolve="LanguageConceptIndexBuilder" />
                <node concept="1adDum" id="6a" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="6b" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5V" role="3cqZAp">
          <node concept="2OqwBi" id="6c" role="3clFbG">
            <node concept="37vLTw" id="6d" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6e" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6f" role="37wK5m">
                <property role="1adDun" value="0x18d8e0833b34209aL" />
              </node>
              <node concept="37vLTw" id="6g" role="37wK5m">
                <ref role="3cqZAo" node="56" resolve="ConvertTo" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5W" role="3cqZAp">
          <node concept="2OqwBi" id="6h" role="3clFbG">
            <node concept="37vLTw" id="6i" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6j" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6k" role="37wK5m">
                <property role="1adDun" value="0x3210b276d1443596L" />
              </node>
              <node concept="37vLTw" id="6l" role="37wK5m">
                <ref role="3cqZAo" node="57" resolve="CurrencyDefTable" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5X" role="3cqZAp">
          <node concept="2OqwBi" id="6m" role="3clFbG">
            <node concept="37vLTw" id="6n" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6o" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6p" role="37wK5m">
                <property role="1adDun" value="0x3210b276d1443597L" />
              </node>
              <node concept="37vLTw" id="6q" role="37wK5m">
                <ref role="3cqZAo" node="58" resolve="CurrencyUnit" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5Y" role="3cqZAp">
          <node concept="2OqwBi" id="6r" role="3clFbG">
            <node concept="37vLTw" id="6s" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6t" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6u" role="37wK5m">
                <property role="1adDun" value="0x3786e3f4808999c3L" />
              </node>
              <node concept="37vLTw" id="6v" role="37wK5m">
                <ref role="3cqZAo" node="59" resolve="CurrentStockPrice" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5Z" role="3cqZAp">
          <node concept="2OqwBi" id="6w" role="3clFbG">
            <node concept="37vLTw" id="6x" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6y" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6z" role="37wK5m">
                <property role="1adDun" value="0x4b9a2fe55913c339L" />
              </node>
              <node concept="37vLTw" id="6$" role="37wK5m">
                <ref role="3cqZAo" node="5a" resolve="GetAmount" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="60" role="3cqZAp">
          <node concept="2OqwBi" id="6_" role="3clFbG">
            <node concept="37vLTw" id="6A" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6B" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6C" role="37wK5m">
                <property role="1adDun" value="0x18d8e0833b32f1b1L" />
              </node>
              <node concept="37vLTw" id="6D" role="37wK5m">
                <ref role="3cqZAo" node="5b" resolve="GetCurrency" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="61" role="3cqZAp">
          <node concept="2OqwBi" id="6E" role="3clFbG">
            <node concept="37vLTw" id="6F" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6G" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6H" role="37wK5m">
                <property role="1adDun" value="0x4b9a2fe559135132L" />
              </node>
              <node concept="37vLTw" id="6I" role="37wK5m">
                <ref role="3cqZAo" node="5c" resolve="MoneyLiteral" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="62" role="3cqZAp">
          <node concept="2OqwBi" id="6J" role="3clFbG">
            <node concept="37vLTw" id="6K" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6L" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6M" role="37wK5m">
                <property role="1adDun" value="0x4b9a2fe55913516aL" />
              </node>
              <node concept="37vLTw" id="6N" role="37wK5m">
                <ref role="3cqZAo" node="5d" resolve="MoneyType" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="63" role="3cqZAp">
          <node concept="2OqwBi" id="6O" role="3clFbG">
            <node concept="37vLTw" id="6P" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6Q" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6R" role="37wK5m">
                <property role="1adDun" value="0x3786e3f480b1c19aL" />
              </node>
              <node concept="37vLTw" id="6S" role="37wK5m">
                <ref role="3cqZAo" node="5e" resolve="MovingAverage" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="64" role="3cqZAp">
          <node concept="2OqwBi" id="6T" role="3clFbG">
            <node concept="37vLTw" id="6U" role="2Oq$k0">
              <ref role="3cqZAo" node="66" resolve="builder" />
            </node>
            <node concept="liA8E" id="6V" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="6W" role="37wK5m">
                <property role="1adDun" value="0x3786e3f480a9b18aL" />
              </node>
              <node concept="37vLTw" id="6X" role="37wK5m">
                <ref role="3cqZAo" node="5f" resolve="StockSymbol" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="65" role="3cqZAp">
          <node concept="37vLTI" id="6Y" role="3clFbG">
            <node concept="2OqwBi" id="6Z" role="37vLTx">
              <node concept="37vLTw" id="71" role="2Oq$k0">
                <ref role="3cqZAo" node="66" resolve="builder" />
              </node>
              <node concept="liA8E" id="72" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.seal():jetbrains.mps.lang.smodel.LanguageConceptIndex" resolve="seal" />
              </node>
            </node>
            <node concept="37vLTw" id="70" role="37vLTJ">
              <ref role="3cqZAo" node="55" resolve="myIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5i" role="jymVt" />
    <node concept="3clFb_" id="5j" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="73" role="3clF45" />
      <node concept="3clFbS" id="74" role="3clF47">
        <node concept="3cpWs6" id="76" role="3cqZAp">
          <node concept="2OqwBi" id="77" role="3cqZAk">
            <node concept="37vLTw" id="78" role="2Oq$k0">
              <ref role="3cqZAo" node="55" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="79" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndex.index(jetbrains.mps.smodel.adapter.ids.SConceptId):int" resolve="index" />
              <node concept="37vLTw" id="7a" role="37wK5m">
                <ref role="3cqZAo" node="75" resolve="cid" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="75" role="3clF46">
        <property role="TrG5h" value="cid" />
        <node concept="3uibUv" id="7b" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="5k" role="jymVt" />
    <node concept="3clFb_" id="5l" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="7c" role="3clF45" />
      <node concept="3Tm1VV" id="7d" role="1B3o_S" />
      <node concept="3clFbS" id="7e" role="3clF47">
        <node concept="3cpWs6" id="7g" role="3cqZAp">
          <node concept="2OqwBi" id="7h" role="3cqZAk">
            <node concept="37vLTw" id="7i" role="2Oq$k0">
              <ref role="3cqZAo" node="55" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="7j" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~ConceptIndex.index(org.jetbrains.mps.openapi.language.SAbstractConcept):int" resolve="index" />
              <node concept="37vLTw" id="7k" role="37wK5m">
                <ref role="3cqZAo" node="7f" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="7f" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3uibUv" id="7l" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="5m" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="7m">
    <property role="TrG5h" value="StructureAspectDescriptor" />
    <node concept="3uibUv" id="7n" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseStructureAspectDescriptor" resolve="BaseStructureAspectDescriptor" />
    </node>
    <node concept="312cEg" id="7o" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptConvertTo" />
      <node concept="3uibUv" id="7R" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="7S" role="33vP2m">
        <ref role="37wK5l" node="7H" resolve="createDescriptorForConvertTo" />
      </node>
    </node>
    <node concept="312cEg" id="7p" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptCurrencyDefTable" />
      <node concept="3uibUv" id="7T" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="7U" role="33vP2m">
        <ref role="37wK5l" node="7I" resolve="createDescriptorForCurrencyDefTable" />
      </node>
    </node>
    <node concept="312cEg" id="7q" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptCurrencyUnit" />
      <node concept="3uibUv" id="7V" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="7W" role="33vP2m">
        <ref role="37wK5l" node="7J" resolve="createDescriptorForCurrencyUnit" />
      </node>
    </node>
    <node concept="312cEg" id="7r" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptCurrentStockPrice" />
      <node concept="3uibUv" id="7X" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="7Y" role="33vP2m">
        <ref role="37wK5l" node="7K" resolve="createDescriptorForCurrentStockPrice" />
      </node>
    </node>
    <node concept="312cEg" id="7s" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptGetAmount" />
      <node concept="3uibUv" id="7Z" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="80" role="33vP2m">
        <ref role="37wK5l" node="7L" resolve="createDescriptorForGetAmount" />
      </node>
    </node>
    <node concept="312cEg" id="7t" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptGetCurrency" />
      <node concept="3uibUv" id="81" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="82" role="33vP2m">
        <ref role="37wK5l" node="7M" resolve="createDescriptorForGetCurrency" />
      </node>
    </node>
    <node concept="312cEg" id="7u" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptMoneyLiteral" />
      <node concept="3uibUv" id="83" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="84" role="33vP2m">
        <ref role="37wK5l" node="7N" resolve="createDescriptorForMoneyLiteral" />
      </node>
    </node>
    <node concept="312cEg" id="7v" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptMoneyType" />
      <node concept="3uibUv" id="85" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="86" role="33vP2m">
        <ref role="37wK5l" node="7O" resolve="createDescriptorForMoneyType" />
      </node>
    </node>
    <node concept="312cEg" id="7w" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptMovingAverage" />
      <node concept="3uibUv" id="87" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="88" role="33vP2m">
        <ref role="37wK5l" node="7P" resolve="createDescriptorForMovingAverage" />
      </node>
    </node>
    <node concept="312cEg" id="7x" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptStockSymbol" />
      <node concept="3uibUv" id="89" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="8a" role="33vP2m">
        <ref role="37wK5l" node="7Q" resolve="createDescriptorForStockSymbol" />
      </node>
    </node>
    <node concept="312cEg" id="7y" role="jymVt">
      <property role="TrG5h" value="myConceptIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="8b" role="1B3o_S" />
      <node concept="3uibUv" id="8c" role="1tU5fm">
        <ref role="3uigEE" node="54" resolve="LanguageConceptSwitch" />
      </node>
    </node>
    <node concept="3Tm1VV" id="7z" role="1B3o_S" />
    <node concept="2tJIrI" id="7$" role="jymVt" />
    <node concept="3clFbW" id="7_" role="jymVt">
      <node concept="3cqZAl" id="8d" role="3clF45" />
      <node concept="3Tm1VV" id="8e" role="1B3o_S" />
      <node concept="3clFbS" id="8f" role="3clF47">
        <node concept="3clFbF" id="8g" role="3cqZAp">
          <node concept="37vLTI" id="8h" role="3clFbG">
            <node concept="2ShNRf" id="8i" role="37vLTx">
              <node concept="1pGfFk" id="8k" role="2ShVmc">
                <ref role="37wK5l" node="5h" resolve="LanguageConceptSwitch" />
              </node>
            </node>
            <node concept="37vLTw" id="8j" role="37vLTJ">
              <ref role="3cqZAo" node="7y" resolve="myConceptIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="7A" role="jymVt" />
    <node concept="3clFb_" id="7B" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="od$2w" value="false" />
      <property role="TrG5h" value="getDescriptors" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="8l" role="3clF47">
        <node concept="3cpWs6" id="8p" role="3cqZAp">
          <node concept="2YIFZM" id="8q" role="3cqZAk">
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...):java.util.List" resolve="asList" />
            <node concept="37vLTw" id="8r" role="37wK5m">
              <ref role="3cqZAo" node="7o" resolve="myConceptConvertTo" />
            </node>
            <node concept="37vLTw" id="8s" role="37wK5m">
              <ref role="3cqZAo" node="7p" resolve="myConceptCurrencyDefTable" />
            </node>
            <node concept="37vLTw" id="8t" role="37wK5m">
              <ref role="3cqZAo" node="7q" resolve="myConceptCurrencyUnit" />
            </node>
            <node concept="37vLTw" id="8u" role="37wK5m">
              <ref role="3cqZAo" node="7r" resolve="myConceptCurrentStockPrice" />
            </node>
            <node concept="37vLTw" id="8v" role="37wK5m">
              <ref role="3cqZAo" node="7s" resolve="myConceptGetAmount" />
            </node>
            <node concept="37vLTw" id="8w" role="37wK5m">
              <ref role="3cqZAo" node="7t" resolve="myConceptGetCurrency" />
            </node>
            <node concept="37vLTw" id="8x" role="37wK5m">
              <ref role="3cqZAo" node="7u" resolve="myConceptMoneyLiteral" />
            </node>
            <node concept="37vLTw" id="8y" role="37wK5m">
              <ref role="3cqZAo" node="7v" resolve="myConceptMoneyType" />
            </node>
            <node concept="37vLTw" id="8z" role="37wK5m">
              <ref role="3cqZAo" node="7w" resolve="myConceptMovingAverage" />
            </node>
            <node concept="37vLTw" id="8$" role="37wK5m">
              <ref role="3cqZAo" node="7x" resolve="myConceptStockSymbol" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="8m" role="1B3o_S" />
      <node concept="3uibUv" id="8n" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="8_" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
        </node>
      </node>
      <node concept="2AHcQZ" id="8o" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="7C" role="jymVt" />
    <node concept="3clFb_" id="7D" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="8A" role="1B3o_S" />
      <node concept="37vLTG" id="8B" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="8G" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
      <node concept="3clFbS" id="8C" role="3clF47">
        <node concept="3KaCP$" id="8H" role="3cqZAp">
          <node concept="3KbdKl" id="8I" role="3KbHQx">
            <node concept="3clFbS" id="8U" role="3Kbo56">
              <node concept="3cpWs6" id="8W" role="3cqZAp">
                <node concept="37vLTw" id="8X" role="3cqZAk">
                  <ref role="3cqZAo" node="7o" resolve="myConceptConvertTo" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="8V" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="56" resolve="ConvertTo" />
            </node>
          </node>
          <node concept="3KbdKl" id="8J" role="3KbHQx">
            <node concept="3clFbS" id="8Y" role="3Kbo56">
              <node concept="3cpWs6" id="90" role="3cqZAp">
                <node concept="37vLTw" id="91" role="3cqZAk">
                  <ref role="3cqZAo" node="7p" resolve="myConceptCurrencyDefTable" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="8Z" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="57" resolve="CurrencyDefTable" />
            </node>
          </node>
          <node concept="3KbdKl" id="8K" role="3KbHQx">
            <node concept="3clFbS" id="92" role="3Kbo56">
              <node concept="3cpWs6" id="94" role="3cqZAp">
                <node concept="37vLTw" id="95" role="3cqZAk">
                  <ref role="3cqZAo" node="7q" resolve="myConceptCurrencyUnit" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="93" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="58" resolve="CurrencyUnit" />
            </node>
          </node>
          <node concept="3KbdKl" id="8L" role="3KbHQx">
            <node concept="3clFbS" id="96" role="3Kbo56">
              <node concept="3cpWs6" id="98" role="3cqZAp">
                <node concept="37vLTw" id="99" role="3cqZAk">
                  <ref role="3cqZAo" node="7r" resolve="myConceptCurrentStockPrice" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="97" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="59" resolve="CurrentStockPrice" />
            </node>
          </node>
          <node concept="3KbdKl" id="8M" role="3KbHQx">
            <node concept="3clFbS" id="9a" role="3Kbo56">
              <node concept="3cpWs6" id="9c" role="3cqZAp">
                <node concept="37vLTw" id="9d" role="3cqZAk">
                  <ref role="3cqZAo" node="7s" resolve="myConceptGetAmount" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="9b" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5a" resolve="GetAmount" />
            </node>
          </node>
          <node concept="3KbdKl" id="8N" role="3KbHQx">
            <node concept="3clFbS" id="9e" role="3Kbo56">
              <node concept="3cpWs6" id="9g" role="3cqZAp">
                <node concept="37vLTw" id="9h" role="3cqZAk">
                  <ref role="3cqZAo" node="7t" resolve="myConceptGetCurrency" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="9f" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5b" resolve="GetCurrency" />
            </node>
          </node>
          <node concept="3KbdKl" id="8O" role="3KbHQx">
            <node concept="3clFbS" id="9i" role="3Kbo56">
              <node concept="3cpWs6" id="9k" role="3cqZAp">
                <node concept="37vLTw" id="9l" role="3cqZAk">
                  <ref role="3cqZAo" node="7u" resolve="myConceptMoneyLiteral" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="9j" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5c" resolve="MoneyLiteral" />
            </node>
          </node>
          <node concept="3KbdKl" id="8P" role="3KbHQx">
            <node concept="3clFbS" id="9m" role="3Kbo56">
              <node concept="3cpWs6" id="9o" role="3cqZAp">
                <node concept="37vLTw" id="9p" role="3cqZAk">
                  <ref role="3cqZAo" node="7v" resolve="myConceptMoneyType" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="9n" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5d" resolve="MoneyType" />
            </node>
          </node>
          <node concept="3KbdKl" id="8Q" role="3KbHQx">
            <node concept="3clFbS" id="9q" role="3Kbo56">
              <node concept="3cpWs6" id="9s" role="3cqZAp">
                <node concept="37vLTw" id="9t" role="3cqZAk">
                  <ref role="3cqZAo" node="7w" resolve="myConceptMovingAverage" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="9r" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5e" resolve="MovingAverage" />
            </node>
          </node>
          <node concept="3KbdKl" id="8R" role="3KbHQx">
            <node concept="3clFbS" id="9u" role="3Kbo56">
              <node concept="3cpWs6" id="9w" role="3cqZAp">
                <node concept="37vLTw" id="9x" role="3cqZAk">
                  <ref role="3cqZAo" node="7x" resolve="myConceptStockSymbol" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="9v" role="3Kbmr1">
              <ref role="1PxDUh" node="54" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="5f" resolve="StockSymbol" />
            </node>
          </node>
          <node concept="2OqwBi" id="8S" role="3KbGdf">
            <node concept="37vLTw" id="9y" role="2Oq$k0">
              <ref role="3cqZAo" node="7y" resolve="myConceptIndex" />
            </node>
            <node concept="liA8E" id="9z" role="2OqNvi">
              <ref role="37wK5l" node="5j" resolve="index" />
              <node concept="37vLTw" id="9$" role="37wK5m">
                <ref role="3cqZAo" node="8B" resolve="id" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="8T" role="3Kb1Dw">
            <node concept="3cpWs6" id="9_" role="3cqZAp">
              <node concept="10Nm6u" id="9A" role="3cqZAk" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="8D" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="2AHcQZ" id="8E" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="8F" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
    <node concept="2tJIrI" id="7E" role="jymVt" />
    <node concept="3clFb_" id="7F" role="jymVt">
      <property role="TrG5h" value="internalIndex" />
      <node concept="10Oyi0" id="9B" role="3clF45" />
      <node concept="3clFbS" id="9C" role="3clF47">
        <node concept="3cpWs6" id="9E" role="3cqZAp">
          <node concept="2OqwBi" id="9F" role="3cqZAk">
            <node concept="37vLTw" id="9G" role="2Oq$k0">
              <ref role="3cqZAo" node="7y" resolve="myConceptIndex" />
            </node>
            <node concept="liA8E" id="9H" role="2OqNvi">
              <ref role="37wK5l" node="5l" resolve="index" />
              <node concept="37vLTw" id="9I" role="37wK5m">
                <ref role="3cqZAo" node="9D" resolve="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="9D" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="9J" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="7G" role="jymVt" />
    <node concept="2YIFZL" id="7H" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForConvertTo" />
      <node concept="3clFbS" id="9K" role="3clF47">
        <node concept="3cpWs8" id="9N" role="3cqZAp">
          <node concept="3cpWsn" id="9V" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="9W" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="9X" role="33vP2m">
              <node concept="1pGfFk" id="9Y" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="9Z" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="a0" role="37wK5m">
                  <property role="Xl_RC" value="ConvertTo" />
                </node>
                <node concept="1adDum" id="a1" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="a2" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="a3" role="37wK5m">
                  <property role="1adDun" value="0x18d8e0833b34209aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="9O" role="3cqZAp">
          <node concept="2OqwBi" id="a4" role="3clFbG">
            <node concept="37vLTw" id="a5" role="2Oq$k0">
              <ref role="3cqZAo" node="9V" resolve="b" />
            </node>
            <node concept="liA8E" id="a6" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="a7" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="a8" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="a9" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="9P" role="3cqZAp">
          <node concept="2OqwBi" id="aa" role="3clFbG">
            <node concept="37vLTw" id="ab" role="2Oq$k0">
              <ref role="3cqZAo" node="9V" resolve="b" />
            </node>
            <node concept="liA8E" id="ac" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="ad" role="37wK5m">
                <property role="1adDun" value="0xf3061a5392264cc5L" />
              </node>
              <node concept="1adDum" id="ae" role="37wK5m">
                <property role="1adDun" value="0xa443f952ceaf5816L" />
              </node>
              <node concept="1adDum" id="af" role="37wK5m">
                <property role="1adDun" value="0x116b46ac030L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="9Q" role="3cqZAp">
          <node concept="2OqwBi" id="ag" role="3clFbG">
            <node concept="37vLTw" id="ah" role="2Oq$k0">
              <ref role="3cqZAo" node="9V" resolve="b" />
            </node>
            <node concept="liA8E" id="ai" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="aj" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/1790427706118381722" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="9R" role="3cqZAp">
          <node concept="2OqwBi" id="ak" role="3clFbG">
            <node concept="37vLTw" id="al" role="2Oq$k0">
              <ref role="3cqZAo" node="9V" resolve="b" />
            </node>
            <node concept="liA8E" id="am" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.prop(java.lang.String,long,java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="prop" />
              <node concept="Xl_RD" id="an" role="37wK5m">
                <property role="Xl_RC" value="targetCurrency" />
              </node>
              <node concept="1adDum" id="ao" role="37wK5m">
                <property role="1adDun" value="0x18d8e0833b34345fL" />
              </node>
              <node concept="Xl_RD" id="ap" role="37wK5m">
                <property role="Xl_RC" value="1790427706118386783" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="9S" role="3cqZAp">
          <node concept="2OqwBi" id="aq" role="3clFbG">
            <node concept="37vLTw" id="ar" role="2Oq$k0">
              <ref role="3cqZAo" node="9V" resolve="b" />
            </node>
            <node concept="liA8E" id="as" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.kind(jetbrains.mps.smodel.runtime.ConceptKind,jetbrains.mps.smodel.runtime.StaticScope):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="kind" />
              <node concept="Rm8GO" id="at" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~ConceptKind" resolve="ConceptKind" />
                <ref role="Rm8GQ" to="ze1i:~ConceptKind.NORMAL" resolve="NORMAL" />
              </node>
              <node concept="Rm8GO" id="au" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~StaticScope" resolve="StaticScope" />
                <ref role="Rm8GQ" to="ze1i:~StaticScope.NONE" resolve="NONE" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="9T" role="3cqZAp">
          <node concept="2OqwBi" id="av" role="3clFbG">
            <node concept="37vLTw" id="aw" role="2Oq$k0">
              <ref role="3cqZAo" node="9V" resolve="b" />
            </node>
            <node concept="liA8E" id="ax" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="ay" role="37wK5m">
                <property role="Xl_RC" value="convert to" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="9U" role="3cqZAp">
          <node concept="2OqwBi" id="az" role="3cqZAk">
            <node concept="37vLTw" id="a$" role="2Oq$k0">
              <ref role="3cqZAo" node="9V" resolve="b" />
            </node>
            <node concept="liA8E" id="a_" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="9L" role="1B3o_S" />
      <node concept="3uibUv" id="9M" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7I" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForCurrencyDefTable" />
      <node concept="3clFbS" id="aA" role="3clF47">
        <node concept="3cpWs8" id="aD" role="3cqZAp">
          <node concept="3cpWsn" id="aI" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="aJ" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="aK" role="33vP2m">
              <node concept="1pGfFk" id="aL" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="aM" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="aN" role="37wK5m">
                  <property role="Xl_RC" value="CurrencyDefTable" />
                </node>
                <node concept="1adDum" id="aO" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="aP" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="aQ" role="37wK5m">
                  <property role="1adDun" value="0x3210b276d1443596L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="aE" role="3cqZAp">
          <node concept="2OqwBi" id="aR" role="3clFbG">
            <node concept="37vLTw" id="aS" role="2Oq$k0">
              <ref role="3cqZAo" node="aI" resolve="b" />
            </node>
            <node concept="liA8E" id="aT" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="aU" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="aV" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="aW" role="37wK5m">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="aF" role="3cqZAp">
          <node concept="2OqwBi" id="aX" role="3clFbG">
            <node concept="37vLTw" id="aY" role="2Oq$k0">
              <ref role="3cqZAo" node="aI" resolve="b" />
            </node>
            <node concept="liA8E" id="aZ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="b0" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/3607579524910560662" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="aG" role="3cqZAp">
          <node concept="2OqwBi" id="b1" role="3clFbG">
            <node concept="2OqwBi" id="b2" role="2Oq$k0">
              <node concept="2OqwBi" id="b4" role="2Oq$k0">
                <node concept="2OqwBi" id="b6" role="2Oq$k0">
                  <node concept="2OqwBi" id="b8" role="2Oq$k0">
                    <node concept="2OqwBi" id="ba" role="2Oq$k0">
                      <node concept="2OqwBi" id="bc" role="2Oq$k0">
                        <node concept="37vLTw" id="be" role="2Oq$k0">
                          <ref role="3cqZAo" node="aI" resolve="b" />
                        </node>
                        <node concept="liA8E" id="bf" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="bg" role="37wK5m">
                            <property role="Xl_RC" value="units" />
                          </node>
                          <node concept="1adDum" id="bh" role="37wK5m">
                            <property role="1adDun" value="0x3210b276d144359cL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="bd" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="bi" role="37wK5m">
                          <property role="1adDun" value="0x662a9f2b58024d16L" />
                        </node>
                        <node concept="1adDum" id="bj" role="37wK5m">
                          <property role="1adDun" value="0x955872c65c7a681eL" />
                        </node>
                        <node concept="1adDum" id="bk" role="37wK5m">
                          <property role="1adDun" value="0x3210b276d1443597L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="bb" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="bl" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="b9" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="bm" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="b7" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="bn" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="b5" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="bo" role="37wK5m">
                  <property role="Xl_RC" value="3607579524910560668" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="b3" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="aH" role="3cqZAp">
          <node concept="2OqwBi" id="bp" role="3cqZAk">
            <node concept="37vLTw" id="bq" role="2Oq$k0">
              <ref role="3cqZAo" node="aI" resolve="b" />
            </node>
            <node concept="liA8E" id="br" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="aB" role="1B3o_S" />
      <node concept="3uibUv" id="aC" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7J" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForCurrencyUnit" />
      <node concept="3clFbS" id="bs" role="3clF47">
        <node concept="3cpWs8" id="bv" role="3cqZAp">
          <node concept="3cpWsn" id="b$" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="b_" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="bA" role="33vP2m">
              <node concept="1pGfFk" id="bB" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="bC" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="bD" role="37wK5m">
                  <property role="Xl_RC" value="CurrencyUnit" />
                </node>
                <node concept="1adDum" id="bE" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="bF" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="bG" role="37wK5m">
                  <property role="1adDun" value="0x3210b276d1443597L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bw" role="3cqZAp">
          <node concept="2OqwBi" id="bH" role="3clFbG">
            <node concept="37vLTw" id="bI" role="2Oq$k0">
              <ref role="3cqZAo" node="b$" resolve="b" />
            </node>
            <node concept="liA8E" id="bJ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="bK" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="bL" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="bM" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="bx" role="3cqZAp">
          <node concept="2OqwBi" id="bN" role="3clFbG">
            <node concept="37vLTw" id="bO" role="2Oq$k0">
              <ref role="3cqZAo" node="b$" resolve="b" />
            </node>
            <node concept="liA8E" id="bP" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="bQ" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="bR" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="bS" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="by" role="3cqZAp">
          <node concept="2OqwBi" id="bT" role="3clFbG">
            <node concept="37vLTw" id="bU" role="2Oq$k0">
              <ref role="3cqZAo" node="b$" resolve="b" />
            </node>
            <node concept="liA8E" id="bV" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="bW" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/3607579524910560663" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="bz" role="3cqZAp">
          <node concept="2OqwBi" id="bX" role="3cqZAk">
            <node concept="37vLTw" id="bY" role="2Oq$k0">
              <ref role="3cqZAo" node="b$" resolve="b" />
            </node>
            <node concept="liA8E" id="bZ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="bt" role="1B3o_S" />
      <node concept="3uibUv" id="bu" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7K" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForCurrentStockPrice" />
      <node concept="3clFbS" id="c0" role="3clF47">
        <node concept="3cpWs8" id="c3" role="3cqZAp">
          <node concept="3cpWsn" id="ca" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="cb" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="cc" role="33vP2m">
              <node concept="1pGfFk" id="cd" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="ce" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="cf" role="37wK5m">
                  <property role="Xl_RC" value="CurrentStockPrice" />
                </node>
                <node concept="1adDum" id="cg" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="ch" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="ci" role="37wK5m">
                  <property role="1adDun" value="0x3786e3f4808999c3L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="c4" role="3cqZAp">
          <node concept="2OqwBi" id="cj" role="3clFbG">
            <node concept="37vLTw" id="ck" role="2Oq$k0">
              <ref role="3cqZAo" node="ca" resolve="b" />
            </node>
            <node concept="liA8E" id="cl" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="cm" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="cn" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="co" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="c5" role="3cqZAp">
          <node concept="2OqwBi" id="cp" role="3clFbG">
            <node concept="37vLTw" id="cq" role="2Oq$k0">
              <ref role="3cqZAo" node="ca" resolve="b" />
            </node>
            <node concept="liA8E" id="cr" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(java.lang.String,long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="super_" />
              <node concept="Xl_RD" id="cs" role="37wK5m">
                <property role="Xl_RC" value="jetbrains.mps.baseLanguage.structure.Expression" />
              </node>
              <node concept="1adDum" id="ct" role="37wK5m">
                <property role="1adDun" value="0xf3061a5392264cc5L" />
              </node>
              <node concept="1adDum" id="cu" role="37wK5m">
                <property role="1adDun" value="0xa443f952ceaf5816L" />
              </node>
              <node concept="1adDum" id="cv" role="37wK5m">
                <property role="1adDun" value="0xf8c37f506fL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="c6" role="3cqZAp">
          <node concept="2OqwBi" id="cw" role="3clFbG">
            <node concept="37vLTw" id="cx" role="2Oq$k0">
              <ref role="3cqZAo" node="ca" resolve="b" />
            </node>
            <node concept="liA8E" id="cy" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="cz" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/4001135958233291203" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="c7" role="3cqZAp">
          <node concept="2OqwBi" id="c$" role="3clFbG">
            <node concept="2OqwBi" id="c_" role="2Oq$k0">
              <node concept="2OqwBi" id="cB" role="2Oq$k0">
                <node concept="2OqwBi" id="cD" role="2Oq$k0">
                  <node concept="2OqwBi" id="cF" role="2Oq$k0">
                    <node concept="2OqwBi" id="cH" role="2Oq$k0">
                      <node concept="2OqwBi" id="cJ" role="2Oq$k0">
                        <node concept="37vLTw" id="cL" role="2Oq$k0">
                          <ref role="3cqZAo" node="ca" resolve="b" />
                        </node>
                        <node concept="liA8E" id="cM" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="cN" role="37wK5m">
                            <property role="Xl_RC" value="symbol" />
                          </node>
                          <node concept="1adDum" id="cO" role="37wK5m">
                            <property role="1adDun" value="0x3786e3f480b0926aL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="cK" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="cP" role="37wK5m">
                          <property role="1adDun" value="0x662a9f2b58024d16L" />
                        </node>
                        <node concept="1adDum" id="cQ" role="37wK5m">
                          <property role="1adDun" value="0x955872c65c7a681eL" />
                        </node>
                        <node concept="1adDum" id="cR" role="37wK5m">
                          <property role="1adDun" value="0x3786e3f480a9b18aL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="cI" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="cS" role="37wK5m">
                        <property role="3clFbU" value="false" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="cG" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="cT" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="cE" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="cU" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="cC" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="cV" role="37wK5m">
                  <property role="Xl_RC" value="4001135958235845226" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="cA" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="c8" role="3cqZAp">
          <node concept="2OqwBi" id="cW" role="3clFbG">
            <node concept="37vLTw" id="cX" role="2Oq$k0">
              <ref role="3cqZAo" node="ca" resolve="b" />
            </node>
            <node concept="liA8E" id="cY" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="cZ" role="37wK5m">
                <property role="Xl_RC" value="current stock price" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="c9" role="3cqZAp">
          <node concept="2OqwBi" id="d0" role="3cqZAk">
            <node concept="37vLTw" id="d1" role="2Oq$k0">
              <ref role="3cqZAo" node="ca" resolve="b" />
            </node>
            <node concept="liA8E" id="d2" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="c1" role="1B3o_S" />
      <node concept="3uibUv" id="c2" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7L" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForGetAmount" />
      <node concept="3clFbS" id="d3" role="3clF47">
        <node concept="3cpWs8" id="d6" role="3cqZAp">
          <node concept="3cpWsn" id="dd" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="de" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="df" role="33vP2m">
              <node concept="1pGfFk" id="dg" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="dh" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="di" role="37wK5m">
                  <property role="Xl_RC" value="GetAmount" />
                </node>
                <node concept="1adDum" id="dj" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="dk" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="dl" role="37wK5m">
                  <property role="1adDun" value="0x4b9a2fe55913c339L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="d7" role="3cqZAp">
          <node concept="2OqwBi" id="dm" role="3clFbG">
            <node concept="37vLTw" id="dn" role="2Oq$k0">
              <ref role="3cqZAo" node="dd" resolve="b" />
            </node>
            <node concept="liA8E" id="do" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="dp" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="dq" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="dr" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="d8" role="3cqZAp">
          <node concept="2OqwBi" id="ds" role="3clFbG">
            <node concept="37vLTw" id="dt" role="2Oq$k0">
              <ref role="3cqZAo" node="dd" resolve="b" />
            </node>
            <node concept="liA8E" id="du" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="dv" role="37wK5m">
                <property role="1adDun" value="0xf3061a5392264cc5L" />
              </node>
              <node concept="1adDum" id="dw" role="37wK5m">
                <property role="1adDun" value="0xa443f952ceaf5816L" />
              </node>
              <node concept="1adDum" id="dx" role="37wK5m">
                <property role="1adDun" value="0x116b46ac030L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="d9" role="3cqZAp">
          <node concept="2OqwBi" id="dy" role="3clFbG">
            <node concept="37vLTw" id="dz" role="2Oq$k0">
              <ref role="3cqZAo" node="dd" resolve="b" />
            </node>
            <node concept="liA8E" id="d$" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="d_" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/5447719361346519865" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="da" role="3cqZAp">
          <node concept="2OqwBi" id="dA" role="3clFbG">
            <node concept="37vLTw" id="dB" role="2Oq$k0">
              <ref role="3cqZAo" node="dd" resolve="b" />
            </node>
            <node concept="liA8E" id="dC" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.kind(jetbrains.mps.smodel.runtime.ConceptKind,jetbrains.mps.smodel.runtime.StaticScope):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="kind" />
              <node concept="Rm8GO" id="dD" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~ConceptKind" resolve="ConceptKind" />
                <ref role="Rm8GQ" to="ze1i:~ConceptKind.NORMAL" resolve="NORMAL" />
              </node>
              <node concept="Rm8GO" id="dE" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~StaticScope" resolve="StaticScope" />
                <ref role="Rm8GQ" to="ze1i:~StaticScope.NONE" resolve="NONE" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="db" role="3cqZAp">
          <node concept="2OqwBi" id="dF" role="3clFbG">
            <node concept="37vLTw" id="dG" role="2Oq$k0">
              <ref role="3cqZAo" node="dd" resolve="b" />
            </node>
            <node concept="liA8E" id="dH" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="dI" role="37wK5m">
                <property role="Xl_RC" value="amount" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="dc" role="3cqZAp">
          <node concept="2OqwBi" id="dJ" role="3cqZAk">
            <node concept="37vLTw" id="dK" role="2Oq$k0">
              <ref role="3cqZAo" node="dd" resolve="b" />
            </node>
            <node concept="liA8E" id="dL" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="d4" role="1B3o_S" />
      <node concept="3uibUv" id="d5" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7M" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForGetCurrency" />
      <node concept="3clFbS" id="dM" role="3clF47">
        <node concept="3cpWs8" id="dP" role="3cqZAp">
          <node concept="3cpWsn" id="dW" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="dX" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="dY" role="33vP2m">
              <node concept="1pGfFk" id="dZ" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="e0" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="e1" role="37wK5m">
                  <property role="Xl_RC" value="GetCurrency" />
                </node>
                <node concept="1adDum" id="e2" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="e3" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="e4" role="37wK5m">
                  <property role="1adDun" value="0x18d8e0833b32f1b1L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dQ" role="3cqZAp">
          <node concept="2OqwBi" id="e5" role="3clFbG">
            <node concept="37vLTw" id="e6" role="2Oq$k0">
              <ref role="3cqZAo" node="dW" resolve="b" />
            </node>
            <node concept="liA8E" id="e7" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="e8" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="e9" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="ea" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dR" role="3cqZAp">
          <node concept="2OqwBi" id="eb" role="3clFbG">
            <node concept="37vLTw" id="ec" role="2Oq$k0">
              <ref role="3cqZAo" node="dW" resolve="b" />
            </node>
            <node concept="liA8E" id="ed" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="ee" role="37wK5m">
                <property role="1adDun" value="0xf3061a5392264cc5L" />
              </node>
              <node concept="1adDum" id="ef" role="37wK5m">
                <property role="1adDun" value="0xa443f952ceaf5816L" />
              </node>
              <node concept="1adDum" id="eg" role="37wK5m">
                <property role="1adDun" value="0x116b46ac030L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dS" role="3cqZAp">
          <node concept="2OqwBi" id="eh" role="3clFbG">
            <node concept="37vLTw" id="ei" role="2Oq$k0">
              <ref role="3cqZAo" node="dW" resolve="b" />
            </node>
            <node concept="liA8E" id="ej" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="ek" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/1790427706118304177" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dT" role="3cqZAp">
          <node concept="2OqwBi" id="el" role="3clFbG">
            <node concept="37vLTw" id="em" role="2Oq$k0">
              <ref role="3cqZAo" node="dW" resolve="b" />
            </node>
            <node concept="liA8E" id="en" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.kind(jetbrains.mps.smodel.runtime.ConceptKind,jetbrains.mps.smodel.runtime.StaticScope):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="kind" />
              <node concept="Rm8GO" id="eo" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~ConceptKind" resolve="ConceptKind" />
                <ref role="Rm8GQ" to="ze1i:~ConceptKind.NORMAL" resolve="NORMAL" />
              </node>
              <node concept="Rm8GO" id="ep" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~StaticScope" resolve="StaticScope" />
                <ref role="Rm8GQ" to="ze1i:~StaticScope.NONE" resolve="NONE" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="dU" role="3cqZAp">
          <node concept="2OqwBi" id="eq" role="3clFbG">
            <node concept="37vLTw" id="er" role="2Oq$k0">
              <ref role="3cqZAo" node="dW" resolve="b" />
            </node>
            <node concept="liA8E" id="es" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="et" role="37wK5m">
                <property role="Xl_RC" value="currency" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="dV" role="3cqZAp">
          <node concept="2OqwBi" id="eu" role="3cqZAk">
            <node concept="37vLTw" id="ev" role="2Oq$k0">
              <ref role="3cqZAo" node="dW" resolve="b" />
            </node>
            <node concept="liA8E" id="ew" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="dN" role="1B3o_S" />
      <node concept="3uibUv" id="dO" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7N" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForMoneyLiteral" />
      <node concept="3clFbS" id="ex" role="3clF47">
        <node concept="3cpWs8" id="e$" role="3cqZAp">
          <node concept="3cpWsn" id="eH" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="eI" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="eJ" role="33vP2m">
              <node concept="1pGfFk" id="eK" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="eL" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="eM" role="37wK5m">
                  <property role="Xl_RC" value="MoneyLiteral" />
                </node>
                <node concept="1adDum" id="eN" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="eO" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="eP" role="37wK5m">
                  <property role="1adDun" value="0x4b9a2fe559135132L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="e_" role="3cqZAp">
          <node concept="2OqwBi" id="eQ" role="3clFbG">
            <node concept="37vLTw" id="eR" role="2Oq$k0">
              <ref role="3cqZAo" node="eH" resolve="b" />
            </node>
            <node concept="liA8E" id="eS" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="eT" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="eU" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="eV" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eA" role="3cqZAp">
          <node concept="2OqwBi" id="eW" role="3clFbG">
            <node concept="37vLTw" id="eX" role="2Oq$k0">
              <ref role="3cqZAo" node="eH" resolve="b" />
            </node>
            <node concept="liA8E" id="eY" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(java.lang.String,long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="super_" />
              <node concept="Xl_RD" id="eZ" role="37wK5m">
                <property role="Xl_RC" value="jetbrains.mps.baseLanguage.structure.Expression" />
              </node>
              <node concept="1adDum" id="f0" role="37wK5m">
                <property role="1adDun" value="0xf3061a5392264cc5L" />
              </node>
              <node concept="1adDum" id="f1" role="37wK5m">
                <property role="1adDun" value="0xa443f952ceaf5816L" />
              </node>
              <node concept="1adDum" id="f2" role="37wK5m">
                <property role="1adDun" value="0xf8c37f506fL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eB" role="3cqZAp">
          <node concept="2OqwBi" id="f3" role="3clFbG">
            <node concept="37vLTw" id="f4" role="2Oq$k0">
              <ref role="3cqZAo" node="eH" resolve="b" />
            </node>
            <node concept="liA8E" id="f5" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="f6" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/5447719361346490674" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eC" role="3cqZAp">
          <node concept="2OqwBi" id="f7" role="3clFbG">
            <node concept="37vLTw" id="f8" role="2Oq$k0">
              <ref role="3cqZAo" node="eH" resolve="b" />
            </node>
            <node concept="liA8E" id="f9" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.prop(java.lang.String,long,java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="prop" />
              <node concept="Xl_RD" id="fa" role="37wK5m">
                <property role="Xl_RC" value="amount" />
              </node>
              <node concept="1adDum" id="fb" role="37wK5m">
                <property role="1adDun" value="0x4b9a2fe559135183L" />
              </node>
              <node concept="Xl_RD" id="fc" role="37wK5m">
                <property role="Xl_RC" value="5447719361346490755" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eD" role="3cqZAp">
          <node concept="2OqwBi" id="fd" role="3clFbG">
            <node concept="2OqwBi" id="fe" role="2Oq$k0">
              <node concept="2OqwBi" id="fg" role="2Oq$k0">
                <node concept="2OqwBi" id="fi" role="2Oq$k0">
                  <node concept="2OqwBi" id="fk" role="2Oq$k0">
                    <node concept="37vLTw" id="fm" role="2Oq$k0">
                      <ref role="3cqZAo" node="eH" resolve="b" />
                    </node>
                    <node concept="liA8E" id="fn" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.associate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="associate" />
                      <node concept="Xl_RD" id="fo" role="37wK5m">
                        <property role="Xl_RC" value="unit" />
                      </node>
                      <node concept="1adDum" id="fp" role="37wK5m">
                        <property role="1adDun" value="0x3210b276d14435a8L" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="fl" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="target" />
                    <node concept="1adDum" id="fq" role="37wK5m">
                      <property role="1adDun" value="0x662a9f2b58024d16L" />
                    </node>
                    <node concept="1adDum" id="fr" role="37wK5m">
                      <property role="1adDun" value="0x955872c65c7a681eL" />
                    </node>
                    <node concept="1adDum" id="fs" role="37wK5m">
                      <property role="1adDun" value="0x3210b276d1443597L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="fj" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="optional" />
                  <node concept="3clFbT" id="ft" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="fh" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="fu" role="37wK5m">
                  <property role="Xl_RC" value="3607579524910560680" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="ff" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eE" role="3cqZAp">
          <node concept="2OqwBi" id="fv" role="3clFbG">
            <node concept="37vLTw" id="fw" role="2Oq$k0">
              <ref role="3cqZAo" node="eH" resolve="b" />
            </node>
            <node concept="liA8E" id="fx" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.kind(jetbrains.mps.smodel.runtime.ConceptKind,jetbrains.mps.smodel.runtime.StaticScope):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="kind" />
              <node concept="Rm8GO" id="fy" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~ConceptKind" resolve="ConceptKind" />
                <ref role="Rm8GQ" to="ze1i:~ConceptKind.NORMAL" resolve="NORMAL" />
              </node>
              <node concept="Rm8GO" id="fz" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~StaticScope" resolve="StaticScope" />
                <ref role="Rm8GQ" to="ze1i:~StaticScope.NONE" resolve="NONE" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eF" role="3cqZAp">
          <node concept="2OqwBi" id="f$" role="3clFbG">
            <node concept="37vLTw" id="f_" role="2Oq$k0">
              <ref role="3cqZAo" node="eH" resolve="b" />
            </node>
            <node concept="liA8E" id="fA" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="fB" role="37wK5m">
                <property role="Xl_RC" value="money" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="eG" role="3cqZAp">
          <node concept="2OqwBi" id="fC" role="3cqZAk">
            <node concept="37vLTw" id="fD" role="2Oq$k0">
              <ref role="3cqZAo" node="eH" resolve="b" />
            </node>
            <node concept="liA8E" id="fE" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="ey" role="1B3o_S" />
      <node concept="3uibUv" id="ez" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7O" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForMoneyType" />
      <node concept="3clFbS" id="fF" role="3clF47">
        <node concept="3cpWs8" id="fI" role="3cqZAp">
          <node concept="3cpWsn" id="fP" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="fQ" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="fR" role="33vP2m">
              <node concept="1pGfFk" id="fS" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="fT" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="fU" role="37wK5m">
                  <property role="Xl_RC" value="MoneyType" />
                </node>
                <node concept="1adDum" id="fV" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="fW" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="fX" role="37wK5m">
                  <property role="1adDun" value="0x4b9a2fe55913516aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fJ" role="3cqZAp">
          <node concept="2OqwBi" id="fY" role="3clFbG">
            <node concept="37vLTw" id="fZ" role="2Oq$k0">
              <ref role="3cqZAo" node="fP" resolve="b" />
            </node>
            <node concept="liA8E" id="g0" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="g1" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="g2" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="g3" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fK" role="3cqZAp">
          <node concept="2OqwBi" id="g4" role="3clFbG">
            <node concept="37vLTw" id="g5" role="2Oq$k0">
              <ref role="3cqZAo" node="fP" resolve="b" />
            </node>
            <node concept="liA8E" id="g6" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(java.lang.String,long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="super_" />
              <node concept="Xl_RD" id="g7" role="37wK5m">
                <property role="Xl_RC" value="jetbrains.mps.baseLanguage.structure.Type" />
              </node>
              <node concept="1adDum" id="g8" role="37wK5m">
                <property role="1adDun" value="0xf3061a5392264cc5L" />
              </node>
              <node concept="1adDum" id="g9" role="37wK5m">
                <property role="1adDun" value="0xa443f952ceaf5816L" />
              </node>
              <node concept="1adDum" id="ga" role="37wK5m">
                <property role="1adDun" value="0xf8c37f506dL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fL" role="3cqZAp">
          <node concept="2OqwBi" id="gb" role="3clFbG">
            <node concept="37vLTw" id="gc" role="2Oq$k0">
              <ref role="3cqZAo" node="fP" resolve="b" />
            </node>
            <node concept="liA8E" id="gd" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="ge" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/5447719361346490730" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fM" role="3cqZAp">
          <node concept="2OqwBi" id="gf" role="3clFbG">
            <node concept="37vLTw" id="gg" role="2Oq$k0">
              <ref role="3cqZAo" node="fP" resolve="b" />
            </node>
            <node concept="liA8E" id="gh" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.kind(jetbrains.mps.smodel.runtime.ConceptKind,jetbrains.mps.smodel.runtime.StaticScope):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="kind" />
              <node concept="Rm8GO" id="gi" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~ConceptKind" resolve="ConceptKind" />
                <ref role="Rm8GQ" to="ze1i:~ConceptKind.INTERFACE" resolve="INTERFACE" />
              </node>
              <node concept="Rm8GO" id="gj" role="37wK5m">
                <ref role="1Px2BO" to="ze1i:~StaticScope" resolve="StaticScope" />
                <ref role="Rm8GQ" to="ze1i:~StaticScope.NONE" resolve="NONE" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fN" role="3cqZAp">
          <node concept="2OqwBi" id="gk" role="3clFbG">
            <node concept="37vLTw" id="gl" role="2Oq$k0">
              <ref role="3cqZAo" node="fP" resolve="b" />
            </node>
            <node concept="liA8E" id="gm" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="gn" role="37wK5m">
                <property role="Xl_RC" value="Money" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="fO" role="3cqZAp">
          <node concept="2OqwBi" id="go" role="3cqZAk">
            <node concept="37vLTw" id="gp" role="2Oq$k0">
              <ref role="3cqZAo" node="fP" resolve="b" />
            </node>
            <node concept="liA8E" id="gq" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="fG" role="1B3o_S" />
      <node concept="3uibUv" id="fH" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7P" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForMovingAverage" />
      <node concept="3clFbS" id="gr" role="3clF47">
        <node concept="3cpWs8" id="gu" role="3cqZAp">
          <node concept="3cpWsn" id="gA" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="gB" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="gC" role="33vP2m">
              <node concept="1pGfFk" id="gD" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="gE" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="gF" role="37wK5m">
                  <property role="Xl_RC" value="MovingAverage" />
                </node>
                <node concept="1adDum" id="gG" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="gH" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="gI" role="37wK5m">
                  <property role="1adDun" value="0x3786e3f480b1c19aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gv" role="3cqZAp">
          <node concept="2OqwBi" id="gJ" role="3clFbG">
            <node concept="37vLTw" id="gK" role="2Oq$k0">
              <ref role="3cqZAo" node="gA" resolve="b" />
            </node>
            <node concept="liA8E" id="gL" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="gM" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="gN" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="gO" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gw" role="3cqZAp">
          <node concept="2OqwBi" id="gP" role="3clFbG">
            <node concept="37vLTw" id="gQ" role="2Oq$k0">
              <ref role="3cqZAo" node="gA" resolve="b" />
            </node>
            <node concept="liA8E" id="gR" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.super_(java.lang.String,long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="super_" />
              <node concept="Xl_RD" id="gS" role="37wK5m">
                <property role="Xl_RC" value="jetbrains.mps.baseLanguage.structure.Expression" />
              </node>
              <node concept="1adDum" id="gT" role="37wK5m">
                <property role="1adDun" value="0xf3061a5392264cc5L" />
              </node>
              <node concept="1adDum" id="gU" role="37wK5m">
                <property role="1adDun" value="0xa443f952ceaf5816L" />
              </node>
              <node concept="1adDum" id="gV" role="37wK5m">
                <property role="1adDun" value="0xf8c37f506fL" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gx" role="3cqZAp">
          <node concept="2OqwBi" id="gW" role="3clFbG">
            <node concept="37vLTw" id="gX" role="2Oq$k0">
              <ref role="3cqZAo" node="gA" resolve="b" />
            </node>
            <node concept="liA8E" id="gY" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="gZ" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/4001135958235922842" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gy" role="3cqZAp">
          <node concept="2OqwBi" id="h0" role="3clFbG">
            <node concept="37vLTw" id="h1" role="2Oq$k0">
              <ref role="3cqZAo" node="gA" resolve="b" />
            </node>
            <node concept="liA8E" id="h2" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.prop(java.lang.String,long,java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="prop" />
              <node concept="Xl_RD" id="h3" role="37wK5m">
                <property role="Xl_RC" value="period" />
              </node>
              <node concept="1adDum" id="h4" role="37wK5m">
                <property role="1adDun" value="0x3786e3f480b1c19bL" />
              </node>
              <node concept="Xl_RD" id="h5" role="37wK5m">
                <property role="Xl_RC" value="4001135958235922843" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="gz" role="3cqZAp">
          <node concept="2OqwBi" id="h6" role="3clFbG">
            <node concept="2OqwBi" id="h7" role="2Oq$k0">
              <node concept="2OqwBi" id="h9" role="2Oq$k0">
                <node concept="2OqwBi" id="hb" role="2Oq$k0">
                  <node concept="2OqwBi" id="hd" role="2Oq$k0">
                    <node concept="2OqwBi" id="hf" role="2Oq$k0">
                      <node concept="2OqwBi" id="hh" role="2Oq$k0">
                        <node concept="37vLTw" id="hj" role="2Oq$k0">
                          <ref role="3cqZAo" node="gA" resolve="b" />
                        </node>
                        <node concept="liA8E" id="hk" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="hl" role="37wK5m">
                            <property role="Xl_RC" value="symbol" />
                          </node>
                          <node concept="1adDum" id="hm" role="37wK5m">
                            <property role="1adDun" value="0x3786e3f480b1c6d0L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="hi" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="hn" role="37wK5m">
                          <property role="1adDun" value="0x662a9f2b58024d16L" />
                        </node>
                        <node concept="1adDum" id="ho" role="37wK5m">
                          <property role="1adDun" value="0x955872c65c7a681eL" />
                        </node>
                        <node concept="1adDum" id="hp" role="37wK5m">
                          <property role="1adDun" value="0x3786e3f480a9b18aL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="hg" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="hq" role="37wK5m">
                        <property role="3clFbU" value="false" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="he" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="hr" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="hc" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="hs" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="ha" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="ht" role="37wK5m">
                  <property role="Xl_RC" value="4001135958235924176" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="h8" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="g$" role="3cqZAp">
          <node concept="2OqwBi" id="hu" role="3clFbG">
            <node concept="37vLTw" id="hv" role="2Oq$k0">
              <ref role="3cqZAo" node="gA" resolve="b" />
            </node>
            <node concept="liA8E" id="hw" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="hx" role="37wK5m">
                <property role="Xl_RC" value="moving average" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="g_" role="3cqZAp">
          <node concept="2OqwBi" id="hy" role="3cqZAk">
            <node concept="37vLTw" id="hz" role="2Oq$k0">
              <ref role="3cqZAo" node="gA" resolve="b" />
            </node>
            <node concept="liA8E" id="h$" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="gs" role="1B3o_S" />
      <node concept="3uibUv" id="gt" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="7Q" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForStockSymbol" />
      <node concept="3clFbS" id="h_" role="3clF47">
        <node concept="3cpWs8" id="hC" role="3cqZAp">
          <node concept="3cpWsn" id="hI" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="hJ" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="hK" role="33vP2m">
              <node concept="1pGfFk" id="hL" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="hM" role="37wK5m">
                  <property role="Xl_RC" value="org.jetbrains.mps.samples.Money" />
                </node>
                <node concept="Xl_RD" id="hN" role="37wK5m">
                  <property role="Xl_RC" value="StockSymbol" />
                </node>
                <node concept="1adDum" id="hO" role="37wK5m">
                  <property role="1adDun" value="0x662a9f2b58024d16L" />
                </node>
                <node concept="1adDum" id="hP" role="37wK5m">
                  <property role="1adDun" value="0x955872c65c7a681eL" />
                </node>
                <node concept="1adDum" id="hQ" role="37wK5m">
                  <property role="1adDun" value="0x3786e3f480a9b18aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hD" role="3cqZAp">
          <node concept="2OqwBi" id="hR" role="3clFbG">
            <node concept="37vLTw" id="hS" role="2Oq$k0">
              <ref role="3cqZAo" node="hI" resolve="b" />
            </node>
            <node concept="liA8E" id="hT" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="hU" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="hV" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="hW" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hE" role="3cqZAp">
          <node concept="2OqwBi" id="hX" role="3clFbG">
            <node concept="37vLTw" id="hY" role="2Oq$k0">
              <ref role="3cqZAo" node="hI" resolve="b" />
            </node>
            <node concept="liA8E" id="hZ" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="i0" role="37wK5m">
                <property role="Xl_RC" value="r:cd29712f-cf1b-4f19-90a2-4ce86af0d5f6(org.jetbrains.mps.samples.Money.structure)/4001135958235394442" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hF" role="3cqZAp">
          <node concept="2OqwBi" id="i1" role="3clFbG">
            <node concept="37vLTw" id="i2" role="2Oq$k0">
              <ref role="3cqZAo" node="hI" resolve="b" />
            </node>
            <node concept="liA8E" id="i3" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.prop(java.lang.String,long,java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="prop" />
              <node concept="Xl_RD" id="i4" role="37wK5m">
                <property role="Xl_RC" value="symbol" />
              </node>
              <node concept="1adDum" id="i5" role="37wK5m">
                <property role="1adDun" value="0x3786e3f480afac5bL" />
              </node>
              <node concept="Xl_RD" id="i6" role="37wK5m">
                <property role="Xl_RC" value="4001135958235786331" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="hG" role="3cqZAp">
          <node concept="2OqwBi" id="i7" role="3clFbG">
            <node concept="37vLTw" id="i8" role="2Oq$k0">
              <ref role="3cqZAo" node="hI" resolve="b" />
            </node>
            <node concept="liA8E" id="i9" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.alias(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="alias" />
              <node concept="Xl_RD" id="ia" role="37wK5m">
                <property role="Xl_RC" value="symbol" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="hH" role="3cqZAp">
          <node concept="2OqwBi" id="ib" role="3cqZAk">
            <node concept="37vLTw" id="ic" role="2Oq$k0">
              <ref role="3cqZAo" node="hI" resolve="b" />
            </node>
            <node concept="liA8E" id="id" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="hA" role="1B3o_S" />
      <node concept="3uibUv" id="hB" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
  </node>
</model>

