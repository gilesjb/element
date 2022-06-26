
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

package org.copalis.element.schema;

import org.copalis.element.Attribute;
import org.copalis.element.Tag;

	
	/**
	 * <pre>
	 *    XHTML 1.0 (Second Edition) Strict in XML Schema
	 *
	 *    This is the same as HTML 4 Strict except for
	 *    changes due to the differences between XML and SGML.
	 *
	 *    Namespace = http://www.w3.org/1999/xhtml
	 *
	 *    For further information, see: http://www.w3.org/TR/xhtml1
	 *
	 *    Copyright (c) 1998-2002 W3C (MIT, INRIA, Keio),
	 *    All Rights Reserved. 
	 *
	 *    The DTD version is identified by the PUBLIC and SYSTEM identifiers:
	 *
	 *    PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	 *    SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"
	 *
	 *    $Id: xhtml1-strict.xsd,v 1.2 2002/08/28 08:05:44 mimasa Exp $
	 *</pre>
	 */
public interface XHTML1Strict {
	
	public static final Tag<Void, HTML, Void> html =
			Tag.of(Void.class, HTML.class, Void.class, "html");

	/**
	 * <pre>
	 *      content model is "head.misc" combined with a single
	 *      title and an optional base element in any order
	 *</pre>
	 */
	public static final Tag<Elements.HEAD, HEAD, Void> head =
			Tag.of(Elements.HEAD.class, HEAD.class, Void.class, "head");

	/**
	 * <pre>
	 *      The title element is not considered part of the flow of text.
	 *      It should be displayed, for example as the page header or
	 *      window title. Exactly one title is required per document.
	 *</pre>
	 */
	public static final Tag<Elements.TITLE, TITLE, String> title =
			Tag.of(Elements.TITLE.class, TITLE.class, String.class, "title");

	/**
	 * <pre>
	 *      document base URI
	 *</pre>
	 */
	public static final Tag<Elements.BASE, BASE, Void> base =
			Tag.of(Elements.BASE.class, BASE.class, Void.class, "base");

	/**
	 * <pre>
	 *      generic metainformation
	 *</pre>
	 */
	public static final Tag<Elements.META, META, Void> meta =
			Tag.of(Elements.META.class, META.class, Void.class, "meta");

	/**
	 * <pre>
	 *      Relationship values can be used in principle:
	 *
	 *      a) for document specific toolbars/menus when used
	 *         with the link element in document head e.g.
	 *           start, contents, previous, next, index, end, help
	 *      b) to link to a separate style sheet (rel="stylesheet")
	 *      c) to make a link to a script (rel="script")
	 *      d) by stylesheets to control how collections of
	 *         html nodes are rendered into printed documents
	 *      e) to make a link to a printable version of this document
	 *         e.g. a PostScript or PDF version (rel="alternate" media="print")
	 *</pre>
	 */
	public static final Tag<Elements.LINK, LINK, Void> link =
			Tag.of(Elements.LINK.class, LINK.class, Void.class, "link");

	/**
	 * <pre>
	 *      style info, which may include CDATA sections
	 *</pre>
	 */
	public static final Tag<Elements.STYLE, STYLE, String> style =
			Tag.of(Elements.STYLE.class, STYLE.class, String.class, "style");

	/**
	 * <pre>
	 *      script statements, which may include CDATA sections
	 *</pre>
	 */
	public static final Tag<Elements.SCRIPT, SCRIPT, String> script =
			Tag.of(Elements.SCRIPT.class, SCRIPT.class, String.class, "script");

	/**
	 * <pre>
	 *      alternate content container for non script-based rendering
	 *</pre>
	 */
	public static final Tag<Elements.NOSCRIPT, NOSCRIPT, Void> noscript =
			Tag.of(Elements.NOSCRIPT.class, NOSCRIPT.class, Void.class, "noscript");

	public static final Tag<Elements.BODY, BODY, Void> body =
			Tag.of(Elements.BODY.class, BODY.class, Void.class, "body");

	/**
	 * <pre>
	 *      generic language/style container      
	 *</pre>
	 */
	public static final Tag<Elements.DIV, DIV, String> div =
			Tag.of(Elements.DIV.class, DIV.class, String.class, "div");

	public static final Tag<Elements.P, P, String> p =
			Tag.of(Elements.P.class, P.class, String.class, "p");

	public static final Tag<Elements.H1, H1, String> h1 =
			Tag.of(Elements.H1.class, H1.class, String.class, "h1");

	public static final Tag<Elements.H2, H2, String> h2 =
			Tag.of(Elements.H2.class, H2.class, String.class, "h2");

	public static final Tag<Elements.H3, H3, String> h3 =
			Tag.of(Elements.H3.class, H3.class, String.class, "h3");

	public static final Tag<Elements.H4, H4, String> h4 =
			Tag.of(Elements.H4.class, H4.class, String.class, "h4");

	public static final Tag<Elements.H5, H5, String> h5 =
			Tag.of(Elements.H5.class, H5.class, String.class, "h5");

	public static final Tag<Elements.H6, H6, String> h6 =
			Tag.of(Elements.H6.class, H6.class, String.class, "h6");

	/**
	 * <pre>
	 *      Unordered list
	 *</pre>
	 */
	public static final Tag<Elements.UL, UL, Void> ul =
			Tag.of(Elements.UL.class, UL.class, Void.class, "ul");

	/**
	 * <pre>
	 *      Ordered (numbered) list
	 *</pre>
	 */
	public static final Tag<Elements.OL, OL, Void> ol =
			Tag.of(Elements.OL.class, OL.class, Void.class, "ol");

	/**
	 * <pre>
	 *      list item
	 *</pre>
	 */
	public static final Tag<Elements.LI, LI, String> li =
			Tag.of(Elements.LI.class, LI.class, String.class, "li");

	public static final Tag<Elements.DL, DL, Void> dl =
			Tag.of(Elements.DL.class, DL.class, Void.class, "dl");

	public static final Tag<Elements.DT, DT, String> dt =
			Tag.of(Elements.DT.class, DT.class, String.class, "dt");

	public static final Tag<Elements.DD, DD, String> dd =
			Tag.of(Elements.DD.class, DD.class, String.class, "dd");

	/**
	 * <pre>
	 *      information on author
	 *</pre>
	 */
	public static final Tag<Elements.ADDRESS, ADDRESS, String> address =
			Tag.of(Elements.ADDRESS.class, ADDRESS.class, String.class, "address");

	public static final Tag<Elements.HR, HR, Void> hr =
			Tag.of(Elements.HR.class, HR.class, Void.class, "hr");

	/**
	 * <pre>
	 *      content is "Inline" excluding "img|object|big|small|sub|sup"
	 *</pre>
	 */
	public static final Tag<Elements.PRE, PRE, String> pre =
			Tag.of(Elements.PRE.class, PRE.class, String.class, "pre");

	public static final Tag<Elements.BLOCKQUOTE, BLOCKQUOTE, Void> blockquote =
			Tag.of(Elements.BLOCKQUOTE.class, BLOCKQUOTE.class, Void.class, "blockquote");

	public static final Tag<Elements.INS, INS, String> ins =
			Tag.of(Elements.INS.class, INS.class, String.class, "ins");

	public static final Tag<Elements.DEL, DEL, String> del =
			Tag.of(Elements.DEL.class, DEL.class, String.class, "del");

	/**
	 * <pre>
	 *      content is "Inline" except that anchors shouldn't be nested
	 *</pre>
	 */
	public static final Tag<Elements.A, A, String> a =
			Tag.of(Elements.A.class, A.class, String.class, "a");

	/**
	 * <pre>
	 *      generic language/style container
	 *</pre>
	 */
	public static final Tag<Elements.SPAN, SPAN, String> span =
			Tag.of(Elements.SPAN.class, SPAN.class, String.class, "span");

	/**
	 * <pre>
	 *      I18N BiDi over-ride
	 *</pre>
	 */
	public static final Tag<Elements.BDO, BDO, String> bdo =
			Tag.of(Elements.BDO.class, BDO.class, String.class, "bdo");

	/**
	 * <pre>
	 *      forced line break
	 *</pre>
	 */
	public static final Tag<Elements.BR, BR, Void> br =
			Tag.of(Elements.BR.class, BR.class, Void.class, "br");

	/**
	 * <pre>
	 *      emphasis
	 *</pre>
	 */
	public static final Tag<Elements.EM, EM, String> em =
			Tag.of(Elements.EM.class, EM.class, String.class, "em");

	/**
	 * <pre>
	 *      strong emphasis
	 *</pre>
	 */
	public static final Tag<Elements.STRONG, STRONG, String> strong =
			Tag.of(Elements.STRONG.class, STRONG.class, String.class, "strong");

	/**
	 * <pre>
	 *      definitional
	 *</pre>
	 */
	public static final Tag<Elements.DFN, DFN, String> dfn =
			Tag.of(Elements.DFN.class, DFN.class, String.class, "dfn");

	/**
	 * <pre>
	 *      program code
	 *</pre>
	 */
	public static final Tag<Elements.CODE, CODE, String> code =
			Tag.of(Elements.CODE.class, CODE.class, String.class, "code");

	/**
	 * <pre>
	 *      sample
	 *</pre>
	 */
	public static final Tag<Elements.SAMP, SAMP, String> samp =
			Tag.of(Elements.SAMP.class, SAMP.class, String.class, "samp");

	/**
	 * <pre>
	 *      something user would type
	 *</pre>
	 */
	public static final Tag<Elements.KBD, KBD, String> kbd =
			Tag.of(Elements.KBD.class, KBD.class, String.class, "kbd");

	/**
	 * <pre>
	 *      variable
	 *</pre>
	 */
	public static final Tag<Elements.VAR, VAR, String> var =
			Tag.of(Elements.VAR.class, VAR.class, String.class, "var");

	/**
	 * <pre>
	 *      citation
	 *</pre>
	 */
	public static final Tag<Elements.CITE, CITE, String> cite =
			Tag.of(Elements.CITE.class, CITE.class, String.class, "cite");

	/**
	 * <pre>
	 *      abbreviation
	 *</pre>
	 */
	public static final Tag<Elements.ABBR, ABBR, String> abbr =
			Tag.of(Elements.ABBR.class, ABBR.class, String.class, "abbr");

	/**
	 * <pre>
	 *      acronym
	 *</pre>
	 */
	public static final Tag<Elements.ACRONYM, ACRONYM, String> acronym =
			Tag.of(Elements.ACRONYM.class, ACRONYM.class, String.class, "acronym");

	/**
	 * <pre>
	 *      inlined quote
	 *</pre>
	 */
	public static final Tag<Elements.Q, Q, String> q =
			Tag.of(Elements.Q.class, Q.class, String.class, "q");

	/**
	 * <pre>
	 *      subscript
	 *</pre>
	 */
	public static final Tag<Elements.SUB, SUB, String> sub =
			Tag.of(Elements.SUB.class, SUB.class, String.class, "sub");

	/**
	 * <pre>
	 *      superscript
	 *</pre>
	 */
	public static final Tag<Elements.SUP, SUP, String> sup =
			Tag.of(Elements.SUP.class, SUP.class, String.class, "sup");

	/**
	 * <pre>
	 *      fixed pitch font
	 *</pre>
	 */
	public static final Tag<Elements.TT, TT, String> tt =
			Tag.of(Elements.TT.class, TT.class, String.class, "tt");

	/**
	 * <pre>
	 *      italic font
	 *</pre>
	 */
	public static final Tag<Elements.I, I, String> i =
			Tag.of(Elements.I.class, I.class, String.class, "i");

	/**
	 * <pre>
	 *      bold font
	 *</pre>
	 */
	public static final Tag<Elements.B, B, String> b =
			Tag.of(Elements.B.class, B.class, String.class, "b");

	/**
	 * <pre>
	 *      bigger font
	 *</pre>
	 */
	public static final Tag<Elements.BIG, BIG, String> big =
			Tag.of(Elements.BIG.class, BIG.class, String.class, "big");

	/**
	 * <pre>
	 *      smaller font
	 *</pre>
	 */
	public static final Tag<Elements.SMALL, SMALL, String> small =
			Tag.of(Elements.SMALL.class, SMALL.class, String.class, "small");

	public static final Tag<Elements.OBJECT, OBJECT, String> object =
			Tag.of(Elements.OBJECT.class, OBJECT.class, String.class, "object");

	/**
	 * <pre>
	 *      param is used to supply a named property value.
	 *      In XML it would seem natural to follow RDF and support an
	 *      abbreviated syntax where the param elements are replaced
	 *      by attribute value pairs on the object start tag.
	 *</pre>
	 */
	public static final Tag<Elements.PARAM, PARAM, Void> param =
			Tag.of(Elements.PARAM.class, PARAM.class, Void.class, "param");

	public static final Tag<Elements.IMG, IMG, Void> img =
			Tag.of(Elements.IMG.class, IMG.class, Void.class, "img");

	public static final Tag<Elements.MAP, MAP, Void> map =
			Tag.of(Elements.MAP.class, MAP.class, Void.class, "map");

	public static final Tag<Elements.AREA, AREA, Void> area =
			Tag.of(Elements.AREA.class, AREA.class, Void.class, "area");

	public static final Tag<Elements.FORM, FORM, Void> form =
			Tag.of(Elements.FORM.class, FORM.class, Void.class, "form");

	/**
	 * <pre>
	 *      Each label must not contain more than ONE field
	 *      Label elements shouldn't be nested.
	 *</pre>
	 */
	public static final Tag<Elements.LABEL, LABEL, String> label =
			Tag.of(Elements.LABEL.class, LABEL.class, String.class, "label");

	/**
	 * <pre>
	 *      form control
	 *</pre>
	 */
	public static final Tag<Elements.INPUT, INPUT, Void> input =
			Tag.of(Elements.INPUT.class, INPUT.class, Void.class, "input");

	/**
	 * <pre>
	 *      option selector
	 *</pre>
	 */
	public static final Tag<Elements.SELECT, SELECT, Void> select =
			Tag.of(Elements.SELECT.class, SELECT.class, Void.class, "select");

	/**
	 * <pre>
	 *      option group
	 *</pre>
	 */
	public static final Tag<Elements.OPTGROUP, OPTGROUP, Void> optgroup =
			Tag.of(Elements.OPTGROUP.class, OPTGROUP.class, Void.class, "optgroup");

	/**
	 * <pre>
	 *      selectable choice
	 *</pre>
	 */
	public static final Tag<Elements.OPTION, OPTION, String> option =
			Tag.of(Elements.OPTION.class, OPTION.class, String.class, "option");

	/**
	 * <pre>
	 *      multi-line text field
	 *</pre>
	 */
	public static final Tag<Elements.TEXTAREA, TEXTAREA, String> textarea =
			Tag.of(Elements.TEXTAREA.class, TEXTAREA.class, String.class, "textarea");

	/**
	 * <pre>
	 *      The fieldset element is used to group form fields.
	 *      Only one legend element should occur in the content
	 *      and if present should only be preceded by whitespace.
	 *
	 *      NOTE: this content model is different from the XHTML 1.0 DTD,
	 *      closer to the intended content model in HTML4 DTD
	 *</pre>
	 */
	public static final Tag<Elements.FIELDSET, FIELDSET, String> fieldset =
			Tag.of(Elements.FIELDSET.class, FIELDSET.class, String.class, "fieldset");

	/**
	 * <pre>
	 *      fieldset label
	 *</pre>
	 */
	public static final Tag<Elements.LEGEND, LEGEND, String> legend =
			Tag.of(Elements.LEGEND.class, LEGEND.class, String.class, "legend");

	/**
	 * <pre>
	 *      Content is "Flow" excluding a, form and form controls
	 *</pre>
	 */
	public static final Tag<Elements.BUTTON, BUTTON, String> button =
			Tag.of(Elements.BUTTON.class, BUTTON.class, String.class, "button");

	public static final Tag<Elements.TABLE, TABLE, Void> table =
			Tag.of(Elements.TABLE.class, TABLE.class, Void.class, "table");

	public static final Tag<Elements.CAPTION, CAPTION, String> caption =
			Tag.of(Elements.CAPTION.class, CAPTION.class, String.class, "caption");

	public static final Tag<Elements.THEAD, THEAD, Void> thead =
			Tag.of(Elements.THEAD.class, THEAD.class, Void.class, "thead");

	public static final Tag<Elements.TFOOT, TFOOT, Void> tfoot =
			Tag.of(Elements.TFOOT.class, TFOOT.class, Void.class, "tfoot");

	public static final Tag<Elements.TBODY, TBODY, Void> tbody =
			Tag.of(Elements.TBODY.class, TBODY.class, Void.class, "tbody");

	/**
	 * <pre>
	 *      colgroup groups a set of col elements. It allows you to group
	 *      several semantically related columns together.
	 *</pre>
	 */
	public static final Tag<Elements.COLGROUP, COLGROUP, Void> colgroup =
			Tag.of(Elements.COLGROUP.class, COLGROUP.class, Void.class, "colgroup");

	/**
	 * <pre>
	 *      col elements define the alignment properties for cells in
	 *      one or more columns.
	 *
	 *      The width attribute specifies the width of the columns, e.g.
	 *
	 *          width=64        width in screen pixels
	 *          width=0.5*      relative width of 0.5
	 *
	 *      The span attribute causes the attributes of one
	 *      col element to apply to more than one column.
	 *</pre>
	 */
	public static final Tag<Elements.COL, COL, Void> col =
			Tag.of(Elements.COL.class, COL.class, Void.class, "col");

	public static final Tag<Elements.TR, TR, Void> tr =
			Tag.of(Elements.TR.class, TR.class, Void.class, "tr");

	public static final Tag<Elements.TH, TH, String> th =
			Tag.of(Elements.TH.class, TH.class, String.class, "th");

	public static final Tag<Elements.TD, TD, String> td =
			Tag.of(Elements.TD.class, TD.class, String.class, "td");

	public static final Attribute<Attributes.ID, String> ID =
			Attribute.of(Attributes.ID.class, String.class, "id");	

	public static final Attribute<Attributes.CLASS, String> CLASS =
			Attribute.of(Attributes.CLASS.class, String.class, "class");	

	public static final Attribute<Attributes.STYLE, String> STYLE =
			Attribute.of(Attributes.STYLE.class, String.class, "style");	

	public static final Attribute<Attributes.TITLE, String> TITLE =
			Attribute.of(Attributes.TITLE.class, String.class, "title");	

	public static final Attribute<Attributes.LANG, String> LANG =
			Attribute.of(Attributes.LANG.class, String.class, "lang");	

	public static final Attribute<Attributes.DIR, String> DIR =
			Attribute.of(Attributes.DIR.class, String.class, "dir");	

	public static final Attribute<Attributes.ONCLICK, String> ONCLICK =
			Attribute.of(Attributes.ONCLICK.class, String.class, "onclick");	

	public static final Attribute<Attributes.ONDBLCLICK, String> ONDBLCLICK =
			Attribute.of(Attributes.ONDBLCLICK.class, String.class, "ondblclick");	

	public static final Attribute<Attributes.ONMOUSEDOWN, String> ONMOUSEDOWN =
			Attribute.of(Attributes.ONMOUSEDOWN.class, String.class, "onmousedown");	

	public static final Attribute<Attributes.ONMOUSEUP, String> ONMOUSEUP =
			Attribute.of(Attributes.ONMOUSEUP.class, String.class, "onmouseup");	

	public static final Attribute<Attributes.ONMOUSEOVER, String> ONMOUSEOVER =
			Attribute.of(Attributes.ONMOUSEOVER.class, String.class, "onmouseover");	

	public static final Attribute<Attributes.ONMOUSEMOVE, String> ONMOUSEMOVE =
			Attribute.of(Attributes.ONMOUSEMOVE.class, String.class, "onmousemove");	

	public static final Attribute<Attributes.ONMOUSEOUT, String> ONMOUSEOUT =
			Attribute.of(Attributes.ONMOUSEOUT.class, String.class, "onmouseout");	

	public static final Attribute<Attributes.ONKEYPRESS, String> ONKEYPRESS =
			Attribute.of(Attributes.ONKEYPRESS.class, String.class, "onkeypress");	

	public static final Attribute<Attributes.ONKEYDOWN, String> ONKEYDOWN =
			Attribute.of(Attributes.ONKEYDOWN.class, String.class, "onkeydown");	

	public static final Attribute<Attributes.ONKEYUP, String> ONKEYUP =
			Attribute.of(Attributes.ONKEYUP.class, String.class, "onkeyup");	

	public static final Attribute<Attributes.ACCESSKEY, Character> ACCESSKEY =
			Attribute.of(Attributes.ACCESSKEY.class, Character.class, "accesskey");	

	public static final Attribute<Attributes.TABINDEX, String> TABINDEX =
			Attribute.of(Attributes.TABINDEX.class, String.class, "tabindex");	

	public static final Attribute<Attributes.ONFOCUS, String> ONFOCUS =
			Attribute.of(Attributes.ONFOCUS.class, String.class, "onfocus");	

	public static final Attribute<Attributes.ONBLUR, String> ONBLUR =
			Attribute.of(Attributes.ONBLUR.class, String.class, "onblur");	

	public static final Attribute<Attributes.PROFILE, java.net.URI> PROFILE =
			Attribute.of(Attributes.PROFILE.class, java.net.URI.class, "profile");	

	public static final Attribute<Attributes.HREF, java.net.URI> HREF =
			Attribute.of(Attributes.HREF.class, java.net.URI.class, "href");	

	public static final Attribute<Attributes.HTTP_EQUIV, String> HTTP_EQUIV =
			Attribute.of(Attributes.HTTP_EQUIV.class, String.class, "http-equiv");	

	public static final Attribute<Attributes.NAME, String> NAME =
			Attribute.of(Attributes.NAME.class, String.class, "name");	

	public static final Attribute<Attributes.CONTENT, String> CONTENT =
			Attribute.of(Attributes.CONTENT.class, String.class, "content");	

	public static final Attribute<Attributes.SCHEME, String> SCHEME =
			Attribute.of(Attributes.SCHEME.class, String.class, "scheme");	

	public static final Attribute<Attributes.CHARSET, String> CHARSET =
			Attribute.of(Attributes.CHARSET.class, String.class, "charset");	

	public static final Attribute<Attributes.HREFLANG, String> HREFLANG =
			Attribute.of(Attributes.HREFLANG.class, String.class, "hreflang");	

	public static final Attribute<Attributes.TYPE, String> TYPE =
			Attribute.of(Attributes.TYPE.class, String.class, "type");	

	public static final Attribute<Attributes.REL, String> REL =
			Attribute.of(Attributes.REL.class, String.class, "rel");	

	public static final Attribute<Attributes.REV, String> REV =
			Attribute.of(Attributes.REV.class, String.class, "rev");	

	public static final Attribute<Attributes.MEDIA, String> MEDIA =
			Attribute.of(Attributes.MEDIA.class, String.class, "media");	

	public static final Attribute<Attributes.SRC, java.net.URI> SRC =
			Attribute.of(Attributes.SRC.class, java.net.URI.class, "src");	

	public static final Attribute<Attributes.DEFER, String> DEFER =
			Attribute.of(Attributes.DEFER.class, String.class, "defer");	

	public static final Attribute<Attributes.ONLOAD, String> ONLOAD =
			Attribute.of(Attributes.ONLOAD.class, String.class, "onload");	

	public static final Attribute<Attributes.ONUNLOAD, String> ONUNLOAD =
			Attribute.of(Attributes.ONUNLOAD.class, String.class, "onunload");	

	public static final Attribute<Attributes.CITE, java.net.URI> CITE =
			Attribute.of(Attributes.CITE.class, java.net.URI.class, "cite");	

	public static final Attribute<Attributes.DATETIME, String> DATETIME =
			Attribute.of(Attributes.DATETIME.class, String.class, "datetime");	

	public static final Attribute<Attributes.SHAPE, String> SHAPE =
			Attribute.of(Attributes.SHAPE.class, String.class, "shape");	

	public static final Attribute<Attributes.COORDS, String> COORDS =
			Attribute.of(Attributes.COORDS.class, String.class, "coords");	

	public static final Attribute<Attributes.DECLARE, String> DECLARE =
			Attribute.of(Attributes.DECLARE.class, String.class, "declare");	

	public static final Attribute<Attributes.CLASSID, java.net.URI> CLASSID =
			Attribute.of(Attributes.CLASSID.class, java.net.URI.class, "classid");	

	public static final Attribute<Attributes.CODEBASE, java.net.URI> CODEBASE =
			Attribute.of(Attributes.CODEBASE.class, java.net.URI.class, "codebase");	

	public static final Attribute<Attributes.DATA, java.net.URI> DATA =
			Attribute.of(Attributes.DATA.class, java.net.URI.class, "data");	

	public static final Attribute<Attributes.CODETYPE, String> CODETYPE =
			Attribute.of(Attributes.CODETYPE.class, String.class, "codetype");	

	public static final Attribute<Attributes.ARCHIVE, String> ARCHIVE =
			Attribute.of(Attributes.ARCHIVE.class, String.class, "archive");	

	public static final Attribute<Attributes.STANDBY, String> STANDBY =
			Attribute.of(Attributes.STANDBY.class, String.class, "standby");	

	public static final Attribute<Attributes.HEIGHT, String> HEIGHT =
			Attribute.of(Attributes.HEIGHT.class, String.class, "height");	

	public static final Attribute<Attributes.WIDTH, String> WIDTH =
			Attribute.of(Attributes.WIDTH.class, String.class, "width");	

	public static final Attribute<Attributes.USEMAP, java.net.URI> USEMAP =
			Attribute.of(Attributes.USEMAP.class, java.net.URI.class, "usemap");	

	public static final Attribute<Attributes.VALUE, String> VALUE =
			Attribute.of(Attributes.VALUE.class, String.class, "value");	

	public static final Attribute<Attributes.VALUETYPE, String> VALUETYPE =
			Attribute.of(Attributes.VALUETYPE.class, String.class, "valuetype");	

	public static final Attribute<Attributes.ALT, String> ALT =
			Attribute.of(Attributes.ALT.class, String.class, "alt");	

	public static final Attribute<Attributes.LONGDESC, java.net.URI> LONGDESC =
			Attribute.of(Attributes.LONGDESC.class, java.net.URI.class, "longdesc");	

	public static final Attribute<Attributes.ISMAP, String> ISMAP =
			Attribute.of(Attributes.ISMAP.class, String.class, "ismap");	

	public static final Attribute<Attributes.NOHREF, String> NOHREF =
			Attribute.of(Attributes.NOHREF.class, String.class, "nohref");	

	public static final Attribute<Attributes.ACTION, java.net.URI> ACTION =
			Attribute.of(Attributes.ACTION.class, java.net.URI.class, "action");	

	public static final Attribute<Attributes.METHOD, String> METHOD =
			Attribute.of(Attributes.METHOD.class, String.class, "method");	

	public static final Attribute<Attributes.ENCTYPE, String> ENCTYPE =
			Attribute.of(Attributes.ENCTYPE.class, String.class, "enctype");	

	public static final Attribute<Attributes.ONSUBMIT, String> ONSUBMIT =
			Attribute.of(Attributes.ONSUBMIT.class, String.class, "onsubmit");	

	public static final Attribute<Attributes.ONRESET, String> ONRESET =
			Attribute.of(Attributes.ONRESET.class, String.class, "onreset");	

	public static final Attribute<Attributes.ACCEPT, String> ACCEPT =
			Attribute.of(Attributes.ACCEPT.class, String.class, "accept");	

	public static final Attribute<Attributes.ACCEPT_CHARSET, String> ACCEPT_CHARSET =
			Attribute.of(Attributes.ACCEPT_CHARSET.class, String.class, "accept-charset");	

	public static final Attribute<Attributes.FOR, String> FOR =
			Attribute.of(Attributes.FOR.class, String.class, "for");	

	public static final Attribute<Attributes.CHECKED, String> CHECKED =
			Attribute.of(Attributes.CHECKED.class, String.class, "checked");	

	public static final Attribute<Attributes.DISABLED, String> DISABLED =
			Attribute.of(Attributes.DISABLED.class, String.class, "disabled");	

	public static final Attribute<Attributes.READONLY, String> READONLY =
			Attribute.of(Attributes.READONLY.class, String.class, "readonly");	

	public static final Attribute<Attributes.SIZE, String> SIZE =
			Attribute.of(Attributes.SIZE.class, String.class, "size");	

	public static final Attribute<Attributes.MAXLENGTH, Integer> MAXLENGTH =
			Attribute.of(Attributes.MAXLENGTH.class, Integer.class, "maxlength");	

	public static final Attribute<Attributes.ONSELECT, String> ONSELECT =
			Attribute.of(Attributes.ONSELECT.class, String.class, "onselect");	

	public static final Attribute<Attributes.ONCHANGE, String> ONCHANGE =
			Attribute.of(Attributes.ONCHANGE.class, String.class, "onchange");	

	public static final Attribute<Attributes.MULTIPLE, String> MULTIPLE =
			Attribute.of(Attributes.MULTIPLE.class, String.class, "multiple");	

	public static final Attribute<Attributes.LABEL, String> LABEL =
			Attribute.of(Attributes.LABEL.class, String.class, "label");	

	public static final Attribute<Attributes.SELECTED, String> SELECTED =
			Attribute.of(Attributes.SELECTED.class, String.class, "selected");	

	public static final Attribute<Attributes.ROWS, Integer> ROWS =
			Attribute.of(Attributes.ROWS.class, Integer.class, "rows");	

	public static final Attribute<Attributes.COLS, Integer> COLS =
			Attribute.of(Attributes.COLS.class, Integer.class, "cols");	

	public static final Attribute<Attributes.ALIGN, String> ALIGN =
			Attribute.of(Attributes.ALIGN.class, String.class, "align");	

	public static final Attribute<Attributes.CHAR, Character> CHAR =
			Attribute.of(Attributes.CHAR.class, Character.class, "char");	

	public static final Attribute<Attributes.CHAROFF, String> CHAROFF =
			Attribute.of(Attributes.CHAROFF.class, String.class, "charoff");	

	public static final Attribute<Attributes.VALIGN, String> VALIGN =
			Attribute.of(Attributes.VALIGN.class, String.class, "valign");	

	public static final Attribute<Attributes.SUMMARY, String> SUMMARY =
			Attribute.of(Attributes.SUMMARY.class, String.class, "summary");	

	public static final Attribute<Attributes.BORDER, Integer> BORDER =
			Attribute.of(Attributes.BORDER.class, Integer.class, "border");	

	public static final Attribute<Attributes.FRAME, String> FRAME =
			Attribute.of(Attributes.FRAME.class, String.class, "frame");	

	public static final Attribute<Attributes.RULES, String> RULES =
			Attribute.of(Attributes.RULES.class, String.class, "rules");	

	public static final Attribute<Attributes.CELLSPACING, String> CELLSPACING =
			Attribute.of(Attributes.CELLSPACING.class, String.class, "cellspacing");	

	public static final Attribute<Attributes.CELLPADDING, String> CELLPADDING =
			Attribute.of(Attributes.CELLPADDING.class, String.class, "cellpadding");	

	public static final Attribute<Attributes.SPAN, Integer> SPAN =
			Attribute.of(Attributes.SPAN.class, Integer.class, "span");	

	public static final Attribute<Attributes.ABBR, String> ABBR =
			Attribute.of(Attributes.ABBR.class, String.class, "abbr");	

	public static final Attribute<Attributes.AXIS, String> AXIS =
			Attribute.of(Attributes.AXIS.class, String.class, "axis");	

	public static final Attribute<Attributes.HEADERS, String> HEADERS =
			Attribute.of(Attributes.HEADERS.class, String.class, "headers");	

	public static final Attribute<Attributes.SCOPE, String> SCOPE =
			Attribute.of(Attributes.SCOPE.class, String.class, "scope");	

	public static final Attribute<Attributes.ROWSPAN, Integer> ROWSPAN =
			Attribute.of(Attributes.ROWSPAN.class, Integer.class, "rowspan");	

	public static final Attribute<Attributes.COLSPAN, Integer> COLSPAN =
			Attribute.of(Attributes.COLSPAN.class, Integer.class, "colspan");	


	/**
	 * Interfaces defining the legal attributes and child elements of each node type
	 */	
	
	interface HTML extends
			Elements.HEAD, 
			Elements.BODY, 
			AttributeGroups.I18N, 
			Attributes.ID {}

	interface HEAD extends
			Groups.HEAD_MISC, 
			Elements.TITLE, 
			Elements.BASE, 
			AttributeGroups.I18N, 
			Attributes.ID, 
			Attributes.PROFILE {}

	interface TITLE extends
			AttributeGroups.I18N, 
			Attributes.ID {}

	interface BASE extends
			Attributes.HREF, 
			Attributes.ID {}

	interface META extends
			AttributeGroups.I18N, 
			Attributes.ID, 
			Attributes.HTTP_EQUIV, 
			Attributes.NAME, 
			Attributes.CONTENT, 
			Attributes.SCHEME {}

	interface LINK extends
			AttributeGroups.ATTRS, 
			Attributes.CHARSET, 
			Attributes.HREF, 
			Attributes.HREFLANG, 
			Attributes.TYPE, 
			Attributes.REL, 
			Attributes.REV, 
			Attributes.MEDIA {}

	interface STYLE extends
			AttributeGroups.I18N, 
			Attributes.ID, 
			Attributes.TYPE, 
			Attributes.MEDIA, 
			Attributes.TITLE {}

	interface SCRIPT extends
			Attributes.ID, 
			Attributes.CHARSET, 
			Attributes.TYPE, 
			Attributes.SRC, 
			Attributes.DEFER {}

	interface NOSCRIPT extends
			ComplexTypes.BLOCK, 
			AttributeGroups.ATTRS {}

	interface BODY extends
			ComplexTypes.BLOCK, 
			AttributeGroups.ATTRS, 
			Attributes.ONLOAD, 
			Attributes.ONUNLOAD {}

	interface DIV extends
			ComplexTypes.FLOW, 
			AttributeGroups.ATTRS {}

	interface P extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface H1 extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface H2 extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface H3 extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface H4 extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface H5 extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface H6 extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface UL extends
			Elements.LI, 
			AttributeGroups.ATTRS {}

	interface OL extends
			Elements.LI, 
			AttributeGroups.ATTRS {}

	interface LI extends
			ComplexTypes.FLOW, 
			AttributeGroups.ATTRS {}

	interface DL extends
			Elements.DT, 
			Elements.DD, 
			AttributeGroups.ATTRS {}

	interface DT extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface DD extends
			ComplexTypes.FLOW, 
			AttributeGroups.ATTRS {}

	interface ADDRESS extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface HR extends
			AttributeGroups.ATTRS {}

	interface PRE extends
			ComplexTypes.PRE_CONTENT, 
			AttributeGroups.ATTRS {}

	interface BLOCKQUOTE extends
			ComplexTypes.BLOCK, 
			AttributeGroups.ATTRS, 
			Attributes.CITE {}

	interface INS extends
			ComplexTypes.FLOW, 
			AttributeGroups.ATTRS, 
			Attributes.CITE, 
			Attributes.DATETIME {}

	interface DEL extends
			ComplexTypes.FLOW, 
			AttributeGroups.ATTRS, 
			Attributes.CITE, 
			Attributes.DATETIME {}

	interface A extends
			ComplexTypes.A_CONTENT, 
			AttributeGroups.ATTRS, 
			AttributeGroups.FOCUS, 
			Attributes.CHARSET, 
			Attributes.TYPE, 
			Attributes.NAME, 
			Attributes.HREF, 
			Attributes.HREFLANG, 
			Attributes.REL, 
			Attributes.REV, 
			Attributes.SHAPE, 
			Attributes.COORDS {}

	interface SPAN extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface BDO extends
			ComplexTypes.INLINE, 
			AttributeGroups.COREATTRS, 
			AttributeGroups.EVENTS, 
			Attributes.LANG, 
			Attributes.DIR {}

	interface BR extends
			AttributeGroups.COREATTRS {}

	interface EM extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface STRONG extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface DFN extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface CODE extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface SAMP extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface KBD extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface VAR extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface CITE extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface ABBR extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface ACRONYM extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface Q extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS, 
			Attributes.CITE {}

	interface SUB extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface SUP extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface TT extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface I extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface B extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface BIG extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface SMALL extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface OBJECT extends
			Elements.PARAM, 
			Groups.BLOCK, 
			Elements.FORM, 
			Groups.INLINE, 
			Groups.MISC, 
			AttributeGroups.ATTRS, 
			Attributes.DECLARE, 
			Attributes.CLASSID, 
			Attributes.CODEBASE, 
			Attributes.DATA, 
			Attributes.TYPE, 
			Attributes.CODETYPE, 
			Attributes.ARCHIVE, 
			Attributes.STANDBY, 
			Attributes.HEIGHT, 
			Attributes.WIDTH, 
			Attributes.USEMAP, 
			Attributes.NAME, 
			Attributes.TABINDEX {}

	interface PARAM extends
			Attributes.ID, 
			Attributes.NAME, 
			Attributes.VALUE, 
			Attributes.VALUETYPE, 
			Attributes.TYPE {}

	interface IMG extends
			AttributeGroups.ATTRS, 
			Attributes.SRC, 
			Attributes.ALT, 
			Attributes.LONGDESC, 
			Attributes.HEIGHT, 
			Attributes.WIDTH, 
			Attributes.USEMAP, 
			Attributes.ISMAP {}

	interface MAP extends
			Groups.BLOCK, 
			Elements.FORM, 
			Groups.MISC, 
			Elements.AREA, 
			AttributeGroups.I18N, 
			AttributeGroups.EVENTS, 
			Attributes.ID, 
			Attributes.CLASS, 
			Attributes.STYLE, 
			Attributes.TITLE, 
			Attributes.NAME {}

	interface AREA extends
			AttributeGroups.ATTRS, 
			AttributeGroups.FOCUS, 
			Attributes.SHAPE, 
			Attributes.COORDS, 
			Attributes.HREF, 
			Attributes.NOHREF, 
			Attributes.ALT {}

	interface FORM extends
			ComplexTypes.FORM_CONTENT, 
			AttributeGroups.ATTRS, 
			Attributes.ACTION, 
			Attributes.METHOD, 
			Attributes.ENCTYPE, 
			Attributes.ONSUBMIT, 
			Attributes.ONRESET, 
			Attributes.ACCEPT, 
			Attributes.ACCEPT_CHARSET {}

	interface LABEL extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS, 
			Attributes.FOR, 
			Attributes.ACCESSKEY, 
			Attributes.ONFOCUS, 
			Attributes.ONBLUR {}

	interface INPUT extends
			AttributeGroups.ATTRS, 
			AttributeGroups.FOCUS, 
			Attributes.TYPE, 
			Attributes.NAME, 
			Attributes.VALUE, 
			Attributes.CHECKED, 
			Attributes.DISABLED, 
			Attributes.READONLY, 
			Attributes.SIZE, 
			Attributes.MAXLENGTH, 
			Attributes.SRC, 
			Attributes.ALT, 
			Attributes.USEMAP, 
			Attributes.ONSELECT, 
			Attributes.ONCHANGE, 
			Attributes.ACCEPT {}

	interface SELECT extends
			Elements.OPTGROUP, 
			Elements.OPTION, 
			AttributeGroups.ATTRS, 
			Attributes.NAME, 
			Attributes.SIZE, 
			Attributes.MULTIPLE, 
			Attributes.DISABLED, 
			Attributes.TABINDEX, 
			Attributes.ONFOCUS, 
			Attributes.ONBLUR, 
			Attributes.ONCHANGE {}

	interface OPTGROUP extends
			Elements.OPTION, 
			AttributeGroups.ATTRS, 
			Attributes.DISABLED, 
			Attributes.LABEL {}

	interface OPTION extends
			AttributeGroups.ATTRS, 
			Attributes.SELECTED, 
			Attributes.DISABLED, 
			Attributes.LABEL, 
			Attributes.VALUE {}

	interface TEXTAREA extends
			AttributeGroups.ATTRS, 
			AttributeGroups.FOCUS, 
			Attributes.NAME, 
			Attributes.ROWS, 
			Attributes.COLS, 
			Attributes.DISABLED, 
			Attributes.READONLY, 
			Attributes.ONSELECT, 
			Attributes.ONCHANGE {}

	interface FIELDSET extends
			Elements.LEGEND, 
			Groups.BLOCK, 
			Elements.FORM, 
			Groups.INLINE, 
			Groups.MISC, 
			AttributeGroups.ATTRS {}

	interface LEGEND extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS, 
			Attributes.ACCESSKEY {}

	interface BUTTON extends
			ComplexTypes.BUTTON_CONTENT, 
			AttributeGroups.ATTRS, 
			AttributeGroups.FOCUS, 
			Attributes.NAME, 
			Attributes.VALUE, 
			Attributes.TYPE, 
			Attributes.DISABLED {}

	interface TABLE extends
			Elements.CAPTION, 
			Elements.COL, 
			Elements.COLGROUP, 
			Elements.THEAD, 
			Elements.TFOOT, 
			Elements.TBODY, 
			Elements.TR, 
			AttributeGroups.ATTRS, 
			Attributes.SUMMARY, 
			Attributes.WIDTH, 
			Attributes.BORDER, 
			Attributes.FRAME, 
			Attributes.RULES, 
			Attributes.CELLSPACING, 
			Attributes.CELLPADDING {}

	interface CAPTION extends
			ComplexTypes.INLINE, 
			AttributeGroups.ATTRS {}

	interface THEAD extends
			Elements.TR, 
			AttributeGroups.ATTRS, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	interface TFOOT extends
			Elements.TR, 
			AttributeGroups.ATTRS, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	interface TBODY extends
			Elements.TR, 
			AttributeGroups.ATTRS, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	interface COLGROUP extends
			Elements.COL, 
			AttributeGroups.ATTRS, 
			Attributes.SPAN, 
			Attributes.WIDTH, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	interface COL extends
			AttributeGroups.ATTRS, 
			Attributes.SPAN, 
			Attributes.WIDTH, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	interface TR extends
			Elements.TH, 
			Elements.TD, 
			AttributeGroups.ATTRS, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	interface TH extends
			ComplexTypes.FLOW, 
			AttributeGroups.ATTRS, 
			Attributes.ABBR, 
			Attributes.AXIS, 
			Attributes.HEADERS, 
			Attributes.SCOPE, 
			Attributes.ROWSPAN, 
			Attributes.COLSPAN, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	interface TD extends
			ComplexTypes.FLOW, 
			AttributeGroups.ATTRS, 
			Attributes.ABBR, 
			Attributes.AXIS, 
			Attributes.HEADERS, 
			Attributes.SCOPE, 
			Attributes.ROWSPAN, 
			Attributes.COLSPAN, 
			AttributeGroups.CELLHALIGN, 
			AttributeGroups.CELLVALIGN {}

	
	interface AttributeGroups {
	
	/**
	 * <pre>
	 *      core attributes common to most elements
	 *      id       document-wide unique id
	 *      class    space separated list of classes
	 *      style    associated style info
	 *      title    advisory title/amplification
	 *</pre>
	 */
		interface COREATTRS extends
			Attributes.ID, 
			Attributes.CLASS, 
			Attributes.STYLE, 
			Attributes.TITLE {}

	/**
	 * <pre>
	 *      internationalization attributes
	 *      lang        language code (backwards compatible)
	 *      xml:lang    language code (as per XML 1.0 spec)
	 *      dir         direction for weak/neutral text
	 *</pre>
	 */
		interface I18N extends
			Attributes.LANG, 
			Attributes.DIR {}

	/**
	 * <pre>
	 *      attributes for common UI events
	 *      onclick     a pointer button was clicked
	 *      ondblclick  a pointer button was double clicked
	 *      onmousedown a pointer button was pressed down
	 *      onmouseup   a pointer button was released
	 *      onmousemove a pointer was moved onto the element
	 *      onmouseout  a pointer was moved away from the element
	 *      onkeypress  a key was pressed and released
	 *      onkeydown   a key was pressed down
	 *      onkeyup     a key was released
	 *</pre>
	 */
		interface EVENTS extends
			Attributes.ONCLICK, 
			Attributes.ONDBLCLICK, 
			Attributes.ONMOUSEDOWN, 
			Attributes.ONMOUSEUP, 
			Attributes.ONMOUSEOVER, 
			Attributes.ONMOUSEMOVE, 
			Attributes.ONMOUSEOUT, 
			Attributes.ONKEYPRESS, 
			Attributes.ONKEYDOWN, 
			Attributes.ONKEYUP {}

	/**
	 * <pre>
	 *      attributes for elements that can get the focus
	 *      accesskey   accessibility key character
	 *      tabindex    position in tabbing order
	 *      onfocus     the element got the focus
	 *      onblur      the element lost the focus
	 *</pre>
	 */
		interface FOCUS extends
			Attributes.ACCESSKEY, 
			Attributes.TABINDEX, 
			Attributes.ONFOCUS, 
			Attributes.ONBLUR {}

		interface ATTRS extends
			AttributeGroups.COREATTRS, 
			AttributeGroups.I18N, 
			AttributeGroups.EVENTS {}

	/**
	 * <pre>
	 *      horizontal alignment attributes for cell contents
	 *
	 *      char        alignment char, e.g. char=':'
	 *      charoff     offset for alignment char
	 *</pre>
	 */
		interface CELLHALIGN extends
			Attributes.ALIGN, 
			Attributes.CHAR, 
			Attributes.CHAROFF {}

	/**
	 * <pre>
	 *      vertical alignment attributes for cell contents
	 *</pre>
	 */
		interface CELLVALIGN extends
			Attributes.VALIGN {}

	}
	
	interface Groups {
	
		interface SPECIAL_PRE extends
			Elements.BR, 
			Elements.SPAN, 
			Elements.BDO, 
			Elements.MAP {}

		interface SPECIAL extends
			Groups.SPECIAL_PRE, 
			Elements.OBJECT, 
			Elements.IMG {}

		interface FONTSTYLE extends
			Elements.TT, 
			Elements.I, 
			Elements.B, 
			Elements.BIG, 
			Elements.SMALL {}

		interface PHRASE extends
			Elements.EM, 
			Elements.STRONG, 
			Elements.DFN, 
			Elements.CODE, 
			Elements.Q, 
			Elements.SAMP, 
			Elements.KBD, 
			Elements.VAR, 
			Elements.CITE, 
			Elements.ABBR, 
			Elements.ACRONYM, 
			Elements.SUB, 
			Elements.SUP {}

		interface INLINE_FORMS extends
			Elements.INPUT, 
			Elements.SELECT, 
			Elements.TEXTAREA, 
			Elements.LABEL, 
			Elements.BUTTON {}

		interface MISC_INLINE extends
			Elements.INS, 
			Elements.DEL, 
			Elements.SCRIPT {}

	/**
	 * <pre>
	 *      these can only occur at block level
	 *</pre>
	 */
		interface MISC extends
			Elements.NOSCRIPT, 
			Groups.MISC_INLINE {}

		interface INLINE extends
			Elements.A, 
			Groups.SPECIAL, 
			Groups.FONTSTYLE, 
			Groups.PHRASE, 
			Groups.INLINE_FORMS {}

		interface HEADING extends
			Elements.H1, 
			Elements.H2, 
			Elements.H3, 
			Elements.H4, 
			Elements.H5, 
			Elements.H6 {}

		interface LISTS extends
			Elements.UL, 
			Elements.OL, 
			Elements.DL {}

		interface BLOCKTEXT extends
			Elements.PRE, 
			Elements.HR, 
			Elements.BLOCKQUOTE, 
			Elements.ADDRESS {}

		interface BLOCK extends
			Elements.P, 
			Groups.HEADING, 
			Elements.DIV, 
			Groups.LISTS, 
			Groups.BLOCKTEXT, 
			Elements.FIELDSET, 
			Elements.TABLE {}

		interface HEAD_MISC extends
			Elements.SCRIPT, 
			Elements.STYLE, 
			Elements.META, 
			Elements.LINK, 
			Elements.OBJECT {}

	}
	
	interface ComplexTypes {
	
	/**
	 * <pre>
	 *      "Inline" covers inline or "text-level" elements
	 *</pre>
	 */
		interface INLINE extends
			Groups.INLINE, 
			Groups.MISC_INLINE {}

		interface BLOCK extends
			Groups.BLOCK, 
			Elements.FORM, 
			Groups.MISC {}

	/**
	 * <pre>
	 *      "Flow" mixes block and inline and is used for list items etc.
	 *</pre>
	 */
		interface FLOW extends
			Groups.BLOCK, 
			Elements.FORM, 
			Groups.INLINE, 
			Groups.MISC {}

	/**
	 * <pre>
	 *      a elements use "Inline" excluding a
	 *</pre>
	 */
		interface A_CONTENT extends
			Groups.SPECIAL, 
			Groups.FONTSTYLE, 
			Groups.PHRASE, 
			Groups.INLINE_FORMS, 
			Groups.MISC_INLINE {}

	/**
	 * <pre>
	 *      pre uses "Inline" excluding big, small, sup or sup
	 *</pre>
	 */
		interface PRE_CONTENT extends
			Elements.A, 
			Groups.FONTSTYLE, 
			Groups.PHRASE, 
			Groups.SPECIAL_PRE, 
			Groups.MISC_INLINE, 
			Groups.INLINE_FORMS {}

	/**
	 * <pre>
	 *      form uses "Block" excluding form
	 *</pre>
	 */
		interface FORM_CONTENT extends
			Groups.BLOCK, 
			Groups.MISC {}

	/**
	 * <pre>
	 *      button uses "Flow" but excludes a, form and form controls
	 *</pre>
	 */
		interface BUTTON_CONTENT extends
			Elements.P, 
			Groups.HEADING, 
			Elements.DIV, 
			Groups.LISTS, 
			Groups.BLOCKTEXT, 
			Elements.TABLE, 
			Groups.SPECIAL, 
			Groups.FONTSTYLE, 
			Groups.PHRASE, 
			Groups.MISC {}

	}
	
	/**
	 * A collection of marker interfaces for node containers
	 */
	interface Elements {
		interface HTML {}
		interface HEAD {}
		interface TITLE {}
		interface BASE {}
		interface META {}
		interface LINK {}
		interface STYLE {}
		interface SCRIPT {}
		interface NOSCRIPT {}
		interface BODY {}
		interface DIV {}
		interface P {}
		interface H1 {}
		interface H2 {}
		interface H3 {}
		interface H4 {}
		interface H5 {}
		interface H6 {}
		interface UL {}
		interface OL {}
		interface LI {}
		interface DL {}
		interface DT {}
		interface DD {}
		interface ADDRESS {}
		interface HR {}
		interface PRE {}
		interface BLOCKQUOTE {}
		interface INS {}
		interface DEL {}
		interface A {}
		interface SPAN {}
		interface BDO {}
		interface BR {}
		interface EM {}
		interface STRONG {}
		interface DFN {}
		interface CODE {}
		interface SAMP {}
		interface KBD {}
		interface VAR {}
		interface CITE {}
		interface ABBR {}
		interface ACRONYM {}
		interface Q {}
		interface SUB {}
		interface SUP {}
		interface TT {}
		interface I {}
		interface B {}
		interface BIG {}
		interface SMALL {}
		interface OBJECT {}
		interface PARAM {}
		interface IMG {}
		interface MAP {}
		interface AREA {}
		interface FORM {}
		interface LABEL {}
		interface INPUT {}
		interface SELECT {}
		interface OPTGROUP {}
		interface OPTION {}
		interface TEXTAREA {}
		interface FIELDSET {}
		interface LEGEND {}
		interface BUTTON {}
		interface TABLE {}
		interface CAPTION {}
		interface THEAD {}
		interface TFOOT {}
		interface TBODY {}
		interface COLGROUP {}
		interface COL {}
		interface TR {}
		interface TH {}
		interface TD {}
	}
	
	/**
	 * A collection of marker interfaces for node attributes
	 */
	interface Attributes {
		interface ID {}
		interface CLASS {}
		interface STYLE {}
		interface TITLE {}
		interface LANG {}
		interface DIR {}
		interface ONCLICK {}
		interface ONDBLCLICK {}
		interface ONMOUSEDOWN {}
		interface ONMOUSEUP {}
		interface ONMOUSEOVER {}
		interface ONMOUSEMOVE {}
		interface ONMOUSEOUT {}
		interface ONKEYPRESS {}
		interface ONKEYDOWN {}
		interface ONKEYUP {}
		interface ACCESSKEY {}
		interface TABINDEX {}
		interface ONFOCUS {}
		interface ONBLUR {}
		interface PROFILE {}
		interface HREF {}
		interface HTTP_EQUIV {}
		interface NAME {}
		interface CONTENT {}
		interface SCHEME {}
		interface CHARSET {}
		interface HREFLANG {}
		interface TYPE {}
		interface REL {}
		interface REV {}
		interface MEDIA {}
		interface SRC {}
		interface DEFER {}
		interface ONLOAD {}
		interface ONUNLOAD {}
		interface CITE {}
		interface DATETIME {}
		interface SHAPE {}
		interface COORDS {}
		interface DECLARE {}
		interface CLASSID {}
		interface CODEBASE {}
		interface DATA {}
		interface CODETYPE {}
		interface ARCHIVE {}
		interface STANDBY {}
		interface HEIGHT {}
		interface WIDTH {}
		interface USEMAP {}
		interface VALUE {}
		interface VALUETYPE {}
		interface ALT {}
		interface LONGDESC {}
		interface ISMAP {}
		interface NOHREF {}
		interface ACTION {}
		interface METHOD {}
		interface ENCTYPE {}
		interface ONSUBMIT {}
		interface ONRESET {}
		interface ACCEPT {}
		interface ACCEPT_CHARSET {}
		interface FOR {}
		interface CHECKED {}
		interface DISABLED {}
		interface READONLY {}
		interface SIZE {}
		interface MAXLENGTH {}
		interface ONSELECT {}
		interface ONCHANGE {}
		interface MULTIPLE {}
		interface LABEL {}
		interface SELECTED {}
		interface ROWS {}
		interface COLS {}
		interface ALIGN {}
		interface CHAR {}
		interface CHAROFF {}
		interface VALIGN {}
		interface SUMMARY {}
		interface BORDER {}
		interface FRAME {}
		interface RULES {}
		interface CELLSPACING {}
		interface CELLPADDING {}
		interface SPAN {}
		interface ABBR {}
		interface AXIS {}
		interface HEADERS {}
		interface SCOPE {}
		interface ROWSPAN {}
		interface COLSPAN {}
	}
}
