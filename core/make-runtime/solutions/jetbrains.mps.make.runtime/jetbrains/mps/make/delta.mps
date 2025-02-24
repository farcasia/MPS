<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:0bcaf439-5bc6-429b-a457-4e0d9746449f(jetbrains.mps.make.delta)">
  <persistence version="9" />
  <languages>
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="6" />
  </languages>
  <imports />
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS" />
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1107796713796" name="jetbrains.mps.baseLanguage.structure.Interface" flags="ig" index="3HP615">
        <child id="1107797138135" name="extendedInterface" index="3HQHJm" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="3HP615" id="16rzRJauwMP">
    <property role="TrG5h" value="IDelta" />
    <node concept="3Tm1VV" id="16rzRJauwN4" role="1B3o_S" />
    <node concept="3clFb_" id="16rzRJauwMU" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="merge" />
      <node concept="3uibUv" id="16rzRJauwMV" role="3clF45">
        <ref role="3uigEE" node="16rzRJauwMP" resolve="IDelta" />
      </node>
      <node concept="3Tm1VV" id="16rzRJauwMW" role="1B3o_S" />
      <node concept="3clFbS" id="16rzRJauwMX" role="3clF47" />
      <node concept="37vLTG" id="16rzRJauwMY" role="3clF46">
        <property role="TrG5h" value="toMerge" />
        <node concept="3uibUv" id="16rzRJauwMZ" role="1tU5fm">
          <ref role="3uigEE" node="16rzRJauwMP" resolve="IDelta" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="4V1O046KmiZ" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="contains" />
      <node concept="10P_77" id="4V1O046Kmj3" role="3clF45" />
      <node concept="3Tm1VV" id="4V1O046Kmj1" role="1B3o_S" />
      <node concept="3clFbS" id="4V1O046Kmj2" role="3clF47" />
      <node concept="37vLTG" id="4V1O046Kmj4" role="3clF46">
        <property role="TrG5h" value="other" />
        <node concept="3uibUv" id="4V1O046Kmj5" role="1tU5fm">
          <ref role="3uigEE" node="16rzRJauwMP" resolve="IDelta" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="16rzRJauwN0" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="reconcile" />
      <node concept="10P_77" id="16rzRJauwN1" role="3clF45" />
      <node concept="3Tm1VV" id="16rzRJauwN2" role="1B3o_S" />
      <node concept="3clFbS" id="16rzRJauwN3" role="3clF47" />
    </node>
    <node concept="3clFb_" id="6uL$bP9UH41" role="jymVt">
      <property role="1EzhhJ" value="true" />
      <property role="TrG5h" value="acceptVisitor" />
      <node concept="37vLTG" id="6uL$bP9UH46" role="3clF46">
        <property role="TrG5h" value="visitor" />
        <node concept="3uibUv" id="6uL$bP9UH48" role="1tU5fm">
          <ref role="3uigEE" node="5gNumu$ELT8" resolve="IDeltaVisitor" />
        </node>
      </node>
      <node concept="10P_77" id="6uL$bP9UH45" role="3clF45" />
      <node concept="3Tm1VV" id="6uL$bP9UH43" role="1B3o_S" />
      <node concept="3clFbS" id="6uL$bP9UH44" role="3clF47" />
    </node>
  </node>
  <node concept="3HP615" id="4HnUtj9IJNm">
    <property role="TrG5h" value="IInternalDelta" />
    <node concept="3Tm1VV" id="4HnUtj9IJNn" role="1B3o_S" />
    <node concept="3uibUv" id="4HnUtj9IJNo" role="3HQHJm">
      <ref role="3uigEE" node="16rzRJauwMP" resolve="IDelta" />
    </node>
  </node>
  <node concept="3HP615" id="5gNumu$ELT8">
    <property role="TrG5h" value="IDeltaVisitor" />
    <node concept="3Tm1VV" id="5gNumu$ELT9" role="1B3o_S" />
  </node>
</model>

