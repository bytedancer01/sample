package p099fc;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/e0.class
 */
/* renamed from: fc.e0 */
/* loaded from: combined.jar:classes2.jar:fc/e0.class */
public interface InterfaceC4805e0<K, V> {
    /* renamed from: a */
    Collection<Map.Entry<K, V>> mo24315a();

    /* renamed from: b */
    Map<K, Collection<V>> mo24304b();

    /* renamed from: c */
    boolean mo24376c(@NullableDecl Object obj, @NullableDecl Object obj2);

    void clear();

    Collection<V> get(@NullableDecl K k10);

    Set<K> keySet();

    boolean put(@NullableDecl K k10, @NullableDecl V v10);

    boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2);

    int size();

    Collection<V> values();
}
