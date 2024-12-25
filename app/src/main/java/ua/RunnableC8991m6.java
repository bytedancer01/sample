package ua;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/m6.class
 */
/* renamed from: ua.m6 */
/* loaded from: combined.jar:classes2.jar:ua/m6.class */
public final class RunnableC8991m6 implements Runnable {

    /* renamed from: b */
    public final String f41410b;

    /* renamed from: c */
    public final String f41411c;

    /* renamed from: d */
    public final long f41412d;

    /* renamed from: e */
    public final Bundle f41413e;

    /* renamed from: f */
    public final boolean f41414f;

    /* renamed from: g */
    public final boolean f41415g;

    /* renamed from: h */
    public final boolean f41416h;

    /* renamed from: i */
    public final String f41417i;

    /* renamed from: j */
    public final C8908f7 f41418j;

    public RunnableC8991m6(C8908f7 c8908f7, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f41418j = c8908f7;
        this.f41410b = str;
        this.f41411c = str2;
        this.f41412d = j10;
        this.f41413e = bundle;
        this.f41414f = z10;
        this.f41415g = z11;
        this.f41416h = z12;
        this.f41417i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41418j.m37935Z(this.f41410b, this.f41411c, this.f41412d, this.f41413e, this.f41414f, this.f41415g, this.f41416h, this.f41417i);
    }
}
