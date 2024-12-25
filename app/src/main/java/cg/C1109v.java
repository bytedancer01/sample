package cg;

import java.util.concurrent.Future;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cg/v.class
 */
/* renamed from: cg.v */
/* loaded from: combined.jar:classes2.jar:cg/v.class */
public final class C1109v {
    /* renamed from: a */
    public static <V> V m6677a(Future<V> future) {
        boolean z10;
        V v10;
        boolean z11 = false;
        while (true) {
            try {
                z10 = z11;
                v10 = future.get();
                break;
            } catch (InterruptedException e10) {
                z11 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }
}
