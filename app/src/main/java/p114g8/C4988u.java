package p114g8;

import android.util.SparseArray;
import p059d9.C4389t0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g8/u.class
 */
/* renamed from: g8.u */
/* loaded from: combined.jar:classes2.jar:g8/u.class */
public final class C4988u {

    /* renamed from: a */
    public final SparseArray<C4389t0> f28979a = new SparseArray<>();

    /* renamed from: a */
    public C4389t0 m25146a(int i10) {
        C4389t0 c4389t0 = this.f28979a.get(i10);
        C4389t0 c4389t02 = c4389t0;
        if (c4389t0 == null) {
            c4389t02 = new C4389t0(9223372036854775806L);
            this.f28979a.put(i10, c4389t02);
        }
        return c4389t02;
    }

    /* renamed from: b */
    public void m25147b() {
        this.f28979a.clear();
    }
}
