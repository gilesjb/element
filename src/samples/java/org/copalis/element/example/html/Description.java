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
package org.copalis.element.example.html;

import static org.copalis.element.schema.XHTML1Strict.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.copalis.element.PrintElement;

/**
 *
 * @author gilesjb
 */
public class Description {
    
    public static final void main(String... args) throws URISyntaxException {
        HTMLFrame viewer = new HTMLFrame();
        new PrintElement(viewer.out).begin(html)
            ._(head)
                ._$(title, "Element")
            ._()
            ._(body)
                ._(div)._(CLASS, "intro")
                    ._$(h1, "Copalis Element")
                    ._(p)
                        ._(a)._(HREF, new URI("http://code.google.com/p/copalis/wiki/copalisElement"))
                            .$("Element")
                        ._()
                        .$("is an API for programmatically generating HTML or XML.")
                    ._()
                    ._(p)
                        .$("Element uses Java's generic type system to enforce, at compile-time")
                        .$("(and edit-time if you are using Eclipse),")
                        .$("the following schema semantics:")
                    ._()
                    ._(ul)
                        ._$(li, "Attributes have defined types that the values must conform to.")
                        ._$(li, "Only the correct child node types can be created inside a parent.")
                    ._()
                    ._(p).$("Element does ")._$(em, "not").$("enforce:")._()
                    ._(ul)
                        ._$(li, "Mandatory attributes.")
                        ._$(li, "Mandatory child elements.")
                        ._$(li, "Child element ordering constraints.")
                    ._()
                    ._$(p, "Element defines 5 fundamental methods:")
                    ._(table)._(BORDER, 0)
                        ._(tr)._$(th, "Name")._$(th, "Usage")._$(th, "Output")._()
                        ._(tr)._$(td, "_")._$(td, "_(div)")._$(td, "<div>")._()
                        ._(tr)._$(td, "_")._$(td, "_(ID, \"nodeid\")")._$(td, "id=\"nodeid\"")._()
                        ._(tr)._$(td, "_$")._$(td, "_$(p, \"Some text\")")._$(td, "<p>Some text</p>")._()
                        ._(tr)._$(td, "_")._$(td, "_()")._$(td, "</div>")._()
                        ._(tr)._$(td, "$")._$(td, "$(\"Some text\")")._$(td, "Some text")._()
                    ._()
                ._()
            ._()
        ._();
        viewer.display();
    }
}
