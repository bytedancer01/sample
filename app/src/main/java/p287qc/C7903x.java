package p287qc;

import bd.InterfaceC0891b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qc/x.class
 */
/* renamed from: qc.x */
/* loaded from: combined.jar:classes2.jar:qc/x.class */
public class C7903x<T> implements InterfaceC0891b<Set<T>> {

    /* renamed from: b */
    public volatile Set<T> f38028b = null;

    /* renamed from: a */
    public volatile Set<InterfaceC0891b<T>> f38027a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C7903x(Collection<InterfaceC0891b<T>> collection) {
        this.f38027a.addAll(collection);
    }

    /* renamed from: b */
    public static C7903x<?> m34249b(Collection<InterfaceC0891b<?>> collection) {
        return new C7903x<>((Set) collection);
    }

    /* renamed from: a */
    public void m34250a(InterfaceC0891b<T> interfaceC0891b) {
        Set<T> set;
        synchronized (this) {
            if (this.f38028b == null) {
                set = this.f38027a;
            } else {
                set = this.f38028b;
                interfaceC0891b = interfaceC0891b.get();
            }
            set.add(interfaceC0891b);
        }
    }

    @Override // bd.InterfaceC0891b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f38028b == null) {
            synchronized (this) {
                if (this.f38028b == null) {
                    this.f38028b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m34252d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f38028b);
    }

    /* renamed from: d */
    public final void m34252d() {
        synchronized (this) {
            Iterator<InterfaceC0891b<T>> it = this.f38027a.iterator();
            while (it.hasNext()) {
                this.f38028b.add(it.next().get());
            }
            this.f38027a = null;
        }
    }
}
