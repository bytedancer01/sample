package p099fc;

import ec.C4705h;
import ec.C4708k;
import ec.InterfaceC4703f;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/i.class
 */
/* renamed from: fc.i */
/* loaded from: combined.jar:classes2.jar:fc/i.class */
public final class C4812i<F, T> extends AbstractC4817k0<F> implements Serializable {

    /* renamed from: b */
    public final InterfaceC4703f<F, ? extends T> f28314b;

    /* renamed from: c */
    public final AbstractC4817k0<T> f28315c;

    public C4812i(InterfaceC4703f<F, ? extends T> interfaceC4703f, AbstractC4817k0<T> abstractC4817k0) {
        this.f28314b = (InterfaceC4703f) C4708k.m23668j(interfaceC4703f);
        this.f28315c = (AbstractC4817k0) C4708k.m23668j(abstractC4817k0);
    }

    @Override // p099fc.AbstractC4817k0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f28315c.compare(this.f28314b.apply(f10), this.f28314b.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4812i)) {
            return false;
        }
        C4812i c4812i = (C4812i) obj;
        if (!this.f28314b.equals(c4812i.f28314b) || !this.f28315c.equals(c4812i.f28315c)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return C4705h.m23656b(this.f28314b, this.f28315c);
    }

    public String toString() {
        return this.f28315c + ".onResultOf(" + this.f28314b + ")";
    }
}
