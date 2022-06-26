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
 * A markup attribute
 *
 * @param <E> the type of element this attribute can be used inside
 * @param <T> the value type of this attribute
 * 
 * @author gilesjb
 */
public class Attribute<E, T> {
    
    /**
     * Creates an {@link Attribute} object
     * @param element the type of element this attribute can be used inside
     * @param type the value type of this attribute
     * @param name the name of this attribute
     * @return a new {@link Attribute}
     */
    public static final <X, Y> Attribute<X, Y> of(Class<X> element, Class<Y> type, String name) {
        return new Attribute<X, Y>(element, type, name);
    }
    
    private final Class<E> element;
    private final Class<T> type;
    private final String name;
    
    public Attribute(Class<E> element, Class<T> type, String name) {
        this.element = element;
        this.type = type;
        this.name = name;
    }
    
    public final String name() {
        return name;
    }
    
    public Class<?> elementType() {
        return element;
    }
    
    public Class<?> valueType() {
        return type;
    }
    
    public String renderValue(T value) {
        return String.valueOf(value);
    }
    
    public String toString() {
        return String.format("\"%s\" [type:%s]", name(), elementType().getCanonicalName());
    }
}