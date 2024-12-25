package p306rb;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import p235o0.C6813c1;
import p235o0.C6824g0;
import p235o0.InterfaceC6859w;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/k.class
 */
/* renamed from: rb.k */
/* loaded from: combined.jar:classes2.jar:rb/k.class */
public class C8459k {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/k$a.class
     */
    /* renamed from: rb.k$a */
    /* loaded from: combined.jar:classes2.jar:rb/k$a.class */
    public static final class a implements InterfaceC6859w {

        /* renamed from: a */
        public final c f39544a;

        /* renamed from: b */
        public final d f39545b;

        public a(c cVar, d dVar) {
            this.f39544a = cVar;
            this.f39545b = dVar;
        }

        @Override // p235o0.InterfaceC6859w
        /* renamed from: a */
        public C6813c1 mo1813a(View view, C6813c1 c6813c1) {
            return this.f39544a.mo13378a(view, c6813c1, new d(this.f39545b));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/k$b.class
     */
    /* renamed from: rb.k$b */
    /* loaded from: combined.jar:classes2.jar:rb/k$b.class */
    public static final class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C6824g0.m31533m0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/k$c.class
     */
    /* renamed from: rb.k$c */
    /* loaded from: combined.jar:classes2.jar:rb/k$c.class */
    public interface c {
        /* renamed from: a */
        C6813c1 mo13378a(View view, C6813c1 c6813c1, d dVar);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:rb/k$d.class
     */
    /* renamed from: rb.k$d */
    /* loaded from: combined.jar:classes2.jar:rb/k$d.class */
    public static class d {

        /* renamed from: a */
        public int f39546a;

        /* renamed from: b */
        public int f39547b;

        /* renamed from: c */
        public int f39548c;

        /* renamed from: d */
        public int f39549d;

        public d(int i10, int i11, int i12, int i13) {
            this.f39546a = i10;
            this.f39547b = i11;
            this.f39548c = i12;
            this.f39549d = i13;
        }

        public d(d dVar) {
            this.f39546a = dVar.f39546a;
            this.f39547b = dVar.f39547b;
            this.f39548c = dVar.f39548c;
            this.f39549d = dVar.f39549d;
        }
    }

    /* renamed from: a */
    public static void m36340a(View view, c cVar) {
        C6824g0.m31470A0(view, new a(cVar, new d(C6824g0.m31485I(view), view.getPaddingTop(), C6824g0.m31483H(view), view.getPaddingBottom())));
        m36345f(view);
    }

    /* renamed from: b */
    public static float m36341b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m36342c(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += C6824g0.m31552w((View) parent);
        }
        return f10;
    }

    /* renamed from: d */
    public static boolean m36343d(View view) {
        boolean z10 = true;
        if (C6824g0.m31473C(view) != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m36344e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: f */
    public static void m36345f(View view) {
        if (C6824g0.m31501T(view)) {
            C6824g0.m31533m0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
