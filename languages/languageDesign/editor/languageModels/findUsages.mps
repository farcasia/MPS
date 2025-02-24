<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:0195c266-9b28-400e-9417-87a3191713c0(jetbrains.mps.lang.editor.findUsages)">
  <persistence version="9" />
  <languages>
    <use id="64d34fcd-ad02-4e73-aff8-a581124c2e30" name="jetbrains.mps.lang.findUsages" version="0" />
    <use id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="yyf4" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.util(MPS.OpenAPI/)" />
    <import index="tpci" ref="r:00000000-0000-4000-0000-011c8959028e(jetbrains.mps.lang.structure.findUsages)" />
    <import index="tpc2" ref="r:00000000-0000-4000-0000-011c8959029e(jetbrains.mps.lang.editor.structure)" />
  </imports>
  <registry>
    <language id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts">
      <concept id="558005353046640020" name="jetbrains.mps.lang.sharedConcepts.structure.ConceptFunctionParameter_progressMonitor" flags="ng" index="24CIHX" />
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1153952380246" name="jetbrains.mps.baseLanguage.structure.TryStatement" flags="nn" index="2GUZhq">
        <child id="1153952416686" name="body" index="2GV8ay" />
        <child id="1153952429843" name="finallyBody" index="2GVbov" />
      </concept>
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
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
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1145383075378" name="jetbrains.mps.lang.smodel.structure.SNodeListType" flags="in" index="2I9FWS">
        <reference id="1145383142433" name="elementConcept" index="2I9WkF" />
      </concept>
      <concept id="1219352745532" name="jetbrains.mps.lang.smodel.structure.NodeRefExpression" flags="nn" index="3B5_sB">
        <reference id="1219352800908" name="referentNode" index="3B5MYn" />
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
    <language id="64d34fcd-ad02-4e73-aff8-a581124c2e30" name="jetbrains.mps.lang.findUsages">
      <concept id="100784871586155151" name="jetbrains.mps.lang.findUsages.structure.IsUsedByDefault" flags="ig" index="24L$n1" />
      <concept id="1197044488845" name="jetbrains.mps.lang.findUsages.structure.FinderDeclaration" flags="ig" index="2PqlIr">
        <property id="1197385993272" name="description" index="39L4OI" />
        <child id="100784871544251463" name="isUsedByDefault" index="22hIG9" />
      </concept>
      <concept id="1197044488840" name="jetbrains.mps.lang.findUsages.structure.FindBlock" flags="in" index="2PqlIu" />
      <concept id="1197386047362" name="jetbrains.mps.lang.findUsages.structure.ConceptFunctionParameter_node" flags="nn" index="39LhUk" />
      <concept id="1218978086674" name="jetbrains.mps.lang.findUsages.structure.AbstractFinderDeclaration" flags="ng" index="3gKnS9">
        <reference id="1218978181697" name="forConcept" index="3gKJdq" />
        <child id="1218978125367" name="categorizeBlock" index="3gKxsG" />
        <child id="1218978125365" name="findFunction" index="3gKxsI" />
      </concept>
      <concept id="1206197741569" name="jetbrains.mps.lang.findUsages.structure.ExecuteFinderExpression" flags="nn" index="3mZe$p">
        <reference id="1206197741576" name="finder" index="3mZe$g" />
        <child id="1206197741572" name="queryNode" index="3mZe$s" />
        <child id="8441762775553277663" name="monitor" index="3JOdhr" />
      </concept>
      <concept id="1206461221942" name="jetbrains.mps.lang.findUsages.structure.CategorizeBlock" flags="in" index="3AGkOI" />
      <concept id="1200242336756" name="jetbrains.mps.lang.findUsages.structure.ResultStatement" flags="nn" index="1O1abz">
        <child id="1200242376867" name="foundNode" index="1O1k6O" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
    </language>
  </registry>
  <node concept="2PqlIr" id="KwT0zcjLxj">
    <property role="TrG5h" value="DefaultMenuReferences" />
    <property role="39L4OI" value="Default Menu References" />
    <property role="3GE5qa" value="Menu.Transformation" />
    <ref role="3gKJdq" to="tpc2:1qY_lWSjJNx" resolve="TransformationMenu_Default" />
    <node concept="24L$n1" id="KwT0zcki9_" role="22hIG9">
      <node concept="3clFbS" id="KwT0zcki9A" role="2VODD2">
        <node concept="3clFbF" id="KwT0zckigM" role="3cqZAp">
          <node concept="3clFbT" id="KwT0zckigL" role="3clFbG">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2PqlIu" id="htSx$V8" role="3gKxsI">
      <node concept="3clFbS" id="htSx$V9" role="2VODD2">
        <node concept="3clFbF" id="7kBaCiqWYu6" role="3cqZAp">
          <node concept="2OqwBi" id="7kBaCiqWYTr" role="3clFbG">
            <node concept="liA8E" id="7kBaCiqWZfz" role="2OqNvi">
              <ref role="37wK5l" to="yyf4:~ProgressMonitor.start(java.lang.String,int):void" resolve="start" />
              <node concept="Xl_RD" id="7kBaCiqWZj2" role="37wK5m">
                <property role="Xl_RC" value="All default menu references" />
              </node>
              <node concept="3cmrfG" id="KwT0zcl4QY" role="37wK5m">
                <property role="3cmrfH" value="2" />
              </node>
            </node>
            <node concept="24CIHX" id="KwT0zckpqU" role="2Oq$k0" />
          </node>
        </node>
        <node concept="3clFbH" id="KwT0zcl8Oq" role="3cqZAp" />
        <node concept="2GUZhq" id="KwT0zcl9kk" role="3cqZAp">
          <node concept="3clFbS" id="KwT0zcl9kl" role="2GV8ay">
            <node concept="3cpWs8" id="KwT0zcl3di" role="3cqZAp">
              <node concept="3cpWsn" id="KwT0zcl3dj" role="3cpWs9">
                <property role="TrG5h" value="allReferences" />
                <node concept="2I9FWS" id="KwT0zcl3de" role="1tU5fm">
                  <ref role="2I9WkF" to="tpc2:5OVd5tVffWc" resolve="TransformationMenuReference_Default" />
                </node>
                <node concept="10QFUN" id="KwT0zcldsR" role="33vP2m">
                  <node concept="3mZe$p" id="KwT0zcl3dk" role="10QFUP">
                    <ref role="3mZe$g" to="tpci:hroutJm" resolve="ConceptInstances" />
                    <node concept="3B5_sB" id="4YXTt1AIwth" role="3mZe$s">
                      <ref role="3B5MYn" to="tpc2:5OVd5tVffWc" resolve="TransformationMenuReference_Default" />
                    </node>
                    <node concept="2OqwBi" id="KwT0zcl3Pi" role="3JOdhr">
                      <node concept="24CIHX" id="KwT0zcl3Jx" role="2Oq$k0" />
                      <node concept="liA8E" id="KwT0zcl49n" role="2OqNvi">
                        <ref role="37wK5l" to="yyf4:~ProgressMonitor.subTask(int):org.jetbrains.mps.openapi.util.ProgressMonitor" resolve="subTask" />
                        <node concept="3cmrfG" id="KwT0zcl4eg" role="37wK5m">
                          <property role="3cmrfH" value="1" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2I9FWS" id="KwT0zcldsS" role="10QFUM">
                    <ref role="2I9WkF" to="tpc2:5OVd5tVffWc" resolve="TransformationMenuReference_Default" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbH" id="KwT0zclbjT" role="3cqZAp" />
            <node concept="2Gpval" id="KwT0zclbuU" role="3cqZAp">
              <node concept="2GrKxI" id="KwT0zclbuW" role="2Gsz3X">
                <property role="TrG5h" value="ref" />
              </node>
              <node concept="37vLTw" id="KwT0zclb_j" role="2GsD0m">
                <ref role="3cqZAo" node="KwT0zcl3dj" resolve="allReferences" />
              </node>
              <node concept="3clFbS" id="KwT0zclbv0" role="2LFqv$">
                <node concept="3clFbJ" id="KwT0zclbD$" role="3cqZAp">
                  <node concept="3clFbC" id="KwT0zcle8t" role="3clFbw">
                    <node concept="2OqwBi" id="KwT0zcleo3" role="3uHU7w">
                      <node concept="39LhUk" id="KwT0zclebs" role="2Oq$k0" />
                      <node concept="3TrEf2" id="5HVj4Phgcfx" role="2OqNvi">
                        <ref role="3Tt5mk" to="tpc2:5HVj4Ph44AO" resolve="conceptDeclaration" />
                      </node>
                    </node>
                    <node concept="2OqwBi" id="KwT0zclbK$" role="3uHU7B">
                      <node concept="2GrUjf" id="KwT0zclbDZ" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="KwT0zclbuW" resolve="ref" />
                      </node>
                      <node concept="3TrEf2" id="1quYWAD56_b" role="2OqNvi">
                        <ref role="3Tt5mk" to="tpc2:1quYWAD543u" resolve="concept" />
                      </node>
                    </node>
                  </node>
                  <node concept="3clFbS" id="KwT0zclbDA" role="3clFbx">
                    <node concept="1O1abz" id="KwT0zcleFJ" role="3cqZAp">
                      <node concept="2GrUjf" id="KwT0zcleG8" role="1O1k6O">
                        <ref role="2Gs0qQ" node="KwT0zclbuW" resolve="ref" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbS" id="KwT0zcl9km" role="2GVbov">
            <node concept="3clFbF" id="KwT0zcl5Tb" role="3cqZAp">
              <node concept="2OqwBi" id="KwT0zcl6kT" role="3clFbG">
                <node concept="24CIHX" id="KwT0zcl5T9" role="2Oq$k0" />
                <node concept="liA8E" id="KwT0zcl6SL" role="2OqNvi">
                  <ref role="37wK5l" to="yyf4:~ProgressMonitor.done():void" resolve="done" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3AGkOI" id="KwT0zcll7U" role="3gKxsG">
      <node concept="3clFbS" id="KwT0zcll7V" role="2VODD2">
        <node concept="3clFbF" id="KwT0zcllI5" role="3cqZAp">
          <node concept="Xl_RD" id="KwT0zcllI4" role="3clFbG">
            <property role="Xl_RC" value="Default Menu References" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

