package org.simpleframework.xml.strategy;

import java.lang.annotation.Annotation;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/strategy/Type.class */
public interface Type {
    <T extends Annotation> T getAnnotation(Class<T> cls);

    Class getType();

    String toString();
}
