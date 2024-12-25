package p136hi;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hi/m.class
 */
/* renamed from: hi.m */
/* loaded from: combined.jar:classes2.jar:hi/m.class */
public final /* synthetic */ class C5131m {
    /* renamed from: a */
    public static /* synthetic */ boolean m25720a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
