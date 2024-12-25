package p428yg;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/l.class
 */
/* renamed from: yg.l */
/* loaded from: combined.jar:classes2.jar:yg/l.class */
public class C10006l extends AbstractC9988a<ImageView> {

    /* renamed from: m */
    public InterfaceC9996e f45866m;

    public C10006l(C10014t c10014t, ImageView imageView, C10017w c10017w, int i10, int i11, int i12, Drawable drawable, String str, Object obj, InterfaceC9996e interfaceC9996e, boolean z10) {
        super(c10014t, imageView, c10017w, i10, i11, i12, drawable, str, obj, z10);
        this.f45866m = interfaceC9996e;
    }

    @Override // p428yg.AbstractC9988a
    /* renamed from: a */
    public void mo41971a() {
        super.mo41971a();
        if (this.f45866m != null) {
            this.f45866m = null;
        }
    }

    @Override // p428yg.AbstractC9988a
    /* renamed from: b */
    public void mo41972b(Bitmap bitmap, C10014t.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f45757c.get();
        if (imageView == null) {
            return;
        }
        C10014t c10014t = this.f45755a;
        C10015u.m42126c(imageView, c10014t.f45889e, bitmap, eVar, this.f45758d, c10014t.f45897m);
        InterfaceC9996e interfaceC9996e = this.f45866m;
        if (interfaceC9996e != null) {
            interfaceC9996e.onSuccess();
        }
    }

    @Override // p428yg.AbstractC9988a
    /* renamed from: c */
    public void mo41973c() {
        ImageView imageView = (ImageView) this.f45757c.get();
        if (imageView == null) {
            return;
        }
        int i10 = this.f45761g;
        if (i10 != 0) {
            imageView.setImageResource(i10);
        } else {
            Drawable drawable = this.f45762h;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        InterfaceC9996e interfaceC9996e = this.f45866m;
        if (interfaceC9996e != null) {
            interfaceC9996e.mo15848a();
        }
    }
}
