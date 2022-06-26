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
package org.copalis.element;


/**
 * Verifies that valid child tags and attributes are used,
 * and that the types of attribute and text values are correct
 * @author gilesjb
 *
 * @param <T>
 * @param <P>
 * @param <E>
 */
@SuppressWarnings("unchecked")
public final class Validator<T, P, E> extends Element.Opened<T, P, E> {
    
    public static <A, B, C> Element<A, B, C> check(Element<A, B, C> elem) {
        return new Validator<A, B, C>(elem);
    }
    
    private Element<?, ?, ?> elem;
    
    public Validator(Element<T, P, E> elem) {
        this.elem = elem;
    }

    public <V> Element.Opened<T, P, E> _(Attribute<? super E, V> attribute, V value) {
        if (!attribute.elementType().isAssignableFrom(elem.currentTag().elementType())) {
            throw new IllegalArgumentException(String.format(
                    "Illegal attribute %s for tag: %s", attribute, elem.currentTag()));
        }
        if (!attribute.valueType().isAssignableFrom(value.getClass())) {
            throw new IllegalArgumentException(String.format(
                    "Illegal value type %s for attribute: %s", value.getClass(), attribute));
        }
        elem = ((Element.Opened<T, P, E>) elem)._(attribute, value);
        return this;
    }

    public Element<T, P, E> $(T str) {
        if (!elem.currentTag().textType().isAssignableFrom(str.getClass())) {
            throw new IllegalArgumentException(String.format(
                    "Illegal text type %s for tag: %s", str.getClass(), elem.currentTag()));
        }
        elem = ((Element<T, P, E>) elem).$(str);
        return this;
    }

    public P _() {
        elem = (Element<?, ?, ?>) elem._();
        return (P) this;
    }

    protected <S, C> Element.Opened<S, Element<T, P, E>, C> createChild(Tag<? super E, C, S> tag) {
        if (!tag.parentType().isAssignableFrom(elem.currentTag().elementType())) {
            throw new IllegalArgumentException(String.format(
                    "Illegal child tag %s for tag: %s", tag, elem.currentTag()));
        }
        elem = ((Element<T, P, E>) elem).createChild(tag);
        return (Element.Opened<S, Element<T, P ,E>, C>) this;
    }

    public Tag<?, E, T> currentTag() {
        return (Tag<?, E, T>) elem.currentTag();
    }
}