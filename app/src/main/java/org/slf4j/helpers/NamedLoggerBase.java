package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/slf4j/helpers/NamedLoggerBase.class */
abstract class NamedLoggerBase implements Logger, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    public String name;

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    public Object readResolve() {
        return LoggerFactory.getLogger(getName());
    }
}
