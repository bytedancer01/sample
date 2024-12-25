package org.apache.commons.net.telnet;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/telnet/WindowSizeOptionHandler.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/telnet/WindowSizeOptionHandler.class */
public class WindowSizeOptionHandler extends TelnetOptionHandler {
    public static final int WINDOW_SIZE = 31;
    private int m_nHeight;
    private int m_nWidth;

    public WindowSizeOptionHandler(int i10, int i11) {
        super(31, false, false, false, false);
        this.m_nWidth = i10;
        this.m_nHeight = i11;
    }

    public WindowSizeOptionHandler(int i10, int i11, boolean z10, boolean z11, boolean z12, boolean z13) {
        super(31, z10, z11, z12, z13);
        this.m_nWidth = i10;
        this.m_nHeight = i11;
    }

    @Override // org.apache.commons.net.telnet.TelnetOptionHandler
    public int[] startSubnegotiationLocal() {
        int i10 = this.m_nWidth;
        int i11 = this.m_nHeight;
        int i12 = i10 % 256 == 255 ? 6 : 5;
        int i13 = i12;
        if (i10 / 256 == 255) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (i11 % 256 == 255) {
            i14 = i13 + 1;
        }
        int i15 = i14;
        if (i11 / 256 == 255) {
            i15 = i14 + 1;
        }
        int[] iArr = new int[i15];
        iArr[0] = 31;
        int i16 = 24;
        int i17 = 1;
        while (i17 < i15) {
            int i18 = ((255 << i16) & ((65536 * i10) + i11)) >>> i16;
            iArr[i17] = i18;
            int i19 = i17;
            if (i18 == 255) {
                i19 = i17 + 1;
                iArr[i19] = 255;
            }
            i17 = i19 + 1;
            i16 -= 8;
        }
        return iArr;
    }
}
