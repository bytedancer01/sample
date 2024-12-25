package p003a2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p003a2.AbstractC0027l;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a2/n0.class
 */
/* renamed from: a2.n0 */
/* loaded from: combined.jar:classes1.jar:a2/n0.class */
public abstract class AbstractC0032n0 extends AbstractC0027l {

    /* renamed from: L */
    public static final String[] f139L = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: K */
    public int f140K = 3;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/n0$a.class
     */
    /* renamed from: a2.n0$a */
    /* loaded from: combined.jar:classes1.jar:a2/n0$a.class */
    public class a extends C0029m {

        /* renamed from: b */
        public final ViewGroup f141b;

        /* renamed from: c */
        public final View f142c;

        /* renamed from: d */
        public final View f143d;

        /* renamed from: e */
        public final AbstractC0032n0 f144e;

        public a(AbstractC0032n0 abstractC0032n0, ViewGroup viewGroup, View view, View view2) {
            this.f144e = abstractC0032n0;
            this.f141b = viewGroup;
            this.f142c = view;
            this.f143d = view2;
        }

        @Override // p003a2.C0029m, p003a2.AbstractC0027l.f
        /* renamed from: b */
        public void mo64b(AbstractC0027l abstractC0027l) {
            C0044x.m199a(this.f141b).mo197d(this.f142c);
        }

        @Override // p003a2.C0029m, p003a2.AbstractC0027l.f
        /* renamed from: c */
        public void mo65c(AbstractC0027l abstractC0027l) {
            if (this.f142c.getParent() == null) {
                C0044x.m199a(this.f141b).mo196c(this.f142c);
            } else {
                this.f144e.cancel();
            }
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            this.f143d.setTag(C0021i.f78a, null);
            C0044x.m199a(this.f141b).mo197d(this.f142c);
            abstractC0027l.mo134V(this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/n0$b.class
     */
    /* renamed from: a2.n0$b */
    /* loaded from: combined.jar:classes1.jar:a2/n0$b.class */
    public static class b extends AnimatorListenerAdapter implements AbstractC0027l.f {

        /* renamed from: b */
        public final View f145b;

        /* renamed from: c */
        public final int f146c;

        /* renamed from: d */
        public final ViewGroup f147d;

        /* renamed from: e */
        public final boolean f148e;

        /* renamed from: f */
        public boolean f149f;

        /* renamed from: g */
        public boolean f150g = false;

        public b(View view, int i10, boolean z10) {
            this.f145b = view;
            this.f146c = i10;
            this.f147d = (ViewGroup) view.getParent();
            this.f148e = z10;
            m176g(true);
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: a */
        public void mo98a(AbstractC0027l abstractC0027l) {
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: b */
        public void mo64b(AbstractC0027l abstractC0027l) {
            m176g(false);
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: c */
        public void mo65c(AbstractC0027l abstractC0027l) {
            m176g(true);
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: d */
        public void mo66d(AbstractC0027l abstractC0027l) {
            m175f();
            abstractC0027l.mo134V(this);
        }

        @Override // p003a2.AbstractC0027l.f
        /* renamed from: e */
        public void mo67e(AbstractC0027l abstractC0027l) {
        }

        /* renamed from: f */
        public final void m175f() {
            if (!this.f150g) {
                C0006a0.m37h(this.f145b, this.f146c);
                ViewGroup viewGroup = this.f147d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m176g(false);
        }

        /* renamed from: g */
        public final void m176g(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f148e || this.f149f == z10 || (viewGroup = this.f147d) == null) {
                return;
            }
            this.f149f = z10;
            C0044x.m201c(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f150g = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m175f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f150g) {
                return;
            }
            C0006a0.m37h(this.f145b, this.f146c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f150g) {
                return;
            }
            C0006a0.m37h(this.f145b, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:a2/n0$c.class
     */
    /* renamed from: a2.n0$c */
    /* loaded from: combined.jar:classes1.jar:a2/n0$c.class */
    public static class c {

        /* renamed from: a */
        public boolean f151a;

        /* renamed from: b */
        public boolean f152b;

        /* renamed from: c */
        public int f153c;

        /* renamed from: d */
        public int f154d;

        /* renamed from: e */
        public ViewGroup f155e;

        /* renamed from: f */
        public ViewGroup f156f;
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: J */
    public String[] mo46J() {
        return f139L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r0.f154d == 0) goto L22;
     */
    @Override // p003a2.AbstractC0027l
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo125L(p003a2.C0039s r5, p003a2.C0039s r6) {
        /*
            r4 = this;
            r0 = 0
            r8 = r0
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = r6
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r5
            if (r0 == 0) goto L30
            r0 = r6
            if (r0 == 0) goto L30
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f169a
            java.lang.String r1 = "android:visibility:visibility"
            boolean r0 = r0.containsKey(r1)
            r1 = r5
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f169a
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r1.containsKey(r2)
            if (r0 == r1) goto L30
            r0 = 0
            return r0
        L30:
            r0 = r4
            r1 = r5
            r2 = r6
            a2.n0$c r0 = r0.m171j0(r1, r2)
            r5 = r0
            r0 = r8
            r7 = r0
            r0 = r5
            boolean r0 = r0.f151a
            if (r0 == 0) goto L54
            r0 = r5
            int r0 = r0.f153c
            if (r0 == 0) goto L52
            r0 = r8
            r7 = r0
            r0 = r5
            int r0 = r0.f154d
            if (r0 != 0) goto L54
        L52:
            r0 = 1
            r7 = r0
        L54:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.AbstractC0032n0.mo125L(a2.s, a2.s):boolean");
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: g */
    public void mo47g(C0039s c0039s) {
        m170i0(c0039s);
    }

    /* renamed from: i0 */
    public final void m170i0(C0039s c0039s) {
        c0039s.f169a.put("android:visibility:visibility", Integer.valueOf(c0039s.f170b.getVisibility()));
        c0039s.f169a.put("android:visibility:parent", c0039s.f170b.getParent());
        int[] iArr = new int[2];
        c0039s.f170b.getLocationOnScreen(iArr);
        c0039s.f169a.put("android:visibility:screenLocation", iArr);
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: j */
    public void mo49j(C0039s c0039s) {
        m170i0(c0039s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        if (r0 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        if (r0.f155e == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0123, code lost:
    
        if (r0.f153c == 0) goto L48;
     */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p003a2.AbstractC0032n0.c m171j0(p003a2.C0039s r5, p003a2.C0039s r6) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.AbstractC0032n0.m171j0(a2.s, a2.s):a2.n0$c");
    }

    /* renamed from: k0 */
    public Animator m172k0(ViewGroup viewGroup, C0039s c0039s, int i10, C0039s c0039s2, int i11) {
        if ((this.f140K & 1) != 1 || c0039s2 == null) {
            return null;
        }
        if (c0039s == null) {
            View view = (View) c0039s2.f170b.getParent();
            if (m171j0(m161x(view, false), m124K(view, false)).f151a) {
                return null;
            }
        }
        return mo73l0(viewGroup, c0039s2.f170b, c0039s, c0039s2);
    }

    /* renamed from: l0 */
    public abstract Animator mo73l0(ViewGroup viewGroup, View view, C0039s c0039s, C0039s c0039s2);

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0109, code lost:
    
        if (r8.f117x != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m173m0(android.view.ViewGroup r9, p003a2.C0039s r10, int r11, p003a2.C0039s r12, int r13) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p003a2.AbstractC0032n0.m173m0(android.view.ViewGroup, a2.s, int, a2.s, int):android.animation.Animator");
    }

    @Override // p003a2.AbstractC0027l
    /* renamed from: n */
    public Animator mo51n(ViewGroup viewGroup, C0039s c0039s, C0039s c0039s2) {
        c m171j0 = m171j0(c0039s, c0039s2);
        if (!m171j0.f151a) {
            return null;
        }
        if (m171j0.f155e == null && m171j0.f156f == null) {
            return null;
        }
        return m171j0.f152b ? m172k0(viewGroup, c0039s, m171j0.f153c, c0039s2, m171j0.f154d) : m173m0(viewGroup, c0039s, m171j0.f153c, c0039s2, m171j0.f154d);
    }

    /* renamed from: n0 */
    public abstract Animator mo74n0(ViewGroup viewGroup, View view, C0039s c0039s, C0039s c0039s2);

    /* renamed from: o0 */
    public void m174o0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f140K = i10;
    }
}
