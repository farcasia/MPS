<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:00d5aa52-8575-44dd-8a7e-68abaac24f2c(jetbrains.mps.lang.slanguage.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="hfbu" ref="r:2ea71bfd-fe13-4525-9346-023b05757b39(jetbrains.mps.lang.aspect.structure)" />
    <import index="tpee" ref="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" implicit="true" />
    <import index="tp25" ref="r:00000000-0000-4000-0000-011c89590301(jetbrains.mps.lang.smodel.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765956807" name="final" index="R5$K2" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="5404671619616246344" name="staticScope" index="2_RsDV" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
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
  </registry>
  <node concept="1TIwiD" id="5m$620fQi1E">
    <property role="3GE5qa" value="reference" />
    <property role="TrG5h" value="AspectModelRefExpression" />
    <property role="34LRSv" value="aspectModel" />
    <property role="EcuMT" value="6171083915388330090" />
    <ref role="1TJDcQ" to="tpee:fz3vP1J" resolve="Expression" />
    <node concept="1TJgyj" id="5m$620fRjo7" role="1TKVEi">
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="aspect" />
      <property role="20lbJX" value="1" />
      <property role="IQ2ns" value="6171083915388597767" />
      <ref role="20lvS9" to="hfbu:2Y$EcRKMr1Q" resolve="SimpleLanguageAspectDescriptor" />
    </node>
    <node concept="1TJgyj" id="5m$620fQi1F" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="lang" />
      <property role="20lbJX" value="1" />
      <property role="IQ2ns" value="6171083915388330091" />
      <ref role="20lvS9" to="tpee:fz3vP1J" resolve="Expression" />
    </node>
  </node>
  <node concept="1TIwiD" id="1KHvivZHjVV">
    <property role="R5$K7" value="false" />
    <property role="R5$K2" value="false" />
    <property role="TrG5h" value="Model_IsAspectOperation" />
    <property role="2_RsDV" value="none" />
    <property role="3GE5qa" value="operation.model" />
    <property role="34LRSv" value="isAspectModel" />
    <property role="EcuMT" value="2030416617761226491" />
    <ref role="1TJDcQ" to="tp25:g$eCIIG" resolve="SNodeOperation" />
    <node concept="1TJgyj" id="1KHvivZHjYS" role="1TKVEi">
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="aspect" />
      <property role="20lbJX" value="1" />
      <property role="IQ2ns" value="2030416617761226680" />
      <ref role="20lvS9" to="hfbu:2Y$EcRKMr1Q" resolve="SimpleLanguageAspectDescriptor" />
    </node>
  </node>
</model>

