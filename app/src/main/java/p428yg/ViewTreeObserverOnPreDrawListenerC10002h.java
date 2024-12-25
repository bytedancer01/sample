package p428yg;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/h.class
 */
/* renamed from: yg.h */
/* loaded from: combined.jar:classes2.jar:yg/h.class */
public class ViewTreeObserverOnPreDrawListenerC10002h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final C10018x f45837b;

    /* renamed from: c */
    public final WeakReference<ImageView> f45838c;

    /* renamed from: d */
    public InterfaceC9996e f45839d;

    public ViewTreeObserverOnPreDrawListenerC10002h(C10018x c10018x, ImageView imageView, InterfaceC9996e interfaceC9996e) {
        this.f45837b = c10018x;
        this.f45838c = new WeakReference<>(imageView);
        this.f45839d = interfaceC9996e;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* renamed from: a */
    public void m42064a() {
        this.f45839d = null;
        ImageView imageView = this.f45838c.get();
        if (imageView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.f45838c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width <= 0 || height <= 0) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.f45837b.m42156l().m42155k(width, height).m42152h(imageView, this.f45839d);
        return true;
    }
}
