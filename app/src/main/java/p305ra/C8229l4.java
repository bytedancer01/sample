package p305ra;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/l4.class
 */
/* renamed from: ra.l4 */
/* loaded from: combined.jar:classes2.jar:ra/l4.class */
public final class C8229l4 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f39164a;

    public C8229l4(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        this.f39164a = System.identityHashCode(th2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C8229l4.class) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C8229l4 c8229l4 = (C8229l4) obj;
        return this.f39164a == c8229l4.f39164a && get() == c8229l4.get();
    }

    public final int hashCode() {
        return this.f39164a;
    }
}
