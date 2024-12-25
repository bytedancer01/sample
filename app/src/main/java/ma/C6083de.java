package ma;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p313s.C8490b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/de.class
 */
/* renamed from: ma.de */
/* loaded from: combined.jar:classes2.jar:ma/de.class */
public final /* synthetic */ class C6083de {
    /* renamed from: a */
    public static /* synthetic */ boolean m29549a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!C8490b.m36639a(atomicReferenceFieldUpdater, obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
