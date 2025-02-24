<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:ea768d15-a9c9-488b-8295-d4b967b40487(MultiTarget.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="11" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="ldfj" ref="r:9f12744a-a702-440b-b5fb-61597de1c627(MultiTarget.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
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
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="JiZx3bYHWV">
    <ref role="1XX52x" to="ldfj:JiZx3bYHWt" resolve="Container" />
    <node concept="3EZMnI" id="JiZx3bYHWX" role="2wV5jI">
      <node concept="3F0ifn" id="JiZx3bYHX4" role="3EZMnx">
        <property role="3F0ifm" value="Container" />
      </node>
      <node concept="3F0A7n" id="JiZx3bYHXa" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="JiZx3bYHXe" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="JiZx3bYHXl" role="3EZMnx">
        <ref role="1NtTu8" to="ldfj:JiZx3bYHWx" resolve="members" />
        <node concept="2iRkQZ" id="JiZx3bYInu" role="2czzBx" />
        <node concept="lj46D" id="JiZx3bYHXt" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="JiZx3bYHX0" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="JiZx3bYHXU">
    <ref role="1XX52x" to="ldfj:JiZx3bYHXv" resolve="StringValue" />
    <node concept="3EZMnI" id="JiZx3bYHXW" role="2wV5jI">
      <node concept="3F0ifn" id="JiZx3bYHY3" role="3EZMnx">
        <property role="3F0ifm" value="string value" />
      </node>
      <node concept="3F0A7n" id="JiZx3bYHY9" role="3EZMnx">
        <ref role="1NtTu8" to="ldfj:JiZx3bYHXw" resolve="value" />
      </node>
      <node concept="l2Vlx" id="JiZx3bYHXZ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="JiZx3bYHYC">
    <ref role="1XX52x" to="ldfj:JiZx3bYHYd" resolve="NumericValue" />
    <node concept="3EZMnI" id="JiZx3bYHYE" role="2wV5jI">
      <node concept="3F0ifn" id="JiZx3bYHYL" role="3EZMnx">
        <property role="3F0ifm" value="numeric value" />
      </node>
      <node concept="3F0A7n" id="JiZx3bYHYR" role="3EZMnx">
        <ref role="1NtTu8" to="ldfj:JiZx3bYHYe" resolve="value" />
      </node>
      <node concept="l2Vlx" id="JiZx3bYHYH" role="2iSdaV" />
    </node>
  </node>
</model>

