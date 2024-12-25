package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/PersistenceException.class */
public class PersistenceException extends Exception {
    public PersistenceException(String str, Object... objArr) {
        super(String.format(str, objArr));
    }

    public PersistenceException(Throwable th2, String str, Object... objArr) {
        super(String.format(str, objArr), th2);
    }
}
