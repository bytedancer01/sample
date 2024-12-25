package p099fc;

import ec.C4708k;
import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/p0.class
 */
/* renamed from: fc.p0 */
/* loaded from: combined.jar:classes2.jar:fc/p0.class */
public final class C4827p0 extends AbstractC4817k0<Comparable> implements Serializable {

    /* renamed from: b */
    public static final C4827p0 f28403b = new C4827p0();

    @Override // p099fc.AbstractC4817k0
    /* renamed from: f */
    public <S extends Comparable> AbstractC4817k0<S> mo24396f() {
        return AbstractC4817k0.m24409c();
    }

    @Override // p099fc.AbstractC4817k0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        C4708k.m23668j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
