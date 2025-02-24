<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:ad8f2b18-3038-4a9d-ad27-aa5680bf8421(jetbrains.mps.testHybridEditor.typesystem)">
  <persistence version="9" />
  <languages>
    <devkit ref="00000000-0000-4000-0000-1de82b3a4936(jetbrains.mps.devkit.aspect.typesystem)" />
  </languages>
  <imports>
    <import index="adck" ref="r:2a464ec2-aa44-4a2f-a388-e0917332ac68(jetbrains.mps.testHybridEditor.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1080223426719" name="jetbrains.mps.baseLanguage.structure.OrExpression" flags="nn" index="22lmx$" />
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1153422105332" name="jetbrains.mps.baseLanguage.structure.RemExpression" flags="nn" index="2dk9JS" />
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271283259" name="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" flags="nn" index="17R0WA" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
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
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1175517767210" name="jetbrains.mps.lang.typesystem.structure.ReportErrorStatement" flags="nn" index="2MkqsV">
        <child id="1175517851849" name="errorString" index="2MkJ7o" />
      </concept>
      <concept id="1227096774658" name="jetbrains.mps.lang.typesystem.structure.MessageStatement" flags="ng" index="2OEH$v">
        <child id="1227096802790" name="nodeToReport" index="2OEOjV" />
      </concept>
      <concept id="1195213580585" name="jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule" flags="ig" index="18hYwZ">
        <child id="1195213635060" name="body" index="18ibNy" />
      </concept>
      <concept id="1195214364922" name="jetbrains.mps.lang.typesystem.structure.NonTypesystemRule" flags="ig" index="18kY7G" />
      <concept id="1174642788531" name="jetbrains.mps.lang.typesystem.structure.ConceptReference" flags="ig" index="1YaCAy">
        <reference id="1174642800329" name="concept" index="1YaFvo" />
      </concept>
      <concept id="1174648085619" name="jetbrains.mps.lang.typesystem.structure.AbstractRule" flags="ng" index="1YuPPy">
        <child id="1174648101952" name="applicableNode" index="1YuTPh" />
      </concept>
      <concept id="1174650418652" name="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference" flags="nn" index="1YBJjd">
        <reference id="1174650432090" name="applicableNode" index="1YBMHb" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1179168000618" name="jetbrains.mps.lang.smodel.structure.Node_GetIndexInParentOperation" flags="nn" index="2bSWHS" />
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
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
  <node concept="18kY7G" id="L6rm9$n_Op">
    <property role="TrG5h" value="check_all_ports" />
    <node concept="3clFbS" id="L6rm9$n_Oq" role="18ibNy">
      <node concept="3cpWs8" id="L6rm9$nD_M" role="3cqZAp">
        <node concept="3cpWsn" id="L6rm9$nD_P" role="3cpWs9">
          <property role="TrG5h" value="result" />
          <node concept="10P_77" id="L6rm9$nD_K" role="1tU5fm" />
          <node concept="3clFbT" id="L6rm9$nDMT" role="33vP2m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="L6rm9$n_P$" role="3cqZAp">
        <node concept="2GrKxI" id="L6rm9$n_P_" role="2Gsz3X">
          <property role="TrG5h" value="port" />
        </node>
        <node concept="2OqwBi" id="L6rm9$n_UJ" role="2GsD0m">
          <node concept="1YBJjd" id="L6rm9$n_QC" role="2Oq$k0">
            <ref role="1YBMHb" node="L6rm9$n_Pf" resolve="block" />
          </node>
          <node concept="3Tsc0h" id="4f5uMdGlodQ" role="2OqNvi">
            <ref role="3TtcxE" to="adck:CgolD_s2ZY" resolve="inputPorts" />
          </node>
        </node>
        <node concept="3clFbS" id="L6rm9$n_PB" role="2LFqv$">
          <node concept="3cpWs8" id="L6rm9$s91Y" role="3cqZAp">
            <node concept="3cpWsn" id="L6rm9$s921" role="3cpWs9">
              <property role="TrG5h" value="portResult" />
              <node concept="10P_77" id="L6rm9$s91W" role="1tU5fm" />
              <node concept="3clFbT" id="L6rm9$s9xK" role="33vP2m" />
            </node>
          </node>
          <node concept="2Gpval" id="L6rm9$nATv" role="3cqZAp">
            <node concept="2GrKxI" id="L6rm9$nATw" role="2Gsz3X">
              <property role="TrG5h" value="connector" />
            </node>
            <node concept="2OqwBi" id="L6rm9$nCku" role="2GsD0m">
              <node concept="1PxgMI" id="L6rm9$nC3G" role="2Oq$k0">
                <node concept="2OqwBi" id="L6rm9$nB1C" role="1m5AlR">
                  <node concept="1YBJjd" id="L6rm9$nAVv" role="2Oq$k0">
                    <ref role="1YBMHb" node="L6rm9$n_Pf" resolve="block" />
                  </node>
                  <node concept="1mfA1w" id="L6rm9$nBxN" role="2OqNvi" />
                </node>
                <node concept="chp4Y" id="714IaVdH0$e" role="3oSUPX">
                  <ref role="cht4Q" to="adck:CgolD_s2V1" resolve="Diagram" />
                </node>
              </node>
              <node concept="3Tsc0h" id="L6rm9$nDl5" role="2OqNvi">
                <ref role="3TtcxE" to="adck:CgolD_s2Zq" resolve="connectors" />
              </node>
            </node>
            <node concept="3clFbS" id="L6rm9$nATy" role="2LFqv$">
              <node concept="3clFbF" id="L6rm9$nDZn" role="3cqZAp">
                <node concept="37vLTI" id="L6rm9$nEfh" role="3clFbG">
                  <node concept="22lmx$" id="L6rm9$nFcj" role="37vLTx">
                    <node concept="17R0WA" id="L6rm9$nPms" role="3uHU7w">
                      <node concept="2GrUjf" id="L6rm9$nPFK" role="3uHU7w">
                        <ref role="2Gs0qQ" node="L6rm9$n_P_" resolve="port" />
                      </node>
                      <node concept="2OqwBi" id="L6rm9$nFxH" role="3uHU7B">
                        <node concept="2GrUjf" id="L6rm9$nFig" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="L6rm9$nATw" resolve="connector" />
                        </node>
                        <node concept="3TrEf2" id="L6rm9$nHeh" role="2OqNvi">
                          <ref role="3Tt5mk" to="adck:CgolD_s30o" resolve="inputPort" />
                        </node>
                      </node>
                    </node>
                    <node concept="37vLTw" id="L6rm9$sb6J" role="3uHU7B">
                      <ref role="3cqZAo" node="L6rm9$s921" resolve="portResult" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="L6rm9$saC4" role="37vLTJ">
                    <ref role="3cqZAo" node="L6rm9$s921" resolve="portResult" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="L6rm9$sck4" role="3cqZAp">
            <node concept="37vLTI" id="L6rm9$sd2Y" role="3clFbG">
              <node concept="1Wc70l" id="L6rm9$sdLJ" role="37vLTx">
                <node concept="37vLTw" id="L6rm9$sgeu" role="3uHU7w">
                  <ref role="3cqZAo" node="L6rm9$s921" resolve="portResult" />
                </node>
                <node concept="37vLTw" id="L6rm9$sd8w" role="3uHU7B">
                  <ref role="3cqZAo" node="L6rm9$nD_P" resolve="result" />
                </node>
              </node>
              <node concept="37vLTw" id="L6rm9$sck3" role="37vLTJ">
                <ref role="3cqZAo" node="L6rm9$nD_P" resolve="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2Gpval" id="L6rm9$sgCh" role="3cqZAp">
        <node concept="2GrKxI" id="L6rm9$sgCi" role="2Gsz3X">
          <property role="TrG5h" value="port" />
        </node>
        <node concept="2OqwBi" id="L6rm9$sgCj" role="2GsD0m">
          <node concept="1YBJjd" id="L6rm9$sgCk" role="2Oq$k0">
            <ref role="1YBMHb" node="L6rm9$n_Pf" resolve="block" />
          </node>
          <node concept="3Tsc0h" id="L6rm9$siDu" role="2OqNvi">
            <ref role="3TtcxE" to="adck:CgolD_s300" resolve="outputPorts" />
          </node>
        </node>
        <node concept="3clFbS" id="L6rm9$sgCm" role="2LFqv$">
          <node concept="3cpWs8" id="L6rm9$sgCn" role="3cqZAp">
            <node concept="3cpWsn" id="L6rm9$sgCo" role="3cpWs9">
              <property role="TrG5h" value="portResult" />
              <node concept="10P_77" id="L6rm9$sgCp" role="1tU5fm" />
              <node concept="3clFbT" id="L6rm9$sgCq" role="33vP2m" />
            </node>
          </node>
          <node concept="2Gpval" id="L6rm9$sgCr" role="3cqZAp">
            <node concept="2GrKxI" id="L6rm9$sgCs" role="2Gsz3X">
              <property role="TrG5h" value="connector" />
            </node>
            <node concept="2OqwBi" id="L6rm9$sgCt" role="2GsD0m">
              <node concept="1PxgMI" id="L6rm9$sgCu" role="2Oq$k0">
                <node concept="2OqwBi" id="L6rm9$sgCv" role="1m5AlR">
                  <node concept="1YBJjd" id="L6rm9$sgCw" role="2Oq$k0">
                    <ref role="1YBMHb" node="L6rm9$n_Pf" resolve="block" />
                  </node>
                  <node concept="1mfA1w" id="L6rm9$sgCx" role="2OqNvi" />
                </node>
                <node concept="chp4Y" id="714IaVdH0$f" role="3oSUPX">
                  <ref role="cht4Q" to="adck:CgolD_s2V1" resolve="Diagram" />
                </node>
              </node>
              <node concept="3Tsc0h" id="L6rm9$sgCy" role="2OqNvi">
                <ref role="3TtcxE" to="adck:CgolD_s2Zq" resolve="connectors" />
              </node>
            </node>
            <node concept="3clFbS" id="L6rm9$sgCz" role="2LFqv$">
              <node concept="3clFbF" id="L6rm9$sgC$" role="3cqZAp">
                <node concept="37vLTI" id="L6rm9$sgC_" role="3clFbG">
                  <node concept="22lmx$" id="L6rm9$sgCA" role="37vLTx">
                    <node concept="17R0WA" id="L6rm9$sgCB" role="3uHU7w">
                      <node concept="2GrUjf" id="L6rm9$sgCC" role="3uHU7w">
                        <ref role="2Gs0qQ" node="L6rm9$sgCi" resolve="port" />
                      </node>
                      <node concept="2OqwBi" id="L6rm9$sgCD" role="3uHU7B">
                        <node concept="2GrUjf" id="L6rm9$sgCE" role="2Oq$k0">
                          <ref role="2Gs0qQ" node="L6rm9$sgCs" resolve="connector" />
                        </node>
                        <node concept="3TrEf2" id="L6rm9$sjV6" role="2OqNvi">
                          <ref role="3Tt5mk" to="adck:CgolD_s30k" resolve="outputPort" />
                        </node>
                      </node>
                    </node>
                    <node concept="37vLTw" id="L6rm9$sgCG" role="3uHU7B">
                      <ref role="3cqZAo" node="L6rm9$sgCo" resolve="portResult" />
                    </node>
                  </node>
                  <node concept="37vLTw" id="L6rm9$sgCH" role="37vLTJ">
                    <ref role="3cqZAo" node="L6rm9$sgCo" resolve="portResult" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="L6rm9$sgCI" role="3cqZAp">
            <node concept="37vLTI" id="L6rm9$sgCJ" role="3clFbG">
              <node concept="1Wc70l" id="L6rm9$sgCK" role="37vLTx">
                <node concept="37vLTw" id="L6rm9$sgCL" role="3uHU7w">
                  <ref role="3cqZAo" node="L6rm9$sgCo" resolve="portResult" />
                </node>
                <node concept="37vLTw" id="L6rm9$sgCM" role="3uHU7B">
                  <ref role="3cqZAo" node="L6rm9$nD_P" resolve="result" />
                </node>
              </node>
              <node concept="37vLTw" id="L6rm9$sgCN" role="37vLTJ">
                <ref role="3cqZAo" node="L6rm9$nD_P" resolve="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbJ" id="L6rm9$nT0K" role="3cqZAp">
        <node concept="3clFbS" id="L6rm9$nT0N" role="3clFbx">
          <node concept="2MkqsV" id="L6rm9$nTST" role="3cqZAp">
            <node concept="Xl_RD" id="L6rm9$nTTb" role="2MkJ7o">
              <property role="Xl_RC" value="all ports must be connected" />
            </node>
            <node concept="1YBJjd" id="L6rm9$nUh8" role="2OEOjV">
              <ref role="1YBMHb" node="L6rm9$n_Pf" resolve="block" />
            </node>
          </node>
        </node>
        <node concept="3fqX7Q" id="L6rm9$pvmX" role="3clFbw">
          <node concept="37vLTw" id="L6rm9$pvmZ" role="3fr31v">
            <ref role="3cqZAo" node="L6rm9$nD_P" resolve="result" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="L6rm9$n_Pf" role="1YuTPh">
      <property role="TrG5h" value="block" />
      <ref role="1YaFvo" to="adck:CgolD_s2Yo" resolve="Block" />
    </node>
  </node>
  <node concept="18kY7G" id="L6rm9$$vGS">
    <property role="TrG5h" value="connector" />
    <node concept="3clFbS" id="L6rm9$$vGT" role="18ibNy">
      <node concept="2MkqsV" id="L6rm9$$wd_" role="3cqZAp">
        <node concept="Xl_RD" id="L6rm9$$wdU" role="2MkJ7o">
          <property role="Xl_RC" value="connector error" />
        </node>
        <node concept="1YBJjd" id="L6rm9$$wf9" role="2OEOjV">
          <ref role="1YBMHb" node="L6rm9$$vGV" resolve="connectorInstance" />
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="L6rm9$$vGV" role="1YuTPh">
      <property role="TrG5h" value="connectorInstance" />
      <ref role="1YaFvo" to="adck:22C1ebGh1km" resolve="ConnectorInstance" />
    </node>
  </node>
  <node concept="18kY7G" id="4f5uMdGlr7G">
    <property role="TrG5h" value="blockInstance" />
    <node concept="3clFbS" id="4f5uMdGlr7H" role="18ibNy">
      <node concept="3clFbJ" id="4f5uMdGlrbX" role="3cqZAp">
        <node concept="3clFbS" id="4f5uMdGlrc0" role="3clFbx">
          <node concept="2MkqsV" id="4f5uMdGlr7I" role="3cqZAp">
            <node concept="Xl_RD" id="4f5uMdGlr7J" role="2MkJ7o">
              <property role="Xl_RC" value="block error" />
            </node>
            <node concept="1YBJjd" id="4f5uMdGlr7K" role="2OEOjV">
              <ref role="1YBMHb" node="4f5uMdGlr7L" resolve="blockInstance" />
            </node>
          </node>
        </node>
        <node concept="3clFbC" id="4f5uMdGluSr" role="3clFbw">
          <node concept="3cmrfG" id="4f5uMdGlv7B" role="3uHU7w">
            <property role="3cmrfH" value="0" />
          </node>
          <node concept="2dk9JS" id="4f5uMdGltDn" role="3uHU7B">
            <node concept="2OqwBi" id="4f5uMdGlrhw" role="3uHU7B">
              <node concept="1YBJjd" id="4f5uMdGlrcM" role="2Oq$k0">
                <ref role="1YBMHb" node="4f5uMdGlr7L" resolve="blockInstance" />
              </node>
              <node concept="2bSWHS" id="4f5uMdGlsbA" role="2OqNvi" />
            </node>
            <node concept="3cmrfG" id="4f5uMdGltDq" role="3uHU7w">
              <property role="3cmrfH" value="2" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="4f5uMdGlr7L" role="1YuTPh">
      <property role="TrG5h" value="blockInstance" />
      <ref role="1YaFvo" to="adck:22C1ebGgZit" resolve="BlockInstance" />
    </node>
  </node>
  <node concept="18kY7G" id="2eSMEaV5OGr">
    <property role="TrG5h" value="check_port" />
    <node concept="3clFbS" id="2eSMEaV5OGs" role="18ibNy">
      <node concept="2MkqsV" id="2eSMEaV5OGv" role="3cqZAp">
        <node concept="Xl_RD" id="2eSMEaV5OGw" role="2MkJ7o">
          <property role="Xl_RC" value="input port error" />
        </node>
        <node concept="1YBJjd" id="2eSMEaV5OGx" role="2OEOjV">
          <ref role="1YBMHb" node="2eSMEaV5OGD" resolve="inputPort" />
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="2eSMEaV5OGD" role="1YuTPh">
      <property role="TrG5h" value="inputPort" />
      <ref role="1YaFvo" to="adck:CgolD_s2YO" resolve="InputPort" />
    </node>
  </node>
  <node concept="18kY7G" id="3jc5s3A5VYX">
    <property role="TrG5h" value="check_outputport" />
    <node concept="3clFbS" id="3jc5s3A5VYY" role="18ibNy">
      <node concept="2MkqsV" id="3jc5s3A5VYZ" role="3cqZAp">
        <node concept="Xl_RD" id="3jc5s3A5VZ0" role="2MkJ7o">
          <property role="Xl_RC" value="input port error" />
        </node>
        <node concept="1YBJjd" id="3jc5s3A5VZ1" role="2OEOjV">
          <ref role="1YBMHb" node="3jc5s3A5VZ2" resolve="outputPort" />
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3jc5s3A5VZ2" role="1YuTPh">
      <property role="TrG5h" value="outputPort" />
      <ref role="1YaFvo" to="adck:CgolD_s2YZ" resolve="OutputPort" />
    </node>
  </node>
</model>

