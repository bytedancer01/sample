package p099fc;

import ec.C4708k;
import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/i0.class
 */
/* renamed from: fc.i0 */
/* loaded from: combined.jar:classes2.jar:fc/i0.class */
public final class C4813i0 extends AbstractC4817k0<Comparable> implements Serializable {

    /* renamed from: b */
    public static final C4813i0 f28316b = new C4813i0();

    @Override // p099fc.AbstractC4817k0
    /* renamed from: f */
    public <S extends Comparable> AbstractC4817k0<S> mo24396f() {
        return C4827p0.f28403b;
    }

    @Override // p099fc.AbstractC4817k0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        C4708k.m23668j(comparable);
        C4708k.m23668j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
