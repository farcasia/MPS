<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="text"/>

  <xsl:param name="lib.folder"/>
  <xsl:param name="property.name"/>

  <xsl:template match="/">
    <xsl:apply-templates select="./idea-plugin/extensions/compileServer.plugin"/>
  </xsl:template>

  <xsl:template match="compileServer.plugin">
    <xsl:if test="'/' != substring($lib.folder, string-length($lib.folder))">
      <xsl:message terminate="yes">ERROR: $lib.folder parameter was specified without ending slash</xsl:message>
    </xsl:if>

    <xsl:text>#&#xa;</xsl:text>
    <xsl:text># JPS builder classpath&#xa;</xsl:text>
    <xsl:text># (loaded from idea-plugin/extensions/compileServer.plugin tag of plugin.xml):&#xa;</xsl:text>
    <xsl:text>#&#xa;</xsl:text>
    <xsl:value-of select="$property.name"/>
    <xsl:text>=</xsl:text>
    <xsl:value-of select="$lib.folder"/>
    <xsl:call-template name="string-replace-all">
      <xsl:with-param name="text" select="./@classpath"/>
      <xsl:with-param name="replace" select="';'"/>
      <xsl:with-param name="by" select="concat(':',$lib.folder)"/>
    </xsl:call-template>
  </xsl:template>

  <xsl:template name="string-replace-all">
    <xsl:param name="text"/>
    <xsl:param name="replace"/>
    <xsl:param name="by"/>
    <xsl:choose>
      <xsl:when test="$text = '' or $replace = ''or not($replace)">
        <xsl:value-of select="$text"/>
      </xsl:when>
      <xsl:when test="contains($text, $replace)">
        <xsl:value-of select="substring-before($text,$replace)"/><xsl:value-of select="$by"/>
        <xsl:call-template name="string-replace-all">
          <xsl:with-param name="text" select="substring-after($text,$replace)"/>
          <xsl:with-param name="replace" select="$replace"/>
          <xsl:with-param name="by" select="$by"/>
        </xsl:call-template>
      </xsl:when>
      <xsl:otherwise>
        <xsl:value-of select="$text"/>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
</xsl:stylesheet>
