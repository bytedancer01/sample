package pa;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pa/k.class
 */
/* renamed from: pa.k */
/* loaded from: combined.jar:classes2.jar:pa/k.class */
public final class C7692k {

    /* renamed from: a */
    public final ConcurrentHashMap<C7691j, List<Throwable>> f37433a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f37434b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m33631a(Throwable th2, boolean z10) {
        while (true) {
            Reference<? extends Throwable> poll = this.f37434b.poll();
            if (poll == null) {
                break;
            }
            this.f37433a.remove(poll);
        }
        List<Throwable> list = this.f37433a.get(new C7691j(th2, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f37433a.putIfAbsent(new C7691j(th2, this.f37434b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
