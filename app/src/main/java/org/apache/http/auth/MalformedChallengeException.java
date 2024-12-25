package org.apache.http.auth;

import org.apache.http.ProtocolException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/auth/MalformedChallengeException.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/auth/MalformedChallengeException.class */
public class MalformedChallengeException extends ProtocolException {
    private static final long serialVersionUID = 814586927989932284L;

    public MalformedChallengeException() {
    }

    public MalformedChallengeException(String str) {
        super(str);
    }

    public MalformedChallengeException(String str, Throwable th2) {
        super(str, th2);
    }
}
