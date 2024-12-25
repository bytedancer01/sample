package org.apache.commons.net.pop3;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/pop3/POP3MessageInfo.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/pop3/POP3MessageInfo.class */
public final class POP3MessageInfo {
    public String identifier;
    public int number;
    public int size;

    public POP3MessageInfo() {
        this(0, null, 0);
    }

    public POP3MessageInfo(int i10, int i11) {
        this(i10, null, i11);
    }

    public POP3MessageInfo(int i10, String str) {
        this(i10, str, -1);
    }

    private POP3MessageInfo(int i10, String str, int i11) {
        this.number = i10;
        this.size = i11;
        this.identifier = str;
    }

    public String toString() {
        return "Number: " + this.number + ". Size: " + this.size + ". Id: " + this.identifier;
    }
}
