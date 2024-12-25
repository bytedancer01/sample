package p099fc;

import ec.C4708k;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/m.class
 */
/* renamed from: fc.m */
/* loaded from: combined.jar:classes2.jar:fc/m.class */
public final class C4820m<T> extends AbstractC4817k0<T> implements Serializable {

    /* renamed from: b */
    public final Comparator<T> f28341b;

    public C4820m(Comparator<T> comparator) {
        this.f28341b = (Comparator) C4708k.m23668j(comparator);
    }

    @Override // p099fc.AbstractC4817k0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f28341b.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4820m) {
            return this.f28341b.equals(((C4820m) obj).f28341b);
        }
        return false;
    }

    public int hashCode() {
        return this.f28341b.hashCode();
    }

    public String toString() {
        return this.f28341b.toString();
    }
}
