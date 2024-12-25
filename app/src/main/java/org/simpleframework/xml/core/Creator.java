package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Creator.class */
interface Creator {
    Object getInstance();

    Object getInstance(Criteria criteria);

    double getScore(Criteria criteria);

    Signature getSignature();

    Class getType();
}
