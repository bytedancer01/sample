package org.apache.http;

import java.nio.charset.CharacterCodingException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/MessageConstraintException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/MessageConstraintException.class */
public class MessageConstraintException extends CharacterCodingException {
    private static final long serialVersionUID = 6077207720446368695L;
    private final String message;

    public MessageConstraintException(String str) {
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
