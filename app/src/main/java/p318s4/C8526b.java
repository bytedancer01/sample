package p318s4;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import p318s4.InterfaceC8527c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s4/b.class
 */
/* renamed from: s4.b */
/* loaded from: combined.jar:classes1.jar:s4/b.class */
public class C8526b<T extends Drawable> implements InterfaceC8527c<T> {

    /* renamed from: a */
    public final InterfaceC8527c<T> f39905a;

    /* renamed from: b */
    public final int f39906b;

    public C8526b(InterfaceC8527c<T> interfaceC8527c, int i10) {
        this.f39905a = interfaceC8527c;
        this.f39906b = i10;
    }

    @Override // p318s4.InterfaceC8527c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean mo36744a(T t10, InterfaceC8527c.a aVar) {
        Drawable mo36747d = aVar.mo36747d();
        if (mo36747d == null) {
            this.f39905a.mo36744a(t10, aVar);
            return false;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{mo36747d, t10});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(this.f39906b);
        aVar.mo36746b(transitionDrawable);
        return true;
    }
}
