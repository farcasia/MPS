<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:fc11309(checkpoints/jetbrains.mps.lang.test.constraints@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <languages />
  <imports>
    <import index="tp5q" ref="r:00000000-0000-4000-0000-011c89590382(jetbrains.mps.lang.test.constraints)" />
    <import index="tp5o" ref="r:00000000-0000-4000-0000-011c89590380(jetbrains.mps.lang.test.behavior)" />
    <import index="o8zo" ref="r:314576fc-3aee-4386-a0a5-a38348ac317d(jetbrains.mps.scope)" />
    <import index="79pl" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.base(MPS.Core/)" />
    <import index="tp5g" ref="r:00000000-0000-4000-0000-011c89590388(jetbrains.mps.lang.test.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="i8bi" ref="r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="2k9e" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.structure(MPS.Core/)" />
    <import index="e8bb" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.ids(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="35tq" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.scope(MPS.Core/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1215693861676" name="jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression" flags="nn" index="d038R">
        <child id="1068498886297" name="rValue" index="37vLTx" />
        <child id="1068498886295" name="lValue" index="37vLTJ" />
      </concept>
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1224848483129" name="jetbrains.mps.baseLanguage.structure.IBLDeprecatable" flags="ng" index="IEa8$">
        <property id="1224848525476" name="isDeprecated" index="IEkAT" />
      </concept>
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
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <property id="1176718929932" name="isFinal" index="3TUv4t" />
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="4269842503726207156" name="jetbrains.mps.baseLanguage.structure.LongLiteral" flags="nn" index="1adDum">
        <property id="4269842503726207157" name="value" index="1adDun" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
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
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
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
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
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
      <concept id="1163668896201" name="jetbrains.mps.baseLanguage.structure.TernaryOperatorExpression" flags="nn" index="3K4zz7">
        <child id="1163668914799" name="condition" index="3K4Cdx" />
        <child id="1163668922816" name="ifTrue" index="3K4E3e" />
        <child id="1163668934364" name="ifFalse" index="3K4GZi" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="774bf8a0-62e5-41e1-af63-f4812e60e48b" name="jetbrains.mps.baseLanguage.checkedDots">
      <concept id="4079382982702596667" name="jetbrains.mps.baseLanguage.checkedDots.structure.CheckedDotExpression" flags="nn" index="2EnYce" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE" />
    </language>
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1238251434034" name="jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantExpression" flags="ng" index="1dyn4i">
        <property id="1238251449050" name="fieldName" index="1dyqJU" />
        <property id="8835849473318867199" name="makeUnique" index="1zomUR" />
        <child id="1238251454130" name="expression" index="1dyrYi" />
      </concept>
      <concept id="1173996401517" name="jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression" flags="nn" index="1nCR9W">
        <property id="1173996588177" name="fqClassName" index="1nD$Q0" />
        <child id="1179332974947" name="type" index="2lIhxL" />
      </concept>
      <concept id="1174294166120" name="jetbrains.mps.baseLanguageInternal.structure.InternalPartialInstanceMethodCall" flags="nn" index="1DoJHT">
        <property id="1174294288199" name="methodName" index="1Dpdpm" />
        <child id="1174313653259" name="returnType" index="1Ez5kq" />
        <child id="1174317636233" name="instance" index="1EMhIo" />
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
      <concept id="8758390115028452779" name="jetbrains.mps.lang.smodel.structure.Node_GetReferencesOperation" flags="nn" index="2z74zc" />
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1143234257716" name="jetbrains.mps.lang.smodel.structure.Node_GetModelOperation" flags="nn" index="I4A8Y" />
      <concept id="1145383075378" name="jetbrains.mps.lang.smodel.structure.SNodeListType" flags="in" index="2I9FWS">
        <reference id="1145383142433" name="elementConcept" index="2I9WkF" />
      </concept>
      <concept id="1171305280644" name="jetbrains.mps.lang.smodel.structure.Node_GetDescendantsOperation" flags="nn" index="2Rf3mk" />
      <concept id="1145567426890" name="jetbrains.mps.lang.smodel.structure.SNodeListCreator" flags="nn" index="2T8Vx0">
        <child id="1145567471833" name="createdType" index="2T96Bj" />
      </concept>
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="4124388153790980106" name="jetbrains.mps.lang.smodel.structure.Reference_GetTargetOperation" flags="nn" index="2ZHEkA" />
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1154546920561" name="jetbrains.mps.lang.smodel.structure.OperationParm_ConceptList" flags="ng" index="3gmYPX">
        <child id="1154546920563" name="concept" index="3gmYPZ" />
      </concept>
      <concept id="1154546950173" name="jetbrains.mps.lang.smodel.structure.ConceptReference" flags="ng" index="3gn64h">
        <reference id="1154546997487" name="concept" index="3gnhBz" />
      </concept>
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="6039268229364358244" name="jetbrains.mps.lang.smodel.structure.ExactConceptCase" flags="ng" index="1pnPoh">
        <child id="6039268229364358388" name="body" index="1pnPq1" />
        <child id="6039268229364358387" name="concept" index="1pnPq6" />
      </concept>
      <concept id="1171999116870" name="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" flags="nn" index="3w_OXm" />
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="5944356402132808749" name="jetbrains.mps.lang.smodel.structure.ConceptSwitchStatement" flags="nn" index="1_3QMa">
        <child id="6039268229365417680" name="defaultBlock" index="1prKM_" />
        <child id="5944356402132808753" name="case" index="1_3QMm" />
        <child id="5944356402132808752" name="expression" index="1_3QMn" />
      </concept>
      <concept id="1144195091934" name="jetbrains.mps.lang.smodel.structure.Node_IsRoleOperation" flags="nn" index="1BlSNk">
        <reference id="1144195362400" name="conceptOfParent" index="1BmUXE" />
        <reference id="1144195396777" name="linkInParent" index="1Bn3mz" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1151689724996" name="jetbrains.mps.baseLanguage.collections.structure.SequenceType" flags="in" index="A3Dl8">
        <child id="1151689745422" name="elementType" index="A3Ik2" />
      </concept>
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="ConstraintsAspectDescriptor" />
    <property role="3GE5qa" value="Constraints" />
    <node concept="3uibUv" id="1" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseConstraintsAspectDescriptor" resolve="BaseConstraintsAspectDescriptor" />
    </node>
    <node concept="3Tm1VV" id="2" role="1B3o_S" />
    <node concept="3clFbW" id="3" role="jymVt">
      <node concept="3cqZAl" id="6" role="3clF45" />
      <node concept="3Tm1VV" id="7" role="1B3o_S" />
      <node concept="3clFbS" id="8" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="4" role="jymVt" />
    <node concept="3clFb_" id="5" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getConstraints" />
      <property role="DiZV1" value="false" />
      <node concept="2AHcQZ" id="9" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3Tm1VV" id="a" role="1B3o_S" />
      <node concept="3uibUv" id="b" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
      </node>
      <node concept="37vLTG" id="c" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="e" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="d" role="3clF47">
        <node concept="1_3QMa" id="f" role="3cqZAp">
          <node concept="37vLTw" id="h" role="1_3QMn">
            <ref role="3cqZAo" node="c" resolve="concept" />
          </node>
          <node concept="1pnPoh" id="i" role="1_3QMm">
            <node concept="3clFbS" id="o" role="1pnPq1">
              <node concept="3cpWs6" id="q" role="3cqZAp">
                <node concept="1nCR9W" id="r" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.test.constraints.TestNodeReference_Constraints" />
                  <node concept="3uibUv" id="s" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="p" role="1pnPq6">
              <ref role="3gnhBz" to="tp5g:hBxON8j" resolve="TestNodeReference" />
            </node>
          </node>
          <node concept="1pnPoh" id="j" role="1_3QMm">
            <node concept="3clFbS" id="t" role="1pnPq1">
              <node concept="3cpWs6" id="v" role="3cqZAp">
                <node concept="1nCR9W" id="w" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.test.constraints.ScopesExpectedNode_Constraints" />
                  <node concept="3uibUv" id="x" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="u" role="1pnPq6">
              <ref role="3gnhBz" to="tp5g:3aUmKV2nYBN" resolve="ScopesExpectedNode" />
            </node>
          </node>
          <node concept="1pnPoh" id="k" role="1_3QMm">
            <node concept="3clFbS" id="y" role="1pnPq1">
              <node concept="3cpWs6" id="$" role="3cqZAp">
                <node concept="1nCR9W" id="_" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.test.constraints.ScopesTest_Constraints" />
                  <node concept="3uibUv" id="A" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="z" role="1pnPq6">
              <ref role="3gnhBz" to="tp5g:so7passww9" resolve="ScopesTest" />
            </node>
          </node>
          <node concept="1pnPoh" id="l" role="1_3QMm">
            <node concept="3clFbS" id="B" role="1pnPq1">
              <node concept="3cpWs6" id="D" role="3cqZAp">
                <node concept="1nCR9W" id="E" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.test.constraints.MigrationTestCase_Constraints" />
                  <node concept="3uibUv" id="F" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="C" role="1pnPq6">
              <ref role="3gnhBz" to="tp5g:4K12N3pJ$JB" resolve="MigrationTestCase" />
            </node>
          </node>
          <node concept="1pnPoh" id="m" role="1_3QMm">
            <node concept="3clFbS" id="G" role="1pnPq1">
              <node concept="3cpWs6" id="I" role="3cqZAp">
                <node concept="1nCR9W" id="J" role="3cqZAk">
                  <property role="1nD$Q0" value="jetbrains.mps.lang.test.constraints.MigrationReference_Constraints" />
                  <node concept="3uibUv" id="K" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="H" role="1pnPq6">
              <ref role="3gnhBz" to="tp5g:5JRx$mlRtY9" resolve="MigrationReference" />
            </node>
          </node>
          <node concept="3clFbS" id="n" role="1prKM_" />
        </node>
        <node concept="3cpWs6" id="g" role="3cqZAp">
          <node concept="2ShNRf" id="L" role="3cqZAk">
            <node concept="1pGfFk" id="M" role="2ShVmc">
              <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
              <node concept="37vLTw" id="N" role="37wK5m">
                <ref role="3cqZAo" node="c" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="O" />
  <node concept="312cEu" id="P">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="MigrationReference_Constraints" />
    <node concept="3Tm1VV" id="Q" role="1B3o_S" />
    <node concept="3uibUv" id="R" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="S" role="jymVt">
      <node concept="3cqZAl" id="V" role="3clF45" />
      <node concept="3clFbS" id="W" role="3clF47">
        <node concept="XkiVB" id="Y" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="Z" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="10" role="37wK5m">
              <property role="1adDun" value="0x8585453e6bfb4d80L" />
            </node>
            <node concept="1adDum" id="11" role="37wK5m">
              <property role="1adDun" value="0x98deb16074f1d86cL" />
            </node>
            <node concept="1adDum" id="12" role="37wK5m">
              <property role="1adDun" value="0x5bf7864595dddf89L" />
            </node>
            <node concept="Xl_RD" id="13" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.test.structure.MigrationReference" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="X" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="T" role="jymVt" />
    <node concept="3clFb_" id="U" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedReferences" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="14" role="1B3o_S" />
      <node concept="3uibUv" id="15" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="18" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
        </node>
        <node concept="3uibUv" id="19" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="16" role="3clF47">
        <node concept="3cpWs8" id="1a" role="3cqZAp">
          <node concept="3cpWsn" id="1d" role="3cpWs9">
            <property role="TrG5h" value="references" />
            <node concept="3uibUv" id="1e" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="1g" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
              </node>
              <node concept="3uibUv" id="1h" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="1f" role="33vP2m">
              <node concept="1pGfFk" id="1i" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="1j" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
                </node>
                <node concept="3uibUv" id="1k" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1b" role="3cqZAp">
          <node concept="2OqwBi" id="1l" role="3clFbG">
            <node concept="37vLTw" id="1m" role="2Oq$k0">
              <ref role="3cqZAo" node="1d" resolve="references" />
            </node>
            <node concept="liA8E" id="1n" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="1o" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getReferenceLink(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getReferenceLink" />
                <node concept="1adDum" id="1q" role="37wK5m">
                  <property role="1adDun" value="0x8585453e6bfb4d80L" />
                </node>
                <node concept="1adDum" id="1r" role="37wK5m">
                  <property role="1adDun" value="0x98deb16074f1d86cL" />
                </node>
                <node concept="1adDum" id="1s" role="37wK5m">
                  <property role="1adDun" value="0x5bf7864595dddf89L" />
                </node>
                <node concept="1adDum" id="1t" role="37wK5m">
                  <property role="1adDun" value="0x5bf7864595dddf8aL" />
                </node>
                <node concept="Xl_RD" id="1u" role="37wK5m">
                  <property role="Xl_RC" value="migration" />
                </node>
              </node>
              <node concept="2ShNRf" id="1p" role="37wK5m">
                <node concept="YeOm9" id="1v" role="2ShVmc">
                  <node concept="1Y3b0j" id="1w" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BaseReferenceConstraintsDescriptor" resolve="BaseReferenceConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BaseReferenceConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SReferenceLinkId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BaseReferenceConstraintsDescriptor" />
                    <node concept="2YIFZM" id="1x" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.refId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SReferenceLinkId" resolve="refId" />
                      <node concept="1adDum" id="1C" role="37wK5m">
                        <property role="1adDun" value="0x8585453e6bfb4d80L" />
                      </node>
                      <node concept="1adDum" id="1D" role="37wK5m">
                        <property role="1adDun" value="0x98deb16074f1d86cL" />
                      </node>
                      <node concept="1adDum" id="1E" role="37wK5m">
                        <property role="1adDun" value="0x5bf7864595dddf89L" />
                      </node>
                      <node concept="1adDum" id="1F" role="37wK5m">
                        <property role="1adDun" value="0x5bf7864595dddf8aL" />
                      </node>
                    </node>
                    <node concept="3Tm1VV" id="1y" role="1B3o_S" />
                    <node concept="Xjq3P" id="1z" role="37wK5m" />
                    <node concept="3clFb_" id="1$" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnOnReferenceSetHandler" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="1G" role="1B3o_S" />
                      <node concept="10P_77" id="1H" role="3clF45" />
                      <node concept="3clFbS" id="1I" role="3clF47">
                        <node concept="3clFbF" id="1K" role="3cqZAp">
                          <node concept="3clFbT" id="1L" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="1J" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="1_" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="validate" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="1M" role="1B3o_S" />
                      <node concept="10P_77" id="1N" role="3clF45" />
                      <node concept="37vLTG" id="1O" role="3clF46">
                        <property role="TrG5h" value="referenceNode" />
                        <property role="3TUv4t" value="true" />
                        <node concept="3Tqbb2" id="1T" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="1P" role="3clF46">
                        <property role="TrG5h" value="oldReferentNode" />
                        <property role="3TUv4t" value="true" />
                        <node concept="3Tqbb2" id="1U" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="1Q" role="3clF46">
                        <property role="TrG5h" value="newReferentNode" />
                        <property role="3TUv4t" value="true" />
                        <node concept="3Tqbb2" id="1V" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="1R" role="3clF47">
                        <node concept="3cpWs6" id="1W" role="3cqZAp">
                          <node concept="3clFbT" id="1X" role="3cqZAk">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="1S" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="1A" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="onReferenceSet" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="1Y" role="1B3o_S" />
                      <node concept="3cqZAl" id="1Z" role="3clF45" />
                      <node concept="37vLTG" id="20" role="3clF46">
                        <property role="TrG5h" value="referenceNode" />
                        <property role="3TUv4t" value="true" />
                        <node concept="3Tqbb2" id="25" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="21" role="3clF46">
                        <property role="TrG5h" value="oldReferentNode" />
                        <property role="3TUv4t" value="true" />
                        <node concept="3Tqbb2" id="26" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="22" role="3clF46">
                        <property role="TrG5h" value="newReferentNode" />
                        <property role="3TUv4t" value="true" />
                        <node concept="3Tqbb2" id="27" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="23" role="3clF47">
                        <node concept="3clFbJ" id="28" role="3cqZAp">
                          <node concept="1Wc70l" id="29" role="3clFbw">
                            <node concept="3clFbC" id="2b" role="3uHU7w">
                              <node concept="3cmrfG" id="2d" role="3uHU7w">
                                <property role="3cmrfH" value="1" />
                              </node>
                              <node concept="2OqwBi" id="2e" role="3uHU7B">
                                <node concept="2OqwBi" id="2f" role="2Oq$k0">
                                  <node concept="1PxgMI" id="2h" role="2Oq$k0">
                                    <node concept="chp4Y" id="2j" role="3oSUPX">
                                      <ref role="cht4Q" to="tp5g:4K12N3pJ$JB" resolve="MigrationTestCase" />
                                    </node>
                                    <node concept="2OqwBi" id="2k" role="1m5AlR">
                                      <node concept="37vLTw" id="2l" role="2Oq$k0">
                                        <ref role="3cqZAo" node="20" resolve="referenceNode" />
                                      </node>
                                      <node concept="1mfA1w" id="2m" role="2OqNvi" />
                                    </node>
                                  </node>
                                  <node concept="3Tsc0h" id="2i" role="2OqNvi">
                                    <ref role="3TtcxE" to="tp5g:5JRx$mlRSG2" resolve="migration" />
                                  </node>
                                </node>
                                <node concept="34oBXx" id="2g" role="2OqNvi" />
                              </node>
                            </node>
                            <node concept="2OqwBi" id="2c" role="3uHU7B">
                              <node concept="37vLTw" id="2n" role="2Oq$k0">
                                <ref role="3cqZAo" node="20" resolve="referenceNode" />
                              </node>
                              <node concept="1BlSNk" id="2o" role="2OqNvi">
                                <ref role="1BmUXE" to="tp5g:4K12N3pJ$JB" resolve="MigrationTestCase" />
                                <ref role="1Bn3mz" to="tp5g:5JRx$mlRSG2" resolve="migration" />
                              </node>
                            </node>
                          </node>
                          <node concept="3clFbS" id="2a" role="3clFbx">
                            <node concept="3clFbF" id="2p" role="3cqZAp">
                              <node concept="37vLTI" id="2q" role="3clFbG">
                                <node concept="3cpWs3" id="2r" role="37vLTx">
                                  <node concept="Xl_RD" id="2t" role="3uHU7w">
                                    <property role="Xl_RC" value="_Test" />
                                  </node>
                                  <node concept="2OqwBi" id="2u" role="3uHU7B">
                                    <node concept="37vLTw" id="2v" role="2Oq$k0">
                                      <ref role="3cqZAo" node="22" resolve="newReferentNode" />
                                    </node>
                                    <node concept="3TrcHB" id="2w" role="2OqNvi">
                                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="2OqwBi" id="2s" role="37vLTJ">
                                  <node concept="1PxgMI" id="2x" role="2Oq$k0">
                                    <node concept="chp4Y" id="2z" role="3oSUPX">
                                      <ref role="cht4Q" to="tp5g:4K12N3pJ$JB" resolve="MigrationTestCase" />
                                    </node>
                                    <node concept="2OqwBi" id="2$" role="1m5AlR">
                                      <node concept="37vLTw" id="2_" role="2Oq$k0">
                                        <ref role="3cqZAo" node="20" resolve="referenceNode" />
                                      </node>
                                      <node concept="1mfA1w" id="2A" role="2OqNvi" />
                                    </node>
                                  </node>
                                  <node concept="3TrcHB" id="2y" role="2OqNvi">
                                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="24" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="1B" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="2B" role="1B3o_S" />
                      <node concept="3uibUv" id="2C" role="3clF45">
                        <ref role="3uigEE" to="ze1i:~ReferenceScopeProvider" resolve="ReferenceScopeProvider" />
                      </node>
                      <node concept="2AHcQZ" id="2D" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      </node>
                      <node concept="3clFbS" id="2E" role="3clF47">
                        <node concept="3cpWs6" id="2G" role="3cqZAp">
                          <node concept="2ShNRf" id="2H" role="3cqZAk">
                            <node concept="YeOm9" id="2I" role="2ShVmc">
                              <node concept="1Y3b0j" id="2J" role="YeSDq">
                                <property role="2bfB8j" value="true" />
                                <ref role="1Y3XeK" to="79pl:~BaseScopeProvider" resolve="BaseScopeProvider" />
                                <ref role="37wK5l" to="79pl:~BaseScopeProvider.&lt;init&gt;()" resolve="BaseScopeProvider" />
                                <node concept="3Tm1VV" id="2K" role="1B3o_S" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="2F" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="1c" role="3cqZAp">
          <node concept="37vLTw" id="2L" role="3clFbG">
            <ref role="3cqZAo" node="1d" resolve="references" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="17" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2M">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="MigrationTestCase_Constraints" />
    <node concept="3Tm1VV" id="2N" role="1B3o_S" />
    <node concept="3uibUv" id="2O" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="2P" role="jymVt">
      <node concept="3cqZAl" id="2S" role="3clF45" />
      <node concept="3clFbS" id="2T" role="3clF47">
        <node concept="XkiVB" id="2V" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="2W" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="2X" role="37wK5m">
              <property role="1adDun" value="0x8585453e6bfb4d80L" />
            </node>
            <node concept="1adDum" id="2Y" role="37wK5m">
              <property role="1adDun" value="0x98deb16074f1d86cL" />
            </node>
            <node concept="1adDum" id="2Z" role="37wK5m">
              <property role="1adDun" value="0x4c010b30d9be4be7L" />
            </node>
            <node concept="Xl_RD" id="30" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.test.structure.MigrationTestCase" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2U" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="2Q" role="jymVt" />
    <node concept="3clFb_" id="2R" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="31" role="1B3o_S" />
      <node concept="3uibUv" id="32" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="35" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
        </node>
        <node concept="3uibUv" id="36" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="33" role="3clF47">
        <node concept="3cpWs8" id="37" role="3cqZAp">
          <node concept="3cpWsn" id="3a" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <node concept="3uibUv" id="3b" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="3d" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
              </node>
              <node concept="3uibUv" id="3e" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="3c" role="33vP2m">
              <node concept="1pGfFk" id="3f" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="3g" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                </node>
                <node concept="3uibUv" id="3h" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="38" role="3cqZAp">
          <node concept="2OqwBi" id="3i" role="3clFbG">
            <node concept="37vLTw" id="3j" role="2Oq$k0">
              <ref role="3cqZAo" node="3a" resolve="properties" />
            </node>
            <node concept="liA8E" id="3k" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="3l" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SProperty" resolve="getProperty" />
                <node concept="1adDum" id="3n" role="37wK5m">
                  <property role="1adDun" value="0xf61473f9130f42f6L" />
                </node>
                <node concept="1adDum" id="3o" role="37wK5m">
                  <property role="1adDun" value="0xb98d6c438812c2f6L" />
                </node>
                <node concept="1adDum" id="3p" role="37wK5m">
                  <property role="1adDun" value="0x11b2709bd56L" />
                </node>
                <node concept="1adDum" id="3q" role="37wK5m">
                  <property role="1adDun" value="0x59337dc8dffe0d9dL" />
                </node>
                <node concept="Xl_RD" id="3r" role="37wK5m">
                  <property role="Xl_RC" value="canNotRunInProcess" />
                </node>
              </node>
              <node concept="2ShNRf" id="3m" role="37wK5m">
                <node concept="YeOm9" id="3s" role="2ShVmc">
                  <node concept="1Y3b0j" id="3t" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SPropertyId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
                    <node concept="2YIFZM" id="3u" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.propId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SPropertyId" resolve="propId" />
                      <node concept="1adDum" id="3z" role="37wK5m">
                        <property role="1adDun" value="0xf61473f9130f42f6L" />
                      </node>
                      <node concept="1adDum" id="3$" role="37wK5m">
                        <property role="1adDun" value="0xb98d6c438812c2f6L" />
                      </node>
                      <node concept="1adDum" id="3_" role="37wK5m">
                        <property role="1adDun" value="0x11b2709bd56L" />
                      </node>
                      <node concept="1adDum" id="3A" role="37wK5m">
                        <property role="1adDun" value="0x59337dc8dffe0d9dL" />
                      </node>
                    </node>
                    <node concept="Xjq3P" id="3v" role="37wK5m" />
                    <node concept="3Tm1VV" id="3w" role="1B3o_S" />
                    <node concept="3clFb_" id="3x" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnValidator" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="3B" role="1B3o_S" />
                      <node concept="10P_77" id="3C" role="3clF45" />
                      <node concept="3clFbS" id="3D" role="3clF47">
                        <node concept="3clFbF" id="3F" role="3cqZAp">
                          <node concept="3clFbT" id="3G" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="3E" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="3y" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="validateValue" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="3H" role="1B3o_S" />
                      <node concept="10P_77" id="3I" role="3clF45" />
                      <node concept="37vLTG" id="3J" role="3clF46">
                        <property role="TrG5h" value="node" />
                        <node concept="3Tqbb2" id="3N" role="1tU5fm" />
                      </node>
                      <node concept="37vLTG" id="3K" role="3clF46">
                        <property role="TrG5h" value="propertyValue" />
                        <node concept="17QB3L" id="3O" role="1tU5fm" />
                      </node>
                      <node concept="3clFbS" id="3L" role="3clF47">
                        <node concept="3cpWs8" id="3P" role="3cqZAp">
                          <node concept="3cpWsn" id="3R" role="3cpWs9">
                            <property role="TrG5h" value="propertyName" />
                            <node concept="17QB3L" id="3S" role="1tU5fm" />
                            <node concept="Xl_RD" id="3T" role="33vP2m">
                              <property role="Xl_RC" value="canNotRunInProcess" />
                            </node>
                          </node>
                        </node>
                        <node concept="9aQIb" id="3Q" role="3cqZAp">
                          <node concept="3clFbS" id="3U" role="9aQI4">
                            <node concept="3clFbF" id="3V" role="3cqZAp">
                              <node concept="3clFbC" id="3W" role="3clFbG">
                                <node concept="3clFbT" id="3X" role="3uHU7w">
                                  <property role="3clFbU" value="false" />
                                </node>
                                <node concept="1eOMI4" id="3Y" role="3uHU7B">
                                  <node concept="2YIFZM" id="3Z" role="1eOMHV">
                                    <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                                    <ref role="37wK5l" to="i8bi:5IkW5anFfpG" resolve="getBoolean" />
                                    <node concept="37vLTw" id="40" role="37wK5m">
                                      <ref role="3cqZAo" node="3K" resolve="propertyValue" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="3M" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="39" role="3cqZAp">
          <node concept="37vLTw" id="41" role="3clFbG">
            <ref role="3cqZAo" node="3a" resolve="properties" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="34" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="42">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="ScopesExpectedNode_Constraints" />
    <node concept="3Tm1VV" id="43" role="1B3o_S" />
    <node concept="3uibUv" id="44" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="45" role="jymVt">
      <node concept="3cqZAl" id="48" role="3clF45" />
      <node concept="3clFbS" id="49" role="3clF47">
        <node concept="XkiVB" id="4b" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="4c" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="4d" role="37wK5m">
              <property role="1adDun" value="0x8585453e6bfb4d80L" />
            </node>
            <node concept="1adDum" id="4e" role="37wK5m">
              <property role="1adDun" value="0x98deb16074f1d86cL" />
            </node>
            <node concept="1adDum" id="4f" role="37wK5m">
              <property role="1adDun" value="0x32ba5b0ec25fe9f3L" />
            </node>
            <node concept="Xl_RD" id="4g" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.test.structure.ScopesExpectedNode" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4a" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="46" role="jymVt" />
    <node concept="3clFb_" id="47" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedReferences" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="4h" role="1B3o_S" />
      <node concept="3uibUv" id="4i" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="4l" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
        </node>
        <node concept="3uibUv" id="4m" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="4j" role="3clF47">
        <node concept="3cpWs8" id="4n" role="3cqZAp">
          <node concept="3cpWsn" id="4q" role="3cpWs9">
            <property role="TrG5h" value="references" />
            <node concept="3uibUv" id="4r" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="4t" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
              </node>
              <node concept="3uibUv" id="4u" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="4s" role="33vP2m">
              <node concept="1pGfFk" id="4v" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="4w" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
                </node>
                <node concept="3uibUv" id="4x" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4o" role="3cqZAp">
          <node concept="2OqwBi" id="4y" role="3clFbG">
            <node concept="37vLTw" id="4z" role="2Oq$k0">
              <ref role="3cqZAo" node="4q" resolve="references" />
            </node>
            <node concept="liA8E" id="4$" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="4_" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getReferenceLink(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getReferenceLink" />
                <node concept="1adDum" id="4B" role="37wK5m">
                  <property role="1adDun" value="0x8585453e6bfb4d80L" />
                </node>
                <node concept="1adDum" id="4C" role="37wK5m">
                  <property role="1adDun" value="0x98deb16074f1d86cL" />
                </node>
                <node concept="1adDum" id="4D" role="37wK5m">
                  <property role="1adDun" value="0x32ba5b0ec25fe9f3L" />
                </node>
                <node concept="1adDum" id="4E" role="37wK5m">
                  <property role="1adDun" value="0x383e5e55de89bc1fL" />
                </node>
                <node concept="Xl_RD" id="4F" role="37wK5m">
                  <property role="Xl_RC" value="ref" />
                </node>
              </node>
              <node concept="2ShNRf" id="4A" role="37wK5m">
                <node concept="YeOm9" id="4G" role="2ShVmc">
                  <node concept="1Y3b0j" id="4H" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BaseReferenceConstraintsDescriptor" resolve="BaseReferenceConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BaseReferenceConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SReferenceLinkId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BaseReferenceConstraintsDescriptor" />
                    <node concept="2YIFZM" id="4I" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.refId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SReferenceLinkId" resolve="refId" />
                      <node concept="1adDum" id="4N" role="37wK5m">
                        <property role="1adDun" value="0x8585453e6bfb4d80L" />
                      </node>
                      <node concept="1adDum" id="4O" role="37wK5m">
                        <property role="1adDun" value="0x98deb16074f1d86cL" />
                      </node>
                      <node concept="1adDum" id="4P" role="37wK5m">
                        <property role="1adDun" value="0x32ba5b0ec25fe9f3L" />
                      </node>
                      <node concept="1adDum" id="4Q" role="37wK5m">
                        <property role="1adDun" value="0x383e5e55de89bc1fL" />
                      </node>
                    </node>
                    <node concept="3Tm1VV" id="4J" role="1B3o_S" />
                    <node concept="Xjq3P" id="4K" role="37wK5m" />
                    <node concept="3clFb_" id="4L" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="4R" role="1B3o_S" />
                      <node concept="10P_77" id="4S" role="3clF45" />
                      <node concept="3clFbS" id="4T" role="3clF47">
                        <node concept="3clFbF" id="4V" role="3cqZAp">
                          <node concept="3clFbT" id="4W" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="4U" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="4M" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="4X" role="1B3o_S" />
                      <node concept="3uibUv" id="4Y" role="3clF45">
                        <ref role="3uigEE" to="ze1i:~ReferenceScopeProvider" resolve="ReferenceScopeProvider" />
                      </node>
                      <node concept="2AHcQZ" id="4Z" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      </node>
                      <node concept="3clFbS" id="50" role="3clF47">
                        <node concept="3cpWs6" id="52" role="3cqZAp">
                          <node concept="2ShNRf" id="53" role="3cqZAk">
                            <node concept="YeOm9" id="54" role="2ShVmc">
                              <node concept="1Y3b0j" id="55" role="YeSDq">
                                <property role="2bfB8j" value="true" />
                                <ref role="1Y3XeK" to="79pl:~BaseScopeProvider" resolve="BaseScopeProvider" />
                                <ref role="37wK5l" to="79pl:~BaseScopeProvider.&lt;init&gt;()" resolve="BaseScopeProvider" />
                                <node concept="3Tm1VV" id="56" role="1B3o_S" />
                                <node concept="3clFb_" id="57" role="jymVt">
                                  <property role="TrG5h" value="getSearchScopeValidatorNode" />
                                  <node concept="3Tm1VV" id="59" role="1B3o_S" />
                                  <node concept="3clFbS" id="5a" role="3clF47">
                                    <node concept="3cpWs6" id="5d" role="3cqZAp">
                                      <node concept="1dyn4i" id="5e" role="3cqZAk">
                                        <property role="1zomUR" value="true" />
                                        <property role="1dyqJU" value="breakingNode" />
                                        <node concept="2ShNRf" id="5f" role="1dyrYi">
                                          <node concept="1pGfFk" id="5g" role="2ShVmc">
                                            <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                            <node concept="Xl_RD" id="5h" role="37wK5m">
                                              <property role="Xl_RC" value="r:00000000-0000-4000-0000-011c89590382(jetbrains.mps.lang.test.constraints)" />
                                            </node>
                                            <node concept="Xl_RD" id="5i" role="37wK5m">
                                              <property role="Xl_RC" value="6836281137582846233" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3uibUv" id="5b" role="3clF45">
                                    <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                                  </node>
                                  <node concept="2AHcQZ" id="5c" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="58" role="jymVt">
                                  <property role="IEkAT" value="false" />
                                  <property role="1EzhhJ" value="false" />
                                  <property role="TrG5h" value="createScope" />
                                  <property role="DiZV1" value="false" />
                                  <node concept="37vLTG" id="5j" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="5p" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="5k" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="5q" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferenceConstraintsContext" resolve="ReferenceConstraintsContext" />
                                    </node>
                                  </node>
                                  <node concept="3Tm1VV" id="5l" role="1B3o_S" />
                                  <node concept="3uibUv" id="5m" role="3clF45">
                                    <ref role="3uigEE" to="35tq:~Scope" resolve="Scope" />
                                  </node>
                                  <node concept="3clFbS" id="5n" role="3clF47">
                                    <node concept="9aQIb" id="5r" role="3cqZAp">
                                      <node concept="3clFbS" id="5s" role="9aQI4">
                                        <node concept="3cpWs8" id="5t" role="3cqZAp">
                                          <node concept="3cpWsn" id="5y" role="3cpWs9">
                                            <property role="TrG5h" value="enclosingNode" />
                                            <property role="3TUv4t" value="true" />
                                            <node concept="3Tqbb2" id="5z" role="1tU5fm" />
                                            <node concept="1eOMI4" id="5$" role="33vP2m">
                                              <node concept="3K4zz7" id="5_" role="1eOMHV">
                                                <node concept="1DoJHT" id="5A" role="3K4E3e">
                                                  <property role="1Dpdpm" value="getContextNode" />
                                                  <node concept="3uibUv" id="5D" role="1Ez5kq">
                                                    <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                  </node>
                                                  <node concept="37vLTw" id="5E" role="1EMhIo">
                                                    <ref role="3cqZAo" node="5k" resolve="_context" />
                                                  </node>
                                                </node>
                                                <node concept="2OqwBi" id="5B" role="3K4Cdx">
                                                  <node concept="1DoJHT" id="5F" role="2Oq$k0">
                                                    <property role="1Dpdpm" value="getReferenceNode" />
                                                    <node concept="3uibUv" id="5H" role="1Ez5kq">
                                                      <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                    </node>
                                                    <node concept="37vLTw" id="5I" role="1EMhIo">
                                                      <ref role="3cqZAo" node="5k" resolve="_context" />
                                                    </node>
                                                  </node>
                                                  <node concept="3w_OXm" id="5G" role="2OqNvi" />
                                                </node>
                                                <node concept="2OqwBi" id="5C" role="3K4GZi">
                                                  <node concept="1DoJHT" id="5J" role="2Oq$k0">
                                                    <property role="1Dpdpm" value="getReferenceNode" />
                                                    <node concept="3uibUv" id="5L" role="1Ez5kq">
                                                      <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                    </node>
                                                    <node concept="37vLTw" id="5M" role="1EMhIo">
                                                      <ref role="3cqZAo" node="5k" resolve="_context" />
                                                    </node>
                                                  </node>
                                                  <node concept="1mfA1w" id="5K" role="2OqNvi" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3clFbJ" id="5u" role="3cqZAp">
                                          <node concept="3clFbS" id="5N" role="3clFbx">
                                            <node concept="3cpWs6" id="5P" role="3cqZAp">
                                              <node concept="10Nm6u" id="5Q" role="3cqZAk" />
                                            </node>
                                          </node>
                                          <node concept="3fqX7Q" id="5O" role="3clFbw">
                                            <node concept="2OqwBi" id="5R" role="3fr31v">
                                              <node concept="37vLTw" id="5S" role="2Oq$k0">
                                                <ref role="3cqZAo" node="5y" resolve="enclosingNode" />
                                              </node>
                                              <node concept="1mIQ4w" id="5T" role="2OqNvi">
                                                <node concept="chp4Y" id="5U" role="cj9EA">
                                                  <ref role="cht4Q" to="tp5g:so7passww9" resolve="ScopesTest" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3cpWs8" id="5v" role="3cqZAp">
                                          <node concept="3cpWsn" id="5V" role="3cpWs9">
                                            <property role="TrG5h" value="scopesTest" />
                                            <node concept="3Tqbb2" id="5W" role="1tU5fm">
                                              <ref role="ehGHo" to="tp5g:so7passww9" resolve="ScopesTest" />
                                            </node>
                                            <node concept="1PxgMI" id="5X" role="33vP2m">
                                              <node concept="chp4Y" id="5Y" role="3oSUPX">
                                                <ref role="cht4Q" to="tp5g:so7passww9" resolve="ScopesTest" />
                                              </node>
                                              <node concept="37vLTw" id="5Z" role="1m5AlR">
                                                <ref role="3cqZAo" node="5y" resolve="enclosingNode" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3cpWs8" id="5w" role="3cqZAp">
                                          <node concept="3cpWsn" id="60" role="3cpWs9">
                                            <property role="TrG5h" value="modelPlusImportedScope" />
                                            <node concept="3uibUv" id="61" role="1tU5fm">
                                              <ref role="3uigEE" to="o8zo:7ipADkTfyIz" resolve="ModelPlusImportedScope" />
                                            </node>
                                            <node concept="2ShNRf" id="62" role="33vP2m">
                                              <node concept="1pGfFk" id="63" role="2ShVmc">
                                                <ref role="37wK5l" to="o8zo:4k9eBec$QVW" resolve="ModelPlusImportedScope" />
                                                <node concept="2OqwBi" id="64" role="37wK5m">
                                                  <node concept="1DoJHT" id="67" role="2Oq$k0">
                                                    <property role="1Dpdpm" value="getContextNode" />
                                                    <node concept="3uibUv" id="69" role="1Ez5kq">
                                                      <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                    </node>
                                                    <node concept="37vLTw" id="6a" role="1EMhIo">
                                                      <ref role="3cqZAo" node="5k" resolve="_context" />
                                                    </node>
                                                  </node>
                                                  <node concept="I4A8Y" id="68" role="2OqNvi" />
                                                </node>
                                                <node concept="3clFbT" id="65" role="37wK5m">
                                                  <property role="3clFbU" value="false" />
                                                </node>
                                                <node concept="2EnYce" id="66" role="37wK5m">
                                                  <node concept="2EnYce" id="6b" role="2Oq$k0">
                                                    <node concept="2OqwBi" id="6d" role="2Oq$k0">
                                                      <node concept="37vLTw" id="6f" role="2Oq$k0">
                                                        <ref role="3cqZAo" node="5V" resolve="scopesTest" />
                                                      </node>
                                                      <node concept="2qgKlT" id="6g" role="2OqNvi">
                                                        <ref role="37wK5l" to="tp5o:4IvydoGvimX" resolve="getCheckingReference" />
                                                      </node>
                                                    </node>
                                                    <node concept="liA8E" id="6e" role="2OqNvi">
                                                      <ref role="37wK5l" to="mhbf:~SReference.getLink():org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getLink" />
                                                    </node>
                                                  </node>
                                                  <node concept="liA8E" id="6c" role="2OqNvi">
                                                    <ref role="37wK5l" to="c17a:~SAbstractLink.getTargetConcept():org.jetbrains.mps.openapi.language.SAbstractConcept" resolve="getTargetConcept" />
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3cpWs6" id="5x" role="3cqZAp">
                                          <node concept="37vLTw" id="6h" role="3cqZAk">
                                            <ref role="3cqZAo" node="60" resolve="modelPlusImportedScope" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="5o" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="51" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4p" role="3cqZAp">
          <node concept="37vLTw" id="6i" role="3clFbG">
            <ref role="3cqZAo" node="4q" resolve="references" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="4k" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="6j">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="ScopesTest_Constraints" />
    <node concept="3Tm1VV" id="6k" role="1B3o_S" />
    <node concept="3uibUv" id="6l" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="6m" role="jymVt">
      <node concept="3cqZAl" id="6p" role="3clF45" />
      <node concept="3clFbS" id="6q" role="3clF47">
        <node concept="XkiVB" id="6s" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="6t" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="6u" role="37wK5m">
              <property role="1adDun" value="0x8585453e6bfb4d80L" />
            </node>
            <node concept="1adDum" id="6v" role="37wK5m">
              <property role="1adDun" value="0x98deb16074f1d86cL" />
            </node>
            <node concept="1adDum" id="6w" role="37wK5m">
              <property role="1adDun" value="0x7181d929c720809L" />
            </node>
            <node concept="Xl_RD" id="6x" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.test.structure.ScopesTest" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6r" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="6n" role="jymVt" />
    <node concept="3clFb_" id="6o" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedReferences" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="6y" role="1B3o_S" />
      <node concept="3uibUv" id="6z" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="6A" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
        </node>
        <node concept="3uibUv" id="6B" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="6$" role="3clF47">
        <node concept="3cpWs8" id="6C" role="3cqZAp">
          <node concept="3cpWsn" id="6F" role="3cpWs9">
            <property role="TrG5h" value="references" />
            <node concept="3uibUv" id="6G" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="6I" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
              </node>
              <node concept="3uibUv" id="6J" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="6H" role="33vP2m">
              <node concept="1pGfFk" id="6K" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="6L" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
                </node>
                <node concept="3uibUv" id="6M" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6D" role="3cqZAp">
          <node concept="2OqwBi" id="6N" role="3clFbG">
            <node concept="37vLTw" id="6O" role="2Oq$k0">
              <ref role="3cqZAo" node="6F" resolve="references" />
            </node>
            <node concept="liA8E" id="6P" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="6Q" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getReferenceLink(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getReferenceLink" />
                <node concept="1adDum" id="6S" role="37wK5m">
                  <property role="1adDun" value="0x8585453e6bfb4d80L" />
                </node>
                <node concept="1adDum" id="6T" role="37wK5m">
                  <property role="1adDun" value="0x98deb16074f1d86cL" />
                </node>
                <node concept="1adDum" id="6U" role="37wK5m">
                  <property role="1adDun" value="0x7181d929c720809L" />
                </node>
                <node concept="1adDum" id="6V" role="37wK5m">
                  <property role="1adDun" value="0x4b9f88d62c795596L" />
                </node>
                <node concept="Xl_RD" id="6W" role="37wK5m">
                  <property role="Xl_RC" value="checkingReference" />
                </node>
              </node>
              <node concept="2ShNRf" id="6R" role="37wK5m">
                <node concept="YeOm9" id="6X" role="2ShVmc">
                  <node concept="1Y3b0j" id="6Y" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BaseReferenceConstraintsDescriptor" resolve="BaseReferenceConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BaseReferenceConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SReferenceLinkId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BaseReferenceConstraintsDescriptor" />
                    <node concept="2YIFZM" id="6Z" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.refId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SReferenceLinkId" resolve="refId" />
                      <node concept="1adDum" id="74" role="37wK5m">
                        <property role="1adDun" value="0x8585453e6bfb4d80L" />
                      </node>
                      <node concept="1adDum" id="75" role="37wK5m">
                        <property role="1adDun" value="0x98deb16074f1d86cL" />
                      </node>
                      <node concept="1adDum" id="76" role="37wK5m">
                        <property role="1adDun" value="0x7181d929c720809L" />
                      </node>
                      <node concept="1adDum" id="77" role="37wK5m">
                        <property role="1adDun" value="0x4b9f88d62c795596L" />
                      </node>
                    </node>
                    <node concept="3Tm1VV" id="70" role="1B3o_S" />
                    <node concept="Xjq3P" id="71" role="37wK5m" />
                    <node concept="3clFb_" id="72" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="78" role="1B3o_S" />
                      <node concept="10P_77" id="79" role="3clF45" />
                      <node concept="3clFbS" id="7a" role="3clF47">
                        <node concept="3clFbF" id="7c" role="3cqZAp">
                          <node concept="3clFbT" id="7d" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="7b" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="73" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="7e" role="1B3o_S" />
                      <node concept="3uibUv" id="7f" role="3clF45">
                        <ref role="3uigEE" to="ze1i:~ReferenceScopeProvider" resolve="ReferenceScopeProvider" />
                      </node>
                      <node concept="2AHcQZ" id="7g" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      </node>
                      <node concept="3clFbS" id="7h" role="3clF47">
                        <node concept="3cpWs6" id="7j" role="3cqZAp">
                          <node concept="2ShNRf" id="7k" role="3cqZAk">
                            <node concept="YeOm9" id="7l" role="2ShVmc">
                              <node concept="1Y3b0j" id="7m" role="YeSDq">
                                <property role="2bfB8j" value="true" />
                                <ref role="1Y3XeK" to="79pl:~BaseScopeProvider" resolve="BaseScopeProvider" />
                                <ref role="37wK5l" to="79pl:~BaseScopeProvider.&lt;init&gt;()" resolve="BaseScopeProvider" />
                                <node concept="3Tm1VV" id="7n" role="1B3o_S" />
                                <node concept="3clFb_" id="7o" role="jymVt">
                                  <property role="TrG5h" value="getSearchScopeValidatorNode" />
                                  <node concept="3Tm1VV" id="7q" role="1B3o_S" />
                                  <node concept="3clFbS" id="7r" role="3clF47">
                                    <node concept="3cpWs6" id="7u" role="3cqZAp">
                                      <node concept="1dyn4i" id="7v" role="3cqZAk">
                                        <property role="1zomUR" value="true" />
                                        <property role="1dyqJU" value="breakingNode" />
                                        <node concept="2ShNRf" id="7w" role="1dyrYi">
                                          <node concept="1pGfFk" id="7x" role="2ShVmc">
                                            <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                            <node concept="Xl_RD" id="7y" role="37wK5m">
                                              <property role="Xl_RC" value="r:00000000-0000-4000-0000-011c89590382(jetbrains.mps.lang.test.constraints)" />
                                            </node>
                                            <node concept="Xl_RD" id="7z" role="37wK5m">
                                              <property role="Xl_RC" value="6836281137582846165" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3uibUv" id="7s" role="3clF45">
                                    <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                                  </node>
                                  <node concept="2AHcQZ" id="7t" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="7p" role="jymVt">
                                  <property role="IEkAT" value="false" />
                                  <property role="1EzhhJ" value="false" />
                                  <property role="TrG5h" value="createScope" />
                                  <property role="DiZV1" value="false" />
                                  <node concept="37vLTG" id="7$" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="7E" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="7_" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="7F" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferenceConstraintsContext" resolve="ReferenceConstraintsContext" />
                                    </node>
                                  </node>
                                  <node concept="3Tm1VV" id="7A" role="1B3o_S" />
                                  <node concept="3uibUv" id="7B" role="3clF45">
                                    <ref role="3uigEE" to="35tq:~Scope" resolve="Scope" />
                                  </node>
                                  <node concept="3clFbS" id="7C" role="3clF47">
                                    <node concept="9aQIb" id="7G" role="3cqZAp">
                                      <node concept="3clFbS" id="7H" role="9aQI4">
                                        <node concept="3cpWs6" id="7I" role="3cqZAp">
                                          <node concept="2ShNRf" id="7K" role="3cqZAk">
                                            <node concept="YeOm9" id="7L" role="2ShVmc">
                                              <node concept="1Y3b0j" id="7M" role="YeSDq">
                                                <property role="2bfB8j" value="true" />
                                                <ref role="37wK5l" to="o8zo:3fifI_xCtNA" resolve="Scope" />
                                                <ref role="1Y3XeK" to="o8zo:3fifI_xCtN$" resolve="Scope" />
                                                <node concept="3Tm1VV" id="7N" role="1B3o_S" />
                                                <node concept="3clFb_" id="7O" role="jymVt">
                                                  <property role="1EzhhJ" value="false" />
                                                  <property role="TrG5h" value="getAvailableElements" />
                                                  <node concept="A3Dl8" id="7R" role="3clF45">
                                                    <node concept="3Tqbb2" id="7W" role="A3Ik2" />
                                                  </node>
                                                  <node concept="3Tm1VV" id="7S" role="1B3o_S" />
                                                  <node concept="37vLTG" id="7T" role="3clF46">
                                                    <property role="TrG5h" value="prefix" />
                                                    <node concept="17QB3L" id="7X" role="1tU5fm" />
                                                    <node concept="2AHcQZ" id="7Y" role="2AJF6D">
                                                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                                                    </node>
                                                  </node>
                                                  <node concept="3clFbS" id="7U" role="3clF47">
                                                    <node concept="3cpWs8" id="7Z" role="3cqZAp">
                                                      <node concept="3cpWsn" id="82" role="3cpWs9">
                                                        <property role="TrG5h" value="nodes" />
                                                        <node concept="2I9FWS" id="83" role="1tU5fm" />
                                                        <node concept="2ShNRf" id="84" role="33vP2m">
                                                          <node concept="2T8Vx0" id="85" role="2ShVmc">
                                                            <node concept="2I9FWS" id="86" role="2T96Bj" />
                                                          </node>
                                                        </node>
                                                      </node>
                                                    </node>
                                                    <node concept="2Gpval" id="80" role="3cqZAp">
                                                      <node concept="2GrKxI" id="87" role="2Gsz3X">
                                                        <property role="TrG5h" value="reference" />
                                                      </node>
                                                      <node concept="3clFbS" id="88" role="2LFqv$">
                                                        <node concept="3clFbF" id="8a" role="3cqZAp">
                                                          <node concept="2OqwBi" id="8b" role="3clFbG">
                                                            <node concept="37vLTw" id="8c" role="2Oq$k0">
                                                              <ref role="3cqZAo" node="82" resolve="nodes" />
                                                            </node>
                                                            <node concept="TSZUe" id="8d" role="2OqNvi">
                                                              <node concept="2OqwBi" id="8e" role="25WWJ7">
                                                                <node concept="2GrUjf" id="8f" role="2Oq$k0">
                                                                  <ref role="2Gs0qQ" node="87" resolve="reference" />
                                                                </node>
                                                                <node concept="2ZHEkA" id="8g" role="2OqNvi" />
                                                              </node>
                                                            </node>
                                                          </node>
                                                        </node>
                                                      </node>
                                                      <node concept="2OqwBi" id="89" role="2GsD0m">
                                                        <node concept="2OqwBi" id="8h" role="2Oq$k0">
                                                          <node concept="1PxgMI" id="8j" role="2Oq$k0">
                                                            <node concept="chp4Y" id="8l" role="3oSUPX">
                                                              <ref role="cht4Q" to="tp5g:so7passww9" resolve="ScopesTest" />
                                                            </node>
                                                            <node concept="1DoJHT" id="8m" role="1m5AlR">
                                                              <property role="1Dpdpm" value="getContextNode" />
                                                              <node concept="3uibUv" id="8n" role="1Ez5kq">
                                                                <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                              </node>
                                                              <node concept="37vLTw" id="8o" role="1EMhIo">
                                                                <ref role="3cqZAo" node="7_" resolve="_context" />
                                                              </node>
                                                            </node>
                                                          </node>
                                                          <node concept="1mfA1w" id="8k" role="2OqNvi" />
                                                        </node>
                                                        <node concept="2z74zc" id="8i" role="2OqNvi" />
                                                      </node>
                                                    </node>
                                                    <node concept="3cpWs6" id="81" role="3cqZAp">
                                                      <node concept="37vLTw" id="8p" role="3cqZAk">
                                                        <ref role="3cqZAo" node="82" resolve="nodes" />
                                                      </node>
                                                    </node>
                                                  </node>
                                                  <node concept="2AHcQZ" id="7V" role="2AJF6D">
                                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                                  </node>
                                                </node>
                                                <node concept="3clFb_" id="7P" role="jymVt">
                                                  <property role="1EzhhJ" value="false" />
                                                  <property role="TrG5h" value="resolve" />
                                                  <node concept="3Tqbb2" id="8q" role="3clF45" />
                                                  <node concept="3Tm1VV" id="8r" role="1B3o_S" />
                                                  <node concept="37vLTG" id="8s" role="3clF46">
                                                    <property role="TrG5h" value="contextNode" />
                                                    <node concept="3Tqbb2" id="8x" role="1tU5fm" />
                                                  </node>
                                                  <node concept="37vLTG" id="8t" role="3clF46">
                                                    <property role="TrG5h" value="refText" />
                                                    <node concept="17QB3L" id="8y" role="1tU5fm" />
                                                    <node concept="2AHcQZ" id="8z" role="2AJF6D">
                                                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                                                    </node>
                                                  </node>
                                                  <node concept="2AHcQZ" id="8u" role="2AJF6D">
                                                    <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                                                  </node>
                                                  <node concept="3clFbS" id="8v" role="3clF47">
                                                    <node concept="3cpWs6" id="8$" role="3cqZAp">
                                                      <node concept="10Nm6u" id="8_" role="3cqZAk" />
                                                    </node>
                                                  </node>
                                                  <node concept="2AHcQZ" id="8w" role="2AJF6D">
                                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                                  </node>
                                                </node>
                                                <node concept="3clFb_" id="7Q" role="jymVt">
                                                  <property role="1EzhhJ" value="false" />
                                                  <property role="TrG5h" value="getReferenceText" />
                                                  <node concept="17QB3L" id="8A" role="3clF45" />
                                                  <node concept="3Tm1VV" id="8B" role="1B3o_S" />
                                                  <node concept="37vLTG" id="8C" role="3clF46">
                                                    <property role="TrG5h" value="contextNode" />
                                                    <node concept="3Tqbb2" id="8H" role="1tU5fm" />
                                                  </node>
                                                  <node concept="37vLTG" id="8D" role="3clF46">
                                                    <property role="TrG5h" value="node" />
                                                    <node concept="3Tqbb2" id="8I" role="1tU5fm" />
                                                    <node concept="2AHcQZ" id="8J" role="2AJF6D">
                                                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                                                    </node>
                                                  </node>
                                                  <node concept="2AHcQZ" id="8E" role="2AJF6D">
                                                    <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                                                  </node>
                                                  <node concept="3clFbS" id="8F" role="3clF47">
                                                    <node concept="3cpWs6" id="8K" role="3cqZAp">
                                                      <node concept="10Nm6u" id="8L" role="3cqZAk" />
                                                    </node>
                                                  </node>
                                                  <node concept="2AHcQZ" id="8G" role="2AJF6D">
                                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3clFbH" id="7J" role="3cqZAp" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="7D" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="7i" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6E" role="3cqZAp">
          <node concept="37vLTw" id="8M" role="3clFbG">
            <ref role="3cqZAo" node="6F" resolve="references" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6_" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="8N">
    <property role="3GE5qa" value="Constraints" />
    <property role="TrG5h" value="TestNodeReference_Constraints" />
    <node concept="3Tm1VV" id="8O" role="1B3o_S" />
    <node concept="3uibUv" id="8P" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
    </node>
    <node concept="3clFbW" id="8Q" role="jymVt">
      <node concept="3cqZAl" id="8T" role="3clF45" />
      <node concept="3clFbS" id="8U" role="3clF47">
        <node concept="XkiVB" id="8W" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <node concept="2YIFZM" id="8X" role="37wK5m">
            <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
            <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SConcept" resolve="getConcept" />
            <node concept="1adDum" id="8Y" role="37wK5m">
              <property role="1adDun" value="0x8585453e6bfb4d80L" />
            </node>
            <node concept="1adDum" id="8Z" role="37wK5m">
              <property role="1adDun" value="0x98deb16074f1d86cL" />
            </node>
            <node concept="1adDum" id="90" role="37wK5m">
              <property role="1adDun" value="0x119e1d33213L" />
            </node>
            <node concept="Xl_RD" id="91" role="37wK5m">
              <property role="Xl_RC" value="jetbrains.mps.lang.test.structure.TestNodeReference" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="8V" role="1B3o_S" />
    </node>
    <node concept="2tJIrI" id="8R" role="jymVt" />
    <node concept="3clFb_" id="8S" role="jymVt">
      <property role="IEkAT" value="false" />
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedReferences" />
      <property role="DiZV1" value="false" />
      <node concept="3Tmbuc" id="92" role="1B3o_S" />
      <node concept="3uibUv" id="93" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <node concept="3uibUv" id="96" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
        </node>
        <node concept="3uibUv" id="97" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
        </node>
      </node>
      <node concept="3clFbS" id="94" role="3clF47">
        <node concept="3cpWs8" id="98" role="3cqZAp">
          <node concept="3cpWsn" id="9b" role="3cpWs9">
            <property role="TrG5h" value="references" />
            <node concept="3uibUv" id="9c" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <node concept="3uibUv" id="9e" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
              </node>
              <node concept="3uibUv" id="9f" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
              </node>
            </node>
            <node concept="2ShNRf" id="9d" role="33vP2m">
              <node concept="1pGfFk" id="9g" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <node concept="3uibUv" id="9h" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SReferenceLink" resolve="SReferenceLink" />
                </node>
                <node concept="3uibUv" id="9i" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~ReferenceConstraintsDescriptor" resolve="ReferenceConstraintsDescriptor" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="99" role="3cqZAp">
          <node concept="2OqwBi" id="9j" role="3clFbG">
            <node concept="37vLTw" id="9k" role="2Oq$k0">
              <ref role="3cqZAo" node="9b" resolve="references" />
            </node>
            <node concept="liA8E" id="9l" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object):java.lang.Object" resolve="put" />
              <node concept="2YIFZM" id="9m" role="37wK5m">
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getReferenceLink(long,long,long,long,java.lang.String):org.jetbrains.mps.openapi.language.SReferenceLink" resolve="getReferenceLink" />
                <node concept="1adDum" id="9o" role="37wK5m">
                  <property role="1adDun" value="0x8585453e6bfb4d80L" />
                </node>
                <node concept="1adDum" id="9p" role="37wK5m">
                  <property role="1adDun" value="0x98deb16074f1d86cL" />
                </node>
                <node concept="1adDum" id="9q" role="37wK5m">
                  <property role="1adDun" value="0x119e1d33213L" />
                </node>
                <node concept="1adDum" id="9r" role="37wK5m">
                  <property role="1adDun" value="0x119e1d356c6L" />
                </node>
                <node concept="Xl_RD" id="9s" role="37wK5m">
                  <property role="Xl_RC" value="declaration" />
                </node>
              </node>
              <node concept="2ShNRf" id="9n" role="37wK5m">
                <node concept="YeOm9" id="9t" role="2ShVmc">
                  <node concept="1Y3b0j" id="9u" role="YeSDq">
                    <property role="2bfB8j" value="true" />
                    <ref role="1Y3XeK" to="79pl:~BaseReferenceConstraintsDescriptor" resolve="BaseReferenceConstraintsDescriptor" />
                    <ref role="37wK5l" to="79pl:~BaseReferenceConstraintsDescriptor.&lt;init&gt;(jetbrains.mps.smodel.adapter.ids.SReferenceLinkId,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BaseReferenceConstraintsDescriptor" />
                    <node concept="2YIFZM" id="9v" role="37wK5m">
                      <ref role="1Pybhc" to="e8bb:~MetaIdFactory" resolve="MetaIdFactory" />
                      <ref role="37wK5l" to="e8bb:~MetaIdFactory.refId(long,long,long,long):jetbrains.mps.smodel.adapter.ids.SReferenceLinkId" resolve="refId" />
                      <node concept="1adDum" id="9$" role="37wK5m">
                        <property role="1adDun" value="0x8585453e6bfb4d80L" />
                      </node>
                      <node concept="1adDum" id="9_" role="37wK5m">
                        <property role="1adDun" value="0x98deb16074f1d86cL" />
                      </node>
                      <node concept="1adDum" id="9A" role="37wK5m">
                        <property role="1adDun" value="0x119e1d33213L" />
                      </node>
                      <node concept="1adDum" id="9B" role="37wK5m">
                        <property role="1adDun" value="0x119e1d356c6L" />
                      </node>
                    </node>
                    <node concept="3Tm1VV" id="9w" role="1B3o_S" />
                    <node concept="Xjq3P" id="9x" role="37wK5m" />
                    <node concept="3clFb_" id="9y" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="hasOwnScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="9C" role="1B3o_S" />
                      <node concept="10P_77" id="9D" role="3clF45" />
                      <node concept="3clFbS" id="9E" role="3clF47">
                        <node concept="3clFbF" id="9G" role="3cqZAp">
                          <node concept="3clFbT" id="9H" role="3clFbG">
                            <property role="3clFbU" value="true" />
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="9F" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                    <node concept="3clFb_" id="9z" role="jymVt">
                      <property role="IEkAT" value="false" />
                      <property role="1EzhhJ" value="false" />
                      <property role="TrG5h" value="getScopeProvider" />
                      <property role="DiZV1" value="false" />
                      <node concept="3Tm1VV" id="9I" role="1B3o_S" />
                      <node concept="3uibUv" id="9J" role="3clF45">
                        <ref role="3uigEE" to="ze1i:~ReferenceScopeProvider" resolve="ReferenceScopeProvider" />
                      </node>
                      <node concept="2AHcQZ" id="9K" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      </node>
                      <node concept="3clFbS" id="9L" role="3clF47">
                        <node concept="3cpWs6" id="9N" role="3cqZAp">
                          <node concept="2ShNRf" id="9O" role="3cqZAk">
                            <node concept="YeOm9" id="9P" role="2ShVmc">
                              <node concept="1Y3b0j" id="9Q" role="YeSDq">
                                <property role="2bfB8j" value="true" />
                                <ref role="1Y3XeK" to="79pl:~BaseScopeProvider" resolve="BaseScopeProvider" />
                                <ref role="37wK5l" to="79pl:~BaseScopeProvider.&lt;init&gt;()" resolve="BaseScopeProvider" />
                                <node concept="3Tm1VV" id="9R" role="1B3o_S" />
                                <node concept="3clFb_" id="9S" role="jymVt">
                                  <property role="TrG5h" value="getSearchScopeValidatorNode" />
                                  <node concept="3Tm1VV" id="9U" role="1B3o_S" />
                                  <node concept="3clFbS" id="9V" role="3clF47">
                                    <node concept="3cpWs6" id="9Y" role="3cqZAp">
                                      <node concept="1dyn4i" id="9Z" role="3cqZAk">
                                        <property role="1zomUR" value="true" />
                                        <property role="1dyqJU" value="breakingNode" />
                                        <node concept="2ShNRf" id="a0" role="1dyrYi">
                                          <node concept="1pGfFk" id="a1" role="2ShVmc">
                                            <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                            <node concept="Xl_RD" id="a2" role="37wK5m">
                                              <property role="Xl_RC" value="r:00000000-0000-4000-0000-011c89590382(jetbrains.mps.lang.test.constraints)" />
                                            </node>
                                            <node concept="Xl_RD" id="a3" role="37wK5m">
                                              <property role="Xl_RC" value="6836281137582846018" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="3uibUv" id="9W" role="3clF45">
                                    <ref role="3uigEE" to="mhbf:~SNodeReference" resolve="SNodeReference" />
                                  </node>
                                  <node concept="2AHcQZ" id="9X" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                                <node concept="3clFb_" id="9T" role="jymVt">
                                  <property role="IEkAT" value="false" />
                                  <property role="1EzhhJ" value="false" />
                                  <property role="TrG5h" value="createScope" />
                                  <property role="DiZV1" value="false" />
                                  <node concept="37vLTG" id="a4" role="3clF46">
                                    <property role="TrG5h" value="operationContext" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="aa" role="1tU5fm">
                                      <ref role="3uigEE" to="w1kc:~IOperationContext" resolve="IOperationContext" />
                                    </node>
                                  </node>
                                  <node concept="37vLTG" id="a5" role="3clF46">
                                    <property role="TrG5h" value="_context" />
                                    <property role="3TUv4t" value="true" />
                                    <node concept="3uibUv" id="ab" role="1tU5fm">
                                      <ref role="3uigEE" to="ze1i:~ReferenceConstraintsContext" resolve="ReferenceConstraintsContext" />
                                    </node>
                                  </node>
                                  <node concept="3Tm1VV" id="a6" role="1B3o_S" />
                                  <node concept="3uibUv" id="a7" role="3clF45">
                                    <ref role="3uigEE" to="35tq:~Scope" resolve="Scope" />
                                  </node>
                                  <node concept="3clFbS" id="a8" role="3clF47">
                                    <node concept="9aQIb" id="ac" role="3cqZAp">
                                      <node concept="3clFbS" id="ad" role="9aQI4">
                                        <node concept="3clFbJ" id="ae" role="3cqZAp">
                                          <node concept="3clFbS" id="aj" role="3clFbx">
                                            <node concept="3cpWs6" id="al" role="3cqZAp">
                                              <node concept="2YIFZM" id="am" role="3cqZAk">
                                                <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
                                                <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
                                                <node concept="2ShNRf" id="an" role="37wK5m">
                                                  <node concept="2T8Vx0" id="ao" role="2ShVmc">
                                                    <node concept="2I9FWS" id="ap" role="2T96Bj">
                                                      <ref role="2I9WkF" to="tp5g:hBxLA2s" resolve="TestNodeAnnotation" />
                                                    </node>
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                          <node concept="3y3z36" id="ak" role="3clFbw">
                                            <node concept="2OqwBi" id="aq" role="3uHU7B">
                                              <node concept="1DoJHT" id="as" role="2Oq$k0">
                                                <property role="1Dpdpm" value="getContextNode" />
                                                <node concept="3uibUv" id="au" role="1Ez5kq">
                                                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                </node>
                                                <node concept="37vLTw" id="av" role="1EMhIo">
                                                  <ref role="3cqZAo" node="a5" resolve="_context" />
                                                </node>
                                              </node>
                                              <node concept="2Xjw5R" id="at" role="2OqNvi">
                                                <node concept="1xMEDy" id="aw" role="1xVPHs">
                                                  <node concept="chp4Y" id="ax" role="ri$Ld">
                                                    <ref role="cht4Q" to="tp5g:hHqefK1" resolve="TestNode" />
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                            <node concept="10Nm6u" id="ar" role="3uHU7w" />
                                          </node>
                                        </node>
                                        <node concept="3cpWs8" id="af" role="3cqZAp">
                                          <node concept="3cpWsn" id="ay" role="3cpWs9">
                                            <property role="TrG5h" value="test" />
                                            <node concept="3Tqbb2" id="az" role="1tU5fm" />
                                            <node concept="2OqwBi" id="a$" role="33vP2m">
                                              <node concept="1DoJHT" id="a_" role="2Oq$k0">
                                                <property role="1Dpdpm" value="getContextNode" />
                                                <node concept="3uibUv" id="aB" role="1Ez5kq">
                                                  <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
                                                </node>
                                                <node concept="37vLTw" id="aC" role="1EMhIo">
                                                  <ref role="3cqZAo" node="a5" resolve="_context" />
                                                </node>
                                              </node>
                                              <node concept="2Xjw5R" id="aA" role="2OqNvi">
                                                <node concept="3gmYPX" id="aD" role="1xVPHs">
                                                  <node concept="3gn64h" id="aF" role="3gmYPZ">
                                                    <ref role="3gnhBz" to="tp5g:hHlH9T6" resolve="NodesTestCase" />
                                                  </node>
                                                  <node concept="3gn64h" id="aG" role="3gmYPZ">
                                                    <ref role="3gnhBz" to="tp5g:hSLiM3w" resolve="EditorTestCase" />
                                                  </node>
                                                </node>
                                                <node concept="1xIGOp" id="aE" role="1xVPHs" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3cpWs8" id="ag" role="3cqZAp">
                                          <node concept="3cpWsn" id="aH" role="3cpWs9">
                                            <property role="TrG5h" value="result" />
                                            <node concept="2I9FWS" id="aI" role="1tU5fm">
                                              <ref role="2I9WkF" to="tp5g:hBxLA2s" resolve="TestNodeAnnotation" />
                                            </node>
                                            <node concept="2ShNRf" id="aJ" role="33vP2m">
                                              <node concept="2T8Vx0" id="aK" role="2ShVmc">
                                                <node concept="2I9FWS" id="aL" role="2T96Bj">
                                                  <ref role="2I9WkF" to="tp5g:hBxLA2s" resolve="TestNodeAnnotation" />
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3clFbJ" id="ah" role="3cqZAp">
                                          <node concept="3y3z36" id="aM" role="3clFbw">
                                            <node concept="10Nm6u" id="aO" role="3uHU7w" />
                                            <node concept="37vLTw" id="aP" role="3uHU7B">
                                              <ref role="3cqZAo" node="ay" resolve="test" />
                                            </node>
                                          </node>
                                          <node concept="3clFbS" id="aN" role="3clFbx">
                                            <node concept="2Gpval" id="aQ" role="3cqZAp">
                                              <node concept="2GrKxI" id="aR" role="2Gsz3X">
                                                <property role="TrG5h" value="node" />
                                              </node>
                                              <node concept="2OqwBi" id="aS" role="2GsD0m">
                                                <node concept="37vLTw" id="aU" role="2Oq$k0">
                                                  <ref role="3cqZAo" node="ay" resolve="test" />
                                                </node>
                                                <node concept="2Rf3mk" id="aV" role="2OqNvi">
                                                  <node concept="1xMEDy" id="aW" role="1xVPHs">
                                                    <node concept="chp4Y" id="aY" role="ri$Ld">
                                                      <ref role="cht4Q" to="tp5g:hBxLA2s" resolve="TestNodeAnnotation" />
                                                    </node>
                                                  </node>
                                                  <node concept="1xIGOp" id="aX" role="1xVPHs" />
                                                </node>
                                              </node>
                                              <node concept="3clFbS" id="aT" role="2LFqv$">
                                                <node concept="3clFbF" id="aZ" role="3cqZAp">
                                                  <node concept="2OqwBi" id="b0" role="3clFbG">
                                                    <node concept="37vLTw" id="b1" role="2Oq$k0">
                                                      <ref role="3cqZAo" node="aH" resolve="result" />
                                                    </node>
                                                    <node concept="TSZUe" id="b2" role="2OqNvi">
                                                      <node concept="2GrUjf" id="b3" role="25WWJ7">
                                                        <ref role="2Gs0qQ" node="aR" resolve="node" />
                                                      </node>
                                                    </node>
                                                  </node>
                                                </node>
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="3cpWs6" id="ai" role="3cqZAp">
                                          <node concept="2YIFZM" id="b4" role="3cqZAk">
                                            <ref role="37wK5l" to="o8zo:3jEbQoczdCs" resolve="forResolvableElements" />
                                            <ref role="1Pybhc" to="o8zo:4IP40Bi3e_R" resolve="ListScope" />
                                            <node concept="37vLTw" id="b5" role="37wK5m">
                                              <ref role="3cqZAo" node="aH" resolve="result" />
                                            </node>
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="2AHcQZ" id="a9" role="2AJF6D">
                                    <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="2AHcQZ" id="9M" role="2AJF6D">
                        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="9a" role="3cqZAp">
          <node concept="37vLTw" id="b6" role="3clFbG">
            <ref role="3cqZAo" node="9b" resolve="references" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="95" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
    </node>
  </node>
</model>

