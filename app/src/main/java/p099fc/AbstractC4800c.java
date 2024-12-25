package p099fc;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/c.class
 */
/* renamed from: fc.c */
/* loaded from: combined.jar:classes2.jar:fc/c.class */
public abstract class AbstractC4800c<K, V> extends AbstractC4802d<K, V> implements InterfaceC4797a0<K, V> {
    public AbstractC4800c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // p099fc.AbstractC4802d, p099fc.InterfaceC4805e0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public List<V> get(@NullableDecl K k10) {
        return (List) super.get(k10);
    }

    @Override // p099fc.AbstractC4806f, p099fc.InterfaceC4805e0
    /* renamed from: b */
    public Map<K, Collection<V>> mo24304b() {
        return super.mo24304b();
    }

    @Override // p099fc.AbstractC4806f
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // p099fc.AbstractC4802d, p099fc.InterfaceC4805e0
    public boolean put(@NullableDecl K k10, @NullableDecl V v10) {
        return super.put(k10, v10);
    }

    @Override // p099fc.AbstractC4802d
    /* renamed from: x */
    public <E> Collection<E> mo24305x(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // p099fc.AbstractC4802d
    /* renamed from: y */
    public Collection<V> mo24306y(K k10, Collection<V> collection) {
        return m24325z(k10, (List) collection, null);
    }
}
