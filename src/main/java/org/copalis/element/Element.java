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
 * An {@link Element} object represents the current state of a markup generator
 *
 * @param <T> the type of text this element allows
 * @param <P> the type of the enclosing element object, or {@link Void} if it is a root element
 * @param <E> the marker interface of this element
 * 
 * @author gilesjb
 */
public abstract class Element<T, P, E> {
    
    /**
     * Begins a child element
     * @param tag the tag for the new element
     * @return the new child element
     */
    public final <C, S> Opened<S, Element<T, P, E>, C> _(Tag<? super E, C, S> tag) {
        return tag.createElement(this);
    }
    
    /**
     * Adds text to the current element
     * @param text
     * @return the current element (possibly represented by a new object)
     */
    public abstract Element<T, P, E> $(T text);
    
    /**
     * Closes the current element
     * @return the containing element, or null if this is the root element
     */
    public abstract P _();
    
    /**
     * A shortcut for {@code _(tag).$(text)._()}
     * @param tag the tag for a child element
     * @param text text to be contained within the child element
     * @return
     */
    public final <S> Element<T, P, E> _$(Tag<? super E, ?, S> tag, S text) {
        return _(tag).$(text)._();
    }
    
    /**
     * Callback invoked by Tag
     * @param tag
     * @return
     */
    protected abstract <S, C> Opened<S, Element<T, P, E>, C> createChild(Tag<? super E, C, S> tag);
    
    /**
     * Gets the {@link Tag} for this element
     * @return the current tag
     */
    public abstract Tag<?, E, T> currentTag();
    
    /**
     * Represents a new element which can have attributes set on it
     *
     * @param <T> the type of text this element allows
     * @param <P> the type of the enclosing element
     * @param <E> the type of this element
     */
    public static abstract class Opened<T, P, E> extends Element<T, P, E> {
        /**
         * Sets an attribute of this element 
         * @param attribute 
         * @param value
         * @return
         */
        public abstract <V> Element.Opened<T, P, E> _(Attribute<? super E, V> attribute, V value);
    }
    
    /**
     * A callback that adds content to an element
     *
     * @param <T>
     * @param <E>
     */
    public interface Generator<T, E> {
        <P, X extends E> Element<T, P, X> generate(Element<T, P, X> element);
    }
    
    public final Element<T, P, E> insert(Generator<T, ? super E> generator) {
        return generator.generate(this);
    }
}