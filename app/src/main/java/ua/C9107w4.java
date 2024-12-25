package ua;

import java.lang.Thread;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/w4.class
 */
/* renamed from: ua.w4 */
/* loaded from: combined.jar:classes2.jar:ua/w4.class */
public final class C9107w4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f41721a;

    /* renamed from: b */
    public final C9140z4 f41722b;

    public C9107w4(C9140z4 c9140z4, String str) {
        this.f41722b = c9140z4;
        C9935o.m41850j(str);
        this.f41721a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        synchronized (this) {
            this.f41722b.f41723a.mo37780c().m38408o().m38327b(this.f41721a, th2);
        }
    }
}
