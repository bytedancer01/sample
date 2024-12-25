package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/InvalidTelnetOptionException.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/InvalidTelnetOptionException.class */
public class InvalidTelnetOptionException extends Exception {
    private static final long serialVersionUID = -2516777155928793597L;
    private final String msg;
    private final int optionCode;

    public InvalidTelnetOptionException(String str, int i10) {
        this.optionCode = i10;
        this.msg = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.msg + ": " + this.optionCode;
    }
}
