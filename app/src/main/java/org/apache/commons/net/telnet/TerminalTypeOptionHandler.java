package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/TerminalTypeOptionHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/TerminalTypeOptionHandler.class */
public class TerminalTypeOptionHandler extends TelnetOptionHandler {
    public static final int TERMINAL_TYPE = 24;
    public static final int TERMINAL_TYPE_IS = 0;
    public static final int TERMINAL_TYPE_SEND = 1;
    private final String termType;

    public TerminalTypeOptionHandler(String str) {
        super(24, false, false, false, false);
        this.termType = str;
    }

    public TerminalTypeOptionHandler(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(24, z10, z11, z12, z13);
        this.termType = str;
    }

    @Override // org.apache.commons.net.telnet.TelnetOptionHandler
    public int[] answerSubnegotiation(int[] iArr, int i10) {
        String str;
        if (iArr == null || i10 <= 1 || (str = this.termType) == null) {
            return null;
        }
        if (iArr[0] != 24 || iArr[1] != 1) {
            return null;
        }
        int[] iArr2 = new int[str.length() + 2];
        iArr2[0] = 24;
        iArr2[1] = 0;
        for (int i11 = 0; i11 < this.termType.length(); i11++) {
            iArr2[i11 + 2] = this.termType.charAt(i11);
        }
        return iArr2;
    }
}
