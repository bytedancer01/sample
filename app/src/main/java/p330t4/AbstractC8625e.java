package p330t4;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p318s4.InterfaceC8527c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t4/e.class
 */
/* renamed from: t4.e */
/* loaded from: combined.jar:classes1.jar:t4/e.class */
public abstract class AbstractC8625e<Z> extends AbstractC8631k<ImageView, Z> implements InterfaceC8527c.a {
    public AbstractC8625e(ImageView imageView) {
        super(imageView);
    }

    @Override // p318s4.InterfaceC8527c.a
    /* renamed from: b */
    public void mo36746b(Drawable drawable) {
        ((ImageView) this.f40291b).setImageDrawable(drawable);
    }

    @Override // p330t4.InterfaceC8630j
    /* renamed from: c */
    public void mo16635c(Z z10, InterfaceC8527c<? super Z> interfaceC8527c) {
        if (interfaceC8527c == null || !interfaceC8527c.mo36744a(z10, this)) {
            mo37047l(z10);
        }
    }

    @Override // p318s4.InterfaceC8527c.a
    /* renamed from: d */
    public Drawable mo36747d() {
        return ((ImageView) this.f40291b).getDrawable();
    }

    @Override // p330t4.AbstractC8621a, p330t4.InterfaceC8630j
    /* renamed from: e */
    public void mo37042e(Drawable drawable) {
        ((ImageView) this.f40291b).setImageDrawable(drawable);
    }

    @Override // p330t4.AbstractC8621a, p330t4.InterfaceC8630j
    /* renamed from: g */
    public void mo37044g(Drawable drawable) {
        ((ImageView) this.f40291b).setImageDrawable(drawable);
    }

    @Override // p330t4.AbstractC8621a, p330t4.InterfaceC8630j
    /* renamed from: i */
    public void mo37046i(Exception exc, Drawable drawable) {
        ((ImageView) this.f40291b).setImageDrawable(drawable);
    }

    /* renamed from: l */
    public abstract void mo37047l(Z z10);
}
