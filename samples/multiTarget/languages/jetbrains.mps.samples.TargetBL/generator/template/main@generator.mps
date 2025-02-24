<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:3d6e8ec3-b3df-4f01-a5a8-6c4047dba8ca(jetbrains.mps.samples.TargetBL.generator.template.main@generator)">
  <persistence version="9" />
  <languages>
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="0" />
    <use id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext" version="0" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="1" />
    <use id="2be98ea6-ab10-4fb3-8aad-ddec015f4320" name="jetbrains.mps.samples.TargetBL" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
    <devkit ref="a2eb3a43-fcc2-4200-80dc-c60110c4862d(jetbrains.mps.devkit.templates)" />
  </languages>
  <imports>
    <import index="ldfj" ref="r:9f12744a-a702-440b-b5fb-61597de1c627(MultiTarget.structure)" />
    <import index="26tc" ref="r:c0438ea6-d2b1-4733-881f-d4cc1aae0e59(jetbrains.mps.samples.TargetBL.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
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
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg">
        <property id="8606350594693632173" name="isTransient" index="eg7rD" />
        <property id="1240249534625" name="isVolatile" index="34CwA1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1114706874351" name="jetbrains.mps.lang.generator.structure.CopySrcNodeMacro" flags="ln" index="29HgVG" />
      <concept id="1219952072943" name="jetbrains.mps.lang.generator.structure.DropRootRule" flags="lg" index="aNPBN">
        <reference id="1219952338328" name="applicableConcept" index="aOQi4" />
      </concept>
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1219952894531" name="dropRootRule" index="aQYdv" />
        <child id="1167328349397" name="reductionMappingRule" index="3acgRq" />
        <child id="1167514678247" name="rootMappingRule" index="3lj3bC" />
      </concept>
      <concept id="1177093525992" name="jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence" flags="lg" index="gft3U">
        <child id="1177093586806" name="templateNode" index="gfFT$" />
      </concept>
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167327847730" name="jetbrains.mps.lang.generator.structure.Reduction_MappingRule" flags="lg" index="3aamgX">
        <child id="1169672767469" name="ruleConsequence" index="1lVwrX" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167951910403" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery" flags="in" index="3JmXsc" />
      <concept id="1118786554307" name="jetbrains.mps.lang.generator.structure.LoopMacro" flags="ln" index="1WS0z7">
        <child id="1167952069335" name="sourceNodesQuery" index="3Jn$fo" />
      </concept>
    </language>
    <language id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext">
      <concept id="1218047638031" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_CreateUniqueName" flags="nn" index="2piZGk">
        <child id="1218047638032" name="baseName" index="2piZGb" />
        <child id="1218049772449" name="contextNode" index="2pr8EU" />
      </concept>
      <concept id="1216860049635" name="jetbrains.mps.lang.generator.generationContext.structure.TemplateFunctionParameter_generationContext" flags="nn" index="1iwH7S" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="propertyName" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="bUwia" id="6TK9YNcRHP2">
    <property role="TrG5h" value="main" />
    <node concept="aNPBN" id="6TK9YNcRKIX" role="aQYdv">
      <ref role="aOQi4" to="26tc:6TK9YNcRKIo" resolve="IncludeBLTarget" />
    </node>
    <node concept="3aamgX" id="6TK9YNcRItQ" role="3acgRq">
      <ref role="30HIoZ" to="ldfj:JiZx3bYHXv" resolve="StringValue" />
      <node concept="gft3U" id="6TK9YNcRItU" role="1lVwrX">
        <node concept="312cEg" id="6TK9YNcRIu0" role="gfFT$">
          <property role="TrG5h" value="a" />
          <node concept="3Tm6S6" id="6TK9YNcRIu1" role="1B3o_S" />
          <node concept="17QB3L" id="6TK9YNcRIua" role="1tU5fm" />
          <node concept="Xl_RD" id="6TK9YNcRIus" role="33vP2m">
            <property role="Xl_RC" value="" />
            <node concept="17Uvod" id="6TK9YNcRIu_" role="lGtFl">
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1070475926800/1070475926801" />
              <property role="2qtEX9" value="value" />
              <node concept="3zFVjK" id="6TK9YNcRIuC" role="3zH0cK">
                <node concept="3clFbS" id="6TK9YNcRIuD" role="2VODD2">
                  <node concept="3clFbF" id="6TK9YNcRIuJ" role="3cqZAp">
                    <node concept="2OqwBi" id="6TK9YNcRIuE" role="3clFbG">
                      <node concept="3TrcHB" id="6TK9YNcRIuH" role="2OqNvi">
                        <ref role="3TsBF5" to="ldfj:JiZx3bYHXw" resolve="value" />
                      </node>
                      <node concept="30H73N" id="6TK9YNcRIuI" role="2Oq$k0" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="17Uvod" id="6TK9YNcRI$N" role="lGtFl">
            <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
            <property role="2qtEX9" value="name" />
            <node concept="3zFVjK" id="6TK9YNcRI$O" role="3zH0cK">
              <node concept="3clFbS" id="6TK9YNcRI$P" role="2VODD2">
                <node concept="3clFbF" id="6TK9YNcRIEN" role="3cqZAp">
                  <node concept="2OqwBi" id="6TK9YNcRIKp" role="3clFbG">
                    <node concept="1iwH7S" id="6TK9YNcRIEM" role="2Oq$k0" />
                    <node concept="2piZGk" id="6TK9YNcRIRW" role="2OqNvi">
                      <node concept="Xl_RD" id="6TK9YNcRIXe" role="2piZGb">
                        <property role="Xl_RC" value="member" />
                      </node>
                      <node concept="2OqwBi" id="6TK9YNcRJmP" role="2pr8EU">
                        <node concept="30H73N" id="6TK9YNcRJiD" role="2Oq$k0" />
                        <node concept="1mfA1w" id="6TK9YNcRJEK" role="2OqNvi" />
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
    <node concept="3aamgX" id="6TK9YNcRJUi" role="3acgRq">
      <ref role="30HIoZ" to="ldfj:JiZx3bYHYd" resolve="NumericValue" />
      <node concept="gft3U" id="6TK9YNcRJUO" role="1lVwrX">
        <node concept="312cEg" id="6TK9YNcRJUU" role="gfFT$">
          <property role="TrG5h" value="a" />
          <node concept="3Tm6S6" id="6TK9YNcRJUV" role="1B3o_S" />
          <node concept="10Oyi0" id="6TK9YNcRJV4" role="1tU5fm" />
          <node concept="3cmrfG" id="6TK9YNcRJVm" role="33vP2m">
            <property role="3cmrfH" value="0" />
            <node concept="17Uvod" id="6TK9YNcRJVv" role="lGtFl">
              <property role="P4ACc" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580320020/1068580320021" />
              <property role="2qtEX9" value="value" />
              <node concept="3zFVjK" id="6TK9YNcRJVy" role="3zH0cK">
                <node concept="3clFbS" id="6TK9YNcRJVz" role="2VODD2">
                  <node concept="3clFbF" id="6TK9YNcRJVD" role="3cqZAp">
                    <node concept="2OqwBi" id="6TK9YNcRJV$" role="3clFbG">
                      <node concept="3TrcHB" id="6TK9YNcRJVB" role="2OqNvi">
                        <ref role="3TsBF5" to="ldfj:JiZx3bYHYe" resolve="value" />
                      </node>
                      <node concept="30H73N" id="6TK9YNcRJVC" role="2Oq$k0" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="17Uvod" id="6TK9YNcRK6T" role="lGtFl">
            <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
            <property role="2qtEX9" value="name" />
            <node concept="3zFVjK" id="6TK9YNcRK6U" role="3zH0cK">
              <node concept="3clFbS" id="6TK9YNcRK6V" role="2VODD2">
                <node concept="3clFbF" id="6TK9YNcRKmC" role="3cqZAp">
                  <node concept="2OqwBi" id="6TK9YNcRKmD" role="3clFbG">
                    <node concept="1iwH7S" id="6TK9YNcRKmE" role="2Oq$k0" />
                    <node concept="2piZGk" id="6TK9YNcRKmF" role="2OqNvi">
                      <node concept="Xl_RD" id="6TK9YNcRKmG" role="2piZGb">
                        <property role="Xl_RC" value="member" />
                      </node>
                      <node concept="2OqwBi" id="6TK9YNcRKmH" role="2pr8EU">
                        <node concept="30H73N" id="6TK9YNcRKmI" role="2Oq$k0" />
                        <node concept="1mfA1w" id="6TK9YNcRKmJ" role="2OqNvi" />
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
    <node concept="3lhOvk" id="6TK9YNcRHP3" role="3lj3bC">
      <ref role="30HIoZ" to="ldfj:JiZx3bYHWt" resolve="Container" />
      <ref role="3lhOvi" node="6TK9YNcRHPk" resolve="map_Container" />
    </node>
  </node>
  <node concept="312cEu" id="6TK9YNcRHPk">
    <property role="TrG5h" value="map_Container" />
    <node concept="312cEg" id="6TK9YNcRI1H" role="jymVt">
      <property role="34CwA1" value="false" />
      <property role="eg7rD" value="false" />
      <property role="TrG5h" value="a" />
      <property role="3TUv4t" value="false" />
      <node concept="3Tm1VV" id="6TK9YNcRHVU" role="1B3o_S" />
      <node concept="10Oyi0" id="6TK9YNcRI1D" role="1tU5fm" />
      <node concept="3cmrfG" id="6TK9YNcRI4J" role="33vP2m">
        <property role="3cmrfH" value="10" />
      </node>
      <node concept="1WS0z7" id="6TK9YNcRI4T" role="lGtFl">
        <node concept="3JmXsc" id="6TK9YNcRI4W" role="3Jn$fo">
          <node concept="3clFbS" id="6TK9YNcRI4X" role="2VODD2">
            <node concept="3clFbF" id="6TK9YNcRI53" role="3cqZAp">
              <node concept="2OqwBi" id="6TK9YNcRI4Y" role="3clFbG">
                <node concept="3Tsc0h" id="6TK9YNcRI51" role="2OqNvi">
                  <ref role="3TtcxE" to="ldfj:JiZx3bYHWx" resolve="members" />
                </node>
                <node concept="30H73N" id="6TK9YNcRI52" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="29HgVG" id="6TK9YNcRInr" role="lGtFl" />
    </node>
    <node concept="3Tm1VV" id="6TK9YNcRHPl" role="1B3o_S" />
    <node concept="n94m4" id="6TK9YNcRHPm" role="lGtFl">
      <ref role="n9lRv" to="ldfj:JiZx3bYHWt" resolve="Container" />
    </node>
    <node concept="17Uvod" id="6TK9YNcRHPH" role="lGtFl">
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <property role="2qtEX9" value="name" />
      <node concept="3zFVjK" id="6TK9YNcRHPK" role="3zH0cK">
        <node concept="3clFbS" id="6TK9YNcRHPL" role="2VODD2">
          <node concept="3clFbF" id="6TK9YNcRHPR" role="3cqZAp">
            <node concept="2OqwBi" id="6TK9YNcRHPM" role="3clFbG">
              <node concept="3TrcHB" id="6TK9YNcRHPP" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
              <node concept="30H73N" id="6TK9YNcRHPQ" role="2Oq$k0" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

