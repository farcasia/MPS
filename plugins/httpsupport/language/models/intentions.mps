<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:339408f7-5111-4f37-b678-ffec3b90a6b4(jetbrains.mps.ide.httpsupport.intentions)">
  <persistence version="9" />
  <languages>
    <use id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="ndib" ref="r:3c30b5c5-2f86-4daf-bab8-b406cfefcb4f(jetbrains.mps.ide.httpsupport.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
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
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
      </concept>
    </language>
    <language id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions">
      <concept id="1192794744107" name="jetbrains.mps.lang.intentions.structure.IntentionDeclaration" flags="ig" index="2S6QgY" />
      <concept id="1192794782375" name="jetbrains.mps.lang.intentions.structure.DescriptionBlock" flags="in" index="2S6ZIM" />
      <concept id="1192795911897" name="jetbrains.mps.lang.intentions.structure.ExecuteBlock" flags="in" index="2Sbjvc" />
      <concept id="1192796902958" name="jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_node" flags="nn" index="2Sf5sV" />
      <concept id="2522969319638091381" name="jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration" flags="ig" index="2ZfUlf">
        <reference id="2522969319638198290" name="forConcept" index="2ZfgGC" />
        <child id="2522969319638198291" name="executeFunction" index="2ZfgGD" />
        <child id="2522969319638093993" name="descriptionFunction" index="2ZfVej" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
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
  <node concept="2S6QgY" id="21vgRr5xL$s">
    <property role="TrG5h" value="RequireQueryParameter" />
    <property role="3GE5qa" value="handler" />
    <ref role="2ZfgGC" to="ndib:21vgRr5xrgT" resolve="QueryParameter" />
    <node concept="2S6ZIM" id="21vgRr5xL$t" role="2ZfVej">
      <node concept="3clFbS" id="21vgRr5xL$u" role="2VODD2">
        <node concept="3clFbF" id="21vgRr5xLLc" role="3cqZAp">
          <node concept="3cpWs3" id="21vgRr5xOB8" role="3clFbG">
            <node concept="Xl_RD" id="21vgRr5xOBe" role="3uHU7B">
              <property role="Xl_RC" value="Make Query Parameter " />
            </node>
            <node concept="1eOMI4" id="21vgRr5xSjB" role="3uHU7w">
              <node concept="3K4zz7" id="21vgRr5xPuc" role="1eOMHV">
                <node concept="2OqwBi" id="21vgRr5xPNx" role="3K4Cdx">
                  <node concept="2Sf5sV" id="21vgRr5xPAV" role="2Oq$k0" />
                  <node concept="3TrcHB" id="21vgRr5xQcN" role="2OqNvi">
                    <ref role="3TsBF5" to="ndib:21vgRr5xrgX" resolve="required" />
                  </node>
                </node>
                <node concept="Xl_RD" id="21vgRr5xQyb" role="3K4E3e">
                  <property role="Xl_RC" value="Unrequired" />
                </node>
                <node concept="Xl_RD" id="21vgRr5xOBg" role="3K4GZi">
                  <property role="Xl_RC" value="Required" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2Sbjvc" id="21vgRr5xL$v" role="2ZfgGD">
      <node concept="3clFbS" id="21vgRr5xL$w" role="2VODD2">
        <node concept="3clFbF" id="21vgRr5xU$q" role="3cqZAp">
          <node concept="37vLTI" id="21vgRr5xVk6" role="3clFbG">
            <node concept="3fqX7Q" id="21vgRr5xVtA" role="37vLTx">
              <node concept="2OqwBi" id="21vgRr5xVGj" role="3fr31v">
                <node concept="2Sf5sV" id="21vgRr5xVzF" role="2Oq$k0" />
                <node concept="3TrcHB" id="21vgRr5xW2Z" role="2OqNvi">
                  <ref role="3TsBF5" to="ndib:21vgRr5xrgX" resolve="required" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="21vgRr5xUES" role="37vLTJ">
              <node concept="2Sf5sV" id="21vgRr5xU$p" role="2Oq$k0" />
              <node concept="3TrcHB" id="21vgRr5xUNK" role="2OqNvi">
                <ref role="3TsBF5" to="ndib:21vgRr5xrgX" resolve="required" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

