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

/**
 * A markup tag.
 * Tags are used to create new {@link Element} objects.
 *
 * @param <P> the type of element this tag can be used inside
 * @param <E> the type of element created for this tag
 * @param <T> the type of text that may be used inside an element - {@link Void} if none
 * 
 * @author gilesjb
 */
public class Tag<P, E, T> {
    
    /**
     * Creates a {@link Tag} object
     * @param parent the class of elements this tag can be used inside 
     * @param element the class of element created for this tag
     * @param text the class of text that may be used inside an element - {@link Void} if none
     * @param name the name of this element
     * @return a new {@link Tag}
     */
    public static final <X, Y, Z> Tag<X, Y, Z> of(Class<X> parent, Class<Y> element, Class<Z> text, String name) {
        return new Tag<X, Y, Z>(parent, element, text, name);
    }
    
    private final String name;
    private final Class<P> parent;
    private final Class<E> element;
    private final Class<T> text;
    
    public Tag(Class<P> parent, Class<E> element, Class<T> text, String name) {
        this.parent = parent;
        this.element = element;
        this.text = text;
        this.name = name;
    }
    
    public final String name() {
        return name;
    }
    
    public final Class<?> parentType() {
        return parent;
    }
    
    public final Class<?> elementType() {
        return element;
    }
    
    public final Class<?> textType() {
        return text;
    }
    
    public <S, X, D extends P> Element.Opened<T, Element<S, X, D>, E> createElement(Element<S, X, D> elem) {
        return elem.createChild(this);
    }
    
    public String renderText(T text) {
        return String.valueOf(text);
    }
    
    public String toString() {
        return String.format("\"%s\" [praent:%s, element:%s, text:%s]", name, parent, element, text);
    }
}