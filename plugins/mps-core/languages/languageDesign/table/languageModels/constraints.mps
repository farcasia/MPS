<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:a310da22-eca6-4f58-b266-8f97a737583f(jetbrains.mps.lang.editor.table.constraints)">
  <persistence version="9" />
  <languages>
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="ohyq" ref="r:2ae43476-98ce-4354-9a55-d7b44e372d64(jetbrains.mps.lang.editor.table.structure)" />
    <import index="tpce" ref="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" />
    <import index="tpcn" ref="r:00000000-0000-4000-0000-011c8959028b(jetbrains.mps.lang.structure.behavior)" />
    <import index="o8zo" ref="r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)" />
    <import index="n3wi" ref="r:86ce5303-096b-481a-b577-1636d0ef54ad(jetbrains.mps.lang.editor.table.behavior)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
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
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="5564765827938091039" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Scope" flags="ig" index="3dgokm" />
      <concept id="1163200647017" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_referenceNode" flags="nn" index="3kakTB" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="1213100494875" name="referent" index="1Mr941" />
      </concept>
      <concept id="1148687176410" name="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" flags="ng" index="1N5Pfh">
        <reference id="1148687202698" name="applicableLink" index="1N5Vy1" />
        <child id="1148687345559" name="searchScopeFactory" index="1N6uqs" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1171999116870" name="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" flags="nn" index="3w_OXm" />
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="1151702311717" name="jetbrains.mps.baseLanguage.collections.structure.ToListOperation" flags="nn" index="ANE8D" />
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1202120902084" name="jetbrains.mps.baseLanguage.collections.structure.WhereOperation" flags="nn" index="3zZkjj" />
    </language>
  </registry>
  <node concept="1M2fIO" id="5p3TFWLvDOc">
    <ref role="1M2myG" to="ohyq:1X4JaHeCxHy" resolve="CellModel_HierarchycalTable" />
    <node concept="1N5Pfh" id="5p3TFWLvDOd" role="1Mr941">
      <ref role="1N5Vy1" to="ohyq:5p3TFWLvDOh" resolve="headerRowLinkDeclaration" />
      <node concept="3dgokm" id="5Vvmn_Ql1V$" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_Ql1V_" role="2VODD2">
          <node concept="3clFbF" id="5Vvmn_Ql1VA" role="3cqZAp">
            <node concept="2YIFZM" id="5Vvmn_Ql242" role="3clFbG">
              <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
              <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
              <node concept="2OqwBi" id="5Vvmn_Ql243" role="37wK5m">
                <node concept="2OqwBi" id="5Vvmn_Ql244" role="2Oq$k0">
                  <node concept="3zZkjj" id="5Vvmn_Ql245" role="2OqNvi">
                    <node concept="1bVj0M" id="5Vvmn_Ql246" role="23t8la">
                      <node concept="Rh6nW" id="5Vvmn_Ql247" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="5Vvmn_Ql248" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="5Vvmn_Ql249" role="1bW5cS">
                        <node concept="3clFbF" id="5Vvmn_Ql24a" role="3cqZAp">
                          <node concept="3fqX7Q" id="5Vvmn_Ql24b" role="3clFbG">
                            <node concept="2OqwBi" id="5Vvmn_Ql24c" role="3fr31v">
                              <node concept="37vLTw" id="5Vvmn_Ql24d" role="2Oq$k0">
                                <ref role="3cqZAo" node="5Vvmn_Ql247" resolve="it" />
                              </node>
                              <node concept="2qgKlT" id="5Vvmn_Ql24e" role="2OqNvi">
                                <ref role="37wK5l" to="tpcn:hEwIfAt" resolve="isSingular" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2OqwBi" id="5Vvmn_Ql24f" role="2Oq$k0">
                    <node concept="2OqwBi" id="5Vvmn_Ql24g" role="2Oq$k0">
                      <node concept="3kakTB" id="5Vvmn_Ql24h" role="2Oq$k0" />
                      <node concept="2qgKlT" id="5Vvmn_Ql24i" role="2OqNvi">
                        <ref role="37wK5l" to="n3wi:5p3TFWLvETA" resolve="getContainingConceptDeclaration" />
                      </node>
                    </node>
                    <node concept="2qgKlT" id="5Vvmn_Ql24j" role="2OqNvi">
                      <ref role="37wK5l" to="tpcn:hEwILLp" resolve="getAggregationLinkDeclarations" />
                    </node>
                  </node>
                </node>
                <node concept="ANE8D" id="5Vvmn_Ql24k" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1N5Pfh" id="5p3TFWLvEhJ" role="1Mr941">
      <ref role="1N5Vy1" to="ohyq:5p3TFWLvDOi" resolve="rowsLinkDeclaration" />
      <node concept="3dgokm" id="5Vvmn_Ql24l" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_Ql24m" role="2VODD2">
          <node concept="3clFbF" id="5Vvmn_Ql24n" role="3cqZAp">
            <node concept="2YIFZM" id="5Vvmn_Ql28l" role="3clFbG">
              <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
              <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
              <node concept="2OqwBi" id="5Vvmn_Ql28m" role="37wK5m">
                <node concept="2OqwBi" id="5Vvmn_Ql28n" role="2Oq$k0">
                  <node concept="2OqwBi" id="5Vvmn_Ql28o" role="2Oq$k0">
                    <node concept="3kakTB" id="5Vvmn_Ql28p" role="2Oq$k0" />
                    <node concept="2qgKlT" id="5Vvmn_Ql28q" role="2OqNvi">
                      <ref role="37wK5l" to="n3wi:5p3TFWLvETA" resolve="getContainingConceptDeclaration" />
                    </node>
                  </node>
                  <node concept="2qgKlT" id="5Vvmn_Ql28r" role="2OqNvi">
                    <ref role="37wK5l" to="tpcn:hEwILLp" resolve="getAggregationLinkDeclarations" />
                  </node>
                </node>
                <node concept="3zZkjj" id="5Vvmn_Ql28s" role="2OqNvi">
                  <node concept="1bVj0M" id="5Vvmn_Ql28t" role="23t8la">
                    <node concept="3clFbS" id="5Vvmn_Ql28u" role="1bW5cS">
                      <node concept="3clFbF" id="5Vvmn_Ql28v" role="3cqZAp">
                        <node concept="3fqX7Q" id="5Vvmn_Ql28w" role="3clFbG">
                          <node concept="2OqwBi" id="5Vvmn_Ql28x" role="3fr31v">
                            <node concept="37vLTw" id="5Vvmn_Ql28y" role="2Oq$k0">
                              <ref role="3cqZAo" node="5Vvmn_Ql28$" resolve="it" />
                            </node>
                            <node concept="2qgKlT" id="5Vvmn_Ql28z" role="2OqNvi">
                              <ref role="37wK5l" to="tpcn:hEwIfAt" resolve="isSingular" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="5Vvmn_Ql28$" role="1bW2Oz">
                      <property role="TrG5h" value="it" />
                      <node concept="2jxLKc" id="5Vvmn_Ql28_" role="1tU5fm" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1N5Pfh" id="5p3TFWLvEUT" role="1Mr941">
      <ref role="1N5Vy1" to="ohyq:5p3TFWLvDOj" resolve="cellsInRowLinkDeclaration" />
      <node concept="3dgokm" id="5Vvmn_Ql28A" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_Ql28B" role="2VODD2">
          <node concept="3clFbJ" id="5Vvmn_Ql28C" role="3cqZAp">
            <node concept="3clFbS" id="5Vvmn_Ql28D" role="3clFbx">
              <node concept="3cpWs6" id="5Vvmn_Ql28E" role="3cqZAp">
                <node concept="10Nm6u" id="5Vvmn_Ql28F" role="3cqZAk" />
              </node>
            </node>
            <node concept="2OqwBi" id="5Vvmn_Ql28G" role="3clFbw">
              <node concept="2OqwBi" id="5Vvmn_Ql28H" role="2Oq$k0">
                <node concept="3kakTB" id="5Vvmn_Ql28I" role="2Oq$k0" />
                <node concept="3TrEf2" id="5Vvmn_Ql28J" role="2OqNvi">
                  <ref role="3Tt5mk" to="ohyq:5p3TFWLvDOi" resolve="rowsLinkDeclaration" />
                </node>
              </node>
              <node concept="3w_OXm" id="5Vvmn_Ql28K" role="2OqNvi" />
            </node>
          </node>
          <node concept="3clFbF" id="5Vvmn_Ql28L" role="3cqZAp">
            <node concept="2YIFZM" id="5Vvmn_Ql2bj" role="3clFbG">
              <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
              <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
              <node concept="2OqwBi" id="5Vvmn_Ql2bk" role="37wK5m">
                <node concept="2OqwBi" id="5Vvmn_Ql2bl" role="2Oq$k0">
                  <node concept="2OqwBi" id="5Vvmn_Ql2bm" role="2Oq$k0">
                    <node concept="2OqwBi" id="5Vvmn_Ql2bn" role="2Oq$k0">
                      <node concept="3kakTB" id="5Vvmn_Ql2bo" role="2Oq$k0" />
                      <node concept="3TrEf2" id="5Vvmn_Ql2bp" role="2OqNvi">
                        <ref role="3Tt5mk" to="ohyq:5p3TFWLvDOi" resolve="rowsLinkDeclaration" />
                      </node>
                    </node>
                    <node concept="3TrEf2" id="5Vvmn_Ql2bq" role="2OqNvi">
                      <ref role="3Tt5mk" to="tpce:fA0lvVK" resolve="target" />
                    </node>
                  </node>
                  <node concept="2qgKlT" id="5Vvmn_Ql2br" role="2OqNvi">
                    <ref role="37wK5l" to="tpcn:hEwILLp" resolve="getAggregationLinkDeclarations" />
                  </node>
                </node>
                <node concept="3zZkjj" id="5Vvmn_Ql2bs" role="2OqNvi">
                  <node concept="1bVj0M" id="5Vvmn_Ql2bt" role="23t8la">
                    <node concept="3clFbS" id="5Vvmn_Ql2bu" role="1bW5cS">
                      <node concept="3clFbF" id="5Vvmn_Ql2bv" role="3cqZAp">
                        <node concept="3fqX7Q" id="5Vvmn_Ql2bw" role="3clFbG">
                          <node concept="2OqwBi" id="5Vvmn_Ql2bx" role="3fr31v">
                            <node concept="37vLTw" id="5Vvmn_Ql2by" role="2Oq$k0">
                              <ref role="3cqZAo" node="5Vvmn_Ql2b$" resolve="it" />
                            </node>
                            <node concept="2qgKlT" id="5Vvmn_Ql2bz" role="2OqNvi">
                              <ref role="37wK5l" to="tpcn:hEwIfAt" resolve="isSingular" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="5Vvmn_Ql2b$" role="1bW2Oz">
                      <property role="TrG5h" value="it" />
                      <node concept="2jxLKc" id="5Vvmn_Ql2b_" role="1tU5fm" />
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

