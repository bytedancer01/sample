package p003a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/c.class
 */
/* renamed from: a2.c */
/* loaded from: combined.jar:classes1.jar:a2/c.class */
public class C0009c extends AbstractC0027l {

    /* renamed from: N */
    public static final String[] f16N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O */
    public static final Property<Drawable, PointF> f17O = new b(PointF.class, "boundsOrigin");

    /* renamed from: P */
    public static final Property<k, PointF> f18P = new c(PointF.class, "topLeft");

    /* renamed from: Q */
    public static final Property<k, PointF> f19Q = new d(PointF.class, "bottomRight");

    /* renamed from: R */
    public static final Property<View, PointF> f20R = new e(PointF.class, "bottomRight");

    /* renamed from: S */
    public static final Property<View, PointF> f21S = new f(PointF.class, "topLeft");

    /* renamed from: T */
    public static final Property<View, PointF> f22T = new g(PointF.class, "position");

    /* renamed from: U */
    public static C0023j f23U = new C0023j();

    /* renamed from: K */
    public int[] f24K = new int[2];

    /* renamed from: L */
    public boolean f25L = false;

    /* renamed from: M */
    public boolean f26M = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$a.class
     */
    /* renamed from: a2.c$a */
    /* loaded from: combined.jar:classes1.jar:a2/c$a.class */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final ViewGroup f27b;

        /* renamed from: c */
        public final BitmapDrawable f28c;

        /* renamed from: d */
        public final View f29d;

        /* renamed from: e */
        public final float f30e;

        /* renamed from: f */
        public final C0009c f31f;

        public a(C0009c c0009c, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f31f = c0009c;
            this.f27b = viewGroup;
            this.f28c = bitmapDrawable;
            this.f29d = view;
            this.f30e = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0006a0.m31b(this.f27b).mo195b(this.f28c);
            C0006a0.m36g(this.f29d, this.f30e);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$b.class
     */
    /* renamed from: a2.c$b */
    /* loaded from: combined.jar:classes1.jar:a2/c$b.class */
    public static final class b extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f32a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f32a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f32a);
            Rect rect = this.f32a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f32a);
            this.f32a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f32a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$c.class
     */
    /* renamed from: a2.c$c */
    /* loaded from: combined.jar:classes1.jar:a2/c$c.class */
    public static final class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m70c(pointF);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$d.class
     */
    /* renamed from: a2.c$d */
    /* loaded from: combined.jar:classes1.jar:a2/c$d.class */
    public static final class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m68a(pointF);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$e.class
     */
    /* renamed from: a2.c$e */
    /* loaded from: combined.jar:classes1.jar:a2/c$e.class */
    public static final class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0006a0.m35f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$f.class
     */
    /* renamed from: a2.c$f */
    /* loaded from: combined.jar:classes1.jar:a2/c$f.class */
    public static final class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C0006a0.m35f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$g.class
     */
    /* renamed from: a2.c$g */
    /* loaded from: combined.jar:classes1.jar:a2/c$g.class */
    public static final class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0006a0.m35f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$h.class
     */
    /* renamed from: a2.c$h */
    /* loaded from: combined.jar:classes1.jar:a2/c$h.class */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final k f33b;

        /* renamed from: c */
        public final C0009c f34c;
        private k mViewBounds;

        public h(C0009c c0009c, k kVar) {
            this.f34c = c0009c;
            this.f33b = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$i.class
     */
    /* renamed from: a2.c$i */
    /* loaded from: combined.jar:classes1.jar:a2/c$i.class */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: b */
        public boolean f35b;

        /* renamed from: c */
        public final View f36c;

        /* renamed from: d */
        public final Rect f37d;

        /* renamed from: e */
        public final int f38e;

        /* renamed from: f */
        public final int f39f;

        /* renamed from: g */
        public final int f40g;

        /* renamed from: h */
        public final int f41h;

        /* renamed from: i */
        public final C0009c f42i;

        public i(C0009c c0009c, View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f42i = c0009c;
            this.f36c = view;
            this.f37d = rect;
            this.f38e = i10;
            this.f39f = i11;
            this.f40g = i12;
            this.f41h = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f35b) {
                return;
            }
            C6824g0.m31551v0(this.f36c, this.f37d);
            C0006a0.m35f(this.f36c, this.f38e, this.f39f, this.f40g, this.f41h);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$j.class
     */
    /* renamed from: a2.c$j */
    /* loaded from: combined.jar:classes1.jar:a2/c$j.class */
    public class j extends C0029m {

        /* renamed from: b */
        public boolean f43b = false;

        /* renamed from: c */
        public final ViewGroup f44c;

        /* renamed from: d */
        public final C0009c f45d;

        public j(C0009c c0009c, ViewGroup viewGroup) {
            this.f45d = c0009c;
            this.f44c = viewGroup;
        }

        @Override // p003a2.C0029m, p003a2.AbstractC0027l.f
        /* renamed from: b */
        public void mo64b(AbstractC0027l abstractC0027l) {
            C0044x.m201c(this.f44c, false);
        }

        @Override // p003a2.C0029m, p003a2.AbstractC0027l.f
        /* renamed from: c */
        public void mo65c(AbstractC0027l abstractC0027l) {
            C0044x.m201c(this.f44c, true);
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            if (!this.f43b) {
                C0044x.m201c(this.f44c, false);
            }
            abstractC0027l.mo134V(this);
        }

        @Override // p003a2.C0029m, p003a2.AbstractC0027l.f
        /* renamed from: e */
        public void mo67e(AbstractC0027l abstractC0027l) {
            C0044x.m201c(this.f44c, false);
            this.f43b = true;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/c$k.class
     */
    /* renamed from: a2.c$k */
    /* loaded from: combined.jar:classes1.jar:a2/c$k.class */
    public static class k {

        /* renamed from: a */
        public int f46a;

        /* renamed from: b */
        public int f47b;

        /* renamed from: c */
        public int f48c;

        /* renamed from: d */
        public int f49d;

        /* renamed from: e */
        public View f50e;

        /* renamed from: f */
        public int f51f;

        /* renamed from: g */
        public int f52g;

        public k(View view) {
            this.f50e = view;
        }

        /* renamed from: a */
        public void m68a(PointF pointF) {
            this.f48c = Math.round(pointF.x);
            this.f49d = Math.round(pointF.y);
            int i10 = this.f52g + 1;
            this.f52g = i10;
            if (this.f51f == i10) {
                m69b();
            }
        }

        /* renamed from: b */
        public final void m69b() {
            C0006a0.m35f(this.f50e, this.f46a, this.f47b, this.f48c, this.f49d);
            this.f51f = 0;
            this.f52g = 0;
        }

        /* renamed from: c */
        public void m70c(PointF pointF) {
            this.f46a = Math.round(pointF.x);
            this.f47b = Math.round(pointF.y);
            int i10 = this.f51f + 1;
            this.f51f = i10;
            if (i10 == this.f52g) {
                m69b();
            }
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: J */
    public String[] mo46J() {
        return f16N;
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: g */
    public void mo47g(C0039s c0039s) {
        m48i0(c0039s);
    }

    /* renamed from: i0 */
    public final void m48i0(C0039s c0039s) {
        View view = c0039s.f170b;
        if (!C6824g0.m31502U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c0039s.f169a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c0039s.f169a.put("android:changeBounds:parent", c0039s.f170b.getParent());
        if (this.f26M) {
            c0039s.f170b.getLocationInWindow(this.f24K);
            c0039s.f169a.put("android:changeBounds:windowX", Integer.valueOf(this.f24K[0]));
            c0039s.f169a.put("android:changeBounds:windowY", Integer.valueOf(this.f24K[1]));
        }
        if (this.f25L) {
            c0039s.f169a.put("android:changeBounds:clip", C6824g0.m31548u(view));
        }
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: j */
    public void mo49j(C0039s c0039s) {
        m48i0(c0039s);
    }

    /* renamed from: j0 */
    public final boolean m50j0(View view, View view2) {
        boolean z10 = true;
        if (this.f26M) {
            C0039s m161x = m161x(view, true);
            if (m161x == null) {
                if (view == view2) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (view2 == m161x.f170b) {
                    z10 = true;
                }
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x011c, code lost:
    
        if (r0 != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0146, code lost:
    
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a2 A[ORIG_RETURN, RETURN] */
    @Override // p003a2.AbstractC0027l
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator mo51n(android.view.ViewGroup r12, p003a2.C0039s r13, p003a2.C0039s r14) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.C0009c.mo51n(android.view.ViewGroup, a2.s, a2.s):android.animation.Animator");
    }
}
