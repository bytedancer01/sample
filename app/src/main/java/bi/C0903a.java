package bi;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:bi/a.class
 */
/* renamed from: bi.a */
/* loaded from: combined.jar:classes2.jar:bi/a.class */
public final class C0903a<T> implements InterfaceC0906d<T> {

    /* renamed from: a */
    @NotNull
    public final AtomicReference<InterfaceC0906d<T>> f6052a;

    public C0903a(@NotNull InterfaceC0906d<? extends T> interfaceC0906d) {
        C9367f.m39526e(interfaceC0906d, "sequence");
        this.f6052a = new AtomicReference<>(interfaceC0906d);
    }

    @Override // bi.InterfaceC0906d
    @NotNull
    public Iterator<T> iterator() {
        InterfaceC0906d<T> andSet = this.f6052a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
