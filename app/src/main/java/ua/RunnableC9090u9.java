package ua;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/u9.class
 */
/* renamed from: ua.u9 */
/* loaded from: combined.jar:classes2.jar:ua/u9.class */
public final class RunnableC9090u9 implements Runnable {

    /* renamed from: b */
    public final String f41685b;

    /* renamed from: c */
    public final Bundle f41686c;

    /* renamed from: d */
    public final C9101v9 f41687d;

    public RunnableC9090u9(C9101v9 c9101v9, String str, Bundle bundle) {
        this.f41687d = c9101v9;
        this.f41685b = str;
        this.f41686c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41687d.f41712a.m38388o0(this.f41687d.f41712a.m38374h0().m37832J(this.f41685b, "_err", this.f41686c, "auto", this.f41687d.f41712a.mo37778a().mo22432a(), false, false, false), this.f41685b);
    }
}
