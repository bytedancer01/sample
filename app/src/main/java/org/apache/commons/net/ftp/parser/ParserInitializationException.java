package org.apache.commons.net.ftp.parser;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/ParserInitializationException.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/ParserInitializationException.class */
public class ParserInitializationException extends RuntimeException {
    private static final long serialVersionUID = 5563335279583210658L;

    public ParserInitializationException(String str) {
        super(str);
    }

    public ParserInitializationException(String str, Throwable th2) {
        super(str, th2);
    }

    @Deprecated
    public Throwable getRootCause() {
        return super.getCause();
    }
}
