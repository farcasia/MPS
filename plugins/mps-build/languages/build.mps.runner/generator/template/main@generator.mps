<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:1c8c1989-0591-468a-b1d1-b72fb2712738(jetbrains.mps.build.mps.runner.generator.template.main@generator)">
  <persistence version="9" />
  <languages>
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="0" />
    <use id="427a473d-5177-432c-9905-bcbceb71b996" name="jetbrains.mps.build.mps.runner" version="0" />
    <use id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext" version="0" />
    <use id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core" version="1" />
    <use id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build" version="0" />
    <use id="698a8d22-a104-47a0-ba8d-10e3ec237f13" name="jetbrains.mps.build.workflow" version="0" />
    <use id="479c7a8c-02f9-43b5-9139-d910cb22f298" name="jetbrains.mps.core.xml" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="g07" ref="r:fdebfc98-bbd7-4c50-8a8d-eda16da9406e(jetbrains.mps.build.generator.template.main@generator)" />
    <import index="tken" ref="r:38bad86e-d92c-4ea7-ad52-a111dc6c2457(jetbrains.mps.build.mps.util)" />
    <import index="o3n2" ref="r:26eadcf0-f275-4e90-be37-e4432772a74d(jetbrains.mps.build.util)" />
    <import index="kdzh" ref="r:0353b795-df17-4050-9687-ee47eeb7094f(jetbrains.mps.build.mps.structure)" />
    <import index="as3y" ref="r:0f2b4a26-93a1-4327-97ef-ca91b7a4cf5e(jetbrains.mps.build.mps.runner.structure)" implicit="true" />
    <import index="boe" ref="r:4e917293-f5b9-4023-b36a-fcf2132c435c(jetbrains.mps.build.mps.runner.accessories)" implicit="true" />
    <import index="arit" ref="r:0d66e868-9778-4307-b6f9-4795c00f662f(jetbrains.mps.build.workflow.preset.general)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="3ior" ref="r:e9081cad-d8c3-45f2-b4ad-1dabd5ff82af(jetbrains.mps.build.structure)" implicit="true" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" implicit="true" />
    <import index="2txq" ref="r:2c8fa2a8-11a0-4729-bd56-47f702d30278(jetbrains.mps.build.mps.behavior)" implicit="true" />
    <import index="tos2" ref="r:19e846e2-aa6a-48a9-8367-2a1eda2709e7(jetbrains.mps.build.mps.runner.behavior)" implicit="true" />
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
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="2820489544401957797" name="jetbrains.mps.baseLanguage.structure.DefaultClassCreator" flags="nn" index="HV5vD">
        <reference id="2820489544401957798" name="classifier" index="HV5vE" />
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
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886294" name="jetbrains.mps.baseLanguage.structure.AssignmentExpression" flags="nn" index="37vLTI" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="1225271408483" name="jetbrains.mps.baseLanguage.structure.IsNotEmptyOperation" flags="nn" index="17RvpY" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1079359253375" name="jetbrains.mps.baseLanguage.structure.ParenthesizedExpression" flags="nn" index="1eOMI4">
        <child id="1079359253376" name="expression" index="1eOMHV" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="6329021646629104957" name="jetbrains.mps.baseLanguage.structure.TextCommentPart" flags="nn" index="3SKdUq">
        <property id="6329021646629104958" name="text" index="3SKdUp" />
      </concept>
      <concept id="6329021646629104954" name="jetbrains.mps.baseLanguage.structure.SingleLineComment" flags="nn" index="3SKdUt">
        <child id="6329021646629175155" name="commentPart" index="3SKWNk" />
      </concept>
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="698a8d22-a104-47a0-ba8d-10e3ec237f13" name="jetbrains.mps.build.workflow">
      <concept id="7306485738221471031" name="jetbrains.mps.build.workflow.structure.BwfTaskLibraryDependency" flags="ng" index="ygXWA">
        <reference id="7306485738221471032" name="target" index="ygXWD" />
      </concept>
      <concept id="2769948622284574294" name="jetbrains.mps.build.workflow.structure.BwfTaskDependency" flags="ng" index="2VaxJe">
        <reference id="2769948622284574295" name="target" index="2VaxJf" />
      </concept>
      <concept id="2769948622284546675" name="jetbrains.mps.build.workflow.structure.BwfTask" flags="ng" index="2VaFvF">
        <child id="2769948622284574302" name="dependencies" index="2VaxJ6" />
        <child id="2769948622284546679" name="subTasks" index="2VaFvJ" />
      </concept>
      <concept id="2769948622284546677" name="jetbrains.mps.build.workflow.structure.BwfSubTask" flags="ng" index="2VaFvH">
        <child id="2769948622284606050" name="statements" index="2VaTZU" />
      </concept>
      <concept id="2769948622284605979" name="jetbrains.mps.build.workflow.structure.BwfStatement" flags="ng" index="2VaTY3" />
      <concept id="2769948622284768359" name="jetbrains.mps.build.workflow.structure.BwfAntStatement" flags="ng" index="2Vbh7Z">
        <child id="2769948622284768360" name="element" index="2Vbh7K" />
      </concept>
      <concept id="3961775458390032824" name="jetbrains.mps.build.workflow.structure.BwfTaskPart" flags="ng" index="3bMsLL">
        <reference id="3961775458390032825" name="task" index="3bMsLK" />
        <child id="3961775458390352322" name="additionalDependencies" index="3bNaKb" />
      </concept>
    </language>
    <language id="479c7a8c-02f9-43b5-9139-d910cb22f298" name="jetbrains.mps.core.xml">
      <concept id="6666499814681541919" name="jetbrains.mps.core.xml.structure.XmlTextValue" flags="ng" index="2pMdtt">
        <property id="6666499814681541920" name="text" index="2pMdty" />
      </concept>
      <concept id="6666499814681415858" name="jetbrains.mps.core.xml.structure.XmlElement" flags="ng" index="2pNNFK">
        <property id="6666499814681415862" name="tagName" index="2pNNFO" />
        <property id="6999033275467544021" name="shortEmptyNotation" index="qg3DV" />
        <child id="6666499814681415861" name="attributes" index="2pNNFR" />
        <child id="1622293396948928802" name="content" index="3o6s8t" />
      </concept>
      <concept id="6666499814681447923" name="jetbrains.mps.core.xml.structure.XmlAttribute" flags="ng" index="2pNUuL">
        <property id="6666499814681447926" name="attrName" index="2pNUuO" />
        <child id="6666499814681541918" name="value" index="2pMdts" />
      </concept>
      <concept id="1622293396948952339" name="jetbrains.mps.core.xml.structure.XmlText" flags="nn" index="3o6iSG" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1167328349397" name="reductionMappingRule" index="3acgRq" />
      </concept>
      <concept id="1177093525992" name="jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence" flags="lg" index="gft3U">
        <child id="1177093586806" name="templateNode" index="gfFT$" />
      </concept>
      <concept id="5015072279636464462" name="jetbrains.mps.lang.generator.structure.VarMacro" flags="lg" index="2jeGV$">
        <child id="5015072279636624635" name="type" index="2jfP_h" />
        <child id="5015072279636624596" name="value" index="2jfP_Y" />
      </concept>
      <concept id="5015072279636592410" name="jetbrains.mps.lang.generator.structure.VarMacro_ValueQuery" flags="in" index="2jfdEK" />
      <concept id="1168559333462" name="jetbrains.mps.lang.generator.structure.TemplateDeclarationReference" flags="ln" index="j$656" />
      <concept id="1112730859144" name="jetbrains.mps.lang.generator.structure.TemplateSwitch" flags="ig" index="jVnub">
        <reference id="1112820671508" name="modifiedSwitch" index="phYkn" />
        <child id="1167340453568" name="reductionMappingRule" index="3aUrZf" />
      </concept>
      <concept id="1095672379244" name="jetbrains.mps.lang.generator.structure.TemplateFragment" flags="ng" index="raruj" />
      <concept id="1722980698497626400" name="jetbrains.mps.lang.generator.structure.ITemplateCall" flags="ng" index="v9R3L">
        <reference id="1722980698497626483" name="template" index="v9R2y" />
      </concept>
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
      </concept>
      <concept id="1092059087312" name="jetbrains.mps.lang.generator.structure.TemplateDeclaration" flags="ig" index="13MO4I">
        <reference id="1168285871518" name="applicableConcept" index="3gUMe" />
        <child id="1092060348987" name="contentNode" index="13RCb5" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167327847730" name="jetbrains.mps.lang.generator.structure.Reduction_MappingRule" flags="lg" index="3aamgX">
        <child id="1169672767469" name="ruleConsequence" index="1lVwrX" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167945743726" name="jetbrains.mps.lang.generator.structure.IfMacro_Condition" flags="in" index="3IZrLx" />
      <concept id="1167951910403" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery" flags="in" index="3JmXsc" />
      <concept id="1118773211870" name="jetbrains.mps.lang.generator.structure.IfMacro" flags="ln" index="1W57fq">
        <child id="1167945861827" name="conditionFunction" index="3IZSJc" />
      </concept>
      <concept id="1118786554307" name="jetbrains.mps.lang.generator.structure.LoopMacro" flags="ln" index="1WS0z7">
        <child id="1167952069335" name="sourceNodesQuery" index="3Jn$fo" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext">
      <concept id="2721957369897614808" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_VarRef" flags="nn" index="1bhEwm">
        <reference id="2721957369897614810" name="varmacro" index="1bhEwk" />
      </concept>
      <concept id="1216860049635" name="jetbrains.mps.lang.generator.generationContext.structure.TemplateFunctionParameter_generationContext" flags="nn" index="1iwH7S" />
    </language>
    <language id="3a13115c-633c-4c5c-bbcc-75c4219e9555" name="jetbrains.mps.lang.quotation">
      <concept id="5455284157993911077" name="jetbrains.mps.lang.quotation.structure.NodeBuilderInitProperty" flags="ng" index="2pJxcG">
        <reference id="5455284157993911078" name="property" index="2pJxcJ" />
      </concept>
      <concept id="5455284157993911097" name="jetbrains.mps.lang.quotation.structure.NodeBuilderInitPart" flags="ng" index="2pJxcK">
        <child id="5455284157993911094" name="expression" index="2pJxcZ" />
      </concept>
      <concept id="5455284157993863837" name="jetbrains.mps.lang.quotation.structure.NodeBuilder" flags="nn" index="2pJPEk">
        <child id="5455284157993863838" name="quotedNode" index="2pJPEn" />
      </concept>
      <concept id="5455284157993863840" name="jetbrains.mps.lang.quotation.structure.NodeBuilderNode" flags="nn" index="2pJPED">
        <reference id="5455284157993910961" name="concept" index="2pJxaS" />
        <child id="5455284157993911099" name="values" index="2pJxcM" />
      </concept>
    </language>
    <language id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build">
      <concept id="5617550519002745364" name="jetbrains.mps.build.structure.BuildLayout" flags="ng" index="1l3spV" />
      <concept id="5617550519002745363" name="jetbrains.mps.build.structure.BuildProject" flags="ng" index="1l3spW">
        <child id="3542413272732620719" name="aspects" index="1hWBAP" />
        <child id="5617550519002745372" name="layout" index="1l3spN" />
      </concept>
      <concept id="4701820937132281259" name="jetbrains.mps.build.structure.BuildCustomWorkflow" flags="ng" index="1y0Vig">
        <child id="4701820937132281260" name="parts" index="1y0Vin" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1179409122411" name="jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall" flags="nn" index="2qgKlT" />
      <concept id="4693937538533521280" name="jetbrains.mps.lang.smodel.structure.OfConceptOperation" flags="ng" index="v3k3i">
        <child id="4693937538533538124" name="requestedConcept" index="v3oSu" />
      </concept>
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1145404486709" name="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" flags="nn" index="2JrnkZ">
        <child id="1145404616321" name="leftExpression" index="2JrQYb" />
      </concept>
      <concept id="1171310072040" name="jetbrains.mps.lang.smodel.structure.Node_GetContainingRootOperation" flags="nn" index="2Rxl7S" />
      <concept id="2644386474302386080" name="jetbrains.mps.lang.smodel.structure.PropertyIdRefExpression" flags="nn" index="355D3s">
        <reference id="2644386474302386081" name="conceptDeclaration" index="355D3t" />
        <reference id="2644386474302386082" name="propertyDeclaration" index="355D3u" />
      </concept>
      <concept id="1172008320231" name="jetbrains.mps.lang.smodel.structure.Node_IsNotNullOperation" flags="nn" index="3x8VRR" />
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI">
        <property id="1238684351431" name="asCast" index="1BlNFB" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
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
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="1151689724996" name="jetbrains.mps.baseLanguage.collections.structure.SequenceType" flags="in" index="A3Dl8">
        <child id="1151689745422" name="elementType" index="A3Ik2" />
      </concept>
      <concept id="1235573135402" name="jetbrains.mps.baseLanguage.collections.structure.SingletonSequenceCreator" flags="nn" index="2HTt$P">
        <child id="1235573175711" name="elementType" index="2HTBi0" />
        <child id="1235573187520" name="singletonValue" index="2HTEbv" />
      </concept>
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1240325842691" name="jetbrains.mps.baseLanguage.collections.structure.AsSequenceOperation" flags="nn" index="39bAoz" />
      <concept id="1165525191778" name="jetbrains.mps.baseLanguage.collections.structure.GetFirstOperation" flags="nn" index="1uHKPH" />
      <concept id="1202128969694" name="jetbrains.mps.baseLanguage.collections.structure.SelectOperation" flags="nn" index="3$u5V9" />
    </language>
  </registry>
  <node concept="bUwia" id="3BExUgsJD1S">
    <property role="TrG5h" value="main" />
    <node concept="3aamgX" id="3BExUgsKe0l" role="3acgRq">
      <ref role="30HIoZ" to="as3y:3BExUgsK89Y" resolve="BuildSolutionRunnerAspect" />
      <node concept="j$656" id="3BExUgsKe0m" role="1lVwrX">
        <ref role="v9R2y" node="3BExUgsKe0j" resolve="reduce_BuildSolutionRunnerAspect" />
      </node>
    </node>
  </node>
  <node concept="13MO4I" id="3BExUgsKe0j">
    <property role="TrG5h" value="reduce_BuildSolutionRunnerAspect" />
    <ref role="3gUMe" to="as3y:3BExUgsK89Y" resolve="BuildSolutionRunnerAspect" />
    <node concept="1l3spW" id="3BExUgsKgFP" role="13RCb5">
      <property role="TrG5h" value="_project" />
      <node concept="1y0Vig" id="3BExUgsKkP9" role="1hWBAP">
        <node concept="3bMsLL" id="3BExUgsKlLR" role="1y0Vin">
          <ref role="3bMsLK" to="boe:3BExUgsK9tI" resolve="run-mps-code" />
          <node concept="2VaxJe" id="3BExUgsKp_n" role="3bNaKb">
            <ref role="2VaxJf" node="3BExUgsKmIZ" resolve="run" />
          </node>
        </node>
        <node concept="2VaFvF" id="3BExUgsKmIZ" role="1y0Vin">
          <property role="TrG5h" value="run" />
          <node concept="2VaxJe" id="7bEMOo$2ApT" role="2VaxJ6">
            <ref role="2VaxJf" to="arit:450ejGzgRPq" resolve="assemble" />
          </node>
          <node concept="2VaFvH" id="3pzPpUGhPUI" role="2VaFvJ">
            <property role="TrG5h" value="runCodeInMps" />
            <node concept="2Vbh7Z" id="3pzPpUGhke$" role="2VaTZU">
              <node concept="2pNNFK" id="3pzPpUGhkJk" role="2Vbh7K">
                <property role="2pNNFO" value="echo" />
                <node concept="2pNUuL" id="3pzPpUGhkJo" role="2pNNFR">
                  <property role="2pNUuO" value="message" />
                  <node concept="2pMdtt" id="3pzPpUGhkJq" role="2pMdts">
                    <property role="2pMdty" value="starting code in MPS" />
                    <node concept="17Uvod" id="3pzPpUGhkJs" role="lGtFl">
                      <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                      <property role="2qtEX9" value="text" />
                      <node concept="3zFVjK" id="3pzPpUGhkJt" role="3zH0cK">
                        <node concept="3clFbS" id="3pzPpUGhkJu" role="2VODD2">
                          <node concept="3clFbF" id="3pzPpUGhkM8" role="3cqZAp">
                            <node concept="3cpWs3" id="3pzPpUGhlPQ" role="3clFbG">
                              <node concept="Xl_RD" id="3pzPpUGhlPW" role="3uHU7w">
                                <property role="Xl_RC" value=" solution in MPS" />
                              </node>
                              <node concept="3cpWs3" id="3pzPpUGhl8r" role="3uHU7B">
                                <node concept="Xl_RD" id="3pzPpUGhleo" role="3uHU7B">
                                  <property role="Xl_RC" value="Running code from " />
                                </node>
                                <node concept="2OqwBi" id="1Vi5mb_Ao03" role="3uHU7w">
                                  <node concept="2OqwBi" id="3pzPpUGhkQ_" role="2Oq$k0">
                                    <node concept="30H73N" id="3pzPpUGhkM7" role="2Oq$k0" />
                                    <node concept="3TrEf2" id="5iKxrmkthif" role="2OqNvi">
                                      <ref role="3Tt5mk" to="as3y:5iKxrmkn6qh" resolve="solution" />
                                    </node>
                                  </node>
                                  <node concept="3TrcHB" id="5iKxrmkthM5" role="2OqNvi">
                                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
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
            <node concept="2VaTY3" id="3pzPpUGighk" role="2VaTZU" />
            <node concept="2Vbh7Z" id="3BExUgsKUkr" role="2VaTZU">
              <node concept="2pNNFK" id="3BExUgsKUuU" role="2Vbh7K">
                <property role="2pNNFO" value="runMPS" />
                <node concept="2pNNFK" id="3pzPpUGijlR" role="3o6s8t">
                  <property role="qg3DV" value="true" />
                  <property role="2pNNFO" value="library" />
                  <node concept="2pNUuL" id="3pzPpUGijlS" role="2pNNFR">
                    <property role="2pNUuO" value="file" />
                    <node concept="2pMdtt" id="3pzPpUGijlT" role="2pMdts">
                      <property role="2pMdty" value="lib.module.location.jar" />
                      <node concept="17Uvod" id="3pzPpUGijlU" role="lGtFl">
                        <property role="2qtEX9" value="text" />
                        <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                        <node concept="3zFVjK" id="3pzPpUGijlV" role="3zH0cK">
                          <node concept="3clFbS" id="3pzPpUGijlW" role="2VODD2">
                            <node concept="3clFbF" id="3pzPpUGijlX" role="3cqZAp">
                              <node concept="2OqwBi" id="3pzPpUGijlY" role="3clFbG">
                                <node concept="30H73N" id="3pzPpUGijlZ" role="2Oq$k0" />
                                <node concept="3TrcHB" id="3pzPpUGijm0" role="2OqNvi">
                                  <ref role="3TsBF5" to="kdzh:QkG2t1bKwB" resolve="path" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1WS0z7" id="3pzPpUGimwy" role="lGtFl">
                    <node concept="3JmXsc" id="3pzPpUGimw$" role="3Jn$fo">
                      <node concept="3clFbS" id="3pzPpUGimwA" role="2VODD2">
                        <node concept="3clFbF" id="3pzPpUGimGF" role="3cqZAp">
                          <node concept="2YIFZM" id="3pzPpUGimGH" role="3clFbG">
                            <ref role="37wK5l" to="tken:2whOjLNbAqC" resolve="findModules" />
                            <ref role="1Pybhc" to="tken:2whOjLMElV2" resolve="ModuleFinder" />
                            <node concept="2OqwBi" id="3pzPpUGimGI" role="37wK5m">
                              <node concept="1bhEwm" id="3pzPpUGjE_I" role="2OqNvi">
                                <ref role="1bhEwk" node="3pzPpUGjCed" resolve="libs" />
                              </node>
                              <node concept="1iwH7S" id="3pzPpUGimGK" role="2Oq$k0" />
                            </node>
                            <node concept="1iwH7S" id="3pzPpUGimGL" role="37wK5m" />
                            <node concept="30H73N" id="3pzPpUGimGM" role="37wK5m" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="2pNNFK" id="3pzPpUGimXY" role="3o6s8t">
                  <property role="2pNNFO" value="macro" />
                  <node concept="2pNUuL" id="3pzPpUGimXZ" role="2pNNFR">
                    <property role="2pNUuO" value="name" />
                    <node concept="2pMdtt" id="3pzPpUGimY0" role="2pMdts">
                      <property role="2pMdty" value="name" />
                      <node concept="17Uvod" id="3pzPpUGiPLi" role="lGtFl">
                        <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                        <property role="2qtEX9" value="text" />
                        <node concept="3zFVjK" id="3pzPpUGiPLl" role="3zH0cK">
                          <node concept="3clFbS" id="3pzPpUGiPLm" role="2VODD2">
                            <node concept="3clFbF" id="3pzPpUGiPLs" role="3cqZAp">
                              <node concept="2OqwBi" id="3pzPpUGiPLn" role="3clFbG">
                                <node concept="3TrcHB" id="3pzPpUGiPLq" role="2OqNvi">
                                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                                </node>
                                <node concept="30H73N" id="3pzPpUGiPLr" role="2Oq$k0" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="2pNUuL" id="3pzPpUGimY1" role="2pNNFR">
                    <property role="2pNUuO" value="path" />
                    <node concept="2pMdtt" id="3pzPpUGimY2" role="2pMdts">
                      <property role="2pMdty" value="value" />
                      <node concept="17Uvod" id="3pzPpUGj0Au" role="lGtFl">
                        <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                        <property role="2qtEX9" value="text" />
                        <node concept="3zFVjK" id="3pzPpUGj0Ax" role="3zH0cK">
                          <node concept="3clFbS" id="3pzPpUGj0Ay" role="2VODD2">
                            <node concept="3clFbF" id="3pzPpUGj0AC" role="3cqZAp">
                              <node concept="3cpWs3" id="3pzPpUGj1Uq" role="3clFbG">
                                <node concept="Xl_RD" id="3pzPpUGj1Uw" role="3uHU7w">
                                  <property role="Xl_RC" value="}" />
                                </node>
                                <node concept="3cpWs3" id="3pzPpUGj0KP" role="3uHU7B">
                                  <node concept="Xl_RD" id="3pzPpUGj0UM" role="3uHU7B">
                                    <property role="Xl_RC" value="${" />
                                  </node>
                                  <node concept="2OqwBi" id="3pzPpUGj0Az" role="3uHU7w">
                                    <node concept="3TrcHB" id="3pzPpUGj0AA" role="2OqNvi">
                                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                                    </node>
                                    <node concept="30H73N" id="3pzPpUGj0AB" role="2Oq$k0" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1WS0z7" id="3pzPpUGinc1" role="lGtFl">
                    <node concept="3JmXsc" id="3pzPpUGinc3" role="3Jn$fo">
                      <node concept="3clFbS" id="3pzPpUGinc5" role="2VODD2">
                        <node concept="3clFbF" id="3pzPpUGinhq" role="3cqZAp">
                          <node concept="2OqwBi" id="3pzPpUGiWFI" role="3clFbG">
                            <node concept="2OqwBi" id="4lGpBZBKfCm" role="2Oq$k0">
                              <node concept="2OqwBi" id="3pzPpUGjwml" role="2Oq$k0">
                                <node concept="1iwH7S" id="3pzPpUGjw4K" role="2Oq$k0" />
                                <node concept="1bhEwm" id="3pzPpUGjwER" role="2OqNvi">
                                  <ref role="1bhEwk" node="3pzPpUGjpQB" resolve="buildProject" />
                                </node>
                              </node>
                              <node concept="3Tsc0h" id="4lGpBZBKgmS" role="2OqNvi">
                                <ref role="3TtcxE" to="3ior:4RPz6WoY4Cy" resolve="macros" />
                              </node>
                            </node>
                            <node concept="v3k3i" id="3pzPpUGiZzI" role="2OqNvi">
                              <node concept="chp4Y" id="3pzPpUGiZMy" role="v3oSu">
                                <ref role="cht4Q" to="3ior:6qcrfIJFt02" resolve="BuildFolderMacro" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="2pNNFK" id="3pzPpUGinth" role="3o6s8t">
                  <property role="2pNNFO" value="plugin" />
                  <node concept="2pNUuL" id="3pzPpUGinFr" role="2pNNFR">
                    <property role="2pNUuO" value="path" />
                    <node concept="2pMdtt" id="3pzPpUGisrx" role="2pMdts">
                      <property role="2pMdty" value="plugin.jar" />
                      <node concept="17Uvod" id="3pzPpUGisrz" role="lGtFl">
                        <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                        <property role="2qtEX9" value="text" />
                        <node concept="3zFVjK" id="3pzPpUGisr$" role="3zH0cK">
                          <node concept="3clFbS" id="3pzPpUGisr_" role="2VODD2">
                            <node concept="3clFbF" id="3pzPpUGisuE" role="3cqZAp">
                              <node concept="2OqwBi" id="3pzPpUGiszb" role="3clFbG">
                                <node concept="30H73N" id="3pzPpUGisuD" role="2Oq$k0" />
                                <node concept="3TrcHB" id="3pzPpUGitgL" role="2OqNvi">
                                  <ref role="3TsBF5" to="kdzh:QkG2t1bKwB" resolve="path" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1WS0z7" id="3pzPpUGiqD2" role="lGtFl">
                    <node concept="3JmXsc" id="3pzPpUGiqD4" role="3Jn$fo">
                      <node concept="3clFbS" id="3pzPpUGiqD6" role="2VODD2">
                        <node concept="3clFbF" id="3pzPpUGiqJE" role="3cqZAp">
                          <node concept="2OqwBi" id="3pzPpUGiqJG" role="3clFbG">
                            <node concept="3$u5V9" id="3pzPpUGiqJH" role="2OqNvi">
                              <node concept="1bVj0M" id="3pzPpUGiqJI" role="23t8la">
                                <node concept="3clFbS" id="3pzPpUGiqJJ" role="1bW5cS">
                                  <node concept="3clFbF" id="3pzPpUGiqJK" role="3cqZAp">
                                    <node concept="2pJPEk" id="3pzPpUGiqJL" role="3clFbG">
                                      <node concept="2pJPED" id="3pzPpUGiqJM" role="2pJPEn">
                                        <ref role="2pJxaS" to="kdzh:QkG2t1bKw$" resolve="GeneratorInternal_String" />
                                        <node concept="2pJxcG" id="3pzPpUGiqJN" role="2pJxcM">
                                          <ref role="2pJxcJ" to="kdzh:QkG2t1bKwB" resolve="path" />
                                          <node concept="37vLTw" id="3pzPpUGiqJO" role="2pJxcZ">
                                            <ref role="3cqZAo" node="3pzPpUGiqJP" resolve="it" />
                                          </node>
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="Rh6nW" id="3pzPpUGiqJP" role="1bW2Oz">
                                  <property role="TrG5h" value="it" />
                                  <node concept="2jxLKc" id="3pzPpUGiqJQ" role="1tU5fm" />
                                </node>
                              </node>
                            </node>
                            <node concept="2OqwBi" id="3pzPpUGiqJR" role="2Oq$k0">
                              <node concept="39bAoz" id="3pzPpUGiqJS" role="2OqNvi" />
                              <node concept="2OqwBi" id="3pzPpUGiqJT" role="2Oq$k0">
                                <node concept="1bhEwm" id="3pzPpUGiqJU" role="2OqNvi">
                                  <ref role="1bhEwk" node="3pzPpUGgiPp" resolve="requiredPlugins" />
                                </node>
                                <node concept="1iwH7S" id="3pzPpUGiqJV" role="2Oq$k0" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3o6iSG" id="3pzPpUGii_z" role="3o6s8t" />
                <node concept="2pNNFK" id="5iKxrmkoIIQ" role="3o6s8t">
                  <property role="2pNNFO" value="library" />
                  <node concept="2pNUuL" id="5iKxrmkoJ78" role="2pNNFR">
                    <property role="2pNUuO" value="file" />
                    <node concept="2pMdtt" id="5iKxrmkoJf2" role="2pMdts">
                      <property role="2pMdty" value="solution.location.jar" />
                      <node concept="17Uvod" id="5iKxrmkoJf3" role="lGtFl">
                        <property role="2qtEX9" value="text" />
                        <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                        <node concept="3zFVjK" id="5iKxrmkoJf4" role="3zH0cK">
                          <node concept="3clFbS" id="5iKxrmkoJf5" role="2VODD2">
                            <node concept="3clFbF" id="5iKxrmkoJf6" role="3cqZAp">
                              <node concept="2OqwBi" id="5iKxrmkoJf7" role="3clFbG">
                                <node concept="30H73N" id="5iKxrmkoJf8" role="2Oq$k0" />
                                <node concept="3TrcHB" id="5iKxrmkoJf9" role="2OqNvi">
                                  <ref role="3TsBF5" to="kdzh:QkG2t1bKwB" resolve="path" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="1WS0z7" id="5iKxrmkpt_y" role="lGtFl">
                    <node concept="3JmXsc" id="5iKxrmkpt_$" role="3Jn$fo">
                      <node concept="3clFbS" id="5iKxrmkpt_A" role="2VODD2">
                        <node concept="3clFbF" id="5iKxrmkpuP$" role="3cqZAp">
                          <node concept="2YIFZM" id="5iKxrmkpuPA" role="3clFbG">
                            <ref role="1Pybhc" to="tken:2whOjLMElV2" resolve="ModuleFinder" />
                            <ref role="37wK5l" to="tken:2whOjLNbAqC" resolve="findModules" />
                            <node concept="2ShNRf" id="5iKxrmkpv_j" role="37wK5m">
                              <node concept="2HTt$P" id="5iKxrmkpv_h" role="2ShVmc">
                                <node concept="3Tqbb2" id="5iKxrmkpv_i" role="2HTBi0">
                                  <ref role="ehGHo" to="kdzh:hS0KzPONfF" resolve="BuildMps_AbstractModule" />
                                </node>
                                <node concept="2OqwBi" id="5iKxrmkpvXq" role="2HTEbv">
                                  <node concept="30H73N" id="5iKxrmkpvNr" role="2Oq$k0" />
                                  <node concept="3TrEf2" id="5iKxrmkpwwE" role="2OqNvi">
                                    <ref role="3Tt5mk" to="as3y:5iKxrmkn6qh" resolve="solution" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="1iwH7S" id="5iKxrmkpuPE" role="37wK5m" />
                            <node concept="30H73N" id="5iKxrmkpuPF" role="37wK5m" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3o6iSG" id="3pzPpUGjfoX" role="3o6s8t" />
                <node concept="2pNNFK" id="6V3S4eksTK4" role="3o6s8t">
                  <property role="2pNNFO" value="jvmargs" />
                  <property role="qg3DV" value="false" />
                  <node concept="2pNNFK" id="o7F7WgLNWE" role="3o6s8t">
                    <property role="2pNNFO" value="arg" />
                    <node concept="2pNUuL" id="o7F7WgLNWF" role="2pNNFR">
                      <property role="2pNUuO" value="value" />
                      <node concept="2pMdtt" id="o7F7WgLNWG" role="2pMdts">
                        <property role="2pMdty" value="-Didea.config.path=${build.mps.config.path}" />
                      </node>
                    </node>
                  </node>
                  <node concept="2pNNFK" id="o7F7WgLM_B" role="3o6s8t">
                    <property role="2pNNFO" value="arg" />
                    <node concept="2pNUuL" id="o7F7WgLMD1" role="2pNNFR">
                      <property role="2pNUuO" value="value" />
                      <node concept="2pMdtt" id="o7F7WgLMD3" role="2pMdts">
                        <property role="2pMdty" value="-Didea.system.path=${build.mps.system.path}" />
                      </node>
                    </node>
                  </node>
                  <node concept="2pNNFK" id="7RPG7Ru$yTi" role="3o6s8t">
                    <property role="2pNNFO" value="arg" />
                    <property role="qg3DV" value="true" />
                    <node concept="2pNUuL" id="7RPG7Ru_8uH" role="2pNNFR">
                      <property role="2pNUuO" value="value" />
                      <node concept="2pMdtt" id="7RPG7Ru_abQ" role="2pMdts">
                        <property role="2pMdty" value="-Xmx512m" />
                        <node concept="17Uvod" id="7RPG7RuF6QL" role="lGtFl">
                          <property role="2qtEX9" value="text" />
                          <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                          <node concept="3zFVjK" id="7RPG7RuF6QO" role="3zH0cK">
                            <node concept="3clFbS" id="7RPG7RuF6QP" role="2VODD2">
                              <node concept="3cpWs8" id="7RPG7RvcFqU" role="3cqZAp">
                                <node concept="3cpWsn" id="7RPG7RvcFqX" role="3cpWs9">
                                  <property role="TrG5h" value="mpsAspect" />
                                  <node concept="3Tqbb2" id="7RPG7RvcFqS" role="1tU5fm">
                                    <ref role="ehGHo" to="kdzh:5D0zVz80y2D" resolve="BuildMpsAspect" />
                                  </node>
                                  <node concept="2OqwBi" id="jC3lHUGe0X" role="33vP2m">
                                    <node concept="2OqwBi" id="jC3lHUGaUT" role="2Oq$k0">
                                      <node concept="2OqwBi" id="7RPG7Ru_iDC" role="2Oq$k0">
                                        <node concept="3Tsc0h" id="7RPG7Ru_iDD" role="2OqNvi">
                                          <ref role="3TtcxE" to="3ior:34DbxDwQPuJ" resolve="aspects" />
                                        </node>
                                        <node concept="2OqwBi" id="3pzPpUGjxBe" role="2Oq$k0">
                                          <node concept="1iwH7S" id="3pzPpUGjxrr" role="2Oq$k0" />
                                          <node concept="1bhEwm" id="3pzPpUGjxTu" role="2OqNvi">
                                            <ref role="1bhEwk" node="3pzPpUGjpQB" resolve="buildProject" />
                                          </node>
                                        </node>
                                      </node>
                                      <node concept="v3k3i" id="jC3lHUGcXn" role="2OqNvi">
                                        <node concept="chp4Y" id="jC3lHUGdqC" role="v3oSu">
                                          <ref role="cht4Q" to="kdzh:5D0zVz80y2D" resolve="BuildMpsAspect" />
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="1uHKPH" id="jC3lHUGfdr" role="2OqNvi" />
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbH" id="7RPG7RvdXCN" role="3cqZAp" />
                              <node concept="3cpWs8" id="7RPG7Rvcc_E" role="3cqZAp">
                                <node concept="3cpWsn" id="7RPG7Rvcc_H" role="3cpWs9">
                                  <property role="TrG5h" value="heapSize" />
                                  <node concept="10Oyi0" id="7RPG7Rvcc_C" role="1tU5fm" />
                                </node>
                              </node>
                              <node concept="3SKdUt" id="7RPG7RvdlkG" role="3cqZAp">
                                <node concept="3SKdUq" id="7RPG7Rvdmnw" role="3SKWNk">
                                  <property role="3SKdUp" value="0 as default value and 0 as heap size should be distinguished" />
                                </node>
                              </node>
                              <node concept="3clFbJ" id="7RPG7RvcbOE" role="3cqZAp">
                                <node concept="3clFbS" id="7RPG7RvcbOH" role="3clFbx">
                                  <node concept="3clFbF" id="7RPG7Rvd347" role="3cqZAp">
                                    <node concept="37vLTI" id="7RPG7Rvd5fN" role="3clFbG">
                                      <node concept="2OqwBi" id="7RPG7Rvd6U7" role="37vLTx">
                                        <node concept="37vLTw" id="7RPG7Rvd6fv" role="2Oq$k0">
                                          <ref role="3cqZAo" node="7RPG7RvcFqX" resolve="mpsAspect" />
                                        </node>
                                        <node concept="3TrcHB" id="7RPG7Rvd9r5" role="2OqNvi">
                                          <ref role="3TsBF5" to="kdzh:6V3S4ekuLVH" resolve="generationMaxHeapSizeInMb" />
                                        </node>
                                      </node>
                                      <node concept="37vLTw" id="7RPG7Rvd346" role="37vLTJ">
                                        <ref role="3cqZAo" node="7RPG7Rvcc_H" resolve="heapSize" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                                <node concept="1Wc70l" id="7RPG7RvAv97" role="3clFbw">
                                  <node concept="2OqwBi" id="7RPG7RvAxhH" role="3uHU7B">
                                    <node concept="37vLTw" id="7RPG7RvAwai" role="2Oq$k0">
                                      <ref role="3cqZAo" node="7RPG7RvcFqX" resolve="mpsAspect" />
                                    </node>
                                    <node concept="3x8VRR" id="7RPG7RvAzNd" role="2OqNvi" />
                                  </node>
                                  <node concept="1eOMI4" id="7RPG7RvAtAH" role="3uHU7w">
                                    <node concept="2OqwBi" id="7RPG7RvAtAI" role="1eOMHV">
                                      <node concept="2OqwBi" id="7RPG7RvAtAJ" role="2Oq$k0">
                                        <node concept="2JrnkZ" id="7RPG7RvAtAK" role="2Oq$k0">
                                          <node concept="37vLTw" id="7RPG7RvAtAL" role="2JrQYb">
                                            <ref role="3cqZAo" node="7RPG7RvcFqX" resolve="mpsAspect" />
                                          </node>
                                        </node>
                                        <node concept="liA8E" id="7RPG7RvAtAM" role="2OqNvi">
                                          <ref role="37wK5l" to="mhbf:~SNode.getProperty(org.jetbrains.mps.openapi.language.SProperty):java.lang.String" resolve="getProperty" />
                                          <node concept="355D3s" id="1Lb1CYjWaRi" role="37wK5m">
                                            <ref role="355D3t" to="kdzh:5D0zVz80y2D" resolve="BuildMpsAspect" />
                                            <ref role="355D3u" to="kdzh:6V3S4ekuLVH" resolve="generationMaxHeapSizeInMb" />
                                          </node>
                                        </node>
                                      </node>
                                      <node concept="17RvpY" id="7RPG7RvAtAO" role="2OqNvi" />
                                    </node>
                                  </node>
                                </node>
                                <node concept="9aQIb" id="7RPG7Rvd2oa" role="9aQIa">
                                  <node concept="3clFbS" id="7RPG7Rvd2ob" role="9aQI4">
                                    <node concept="3SKdUt" id="7RPG7Rvdf7$" role="3cqZAp">
                                      <node concept="3SKdUq" id="7RPG7Rvdf7M" role="3SKWNk">
                                        <property role="3SKdUp" value="default size" />
                                      </node>
                                    </node>
                                    <node concept="3clFbF" id="7RPG7Rvdas5" role="3cqZAp">
                                      <node concept="37vLTI" id="7RPG7RvddhL" role="3clFbG">
                                        <node concept="3cmrfG" id="7RPG7Rvddzs" role="37vLTx">
                                          <property role="3cmrfH" value="512" />
                                        </node>
                                        <node concept="37vLTw" id="7RPG7Rvdas4" role="37vLTJ">
                                          <ref role="3cqZAo" node="7RPG7Rvcc_H" resolve="heapSize" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbH" id="7RPG7Rvc8aM" role="3cqZAp" />
                              <node concept="3clFbF" id="7RPG7RvbWuK" role="3cqZAp">
                                <node concept="3cpWs3" id="7RPG7Rvc2pM" role="3clFbG">
                                  <node concept="Xl_RD" id="7RPG7Rvc2pR" role="3uHU7w">
                                    <property role="Xl_RC" value="m" />
                                  </node>
                                  <node concept="3cpWs3" id="7RPG7RvbXUo" role="3uHU7B">
                                    <node concept="Xl_RD" id="7RPG7RvbWuJ" role="3uHU7B">
                                      <property role="Xl_RC" value="-Xmx" />
                                    </node>
                                    <node concept="37vLTw" id="7RPG7Rvc11z" role="3uHU7w">
                                      <ref role="3cqZAo" node="7RPG7Rvcc_H" resolve="heapSize" />
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
                  <node concept="2pNNFK" id="jC3lHUEH9r" role="3o6s8t">
                    <property role="2pNNFO" value="arg" />
                    <property role="qg3DV" value="true" />
                    <node concept="2pNUuL" id="jC3lHUEHw3" role="2pNNFR">
                      <property role="2pNUuO" value="value" />
                      <node concept="2pMdtt" id="jC3lHUEHw5" role="2pMdts">
                        <property role="2pMdty" value="-XX:MaxPermSize=64m" />
                        <node concept="17Uvod" id="jC3lHUHC0Q" role="lGtFl">
                          <property role="2qtEX9" value="text" />
                          <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                          <node concept="3zFVjK" id="jC3lHUHC0R" role="3zH0cK">
                            <node concept="3clFbS" id="jC3lHUHC0S" role="2VODD2">
                              <node concept="3SKdUt" id="jC3lHUHCeV" role="3cqZAp">
                                <node concept="3SKdUq" id="jC3lHUHCeW" role="3SKWNk">
                                  <property role="3SKdUp" value="0 is the default value (not generated)" />
                                </node>
                              </node>
                              <node concept="3cpWs8" id="jC3lHUHCeS" role="3cqZAp">
                                <node concept="3cpWsn" id="jC3lHUHCeT" role="3cpWs9">
                                  <property role="TrG5h" value="size" />
                                  <node concept="10Oyi0" id="jC3lHUHCeU" role="1tU5fm" />
                                  <node concept="2OqwBi" id="jC3lHUHK29" role="33vP2m">
                                    <node concept="3TrcHB" id="jC3lHUHKPN" role="2OqNvi">
                                      <ref role="3TsBF5" to="kdzh:jC3lHUHnEE" resolve="generationMaxPermSizeInMb" />
                                    </node>
                                    <node concept="2OqwBi" id="jC3lHUHMKo" role="2Oq$k0">
                                      <node concept="2OqwBi" id="jC3lHUHMKp" role="2Oq$k0">
                                        <node concept="2OqwBi" id="jC3lHUHMKq" role="2Oq$k0">
                                          <node concept="3Tsc0h" id="jC3lHUHMKr" role="2OqNvi">
                                            <ref role="3TtcxE" to="3ior:34DbxDwQPuJ" resolve="aspects" />
                                          </node>
                                          <node concept="2OqwBi" id="3pzPpUGjyfB" role="2Oq$k0">
                                            <node concept="1iwH7S" id="3pzPpUGjy5e" role="2Oq$k0" />
                                            <node concept="1bhEwm" id="3pzPpUGjywt" role="2OqNvi">
                                              <ref role="1bhEwk" node="3pzPpUGjpQB" resolve="buildProject" />
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="v3k3i" id="jC3lHUHMKt" role="2OqNvi">
                                          <node concept="chp4Y" id="jC3lHUHMKu" role="v3oSu">
                                            <ref role="cht4Q" to="kdzh:5D0zVz80y2D" resolve="BuildMpsAspect" />
                                          </node>
                                        </node>
                                      </node>
                                      <node concept="1uHKPH" id="jC3lHUHMKv" role="2OqNvi" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="3clFbF" id="jC3lHUHDha" role="3cqZAp">
                                <node concept="3cpWs3" id="jC3lHUHEvt" role="3clFbG">
                                  <node concept="3cpWs3" id="jC3lHUHF0p" role="3uHU7B">
                                    <node concept="37vLTw" id="jC3lHUHFl2" role="3uHU7w">
                                      <ref role="3cqZAo" node="jC3lHUHCeT" resolve="size" />
                                    </node>
                                    <node concept="Xl_RD" id="jC3lHUHEvz" role="3uHU7B">
                                      <property role="Xl_RC" value="-XX:MaxPermSize=" />
                                    </node>
                                  </node>
                                  <node concept="Xl_RD" id="jC3lHUHEv_" role="3uHU7w">
                                    <property role="Xl_RC" value="m" />
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="1W57fq" id="jC3lHUHMjd" role="lGtFl">
                      <node concept="3IZrLx" id="jC3lHUHMjf" role="3IZSJc">
                        <node concept="3clFbS" id="jC3lHUHMjh" role="2VODD2">
                          <node concept="3clFbF" id="jC3lHUHNKk" role="3cqZAp">
                            <node concept="3y3z36" id="jC3lHUHOOB" role="3clFbG">
                              <node concept="3cmrfG" id="jC3lHUHP9k" role="3uHU7w">
                                <property role="3cmrfH" value="0" />
                              </node>
                              <node concept="2OqwBi" id="jC3lHUHNKm" role="3uHU7B">
                                <node concept="3TrcHB" id="jC3lHUHNKn" role="2OqNvi">
                                  <ref role="3TsBF5" to="kdzh:jC3lHUHnEE" resolve="generationMaxPermSizeInMb" />
                                </node>
                                <node concept="2OqwBi" id="jC3lHUHNKo" role="2Oq$k0">
                                  <node concept="2OqwBi" id="jC3lHUHNKp" role="2Oq$k0">
                                    <node concept="2OqwBi" id="jC3lHUHNKq" role="2Oq$k0">
                                      <node concept="3Tsc0h" id="jC3lHUHNKr" role="2OqNvi">
                                        <ref role="3TtcxE" to="3ior:34DbxDwQPuJ" resolve="aspects" />
                                      </node>
                                      <node concept="2OqwBi" id="3pzPpUGjx8S" role="2Oq$k0">
                                        <node concept="1iwH7S" id="3pzPpUGjx0B" role="2Oq$k0" />
                                        <node concept="1bhEwm" id="3pzPpUGjxjG" role="2OqNvi">
                                          <ref role="1bhEwk" node="3pzPpUGjpQB" resolve="buildProject" />
                                        </node>
                                      </node>
                                    </node>
                                    <node concept="v3k3i" id="jC3lHUHNKt" role="2OqNvi">
                                      <node concept="chp4Y" id="jC3lHUHNKu" role="v3oSu">
                                        <ref role="cht4Q" to="kdzh:5D0zVz80y2D" resolve="BuildMpsAspect" />
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="1uHKPH" id="jC3lHUHNKv" role="2OqNvi" />
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3o6iSG" id="3pzPpUGjmSY" role="3o6s8t" />
                <node concept="2pNUuL" id="5iKxrmkoHxj" role="2pNNFR">
                  <property role="2pNUuO" value="solution" />
                  <node concept="2pMdtt" id="5iKxrmkpwXA" role="2pMdts">
                    <property role="2pMdty" value="moduleRef" />
                    <node concept="17Uvod" id="5iKxrmkpwXC" role="lGtFl">
                      <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                      <property role="2qtEX9" value="text" />
                      <node concept="3zFVjK" id="5iKxrmkpwXD" role="3zH0cK">
                        <node concept="3clFbS" id="5iKxrmkpwXE" role="2VODD2">
                          <node concept="3clFbF" id="5iKxrmkpx0k" role="3cqZAp">
                            <node concept="2OqwBi" id="5iKxrmkpxLX" role="3clFbG">
                              <node concept="2OqwBi" id="5iKxrmkpx5c" role="2Oq$k0">
                                <node concept="30H73N" id="5iKxrmkpx0j" role="2Oq$k0" />
                                <node concept="3TrEf2" id="5iKxrmkpxtf" role="2OqNvi">
                                  <ref role="3Tt5mk" to="as3y:5iKxrmkn6qh" resolve="solution" />
                                </node>
                              </node>
                              <node concept="2qgKlT" id="5iKxrmkpya5" role="2OqNvi">
                                <ref role="37wK5l" to="2txq:41K1b4v5ZCB" resolve="getModuleReference" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="2pNUuL" id="5iKxrmkqtYJ" role="2pNNFR">
                  <property role="2pNUuO" value="startClass" />
                  <node concept="2pMdtt" id="5iKxrmkquDK" role="2pMdts">
                    <property role="2pMdty" value="solution.MainClass" />
                    <node concept="17Uvod" id="5iKxrmkquDO" role="lGtFl">
                      <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                      <property role="2qtEX9" value="text" />
                      <node concept="3zFVjK" id="5iKxrmkquDP" role="3zH0cK">
                        <node concept="3clFbS" id="5iKxrmkquDQ" role="2VODD2">
                          <node concept="3clFbF" id="5iKxrmkquGw" role="3cqZAp">
                            <node concept="2OqwBi" id="1aYLt$9ex4B" role="3clFbG">
                              <node concept="30H73N" id="1aYLt$9ewSS" role="2Oq$k0" />
                              <node concept="2qgKlT" id="1aYLt$9eBZX" role="2OqNvi">
                                <ref role="37wK5l" to="tos2:1aYLt$9eyUg" resolve="getFQClassName" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="2pNUuL" id="5iKxrmkqukg" role="2pNNFR">
                  <property role="2pNUuO" value="startMethod" />
                  <node concept="2pMdtt" id="5iKxrmkquDM" role="2pMdts">
                    <property role="2pMdty" value="mpsmain" />
                    <node concept="17Uvod" id="6rDosczO_ck" role="lGtFl">
                      <property role="P4ACc" value="479c7a8c-02f9-43b5-9139-d910cb22f298/6666499814681541919/6666499814681541920" />
                      <property role="2qtEX9" value="text" />
                      <node concept="3zFVjK" id="6rDosczO_cl" role="3zH0cK">
                        <node concept="3clFbS" id="6rDosczO_cm" role="2VODD2">
                          <node concept="3clFbF" id="6rDosczO_ht" role="3cqZAp">
                            <node concept="2OqwBi" id="1aYLt$9exTK" role="3clFbG">
                              <node concept="30H73N" id="1aYLt$9exOt" role="2Oq$k0" />
                              <node concept="2qgKlT" id="1aYLt$9eybo" role="2OqNvi">
                                <ref role="37wK5l" to="tos2:1aYLt$9dX0a" resolve="getMethodName" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="2jeGV$" id="3pzPpUGjCed" role="lGtFl">
                <property role="TrG5h" value="libs" />
                <node concept="2jfdEK" id="3pzPpUGjCef" role="2jfP_Y">
                  <node concept="3clFbS" id="3pzPpUGjCeh" role="2VODD2">
                    <node concept="3clFbF" id="3pzPpUGjCz9" role="3cqZAp">
                      <node concept="2OqwBi" id="3pzPpUGjCzm" role="3clFbG">
                        <node concept="liA8E" id="3pzPpUGjCzn" role="2OqNvi">
                          <ref role="37wK5l" to="tken:2pk5iwY3SS_" resolve="getAllModules" />
                        </node>
                        <node concept="2OqwBi" id="3pzPpUGjCzo" role="2Oq$k0">
                          <node concept="1bhEwm" id="3pzPpUGjCzp" role="2OqNvi">
                            <ref role="1bhEwk" node="3pzPpUGggYF" resolve="closure" />
                          </node>
                          <node concept="1iwH7S" id="3pzPpUGjCzq" role="2Oq$k0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="A3Dl8" id="3pzPpUGjCDi" role="2jfP_h">
                  <node concept="3Tqbb2" id="3pzPpUGjCDj" role="A3Ik2">
                    <ref role="ehGHo" to="kdzh:hS0KzPONfF" resolve="BuildMps_AbstractModule" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="17Uvod" id="3BExUgsKWyF" role="lGtFl">
            <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
            <property role="2qtEX9" value="name" />
            <node concept="3zFVjK" id="3BExUgsKWyI" role="3zH0cK">
              <node concept="3clFbS" id="3BExUgsKWyJ" role="2VODD2">
                <node concept="3clFbF" id="3BExUgsKWyP" role="3cqZAp">
                  <node concept="3cpWs3" id="3BExUgsKXuW" role="3clFbG">
                    <node concept="Xl_RD" id="3BExUgsKX_0" role="3uHU7B">
                      <property role="Xl_RC" value="run." />
                    </node>
                    <node concept="2OqwBi" id="5iKxrmkoGrp" role="3uHU7w">
                      <node concept="2OqwBi" id="5iKxrmkoFEt" role="2Oq$k0">
                        <node concept="30H73N" id="5iKxrmkoFzw" role="2Oq$k0" />
                        <node concept="3TrEf2" id="5iKxrmkoG56" role="2OqNvi">
                          <ref role="3Tt5mk" to="as3y:5iKxrmkn6qh" resolve="solution" />
                        </node>
                      </node>
                      <node concept="3TrcHB" id="5iKxrmkoGNv" role="2OqNvi">
                        <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="2jeGV$" id="3pzPpUGggYF" role="lGtFl">
            <property role="TrG5h" value="closure" />
            <node concept="2jfdEK" id="3pzPpUGggYH" role="2jfP_Y">
              <node concept="3clFbS" id="3pzPpUGggYJ" role="2VODD2">
                <node concept="3clFbF" id="3ZNuxuVIKrm" role="3cqZAp">
                  <node concept="2OqwBi" id="3ZNuxuVIKro" role="3clFbG">
                    <node concept="2ShNRf" id="3ZNuxuVIKrq" role="2Oq$k0">
                      <node concept="1pGfFk" id="3ZNuxuVIKrr" role="2ShVmc">
                        <ref role="37wK5l" to="tken:2pk5iwY3nSs" resolve="MPSModulesClosure" />
                        <node concept="2ShNRf" id="5iKxrmkoErD" role="37wK5m">
                          <node concept="2HTt$P" id="5iKxrmkoErB" role="2ShVmc">
                            <node concept="3Tqbb2" id="5iKxrmkoErC" role="2HTBi0">
                              <ref role="ehGHo" to="kdzh:hS0KzPONfF" resolve="BuildMps_AbstractModule" />
                            </node>
                            <node concept="2OqwBi" id="5iKxrmkoEw6" role="2HTEbv">
                              <node concept="30H73N" id="5iKxrmkoEsR" role="2Oq$k0" />
                              <node concept="3TrEf2" id="5iKxrmkoEG6" role="2OqNvi">
                                <ref role="3Tt5mk" to="as3y:5iKxrmkn6qh" resolve="solution" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="2OqwBi" id="7QNcMbqvuUc" role="37wK5m">
                          <node concept="2ShNRf" id="7QNcMbqvsxR" role="2Oq$k0">
                            <node concept="HV5vD" id="7QNcMbqvsQI" role="2ShVmc">
                              <ref role="HV5vE" to="tken:ECLZhkrFpC" resolve="MPSModulesClosure.ModuleDependenciesOptions" />
                            </node>
                          </node>
                          <node concept="liA8E" id="7QNcMbqvuYc" role="2OqNvi">
                            <ref role="37wK5l" to="tken:6qlcPcv9UhQ" resolve="trackDevkits" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="liA8E" id="3ZNuxuVIKrI" role="2OqNvi">
                      <ref role="37wK5l" to="tken:7LkEFTMzmuw" resolve="designtimeClosure" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3uibUv" id="3pzPpUGh43O" role="2jfP_h">
              <ref role="3uigEE" to="tken:1jjYQYSjid_" resolve="MPSModulesClosure" />
            </node>
          </node>
          <node concept="2jeGV$" id="3pzPpUGgiPp" role="lGtFl">
            <property role="TrG5h" value="requiredPlugins" />
            <node concept="2jfdEK" id="3pzPpUGgiPr" role="2jfP_Y">
              <node concept="3clFbS" id="3pzPpUGgiPt" role="2VODD2">
                <node concept="3clFbF" id="3pzPpUGgDUg" role="3cqZAp">
                  <node concept="2OqwBi" id="3pzPpUGgFyt" role="3clFbG">
                    <node concept="liA8E" id="3pzPpUGgG1O" role="2OqNvi">
                      <ref role="37wK5l" to="tken:3pzPpUFQH5V" resolve="getPluginPaths" />
                    </node>
                    <node concept="2ShNRf" id="3pzPpUGgK72" role="2Oq$k0">
                      <node concept="1pGfFk" id="3pzPpUGgK73" role="2ShVmc">
                        <ref role="37wK5l" to="tken:3pzPpUFO9wL" resolve="ModulePlugins" />
                        <node concept="1PxgMI" id="3pzPpUGgKnY" role="37wK5m">
                          <node concept="2OqwBi" id="3pzPpUGgKnZ" role="1m5AlR">
                            <node concept="2Rxl7S" id="3pzPpUGgKo0" role="2OqNvi" />
                            <node concept="30H73N" id="3pzPpUGgKo1" role="2Oq$k0" />
                          </node>
                          <node concept="chp4Y" id="714IaVdGZnu" role="3oSUPX">
                            <ref role="cht4Q" to="3ior:4RPz6WoY4Cj" resolve="BuildProject" />
                          </node>
                        </node>
                        <node concept="1iwH7S" id="3pzPpUGgK75" role="37wK5m" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="10Q1$e" id="3pzPpUGh6hG" role="2jfP_h">
              <node concept="17QB3L" id="3pzPpUGh5Lk" role="10Q1$1" />
            </node>
          </node>
          <node concept="2jeGV$" id="3pzPpUGjpQB" role="lGtFl">
            <property role="TrG5h" value="buildProject" />
            <node concept="2jfdEK" id="3pzPpUGjpQD" role="2jfP_Y">
              <node concept="3clFbS" id="3pzPpUGjpQF" role="2VODD2">
                <node concept="3clFbF" id="3pzPpUGjs$z" role="3cqZAp">
                  <node concept="1PxgMI" id="3pzPpUGjsWC" role="3clFbG">
                    <property role="1BlNFB" value="true" />
                    <node concept="2OqwBi" id="3pzPpUGjsAU" role="1m5AlR">
                      <node concept="30H73N" id="3pzPpUGjs$y" role="2Oq$k0" />
                      <node concept="2Rxl7S" id="3pzPpUGjsTS" role="2OqNvi" />
                    </node>
                    <node concept="chp4Y" id="714IaVdGZnv" role="3oSUPX">
                      <ref role="cht4Q" to="3ior:4RPz6WoY4Cj" resolve="BuildProject" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3Tqbb2" id="3pzPpUGjqSo" role="2jfP_h">
              <ref role="ehGHo" to="3ior:4RPz6WoY4Cj" resolve="BuildProject" />
            </node>
          </node>
        </node>
        <node concept="raruj" id="3BExUgsKWrF" role="lGtFl" />
      </node>
      <node concept="1l3spV" id="3BExUgsKgFR" role="1l3spN" />
    </node>
  </node>
  <node concept="jVnub" id="3BExUgsPwYS">
    <property role="TrG5h" value="reduce_BuildSolutionRunnerPlugin" />
    <ref role="phYkn" to="g07:5KZfyKsVsFI" resolve="reduce_PluginToImport" />
    <node concept="3aamgX" id="3BExUgsPwYT" role="3aUrZf">
      <ref role="30HIoZ" to="as3y:3BExUgsJFn6" resolve="BuildSolutionRunnerPlugin" />
      <node concept="gft3U" id="3BExUgsPx1G" role="1lVwrX">
        <node concept="ygXWA" id="3BExUgsPx1N" role="gfFT$">
          <ref role="ygXWD" to="boe:3BExUgsK9rC" resolve="run-mps-code" />
        </node>
      </node>
    </node>
  </node>
</model>

