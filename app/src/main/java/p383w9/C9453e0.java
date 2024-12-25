package p383w9;

import android.os.Looper;
import com.google.android.gms.common.api.C2414a;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import p350u9.C8804b;
import p422y9.AbstractC9899c;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/e0.class
 */
/* renamed from: w9.e0 */
/* loaded from: combined.jar:classes2.jar:w9/e0.class */
public final class C9453e0 implements AbstractC9899c.c {

    /* renamed from: a */
    public final WeakReference<C9508p0> f43229a;

    /* renamed from: b */
    public final C2414a<?> f43230b;

    /* renamed from: c */
    public final boolean f43231c;

    public C9453e0(C9508p0 c9508p0, C2414a<?> c2414a, boolean z10) {
        this.f43229a = new WeakReference<>(c9508p0);
        this.f43230b = c2414a;
        this.f43231c = z10;
    }

    @Override // p422y9.AbstractC9899c.c
    /* renamed from: c */
    public final void mo39826c(C8804b c8804b) {
        C9544y0 c9544y0;
        Lock lock;
        Lock lock2;
        boolean m40006n;
        boolean m40007o;
        C9508p0 c9508p0 = this.f43229a.get();
        if (c9508p0 == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        c9544y0 = c9508p0.f43370a;
        C9935o.m41854n(myLooper == c9544y0.f43504o.mo13109f(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = c9508p0.f43371b;
        lock.lock();
        try {
            m40006n = c9508p0.m40006n(0);
            if (m40006n) {
                if (!c8804b.m37663T()) {
                    c9508p0.m40004l(c8804b, this.f43230b, this.f43231c);
                }
                m40007o = c9508p0.m40007o();
                if (m40007o) {
                    c9508p0.m40005m();
                }
            }
        } finally {
            lock2 = c9508p0.f43371b;
            lock2.unlock();
        }
    }
}
