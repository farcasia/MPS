<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:640618e1-83da-4da2-a799-af20502fa1d8(TestCompileSolution.testModel)">
  <persistence version="9" />
  <languages>
    <use id="fdcdc48f-bfd8-4831-aa76-5abac2ffa010" name="jetbrains.mps.baseLanguage.jdk8" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
    <import index="487m" ref="a2e9b672-d7f0-4804-bc04-9161af907fda/java:test(TestCompileSolution/)" />
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="ng" index="2tJIrI" />
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
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1095933932569" name="implementedInterface" index="EKbjA" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
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
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
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
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
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
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
    </language>
    <language id="fdcdc48f-bfd8-4831-aa76-5abac2ffa010" name="jetbrains.mps.baseLanguage.jdk8">
      <concept id="1719162360409810393" name="jetbrains.mps.baseLanguage.jdk8.structure.SuperInterfaceMethodCall" flags="ng" index="3WEljn">
        <reference id="1719162360409958622" name="classifier" index="3WFDBg" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="312cEu" id="5EQoU_tECVM">
    <property role="TrG5h" value="TestClass" />
    <node concept="2YIFZL" id="5EQoU_tECW$" role="jymVt">
      <property role="TrG5h" value="main" />
      <node concept="37vLTG" id="5EQoU_tECW_" role="3clF46">
        <property role="TrG5h" value="args" />
        <node concept="10Q1$e" id="5EQoU_tECWA" role="1tU5fm">
          <node concept="17QB3L" id="5EQoU_tECWB" role="10Q1$1" />
        </node>
      </node>
      <node concept="3cqZAl" id="5EQoU_tECWC" role="3clF45" />
      <node concept="3Tm1VV" id="5EQoU_tECWD" role="1B3o_S" />
      <node concept="3clFbS" id="5EQoU_tECWE" role="3clF47">
        <node concept="3cpWs8" id="4ep0Y$Xs$6p" role="3cqZAp">
          <node concept="3cpWsn" id="4ep0Y$Xs$6q" role="3cpWs9">
            <property role="TrG5h" value="staticTestValue" />
            <node concept="10Oyi0" id="4ep0Y$Xs$6o" role="1tU5fm" />
            <node concept="2YIFZM" id="4ep0Y$Xs$6r" role="33vP2m">
              <ref role="37wK5l" to="487m:~TestInterface.getStaticTestValue():int" resolve="getStaticTestValue" />
              <ref role="1Pybhc" to="487m:~TestInterface" resolve="TestInterface" />
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4ep0Y$XsDjg" role="3cqZAp">
          <node concept="2OqwBi" id="4ep0Y$XsDjd" role="3clFbG">
            <node concept="10M0yZ" id="4ep0Y$XsDje" role="2Oq$k0">
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
            </node>
            <node concept="liA8E" id="4ep0Y$XsDjf" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(int):void" resolve="println" />
              <node concept="2OqwBi" id="4ep0Y$XsDKT" role="37wK5m">
                <node concept="2ShNRf" id="4ep0Y$XsDmo" role="2Oq$k0">
                  <node concept="HV5vD" id="4ep0Y$XsDJf" role="2ShVmc">
                    <ref role="HV5vE" node="5EQoU_tECVM" resolve="TestClass" />
                  </node>
                </node>
                <node concept="liA8E" id="4ep0Y$XsE37" role="2OqNvi">
                  <ref role="37wK5l" node="4ep0Y$Xs$Ct" resolve="getValue" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2tJIrI" id="4ep0Y$Xs$mY" role="jymVt" />
    <node concept="3clFb_" id="4ep0Y$Xs$Ct" role="jymVt">
      <property role="TrG5h" value="getValue" />
      <node concept="10Oyi0" id="4ep0Y$XsCXZ" role="3clF45" />
      <node concept="3Tm1VV" id="4ep0Y$Xs$Cw" role="1B3o_S" />
      <node concept="3clFbS" id="4ep0Y$Xs$Cx" role="3clF47">
        <node concept="3clFbF" id="4ep0Y$Xs_Kl" role="3cqZAp">
          <node concept="3cpWs3" id="4ep0Y$XsCal" role="3clFbG">
            <node concept="3WEljn" id="4ep0Y$Xs_Kk" role="3uHU7B">
              <ref role="3WFDBg" to="487m:~TestInterface" resolve="TestInterface" />
              <ref role="37wK5l" to="487m:~TestInterface.getDefaultTestValue():int" resolve="getDefaultTestValue" />
            </node>
            <node concept="3cmrfG" id="4ep0Y$XsCCW" role="3uHU7w">
              <property role="3cmrfH" value="1" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="3Tm1VV" id="5EQoU_tECVN" role="1B3o_S" />
    <node concept="3uibUv" id="4ep0Y$Xs$fH" role="EKbjA">
      <ref role="3uigEE" to="487m:~TestInterface" resolve="TestInterface" />
    </node>
  </node>
</model>

