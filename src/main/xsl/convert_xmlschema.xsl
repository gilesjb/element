<?xml version="1.0"?>

<!-- 
	A stylesheet to convert the XMLSchema for XHTML to Java
-->

<xsl:stylesheet version="2.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:xs="http://www.w3.org/2001/XMLSchema">

<xsl:output method="text" indent="no" encoding="UTF-8"/>

<xsl:variable name="srctext" select="'-abcdefghijklmnopqrstuvwxyz:.'" />
<xsl:variable name="normalized" select="'_abcdefghijklmnopqrstuvwxyz__'" />
<xsl:variable name="uppercase" select="'_ABCDEFGHIJKLMNOPQRSTUVWXYZ__'" />

<xsl:variable name="copalis-element">org.copalis.element</xsl:variable>

<xsl:param name="package" select="concat($copalis-element, '.schema')"/>
<xsl:param name="class" select="'XHTML1Strict'"/>

<xsl:template match="/xs:schema">
/*
 *  Copyright 2011 Giles Burgess
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package <xsl:value-of select="$package"/>;

import <xsl:value-of select="$copalis-element"/>.Attribute;
import <xsl:value-of select="$copalis-element"/>.Tag;

	<xsl:call-template name="javadoc"/>
public interface <xsl:value-of select="$class" /> {
	<xsl:apply-templates select="xs:element" mode="const"/>
	
	<xsl:apply-templates select="//xs:attribute[@name and not(@name=preceding::xs:attribute/@name)]"/>

	/**
	 * Interfaces defining the legal attributes and child elements of each node type
	 */	
	<xsl:apply-templates select="xs:element" mode="node"/>
	
	interface AttributeGroups {
	<xsl:apply-templates select="xs:attributeGroup"/>
	}
	
	interface Groups {
	<xsl:apply-templates select="xs:group"/>
	}
	
	interface ComplexTypes {
	<xsl:apply-templates select="xs:complexType"/>
	}
	
	/**
	 * A collection of marker interfaces for node containers
	 */
	interface Elements {<xsl:for-each select="xs:element">
		interface <xsl:call-template name="tname"/> {}</xsl:for-each>
	}
	
	/**
	 * A collection of marker interfaces for node attributes
	 */
	interface Attributes {<xsl:for-each select="//xs:attribute[@name and not(@name=preceding::xs:attribute/@name)]">
		interface <xsl:call-template name="tname"/> {}</xsl:for-each>
	}
}
</xsl:template>

<xsl:template match="//xs:attribute">
	<xsl:variable name="iface"><xsl:call-template name="iface"/></xsl:variable>
	<xsl:variable name="decl">
		<xsl:choose>
			<xsl:when test="@type='Number' or @type='Pixels'">Integer</xsl:when>
			<xsl:when test="@type='Character'">Character</xsl:when>
			<xsl:when test="@type='URI'">java.net.URI</xsl:when>
			<xsl:otherwise>String</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	public static final <xsl:value-of select="concat('Attribute&lt;', $iface, ', ', $decl, '&gt; ')" />
	<xsl:value-of select="translate(@name, $srctext, $uppercase)"/> =
			<xsl:value-of select="concat('Attribute.of(', $iface, '.class, ', $decl, '.class, &quot;', @name, '&quot;')"/>);	
</xsl:template>

<xsl:template match="/xs:schema/xs:attributeGroup|/xs:schema/xs:group|/xs:schema/xs:complexType">
	<xsl:call-template name="javadoc"/>
		interface <xsl:call-template name="tname"/>
	<xsl:for-each select="xs:attributeGroup|xs:attribute[@name]|.//xs:element|.//xs:group">
		<xsl:call-template name="extends"/>
		<xsl:call-template name="iface"/>
	</xsl:for-each> {}
</xsl:template>

<xsl:template match="/xs:schema/xs:element" mode="const">
	<xsl:variable name="elem" select = "@name" />
	<xsl:variable name="iface" select="translate(@name, $srctext, $uppercase)"/>
	<xsl:variable name="parent">
		<xsl:choose>
			<xsl:when test="//xs:element[@ref=$elem]">
				<xsl:value-of select="concat('Elements.', $iface)"/>
			</xsl:when>
			<xsl:otherwise>Void</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:variable name="text-type">
		<xsl:choose>
			<xsl:when test="xs:complexType[@mixed='true']">String</xsl:when>
			<xsl:otherwise>Void</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:call-template name="javadoc"/>
	public static final <xsl:value-of select=
		"concat('Tag&lt;', $parent, ', ', $iface, ', ', $text-type, '&gt; ',translate(@name, $srctext, $normalized))"/> =
			<xsl:value-of select="concat('Tag.of(', $parent, '.class, ', $iface, '.class, ', $text-type, '.class, &quot;', @name)"/>&quot;);
</xsl:template>

<xsl:template match="/xs:schema/xs:element" mode="node">
	<xsl:variable name="elem" select = "@name" />
	<xsl:variable name="iface">
		<xsl:call-template name="tname"/>
	</xsl:variable>
	interface <xsl:value-of select="$iface"/>
	<xsl:for-each select=".//xs:attributeGroup|.//xs:attribute[@name]|.//xs:extension|.//xs:group[not(@ref=preceding::xs:group[ancestor::xs:element/@name=$elem]/@ref)]|.//xs:element[@ref and not(@ref=.//preceding::xs:element[ancestor::xs:element/@name=$elem]/@ref)]">
		<xsl:call-template name="extends"/>
		<xsl:choose>
			<xsl:when test="name()='xs:extension'">
				<xsl:text>ComplexTypes.</xsl:text>
				<xsl:value-of select="translate(@base, $srctext, $uppercase)"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="iface"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:for-each> {}
</xsl:template>

<xsl:template name="extends">
	<xsl:choose>
		<xsl:when test="position()=1"><xsl:text> extends
			</xsl:text>
		</xsl:when>
		<xsl:otherwise><xsl:text>, 
			</xsl:text>
		</xsl:otherwise>
	</xsl:choose>
</xsl:template>

<xsl:template name="iface">
	<xsl:call-template name="capitalize-first"><xsl:with-param name="name" select="local-name()"/></xsl:call-template>
	<xsl:text>s.</xsl:text>
	<xsl:call-template name="tname"/>
</xsl:template>

<xsl:template name="tname">
	<xsl:variable name="refn">
		<xsl:choose>
			<xsl:when test="@ref"><xsl:value-of select="@ref"/></xsl:when>
			<xsl:otherwise><xsl:value-of select="@name"/></xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:value-of select="translate($refn, $srctext, $uppercase)"/>
</xsl:template>

<xsl:template name="capitalize-first">
	<xsl:param name="name"/>
	<xsl:value-of select="concat(translate(substring($name, 1, 1), $srctext, $uppercase), substring(translate($name, $srctext, $normalized), 2))"/>
</xsl:template>

<xsl:variable name="newline"><xsl:text>&#10;</xsl:text></xsl:variable>

<xsl:template name="javadoc">
	<xsl:if test="xs:annotation/xs:documentation">
	/**
	 * &lt;pre&gt;<xsl:call-template name="docline">
			<xsl:with-param name="text" select="substring-after(xs:annotation/xs:documentation, $newline)"/>
		</xsl:call-template>&lt;/pre&gt;
	 */</xsl:if>
</xsl:template>

<xsl:template name="docline">
	<xsl:param name="text"/>
	<xsl:if test="string-length($text) > 0">
	 *<xsl:value-of select="substring-before($text, $newline)"/>
		<xsl:call-template name="docline">
			<xsl:with-param name="text" select="substring-after($text, $newline)"/>
		</xsl:call-template>
	</xsl:if>
</xsl:template>

</xsl:stylesheet>