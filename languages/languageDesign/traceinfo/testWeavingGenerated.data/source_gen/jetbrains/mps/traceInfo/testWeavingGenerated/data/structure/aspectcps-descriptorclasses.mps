<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:fe30145(checkpoints/jetbrains.mps.traceInfo.testWeavingGenerated.data.structure@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <languages />
  <imports>
    <import index="c5w2" ref="r:b8c93b44-499b-404a-a011-c0847b38eb58(jetbrains.mps.traceInfo.testWeavingGenerated.data.structure)" />
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
      <property role="TrG5h" value="props_ChildConceptWeave" />
      <node concept="3uibUv" id="a" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="b" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="3" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_ChildConceptWeaveEach" />
      <node concept="3uibUv" id="c" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="d" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="4" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_ChildConceptWeaveEachMany" />
      <node concept="3uibUv" id="e" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="f" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="5" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_ChildConceptWeaveMany" />
      <node concept="3uibUv" id="g" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="h" role="1B3o_S" />
    </node>
    <node concept="312cEg" id="6" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="false" />
      <property role="TrG5h" value="props_RootConcept" />
      <node concept="3uibUv" id="i" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="3Tm6S6" id="j" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="7" role="1B3o_S" />
    <node concept="2tJIrI" id="8" role="jymVt" />
    <node concept="3clFb_" id="9" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="k" role="1B3o_S" />
      <node concept="37vLTG" id="l" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="q" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
      <node concept="3clFbS" id="m" role="3clF47">
        <node concept="3cpWs8" id="r" role="3cqZAp">
          <node concept="3cpWsn" id="u" role="3cpWs9">
            <property role="TrG5h" value="structureDescriptor" />
            <node concept="3uibUv" id="v" role="1tU5fm">
              <ref role="3uigEE" node="4f" resolve="StructureAspectDescriptor" />
            </node>
            <node concept="10QFUN" id="w" role="33vP2m">
              <node concept="3uibUv" id="x" role="10QFUM">
                <ref role="3uigEE" node="4f" resolve="StructureAspectDescriptor" />
              </node>
              <node concept="2OqwBi" id="y" role="10QFUP">
                <node concept="37vLTw" id="z" role="2Oq$k0">
                  <ref role="3cqZAo" to="ze1i:~ConceptPresentationAspectBase.myLanguageRuntime" resolve="myLanguageRuntime" />
                </node>
                <node concept="liA8E" id="$" role="2OqNvi">
                  <ref role="37wK5l" to="vndm:~LanguageRuntime.getAspect(java.lang.Class):jetbrains.mps.smodel.runtime.ILanguageAspect" resolve="getAspect" />
                  <node concept="3VsKOn" id="_" role="37wK5m">
                    <ref role="3VsUkX" to="ze1i:~StructureAspectDescriptor" resolve="StructureAspectDescriptor" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3KaCP$" id="s" role="3cqZAp">
          <node concept="2OqwBi" id="A" role="3KbGdf">
            <node concept="37vLTw" id="G" role="2Oq$k0">
              <ref role="3cqZAo" node="u" resolve="structureDescriptor" />
            </node>
            <node concept="liA8E" id="H" role="2OqNvi">
              <ref role="37wK5l" node="4v" resolve="internalIndex" />
              <node concept="37vLTw" id="I" role="37wK5m">
                <ref role="3cqZAo" node="l" resolve="c" />
              </node>
            </node>
          </node>
          <node concept="3KbdKl" id="B" role="3KbHQx">
            <node concept="3clFbS" id="J" role="3Kbo56">
              <node concept="3clFbJ" id="L" role="3cqZAp">
                <node concept="3clFbS" id="N" role="3clFbx">
                  <node concept="3cpWs8" id="P" role="3cqZAp">
                    <node concept="3cpWsn" id="S" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="T" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="U" role="33vP2m">
                        <node concept="1pGfFk" id="V" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="Q" role="3cqZAp">
                    <node concept="2OqwBi" id="W" role="3clFbG">
                      <node concept="37vLTw" id="X" role="2Oq$k0">
                        <ref role="3cqZAo" node="S" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="Y" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="R" role="3cqZAp">
                    <node concept="37vLTI" id="Z" role="3clFbG">
                      <node concept="2OqwBi" id="10" role="37vLTx">
                        <node concept="37vLTw" id="12" role="2Oq$k0">
                          <ref role="3cqZAo" node="S" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="13" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="11" role="37vLTJ">
                        <ref role="3cqZAo" node="2" resolve="props_ChildConceptWeave" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="O" role="3clFbw">
                  <node concept="10Nm6u" id="14" role="3uHU7w" />
                  <node concept="37vLTw" id="15" role="3uHU7B">
                    <ref role="3cqZAo" node="2" resolve="props_ChildConceptWeave" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="M" role="3cqZAp">
                <node concept="37vLTw" id="16" role="3cqZAk">
                  <ref role="3cqZAo" node="2" resolve="props_ChildConceptWeave" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="K" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2L" resolve="ChildConceptWeave" />
            </node>
          </node>
          <node concept="3KbdKl" id="C" role="3KbHQx">
            <node concept="3clFbS" id="17" role="3Kbo56">
              <node concept="3clFbJ" id="19" role="3cqZAp">
                <node concept="3clFbS" id="1b" role="3clFbx">
                  <node concept="3cpWs8" id="1d" role="3cqZAp">
                    <node concept="3cpWsn" id="1g" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1h" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1i" role="33vP2m">
                        <node concept="1pGfFk" id="1j" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1e" role="3cqZAp">
                    <node concept="2OqwBi" id="1k" role="3clFbG">
                      <node concept="37vLTw" id="1l" role="2Oq$k0">
                        <ref role="3cqZAo" node="1g" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1m" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1f" role="3cqZAp">
                    <node concept="37vLTI" id="1n" role="3clFbG">
                      <node concept="2OqwBi" id="1o" role="37vLTx">
                        <node concept="37vLTw" id="1q" role="2Oq$k0">
                          <ref role="3cqZAo" node="1g" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1r" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1p" role="37vLTJ">
                        <ref role="3cqZAo" node="3" resolve="props_ChildConceptWeaveEach" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1c" role="3clFbw">
                  <node concept="10Nm6u" id="1s" role="3uHU7w" />
                  <node concept="37vLTw" id="1t" role="3uHU7B">
                    <ref role="3cqZAo" node="3" resolve="props_ChildConceptWeaveEach" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1a" role="3cqZAp">
                <node concept="37vLTw" id="1u" role="3cqZAk">
                  <ref role="3cqZAo" node="3" resolve="props_ChildConceptWeaveEach" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="18" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2M" resolve="ChildConceptWeaveEach" />
            </node>
          </node>
          <node concept="3KbdKl" id="D" role="3KbHQx">
            <node concept="3clFbS" id="1v" role="3Kbo56">
              <node concept="3clFbJ" id="1x" role="3cqZAp">
                <node concept="3clFbS" id="1z" role="3clFbx">
                  <node concept="3cpWs8" id="1_" role="3cqZAp">
                    <node concept="3cpWsn" id="1C" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="1D" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="1E" role="33vP2m">
                        <node concept="1pGfFk" id="1F" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1A" role="3cqZAp">
                    <node concept="2OqwBi" id="1G" role="3clFbG">
                      <node concept="37vLTw" id="1H" role="2Oq$k0">
                        <ref role="3cqZAo" node="1C" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="1I" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1B" role="3cqZAp">
                    <node concept="37vLTI" id="1J" role="3clFbG">
                      <node concept="2OqwBi" id="1K" role="37vLTx">
                        <node concept="37vLTw" id="1M" role="2Oq$k0">
                          <ref role="3cqZAo" node="1C" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="1N" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="1L" role="37vLTJ">
                        <ref role="3cqZAo" node="4" resolve="props_ChildConceptWeaveEachMany" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1$" role="3clFbw">
                  <node concept="10Nm6u" id="1O" role="3uHU7w" />
                  <node concept="37vLTw" id="1P" role="3uHU7B">
                    <ref role="3cqZAo" node="4" resolve="props_ChildConceptWeaveEachMany" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1y" role="3cqZAp">
                <node concept="37vLTw" id="1Q" role="3cqZAk">
                  <ref role="3cqZAo" node="4" resolve="props_ChildConceptWeaveEachMany" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1w" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2N" resolve="ChildConceptWeaveEachMany" />
            </node>
          </node>
          <node concept="3KbdKl" id="E" role="3KbHQx">
            <node concept="3clFbS" id="1R" role="3Kbo56">
              <node concept="3clFbJ" id="1T" role="3cqZAp">
                <node concept="3clFbS" id="1V" role="3clFbx">
                  <node concept="3cpWs8" id="1X" role="3cqZAp">
                    <node concept="3cpWsn" id="20" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="21" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="22" role="33vP2m">
                        <node concept="1pGfFk" id="23" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1Y" role="3cqZAp">
                    <node concept="2OqwBi" id="24" role="3clFbG">
                      <node concept="37vLTw" id="25" role="2Oq$k0">
                        <ref role="3cqZAo" node="20" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="26" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="1Z" role="3cqZAp">
                    <node concept="37vLTI" id="27" role="3clFbG">
                      <node concept="2OqwBi" id="28" role="37vLTx">
                        <node concept="37vLTw" id="2a" role="2Oq$k0">
                          <ref role="3cqZAo" node="20" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="2b" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="29" role="37vLTJ">
                        <ref role="3cqZAo" node="5" resolve="props_ChildConceptWeaveMany" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="1W" role="3clFbw">
                  <node concept="10Nm6u" id="2c" role="3uHU7w" />
                  <node concept="37vLTw" id="2d" role="3uHU7B">
                    <ref role="3cqZAo" node="5" resolve="props_ChildConceptWeaveMany" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="1U" role="3cqZAp">
                <node concept="37vLTw" id="2e" role="3cqZAk">
                  <ref role="3cqZAo" node="5" resolve="props_ChildConceptWeaveMany" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="1S" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2O" resolve="ChildConceptWeaveMany" />
            </node>
          </node>
          <node concept="3KbdKl" id="F" role="3KbHQx">
            <node concept="3clFbS" id="2f" role="3Kbo56">
              <node concept="3clFbJ" id="2h" role="3cqZAp">
                <node concept="3clFbS" id="2j" role="3clFbx">
                  <node concept="3cpWs8" id="2l" role="3cqZAp">
                    <node concept="3cpWsn" id="2o" role="3cpWs9">
                      <property role="TrG5h" value="cpb" />
                      <node concept="3uibUv" id="2p" role="1tU5fm">
                        <ref role="3uigEE" to="ze1i:~ConceptPresentationBuilder" resolve="ConceptPresentationBuilder" />
                      </node>
                      <node concept="2ShNRf" id="2q" role="33vP2m">
                        <node concept="1pGfFk" id="2r" role="2ShVmc">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.&lt;init&gt;()" resolve="ConceptPresentationBuilder" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2m" role="3cqZAp">
                    <node concept="2OqwBi" id="2s" role="3clFbG">
                      <node concept="37vLTw" id="2t" role="2Oq$k0">
                        <ref role="3cqZAo" node="2o" resolve="cpb" />
                      </node>
                      <node concept="liA8E" id="2u" role="2OqNvi">
                        <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.presentationByName():jetbrains.mps.smodel.runtime.ConceptPresentationBuilder" resolve="presentationByName" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbF" id="2n" role="3cqZAp">
                    <node concept="37vLTI" id="2v" role="3clFbG">
                      <node concept="2OqwBi" id="2w" role="37vLTx">
                        <node concept="37vLTw" id="2y" role="2Oq$k0">
                          <ref role="3cqZAo" node="2o" resolve="cpb" />
                        </node>
                        <node concept="liA8E" id="2z" role="2OqNvi">
                          <ref role="37wK5l" to="ze1i:~ConceptPresentationBuilder.create():jetbrains.mps.smodel.runtime.ConceptPresentation" resolve="create" />
                        </node>
                      </node>
                      <node concept="37vLTw" id="2x" role="37vLTJ">
                        <ref role="3cqZAo" node="6" resolve="props_RootConcept" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3clFbC" id="2k" role="3clFbw">
                  <node concept="10Nm6u" id="2$" role="3uHU7w" />
                  <node concept="37vLTw" id="2_" role="3uHU7B">
                    <ref role="3cqZAo" node="6" resolve="props_RootConcept" />
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="2i" role="3cqZAp">
                <node concept="37vLTw" id="2A" role="3cqZAk">
                  <ref role="3cqZAo" node="6" resolve="props_RootConcept" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="2g" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2P" resolve="RootConcept" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="t" role="3cqZAp">
          <node concept="10Nm6u" id="2B" role="3cqZAk" />
        </node>
      </node>
      <node concept="3uibUv" id="n" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptPresentation" resolve="ConceptPresentation" />
      </node>
      <node concept="2AHcQZ" id="o" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="p" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="2C">
    <node concept="39e2AJ" id="2D" role="39e2AI">
      <property role="39e3Y2" value="ConceptPresentationAspectClass" />
      <node concept="39e2AG" id="2F" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="2G" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="ConceptPresentationAspectImpl" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="2E" role="39e2AI">
      <property role="39e3Y2" value="StructureAspectDescriptorCons" />
      <node concept="39e2AG" id="2H" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="2I" role="39e2AY">
          <ref role="39e2AS" node="4p" resolve="StructureAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2J">
    <property role="TrG5h" value="LanguageConceptSwitch" />
    <property role="1EXbeo" value="true" />
    <node concept="312cEg" id="2K" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="myIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="2X" role="1B3o_S" />
      <node concept="3uibUv" id="2Y" role="1tU5fm">
        <ref role="3uigEE" to="ksn4:~LanguageConceptIndex" resolve="LanguageConceptIndex" />
      </node>
    </node>
    <node concept="Wx3nA" id="2L" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ChildConceptWeave" />
      <node concept="3Tm1VV" id="2Z" role="1B3o_S" />
      <node concept="10Oyi0" id="30" role="1tU5fm" />
      <node concept="3cmrfG" id="31" role="33vP2m">
        <property role="3cmrfH" value="0" />
      </node>
    </node>
    <node concept="Wx3nA" id="2M" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ChildConceptWeaveEach" />
      <node concept="3Tm1VV" id="32" role="1B3o_S" />
      <node concept="10Oyi0" id="33" role="1tU5fm" />
      <node concept="3cmrfG" id="34" role="33vP2m">
        <property role="3cmrfH" value="1" />
      </node>
    </node>
    <node concept="Wx3nA" id="2N" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ChildConceptWeaveEachMany" />
      <node concept="3Tm1VV" id="35" role="1B3o_S" />
      <node concept="10Oyi0" id="36" role="1tU5fm" />
      <node concept="3cmrfG" id="37" role="33vP2m">
        <property role="3cmrfH" value="2" />
      </node>
    </node>
    <node concept="Wx3nA" id="2O" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="ChildConceptWeaveMany" />
      <node concept="3Tm1VV" id="38" role="1B3o_S" />
      <node concept="10Oyi0" id="39" role="1tU5fm" />
      <node concept="3cmrfG" id="3a" role="33vP2m">
        <property role="3cmrfH" value="3" />
      </node>
    </node>
    <node concept="Wx3nA" id="2P" role="jymVt">
      <property role="2dlcS1" value="false" />
      <property role="2dld4O" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="RootConcept" />
      <node concept="3Tm1VV" id="3b" role="1B3o_S" />
      <node concept="10Oyi0" id="3c" role="1tU5fm" />
      <node concept="3cmrfG" id="3d" role="33vP2m">
        <property role="3cmrfH" value="4" />
      </node>
    </node>
    <node concept="2tJIrI" id="2Q" role="jymVt" />
    <node concept="3clFbW" id="2R" role="jymVt">
      <node concept="3cqZAl" id="3e" role="3clF45" />
      <node concept="3Tm1VV" id="3f" role="1B3o_S" />
      <node concept="3clFbS" id="3g" role="3clF47">
        <node concept="3cpWs8" id="3h" role="3cqZAp">
          <node concept="3cpWsn" id="3o" role="3cpWs9">
            <property role="TrG5h" value="builder" />
            <node concept="3uibUv" id="3p" role="1tU5fm">
              <ref role="3uigEE" to="ksn4:~LanguageConceptIndexBuilder" resolve="LanguageConceptIndexBuilder" />
            </node>
            <node concept="2ShNRf" id="3q" role="33vP2m">
              <node concept="1pGfFk" id="3r" role="2ShVmc">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.&lt;init&gt;(long,long)" resolve="LanguageConceptIndexBuilder" />
                <node concept="1adDum" id="3s" role="37wK5m">
                  <property role="1adDun" value="0xce517356fc9a4e78L" />
                </node>
                <node concept="1adDum" id="3t" role="37wK5m">
                  <property role="1adDun" value="0x86066e7a36ff0671L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3i" role="3cqZAp">
          <node concept="2OqwBi" id="3u" role="3clFbG">
            <node concept="37vLTw" id="3v" role="2Oq$k0">
              <ref role="3cqZAo" node="3o" resolve="builder" />
            </node>
            <node concept="liA8E" id="3w" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="3x" role="37wK5m">
                <property role="1adDun" value="0x55da9f701c64f39cL" />
              </node>
              <node concept="37vLTw" id="3y" role="37wK5m">
                <ref role="3cqZAo" node="2L" resolve="ChildConceptWeave" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3j" role="3cqZAp">
          <node concept="2OqwBi" id="3z" role="3clFbG">
            <node concept="37vLTw" id="3$" role="2Oq$k0">
              <ref role="3cqZAo" node="3o" resolve="builder" />
            </node>
            <node concept="liA8E" id="3_" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="3A" role="37wK5m">
                <property role="1adDun" value="0x55da9f701c64f39aL" />
              </node>
              <node concept="37vLTw" id="3B" role="37wK5m">
                <ref role="3cqZAo" node="2M" resolve="ChildConceptWeaveEach" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3k" role="3cqZAp">
          <node concept="2OqwBi" id="3C" role="3clFbG">
            <node concept="37vLTw" id="3D" role="2Oq$k0">
              <ref role="3cqZAo" node="3o" resolve="builder" />
            </node>
            <node concept="liA8E" id="3E" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="3F" role="37wK5m">
                <property role="1adDun" value="0x55da9f701c681163L" />
              </node>
              <node concept="37vLTw" id="3G" role="37wK5m">
                <ref role="3cqZAo" node="2N" resolve="ChildConceptWeaveEachMany" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3l" role="3cqZAp">
          <node concept="2OqwBi" id="3H" role="3clFbG">
            <node concept="37vLTw" id="3I" role="2Oq$k0">
              <ref role="3cqZAo" node="3o" resolve="builder" />
            </node>
            <node concept="liA8E" id="3J" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="3K" role="37wK5m">
                <property role="1adDun" value="0x55da9f701c681159L" />
              </node>
              <node concept="37vLTw" id="3L" role="37wK5m">
                <ref role="3cqZAo" node="2O" resolve="ChildConceptWeaveMany" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3m" role="3cqZAp">
          <node concept="2OqwBi" id="3M" role="3clFbG">
            <node concept="37vLTw" id="3N" role="2Oq$k0">
              <ref role="3cqZAo" node="3o" resolve="builder" />
            </node>
            <node concept="liA8E" id="3O" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.put(long,int):jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder" resolve="put" />
              <node concept="1adDum" id="3P" role="37wK5m">
                <property role="1adDun" value="0x55da9f701c64caccL" />
              </node>
              <node concept="37vLTw" id="3Q" role="37wK5m">
                <ref role="3cqZAo" node="2P" resolve="RootConcept" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3n" role="3cqZAp">
          <node concept="37vLTI" id="3R" role="3clFbG">
            <node concept="2OqwBi" id="3S" role="37vLTx">
              <node concept="37vLTw" id="3U" role="2Oq$k0">
                <ref role="3cqZAo" node="3o" resolve="builder" />
              </node>
              <node concept="liA8E" id="3V" role="2OqNvi">
                <ref role="37wK5l" to="ksn4:~LanguageConceptIndexBuilder.seal():jetbrains.mps.lang.smodel.LanguageConceptIndex" resolve="seal" />
              </node>
            </node>
            <node concept="37vLTw" id="3T" role="37vLTJ">
              <ref role="3cqZAo" node="2K" resolve="myIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="2S" role="jymVt" />
    <node concept="3clFb_" id="2T" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="3W" role="3clF45" />
      <node concept="3clFbS" id="3X" role="3clF47">
        <node concept="3cpWs6" id="3Z" role="3cqZAp">
          <node concept="2OqwBi" id="40" role="3cqZAk">
            <node concept="37vLTw" id="41" role="2Oq$k0">
              <ref role="3cqZAo" node="2K" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="42" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~LanguageConceptIndex.index(jetbrains.mps.smodel.adapter.ids.SConceptId):int" resolve="index" />
              <node concept="37vLTw" id="43" role="37wK5m">
                <ref role="3cqZAo" node="3Y" resolve="cid" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3Y" role="3clF46">
        <property role="TrG5h" value="cid" />
        <node concept="3uibUv" id="44" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="2U" role="jymVt" />
    <node concept="3clFb_" id="2V" role="jymVt">
      <property role="TrG5h" value="index" />
      <node concept="10Oyi0" id="45" role="3clF45" />
      <node concept="3Tm1VV" id="46" role="1B3o_S" />
      <node concept="3clFbS" id="47" role="3clF47">
        <node concept="3cpWs6" id="49" role="3cqZAp">
          <node concept="2OqwBi" id="4a" role="3cqZAk">
            <node concept="37vLTw" id="4b" role="2Oq$k0">
              <ref role="3cqZAo" node="2K" resolve="myIndex" />
            </node>
            <node concept="liA8E" id="4c" role="2OqNvi">
              <ref role="37wK5l" to="ksn4:~ConceptIndex.index(org.jetbrains.mps.openapi.language.SAbstractConcept):int" resolve="index" />
              <node concept="37vLTw" id="4d" role="37wK5m">
                <ref role="3cqZAo" node="48" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="48" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3uibUv" id="4e" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="2W" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="4f">
    <property role="TrG5h" value="StructureAspectDescriptor" />
    <node concept="3uibUv" id="4g" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseStructureAspectDescriptor" resolve="BaseStructureAspectDescriptor" />
    </node>
    <node concept="312cEg" id="4h" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptChildConceptWeave" />
      <node concept="3uibUv" id="4A" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="4B" role="33vP2m">
        <ref role="37wK5l" node="4x" resolve="createDescriptorForChildConceptWeave" />
      </node>
    </node>
    <node concept="312cEg" id="4i" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptChildConceptWeaveEach" />
      <node concept="3uibUv" id="4C" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="4D" role="33vP2m">
        <ref role="37wK5l" node="4y" resolve="createDescriptorForChildConceptWeaveEach" />
      </node>
    </node>
    <node concept="312cEg" id="4j" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptChildConceptWeaveEachMany" />
      <node concept="3uibUv" id="4E" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="4F" role="33vP2m">
        <ref role="37wK5l" node="4z" resolve="createDescriptorForChildConceptWeaveEachMany" />
      </node>
    </node>
    <node concept="312cEg" id="4k" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptChildConceptWeaveMany" />
      <node concept="3uibUv" id="4G" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="4H" role="33vP2m">
        <ref role="37wK5l" node="4$" resolve="createDescriptorForChildConceptWeaveMany" />
      </node>
    </node>
    <node concept="312cEg" id="4l" role="jymVt">
      <property role="eg7rD" value="false" />
      <property role="34CwA1" value="false" />
      <property role="3TUv4t" value="true" />
      <property role="TrG5h" value="myConceptRootConcept" />
      <node concept="3uibUv" id="4I" role="1tU5fm">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="1rXfSq" id="4J" role="33vP2m">
        <ref role="37wK5l" node="4_" resolve="createDescriptorForRootConcept" />
      </node>
    </node>
    <node concept="312cEg" id="4m" role="jymVt">
      <property role="TrG5h" value="myConceptIndex" />
      <property role="3TUv4t" value="true" />
      <node concept="3Tm6S6" id="4K" role="1B3o_S" />
      <node concept="3uibUv" id="4L" role="1tU5fm">
        <ref role="3uigEE" node="2J" resolve="LanguageConceptSwitch" />
      </node>
    </node>
    <node concept="3Tm1VV" id="4n" role="1B3o_S" />
    <node concept="2tJIrI" id="4o" role="jymVt" />
    <node concept="3clFbW" id="4p" role="jymVt">
      <node concept="3cqZAl" id="4M" role="3clF45" />
      <node concept="3Tm1VV" id="4N" role="1B3o_S" />
      <node concept="3clFbS" id="4O" role="3clF47">
        <node concept="3clFbF" id="4P" role="3cqZAp">
          <node concept="37vLTI" id="4Q" role="3clFbG">
            <node concept="2ShNRf" id="4R" role="37vLTx">
              <node concept="1pGfFk" id="4T" role="2ShVmc">
                <ref role="37wK5l" node="2R" resolve="LanguageConceptSwitch" />
              </node>
            </node>
            <node concept="37vLTw" id="4S" role="37vLTJ">
              <ref role="3cqZAo" node="4m" resolve="myConceptIndex" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4q" role="jymVt" />
    <node concept="3clFb_" id="4r" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="od$2w" value="false" />
      <property role="TrG5h" value="getDescriptors" />
      <property role="DiZV1" value="false" />
      <node concept="3clFbS" id="4U" role="3clF47">
        <node concept="3cpWs6" id="4Y" role="3cqZAp">
          <node concept="2YIFZM" id="4Z" role="3cqZAk">
            <ref role="1Pybhc" to="33ny:~Arrays" resolve="Arrays" />
            <ref role="37wK5l" to="33ny:~Arrays.asList(java.lang.Object...):java.util.List" resolve="asList" />
            <node concept="37vLTw" id="50" role="37wK5m">
              <ref role="3cqZAo" node="4h" resolve="myConceptChildConceptWeave" />
            </node>
            <node concept="37vLTw" id="51" role="37wK5m">
              <ref role="3cqZAo" node="4i" resolve="myConceptChildConceptWeaveEach" />
            </node>
            <node concept="37vLTw" id="52" role="37wK5m">
              <ref role="3cqZAo" node="4j" resolve="myConceptChildConceptWeaveEachMany" />
            </node>
            <node concept="37vLTw" id="53" role="37wK5m">
              <ref role="3cqZAo" node="4k" resolve="myConceptChildConceptWeaveMany" />
            </node>
            <node concept="37vLTw" id="54" role="37wK5m">
              <ref role="3cqZAo" node="4l" resolve="myConceptRootConcept" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4V" role="1B3o_S" />
      <node concept="3uibUv" id="4W" role="3clF45">
        <ref role="3uigEE" to="33ny:~Collection" resolve="Collection" />
        <node concept="3uibUv" id="55" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
        </node>
      </node>
      <node concept="2AHcQZ" id="4X" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="2tJIrI" id="4s" role="jymVt" />
    <node concept="3clFb_" id="4t" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getDescriptor" />
      <property role="DiZV1" value="false" />
      <node concept="3Tm1VV" id="56" role="1B3o_S" />
      <node concept="37vLTG" id="57" role="3clF46">
        <property role="TrG5h" value="id" />
        <node concept="3uibUv" id="5c" role="1tU5fm">
          <ref role="3uigEE" to="e8bb:~SConceptId" resolve="SConceptId" />
        </node>
      </node>
      <node concept="3clFbS" id="58" role="3clF47">
        <node concept="3KaCP$" id="5d" role="3cqZAp">
          <node concept="3KbdKl" id="5e" role="3KbHQx">
            <node concept="3clFbS" id="5l" role="3Kbo56">
              <node concept="3cpWs6" id="5n" role="3cqZAp">
                <node concept="37vLTw" id="5o" role="3cqZAk">
                  <ref role="3cqZAo" node="4h" resolve="myConceptChildConceptWeave" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="5m" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2L" resolve="ChildConceptWeave" />
            </node>
          </node>
          <node concept="3KbdKl" id="5f" role="3KbHQx">
            <node concept="3clFbS" id="5p" role="3Kbo56">
              <node concept="3cpWs6" id="5r" role="3cqZAp">
                <node concept="37vLTw" id="5s" role="3cqZAk">
                  <ref role="3cqZAo" node="4i" resolve="myConceptChildConceptWeaveEach" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="5q" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2M" resolve="ChildConceptWeaveEach" />
            </node>
          </node>
          <node concept="3KbdKl" id="5g" role="3KbHQx">
            <node concept="3clFbS" id="5t" role="3Kbo56">
              <node concept="3cpWs6" id="5v" role="3cqZAp">
                <node concept="37vLTw" id="5w" role="3cqZAk">
                  <ref role="3cqZAo" node="4j" resolve="myConceptChildConceptWeaveEachMany" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="5u" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2N" resolve="ChildConceptWeaveEachMany" />
            </node>
          </node>
          <node concept="3KbdKl" id="5h" role="3KbHQx">
            <node concept="3clFbS" id="5x" role="3Kbo56">
              <node concept="3cpWs6" id="5z" role="3cqZAp">
                <node concept="37vLTw" id="5$" role="3cqZAk">
                  <ref role="3cqZAo" node="4k" resolve="myConceptChildConceptWeaveMany" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="5y" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2O" resolve="ChildConceptWeaveMany" />
            </node>
          </node>
          <node concept="3KbdKl" id="5i" role="3KbHQx">
            <node concept="3clFbS" id="5_" role="3Kbo56">
              <node concept="3cpWs6" id="5B" role="3cqZAp">
                <node concept="37vLTw" id="5C" role="3cqZAk">
                  <ref role="3cqZAo" node="4l" resolve="myConceptRootConcept" />
                </node>
              </node>
            </node>
            <node concept="10M0yZ" id="5A" role="3Kbmr1">
              <ref role="1PxDUh" node="2J" resolve="LanguageConceptSwitch" />
              <ref role="3cqZAo" node="2P" resolve="RootConcept" />
            </node>
          </node>
          <node concept="2OqwBi" id="5j" role="3KbGdf">
            <node concept="37vLTw" id="5D" role="2Oq$k0">
              <ref role="3cqZAo" node="4m" resolve="myConceptIndex" />
            </node>
            <node concept="liA8E" id="5E" role="2OqNvi">
              <ref role="37wK5l" node="2T" resolve="index" />
              <node concept="37vLTw" id="5F" role="37wK5m">
                <ref role="3cqZAo" node="57" resolve="id" />
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="5k" role="3Kb1Dw">
            <node concept="3cpWs6" id="5G" role="3cqZAp">
              <node concept="10Nm6u" id="5H" role="3cqZAk" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3uibUv" id="59" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
      <node concept="2AHcQZ" id="5a" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="5b" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
      </node>
    </node>
    <node concept="2tJIrI" id="4u" role="jymVt" />
    <node concept="3clFb_" id="4v" role="jymVt">
      <property role="TrG5h" value="internalIndex" />
      <node concept="10Oyi0" id="5I" role="3clF45" />
      <node concept="3clFbS" id="5J" role="3clF47">
        <node concept="3cpWs6" id="5L" role="3cqZAp">
          <node concept="2OqwBi" id="5M" role="3cqZAk">
            <node concept="37vLTw" id="5N" role="2Oq$k0">
              <ref role="3cqZAo" node="4m" resolve="myConceptIndex" />
            </node>
            <node concept="liA8E" id="5O" role="2OqNvi">
              <ref role="37wK5l" node="2V" resolve="index" />
              <node concept="37vLTw" id="5P" role="37wK5m">
                <ref role="3cqZAo" node="5K" resolve="c" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="5K" role="3clF46">
        <property role="TrG5h" value="c" />
        <node concept="3uibUv" id="5Q" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4w" role="jymVt" />
    <node concept="2YIFZL" id="4x" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForChildConceptWeave" />
      <node concept="3clFbS" id="5R" role="3clF47">
        <node concept="3cpWs8" id="5U" role="3cqZAp">
          <node concept="3cpWsn" id="5Z" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="60" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="61" role="33vP2m">
              <node concept="1pGfFk" id="62" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="63" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.traceInfo.testWeavingGenerated.data" />
                </node>
                <node concept="Xl_RD" id="64" role="37wK5m">
                  <property role="Xl_RC" value="ChildConceptWeave" />
                </node>
                <node concept="1adDum" id="65" role="37wK5m">
                  <property role="1adDun" value="0xce517356fc9a4e78L" />
                </node>
                <node concept="1adDum" id="66" role="37wK5m">
                  <property role="1adDun" value="0x86066e7a36ff0671L" />
                </node>
                <node concept="1adDum" id="67" role="37wK5m">
                  <property role="1adDun" value="0x55da9f701c64f39cL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5V" role="3cqZAp">
          <node concept="2OqwBi" id="68" role="3clFbG">
            <node concept="37vLTw" id="69" role="2Oq$k0">
              <ref role="3cqZAo" node="5Z" resolve="b" />
            </node>
            <node concept="liA8E" id="6a" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="6b" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="6c" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="6d" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5W" role="3cqZAp">
          <node concept="2OqwBi" id="6e" role="3clFbG">
            <node concept="37vLTw" id="6f" role="2Oq$k0">
              <ref role="3cqZAo" node="5Z" resolve="b" />
            </node>
            <node concept="liA8E" id="6g" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="6h" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="6i" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="6j" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5X" role="3cqZAp">
          <node concept="2OqwBi" id="6k" role="3clFbG">
            <node concept="37vLTw" id="6l" role="2Oq$k0">
              <ref role="3cqZAo" node="5Z" resolve="b" />
            </node>
            <node concept="liA8E" id="6m" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="6n" role="37wK5m">
                <property role="Xl_RC" value="r:b8c93b44-499b-404a-a011-c0847b38eb58(jetbrains.mps.traceInfo.testWeavingGenerated.data.structure)/6186432342008329116" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="5Y" role="3cqZAp">
          <node concept="2OqwBi" id="6o" role="3cqZAk">
            <node concept="37vLTw" id="6p" role="2Oq$k0">
              <ref role="3cqZAo" node="5Z" resolve="b" />
            </node>
            <node concept="liA8E" id="6q" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="5S" role="1B3o_S" />
      <node concept="3uibUv" id="5T" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="4y" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForChildConceptWeaveEach" />
      <node concept="3clFbS" id="6r" role="3clF47">
        <node concept="3cpWs8" id="6u" role="3cqZAp">
          <node concept="3cpWsn" id="6z" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="6$" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="6_" role="33vP2m">
              <node concept="1pGfFk" id="6A" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="6B" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.traceInfo.testWeavingGenerated.data" />
                </node>
                <node concept="Xl_RD" id="6C" role="37wK5m">
                  <property role="Xl_RC" value="ChildConceptWeaveEach" />
                </node>
                <node concept="1adDum" id="6D" role="37wK5m">
                  <property role="1adDun" value="0xce517356fc9a4e78L" />
                </node>
                <node concept="1adDum" id="6E" role="37wK5m">
                  <property role="1adDun" value="0x86066e7a36ff0671L" />
                </node>
                <node concept="1adDum" id="6F" role="37wK5m">
                  <property role="1adDun" value="0x55da9f701c64f39aL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6v" role="3cqZAp">
          <node concept="2OqwBi" id="6G" role="3clFbG">
            <node concept="37vLTw" id="6H" role="2Oq$k0">
              <ref role="3cqZAo" node="6z" resolve="b" />
            </node>
            <node concept="liA8E" id="6I" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="6J" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="6K" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="6L" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6w" role="3cqZAp">
          <node concept="2OqwBi" id="6M" role="3clFbG">
            <node concept="37vLTw" id="6N" role="2Oq$k0">
              <ref role="3cqZAo" node="6z" resolve="b" />
            </node>
            <node concept="liA8E" id="6O" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="6P" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="6Q" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="6R" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6x" role="3cqZAp">
          <node concept="2OqwBi" id="6S" role="3clFbG">
            <node concept="37vLTw" id="6T" role="2Oq$k0">
              <ref role="3cqZAo" node="6z" resolve="b" />
            </node>
            <node concept="liA8E" id="6U" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="6V" role="37wK5m">
                <property role="Xl_RC" value="r:b8c93b44-499b-404a-a011-c0847b38eb58(jetbrains.mps.traceInfo.testWeavingGenerated.data.structure)/6186432342008329114" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="6y" role="3cqZAp">
          <node concept="2OqwBi" id="6W" role="3cqZAk">
            <node concept="37vLTw" id="6X" role="2Oq$k0">
              <ref role="3cqZAo" node="6z" resolve="b" />
            </node>
            <node concept="liA8E" id="6Y" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="6s" role="1B3o_S" />
      <node concept="3uibUv" id="6t" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="4z" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForChildConceptWeaveEachMany" />
      <node concept="3clFbS" id="6Z" role="3clF47">
        <node concept="3cpWs8" id="72" role="3cqZAp">
          <node concept="3cpWsn" id="77" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="78" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="79" role="33vP2m">
              <node concept="1pGfFk" id="7a" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="7b" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.traceInfo.testWeavingGenerated.data" />
                </node>
                <node concept="Xl_RD" id="7c" role="37wK5m">
                  <property role="Xl_RC" value="ChildConceptWeaveEachMany" />
                </node>
                <node concept="1adDum" id="7d" role="37wK5m">
                  <property role="1adDun" value="0xce517356fc9a4e78L" />
                </node>
                <node concept="1adDum" id="7e" role="37wK5m">
                  <property role="1adDun" value="0x86066e7a36ff0671L" />
                </node>
                <node concept="1adDum" id="7f" role="37wK5m">
                  <property role="1adDun" value="0x55da9f701c681163L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="73" role="3cqZAp">
          <node concept="2OqwBi" id="7g" role="3clFbG">
            <node concept="37vLTw" id="7h" role="2Oq$k0">
              <ref role="3cqZAo" node="77" resolve="b" />
            </node>
            <node concept="liA8E" id="7i" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="7j" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="7k" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="7l" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="74" role="3cqZAp">
          <node concept="2OqwBi" id="7m" role="3clFbG">
            <node concept="37vLTw" id="7n" role="2Oq$k0">
              <ref role="3cqZAo" node="77" resolve="b" />
            </node>
            <node concept="liA8E" id="7o" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="7p" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="7q" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="7r" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="75" role="3cqZAp">
          <node concept="2OqwBi" id="7s" role="3clFbG">
            <node concept="37vLTw" id="7t" role="2Oq$k0">
              <ref role="3cqZAo" node="77" resolve="b" />
            </node>
            <node concept="liA8E" id="7u" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="7v" role="37wK5m">
                <property role="Xl_RC" value="r:b8c93b44-499b-404a-a011-c0847b38eb58(jetbrains.mps.traceInfo.testWeavingGenerated.data.structure)/6186432342008533347" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="76" role="3cqZAp">
          <node concept="2OqwBi" id="7w" role="3cqZAk">
            <node concept="37vLTw" id="7x" role="2Oq$k0">
              <ref role="3cqZAo" node="77" resolve="b" />
            </node>
            <node concept="liA8E" id="7y" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="70" role="1B3o_S" />
      <node concept="3uibUv" id="71" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="4$" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForChildConceptWeaveMany" />
      <node concept="3clFbS" id="7z" role="3clF47">
        <node concept="3cpWs8" id="7A" role="3cqZAp">
          <node concept="3cpWsn" id="7F" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="7G" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="7H" role="33vP2m">
              <node concept="1pGfFk" id="7I" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="7J" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.traceInfo.testWeavingGenerated.data" />
                </node>
                <node concept="Xl_RD" id="7K" role="37wK5m">
                  <property role="Xl_RC" value="ChildConceptWeaveMany" />
                </node>
                <node concept="1adDum" id="7L" role="37wK5m">
                  <property role="1adDun" value="0xce517356fc9a4e78L" />
                </node>
                <node concept="1adDum" id="7M" role="37wK5m">
                  <property role="1adDun" value="0x86066e7a36ff0671L" />
                </node>
                <node concept="1adDum" id="7N" role="37wK5m">
                  <property role="1adDun" value="0x55da9f701c681159L" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7B" role="3cqZAp">
          <node concept="2OqwBi" id="7O" role="3clFbG">
            <node concept="37vLTw" id="7P" role="2Oq$k0">
              <ref role="3cqZAo" node="7F" resolve="b" />
            </node>
            <node concept="liA8E" id="7Q" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="7R" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="7S" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="7T" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7C" role="3cqZAp">
          <node concept="2OqwBi" id="7U" role="3clFbG">
            <node concept="37vLTw" id="7V" role="2Oq$k0">
              <ref role="3cqZAo" node="7F" resolve="b" />
            </node>
            <node concept="liA8E" id="7W" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="7X" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="7Y" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="7Z" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7D" role="3cqZAp">
          <node concept="2OqwBi" id="80" role="3clFbG">
            <node concept="37vLTw" id="81" role="2Oq$k0">
              <ref role="3cqZAo" node="7F" resolve="b" />
            </node>
            <node concept="liA8E" id="82" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="83" role="37wK5m">
                <property role="Xl_RC" value="r:b8c93b44-499b-404a-a011-c0847b38eb58(jetbrains.mps.traceInfo.testWeavingGenerated.data.structure)/6186432342008533337" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="7E" role="3cqZAp">
          <node concept="2OqwBi" id="84" role="3cqZAk">
            <node concept="37vLTw" id="85" role="2Oq$k0">
              <ref role="3cqZAo" node="7F" resolve="b" />
            </node>
            <node concept="liA8E" id="86" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="7$" role="1B3o_S" />
      <node concept="3uibUv" id="7_" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
    <node concept="2YIFZL" id="4_" role="jymVt">
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <property role="TrG5h" value="createDescriptorForRootConcept" />
      <node concept="3clFbS" id="87" role="3clF47">
        <node concept="3cpWs8" id="8a" role="3cqZAp">
          <node concept="3cpWsn" id="8j" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="3uibUv" id="8k" role="1tU5fm">
              <ref role="3uigEE" to="bzg8:~ConceptDescriptorBuilder2" resolve="ConceptDescriptorBuilder2" />
            </node>
            <node concept="2ShNRf" id="8l" role="33vP2m">
              <node concept="1pGfFk" id="8m" role="2ShVmc">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.&lt;init&gt;(java.lang.String,java.lang.String,long,long,long)" resolve="ConceptDescriptorBuilder2" />
                <node concept="Xl_RD" id="8n" role="37wK5m">
                  <property role="Xl_RC" value="jetbrains.mps.traceInfo.testWeavingGenerated.data" />
                </node>
                <node concept="Xl_RD" id="8o" role="37wK5m">
                  <property role="Xl_RC" value="RootConcept" />
                </node>
                <node concept="1adDum" id="8p" role="37wK5m">
                  <property role="1adDun" value="0xce517356fc9a4e78L" />
                </node>
                <node concept="1adDum" id="8q" role="37wK5m">
                  <property role="1adDun" value="0x86066e7a36ff0671L" />
                </node>
                <node concept="1adDum" id="8r" role="37wK5m">
                  <property role="1adDun" value="0x55da9f701c64caccL" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8b" role="3cqZAp">
          <node concept="2OqwBi" id="8s" role="3clFbG">
            <node concept="37vLTw" id="8t" role="2Oq$k0">
              <ref role="3cqZAo" node="8j" resolve="b" />
            </node>
            <node concept="liA8E" id="8u" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.class_(boolean,boolean,boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="class_" />
              <node concept="3clFbT" id="8v" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="8w" role="37wK5m">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbT" id="8x" role="37wK5m">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8c" role="3cqZAp">
          <node concept="2OqwBi" id="8y" role="3clFbG">
            <node concept="37vLTw" id="8z" role="2Oq$k0">
              <ref role="3cqZAo" node="8j" resolve="b" />
            </node>
            <node concept="liA8E" id="8$" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.parent(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="parent" />
              <node concept="1adDum" id="8_" role="37wK5m">
                <property role="1adDun" value="0xceab519525ea4f22L" />
              </node>
              <node concept="1adDum" id="8A" role="37wK5m">
                <property role="1adDun" value="0x9b92103b95ca8c0cL" />
              </node>
              <node concept="1adDum" id="8B" role="37wK5m">
                <property role="1adDun" value="0x110396eaaa4L" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8d" role="3cqZAp">
          <node concept="2OqwBi" id="8C" role="3clFbG">
            <node concept="37vLTw" id="8D" role="2Oq$k0">
              <ref role="3cqZAo" node="8j" resolve="b" />
            </node>
            <node concept="liA8E" id="8E" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="origin" />
              <node concept="Xl_RD" id="8F" role="37wK5m">
                <property role="Xl_RC" value="r:b8c93b44-499b-404a-a011-c0847b38eb58(jetbrains.mps.traceInfo.testWeavingGenerated.data.structure)/6186432342008318668" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8e" role="3cqZAp">
          <node concept="2OqwBi" id="8G" role="3clFbG">
            <node concept="2OqwBi" id="8H" role="2Oq$k0">
              <node concept="2OqwBi" id="8J" role="2Oq$k0">
                <node concept="2OqwBi" id="8L" role="2Oq$k0">
                  <node concept="2OqwBi" id="8N" role="2Oq$k0">
                    <node concept="2OqwBi" id="8P" role="2Oq$k0">
                      <node concept="2OqwBi" id="8R" role="2Oq$k0">
                        <node concept="37vLTw" id="8T" role="2Oq$k0">
                          <ref role="3cqZAo" node="8j" resolve="b" />
                        </node>
                        <node concept="liA8E" id="8U" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="8V" role="37wK5m">
                            <property role="Xl_RC" value="weave" />
                          </node>
                          <node concept="1adDum" id="8W" role="37wK5m">
                            <property role="1adDun" value="0x55da9f701c64f39eL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="8S" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="8X" role="37wK5m">
                          <property role="1adDun" value="0xce517356fc9a4e78L" />
                        </node>
                        <node concept="1adDum" id="8Y" role="37wK5m">
                          <property role="1adDun" value="0x86066e7a36ff0671L" />
                        </node>
                        <node concept="1adDum" id="8Z" role="37wK5m">
                          <property role="1adDun" value="0x55da9f701c64f39cL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="8Q" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="90" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="8O" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="91" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="8M" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="92" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="8K" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="93" role="37wK5m">
                  <property role="Xl_RC" value="6186432342008329118" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="8I" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8f" role="3cqZAp">
          <node concept="2OqwBi" id="94" role="3clFbG">
            <node concept="2OqwBi" id="95" role="2Oq$k0">
              <node concept="2OqwBi" id="97" role="2Oq$k0">
                <node concept="2OqwBi" id="99" role="2Oq$k0">
                  <node concept="2OqwBi" id="9b" role="2Oq$k0">
                    <node concept="2OqwBi" id="9d" role="2Oq$k0">
                      <node concept="2OqwBi" id="9f" role="2Oq$k0">
                        <node concept="37vLTw" id="9h" role="2Oq$k0">
                          <ref role="3cqZAo" node="8j" resolve="b" />
                        </node>
                        <node concept="liA8E" id="9i" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="9j" role="37wK5m">
                            <property role="Xl_RC" value="weaveEach" />
                          </node>
                          <node concept="1adDum" id="9k" role="37wK5m">
                            <property role="1adDun" value="0x55da9f701c64f39fL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="9g" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="9l" role="37wK5m">
                          <property role="1adDun" value="0xce517356fc9a4e78L" />
                        </node>
                        <node concept="1adDum" id="9m" role="37wK5m">
                          <property role="1adDun" value="0x86066e7a36ff0671L" />
                        </node>
                        <node concept="1adDum" id="9n" role="37wK5m">
                          <property role="1adDun" value="0x55da9f701c64f39aL" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="9e" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="9o" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="9c" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="9p" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="9a" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="9q" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="98" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="9r" role="37wK5m">
                  <property role="Xl_RC" value="6186432342008329119" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="96" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8g" role="3cqZAp">
          <node concept="2OqwBi" id="9s" role="3clFbG">
            <node concept="2OqwBi" id="9t" role="2Oq$k0">
              <node concept="2OqwBi" id="9v" role="2Oq$k0">
                <node concept="2OqwBi" id="9x" role="2Oq$k0">
                  <node concept="2OqwBi" id="9z" role="2Oq$k0">
                    <node concept="2OqwBi" id="9_" role="2Oq$k0">
                      <node concept="2OqwBi" id="9B" role="2Oq$k0">
                        <node concept="37vLTw" id="9D" role="2Oq$k0">
                          <ref role="3cqZAo" node="8j" resolve="b" />
                        </node>
                        <node concept="liA8E" id="9E" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="9F" role="37wK5m">
                            <property role="Xl_RC" value="weaveMany" />
                          </node>
                          <node concept="1adDum" id="9G" role="37wK5m">
                            <property role="1adDun" value="0x55da9f701c68116eL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="9C" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="9H" role="37wK5m">
                          <property role="1adDun" value="0xce517356fc9a4e78L" />
                        </node>
                        <node concept="1adDum" id="9I" role="37wK5m">
                          <property role="1adDun" value="0x86066e7a36ff0671L" />
                        </node>
                        <node concept="1adDum" id="9J" role="37wK5m">
                          <property role="1adDun" value="0x55da9f701c681159L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="9A" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="9K" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="9$" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="9L" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="9y" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="9M" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="9w" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="9N" role="37wK5m">
                  <property role="Xl_RC" value="6186432342008533358" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="9u" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8h" role="3cqZAp">
          <node concept="2OqwBi" id="9O" role="3clFbG">
            <node concept="2OqwBi" id="9P" role="2Oq$k0">
              <node concept="2OqwBi" id="9R" role="2Oq$k0">
                <node concept="2OqwBi" id="9T" role="2Oq$k0">
                  <node concept="2OqwBi" id="9V" role="2Oq$k0">
                    <node concept="2OqwBi" id="9X" role="2Oq$k0">
                      <node concept="2OqwBi" id="9Z" role="2Oq$k0">
                        <node concept="37vLTw" id="a1" role="2Oq$k0">
                          <ref role="3cqZAo" node="8j" resolve="b" />
                        </node>
                        <node concept="liA8E" id="a2" role="2OqNvi">
                          <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.aggregate(java.lang.String,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="aggregate" />
                          <node concept="Xl_RD" id="a3" role="37wK5m">
                            <property role="Xl_RC" value="weaveEachMany" />
                          </node>
                          <node concept="1adDum" id="a4" role="37wK5m">
                            <property role="1adDun" value="0x55da9f701c68116fL" />
                          </node>
                        </node>
                      </node>
                      <node concept="liA8E" id="a0" role="2OqNvi">
                        <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.target(long,long,long):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="target" />
                        <node concept="1adDum" id="a5" role="37wK5m">
                          <property role="1adDun" value="0xce517356fc9a4e78L" />
                        </node>
                        <node concept="1adDum" id="a6" role="37wK5m">
                          <property role="1adDun" value="0x86066e7a36ff0671L" />
                        </node>
                        <node concept="1adDum" id="a7" role="37wK5m">
                          <property role="1adDun" value="0x55da9f701c681163L" />
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="9Y" role="2OqNvi">
                      <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.optional(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="optional" />
                      <node concept="3clFbT" id="a8" role="37wK5m">
                        <property role="3clFbU" value="true" />
                      </node>
                    </node>
                  </node>
                  <node concept="liA8E" id="9W" role="2OqNvi">
                    <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.ordered(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="ordered" />
                    <node concept="3clFbT" id="a9" role="37wK5m">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="liA8E" id="9U" role="2OqNvi">
                  <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.multiple(boolean):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="multiple" />
                  <node concept="3clFbT" id="aa" role="37wK5m">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
              <node concept="liA8E" id="9S" role="2OqNvi">
                <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.origin(java.lang.String):jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2$AggregationLinkBuilder" resolve="origin" />
                <node concept="Xl_RD" id="ab" role="37wK5m">
                  <property role="Xl_RC" value="6186432342008533359" />
                </node>
              </node>
            </node>
            <node concept="liA8E" id="9Q" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2$AggregationLinkBuilder.done():jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2" resolve="done" />
            </node>
          </node>
        </node>
        <node concept="3cpWs6" id="8i" role="3cqZAp">
          <node concept="2OqwBi" id="ac" role="3cqZAk">
            <node concept="37vLTw" id="ad" role="2Oq$k0">
              <ref role="3cqZAo" node="8j" resolve="b" />
            </node>
            <node concept="liA8E" id="ae" role="2OqNvi">
              <ref role="37wK5l" to="bzg8:~ConceptDescriptorBuilder2.create():jetbrains.mps.smodel.runtime.ConceptDescriptor" resolve="create" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm6S6" id="88" role="1B3o_S" />
      <node concept="3uibUv" id="89" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConceptDescriptor" resolve="ConceptDescriptor" />
      </node>
    </node>
  </node>
</model>

