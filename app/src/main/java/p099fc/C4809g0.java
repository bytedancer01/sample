package p099fc;

import ec.C4708k;
import ec.InterfaceC4712o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/g0.class
 */
/* renamed from: fc.g0 */
/* loaded from: combined.jar:classes2.jar:fc/g0.class */
public final class C4809g0 {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/g0$a.class
     */
    /* renamed from: fc.g0$a */
    /* loaded from: combined.jar:classes2.jar:fc/g0$a.class */
    public static class a<K, V> extends AbstractC4800c<K, V> {

        /* renamed from: h */
        public transient InterfaceC4712o<? extends List<V>> f28313h;

        public a(Map<K, Collection<V>> map, InterfaceC4712o<? extends List<V>> interfaceC4712o) {
            super(map);
            this.f28313h = (InterfaceC4712o) C4708k.m23668j(interfaceC4712o);
        }

        @Override // p099fc.AbstractC4802d
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public List<V> mo24320r() {
            return this.f28313h.get();
        }

        @Override // p099fc.AbstractC4806f
        /* renamed from: e */
        public Map<K, Collection<V>> mo24378e() {
            return m24322t();
        }

        @Override // p099fc.AbstractC4806f
        /* renamed from: g */
        public Set<K> mo24379g() {
            return m24323u();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fc/g0$b.class
     */
    /* renamed from: fc.g0$b */
    /* loaded from: combined.jar:classes2.jar:fc/g0$b.class */
    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo24380d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo24380d().mo24376c(entry.getKey(), entry.getValue());
        }

        /* renamed from: d */
        public abstract InterfaceC4805e0<K, V> mo24380d();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo24380d().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo24380d().size();
        }
    }

    /* renamed from: a */
    public static boolean m24390a(InterfaceC4805e0<?, ?> interfaceC4805e0, @NullableDecl Object obj) {
        if (obj == interfaceC4805e0) {
            return true;
        }
        if (obj instanceof InterfaceC4805e0) {
            return interfaceC4805e0.mo24304b().equals(((InterfaceC4805e0) obj).mo24304b());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> InterfaceC4797a0<K, V> m24391b(Map<K, Collection<V>> map, InterfaceC4712o<? extends List<V>> interfaceC4712o) {
        return new a(map, interfaceC4712o);
    }
}
