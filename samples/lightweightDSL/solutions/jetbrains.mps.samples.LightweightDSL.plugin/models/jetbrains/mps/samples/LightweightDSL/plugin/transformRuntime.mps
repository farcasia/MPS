<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:b3a29194-ba8e-4a49-9d07-3de7435e51e1(jetbrains.mps.samples.LightweightDSL.plugin.transformRuntime)">
  <persistence version="9" />
  <languages>
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="6" />
  </languages>
  <imports>
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1164991038168" name="jetbrains.mps.baseLanguage.structure.ThrowStatement" flags="nn" index="YS8fn">
        <child id="1164991057263" name="throwable" index="YScLw" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <property id="1075300953594" name="abstractClass" index="1sVAO0" />
        <property id="1221565133444" name="isFinal" index="1EXbeo" />
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
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
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
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
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="OfqpBCfa5b">
    <property role="TrG5h" value="PipelineElement" />
    <property role="1sVAO0" value="true" />
    <node concept="3clFb_" id="OfqpBCfa5C" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="transformValue" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="OfqpBCfa5F" role="3clF47" />
      <node concept="3Tm1VV" id="OfqpBCfa5r" role="1B3o_S" />
      <node concept="10Oyi0" id="OfqpBCfa5$" role="3clF45" />
      <node concept="37vLTG" id="OfqpBCfa5P" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="10Oyi0" id="OfqpBCfa5O" role="1tU5fm" />
      </node>
    </node>
    <node concept="3Tm1VV" id="OfqpBCfa5c" role="1B3o_S" />
  </node>
  <node concept="312cEu" id="OfqpBCgW3n">
    <property role="TrG5h" value="DummyPipelineElement" />
    <property role="1EXbeo" value="true" />
    <node concept="3clFb_" id="OfqpBCgW44" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="transformValue" />
      <property role="od$2w" value="false" />
      <property role="DiZV1" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3Tm1VV" id="OfqpBCgW46" role="1B3o_S" />
      <node concept="10Oyi0" id="OfqpBCgW47" role="3clF45" />
      <node concept="37vLTG" id="OfqpBCgW48" role="3clF46">
        <property role="TrG5h" value="value" />
        <node concept="10Oyi0" id="OfqpBCgW49" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="OfqpBCgW4a" role="3clF47">
        <node concept="YS8fn" id="OfqpBCgW5f" role="3cqZAp">
          <node concept="2ShNRf" id="OfqpBCgW5F" role="YScLw">
            <node concept="1pGfFk" id="OfqpBCgW9X" role="2ShVmc">
              <ref role="37wK5l" to="wyt6:~UnsupportedOperationException.&lt;init&gt;(java.lang.String)" resolve="UnsupportedOperationException" />
              <node concept="Xl_RD" id="OfqpBCgWat" role="37wK5m">
                <property role="Xl_RC" value="This class should never be instantiated" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="OfqpBCgW3o" role="1B3o_S" />
    <node concept="3uibUv" id="OfqpBCgW3R" role="1zkMxy">
      <ref role="3uigEE" node="OfqpBCfa5b" resolve="PipelineElement" />
    </node>
  </node>
</model>

