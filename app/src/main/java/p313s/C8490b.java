package p313s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s/b.class
 */
/* renamed from: s.b */
/* loaded from: combined.jar:classes1.jar:s/b.class */
public final /* synthetic */ class C8490b {
    /* renamed from: a */
    public static /* synthetic */ boolean m36639a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
