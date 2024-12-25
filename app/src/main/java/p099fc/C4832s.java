package p099fc;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/s.class
 */
/* renamed from: fc.s */
/* loaded from: combined.jar:classes2.jar:fc/s.class */
public class C4832s<K, V> extends AbstractC4804e<K, V> implements Serializable {

    /* renamed from: b */
    @NullableDecl
    public final K f28409b;

    /* renamed from: c */
    @NullableDecl
    public final V f28410c;

    public C4832s(@NullableDecl K k10, @NullableDecl V v10) {
        this.f28409b = k10;
        this.f28410c = v10;
    }

    @Override // p099fc.AbstractC4804e, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f28409b;
    }

    @Override // p099fc.AbstractC4804e, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.f28410c;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
