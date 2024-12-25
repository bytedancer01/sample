package p089f2;

import android.os.Handler;
import android.os.Looper;
import p071e2.InterfaceC4589r;
import p175k0.C5444e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f2/a.class
 */
/* renamed from: f2.a */
/* loaded from: combined.jar:classes1.jar:f2/a.class */
public class C4751a implements InterfaceC4589r {

    /* renamed from: a */
    public final Handler f28011a = C5444e.m27197a(Looper.getMainLooper());

    @Override // p071e2.InterfaceC4589r
    /* renamed from: a */
    public void mo23140a(Runnable runnable) {
        this.f28011a.removeCallbacks(runnable);
    }

    @Override // p071e2.InterfaceC4589r
    /* renamed from: b */
    public void mo23141b(long j10, Runnable runnable) {
        this.f28011a.postDelayed(runnable, j10);
    }
}
