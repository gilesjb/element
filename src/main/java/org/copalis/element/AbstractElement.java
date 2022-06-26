/*
 *  Copyright 2012 Giles Burgess
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
 * A simple abstract implementation of {@link Element.Opened}
 */
@SuppressWarnings("unchecked")
public abstract class AbstractElement<T, P, E> extends Element.Opened<T, P, E> {
    private final Tag<?, E, T> tag;
    
    public AbstractElement(Tag<?, E, T> tag) {
        this.tag = tag;
    }
    
    @Override protected final <S, C> Element.Opened<S, Element<T, P, E>, C> createChild(Tag<? super E, C, S> tag) {
        return (Element.Opened<S, Element<T, P, E>, C>) child(tag);
    }
    
    @Override public final <V> Element.Opened<T, P, E> _(Attribute<? super E, V> attribute, V value) {
        return (Element.Opened<T, P, E>) attribute(attribute, value);
    }
    
    @Override public final Element<T, P, E> $(T str) {
        return (Element<T, P, E>) text(str);
    }
    
    @Override public final P _() {
        return (P) end();
    }
    
    @Override public final Tag<?, E, T> currentTag() {
        return tag;
    };
    
    protected abstract Element.Opened<?, ?, ?> child(Tag<?, ?, ?> tag);
    
    protected abstract <V> Element.Opened<?, ?, ?> attribute(Attribute<?, V> attribute, V value);

    protected abstract Element<?, ?, ?> text(T text);
    
    protected abstract Object end();
}