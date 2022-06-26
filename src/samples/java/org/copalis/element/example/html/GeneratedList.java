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

import org.copalis.element.Element;
import org.copalis.element.Element.Generator;
import org.copalis.element.PrintElement;
import org.copalis.element.schema.XHTML1Strict.Elements;

/**
 * An example demonstrating the use of a Generator to insert markup
 * 
 * @author gilesjb
 */
public class GeneratedList {
    
    public static void main(final String... args) {
        
        // Declared as an LI generator which can be used inside UL and OL elements
        Generator<Void, Elements.LI> generator = new Generator<Void, Elements.LI>() {

            public <R, X extends Elements.LI> Element<Void, R, X> generate(Element<Void, R, X> elem) {
                for (String arg : args) {
                    elem = elem
                            ._(li)
                                ._(em)
                                    .$(arg)
                                ._()
                            ._();
                }
                return elem;
            }
        };
        
        new PrintElement().begin(html)
            ._(body)
                ._(div)
                    ._$(h1, "Generator example")
                    .$("Program arguments as an ordered list:")
                    ._(ol)
                        .insert(generator)
                    ._()
                    .$("and as an unordered list:")
                    ._(ul)
                        .insert(generator)
                    ._()
                ._()
            ._()
        ._();
    }
}
