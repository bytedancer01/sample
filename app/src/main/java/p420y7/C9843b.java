package p420y7;

import java.io.File;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y7/b.class
 */
/* renamed from: y7.b */
/* loaded from: combined.jar:classes2.jar:y7/b.class */
public final class C9843b {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:y7/b$a.class
     */
    /* renamed from: y7.b$a */
    /* loaded from: combined.jar:classes2.jar:y7/b$a.class */
    public interface a {
        /* renamed from: a */
        String m41374a(C9874x c9874x);
    }

    /* renamed from: a */
    public static void m41372a(C9874x c9874x, C9845c c9845c, boolean z10, long j10) {
        C9849e c9849e;
        C9849e mo41391h = c9845c.mo41391h(c9874x.f45309b);
        if (mo41391h != null) {
            c9849e = C9870t.m41469m(mo41391h, c9874x, mo41391h.f45187f, j10);
        } else {
            c9849e = new C9849e(c9874x, z10 ? 3 : 0, j10, j10, -1L, 0, 0);
        }
        c9845c.mo41384a(c9849e);
    }

    /* renamed from: b */
    public static void m41373b(File file, a aVar, C9845c c9845c, boolean z10, boolean z11) {
        C9841a c9841a = new C9841a(file);
        if (c9841a.m41370b()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (C9874x c9874x : c9841a.m41371e()) {
                    C9874x c9874x2 = c9874x;
                    if (aVar != null) {
                        c9874x2 = c9874x.m41534b(aVar.m41374a(c9874x));
                    }
                    m41372a(c9874x2, c9845c, z11, currentTimeMillis);
                }
                c9841a.m41369a();
            } catch (Throwable th2) {
                if (z10) {
                    c9841a.m41369a();
                }
                throw th2;
            }
        }
    }
}
