package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.AbstractC0639s;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/m.class
 */
@AbstractC0639s.b("navigation")
/* renamed from: androidx.navigation.m */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/m.class */
public class C0633m extends AbstractC0639s<C0632l> {

    /* renamed from: a */
    public final C0640t f4279a;

    public C0633m(C0640t c0640t) {
        this.f4279a = c0640t;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: e */
    public boolean mo3466e() {
        return true;
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0632l mo3464a() {
        return new C0632l(this);
    }

    @Override // androidx.navigation.AbstractC0639s
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0631k mo3465b(C0632l c0632l, Bundle bundle, C0636p c0636p, AbstractC0639s.a aVar) {
        int m3580M = c0632l.m3580M();
        if (m3580M == 0) {
            throw new IllegalStateException("no start destination defined via app:startDestination for " + c0632l.mo3568q());
        }
        C0631k m3578K = c0632l.m3578K(m3580M, false);
        if (m3578K != null) {
            return this.f4279a.m3669e(m3578K.m3571x()).mo3465b(m3578K, m3578K.m3564d(bundle), c0636p, aVar);
        }
        throw new IllegalArgumentException("navigation destination " + c0632l.m3579L() + " is not a direct child of this NavGraph");
    }
}
