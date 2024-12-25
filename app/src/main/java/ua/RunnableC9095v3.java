package ua;

import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/v3.class
 */
/* renamed from: ua.v3 */
/* loaded from: combined.jar:classes2.jar:ua/v3.class */
public final class RunnableC9095v3 implements Runnable {

    /* renamed from: b */
    public final int f41692b;

    /* renamed from: c */
    public final String f41693c;

    /* renamed from: d */
    public final Object f41694d;

    /* renamed from: e */
    public final Object f41695e;

    /* renamed from: f */
    public final Object f41696f;

    /* renamed from: g */
    public final C9128y3 f41697g;

    public RunnableC9095v3(C9128y3 c9128y3, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f41697g = c9128y3;
        this.f41692b = i10;
        this.f41693c = str;
        this.f41694d = obj;
        this.f41695e = obj2;
        this.f41696f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        C9128y3 c9128y3;
        char c12;
        C9013o4 m37759A = this.f41697g.f41723a.m37759A();
        if (!m37759A.m38334k()) {
            Log.println(6, this.f41697g.m38418z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c10 = this.f41697g.f41787c;
        if (c10 == 0) {
            if (this.f41697g.f41723a.m37797z().m37894q()) {
                c9128y3 = this.f41697g;
                c9128y3.f41723a.mo37783f();
                c12 = 'C';
            } else {
                c9128y3 = this.f41697g;
                c9128y3.f41723a.mo37783f();
                c12 = 'c';
            }
            c9128y3.f41787c = c12;
        }
        j10 = this.f41697g.f41788d;
        if (j10 < 0) {
            C9128y3 c9128y32 = this.f41697g;
            c9128y32.f41723a.m37797z().m37893p();
            C9128y3.m38405F(c9128y32, 37000L);
        }
        char charAt = "01VDIWEA?".charAt(this.f41692b);
        c11 = this.f41697g.f41787c;
        j11 = this.f41697g.f41788d;
        String m38400A = C9128y3.m38400A(true, this.f41693c, this.f41694d, this.f41695e, this.f41696f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m38400A).length() + 24);
        sb2.append("2");
        sb2.append(charAt);
        sb2.append(c11);
        sb2.append(j11);
        sb2.append(":");
        sb2.append(m38400A);
        String sb3 = sb2.toString();
        String str = sb3;
        if (sb3.length() > 1024) {
            str = this.f41693c.substring(0, 1024);
        }
        C8989m4 c8989m4 = m37759A.f41481d;
        if (c8989m4 != null) {
            c8989m4.m38128a(str, 1L);
        }
    }
}
