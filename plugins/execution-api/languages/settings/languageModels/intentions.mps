<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2f15cca9-9d4b-4caa-8c6d-31f12b9faf00(jetbrains.mps.execution.settings.intentions)">
  <persistence version="9" />
  <languages>
    <use id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="fb9u" ref="r:0194e190-08ef-44f6-ab95-d9cffdb7e27b(jetbrains.mps.execution.settings.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
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
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
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
      <concept id="1138757581985" name="jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation" flags="nn" index="zfrQC" />
      <concept id="1171999116870" name="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" flags="nn" index="3w_OXm" />
      <concept id="6407023681583036853" name="jetbrains.mps.lang.smodel.structure.NodeAttributeQualifier" flags="ng" index="3CFYIy">
        <reference id="6407023681583036854" name="attributeConcept" index="3CFYIx" />
      </concept>
      <concept id="6407023681583031218" name="jetbrains.mps.lang.smodel.structure.AttributeAccess" flags="nn" index="3CFZ6_">
        <child id="6407023681583036852" name="qualifier" index="3CFYIz" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1228341669568" name="jetbrains.mps.lang.smodel.structure.Node_DetachOperation" flags="nn" index="3YRAZt" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="2S6QgY" id="7YdSxSAfUv$">
    <property role="TrG5h" value="ToggleDeprecatedAnnotation" />
    <ref role="2ZfgGC" to="fb9u:O$iR4J$g0w" resolve="PersistentConfiguration" />
    <node concept="2S6ZIM" id="7YdSxSAfUv_" role="2ZfVej">
      <node concept="3clFbS" id="7YdSxSAfUvA" role="2VODD2">
        <node concept="3clFbJ" id="7YdSxSAfUxu" role="3cqZAp">
          <node concept="3clFbS" id="7YdSxSAfUxv" role="3clFbx">
            <node concept="3cpWs6" id="7YdSxSAfUxz" role="3cqZAp">
              <node concept="3cpWs3" id="7YdSxSAfUvZ" role="3cqZAk">
                <node concept="2OqwBi" id="7YdSxSAfUwn" role="3uHU7w">
                  <node concept="2Sf5sV" id="7YdSxSAfUw2" role="2Oq$k0" />
                  <node concept="3TrcHB" id="7YdSxSAfUwt" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
                <node concept="Xl_RD" id="7YdSxSAfUvE" role="3uHU7B">
                  <property role="Xl_RC" value="Deprecate configuration " />
                </node>
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="7YdSxSAfUxm" role="3clFbw">
            <node concept="2OqwBi" id="7YdSxSAfUwR" role="2Oq$k0">
              <node concept="2Sf5sV" id="7YdSxSAfUwy" role="2Oq$k0" />
              <node concept="3CFZ6_" id="7YdSxSAfUwW" role="2OqNvi">
                <node concept="3CFYIy" id="7YdSxSAfUx0" role="3CFYIz">
                  <ref role="3CFYIx" to="fb9u:7YdSxSAfPwp" resolve="DeprecatedAnnotation" />
                </node>
              </node>
            </node>
            <node concept="3w_OXm" id="7YdSxSAfUxs" role="2OqNvi" />
          </node>
        </node>
        <node concept="3cpWs6" id="7YdSxSAfUxC" role="3cqZAp">
          <node concept="Xl_RD" id="7YdSxSAfUxE" role="3cqZAk">
            <property role="Xl_RC" value="Remove deprecated annotation" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2Sbjvc" id="7YdSxSAfUvB" role="2ZfgGD">
      <node concept="3clFbS" id="7YdSxSAfUvC" role="2VODD2">
        <node concept="3clFbJ" id="7YdSxSAfUxF" role="3cqZAp">
          <node concept="3clFbS" id="7YdSxSAfUxG" role="3clFbx">
            <node concept="3clFbF" id="7YdSxSAfUxX" role="3cqZAp">
              <node concept="2OqwBi" id="7YdSxSAfUyM" role="3clFbG">
                <node concept="2OqwBi" id="7YdSxSAfUyj" role="2Oq$k0">
                  <node concept="2Sf5sV" id="7YdSxSAfUxY" role="2Oq$k0" />
                  <node concept="3CFZ6_" id="7YdSxSAfUyo" role="2OqNvi">
                    <node concept="3CFYIy" id="7YdSxSAfUys" role="3CFYIz">
                      <ref role="3CFYIx" to="fb9u:7YdSxSAfPwp" resolve="DeprecatedAnnotation" />
                    </node>
                  </node>
                </node>
                <node concept="zfrQC" id="7YdSxSAfUyS" role="2OqNvi" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="7YdSxSAfUxN" role="3clFbw">
            <node concept="2OqwBi" id="7YdSxSAfUxO" role="2Oq$k0">
              <node concept="2Sf5sV" id="7YdSxSAfUxP" role="2Oq$k0" />
              <node concept="3CFZ6_" id="7YdSxSAfUxQ" role="2OqNvi">
                <node concept="3CFYIy" id="7YdSxSAfUxR" role="3CFYIz">
                  <ref role="3CFYIx" to="fb9u:7YdSxSAfPwp" resolve="DeprecatedAnnotation" />
                </node>
              </node>
            </node>
            <node concept="3w_OXm" id="7YdSxSAfUxS" role="2OqNvi" />
          </node>
          <node concept="9aQIb" id="7YdSxSAfUyU" role="9aQIa">
            <node concept="3clFbS" id="7YdSxSAfUyV" role="9aQI4">
              <node concept="3clFbF" id="7YdSxSAfUyW" role="3cqZAp">
                <node concept="2OqwBi" id="7YdSxSAfUzL" role="3clFbG">
                  <node concept="2OqwBi" id="7YdSxSAfUzi" role="2Oq$k0">
                    <node concept="2Sf5sV" id="7YdSxSAfUyX" role="2Oq$k0" />
                    <node concept="3CFZ6_" id="7YdSxSAfUzo" role="2OqNvi">
                      <node concept="3CFYIy" id="7YdSxSAfUzr" role="3CFYIz">
                        <ref role="3CFYIx" to="fb9u:7YdSxSAfPwp" resolve="DeprecatedAnnotation" />
                      </node>
                    </node>
                  </node>
                  <node concept="3YRAZt" id="7YdSxSAfUzR" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

