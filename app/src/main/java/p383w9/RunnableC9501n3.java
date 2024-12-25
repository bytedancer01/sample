package p383w9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/n3.class
 */
/* renamed from: w9.n3 */
/* loaded from: combined.jar:classes2.jar:w9/n3.class */
public final class RunnableC9501n3 implements Runnable {

    /* renamed from: b */
    public final LifecycleCallback f43359b;

    /* renamed from: c */
    public final String f43360c;

    /* renamed from: d */
    public final C9506o3 f43361d;

    public RunnableC9501n3(C9506o3 c9506o3, LifecycleCallback lifecycleCallback, String str) {
        this.f43361d = c9506o3;
        this.f43359b = lifecycleCallback;
        this.f43360c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        C9506o3 c9506o3 = this.f43361d;
        i10 = c9506o3.f43368c;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f43359b;
            bundle = c9506o3.f43369d;
            if (bundle != null) {
                bundle3 = c9506o3.f43369d;
                bundle2 = bundle3.getBundle(this.f43360c);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo13158f(bundle2);
        }
        i11 = this.f43361d.f43368c;
        if (i11 >= 2) {
            this.f43359b.mo13162j();
        }
        i12 = this.f43361d.f43368c;
        if (i12 >= 3) {
            this.f43359b.mo13160h();
        }
        i13 = this.f43361d.f43368c;
        if (i13 >= 4) {
            this.f43359b.mo13163k();
        }
        i14 = this.f43361d.f43368c;
        if (i14 >= 5) {
            this.f43359b.m13159g();
        }
    }
}
