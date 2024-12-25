package p383w9;

import java.lang.ref.WeakReference;
import p403xa.BinderC9696d;
import p403xa.C9704l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:w9/k0.class
 */
/* renamed from: w9.k0 */
/* loaded from: combined.jar:classes2.jar:w9/k0.class */
public final class BinderC9483k0 extends BinderC9696d {

    /* renamed from: b */
    public final WeakReference<C9508p0> f43318b;

    public BinderC9483k0(C9508p0 c9508p0) {
        this.f43318b = new WeakReference<>(c9508p0);
    }

    @Override // p403xa.InterfaceC9698f
    /* renamed from: c1 */
    public final void mo39916c1(C9704l c9704l) {
        C9544y0 c9544y0;
        C9508p0 c9508p0 = this.f43318b.get();
        if (c9508p0 == null) {
            return;
        }
        c9544y0 = c9508p0.f43370a;
        c9544y0.m40086l(new C9478j0(this, c9508p0, c9508p0, c9704l));
    }
}
