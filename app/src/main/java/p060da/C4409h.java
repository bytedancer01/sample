package p060da;

import android.os.SystemClock;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/h.class
 */
/* renamed from: da.h */
/* loaded from: combined.jar:classes2.jar:da/h.class */
public class C4409h implements InterfaceC4406e {

    /* renamed from: a */
    public static final C4409h f26695a = new C4409h();

    /* renamed from: d */
    public static InterfaceC4406e m22439d() {
        return f26695a;
    }

    @Override // p060da.InterfaceC4406e
    /* renamed from: a */
    public final long mo22432a() {
        return System.currentTimeMillis();
    }

    @Override // p060da.InterfaceC4406e
    /* renamed from: b */
    public final long mo22433b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p060da.InterfaceC4406e
    /* renamed from: c */
    public final long mo22434c() {
        return System.nanoTime();
    }
}
