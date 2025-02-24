<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:e3c79067-ec7e-47a1-835b-793d50730a6a(jetbrains.mps.samples.notesOrganizer.build)">
  <persistence version="9" />
  <languages>
    <use id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build" version="-1" />
    <use id="0cf935df-4699-4e9c-a132-fa109541cba3" name="jetbrains.mps.build.mps" version="5" />
  </languages>
  <imports>
    <import index="ffeo" ref="r:874d959d-e3b4-4d04-b931-ca849af130dd(jetbrains.mps.ide.build)" />
    <import index="hh2c" ref="r:5c70a88b-9c77-4970-b930-a9ff601a03a0(jetbrains.mps.ide.idea.plugin.build)" />
  </imports>
  <registry>
    <language id="798100da-4f0a-421a-b991-71f8c50ce5d2" name="jetbrains.mps.build">
      <concept id="5481553824944787378" name="jetbrains.mps.build.structure.BuildSourceProjectRelativePath" flags="ng" index="55IIr" />
      <concept id="7321017245476976379" name="jetbrains.mps.build.structure.BuildRelativePath" flags="ng" index="iG8Mu">
        <child id="7321017245477039051" name="compositePart" index="iGT6I" />
      </concept>
      <concept id="4993211115183325728" name="jetbrains.mps.build.structure.BuildProjectDependency" flags="ng" index="2sgV4H">
        <reference id="5617550519002745380" name="script" index="1l3spb" />
        <child id="4129895186893471026" name="artifacts" index="2JcizS" />
      </concept>
      <concept id="4380385936562003279" name="jetbrains.mps.build.structure.BuildString" flags="ng" index="NbPM2">
        <child id="4903714810883783243" name="parts" index="3MwsjC" />
      </concept>
      <concept id="8618885170173601777" name="jetbrains.mps.build.structure.BuildCompositePath" flags="nn" index="2Ry0Ak">
        <property id="8618885170173601779" name="head" index="2Ry0Am" />
        <child id="8618885170173601778" name="tail" index="2Ry0An" />
      </concept>
      <concept id="6647099934206700647" name="jetbrains.mps.build.structure.BuildJavaPlugin" flags="ng" index="10PD9b" />
      <concept id="7181125477683417252" name="jetbrains.mps.build.structure.BuildExternalLayoutDependency" flags="ng" index="13uUGR">
        <reference id="7181125477683417255" name="layout" index="13uUGO" />
        <child id="7181125477683417254" name="artifacts" index="13uUGP" />
      </concept>
      <concept id="7389400916848050071" name="jetbrains.mps.build.structure.BuildLayout_Zip" flags="ng" index="3981dG" />
      <concept id="7389400916848050060" name="jetbrains.mps.build.structure.BuildLayout_NamedContainer" flags="ng" index="3981dR">
        <child id="4380385936562148502" name="containerName" index="Nbhlr" />
      </concept>
      <concept id="7389400916848136194" name="jetbrains.mps.build.structure.BuildFolderMacro" flags="ng" index="398rNT">
        <child id="7389400916848144618" name="defaultPath" index="398pKh" />
      </concept>
      <concept id="7389400916848153117" name="jetbrains.mps.build.structure.BuildSourceMacroRelativePath" flags="ng" index="398BVA">
        <reference id="7389400916848153130" name="macro" index="398BVh" />
      </concept>
      <concept id="5617550519002745364" name="jetbrains.mps.build.structure.BuildLayout" flags="ng" index="1l3spV" />
      <concept id="5617550519002745363" name="jetbrains.mps.build.structure.BuildProject" flags="ng" index="1l3spW">
        <property id="5204048710541015587" name="internalBaseDirectory" index="2DA0ip" />
        <child id="6647099934206700656" name="plugins" index="10PD9s" />
        <child id="7389400916848080626" name="parts" index="3989C9" />
        <child id="5617550519002745381" name="dependencies" index="1l3spa" />
        <child id="5617550519002745378" name="macros" index="1l3spd" />
        <child id="5617550519002745372" name="layout" index="1l3spN" />
      </concept>
      <concept id="8654221991637384182" name="jetbrains.mps.build.structure.BuildFileIncludesSelector" flags="ng" index="3qWCbU">
        <property id="8654221991637384184" name="pattern" index="3qWCbO" />
      </concept>
      <concept id="4701820937132344003" name="jetbrains.mps.build.structure.BuildLayout_Container" flags="ng" index="1y1bJS">
        <child id="7389400916848037006" name="children" index="39821P" />
      </concept>
      <concept id="841011766566059607" name="jetbrains.mps.build.structure.BuildStringNotEmpty" flags="ng" index="3_J27D" />
      <concept id="5248329904287794596" name="jetbrains.mps.build.structure.BuildInputFiles" flags="ng" index="3LXTmp">
        <child id="5248329904287794598" name="dir" index="3LXTmr" />
        <child id="5248329904287794679" name="selectors" index="3LXTna" />
      </concept>
      <concept id="4903714810883702019" name="jetbrains.mps.build.structure.BuildTextStringPart" flags="ng" index="3Mxwew">
        <property id="4903714810883755350" name="text" index="3MwjfP" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="0cf935df-4699-4e9c-a132-fa109541cba3" name="jetbrains.mps.build.mps">
      <concept id="6592112598314586625" name="jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginGroup" flags="ng" index="m$f5U">
        <reference id="6592112598314586626" name="group" index="m$f5T" />
      </concept>
      <concept id="6592112598314498932" name="jetbrains.mps.build.mps.structure.BuildMps_IdeaPlugin" flags="ng" index="m$_wf">
        <property id="6592112598314498927" name="id" index="m$_wk" />
        <child id="6592112598314498931" name="version" index="m$_w8" />
        <child id="6592112598314499050" name="content" index="m$_yh" />
        <child id="6592112598314499028" name="dependencies" index="m$_yJ" />
        <child id="6592112598314499021" name="name" index="m$_yQ" />
        <child id="6592112598314855574" name="containerName" index="m_cZH" />
      </concept>
      <concept id="6592112598314498926" name="jetbrains.mps.build.mps.structure.BuildMpsLayout_Plugin" flags="ng" index="m$_wl">
        <reference id="6592112598314801433" name="plugin" index="m_rDy" />
      </concept>
      <concept id="6592112598314499027" name="jetbrains.mps.build.mps.structure.BuildMps_IdeaPluginDependency" flags="ng" index="m$_yC">
        <reference id="6592112598314499066" name="target" index="m$_y1" />
      </concept>
      <concept id="1500819558095907805" name="jetbrains.mps.build.mps.structure.BuildMps_Group" flags="ng" index="2G$12M">
        <child id="1500819558095907806" name="modules" index="2G$12L" />
      </concept>
      <concept id="868032131020265945" name="jetbrains.mps.build.mps.structure.BuildMPSPlugin" flags="ng" index="3b7kt6" />
      <concept id="5253498789149381388" name="jetbrains.mps.build.mps.structure.BuildMps_Module" flags="ng" index="3bQrTs">
        <property id="1500819558096356884" name="doNotCompile" index="2GAjPV" />
        <child id="5253498789149547825" name="sources" index="3bR31x" />
        <child id="5253498789149547704" name="dependencies" index="3bR37C" />
      </concept>
      <concept id="5253498789149585690" name="jetbrains.mps.build.mps.structure.BuildMps_ModuleDependencyOnModule" flags="ng" index="3bR9La">
        <property id="5253498789149547713" name="reexport" index="3bR36h" />
        <reference id="5253498789149547705" name="module" index="3bR37D" />
      </concept>
      <concept id="763829979718664966" name="jetbrains.mps.build.mps.structure.BuildMps_ModuleResources" flags="ng" index="3rtmxn">
        <child id="763829979718664967" name="files" index="3rtmxm" />
      </concept>
      <concept id="5507251971038816436" name="jetbrains.mps.build.mps.structure.BuildMps_Generator" flags="ng" index="1yeLz9" />
      <concept id="3189788309731840248" name="jetbrains.mps.build.mps.structure.BuildMps_Language" flags="ng" index="1E1JtD">
        <child id="9200313594498201639" name="generator" index="1TViLv" />
      </concept>
      <concept id="322010710375871467" name="jetbrains.mps.build.mps.structure.BuildMps_AbstractModule" flags="ng" index="3LEN3z">
        <property id="8369506495128725901" name="compact" index="BnDLt" />
        <property id="322010710375892619" name="uuid" index="3LESm3" />
        <child id="322010710375956261" name="path" index="3LF7KH" />
      </concept>
      <concept id="7259033139236285166" name="jetbrains.mps.build.mps.structure.BuildMps_ExtractedModuleDependency" flags="nn" index="1SiIV0">
        <child id="7259033139236285167" name="dependency" index="1SiIV1" />
      </concept>
    </language>
  </registry>
  <node concept="1l3spW" id="3o4bEdkFmrs">
    <property role="TrG5h" value="notesOrganizer" />
    <property role="2DA0ip" value="../../" />
    <node concept="10PD9b" id="3o4bEdkFmrt" role="10PD9s" />
    <node concept="3b7kt6" id="3o4bEdkFmru" role="10PD9s" />
    <node concept="398rNT" id="3o4bEdkFmrv" role="1l3spd">
      <property role="TrG5h" value="idea_home" />
      <node concept="55IIr" id="3o4bEdkFmt2" role="398pKh">
        <node concept="2Ry0Ak" id="3o4bEdkFmtn" role="iGT6I">
          <property role="2Ry0Am" value=".." />
          <node concept="2Ry0Ak" id="3o4bEdkFmtq" role="2Ry0An">
            <property role="2Ry0Am" value=".." />
            <node concept="2Ry0Ak" id="3o4bEdkFmtt" role="2Ry0An">
              <property role="2Ry0Am" value=".." />
              <node concept="2Ry0Ak" id="3o4bEdkFmtw" role="2Ry0An">
                <property role="2Ry0Am" value=".." />
                <node concept="2Ry0Ak" id="3o4bEdkFmtz" role="2Ry0An">
                  <property role="2Ry0Am" value=".." />
                  <node concept="2Ry0Ak" id="3o4bEdkFmtA" role="2Ry0An">
                    <property role="2Ry0Am" value=".." />
                    <node concept="2Ry0Ak" id="3o4bEdkFmtF" role="2Ry0An">
                      <property role="2Ry0Am" value="Applications" />
                      <node concept="2Ry0Ak" id="3o4bEdkFmtK" role="2Ry0An">
                        <property role="2Ry0Am" value="IntelliJ IDEA 15.app" />
                        <node concept="2Ry0Ak" id="3o4bEdkFmtP" role="2Ry0An">
                          <property role="2Ry0Am" value="Contents" />
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
    <node concept="398rNT" id="3o4bEdkFmry" role="1l3spd">
      <property role="TrG5h" value="plugins_home" />
      <node concept="55IIr" id="3o4bEdkFmtR" role="398pKh">
        <node concept="2Ry0Ak" id="3o4bEdkFmuc" role="iGT6I">
          <property role="2Ry0Am" value=".." />
          <node concept="2Ry0Ak" id="3o4bEdkFmux" role="2Ry0An">
            <property role="2Ry0Am" value=".." />
            <node concept="2Ry0Ak" id="3o4bEdkFmu$" role="2Ry0An">
              <property role="2Ry0Am" value=".." />
              <node concept="2Ry0Ak" id="3o4bEdkFmuK" role="2Ry0An">
                <property role="2Ry0Am" value=".." />
                <node concept="2Ry0Ak" id="3o4bEdkFmvg" role="2Ry0An">
                  <property role="2Ry0Am" value="Library" />
                  <node concept="2Ry0Ak" id="3o4bEdkFmvu" role="2Ry0An">
                    <property role="2Ry0Am" value="Application Support" />
                    <node concept="2Ry0Ak" id="4N6X0uaCuDu" role="2Ry0An">
                      <property role="2Ry0Am" value="IntelliJIdea15" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="13uUGR" id="3o4bEdkFmrw" role="1l3spa">
      <ref role="13uUGO" to="ffeo:6eCuTcwOnJO" resolve="IDEA" />
      <node concept="398BVA" id="3o4bEdkFmrx" role="13uUGP">
        <ref role="398BVh" node="3o4bEdkFmrv" resolve="idea_home" />
      </node>
    </node>
    <node concept="2sgV4H" id="3o4bEdkFmr_" role="1l3spa">
      <ref role="1l3spb" to="hh2c:4tNwrSpaf04" resolve="mpsPlugin" />
      <node concept="398BVA" id="3o4bEdkFmrA" role="2JcizS">
        <ref role="398BVh" node="3o4bEdkFmry" resolve="plugins_home" />
      </node>
    </node>
    <node concept="1l3spV" id="3o4bEdkFmrS" role="1l3spN">
      <node concept="3981dG" id="3o4bEdkFmrT" role="39821P">
        <node concept="3_J27D" id="3o4bEdkFmrU" role="Nbhlr">
          <node concept="3Mxwew" id="3o4bEdkFmrV" role="3MwsjC">
            <property role="3MwjfP" value="notesOrganizer.zip" />
          </node>
        </node>
        <node concept="m$_wl" id="3o4bEdkFmrW" role="39821P">
          <ref role="m_rDy" node="3o4bEdkFmrJ" resolve="notesOrganizer" />
        </node>
      </node>
    </node>
    <node concept="m$_wf" id="3o4bEdkFmrJ" role="3989C9">
      <property role="m$_wk" value="notesOrganizer" />
      <node concept="3_J27D" id="3o4bEdkFmrK" role="m$_yQ">
        <node concept="3Mxwew" id="3o4bEdkFmrL" role="3MwsjC">
          <property role="3MwjfP" value="notesOrganizer" />
        </node>
      </node>
      <node concept="3_J27D" id="3o4bEdkFmrM" role="m$_w8">
        <node concept="3Mxwew" id="3o4bEdkFmrN" role="3MwsjC">
          <property role="3MwjfP" value="1.0" />
        </node>
      </node>
      <node concept="m$f5U" id="3o4bEdkFmrO" role="m$_yh">
        <ref role="m$f5T" node="3o4bEdkFmrI" resolve="notesOrganizer" />
      </node>
      <node concept="m$_yC" id="3o4bEdkFmrP" role="m$_yJ">
        <ref role="m$_y1" to="ffeo:4k71ibbKLe8" resolve="jetbrains.mps.core" />
      </node>
      <node concept="3_J27D" id="3o4bEdkFmrQ" role="m_cZH">
        <node concept="3Mxwew" id="3o4bEdkFmrR" role="3MwsjC">
          <property role="3MwjfP" value="notesOrganizer" />
        </node>
      </node>
    </node>
    <node concept="2G$12M" id="3o4bEdkFmrI" role="3989C9">
      <property role="TrG5h" value="notesOrganizer" />
      <node concept="1E1JtD" id="3o4bEdkFmrH" role="2G$12L">
        <property role="BnDLt" value="true" />
        <property role="TrG5h" value="jetbrains.mps.samples.notesOrganizer" />
        <property role="3LESm3" value="4b0f115a-8868-4d72-8d61-97071eaaa5f1" />
        <property role="2GAjPV" value="false" />
        <node concept="55IIr" id="3o4bEdkFmrC" role="3LF7KH">
          <node concept="2Ry0Ak" id="3o4bEdkFmrD" role="iGT6I">
            <property role="2Ry0Am" value="languages" />
            <node concept="2Ry0Ak" id="3o4bEdkFmrE" role="2Ry0An">
              <property role="2Ry0Am" value="jetbrains.mps.samples.notesOrganizer" />
              <node concept="2Ry0Ak" id="3o4bEdkFmrF" role="2Ry0An">
                <property role="2Ry0Am" value="jetbrains.mps.samples.notesOrganizer.mpl" />
              </node>
            </node>
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFmrX" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFmrY" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:1TaHNgiIbJb" resolve="MPS.Platform" />
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFmrZ" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFms0" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:7Kfy9QB6LfQ" resolve="jetbrains.mps.kernel" />
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFms1" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFms2" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:1TaHNgiIbIZ" resolve="MPS.Editor" />
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFms7" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFms8" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" node="3o4bEdkFmrH" resolve="jetbrains.mps.samples.notesOrganizer" />
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFms9" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFmsa" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:1H905DlDUSw" resolve="MPS.OpenAPI" />
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFmsb" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFmsc" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:mXGwHwhVPj" resolve="JDK" />
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFmsd" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFmse" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:1TaHNgiIbIQ" resolve="MPS.Core" />
          </node>
        </node>
        <node concept="1SiIV0" id="3o4bEdkFmsf" role="3bR37C">
          <node concept="3bR9La" id="3o4bEdkFmsg" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:7Kfy9QB6KYb" resolve="jetbrains.mps.baseLanguage" />
          </node>
        </node>
        <node concept="1yeLz9" id="3o4bEdkFmsh" role="1TViLv">
          <property role="TrG5h" value="jetbrains.mps.samples.notesOrganizer#8908453262579799816" />
          <property role="3LESm3" value="1e182802-30b4-4f9f-9de7-946005084052" />
          <property role="2GAjPV" value="false" />
        </node>
        <node concept="1SiIV0" id="KF47SF6mns" role="3bR37C">
          <node concept="3bR9La" id="KF47SF6mnt" role="1SiIV1">
            <property role="3bR36h" value="false" />
            <ref role="3bR37D" to="ffeo:6H0eDxPCdk4" resolve="jetbrains.mps.lang.editor.forms.runtime" />
          </node>
        </node>
        <node concept="3rtmxn" id="EpEP7iiiZw" role="3bR31x">
          <node concept="3LXTmp" id="EpEP7iiiZx" role="3rtmxm">
            <node concept="3qWCbU" id="EpEP7iiiZy" role="3LXTna">
              <property role="3qWCbO" value="icons/**, resources/**" />
            </node>
            <node concept="55IIr" id="EpEP7iiiZz" role="3LXTmr">
              <node concept="2Ry0Ak" id="EpEP7iiiZ$" role="iGT6I">
                <property role="2Ry0Am" value="languages" />
                <node concept="2Ry0Ak" id="EpEP7iiiZ_" role="2Ry0An">
                  <property role="2Ry0Am" value="jetbrains.mps.samples.notesOrganizer" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

