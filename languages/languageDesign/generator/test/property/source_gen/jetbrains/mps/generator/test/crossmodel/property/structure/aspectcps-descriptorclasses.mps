<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f3fca8b(checkpoints/jetbrains.mps.generator.test.crossmodel.property.structure@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <languages />
  <imports>
    <import index="sroc" ref="r:0bb4ff75-d79d-4390-9b6c-e01faee2c7e6(jetbrains.mps.generator.test.crossmodel.property.structure)" />
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
      <property role="TrG5h" value="props_Bean" />
      <node concept="3uibUv" id="8" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="9" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_BeanProperty" />
      <node concept="3uibUv" id="a" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="b" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="4" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_InitOp" />
      <node concept="3uibUv" id="c" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="d" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="5" role="1B3o_S" />
    <node concept="2tJIrI" id="6" role="jymVt" />
    <node concept="3clFb_" id="7" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="e" role="1B3o_S" />
      <node concept="37vLTG" id="f" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="k" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="3clFbS" id="g" role="3clF47">
        <node concept="3cpWs8" id="l" role="3cqZAp">
          <node concept="3cpWsn" id="o" role="3cpWs9">
            <property role="TrG5h" value="structureDescriptor" />
            <node concept="3uibUv" id="p" role="1tU5fm">
              <ref role="3uigEE" node="34" resolve="StructureAspectDescriptor" />
            </node>
            <node concept="10QFUN" id="q" role="33vP2m">
              <node concept="3uibUv" id="r" role="10QFUM">
                <ref role="3uigEE" node="34" resolve="StructureAspectDescriptor" />
              </node>
              <node concept="2OqwBi" id="s" role="10QFUP">
                <node concept="37vLTw" id="t" role="2Oq$k0">
                  <ref role="3cqZAo" to="ze1i:~ConceptPresentationAspectBase.myLanguageRuntime" resolve="myLanguageRuntime" />
                </node>
                <node concept="liA8E" id="u" role="2OqNvi">
                  <ref role="37wK5l" to="vndm:~LanguageRuntime.getAspect(java.lang.Class):jetbrains.mps.smodel.runtime.ILanguageAspect" resolve="getAspect" />
                  <node concept="3VsKOn" id="v" role="37wK5m">
                    <ref role="3VsUkX" to="ze1i:~StructureAspectDescriptor" resolve="StructureAspectDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="m" role="3cqZAp">
          <node concept="2OqwBi" id="w" role="3KbGdf">
            <node concept="37vLTw" id="$" role="2Oq$k0">
              <ref role="3cqZAo" node="o" resolve="structureDescriptor" />
            </node>
            <node concept="liA8E" id="_" role="2OqNvi">
              <ref role="37wK5l" node="3i" resolve="internalIndex" />
              <node concept="37vLTw" id="A" role="37wK5m">
                <ref role="3cqZAo" node="f" resolve="c" />
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="x" role="3KbHQx">
            <node concept="3clFbS" id="B" role="3Kbo56">
              <node concept="3clFbJ" id="D" role="3cqZAp">
                <node concept="3clFbS" id="F" role="3clFbx">
                  <node concept="3cpWs8" id="H" role="3cqZAp">
                    <node concept="3cpWsn" id="K" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="L" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="M" role="33vP2m">
                        <node concept="1pGfFk" id="N" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="I" role="3cqZAp">
                    <node concept="2OqwBi" id="O" role="3clFbG">
                      <node concept="37vLTw" id="P" role="2Oq$k0">
                        <ref role="3cqZAo" node="K" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="Q" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="J" role="3cqZAp">
                    <node concept="37vLTI" id="R" role="3clFbG">
                      <node concept="2OqwBi" id="S" role="37vLTx">
                        <node concept="37vLTw" id="U" role="2Oq$k0">
                          <ref role="3cqZAo" node="K" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="V" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="T" role="37vLTJ">
                        <ref role="3cqZAo" node="2" resolve="props_Bean" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="G" role="3clFbw">
                  <node concept="10Nm6u" id="W" role="3uHU7w" />
                  <node concept="37vLTw" id="X" role="3uHU7B">
                    <ref role="3cqZAo" node="2" resolve="props_Bean" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="E" role="3cqZAp">
                <node concept="37vLTw" id="Y" role="3cqZAk">
                  <ref role="3cqZAo" node="2" resolve="props_Bean" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="C" role="3Kbmr1">
              <ref role="1PxDUh" node="1S" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="1U" resolve="Bean" />
            </node>
          </node>
          <node concept="3KbdKl" id="y" role="3KbHQx">
            <node concept="3clFbS" id="Z" role="3Kbo56">
              <node concept="3clFbJ" id="11" role="3cqZAp">
                <node concept="3clFbS" id="13" role="3clFbx">
                  <node concept="3cpWs8" id="15" role="3cqZAp">
                    <node concept="3cpWsn" id="18" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="19" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1a" role="33vP2m">
                        <node concept="1pGfFk" id="1b" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="16" role="3cqZAp">
                    <node concept="2OqwBi" id="1c" role="3clFbG">
                      <node concept="37vLTw" id="1d" role="2Oq$k0">
                        <ref role="3cqZAo" node="18" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1e" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="17" role="3cqZAp">
                    <node concept="37vLTI" id="1f" role="3clFbG">
                      <node concept="2OqwBi" id="1g" role="37vLTx">
                        <node concept="37vLTw" id="1i" role="2Oq$k0">
                          <ref role="3cqZAo" node="18" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1j" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1h" role="37vLTJ">
                        <ref role="3cqZAo" node="3" resolve="props_BeanProperty" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="14" role="3clFbw">
                  <node concept="10Nm6u" id="1k" role="3uHU7w" />
                  <node concept="37vLTw" id="1l" role="3uHU7B">
                    <ref role="3cqZAo" node="3" resolve="props_BeanProperty" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="12" role="3cqZAp">
                <node concept="37vLTw" id="1m" role="3cqZAk">
                  <ref role="3cqZAo" node="3" resolve="props_BeanProperty" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="10" role="3Kbmr1">
              <ref role="1PxDUh" node="1S" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="1V" resolve="BeanProperty" />
            </node>
          </node>
          <node concept="3KbdKl" id="z" role="3KbHQx">
            <node concept="3clFbS" id="1n" role="3Kbo56">
              <node concept="3clFbJ" id="1p" role="3cqZAp">
                <node concept="3clFbS" id="1r" role="3clFbx">
                  <node concept="3cpWs8" id="1t" role="3cqZAp">
                    <node concept="3cpWsn" id="1w" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1x" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1y" role="33vP2m">
                        <node concept="1pGfFk" id="1z" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1u" role="3cqZAp">
                    <node concept="2OqwBi" id="1$" role="3clFbG">
                      <node concept="37vLTw" id="1_" role="2Oq$k0">
                        <ref role="3cqZAo" node="1w" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1A" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.rawPresentation(java.lang.String):jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="rawPresentation" />
                        <node concept="Xl_RD" id="1B" role="37wK5m">
                          <property role="Xl_RC" value="InitOp" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1v" role="3cqZAp">
                    <node concept="37vLTI" id="1C" role="3clFbG">
                      <node concept="2OqwBi" id="1D" role="37vLTx">
                        <node concept="37vLTw" id="1F" role="2Oq$k0">
                          <ref role="3cqZAo" node="1w" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1G" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1E" role="37vLTJ">
                        <ref role="3cqZAo" node="4" resolve="props_InitOp" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1s" role="3clFbw">
                  <node concept="10Nm6u" id="1H" role="3uHU7w" />
                  <node concept="37vLTw" id="1I" role="3uHU7B">
                    <ref role="3cqZAo" node="4" resolve="props_InitOp" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1q" role="3cqZAp">
                <node concept="37vLTw" id="1J" role="3cqZAk">
                  <ref role="3cqZAo" node="4" resolve="props_InitOp" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1o" role="3Kbmr1">
              <ref role="1PxDUh" node="1S" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="1W" resolve="InitOp" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="n" role="3cqZAp">
          <node concept="10Nm6u" id="1K" role="3cqZAk" />
        </node>
      </node>
      <node concept="3uibUv" id="h" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="2AHcQZ" id="i" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="j" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="1L">
    <node concept="39e2AJ" id="1M" role="39e2AI">
      <property role="39e3Y2" value="ConceptPresentationAspectClass" />
      <node concept="39e2AG" id="1O" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="1P" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="ConceptPresentationAspectImpl" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="1N" role="39e2AI">
      <property role="39e3Y2" value="StructureAspectDescriptorCons" />
      <node concept="39e2AG" id="1Q" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="1R" role="39e2AY">
          <ref role="39e2AS" node="3c" resolve="StructureAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="1S">
    <property role="TrG5h" value="LanguageConceptSwitch" />
    <property role="1EXbeo" value="true" />
    <node concept="312cEg" id="1T" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="24" role="1B3o_S" />
      <node concept="3uibUv" id="25" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~LanguageConceptIndex" resolve="LanguageConceptIndex" />
      </node>
    </node>
    <node concept="Wx3nA" id="1U" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="Bean" />
      <node concept="3Tm1VV" id="26" role="1B3o_S" />
      <node concept="10Oyi0" id="27" role="1tU5fm" />
      <node concept="3cmrfG" id="28" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="Wx3nA" id="1V" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="BeanProperty" />
      <node concept="3Tm1VV" id="29" role="1B3o_S" />
      <node concept="10Oyi0" id="2a" role="1tU5fm" />
      <node concept="3cmrfG" id="2b" role="33vP2m">
        <property role="3cmrfH" value="1" />
      </node>
    </node>
    <node concept="Wx3nA" id="1W" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="InitOp" />
      <node concept="3Tm1VV" id="2c" role="1B3o_S" />
      <node concept="10Oyi0" id="2d" role="1tU5fm" />
      <node concept="3cmrfG" id="2e" role="33vP2m">
        <property role="3cmrfH" value="2" />
      </node>
    </node>
    <node concept="2tJIrI" id="1X" role="jymVt" />
    <node concept="3clFbW" id="1Y" role="jymVt">
      <node concept="3cqZAl" id="2f" role="3clF45" />
      <node concept="3Tm1VV" id="2g" role="1B3o_S" />
      <node concept="3clFbS" id="2h" role="3clF47">
        <node concept="3cpWs8" id="2i" role="3cqZAp">
          <node concept="3cpWsn" id="2n" role="3cpWs9">
            <property role="TrG5h" value="builder" />
            <node concept="3uibUv" id="2o" role="1tU5fm">
              <ref role="3uigEE" to="ksn4:~LanguageConceptIndexBuilder" resolve="LanguageConceptIndexBuilder" />
            </node>
            <node concept="2ShNRf" id="2p" role="33vP2m">
              <node concept="1pGfFk" id="2q" role="2ShVmc">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.&lt;init&gt;(long,long)" resolve="LanguageConceptIndexBuilder" />
                <node concept="1adDum" id="2r" role="37wK5m">
                  <property role="1adDun" value="0xdc1cc9486f434687L" />
                </node>
                <node concept="1adDum" id="2s" role="37wK5m">
                  <property role="1adDun" value="0x90cb17dd5cb27219L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2j" role="3cqZAp">
          <node concept="2OqwBi" id="2t" role="3clFbG">
            <node concept="37vLTw" id="2u" role="2Oq$k0">
              <ref role="3cqZAo" node="2n" resolve="builder" />
            </node>
            <node concept="liA8E" id="2v" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="2w" role="37wK5m">
                <property role="1adDun" value="0x4ccbf1da2ba1fe6dL" />
              </node>
              <node concept="37vLTw" id="2x" role="37wK5m">
                <ref role="3cqZAo" node="1U" resolve="Bean" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2k" role="3cqZAp">
          <node concept="2OqwBi" id="2y" role="3clFbG">
            <node concept="37vLTw" id="2z" role="2Oq$k0">
              <ref role="3cqZAo" node="2n" resolve="builder" />
            </node>
            <node concept="liA8E" id="2$" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="2_" role="37wK5m">
                <property role="1adDun" value="0x4ccbf1da2ba1fe70L" />
              </node>
              <node concept="37vLTw" id="2A" role="37wK5m">
                <ref role="3cqZAo" node="1V" resolve="BeanProperty" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2l" role="3cqZAp">
          <node concept="2OqwBi" id="2B" role="3clFbG">
            <node concept="37vLTw" id="2C" role="2Oq$k0">
              <ref role="3cqZAo" node="2n" resolve="builder" />
            </node>
            <node concept="liA8E" id="2D" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="2E" role="37wK5m">
                <property role="1adDun" value="0x523c6873cc7e12a2L" />
              </node>
              <node concept="37vLTw" id="2F" role="37wK5m">
                <ref role="3cqZAo" node="1W" resolve="InitOp" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2m" role="3cqZAp">
          <node concept="37vLTI" id="2G" role="3clFbG">
            <node concept="2OqwBi" id="2H" role="37vLTx">
              <node concept="37vLTw" id="2J" role="2Oq$k0">
                <ref role="3cqZAo" node="2n" resolve="builder" />
              </node>
              <node concept="liA8E" id="2K" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.seal():jetbrains.mps.lang.smodel.LanguageConceptIndex" resolve="seal" />
              </node>
            </node>
            <node concept="37vLTw" id="2I" role="37vLTJ">
              <ref role="3cqZAo" node="1T" resolve="myIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="1Z" role="jymVt" />
    <node concept="3clFb_" id="20" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="2L" role="3clF45" />
      <node concept="3clFbS" id="2M" role="3clF47">
        <node concept="3cpWs6" id="2O" role="3cqZAp">
          <node concept="2OqwBi" id="2P" role="3cqZAk">
            <node concept="37vLTw" id="2Q" role="2Oq$k0">
              <ref role="3cqZAo" node="1T" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="2R" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndex.index(jetbrains.mps.smodel.adapter.ids.SConceptId):int" resolve="index" />
              <node concept="37vLTw" id="2S" role="37wK5m">
                <ref role="3cqZAo" node="2N" resolve="cid" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2N" role="3clF46">
        <property role="TrG5h" value="cid" />
        <node concept="3uibUv" id="2T" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="21" role="jymVt" />
    <node concept="3clFb_" id="22" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="2U" role="3clF45" />
      <node concept="3Tm1VV" id="2V" role="1B3o_S" />
      <node concept="3clFbS" id="2W" role="3clF47">
        <node concept="3cpWs6" id="2Y" role="3cqZAp">
          <node concept="2OqwBi" id="2Z" role="3cqZAk">
            <node concept="37vLTw" id="30" role="2Oq$k0">
              <ref role="3cqZAo" node="1T" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="31" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~ConceptIndex.index(org.jetbrains.mps.openapi.language.SAbstractConcept):int" resolve="index" />
              <node concept="37vLTw" id="32" role="37wK5m">
                <ref role="3cqZAo" node="2X" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="2X" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3uibUv" id="33" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="23" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="34">
    <property role="TrG5h" value="StructureAspectDescriptor" />
    <node concept="3uibUv" id="35" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseStructureAspectDescriptor" resolve="BaseStructureAspectDescriptor" />
    </node>
    <node concept="312cEg" id="36" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptBean" />
      <node concept="3uibUv" id="3n" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="3o" role="33vP2m">
        <ref role="37wK5l" node="3k" resolve="createDescriptorForBean" />
      </node>
    </node>
    <node concept="312cEg" id="37" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptBeanProperty" />
      <node concept="3uibUv" id="3p" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="3q" role="33vP2m">
        <ref role="37wK5l" node="3l" resolve="createDescriptorForBeanProperty" />
      </node>
    </node>
    <node concept="312cEg" id="38" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptInitOp" />
      <node concept="3uibUv" id="3r" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="3s" role="33vP2m">
        <ref role="37wK5l" node="3m" resolve="createDescriptorForInitOp" />
      </node>
    </node>
    <node concept="312cEg" id="39" role="jymVt">
      <property role="TrG5h" value="myConceptIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="3t" role="1B3o_S" />
      <node concept="3uibUv" id="3u" role="1tU5fm">
        <ref role="3uigEE" node="1S" resolve="LanguageConceptSwitch" />
      </node>
    </node>
    <node concept="3Tm1VV" id="3a" role="1B3o_S" />
    <node concept="2tJIrI" id="3b" role="jymVt" />
    <node concept="3clFbW" id="3c" role="jymVt">
      <node concept="3cqZAl" id="3v" role="3clF45" />
      <node concept="3Tm1VV" id="3w" role="1B3o_S" />
      <node concept="3clFbS" id="3x" role="3clF47">
        <node concept="3clFbF" id="3y" role="3cqZAp">
          <node concept="37vLTI" id="3z" role="3clFbG">
            <node concept="2ShNRf" id="3$" role="37vLTx">
              <node concept="1pGfFk" id="3A" role="2ShVmc">
                <ref role="37wK5l" node="1Y" resolve="LanguageConceptSwitch" />
              </node>
            </node>
            <node concept="37vLTw" id="3_" role="37vLTJ">
              <ref role="3cqZAo" node="39" resolve="myConceptIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="3d" role="jymVt" />
    <node concept="3clFb_" id="3e" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="od$2w" value="false" />
      <property role="TrG5h" value="getDescriptors" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="3B" role="3clF47">
        <node concept="3cpWs6" id="3F" role="3cqZAp">
          <node concept="2YIFZM" id="3G" role="3cqZAk">
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...):java.util.List" resolve="asList" />
            <node concept="37vLTw" id="3H" role="37wK5m">
              <ref role="3cqZAo" node="36" resolve="myConceptBean" />
            </node>
            <node concept="37vLTw" id="3I" role="37wK5m">
              <ref role="3cqZAo" node="37" resolve="myConceptBeanProperty" />
            </node>
            <node concept="37vLTw" id="3J" role="37wK5m">
              <ref role="3cqZAo" node="38" resolve="myConceptInitOp" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3C" role="1B3o_S" />
      <node concept="3uibUv" id="3D" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="3K" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
        </node>
      </node>
      <node concept="2AHcQZ" id="3E" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="3f" role="jymVt" />
    <node concept="3clFb_" id="3g" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="3L" role="1B3o_S" />
      <node concept="37vLTG" id="3M" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="3R" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
      <node concept="3clFbS" id="3N" role="3clF47">
        <node concept="3KaCP$" id="3S" role="3cqZAp">
          <node concept="3KbdKl" id="3T" role="3KbHQx">
            <node concept="3clFbS" id="3Y" role="3Kbo56">
              <node concept="3cpWs6" id="40" role="3cqZAp">
                <node concept="37vLTw" id="41" role="3cqZAk">
                  <ref role="3cqZAo" node="36" resolve="myConceptBean" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="3Z" role="3Kbmr1">
              <ref role="1PxDUh" node="1S" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="1U" resolve="Bean" />
            </node>
          </node>
          <node concept="3KbdKl" id="3U" role="3KbHQx">
            <node concept="3clFbS" id="42" role="3Kbo56">
              <node concept="3cpWs6" id="44" role="3cqZAp">
                <node concept="37vLTw" id="45" role="3cqZAk">
                  <ref role="3cqZAo" node="37" resolve="myConceptBeanProperty" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="43" role="3Kbmr1">
              <ref role="1PxDUh" node="1S" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="1V" resolve="BeanProperty" />
            </node>
          </node>
          <node concept="3KbdKl" id="3V" role="3KbHQx">
            <node concept="3clFbS" id="46" role="3Kbo56">
              <node concept="3cpWs6" id="48" role="3cqZAp">
                <node concept="37vLTw" id="49" role="3cqZAk">
                  <ref role="3cqZAo" node="38" resolve="myConceptInitOp" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="47" role="3Kbmr1">
              <ref role="1PxDUh" node="1S" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="1W" resolve="InitOp" />
            </node>
          </node>
          <node concept="2OqwBi" id="3W" role="3KbGdf">
            <node concept="37vLTw" id="4a" role="2Oq$k0">
              <ref role="3cqZAo" node="39" resolve="myConceptIndex" />
            </node>
            <node concept="liA8E" id="4b" role="2OqNvi">
              <ref role="37wK5l" node="20" resolve="index" />
              <node concept="37vLTw" id="4c" role="37wK5m">
                <ref role="3cqZAo" node="3M" resolve="id" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="3X" role="3Kb1Dw">
            <node concept="3cpWs6" id="4d" role="3cqZAp">
              <node concept="10Nm6u" id="4e" role="3cqZAk" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="3O" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="2AHcQZ" id="3P" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="3Q" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
    <node concept="2tJIrI" id="3h" role="jymVt" />
    <node concept="3clFb_" id="3i" role="jymVt">
      <property role="TrG5h" value="internalIndex" />
      <node concept="10Oyi0" id="4f" role="3clF45" />
      <node concept="3clFbS" id="4g" role="3clF47">
        <node concept="3cpWs6" id="4i" role="3cqZAp">
          <node concept="2OqwBi" id="4j" role="3cqZAk">
            <node concept="37vLTw" id="4k" role="2Oq$k0">
              <ref role="3cqZAo" node="39" resolve="myConceptIndex" />
            </node>
            <node concept="liA8E" id="4l" role="2OqNvi">
              <ref role="37wK5l" node="22" resolve="index" />
              <node concept="37vLTw" id="4m" role="37wK5m">
                <ref role="3cqZAo" node="4h" resolve="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="4h" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="4n" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="3j" role="jymVt" />
    <node concept="2YIFZL" id="3k" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForBean" />
      <node concept="3clFbS" id="4o" role="3clF47">
        <node concept="3cpWs8" id="4r" role="3cqZAp">
          <node concept="3cpWsn" id="4y" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="4z" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="4$" role="33vP2m">
              <node concept="1pGfFk" id="4_" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="4A" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.generator.test.crossmodel.property" />
                </node>
                <node concept="Xl_RD" id="4B" role="37wK5m">
                  <property role="Xl_RC" value="Bean" />
                </node>
                <node concept="1adDum" id="4C" role="37wK5m">
                  <property role="1adDun" value="0xdc1cc9486f434687L" />
                </node>
                <node concept="1adDum" id="4D" role="37wK5m">
                  <property role="1adDun" value="0x90cb17dd5cb27219L" />
                </node>
                <node concept="1adDum" id="4E" role="37wK5m">
                  <property role="1adDun" value="0x4ccbf1da2ba1fe6dL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4s" role="3cqZAp">
          <node concept="2OqwBi" id="4F" role="3clFbG">
            <node concept="37vLTw" id="4G" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="b" />
            </node>
            <node concept="liA8E" id="4H" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="4I" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="4J" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="4K" role="37wK5m">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4t" role="3cqZAp">
          <node concept="2OqwBi" id="4L" role="3clFbG">
            <node concept="37vLTw" id="4M" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="b" />
            </node>
            <node concept="liA8E" id="4N" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="4O" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="4P" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="4Q" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4u" role="3cqZAp">
          <node concept="2OqwBi" id="4R" role="3clFbG">
            <node concept="37vLTw" id="4S" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="b" />
            </node>
            <node concept="liA8E" id="4T" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="4U" role="37wK5m">
                <property role="Xl_RC" value="r:0bb4ff75-d79d-4390-9b6c-e01faee2c7e6(jetbrains.mps.generator.test.crossmodel.property.structure)/5533782486491987565" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4v" role="3cqZAp">
          <node concept="2OqwBi" id="4V" role="3clFbG">
            <node concept="2OqwBi" id="4W" role="2Oq$k0">
              <node concept="2OqwBi" id="4Y" role="2Oq$k0">
                <node concept="2OqwBi" id="50" role="2Oq$k0">
                  <node concept="2OqwBi" id="52" role="2Oq$k0">
                    <node concept="2OqwBi" id="54" role="2Oq$k0">
                      <node concept="2OqwBi" id="56" role="2Oq$k0">
                        <node concept="37vLTw" id="58" role="2Oq$k0">
                          <ref role="3cqZAo" node="4y" resolve="b" />
                        </node>
                        <node concept="liA8E" id="59" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="5a" role="37wK5m">
                            <property role="Xl_RC" value="properties" />
                          </node>
                          <node concept="1adDum" id="5b" role="37wK5m">
                            <property role="1adDun" value="0x4ccbf1da2ba1fe7eL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="57" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="5c" role="37wK5m">
                          <property role="1adDun" value="0xdc1cc9486f434687L" />
                        </node>
                        <node concept="1adDum" id="5d" role="37wK5m">
                          <property role="1adDun" value="0x90cb17dd5cb27219L" />
                        </node>
                        <node concept="1adDum" id="5e" role="37wK5m">
                          <property role="1adDun" value="0x4ccbf1da2ba1fe70L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="55" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="5f" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="53" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="5g" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="51" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="5h" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="4Z" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="5i" role="37wK5m">
                  <property role="Xl_RC" value="5533782486491987582" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="4X" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4w" role="3cqZAp">
          <node concept="2OqwBi" id="5j" role="3clFbG">
            <node concept="2OqwBi" id="5k" role="2Oq$k0">
              <node concept="2OqwBi" id="5m" role="2Oq$k0">
                <node concept="2OqwBi" id="5o" role="2Oq$k0">
                  <node concept="2OqwBi" id="5q" role="2Oq$k0">
                    <node concept="2OqwBi" id="5s" role="2Oq$k0">
                      <node concept="2OqwBi" id="5u" role="2Oq$k0">
                        <node concept="37vLTw" id="5w" role="2Oq$k0">
                          <ref role="3cqZAo" node="4y" resolve="b" />
                        </node>
                        <node concept="liA8E" id="5x" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="5y" role="37wK5m">
                            <property role="Xl_RC" value="initializers" />
                          </node>
                          <node concept="1adDum" id="5z" role="37wK5m">
                            <property role="1adDun" value="0x523c6873cc802769L" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="5v" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="5$" role="37wK5m">
                          <property role="1adDun" value="0xdc1cc9486f434687L" />
                        </node>
                        <node concept="1adDum" id="5_" role="37wK5m">
                          <property role="1adDun" value="0x90cb17dd5cb27219L" />
                        </node>
                        <node concept="1adDum" id="5A" role="37wK5m">
                          <property role="1adDun" value="0x523c6873cc7e12a2L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="5t" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="5B" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="5r" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="5C" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="5p" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="5D" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="5n" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="5E" role="37wK5m">
                  <property role="Xl_RC" value="5925726056274208617" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="5l" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="4x" role="3cqZAp">
          <node concept="2OqwBi" id="5F" role="3cqZAk">
            <node concept="37vLTw" id="5G" role="2Oq$k0">
              <ref role="3cqZAo" node="4y" resolve="b" />
            </node>
            <node concept="liA8E" id="5H" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="4p" role="1B3o_S" />
      <node concept="3uibUv" id="4q" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="3l" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForBeanProperty" />
      <node concept="3clFbS" id="5I" role="3clF47">
        <node concept="3cpWs8" id="5L" role="3cqZAp">
          <node concept="3cpWsn" id="5Q" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="5R" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="5S" role="33vP2m">
              <node concept="1pGfFk" id="5T" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="5U" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.generator.test.crossmodel.property" />
                </node>
                <node concept="Xl_RD" id="5V" role="37wK5m">
                  <property role="Xl_RC" value="BeanProperty" />
                </node>
                <node concept="1adDum" id="5W" role="37wK5m">
                  <property role="1adDun" value="0xdc1cc9486f434687L" />
                </node>
                <node concept="1adDum" id="5X" role="37wK5m">
                  <property role="1adDun" value="0x90cb17dd5cb27219L" />
                </node>
                <node concept="1adDum" id="5Y" role="37wK5m">
                  <property role="1adDun" value="0x4ccbf1da2ba1fe70L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5M" role="3cqZAp">
          <node concept="2OqwBi" id="5Z" role="3clFbG">
            <node concept="37vLTw" id="60" role="2Oq$k0">
              <ref role="3cqZAo" node="5Q" resolve="b" />
            </node>
            <node concept="liA8E" id="61" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="62" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="63" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="64" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5N" role="3cqZAp">
          <node concept="2OqwBi" id="65" role="3clFbG">
            <node concept="37vLTw" id="66" role="2Oq$k0">
              <ref role="3cqZAo" node="5Q" resolve="b" />
            </node>
            <node concept="liA8E" id="67" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="68" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="69" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="6a" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5O" role="3cqZAp">
          <node concept="2OqwBi" id="6b" role="3clFbG">
            <node concept="37vLTw" id="6c" role="2Oq$k0">
              <ref role="3cqZAo" node="5Q" resolve="b" />
            </node>
            <node concept="liA8E" id="6d" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="6e" role="37wK5m">
                <property role="Xl_RC" value="r:0bb4ff75-d79d-4390-9b6c-e01faee2c7e6(jetbrains.mps.generator.test.crossmodel.property.structure)/5533782486491987568" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="5P" role="3cqZAp">
          <node concept="2OqwBi" id="6f" role="3cqZAk">
            <node concept="37vLTw" id="6g" role="2Oq$k0">
              <ref role="3cqZAo" node="5Q" resolve="b" />
            </node>
            <node concept="liA8E" id="6h" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="5J" role="1B3o_S" />
      <node concept="3uibUv" id="5K" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="3m" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForInitOp" />
      <node concept="3clFbS" id="6i" role="3clF47">
        <node concept="3cpWs8" id="6l" role="3cqZAp">
          <node concept="3cpWsn" id="6s" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="6t" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="6u" role="33vP2m">
              <node concept="1pGfFk" id="6v" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="6w" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.generator.test.crossmodel.property" />
                </node>
                <node concept="Xl_RD" id="6x" role="37wK5m">
                  <property role="Xl_RC" value="InitOp" />
                </node>
                <node concept="1adDum" id="6y" role="37wK5m">
                  <property role="1adDun" value="0xdc1cc9486f434687L" />
                </node>
                <node concept="1adDum" id="6z" role="37wK5m">
                  <property role="1adDun" value="0x90cb17dd5cb27219L" />
                </node>
                <node concept="1adDum" id="6$" role="37wK5m">
                  <property role="1adDun" value="0x523c6873cc7e12a2L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6m" role="3cqZAp">
          <node concept="2OqwBi" id="6_" role="3clFbG">
            <node concept="37vLTw" id="6A" role="2Oq$k0">
              <ref role="3cqZAo" node="6s" resolve="b" />
            </node>
            <node concept="liA8E" id="6B" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="6C" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="6D" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="6E" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6n" role="3cqZAp">
          <node concept="2OqwBi" id="6F" role="3clFbG">
            <node concept="37vLTw" id="6G" role="2Oq$k0">
              <ref role="3cqZAo" node="6s" resolve="b" />
            </node>
            <node concept="liA8E" id="6H" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="6I" role="37wK5m">
                <property role="Xl_RC" value="r:0bb4ff75-d79d-4390-9b6c-e01faee2c7e6(jetbrains.mps.generator.test.crossmodel.property.structure)/5925726056274072226" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6o" role="3cqZAp">
          <node concept="2OqwBi" id="6J" role="3clFbG">
            <node concept="37vLTw" id="6K" role="2Oq$k0">
              <ref role="3cqZAo" node="6s" resolve="b" />
            </node>
            <node concept="liA8E" id="6L" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.prop(java.lang.String,long,java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="prop" />
              <node concept="Xl_RD" id="6M" role="37wK5m">
                <property role="Xl_RC" value="value" />
              </node>
              <node concept="1adDum" id="6N" role="37wK5m">
                <property role="1adDun" value="0x523c6873cc7e583fL" />
              </node>
              <node concept="Xl_RD" id="6O" role="37wK5m">
                <property role="Xl_RC" value="5925726056274090047" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6p" role="3cqZAp">
          <node concept="2OqwBi" id="6P" role="3clFbG">
            <node concept="2OqwBi" id="6Q" role="2Oq$k0">
              <node concept="2OqwBi" id="6S" role="2Oq$k0">
                <node concept="2OqwBi" id="6U" role="2Oq$k0">
                  <node concept="2OqwBi" id="6W" role="2Oq$k0">
                    <node concept="37vLTw" id="6Y" role="2Oq$k0">
                      <ref role="3cqZAo" node="6s" resolve="b" />
                    </node>
                    <node concept="liA8E" id="6Z" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.associate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="associate" />
                      <node concept="Xl_RD" id="70" role="37wK5m">
                        <property role="Xl_RC" value="bean" />
                      </node>
                      <node concept="1adDum" id="71" role="37wK5m">
                        <property role="1adDun" value="0x47d6e5da62e55fe3L" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="6X" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="target" />
                    <node concept="1adDum" id="72" role="37wK5m">
                      <property role="1adDun" value="0xdc1cc9486f434687L" />
                    </node>
                    <node concept="1adDum" id="73" role="37wK5m">
                      <property role="1adDun" value="0x90cb17dd5cb27219L" />
                    </node>
                    <node concept="1adDum" id="74" role="37wK5m">
                      <property role="1adDun" value="0x4ccbf1da2ba1fe6dL" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="6V" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="optional" />
                  <node concept="3clFbT" id="75" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="6T" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="76" role="37wK5m">
                  <property role="Xl_RC" value="5176577547833794531" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="6R" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6q" role="3cqZAp">
          <node concept="2OqwBi" id="77" role="3clFbG">
            <node concept="2OqwBi" id="78" role="2Oq$k0">
              <node concept="2OqwBi" id="7a" role="2Oq$k0">
                <node concept="2OqwBi" id="7c" role="2Oq$k0">
                  <node concept="2OqwBi" id="7e" role="2Oq$k0">
                    <node concept="37vLTw" id="7g" role="2Oq$k0">
                      <ref role="3cqZAo" node="6s" resolve="b" />
                    </node>
                    <node concept="liA8E" id="7h" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.associate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="associate" />
                      <node concept="Xl_RD" id="7i" role="37wK5m">
                        <property role="Xl_RC" value="property" />
                      </node>
                      <node concept="1adDum" id="7j" role="37wK5m">
                        <property role="1adDun" value="0x523c6873cc7e167dL" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="7f" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="target" />
                    <node concept="1adDum" id="7k" role="37wK5m">
                      <property role="1adDun" value="0xdc1cc9486f434687L" />
                    </node>
                    <node concept="1adDum" id="7l" role="37wK5m">
                      <property role="1adDun" value="0x90cb17dd5cb27219L" />
                    </node>
                    <node concept="1adDum" id="7m" role="37wK5m">
                      <property role="1adDun" value="0x4ccbf1da2ba1fe70L" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="7d" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="optional" />
                  <node concept="3clFbT" id="7n" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="7b" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AssociationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="7o" role="37wK5m">
                  <property role="Xl_RC" value="5925726056274073213" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="79" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AssociationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6r" role="3cqZAp">
          <node concept="2OqwBi" id="7p" role="3cqZAk">
            <node concept="37vLTw" id="7q" role="2Oq$k0">
              <ref role="3cqZAo" node="6s" resolve="b" />
            </node>
            <node concept="liA8E" id="7r" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6j" role="1B3o_S" />
      <node concept="3uibUv" id="6k" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
  </node>
</model>

