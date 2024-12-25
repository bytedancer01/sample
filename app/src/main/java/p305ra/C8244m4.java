package p305ra;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/m4.class
 */
/* renamed from: ra.m4 */
/* loaded from: combined.jar:classes2.jar:ra/m4.class */
public final class C8244m4 {

    /* renamed from: a */
    public final ConcurrentHashMap<C8229l4, List<Throwable>> f39179a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f39180b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m35604a(Throwable th2, boolean z10) {
        while (true) {
            Reference<? extends Throwable> poll = this.f39180b.poll();
            if (poll == null) {
                break;
            }
            this.f39179a.remove(poll);
        }
        List<Throwable> list = this.f39179a.get(new C8229l4(th2, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f39179a.putIfAbsent(new C8229l4(th2, this.f39180b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
