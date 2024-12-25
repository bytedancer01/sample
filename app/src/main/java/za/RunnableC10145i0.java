package za;

import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/i0.class
 */
/* renamed from: za.i0 */
/* loaded from: combined.jar:classes2.jar:za/i0.class */
public final class RunnableC10145i0 implements Runnable {

    /* renamed from: b */
    public final C10143h0 f46569b;

    /* renamed from: c */
    public final Callable f46570c;

    public RunnableC10145i0(C10143h0 c10143h0, Callable callable) {
        this.f46569b = c10143h0;
        this.f46570c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f46569b.m42570s(this.f46570c.call());
        } catch (Exception e10) {
            this.f46569b.m42569r(e10);
        } catch (Throwable th2) {
            this.f46569b.m42569r(new RuntimeException(th2));
        }
    }
}
