package org.simpleframework.xml.strategy;

import org.simpleframework.xml.core.PersistenceException;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/strategy/CycleException.class */
public class CycleException extends PersistenceException {
    public CycleException(String str, Object... objArr) {
        super(str, objArr);
    }

    public CycleException(Throwable th2, String str, Object... objArr) {
        super(th2, str, objArr);
    }
}
