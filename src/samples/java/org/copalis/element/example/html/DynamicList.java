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
import org.copalis.element.PrintElement;


/**
 * @author gilesjb
 *
 */
public class DynamicList {
    
    public static void main(String... args) {
        Element<Void, Element<String, Element<Void, Element<Void, Void, HTML>, BODY>, DIV>, OL>
            list = 
                new PrintElement().begin(html)
                    ._(body)
                        ._(div)
                            ._$(h1, "Provided arguments:")
                            ._(ol);
        
        for (String arg : args) {
            list = list._(li)._(em).$(arg)._()._();
        }
        
        list._()._()._()._(); // Close all the tags
    }
}
