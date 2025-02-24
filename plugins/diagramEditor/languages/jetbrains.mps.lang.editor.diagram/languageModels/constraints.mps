<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:1af2ba06-e725-4940-9c06-d6b80c641b75(jetbrains.mps.lang.editor.diagram.constraints)">
  <persistence version="9" />
  <languages>
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="gbdf" ref="r:5181c66d-005f-421e-88f2-2c6d80a7738d(jetbrains.mps.lang.editor.diagram.structure)" />
    <import index="6xgk" ref="r:6e9ad488-5df2-49e4-8c01-8a7f3812adf7(jetbrains.mps.lang.scopes.runtime)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="tpce" ref="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" implicit="true" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
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
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
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
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
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
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
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
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
      </concept>
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="6702802731807351367" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild" flags="in" index="9S07l" />
      <concept id="1202989658459" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode" flags="nn" index="nLn13" />
      <concept id="8966504967485224688" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_contextNode" flags="nn" index="2rP1CM" />
      <concept id="5564765827938091039" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_ReferentSearchScope_Scope" flags="ig" index="3dgokm" />
      <concept id="8401916545537438642" name="jetbrains.mps.lang.constraints.structure.InheritedNodeScopeFactory" flags="ng" index="1dDu$B">
        <reference id="8401916545537438643" name="kind" index="1dDu$A" />
      </concept>
      <concept id="1163200647017" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_referenceNode" flags="nn" index="3kakTB" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="6702802731807737306" name="canBeChild" index="9Vyp8" />
        <child id="1213100494875" name="referent" index="1Mr941" />
      </concept>
      <concept id="1148687176410" name="jetbrains.mps.lang.constraints.structure.NodeReferentConstraint" flags="ng" index="1N5Pfh">
        <reference id="1148687202698" name="applicableLink" index="1N5Vy1" />
        <child id="1148687345559" name="searchScopeFactory" index="1N6uqs" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1173122760281" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorsOperation" flags="nn" index="z$bX8" />
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1145404486709" name="jetbrains.mps.lang.smodel.structure.SemanticDowncastExpression" flags="nn" index="2JrnkZ">
        <child id="1145404616321" name="leftExpression" index="2JrQYb" />
      </concept>
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
      <concept id="1171999116870" name="jetbrains.mps.lang.smodel.structure.Node_IsNullOperation" flags="nn" index="3w_OXm" />
      <concept id="1144100932627" name="jetbrains.mps.lang.smodel.structure.OperationParm_Inclusion" flags="ng" index="1xIGOp" />
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
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
      <concept id="1151688443754" name="jetbrains.mps.baseLanguage.collections.structure.ListType" flags="in" index="_YKpA">
        <child id="1151688676805" name="elementType" index="_ZDj9" />
      </concept>
      <concept id="1237721394592" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator" flags="nn" index="HWqM0">
        <child id="1237721435807" name="elementType" index="HW$YZ" />
      </concept>
      <concept id="1160600644654" name="jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit" flags="nn" index="Tc6Ow" />
      <concept id="1160666733551" name="jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation" flags="nn" index="X8dFx" />
    </language>
  </registry>
  <node concept="1M2fIO" id="3g73hQq2Oli">
    <ref role="1M2myG" to="gbdf:fQU43XL8M5" resolve="PropertyArgument" />
    <node concept="1N5Pfh" id="3g73hQq2Oqg" role="1Mr941">
      <ref role="1N5Vy1" to="gbdf:fQU43XLcUk" resolve="property" />
      <node concept="1dDu$B" id="3g73hQq2Sfx" role="1N6uqs">
        <ref role="1dDu$A" to="tpce:f_TJgxF" resolve="PropertyDeclaration" />
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="3g73hQq2SfR">
    <ref role="1M2myG" to="gbdf:fQU43XxJAR" resolve="LinkArgument" />
    <node concept="1N5Pfh" id="3g73hQq2SfS" role="1Mr941">
      <ref role="1N5Vy1" to="gbdf:fQU43XLauB" resolve="link" />
      <node concept="1dDu$B" id="3g73hQq2SfU" role="1N6uqs">
        <ref role="1dDu$A" to="tpce:f_TJgxE" resolve="LinkDeclaration" />
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="1iN4mn3k1UU">
    <ref role="1M2myG" to="gbdf:WK6Z46DXv7" resolve="FigureParameterMapping" />
    <node concept="9S07l" id="147CB3QsVsn" role="9Vyp8">
      <node concept="3clFbS" id="147CB3QsVso" role="2VODD2">
        <node concept="3clFbF" id="147CB3QsVsp" role="3cqZAp">
          <node concept="2OqwBi" id="147CB3QsVsq" role="3clFbG">
            <node concept="nLn13" id="147CB3QsVsr" role="2Oq$k0" />
            <node concept="1mIQ4w" id="147CB3QsVss" role="2OqNvi">
              <node concept="chp4Y" id="147CB3QsVst" role="cj9EA">
                <ref role="cht4Q" to="gbdf:WK6Z46CMrx" resolve="CellModel_DiagramNode" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="4Xny4S7vTjn">
    <ref role="1M2myG" to="gbdf:5u6$4zsyvJR" resolve="CellModel_Diagram" />
  </node>
  <node concept="1M2fIO" id="4Xny4S7yIjr">
    <ref role="1M2myG" to="gbdf:5yk3CzNVRj9" resolve="CellModel_DiagramConnector" />
  </node>
  <node concept="312cEu" id="4Xny4S7Ex7E">
    <property role="TrG5h" value="VisibleReferencesScope" />
    <node concept="3Tm1VV" id="4Xny4S7Ex7F" role="1B3o_S" />
  </node>
  <node concept="1M2fIO" id="13JDji_51_V">
    <ref role="1M2myG" to="gbdf:2NgG6tkGBSJ" resolve="ThisEditorNodeExpression" />
    <node concept="9S07l" id="147CB3QsVsb" role="9Vyp8">
      <node concept="3clFbS" id="147CB3QsVsc" role="2VODD2">
        <node concept="3clFbF" id="147CB3QsVsd" role="3cqZAp">
          <node concept="3y3z36" id="147CB3QsVse" role="3clFbG">
            <node concept="10Nm6u" id="147CB3QsVsf" role="3uHU7w" />
            <node concept="2OqwBi" id="147CB3QsVsg" role="3uHU7B">
              <node concept="nLn13" id="147CB3QsVsh" role="2Oq$k0" />
              <node concept="z$bX8" id="147CB3QsVsi" role="2OqNvi">
                <node concept="3gmYPX" id="147CB3QsVsj" role="1xVPHs">
                  <node concept="3gn64h" id="147CB3QsVsk" role="3gmYPZ">
                    <ref role="3gnhBz" to="gbdf:fQU43XxJzR" resolve="BLQueryArgument" />
                  </node>
                  <node concept="3gn64h" id="147CB3QsVsl" role="3gmYPZ">
                    <ref role="3gnhBz" to="gbdf:13JDji_21tH" resolve="ConnectionEndBLQuery" />
                  </node>
                </node>
                <node concept="1xIGOp" id="147CB3QsVsm" role="1xVPHs" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="5nQpa4t0iWP">
    <property role="3GE5qa" value="Palette" />
    <ref role="1M2myG" to="gbdf:5JruEV1dOnD" resolve="CreationActionReference" />
    <node concept="1N5Pfh" id="5nQpa4t0iY8" role="1Mr941">
      <ref role="1N5Vy1" to="gbdf:5JruEV1fJfO" resolve="elementsCreation" />
      <node concept="3dgokm" id="5Vvmn_QkXi5" role="1N6uqs">
        <node concept="3clFbS" id="5Vvmn_QkXi6" role="2VODD2">
          <node concept="3cpWs8" id="5Vvmn_QkXjL" role="3cqZAp">
            <node concept="3cpWsn" id="5Vvmn_QkXjM" role="3cpWs9">
              <property role="TrG5h" value="enclosingNode" />
              <property role="3TUv4t" value="true" />
              <node concept="3Tqbb2" id="5Vvmn_QkXjN" role="1tU5fm" />
              <node concept="1eOMI4" id="5Vvmn_QkXjB" role="33vP2m">
                <node concept="3K4zz7" id="5Vvmn_QkXjC" role="1eOMHV">
                  <node concept="2rP1CM" id="5Vvmn_QkXjD" role="3K4E3e" />
                  <node concept="2OqwBi" id="5Vvmn_QkXjE" role="3K4Cdx">
                    <node concept="3kakTB" id="5Vvmn_QkXjF" role="2Oq$k0" />
                    <node concept="3w_OXm" id="5Vvmn_QkXjG" role="2OqNvi" />
                  </node>
                  <node concept="2OqwBi" id="5Vvmn_QkXjH" role="3K4GZi">
                    <node concept="3kakTB" id="5Vvmn_QkXjI" role="2Oq$k0" />
                    <node concept="1mfA1w" id="5Vvmn_QkXjJ" role="2OqNvi" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3cpWs8" id="5Vvmn_QkXi7" role="3cqZAp">
            <node concept="3cpWsn" id="5Vvmn_QkXi8" role="3cpWs9">
              <property role="TrG5h" value="creationBlocks" />
              <node concept="_YKpA" id="5Vvmn_QkXi9" role="1tU5fm">
                <node concept="3Tqbb2" id="5Vvmn_QkXia" role="_ZDj9" />
              </node>
              <node concept="2ShNRf" id="5Vvmn_QkXib" role="33vP2m">
                <node concept="Tc6Ow" id="5Vvmn_QkXic" role="2ShVmc">
                  <node concept="3Tqbb2" id="5Vvmn_QkXid" role="HW$YZ" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="5Vvmn_QkXie" role="3cqZAp">
            <node concept="2OqwBi" id="5Vvmn_QkXif" role="3clFbG">
              <node concept="37vLTw" id="5Vvmn_QkXig" role="2Oq$k0">
                <ref role="3cqZAo" node="5Vvmn_QkXi8" resolve="creationBlocks" />
              </node>
              <node concept="X8dFx" id="5Vvmn_QkXih" role="2OqNvi">
                <node concept="2OqwBi" id="5Vvmn_QkXii" role="25WWJ7">
                  <node concept="3Tsc0h" id="5Vvmn_QkXij" role="2OqNvi">
                    <ref role="3TtcxE" to="gbdf:7rLMM2UuxKP" resolve="elementsCreation" />
                  </node>
                  <node concept="1PxgMI" id="5Vvmn_QkXik" role="2Oq$k0">
                    <node concept="2OqwBi" id="5Vvmn_QkXil" role="1m5AlR">
                      <node concept="37vLTw" id="5Vvmn_QkXjO" role="2Oq$k0">
                        <ref role="3cqZAo" node="5Vvmn_QkXjM" resolve="enclosingNode" />
                      </node>
                      <node concept="1mfA1w" id="5Vvmn_QkXin" role="2OqNvi" />
                    </node>
                    <node concept="chp4Y" id="5Vvmn_QkXio" role="3oSUPX">
                      <ref role="cht4Q" to="gbdf:5u6$4zsyvJR" resolve="CellModel_Diagram" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="5Vvmn_QkXip" role="3cqZAp">
            <node concept="2OqwBi" id="5Vvmn_QkXiq" role="3clFbG">
              <node concept="37vLTw" id="5Vvmn_QkXir" role="2Oq$k0">
                <ref role="3cqZAo" node="5Vvmn_QkXi8" resolve="creationBlocks" />
              </node>
              <node concept="X8dFx" id="5Vvmn_QkXis" role="2OqNvi">
                <node concept="2OqwBi" id="5Vvmn_QkXit" role="25WWJ7">
                  <node concept="1PxgMI" id="5Vvmn_QkXiu" role="2Oq$k0">
                    <node concept="2OqwBi" id="5Vvmn_QkXiv" role="1m5AlR">
                      <node concept="37vLTw" id="5Vvmn_QkXjP" role="2Oq$k0">
                        <ref role="3cqZAo" node="5Vvmn_QkXjM" resolve="enclosingNode" />
                      </node>
                      <node concept="1mfA1w" id="5Vvmn_QkXix" role="2OqNvi" />
                    </node>
                    <node concept="chp4Y" id="5Vvmn_QkXiy" role="3oSUPX">
                      <ref role="cht4Q" to="gbdf:5u6$4zsyvJR" resolve="CellModel_Diagram" />
                    </node>
                  </node>
                  <node concept="3Tsc0h" id="5Vvmn_QkXiz" role="2OqNvi">
                    <ref role="3TtcxE" to="gbdf:ObbTRzsnlh" resolve="connectorCreation" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="5Vvmn_QkXi$" role="3cqZAp">
            <node concept="2ShNRf" id="5Vvmn_QkXi_" role="3clFbG">
              <node concept="YeOm9" id="5Vvmn_QkXiA" role="2ShVmc">
                <node concept="1Y3b0j" id="5Vvmn_QkXiB" role="YeSDq">
                  <property role="2bfB8j" value="true" />
                  <ref role="1Y3XeK" to="6xgk:2DmG$ciAhAi" resolve="SimpleScope" />
                  <ref role="37wK5l" to="6xgk:2DmG$ciAhAo" resolve="SimpleScope" />
                  <node concept="3Tm1VV" id="5Vvmn_QkXiC" role="1B3o_S" />
                  <node concept="3clFb_" id="5Vvmn_QkXiD" role="jymVt">
                    <property role="1EzhhJ" value="false" />
                    <property role="TrG5h" value="getReferenceText" />
                    <node concept="3Tm1VV" id="5Vvmn_QkXiE" role="1B3o_S" />
                    <node concept="37vLTG" id="5Vvmn_QkXiF" role="3clF46">
                      <property role="TrG5h" value="target" />
                      <node concept="3Tqbb2" id="5Vvmn_QkXiG" role="1tU5fm" />
                      <node concept="2AHcQZ" id="5Vvmn_QkXiH" role="2AJF6D">
                        <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      </node>
                    </node>
                    <node concept="17QB3L" id="5Vvmn_QkXiI" role="3clF45" />
                    <node concept="2AHcQZ" id="5Vvmn_QkXiJ" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                    </node>
                    <node concept="3clFbS" id="5Vvmn_QkXiK" role="3clF47">
                      <node concept="3clFbF" id="5Vvmn_QkXiL" role="3cqZAp">
                        <node concept="2OqwBi" id="5Vvmn_QkXiM" role="3clFbG">
                          <node concept="2JrnkZ" id="5Vvmn_QkXiN" role="2Oq$k0">
                            <node concept="37vLTw" id="5Vvmn_QkXiO" role="2JrQYb">
                              <ref role="3cqZAo" node="5Vvmn_QkXiF" resolve="target" />
                            </node>
                          </node>
                          <node concept="liA8E" id="5Vvmn_QkXiP" role="2OqNvi">
                            <ref role="37wK5l" to="mhbf:~SNode.getName():java.lang.String" resolve="getName" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="37vLTw" id="5Vvmn_QkXiQ" role="37wK5m">
                    <ref role="3cqZAo" node="5Vvmn_QkXi8" resolve="creationBlocks" />
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

