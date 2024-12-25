package p428yg;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/d0.class
 */
/* renamed from: yg.d0 */
/* loaded from: combined.jar:classes2.jar:yg/d0.class */
public final class C9995d0 extends AbstractC9988a<InterfaceC9993c0> {
    public C9995d0(C10014t c10014t, InterfaceC9993c0 interfaceC9993c0, C10017w c10017w, int i10, int i11, Drawable drawable, String str, Object obj, int i12) {
        super(c10014t, interfaceC9993c0, c10017w, i10, i11, i12, drawable, str, obj, false);
    }

    @Override // p428yg.AbstractC9988a
    /* renamed from: b */
    public void mo41972b(Bitmap bitmap, C10014t.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        InterfaceC9993c0 m41981k = m41981k();
        if (m41981k != null) {
            m41981k.mo16617b(bitmap, eVar);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // p428yg.AbstractC9988a
    /* renamed from: c */
    public void mo41973c() {
        InterfaceC9993c0 m41981k = m41981k();
        if (m41981k != null) {
            m41981k.mo16616a(this.f45761g != 0 ? this.f45755a.f45889e.getResources().getDrawable(this.f45761g) : this.f45762h);
        }
    }
}
