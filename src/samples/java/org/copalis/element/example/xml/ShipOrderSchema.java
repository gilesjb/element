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
package org.copalis.element.example.xml;

import org.copalis.element.Attribute;
import org.copalis.element.PrintElement;
import org.copalis.element.Tag;

/**
 * Defines a simple schema and outputs a sample document
 *
 * @author gilesjb
 */
public class ShipOrderSchema {

    interface ShipOrder {}
    interface ShipTo {}
    interface Item {}
    interface Node {}
    
    static final Tag<Void, ShipOrder, Void> shiporder = Tag.of(Void.class, ShipOrder.class, Void.class, "shiporder");
    static final Attribute<ShipOrder, Integer> ORDERID = Attribute.of(ShipOrder.class, Integer.class, "orderid");
    
    static final Tag<ShipOrder, Node, String> orderperson = Tag.of(ShipOrder.class, Node.class, String.class, "orderperson");
    
    static final Tag<ShipOrder, ShipTo, Void> shipto = Tag.of(ShipOrder.class, ShipTo.class, Void.class, "shipto");
        
    static final Tag<ShipTo, Node, String> name = Tag.of(ShipTo.class, Node.class, String.class, "name");
    static final Tag<ShipTo, Node, String> address = Tag.of(ShipTo.class, Node.class, String.class, "address");
    static final Tag<ShipTo, Node, String> city = Tag.of(ShipTo.class, Node.class, String.class, "city");
    static final Tag<ShipTo, Node, String> country = Tag.of(ShipTo.class, Node.class, String.class, "country");
    
    static final Tag<ShipOrder, Item, Void> item = Tag.of(ShipOrder.class, Item.class, Void.class, "item");
    
    static final Tag<Item, Node, String> title = Tag.of(Item.class, Node.class, String.class, "title");
    static final Tag<Item, Node, Integer> quantity = Tag.of(Item.class, Node.class, Integer.class, "quantity");
    
    public static void main(String... args) {
        
        new PrintElement().begin(shiporder)
            ._(ORDERID, 12345)
            ._$(orderperson, "Steve Wozniak")
            ._(shipto)
                ._$(name, "Bill Gates")
                ._$(address, "1 Microsoft Way")
                ._$(city, "Redmond")
                ._$(country, "USA")
            ._()
            ._(item)
                ._$(title, "Steve Jobs")
                ._$(quantity, 1)
            ._()
       ._();
    }
}
