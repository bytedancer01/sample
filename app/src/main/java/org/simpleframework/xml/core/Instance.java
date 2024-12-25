package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Instance.class */
interface Instance {
    Object getInstance();

    Class getType();

    boolean isReference();

    Object setInstance(Object obj);
}
