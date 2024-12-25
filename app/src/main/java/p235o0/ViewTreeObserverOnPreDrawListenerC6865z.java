package p235o0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/z.class
 */
/* renamed from: o0.z */
/* loaded from: combined.jar:classes1.jar:o0/z.class */
public final class ViewTreeObserverOnPreDrawListenerC6865z implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f35588b;

    /* renamed from: c */
    public ViewTreeObserver f35589c;

    /* renamed from: d */
    public final Runnable f35590d;

    public ViewTreeObserverOnPreDrawListenerC6865z(View view, Runnable runnable) {
        this.f35588b = view;
        this.f35589c = view.getViewTreeObserver();
        this.f35590d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC6865z m31685a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC6865z viewTreeObserverOnPreDrawListenerC6865z = new ViewTreeObserverOnPreDrawListenerC6865z(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6865z);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC6865z);
        return viewTreeObserverOnPreDrawListenerC6865z;
    }

    /* renamed from: b */
    public void m31686b() {
        (this.f35589c.isAlive() ? this.f35589c : this.f35588b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f35588b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m31686b();
        this.f35590d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f35589c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m31686b();
    }
}
