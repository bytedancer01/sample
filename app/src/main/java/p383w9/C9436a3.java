package p383w9;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/a3.class
 */
/* renamed from: w9.a3 */
/* loaded from: combined.jar:classes2.jar:w9/a3.class */
public final /* synthetic */ class C9436a3 {
    /* renamed from: a */
    public static /* synthetic */ boolean m39798a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
