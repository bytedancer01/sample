package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/UnionException.class */
public class UnionException extends PersistenceException {
    public UnionException(String str, Object... objArr) {
        super(String.format(str, objArr), new Object[0]);
    }
}
