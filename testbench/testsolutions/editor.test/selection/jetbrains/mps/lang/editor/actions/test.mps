<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:c44f4b8c-137c-4225-8bd9-38d232a9b736(jetbrains.mps.lang.editor.actions.test)">
  <persistence version="9" />
  <languages>
    <use id="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7" name="jetbrains.mps.lang.editor.editorTest" version="0" />
    <use id="8585453e-6bfb-4d80-98de-b16074f1d86c" name="jetbrains.mps.lang.test" version="2" />
    <use id="28f9e497-3b42-4291-aeba-0a1039153ab1" name="jetbrains.mps.lang.plugin" version="2" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="6" />
  </languages>
  <imports>
    <import index="ekwn" ref="r:9832fb5f-2578-4b58-8014-a5de79da988e(jetbrains.mps.ide.editor.actions)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="6lvu" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.nodeEditor.cellMenu(MPS.Editor/)" />
    <import index="exr9" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.nodeEditor(MPS.Editor/)" />
    <import index="df4k" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.editor.runtime.deletionApprover(MPS.Editor/)" />
    <import index="tp6m" ref="r:00000000-0000-4000-0000-011c895903a2(jetbrains.mps.lang.test.runtime)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io(JDK/)" implicit="true" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" implicit="true" />
    <import index="lui2" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.module(MPS.OpenAPI/)" implicit="true" />
    <import index="cj4x" ref="1ed103c3-3aa6-49b7-9c21-6765ee11f224/java:jetbrains.mps.openapi.editor(MPS.Editor/)" implicit="true" />
  </imports>
  <registry>
    <language id="8585453e-6bfb-4d80-98de-b16074f1d86c" name="jetbrains.mps.lang.test">
      <concept id="1228934484974" name="jetbrains.mps.lang.test.structure.PressKeyStatement" flags="nn" index="yd1bK">
        <child id="1228934507814" name="keyStrokes" index="yd6KS" />
      </concept>
      <concept id="7011073693661765739" name="jetbrains.mps.lang.test.structure.InvokeActionStatement" flags="nn" index="2HxZob">
        <child id="1101347953350127927" name="actionReference" index="3iKnsn" />
      </concept>
      <concept id="1229187653856" name="jetbrains.mps.lang.test.structure.EditorTestCase" flags="lg" index="LiM7Y">
        <property id="1883175908513350760" name="description" index="3YCmrE" />
        <child id="1229187676388" name="nodeToEdit" index="LiRBU" />
        <child id="1229187707859" name="result" index="LiZbd" />
        <child id="1229187755283" name="code" index="LjaKd" />
      </concept>
      <concept id="1229194968594" name="jetbrains.mps.lang.test.structure.AnonymousCellAnnotation" flags="ng" index="LIFWc">
        <property id="6268941039745498163" name="selectionStart" index="p6zMq" />
        <property id="6268941039745498165" name="selectionEnd" index="p6zMs" />
        <property id="1229194968596" name="caretPosition" index="LIFWa" />
        <property id="1229194968595" name="cellId" index="LIFWd" />
        <property id="1932269937152561478" name="useLabelSelection" index="OXtK3" />
        <property id="1229432188737" name="isLastPosition" index="ZRATv" />
      </concept>
      <concept id="1227182079811" name="jetbrains.mps.lang.test.structure.TypeKeyStatement" flags="nn" index="2TK7Tu">
        <property id="1227184461946" name="keys" index="2TTd_B" />
      </concept>
      <concept id="5097124989038916362" name="jetbrains.mps.lang.test.structure.TestInfo" flags="ng" index="2XOHcx">
        <property id="5097124989038916363" name="projectPath" index="2XOHcw" />
      </concept>
      <concept id="5773579205429866751" name="jetbrains.mps.lang.test.structure.EditorComponentExpression" flags="nn" index="369mXd" />
      <concept id="4239542196496927193" name="jetbrains.mps.lang.test.structure.MPSActionReference" flags="ng" index="1iFQzN">
        <reference id="4239542196496929559" name="action" index="1iFR8X" />
      </concept>
      <concept id="1210673684636" name="jetbrains.mps.lang.test.structure.TestNodeAnnotation" flags="ng" index="3xLA65" />
      <concept id="1210674524691" name="jetbrains.mps.lang.test.structure.TestNodeReference" flags="nn" index="3xONca">
        <reference id="1210674534086" name="declaration" index="3xOPvv" />
      </concept>
    </language>
    <language id="28f9e497-3b42-4291-aeba-0a1039153ab1" name="jetbrains.mps.lang.plugin">
      <concept id="1207318242772" name="jetbrains.mps.lang.plugin.structure.KeyMapKeystroke" flags="ng" index="pLAjd">
        <property id="1207318242774" name="keycode" index="pLAjf" />
      </concept>
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1153422305557" name="jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression" flags="nn" index="2dkUwp" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1239714755177" name="jetbrains.mps.baseLanguage.structure.AbstractUnaryNumberOperation" flags="nn" index="2$Kvd9">
        <child id="1239714902950" name="expression" index="2$L3a6" />
      </concept>
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1197027803184" name="jetbrains.mps.baseLanguage.structure.IOperation" flags="ng" index="2OqG4A" />
      <concept id="1164879751025" name="jetbrains.mps.baseLanguage.structure.TryCatchStatement" flags="nn" index="SfApY">
        <child id="1164879758292" name="body" index="SfCbr" />
        <child id="1164903496223" name="catchClause" index="TEbGg" />
      </concept>
      <concept id="1164903280175" name="jetbrains.mps.baseLanguage.structure.CatchClause" flags="nn" index="TDmWw">
        <child id="1164903359218" name="catchBody" index="TDEfX" />
        <child id="1164903359217" name="throwable" index="TDEfY" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534436861" name="jetbrains.mps.baseLanguage.structure.FloatType" flags="in" index="10OMs4" />
      <concept id="1070534513062" name="jetbrains.mps.baseLanguage.structure.DoubleType" flags="in" index="10P55v" />
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068431790189" name="jetbrains.mps.baseLanguage.structure.Type" flags="in" index="33vP2l" />
      <concept id="1068431790191" name="jetbrains.mps.baseLanguage.structure.Expression" flags="nn" index="33vP2n" />
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
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_" />
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
        <child id="1206060520071" name="elsifClauses" index="3eNLev" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1206060495898" name="jetbrains.mps.baseLanguage.structure.ElsifClause" flags="ng" index="3eNFk2">
        <child id="1206060619838" name="condition" index="3eO9$A" />
        <child id="1206060644605" name="statementList" index="3eOfB_" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1214918800624" name="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" flags="nn" index="3uNrnE" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1144230876926" name="jetbrains.mps.baseLanguage.structure.AbstractForStatement" flags="nn" index="1DupvO">
        <child id="1144230900587" name="variable" index="1Duv9x" />
      </concept>
      <concept id="1144231330558" name="jetbrains.mps.baseLanguage.structure.ForStatement" flags="nn" index="1Dw8fO">
        <child id="1144231399730" name="condition" index="1Dwp0S" />
        <child id="1144231408325" name="iteration" index="1Dwrff" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1116615150612" name="jetbrains.mps.baseLanguage.structure.ClassifierClassExpression" flags="nn" index="3VsKOn">
        <reference id="1116615189566" name="classifier" index="3VsUkX" />
      </concept>
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="f61473f9-130f-42f6-b98d-6c438812c2f6" name="jetbrains.mps.baseLanguage.unitTest">
      <concept id="1171981022339" name="jetbrains.mps.baseLanguage.unitTest.structure.AssertTrue" flags="nn" index="3vwNmj">
        <child id="1171981057159" name="condition" index="3vwVQn" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
      <concept id="3717301156197626279" name="jetbrains.mps.lang.core.structure.BasePlaceholder" flags="ng" index="3DQ70j" />
      <concept id="709746936026466394" name="jetbrains.mps.lang.core.structure.ChildAttribute" flags="ng" index="3VBwX9">
        <property id="709746936026609031" name="linkId" index="3V$3ak" />
        <property id="709746936026609029" name="linkRole" index="3V$3am" />
      </concept>
      <concept id="4452961908202556907" name="jetbrains.mps.lang.core.structure.BaseCommentAttribute" flags="ng" index="1X3_iC">
        <child id="3078666699043039389" name="commentedNode" index="8Wnug" />
      </concept>
    </language>
    <language id="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7" name="jetbrains.mps.lang.editor.editorTest">
      <concept id="6997653033587013240" name="jetbrains.mps.lang.editor.editorTest.structure.CustomPlaceholder" flags="ng" index="21vXSz" />
      <concept id="5824791737913814352" name="jetbrains.mps.lang.editor.editorTest.structure.AttributeChild" flags="ng" index="GbBLD" />
      <concept id="3766420342434505217" name="jetbrains.mps.lang.editor.editorTest.structure.PlaceholderChildAttribute" flags="ng" index="2HQ25p" />
      <concept id="9133079350911740822" name="jetbrains.mps.lang.editor.editorTest.structure.SubstMiddlewareChild" flags="ng" index="2IcTNh">
        <child id="9133079350911740918" name="child" index="2IcTML" />
      </concept>
      <concept id="2943053183528026471" name="jetbrains.mps.lang.editor.editorTest.structure.ISpecialDelTestChild" flags="ng" index="J$D8w" />
      <concept id="2943053183528026474" name="jetbrains.mps.lang.editor.editorTest.structure.ISpecialDelTestConcreteChild" flags="ng" index="J$D8H" />
      <concept id="2943053183527886798" name="jetbrains.mps.lang.editor.editorTest.structure.IDelTestConcreteChild" flags="ng" index="J_cM9" />
      <concept id="2943053183527886797" name="jetbrains.mps.lang.editor.editorTest.structure.IDelTestChild" flags="ng" index="J_cMa" />
      <concept id="583472190600143134" name="jetbrains.mps.lang.editor.editorTest.structure.SubstTestChild_WithNextApplicableEditorAndMenu_1" flags="ng" index="2T4CB3">
        <property id="583472190600143305" name="property" index="2T4C$k" />
      </concept>
      <concept id="583472190600188816" name="jetbrains.mps.lang.editor.editorTest.structure.SubstTestChild_WithNextApplicableEditorAndMenu_2" flags="ng" index="2T4ZHd" />
      <concept id="957371990174086318" name="jetbrains.mps.lang.editor.editorTest.structure.SubstTestAbstractChild" flags="ng" index="2Xtn1I" />
      <concept id="957371990174086574" name="jetbrains.mps.lang.editor.editorTest.structure.SubstTestEnumPropertyChild" flags="ng" index="2Xtn5I">
        <property id="957371990174310446" name="myEnumProperty" index="2XtIjI" />
      </concept>
      <concept id="957371990174086445" name="jetbrains.mps.lang.editor.editorTest.structure.SubstTestBooleanPropertyChild" flags="ng" index="2Xtn7H">
        <property id="957371990174101881" name="myProperty" index="2XtjmT" />
      </concept>
      <concept id="957371990174086071" name="jetbrains.mps.lang.editor.editorTest.structure.SubstTestRoot" flags="ng" index="2XtntR">
        <child id="2890539347285154139" name="singleChildWithNonEmptyCell" index="2k9tHz" />
        <child id="9133079350911739126" name="separatorChild" index="2IcTeL" />
        <child id="9133079350911740921" name="middlewareChild" index="2IcTMY" />
        <child id="583472190600143148" name="childWithNextEditorAndMenu" index="2T4CBL" />
        <child id="957371990174549618" name="multiChild" index="2X2waM" />
        <child id="957371990174086639" name="singleChild" index="2Xtn4J" />
      </concept>
      <concept id="427038688578133054" name="jetbrains.mps.lang.editor.editorTest.structure.AttributedConcept" flags="ng" index="2ZSn_i" />
      <concept id="427038688578132736" name="jetbrains.mps.lang.editor.editorTest.structure.AttributeWithChildren" flags="ng" index="2ZSnTG">
        <child id="427038688578132933" name="children" index="2ZSnUD" />
      </concept>
      <concept id="6866182640452532265" name="jetbrains.mps.lang.editor.editorTest.structure.PlaceholderChild" flags="ng" index="30quMi" />
      <concept id="6866182640452532264" name="jetbrains.mps.lang.editor.editorTest.structure.PlaceholderParent" flags="ng" index="30quMj">
        <child id="6997653033587013241" name="customPlaceholder" index="21vXSy" />
        <child id="6866182640452532268" name="multipleChildren" index="30quMn" />
      </concept>
      <concept id="5383578965096699278" name="jetbrains.mps.lang.editor.editorTest.structure.DelTestChildSpecialContainer" flags="ng" index="3grck5" />
      <concept id="5383578965096699277" name="jetbrains.mps.lang.editor.editorTest.structure.DelTestSpecialAbstractChild" flags="ng" index="3grck6" />
      <concept id="5383578965096740807" name="jetbrains.mps.lang.editor.editorTest.structure.DelTestSpecialChild1" flags="ng" index="3grmtc" />
      <concept id="7814731350146682761" name="jetbrains.mps.lang.editor.editorTest.structure.DeleteLineTestChildWithNested" flags="ng" index="1gUoXb">
        <child id="7814731350146682762" name="singleChild" index="1gUoX8" />
        <child id="7814731350146682764" name="horizontalChild" index="1gUoXe" />
      </concept>
      <concept id="2420730201804952979" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteAttribute" flags="ng" index="3uffNp" />
      <concept id="1077509448393313703" name="jetbrains.mps.lang.editor.editorTest.structure.DeleteWrapperChild" flags="ng" index="1Bq5y5" />
      <concept id="1077509448393313700" name="jetbrains.mps.lang.editor.editorTest.structure.DeleteWrapperRoot" flags="ng" index="1Bq5y6">
        <child id="1077509448393313715" name="child" index="1Bq5yh" />
      </concept>
      <concept id="6739703022154345521" name="jetbrains.mps.lang.editor.editorTest.structure.DeleteLineTestRoot" flags="ng" index="3MEH01">
        <child id="7814731350146768884" name="multipleChildrenWithNested" index="1gUdWQ" />
        <child id="6739703022154345522" name="verticalMultiple" index="3MEH02" />
        <child id="6739703022154345524" name="indentVerticalMultiple" index="3MEH04" />
        <child id="6739703022154345526" name="indentHorizontalMultiple" index="3MEH06" />
        <child id="6739703022154345528" name="horizontalMultiple" index="3MEH08" />
        <child id="6739703022154345575" name="readOnlyChild" index="3MEH1n" />
        <child id="6739703022154345621" name="horizontalSingle" index="3MEH2_" />
        <child id="6739703022154345608" name="verticalSingle" index="3MEH2S" />
      </concept>
      <concept id="6739703022154345834" name="jetbrains.mps.lang.editor.editorTest.structure.DeleteLineTestReadOnlyChild" flags="ng" index="3MEH5q" />
      <concept id="6739703022154345463" name="jetbrains.mps.lang.editor.editorTest.structure.DeleteLineTestChild" flags="ng" index="3MEHv7" />
      <concept id="7803854675610450426" name="jetbrains.mps.lang.editor.editorTest.structure.DelTestRoot" flags="ng" index="1QLem1">
        <child id="7803854675610450486" name="container" index="1QLepd" />
      </concept>
      <concept id="7803854675610223687" name="jetbrains.mps.lang.editor.editorTest.structure.DelTestAbstractChild" flags="ng" index="1QM1wW" />
      <concept id="7803854675610223744" name="jetbrains.mps.lang.editor.editorTest.structure.DelTestChild1" flags="ng" index="1QM1zV" />
      <concept id="7803854675610223138" name="jetbrains.mps.lang.editor.editorTest.structure.DelTestChildContainer" flags="ng" index="1QM1Tp">
        <child id="2943053183527886793" name="interfaceChild" index="J_cMe" />
        <child id="7803854675610223859" name="child" index="1QM1y8" />
      </concept>
      <concept id="3018077782998828915" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteTestRoot" flags="ng" index="3TLDEN">
        <child id="3018077782998828918" name="container" index="3TLDEQ" />
      </concept>
      <concept id="3018077782998828806" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteDefaultChildContainer" flags="ng" index="3TLDF6">
        <child id="2420730201804952036" name="childWithAttribute" index="3uffyI" />
        <child id="1241246198932224640" name="cellCollectionChild" index="1Z4n1n" />
        <child id="1241246198932081745" name="labelChild" index="1Z7Oq6" />
        <child id="1241246198931351111" name="multipleChild" index="1Z8EMg" />
        <child id="1241246198931351108" name="singleRequiredChild" index="1Z8EMj" />
        <child id="1241246198931351106" name="singleOptionalChild" index="1Z8EMl" />
      </concept>
      <concept id="3018077782998850910" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteDefaultChild" flags="ng" index="3TLO2u" />
      <concept id="3018077782998850919" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteCustomChildContainer" flags="ng" index="3TLO2B">
        <property id="1241246198932953758" name="showCellWithStringId" index="1Z2x19" />
        <property id="1241246198932960505" name="stringProperty" index="1Z2zSI" />
        <property id="1241246198932939391" name="showCellWithCustomId" index="1Z2AyC" />
        <child id="1241246198932939416" name="child" index="1Z2Axf" />
      </concept>
      <concept id="1241246198932939393" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteCustomChild" flags="ng" index="1Z2Axm" />
      <concept id="1241246198932224646" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteCellCollectionChild" flags="ng" index="1Z4n1h" />
      <concept id="1241246198932081750" name="jetbrains.mps.lang.editor.editorTest.structure.TwoStepDeleteLabelChild" flags="ng" index="1Z7Oq1" />
    </language>
  </registry>
  <node concept="LiM7Y" id="6LcR7GqvFCf">
    <property role="TrG5h" value="DelOnChild1ReplaceItWithLinkTarget" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 then it should be replaced by link target concept in pressing &quot;del&quot; by-default" />
    <node concept="1QLem1" id="6LcR7GqyjZm" role="LiRBU">
      <node concept="1QM1Tp" id="6LcR7Gqyk6K" role="1QLepd">
        <node concept="1QM1zV" id="6LcR7Gqyk6U" role="1QM1y8">
          <node concept="LIFWc" id="7v1E5MvycJx" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="15" />
            <property role="p6zMs" value="15" />
            <property role="LIFWd" value="Constant_crs27h_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="6LcR7Gqykku" role="LiZbd">
      <node concept="1QM1Tp" id="6LcR7Gqykkv" role="1QLepd">
        <node concept="1QM1wW" id="6LcR7GqykkR" role="1QM1y8">
          <node concept="LIFWc" id="7v1E5MvycJf" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="23" />
            <property role="p6zMs" value="23" />
            <property role="LIFWd" value="Constant_2owdmv_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="6LcR7Gqykl6" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIcsVv" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIcsVw" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIcsVx" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIcsVy" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIcsVz" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIcsV$" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIcsV_" role="37wK5m" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="6LcR7GqykDA">
    <property role="TrG5h" value="DelOnChild1DeleteParent" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 and it is instance of link target concept then pressing &quot;del&quot; by-default should invoke &quot;del&quot; on parent node" />
    <node concept="1QLem1" id="6LcR7GqykDB" role="LiRBU">
      <node concept="1QM1Tp" id="6LcR7GqykDC" role="1QLepd">
        <node concept="1QM1wW" id="6LcR7GqykEc" role="1QM1y8">
          <node concept="LIFWc" id="7v1E5MvycIr" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="23" />
            <property role="p6zMs" value="23" />
            <property role="LIFWd" value="Constant_2owdmv_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="6LcR7GqykDF" role="LiZbd">
      <node concept="LIFWc" id="6LcR7GqykEg" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_container" />
      </node>
    </node>
    <node concept="3clFbS" id="6LcR7GqykDJ" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIcsIM" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIcsIN" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIcsIO" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIcsIP" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIcsIQ" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIcsIR" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIcsJc" role="37wK5m" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="P9hc2Kf3cS">
    <property role="TrG5h" value="Subst_SingleChild_WithNonEmptyCell_Complete" />
    <property role="3GE5qa" value="substitute" />
    <node concept="2XtntR" id="P9hc2Kf5jE" role="LiRBU">
      <node concept="LIFWc" id="76t$LiKqFxj" role="lGtFl">
        <property role="LIFWa" value="0" />
        <property role="LIFWd" value="Collection_3mh94b_a1c0" />
      </node>
    </node>
    <node concept="2XtntR" id="P9hc2Kg$bq" role="LiZbd">
      <node concept="2Xtn5I" id="2wtgzyWersK" role="2k9tHz">
        <property role="2XtIjI" value="v2" />
        <node concept="LIFWc" id="2wtgzyWersM" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="2" />
          <property role="p6zMs" value="2" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="P9hc2Kg$ej" role="LjaKd">
      <node concept="2HxZob" id="3d3YzDnsdhH" role="3cqZAp">
        <node concept="1iFQzN" id="3d3YzDnsdhI" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:2XByp9s_j7f" resolve="Complete" />
        </node>
      </node>
      <node concept="2TK7Tu" id="P9hc2KgLrp" role="3cqZAp">
        <property role="2TTd_B" value="v2" />
      </node>
      <node concept="yd1bK" id="2wtgzyWer_n" role="3cqZAp">
        <node concept="pLAjd" id="2wtgzyWer_p" role="yd6KS">
          <property role="pLAjf" value="VK_ENTER" />
        </node>
      </node>
    </node>
  </node>
  <node concept="2XOHcx" id="50UgHNTM2nS">
    <property role="2XOHcw" value="${mps_home}" />
  </node>
  <node concept="LiM7Y" id="P9hc2KgLWf">
    <property role="TrG5h" value="Subst_SingleChild_OnlyEnumProperty_with_Another" />
    <property role="3GE5qa" value="substitute" />
    <node concept="2XtntR" id="P9hc2KgLWg" role="LiRBU">
      <node concept="2Xtn5I" id="P9hc2KgO4C" role="2Xtn4J">
        <property role="2XtIjI" value="v2" />
        <node concept="LIFWc" id="P9hc2KgO4H" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="P9hc2KgLWj" role="LiZbd">
      <node concept="2Xtn7H" id="P9hc2KgO4L" role="2Xtn4J">
        <property role="2XtjmT" value="false" />
        <node concept="LIFWc" id="P9hc2KgO4N" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="5" />
          <property role="p6zMs" value="5" />
          <property role="LIFWd" value="property_myProperty" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="P9hc2KgLWm" role="LjaKd">
      <node concept="2TK7Tu" id="P9hc2KgLWn" role="3cqZAp">
        <property role="2TTd_B" value="fal" />
      </node>
      <node concept="2HxZob" id="3d3YzDnsdh9" role="3cqZAp">
        <node concept="1iFQzN" id="3d3YzDnsdha" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:2XByp9s_j7f" resolve="Complete" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="P9hc2KgOoG">
    <property role="TrG5h" value="Subst_MultiChild_OnlyBooleanProperty_with_Another" />
    <property role="3GE5qa" value="substitute" />
    <node concept="2XtntR" id="P9hc2KgOoH" role="LiRBU">
      <node concept="2Xtn7H" id="P9hc2Kh7eU" role="2X2waM">
        <property role="2XtjmT" value="false" />
      </node>
      <node concept="2Xtn7H" id="P9hc2Kh7dV" role="2X2waM">
        <property role="2XtjmT" value="true" />
        <node concept="LIFWc" id="P9hc2Kh7g0" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="property_myProperty" />
        </node>
      </node>
      <node concept="2Xtn7H" id="P9hc2Kh7eY" role="2X2waM">
        <property role="2XtjmT" value="false" />
      </node>
      <node concept="2Xtn7H" id="P9hc2KgOoI" role="2Xtn4J">
        <property role="2XtjmT" value="true" />
      </node>
    </node>
    <node concept="3clFbS" id="P9hc2KgOoN" role="LjaKd">
      <node concept="2TK7Tu" id="P9hc2KgOoO" role="3cqZAp">
        <property role="2TTd_B" value="v1" />
      </node>
      <node concept="2HxZob" id="3d3YzDnsdhx" role="3cqZAp">
        <node concept="1iFQzN" id="3d3YzDnsdhy" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:2XByp9s_j7f" resolve="Complete" />
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="P9hc2Kh7hl" role="LiZbd">
      <node concept="2Xtn7H" id="P9hc2Kh7hm" role="2X2waM">
        <property role="2XtjmT" value="false" />
      </node>
      <node concept="2Xtn5I" id="P9hc2Kh7hx" role="2X2waM">
        <node concept="LIFWc" id="P9hc2Kh7h_" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="2" />
          <property role="p6zMs" value="2" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
      <node concept="2Xtn7H" id="P9hc2Kh7hp" role="2X2waM">
        <property role="2XtjmT" value="false" />
      </node>
      <node concept="2Xtn7H" id="P9hc2Kh7hq" role="2Xtn4J">
        <property role="2XtjmT" value="true" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="P9hc2Kh9KP">
    <property role="TrG5h" value="Subst_MultiChild_OnlyEnumProperty_with_Another" />
    <property role="3GE5qa" value="substitute" />
    <node concept="2XtntR" id="P9hc2Kh9KQ" role="LiRBU">
      <node concept="2Xtn5I" id="P9hc2Kh9Mo" role="2X2waM" />
      <node concept="2Xtn5I" id="P9hc2Kh9Mt" role="2X2waM">
        <property role="2XtIjI" value="v2" />
        <node concept="LIFWc" id="P9hc2Kh9Ok" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
      <node concept="2Xtn5I" id="P9hc2Kh9Mx" role="2X2waM">
        <property role="2XtIjI" value="v3" />
      </node>
      <node concept="2Xtn7H" id="P9hc2Kh9KV" role="2Xtn4J">
        <property role="2XtjmT" value="true" />
      </node>
    </node>
    <node concept="3clFbS" id="P9hc2Kh9KW" role="LjaKd">
      <node concept="2TK7Tu" id="P9hc2Kh9KX" role="3cqZAp">
        <property role="2TTd_B" value="fal" />
      </node>
      <node concept="2HxZob" id="3d3YzDnsdgJ" role="3cqZAp">
        <node concept="1iFQzN" id="3d3YzDnsdgK" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:2XByp9s_j7f" resolve="Complete" />
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="P9hc2Kh9O7" role="LiZbd">
      <node concept="2Xtn5I" id="P9hc2Kh9O8" role="2X2waM" />
      <node concept="2Xtn7H" id="P9hc2Kh9Om" role="2X2waM">
        <property role="2XtjmT" value="false" />
        <node concept="LIFWc" id="P9hc2Kh9Oq" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="5" />
          <property role="p6zMs" value="5" />
          <property role="LIFWd" value="property_myProperty" />
        </node>
      </node>
      <node concept="2Xtn5I" id="P9hc2Kh9Oa" role="2X2waM">
        <property role="2XtIjI" value="v3" />
      </node>
      <node concept="2Xtn7H" id="P9hc2Kh9Ob" role="2Xtn4J">
        <property role="2XtjmT" value="true" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="7UZdOvgzJr4">
    <property role="3GE5qa" value="substitute" />
    <property role="TrG5h" value="Subst_MiddleChild_AddNewChildBySeparator" />
    <node concept="2XtntR" id="7UZdOvgzJr5" role="LiRBU">
      <node concept="2IcTNh" id="7UZdOvgzJrE" role="2IcTMY">
        <node concept="2Xtn5I" id="7UZdOvgzPYW" role="2IcTML">
          <node concept="LIFWc" id="7UZdOvgzPZh" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="2" />
            <property role="p6zMs" value="2" />
            <property role="LIFWd" value="property_myEnumProperty" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="7UZdOvgzJr8" role="LiZbd">
      <node concept="2IcTNh" id="7UZdOvgzQ5R" role="2IcTMY">
        <node concept="2Xtn5I" id="7UZdOvgzQ7N" role="2IcTML" />
        <node concept="2Xtn1I" id="m$60z3cBRT" role="2IcTML">
          <node concept="LIFWc" id="62kNghyumkL" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Error" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="7UZdOvgzJrc" role="LjaKd">
      <node concept="2TK7Tu" id="m$60z3frfD" role="3cqZAp">
        <property role="2TTd_B" value="," />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="7UZdOvgzQ8M">
    <property role="3GE5qa" value="substitute" />
    <property role="TrG5h" value="Subst_MiddleChild_AddNewChildByEnter" />
    <node concept="2XtntR" id="7UZdOvgzQ8N" role="LiRBU">
      <node concept="2IcTNh" id="7UZdOvgzQ8O" role="2IcTMY">
        <node concept="2Xtn5I" id="7UZdOvgzQ8P" role="2IcTML">
          <node concept="LIFWc" id="7UZdOvg$jVA" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="2" />
            <property role="p6zMs" value="2" />
            <property role="LIFWd" value="property_myEnumProperty" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="7UZdOvgzQ8R" role="LiZbd">
      <node concept="2IcTNh" id="7UZdOvgzQ8S" role="2IcTMY">
        <node concept="2Xtn5I" id="7UZdOvgzQ8T" role="2IcTML" />
        <node concept="2Xtn1I" id="7UZdOvgzQ8U" role="2IcTML">
          <node concept="LIFWc" id="62kNghyumkn" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Error" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="7UZdOvgzQ8W" role="LjaKd">
      <node concept="2HxZob" id="m$60z3cAu_" role="3cqZAp">
        <node concept="1iFQzN" id="m$60z3cAuF" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:6KwcZ1G3Pjm" resolve="Insert" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="7UZdOvgzJpI">
    <property role="3GE5qa" value="substitute" />
    <property role="TrG5h" value="Subst_MultiChild_AddNewChildByEnter" />
    <node concept="2XtntR" id="7UZdOvgzJpJ" role="LiRBU">
      <node concept="2Xtn5I" id="7UZdOvgzJpK" role="2IcTeL">
        <node concept="LIFWc" id="7UZdOvgzJpL" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="2" />
          <property role="p6zMs" value="2" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="7UZdOvgzJpM" role="LiZbd">
      <node concept="2Xtn5I" id="7UZdOvgzJpN" role="2IcTeL" />
      <node concept="2Xtn1I" id="7UZdOvgzJpO" role="2IcTeL">
        <node concept="LIFWc" id="62kNghyumlb" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Error" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="7UZdOvgzJpQ" role="LjaKd">
      <node concept="2HxZob" id="m$60z3cBgt" role="3cqZAp">
        <node concept="1iFQzN" id="m$60z3cBgu" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:6KwcZ1G3Pjm" resolve="Insert" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="7UZdOvgzJes">
    <property role="3GE5qa" value="substitute" />
    <property role="TrG5h" value="Subst_MultiChild_AddNewChildBySeparator" />
    <node concept="2XtntR" id="7UZdOvgzJg0" role="LiRBU">
      <node concept="2Xtn5I" id="m$60z3cCux" role="2IcTeL">
        <node concept="LIFWc" id="m$60z3cCvB" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="2" />
          <property role="p6zMs" value="2" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="7UZdOvgzJgI" role="LiZbd">
      <node concept="2Xtn5I" id="7UZdOvgzJgR" role="2IcTeL" />
      <node concept="2Xtn1I" id="m$60z3faCE" role="2IcTeL">
        <node concept="LIFWc" id="62kNghyuml_" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Error" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="7UZdOvgzJoG" role="LjaKd">
      <node concept="2TK7Tu" id="m$60z3fqlj" role="3cqZAp">
        <property role="2TTd_B" value="," />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0c9kv">
    <property role="TrG5h" value="Comment_Type" />
    <property role="3GE5qa" value="comment" />
    <node concept="3cpWsn" id="5fIuys0c9kO" role="LiRBU">
      <property role="TrG5h" value="a" />
      <node concept="10Oyi0" id="5fIuys0c9oN" role="1tU5fm">
        <node concept="LIFWc" id="4T4PEv8GUAf" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="3" />
          <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
        </node>
      </node>
    </node>
    <node concept="3cpWsn" id="5fIuys0c9t7" role="LiZbd">
      <property role="TrG5h" value="a" />
      <node concept="1X3_iC" id="5fIuys0cwIj" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10Oyi0" id="5fIuys0c9x4" role="8Wnug">
          <node concept="LIFWc" id="4T4PEv8GUAm" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="3" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
      </node>
      <node concept="33vP2l" id="5fIuys0cwIk" role="1tU5fm" />
    </node>
    <node concept="3clFbS" id="5fIuys0c9D7" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0c9D5" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0c9Db" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cFvu">
    <property role="TrG5h" value="Uncomment_SecondStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cFvB" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cFvC" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cFvD" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cFvN" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cFvP" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cFzN" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cFzK" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cFzL" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cFzM" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cF$d" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="5fIuys0cIID" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cFBD" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cFBE" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cFBF" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cFBG" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cFBH" role="37wK5m">
                  <property role="Xl_RC" value="hello" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="5fIuys0cIKp" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cFEU" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cFEV" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cFEW" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cFEX" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cFEY" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cFUE" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cFUF" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cFUG" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cFUH" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cFUI" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cFUJ" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cFUK" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cFUL" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cFUM" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cFUN" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cFUO" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cFUP" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cIRz" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_zedcwq_b0" />
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cFUR" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cFUS" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cFUT" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cFUU" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cFUV" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cGoI">
    <property role="TrG5h" value="Comment_FirstStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cGoJ" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cGoK" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cGoL" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cGoM" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cGoN" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cGoO" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cGoP" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cGoQ" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cGoR" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cGoS" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cHuf" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_zedcwq_b0" />
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cGoT" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cGoU" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cGoV" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cGoW" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cGoX" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cGoZ" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cGp0" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cGp1" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cGp2" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cGp3" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cGp4" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cGp5" role="9aQI4">
        <node concept="1X3_iC" id="5fIuys0cHAE" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cGp6" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cGp7" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cGp8" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cGp9" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cGpa" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="5fIuys0cHCJ" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cGpc" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cGpd" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cGpe" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cGpf" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cGpg" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cGpi" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cGpj" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cGpk" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cGpl" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cGpm" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cHEt">
    <property role="TrG5h" value="Comment_LastStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cHEu" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cHEv" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cHEw" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cHEx" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cHEy" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cHEz" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cHE$" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cHE_" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cHEA" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cHEB" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cHEC" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cHED" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cHEE" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cHEF" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cHEG" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cHEI" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cHEJ" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cHEK" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cHEL" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cHEM" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cI0l" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_zedcwq_b0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cHEN" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cHEO" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cHEP" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cHEQ" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cHER" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cHES" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cHET" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cHEV" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cHEW" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cHEX" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cHEY" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cHEZ" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="5fIuys0cI2r" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cHF1" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cHF2" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cHF3" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cHF4" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cHF5" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="5fIuys0cI4w" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cI6e">
    <property role="TrG5h" value="Uncomment_FirstStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cI6f" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cI6g" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cI6h" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cI6i" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cI6j" role="9aQI4">
        <node concept="1X3_iC" id="5fIuys0cIm3" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cI6k" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cI6l" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cI6m" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cI6n" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cI6o" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="5fIuys0cIpe" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI6q" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI6r" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI6s" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI6t" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI6u" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI6v" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI6w" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI6x" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI6y" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI6z" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cI6$" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cI6_" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cI6B" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI6C" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI6D" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI6E" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI6F" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cIv1" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_zedcwq_b0" />
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI6H" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI6I" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI6J" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI6K" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI6L" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI6M" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI6N" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI6O" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI6P" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI6Q" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cI6R">
    <property role="TrG5h" value="Uncomment_LastStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cI6S" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cI6T" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cI6U" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cI6V" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cI6W" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cI6X" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI6Y" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI6Z" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cI70" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI71" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI72" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI73" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI74" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cI75" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI76" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="5fIuys0cOc3" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cI77" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cI78" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cI79" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cI7a" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cI7b" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="5fIuys0cOfe" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cI7d" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cI7e" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cI7f" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI7g" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI7h" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cI7i" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI7j" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI7k" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI7l" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI7m" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI7n" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI7o" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI7q" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI7r" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI7s" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI7t" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI7u" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cOkX" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_zedcwq_b0" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cI7w">
    <property role="TrG5h" value="Comment_SecondStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cI7x" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cI7y" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cI7z" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cI7$" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cI7_" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cI7A" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI7B" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI7C" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI7D" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI7E" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI7F" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI7G" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI7H" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI7I" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI7J" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cI7K" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_zedcwq_b0" />
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI7L" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI7M" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI7N" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cI7O" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI7P" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cI7Q" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cI7R" role="9aQI4">
        <node concept="3clFbF" id="5fIuys0cI7S" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI7T" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI7U" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cI7V" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI7W" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="5fIuys0cI7X" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cI7Y" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cI7Z" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cI80" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="5fIuys0cI81" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cI82" role="37wK5m">
                  <property role="Xl_RC" value="hello" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="5fIuys0cI83" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cI84" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cI85" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cI86" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="5fIuys0cI87" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cI88" role="37wK5m">
                <property role="Xl_RC" value="hi again" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cJ7d">
    <property role="TrG5h" value="Uncomment_Type" />
    <property role="3GE5qa" value="comment" />
    <node concept="3cpWsn" id="5fIuys0cJ7e" role="LiRBU">
      <property role="TrG5h" value="a" />
      <node concept="1X3_iC" id="2_1mL0eRgwF" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10Oyi0" id="5fIuys0cJ7f" role="8Wnug">
          <node concept="LIFWc" id="2wB1LSHZ$t6" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
      </node>
      <node concept="33vP2l" id="2_1mL0eRgwG" role="1tU5fm" />
    </node>
    <node concept="3cpWsn" id="5fIuys0cJ7h" role="LiZbd">
      <property role="TrG5h" value="a" />
      <node concept="10Oyi0" id="5fIuys0cJ7j" role="1tU5fm">
        <node concept="LIFWc" id="2wB1LSHZ$sZ" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="5fIuys0cJ7m" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cJ7n" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cJ7o" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cJIH">
    <property role="TrG5h" value="Comment_InsideComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cJII" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cJIJ" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cJIK" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cJIP" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cJIQ" role="9aQI4">
        <node concept="1X3_iC" id="5fIuys0cNIe" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cJIR" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cJIS" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cJIT" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <node concept="LIFWc" id="4ntxqTCF5Wp" role="lGtFl">
                  <property role="ZRATv" value="true" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="0" />
                  <property role="p6zMs" value="3" />
                  <property role="LIFWd" value="property_name" />
                </node>
              </node>
              <node concept="liA8E" id="5fIuys0cJIU" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cJIV" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cJJ7" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cJJ8" role="9aQI4">
        <node concept="1X3_iC" id="5fIuys0cJJ9" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cJJa" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cJJb" role="3clFbG">
              <node concept="liA8E" id="5fIuys0cJJd" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cJJe" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
              <node concept="1X3_iC" id="5fIuys0cK3D" role="lGtFl">
                <property role="3V$3am" value="operand" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027771414" />
                <node concept="10M0yZ" id="5fIuys0cJJc" role="8Wnug">
                  <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                  <node concept="LIFWc" id="4ntxqTCF5WK" role="lGtFl">
                    <property role="ZRATv" value="true" />
                    <property role="OXtK3" value="true" />
                    <property role="p6zMq" value="0" />
                    <property role="p6zMs" value="3" />
                    <property role="LIFWd" value="property_name" />
                  </node>
                </node>
              </node>
              <node concept="33vP2n" id="5fIuys0cK3E" role="2Oq$k0" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cK74">
    <property role="TrG5h" value="Comment_BetweenTwoComments" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cK75" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cK76" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cK77" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cK7c" role="LiRBU">
      <node concept="3clFbS" id="5fIuys0cK7d" role="9aQI4">
        <node concept="1X3_iC" id="5fIuys0cKoS" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cK7e" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cK7f" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cK7g" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="5fIuys0cK7h" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cK7i" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="5fIuys0cK7k" role="3cqZAp">
          <node concept="2OqwBi" id="5fIuys0cK7l" role="3clFbG">
            <node concept="10M0yZ" id="5fIuys0cK7m" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="5fIuys0cK7n" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="5fIuys0cK7o" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cKr$" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_zedcwq_b0" />
          </node>
        </node>
        <node concept="1X3_iC" id="5fIuys0cKsF" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cK7p" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cK7q" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cK7r" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cK7s" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cK7t" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="5fIuys0cK7u" role="LiZbd">
      <node concept="3clFbS" id="5fIuys0cK7v" role="9aQI4">
        <node concept="1X3_iC" id="5fIuys0cKyB" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cK7x" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cK7y" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cK7z" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="5fIuys0cK7$" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cK7_" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="5fIuys0cK7A" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cK7B" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cK7C" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cK7D" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="5fIuys0cK7E" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cK7F" role="37wK5m">
                  <property role="Xl_RC" value="hello" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="5fIuys0cKxr" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="5fIuys0cKxt" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="5fIuys0cK7H" role="8Wnug">
            <node concept="2OqwBi" id="5fIuys0cK7I" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cK7J" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="5fIuys0cK7K" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="5fIuys0cK7L" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cKzo">
    <property role="TrG5h" value="Uncomment_Method" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cKzx" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cKzy" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cKzz" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="5fIuys0cKzH" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="5fIuys0cMGl" role="jymVt" />
      <node concept="1X3_iC" id="5fIuys0cMGz" role="lGtFl">
        <property role="3V$3am" value="member" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107461130800/5375687026011219971" />
        <node concept="3clFb_" id="5fIuys0cMAI" role="8Wnug">
          <property role="TrG5h" value="abc" />
          <node concept="3cqZAl" id="5fIuys0cMAK" role="3clF45" />
          <node concept="3Tm1VV" id="5fIuys0cMAL" role="1B3o_S" />
          <node concept="3clFbS" id="5fIuys0cMAM" role="3clF47">
            <node concept="3clFbF" id="5fIuys0cMF4" role="3cqZAp">
              <node concept="2OqwBi" id="5fIuys0cMF1" role="3clFbG">
                <node concept="10M0yZ" id="5fIuys0cMF2" role="2Oq$k0">
                  <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                  <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="5fIuys0cMF3" role="2OqNvi">
                  <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
                </node>
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="5fIuys0cMKp" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_fao2ea_c0" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5fIuys0cKzI" role="1B3o_S" />
    </node>
    <node concept="312cEu" id="5fIuys0cMHS" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="5fIuys0cMHT" role="jymVt" />
      <node concept="3clFb_" id="5fIuys0cMHV" role="jymVt">
        <property role="TrG5h" value="abc" />
        <node concept="3cqZAl" id="5fIuys0cMHW" role="3clF45" />
        <node concept="3Tm1VV" id="5fIuys0cMHX" role="1B3o_S" />
        <node concept="3clFbS" id="5fIuys0cMHY" role="3clF47">
          <node concept="3clFbF" id="5fIuys0cMHZ" role="3cqZAp">
            <node concept="2OqwBi" id="5fIuys0cMI0" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cMI1" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cMI3" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              </node>
            </node>
          </node>
        </node>
        <node concept="LIFWc" id="5fIuys0cMMB" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="1" />
          <property role="p6zMs" value="1" />
          <property role="LIFWd" value="Constant_fao2ea_c0" />
        </node>
      </node>
      <node concept="3Tm1VV" id="5fIuys0cMI4" role="1B3o_S" />
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cPl5">
    <property role="TrG5h" value="Comment_ExpressionStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cPl6" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cPl7" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cPl8" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="5fIuys0cPl9" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="5fIuys0cPla" role="jymVt" />
      <node concept="3clFb_" id="5fIuys0cPlc" role="jymVt">
        <property role="TrG5h" value="abc" />
        <node concept="3cqZAl" id="5fIuys0cPld" role="3clF45" />
        <node concept="3Tm1VV" id="5fIuys0cPle" role="1B3o_S" />
        <node concept="3clFbS" id="5fIuys0cPlf" role="3clF47">
          <node concept="3clFbF" id="5fIuys0cPlg" role="3cqZAp">
            <node concept="2OqwBi" id="5fIuys0cPlh" role="3clFbG">
              <node concept="LIFWc" id="5fIuys0cQ6c" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="LIFWd" value="Collection_t2jtrp_a" />
              </node>
              <node concept="10M0yZ" id="5fIuys0cPli" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="5fIuys0cPlj" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5fIuys0cPll" role="1B3o_S" />
    </node>
    <node concept="312cEu" id="5fIuys0cPlm" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="5fIuys0cPln" role="jymVt" />
      <node concept="3clFb_" id="5fIuys0cPlo" role="jymVt">
        <property role="TrG5h" value="abc" />
        <node concept="3cqZAl" id="5fIuys0cPlp" role="3clF45" />
        <node concept="3Tm1VV" id="5fIuys0cPlq" role="1B3o_S" />
        <node concept="3clFbS" id="5fIuys0cPlr" role="3clF47">
          <node concept="1X3_iC" id="5fIuys0cQ6y" role="lGtFl">
            <property role="3V$3am" value="statement" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
            <node concept="3clFbF" id="5fIuys0cPls" role="8Wnug">
              <node concept="2OqwBi" id="5fIuys0cPlt" role="3clFbG">
                <node concept="10M0yZ" id="5fIuys0cPlu" role="2Oq$k0">
                  <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                </node>
                <node concept="liA8E" id="5fIuys0cPlv" role="2OqNvi">
                  <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
                </node>
                <node concept="LIFWc" id="5fIuys0cQ6W" role="lGtFl">
                  <property role="LIFWa" value="0" />
                  <property role="LIFWd" value="Collection_t2jtrp_a" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5fIuys0cPlx" role="1B3o_S" />
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cPm4">
    <property role="TrG5h" value="Comment_SecondType" />
    <property role="3GE5qa" value="comment" />
    <node concept="3cpWsn" id="5fIuys0cPm5" role="LiRBU">
      <property role="TrG5h" value="a" />
      <node concept="1X3_iC" id="5fIuys0cPqj" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10Oyi0" id="5fIuys0cPm6" role="8Wnug" />
      </node>
      <node concept="10P55v" id="5fIuys0cPuk" role="1tU5fm">
        <node concept="LIFWc" id="4T4PEv8GUxF" role="lGtFl">
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          <property role="LIFWa" value="0" />
        </node>
      </node>
    </node>
    <node concept="3cpWsn" id="5fIuys0cPm8" role="LiZbd">
      <property role="TrG5h" value="a" />
      <node concept="1X3_iC" id="5fIuys0cPm9" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10Oyi0" id="5fIuys0cPma" role="8Wnug" />
      </node>
      <node concept="1X3_iC" id="5fIuys0cPu$" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10P55v" id="5fIuys0cPqe" role="8Wnug">
          <node concept="LIFWc" id="2wB1LSHZ$sQ" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
      </node>
      <node concept="33vP2l" id="5fIuys0cPu_" role="1tU5fm" />
    </node>
    <node concept="3clFbS" id="5fIuys0cPmd" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cPme" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cPmf" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cPyE">
    <property role="TrG5h" value="Comment_NodeWithComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cPyN" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cPyO" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cPyP" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="37G2lO3eG2N" role="LiRBU">
      <node concept="3clFbS" id="37G2lO3eG2P" role="9aQI4">
        <node concept="9aQIb" id="37G2lO3eGaB" role="3cqZAp">
          <node concept="3clFbS" id="37G2lO3eGaC" role="9aQI4">
            <node concept="1X3_iC" id="37G2lO3eGzu" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3clFbF" id="37G2lO3eGe_" role="8Wnug">
                <node concept="2OqwBi" id="37G2lO3eGey" role="3clFbG">
                  <node concept="10M0yZ" id="37G2lO3eGez" role="2Oq$k0">
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  </node>
                  <node concept="liA8E" id="37G2lO3eGe$" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                    <node concept="Xl_RD" id="37G2lO3eGpr" role="37wK5m">
                      <property role="Xl_RC" value="" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbF" id="37G2lO3eGjf" role="3cqZAp">
              <node concept="2OqwBi" id="37G2lO3eGjc" role="3clFbG">
                <node concept="10M0yZ" id="37G2lO3eGjd" role="2Oq$k0">
                  <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                  <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                </node>
                <node concept="liA8E" id="37G2lO3eGje" role="2OqNvi">
                  <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
                </node>
              </node>
            </node>
            <node concept="1X3_iC" id="37G2lO3eGyw" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3clFbF" id="37G2lO3eGot" role="8Wnug">
                <node concept="2OqwBi" id="37G2lO3eGoq" role="3clFbG">
                  <node concept="10M0yZ" id="37G2lO3eGor" role="2Oq$k0">
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  </node>
                  <node concept="liA8E" id="37G2lO3eGos" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                    <node concept="Xl_RD" id="37G2lO3eGtn" role="37wK5m">
                      <property role="Xl_RC" value="hi" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="LIFWc" id="37G2lO3eGAM" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_319n5h_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="37G2lO3eGBk" role="LiZbd">
      <node concept="3clFbS" id="37G2lO3eGBl" role="9aQI4">
        <node concept="1X3_iC" id="37G2lO3eGCz" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="9aQIb" id="37G2lO3eGBm" role="8Wnug">
            <node concept="3clFbS" id="37G2lO3eGBn" role="9aQI4">
              <node concept="1X3_iC" id="37G2lO3eGBo" role="lGtFl">
                <property role="3V$3am" value="statement" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
                <node concept="3clFbF" id="37G2lO3eGBp" role="8Wnug">
                  <node concept="2OqwBi" id="37G2lO3eGBq" role="3clFbG">
                    <node concept="10M0yZ" id="37G2lO3eGBr" role="2Oq$k0">
                      <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                      <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                    </node>
                    <node concept="liA8E" id="37G2lO3eGBs" role="2OqNvi">
                      <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                      <node concept="Xl_RD" id="37G2lO3eGBt" role="37wK5m">
                        <property role="Xl_RC" value="" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="37G2lO3eGBu" role="3cqZAp">
                <node concept="2OqwBi" id="37G2lO3eGBv" role="3clFbG">
                  <node concept="10M0yZ" id="37G2lO3eGBw" role="2Oq$k0">
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                  </node>
                  <node concept="liA8E" id="37G2lO3eGBx" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
                  </node>
                </node>
              </node>
              <node concept="1X3_iC" id="37G2lO3eGBy" role="lGtFl">
                <property role="3V$3am" value="statement" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
                <node concept="3clFbF" id="37G2lO3eGBz" role="8Wnug">
                  <node concept="2OqwBi" id="37G2lO3eGB$" role="3clFbG">
                    <node concept="10M0yZ" id="37G2lO3eGB_" role="2Oq$k0">
                      <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                      <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="liA8E" id="37G2lO3eGBA" role="2OqNvi">
                      <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                      <node concept="Xl_RD" id="37G2lO3eGBB" role="37wK5m">
                        <property role="Xl_RC" value="hi" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="37G2lO3eGDr" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_319n5h_a0" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cPG7">
    <property role="TrG5h" value="Uncomment_SecondType" />
    <property role="3GE5qa" value="comment" />
    <node concept="3cpWsn" id="5fIuys0cPG8" role="LiRBU">
      <property role="TrG5h" value="a" />
      <node concept="1X3_iC" id="5fIuys0cPG9" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10Oyi0" id="5fIuys0cPGa" role="8Wnug" />
      </node>
      <node concept="1X3_iC" id="5fIuys0cPGu" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10P55v" id="5fIuys0cPGb" role="8Wnug">
          <node concept="LIFWc" id="2_1mL0eRgDw" role="lGtFl">
            <property role="LIFWa" value="4" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="4" />
            <property role="p6zMs" value="4" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
      </node>
      <node concept="10OMs4" id="5fIuys0cPKx" role="1tU5fm" />
    </node>
    <node concept="3cpWsn" id="5fIuys0cPGd" role="LiZbd">
      <property role="TrG5h" value="a" />
      <node concept="1X3_iC" id="5fIuys0cPGe" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10Oyi0" id="5fIuys0cPGf" role="8Wnug" />
      </node>
      <node concept="10P55v" id="5fIuys0cPGh" role="1tU5fm">
        <node concept="LIFWc" id="2_1mL0eRgDy" role="lGtFl">
          <property role="LIFWa" value="4" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="4" />
          <property role="p6zMs" value="4" />
          <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
        </node>
      </node>
      <node concept="1X3_iC" id="5fIuys0cPPo" role="lGtFl">
        <property role="3V$3am" value="type" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/4972933694980447171/5680397130376446158" />
        <node concept="10OMs4" id="5fIuys0cPPj" role="8Wnug" />
      </node>
    </node>
    <node concept="3clFbS" id="5fIuys0cPGk" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cPGl" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cPGm" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5fIuys0cQ7i">
    <property role="TrG5h" value="Comment_CommentUncomment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="5fIuys0cQ7j" role="LjaKd">
      <node concept="2HxZob" id="5fIuys0cQ7k" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cQ7l" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
      <node concept="2HxZob" id="5fIuys0cQ9R" role="3cqZAp">
        <node concept="1iFQzN" id="5fIuys0cQ9S" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="5fIuys0cQ7m" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="5fIuys0cQ7n" role="jymVt" />
      <node concept="3clFb_" id="5fIuys0cQ7o" role="jymVt">
        <property role="TrG5h" value="abc" />
        <node concept="3cqZAl" id="5fIuys0cQ7p" role="3clF45" />
        <node concept="3Tm1VV" id="5fIuys0cQ7q" role="1B3o_S" />
        <node concept="3clFbS" id="5fIuys0cQ7r" role="3clF47">
          <node concept="3clFbF" id="5fIuys0cQ7s" role="3cqZAp">
            <node concept="2OqwBi" id="5fIuys0cQ7t" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cQ7u" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <node concept="LIFWc" id="5fIuys0cQ99" role="lGtFl">
                  <property role="LIFWa" value="3" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="3" />
                  <property role="p6zMs" value="3" />
                  <property role="LIFWd" value="property_name" />
                </node>
              </node>
              <node concept="liA8E" id="5fIuys0cQ7v" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5fIuys0cQ7x" role="1B3o_S" />
    </node>
    <node concept="312cEu" id="5fIuys0cQ7y" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="5fIuys0cQ7z" role="jymVt" />
      <node concept="3clFb_" id="5fIuys0cQ7$" role="jymVt">
        <property role="TrG5h" value="abc" />
        <node concept="3cqZAl" id="5fIuys0cQ7_" role="3clF45" />
        <node concept="3Tm1VV" id="5fIuys0cQ7A" role="1B3o_S" />
        <node concept="3clFbS" id="5fIuys0cQ7B" role="3clF47">
          <node concept="3clFbF" id="5fIuys0cQ7D" role="3cqZAp">
            <node concept="2OqwBi" id="5fIuys0cQ7E" role="3clFbG">
              <node concept="10M0yZ" id="5fIuys0cQ7F" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <node concept="LIFWc" id="5fIuys0cQ9t" role="lGtFl">
                  <property role="LIFWa" value="3" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="3" />
                  <property role="p6zMs" value="3" />
                  <property role="LIFWd" value="property_name" />
                </node>
              </node>
              <node concept="liA8E" id="5fIuys0cQ7G" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5fIuys0cQ7I" role="1B3o_S" />
    </node>
  </node>
  <node concept="LiM7Y" id="37G2lO3eGZ9">
    <property role="TrG5h" value="Comment_InsertBeforeComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="37G2lO3eGZa" role="LjaKd">
      <node concept="2HxZob" id="37G2lO3eGZb" role="3cqZAp">
        <node concept="1iFQzN" id="37G2lO3eGZc" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:6KwcZ1G3Pjm" resolve="Insert" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="37G2lO3eGZd" role="LiRBU">
      <node concept="3clFbS" id="37G2lO3eGZe" role="9aQI4">
        <node concept="1X3_iC" id="37G2lO3eGZf" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="37G2lO3eGZg" role="8Wnug">
            <node concept="2OqwBi" id="37G2lO3eGZh" role="3clFbG">
              <node concept="10M0yZ" id="37G2lO3eGZi" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="37G2lO3eGZj" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="37G2lO3eGZk" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="37G2lO3eGZl" role="3cqZAp">
          <node concept="2OqwBi" id="37G2lO3eGZm" role="3clFbG">
            <node concept="10M0yZ" id="37G2lO3eGZn" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="37G2lO3eGZo" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="37G2lO3eGZp" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="37G2lO3eGZr" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="37G2lO3eGZs" role="8Wnug">
            <node concept="2OqwBi" id="37G2lO3eGZt" role="3clFbG">
              <node concept="10M0yZ" id="37G2lO3eGZu" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="37G2lO3eGZv" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="37G2lO3eGZw" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="LIFWc" id="37G2lO3eH7j" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="1" />
        <property role="p6zMs" value="1" />
        <property role="LIFWd" value="Constant_319n5h_a0" />
      </node>
    </node>
    <node concept="9aQIb" id="37G2lO3eGZx" role="LiZbd">
      <node concept="3clFbS" id="37G2lO3eGZy" role="9aQI4">
        <node concept="3clFbH" id="37G2lO3eH7K" role="3cqZAp">
          <node concept="LIFWc" id="37G2lO3eH7M" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Constant_7h2wce_a" />
          </node>
        </node>
        <node concept="1X3_iC" id="37G2lO3eGZz" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="37G2lO3eGZ$" role="8Wnug">
            <node concept="2OqwBi" id="37G2lO3eGZ_" role="3clFbG">
              <node concept="10M0yZ" id="37G2lO3eGZA" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="37G2lO3eGZB" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="37G2lO3eGZC" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="37G2lO3eGZE" role="3cqZAp">
          <node concept="2OqwBi" id="37G2lO3eGZF" role="3clFbG">
            <node concept="10M0yZ" id="37G2lO3eGZG" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="37G2lO3eGZH" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="37G2lO3eGZI" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="37G2lO3eGZK" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="37G2lO3eGZL" role="8Wnug">
            <node concept="2OqwBi" id="37G2lO3eGZM" role="3clFbG">
              <node concept="10M0yZ" id="37G2lO3eGZN" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="37G2lO3eGZO" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="37G2lO3eGZP" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3FNxLZIq69L">
    <property role="TrG5h" value="Comment_InsertAfterComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="3FNxLZIq69M" role="LjaKd">
      <node concept="2HxZob" id="3FNxLZIq69N" role="3cqZAp">
        <node concept="1iFQzN" id="3FNxLZIq69O" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:6KwcZ1G3Pjm" resolve="Insert" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3FNxLZIq69P" role="LiRBU">
      <node concept="3clFbS" id="3FNxLZIq69Q" role="9aQI4">
        <node concept="1X3_iC" id="3FNxLZIq69R" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="3FNxLZIq69S" role="8Wnug">
            <node concept="2OqwBi" id="3FNxLZIq69T" role="3clFbG">
              <node concept="10M0yZ" id="3FNxLZIq69U" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="3FNxLZIq69V" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="3FNxLZIq69W" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="3FNxLZIq6jx" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_zedcwq_b0" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3FNxLZIq69X" role="3cqZAp">
          <node concept="2OqwBi" id="3FNxLZIq69Y" role="3clFbG">
            <node concept="10M0yZ" id="3FNxLZIq69Z" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="3FNxLZIq6a0" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="3FNxLZIq6a1" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="3FNxLZIq6a2" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="3FNxLZIq6a3" role="8Wnug">
            <node concept="2OqwBi" id="3FNxLZIq6a4" role="3clFbG">
              <node concept="10M0yZ" id="3FNxLZIq6a5" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="3FNxLZIq6a6" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="3FNxLZIq6a7" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3FNxLZIq6a9" role="LiZbd">
      <node concept="3clFbS" id="3FNxLZIq6aa" role="9aQI4">
        <node concept="1X3_iC" id="3FNxLZIq6ad" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="3FNxLZIq6ae" role="8Wnug">
            <node concept="2OqwBi" id="3FNxLZIq6af" role="3clFbG">
              <node concept="10M0yZ" id="3FNxLZIq6ag" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="3FNxLZIq6ah" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="3FNxLZIq6ai" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="3FNxLZIq6kj" role="3cqZAp">
          <node concept="LIFWc" id="3FNxLZIq6lc" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Constant_7h2wce_a" />
          </node>
        </node>
        <node concept="3clFbF" id="3FNxLZIq6aj" role="3cqZAp">
          <node concept="2OqwBi" id="3FNxLZIq6ak" role="3clFbG">
            <node concept="10M0yZ" id="3FNxLZIq6al" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="3FNxLZIq6am" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="3FNxLZIq6an" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="3FNxLZIq6ao" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="3FNxLZIq6ap" role="8Wnug">
            <node concept="2OqwBi" id="3FNxLZIq6aq" role="3clFbG">
              <node concept="10M0yZ" id="3FNxLZIq6ar" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="3FNxLZIq6as" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="3FNxLZIq6at" role="37wK5m">
                  <property role="Xl_RC" value="hi again" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3FNxLZIq6le">
    <property role="TrG5h" value="Comment_EditInsideComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="3FNxLZIq6lf" role="LjaKd">
      <node concept="2TK7Tu" id="3FNxLZIqrCQ" role="3cqZAp">
        <property role="2TTd_B" value="return 1" />
      </node>
    </node>
    <node concept="9aQIb" id="3FNxLZIq6li" role="LiRBU">
      <node concept="3clFbS" id="3FNxLZIq6lj" role="9aQI4">
        <node concept="1X3_iC" id="3FNxLZIq7ki" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="9aQIb" id="3FNxLZIq7bc" role="8Wnug">
            <node concept="3clFbS" id="3FNxLZIq7bd" role="9aQI4">
              <node concept="3clFbF" id="3FNxLZIq7fy" role="3cqZAp">
                <node concept="2OqwBi" id="3FNxLZIq7fv" role="3clFbG">
                  <node concept="10M0yZ" id="3FNxLZIq7fw" role="2Oq$k0">
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  </node>
                  <node concept="liA8E" id="3FNxLZIq7fx" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                    <node concept="Xl_RD" id="3FNxLZIq7fU" role="37wK5m">
                      <property role="Xl_RC" value="hi" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbH" id="3FNxLZIqr$Q" role="3cqZAp">
                <node concept="LIFWc" id="3FNxLZIqr$X" role="lGtFl">
                  <property role="ZRATv" value="true" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="0" />
                  <property role="p6zMs" value="0" />
                  <property role="LIFWd" value="Constant_7h2wce_a" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3FNxLZIq7lr" role="LiZbd">
      <node concept="3clFbS" id="3FNxLZIq7ls" role="9aQI4">
        <node concept="1X3_iC" id="3FNxLZIqruz" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="9aQIb" id="3FNxLZIq7lu" role="8Wnug">
            <node concept="3clFbS" id="3FNxLZIq7lv" role="9aQI4">
              <node concept="3clFbF" id="3FNxLZIq7ly" role="3cqZAp">
                <node concept="2OqwBi" id="3FNxLZIq7lz" role="3clFbG">
                  <node concept="10M0yZ" id="3FNxLZIq7l$" role="2Oq$k0">
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  </node>
                  <node concept="liA8E" id="3FNxLZIq7l_" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                    <node concept="Xl_RD" id="3FNxLZIq7lA" role="37wK5m">
                      <property role="Xl_RC" value="hi" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3cpWs6" id="3FNxLZIqr$_" role="3cqZAp">
                <node concept="3cmrfG" id="3FNxLZIqr$J" role="3cqZAk">
                  <property role="3cmrfH" value="1" />
                  <node concept="LIFWc" id="3FNxLZIqrHd" role="lGtFl">
                    <property role="ZRATv" value="true" />
                    <property role="OXtK3" value="true" />
                    <property role="p6zMq" value="1" />
                    <property role="p6zMs" value="1" />
                    <property role="LIFWd" value="property_value" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3FNxLZIqrJI">
    <property role="TrG5h" value="Uncomment_NodeWithComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="3FNxLZIqrJJ" role="LjaKd">
      <node concept="2HxZob" id="3FNxLZIqrJK" role="3cqZAp">
        <node concept="1iFQzN" id="3FNxLZIqrJL" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3FNxLZIqrK7" role="LiZbd">
      <node concept="3clFbS" id="3FNxLZIqrK8" role="9aQI4">
        <node concept="1X3_iC" id="3FNxLZIqrK9" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="9aQIb" id="3FNxLZIqrKa" role="8Wnug">
            <node concept="3clFbS" id="3FNxLZIqrKb" role="9aQI4">
              <node concept="1X3_iC" id="3FNxLZIqrKc" role="lGtFl">
                <property role="3V$3am" value="statement" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
                <node concept="3clFbF" id="3FNxLZIqrKd" role="8Wnug">
                  <node concept="2OqwBi" id="3FNxLZIqrKe" role="3clFbG">
                    <node concept="10M0yZ" id="3FNxLZIqrKf" role="2Oq$k0">
                      <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                      <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                    </node>
                    <node concept="liA8E" id="3FNxLZIqrKg" role="2OqNvi">
                      <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                      <node concept="Xl_RD" id="3FNxLZIqrKh" role="37wK5m">
                        <property role="Xl_RC" value="" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3FNxLZIqrKi" role="3cqZAp">
                <node concept="2OqwBi" id="3FNxLZIqrKj" role="3clFbG">
                  <node concept="10M0yZ" id="3FNxLZIqrKk" role="2Oq$k0">
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  </node>
                  <node concept="liA8E" id="3FNxLZIqrKl" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3FNxLZIqrKn" role="3cqZAp">
                <node concept="2OqwBi" id="3FNxLZIqrKo" role="3clFbG">
                  <node concept="10M0yZ" id="3FNxLZIqrKp" role="2Oq$k0">
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  </node>
                  <node concept="liA8E" id="3FNxLZIqrKq" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                    <node concept="Xl_RD" id="3FNxLZIqrKr" role="37wK5m">
                      <property role="Xl_RC" value="hi" />
                    </node>
                  </node>
                </node>
                <node concept="LIFWc" id="3FNxLZIqrOB" role="lGtFl">
                  <property role="ZRATv" value="true" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="1" />
                  <property role="p6zMs" value="1" />
                  <property role="LIFWd" value="Constant_zedcwq_b0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3FNxLZIqrLT" role="LiRBU">
      <node concept="3clFbS" id="3FNxLZIqrLU" role="9aQI4">
        <node concept="1X3_iC" id="3FNxLZIqrLV" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="9aQIb" id="3FNxLZIqrLW" role="8Wnug">
            <node concept="3clFbS" id="3FNxLZIqrLX" role="9aQI4">
              <node concept="1X3_iC" id="3FNxLZIqrLY" role="lGtFl">
                <property role="3V$3am" value="statement" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
                <node concept="3clFbF" id="3FNxLZIqrLZ" role="8Wnug">
                  <node concept="2OqwBi" id="3FNxLZIqrM0" role="3clFbG">
                    <node concept="10M0yZ" id="3FNxLZIqrM1" role="2Oq$k0">
                      <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                      <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="liA8E" id="3FNxLZIqrM2" role="2OqNvi">
                      <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                      <node concept="Xl_RD" id="3FNxLZIqrM3" role="37wK5m">
                        <property role="Xl_RC" value="" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="3clFbF" id="3FNxLZIqrM4" role="3cqZAp">
                <node concept="2OqwBi" id="3FNxLZIqrM5" role="3clFbG">
                  <node concept="10M0yZ" id="3FNxLZIqrM6" role="2Oq$k0">
                    <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                    <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                  </node>
                  <node concept="liA8E" id="3FNxLZIqrM7" role="2OqNvi">
                    <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
                  </node>
                </node>
              </node>
              <node concept="1X3_iC" id="3FNxLZIqrM8" role="lGtFl">
                <property role="3V$3am" value="statement" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
                <node concept="3clFbF" id="3FNxLZIqrM9" role="8Wnug">
                  <node concept="2OqwBi" id="3FNxLZIqrMa" role="3clFbG">
                    <node concept="10M0yZ" id="3FNxLZIqrMb" role="2Oq$k0">
                      <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                      <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                    </node>
                    <node concept="liA8E" id="3FNxLZIqrMc" role="2OqNvi">
                      <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                      <node concept="Xl_RD" id="3FNxLZIqrMd" role="37wK5m">
                        <property role="Xl_RC" value="hi" />
                      </node>
                    </node>
                  </node>
                  <node concept="LIFWc" id="3FNxLZIqrOm" role="lGtFl">
                    <property role="ZRATv" value="true" />
                    <property role="OXtK3" value="true" />
                    <property role="p6zMq" value="1" />
                    <property role="p6zMs" value="1" />
                    <property role="LIFWd" value="Constant_zedcwq_b0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1OLuskJsGhT">
    <property role="TrG5h" value="Uncomment_StatementAtFirstPosition" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1OLuskJsGhU" role="LjaKd">
      <node concept="2HxZob" id="1OLuskJsGhV" role="3cqZAp">
        <node concept="1iFQzN" id="1OLuskJsGhW" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1OLuskJsGhX" role="LiRBU">
      <node concept="3clFbS" id="1OLuskJsGhY" role="9aQI4">
        <node concept="1X3_iC" id="1OLuskJsGhZ" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="1OLuskJsGi0" role="8Wnug">
            <node concept="2OqwBi" id="1OLuskJsGi1" role="3clFbG">
              <node concept="10M0yZ" id="1OLuskJsGi2" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="1OLuskJsGi3" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="1OLuskJsGi4" role="37wK5m">
                  <property role="Xl_RC" value="hi" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="4ntxqTCF7Rl" role="lGtFl">
              <property role="LIFWa" value="0" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="0" />
              <property role="p6zMs" value="0" />
              <property role="LIFWd" value="LEFT_COMMENT_ANCHOR" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1OLuskJsGig" role="LiZbd">
      <node concept="3clFbS" id="1OLuskJsGih" role="9aQI4">
        <node concept="3clFbF" id="1OLuskJsGii" role="3cqZAp">
          <node concept="2OqwBi" id="1OLuskJsGij" role="3clFbG">
            <node concept="10M0yZ" id="1OLuskJsGik" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <node concept="LIFWc" id="1uAcxHxlfyf" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="0" />
                <property role="p6zMs" value="0" />
                <property role="LIFWd" value="ReferencePresentation_ji2wba_a0a0a" />
              </node>
            </node>
            <node concept="liA8E" id="1OLuskJsGil" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="1OLuskJsGim" role="37wK5m">
                <property role="Xl_RC" value="hi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1OLuskJsGTG">
    <property role="TrG5h" value="Uncomment_NodeAtFirstPosition" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1OLuskJsGTH" role="LjaKd">
      <node concept="2HxZob" id="1OLuskJsGTI" role="3cqZAp">
        <node concept="1iFQzN" id="1OLuskJsGTJ" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="1OLuskJsGXE" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="CommentHolder" />
      <node concept="3Tm1VV" id="1OLuskJsGXF" role="1B3o_S" />
      <node concept="2tJIrI" id="1OLuskJsH3E" role="jymVt" />
      <node concept="1X3_iC" id="1OLuskJsH3m" role="lGtFl">
        <property role="3V$3am" value="member" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107461130800/5375687026011219971" />
        <node concept="2YIFZL" id="1OLuskJsH2r" role="8Wnug">
          <property role="TrG5h" value="main" />
          <node concept="37vLTG" id="1OLuskJsH2s" role="3clF46">
            <property role="TrG5h" value="args" />
            <node concept="10Q1$e" id="1OLuskJsH2t" role="1tU5fm">
              <node concept="17QB3L" id="1OLuskJsH2u" role="10Q1$1" />
            </node>
          </node>
          <node concept="3cqZAl" id="1OLuskJsH2v" role="3clF45" />
          <node concept="3Tm1VV" id="1OLuskJsH2w" role="1B3o_S" />
          <node concept="3clFbS" id="1OLuskJsH2x" role="3clF47" />
          <node concept="LIFWc" id="1OLuskJsH4l" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="LEFT_COMMENT_ANCHOR" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEu" id="1OLuskJsHg7" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="CommentHolder" />
      <node concept="3Tm1VV" id="1OLuskJsHg8" role="1B3o_S" />
      <node concept="2tJIrI" id="1OLuskJsHg9" role="jymVt" />
      <node concept="2YIFZL" id="1OLuskJsHgb" role="jymVt">
        <property role="TrG5h" value="main" />
        <node concept="37vLTG" id="1OLuskJsHgc" role="3clF46">
          <property role="TrG5h" value="args" />
          <node concept="10Q1$e" id="1OLuskJsHgd" role="1tU5fm">
            <node concept="17QB3L" id="1OLuskJsHge" role="10Q1$1" />
          </node>
        </node>
        <node concept="3cqZAl" id="1OLuskJsHgf" role="3clF45" />
        <node concept="3Tm1VV" id="1OLuskJsHgg" role="1B3o_S">
          <node concept="LIFWc" id="1OLuskJsHgY" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
        <node concept="3clFbS" id="1OLuskJsHgh" role="3clF47" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1OLuskJsHkY">
    <property role="TrG5h" value="Uncomment_NodeAtLastPosition" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1OLuskJsHkZ" role="LjaKd">
      <node concept="2HxZob" id="1OLuskJsHl0" role="3cqZAp">
        <node concept="1iFQzN" id="1OLuskJsHl1" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="1OLuskJsHl2" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="CommentHolder" />
      <node concept="3Tm1VV" id="1OLuskJsHl3" role="1B3o_S" />
      <node concept="2tJIrI" id="1OLuskJsHl4" role="jymVt" />
      <node concept="1X3_iC" id="1OLuskJsHl5" role="lGtFl">
        <property role="3V$3am" value="member" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107461130800/5375687026011219971" />
        <node concept="2YIFZL" id="1OLuskJsHl6" role="8Wnug">
          <property role="TrG5h" value="main" />
          <node concept="37vLTG" id="1OLuskJsHl7" role="3clF46">
            <property role="TrG5h" value="args" />
            <node concept="10Q1$e" id="1OLuskJsHl8" role="1tU5fm">
              <node concept="17QB3L" id="1OLuskJsHl9" role="10Q1$1" />
            </node>
          </node>
          <node concept="3cqZAl" id="1OLuskJsHla" role="3clF45" />
          <node concept="3Tm1VV" id="1OLuskJsHlb" role="1B3o_S" />
          <node concept="3clFbS" id="1OLuskJsHlc" role="3clF47" />
          <node concept="LIFWc" id="1OLuskJsHlN" role="lGtFl">
            <property role="LIFWa" value="1" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="RIGHT_COMMENT_ANCHOR" />
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEu" id="1OLuskJsHle" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="CommentHolder" />
      <node concept="3Tm1VV" id="1OLuskJsHlf" role="1B3o_S" />
      <node concept="2tJIrI" id="1OLuskJsHlg" role="jymVt" />
      <node concept="2YIFZL" id="1OLuskJsHlh" role="jymVt">
        <property role="TrG5h" value="main" />
        <node concept="37vLTG" id="1OLuskJsHli" role="3clF46">
          <property role="TrG5h" value="args" />
          <node concept="10Q1$e" id="1OLuskJsHlj" role="1tU5fm">
            <node concept="17QB3L" id="1OLuskJsHlk" role="10Q1$1" />
          </node>
        </node>
        <node concept="3cqZAl" id="1OLuskJsHll" role="3clF45" />
        <node concept="3Tm1VV" id="1OLuskJsHlm" role="1B3o_S" />
        <node concept="3clFbS" id="1OLuskJsHlo" role="3clF47" />
        <node concept="LIFWc" id="1OLuskJsHlP" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="1" />
          <property role="p6zMs" value="1" />
          <property role="LIFWd" value="Constant_fao2ea_c0" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1OLuskJsHlT">
    <property role="TrG5h" value="Comment_CommentUncommentWithSelection" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1OLuskJsHlU" role="LjaKd">
      <node concept="2HxZob" id="1OLuskJsHlV" role="3cqZAp">
        <node concept="1iFQzN" id="1OLuskJsHlW" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
      <node concept="2HxZob" id="1OLuskJsHnl" role="3cqZAp">
        <node concept="1iFQzN" id="1OLuskJsHnm" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="1OLuskJsHlX" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="CommentHolder" />
      <node concept="3Tm1VV" id="1OLuskJsHlY" role="1B3o_S" />
      <node concept="2tJIrI" id="1OLuskJsHlZ" role="jymVt" />
      <node concept="2YIFZL" id="1OLuskJsHm1" role="jymVt">
        <property role="TrG5h" value="main" />
        <node concept="37vLTG" id="1OLuskJsHm2" role="3clF46">
          <property role="TrG5h" value="args" />
          <node concept="10Q1$e" id="1OLuskJsHm3" role="1tU5fm">
            <node concept="17QB3L" id="1OLuskJsHm4" role="10Q1$1" />
          </node>
        </node>
        <node concept="3cqZAl" id="1OLuskJsHm5" role="3clF45" />
        <node concept="3Tm1VV" id="1OLuskJsHm6" role="1B3o_S" />
        <node concept="3clFbS" id="1OLuskJsHm7" role="3clF47" />
        <node concept="LIFWc" id="1OLuskJsHnd" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="LIFWd" value="Collection_j4vm40_a" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="1OLuskJsHm9" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="CommentHolder" />
      <node concept="3Tm1VV" id="1OLuskJsHma" role="1B3o_S" />
      <node concept="2tJIrI" id="1OLuskJsHmb" role="jymVt" />
      <node concept="2YIFZL" id="1OLuskJsHmc" role="jymVt">
        <property role="TrG5h" value="main" />
        <node concept="37vLTG" id="1OLuskJsHmd" role="3clF46">
          <property role="TrG5h" value="args" />
          <node concept="10Q1$e" id="1OLuskJsHme" role="1tU5fm">
            <node concept="17QB3L" id="1OLuskJsHmf" role="10Q1$1" />
          </node>
        </node>
        <node concept="3cqZAl" id="1OLuskJsHmg" role="3clF45" />
        <node concept="3Tm1VV" id="1OLuskJsHmh" role="1B3o_S" />
        <node concept="3clFbS" id="1OLuskJsHmi" role="3clF47" />
        <node concept="LIFWc" id="1OLuskJsHnh" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="LIFWd" value="Collection_j4vm40_a" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4T4PEv8GVFR">
    <property role="TrG5h" value="Comment_Line" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8GVFS" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8GVFT" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8GVFU" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8GVFV" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8GVFW" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8GVFX" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8GVFY" role="9aQI4">
            <node concept="3cpWs8" id="4T4PEv8GW5Q" role="3cqZAp">
              <node concept="3cpWsn" id="4T4PEv8GW5T" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="3uibUv" id="4T4PEv8GX_L" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                </node>
                <node concept="2OqwBi" id="4T4PEv8GWfb" role="33vP2m">
                  <node concept="2YIFZM" id="4T4PEv8GW6p" role="2Oq$k0">
                    <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                    <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                  </node>
                  <node concept="liA8E" id="4T4PEv8GXqz" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                    <node concept="3cmrfG" id="4T4PEv8GXtQ" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="LIFWc" id="4T4PEv8GXND" role="lGtFl">
                      <property role="LIFWa" value="2" />
                      <property role="OXtK3" value="true" />
                      <property role="p6zMq" value="2" />
                      <property role="p6zMs" value="2" />
                      <property role="LIFWd" value="property_name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8GVGg" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8GVGh" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8GXZ_" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8GXZA" role="9aQI4">
            <node concept="1X3_iC" id="4T4PEv8GY8j" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3cpWs8" id="4T4PEv8GXZD" role="8Wnug">
                <node concept="3cpWsn" id="4T4PEv8GXZE" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8GXZF" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8GXZG" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8GXZH" role="2Oq$k0">
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="liA8E" id="4T4PEv8GXZI" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8GXZJ" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                      </node>
                      <node concept="LIFWc" id="4T4PEv8GY8A" role="lGtFl">
                        <property role="LIFWa" value="2" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="2" />
                        <property role="p6zMs" value="2" />
                        <property role="LIFWd" value="property_name" />
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
  </node>
  <node concept="LiM7Y" id="4T4PEv8GY8C">
    <property role="TrG5h" value="Comment_Node" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8GY8D" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8GY8E" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8GY8F" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8GY8G" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8GY8H" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8GY8I" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8GY8J" role="9aQI4">
            <node concept="3cpWs8" id="4T4PEv8GY8K" role="3cqZAp">
              <node concept="3cpWsn" id="4T4PEv8GY8L" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="3uibUv" id="4T4PEv8GY8M" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                </node>
                <node concept="2OqwBi" id="4T4PEv8GY8N" role="33vP2m">
                  <node concept="2YIFZM" id="4T4PEv8GY8O" role="2Oq$k0">
                    <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                  </node>
                  <node concept="liA8E" id="4T4PEv8GY8P" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                    <node concept="3cmrfG" id="4T4PEv8GY8Q" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="LIFWc" id="4T4PEv8GYDJ" role="lGtFl">
                      <property role="ZRATv" value="true" />
                      <property role="OXtK3" value="true" />
                      <property role="p6zMq" value="0" />
                      <property role="p6zMs" value="3" />
                      <property role="LIFWd" value="property_name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8GY8S" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8GY8T" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8GY8U" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8GY8V" role="9aQI4">
            <node concept="3cpWs8" id="4T4PEv8GY8X" role="3cqZAp">
              <node concept="3cpWsn" id="4T4PEv8GY8Y" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="3uibUv" id="4T4PEv8GY8Z" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                </node>
                <node concept="2OqwBi" id="4T4PEv8GY90" role="33vP2m">
                  <node concept="2YIFZM" id="4T4PEv8GY91" role="2Oq$k0">
                    <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                  </node>
                  <node concept="1X3_iC" id="4T4PEv8GYXx" role="lGtFl">
                    <property role="3V$3am" value="operation" />
                    <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027833540" />
                    <node concept="liA8E" id="4T4PEv8GY92" role="8Wnug">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8GY93" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                      </node>
                      <node concept="LIFWc" id="4T4PEv8GZnI" role="lGtFl">
                        <property role="ZRATv" value="true" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="0" />
                        <property role="p6zMs" value="3" />
                        <property role="LIFWd" value="property_name" />
                      </node>
                    </node>
                  </node>
                  <node concept="2OqG4A" id="4T4PEv8GYXy" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4T4PEv8GZo1">
    <property role="TrG5h" value="Comment_LineInsideCommentedNode" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8GZo2" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8GZo3" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8GZo4" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8GZo5" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8GZo6" role="9aQI4">
        <node concept="1X3_iC" id="4T4PEv8H0eB" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="9aQIb" id="4T4PEv8GZo7" role="8Wnug">
            <node concept="3clFbS" id="4T4PEv8GZo8" role="9aQI4">
              <node concept="3cpWs8" id="4T4PEv8GZo9" role="3cqZAp">
                <node concept="3cpWsn" id="4T4PEv8GZoa" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8GZob" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8GZoc" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8GZod" role="2Oq$k0">
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                    </node>
                    <node concept="liA8E" id="4T4PEv8GZoe" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8GZof" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                      </node>
                      <node concept="LIFWc" id="4T4PEv8GZog" role="lGtFl">
                        <property role="LIFWa" value="2" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="2" />
                        <property role="p6zMs" value="2" />
                        <property role="LIFWd" value="property_name" />
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
    <node concept="9aQIb" id="4T4PEv8GZoh" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8GZoi" role="9aQI4">
        <node concept="1X3_iC" id="4T4PEv8H0eZ" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="9aQIb" id="4T4PEv8GZoj" role="8Wnug">
            <node concept="3clFbS" id="4T4PEv8GZok" role="9aQI4">
              <node concept="1X3_iC" id="4T4PEv8GZol" role="lGtFl">
                <property role="3V$3am" value="statement" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
                <node concept="3cpWs8" id="4T4PEv8GZom" role="8Wnug">
                  <node concept="3cpWsn" id="4T4PEv8GZon" role="3cpWs9">
                    <property role="TrG5h" value="a" />
                    <node concept="3uibUv" id="4T4PEv8GZoo" role="1tU5fm">
                      <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                    </node>
                    <node concept="2OqwBi" id="4T4PEv8GZop" role="33vP2m">
                      <node concept="2YIFZM" id="4T4PEv8GZoq" role="2Oq$k0">
                        <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                        <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                      </node>
                      <node concept="liA8E" id="4T4PEv8GZor" role="2OqNvi">
                        <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                        <node concept="3cmrfG" id="4T4PEv8GZos" role="37wK5m">
                          <property role="3cmrfH" value="0" />
                        </node>
                        <node concept="LIFWc" id="4T4PEv8GZot" role="lGtFl">
                          <property role="LIFWa" value="2" />
                          <property role="OXtK3" value="true" />
                          <property role="p6zMq" value="2" />
                          <property role="p6zMs" value="2" />
                          <property role="LIFWd" value="property_name" />
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
    </node>
  </node>
  <node concept="LiM7Y" id="4T4PEv8H0fp">
    <property role="TrG5h" value="Comment_NodeInsideCommentedNode" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8H0fq" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8H0fr" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8H0fs" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="2wB1LSHYt3B" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="abc" />
      <node concept="3Tm1VV" id="2wB1LSHYt3C" role="1B3o_S" />
      <node concept="1X3_iC" id="2wB1LSHYt8n" role="lGtFl">
        <property role="3V$3am" value="member" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107461130800/5375687026011219971" />
        <node concept="2YIFZL" id="2wB1LSHYt7X" role="8Wnug">
          <property role="TrG5h" value="main" />
          <node concept="37vLTG" id="2wB1LSHYt7Y" role="3clF46">
            <property role="TrG5h" value="args" />
            <node concept="10Q1$e" id="2wB1LSHYt7Z" role="1tU5fm">
              <node concept="17QB3L" id="2wB1LSHYt80" role="10Q1$1" />
            </node>
          </node>
          <node concept="3Tm1VV" id="2wB1LSHYt82" role="1B3o_S" />
          <node concept="3clFbS" id="2wB1LSHYt83" role="3clF47" />
          <node concept="3cqZAl" id="2wB1LSHYt81" role="3clF45">
            <node concept="LIFWc" id="2wB1LSHYtdr" role="lGtFl">
              <property role="LIFWa" value="2" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="2" />
              <property role="p6zMs" value="2" />
              <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="312cEu" id="2wB1LSHYtcU" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="abc" />
      <node concept="3Tm1VV" id="2wB1LSHYtcV" role="1B3o_S" />
      <node concept="1X3_iC" id="2wB1LSHYtcW" role="lGtFl">
        <property role="3V$3am" value="member" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1107461130800/5375687026011219971" />
        <node concept="2YIFZL" id="2wB1LSHYtcX" role="8Wnug">
          <property role="TrG5h" value="main" />
          <node concept="37vLTG" id="2wB1LSHYtcY" role="3clF46">
            <property role="TrG5h" value="args" />
            <node concept="10Q1$e" id="2wB1LSHYtcZ" role="1tU5fm">
              <node concept="17QB3L" id="2wB1LSHYtd0" role="10Q1$1" />
            </node>
          </node>
          <node concept="3Tm1VV" id="2wB1LSHYtd1" role="1B3o_S" />
          <node concept="3clFbS" id="2wB1LSHYtd2" role="3clF47" />
          <node concept="1X3_iC" id="2wB1LSHYtdx" role="lGtFl">
            <property role="3V$3am" value="returnType" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123132/1068580123133" />
            <node concept="3cqZAl" id="2wB1LSHYtd3" role="8Wnug">
              <node concept="LIFWc" id="2wB1LSHYthA" role="lGtFl">
                <property role="LIFWa" value="2" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="2" />
                <property role="p6zMs" value="2" />
                <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
              </node>
            </node>
          </node>
          <node concept="33vP2l" id="2wB1LSHYtdy" role="3clF45" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4T4PEv8H0g2">
    <property role="TrG5h" value="Comment_NodeInsideCommentedLine" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8H0g3" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8H0g4" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8H0g5" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8H0g6" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8H0g7" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H0g9" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H0ga" role="9aQI4">
            <node concept="1X3_iC" id="4T4PEv8H0kE" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3cpWs8" id="4T4PEv8H0gb" role="8Wnug">
                <node concept="3cpWsn" id="4T4PEv8H0gc" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8H0gd" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8H0ge" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8H0gf" role="2Oq$k0">
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="liA8E" id="4T4PEv8H0gg" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8H0gh" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                      </node>
                      <node concept="LIFWc" id="4T4PEv8H0kY" role="lGtFl">
                        <property role="ZRATv" value="true" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="0" />
                        <property role="p6zMs" value="3" />
                        <property role="LIFWd" value="property_name" />
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
    <node concept="9aQIb" id="4T4PEv8H0gj" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8H0gk" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H0gm" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H0gn" role="9aQI4">
            <node concept="1X3_iC" id="4T4PEv8H0go" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3cpWs8" id="4T4PEv8H0gp" role="8Wnug">
                <node concept="3cpWsn" id="4T4PEv8H0gq" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8H0gr" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8H0gs" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8H0gt" role="2Oq$k0">
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="1X3_iC" id="4T4PEv8H5qf" role="lGtFl">
                      <property role="3V$3am" value="operation" />
                      <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027833540" />
                      <node concept="liA8E" id="4T4PEv8H0gu" role="8Wnug">
                        <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                        <node concept="3cmrfG" id="4T4PEv8H0gv" role="37wK5m">
                          <property role="3cmrfH" value="0" />
                        </node>
                        <node concept="LIFWc" id="4T4PEv8H5qs" role="lGtFl">
                          <property role="ZRATv" value="true" />
                          <property role="OXtK3" value="true" />
                          <property role="p6zMq" value="0" />
                          <property role="p6zMs" value="3" />
                          <property role="LIFWd" value="property_name" />
                        </node>
                      </node>
                    </node>
                    <node concept="2OqG4A" id="4T4PEv8H5qg" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4T4PEv8H0le">
    <property role="TrG5h" value="Uncomment_Line" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8H0lf" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8H0lg" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8H0lh" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8H0li" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8H0lj" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H0lk" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H0ll" role="9aQI4">
            <node concept="1X3_iC" id="4T4PEv8H0xn" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3cpWs8" id="4T4PEv8H0lm" role="8Wnug">
                <node concept="3cpWsn" id="4T4PEv8H0ln" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8H0lo" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8H0lp" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8H0lq" role="2Oq$k0">
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="liA8E" id="4T4PEv8H0lr" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8H0ls" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                      </node>
                      <node concept="LIFWc" id="4T4PEv8H0xF" role="lGtFl">
                        <property role="LIFWa" value="2" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="2" />
                        <property role="p6zMs" value="2" />
                        <property role="LIFWd" value="property_name" />
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
    <node concept="9aQIb" id="4T4PEv8H0lu" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8H0lv" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H0lw" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H0lx" role="9aQI4">
            <node concept="3cpWs8" id="4T4PEv8H0lz" role="3cqZAp">
              <node concept="3cpWsn" id="4T4PEv8H0l$" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="3uibUv" id="4T4PEv8H0l_" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                </node>
                <node concept="2OqwBi" id="4T4PEv8H0lA" role="33vP2m">
                  <node concept="2YIFZM" id="4T4PEv8H0lB" role="2Oq$k0">
                    <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                    <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                  </node>
                  <node concept="liA8E" id="4T4PEv8H0lC" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                    <node concept="3cmrfG" id="4T4PEv8H0lD" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                    </node>
                    <node concept="LIFWc" id="4T4PEv8H0_M" role="lGtFl">
                      <property role="LIFWa" value="2" />
                      <property role="OXtK3" value="true" />
                      <property role="p6zMq" value="2" />
                      <property role="p6zMs" value="2" />
                      <property role="LIFWd" value="property_name" />
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
  <node concept="LiM7Y" id="4T4PEv8H0DI">
    <property role="TrG5h" value="Comment_LineOutOfCommentedNode" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8H0DJ" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8H0DK" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8H0DL" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8H0DM" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8H0DN" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H0DO" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H0DP" role="9aQI4">
            <node concept="3cpWs8" id="4T4PEv8H0DQ" role="3cqZAp">
              <node concept="3cpWsn" id="4T4PEv8H0DR" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="3uibUv" id="4T4PEv8H0DS" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                </node>
                <node concept="2OqwBi" id="4T4PEv8H0DT" role="33vP2m">
                  <node concept="2YIFZM" id="4T4PEv8H0DU" role="2Oq$k0">
                    <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                    <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                  </node>
                  <node concept="1X3_iC" id="4T4PEv8H29Z" role="lGtFl">
                    <property role="3V$3am" value="operation" />
                    <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027833540" />
                    <node concept="liA8E" id="4T4PEv8H0DV" role="8Wnug">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8H0DW" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                      </node>
                      <node concept="LIFWc" id="2_1mL0eResL" role="lGtFl">
                        <property role="ZRATv" value="true" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="3" />
                        <property role="p6zMs" value="3" />
                        <property role="LIFWd" value="property_name" />
                      </node>
                    </node>
                  </node>
                  <node concept="2OqG4A" id="4T4PEv8H2a0" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8H0DY" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8H0DZ" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H0E0" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H0E1" role="9aQI4">
            <node concept="1X3_iC" id="2_1mL0eBkBF" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3cpWs8" id="4T4PEv8H0E2" role="8Wnug">
                <node concept="3cpWsn" id="4T4PEv8H0E3" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8H0E4" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8H0E5" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8H0E6" role="2Oq$k0">
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="1X3_iC" id="4T4PEv8H3iz" role="lGtFl">
                      <property role="3V$3am" value="operation" />
                      <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027833540" />
                      <node concept="liA8E" id="4T4PEv8H0E8" role="8Wnug">
                        <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                        <node concept="3cmrfG" id="4T4PEv8H0E9" role="37wK5m">
                          <property role="3cmrfH" value="0" />
                        </node>
                        <node concept="LIFWc" id="4T4PEv8H3He" role="lGtFl">
                          <property role="ZRATv" value="true" />
                          <property role="OXtK3" value="true" />
                          <property role="p6zMq" value="3" />
                          <property role="p6zMs" value="3" />
                          <property role="LIFWd" value="property_name" />
                        </node>
                      </node>
                    </node>
                    <node concept="2OqG4A" id="4T4PEv8H3i$" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4T4PEv8H3IK">
    <property role="TrG5h" value="Uncomment_LineOutOfCommentedNode" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8H3IL" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8H3IM" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8H3IN" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8H3IO" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8H3IP" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H3IQ" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H3IR" role="9aQI4">
            <node concept="1X3_iC" id="4T4PEv8H3Ks" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3cpWs8" id="4T4PEv8H3IS" role="8Wnug">
                <node concept="3cpWsn" id="4T4PEv8H3IT" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8H3IU" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8H3IV" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8H3IW" role="2Oq$k0">
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                    </node>
                    <node concept="1X3_iC" id="4T4PEv8H3IX" role="lGtFl">
                      <property role="3V$3am" value="operation" />
                      <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027833540" />
                      <node concept="liA8E" id="4T4PEv8H3IY" role="8Wnug">
                        <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                        <node concept="3cmrfG" id="4T4PEv8H3IZ" role="37wK5m">
                          <property role="3cmrfH" value="0" />
                        </node>
                        <node concept="LIFWc" id="2_1mL0eRf_Q" role="lGtFl">
                          <property role="ZRATv" value="true" />
                          <property role="OXtK3" value="true" />
                          <property role="p6zMq" value="3" />
                          <property role="p6zMs" value="3" />
                          <property role="LIFWd" value="property_name" />
                        </node>
                      </node>
                    </node>
                    <node concept="2OqG4A" id="4T4PEv8H3J1" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8H3J2" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8H3J3" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8H3J4" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8H3J5" role="9aQI4">
            <node concept="3cpWs8" id="4T4PEv8H3J7" role="3cqZAp">
              <node concept="3cpWsn" id="4T4PEv8H3J8" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="3uibUv" id="4T4PEv8H3J9" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                </node>
                <node concept="2OqwBi" id="4T4PEv8H3Ja" role="33vP2m">
                  <node concept="2YIFZM" id="4T4PEv8H3Jb" role="2Oq$k0">
                    <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                    <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                  </node>
                  <node concept="1X3_iC" id="4T4PEv8H3Jc" role="lGtFl">
                    <property role="3V$3am" value="operation" />
                    <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027833540" />
                    <node concept="liA8E" id="4T4PEv8H3Jd" role="8Wnug">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8H3Je" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                      </node>
                      <node concept="LIFWc" id="4T4PEv8H3Jf" role="lGtFl">
                        <property role="ZRATv" value="true" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="3" />
                        <property role="p6zMs" value="3" />
                        <property role="LIFWd" value="property_name" />
                      </node>
                    </node>
                  </node>
                  <node concept="2OqG4A" id="4T4PEv8H3Jg" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4T4PEv8Iv0b">
    <property role="TrG5h" value="Comment_LineFromParameter" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="4T4PEv8Iv0c" role="LjaKd">
      <node concept="2HxZob" id="4T4PEv8Iv0d" role="3cqZAp">
        <node concept="1iFQzN" id="4T4PEv8Iv0e" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="4T4PEv8Iv0f" role="LiRBU">
      <node concept="3clFbS" id="4T4PEv8Iv0g" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8Iv0h" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8Iv0i" role="9aQI4">
            <node concept="3cpWs8" id="4T4PEv8Iv0j" role="3cqZAp">
              <node concept="3cpWsn" id="4T4PEv8Iv0k" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="3uibUv" id="4T4PEv8Iv0l" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                </node>
                <node concept="2OqwBi" id="4T4PEv8Iv0m" role="33vP2m">
                  <node concept="2YIFZM" id="4T4PEv8Iv0n" role="2Oq$k0">
                    <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                  </node>
                  <node concept="liA8E" id="4T4PEv8Iv0o" role="2OqNvi">
                    <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                    <node concept="3cmrfG" id="4T4PEv8Iv0p" role="37wK5m">
                      <property role="3cmrfH" value="0" />
                      <node concept="LIFWc" id="4T4PEv8IvHp" role="lGtFl">
                        <property role="ZRATv" value="true" />
                        <property role="OXtK3" value="true" />
                        <property role="p6zMq" value="1" />
                        <property role="p6zMs" value="1" />
                        <property role="LIFWd" value="property_value" />
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
    <node concept="9aQIb" id="4T4PEv8Iv0r" role="LiZbd">
      <node concept="3clFbS" id="4T4PEv8Iv0s" role="9aQI4">
        <node concept="9aQIb" id="4T4PEv8Iv0t" role="3cqZAp">
          <node concept="3clFbS" id="4T4PEv8Iv0u" role="9aQI4">
            <node concept="1X3_iC" id="4T4PEv8Iv0v" role="lGtFl">
              <property role="3V$3am" value="statement" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
              <node concept="3cpWs8" id="4T4PEv8Iv0w" role="8Wnug">
                <node concept="3cpWsn" id="4T4PEv8Iv0x" role="3cpWs9">
                  <property role="TrG5h" value="a" />
                  <node concept="3uibUv" id="4T4PEv8Iv0y" role="1tU5fm">
                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                  </node>
                  <node concept="2OqwBi" id="4T4PEv8Iv0z" role="33vP2m">
                    <node concept="2YIFZM" id="4T4PEv8Iv0$" role="2Oq$k0">
                      <ref role="37wK5l" to="wyt6:~System.getProperties():java.util.Properties" resolve="getProperties" />
                      <ref role="1Pybhc" to="wyt6:~System" resolve="System" />
                    </node>
                    <node concept="liA8E" id="4T4PEv8Iv0_" role="2OqNvi">
                      <ref role="37wK5l" to="33ny:~Hashtable.get(java.lang.Object):java.lang.Object" resolve="get" />
                      <node concept="3cmrfG" id="4T4PEv8Iv0A" role="37wK5m">
                        <property role="3cmrfH" value="0" />
                        <node concept="LIFWc" id="4T4PEv8IvL4" role="lGtFl">
                          <property role="ZRATv" value="true" />
                          <property role="OXtK3" value="true" />
                          <property role="p6zMq" value="1" />
                          <property role="p6zMs" value="1" />
                          <property role="LIFWd" value="property_value" />
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
    </node>
  </node>
  <node concept="LiM7Y" id="3sPLHkUeqzO">
    <property role="TrG5h" value="Comment_EmptyStatementList" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="3sPLHkUeqzP" role="LjaKd">
      <node concept="2HxZob" id="3sPLHkUeqzQ" role="3cqZAp">
        <node concept="1iFQzN" id="3sPLHkUeqzR" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3sPLHkUeqzS" role="LiRBU">
      <node concept="3clFbS" id="3sPLHkUeqzT" role="9aQI4">
        <node concept="LIFWc" id="3sPLHkUeqFC" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_u338ov_a0a" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3sPLHkUeq$c" role="LiZbd">
      <node concept="3clFbS" id="3sPLHkUeq$d" role="9aQI4">
        <node concept="LIFWc" id="3sPLHkUeqFE" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_u338ov_a0a" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3sPLHkUeqFG">
    <property role="TrG5h" value="Comment_MultipleStatements" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="3sPLHkUeqFH" role="LjaKd">
      <node concept="2HxZob" id="2_1mL0eR0gl" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eR0gm" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3E$GKBvNxdm" resolve="SelectNext" />
        </node>
      </node>
      <node concept="2HxZob" id="2_1mL0eR0gn" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eR0go" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3E$GKBvNxdm" resolve="SelectNext" />
        </node>
      </node>
      <node concept="2HxZob" id="2_1mL0eR0gp" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eR0gq" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3E$GKBvNxdm" resolve="SelectNext" />
        </node>
      </node>
      <node concept="2HxZob" id="3sPLHkUeqFI" role="3cqZAp">
        <node concept="1iFQzN" id="3sPLHkUeqFJ" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3sPLHkUeqFK" role="LiRBU">
      <node concept="3clFbS" id="3sPLHkUeqFL" role="9aQI4">
        <node concept="3cpWs8" id="3sPLHkUeqM2" role="3cqZAp">
          <node concept="3cpWsn" id="3sPLHkUeqM5" role="3cpWs9">
            <property role="TrG5h" value="a" />
            <node concept="10Oyi0" id="3sPLHkUeqM0" role="1tU5fm" />
            <node concept="3cmrfG" id="3sPLHkUeqMI" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
          <node concept="LIFWc" id="2_1mL0eBkK1" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_y9czm0_b0" />
          </node>
        </node>
        <node concept="3cpWs8" id="3sPLHkUeqRg" role="3cqZAp">
          <node concept="3cpWsn" id="3sPLHkUeqRj" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="10Oyi0" id="3sPLHkUeqRe" role="1tU5fm" />
            <node concept="3cmrfG" id="3sPLHkUeqRZ" role="33vP2m">
              <property role="3cmrfH" value="9" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3sPLHkUeqGX" role="3cqZAp">
          <node concept="2OqwBi" id="3sPLHkUeqGY" role="3clFbG">
            <node concept="10M0yZ" id="3sPLHkUeqGZ" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="3sPLHkUeqH1" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3sPLHkUeqFN" role="LiZbd">
      <node concept="3clFbS" id="3sPLHkUeqFO" role="9aQI4">
        <node concept="1X3_iC" id="71jmo98pkxM" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3cpWs8" id="3sPLHkUeqUr" role="8Wnug">
            <node concept="3cpWsn" id="3sPLHkUeqUs" role="3cpWs9">
              <property role="TrG5h" value="a" />
              <node concept="10Oyi0" id="3sPLHkUeqUt" role="1tU5fm" />
              <node concept="3cmrfG" id="3sPLHkUeqUu" role="33vP2m">
                <property role="3cmrfH" value="0" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="71jmo98pkxN" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3cpWs8" id="3sPLHkUeqUw" role="8Wnug">
            <node concept="3cpWsn" id="3sPLHkUeqUx" role="3cpWs9">
              <property role="TrG5h" value="b" />
              <node concept="10Oyi0" id="3sPLHkUeqUy" role="1tU5fm" />
              <node concept="3cmrfG" id="3sPLHkUeqUz" role="33vP2m">
                <property role="3cmrfH" value="9" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="71jmo98pkxO" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="3sPLHkUeqU$" role="8Wnug">
            <node concept="2OqwBi" id="3sPLHkUeqU_" role="3clFbG">
              <node concept="10M0yZ" id="3sPLHkUeqUA" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="3sPLHkUeqUB" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3sPLHkUer5v">
    <property role="TrG5h" value="Uncomment_MultipleStatements" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="3sPLHkUer5w" role="LjaKd">
      <node concept="2HxZob" id="3sPLHkUer5x" role="3cqZAp">
        <node concept="1iFQzN" id="3sPLHkUer5y" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3E$GKBvNxdm" resolve="SelectNext" />
        </node>
      </node>
      <node concept="2HxZob" id="3sPLHkUer5z" role="3cqZAp">
        <node concept="1iFQzN" id="3sPLHkUer5$" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3E$GKBvNxdm" resolve="SelectNext" />
        </node>
      </node>
      <node concept="2HxZob" id="3sPLHkUer5_" role="3cqZAp">
        <node concept="1iFQzN" id="3sPLHkUer5A" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3E$GKBvNxdm" resolve="SelectNext" />
        </node>
      </node>
      <node concept="2HxZob" id="3sPLHkUer5B" role="3cqZAp">
        <node concept="1iFQzN" id="3sPLHkUer5C" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3sPLHkUer5D" role="LiRBU">
      <node concept="3clFbS" id="3sPLHkUer5E" role="9aQI4">
        <node concept="1X3_iC" id="3sPLHkUer9H" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3cpWs8" id="3sPLHkUer8v" role="8Wnug">
            <node concept="3cpWsn" id="3sPLHkUer8w" role="3cpWs9">
              <property role="TrG5h" value="a" />
              <node concept="10Oyi0" id="3sPLHkUer8x" role="1tU5fm" />
              <node concept="3cmrfG" id="3sPLHkUer8y" role="33vP2m">
                <property role="3cmrfH" value="0" />
              </node>
            </node>
            <node concept="LIFWc" id="2_1mL0eBkIL" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_y9czm0_b0" />
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="3sPLHkUer9I" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3cpWs8" id="3sPLHkUer8z" role="8Wnug">
            <node concept="3cpWsn" id="3sPLHkUer8$" role="3cpWs9">
              <property role="TrG5h" value="b" />
              <node concept="10Oyi0" id="3sPLHkUer8_" role="1tU5fm" />
              <node concept="3cmrfG" id="3sPLHkUer8A" role="33vP2m">
                <property role="3cmrfH" value="9" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1X3_iC" id="3sPLHkUer9J" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="3sPLHkUer8B" role="8Wnug">
            <node concept="2OqwBi" id="3sPLHkUer8C" role="3clFbG">
              <node concept="10M0yZ" id="3sPLHkUer8D" role="2Oq$k0">
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              </node>
              <node concept="liA8E" id="3sPLHkUer8E" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="3sPLHkUer5S" role="LiZbd">
      <node concept="3clFbS" id="3sPLHkUer5T" role="9aQI4">
        <node concept="3cpWs8" id="3sPLHkUer5V" role="3cqZAp">
          <node concept="3cpWsn" id="3sPLHkUer5W" role="3cpWs9">
            <property role="TrG5h" value="a" />
            <node concept="10Oyi0" id="3sPLHkUer5X" role="1tU5fm" />
            <node concept="3cmrfG" id="3sPLHkUer5Y" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3sPLHkUer60" role="3cqZAp">
          <node concept="3cpWsn" id="3sPLHkUer61" role="3cpWs9">
            <property role="TrG5h" value="b" />
            <node concept="10Oyi0" id="3sPLHkUer62" role="1tU5fm" />
            <node concept="3cmrfG" id="3sPLHkUer63" role="33vP2m">
              <property role="3cmrfH" value="9" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3sPLHkUer65" role="3cqZAp">
          <node concept="2OqwBi" id="3sPLHkUer66" role="3clFbG">
            <node concept="10M0yZ" id="3sPLHkUer67" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="3sPLHkUer68" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2_1mL0eBlSN">
    <property role="TrG5h" value="Comment_Return" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2_1mL0eBlSO" role="LjaKd">
      <node concept="2HxZob" id="2_1mL0eBlSV" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eBlSW" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eBlSX" role="LiRBU">
      <node concept="3clFbS" id="2_1mL0eBlSY" role="9aQI4">
        <node concept="3cpWs6" id="2_1mL0eBlZb" role="3cqZAp">
          <node concept="3cmrfG" id="2_1mL0eBlZm" role="3cqZAk">
            <property role="3cmrfH" value="1" />
            <node concept="LIFWc" id="2_1mL0eBlZA" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="0" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="property_value" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eBlTc" role="LiZbd">
      <node concept="3clFbS" id="2_1mL0eBlTd" role="9aQI4">
        <node concept="3cpWs6" id="2_1mL0eBm3G" role="3cqZAp">
          <node concept="1X3_iC" id="2_1mL0eBm49" role="lGtFl">
            <property role="3V$3am" value="expression" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068581242878/1068581517676" />
            <node concept="3cmrfG" id="2_1mL0eBm3V" role="8Wnug">
              <property role="3cmrfH" value="1" />
              <node concept="LIFWc" id="2_1mL0eBm4k" role="lGtFl">
                <property role="ZRATv" value="true" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="0" />
                <property role="p6zMs" value="1" />
                <property role="LIFWd" value="property_value" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2_1mL0eBm4U">
    <property role="TrG5h" value="Comment_ElseIf" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2_1mL0eBm4V" role="LjaKd">
      <node concept="2HxZob" id="2_1mL0eBm4W" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eBm4X" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eBm4Y" role="LiRBU">
      <node concept="3clFbS" id="2_1mL0eBm4Z" role="9aQI4">
        <node concept="3clFbJ" id="2_1mL0eBm9M" role="3cqZAp">
          <node concept="3clFbS" id="2_1mL0eBm9N" role="3clFbx" />
          <node concept="3clFbT" id="2_1mL0eBma0" role="3clFbw">
            <property role="3clFbU" value="true" />
          </node>
          <node concept="3eNFk2" id="2_1mL0eBmaa" role="3eNLev">
            <node concept="3clFbT" id="2_1mL0eBmas" role="3eO9$A">
              <property role="3clFbU" value="false" />
            </node>
            <node concept="3clFbS" id="2_1mL0eBmac" role="3eOfB_" />
            <node concept="LIFWc" id="2_1mL0eBmbh" role="lGtFl">
              <property role="LIFWa" value="0" />
              <property role="LIFWd" value="Collection_m61dlm_a" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eBm53" role="LiZbd">
      <node concept="3clFbS" id="2_1mL0eBm54" role="9aQI4">
        <node concept="3clFbJ" id="2_1mL0eBmbp" role="3cqZAp">
          <node concept="3clFbS" id="2_1mL0eBmbq" role="3clFbx" />
          <node concept="3clFbT" id="2_1mL0eBmbr" role="3clFbw">
            <property role="3clFbU" value="true" />
          </node>
          <node concept="1X3_iC" id="2_1mL0eBmco" role="lGtFl">
            <property role="3V$3am" value="elsifClauses" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123159/1206060520071" />
            <node concept="3eNFk2" id="2_1mL0eBmbs" role="8Wnug">
              <node concept="3clFbT" id="2_1mL0eBmbt" role="3eO9$A">
                <property role="3clFbU" value="false" />
              </node>
              <node concept="3clFbS" id="2_1mL0eBmbu" role="3eOfB_" />
              <node concept="LIFWc" id="2_1mL0eBmcA" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="LIFWd" value="Collection_m61dlm_a" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2_1mL0eBmcC">
    <property role="TrG5h" value="Comment_MethodAnnotation" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2_1mL0eBmcD" role="LjaKd">
      <node concept="2HxZob" id="2_1mL0eBmcE" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eBmcF" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="2_1mL0eBmdI" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="methodcontainer" />
      <node concept="2YIFZL" id="2_1mL0eBmic" role="jymVt">
        <property role="TrG5h" value="main" />
        <node concept="37vLTG" id="2_1mL0eBmid" role="3clF46">
          <property role="TrG5h" value="args" />
          <node concept="10Q1$e" id="2_1mL0eBmie" role="1tU5fm">
            <node concept="17QB3L" id="2_1mL0eBmif" role="10Q1$1" />
          </node>
        </node>
        <node concept="3cqZAl" id="2_1mL0eBmig" role="3clF45" />
        <node concept="3Tm1VV" id="2_1mL0eBmih" role="1B3o_S" />
        <node concept="3clFbS" id="2_1mL0eBmii" role="3clF47" />
        <node concept="2AHcQZ" id="2_1mL0eBmjb" role="2AJF6D">
          <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
          <node concept="LIFWc" id="2_1mL0eBmye" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="7" />
            <property role="p6zMs" value="7" />
            <property role="LIFWd" value="property_name" />
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2_1mL0eBmdJ" role="1B3o_S" />
    </node>
    <node concept="312cEu" id="2_1mL0eBmyj" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="methodcontainer" />
      <node concept="2YIFZL" id="2_1mL0eBmyk" role="jymVt">
        <property role="TrG5h" value="main" />
        <node concept="37vLTG" id="2_1mL0eBmyl" role="3clF46">
          <property role="TrG5h" value="args" />
          <node concept="10Q1$e" id="2_1mL0eBmym" role="1tU5fm">
            <node concept="17QB3L" id="2_1mL0eBmyn" role="10Q1$1" />
          </node>
        </node>
        <node concept="3cqZAl" id="2_1mL0eBmyo" role="3clF45" />
        <node concept="3Tm1VV" id="2_1mL0eBmyp" role="1B3o_S" />
        <node concept="3clFbS" id="2_1mL0eBmyq" role="3clF47" />
        <node concept="1X3_iC" id="2_1mL0eBmyS" role="lGtFl">
          <property role="3V$3am" value="annotation" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1188208481402/1188208488637" />
          <node concept="2AHcQZ" id="2_1mL0eBmyr" role="8Wnug">
            <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
            <node concept="LIFWc" id="2_1mL0eBmz3" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="7" />
              <property role="p6zMs" value="7" />
              <property role="LIFWd" value="property_name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2_1mL0eBmyt" role="1B3o_S" />
    </node>
  </node>
  <node concept="LiM7Y" id="2_1mL0eBmHm">
    <property role="TrG5h" value="Comment_Initializer" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2_1mL0eBmHn" role="LjaKd">
      <node concept="2HxZob" id="2_1mL0eBmHo" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eBmHp" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eBmHq" role="LiRBU">
      <node concept="3clFbS" id="2_1mL0eBmHr" role="9aQI4">
        <node concept="3cpWs8" id="2_1mL0eBmLX" role="3cqZAp">
          <node concept="3cpWsn" id="2_1mL0eBmM0" role="3cpWs9">
            <property role="TrG5h" value="a" />
            <node concept="10Oyi0" id="2_1mL0eBmLW" role="1tU5fm" />
            <node concept="3cmrfG" id="2_1mL0eBmMo" role="33vP2m">
              <property role="3cmrfH" value="0" />
              <node concept="LIFWc" id="2_1mL0eBmNl" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="0" />
                <property role="p6zMs" value="1" />
                <property role="LIFWd" value="property_value" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eBmHz" role="LiZbd">
      <node concept="3clFbS" id="2_1mL0eBmH$" role="9aQI4">
        <node concept="3cpWs8" id="2_1mL0eBmMx" role="3cqZAp">
          <node concept="3cpWsn" id="2_1mL0eBmMy" role="3cpWs9">
            <property role="TrG5h" value="a" />
            <node concept="10Oyi0" id="2_1mL0eBmMz" role="1tU5fm" />
            <node concept="1X3_iC" id="2_1mL0eBmNI" role="lGtFl">
              <property role="3V$3am" value="initializer" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068431474542/1068431790190" />
              <node concept="3cmrfG" id="2_1mL0eBmM$" role="8Wnug">
                <property role="3cmrfH" value="0" />
                <node concept="LIFWc" id="2_1mL0eBmNO" role="lGtFl">
                  <property role="LIFWa" value="0" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="0" />
                  <property role="p6zMs" value="1" />
                  <property role="LIFWd" value="property_value" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2_1mL0eQVWN">
    <property role="TrG5h" value="Uncomment_StatementByDelete" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2_1mL0eQVWO" role="LjaKd">
      <node concept="2HxZob" id="2_1mL0eQVWP" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eQVWQ" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eQVWR" role="LiRBU">
      <node concept="3clFbS" id="2_1mL0eQVWS" role="9aQI4">
        <node concept="1X3_iC" id="2_1mL0eQVWY" role="lGtFl">
          <property role="3V$3am" value="statement" />
          <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
          <node concept="3clFbF" id="2_1mL0eQVWZ" role="8Wnug">
            <node concept="2OqwBi" id="2_1mL0eQVX0" role="3clFbG">
              <node concept="10M0yZ" id="2_1mL0eQVX1" role="2Oq$k0">
                <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
                <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              </node>
              <node concept="liA8E" id="2_1mL0eQVX2" role="2OqNvi">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="2_1mL0eQVX3" role="37wK5m">
                  <property role="Xl_RC" value="hello" />
                </node>
              </node>
            </node>
            <node concept="LIFWc" id="4ntxqTCF9Qu" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="2" />
              <property role="p6zMs" value="2" />
              <property role="LIFWd" value="LEFT_COMMENT_ANCHOR" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eQVXa" role="LiZbd">
      <node concept="3clFbS" id="2_1mL0eQVXb" role="9aQI4">
        <node concept="3clFbF" id="2_1mL0eQVXh" role="3cqZAp">
          <node concept="2OqwBi" id="2_1mL0eQVXi" role="3clFbG">
            <node concept="10M0yZ" id="2_1mL0eQVXj" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <node concept="LIFWc" id="1uAcxHxlfCR" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="0" />
                <property role="p6zMs" value="0" />
                <property role="LIFWd" value="ReferencePresentation_ji2wba_a0a0a" />
              </node>
            </node>
            <node concept="liA8E" id="2_1mL0eQVXk" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="2_1mL0eQVXl" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2_1mL0eQWjc">
    <property role="TrG5h" value="Uncomment_NodeByDelete" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2_1mL0eQWjd" role="LjaKd">
      <node concept="2HxZob" id="2_1mL0eQWje" role="3cqZAp">
        <node concept="1iFQzN" id="2_1mL0eQWjf" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eQWjg" role="LiRBU">
      <node concept="3clFbS" id="2_1mL0eQWjh" role="9aQI4">
        <node concept="3clFbF" id="2_1mL0eQWjj" role="3cqZAp">
          <node concept="2OqwBi" id="2_1mL0eQWjk" role="3clFbG">
            <node concept="10M0yZ" id="2_1mL0eQWjl" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="1X3_iC" id="2_1mL0eQWrB" role="lGtFl">
              <property role="3V$3am" value="operation" />
              <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1197027756228/1197027833540" />
              <node concept="liA8E" id="2_1mL0eQWjm" role="8Wnug">
                <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
                <node concept="Xl_RD" id="2_1mL0eQWjn" role="37wK5m">
                  <property role="Xl_RC" value="hello" />
                </node>
                <node concept="LIFWc" id="2_1mL0eQWzP" role="lGtFl">
                  <property role="LIFWa" value="1" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="1" />
                  <property role="p6zMs" value="1" />
                  <property role="LIFWd" value="LEFT_COMMENT_ANCHOR" />
                </node>
              </node>
            </node>
            <node concept="2OqG4A" id="2_1mL0eQWrC" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2_1mL0eQWjp" role="LiZbd">
      <node concept="3clFbS" id="2_1mL0eQWjq" role="9aQI4">
        <node concept="3clFbF" id="2_1mL0eQWjr" role="3cqZAp">
          <node concept="2OqwBi" id="2_1mL0eQWjs" role="3clFbG">
            <node concept="10M0yZ" id="2_1mL0eQWjt" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="2_1mL0eQWjv" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String):void" resolve="println" />
              <node concept="Xl_RD" id="2_1mL0eQWjw" role="37wK5m">
                <property role="Xl_RC" value="hello" />
              </node>
              <node concept="LIFWc" id="2_1mL0eQWHC" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="0" />
                <property role="p6zMs" value="0" />
                <property role="LIFWd" value="property_name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1trYAieiYBp">
    <property role="TrG5h" value="Comment_DeleteSingleRoleWholeComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1trYAieiYBq" role="LjaKd">
      <node concept="3clFbF" id="1NNq35AvZdR" role="3cqZAp">
        <node concept="2YIFZM" id="1NNq35AvZdS" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="1NNq35AvZdT" role="37wK5m">
            <node concept="3clFbS" id="1NNq35AvZdU" role="1bW5cS">
              <node concept="2HxZob" id="1NNq35AvZdV" role="3cqZAp">
                <node concept="1iFQzN" id="1NNq35AvZdW" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="1NNq35AvZdX" role="37wK5m">
            <property role="3clFbU" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAieiYBt" role="LiRBU">
      <node concept="3clFbS" id="1trYAieiYBu" role="9aQI4">
        <node concept="3cpWs6" id="1trYAieiYY6" role="3cqZAp">
          <node concept="1X3_iC" id="1trYAieiYYW" role="lGtFl">
            <property role="3V$3am" value="expression" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068581242878/1068581517676" />
            <node concept="10M0yZ" id="1trYAieiYYh" role="8Wnug">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <node concept="LIFWc" id="1trYAieiZ4s" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="LIFWd" value="Collection_ji2wba_a" />
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="1trYAieiYZ2" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAieiYBL" role="LiZbd">
      <node concept="3clFbS" id="1trYAieiYBM" role="9aQI4">
        <node concept="3cpWs6" id="1trYAieiZ3q" role="3cqZAp">
          <node concept="3clFbT" id="1trYAieiZ3u" role="3cqZAk">
            <property role="3clFbU" value="true" />
            <node concept="LIFWc" id="6WiZwiNSrEp" role="lGtFl">
              <property role="LIFWa" value="0" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="0" />
              <property role="p6zMs" value="0" />
              <property role="LIFWd" value="property_value" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1trYAieiZ0Y">
    <property role="TrG5h" value="Comment_DeleteSingleRoleNodeInsideComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1trYAieiZ0Z" role="LjaKd">
      <node concept="3clFbF" id="1NNq35AvZba" role="3cqZAp">
        <node concept="2YIFZM" id="1NNq35AvZbb" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="1NNq35AvZbc" role="37wK5m">
            <node concept="3clFbS" id="1NNq35AvZbd" role="1bW5cS">
              <node concept="2HxZob" id="1NNq35AvZbe" role="3cqZAp">
                <node concept="1iFQzN" id="1NNq35AvZbf" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="1NNq35AvZbg" role="37wK5m">
            <property role="3clFbU" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAieiZ12" role="LiRBU">
      <node concept="3clFbS" id="1trYAieiZ13" role="9aQI4">
        <node concept="3cpWs6" id="1trYAieiZ14" role="3cqZAp">
          <node concept="1X3_iC" id="1trYAieiZ15" role="lGtFl">
            <property role="3V$3am" value="expression" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068581242878/1068581517676" />
            <node concept="10M0yZ" id="1trYAieiZ16" role="8Wnug">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="LIFWc" id="1trYAieiZ6J" role="lGtFl">
              <property role="LIFWa" value="0" />
              <property role="LIFWd" value="Collection_si1ien_a" />
            </node>
          </node>
          <node concept="3clFbT" id="1trYAieiZ17" role="3cqZAk">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAieiZ18" role="LiZbd">
      <node concept="3clFbS" id="1trYAieiZ19" role="9aQI4">
        <node concept="3cpWs6" id="1trYAieiZ4Y" role="3cqZAp">
          <node concept="3clFbT" id="1trYAieiZ51" role="3cqZAk">
            <property role="3clFbU" value="true" />
            <node concept="LIFWc" id="6WiZwiNSrDr" role="lGtFl">
              <property role="LIFWa" value="0" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="0" />
              <property role="p6zMs" value="0" />
              <property role="LIFWd" value="property_value" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1trYAiej1Cf">
    <property role="TrG5h" value="Comment_DeleteMultipleRoleNodeInsideComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1trYAiej1Cg" role="LjaKd">
      <node concept="3clFbF" id="1NNq35AvYYF" role="3cqZAp">
        <node concept="2YIFZM" id="1NNq35AvYZG" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="1NNq35AvZ0G" role="37wK5m">
            <node concept="3clFbS" id="1NNq35AvZ0H" role="1bW5cS">
              <node concept="2HxZob" id="1trYAiej1Ch" role="3cqZAp">
                <node concept="1iFQzN" id="1trYAiej1Ci" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="1NNq35AvZ4e" role="37wK5m">
            <property role="3clFbU" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAiej1Cj" role="LiRBU">
      <node concept="3clFbS" id="1trYAiej1Ck" role="9aQI4">
        <node concept="3clFbF" id="1trYAiej1MC" role="3cqZAp">
          <node concept="2OqwBi" id="1trYAiej1M_" role="3clFbG">
            <node concept="10M0yZ" id="1trYAiej1MA" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="1trYAiej1MB" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              <node concept="3cmrfG" id="1trYAiej1N9" role="37wK5m">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="1X3_iC" id="1trYAiej7GQ" role="lGtFl">
                <property role="3V$3am" value="actualArgument" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1204053956946/1068499141038" />
                <node concept="3VsKOn" id="1trYAiej7Gi" role="8Wnug">
                  <ref role="3VsUkX" to="wyt6:~System" resolve="System" />
                  <node concept="LIFWc" id="1trYAiej7N$" role="lGtFl">
                    <property role="LIFWa" value="0" />
                    <property role="LIFWd" value="Collection_ejwutq_a" />
                  </node>
                </node>
              </node>
              <node concept="3cmrfG" id="1trYAiej1NH" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAiej1Cq" role="LiZbd">
      <node concept="3clFbS" id="1trYAiej1Cr" role="9aQI4">
        <node concept="3clFbF" id="1trYAiej7K0" role="3cqZAp">
          <node concept="2OqwBi" id="1trYAiej7K1" role="3clFbG">
            <node concept="10M0yZ" id="1trYAiej7K2" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="1trYAiej7K3" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              <node concept="3cmrfG" id="1trYAiej7K4" role="37wK5m">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="3cmrfG" id="1trYAiej7K8" role="37wK5m">
                <property role="3cmrfH" value="3" />
                <node concept="LIFWc" id="6WiZwiNSrzR" role="lGtFl">
                  <property role="LIFWa" value="0" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="0" />
                  <property role="p6zMs" value="0" />
                  <property role="LIFWd" value="property_value" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="1trYAiej7PL">
    <property role="TrG5h" value="Comment_DeleteMultipleRoleWholeComment" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="1trYAiej7PM" role="LjaKd">
      <node concept="3clFbF" id="1NNq35AvZ7N" role="3cqZAp">
        <node concept="2YIFZM" id="1NNq35AvZ7O" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="1NNq35AvZ7P" role="37wK5m">
            <node concept="3clFbS" id="1NNq35AvZ7Q" role="1bW5cS">
              <node concept="2HxZob" id="1NNq35AvZ7R" role="3cqZAp">
                <node concept="1iFQzN" id="1NNq35AvZ7S" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="1NNq35AvZ7T" role="37wK5m">
            <property role="3clFbU" value="false" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAiej7PP" role="LiRBU">
      <node concept="3clFbS" id="1trYAiej7PQ" role="9aQI4">
        <node concept="3clFbF" id="1trYAiej7PR" role="3cqZAp">
          <node concept="2OqwBi" id="1trYAiej7PS" role="3clFbG">
            <node concept="10M0yZ" id="1trYAiej7PT" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="1trYAiej7PU" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              <node concept="3cmrfG" id="1trYAiej7PV" role="37wK5m">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="1X3_iC" id="1trYAiej7PW" role="lGtFl">
                <property role="3V$3am" value="actualArgument" />
                <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1204053956946/1068499141038" />
                <node concept="3VsKOn" id="1trYAiej7PX" role="8Wnug">
                  <ref role="3VsUkX" to="wyt6:~System" resolve="System" />
                  <node concept="LIFWc" id="1trYAiej7RI" role="lGtFl">
                    <property role="LIFWa" value="0" />
                    <property role="LIFWd" value="Collection_vav8l6_a" />
                  </node>
                </node>
              </node>
              <node concept="3cmrfG" id="1trYAiej7PZ" role="37wK5m">
                <property role="3cmrfH" value="3" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="1trYAiej7Q0" role="LiZbd">
      <node concept="3clFbS" id="1trYAiej7Q1" role="9aQI4">
        <node concept="3clFbF" id="1trYAiej7Q2" role="3cqZAp">
          <node concept="2OqwBi" id="1trYAiej7Q3" role="3clFbG">
            <node concept="10M0yZ" id="1trYAiej7Q4" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="1trYAiej7Q5" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println():void" resolve="println" />
              <node concept="3cmrfG" id="1trYAiej7Q6" role="37wK5m">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="3cmrfG" id="1trYAiej7Q7" role="37wK5m">
                <property role="3cmrfH" value="3" />
                <node concept="LIFWc" id="6WiZwiNSrBO" role="lGtFl">
                  <property role="LIFWa" value="0" />
                  <property role="OXtK3" value="true" />
                  <property role="p6zMq" value="0" />
                  <property role="p6zMs" value="0" />
                  <property role="LIFWd" value="property_value" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="6oHcphdGvWw">
    <property role="TrG5h" value="Comment_LocalVariableDeclarationStatement" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="6oHcphdGvWx" role="LjaKd">
      <node concept="2HxZob" id="6oHcphdGvWy" role="3cqZAp">
        <node concept="1iFQzN" id="6oHcphdGvWz" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="312cEu" id="6oHcphdGvW$" role="LiRBU">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="6oHcphdGvW_" role="jymVt" />
      <node concept="3clFb_" id="6oHcphdGvWA" role="jymVt">
        <property role="TrG5h" value="abc" />
        <node concept="3cqZAl" id="6oHcphdGvWB" role="3clF45" />
        <node concept="3Tm1VV" id="6oHcphdGvWC" role="1B3o_S" />
        <node concept="3clFbS" id="6oHcphdGvWD" role="3clF47">
          <node concept="3cpWs8" id="6oHcphdGw2c" role="3cqZAp">
            <node concept="3cpWsn" id="6oHcphdGw2f" role="3cpWs9">
              <property role="TrG5h" value="a" />
              <node concept="10Oyi0" id="6oHcphdGw2b" role="1tU5fm" />
              <node concept="LIFWc" id="6oHcphdGw2B" role="lGtFl">
                <property role="LIFWa" value="0" />
                <property role="LIFWd" value="Collection_i0gfbw_a" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6oHcphdGvWJ" role="1B3o_S" />
    </node>
    <node concept="312cEu" id="6oHcphdGvWK" role="LiZbd">
      <property role="2bfB8j" value="true" />
      <property role="TrG5h" value="aaa" />
      <node concept="2tJIrI" id="6oHcphdGvWL" role="jymVt" />
      <node concept="3clFb_" id="6oHcphdGvWM" role="jymVt">
        <property role="TrG5h" value="abc" />
        <node concept="3cqZAl" id="6oHcphdGvWN" role="3clF45" />
        <node concept="3Tm1VV" id="6oHcphdGvWO" role="1B3o_S" />
        <node concept="3clFbS" id="6oHcphdGvWP" role="3clF47">
          <node concept="1X3_iC" id="6oHcphdHSfr" role="lGtFl">
            <property role="3V$3am" value="statement" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123136/1068581517665" />
            <node concept="3cpWs8" id="6oHcphdGw6P" role="8Wnug">
              <node concept="3cpWsn" id="6oHcphdGw6S" role="3cpWs9">
                <property role="TrG5h" value="a" />
                <node concept="10Oyi0" id="6oHcphdGw6O" role="1tU5fm" />
                <node concept="LIFWc" id="6oHcphdHSfM" role="lGtFl">
                  <property role="LIFWa" value="0" />
                  <property role="LIFWd" value="Collection_i0gfbw_a" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6oHcphdGvWW" role="1B3o_S" />
    </node>
  </node>
  <node concept="LiM7Y" id="2wB1LSHYorJ">
    <property role="TrG5h" value="Comment_CatchBlock" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2wB1LSHYorK" role="LjaKd">
      <node concept="2HxZob" id="2wB1LSHYorL" role="3cqZAp">
        <node concept="1iFQzN" id="2wB1LSHYorM" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2wB1LSHYorN" role="LiRBU">
      <node concept="3clFbS" id="2wB1LSHYorO" role="9aQI4">
        <node concept="SfApY" id="2wB1LSHYo$i" role="3cqZAp">
          <node concept="TDmWw" id="2wB1LSHYo$j" role="TEbGg">
            <node concept="3cpWsn" id="2wB1LSHYo$k" role="TDEfY">
              <property role="TrG5h" value="e" />
              <node concept="3uibUv" id="2wB1LSHYoOr" role="1tU5fm">
                <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
              </node>
            </node>
            <node concept="3clFbS" id="2wB1LSHYo$m" role="TDEfX" />
            <node concept="LIFWc" id="2wB1LSHYt08" role="lGtFl">
              <property role="LIFWa" value="1" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="Constant_5rb7wh_a0" />
            </node>
          </node>
          <node concept="3clFbS" id="2wB1LSHYo$n" role="SfCbr" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2wB1LSHYorW" role="LiZbd">
      <node concept="3clFbS" id="2wB1LSHYorX" role="9aQI4">
        <node concept="SfApY" id="2wB1LSHYsZh" role="3cqZAp">
          <node concept="3clFbS" id="2wB1LSHYsZm" role="SfCbr" />
          <node concept="1X3_iC" id="2wB1LSHYt0X" role="lGtFl">
            <property role="3V$3am" value="catchClause" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1164879751025/1164903496223" />
            <node concept="TDmWw" id="2wB1LSHYsZi" role="8Wnug">
              <node concept="3cpWsn" id="2wB1LSHYsZj" role="TDEfY">
                <property role="TrG5h" value="e" />
                <node concept="3uibUv" id="2wB1LSHYsZk" role="1tU5fm">
                  <ref role="3uigEE" to="wyt6:~Exception" resolve="Exception" />
                </node>
              </node>
              <node concept="3clFbS" id="2wB1LSHYsZl" role="TDEfX" />
              <node concept="LIFWc" id="2wB1LSHYt1a" role="lGtFl">
                <property role="LIFWa" value="1" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="1" />
                <property role="p6zMs" value="1" />
                <property role="LIFWd" value="Constant_5rb7wh_a0" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2wB1LSHYr7P">
    <property role="TrG5h" value="Comment_IfCondition" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2wB1LSHYr7Q" role="LjaKd">
      <node concept="2HxZob" id="2wB1LSHYr7R" role="3cqZAp">
        <node concept="1iFQzN" id="2wB1LSHYr7S" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2wB1LSHYr7T" role="LiRBU">
      <node concept="3clFbS" id="2wB1LSHYr7U" role="9aQI4">
        <node concept="3clFbJ" id="2wB1LSHYr7V" role="3cqZAp">
          <node concept="3clFbS" id="2wB1LSHYr7W" role="3clFbx" />
          <node concept="3clFbT" id="2wB1LSHYr7X" role="3clFbw">
            <property role="3clFbU" value="true" />
            <node concept="LIFWc" id="2wB1LSHYrKb" role="lGtFl">
              <property role="LIFWa" value="3" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="3" />
              <property role="p6zMs" value="3" />
              <property role="LIFWd" value="property_value" />
            </node>
          </node>
          <node concept="3eNFk2" id="2wB1LSHYr7Y" role="3eNLev">
            <node concept="3clFbT" id="2wB1LSHYr7Z" role="3eO9$A">
              <property role="3clFbU" value="false" />
            </node>
            <node concept="3clFbS" id="2wB1LSHYr80" role="3eOfB_" />
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2wB1LSHYr82" role="LiZbd">
      <node concept="3clFbS" id="2wB1LSHYr83" role="9aQI4">
        <node concept="3clFbJ" id="2wB1LSHYr84" role="3cqZAp">
          <node concept="3clFbS" id="2wB1LSHYr85" role="3clFbx" />
          <node concept="3eNFk2" id="2wB1LSHYr88" role="3eNLev">
            <node concept="3clFbT" id="2wB1LSHYr89" role="3eO9$A">
              <property role="3clFbU" value="false" />
            </node>
            <node concept="3clFbS" id="2wB1LSHYr8a" role="3eOfB_" />
          </node>
          <node concept="1X3_iC" id="2wB1LSHYt1k" role="lGtFl">
            <property role="3V$3am" value="condition" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068580123159/1068580123160" />
            <node concept="3clFbT" id="2wB1LSHYr86" role="8Wnug">
              <property role="3clFbU" value="true" />
              <node concept="LIFWc" id="2wB1LSHYrKP" role="lGtFl">
                <property role="LIFWa" value="3" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="3" />
                <property role="p6zMs" value="3" />
                <property role="LIFWd" value="property_value" />
              </node>
            </node>
          </node>
          <node concept="33vP2n" id="2wB1LSHYt1l" role="3clFbw" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2wB1LSHYrLJ">
    <property role="TrG5h" value="Comment_ForCondition" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2wB1LSHYrLK" role="LjaKd">
      <node concept="2HxZob" id="2wB1LSHYrLL" role="3cqZAp">
        <node concept="1iFQzN" id="2wB1LSHYrLM" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2wB1LSHYrLN" role="LiRBU">
      <node concept="3clFbS" id="2wB1LSHYrLO" role="9aQI4">
        <node concept="1Dw8fO" id="2wB1LSHYsfQ" role="3cqZAp">
          <node concept="3cpWsn" id="2wB1LSHYsfR" role="1Duv9x">
            <property role="TrG5h" value="i" />
            <node concept="10Oyi0" id="2wB1LSHYsjW" role="1tU5fm" />
            <node concept="3cmrfG" id="2wB1LSHYskf" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
          <node concept="3clFbS" id="2wB1LSHYsfS" role="2LFqv$" />
          <node concept="2dkUwp" id="2wB1LSHYsua" role="1Dwp0S">
            <node concept="3cmrfG" id="2wB1LSHYsuh" role="3uHU7w">
              <property role="3cmrfH" value="1" />
            </node>
            <node concept="37vLTw" id="2wB1LSHYsko" role="3uHU7B">
              <ref role="3cqZAo" node="2wB1LSHYsfR" resolve="i" />
            </node>
            <node concept="LIFWc" id="2wB1LSHYsSk" role="lGtFl">
              <property role="LIFWa" value="1" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="1" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
            </node>
          </node>
          <node concept="3uNrnE" id="2wB1LSHYsCK" role="1Dwrff">
            <node concept="37vLTw" id="2wB1LSHYsCM" role="2$L3a6">
              <ref role="3cqZAo" node="2wB1LSHYsfR" resolve="i" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="2wB1LSHYrLV" role="LiZbd">
      <node concept="3clFbS" id="2wB1LSHYrLW" role="9aQI4">
        <node concept="1Dw8fO" id="2wB1LSHYsTD" role="3cqZAp">
          <node concept="3cpWsn" id="2wB1LSHYsTE" role="1Duv9x">
            <property role="TrG5h" value="i" />
            <node concept="10Oyi0" id="2wB1LSHYsTF" role="1tU5fm" />
            <node concept="3cmrfG" id="2wB1LSHYsTG" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
          <node concept="3clFbS" id="2wB1LSHYsTH" role="2LFqv$" />
          <node concept="3uNrnE" id="2wB1LSHYsTM" role="1Dwrff">
            <node concept="37vLTw" id="2wB1LSHYsTN" role="2$L3a6">
              <ref role="3cqZAo" node="2wB1LSHYsTE" resolve="i" />
            </node>
          </node>
          <node concept="1X3_iC" id="2wB1LSHYsXG" role="lGtFl">
            <property role="3V$3am" value="condition" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1144231330558/1144231399730" />
            <node concept="2dkUwp" id="2wB1LSHYsTI" role="8Wnug">
              <node concept="3cmrfG" id="2wB1LSHYsTJ" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="37vLTw" id="2wB1LSHYsTK" role="3uHU7B">
                <ref role="3cqZAo" node="2wB1LSHYsTE" resolve="i" />
              </node>
              <node concept="LIFWc" id="2wB1LSHYsXS" role="lGtFl">
                <property role="LIFWa" value="1" />
                <property role="OXtK3" value="true" />
                <property role="p6zMq" value="1" />
                <property role="p6zMs" value="1" />
                <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2wB1LSHYt1y">
    <property role="TrG5h" value="Comment_Visibility" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2wB1LSHYt1z" role="LjaKd">
      <node concept="2HxZob" id="2wB1LSHYt1$" role="3cqZAp">
        <node concept="1iFQzN" id="2wB1LSHYt1_" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2wB1LSHYt28" role="LiRBU">
      <property role="TrG5h" value="abc" />
      <node concept="3cqZAl" id="2wB1LSHYt2a" role="3clF45" />
      <node concept="3clFbS" id="2wB1LSHYt2c" role="3clF47" />
      <node concept="3Tm1VV" id="2wB1LSHYt2b" role="1B3o_S">
        <node concept="LIFWc" id="2wB1LSHYt2D" role="lGtFl">
          <property role="LIFWa" value="2" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="2" />
          <property role="p6zMs" value="2" />
          <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2wB1LSHYt2s" role="LiZbd">
      <property role="TrG5h" value="abc" />
      <node concept="3cqZAl" id="2wB1LSHYt2t" role="3clF45" />
      <node concept="3clFbS" id="2wB1LSHYt2u" role="3clF47" />
      <node concept="1X3_iC" id="2wB1LSHYt2F" role="lGtFl">
        <property role="3V$3am" value="visibility" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1178549954367/1178549979242" />
        <node concept="3Tm1VV" id="2wB1LSHYt2v" role="8Wnug">
          <node concept="LIFWc" id="2wB1LSHYt2J" role="lGtFl">
            <property role="LIFWa" value="2" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="2" />
            <property role="p6zMs" value="2" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2wB1LSHYtnS">
    <property role="TrG5h" value="Uncomment_Visibility" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="2wB1LSHYtnT" role="LjaKd">
      <node concept="2HxZob" id="2wB1LSHYtnU" role="3cqZAp">
        <node concept="1iFQzN" id="2wB1LSHYtnV" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2wB1LSHYtnW" role="LiRBU">
      <property role="TrG5h" value="abc" />
      <node concept="3cqZAl" id="2wB1LSHYtnX" role="3clF45" />
      <node concept="3clFbS" id="2wB1LSHYtnY" role="3clF47" />
      <node concept="1X3_iC" id="2wB1LSHYto7" role="lGtFl">
        <property role="3V$3am" value="visibility" />
        <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1178549954367/1178549979242" />
        <node concept="3Tm1VV" id="2wB1LSHYtnZ" role="8Wnug">
          <node concept="LIFWc" id="2wB1LSHYtod" role="lGtFl">
            <property role="LIFWa" value="2" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="6" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFb_" id="2wB1LSHYto1" role="LiZbd">
      <property role="TrG5h" value="abc" />
      <node concept="3cqZAl" id="2wB1LSHYto2" role="3clF45" />
      <node concept="3clFbS" id="2wB1LSHYto3" role="3clF47" />
      <node concept="3Tm1VV" id="2wB1LSHYto5" role="1B3o_S">
        <node concept="LIFWc" id="2wB1LSHYtoh" role="lGtFl">
          <property role="LIFWa" value="2" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="6" />
          <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="6PSwRUj7o0m">
    <property role="TrG5h" value="Comment_ReturnExpression_NoEmptyCell" />
    <property role="3GE5qa" value="comment" />
    <node concept="3clFbS" id="6PSwRUj7o0n" role="LjaKd">
      <node concept="2HxZob" id="6PSwRUj7o0o" role="3cqZAp">
        <node concept="1iFQzN" id="6PSwRUj7o0p" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:4yOeMfyP6wh" resolve="Comment" />
        </node>
      </node>
      <node concept="2HxZob" id="6PSwRUj7oyJ" role="3cqZAp">
        <node concept="1iFQzN" id="6PSwRUj7oyK" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:R3$tg1aBNW" resolve="MoveRight" />
        </node>
      </node>
      <node concept="2HxZob" id="6PSwRUj7oyP" role="3cqZAp">
        <node concept="1iFQzN" id="6PSwRUj7oyQ" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:R3$tg1aBNW" resolve="MoveRight" />
        </node>
      </node>
      <node concept="2HxZob" id="6PSwRUj7oyX" role="3cqZAp">
        <node concept="1iFQzN" id="6PSwRUj7oyY" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:R3$tg1aBNW" resolve="MoveRight" />
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="6PSwRUj7o0q" role="LiRBU">
      <node concept="3clFbS" id="6PSwRUj7o0r" role="9aQI4">
        <node concept="3cpWs6" id="6PSwRUj7oxL" role="3cqZAp">
          <node concept="3cmrfG" id="6PSwRUj7oxV" role="3cqZAk">
            <property role="3cmrfH" value="1" />
            <node concept="LIFWc" id="6PSwRUj7oyA" role="lGtFl">
              <property role="ZRATv" value="true" />
              <property role="OXtK3" value="true" />
              <property role="p6zMq" value="0" />
              <property role="p6zMs" value="1" />
              <property role="LIFWd" value="property_value" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="9aQIb" id="6PSwRUj7o0z" role="LiZbd">
      <node concept="3clFbS" id="6PSwRUj7o0$" role="9aQI4">
        <node concept="3cpWs6" id="6PSwRUj7orI" role="3cqZAp">
          <node concept="1X3_iC" id="6PSwRUj7ot3" role="lGtFl">
            <property role="3V$3am" value="expression" />
            <property role="3V$3ak" value="f3061a53-9226-4cc5-a443-f952ceaf5816/1068581242878/1068581517676" />
            <node concept="3cmrfG" id="6PSwRUj7orT" role="8Wnug">
              <property role="3cmrfH" value="1" />
            </node>
          </node>
          <node concept="LIFWc" id="6PSwRUj7otI" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_evgwyu_c0" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2wtgzyWe$4X">
    <property role="TrG5h" value="Subst_SingleChild_OnlyBooleanProperty_with_Another" />
    <property role="3GE5qa" value="substitute" />
    <node concept="2XtntR" id="2wtgzyWe$4Y" role="LiRBU">
      <node concept="2Xtn7H" id="2wtgzyWe$5_" role="2Xtn4J">
        <property role="2XtjmT" value="true" />
        <node concept="LIFWc" id="2wtgzyWe$5N" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="property_myProperty" />
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="2wtgzyWe$50" role="LiZbd">
      <node concept="2Xtn5I" id="2wtgzyWe$5S" role="2Xtn4J">
        <node concept="LIFWc" id="2wtgzyWe$5U" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="2" />
          <property role="p6zMs" value="2" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="2wtgzyWe$53" role="LjaKd">
      <node concept="2TK7Tu" id="2wtgzyWe$56" role="3cqZAp">
        <property role="2TTd_B" value="v1" />
      </node>
      <node concept="2HxZob" id="2wtgzyWe$54" role="3cqZAp">
        <node concept="1iFQzN" id="2wtgzyWe$55" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:2XByp9s_j7f" resolve="Complete" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="76t$LiKqFxu">
    <property role="TrG5h" value="Subst_SingleChild_WithNonEmptyCell_Insert" />
    <property role="3GE5qa" value="substitute" />
    <node concept="2XtntR" id="76t$LiKqFxv" role="LiRBU">
      <node concept="LIFWc" id="76t$LiKqFxw" role="lGtFl">
        <property role="LIFWa" value="0" />
        <property role="LIFWd" value="Collection_3mh94b_a1c0" />
      </node>
    </node>
    <node concept="2XtntR" id="76t$LiKqFxx" role="LiZbd">
      <node concept="2Xtn5I" id="76t$LiKqFxy" role="2k9tHz">
        <property role="2XtIjI" value="v2" />
        <node concept="LIFWc" id="76t$LiKqFxz" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="2" />
          <property role="p6zMs" value="2" />
          <property role="LIFWd" value="property_myEnumProperty" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="76t$LiKqFx$" role="LjaKd">
      <node concept="2HxZob" id="76t$LiKqFx_" role="3cqZAp">
        <node concept="1iFQzN" id="76t$LiKqFxA" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:6KwcZ1G3Pjm" resolve="Insert" />
        </node>
      </node>
      <node concept="2TK7Tu" id="76t$LiKqHJD" role="3cqZAp">
        <property role="2TTd_B" value="v2" />
      </node>
      <node concept="3clFbH" id="76t$LiKqHJ_" role="3cqZAp" />
    </node>
  </node>
  <node concept="LiM7Y" id="53lOj_WYosa">
    <property role="3GE5qa" value="substitute" />
    <property role="TrG5h" value="SubstituteAttributeChild" />
    <property role="3YCmrE" value="MPS-24551 Wrong menu shown for an empty child cell in an Attribute" />
    <node concept="2ZSn_i" id="53lOj_WYBTy" role="LiRBU">
      <node concept="2ZSnTG" id="53lOj_WYU$i" role="lGtFl">
        <node concept="LIFWc" id="53lOj_WZ8Fz" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_children" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="53lOj_WZ8Mh" role="LjaKd">
      <node concept="2TK7Tu" id="53lOj_WZjKq" role="3cqZAp">
        <property role="2TTd_B" value="child" />
      </node>
    </node>
    <node concept="2ZSn_i" id="53lOj_WZk7a" role="LiZbd">
      <node concept="2ZSnTG" id="53lOj_WZk7b" role="lGtFl">
        <node concept="GbBLD" id="53lOj_WZAZ3" role="2ZSnUD">
          <node concept="LIFWc" id="53lOj_WZAZl" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="5" />
            <property role="p6zMs" value="5" />
            <property role="LIFWd" value="ALIAS_EDITOR_COMPONENT" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="woUdQL2L8h">
    <property role="TrG5h" value="Subst_Child_WithNextEditorAndMenu" />
    <property role="3GE5qa" value="substitute" />
    <property role="3YCmrE" value="this test reproduces the MPS-24114" />
    <node concept="2XtntR" id="woUdQL2L8i" role="LiRBU">
      <node concept="2T4CB3" id="woUdQL2La$" role="2T4CBL">
        <property role="2T4C$k" value="property" />
        <node concept="LIFWc" id="woUdQL2Ld7" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="property_property" />
        </node>
      </node>
    </node>
    <node concept="2XtntR" id="woUdQL2L8k" role="LiZbd">
      <node concept="2T4ZHd" id="woUdQL3ElQ" role="2T4CBL">
        <node concept="LIFWc" id="woUdQL3EKC" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="44" />
          <property role="p6zMs" value="44" />
          <property role="LIFWd" value="Constant_jfnkan_a" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="woUdQL2L8n" role="LjaKd">
      <node concept="2HxZob" id="woUdQL2L8o" role="3cqZAp">
        <node concept="1iFQzN" id="woUdQL2L8p" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:2XByp9s_j7f" resolve="Complete" />
        </node>
      </node>
      <node concept="3vwNmj" id="woUdQL2X6G" role="3cqZAp">
        <node concept="1Wc70l" id="woUdQL309f" role="3vwVQn">
          <node concept="3clFbC" id="woUdQL34yi" role="3uHU7w">
            <node concept="3cmrfG" id="woUdQL34yx" role="3uHU7w">
              <property role="3cmrfH" value="1" />
            </node>
            <node concept="2OqwBi" id="woUdQL33dk" role="3uHU7B">
              <node concept="2OqwBi" id="woUdQL30Nh" role="2Oq$k0">
                <node concept="369mXd" id="woUdQL30c$" role="2Oq$k0" />
                <node concept="liA8E" id="woUdQL3349" role="2OqNvi">
                  <ref role="37wK5l" to="exr9:~EditorComponent.getNodeSubstituteChooser():jetbrains.mps.nodeEditor.cellMenu.NodeSubstituteChooser" resolve="getNodeSubstituteChooser" />
                </node>
              </node>
              <node concept="liA8E" id="woUdQL33xw" role="2OqNvi">
                <ref role="37wK5l" to="6lvu:~NodeSubstituteChooser.getNumberOfActions():int" resolve="getNumberOfActions" />
              </node>
            </node>
          </node>
          <node concept="2OqwBi" id="woUdQL2ZJZ" role="3uHU7B">
            <node concept="2OqwBi" id="woUdQL2Y8H" role="2Oq$k0">
              <node concept="369mXd" id="woUdQL2X6X" role="2Oq$k0" />
              <node concept="liA8E" id="woUdQL2ZDD" role="2OqNvi">
                <ref role="37wK5l" to="exr9:~EditorComponent.getNodeSubstituteChooser():jetbrains.mps.nodeEditor.cellMenu.NodeSubstituteChooser" resolve="getNodeSubstituteChooser" />
              </node>
            </node>
            <node concept="liA8E" id="woUdQL2ZUy" role="2OqNvi">
              <ref role="37wK5l" to="6lvu:~NodeSubstituteChooser.isVisible():boolean" resolve="isVisible" />
            </node>
          </node>
        </node>
      </node>
      <node concept="yd1bK" id="woUdQL35xS" role="3cqZAp">
        <node concept="pLAjd" id="woUdQL35xU" role="yd6KS">
          <property role="pLAjf" value="VK_ENTER" />
        </node>
      </node>
      <node concept="3clFbH" id="woUdQL2L8r" role="3cqZAp" />
    </node>
  </node>
  <node concept="LiM7Y" id="2znOOs7hhAL">
    <property role="TrG5h" value="DelOnInterfaceChild1ReplaceItWithLinkTarget" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 and it is instance of link target concept then pressing &quot;del&quot; by-default should invoke &quot;del&quot; on parent node" />
    <node concept="1QLem1" id="2znOOs7hhAM" role="LiRBU">
      <node concept="1QM1Tp" id="2znOOs7hhAN" role="1QLepd">
        <node concept="1QM1wW" id="2znOOs7hhAO" role="1QM1y8" />
        <node concept="J_cM9" id="2znOOs7hEG_" role="J_cMe">
          <node concept="LIFWc" id="2znOOs7hO1z" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="33" />
            <property role="p6zMs" value="33" />
            <property role="LIFWd" value="Constant_88198k_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="2znOOs7hhAR" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIct0D" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIct0E" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIct0F" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIct0G" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIct0H" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIct0I" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIct0J" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="2znOOs7hhAU" role="LiZbd">
      <node concept="1QM1Tp" id="2znOOs7hhAV" role="1QLepd">
        <node concept="1QM1wW" id="2znOOs7hhAW" role="1QM1y8" />
        <node concept="J_cMa" id="2znOOs7hEHl" role="J_cMe">
          <node concept="LIFWc" id="2znOOs7hO1P" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="24" />
            <property role="p6zMs" value="24" />
            <property role="LIFWd" value="Constant_7e556a_a0" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2znOOs7gM1Z">
    <property role="TrG5h" value="DelOnInterfaceChild1DeleteParent" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 and it is instance of link target concept then pressing &quot;del&quot; by-default should invoke &quot;del&quot; on parent node" />
    <node concept="1QLem1" id="2znOOs7gM20" role="LiRBU">
      <node concept="1QM1Tp" id="2znOOs7gM21" role="1QLepd">
        <node concept="1QM1wW" id="2znOOs7gM22" role="1QM1y8" />
        <node concept="J_cMa" id="2znOOs7hhEW" role="J_cMe">
          <node concept="LIFWc" id="2znOOs7hM0r" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="24" />
            <property role="p6zMs" value="24" />
            <property role="LIFWd" value="Constant_7e556a_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="2znOOs7gM24" role="LiZbd">
      <node concept="LIFWc" id="2znOOs7gM25" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_container" />
      </node>
    </node>
    <node concept="3clFbS" id="2znOOs7gM26" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIcsY4" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIcsY5" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIcsY6" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIcsY7" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIcsY8" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIcsY9" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIcsYa" role="37wK5m" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4EQk8IqQDni">
    <property role="TrG5h" value="DelOnSpecialChild1DeleteParent" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 and it is instance of link target concept then pressing &quot;del&quot; by-default should invoke &quot;del&quot; on parent node" />
    <node concept="1QLem1" id="4EQk8IqQDnj" role="LiRBU">
      <node concept="3grck5" id="4EQk8IqQF5Y" role="1QLepd">
        <node concept="3grck6" id="4EQk8IqQNsJ" role="1QM1y8">
          <node concept="LIFWc" id="7v1E5MvycIP" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="22" />
            <property role="p6zMs" value="22" />
            <property role="LIFWd" value="Constant_456nmv_a" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="4EQk8IqQDnp" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIct3e" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIct3f" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIct3g" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIct3h" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIct3i" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIct3j" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIct3k" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="4EQk8IqQNtv" role="LiZbd">
      <node concept="LIFWc" id="4EQk8IqQNu9" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_container" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="4EQk8IqQNuj">
    <property role="TrG5h" value="DelOnSpecialChild1ReplaceItWithLinkTarget" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 then it should be replaced by link target concept in pressing &quot;del&quot; by-default" />
    <node concept="1QLem1" id="4EQk8IqQNuo" role="LiZbd">
      <node concept="3grck5" id="4EQk8IqQVMP" role="1QLepd">
        <node concept="3grck6" id="4EQk8IqQVN5" role="1QM1y8">
          <node concept="LIFWc" id="4EQk8IqQVNo" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="22" />
            <property role="p6zMs" value="22" />
            <property role="LIFWd" value="Constant_456nmv_a" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="4EQk8IqQNus" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIct5N" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIct5O" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIct5P" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIct5Q" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIct5R" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIct5S" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIct5T" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="4EQk8IqQNuR" role="LiRBU">
      <node concept="3grck5" id="4EQk8IqQNuS" role="1QLepd">
        <node concept="3grmtc" id="4EQk8IqQVL_" role="1QM1y8">
          <node concept="LIFWc" id="7v1E5MvycJV" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="23" />
            <property role="p6zMs" value="23" />
            <property role="LIFWd" value="Constant_366jy5_a0" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2znOOs7hwPx">
    <property role="TrG5h" value="DelOnSpecialInterfaceChild1ReplaceItWithLinkTarget" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 then it should be replaced by link target concept in pressing &quot;del&quot; by-default" />
    <node concept="1QLem1" id="2znOOs7hwPy" role="LiZbd">
      <node concept="3grck5" id="2znOOs7hwPz" role="1QLepd">
        <node concept="3grck6" id="2znOOs7hwP$" role="1QM1y8" />
        <node concept="J$D8w" id="2znOOs7hyJK" role="J_cMe">
          <node concept="LIFWc" id="2znOOs7hO2x" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="32" />
            <property role="p6zMs" value="32" />
            <property role="LIFWd" value="Constant_phlcy6_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="2znOOs7hwPA" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIctaX" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIctaY" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIctaZ" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIctb0" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIctb1" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIctb2" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIctb3" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="2znOOs7hwPD" role="LiRBU">
      <node concept="3grck5" id="2znOOs7hwPE" role="1QLepd">
        <node concept="J$D8H" id="2znOOs7hyII" role="J_cMe">
          <node concept="LIFWc" id="2znOOs7hyJ1" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="33" />
            <property role="p6zMs" value="33" />
            <property role="LIFWd" value="Constant_3obdup_a0" />
          </node>
        </node>
        <node concept="3grck6" id="2znOOs7hAIv" role="1QM1y8" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="2znOOs7hk9D">
    <property role="TrG5h" value="DelOnSpecialInterfaceChild1DeleteParent" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="If child node is contained within a link with cardinality 1 and it is instance of link target concept then pressing &quot;del&quot; by-default should invoke &quot;del&quot; on parent node" />
    <node concept="1QLem1" id="2znOOs7hk9E" role="LiRBU">
      <node concept="3grck5" id="2znOOs7hk9F" role="1QLepd">
        <node concept="3grck6" id="2znOOs7hk9G" role="1QM1y8" />
        <node concept="J$D8w" id="2znOOs7huQF" role="J_cMe">
          <node concept="LIFWc" id="2znOOs7hO2f" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="32" />
            <property role="p6zMs" value="32" />
            <property role="LIFWd" value="Constant_phlcy6_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="2znOOs7hk9I" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIct8o" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIct8p" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIct8q" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIct8r" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIct8s" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIct8t" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIct8u" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="1QLem1" id="2znOOs7hk9L" role="LiZbd">
      <node concept="LIFWc" id="2znOOs7huSm" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_container" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="VO5i9DBkaP">
    <property role="TrG5h" value="DelWrapperChild" />
    <property role="3GE5qa" value="delete" />
    <property role="3YCmrE" value="nothing should happen and no exception should be thrown. Added for MPS-23505" />
    <node concept="3clFbS" id="VO5i9DBkaW" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIctdy" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIctdz" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIctd$" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIctd_" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIctdA" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIctdB" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIctdC" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="1Bq5y6" id="VO5i9DBkbT" role="LiRBU">
      <node concept="1Bq5y5" id="VO5i9DBkc3" role="1Bq5yh">
        <node concept="LIFWc" id="VO5i9DBkcl" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="20" />
          <property role="LIFWd" value="constant_0" />
        </node>
      </node>
    </node>
    <node concept="1Bq5y6" id="VO5i9DBkcv" role="LiZbd">
      <node concept="1Bq5y5" id="VO5i9DBkcw" role="1Bq5yh">
        <node concept="LIFWc" id="VO5i9DBkcx" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="20" />
          <property role="LIFWd" value="constant_0" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtI7Cjo">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteSingleOptional" />
    <node concept="3clFbS" id="14TMHtI7Cjp" role="LjaKd">
      <node concept="3clFbF" id="14TMHtI7Cjq" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtI7Cjr" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtI7Cjs" role="37wK5m">
            <node concept="3clFbS" id="14TMHtI7Cjt" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtI7Cju" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7Cjv" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtI7Cjw" role="3cqZAp">
                <node concept="2YIFZM" id="14TMHtI7Cjx" role="3vwVQn">
                  <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                  <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                  <node concept="2OqwBi" id="14TMHtI7Cjy" role="37wK5m">
                    <node concept="369mXd" id="14TMHtI7Cjz" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtI7Cj$" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="14TMHtI7Cj_" role="37wK5m">
                    <node concept="369mXd" id="14TMHtI7CjA" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtI7CjB" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSelectedNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtI7CjC" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7CjD" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtI7CjE" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7CjF" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7CjG" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7CjH" role="1Z8EMj" />
        <node concept="3TLO2u" id="14TMHtI7CjI" role="1Z8EMl">
          <node concept="LIFWc" id="14TMHtI7CjJ" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="29" />
            <property role="p6zMs" value="29" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7CjK" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7CjL" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7CjM" role="1Z8EMj" />
        <node concept="LIFWc" id="14TMHtI7CjN" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_singleOptionalChild" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtI7CPr">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteSingleRequired" />
    <node concept="3clFbS" id="14TMHtI7CPs" role="LjaKd">
      <node concept="3clFbF" id="14TMHtI7CPt" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtI7CPu" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtI7CPv" role="37wK5m">
            <node concept="3clFbS" id="14TMHtI7CPw" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtI7CPx" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7CPy" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3clFbF" id="14TMHtI9mau" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtI9mav" role="3clFbG">
                  <node concept="2OqwBi" id="14TMHtI9maw" role="2Oq$k0">
                    <node concept="2OqwBi" id="14TMHtI9max" role="2Oq$k0">
                      <node concept="2OqwBi" id="14TMHtI9may" role="2Oq$k0">
                        <node concept="369mXd" id="14TMHtI9maz" role="2Oq$k0" />
                        <node concept="liA8E" id="14TMHtI9ma$" role="2OqNvi">
                          <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                        </node>
                      </node>
                      <node concept="liA8E" id="14TMHtI9ma_" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorContext.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                      </node>
                    </node>
                    <node concept="liA8E" id="14TMHtI9maA" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~SRepository.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtI9maB" role="2OqNvi">
                    <ref role="37wK5l" to="lui2:~ModelAccess.runReadAction(java.lang.Runnable):void" resolve="runReadAction" />
                    <node concept="1bVj0M" id="14TMHtI9maC" role="37wK5m">
                      <node concept="3clFbS" id="14TMHtI9maD" role="1bW5cS">
                        <node concept="3vwNmj" id="14TMHtI9maE" role="3cqZAp">
                          <node concept="2YIFZM" id="14TMHtI9maF" role="3vwVQn">
                            <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                            <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                            <node concept="2OqwBi" id="14TMHtI9maG" role="37wK5m">
                              <node concept="369mXd" id="14TMHtI9maH" role="2Oq$k0" />
                              <node concept="liA8E" id="14TMHtI9maI" role="2OqNvi">
                                <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                              </node>
                            </node>
                            <node concept="3xONca" id="14TMHtI9maJ" role="37wK5m">
                              <ref role="3xOPvv" node="14TMHtI9uOE" resolve="container" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtI7CPF" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7CPG" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtI7CPH" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7CPI" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7CPJ" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7CPK" role="1Z8EMj">
          <node concept="LIFWc" id="14TMHtI7CPL" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="29" />
            <property role="p6zMs" value="29" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
        <node concept="3xLA65" id="14TMHtI9uOE" role="lGtFl">
          <property role="TrG5h" value="container" />
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7CPM" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="LIFWc" id="14TMHtI7CPN" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_container" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtI7D1k">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteMultiple" />
    <node concept="3clFbS" id="14TMHtI7D1l" role="LjaKd">
      <node concept="3clFbF" id="14TMHtI7D1m" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtI7D1n" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtI7D1o" role="37wK5m">
            <node concept="3clFbS" id="14TMHtI7D1p" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtI7D1q" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7D1r" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtI7D1s" role="3cqZAp">
                <node concept="2YIFZM" id="14TMHtI7D1t" role="3vwVQn">
                  <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                  <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                  <node concept="2OqwBi" id="14TMHtI7D1u" role="37wK5m">
                    <node concept="369mXd" id="14TMHtI7D1v" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtI7D1w" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="14TMHtI7D1x" role="37wK5m">
                    <node concept="369mXd" id="14TMHtI7D1y" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtI7D1z" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSelectedNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtI7D1$" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7D1_" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtI7D1A" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7D1B" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7D1C" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7Ddg" role="1Z8EMg">
          <property role="TrG5h" value="prev" />
        </node>
        <node concept="3TLO2u" id="14TMHtI7Ddq" role="1Z8EMg">
          <node concept="LIFWc" id="14TMHtI7DgQ" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="29" />
            <property role="p6zMs" value="29" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtI7D1D" role="1Z8EMj" />
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7Dh8" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7Dh9" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7Dha" role="1Z8EMg">
          <property role="TrG5h" value="prev" />
          <node concept="LIFWc" id="14TMHtIg9G2" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_sgb24n_c0" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtI7Dhd" role="1Z8EMj" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtI7Uae">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteMultipleWholeSelected" />
    <node concept="3clFbS" id="14TMHtI7Uaf" role="LjaKd">
      <node concept="3clFbF" id="14TMHtI7Uag" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtI7Uah" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtI7Uai" role="37wK5m">
            <node concept="3clFbS" id="14TMHtI7Uaj" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtI7Uak" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7Ual" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtI7Uam" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7Uan" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7Uao" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7Uap" role="1Z8EMg">
          <property role="TrG5h" value="prev" />
        </node>
        <node concept="3TLO2u" id="14TMHtI7Uaq" role="1Z8EMg">
          <node concept="LIFWc" id="14TMHtIgikL" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="LIFWd" value="Collection_sgb24n_a" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtI7Uas" role="1Z8EMj" />
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7Uat" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7Uau" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7Uav" role="1Z8EMg">
          <property role="TrG5h" value="prev" />
          <node concept="LIFWc" id="14TMHtIgijG" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_sgb24n_c0" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtI7Uax" role="1Z8EMj" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtI7Ue9">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteSingleOptionalWholeSelected" />
    <node concept="3clFbS" id="14TMHtI7Uea" role="LjaKd">
      <node concept="3clFbF" id="14TMHtI7Ueb" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtI7Uec" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtI7Ued" role="37wK5m">
            <node concept="3clFbS" id="14TMHtI7Uee" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtI7Uef" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7Ueg" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtI7Ueh" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7Uei" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7Uej" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7Uek" role="1Z8EMj" />
        <node concept="3TLO2u" id="14TMHtI7Uel" role="1Z8EMl">
          <node concept="LIFWc" id="14TMHtIgilS" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="LIFWd" value="Collection_sgb24n_a" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7Uen" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7Ueo" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7Uep" role="1Z8EMj" />
        <node concept="LIFWc" id="14TMHtI7Ueq" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_singleOptionalChild" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtI7Uh9">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteSingleRequiredWholeSelected" />
    <node concept="3clFbS" id="14TMHtI7Uha" role="LjaKd">
      <node concept="3clFbF" id="14TMHtI7Uhb" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtI7Uhc" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtI7Uhd" role="37wK5m">
            <node concept="3clFbS" id="14TMHtI7Uhe" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtI7Uhf" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7Uhg" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3clFbF" id="14TMHtI9mB7" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtI9mB8" role="3clFbG">
                  <node concept="2OqwBi" id="14TMHtI9mB9" role="2Oq$k0">
                    <node concept="2OqwBi" id="14TMHtI9mBa" role="2Oq$k0">
                      <node concept="2OqwBi" id="14TMHtI9mBb" role="2Oq$k0">
                        <node concept="369mXd" id="14TMHtI9mBc" role="2Oq$k0" />
                        <node concept="liA8E" id="14TMHtI9mBd" role="2OqNvi">
                          <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                        </node>
                      </node>
                      <node concept="liA8E" id="14TMHtI9mBe" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorContext.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                      </node>
                    </node>
                    <node concept="liA8E" id="14TMHtI9mBf" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~SRepository.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtI9mBg" role="2OqNvi">
                    <ref role="37wK5l" to="lui2:~ModelAccess.runReadAction(java.lang.Runnable):void" resolve="runReadAction" />
                    <node concept="1bVj0M" id="14TMHtI9mBh" role="37wK5m">
                      <node concept="3clFbS" id="14TMHtI9mBi" role="1bW5cS">
                        <node concept="3vwNmj" id="14TMHtI9mBj" role="3cqZAp">
                          <node concept="2YIFZM" id="14TMHtI9mBk" role="3vwVQn">
                            <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                            <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                            <node concept="2OqwBi" id="14TMHtI9mBl" role="37wK5m">
                              <node concept="369mXd" id="14TMHtI9mBm" role="2Oq$k0" />
                              <node concept="liA8E" id="14TMHtI9mBn" role="2OqNvi">
                                <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                              </node>
                            </node>
                            <node concept="3xONca" id="14TMHtI9x6t" role="37wK5m">
                              <ref role="3xOPvv" node="14TMHtI9v6M" resolve="container" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtI7Uhp" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI7Uhq" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtI7Uhr" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7Uhs" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI7Uht" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI7Uhu" role="1Z8EMj">
          <node concept="LIFWc" id="14TMHtI7Uhv" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="29" />
            <property role="p6zMs" value="29" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
        <node concept="3xLA65" id="14TMHtI9v6M" role="lGtFl">
          <property role="TrG5h" value="container" />
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI7Uhw" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="LIFWc" id="14TMHtI7Uhx" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_container" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtI9VLz">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteLabelPartiallySelected" />
    <node concept="3clFbS" id="14TMHtI9VL$" role="LjaKd">
      <node concept="3clFbF" id="14TMHtI9VL_" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtI9VLA" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtI9VLB" role="37wK5m">
            <node concept="3clFbS" id="14TMHtI9VLC" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtI9VLD" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI9VLE" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtI9VLF" role="3cqZAp">
                <node concept="2YIFZM" id="14TMHtI9VLG" role="3vwVQn">
                  <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                  <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                  <node concept="2OqwBi" id="14TMHtI9VLH" role="37wK5m">
                    <node concept="369mXd" id="14TMHtI9VLI" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtI9VLJ" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="14TMHtI9VLK" role="37wK5m">
                    <node concept="369mXd" id="14TMHtI9VLL" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtI9VLM" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSelectedNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtI9VLN" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtI9VLO" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtI9VLP" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI9VLQ" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI9VLR" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI9VLS" role="1Z8EMj" />
        <node concept="1Z7Oq1" id="14TMHtIab1H" role="1Z7Oq6">
          <node concept="LIFWc" id="14TMHtIabiN" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="3" />
            <property role="LIFWd" value="Constant_djyyps_a" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtI9VLV" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtI9VLW" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtI9VLX" role="1Z8EMj" />
        <node concept="LIFWc" id="14TMHtIbBKT" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_labelChild" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIabmo">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteLabelWholeSelected" />
    <node concept="3clFbS" id="14TMHtIabmp" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIabmq" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIabmr" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIabms" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIabmt" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIabmu" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIabmv" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIabmE" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIabmF" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIabmG" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIabmH" role="1Z8EMj" />
        <node concept="1Z7Oq1" id="14TMHtIabmI" role="1Z7Oq6">
          <node concept="LIFWc" id="14TMHtIabCk" role="lGtFl">
            <property role="LIFWa" value="2" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="5" />
            <property role="LIFWd" value="Constant_djyyps_a" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIabmK" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIabmL" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIabmM" role="1Z8EMj" />
        <node concept="LIFWc" id="14TMHtIbBOV" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_labelChild" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIaqTA">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteCollectionNotCoveringSelected" />
    <node concept="3clFbS" id="14TMHtIaqTB" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIaqTC" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIaqTD" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIaqTE" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIaqTF" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIaqTG" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIaqTH" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtIaqTI" role="3cqZAp">
                <node concept="2YIFZM" id="14TMHtIaqTJ" role="3vwVQn">
                  <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                  <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                  <node concept="2OqwBi" id="14TMHtIaqTK" role="37wK5m">
                    <node concept="369mXd" id="14TMHtIaqTL" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtIaqTM" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="14TMHtIaqTN" role="37wK5m">
                    <node concept="369mXd" id="14TMHtIaqTO" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtIaqTP" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSelectedNode" />
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtIaqTQ" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIaqTR" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIaqTS" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIaqTT" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIaqTU" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIaqTV" role="1Z8EMj" />
        <node concept="1Z4n1h" id="14TMHtIaEM9" role="1Z4n1n">
          <node concept="LIFWc" id="14TMHtIaRLj" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="LIFWd" value="Collection_hqlgg9_a0a" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIaqTY" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIaqTZ" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIaqU0" role="1Z8EMj" />
        <node concept="LIFWc" id="14TMHtIaROI" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_cellCollectionChild" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIaROS">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteCollectionCoveringSelected" />
    <property role="3YCmrE" value="the selected collection cell is not big cell, but it covers the whole node, so the node should be deleted immediately" />
    <node concept="3clFbS" id="14TMHtIaROT" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIaROU" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIaROV" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIaROW" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIaROX" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIaROY" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIaROZ" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIaRPa" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIaRPb" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIaRPc" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIaRPd" role="1Z8EMj" />
        <node concept="1Z4n1h" id="14TMHtIaRPe" role="1Z4n1n">
          <node concept="LIFWc" id="14TMHtIc2A9" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="LIFWd" value="coveringCollection" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIaRPg" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIaRPh" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIaRPi" role="1Z8EMj" />
        <node concept="LIFWc" id="14TMHtIbkai" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_cellCollectionChild" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIdnr6">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteCustomCellId" />
    <node concept="3clFbS" id="14TMHtIdnr7" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIdnr8" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIdnr9" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIdnra" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIdnrb" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIdnrc" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdnrd" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtIdD3s" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtIdFSY" role="3vwVQn">
                  <node concept="2OqwBi" id="14TMHtIdDy3" role="2Oq$k0">
                    <node concept="369mXd" id="14TMHtIdD4t" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtIdFNp" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getDeletionApprover():jetbrains.mps.openapi.editor.DeletionApprover" resolve="getDeletionApprover" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtIdG1v" role="2OqNvi">
                    <ref role="37wK5l" to="cj4x:~DeletionApprover.isApprovedForDeletion(jetbrains.mps.openapi.editor.cells.EditorCell):boolean" resolve="isApprovedForDeletion" />
                    <node concept="2OqwBi" id="14TMHtIdGyJ" role="37wK5m">
                      <node concept="369mXd" id="14TMHtIdG3A" role="2Oq$k0" />
                      <node concept="liA8E" id="14TMHtIdIPK" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedCell():jetbrains.mps.openapi.editor.cells.EditorCell" resolve="getSelectedCell" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtIdIRY" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdIRZ" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIdnre" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdnrf" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdny9" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <node concept="LIFWc" id="14TMHtIdn$b" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="customId" />
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdnyj" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdnyk" role="3TLDEQ">
        <property role="1Z2AyC" value="false" />
        <property role="1Z2x19" value="true" />
        <node concept="LIFWc" id="14TMHtIdCUd" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="stringId" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIdIVu">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteStringCellId" />
    <node concept="3clFbS" id="14TMHtIdIVv" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIdIVw" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIdIVx" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIdIVy" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIdIVz" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIdIV$" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdIV_" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtIdIVA" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtIdIVB" role="3vwVQn">
                  <node concept="2OqwBi" id="14TMHtIdIVC" role="2Oq$k0">
                    <node concept="369mXd" id="14TMHtIdIVD" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtIdIVE" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getDeletionApprover():jetbrains.mps.openapi.editor.DeletionApprover" resolve="getDeletionApprover" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtIdIVF" role="2OqNvi">
                    <ref role="37wK5l" to="cj4x:~DeletionApprover.isApprovedForDeletion(jetbrains.mps.openapi.editor.cells.EditorCell):boolean" resolve="isApprovedForDeletion" />
                    <node concept="2OqwBi" id="14TMHtIdIVG" role="37wK5m">
                      <node concept="369mXd" id="14TMHtIdIVH" role="2Oq$k0" />
                      <node concept="liA8E" id="14TMHtIdIVI" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedCell():jetbrains.mps.openapi.editor.cells.EditorCell" resolve="getSelectedCell" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtIdIVJ" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdIVK" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIdIVL" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdIVM" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdIVN" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <node concept="LIFWc" id="14TMHtIdJ65" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="stringId" />
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdIVP" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdIVQ" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="false" />
        <node concept="LIFWc" id="14TMHtIdJ8G" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="customId" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIdJ8Q">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteStringProperty" />
    <node concept="3clFbS" id="14TMHtIdJ8R" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIdJ8S" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIdJ8T" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIdJ8U" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIdJ8V" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIdJ8W" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdJ8X" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtIdJ8Y" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtIdJ8Z" role="3vwVQn">
                  <node concept="2OqwBi" id="14TMHtIdJ90" role="2Oq$k0">
                    <node concept="369mXd" id="14TMHtIdJ91" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtIdJ92" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getDeletionApprover():jetbrains.mps.openapi.editor.DeletionApprover" resolve="getDeletionApprover" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtIdJ93" role="2OqNvi">
                    <ref role="37wK5l" to="cj4x:~DeletionApprover.isApprovedForDeletion(jetbrains.mps.openapi.editor.cells.EditorCell):boolean" resolve="isApprovedForDeletion" />
                    <node concept="2OqwBi" id="14TMHtIdJ94" role="37wK5m">
                      <node concept="369mXd" id="14TMHtIdJ95" role="2Oq$k0" />
                      <node concept="liA8E" id="14TMHtIdJ96" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedCell():jetbrains.mps.openapi.editor.cells.EditorCell" resolve="getSelectedCell" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtIdJ97" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdJ98" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIdJ99" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdJ9a" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdJ9b" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <property role="1Z2zSI" value="stringProperty" />
        <node concept="LIFWc" id="14TMHtIdJhn" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="14" />
          <property role="p6zMs" value="14" />
          <property role="LIFWd" value="property_stringProperty" />
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdJ9d" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdJ9e" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <property role="1Z2zSI" value="" />
        <node concept="LIFWc" id="14TMHtIdJkA" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="property_stringProperty" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIdJkK">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteChildFromParent" />
    <node concept="3clFbS" id="14TMHtIdJkL" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIdJkM" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIdJkN" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIdJkO" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIdJkP" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIdJkQ" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdJkR" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3clFbF" id="14TMHtIdXW2" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtIdXW3" role="3clFbG">
                  <node concept="2OqwBi" id="14TMHtIdXW4" role="2Oq$k0">
                    <node concept="2OqwBi" id="14TMHtIdXW5" role="2Oq$k0">
                      <node concept="2OqwBi" id="14TMHtIdXW6" role="2Oq$k0">
                        <node concept="369mXd" id="14TMHtIdXW7" role="2Oq$k0" />
                        <node concept="liA8E" id="14TMHtIdXW8" role="2OqNvi">
                          <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                        </node>
                      </node>
                      <node concept="liA8E" id="14TMHtIdXW9" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorContext.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                      </node>
                    </node>
                    <node concept="liA8E" id="14TMHtIdXWa" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~SRepository.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtIdXWb" role="2OqNvi">
                    <ref role="37wK5l" to="lui2:~ModelAccess.runReadAction(java.lang.Runnable):void" resolve="runReadAction" />
                    <node concept="1bVj0M" id="14TMHtIdXWc" role="37wK5m">
                      <node concept="3clFbS" id="14TMHtIdXWd" role="1bW5cS">
                        <node concept="3vwNmj" id="14TMHtIdXWe" role="3cqZAp">
                          <node concept="2YIFZM" id="14TMHtIdXWf" role="3vwVQn">
                            <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                            <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                            <node concept="2OqwBi" id="14TMHtIdXWg" role="37wK5m">
                              <node concept="369mXd" id="14TMHtIdXWh" role="2Oq$k0" />
                              <node concept="liA8E" id="14TMHtIdXWi" role="2OqNvi">
                                <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                              </node>
                            </node>
                            <node concept="3xONca" id="14TMHtIeS6A" role="37wK5m">
                              <ref role="3xOPvv" node="14TMHtIeS0N" resolve="child" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtIdJl1" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdJl2" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIdJl3" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdJl4" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIeRUT" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <property role="1Z2zSI" value="string" />
        <node concept="1Z2Axm" id="14TMHtIeRV4" role="1Z2Axf">
          <node concept="3xLA65" id="14TMHtIeS0N" role="lGtFl">
            <property role="TrG5h" value="child" />
          </node>
        </node>
        <node concept="LIFWc" id="14TMHtIeS6y" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_jshiyh_a5a" />
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdJl7" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdJl8" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <property role="1Z2zSI" value="string" />
        <node concept="LIFWc" id="14TMHtIdXHg" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_jshiyh_a5a" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIdYaF">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteUnexistingCellId" />
    <property role="3YCmrE" value="since cell to approve for deletion was not found, delete child immediately" />
    <node concept="3clFbS" id="14TMHtIdYaG" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIdYaH" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIdYaI" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIdYaJ" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIdYaK" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIdYb5" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIdYb6" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIdYb7" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdYb8" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdYb9" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <property role="1Z2zSI" value="" />
        <node concept="1Z2Axm" id="14TMHtIdYba" role="1Z2Axf">
          <node concept="3xLA65" id="14TMHtIdYbb" role="lGtFl">
            <property role="TrG5h" value="child" />
          </node>
        </node>
        <node concept="LIFWc" id="14TMHtIdZ9W" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_jshiyh_b5a" />
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIdYbd" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLO2B" id="14TMHtIdYbe" role="3TLDEQ">
        <property role="1Z2AyC" value="true" />
        <property role="1Z2x19" value="true" />
        <property role="1Z2zSI" value="" />
        <node concept="LIFWc" id="14TMHtIdZfP" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_jshiyh_b5a" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIfgkj">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepBackspacePreviousChild" />
    <node concept="3clFbS" id="14TMHtIfgkk" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIfgkl" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIfgkm" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIfgkn" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIfgko" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIfgkp" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIfgkq" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg86S0x" resolve="Backspace" />
                </node>
              </node>
              <node concept="3clFbF" id="14TMHtIfDio" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtIfDip" role="3clFbG">
                  <node concept="2OqwBi" id="14TMHtIfDiq" role="2Oq$k0">
                    <node concept="2OqwBi" id="14TMHtIfDir" role="2Oq$k0">
                      <node concept="2OqwBi" id="14TMHtIfDis" role="2Oq$k0">
                        <node concept="369mXd" id="14TMHtIfDit" role="2Oq$k0" />
                        <node concept="liA8E" id="14TMHtIfDiu" role="2OqNvi">
                          <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                        </node>
                      </node>
                      <node concept="liA8E" id="14TMHtIfDiv" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorContext.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                      </node>
                    </node>
                    <node concept="liA8E" id="14TMHtIfDiw" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~SRepository.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtIfDix" role="2OqNvi">
                    <ref role="37wK5l" to="lui2:~ModelAccess.runReadAction(java.lang.Runnable):void" resolve="runReadAction" />
                    <node concept="1bVj0M" id="14TMHtIfDiy" role="37wK5m">
                      <node concept="3clFbS" id="14TMHtIfDiz" role="1bW5cS">
                        <node concept="3vwNmj" id="14TMHtIfDi$" role="3cqZAp">
                          <node concept="2YIFZM" id="14TMHtIfDi_" role="3vwVQn">
                            <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                            <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                            <node concept="2OqwBi" id="14TMHtIfDiA" role="37wK5m">
                              <node concept="369mXd" id="14TMHtIfDiB" role="2Oq$k0" />
                              <node concept="liA8E" id="14TMHtIfDiC" role="2OqNvi">
                                <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                              </node>
                            </node>
                            <node concept="3xONca" id="14TMHtIfDrB" role="37wK5m">
                              <ref role="3xOPvv" node="14TMHtIfgM1" resolve="previous" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtIfDHM" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIfDHN" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg86S0x" resolve="Backspace" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIfgk_" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIfgkA" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIfgkB" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIfgkC" role="1Z8EMg">
          <property role="TrG5h" value="prev" />
          <node concept="3xLA65" id="14TMHtIfgM1" role="lGtFl">
            <property role="TrG5h" value="previous" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtIfgkD" role="1Z8EMg">
          <property role="TrG5h" value="current" />
          <node concept="LIFWc" id="14TMHtIfgIA" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtIfgkF" role="1Z8EMj" />
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIfgkG" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIfgkH" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIfCTr" role="1Z8EMg">
          <property role="TrG5h" value="current" />
          <node concept="LIFWc" id="14TMHtIfCXj" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtIfgkK" role="1Z8EMj" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="14TMHtIfDxN">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepBackspaceDelete" />
    <node concept="3clFbS" id="14TMHtIfDxO" role="LjaKd">
      <node concept="3clFbF" id="14TMHtIfDxP" role="3cqZAp">
        <node concept="2YIFZM" id="14TMHtIfDxQ" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="14TMHtIfDxR" role="37wK5m">
            <node concept="3clFbS" id="14TMHtIfDxS" role="1bW5cS">
              <node concept="2HxZob" id="14TMHtIfDxT" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIfDxU" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg86S0x" resolve="Backspace" />
                </node>
              </node>
              <node concept="3clFbF" id="14TMHtIfDxV" role="3cqZAp">
                <node concept="2OqwBi" id="14TMHtIfDxW" role="3clFbG">
                  <node concept="2OqwBi" id="14TMHtIfDxX" role="2Oq$k0">
                    <node concept="2OqwBi" id="14TMHtIfDxY" role="2Oq$k0">
                      <node concept="2OqwBi" id="14TMHtIfDxZ" role="2Oq$k0">
                        <node concept="369mXd" id="14TMHtIfDy0" role="2Oq$k0" />
                        <node concept="liA8E" id="14TMHtIfDy1" role="2OqNvi">
                          <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                        </node>
                      </node>
                      <node concept="liA8E" id="14TMHtIfDy2" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorContext.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                      </node>
                    </node>
                    <node concept="liA8E" id="14TMHtIfDy3" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~SRepository.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                    </node>
                  </node>
                  <node concept="liA8E" id="14TMHtIfDy4" role="2OqNvi">
                    <ref role="37wK5l" to="lui2:~ModelAccess.runReadAction(java.lang.Runnable):void" resolve="runReadAction" />
                    <node concept="1bVj0M" id="14TMHtIfDy5" role="37wK5m">
                      <node concept="3clFbS" id="14TMHtIfDy6" role="1bW5cS">
                        <node concept="3vwNmj" id="14TMHtIfDy7" role="3cqZAp">
                          <node concept="2YIFZM" id="14TMHtIfDy8" role="3vwVQn">
                            <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                            <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                            <node concept="2OqwBi" id="14TMHtIfDy9" role="37wK5m">
                              <node concept="369mXd" id="14TMHtIfDya" role="2Oq$k0" />
                              <node concept="liA8E" id="14TMHtIfDyb" role="2OqNvi">
                                <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                              </node>
                            </node>
                            <node concept="3xONca" id="14TMHtIfDyc" role="37wK5m">
                              <ref role="3xOPvv" node="14TMHtIfDyh" resolve="previous" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="14TMHtIfDZn" role="3cqZAp">
                <node concept="1iFQzN" id="14TMHtIfDZo" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg84hwg" resolve="Delete" />
                </node>
              </node>
              <node concept="3vwNmj" id="14TMHtIfEjc" role="3cqZAp">
                <node concept="2YIFZM" id="14TMHtIfEjd" role="3vwVQn">
                  <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                  <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                  <node concept="2OqwBi" id="14TMHtIfEje" role="37wK5m">
                    <node concept="369mXd" id="14TMHtIfEjf" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtIfEjg" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                    </node>
                  </node>
                  <node concept="2OqwBi" id="14TMHtIfFfG" role="37wK5m">
                    <node concept="369mXd" id="14TMHtIfEtz" role="2Oq$k0" />
                    <node concept="liA8E" id="14TMHtIfJVY" role="2OqNvi">
                      <ref role="37wK5l" to="exr9:~EditorComponent.getSelectedNode():org.jetbrains.mps.openapi.model.SNode" resolve="getSelectedNode" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="14TMHtIfDyd" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIfDye" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIfDyf" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIfDyg" role="1Z8EMg">
          <property role="TrG5h" value="prev" />
          <node concept="3xLA65" id="14TMHtIfDyh" role="lGtFl">
            <property role="TrG5h" value="previous" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtIfDyi" role="1Z8EMg">
          <property role="TrG5h" value="current" />
          <node concept="LIFWc" id="14TMHtIfDyj" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtIfDyk" role="1Z8EMj" />
      </node>
    </node>
    <node concept="3TLDEN" id="14TMHtIfDyl" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="14TMHtIfDym" role="3TLDEQ">
        <node concept="3TLO2u" id="14TMHtIfSN_" role="1Z8EMg">
          <property role="TrG5h" value="prev" />
        </node>
        <node concept="3TLO2u" id="14TMHtIfDyn" role="1Z8EMg">
          <property role="TrG5h" value="current" />
          <node concept="LIFWc" id="14TMHtIfDyo" role="lGtFl">
            <property role="LIFWa" value="0" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="Constant_sgb24n_a0" />
          </node>
        </node>
        <node concept="3TLO2u" id="14TMHtIfDyp" role="1Z8EMj" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="26oakFZD$_T">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteChildWithAttributeChildSelected" />
    <node concept="3clFbS" id="26oakFZD$_U" role="LjaKd">
      <node concept="3clFbF" id="26oakFZD$_V" role="3cqZAp">
        <node concept="2YIFZM" id="26oakFZD$_W" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="26oakFZD$_X" role="37wK5m">
            <node concept="3clFbS" id="26oakFZD$_Y" role="1bW5cS">
              <node concept="2HxZob" id="26oakFZD$_Z" role="3cqZAp">
                <node concept="1iFQzN" id="26oakFZD$A0" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg86S0x" resolve="Backspace" />
                </node>
              </node>
              <node concept="3clFbF" id="26oakFZD$A1" role="3cqZAp">
                <node concept="2OqwBi" id="26oakFZD$A2" role="3clFbG">
                  <node concept="2OqwBi" id="26oakFZD$A3" role="2Oq$k0">
                    <node concept="2OqwBi" id="26oakFZD$A4" role="2Oq$k0">
                      <node concept="2OqwBi" id="26oakFZD$A5" role="2Oq$k0">
                        <node concept="369mXd" id="26oakFZD$A6" role="2Oq$k0" />
                        <node concept="liA8E" id="26oakFZD$A7" role="2OqNvi">
                          <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                        </node>
                      </node>
                      <node concept="liA8E" id="26oakFZD$A8" role="2OqNvi">
                        <ref role="37wK5l" to="exr9:~EditorContext.getRepository():org.jetbrains.mps.openapi.module.SRepository" resolve="getRepository" />
                      </node>
                    </node>
                    <node concept="liA8E" id="26oakFZD$A9" role="2OqNvi">
                      <ref role="37wK5l" to="lui2:~SRepository.getModelAccess():org.jetbrains.mps.openapi.module.ModelAccess" resolve="getModelAccess" />
                    </node>
                  </node>
                  <node concept="liA8E" id="26oakFZD$Aa" role="2OqNvi">
                    <ref role="37wK5l" to="lui2:~ModelAccess.runReadAction(java.lang.Runnable):void" resolve="runReadAction" />
                    <node concept="1bVj0M" id="26oakFZD$Ab" role="37wK5m">
                      <node concept="3clFbS" id="26oakFZD$Ac" role="1bW5cS">
                        <node concept="3vwNmj" id="26oakFZD$Ad" role="3cqZAp">
                          <node concept="2YIFZM" id="26oakFZD$Ae" role="3vwVQn">
                            <ref role="37wK5l" to="df4k:~DeletionApproverUtil.isApprovedForDeletion(jetbrains.mps.openapi.editor.EditorContext,org.jetbrains.mps.openapi.model.SNode):boolean" resolve="isApprovedForDeletion" />
                            <ref role="1Pybhc" to="df4k:~DeletionApproverUtil" resolve="DeletionApproverUtil" />
                            <node concept="2OqwBi" id="26oakFZD$Af" role="37wK5m">
                              <node concept="369mXd" id="26oakFZD$Ag" role="2Oq$k0" />
                              <node concept="liA8E" id="26oakFZD$Ah" role="2OqNvi">
                                <ref role="37wK5l" to="exr9:~EditorComponent.getEditorContext():jetbrains.mps.nodeEditor.EditorContext" resolve="getEditorContext" />
                              </node>
                            </node>
                            <node concept="3xONca" id="26oakFZDAo9" role="37wK5m">
                              <ref role="3xOPvv" node="26oakFZDAgh" resolve="attribute" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2HxZob" id="26oakFZD$Aj" role="3cqZAp">
                <node concept="1iFQzN" id="26oakFZD$Ak" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg86S0x" resolve="Backspace" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="26oakFZD$At" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="26oakFZD$Au" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="26oakFZD$Av" role="3TLDEQ">
        <node concept="3TLO2u" id="26oakFZD$A$" role="1Z8EMj" />
        <node concept="3TLO2u" id="26oakFZD_G$" role="3uffyI">
          <node concept="3uffNp" id="26oakFZD_No" role="lGtFl">
            <node concept="3xLA65" id="26oakFZDAgh" role="lGtFl">
              <property role="TrG5h" value="attribute" />
            </node>
          </node>
          <node concept="LIFWc" id="26oakFZD_Uc" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="1" />
            <property role="p6zMs" value="1" />
            <property role="LIFWd" value="Constant_sgb24n_c0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="26oakFZD_Un" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="26oakFZD_Uo" role="3TLDEQ">
        <node concept="3TLO2u" id="26oakFZD_Up" role="1Z8EMj" />
        <node concept="LIFWc" id="26oakFZDA50" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_childWithAttribute" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="26oakFZDI5t">
    <property role="3GE5qa" value="twoStepDelete" />
    <property role="TrG5h" value="TwoStepDeleteChildWithAttributeAttributeSelected" />
    <node concept="3clFbS" id="26oakFZDI5u" role="LjaKd">
      <node concept="3clFbF" id="26oakFZDI5v" role="3cqZAp">
        <node concept="2YIFZM" id="26oakFZDI5w" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="26oakFZDI5x" role="37wK5m">
            <node concept="3clFbS" id="26oakFZDI5y" role="1bW5cS">
              <node concept="2HxZob" id="26oakFZDI5R" role="3cqZAp">
                <node concept="1iFQzN" id="26oakFZDI5S" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:7HPyHg86S0x" resolve="Backspace" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="26oakFZDI5T" role="37wK5m">
            <property role="3clFbU" value="true" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="26oakFZDI5U" role="LiRBU">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="26oakFZDI5V" role="3TLDEQ">
        <node concept="3TLO2u" id="26oakFZDI5W" role="1Z8EMj" />
        <node concept="3TLO2u" id="26oakFZDI5X" role="3uffyI">
          <node concept="3uffNp" id="26oakFZDI5Y" role="lGtFl">
            <node concept="LIFWc" id="26oakFZDI$4" role="lGtFl">
              <property role="LIFWa" value="0" />
              <property role="LIFWd" value="Collection_t38kw9_a" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3TLDEN" id="26oakFZDI61" role="LiZbd">
      <property role="TrG5h" value="root" />
      <node concept="3TLDF6" id="26oakFZDI62" role="3TLDEQ">
        <node concept="3TLO2u" id="26oakFZDI63" role="1Z8EMj" />
        <node concept="LIFWc" id="26oakFZDIHW" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="empty_childWithAttribute" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5X9_bIv8sFy">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderIntoEmptyMultipleCollection" />
    <node concept="30quMj" id="5X9_bIv8sHj" role="LiRBU">
      <node concept="LIFWc" id="5X9_bIv8GbC" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_multipleChildren" />
      </node>
    </node>
    <node concept="30quMj" id="5X9_bIv8Gbm" role="LiZbd">
      <node concept="3DQ70j" id="5X9_bIv8GbE" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="5X9_bIv8GbW" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="5X9_bIv8Gk0" role="LjaKd">
      <node concept="2HxZob" id="5X9_bIv8GjY" role="3cqZAp">
        <node concept="1iFQzN" id="5X9_bIv8Gkc" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5X9_bIv8GkJ">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderAfterChild" />
    <node concept="30quMj" id="5X9_bIv8GkK" role="LiRBU">
      <node concept="30quMi" id="5X9_bIv8VNd" role="30quMn">
        <node concept="LIFWc" id="5X9_bIv9bkh" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="17" />
          <property role="p6zMs" value="17" />
          <property role="LIFWd" value="Constant_rvi6pt_a0" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="5X9_bIv8GkM" role="LiZbd">
      <node concept="30quMi" id="5X9_bIv9bkz" role="30quMn" />
      <node concept="3DQ70j" id="5X9_bIv9bkH" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="5X9_bIv9bkZ" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="5X9_bIv8GkP" role="LjaKd">
      <node concept="2HxZob" id="5X9_bIv8GkQ" role="3cqZAp">
        <node concept="1iFQzN" id="5X9_bIv8GkR" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5X9_bIv9bl9">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderBeforeChild" />
    <node concept="30quMj" id="5X9_bIv9bla" role="LiRBU">
      <node concept="30quMi" id="5X9_bIv9blb" role="30quMn">
        <node concept="LIFWc" id="5X9_bIv9blG" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rvi6pt_a0" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="5X9_bIv9bld" role="LiZbd">
      <node concept="3DQ70j" id="5X9_bIv9blf" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="5X9_bIv9blg" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
      <node concept="30quMi" id="5X9_bIv9ble" role="30quMn" />
    </node>
    <node concept="3clFbS" id="5X9_bIv9blh" role="LjaKd">
      <node concept="2HxZob" id="5X9_bIv9bli" role="3cqZAp">
        <node concept="1iFQzN" id="5X9_bIv9blj" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5X9_bIv9blZ">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="DontInsertPlaceholderIntoSingleChildRole" />
    <node concept="30quMj" id="5X9_bIv9bm0" role="LiRBU">
      <node concept="LIFWc" id="5X9_bIv9boa" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_singleChild" />
      </node>
    </node>
    <node concept="30quMj" id="5X9_bIv9bm3" role="LiZbd">
      <node concept="LIFWc" id="5X9_bIv9boO" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_singleChild" />
      </node>
    </node>
    <node concept="3clFbS" id="5X9_bIv9bm7" role="LjaKd">
      <node concept="2HxZob" id="5X9_bIv9bm8" role="3cqZAp">
        <node concept="1iFQzN" id="5X9_bIv9bm9" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5X9_bIv9boY">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderIntoNonEmptyEmptyMultipleCollectionFromOpeningBrace" />
    <node concept="30quMj" id="5X9_bIv9boZ" role="LiRBU">
      <node concept="LIFWc" id="3TxNEJGZWcc" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="1" />
        <property role="p6zMs" value="1" />
        <property role="LIFWd" value="Constant_9f7nyv_f2a" />
      </node>
    </node>
    <node concept="30quMj" id="5X9_bIv9bp1" role="LiZbd">
      <node concept="3DQ70j" id="3TxNEJGZWbC" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="3TxNEJGZWbU" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="5X9_bIv9bp4" role="LjaKd">
      <node concept="2HxZob" id="5X9_bIv9bp5" role="3cqZAp">
        <node concept="1iFQzN" id="5X9_bIv9bp6" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3TxNEJGZWcE">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderAfterPlaceholder" />
    <node concept="30quMj" id="3TxNEJGZWcF" role="LiRBU">
      <node concept="3DQ70j" id="64sE5JwmNDW" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="64sE5JwmO6D" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="3TxNEJGZWcI" role="LiZbd">
      <node concept="3DQ70j" id="64sE5JwmO6V" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
      </node>
      <node concept="3DQ70j" id="64sE5JwmO75" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="64sE5JwmO7M" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="3TxNEJGZWcM" role="LjaKd">
      <node concept="2HxZob" id="3TxNEJGZWcN" role="3cqZAp">
        <node concept="1iFQzN" id="3TxNEJGZWcO" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="64sE5JwmO7W">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertNodeInsteadOfPlaceholder" />
    <node concept="30quMj" id="64sE5JwmO7X" role="LiRBU">
      <node concept="3DQ70j" id="64sE5JwmO7Y" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="64sE5JwoFZF" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="64sE5JwmO80" role="LiZbd">
      <node concept="3DQ70j" id="64sE5JwoG05" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
      </node>
      <node concept="30quMi" id="64sE5JwmObs" role="30quMn">
        <node concept="LIFWc" id="64sE5JwoG0n" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="17" />
          <property role="p6zMs" value="17" />
          <property role="LIFWd" value="Constant_rvi6pt_a0" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="64sE5JwmO84" role="LjaKd">
      <node concept="2HxZob" id="64sE5JwmO85" role="3cqZAp">
        <node concept="1iFQzN" id="64sE5JwmO86" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:6KwcZ1G3Pjm" resolve="Insert" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="64sE5Jwnba_">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderIntoNonEmptyEmptyMultipleCollectionFromClosingBrace" />
    <node concept="30quMj" id="64sE5JwnbaA" role="LiRBU">
      <node concept="LIFWc" id="64sE5Jwnbbe" role="lGtFl">
        <property role="LIFWa" value="0" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="Constant_9f7nyv_h2a" />
      </node>
    </node>
    <node concept="30quMj" id="64sE5JwnbaC" role="LiZbd">
      <node concept="3DQ70j" id="64sE5JwnbaD" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="64sE5JwnbaE" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="64sE5JwnbaF" role="LjaKd">
      <node concept="2HxZob" id="64sE5JwnbaG" role="3cqZAp">
        <node concept="1iFQzN" id="64sE5JwnbaH" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="64sE5JwpMOF">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertCustomPlaceholder" />
    <node concept="30quMj" id="64sE5JwpMOG" role="LiRBU">
      <node concept="21vXSz" id="64sE5JwpMPI" role="21vXSy">
        <node concept="LIFWc" id="64sE5JwpMQC" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_4nyaat_a" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="64sE5JwpMOJ" role="LiZbd">
      <node concept="21vXSz" id="64sE5JwpMQM" role="21vXSy" />
      <node concept="21vXSz" id="64sE5JwpMQW" role="21vXSy">
        <node concept="LIFWc" id="64sE5JwpMRf" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_4nyaat_a" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="64sE5JwpMON" role="LjaKd">
      <node concept="2HxZob" id="64sE5JwpMOO" role="3cqZAp">
        <node concept="1iFQzN" id="64sE5JwpMOP" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="qmyvdpQ6gY">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="PlaceholderCompletion" />
    <node concept="30quMj" id="qmyvdpQ6gZ" role="LiRBU">
      <node concept="3DQ70j" id="qmyvdpQ6hD" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="qmyvdpQ6hV" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="qmyvdpQ6h2" role="LiZbd">
      <node concept="30quMi" id="qmyvdpQ6h3" role="30quMn">
        <node concept="LIFWc" id="qmyvdpQ6id" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="17" />
          <property role="p6zMs" value="17" />
          <property role="LIFWd" value="Constant_rvi6pt_a0" />
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="qmyvdpQ6h6" role="LjaKd">
      <node concept="2HxZob" id="qmyvdpQ6h7" role="3cqZAp">
        <node concept="1iFQzN" id="qmyvdpQ6h8" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:2XByp9s_j7f" resolve="Complete" />
        </node>
      </node>
      <node concept="yd1bK" id="qmyvdpQ6qz" role="3cqZAp">
        <node concept="pLAjd" id="qmyvdpQ6q_" role="yd6KS">
          <property role="pLAjf" value="VK_ENTER" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3h50PypAFUo">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderAfterCommentedChild" />
    <node concept="30quMj" id="3h50PypAFUp" role="LiRBU">
      <node concept="1X3_iC" id="3h50PypAFVj" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="30quMi" id="3h50PypAFUq" role="8Wnug">
          <node concept="LIFWc" id="3h50PypAFWe" role="lGtFl">
            <property role="LIFWa" value="16" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="16" />
            <property role="p6zMs" value="16" />
            <property role="LIFWd" value="Constant_rvi6pt_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="3h50PypAFUw" role="LjaKd">
      <node concept="2HxZob" id="3h50PypAFUx" role="3cqZAp">
        <node concept="1iFQzN" id="3h50PypAFUy" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="3h50PypAFWo" role="LiZbd">
      <node concept="1X3_iC" id="3h50PypAFWp" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="30quMi" id="3h50PypAFWq" role="8Wnug" />
      </node>
      <node concept="3DQ70j" id="3h50PypB7Hz" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="3h50PypB7ME" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3h50PypAFXL">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="DontInsertPlaceholderIntoSingleCommentedChildRole" />
    <node concept="30quMj" id="3h50PypAFXM" role="LiRBU">
      <node concept="1X3_iC" id="3h50PypAFYz" role="lGtFl">
        <property role="3V$3am" value="singleChild" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532266" />
        <node concept="30quMi" id="3h50PypAFYp" role="8Wnug">
          <node concept="LIFWc" id="3h50PypAFZ5" role="lGtFl">
            <property role="LIFWa" value="15" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="15" />
            <property role="p6zMs" value="15" />
            <property role="LIFWd" value="Constant_rvi6pt_a0" />
          </node>
        </node>
      </node>
      <node concept="3DQ70j" id="3h50PypAFYK" role="lGtFl">
        <property role="3V$3am" value="smodelAttribute" />
        <property role="3V$3ak" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1133920641626/5169995583184591170" />
      </node>
    </node>
    <node concept="3clFbS" id="3h50PypAFXQ" role="LjaKd">
      <node concept="2HxZob" id="3h50PypAFXR" role="3cqZAp">
        <node concept="1iFQzN" id="3h50PypAFXS" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="3h50PypAFZj" role="LiZbd">
      <node concept="1X3_iC" id="3h50PypAFZk" role="lGtFl">
        <property role="3V$3am" value="singleChild" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532266" />
        <node concept="30quMi" id="3h50PypAFZl" role="8Wnug">
          <node concept="LIFWc" id="3h50PypAFZm" role="lGtFl">
            <property role="LIFWa" value="15" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="15" />
            <property role="p6zMs" value="15" />
            <property role="LIFWd" value="Constant_rvi6pt_a0" />
          </node>
        </node>
      </node>
      <node concept="3DQ70j" id="3h50PypAFZn" role="lGtFl">
        <property role="3V$3am" value="smodelAttribute" />
        <property role="3V$3ak" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1133920641626/5169995583184591170" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="3h50PypC2UJ">
    <property role="3GE5qa" value="placeholder" />
    <property role="TrG5h" value="InsertPlaceholderOnAttribute" />
    <node concept="30quMj" id="3h50PypC2UK" role="LiRBU">
      <node concept="30quMi" id="3h50PypC2UM" role="30quMn">
        <node concept="2HQ25p" id="3h50PypC3dO" role="lGtFl">
          <node concept="LIFWc" id="3h50PypC3e_" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="5" />
            <property role="p6zMs" value="5" />
            <property role="LIFWd" value="Constant_wb8d24_a0" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3clFbS" id="3h50PypC2UO" role="LjaKd">
      <node concept="2HxZob" id="3h50PypC2UP" role="3cqZAp">
        <node concept="1iFQzN" id="3h50PypC2UQ" role="3iKnsn">
          <ref role="1iFR8X" to="ekwn:3emwrjqk66J" resolve="InsertPlaceholder" />
        </node>
      </node>
    </node>
    <node concept="30quMj" id="3h50PypC3eB" role="LiZbd">
      <node concept="30quMi" id="3h50PypC3eC" role="30quMn">
        <node concept="2HQ25p" id="3h50PypC3eD" role="lGtFl" />
      </node>
      <node concept="3DQ70j" id="3h50PypC3f9" role="lGtFl">
        <property role="3V$3am" value="multipleChildren" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6866182640452532264/6866182640452532268" />
        <node concept="LIFWc" id="3h50PypC3fr" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_rkx1ed_a0a" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32Ja2iP">
    <property role="TrG5h" value="DeleteLineHorizontalSingleCollection" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Don't delete child in the single collection" />
    <node concept="3clFbS" id="5Q8f32Ja2iQ" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32Ja2iR" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32Ja2iS" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="5Q8f32Ja2iT" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32Ja2iU" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32Ja2iV" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32Ja2iW" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32Ja2iX" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32Ja2iY" role="LiRBU">
      <node concept="3MEHv7" id="5Q8f32JajYM" role="3MEH2_">
        <property role="TrG5h" value="child" />
        <node concept="LIFWc" id="5Q8f32Jak9C" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="5" />
          <property role="p6zMs" value="5" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32Jak7C" role="LiZbd">
      <node concept="3MEHv7" id="5Q8f32Jak7D" role="3MEH2_">
        <property role="TrG5h" value="child" />
        <node concept="LIFWc" id="5Q8f32JakaH" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="5" />
          <property role="p6zMs" value="5" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32Jalyx">
    <property role="TrG5h" value="DeleteLineReadOnlyChild" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Don't delete child by &quot;delete line&quot; if it's big cell is read only" />
    <node concept="3clFbS" id="5Q8f32Jalyy" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32Jalyz" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32Jaly$" role="3clFbG">
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <node concept="1bVj0M" id="5Q8f32Jaly_" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32JalyA" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32JalyB" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32JalyC" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32JalyD" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32JalyE" role="LiRBU">
      <node concept="3MEH5q" id="5Q8f32JalLc" role="3MEH1n">
        <node concept="LIFWc" id="6LNwc8WvpC$" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="32" />
          <property role="p6zMs" value="32" />
          <property role="LIFWd" value="Constant_qk1zkx_a0" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32JalyI" role="LiZbd">
      <node concept="3MEH5q" id="5Q8f32JaEsK" role="3MEH1n">
        <node concept="LIFWc" id="6LNwc8WvpEK" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="32" />
          <property role="p6zMs" value="32" />
          <property role="LIFWd" value="Constant_qk1zkx_a0" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32J9r2C">
    <property role="TrG5h" value="DeleteLineIndentVerticalMultipleCollection" />
    <property role="3GE5qa" value="deleteLine" />
    <node concept="3clFbS" id="5Q8f32J9r2D" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32J9r2E" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32J9r2F" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="5Q8f32J9r2G" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32J9r2H" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32J9r2I" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32J9r2J" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32J9r2K" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J9r2L" role="LiRBU">
      <node concept="3MEHv7" id="5Q8f32J9r2M" role="3MEH04">
        <property role="TrG5h" value="child1" />
        <node concept="LIFWc" id="5Q8f32J9r2N" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="6" />
          <property role="p6zMs" value="6" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
      <node concept="3MEHv7" id="5Q8f32J9r2O" role="3MEH04">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J9r2P" role="LiZbd">
      <node concept="3MEHv7" id="5Q8f32J9r2R" role="3MEH04">
        <property role="TrG5h" value="child2" />
        <node concept="LIFWc" id="5Q8f32J9r2S" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_i2hvs0_a0" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="6LNwc8WAwSg">
    <property role="TrG5h" value="DeleteLineCommentedNode" />
    <property role="3GE5qa" value="deleteLine" />
    <node concept="3clFbS" id="6LNwc8WAwSh" role="LjaKd">
      <node concept="3clFbF" id="6LNwc8WAwSi" role="3cqZAp">
        <node concept="2YIFZM" id="6LNwc8WAwSj" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="6LNwc8WAwSk" role="37wK5m">
            <node concept="3clFbS" id="6LNwc8WAwSl" role="1bW5cS">
              <node concept="2HxZob" id="6LNwc8WAwSm" role="3cqZAp">
                <node concept="1iFQzN" id="6LNwc8WAwSn" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="6LNwc8WAwSo" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="6LNwc8WAwSp" role="LiRBU">
      <node concept="1X3_iC" id="6LNwc8WAwWP" role="lGtFl">
        <property role="3V$3am" value="verticalMultiple" />
        <property role="3V$3ak" value="81f0abb8-d71e-4d13-a0c1-d2291fbb28b7/6739703022154345521/6739703022154345522" />
        <node concept="3MEHv7" id="6LNwc8WAwSq" role="8Wnug">
          <property role="TrG5h" value="child1" />
          <node concept="LIFWc" id="6LNwc8WAwXZ" role="lGtFl">
            <property role="LIFWa" value="16" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="16" />
            <property role="p6zMs" value="16" />
            <property role="LIFWd" value="Constant_i2hvs0_a0" />
          </node>
        </node>
      </node>
      <node concept="3MEHv7" id="6LNwc8WAwSs" role="3MEH02">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
    <node concept="3MEH01" id="6LNwc8WAwSt" role="LiZbd">
      <node concept="3MEHv7" id="6LNwc8WAwSu" role="3MEH02">
        <property role="TrG5h" value="child2" />
        <node concept="LIFWc" id="6LNwc8WAwSv" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_i2hvs0_a0" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="6LNwc8WAPXI">
    <property role="TrG5h" value="DeleteLineNestedSingleChild" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Delete parent if current child is single" />
    <node concept="3clFbS" id="6LNwc8WAPXJ" role="LjaKd">
      <node concept="3clFbF" id="6LNwc8WAPXK" role="3cqZAp">
        <node concept="2YIFZM" id="6LNwc8WAPXL" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="6LNwc8WAPXM" role="37wK5m">
            <node concept="3clFbS" id="6LNwc8WAPXN" role="1bW5cS">
              <node concept="2HxZob" id="6LNwc8WAPXO" role="3cqZAp">
                <node concept="1iFQzN" id="6LNwc8WAPXP" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="6LNwc8WAPXQ" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="6LNwc8WAPXR" role="LiRBU">
      <node concept="1gUoXb" id="6LNwc8WByE6" role="1gUdWQ">
        <node concept="3MEHv7" id="6LNwc8WByEg" role="1gUoX8">
          <node concept="LIFWc" id="6LNwc8WByFd" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="property_name" />
          </node>
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="6LNwc8WByFn" role="LiZbd">
      <node concept="LIFWc" id="6LNwc8WByHv" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_multipleChildrenWithNested" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="6LNwc8WByHD">
    <property role="TrG5h" value="DeleteLineNestedHorizontalChild" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Delete parent if current child is in the horizontal collection" />
    <node concept="3clFbS" id="6LNwc8WByHE" role="LjaKd">
      <node concept="3clFbF" id="6LNwc8WByHF" role="3cqZAp">
        <node concept="2YIFZM" id="6LNwc8WByHG" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="6LNwc8WByHH" role="37wK5m">
            <node concept="3clFbS" id="6LNwc8WByHI" role="1bW5cS">
              <node concept="2HxZob" id="6LNwc8WByHJ" role="3cqZAp">
                <node concept="1iFQzN" id="6LNwc8WByHK" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="6LNwc8WByHL" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="6LNwc8WByHM" role="LiRBU">
      <node concept="1gUoXb" id="6LNwc8WByHN" role="1gUdWQ">
        <node concept="3MEHv7" id="6LNwc8WByOf" role="1gUoXe" />
        <node concept="3MEHv7" id="6LNwc8WByOp" role="1gUoXe">
          <node concept="LIFWc" id="6LNwc8WByPv" role="lGtFl">
            <property role="ZRATv" value="true" />
            <property role="OXtK3" value="true" />
            <property role="p6zMq" value="0" />
            <property role="p6zMs" value="0" />
            <property role="LIFWd" value="property_name" />
          </node>
        </node>
      </node>
      <node concept="3MEHv7" id="6LNwc8WByHQ" role="3MEH08">
        <property role="TrG5h" value="child1" />
      </node>
      <node concept="3MEHv7" id="6LNwc8WByHR" role="3MEH08">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
    <node concept="3MEH01" id="6LNwc8WByQy" role="LiZbd">
      <node concept="3MEHv7" id="6LNwc8WByQB" role="3MEH08">
        <property role="TrG5h" value="child1" />
      </node>
      <node concept="3MEHv7" id="6LNwc8WByQC" role="3MEH08">
        <property role="TrG5h" value="child2" />
      </node>
      <node concept="LIFWc" id="6LNwc8WBySG" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="0" />
        <property role="p6zMs" value="0" />
        <property role="LIFWd" value="empty_multipleChildrenWithNested" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32J9K7f">
    <property role="TrG5h" value="DeleteLineIndentHorizontalMultipleCollection" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Don't delete child if the parent collection is horizontal" />
    <node concept="3clFbS" id="5Q8f32J9K7g" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32J9K7h" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32J9K7i" role="3clFbG">
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <node concept="1bVj0M" id="5Q8f32J9K7j" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32J9K7k" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32J9K7l" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32J9K7m" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32J9K7n" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J9K7o" role="LiRBU">
      <node concept="3MEHv7" id="5Q8f32J9K7p" role="3MEH06">
        <property role="TrG5h" value="child1" />
        <node concept="LIFWc" id="5Q8f32J9K7q" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="6" />
          <property role="p6zMs" value="6" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
      <node concept="3MEHv7" id="5Q8f32J9K7r" role="3MEH06">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J9KeC" role="LiZbd">
      <node concept="3MEHv7" id="5Q8f32J9KeD" role="3MEH06">
        <property role="TrG5h" value="child1" />
        <node concept="LIFWc" id="5Q8f32J9KeE" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="6" />
          <property role="p6zMs" value="6" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
      <node concept="3MEHv7" id="5Q8f32J9KeF" role="3MEH06">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32J9KfD">
    <property role="TrG5h" value="DeleteLineVerticalSingleCollection" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Don't delete child in the single collection" />
    <node concept="3clFbS" id="5Q8f32J9KfE" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32J9KfF" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32J9KfG" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="5Q8f32J9KfH" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32J9KfI" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32J9KfJ" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32J9KfK" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32J9KfL" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J9KfM" role="LiRBU">
      <node concept="3MEHv7" id="5Q8f32J9KgX" role="3MEH2S">
        <property role="TrG5h" value="child" />
        <node concept="LIFWc" id="5Q8f32Ja216" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="5" />
          <property role="p6zMs" value="5" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32Ja218" role="LiZbd">
      <node concept="3MEHv7" id="5Q8f32Ja219" role="3MEH2S">
        <property role="TrG5h" value="child" />
        <node concept="LIFWc" id="5Q8f32Ja21a" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="5" />
          <property role="p6zMs" value="5" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32JaWTm">
    <property role="TrG5h" value="DeleteLineRoot" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Don't delete the root by &quot;delete line&quot;" />
    <node concept="3clFbS" id="5Q8f32JaWTn" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32JaWTo" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32JaWTp" role="3clFbG">
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <node concept="1bVj0M" id="5Q8f32JaWTq" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32JaWTr" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32JaWTs" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32JaWTt" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32JaWTu" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32JaWTv" role="LiRBU">
      <node concept="LIFWc" id="6LNwc8WBQX8" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="1" />
        <property role="p6zMs" value="1" />
        <property role="LIFWd" value="Constant_n4yjrw_b0" />
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32JaWTy" role="LiZbd">
      <node concept="LIFWc" id="6LNwc8WBQYd" role="lGtFl">
        <property role="ZRATv" value="true" />
        <property role="OXtK3" value="true" />
        <property role="p6zMq" value="1" />
        <property role="p6zMs" value="1" />
        <property role="LIFWd" value="Constant_n4yjrw_b0" />
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32J965k">
    <property role="TrG5h" value="DeleteLineVerticalMultipleCollection" />
    <property role="3GE5qa" value="deleteLine" />
    <node concept="3clFbS" id="5Q8f32J965r" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32J965s" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32J965t" role="3clFbG">
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <node concept="1bVj0M" id="5Q8f32J965u" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32J965v" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32J965w" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32J965x" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32J965y" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J96lD" role="LiRBU">
      <node concept="3MEHv7" id="5Q8f32J96mB" role="3MEH02">
        <property role="TrG5h" value="child1" />
        <node concept="LIFWc" id="5Q8f32J9r1x" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="6" />
          <property role="p6zMs" value="6" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
      <node concept="3MEHv7" id="5Q8f32J96oa" role="3MEH02">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J96mL" role="LiZbd">
      <node concept="3MEHv7" id="5Q8f32J9r0r" role="3MEH02">
        <property role="TrG5h" value="child2" />
        <node concept="LIFWc" id="5Q8f32J9r2u" role="lGtFl">
          <property role="LIFWa" value="0" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="0" />
          <property role="p6zMs" value="0" />
          <property role="LIFWd" value="Constant_i2hvs0_a0" />
        </node>
      </node>
    </node>
  </node>
  <node concept="LiM7Y" id="5Q8f32J9r5E">
    <property role="TrG5h" value="DeleteLineHorizontalMultipleCollection" />
    <property role="3GE5qa" value="deleteLine" />
    <property role="3YCmrE" value="Don't delete child if the parent collection is horizontal" />
    <node concept="3clFbS" id="5Q8f32J9r5F" role="LjaKd">
      <node concept="3clFbF" id="5Q8f32J9r5G" role="3cqZAp">
        <node concept="2YIFZM" id="5Q8f32J9r5H" role="3clFbG">
          <ref role="37wK5l" to="tp6m:14TMHtHs1EN" resolve="runWithTwoStepDeletion" />
          <ref role="1Pybhc" to="tp6m:5s44y2Lh6_5" resolve="EditorUtil" />
          <node concept="1bVj0M" id="5Q8f32J9r5I" role="37wK5m">
            <node concept="3clFbS" id="5Q8f32J9r5J" role="1bW5cS">
              <node concept="2HxZob" id="5Q8f32J9r5K" role="3cqZAp">
                <node concept="1iFQzN" id="5Q8f32J9r5L" role="3iKnsn">
                  <ref role="1iFR8X" to="ekwn:3hypUcHYaIV" resolve="DeleteLine" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbT" id="5Q8f32J9r5M" role="37wK5m" />
        </node>
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J9r5N" role="LiRBU">
      <node concept="3MEHv7" id="5Q8f32J9r5O" role="3MEH08">
        <property role="TrG5h" value="child1" />
        <node concept="LIFWc" id="5Q8f32J9r5P" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="6" />
          <property role="p6zMs" value="6" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
      <node concept="3MEHv7" id="5Q8f32J9r5Q" role="3MEH08">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
    <node concept="3MEH01" id="5Q8f32J9K6b" role="LiZbd">
      <node concept="3MEHv7" id="5Q8f32J9K6c" role="3MEH08">
        <property role="TrG5h" value="child1" />
        <node concept="LIFWc" id="5Q8f32J9K6d" role="lGtFl">
          <property role="ZRATv" value="true" />
          <property role="OXtK3" value="true" />
          <property role="p6zMq" value="6" />
          <property role="p6zMs" value="6" />
          <property role="LIFWd" value="property_name" />
        </node>
      </node>
      <node concept="3MEHv7" id="5Q8f32J9K6e" role="3MEH08">
        <property role="TrG5h" value="child2" />
      </node>
    </node>
  </node>
</model>

