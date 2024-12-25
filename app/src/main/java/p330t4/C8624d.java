package p330t4;

import android.widget.ImageView;
import p160j4.AbstractC5293b;
import p318s4.InterfaceC8527c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t4/d.class
 */
/* renamed from: t4.d */
/* loaded from: combined.jar:classes1.jar:t4/d.class */
public class C8624d extends AbstractC8625e<AbstractC5293b> {

    /* renamed from: f */
    public int f40280f;

    /* renamed from: g */
    public AbstractC5293b f40281g;

    public C8624d(ImageView imageView) {
        this(imageView, -1);
    }

    public C8624d(ImageView imageView, int i10) {
        super(imageView);
        this.f40280f = i10;
    }

    @Override // p330t4.AbstractC8625e, p330t4.InterfaceC8630j
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo16635c(AbstractC5293b abstractC5293b, InterfaceC8527c<? super AbstractC5293b> interfaceC8527c) {
        AbstractC5293b abstractC5293b2 = abstractC5293b;
        if (!abstractC5293b.mo25845b()) {
            float intrinsicWidth = abstractC5293b.getIntrinsicWidth() / abstractC5293b.getIntrinsicHeight();
            abstractC5293b2 = abstractC5293b;
            if (Math.abs((((ImageView) this.f40291b).getWidth() / ((ImageView) this.f40291b).getHeight()) - 1.0f) <= 0.05f) {
                abstractC5293b2 = abstractC5293b;
                if (Math.abs(intrinsicWidth - 1.0f) <= 0.05f) {
                    abstractC5293b2 = new C8629i(abstractC5293b, ((ImageView) this.f40291b).getWidth());
                }
            }
        }
        super.mo16635c(abstractC5293b2, interfaceC8527c);
        this.f40281g = abstractC5293b2;
        abstractC5293b2.mo25846c(this.f40280f);
        abstractC5293b2.start();
    }

    @Override // p330t4.AbstractC8625e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo37047l(AbstractC5293b abstractC5293b) {
        ((ImageView) this.f40291b).setImageDrawable(abstractC5293b);
    }

    @Override // p330t4.AbstractC8621a, p239o4.InterfaceC6899h
    public void onStart() {
        AbstractC5293b abstractC5293b = this.f40281g;
        if (abstractC5293b != null) {
            abstractC5293b.start();
        }
    }

    @Override // p330t4.AbstractC8621a, p239o4.InterfaceC6899h
    public void onStop() {
        AbstractC5293b abstractC5293b = this.f40281g;
        if (abstractC5293b != null) {
            abstractC5293b.stop();
        }
    }
}
