package org.simpleframework.xml.strategy;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/strategy/Value.class */
public interface Value {
    int getLength();

    Class getType();

    Object getValue();

    boolean isReference();

    void setValue(Object obj);
}
