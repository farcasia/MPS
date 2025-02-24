<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:57494669-3aca-4a91-9957-81c283ecd636(jetbrains.mps.lang.core.util)">
  <persistence version="9" />
  <languages>
    <use id="1a8554c4-eb84-43ba-8c34-6f0d90c6e75a" name="jetbrains.mps.lang.smodel.query" version="3" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="tpcu" ref="r:00000000-0000-4000-0000-011c89590282(jetbrains.mps.lang.core.behavior)" />
    <import index="b3bi" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.editor.runtime.impl.cellActions(MPS.Editor/)" />
    <import index="6f4m" ref="528ff3b9-5fc4-40dd-931f-c6ce3650640e/r:f69c3fa1-0e30-4980-84e2-190ae44e4c3d(jetbrains.mps.lang.migration.runtime/jetbrains.mps.lang.migration.runtime.base)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
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
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
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
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
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
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
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
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
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
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1143224066846" name="jetbrains.mps.lang.smodel.structure.Node_InsertNextSiblingOperation" flags="nn" index="HtI8k">
        <child id="1143224066849" name="insertedNode" index="HtI8F" />
      </concept>
      <concept id="1171305280644" name="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" flags="nn" index="2Rf3mk" />
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz">
        <reference id="6677504323281689839" name="conceptDeclaraton" index="3bZ5Sy" />
      </concept>
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
      <concept id="1228341669568" name="jetbrains.mps.lang.smodel.structure.Node_DetachOperation" flags="nn" index="3YRAZt" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="1a8554c4-eb84-43ba-8c34-6f0d90c6e75a" name="jetbrains.mps.lang.smodel.query">
      <concept id="7738379549910147341" name="jetbrains.mps.lang.smodel.query.structure.InstancesExpression" flags="ng" index="qVDSY">
        <child id="7738379549910147342" name="conceptArg" index="qVDSX" />
      </concept>
      <concept id="4234138103881610891" name="jetbrains.mps.lang.smodel.query.structure.WithStatement" flags="ng" index="L3pyB">
        <child id="4234138103881610935" name="scope" index="L3pyr" />
        <child id="4234138103881610892" name="stmts" index="L3pyw" />
      </concept>
      <concept id="4307205004131544317" name="jetbrains.mps.lang.smodel.query.structure.QueryExpression" flags="ng" index="1dNuzs">
        <child id="4307205004132279624" name="parameter" index="1dOa5D" />
      </concept>
      <concept id="4307205004132277753" name="jetbrains.mps.lang.smodel.query.structure.QueryParameterList" flags="ng" index="1dO9Bo" />
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="1151689724996" name="jetbrains.mps.baseLanguage.collections.structure.SequenceType" flags="in" index="A3Dl8">
        <child id="1151689745422" name="elementType" index="A3Ik2" />
      </concept>
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1201792049884" name="jetbrains.mps.baseLanguage.collections.structure.TranslateOperation" flags="nn" index="3goQfb" />
      <concept id="1202128969694" name="jetbrains.mps.baseLanguage.collections.structure.SelectOperation" flags="nn" index="3$u5V9" />
      <concept id="1176501494711" name="jetbrains.mps.baseLanguage.collections.structure.IsNotEmptyOperation" flags="nn" index="3GX2aA" />
    </language>
  </registry>
  <node concept="312cEu" id="ANVkWUi_zK">
    <property role="TrG5h" value="OldCommentContainerMigration" />
    <node concept="312cEg" id="ANVkWUi_XF" role="jymVt">
      <property role="TrG5h" value="concept" />
      <node concept="3Tm6S6" id="ANVkWUi_XD" role="1B3o_S" />
      <node concept="3bZ5Sz" id="ANVkWUi_XE" role="1tU5fm">
        <ref role="3bZ5Sy" to="tpck:3$Sh7m_tmYK" resolve="IOldCommentContainer" />
      </node>
    </node>
    <node concept="312cEg" id="ANVkWUiA1A" role="jymVt">
      <property role="TrG5h" value="module" />
      <node concept="3Tm6S6" id="ANVkWUiA1$" role="1B3o_S" />
      <node concept="3uibUv" id="ANVkWUiA1_" role="1tU5fm">
        <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
      </node>
    </node>
    <node concept="3clFbW" id="ANVkWUi_$c" role="jymVt">
      <node concept="3cqZAl" id="ANVkWUi_$e" role="3clF45" />
      <node concept="3Tm1VV" id="ANVkWUi_$f" role="1B3o_S" />
      <node concept="3clFbS" id="ANVkWUi_$g" role="3clF47">
        <node concept="3clFbF" id="ANVkWUi_XM" role="3cqZAp">
          <node concept="37vLTI" id="ANVkWUi_XN" role="3clFbG">
            <node concept="2OqwBi" id="ANVkWUi_XO" role="37vLTJ">
              <node concept="Xjq3P" id="ANVkWUi_XP" role="2Oq$k0" />
              <node concept="2OwXpG" id="ANVkWUi_XQ" role="2OqNvi">
                <ref role="2Oxat5" node="ANVkWUi_XF" resolve="concept" />
              </node>
            </node>
            <node concept="37vLTw" id="ANVkWUi_XR" role="37vLTx">
              <ref role="3cqZAo" node="ANVkWUi_$A" resolve="concept" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ANVkWUiA1H" role="3cqZAp">
          <node concept="37vLTI" id="ANVkWUiA1I" role="3clFbG">
            <node concept="2OqwBi" id="ANVkWUiA1J" role="37vLTJ">
              <node concept="Xjq3P" id="ANVkWUiA1K" role="2Oq$k0" />
              <node concept="2OwXpG" id="ANVkWUiA1L" role="2OqNvi">
                <ref role="2Oxat5" node="ANVkWUiA1A" resolve="module" />
              </node>
            </node>
            <node concept="37vLTw" id="ANVkWUiA1M" role="37vLTx">
              <ref role="3cqZAo" node="ANVkWUi_$Y" resolve="module" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="ANVkWUi_$A" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="ANVkWUi_$_" role="1tU5fm">
          <ref role="3bZ5Sy" to="tpck:3$Sh7m_tmYK" resolve="IOldCommentContainer" />
        </node>
        <node concept="2AHcQZ" id="ANVkWUiAal" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
      <node concept="37vLTG" id="ANVkWUi_$Y" role="3clF46">
        <property role="TrG5h" value="module" />
        <node concept="3uibUv" id="ANVkWUi_Gj" role="1tU5fm">
          <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
        </node>
        <node concept="2AHcQZ" id="ANVkWUiAtx" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="ANVkWUiA4N" role="jymVt" />
    <node concept="3clFb_" id="ANVkWUiA8L" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="migrate" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="ANVkWUiA8O" role="3clF47">
        <node concept="3cpWs8" id="ANVkWUiO6g" role="3cqZAp">
          <node concept="3cpWsn" id="ANVkWUiO6h" role="3cpWs9">
            <property role="TrG5h" value="oldComments" />
            <node concept="A3Dl8" id="ANVkWUiO5b" role="1tU5fm">
              <node concept="3Tqbb2" id="ANVkWUiO5e" role="A3Ik2" />
            </node>
            <node concept="2OqwBi" id="ANVkWUiO6i" role="33vP2m">
              <node concept="2OqwBi" id="ANVkWUiO6j" role="2Oq$k0">
                <node concept="1eOMI4" id="ANVkWUiO6k" role="2Oq$k0">
                  <node concept="10QFUN" id="ANVkWUiO6l" role="1eOMHV">
                    <node concept="2OqwBi" id="ANVkWUiO6m" role="10QFUP">
                      <node concept="37vLTw" id="ANVkWUiO6n" role="2Oq$k0">
                        <ref role="3cqZAo" node="ANVkWUiA1A" resolve="module" />
                      </node>
                      <node concept="liA8E" id="ANVkWUiO6o" role="2OqNvi">
                        <ref role="37wK5l" to="lui2:~SModule.getModels():java.lang.Iterable" resolve="getModels" />
                      </node>
                    </node>
                    <node concept="A3Dl8" id="ANVkWUiO6p" role="10QFUM">
                      <node concept="3uibUv" id="ANVkWUiO6q" role="A3Ik2">
                        <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3goQfb" id="ANVkWUiO6r" role="2OqNvi">
                  <node concept="1bVj0M" id="ANVkWUiO6s" role="23t8la">
                    <node concept="3clFbS" id="ANVkWUiO6t" role="1bW5cS">
                      <node concept="3clFbF" id="ANVkWUiO6u" role="3cqZAp">
                        <node concept="2OqwBi" id="ANVkWUiO6v" role="3clFbG">
                          <node concept="37vLTw" id="ANVkWUiO6w" role="2Oq$k0">
                            <ref role="3cqZAo" node="ANVkWUiO6y" resolve="it" />
                          </node>
                          <node concept="liA8E" id="ANVkWUiO6x" role="2OqNvi">
                            <ref role="37wK5l" to="mhbf:~SModel.getRootNodes():java.lang.Iterable" resolve="getRootNodes" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="ANVkWUiO6y" role="1bW2Oz">
                      <property role="TrG5h" value="it" />
                      <node concept="2jxLKc" id="ANVkWUiO6z" role="1tU5fm" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3goQfb" id="ANVkWUiO6$" role="2OqNvi">
                <node concept="1bVj0M" id="ANVkWUiO6_" role="23t8la">
                  <node concept="3clFbS" id="ANVkWUiO6A" role="1bW5cS">
                    <node concept="3clFbF" id="ANVkWUiO6B" role="3cqZAp">
                      <node concept="2OqwBi" id="ANVkWUiO6D" role="3clFbG">
                        <node concept="1eOMI4" id="ANVkWUiO6E" role="2Oq$k0">
                          <node concept="10QFUN" id="ANVkWUiO6F" role="1eOMHV">
                            <node concept="37vLTw" id="ANVkWUiO6G" role="10QFUP">
                              <ref role="3cqZAo" node="ANVkWUiO6Y" resolve="it" />
                            </node>
                            <node concept="3Tqbb2" id="ANVkWUiO6H" role="10QFUM" />
                          </node>
                        </node>
                        <node concept="2Rf3mk" id="ANVkWUiO6I" role="2OqNvi">
                          <node concept="1xMEDy" id="ANVkWUiO6J" role="1xVPHs">
                            <node concept="25Kdxt" id="ANVkWUiO6K" role="ri$Ld">
                              <node concept="37vLTw" id="ANVkWUiO6L" role="25KhWn">
                                <ref role="3cqZAo" node="ANVkWUi_XF" resolve="concept" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="Rh6nW" id="ANVkWUiO6Y" role="1bW2Oz">
                    <property role="TrG5h" value="it" />
                    <node concept="2jxLKc" id="ANVkWUiO6Z" role="1tU5fm" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2Gpval" id="ANVkWUiPp2" role="3cqZAp">
          <node concept="2GrKxI" id="ANVkWUiPp4" role="2Gsz3X">
            <property role="TrG5h" value="comment" />
          </node>
          <node concept="3clFbS" id="ANVkWUiPp6" role="2LFqv$">
            <node concept="3cpWs8" id="ANVkWUjkcm" role="3cqZAp">
              <node concept="3cpWsn" id="ANVkWUjkcn" role="3cpWs9">
                <property role="TrG5h" value="commentedNodes" />
                <node concept="A3Dl8" id="ANVkWUjkbU" role="1tU5fm">
                  <node concept="3Tqbb2" id="ANVkWUjkbX" role="A3Ik2" />
                </node>
                <node concept="2OqwBi" id="ANVkWUjkco" role="33vP2m">
                  <node concept="1PxgMI" id="ANVkWUjkcp" role="2Oq$k0">
                    <node concept="2GrUjf" id="ANVkWUjkcq" role="1m5AlR">
                      <ref role="2Gs0qQ" node="ANVkWUiPp4" resolve="comment" />
                    </node>
                    <node concept="chp4Y" id="714IaVdGYBo" role="3oSUPX">
                      <ref role="cht4Q" to="tpck:3$Sh7m_tmYK" resolve="IOldCommentContainer" />
                    </node>
                  </node>
                  <node concept="2qgKlT" id="ANVkWUjkcr" role="2OqNvi">
                    <ref role="37wK5l" to="tpcu:3$Sh7m_tmZE" resolve="getCommentedNodes" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbJ" id="43phPz62lVF" role="3cqZAp">
              <node concept="3clFbS" id="43phPz62lVH" role="3clFbx">
                <node concept="3cpWs8" id="ANVkWUjlTJ" role="3cqZAp">
                  <node concept="3cpWsn" id="ANVkWUjlTM" role="3cpWs9">
                    <property role="TrG5h" value="next" />
                    <node concept="3Tqbb2" id="ANVkWUjlTH" role="1tU5fm" />
                    <node concept="2GrUjf" id="ANVkWUjnfY" role="33vP2m">
                      <ref role="2Gs0qQ" node="ANVkWUiPp4" resolve="comment" />
                    </node>
                  </node>
                </node>
                <node concept="2Gpval" id="ANVkWUjhmc" role="3cqZAp">
                  <node concept="2GrKxI" id="ANVkWUjhme" role="2Gsz3X">
                    <property role="TrG5h" value="commentedNode" />
                  </node>
                  <node concept="3clFbS" id="ANVkWUjhmg" role="2LFqv$">
                    <node concept="3clFbF" id="ANVkWUjngH" role="3cqZAp">
                      <node concept="2OqwBi" id="ANVkWUjnhI" role="3clFbG">
                        <node concept="37vLTw" id="ANVkWUjngG" role="2Oq$k0">
                          <ref role="3cqZAo" node="ANVkWUjlTM" resolve="next" />
                        </node>
                        <node concept="HtI8k" id="ANVkWUjnkS" role="2OqNvi">
                          <node concept="2GrUjf" id="ANVkWUjnlD" role="HtI8F">
                            <ref role="2Gs0qQ" node="ANVkWUjhme" resolve="commentedNode" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbF" id="ANVkWUjnm9" role="3cqZAp">
                      <node concept="37vLTI" id="ANVkWUjpfH" role="3clFbG">
                        <node concept="2GrUjf" id="ANVkWUjpsP" role="37vLTx">
                          <ref role="2Gs0qQ" node="ANVkWUjhme" resolve="commentedNode" />
                        </node>
                        <node concept="37vLTw" id="ANVkWUjnm7" role="37vLTJ">
                          <ref role="3cqZAo" node="ANVkWUjlTM" resolve="next" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="37vLTw" id="ANVkWUjkcs" role="2GsD0m">
                    <ref role="3cqZAo" node="ANVkWUjkcn" resolve="commentedNodes" />
                  </node>
                </node>
                <node concept="2Gpval" id="ANVkWUjpU5" role="3cqZAp">
                  <node concept="2GrKxI" id="ANVkWUjpU6" role="2Gsz3X">
                    <property role="TrG5h" value="commentedNode" />
                  </node>
                  <node concept="3clFbS" id="ANVkWUjpU7" role="2LFqv$">
                    <node concept="3clFbF" id="ANVkWUjv09" role="3cqZAp">
                      <node concept="2YIFZM" id="ANVkWUjviR" role="3clFbG">
                        <ref role="37wK5l" to="b3bi:~CommentUtil.commentOut(org.jetbrains.mps.openapi.model.SNode):org.jetbrains.mps.openapi.model.SNode" resolve="commentOut" />
                        <ref role="1Pybhc" to="b3bi:~CommentUtil" resolve="CommentUtil" />
                        <node concept="2GrUjf" id="ANVkWUjvjl" role="37wK5m">
                          <ref role="2Gs0qQ" node="ANVkWUjpU6" resolve="commentedNode" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="37vLTw" id="ANVkWUjpUh" role="2GsD0m">
                    <ref role="3cqZAo" node="ANVkWUjkcn" resolve="commentedNodes" />
                  </node>
                </node>
              </node>
              <node concept="2OqwBi" id="43phPz62m2w" role="3clFbw">
                <node concept="37vLTw" id="43phPz62m0j" role="2Oq$k0">
                  <ref role="3cqZAo" node="ANVkWUjkcn" resolve="commentedNodes" />
                </node>
                <node concept="3GX2aA" id="43phPz62m99" role="2OqNvi" />
              </node>
            </node>
            <node concept="3clFbF" id="ANVkWUiPUe" role="3cqZAp">
              <node concept="2OqwBi" id="ANVkWUiPVf" role="3clFbG">
                <node concept="2GrUjf" id="ANVkWUiPUd" role="2Oq$k0">
                  <ref role="2Gs0qQ" node="ANVkWUiPp4" resolve="comment" />
                </node>
                <node concept="3YRAZt" id="ANVkWUjpG5" role="2OqNvi" />
              </node>
            </node>
          </node>
          <node concept="37vLTw" id="ANVkWUiPJ4" role="2GsD0m">
            <ref role="3cqZAo" node="ANVkWUiO6h" resolve="oldComments" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="ANVkWUiA7m" role="1B3o_S" />
      <node concept="3cqZAl" id="ANVkWUiA8H" role="3clF45" />
    </node>
    <node concept="3clFb_" id="4JdgAL_59l8" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="check" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="4JdgAL_59l9" role="3clF47">
        <node concept="L3pyB" id="4JdgAL_5b8T" role="3cqZAp">
          <node concept="3clFbS" id="4JdgAL_5b8U" role="L3pyw">
            <node concept="3cpWs6" id="4JdgAL_5bdH" role="3cqZAp">
              <node concept="2OqwBi" id="4JdgAL_5caW" role="3cqZAk">
                <node concept="qVDSY" id="4JdgAL_5bqf" role="2Oq$k0">
                  <node concept="1dO9Bo" id="4JdgAL_5bqh" role="1dOa5D" />
                  <node concept="25Kdxt" id="4JdgAL_5bCQ" role="qVDSX">
                    <node concept="37vLTw" id="4JdgAL_5bRB" role="25KhWn">
                      <ref role="3cqZAo" node="ANVkWUi_XF" resolve="concept" />
                    </node>
                  </node>
                </node>
                <node concept="3$u5V9" id="4JdgAL_5d8G" role="2OqNvi">
                  <node concept="1bVj0M" id="4JdgAL_5d8I" role="23t8la">
                    <node concept="3clFbS" id="4JdgAL_5d8J" role="1bW5cS">
                      <node concept="3clFbF" id="4JdgAL_5doS" role="3cqZAp">
                        <node concept="1eOMI4" id="6En3ZbjlAht" role="3clFbG">
                          <node concept="10QFUN" id="6En3ZbjlAhu" role="1eOMHV">
                            <node concept="2ShNRf" id="6En3ZbjlAhq" role="10QFUP">
                              <node concept="1pGfFk" id="6En3ZbjlAhr" role="2ShVmc">
                                <ref role="37wK5l" to="6f4m:6oJSkzEcOjg" resolve="DeprecatedConceptNotMigratedProblem" />
                                <node concept="37vLTw" id="6En3ZbjlAhs" role="37wK5m">
                                  <ref role="3cqZAo" node="4JdgAL_5d8K" resolve="it" />
                                </node>
                              </node>
                            </node>
                            <node concept="3uibUv" id="6En3ZbjlAxi" role="10QFUM">
                              <ref role="3uigEE" to="6f4m:3n7MNzO_IjP" resolve="Problem" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="4JdgAL_5d8K" role="1bW2Oz">
                      <property role="TrG5h" value="it" />
                      <node concept="2jxLKc" id="4JdgAL_5d8L" role="1tU5fm" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="37vLTw" id="4JdgAL_5bcy" role="L3pyr">
            <ref role="3cqZAo" node="ANVkWUiA1A" resolve="module" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4JdgAL_59ms" role="1B3o_S" />
      <node concept="A3Dl8" id="4JdgAL_5a8f" role="3clF45">
        <node concept="3uibUv" id="4JdgAL_5anq" role="A3Ik2">
          <ref role="3uigEE" to="6f4m:3n7MNzO_IjP" resolve="Problem" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4JdgAL_598b" role="jymVt" />
    <node concept="3Tm1VV" id="ANVkWUi_zL" role="1B3o_S" />
  </node>
</model>

