package p208m1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/n.class
 */
/* renamed from: m1.n */
/* loaded from: combined.jar:classes1.jar:m1/n.class */
public class C5905n {

    /* renamed from: a */
    public final Handler f33189a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Runnable f33190b;

    /* renamed from: c */
    public long f33191c;

    /* renamed from: d */
    public long f33192d;

    /* renamed from: e */
    public boolean f33193e;

    public C5905n(Runnable runnable) {
        this.f33190b = runnable;
    }

    /* renamed from: a */
    public boolean m29019a() {
        if (this.f33193e) {
            long j10 = this.f33191c;
            if (j10 > 0) {
                this.f33189a.postDelayed(this.f33190b, j10);
            }
        }
        return this.f33193e;
    }

    /* renamed from: b */
    public void m29020b(boolean z10, long j10) {
        if (z10) {
            long j11 = this.f33192d;
            if (j11 - j10 >= 30000) {
                return;
            }
            this.f33191c = Math.max(this.f33191c, (j10 + 30000) - j11);
            this.f33193e = true;
        }
    }

    /* renamed from: c */
    public void m29021c() {
        this.f33191c = 0L;
        this.f33193e = false;
        this.f33192d = SystemClock.elapsedRealtime();
        this.f33189a.removeCallbacks(this.f33190b);
    }
}
