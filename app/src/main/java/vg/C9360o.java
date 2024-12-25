package vg;

import java.net.ProtocolException;
import tg.EnumC8742r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/o.class
 */
/* renamed from: vg.o */
/* loaded from: combined.jar:classes2.jar:vg/o.class */
public final class C9360o {

    /* renamed from: a */
    public final EnumC8742r f42895a;

    /* renamed from: b */
    public final int f42896b;

    /* renamed from: c */
    public final String f42897c;

    public C9360o(EnumC8742r enumC8742r, int i10, String str) {
        this.f42895a = enumC8742r;
        this.f42896b = i10;
        this.f42897c = str;
    }

    /* renamed from: a */
    public static C9360o m39518a(String str) {
        EnumC8742r enumC8742r;
        String str2;
        int i10 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                enumC8742r = EnumC8742r.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                enumC8742r = EnumC8742r.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            enumC8742r = EnumC8742r.HTTP_1_0;
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                str2 = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i10 + 4);
            }
            return new C9360o(enumC8742r, parseInt, str2);
        } catch (NumberFormatException e10) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42895a == EnumC8742r.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f42896b);
        if (this.f42897c != null) {
            sb2.append(' ');
            sb2.append(this.f42897c);
        }
        return sb2.toString();
    }
}
