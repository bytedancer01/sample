package p383w9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/l3.class
 */
/* renamed from: w9.l3 */
/* loaded from: combined.jar:classes2.jar:w9/l3.class */
public final class RunnableC9491l3 implements Runnable {

    /* renamed from: b */
    public final LifecycleCallback f43328b;

    /* renamed from: c */
    public final String f43329c;

    /* renamed from: d */
    public final FragmentC9496m3 f43330d;

    public RunnableC9491l3(FragmentC9496m3 fragmentC9496m3, LifecycleCallback lifecycleCallback, String str) {
        this.f43330d = fragmentC9496m3;
        this.f43328b = lifecycleCallback;
        this.f43329c = str;
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
        FragmentC9496m3 fragmentC9496m3 = this.f43330d;
        i10 = fragmentC9496m3.f43344c;
        if (i10 > 0) {
            LifecycleCallback lifecycleCallback = this.f43328b;
            bundle = fragmentC9496m3.f43345d;
            if (bundle != null) {
                bundle3 = fragmentC9496m3.f43345d;
                bundle2 = bundle3.getBundle(this.f43329c);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo13158f(bundle2);
        }
        i11 = this.f43330d.f43344c;
        if (i11 >= 2) {
            this.f43328b.mo13162j();
        }
        i12 = this.f43330d.f43344c;
        if (i12 >= 3) {
            this.f43328b.mo13160h();
        }
        i13 = this.f43330d.f43344c;
        if (i13 >= 4) {
            this.f43328b.mo13163k();
        }
        i14 = this.f43330d.f43344c;
        if (i14 >= 5) {
            this.f43328b.m13159g();
        }
    }
}
