package p099fc;

import ec.C4708k;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/q0.class
 */
/* renamed from: fc.q0 */
/* loaded from: combined.jar:classes2.jar:fc/q0.class */
public final class C4829q0<T> extends AbstractC4817k0<T> implements Serializable {

    /* renamed from: b */
    public final AbstractC4817k0<? super T> f28404b;

    public C4829q0(AbstractC4817k0<? super T> abstractC4817k0) {
        this.f28404b = (AbstractC4817k0) C4708k.m23668j(abstractC4817k0);
    }

    @Override // p099fc.AbstractC4817k0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f28404b.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4829q0) {
            return this.f28404b.equals(((C4829q0) obj).f28404b);
        }
        return false;
    }

    @Override // p099fc.AbstractC4817k0
    /* renamed from: f */
    public <S extends T> AbstractC4817k0<S> mo24396f() {
        return this.f28404b;
    }

    public int hashCode() {
        return -this.f28404b.hashCode();
    }

    public String toString() {
        return this.f28404b + ".reverse()";
    }
}
