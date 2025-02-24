<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:a8c26c18-fb37-4d4a-a67a-16f7c6482380(jetbrains.mps.build.mps.actions)">
  <persistence version="9" />
  <languages>
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <use id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="kdzh" ref="r:0353b795-df17-4050-9687-ee47eeb7094f(jetbrains.mps.build.mps.structure)" />
    <import index="bb3p" ref="r:589e3942-2f2d-42a2-9312-986a1d3e2f7f(jetbrains.mps.build.mps.editor)" />
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
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
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
    </language>
    <language id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions">
      <concept id="767145758118872830" name="jetbrains.mps.lang.actions.structure.NF_Link_SetNewChildOperation" flags="nn" index="2DeJnY" />
      <concept id="1158700664498" name="jetbrains.mps.lang.actions.structure.NodeFactories" flags="ng" index="37WguZ">
        <child id="1158700779049" name="nodeFactory" index="37WGs$" />
      </concept>
      <concept id="1158700725281" name="jetbrains.mps.lang.actions.structure.NodeFactory" flags="ig" index="37WvkG">
        <reference id="1158700943156" name="applicableConcept" index="37XkoT" />
        <child id="1158701448518" name="setupFunction" index="37ZfLb" />
      </concept>
      <concept id="1158701162220" name="jetbrains.mps.lang.actions.structure.NodeSetupFunction" flags="in" index="37Y9Zx" />
      <concept id="5584396657084912703" name="jetbrains.mps.lang.actions.structure.NodeSetupFunction_NewNode" flags="nn" index="1r4Lsj" />
      <concept id="5584396657084920413" name="jetbrains.mps.lang.actions.structure.NodeSetupFunction_SampleNode" flags="nn" index="1r4N5L" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="37WguZ" id="7gAtt1juf1V">
    <property role="TrG5h" value="constructors_BuildMps" />
    <node concept="37WvkG" id="7gAtt1juf1W" role="37WGs$">
      <ref role="37XkoT" to="kdzh:hS0KzPONfF" resolve="BuildMps_AbstractModule" />
      <node concept="37Y9Zx" id="7gAtt1juf1X" role="37ZfLb">
        <node concept="3clFbS" id="7gAtt1jufwa" role="2VODD2">
          <node concept="3clFbF" id="7gAtt1jufwb" role="3cqZAp">
            <node concept="37vLTI" id="7gAtt1jufw$" role="3clFbG">
              <node concept="2OqwBi" id="7gAtt1jufwt" role="37vLTJ">
                <node concept="1r4Lsj" id="7gAtt1jufwc" role="2Oq$k0" />
                <node concept="3TrcHB" id="7gAtt1jufwz" role="2OqNvi">
                  <ref role="3TsBF5" to="kdzh:7gAtt1jueAd" resolve="compact" />
                </node>
              </node>
              <node concept="3clFbT" id="7gAtt1jufwB" role="37vLTx">
                <property role="3clFbU" value="true" />
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="7gAtt1jufwH" role="3cqZAp">
            <node concept="2OqwBi" id="7gAtt1jufxn" role="3clFbG">
              <node concept="2OqwBi" id="7gAtt1jufwZ" role="2Oq$k0">
                <node concept="1r4Lsj" id="7gAtt1jufwI" role="2Oq$k0" />
                <node concept="3TrEf2" id="7gAtt1jufx5" role="2OqNvi">
                  <ref role="3Tt5mk" to="kdzh:hS0KzPP7W_" resolve="path" />
                </node>
              </node>
              <node concept="2DeJnY" id="7gAtt1jufxt" role="2OqNvi" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="37WvkG" id="1OSlDLmrFUy" role="37WGs$">
      <ref role="37XkoT" to="kdzh:1tWbYFNhzsg" resolve="BuildMpsLayout_ModuleSources" />
      <node concept="37Y9Zx" id="1OSlDLmrFUz" role="37ZfLb">
        <node concept="3clFbS" id="1OSlDLmrFU$" role="2VODD2">
          <node concept="3clFbJ" id="1OSlDLmrFU_" role="3cqZAp">
            <node concept="2OqwBi" id="1OSlDLmrFUR" role="3clFbw">
              <node concept="1r4N5L" id="1OSlDLmrFUC" role="2Oq$k0" />
              <node concept="1mIQ4w" id="1OSlDLmrFUW" role="2OqNvi">
                <node concept="chp4Y" id="1OSlDLmrFUY" role="cj9EA">
                  <ref role="cht4Q" to="kdzh:1tWbYFNhzsg" resolve="BuildMpsLayout_ModuleSources" />
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1OSlDLmrFUB" role="3clFbx">
              <node concept="3clFbF" id="1OSlDLmrFUZ" role="3cqZAp">
                <node concept="37vLTI" id="1OSlDLmrFVA" role="3clFbG">
                  <node concept="2OqwBi" id="1OSlDLmrFVf" role="37vLTJ">
                    <node concept="1r4Lsj" id="1OSlDLmrFV0" role="2Oq$k0" />
                    <node concept="3TrEf2" id="1OSlDLmrFVl" role="2OqNvi">
                      <ref role="3Tt5mk" to="kdzh:1tWbYFNhzsh" resolve="module" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="1OSlDLmrFW8" role="37vLTx">
                    <node concept="1PxgMI" id="1OSlDLmrFVS" role="2Oq$k0">
                      <node concept="1r4N5L" id="1OSlDLmrFVD" role="1m5AlR" />
                      <node concept="chp4Y" id="714IaVdGYXg" role="3oSUPX">
                        <ref role="cht4Q" to="kdzh:1tWbYFNhzsg" resolve="BuildMpsLayout_ModuleSources" />
                      </node>
                    </node>
                    <node concept="3TrEf2" id="1OSlDLmrFWe" role="2OqNvi">
                      <ref role="3Tt5mk" to="kdzh:1tWbYFNhzsh" resolve="module" />
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
</model>

