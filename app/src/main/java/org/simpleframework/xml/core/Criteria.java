package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Criteria.class */
interface Criteria extends Iterable<Object> {
    void commit(Object obj);

    Variable get(Object obj);

    Variable get(Label label);

    Variable remove(Object obj);

    Variable resolve(String str);

    void set(Label label, Object obj);
}
