<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:75e9cc25-34d9-458a-877d-a0e0739f24a6(jetbrains.mps.ide.httpsupport.dataFlow)">
  <persistence version="9" />
  <languages>
    <devkit ref="00000000-0000-4000-0000-443879f56b80(jetbrains.mps.devkit.aspect.dataflow)" />
  </languages>
  <imports>
    <import index="ndib" ref="r:3c30b5c5-2f86-4daf-bab8-b406cfefcb4f(jetbrains.mps.ide.httpsupport.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
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
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
    </language>
    <language id="7fa12e9c-b949-4976-b4fa-19accbc320b4" name="jetbrains.mps.lang.dataFlow">
      <concept id="1206442055221" name="jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration" flags="ig" index="3_zdsH">
        <reference id="1206442096288" name="conceptDeclaration" index="3_znuS" />
        <child id="1206442812839" name="builderBlock" index="3_A6iZ" />
      </concept>
      <concept id="1206442659665" name="jetbrains.mps.lang.dataFlow.structure.BuilderBlock" flags="in" index="3__wT9" />
      <concept id="1206442747519" name="jetbrains.mps.lang.dataFlow.structure.NodeParameter" flags="nn" index="3__QtB" />
      <concept id="1206454052847" name="jetbrains.mps.lang.dataFlow.structure.EmitCodeForStatement" flags="nn" index="3AgYrR">
        <child id="1206454079161" name="codeFor" index="3Ah4Yx" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
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
  <node concept="3_zdsH" id="21vgRr5B7m7">
    <property role="3GE5qa" value="handler" />
    <ref role="3_znuS" to="ndib:5YhakczH$Z1" resolve="ResponseSendOperation" />
    <node concept="3__wT9" id="21vgRr5B7m8" role="3_A6iZ">
      <node concept="3clFbS" id="21vgRr5B7m9" role="2VODD2">
        <node concept="3AgYrR" id="21vgRr5B7my" role="3cqZAp">
          <node concept="2OqwBi" id="21vgRr5B7u_" role="3Ah4Yx">
            <node concept="3__QtB" id="21vgRr5B7mV" role="2Oq$k0" />
            <node concept="3TrEf2" id="5YhakczJnyu" role="2OqNvi">
              <ref role="3Tt5mk" to="ndib:5YhakczH_0Z" resolve="buffer" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="3_zdsH" id="3wy6fduD_Hi">
    <property role="3GE5qa" value="request" />
    <ref role="3_znuS" to="ndib:40BYgsZXsWn" resolve="ParameterInitializer" />
    <node concept="3__wT9" id="3wy6fduD_Hj" role="3_A6iZ">
      <node concept="3clFbS" id="3wy6fduD_Hk" role="2VODD2">
        <node concept="3AgYrR" id="3wy6fduD_HB" role="3cqZAp">
          <node concept="2OqwBi" id="3wy6fduD_Pc" role="3Ah4Yx">
            <node concept="3__QtB" id="3wy6fduD_I0" role="2Oq$k0" />
            <node concept="3TrEf2" id="3wy6fduD_YT" role="2OqNvi">
              <ref role="3Tt5mk" to="ndib:40BYgsZXsWq" resolve="value" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="3_zdsH" id="3wy6fduDA22">
    <property role="3GE5qa" value="request" />
    <ref role="3_znuS" to="ndib:40BYgsZXsUj" resolve="RequestURLBuilderExpression" />
    <node concept="3__wT9" id="3wy6fduDA23" role="3_A6iZ">
      <node concept="3clFbS" id="3wy6fduDA24" role="2VODD2">
        <node concept="2Gpval" id="3wy6fduDA2q" role="3cqZAp">
          <node concept="2GrKxI" id="3wy6fduDA2r" role="2Gsz3X">
            <property role="TrG5h" value="initializer" />
          </node>
          <node concept="2OqwBi" id="3wy6fduDAdq" role="2GsD0m">
            <node concept="3__QtB" id="3wy6fduDA3N" role="2Oq$k0" />
            <node concept="3Tsc0h" id="3wy6fduDAoC" role="2OqNvi">
              <ref role="3TtcxE" to="ndib:40BYgsZX_bR" resolve="initializer" />
            </node>
          </node>
          <node concept="3clFbS" id="3wy6fduDA2t" role="2LFqv$">
            <node concept="3AgYrR" id="3wy6fduDArm" role="3cqZAp">
              <node concept="2GrUjf" id="3wy6fduDArJ" role="3Ah4Yx">
                <ref role="2Gs0qQ" node="3wy6fduDA2r" resolve="initializer" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

