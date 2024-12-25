package p318s4;

import android.view.View;
import android.view.animation.Animation;
import p318s4.InterfaceC8527c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s4/f.class
 */
/* renamed from: s4.f */
/* loaded from: combined.jar:classes1.jar:s4/f.class */
public class C8530f<R> implements InterfaceC8527c<R> {

    /* renamed from: a */
    public final a f39909a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s4/f$a.class
     */
    /* renamed from: s4.f$a */
    /* loaded from: combined.jar:classes1.jar:s4/f$a.class */
    public interface a {
        Animation build();
    }

    public C8530f(a aVar) {
        this.f39909a = aVar;
    }

    @Override // p318s4.InterfaceC8527c
    /* renamed from: a */
    public boolean mo36744a(R r10, InterfaceC8527c.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f39909a.build());
        return false;
    }
}
