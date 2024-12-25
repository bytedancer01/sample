package pa;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pa/j.class
 */
/* renamed from: pa.j */
/* loaded from: combined.jar:classes2.jar:pa/j.class */
public final class C7691j extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f37432a;

    public C7691j(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        this.f37432a = System.identityHashCode(th2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != C7691j.class) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C7691j c7691j = (C7691j) obj;
        return this.f37432a == c7691j.f37432a && get() == c7691j.get();
    }

    public final int hashCode() {
        return this.f37432a;
    }
}
