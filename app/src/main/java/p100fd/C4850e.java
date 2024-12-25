package p100fd;

import cd.C1075o;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fd/e.class
 */
/* renamed from: fd.e */
/* loaded from: combined.jar:classes2.jar:fd/e.class */
public class C4850e {

    /* renamed from: d */
    public static final long f28474d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f28475e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C1075o f28476a = C1075o.m6314c();

    /* renamed from: b */
    public long f28477b;

    /* renamed from: c */
    public int f28478c;

    /* renamed from: c */
    public static boolean m24659c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    /* renamed from: d */
    public static boolean m24660d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    /* renamed from: a */
    public final long m24661a(int i10) {
        synchronized (this) {
            if (m24659c(i10)) {
                return (long) Math.min(Math.pow(2.0d, this.f28478c) + this.f28476a.m6320e(), f28475e);
            }
            return f28474d;
        }
    }

    /* renamed from: b */
    public boolean m24662b() {
        boolean z10;
        synchronized (this) {
            if (this.f28478c != 0) {
                if (this.f28476a.m6318a() <= this.f28477b) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* renamed from: e */
    public final void m24663e() {
        synchronized (this) {
            this.f28478c = 0;
        }
    }

    /* renamed from: f */
    public void m24664f(int i10) {
        synchronized (this) {
            if (m24660d(i10)) {
                m24663e();
                return;
            }
            this.f28478c++;
            this.f28477b = this.f28476a.m6318a() + m24661a(i10);
        }
    }
}
