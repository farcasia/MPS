<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:1f98243e-778e-4688-8b37-94002e0884e9(jetbrains.mps.migration.workbench.components)">
  <persistence version="9" />
  <languages>
    <use id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel" version="9" />
    <use id="760a0a8c-eabb-4521-8bfd-65db761a9ba3" name="jetbrains.mps.baseLanguage.logging" version="0" />
    <use id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections" version="0" />
    <use id="a247e09e-2435-45ba-b8d2-07e93feba96a" name="jetbrains.mps.baseLanguage.tuples" version="0" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="6" />
    <use id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures" version="0" />
  </languages>
  <imports>
    <import index="1m72" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.components(MPS.IDEA/)" />
    <import index="71xd" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.ide.tools(MPS.Platform/)" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" />
    <import index="6f4m" ref="528ff3b9-5fc4-40dd-931f-c6ce3650640e/r:f69c3fa1-0e30-4980-84e2-190ae44e4c3d(jetbrains.mps.lang.migration.runtime/jetbrains.mps.lang.migration.runtime.base)" />
    <import index="ngmm" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.ide.findusages.view(MPS.Platform/)" />
    <import index="phxh" ref="r:5754bb7d-f802-4a0f-bd3d-0764f0d71413(jetbrains.mps.ide.modelchecker.platform.actions)" />
    <import index="z2i8" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.icons(MPS.IDEA/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="4nm9" ref="498d89d2-c2e9-11e2-ad49-6cf049e62fe5/java:com.intellij.openapi.project(MPS.IDEA/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="bdll" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.migration.global(MPS.Core/)" />
    <import index="9erk" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.ide.findusages.model(MPS.Core/)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="d6hs" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.errors.item(MPS.Core/)" />
    <import index="2gg1" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.errors(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="z1c3" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.project(MPS.Core/)" />
    <import index="z1c4" ref="742f6602-5a2f-4313-aa6e-ae1cd4ffdc61/java:jetbrains.mps.project(MPS.Platform/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
        <child id="2820489544402271667" name="typeParameter" index="HU9BZ" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1068390468200" name="jetbrains.mps.baseLanguage.structure.FieldDeclaration" flags="ig" index="312cEg" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1095933932569" name="implementedInterface" index="EKbjA" />
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
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
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
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
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6" />
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1073063089578" name="jetbrains.mps.baseLanguage.structure.SuperMethodCall" flags="nn" index="3nyPlj" />
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025416" name="jetbrains.mps.baseLanguage.structure.MethodDeclaration" flags="ng" index="1rXfSm">
        <property id="8355037393041754995" name="isNative" index="2aFKle" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
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
      <concept id="1204980550705" name="jetbrains.mps.baseLanguage.collections.structure.VisitAllOperation" flags="nn" index="2es0OD" />
      <concept id="1226511727824" name="jetbrains.mps.baseLanguage.collections.structure.SetType" flags="in" index="2hMVRd">
        <child id="1226511765987" name="elementType" index="2hN53Y" />
      </concept>
      <concept id="1151689724996" name="jetbrains.mps.baseLanguage.collections.structure.SequenceType" flags="in" index="A3Dl8">
        <child id="1151689745422" name="elementType" index="A3Ik2" />
      </concept>
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1201792049884" name="jetbrains.mps.baseLanguage.collections.structure.TranslateOperation" flags="nn" index="3goQfb" />
      <concept id="1201872418428" name="jetbrains.mps.baseLanguage.collections.structure.GetKeysOperation" flags="nn" index="3lbrtF" />
      <concept id="1197683403723" name="jetbrains.mps.baseLanguage.collections.structure.MapType" flags="in" index="3rvAFt">
        <child id="1197683466920" name="keyType" index="3rvQeY" />
        <child id="1197683475734" name="valueType" index="3rvSg0" />
      </concept>
      <concept id="1165530316231" name="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" flags="nn" index="1v1jN8" />
      <concept id="7125221305512719026" name="jetbrains.mps.baseLanguage.collections.structure.CollectionType" flags="in" index="3vKaQO" />
      <concept id="1202120902084" name="jetbrains.mps.baseLanguage.collections.structure.WhereOperation" flags="nn" index="3zZkjj" />
      <concept id="1202128969694" name="jetbrains.mps.baseLanguage.collections.structure.SelectOperation" flags="nn" index="3$u5V9" />
      <concept id="1197932370469" name="jetbrains.mps.baseLanguage.collections.structure.MapElement" flags="nn" index="3EllGN">
        <child id="1197932505799" name="map" index="3ElQJh" />
        <child id="1197932525128" name="key" index="3ElVtu" />
      </concept>
      <concept id="5686963296372573083" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerType" flags="in" index="3O5elB">
        <child id="5686963296372573084" name="elementType" index="3O5elw" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="5$zfhXzsScF">
    <property role="TrG5h" value="WorkbenchMigrationProblemHandler" />
    <node concept="312cEg" id="3_S1WmRGuRD" role="jymVt">
      <property role="TrG5h" value="myUsagesTool" />
      <node concept="3Tm6S6" id="3_S1WmRGuRE" role="1B3o_S" />
      <node concept="3uibUv" id="3_S1WmRGuRG" role="1tU5fm">
        <ref role="3uigEE" to="ngmm:~UsagesViewTool" resolve="UsagesViewTool" />
      </node>
    </node>
    <node concept="312cEg" id="3_S1WmRG$9T" role="jymVt">
      <property role="TrG5h" value="myMcTool" />
      <node concept="3Tm6S6" id="3_S1WmRG$9U" role="1B3o_S" />
      <node concept="3uibUv" id="3_S1WmRG$9W" role="1tU5fm">
        <ref role="3uigEE" to="phxh:3etVqSRK$al" resolve="ModelCheckerTool" />
      </node>
    </node>
    <node concept="312cEg" id="35jzWtwqQe$" role="jymVt">
      <property role="TrG5h" value="myMpsProject" />
      <node concept="3Tm6S6" id="35jzWtwqQe_" role="1B3o_S" />
      <node concept="3uibUv" id="35jzWtwqRwf" role="1tU5fm">
        <ref role="3uigEE" to="z1c3:~Project" resolve="Project" />
      </node>
    </node>
    <node concept="2tJIrI" id="3_S1WmRGxYu" role="jymVt" />
    <node concept="3clFbW" id="3_S1WmRGoQi" role="jymVt">
      <node concept="3cqZAl" id="3_S1WmRGoQj" role="3clF45" />
      <node concept="3Tm1VV" id="3_S1WmRGoQk" role="1B3o_S" />
      <node concept="3clFbS" id="3_S1WmRGoQm" role="3clF47">
        <node concept="XkiVB" id="3_S1WmRGoQo" role="3cqZAp">
          <ref role="37wK5l" to="1m72:~AbstractProjectComponent.&lt;init&gt;(com.intellij.openapi.project.Project)" resolve="AbstractProjectComponent" />
          <node concept="2OqwBi" id="35jzWtwqTSR" role="37wK5m">
            <node concept="37vLTw" id="3_S1WmRGoQs" role="2Oq$k0">
              <ref role="3cqZAo" node="3_S1WmRGoQp" resolve="project" />
            </node>
            <node concept="liA8E" id="35jzWtwqUmn" role="2OqNvi">
              <ref role="37wK5l" to="z1c4:~MPSProject.getProject():com.intellij.openapi.project.Project" resolve="getProject" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3_S1WmRGuRH" role="3cqZAp">
          <node concept="37vLTI" id="3_S1WmRGuRJ" role="3clFbG">
            <node concept="37vLTw" id="3_S1WmRGuRM" role="37vLTJ">
              <ref role="3cqZAo" node="3_S1WmRGuRD" resolve="myUsagesTool" />
            </node>
            <node concept="37vLTw" id="3_S1WmRGuRN" role="37vLTx">
              <ref role="3cqZAo" node="3_S1WmRGu$_" resolve="usagesTool" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3_S1WmRG$9X" role="3cqZAp">
          <node concept="37vLTI" id="3_S1WmRG$9Z" role="3clFbG">
            <node concept="37vLTw" id="3_S1WmRG$a2" role="37vLTJ">
              <ref role="3cqZAo" node="3_S1WmRG$9T" resolve="myMcTool" />
            </node>
            <node concept="37vLTw" id="3_S1WmRG$a3" role="37vLTx">
              <ref role="3cqZAo" node="3_S1WmRGzML" resolve="mcTool" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="35jzWtwqUvQ" role="3cqZAp">
          <node concept="37vLTI" id="35jzWtwqVnO" role="3clFbG">
            <node concept="37vLTw" id="35jzWtwqVLy" role="37vLTx">
              <ref role="3cqZAo" node="3_S1WmRGoQp" resolve="project" />
            </node>
            <node concept="37vLTw" id="35jzWtwqUvO" role="37vLTJ">
              <ref role="3cqZAo" node="35jzWtwqQe$" resolve="myMpsProject" />
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3_S1WmRGoQp" role="3clF46">
        <property role="TrG5h" value="project" />
        <node concept="3uibUv" id="35jzWtwqTo8" role="1tU5fm">
          <ref role="3uigEE" to="z1c4:~MPSProject" resolve="MPSProject" />
        </node>
      </node>
      <node concept="37vLTG" id="3_S1WmRGu$_" role="3clF46">
        <property role="TrG5h" value="usagesTool" />
        <node concept="3uibUv" id="3_S1WmRGuPM" role="1tU5fm">
          <ref role="3uigEE" to="ngmm:~UsagesViewTool" resolve="UsagesViewTool" />
        </node>
      </node>
      <node concept="37vLTG" id="3_S1WmRGzML" role="3clF46">
        <property role="TrG5h" value="mcTool" />
        <node concept="3uibUv" id="3_S1WmRG$7u" role="1tU5fm">
          <ref role="3uigEE" to="phxh:3etVqSRK$al" resolve="ModelCheckerTool" />
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="3_S1WmRGyRO" role="jymVt" />
    <node concept="3clFb_" id="3_S1WmRESeX" role="jymVt">
      <property role="TrG5h" value="showProblems" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <property role="2aFKle" value="false" />
      <node concept="3clFbS" id="3_S1WmRESf1" role="3clF47">
        <node concept="3cpWs8" id="3_S1WmRESf2" role="3cqZAp">
          <node concept="3cpWsn" id="3_S1WmRESf3" role="3cpWs9">
            <property role="TrG5h" value="items" />
            <node concept="A3Dl8" id="3_S1WmRESf4" role="1tU5fm">
              <node concept="3uibUv" id="3_S1WmRESf5" role="A3Ik2">
                <ref role="3uigEE" to="9erk:~SearchResult" resolve="SearchResult" />
                <node concept="3uibUv" id="13muGfOFhPl" role="11_B2D">
                  <ref role="3uigEE" to="d6hs:~IssueKindReportItem" resolve="IssueKindReportItem" />
                </node>
              </node>
            </node>
            <node concept="2OqwBi" id="3_S1WmRESf7" role="33vP2m">
              <node concept="2OqwBi" id="3_S1WmRESf8" role="2Oq$k0">
                <node concept="37vLTw" id="3_S1WmRESf9" role="2Oq$k0">
                  <ref role="3cqZAo" node="3_S1WmRESgA" resolve="problems" />
                </node>
                <node concept="3$u5V9" id="3_S1WmRESfa" role="2OqNvi">
                  <node concept="1bVj0M" id="3_S1WmRESfb" role="23t8la">
                    <node concept="3clFbS" id="3_S1WmRESfc" role="1bW5cS">
                      <node concept="3clFbF" id="3_S1WmRESfd" role="3cqZAp">
                        <node concept="2ShNRf" id="3_S1WmRESfe" role="3clFbG">
                          <node concept="1pGfFk" id="3_S1WmRESff" role="2ShVmc">
                            <ref role="37wK5l" to="9erk:~SearchResult.&lt;init&gt;(java.lang.Object,java.lang.Object,java.lang.String)" resolve="SearchResult" />
                            <node concept="37vLTw" id="35jzWtwqINI" role="37wK5m">
                              <ref role="3cqZAo" node="3_S1WmRESfp" resolve="p" />
                            </node>
                            <node concept="2OqwBi" id="35jzWtwqOuC" role="37wK5m">
                              <node concept="2OqwBi" id="35jzWtwqMhp" role="2Oq$k0">
                                <node concept="10M0yZ" id="35jzWtwqLtI" role="2Oq$k0">
                                  <ref role="3cqZAo" to="d6hs:~IssueKindReportItem.PATH_OBJECT" resolve="PATH_OBJECT" />
                                  <ref role="1PxDUh" to="d6hs:~IssueKindReportItem" resolve="IssueKindReportItem" />
                                </node>
                                <node concept="liA8E" id="35jzWtwqNqV" role="2OqNvi">
                                  <ref role="37wK5l" to="d6hs:~ReportItemBase$SimpleReportItemFlavour.get(jetbrains.mps.errors.item.FlavouredItem):java.lang.Object" resolve="get" />
                                  <node concept="37vLTw" id="35jzWtwqNEz" role="37wK5m">
                                    <ref role="3cqZAo" node="3_S1WmRESfp" resolve="p" />
                                  </node>
                                </node>
                              </node>
                              <node concept="liA8E" id="35jzWtwqPb_" role="2OqNvi">
                                <ref role="37wK5l" to="d6hs:~IssueKindReportItem$PathObject.resolve(org.jetbrains.mps.openapi.module.SRepository):java.lang.Object" resolve="resolve" />
                                <node concept="2OqwBi" id="35jzWtwqXwJ" role="37wK5m">
                                  <node concept="37vLTw" id="35jzWtwqX6x" role="2Oq$k0">
                                    <ref role="3cqZAo" node="35jzWtwqQe$" resolve="myMpsProject" />
                                  </node>
                                  <node concept="liA8E" id="35jzWtwqYoe" role="2OqNvi">
                                    <ref role="37wK5l" to="z1c3:~Project.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="2OqwBi" id="35jzWtwrnlv" role="37wK5m">
                              <node concept="10M0yZ" id="35jzWtwrm_U" role="2Oq$k0">
                                <ref role="1PxDUh" to="d6hs:~IssueKindReportItem" resolve="IssueKindReportItem" />
                                <ref role="3cqZAo" to="d6hs:~IssueKindReportItem.FLAVOUR_ISSUE_KIND" resolve="FLAVOUR_ISSUE_KIND" />
                              </node>
                              <node concept="liA8E" id="35jzWtwro8q" role="2OqNvi">
                                <ref role="37wK5l" to="d6hs:~ReportItemBase$SimpleReportItemFlavour.get(jetbrains.mps.errors.item.FlavouredItem):java.lang.Object" resolve="get" />
                                <node concept="37vLTw" id="35jzWtwroqI" role="37wK5m">
                                  <ref role="3cqZAo" node="3_S1WmRESfp" resolve="p" />
                                </node>
                              </node>
                            </node>
                            <node concept="3uibUv" id="13muGfOFi2M" role="1pMfVU">
                              <ref role="3uigEE" to="d6hs:~IssueKindReportItem" resolve="IssueKindReportItem" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="3_S1WmRESfp" role="1bW2Oz">
                      <property role="TrG5h" value="p" />
                      <node concept="2jxLKc" id="3_S1WmRESfq" role="1tU5fm" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3zZkjj" id="3_S1WmRESfr" role="2OqNvi">
                <node concept="1bVj0M" id="3_S1WmRESfs" role="23t8la">
                  <node concept="3clFbS" id="3_S1WmRESft" role="1bW5cS">
                    <node concept="3clFbF" id="3_S1WmRESfu" role="3cqZAp">
                      <node concept="3y3z36" id="3_S1WmRESfv" role="3clFbG">
                        <node concept="10Nm6u" id="3_S1WmRESfw" role="3uHU7w" />
                        <node concept="37vLTw" id="3_S1WmRESfx" role="3uHU7B">
                          <ref role="3cqZAo" node="3_S1WmRESfy" resolve="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="Rh6nW" id="3_S1WmRESfy" role="1bW2Oz">
                    <property role="TrG5h" value="it" />
                    <node concept="2jxLKc" id="3_S1WmRESfz" role="1tU5fm" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="3_S1WmRESf$" role="3cqZAp" />
        <node concept="3clFbJ" id="3_S1WmRESf_" role="3cqZAp">
          <node concept="3clFbS" id="3_S1WmRESfA" role="3clFbx">
            <node concept="3cpWs6" id="3_S1WmRESfB" role="3cqZAp" />
          </node>
          <node concept="2OqwBi" id="3_S1WmRESfC" role="3clFbw">
            <node concept="37vLTw" id="3_S1WmRESfD" role="2Oq$k0">
              <ref role="3cqZAo" node="3_S1WmRESf3" resolve="items" />
            </node>
            <node concept="1v1jN8" id="3_S1WmRESfE" role="2OqNvi" />
          </node>
        </node>
        <node concept="3clFbH" id="3_S1WmRESfF" role="3cqZAp" />
        <node concept="3cpWs8" id="3_S1WmRESfG" role="3cqZAp">
          <node concept="3cpWsn" id="3_S1WmRESfH" role="3cpWs9">
            <property role="TrG5h" value="v" />
            <node concept="3uibUv" id="3_S1WmRESfI" role="1tU5fm">
              <ref role="3uigEE" to="phxh:3etVqSRRNr5" resolve="ModelCheckerViewer" />
            </node>
            <node concept="2ShNRf" id="3_S1WmRESfJ" role="33vP2m">
              <node concept="YeOm9" id="3_S1WmRESfK" role="2ShVmc">
                <node concept="1Y3b0j" id="3_S1WmRESfL" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="37wK5l" to="phxh:2AAgPT$dvbg" resolve="ModelCheckerViewer" />
                  <ref role="1Y3XeK" to="phxh:3etVqSRRNr5" resolve="ModelCheckerViewer" />
                  <node concept="3Tm1VV" id="3_S1WmRESfM" role="1B3o_S" />
                  <node concept="37vLTw" id="35jzWtwr4kw" role="37wK5m">
                    <ref role="3cqZAo" to="1m72:~AbstractProjectComponent.myProject" resolve="myProject" />
                  </node>
                  <node concept="3clFbT" id="3_S1WmRESfO" role="37wK5m">
                    <property role="3clFbU" value="false" />
                  </node>
                  <node concept="3clFb_" id="3_S1WmRESfP" role="jymVt">
                    <property role="1EzhhJ" value="false" />
                    <property role="TrG5h" value="close" />
                    <node concept="3Tmbuc" id="3_S1WmRESfQ" role="1B3o_S" />
                    <node concept="3cqZAl" id="3_S1WmRESfR" role="3clF45" />
                    <node concept="3clFbS" id="3_S1WmRESfS" role="3clF47">
                      <node concept="3clFbF" id="3_S1WmRESfT" role="3cqZAp">
                        <node concept="2OqwBi" id="3_S1WmRESfU" role="3clFbG">
                          <node concept="37vLTw" id="3_S1WmRGAj6" role="2Oq$k0">
                            <ref role="3cqZAo" node="3_S1WmRG$9T" resolve="myMcTool" />
                          </node>
                          <node concept="liA8E" id="3_S1WmRESfX" role="2OqNvi">
                            <ref role="37wK5l" to="71xd:~BaseTabbedProjectTool.closeTab(javax.swing.JComponent):void" resolve="closeTab" />
                            <node concept="Xjq3P" id="3_S1WmRESfY" role="37wK5m" />
                          </node>
                        </node>
                      </node>
                      <node concept="3clFbF" id="3_S1WmRESfZ" role="3cqZAp">
                        <node concept="3nyPlj" id="3_S1WmRESg0" role="3clFbG">
                          <ref role="37wK5l" to="phxh:3etVqSRRNuf" resolve="close" />
                        </node>
                      </node>
                    </node>
                    <node concept="2AHcQZ" id="3_S1WmRESg1" role="2AJF6D">
                      <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="3_S1WmRESg2" role="3cqZAp" />
        <node concept="3cpWs8" id="3_S1WmRESg3" role="3cqZAp">
          <node concept="3cpWsn" id="3_S1WmRESg4" role="3cpWs9">
            <property role="TrG5h" value="result" />
            <node concept="3uibUv" id="3_S1WmRESg5" role="1tU5fm">
              <ref role="3uigEE" to="9erk:~SearchResults" resolve="SearchResults" />
              <node concept="3uibUv" id="13muGfOFanp" role="11_B2D">
                <ref role="3uigEE" to="d6hs:~IssueKindReportItem" resolve="IssueKindReportItem" />
              </node>
            </node>
            <node concept="2ShNRf" id="3_S1WmRESg7" role="33vP2m">
              <node concept="1pGfFk" id="13muGfOFhzE" role="2ShVmc">
                <ref role="37wK5l" to="9erk:~SearchResults.&lt;init&gt;()" resolve="SearchResults" />
                <node concept="3uibUv" id="13muGfOFhKc" role="1pMfVU">
                  <ref role="3uigEE" to="d6hs:~IssueKindReportItem" resolve="IssueKindReportItem" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3_S1WmRESga" role="3cqZAp">
          <node concept="2OqwBi" id="3_S1WmRESgb" role="3clFbG">
            <node concept="37vLTw" id="3_S1WmRESgc" role="2Oq$k0">
              <ref role="3cqZAo" node="3_S1WmRESf3" resolve="items" />
            </node>
            <node concept="2es0OD" id="3_S1WmRESgd" role="2OqNvi">
              <node concept="1bVj0M" id="3_S1WmRESge" role="23t8la">
                <node concept="3clFbS" id="3_S1WmRESgf" role="1bW5cS">
                  <node concept="3clFbF" id="3_S1WmRESgg" role="3cqZAp">
                    <node concept="2OqwBi" id="3_S1WmRESgh" role="3clFbG">
                      <node concept="37vLTw" id="3_S1WmRESgi" role="2Oq$k0">
                        <ref role="3cqZAo" node="3_S1WmRESg4" resolve="result" />
                      </node>
                      <node concept="liA8E" id="3_S1WmRESgj" role="2OqNvi">
                        <ref role="37wK5l" to="9erk:~SearchResults.add(jetbrains.mps.ide.findusages.model.SearchResult):void" resolve="add" />
                        <node concept="37vLTw" id="3_S1WmRESgk" role="37wK5m">
                          <ref role="3cqZAo" node="3_S1WmRESgl" resolve="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="Rh6nW" id="3_S1WmRESgl" role="1bW2Oz">
                  <property role="TrG5h" value="it" />
                  <node concept="2jxLKc" id="3_S1WmRESgm" role="1tU5fm" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3_S1WmRESgn" role="3cqZAp">
          <node concept="2OqwBi" id="3_S1WmRESgo" role="3clFbG">
            <node concept="37vLTw" id="3_S1WmRESgp" role="2Oq$k0">
              <ref role="3cqZAo" node="3_S1WmRESfH" resolve="v" />
            </node>
            <node concept="liA8E" id="3_S1WmRESgq" role="2OqNvi">
              <ref role="37wK5l" to="phxh:3bKt22a04PA" resolve="setSearchResults" />
              <node concept="37vLTw" id="3_S1WmRESgr" role="37wK5m">
                <ref role="3cqZAo" node="3_S1WmRESg4" resolve="result" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3_S1WmRESgs" role="3cqZAp">
          <node concept="2OqwBi" id="3_S1WmRESgt" role="3clFbG">
            <node concept="37vLTw" id="3_S1WmRG_vu" role="2Oq$k0">
              <ref role="3cqZAo" node="3_S1WmRG$9T" resolve="myMcTool" />
            </node>
            <node concept="liA8E" id="3_S1WmRESgw" role="2OqNvi">
              <ref role="37wK5l" to="phxh:4aNWY1v0QZD" resolve="showTabWithResults" />
              <node concept="37vLTw" id="3_S1WmRESgx" role="37wK5m">
                <ref role="3cqZAo" node="3_S1WmRESfH" resolve="v" />
              </node>
              <node concept="Xl_RD" id="3_S1WmRESgy" role="37wK5m">
                <property role="Xl_RC" value="Migration issues" />
              </node>
              <node concept="10M0yZ" id="3_S1WmRESgz" role="37wK5m">
                <ref role="1PxDUh" to="z2i8:~AllIcons$Nodes" resolve="AllIcons.Nodes" />
                <ref role="3cqZAo" to="z2i8:~AllIcons$Nodes.ModuleGroup" resolve="ModuleGroup" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="3_S1WmRESeZ" role="3clF45" />
      <node concept="37vLTG" id="3_S1WmRESgA" role="3clF46">
        <property role="TrG5h" value="problems" />
        <node concept="3vKaQO" id="5ZODdE2wUB4" role="1tU5fm">
          <node concept="3uibUv" id="35jzWtwqJ3R" role="3O5elw">
            <ref role="3uigEE" to="d6hs:~IssueKindReportItem" resolve="IssueKindReportItem" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3_S1WmRESf0" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="5$zfhXztqDM" role="jymVt" />
    <node concept="3clFb_" id="3_S1WmRFQWp" role="jymVt">
      <property role="TrG5h" value="showNodes" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3clFbS" id="5$zfhXztqeE" role="3clF47">
        <node concept="3cpWs8" id="1udyd_Tt_Gc" role="3cqZAp">
          <node concept="3cpWsn" id="1udyd_Tt_Gd" role="3cpWs9">
            <property role="TrG5h" value="sr" />
            <node concept="3uibUv" id="5ZODdE2xBnj" role="1tU5fm">
              <ref role="3uigEE" to="9erk:~SearchResults" resolve="SearchResults" />
              <node concept="3uibUv" id="35jzWtwrcht" role="11_B2D">
                <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
              </node>
            </node>
            <node concept="2ShNRf" id="1udyd_TtAk8" role="33vP2m">
              <node concept="HV5vD" id="5ZODdE2xD9h" role="2ShVmc">
                <ref role="HV5vE" to="9erk:~SearchResults" resolve="SearchResults" />
                <node concept="3uibUv" id="35jzWtwrd6Q" role="HU9BZ">
                  <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1udyd_TtEm6" role="3cqZAp">
          <node concept="2OqwBi" id="1udyd_TtFDe" role="3clFbG">
            <node concept="2OqwBi" id="51adnVzXbDz" role="2Oq$k0">
              <node concept="2OqwBi" id="51adnVzXbcJ" role="2Oq$k0">
                <node concept="37vLTw" id="51adnVzXb6v" role="2Oq$k0">
                  <ref role="3cqZAo" node="3_S1WmRETEm" resolve="toShow" />
                </node>
                <node concept="3lbrtF" id="3_S1WmRFa$Y" role="2OqNvi" />
              </node>
              <node concept="3goQfb" id="51adnVzXbNl" role="2OqNvi">
                <node concept="1bVj0M" id="51adnVzXbNn" role="23t8la">
                  <node concept="3clFbS" id="51adnVzXbNo" role="1bW5cS">
                    <node concept="3clFbF" id="51adnVzXbWn" role="3cqZAp">
                      <node concept="2OqwBi" id="51adnVzXcpO" role="3clFbG">
                        <node concept="3EllGN" id="3_S1WmRFc5z" role="2Oq$k0">
                          <node concept="37vLTw" id="3_S1WmRFcpb" role="3ElVtu">
                            <ref role="3cqZAo" node="51adnVzXbNp" resolve="k" />
                          </node>
                          <node concept="37vLTw" id="3_S1WmRFbpl" role="3ElQJh">
                            <ref role="3cqZAo" node="3_S1WmRETEm" resolve="toShow" />
                          </node>
                        </node>
                        <node concept="3$u5V9" id="51adnVzXcCf" role="2OqNvi">
                          <node concept="1bVj0M" id="51adnVzXcCh" role="23t8la">
                            <node concept="3clFbS" id="51adnVzXcCi" role="1bW5cS">
                              <node concept="3clFbF" id="51adnVzXcL$" role="3cqZAp">
                                <node concept="2ShNRf" id="5$zfhXztBbU" role="3clFbG">
                                  <node concept="HV5vD" id="5ZODdE2xDvU" role="2ShVmc">
                                    <ref role="HV5vE" to="9erk:~SearchResult" resolve="SearchResult" />
                                    <node concept="3uibUv" id="35jzWtwrdTz" role="HU9BZ">
                                      <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="Rh6nW" id="51adnVzXcCj" role="1bW2Oz">
                              <property role="TrG5h" value="node" />
                              <node concept="2jxLKc" id="51adnVzXcCk" role="1tU5fm" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="Rh6nW" id="51adnVzXbNp" role="1bW2Oz">
                    <property role="TrG5h" value="k" />
                    <node concept="2jxLKc" id="51adnVzXbNq" role="1tU5fm" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="2es0OD" id="1udyd_TtGhE" role="2OqNvi">
              <node concept="1bVj0M" id="1udyd_TtGhG" role="23t8la">
                <node concept="3clFbS" id="1udyd_TtGhH" role="1bW5cS">
                  <node concept="3clFbF" id="1udyd_TtGnI" role="3cqZAp">
                    <node concept="2OqwBi" id="1udyd_TtGE0" role="3clFbG">
                      <node concept="37vLTw" id="1udyd_TtGnH" role="2Oq$k0">
                        <ref role="3cqZAo" node="1udyd_Tt_Gd" resolve="sr" />
                      </node>
                      <node concept="liA8E" id="1udyd_TtGUJ" role="2OqNvi">
                        <ref role="37wK5l" to="9erk:~SearchResults.add(jetbrains.mps.ide.findusages.model.SearchResult):void" resolve="add" />
                        <node concept="37vLTw" id="1udyd_TtHcS" role="37wK5m">
                          <ref role="3cqZAo" node="1udyd_TtGhI" resolve="it" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="Rh6nW" id="1udyd_TtGhI" role="1bW2Oz">
                  <property role="TrG5h" value="it" />
                  <node concept="2jxLKc" id="1udyd_TtGhJ" role="1tU5fm" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="YwfKjlWHaA" role="3cqZAp">
          <node concept="2OqwBi" id="6M9lfhDGIIu" role="3clFbG">
            <node concept="37vLTw" id="3_S1WmRGvS3" role="2Oq$k0">
              <ref role="3cqZAo" node="3_S1WmRGuRD" resolve="myUsagesTool" />
            </node>
            <node concept="liA8E" id="YwfKjlX7TS" role="2OqNvi">
              <ref role="37wK5l" to="ngmm:~UsagesViewTool.show(jetbrains.mps.ide.findusages.model.SearchResults,java.lang.String):void" resolve="show" />
              <node concept="37vLTw" id="1udyd_TtArg" role="37wK5m">
                <ref role="3cqZAo" node="1udyd_Tt_Gd" resolve="sr" />
              </node>
              <node concept="Xl_RD" id="6M9lfhDGpMO" role="37wK5m">
                <property role="Xl_RC" value="No results to show" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3_S1WmRETEm" role="3clF46">
        <property role="TrG5h" value="toShow" />
        <node concept="3rvAFt" id="3_S1WmRF3uO" role="1tU5fm">
          <node concept="3uibUv" id="3_S1WmRF3UR" role="3rvQeY">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
          </node>
          <node concept="2hMVRd" id="3_S1WmRF4nD" role="3rvSg0">
            <node concept="3Tqbb2" id="3_S1WmRF4Od" role="2hN53Y" />
          </node>
        </node>
      </node>
      <node concept="3cqZAl" id="5$zfhXztqeC" role="3clF45" />
      <node concept="3Tm1VV" id="5$zfhXztqeD" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="3_S1WmRFCma" role="jymVt" />
    <node concept="3Tm1VV" id="5$zfhXzsScG" role="1B3o_S" />
    <node concept="3uibUv" id="3_S1WmRERho" role="EKbjA">
      <ref role="3uigEE" to="bdll:~MigrationProblemHandler" resolve="MigrationProblemHandler" />
    </node>
    <node concept="3clFb_" id="3_S1WmRETEv" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="projectOpened" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tm1VV" id="3_S1WmRETEw" role="1B3o_S" />
      <node concept="3cqZAl" id="3_S1WmRETEy" role="3clF45" />
      <node concept="3clFbS" id="3_S1WmRETE_" role="3clF47" />
      <node concept="2AHcQZ" id="3_S1WmRETEA" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3_S1WmRETEB" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="projectClosed" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tm1VV" id="3_S1WmRETEC" role="1B3o_S" />
      <node concept="3cqZAl" id="3_S1WmRETEE" role="3clF45" />
      <node concept="3clFbS" id="3_S1WmRETEH" role="3clF47" />
      <node concept="2AHcQZ" id="3_S1WmRETEI" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3_S1WmRETEJ" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="initComponent" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tm1VV" id="3_S1WmRETEK" role="1B3o_S" />
      <node concept="3cqZAl" id="3_S1WmRETEM" role="3clF45" />
      <node concept="3clFbS" id="3_S1WmRETEQ" role="3clF47" />
      <node concept="2AHcQZ" id="3_S1WmRETER" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3_S1WmRETES" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="disposeComponent" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tm1VV" id="3_S1WmRETET" role="1B3o_S" />
      <node concept="3cqZAl" id="3_S1WmRETEV" role="3clF45" />
      <node concept="3clFbS" id="3_S1WmRETEZ" role="3clF47" />
      <node concept="2AHcQZ" id="3_S1WmRETF0" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
    <node concept="3clFb_" id="3_S1WmRETF1" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getComponentName" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <node concept="3Tm1VV" id="3_S1WmRETF2" role="1B3o_S" />
      <node concept="3uibUv" id="3_S1WmRETF6" role="3clF45">
        <ref role="3uigEE" to="wyt6:~String" resolve="String" />
      </node>
      <node concept="3clFbS" id="3_S1WmRETFb" role="3clF47">
        <node concept="3clFbF" id="3_S1WmRFDhT" role="3cqZAp">
          <node concept="2OqwBi" id="3_S1WmRFEON" role="3clFbG">
            <node concept="2OqwBi" id="3_S1WmRFDDG" role="2Oq$k0">
              <node concept="Xjq3P" id="3_S1WmRFDhQ" role="2Oq$k0" />
              <node concept="liA8E" id="3_S1WmRFEed" role="2OqNvi">
                <ref role="37wK5l" to="wyt6:~Object.getClass():java.lang.Class" resolve="getClass" />
              </node>
            </node>
            <node concept="liA8E" id="3_S1WmRFFQk" role="2OqNvi">
              <ref role="37wK5l" to="wyt6:~Class.getSimpleName():java.lang.String" resolve="getSimpleName" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="3_S1WmRETFc" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="2AHcQZ" id="13muGfOF73$" role="2AJF6D">
        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
      </node>
    </node>
    <node concept="3uibUv" id="3_S1WmRGo74" role="1zkMxy">
      <ref role="3uigEE" to="1m72:~AbstractProjectComponent" resolve="AbstractProjectComponent" />
    </node>
  </node>
</model>

