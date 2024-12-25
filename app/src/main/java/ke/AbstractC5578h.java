package ke;

import p444zd.C10193a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/h.class
 */
/* renamed from: ke.h */
/* loaded from: combined.jar:classes2.jar:ke/h.class */
public abstract class AbstractC5578h extends AbstractC5580j {
    public AbstractC5578h(C10193a c10193a) {
        super(c10193a);
    }

    /* renamed from: e */
    public static void m27603e(StringBuilder sb2, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int charAt = sb2.charAt(i12 + i10) - '0';
            int i13 = charAt;
            if ((i12 & 1) == 0) {
                i13 = charAt * 3;
            }
            i11 += i13;
        }
        int i14 = 10 - (i11 % 10);
        if (i14 == 10) {
            i14 = 0;
        }
        sb2.append(i14);
    }

    /* renamed from: f */
    public final void m27604f(StringBuilder sb2, int i10) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        m27605g(sb2, i10, length);
    }

    /* renamed from: g */
    public final void m27605g(StringBuilder sb2, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int m27639f = m27608b().m27639f((i12 * 10) + i10, 10);
            if (m27639f / 100 == 0) {
                sb2.append('0');
            }
            if (m27639f / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m27639f);
        }
        m27603e(sb2, i11);
    }
}
