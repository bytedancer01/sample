package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.strategy.Type;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Contact.class */
interface Contact extends Type {
    Object get(Object obj);

    Annotation getAnnotation();

    Class getDeclaringClass();

    Class getDependent();

    Class[] getDependents();

    String getName();

    boolean isReadOnly();

    void set(Object obj, Object obj2);

    @Override // org.simpleframework.xml.strategy.Type
    String toString();
}
