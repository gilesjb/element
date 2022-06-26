/*
 *  Copyright 2009 Giles Burgess
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
package org.copalis.element;

import java.io.PrintStream;

/**
 * An {@link Element} implementation that prints markup to {@link System#out}
 * 
 * @author gilesjb
 */
public class PrintElement {
    private final PrintStream out;
    
    public PrintElement() {
        this(System.out);
    }
    
    public PrintElement(PrintStream out) {
        this.out = out;
    }
    
    /**
     * Creates a root element
     * @param tag a root tag
     * @return a new {@link Element#Opened}
     */
    public final <T, X> Element.Opened<T, Void, X> begin(Tag<Void, X, T> tag) {
        return create(null, tag, 0);
    }
    
    protected final <T, P, E> Element.Opened<T, P, E> create(final P parent, final Tag<?, E, T> tag, final int depth) {
        indent(depth).format("<%s", tag.name());
        
        final AbstractElement<T, P, E> element = new AbstractElement<T, P, E>(tag) {

            @Override protected Opened<?, ?, ?> child(Tag<?, ?, ?> tag) {
                return create(this, tag, depth + 1);
            }

            @Override protected <V> Opened<?, ?, ?> attribute(Attribute<?, V> attribute, V value) {
                throw new UnsupportedOperationException();
            }

            @Override protected Element<?, ?, ?> text(T text) {
                indent(depth + 1).println(escape(tag.renderText(text)));
                return this;
            }

            @Override protected Object end() {
                indent(depth).format("</%s>\n", tag.name());
                return parent;
            }
        };
        
        return new AbstractElement<T, P, E>(tag) {

            @Override protected Opened<?, ?, ?> child(Tag<?, ?, ?> tag) {
                out.println('>');
                return element.child(tag);
            }

            @Override protected <V> Opened<?, ?, ?> attribute(Attribute<?, V> attribute, V value) {
                out.format(" %s=\"%s\"", attribute.name(), escape(attribute.renderValue(value)));
                return this;
            }

            @Override protected Element<?, ?, ?> text(T text) {
                out.println('>');
                return element.text(text);
            }

            @Override protected Object end() {
                out.println('>');
                return element.end();
            }
        };
    }
    
    private String escape(String text) {
        return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }
    
    private PrintStream indent(int amt) {
        for (int i = 0; i < amt; i++) {
            out.print("  ");
        }
        return out;
    }
}
