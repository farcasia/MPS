<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:6a119c87-1a06-4cee-bbe1-d45beb403975(jetbrains.mps.lang.typesystem.migration)">
  <persistence version="9" />
  <languages>
    <use id="90746344-04fd-4286-97d5-b46ae6a81709" name="jetbrains.mps.lang.migration" version="0" />
    <use id="69b8a993-9b87-4d96-bf0c-3559f4bb0c63" name="jetbrains.mps.lang.slanguage" version="0" />
    <devkit ref="2677cb18-f558-4e33-bc38-a5139cee06dc(jetbrains.mps.devkit.language-design)" />
  </languages>
  <imports>
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="f7uj" ref="r:8ffb9fde-829b-4ee3-ade6-f4eee43e66a8(jetbrains.mps.lang.typesystem.plugin)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="slm6" ref="90746344-04fd-4286-97d5-b46ae6a81709/r:52a3d974-bd4f-4651-ba6e-a2de5e336d95(jetbrains.mps.lang.migration/jetbrains.mps.lang.migration.methods)" implicit="true" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" implicit="true" />
    <import index="1ctc" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util.stream(JDK/)" implicit="true" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081256982272" name="jetbrains.mps.baseLanguage.structure.InstanceOfExpression" flags="nn" index="2ZW3vV">
        <child id="1081256993305" name="classType" index="2ZW6by" />
        <child id="1081256993304" name="leftExpression" index="2ZW6bz" />
      </concept>
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1070534934090" name="jetbrains.mps.baseLanguage.structure.CastExpression" flags="nn" index="10QFUN">
        <child id="1070534934091" name="type" index="10QFUM" />
        <child id="1070534934092" name="expression" index="10QFUP" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
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
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6" />
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="6329021646629104957" name="jetbrains.mps.baseLanguage.structure.TextCommentPart" flags="nn" index="3SKdUq">
        <property id="6329021646629104958" name="text" index="3SKdUp" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="6329021646629175155" name="commentPart" index="3SKWNk" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="c7d5b9dd-a05f-4be2-bc73-f2e16994cc67" name="jetbrains.mps.baseLanguage.lightweightdsl">
      <concept id="8880393040217246788" name="jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodParameterInstance" flags="ig" index="ffn8J">
        <reference id="8880393040217294897" name="decl" index="ffrpq" />
      </concept>
      <concept id="3751132065236767083" name="jetbrains.mps.baseLanguage.lightweightdsl.structure.DependentTypeInstance" flags="ig" index="q3mfm">
        <reference id="3751132065236767084" name="decl" index="q3mfh" />
        <reference id="9097849371505568270" name="point" index="1QQUv3" />
      </concept>
      <concept id="3751132065236767060" name="jetbrains.mps.baseLanguage.lightweightdsl.structure.MethodInstance" flags="ig" index="q3mfD">
        <reference id="19209059688387895" name="decl" index="2VtyIY" />
      </concept>
      <concept id="6478870542308708689" name="jetbrains.mps.baseLanguage.lightweightdsl.structure.PropertyInstance" flags="ig" index="3tT0cZ">
        <reference id="8585153554445465961" name="decl" index="25KYV2" />
      </concept>
      <concept id="6478870542308703666" name="jetbrains.mps.baseLanguage.lightweightdsl.structure.MemberPlaceholder" flags="ng" index="3tTeZs">
        <property id="6478870542308703667" name="caption" index="3tTeZt" />
        <reference id="6478870542308703669" name="decl" index="3tTeZr" />
      </concept>
      <concept id="6478870542308871875" name="jetbrains.mps.baseLanguage.lightweightdsl.structure.BooleanPropertyInstance" flags="ig" index="3tYpMH">
        <property id="6478870542308871876" name="value" index="3tYpME" />
      </concept>
      <concept id="6478870542308871428" name="jetbrains.mps.baseLanguage.lightweightdsl.structure.StringPropertyInstance" flags="ig" index="3tYpXE">
        <property id="6478870542308871429" name="value" index="3tYpXF" />
      </concept>
    </language>
    <language id="69b8a993-9b87-4d96-bf0c-3559f4bb0c63" name="jetbrains.mps.lang.slanguage">
      <concept id="6171083915388330090" name="jetbrains.mps.lang.slanguage.structure.AspectModelRefExpression" flags="ng" index="1qvjxa">
        <reference id="6171083915388597767" name="aspect" index="1quiSB" />
        <child id="6171083915388330091" name="lang" index="1qvjxb" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="427659576753752243" name="jetbrains.mps.lang.smodel.structure.ModulePointer" flags="ng" index="20RdaH">
        <property id="427659576753753627" name="moduleId" index="20Rdg5" />
        <property id="427659576753753625" name="moduleName" index="20Rdg7" />
      </concept>
      <concept id="4497478346159780083" name="jetbrains.mps.lang.smodel.structure.LanguageRefExpression" flags="ng" index="pHN19">
        <child id="3542851458883491298" name="languageId" index="2V$M_3" />
      </concept>
      <concept id="2469893808086079682" name="jetbrains.mps.lang.smodel.structure.LanguageIdentityBySourceModule" flags="ng" index="PFCIn">
        <child id="2469893808086079721" name="moduleReference" index="PFCIW" />
      </concept>
      <concept id="1678062499342629858" name="jetbrains.mps.lang.smodel.structure.ModuleRefExpression" flags="ng" index="37shsh">
        <child id="1678062499342629861" name="moduleId" index="37shsm" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="90746344-04fd-4286-97d5-b46ae6a81709" name="jetbrains.mps.lang.migration">
      <concept id="8352104482584315555" name="jetbrains.mps.lang.migration.structure.MigrationScript" flags="ig" index="3SyAh_">
        <property id="5820409521797704727" name="fromVersion" index="qMTe8" />
      </concept>
    </language>
  </registry>
  <node concept="3SyAh_" id="7mpi6U7znZT">
    <property role="qMTe8" value="0" />
    <property role="TrG5h" value="UseDevkit" />
    <node concept="3Tm1VV" id="7mpi6U7znZU" role="1B3o_S" />
    <node concept="3tTeZs" id="7mpi6U7znZV" role="jymVt">
      <property role="3tTeZt" value="&lt;no execute after&gt;" />
      <ref role="3tTeZr" to="slm6:7ay_HjIMt1a" resolve="execute after" />
    </node>
    <node concept="3tTeZs" id="7mpi6U7znZW" role="jymVt">
      <property role="3tTeZt" value="&lt;no required data&gt;" />
      <ref role="3tTeZr" to="slm6:3A3gNhf1WPI" resolve="requires data" />
    </node>
    <node concept="3tTeZs" id="7mpi6U7znZX" role="jymVt">
      <property role="3tTeZt" value="&lt;no produced data&gt;" />
      <ref role="3tTeZr" to="slm6:536fTXa4WHO" resolve="produces data" />
    </node>
    <node concept="2tJIrI" id="7mpi6U7znZY" role="jymVt" />
    <node concept="3tYpMH" id="7mpi6U7zqt4" role="jymVt">
      <property role="TrG5h" value="isRerunnable" />
      <property role="3tYpME" value="true" />
      <ref role="25KYV2" to="slm6:1JWcQ2VeWIs" resolve="isRerunnable" />
      <node concept="3Tm1VV" id="7mpi6U7zqt6" role="1B3o_S" />
      <node concept="10P_77" id="7mpi6U7zqt7" role="1tU5fm" />
    </node>
    <node concept="3tYpXE" id="7mpi6U7zqtJ" role="jymVt">
      <property role="TrG5h" value="description" />
      <property role="3tYpXF" value="Employ GP and devkit for typesystem aspect models" />
      <ref role="25KYV2" to="slm6:1_lSsE3RFpE" resolve="description" />
      <node concept="3Tm1VV" id="7mpi6U7zqtL" role="1B3o_S" />
      <node concept="17QB3L" id="7mpi6U7zqtM" role="1tU5fm" />
    </node>
    <node concept="q3mfD" id="7mpi6U7zo01" role="jymVt">
      <property role="TrG5h" value="execute" />
      <ref role="2VtyIY" to="slm6:4ubqdNOF9cA" resolve="execute" />
      <node concept="3Tm1VV" id="7mpi6U7zo03" role="1B3o_S" />
      <node concept="3clFbS" id="7mpi6U7zo05" role="3clF47">
        <node concept="3cpWs8" id="7mpi6U7zunB" role="3cqZAp">
          <node concept="3cpWsn" id="7mpi6U7zunC" role="3cpWs9">
            <property role="TrG5h" value="typesystemAspectModel" />
            <node concept="3uibUv" id="50WrGTQNktV" role="1tU5fm">
              <ref role="3uigEE" to="mhbf:~SModel" resolve="SModel" />
            </node>
            <node concept="1qvjxa" id="7mpi6U7zunD" role="33vP2m">
              <ref role="1quiSB" to="f7uj:2LiUEk8oQ$g" resolve="typesystem" />
              <node concept="37vLTw" id="7mpi6U7zunE" role="1qvjxb">
                <ref role="3cqZAo" node="7mpi6U7zo07" resolve="m" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="7mpi6U7zu$1" role="3cqZAp">
          <node concept="3clFbS" id="7mpi6U7zu$3" role="3clFbx">
            <node concept="3cpWs6" id="7mpi6U7zFL1" role="3cqZAp" />
          </node>
          <node concept="3clFbC" id="7mpi6U7zFlT" role="3clFbw">
            <node concept="2ZW3vV" id="7mpi6U7zv6_" role="3uHU7B">
              <node concept="3uibUv" id="7mpi6U7z$3c" role="2ZW6by">
                <ref role="3uigEE" to="w1kc:~SModelInternal" resolve="SModelInternal" />
              </node>
              <node concept="37vLTw" id="7mpi6U7zu$X" role="2ZW6bz">
                <ref role="3cqZAo" node="7mpi6U7zunC" resolve="typesystemAspectModel" />
              </node>
            </node>
            <node concept="3clFbT" id="7mpi6U7zFy3" role="3uHU7w">
              <property role="3clFbU" value="false" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="7mpi6U7zFTv" role="3cqZAp">
          <node concept="3cpWsn" id="7mpi6U7zFTw" role="3cpWs9">
            <property role="TrG5h" value="mi" />
            <node concept="3uibUv" id="7mpi6U7zFTx" role="1tU5fm">
              <ref role="3uigEE" to="w1kc:~SModelInternal" resolve="SModelInternal" />
            </node>
            <node concept="1eOMI4" id="7mpi6U7zFVr" role="33vP2m">
              <node concept="10QFUN" id="7mpi6U7zFVo" role="1eOMHV">
                <node concept="3uibUv" id="7mpi6U7zFVt" role="10QFUM">
                  <ref role="3uigEE" to="w1kc:~SModelInternal" resolve="SModelInternal" />
                </node>
                <node concept="37vLTw" id="7mpi6U7zFW_" role="10QFUP">
                  <ref role="3cqZAo" node="7mpi6U7zunC" resolve="typesystemAspectModel" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="7mpi6U7zLIM" role="3cqZAp">
          <node concept="3cpWsn" id="7mpi6U7zLIN" role="3cpWs9">
            <property role="TrG5h" value="tsAspectDevkit" />
            <property role="3TUv4t" value="true" />
            <node concept="3uibUv" id="7mpi6U7zLIL" role="1tU5fm">
              <ref role="3uigEE" to="lui2:~SModuleReference" resolve="SModuleReference" />
            </node>
            <node concept="37shsh" id="7mpi6U7zLIO" role="33vP2m">
              <node concept="20RdaH" id="7mpi6U7zLIP" role="37shsm">
                <property role="20Rdg5" value="00000000-0000-4000-0000-1de82b3a4936" />
                <property role="20Rdg7" value="jetbrains.mps.devkit.aspect.typesystem" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="7mpi6U7zHKp" role="3cqZAp">
          <node concept="3clFbS" id="7mpi6U7zHKr" role="3clFbx">
            <node concept="3cpWs6" id="7mpi6U7zMzB" role="3cqZAp" />
          </node>
          <node concept="2OqwBi" id="7mpi6U7zJuo" role="3clFbw">
            <node concept="2OqwBi" id="7mpi6U7zHY5" role="2Oq$k0">
              <node concept="37vLTw" id="7mpi6U7zHMK" role="2Oq$k0">
                <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
              </node>
              <node concept="liA8E" id="7mpi6U7zIHX" role="2OqNvi">
                <ref role="37wK5l" to="w1kc:~SModelInternal.importedDevkits():java.util.List" resolve="importedDevkits" />
              </node>
            </node>
            <node concept="liA8E" id="7mpi6U7zLxl" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~List.contains(java.lang.Object):boolean" resolve="contains" />
              <node concept="37vLTw" id="7mpi6U7zMjz" role="37wK5m">
                <ref role="3cqZAo" node="7mpi6U7zLIN" resolve="tsAspectDevkit" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbJ" id="25MX$RJHnV4" role="3cqZAp">
          <node concept="3clFbS" id="25MX$RJHnV6" role="3clFbx">
            <node concept="3SKdUt" id="25MX$RJHoLm" role="3cqZAp">
              <node concept="3SKdUq" id="25MX$RJHoLo" role="3SKWNk">
                <property role="3SKdUp" value="Transition code, in case aspect uses custom extensions, do not turn GP on for it yet." />
              </node>
            </node>
            <node concept="3cpWs6" id="25MX$RJHo6y" role="3cqZAp" />
          </node>
          <node concept="2OqwBi" id="25MX$RJHoag" role="3clFbw">
            <node concept="2OqwBi" id="25MX$RJHoah" role="2Oq$k0">
              <node concept="2OqwBi" id="25MX$RJHoai" role="2Oq$k0">
                <node concept="37vLTw" id="25MX$RJHoaj" role="2Oq$k0">
                  <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
                </node>
                <node concept="liA8E" id="25MX$RJHoak" role="2OqNvi">
                  <ref role="37wK5l" to="w1kc:~SModelInternal.importedLanguageIds():java.util.Collection" resolve="importedLanguageIds" />
                </node>
              </node>
              <node concept="liA8E" id="25MX$RJHoal" role="2OqNvi">
                <ref role="37wK5l" to="33ny:~Collection.stream():java.util.stream.Stream" resolve="stream" />
              </node>
            </node>
            <node concept="liA8E" id="25MX$RJHoam" role="2OqNvi">
              <ref role="37wK5l" to="1ctc:~Stream.anyMatch(java.util.function.Predicate):boolean" resolve="anyMatch" />
              <node concept="1bVj0M" id="25MX$RJHoan" role="37wK5m">
                <node concept="37vLTG" id="25MX$RJHoao" role="1bW2Oz">
                  <property role="TrG5h" value="l" />
                  <node concept="3uibUv" id="25MX$RJHoap" role="1tU5fm">
                    <ref role="3uigEE" to="c17a:~SLanguage" resolve="SLanguage" />
                  </node>
                </node>
                <node concept="3clFbS" id="25MX$RJHoaq" role="1bW5cS">
                  <node concept="3clFbF" id="25MX$RJHoar" role="3cqZAp">
                    <node concept="3fqX7Q" id="25MX$RJHoas" role="3clFbG">
                      <node concept="2OqwBi" id="25MX$RJHoat" role="3fr31v">
                        <node concept="2OqwBi" id="25MX$RJHoau" role="2Oq$k0">
                          <node concept="37vLTw" id="25MX$RJHoav" role="2Oq$k0">
                            <ref role="3cqZAo" node="25MX$RJHoao" resolve="l" />
                          </node>
                          <node concept="liA8E" id="25MX$RJHoaw" role="2OqNvi">
                            <ref role="37wK5l" to="c17a:~SLanguage.getQualifiedName():java.lang.String" resolve="getQualifiedName" />
                          </node>
                        </node>
                        <node concept="liA8E" id="25MX$RJHoax" role="2OqNvi">
                          <ref role="37wK5l" to="wyt6:~String.startsWith(java.lang.String):boolean" resolve="startsWith" />
                          <node concept="Xl_RD" id="25MX$RJHoay" role="37wK5m">
                            <property role="Xl_RC" value="jetbrains.mps." />
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
        <node concept="3clFbF" id="7mpi6U7zMXC" role="3cqZAp">
          <node concept="2OqwBi" id="7mpi6U7zN9O" role="3clFbG">
            <node concept="37vLTw" id="7mpi6U7zMXA" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="7mpi6U7zNzE" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteLanguageId(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="deleteLanguageId" />
              <node concept="pHN19" id="7mpi6U7zYkH" role="37wK5m">
                <node concept="PFCIn" id="7mpi6U7zYu0" role="2V$M_3">
                  <node concept="20RdaH" id="7mpi6U7zYtZ" role="PFCIW">
                    <property role="20Rdg5" value="7a5dda62-9140-4668-ab76-d5ed1746f2b2" />
                    <property role="20Rdg7" value="jetbrains.mps.lang.typesystem" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7mpi6U7zZQk" role="3cqZAp">
          <node concept="2OqwBi" id="7mpi6U7zZQl" role="3clFbG">
            <node concept="37vLTw" id="7mpi6U7zZQm" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="7mpi6U7zZQn" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteLanguageId(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="deleteLanguageId" />
              <node concept="pHN19" id="7mpi6U7zZQo" role="37wK5m">
                <node concept="PFCIn" id="7mpi6U7$04A" role="2V$M_3">
                  <node concept="20RdaH" id="7mpi6U7$04_" role="PFCIW">
                    <property role="20Rdg5" value="d4615e3b-d671-4ba9-af01-2b78369b0ba7" />
                    <property role="20Rdg7" value="jetbrains.mps.lang.pattern" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7mpi6U7$0fp" role="3cqZAp">
          <node concept="2OqwBi" id="7mpi6U7$0fq" role="3clFbG">
            <node concept="37vLTw" id="7mpi6U7$0fr" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="7mpi6U7$0fs" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteLanguageId(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="deleteLanguageId" />
              <node concept="pHN19" id="7mpi6U7$0ft" role="37wK5m">
                <node concept="PFCIn" id="7mpi6U7$0u5" role="2V$M_3">
                  <node concept="20RdaH" id="7mpi6U7$0u4" role="PFCIW">
                    <property role="20Rdg5" value="3a13115c-633c-4c5c-bbcc-75c4219e9555" />
                    <property role="20Rdg7" value="jetbrains.mps.lang.quotation" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7mpi6U7zYY6" role="3cqZAp">
          <node concept="2OqwBi" id="7mpi6U7zYY7" role="3clFbG">
            <node concept="37vLTw" id="7mpi6U7zYY8" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="7mpi6U7zYY9" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteLanguageId(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="deleteLanguageId" />
              <node concept="pHN19" id="7mpi6U7zYYa" role="37wK5m">
                <node concept="PFCIn" id="7mpi6U7zZKl" role="2V$M_3">
                  <node concept="20RdaH" id="7mpi6U7zZKk" role="PFCIW">
                    <property role="20Rdg5" value="f3061a53-9226-4cc5-a443-f952ceaf5816" />
                    <property role="20Rdg7" value="jetbrains.mps.baseLanguage" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7mpi6U7zYuJ" role="3cqZAp">
          <node concept="2OqwBi" id="7mpi6U7zYuK" role="3clFbG">
            <node concept="37vLTw" id="7mpi6U7zYuL" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="7mpi6U7zYuM" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteLanguageId(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="deleteLanguageId" />
              <node concept="pHN19" id="7mpi6U7zYuN" role="37wK5m">
                <node concept="PFCIn" id="7mpi6U7zYXn" role="2V$M_3">
                  <node concept="20RdaH" id="7mpi6U7zYXm" role="PFCIW">
                    <property role="20Rdg5" value="7866978e-a0f0-4cc7-81bc-4d213d9375e1" />
                    <property role="20Rdg7" value="jetbrains.mps.lang.smodel" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7mpi6U7$0Kb" role="3cqZAp">
          <node concept="2OqwBi" id="7mpi6U7$0Kc" role="3clFbG">
            <node concept="37vLTw" id="7mpi6U7$0Kd" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="7mpi6U7$0Ke" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteLanguageId(org.jetbrains.mps.openapi.language.SLanguage):void" resolve="deleteLanguageId" />
              <node concept="pHN19" id="7mpi6U7$0Kf" role="37wK5m">
                <node concept="PFCIn" id="7mpi6U7$0Zg" role="2V$M_3">
                  <node concept="20RdaH" id="7mpi6U7$0Zf" role="PFCIW">
                    <property role="20Rdg5" value="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" />
                    <property role="20Rdg7" value="jetbrains.mps.lang.actions" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5GtzFfaza37" role="3cqZAp">
          <node concept="2OqwBi" id="5GtzFfazapf" role="3clFbG">
            <node concept="37vLTw" id="5GtzFfaza35" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="5GtzFfazaHl" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteDevKit(org.jetbrains.mps.openapi.module.SModuleReference):void" resolve="deleteDevKit" />
              <node concept="37shsh" id="5GtzFfaz0Sk" role="37wK5m">
                <node concept="20RdaH" id="5GtzFfaz0Sl" role="37shsm">
                  <property role="20Rdg5" value="fbc25dd2-5da4-483a-8b19-70928e1b62d7" />
                  <property role="20Rdg7" value="jetbrains.mps.devkit.general-purpose" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5GtzFfaz8SF" role="3cqZAp">
          <node concept="2OqwBi" id="5GtzFfaz9et" role="3clFbG">
            <node concept="37vLTw" id="5GtzFfaz8SD" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="5GtzFfaz9yh" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.deleteDevKit(org.jetbrains.mps.openapi.module.SModuleReference):void" resolve="deleteDevKit" />
              <node concept="37shsh" id="5GtzFfaz0Ws" role="37wK5m">
                <node concept="20RdaH" id="5GtzFfaz0Xu" role="37shsm">
                  <property role="20Rdg5" value="2677cb18-f558-4e33-bc38-a5139cee06dc" />
                  <property role="20Rdg7" value="jetbrains.mps.devkit.language-design" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="7mpi6U7zGs8" role="3cqZAp">
          <node concept="2OqwBi" id="7mpi6U7zG_U" role="3clFbG">
            <node concept="37vLTw" id="7mpi6U7zGs6" role="2Oq$k0">
              <ref role="3cqZAo" node="7mpi6U7zFTw" resolve="mi" />
            </node>
            <node concept="liA8E" id="7mpi6U7zHm9" role="2OqNvi">
              <ref role="37wK5l" to="w1kc:~SModelInternal.addDevKit(org.jetbrains.mps.openapi.module.SModuleReference):void" resolve="addDevKit" />
              <node concept="37vLTw" id="7mpi6U7zLIQ" role="37wK5m">
                <ref role="3cqZAo" node="7mpi6U7zLIN" resolve="tsAspectDevkit" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="ffn8J" id="7mpi6U7zo07" role="3clF46">
        <property role="TrG5h" value="m" />
        <ref role="ffrpq" to="slm6:7fCCGqboj9J" resolve="m" />
        <node concept="3uibUv" id="7mpi6U7zo06" role="1tU5fm">
          <ref role="3uigEE" to="lui2:~SModule" resolve="SModule" />
        </node>
      </node>
      <node concept="q3mfm" id="7mpi6U7zo08" role="3clF45">
        <ref role="q3mfh" to="slm6:4F5w8gPXEEe" />
        <ref role="1QQUv3" node="7mpi6U7zo01" resolve="execute" />
      </node>
    </node>
    <node concept="3tTeZs" id="7mpi6U7zo09" role="jymVt">
      <property role="3tTeZt" value="&lt;no result checking&gt;" />
      <ref role="3tTeZr" to="slm6:1JWcQ2VeXpD" resolve="check" />
    </node>
  </node>
</model>

