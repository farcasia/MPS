<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:7a1c88cb-66d9-4726-9b4a-d5dc6c544de7(jetbrains.mps.samples.SwingBuilder.constraints)">
  <persistence version="9" />
  <languages>
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="o8zo" ref="r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)" />
    <import index="yo60" ref="r:f03fbd24-52ae-4ae3-8913-228f5120a390(jetbrains.mps.samples.SwingBuilder.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
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
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
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
      <concept id="1143234257716" name="jetbrains.mps.lang.smodel.structure.Node_GetModelOperation" flags="nn" index="I4A8Y" />
      <concept id="1171315804604" name="jetbrains.mps.lang.smodel.structure.Model_RootsOperation" flags="nn" index="2RRcyG">
        <reference id="1171315804605" name="concept" index="2RRcyH" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1176903168877" name="jetbrains.mps.baseLanguage.collections.structure.UnionOperation" flags="nn" index="4Tj9Z" />
      <concept id="1176906603202" name="jetbrains.mps.baseLanguage.collections.structure.BinaryOperation" flags="nn" index="56pJg">
        <child id="1176906787974" name="rightExpression" index="576Qk" />
      </concept>
    </language>
  </registry>
  <node concept="1M2fIO" id="OfqpBCey1L">
    <property role="3GE5qa" value="transform" />
    <ref role="1M2myG" to="yo60:OfqpBCexUa" resolve="ElementReference" />
    <node concept="1N5Pfh" id="OfqpBCey1M" role="1Mr941">
      <ref role="1N5Vy1" to="yo60:OfqpBCexUb" resolve="element" />
      <node concept="3dgokm" id="5Vvmn_Ql3vP" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_Ql3vQ" role="2VODD2">
          <node concept="3clFbF" id="5Vvmn_Ql3vR" role="3cqZAp">
            <node concept="2YIFZM" id="5Vvmn_Ql3vS" role="3clFbG">
              <ref role="37wK5l" to="o8zo:4IP40Bi3eAf" resolve="forNamedElements" />
              <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
              <node concept="2OqwBi" id="5Vvmn_Ql3vT" role="37wK5m">
                <node concept="2OqwBi" id="5Vvmn_Ql3vU" role="2Oq$k0">
                  <node concept="2OqwBi" id="5Vvmn_Ql3w1" role="2Oq$k0">
                    <node concept="2rP1CM" id="5Vvmn_Ql3w2" role="2Oq$k0" />
                    <node concept="I4A8Y" id="5Vvmn_Ql3w3" role="2OqNvi" />
                  </node>
                  <node concept="2RRcyG" id="5Vvmn_Ql3vW" role="2OqNvi">
                    <ref role="2RRcyH" to="yo60:OfqpBCexLx" resolve="Filter" />
                  </node>
                </node>
                <node concept="4Tj9Z" id="5Vvmn_Ql3vX" role="2OqNvi">
                  <node concept="2OqwBi" id="5Vvmn_Ql3vY" role="576Qk">
                    <node concept="2OqwBi" id="5Vvmn_Ql3w4" role="2Oq$k0">
                      <node concept="2rP1CM" id="5Vvmn_Ql3w5" role="2Oq$k0" />
                      <node concept="I4A8Y" id="5Vvmn_Ql3w6" role="2OqNvi" />
                    </node>
                    <node concept="2RRcyG" id="5Vvmn_Ql3w0" role="2OqNvi">
                      <ref role="2RRcyH" to="yo60:OfqpBCexQl" resolve="Map" />
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

