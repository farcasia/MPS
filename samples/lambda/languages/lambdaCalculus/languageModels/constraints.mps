<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:3d08e5ef-3618-477b-9827-f996a0e87a53(jetbrains.mps.samples.lambdaCalculus.constraints)">
  <persistence version="9" />
  <languages>
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="qjd" ref="r:d30b7004-00fd-4d3e-bdd6-6ae5346d9b86(jetbrains.mps.samples.lambdaCalculus.structure)" />
    <import index="9dtf" ref="r:86bef719-3805-4be3-860b-08555adf519c(jetbrains.mps.samples.lambdaCalculus.behavior)" />
    <import index="o8zo" ref="r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)" />
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
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
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
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1144226303539" name="jetbrains.mps.baseLanguage.structure.ForeachStatement" flags="nn" index="1DcWWT">
        <child id="1144226360166" name="iterable" index="1DdaDG" />
      </concept>
      <concept id="1144230876926" name="jetbrains.mps.baseLanguage.structure.AbstractForStatement" flags="nn" index="1DupvO">
        <child id="1144230900587" name="variable" index="1Duv9x" />
      </concept>
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="8966504967485224688" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_contextNode" flags="nn" index="2rP1CM" />
      <concept id="5564765827938091039" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Scope" flags="ig" index="3dgokm" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="1213100494875" name="referent" index="1Mr941" />
      </concept>
      <concept id="1148687176410" name="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" flags="ng" index="1N5Pfh">
        <reference id="1148687202698" name="applicableLink" index="1N5Vy1" />
        <child id="1148687345559" name="searchScopeFactory" index="1N6uqs" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="1173122760281" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorsOperation" flags="nn" index="z$bX8" />
      <concept id="1145383075378" name="jetbrains.mps.lang.smodel.structure.SNodeListType" flags="in" index="2I9FWS">
        <reference id="1145383142433" name="elementConcept" index="2I9WkF" />
      </concept>
      <concept id="1145567426890" name="jetbrains.mps.lang.smodel.structure.SNodeListCreator" flags="nn" index="2T8Vx0">
        <child id="1145567471833" name="createdType" index="2T96Bj" />
      </concept>
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1160666733551" name="jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation" flags="nn" index="X8dFx" />
    </language>
  </registry>
  <node concept="1M2fIO" id="3vh6UvnZ_in">
    <ref role="1M2myG" to="qjd:4zrttnsimG8" resolve="VariableReference" />
    <node concept="1N5Pfh" id="6byhvWkJ76j" role="1Mr941">
      <ref role="1N5Vy1" to="qjd:4zrttnsinFO" resolve="variable" />
      <node concept="3dgokm" id="5Vvmn_Ql3lV" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_Ql3lW" role="2VODD2">
          <node concept="3cpWs8" id="5Vvmn_Ql3lX" role="3cqZAp">
            <node concept="3cpWsn" id="5Vvmn_Ql3lY" role="3cpWs9">
              <property role="TrG5h" value="nodes" />
              <node concept="2I9FWS" id="5Vvmn_Ql3lZ" role="1tU5fm">
                <ref role="2I9WkF" to="qjd:4zrttnsimDf" resolve="VariableOwner" />
              </node>
              <node concept="2OqwBi" id="5Vvmn_Ql3m0" role="33vP2m">
                <node concept="2rP1CM" id="5Vvmn_Ql3mq" role="2Oq$k0" />
                <node concept="z$bX8" id="5Vvmn_Ql3m2" role="2OqNvi">
                  <node concept="1xMEDy" id="5Vvmn_Ql3m3" role="1xVPHs">
                    <node concept="chp4Y" id="5Vvmn_Ql3m4" role="ri$Ld">
                      <ref role="cht4Q" to="qjd:4zrttnsimDf" resolve="VariableOwner" />
                    </node>
                  </node>
                  <node concept="1xIGOp" id="5Vvmn_Ql3m5" role="1xVPHs" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs8" id="5Vvmn_Ql3m6" role="3cqZAp">
            <node concept="3cpWsn" id="5Vvmn_Ql3m7" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <node concept="2I9FWS" id="5Vvmn_Ql3m8" role="1tU5fm">
                <ref role="2I9WkF" to="qjd:4zrttnsimGi" resolve="Variable" />
              </node>
              <node concept="2ShNRf" id="5Vvmn_Ql3m9" role="33vP2m">
                <node concept="2T8Vx0" id="5Vvmn_Ql3ma" role="2ShVmc">
                  <node concept="2I9FWS" id="5Vvmn_Ql3mb" role="2T96Bj">
                    <ref role="2I9WkF" to="qjd:4zrttnsimGi" resolve="Variable" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="1DcWWT" id="5Vvmn_Ql3mc" role="3cqZAp">
            <node concept="3clFbS" id="5Vvmn_Ql3md" role="2LFqv$">
              <node concept="3clFbF" id="5Vvmn_Ql3me" role="3cqZAp">
                <node concept="2OqwBi" id="5Vvmn_Ql3mf" role="3clFbG">
                  <node concept="37vLTw" id="5Vvmn_Ql3mg" role="2Oq$k0">
                    <ref role="3cqZAo" node="5Vvmn_Ql3m7" resolve="result" />
                  </node>
                  <node concept="X8dFx" id="5Vvmn_Ql3mh" role="2OqNvi">
                    <node concept="2OqwBi" id="5Vvmn_Ql3mi" role="25WWJ7">
                      <node concept="37vLTw" id="5Vvmn_Ql3mj" role="2Oq$k0">
                        <ref role="3cqZAo" node="5Vvmn_Ql3mm" resolve="node" />
                      </node>
                      <node concept="2qgKlT" id="5Vvmn_Ql3mk" role="2OqNvi">
                        <ref role="37wK5l" to="9dtf:7M_MU5__$7C" resolve="getVariables" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="5Vvmn_Ql3ml" role="1DdaDG">
              <ref role="3cqZAo" node="5Vvmn_Ql3lY" resolve="nodes" />
            </node>
            <node concept="3cpWsn" id="5Vvmn_Ql3mm" role="1Duv9x">
              <property role="TrG5h" value="node" />
              <node concept="3Tqbb2" id="5Vvmn_Ql3mn" role="1tU5fm">
                <ref role="ehGHo" to="qjd:4zrttnsimDf" resolve="VariableOwner" />
              </node>
            </node>
          </node>
          <node concept="3cpWs6" id="5Vvmn_Ql3mo" role="3cqZAp">
            <node concept="2YIFZM" id="5Vvmn_Ql3nG" role="3cqZAk">
              <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
              <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
              <node concept="37vLTw" id="5Vvmn_Ql3nH" role="37wK5m">
                <ref role="3cqZAo" node="5Vvmn_Ql3m7" resolve="result" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

