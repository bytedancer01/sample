package p312ri;

import ci.C1128n;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;
import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ri/e.class
 */
/* renamed from: ri.e */
/* loaded from: combined.jar:classes2.jar:ri/e.class */
public final class C8479e {

    /* renamed from: d */
    public static final String[] f39613d;

    /* renamed from: e */
    public static final C8479e f39614e = new C8479e();

    /* renamed from: a */
    @NotNull
    public static final C9764h f39610a = C9764h.f44531f.m41212d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    public static final String[] f39611b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    public static final String[] f39612c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            C9367f.m39525d(binaryString, "Integer.toBinaryString(it)");
            strArr[i10] = C1128n.m6727t(C5634b.m27797q("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f39613d = strArr;
        String[] strArr2 = f39612c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f39612c;
            strArr3[i12 | 8] = C9367f.m39532k(strArr3[i12], "|PADDED");
        }
        String[] strArr4 = f39612c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = new int[]{4, 32, 36}[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f39612c;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + "|" + strArr5[i14];
                strArr5[i17 | 8] = strArr5[i16] + "|" + strArr5[i14] + "|PADDED";
            }
        }
        int length = f39612c.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f39612c;
            if (strArr6[i18] == null) {
                strArr6[i18] = f39613d[i18];
            }
        }
    }

    @NotNull
    /* renamed from: a */
    public final String m36430a(int i10, int i11) {
        String str;
        String str2;
        String str3;
        String str4;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f39613d[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f39612c;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    C9367f.m39524c(str);
                } else {
                    str = f39613d[i11];
                }
                if (i10 != 5 || (i11 & 4) == 0) {
                    str2 = str;
                    if (i10 == 0) {
                        str2 = str;
                        if ((i11 & 32) != 0) {
                            str3 = "PRIORITY";
                            str4 = "COMPRESSED";
                        }
                    }
                    return str2;
                }
                str3 = "HEADERS";
                str4 = "PUSH_PROMISE";
                str2 = C1128n.m6728u(str, str3, str4, false, 4, null);
                return str2;
            }
        }
        return f39613d[i11];
    }

    @NotNull
    /* renamed from: b */
    public final String m36431b(int i10) {
        String[] strArr = f39611b;
        return i10 < strArr.length ? strArr[i10] : C5634b.m27797q("0x%02x", Integer.valueOf(i10));
    }

    @NotNull
    /* renamed from: c */
    public final String m36432c(boolean z10, int i10, int i11, int i12, int i13) {
        return C5634b.m27797q("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), m36431b(i12), m36430a(i12, i13));
    }
}
