<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:59d505ea-267a-4174-bf02-615e0817b24f(org.jetbrains.mps.samples.IfAndUnless.behavior)">
  <persistence version="9" />
  <languages>
    <use id="af65afd8-f0dd-4942-87d9-63a55f2a9db1" name="jetbrains.mps.lang.behavior" version="1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="3v68" ref="r:47174b35-df1c-485d-9362-8e3256f44aca(org.jetbrains.mps.samples.IfAndUnless.structure)" />
  </imports>
  <registry>
    <language id="af65afd8-f0dd-4942-87d9-63a55f2a9db1" name="jetbrains.mps.lang.behavior">
      <concept id="1225194240794" name="jetbrains.mps.lang.behavior.structure.ConceptBehavior" flags="ng" index="13h7C7">
        <reference id="1225194240799" name="concept" index="13h7C2" />
        <child id="1225194240805" name="method" index="13h7CS" />
        <child id="1225194240801" name="constructor" index="13h7CW" />
      </concept>
      <concept id="1225194413805" name="jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration" flags="in" index="13hLZK" />
      <concept id="1225194472830" name="jetbrains.mps.lang.behavior.structure.ConceptMethodDeclaration" flags="ng" index="13i0hz">
        <property id="5864038008284099149" name="isStatic" index="2Ki8OM" />
        <property id="1225194472833" name="isPrivate" index="13i0is" />
        <property id="1225194472832" name="isVirtual" index="13i0it" />
        <reference id="1225194472831" name="overriddenMethod" index="13i0hy" />
      </concept>
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
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
  <node concept="13h7C7" id="1653mnvAgrb">
    <ref role="13h7C2" to="3v68:P0flyHh8Nf" resolve="Flow" />
    <node concept="13hLZK" id="1653mnvAgrc" role="13h7CW">
      <node concept="3clFbS" id="1653mnvAgrd" role="2VODD2" />
    </node>
    <node concept="13i0hz" id="1653mnvAgr8" role="13h7CS">
      <property role="2Ki8OM" value="true" />
      <property role="13i0is" value="false" />
      <property role="TrG5h" value="getTitle" />
      <property role="13i0it" value="true" />
      <node concept="3Tm1VV" id="1653mnvAgr9" role="1B3o_S" />
      <node concept="17QB3L" id="1653mnvAgr5" role="3clF45" />
      <node concept="3clFbS" id="1653mnvAgra" role="3clF47">
        <node concept="3cpWs6" id="1653mnvAgr7" role="3cqZAp">
          <node concept="Xl_RD" id="1653mnvAgr6" role="3cqZAk">
            <property role="Xl_RC" value="Abstract flow here" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="13h7C7" id="1653mnvB2sL">
    <ref role="13h7C2" to="3v68:P0flyHhtOv" resolve="TrueFlow" />
    <node concept="13hLZK" id="1653mnvB2sM" role="13h7CW">
      <node concept="3clFbS" id="1653mnvB2sN" role="2VODD2" />
    </node>
    <node concept="13i0hz" id="1653mnvB2sG" role="13h7CS">
      <property role="2Ki8OM" value="true" />
      <property role="13i0is" value="false" />
      <property role="TrG5h" value="getTitle" />
      <property role="13i0it" value="false" />
      <ref role="13i0hy" node="1653mnvAgr8" resolve="getTitle" />
      <node concept="3Tm1VV" id="1653mnvB2sH" role="1B3o_S" />
      <node concept="17QB3L" id="1653mnvB2sF" role="3clF45" />
      <node concept="3clFbS" id="1653mnvB2sI" role="3clF47">
        <node concept="3cpWs6" id="1653mnvB2sK" role="3cqZAp">
          <node concept="Xl_RD" id="1653mnvB2sJ" role="3cqZAk">
            <property role="Xl_RC" value="do" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="13h7C7" id="1653mnvB2uc">
    <ref role="13h7C2" to="3v68:P0flyHhtO$" resolve="FalseFlow" />
    <node concept="13hLZK" id="1653mnvB2ud" role="13h7CW">
      <node concept="3clFbS" id="1653mnvB2ue" role="2VODD2" />
    </node>
    <node concept="13i0hz" id="1653mnvB2u7" role="13h7CS">
      <property role="2Ki8OM" value="true" />
      <property role="13i0is" value="false" />
      <property role="TrG5h" value="getTitle" />
      <property role="13i0it" value="false" />
      <ref role="13i0hy" node="1653mnvAgr8" resolve="getTitle" />
      <node concept="3Tm1VV" id="1653mnvB2u8" role="1B3o_S" />
      <node concept="17QB3L" id="1653mnvB2u6" role="3clF45" />
      <node concept="3clFbS" id="1653mnvB2u9" role="3clF47">
        <node concept="3cpWs6" id="1653mnvB2ub" role="3cqZAp">
          <node concept="Xl_RD" id="1653mnvB2ua" role="3cqZAk">
            <property role="Xl_RC" value="otherwise" />
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

