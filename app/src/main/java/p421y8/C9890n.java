package p421y8;

import android.os.SystemClock;
import p027b9.InterfaceC0837d0;
import p059d9.C4400z;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y8/n.class
 */
/* renamed from: y8.n */
/* loaded from: combined.jar:classes2.jar:y8/n.class */
public final class C9890n {
    /* renamed from: a */
    public static InterfaceC0837d0.a m41743a(InterfaceC9884h interfaceC9884h) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC9884h.length();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= length) {
                return new InterfaceC0837d0.a(1, 0, length, i12);
            }
            int i13 = i12;
            if (interfaceC9884h.mo41605c(i10, elapsedRealtime)) {
                i13 = i12 + 1;
            }
            i10++;
            i11 = i13;
        }
    }

    /* renamed from: b */
    public static boolean m41744b(C9888l c9888l, int i10) {
        for (int i11 = 0; i11 < c9888l.f45458a; i11++) {
            InterfaceC9887k m41716a = c9888l.m41716a(i11);
            if (m41716a != null) {
                for (int i12 = 0; i12 < m41716a.length(); i12++) {
                    if (C4400z.m22304l(m41716a.mo41607e(i12).f37086m) == i10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
