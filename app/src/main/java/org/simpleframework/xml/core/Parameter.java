package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Parameter.class */
interface Parameter {
    Annotation getAnnotation();

    Expression getExpression();

    int getIndex();

    Object getKey();

    String getName();

    String getPath();

    Class getType();

    boolean isAttribute();

    boolean isPrimitive();

    boolean isRequired();

    boolean isText();

    String toString();
}
