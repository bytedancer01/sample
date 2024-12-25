package p330t4;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p299r4.InterfaceC7954b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t4/k.class
 */
/* renamed from: t4.k */
/* loaded from: combined.jar:classes1.jar:t4/k.class */
public abstract class AbstractC8631k<T extends View, Z> extends AbstractC8621a<Z> {

    /* renamed from: d */
    public static boolean f40289d;

    /* renamed from: e */
    public static Integer f40290e;

    /* renamed from: b */
    public final T f40291b;

    /* renamed from: c */
    public final a f40292c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t4/k$a.class
     */
    /* renamed from: t4.k$a */
    /* loaded from: combined.jar:classes1.jar:t4/k$a.class */
    public static class a {

        /* renamed from: a */
        public final View f40293a;

        /* renamed from: b */
        public final List<InterfaceC8628h> f40294b = new ArrayList();

        /* renamed from: c */
        public ViewTreeObserverOnPreDrawListenerC10330a f40295c;

        /* renamed from: d */
        public Point f40296d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:t4/k$a$a.class
         */
        /* renamed from: t4.k$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:t4/k$a$a.class */
        public static class ViewTreeObserverOnPreDrawListenerC10330a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<a> f40297b;

            public ViewTreeObserverOnPreDrawListenerC10330a(a aVar) {
                this.f40297b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called listener=" + this);
                }
                a aVar = this.f40297b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m37059b();
                return true;
            }
        }

        public a(View view) {
            this.f40293a = view;
        }

        /* renamed from: b */
        public final void m37059b() {
            if (this.f40294b.isEmpty()) {
                return;
            }
            int m37064g = m37064g();
            int m37063f = m37063f();
            if (m37065h(m37064g) && m37065h(m37063f)) {
                m37066i(m37064g, m37063f);
                ViewTreeObserver viewTreeObserver = this.f40293a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f40295c);
                }
                this.f40295c = null;
            }
        }

        @TargetApi(13)
        /* renamed from: c */
        public final Point m37060c() {
            Point point = this.f40296d;
            if (point != null) {
                return point;
            }
            Display defaultDisplay = ((WindowManager) this.f40293a.getContext().getSystemService("window")).getDefaultDisplay();
            Point point2 = new Point();
            this.f40296d = point2;
            defaultDisplay.getSize(point2);
            return this.f40296d;
        }

        /* renamed from: d */
        public void m37061d(InterfaceC8628h interfaceC8628h) {
            int m37064g = m37064g();
            int m37063f = m37063f();
            if (m37065h(m37064g) && m37065h(m37063f)) {
                interfaceC8628h.mo34487d(m37064g, m37063f);
                return;
            }
            if (!this.f40294b.contains(interfaceC8628h)) {
                this.f40294b.add(interfaceC8628h);
            }
            if (this.f40295c == null) {
                ViewTreeObserver viewTreeObserver = this.f40293a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC10330a viewTreeObserverOnPreDrawListenerC10330a = new ViewTreeObserverOnPreDrawListenerC10330a(this);
                this.f40295c = viewTreeObserverOnPreDrawListenerC10330a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10330a);
            }
        }

        /* renamed from: e */
        public final int m37062e(int i10, boolean z10) {
            int i11 = i10;
            if (i10 == -2) {
                Point m37060c = m37060c();
                i11 = z10 ? m37060c.y : m37060c.x;
            }
            return i11;
        }

        /* renamed from: f */
        public final int m37063f() {
            ViewGroup.LayoutParams layoutParams = this.f40293a.getLayoutParams();
            if (m37065h(this.f40293a.getHeight())) {
                return this.f40293a.getHeight();
            }
            if (layoutParams != null) {
                return m37062e(layoutParams.height, true);
            }
            return 0;
        }

        /* renamed from: g */
        public final int m37064g() {
            ViewGroup.LayoutParams layoutParams = this.f40293a.getLayoutParams();
            if (m37065h(this.f40293a.getWidth())) {
                return this.f40293a.getWidth();
            }
            if (layoutParams != null) {
                return m37062e(layoutParams.width, false);
            }
            return 0;
        }

        /* renamed from: h */
        public final boolean m37065h(int i10) {
            return i10 > 0 || i10 == -2;
        }

        /* renamed from: i */
        public final void m37066i(int i10, int i11) {
            Iterator<InterfaceC8628h> it = this.f40294b.iterator();
            while (it.hasNext()) {
                it.next().mo34487d(i10, i11);
            }
            this.f40294b.clear();
        }
    }

    public AbstractC8631k(T t10) {
        if (t10 == null) {
            throw new NullPointerException("View must not be null!");
        }
        this.f40291b = t10;
        this.f40292c = new a(t10);
    }

    @Override // p330t4.InterfaceC8630j
    /* renamed from: a */
    public void mo37053a(InterfaceC8628h interfaceC8628h) {
        this.f40292c.m37061d(interfaceC8628h);
    }

    @Override // p330t4.AbstractC8621a, p330t4.InterfaceC8630j
    /* renamed from: f */
    public InterfaceC7954b mo37043f() {
        InterfaceC7954b interfaceC7954b;
        Object m37056j = m37056j();
        if (m37056j == null) {
            interfaceC7954b = null;
        } else {
            if (!(m37056j instanceof InterfaceC7954b)) {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
            interfaceC7954b = (InterfaceC7954b) m37056j;
        }
        return interfaceC7954b;
    }

    public T getView() {
        return this.f40291b;
    }

    @Override // p330t4.AbstractC8621a, p330t4.InterfaceC8630j
    /* renamed from: h */
    public void mo37045h(InterfaceC7954b interfaceC7954b) {
        m37057k(interfaceC7954b);
    }

    /* renamed from: j */
    public final Object m37056j() {
        Integer num = f40290e;
        return num == null ? this.f40291b.getTag() : this.f40291b.getTag(num.intValue());
    }

    /* renamed from: k */
    public final void m37057k(Object obj) {
        Integer num = f40290e;
        if (num != null) {
            this.f40291b.setTag(num.intValue(), obj);
        } else {
            f40289d = true;
            this.f40291b.setTag(obj);
        }
    }

    public String toString() {
        return "Target for: " + this.f40291b;
    }
}
