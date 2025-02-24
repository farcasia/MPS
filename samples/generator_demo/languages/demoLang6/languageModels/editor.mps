<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:64461e55-0680-4e64-905d-f5d8390b4161(jetbrains.mps.samples.generator_demo.demoLang6.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="11" />
  </languages>
  <imports>
    <import index="2k81" ref="r:5a5bef13-c898-42e0-9736-2063b8209071(jetbrains.mps.samples.generator_demo.demoLang6.structure)" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="3sP3FIIzhbW">
    <ref role="1XX52x" to="2k81:3sP3FIIzha3" resolve="Button" />
    <node concept="3EZMnI" id="3sP3FIIzhuG" role="2wV5jI">
      <node concept="3F0ifn" id="3sP3FIIzhuN" role="3EZMnx">
        <property role="3F0ifm" value="button (" />
      </node>
      <node concept="3F0A7n" id="3sP3FIIzhuT" role="3EZMnx">
        <ref role="1NtTu8" to="2k81:3sP3FIIzhbN" resolve="text" />
      </node>
      <node concept="3F0ifn" id="3sP3FIIzhvm" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="2iRfu4" id="3sP3FIIzhuJ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3sP3FIIzmuZ">
    <ref role="1XX52x" to="2k81:3sP3FIIzhxG" resolve="Label" />
    <node concept="3EZMnI" id="3sP3FIIzmvO" role="2wV5jI">
      <node concept="3F0ifn" id="3sP3FIIzmvV" role="3EZMnx">
        <property role="3F0ifm" value="label (" />
      </node>
      <node concept="3F0A7n" id="3sP3FIIzmw1" role="3EZMnx">
        <ref role="1NtTu8" to="2k81:3sP3FIIzhxQ" resolve="text" />
      </node>
      <node concept="3F0ifn" id="3sP3FIIzmw8" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="2iRfu4" id="3sP3FIIzmvR" role="2iSdaV" />
    </node>
  </node>
</model>

