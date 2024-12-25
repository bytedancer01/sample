package p304r9;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import java.util.Locale;
import ma.HandlerC6385s1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r9/x.class
 */
/* renamed from: r9.x */
/* loaded from: combined.jar:classes2.jar:r9/x.class */
public final class C8056x {

    /* renamed from: f */
    public static final C8015b f38912f = new C8015b("RequestTracker");

    /* renamed from: g */
    public static final Object f38913g = new Object();

    /* renamed from: a */
    public final long f38914a;

    /* renamed from: d */
    public InterfaceC8054v f38917d;

    /* renamed from: e */
    public Runnable f38918e;

    /* renamed from: c */
    public long f38916c = -1;

    /* renamed from: b */
    public final Handler f38915b = new HandlerC6385s1(Looper.getMainLooper());

    public C8056x(long j10) {
        this.f38914a = j10;
    }

    /* renamed from: a */
    public static /* synthetic */ void m34973a(C8056x c8056x) {
        synchronized (f38913g) {
            if (c8056x.f38916c == -1) {
                return;
            }
            c8056x.m34980h(15, null);
        }
    }

    /* renamed from: b */
    public final void m34974b(long j10, InterfaceC8054v interfaceC8054v) {
        InterfaceC8054v interfaceC8054v2;
        long j11;
        Object obj = f38913g;
        synchronized (obj) {
            interfaceC8054v2 = this.f38917d;
            j11 = this.f38916c;
            this.f38916c = j10;
            this.f38917d = interfaceC8054v;
        }
        if (interfaceC8054v2 != null) {
            interfaceC8054v2.mo30962a(j11);
        }
        synchronized (obj) {
            Runnable runnable = this.f38918e;
            if (runnable != null) {
                this.f38915b.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable(this) { // from class: r9.w

                /* renamed from: b */
                public final C8056x f38911b;

                {
                    this.f38911b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C8056x.m34973a(this.f38911b);
                }
            };
            this.f38918e = runnable2;
            this.f38915b.postDelayed(runnable2, this.f38914a);
        }
    }

    /* renamed from: c */
    public final boolean m34975c(int i10) {
        return m34980h(AdError.CACHE_ERROR_CODE, null);
    }

    /* renamed from: d */
    public final boolean m34976d(long j10, int i10, Object obj) {
        synchronized (f38913g) {
            long j11 = this.f38916c;
            if (j11 == -1 || j11 != j10) {
                return false;
            }
            m34979g(i10, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j10)));
            return true;
        }
    }

    /* renamed from: e */
    public final boolean m34977e() {
        boolean z10;
        synchronized (f38913g) {
            z10 = this.f38916c != -1;
        }
        return z10;
    }

    /* renamed from: f */
    public final boolean m34978f(long j10) {
        boolean z10;
        synchronized (f38913g) {
            long j11 = this.f38916c;
            z10 = false;
            if (j11 != -1) {
                z10 = false;
                if (j11 == j10) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* renamed from: g */
    public final void m34979g(int i10, Object obj, String str) {
        f38912f.m34873a(str, new Object[0]);
        Object obj2 = f38913g;
        synchronized (obj2) {
            InterfaceC8054v interfaceC8054v = this.f38917d;
            if (interfaceC8054v != null) {
                interfaceC8054v.mo30963b(this.f38916c, i10, obj);
            }
            this.f38916c = -1L;
            this.f38917d = null;
            synchronized (obj2) {
                Runnable runnable = this.f38918e;
                if (runnable != null) {
                    this.f38915b.removeCallbacks(runnable);
                    this.f38918e = null;
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean m34980h(int i10, Object obj) {
        synchronized (f38913g) {
            long j10 = this.f38916c;
            if (j10 == -1) {
                return false;
            }
            m34979g(i10, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j10)));
            return true;
        }
    }
}
