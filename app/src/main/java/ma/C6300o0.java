package ma;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import p244o9.InterfaceC6931a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/o0.class
 */
/* renamed from: ma.o0 */
/* loaded from: combined.jar:classes2.jar:ma/o0.class */
public final class C6300o0 implements InterfaceC6931a {

    /* renamed from: a */
    public final C6342q0 f33918a;

    public C6300o0(C6342q0 c6342q0) {
        this.f33918a = c6342q0;
    }

    @Override // p244o9.InterfaceC6931a
    /* renamed from: a */
    public final void mo29921a(Bitmap bitmap) {
        View view;
        ImageView imageView;
        ImageView imageView2;
        C6321p0 c6321p0;
        C6321p0 c6321p02;
        View view2;
        if (bitmap != null) {
            C6342q0 c6342q0 = this.f33918a;
            view = c6342q0.f33975e;
            if (view != null) {
                view2 = c6342q0.f33975e;
                view2.setVisibility(4);
            }
            imageView = this.f33918a.f33972b;
            imageView.setVisibility(0);
            imageView2 = this.f33918a.f33972b;
            imageView2.setImageBitmap(bitmap);
            C6342q0 c6342q02 = this.f33918a;
            c6321p0 = c6342q02.f33977g;
            if (c6321p0 != null) {
                c6321p02 = c6342q02.f33977g;
                c6321p02.mo29943a();
            }
        }
    }
}
