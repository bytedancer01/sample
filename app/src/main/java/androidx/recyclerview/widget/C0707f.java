package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p235o0.C6817e;
import p235o0.C6824g0;
import p315s1.C8517b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/f.class
 */
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f.class */
public class C0707f extends RecyclerView.AbstractC0684o implements RecyclerView.InterfaceC0687r {

    /* renamed from: A */
    public f f4874A;

    /* renamed from: C */
    public Rect f4876C;

    /* renamed from: D */
    public long f4877D;

    /* renamed from: d */
    public float f4881d;

    /* renamed from: e */
    public float f4882e;

    /* renamed from: f */
    public float f4883f;

    /* renamed from: g */
    public float f4884g;

    /* renamed from: h */
    public float f4885h;

    /* renamed from: i */
    public float f4886i;

    /* renamed from: j */
    public float f4887j;

    /* renamed from: k */
    public float f4888k;

    /* renamed from: m */
    public e f4890m;

    /* renamed from: o */
    public int f4892o;

    /* renamed from: q */
    public int f4894q;

    /* renamed from: r */
    public RecyclerView f4895r;

    /* renamed from: t */
    public VelocityTracker f4897t;

    /* renamed from: u */
    public List<RecyclerView.AbstractC0674e0> f4898u;

    /* renamed from: v */
    public List<Integer> f4899v;

    /* renamed from: z */
    public C6817e f4903z;

    /* renamed from: a */
    public final List<View> f4878a = new ArrayList();

    /* renamed from: b */
    public final float[] f4879b = new float[2];

    /* renamed from: c */
    public RecyclerView.AbstractC0674e0 f4880c = null;

    /* renamed from: l */
    public int f4889l = -1;

    /* renamed from: n */
    public int f4891n = 0;

    /* renamed from: p */
    public List<g> f4893p = new ArrayList();

    /* renamed from: s */
    public final Runnable f4896s = new a(this);

    /* renamed from: w */
    public RecyclerView.InterfaceC0680k f4900w = null;

    /* renamed from: x */
    public View f4901x = null;

    /* renamed from: y */
    public int f4902y = -1;

    /* renamed from: B */
    public final RecyclerView.InterfaceC0689t f4875B = new b(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$a.class
     */
    /* renamed from: androidx.recyclerview.widget.f$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C0707f f4904b;

        public a(C0707f c0707f) {
            this.f4904b = c0707f;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0707f c0707f = this.f4904b;
            if (c0707f.f4880c == null || !c0707f.m4533E()) {
                return;
            }
            C0707f c0707f2 = this.f4904b;
            RecyclerView.AbstractC0674e0 abstractC0674e0 = c0707f2.f4880c;
            if (abstractC0674e0 != null) {
                c0707f2.m4554z(abstractC0674e0);
            }
            C0707f c0707f3 = this.f4904b;
            c0707f3.f4895r.removeCallbacks(c0707f3.f4896s);
            C6824g0.m31523h0(this.f4904b.f4895r, this);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$b.class
     */
    /* renamed from: androidx.recyclerview.widget.f$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$b.class */
    public class b implements RecyclerView.InterfaceC0689t {

        /* renamed from: a */
        public final C0707f f4905a;

        public b(C0707f c0707f) {
            this.f4905a = c0707f;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0689t
        /* renamed from: a */
        public void mo4255a(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.f4905a.f4903z.m31456a(motionEvent);
            VelocityTracker velocityTracker = this.f4905a.f4897t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (this.f4905a.f4889l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(this.f4905a.f4889l);
            if (findPointerIndex >= 0) {
                this.f4905a.m4544o(actionMasked, motionEvent, findPointerIndex);
            }
            C0707f c0707f = this.f4905a;
            RecyclerView.AbstractC0674e0 abstractC0674e0 = c0707f.f4880c;
            if (abstractC0674e0 == null) {
                return;
            }
            int i10 = 0;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        c0707f.m4540L(motionEvent, c0707f.f4892o, findPointerIndex);
                        this.f4905a.m4554z(abstractC0674e0);
                        C0707f c0707f2 = this.f4905a;
                        c0707f2.f4895r.removeCallbacks(c0707f2.f4896s);
                        this.f4905a.f4896s.run();
                        this.f4905a.f4895r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    C0707f c0707f3 = this.f4905a;
                    if (pointerId == c0707f3.f4889l) {
                        if (actionIndex == 0) {
                            i10 = 1;
                        }
                        c0707f3.f4889l = motionEvent.getPointerId(i10);
                        C0707f c0707f4 = this.f4905a;
                        c0707f4.m4540L(motionEvent, c0707f4.f4892o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c0707f.f4897t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            this.f4905a.m4534F(null, 0);
            this.f4905a.f4889l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0689t
        /* renamed from: c */
        public boolean mo4256c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g m4548s;
            this.f4905a.f4903z.m31456a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = true;
            if (actionMasked == 0) {
                this.f4905a.f4889l = motionEvent.getPointerId(0);
                this.f4905a.f4881d = motionEvent.getX();
                this.f4905a.f4882e = motionEvent.getY();
                this.f4905a.m4529A();
                C0707f c0707f = this.f4905a;
                if (c0707f.f4880c == null && (m4548s = c0707f.m4548s(motionEvent)) != null) {
                    C0707f c0707f2 = this.f4905a;
                    c0707f2.f4881d -= m4548s.f4926k;
                    c0707f2.f4882e -= m4548s.f4927l;
                    c0707f2.m4547r(m4548s.f4921f, true);
                    if (this.f4905a.f4878a.remove(m4548s.f4921f.f4620a)) {
                        C0707f c0707f3 = this.f4905a;
                        c0707f3.f4890m.mo4562c(c0707f3.f4895r, m4548s.f4921f);
                    }
                    this.f4905a.m4534F(m4548s.f4921f, m4548s.f4922g);
                    C0707f c0707f4 = this.f4905a;
                    c0707f4.m4540L(motionEvent, c0707f4.f4892o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C0707f c0707f5 = this.f4905a;
                c0707f5.f4889l = -1;
                c0707f5.m4534F(null, 0);
            } else {
                int i10 = this.f4905a.f4889l;
                if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    this.f4905a.m4544o(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = this.f4905a.f4897t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (this.f4905a.f4880c == null) {
                z10 = false;
            }
            return z10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0689t
        /* renamed from: e */
        public void mo4257e(boolean z10) {
            if (z10) {
                this.f4905a.m4534F(null, 0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$c.class
     */
    /* renamed from: androidx.recyclerview.widget.f$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$c.class */
    public class c extends g {

        /* renamed from: p */
        public final int f4906p;

        /* renamed from: q */
        public final RecyclerView.AbstractC0674e0 f4907q;

        /* renamed from: r */
        public final C0707f f4908r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0707f c0707f, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.AbstractC0674e0 abstractC0674e02) {
            super(abstractC0674e0, i10, i11, f10, f11, f12, f13);
            this.f4908r = c0707f;
            this.f4906p = i12;
            this.f4907q = abstractC0674e02;
        }

        @Override // androidx.recyclerview.widget.C0707f.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f4928m) {
                return;
            }
            if (this.f4906p <= 0) {
                C0707f c0707f = this.f4908r;
                c0707f.f4890m.mo4562c(c0707f.f4895r, this.f4907q);
            } else {
                this.f4908r.f4878a.add(this.f4907q.f4620a);
                this.f4925j = true;
                int i10 = this.f4906p;
                if (i10 > 0) {
                    this.f4908r.m4530B(this, i10);
                }
            }
            C0707f c0707f2 = this.f4908r;
            View view = c0707f2.f4901x;
            View view2 = this.f4907q.f4620a;
            if (view == view2) {
                c0707f2.m4532D(view2);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$d.class
     */
    /* renamed from: androidx.recyclerview.widget.f$d */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$d.class */
    public class d implements Runnable {

        /* renamed from: b */
        public final g f4909b;

        /* renamed from: c */
        public final int f4910c;

        /* renamed from: d */
        public final C0707f f4911d;

        public d(C0707f c0707f, g gVar, int i10) {
            this.f4911d = c0707f;
            this.f4909b = gVar;
            this.f4910c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = this.f4911d.f4895r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f4909b;
            if (gVar.f4928m || gVar.f4921f.m4063m() == -1) {
                return;
            }
            RecyclerView.AbstractC0682m itemAnimator = this.f4911d.f4895r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.m4130q(null)) && !this.f4911d.m4553x()) {
                this.f4911d.f4890m.mo4559B(this.f4909b.f4921f, this.f4910c);
            } else {
                this.f4911d.f4895r.post(this);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$e.class
     */
    /* renamed from: androidx.recyclerview.widget.f$e */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$e.class */
    public static abstract class e {

        /* renamed from: b */
        public static final Interpolator f4912b = new a();

        /* renamed from: c */
        public static final Interpolator f4913c = new b();

        /* renamed from: a */
        public int f4914a = -1;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/f$e$a.class
         */
        /* renamed from: androidx.recyclerview.widget.f$e$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$e$a.class */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/f$e$b.class
         */
        /* renamed from: androidx.recyclerview.widget.f$e$b */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$e$b.class */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        /* renamed from: e */
        public static int m4555e(int i10, int i11) {
            int i12;
            int i13 = i10 & 789516;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (i13 ^ (-1));
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & 789516) << 2;
            }
            return i14 | i12;
        }

        /* renamed from: s */
        public static int m4556s(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        /* renamed from: t */
        public static int m4557t(int i10, int i11) {
            int m4556s = m4556s(0, i11 | i10);
            return m4556s(2, i10) | m4556s(1, i11) | m4556s;
        }

        /* renamed from: A */
        public void mo4558A(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
            if (abstractC0674e0 != null) {
                C0709h.f4932a.mo4590b(abstractC0674e0.f4620a);
            }
        }

        /* renamed from: B */
        public abstract void mo4559B(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10);

        /* renamed from: a */
        public boolean m4560a(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02) {
            return true;
        }

        /* renamed from: b */
        public RecyclerView.AbstractC0674e0 m4561b(RecyclerView.AbstractC0674e0 abstractC0674e0, List<RecyclerView.AbstractC0674e0> list, int i10, int i11) {
            int width = abstractC0674e0.f4620a.getWidth();
            int height = abstractC0674e0.f4620a.getHeight();
            int left = i10 - abstractC0674e0.f4620a.getLeft();
            int top = i11 - abstractC0674e0.f4620a.getTop();
            int size = list.size();
            RecyclerView.AbstractC0674e0 abstractC0674e02 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.AbstractC0674e0 abstractC0674e03 = list.get(i13);
                RecyclerView.AbstractC0674e0 abstractC0674e04 = abstractC0674e02;
                int i14 = i12;
                if (left > 0) {
                    int right = abstractC0674e03.f4620a.getRight() - (i10 + width);
                    abstractC0674e04 = abstractC0674e02;
                    i14 = i12;
                    if (right < 0) {
                        abstractC0674e04 = abstractC0674e02;
                        i14 = i12;
                        if (abstractC0674e03.f4620a.getRight() > abstractC0674e0.f4620a.getRight()) {
                            int abs = Math.abs(right);
                            abstractC0674e04 = abstractC0674e02;
                            i14 = i12;
                            if (abs > i12) {
                                abstractC0674e04 = abstractC0674e03;
                                i14 = abs;
                            }
                        }
                    }
                }
                RecyclerView.AbstractC0674e0 abstractC0674e05 = abstractC0674e04;
                int i15 = i14;
                if (left < 0) {
                    int left2 = abstractC0674e03.f4620a.getLeft() - i10;
                    abstractC0674e05 = abstractC0674e04;
                    i15 = i14;
                    if (left2 > 0) {
                        abstractC0674e05 = abstractC0674e04;
                        i15 = i14;
                        if (abstractC0674e03.f4620a.getLeft() < abstractC0674e0.f4620a.getLeft()) {
                            int abs2 = Math.abs(left2);
                            abstractC0674e05 = abstractC0674e04;
                            i15 = i14;
                            if (abs2 > i14) {
                                abstractC0674e05 = abstractC0674e03;
                                i15 = abs2;
                            }
                        }
                    }
                }
                RecyclerView.AbstractC0674e0 abstractC0674e06 = abstractC0674e05;
                int i16 = i15;
                if (top < 0) {
                    int top2 = abstractC0674e03.f4620a.getTop() - i11;
                    abstractC0674e06 = abstractC0674e05;
                    i16 = i15;
                    if (top2 > 0) {
                        abstractC0674e06 = abstractC0674e05;
                        i16 = i15;
                        if (abstractC0674e03.f4620a.getTop() < abstractC0674e0.f4620a.getTop()) {
                            int abs3 = Math.abs(top2);
                            abstractC0674e06 = abstractC0674e05;
                            i16 = i15;
                            if (abs3 > i15) {
                                abstractC0674e06 = abstractC0674e03;
                                i16 = abs3;
                            }
                        }
                    }
                }
                abstractC0674e02 = abstractC0674e06;
                i12 = i16;
                if (top > 0) {
                    int bottom = abstractC0674e03.f4620a.getBottom() - (i11 + height);
                    abstractC0674e02 = abstractC0674e06;
                    i12 = i16;
                    if (bottom < 0) {
                        abstractC0674e02 = abstractC0674e06;
                        i12 = i16;
                        if (abstractC0674e03.f4620a.getBottom() > abstractC0674e0.f4620a.getBottom()) {
                            int abs4 = Math.abs(bottom);
                            abstractC0674e02 = abstractC0674e06;
                            i12 = i16;
                            if (abs4 > i16) {
                                i12 = abs4;
                                abstractC0674e02 = abstractC0674e03;
                            }
                        }
                    }
                }
            }
            return abstractC0674e02;
        }

        /* renamed from: c */
        public void mo4562c(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0) {
            C0709h.f4932a.mo4589a(abstractC0674e0.f4620a);
        }

        /* renamed from: d */
        public int m4563d(int i10, int i11) {
            int i12;
            int i13;
            int i14 = i10 & 3158064;
            if (i14 == 0) {
                return i10;
            }
            int i15 = i10 & (i14 ^ (-1));
            if (i11 == 0) {
                i13 = i14 >> 2;
                i12 = i15;
            } else {
                int i16 = i14 >> 1;
                i12 = i15 | ((-3158065) & i16);
                i13 = (i16 & 3158064) >> 2;
            }
            return i12 | i13;
        }

        /* renamed from: f */
        public final int m4564f(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0) {
            return m4563d(mo4569k(recyclerView, abstractC0674e0), C6824g0.m31473C(recyclerView));
        }

        /* renamed from: g */
        public long m4565g(RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.AbstractC0682m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i10 == 8 ? 200L : 250L;
            }
            return i10 == 8 ? itemAnimator.m4127n() : itemAnimator.m4128o();
        }

        /* renamed from: h */
        public int m4566h() {
            return 0;
        }

        /* renamed from: i */
        public final int m4567i(RecyclerView recyclerView) {
            if (this.f4914a == -1) {
                this.f4914a = recyclerView.getResources().getDimensionPixelSize(C8517b.f39875d);
            }
            return this.f4914a;
        }

        /* renamed from: j */
        public float m4568j(RecyclerView.AbstractC0674e0 abstractC0674e0) {
            return 0.5f;
        }

        /* renamed from: k */
        public abstract int mo4569k(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0);

        /* renamed from: l */
        public float m4570l(float f10) {
            return f10;
        }

        /* renamed from: m */
        public float m4571m(RecyclerView.AbstractC0674e0 abstractC0674e0) {
            return 0.5f;
        }

        /* renamed from: n */
        public float m4572n(float f10) {
            return f10;
        }

        /* renamed from: o */
        public boolean m4573o(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0) {
            return (m4564f(recyclerView, abstractC0674e0) & 16711680) != 0;
        }

        /* renamed from: p */
        public int m4574p(RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            float f10 = 1.0f;
            int signum = (int) (((int) Math.signum(i11)) * m4567i(recyclerView) * f4913c.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)));
            if (j10 <= 2000) {
                f10 = j10 / 2000.0f;
            }
            int interpolation = (int) (signum * f4912b.getInterpolation(f10));
            int i13 = interpolation;
            if (interpolation == 0) {
                i13 = i11 > 0 ? 1 : -1;
            }
            return i13;
        }

        /* renamed from: q */
        public abstract boolean mo4575q();

        /* renamed from: r */
        public abstract boolean mo4576r();

        /* renamed from: u */
        public void mo4577u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, float f10, float f11, int i10, boolean z10) {
            C0709h.f4932a.mo4591c(canvas, recyclerView, abstractC0674e0.f4620a, f10, f11, i10, z10);
        }

        /* renamed from: v */
        public void m4578v(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, float f10, float f11, int i10, boolean z10) {
            C0709h.f4932a.mo4592d(canvas, recyclerView, abstractC0674e0.f4620a, f10, f11, i10, z10);
        }

        /* renamed from: w */
        public void m4579w(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                gVar.m4588e();
                int save = canvas.save();
                mo4577u(canvas, recyclerView, gVar.f4921f, gVar.f4926k, gVar.f4927l, gVar.f4922g, false);
                canvas.restoreToCount(save);
            }
            if (abstractC0674e0 != null) {
                int save2 = canvas.save();
                mo4577u(canvas, recyclerView, abstractC0674e0, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: x */
        public void m4580x(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, List<g> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = list.get(i11);
                int save = canvas.save();
                m4578v(canvas, recyclerView, gVar.f4921f, gVar.f4926k, gVar.f4927l, gVar.f4922g, false);
                canvas.restoreToCount(save);
            }
            if (abstractC0674e0 != null) {
                int save2 = canvas.save();
                m4578v(canvas, recyclerView, abstractC0674e0, f10, f11, i10, true);
                canvas.restoreToCount(save2);
            }
            boolean z10 = false;
            for (int i12 = size - 1; i12 >= 0; i12--) {
                g gVar2 = list.get(i12);
                boolean z11 = gVar2.f4929n;
                if (z11 && !gVar2.f4925j) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: y */
        public abstract boolean mo4581y(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0674e0 abstractC0674e02);

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: z */
        public void m4582z(RecyclerView recyclerView, RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, RecyclerView.AbstractC0674e0 abstractC0674e02, int i11, int i12, int i13) {
            RecyclerView.AbstractC0685p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).mo3825i(abstractC0674e0.f4620a, abstractC0674e02.f4620a, i12, i13);
                return;
            }
            if (layoutManager.mo2731H()) {
                if (layoutManager.mo2830o0(abstractC0674e02.f4620a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo2557n1(i11);
                }
                if (layoutManager.mo2843r0(abstractC0674e02.f4620a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo2557n1(i11);
                }
            }
            if (layoutManager.mo2736I()) {
                if (layoutManager.mo2848s0(abstractC0674e02.f4620a) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo2557n1(i11);
                }
                if (layoutManager.mo2820m0(abstractC0674e02.f4620a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo2557n1(i11);
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$f.class
     */
    /* renamed from: androidx.recyclerview.widget.f$f */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$f.class */
    public class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        public boolean f4915b = true;

        /* renamed from: c */
        public final C0707f f4916c;

        public f(C0707f c0707f) {
            this.f4916c = c0707f;
        }

        /* renamed from: a */
        public void m4583a() {
            this.f4915b = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m4549t;
            RecyclerView.AbstractC0674e0 m3939i0;
            if (!this.f4915b || (m4549t = this.f4916c.m4549t(motionEvent)) == null || (m3939i0 = this.f4916c.f4895r.m3939i0(m4549t)) == null) {
                return;
            }
            C0707f c0707f = this.f4916c;
            if (c0707f.f4890m.m4573o(c0707f.f4895r, m3939i0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = this.f4916c.f4889l;
                if (pointerId == i10) {
                    int findPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    C0707f c0707f2 = this.f4916c;
                    c0707f2.f4881d = x10;
                    c0707f2.f4882e = y10;
                    c0707f2.f4886i = 0.0f;
                    c0707f2.f4885h = 0.0f;
                    if (c0707f2.f4890m.mo4576r()) {
                        this.f4916c.m4534F(m3939i0, 2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$g.class
     */
    /* renamed from: androidx.recyclerview.widget.f$g */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$g.class */
    public static class g implements Animator.AnimatorListener {

        /* renamed from: b */
        public final float f4917b;

        /* renamed from: c */
        public final float f4918c;

        /* renamed from: d */
        public final float f4919d;

        /* renamed from: e */
        public final float f4920e;

        /* renamed from: f */
        public final RecyclerView.AbstractC0674e0 f4921f;

        /* renamed from: g */
        public final int f4922g;

        /* renamed from: h */
        public final ValueAnimator f4923h;

        /* renamed from: i */
        public final int f4924i;

        /* renamed from: j */
        public boolean f4925j;

        /* renamed from: k */
        public float f4926k;

        /* renamed from: l */
        public float f4927l;

        /* renamed from: m */
        public boolean f4928m = false;

        /* renamed from: n */
        public boolean f4929n = false;

        /* renamed from: o */
        public float f4930o;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/f$g$a.class
         */
        /* renamed from: androidx.recyclerview.widget.f$g$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$g$a.class */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: b */
            public final g f4931b;

            public a(g gVar) {
                this.f4931b = gVar;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f4931b.m4586c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f4922g = i11;
            this.f4924i = i10;
            this.f4921f = abstractC0674e0;
            this.f4917b = f10;
            this.f4918c = f11;
            this.f4919d = f12;
            this.f4920e = f13;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4923h = ofFloat;
            ofFloat.addUpdateListener(new a(this));
            ofFloat.setTarget(abstractC0674e0.f4620a);
            ofFloat.addListener(this);
            m4586c(0.0f);
        }

        /* renamed from: a */
        public void m4584a() {
            this.f4923h.cancel();
        }

        /* renamed from: b */
        public void m4585b(long j10) {
            this.f4923h.setDuration(j10);
        }

        /* renamed from: c */
        public void m4586c(float f10) {
            this.f4930o = f10;
        }

        /* renamed from: d */
        public void m4587d() {
            this.f4921f.m4048L(false);
            this.f4923h.start();
        }

        /* renamed from: e */
        public void m4588e() {
            float f10 = this.f4917b;
            float f11 = this.f4919d;
            this.f4926k = f10 == f11 ? this.f4921f.f4620a.getTranslationX() : f10 + (this.f4930o * (f11 - f10));
            float f12 = this.f4918c;
            float f13 = this.f4920e;
            this.f4927l = f12 == f13 ? this.f4921f.f4620a.getTranslationY() : f12 + (this.f4930o * (f13 - f12));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m4586c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4929n) {
                this.f4921f.m4048L(true);
            }
            this.f4929n = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/f$h.class
     */
    /* renamed from: androidx.recyclerview.widget.f$h */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/f$h.class */
    public interface h {
        /* renamed from: i */
        void mo3825i(View view, View view2, int i10, int i11);
    }

    public C0707f(e eVar) {
        this.f4890m = eVar;
    }

    /* renamed from: y */
    public static boolean m4528y(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    /* renamed from: A */
    public void m4529A() {
        VelocityTracker velocityTracker = this.f4897t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f4897t = VelocityTracker.obtain();
    }

    /* renamed from: B */
    public void m4530B(g gVar, int i10) {
        this.f4895r.post(new d(this, gVar, i10));
    }

    /* renamed from: C */
    public final void m4531C() {
        VelocityTracker velocityTracker = this.f4897t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4897t = null;
        }
    }

    /* renamed from: D */
    public void m4532D(View view) {
        if (view == this.f4901x) {
            this.f4901x = null;
            if (this.f4900w != null) {
                this.f4895r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x012d, code lost:
    
        if (r11 > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
    
        if (r10 > 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m4533E() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0707f.m4533E():boolean");
    }

    /* renamed from: F */
    public void m4534F(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        boolean z10;
        float signum;
        float f10;
        if (abstractC0674e0 == this.f4880c && i10 == this.f4891n) {
            return;
        }
        this.f4877D = Long.MIN_VALUE;
        int i11 = this.f4891n;
        m4547r(abstractC0674e0, true);
        this.f4891n = i10;
        if (i10 == 2) {
            if (abstractC0674e0 == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f4901x = abstractC0674e0.f4620a;
            m4541l();
        }
        RecyclerView.AbstractC0674e0 abstractC0674e02 = this.f4880c;
        if (abstractC0674e02 != null) {
            if (abstractC0674e02.f4620a.getParent() != null) {
                int m4539K = i11 == 2 ? 0 : m4539K(abstractC0674e02);
                m4531C();
                if (m4539K == 1 || m4539K == 2) {
                    signum = Math.signum(this.f4886i) * this.f4895r.getHeight();
                    f10 = 0.0f;
                } else {
                    f10 = (m4539K == 4 || m4539K == 8 || m4539K == 16 || m4539K == 32) ? Math.signum(this.f4885h) * this.f4895r.getWidth() : 0.0f;
                    signum = 0.0f;
                }
                int i12 = i11 == 2 ? 8 : m4539K > 0 ? 2 : 4;
                m4552w(this.f4879b);
                float[] fArr = this.f4879b;
                float f11 = fArr[0];
                float f12 = fArr[1];
                c cVar = new c(this, abstractC0674e02, i12, i11, f11, f12, f10, signum, m4539K, abstractC0674e02);
                cVar.m4585b(this.f4890m.m4565g(this.f4895r, i12, f10 - f11, signum - f12));
                this.f4893p.add(cVar);
                cVar.m4587d();
                z10 = true;
            } else {
                m4532D(abstractC0674e02.f4620a);
                this.f4890m.mo4562c(this.f4895r, abstractC0674e02);
                z10 = false;
            }
            this.f4880c = null;
        } else {
            z10 = false;
        }
        if (abstractC0674e0 != null) {
            this.f4892o = (this.f4890m.m4564f(this.f4895r, abstractC0674e0) & ((1 << ((i10 * 8) + 8)) - 1)) >> (this.f4891n * 8);
            this.f4887j = abstractC0674e0.f4620a.getLeft();
            this.f4888k = abstractC0674e0.f4620a.getTop();
            this.f4880c = abstractC0674e0;
            if (i10 == 2) {
                abstractC0674e0.f4620a.performHapticFeedback(0);
            }
        }
        ViewParent parent = this.f4895r.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f4880c != null);
        }
        if (!z10) {
            this.f4895r.getLayoutManager().m4186R1();
        }
        this.f4890m.mo4558A(this.f4880c, this.f4891n);
        this.f4895r.invalidate();
    }

    /* renamed from: G */
    public final void m4535G() {
        this.f4894q = ViewConfiguration.get(this.f4895r.getContext()).getScaledTouchSlop();
        this.f4895r.m3935h(this);
        this.f4895r.m3943k(this.f4875B);
        this.f4895r.m3941j(this);
        m4537I();
    }

    /* renamed from: H */
    public void m4536H(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        if (!this.f4890m.m4573o(this.f4895r, abstractC0674e0)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (abstractC0674e0.f4620a.getParent() != this.f4895r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        m4529A();
        this.f4886i = 0.0f;
        this.f4885h = 0.0f;
        m4534F(abstractC0674e0, 2);
    }

    /* renamed from: I */
    public final void m4537I() {
        this.f4874A = new f(this);
        this.f4903z = new C6817e(this.f4895r.getContext(), this.f4874A);
    }

    /* renamed from: J */
    public final void m4538J() {
        f fVar = this.f4874A;
        if (fVar != null) {
            fVar.m4583a();
            this.f4874A = null;
        }
        if (this.f4903z != null) {
            this.f4903z = null;
        }
    }

    /* renamed from: K */
    public final int m4539K(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        if (this.f4891n == 2) {
            return 0;
        }
        int mo4569k = this.f4890m.mo4569k(this.f4895r, abstractC0674e0);
        int m4563d = (this.f4890m.m4563d(mo4569k, C6824g0.m31473C(this.f4895r)) & 65280) >> 8;
        if (m4563d == 0) {
            return 0;
        }
        int i10 = (mo4569k & 65280) >> 8;
        if (Math.abs(this.f4885h) > Math.abs(this.f4886i)) {
            int m4543n = m4543n(abstractC0674e0, m4563d);
            if (m4543n > 0) {
                return (i10 & m4543n) == 0 ? e.m4555e(m4543n, C6824g0.m31473C(this.f4895r)) : m4543n;
            }
            int m4545p = m4545p(abstractC0674e0, m4563d);
            if (m4545p > 0) {
                return m4545p;
            }
            return 0;
        }
        int m4545p2 = m4545p(abstractC0674e0, m4563d);
        if (m4545p2 > 0) {
            return m4545p2;
        }
        int m4543n2 = m4543n(abstractC0674e0, m4563d);
        if (m4543n2 <= 0) {
            return 0;
        }
        int i11 = m4543n2;
        if ((i10 & m4543n2) == 0) {
            i11 = e.m4555e(m4543n2, C6824g0.m31473C(this.f4895r));
        }
        return i11;
    }

    /* renamed from: L */
    public void m4540L(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f4881d;
        this.f4885h = f10;
        this.f4886i = y10 - this.f4882e;
        if ((i10 & 4) == 0) {
            this.f4885h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f4885h = Math.min(0.0f, this.f4885h);
        }
        if ((i10 & 1) == 0) {
            this.f4886i = Math.max(0.0f, this.f4886i);
        }
        if ((i10 & 2) == 0) {
            this.f4886i = Math.min(0.0f, this.f4886i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0687r
    /* renamed from: b */
    public void mo4252b(View view) {
        m4532D(view);
        RecyclerView.AbstractC0674e0 m3939i0 = this.f4895r.m3939i0(view);
        if (m3939i0 == null) {
            return;
        }
        RecyclerView.AbstractC0674e0 abstractC0674e0 = this.f4880c;
        if (abstractC0674e0 != null && m3939i0 == abstractC0674e0) {
            m4534F(null, 0);
            return;
        }
        m4547r(m3939i0, false);
        if (this.f4878a.remove(m3939i0.f4620a)) {
            this.f4890m.mo4562c(this.f4895r, m3939i0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0687r
    /* renamed from: d */
    public void mo4253d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0684o
    /* renamed from: g */
    public void mo4142g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0684o
    /* renamed from: i */
    public void mo4144i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0) {
        float f10;
        float f11;
        this.f4902y = -1;
        if (this.f4880c != null) {
            m4552w(this.f4879b);
            float[] fArr = this.f4879b;
            f10 = fArr[0];
            f11 = fArr[1];
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f4890m.m4579w(canvas, recyclerView, this.f4880c, this.f4893p, this.f4891n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0684o
    /* renamed from: k */
    public void mo4146k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0) {
        float f10;
        float f11;
        if (this.f4880c != null) {
            m4552w(this.f4879b);
            float[] fArr = this.f4879b;
            f10 = fArr[0];
            f11 = fArr[1];
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f4890m.m4580x(canvas, recyclerView, this.f4880c, this.f4893p, this.f4891n, f10, f11);
    }

    /* renamed from: l */
    public final void m4541l() {
    }

    /* renamed from: m */
    public void m4542m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4895r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m4546q();
        }
        this.f4895r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f4883f = resources.getDimension(C8517b.f39877f);
            this.f4884g = resources.getDimension(C8517b.f39876e);
            m4535G();
        }
    }

    /* renamed from: n */
    public final int m4543n(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = 8;
        int i12 = this.f4885h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f4897t;
        if (velocityTracker != null && this.f4889l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f4890m.m4572n(this.f4884g));
            float xVelocity = this.f4897t.getXVelocity(this.f4889l);
            float yVelocity = this.f4897t.getYVelocity(this.f4889l);
            if (xVelocity <= 0.0f) {
                i11 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i11 & i10) != 0 && i12 == i11 && abs >= this.f4890m.m4570l(this.f4883f) && abs > Math.abs(yVelocity)) {
                return i11;
            }
        }
        float width = this.f4895r.getWidth();
        float m4571m = this.f4890m.m4571m(abstractC0674e0);
        if ((i10 & i12) == 0 || Math.abs(this.f4885h) <= width * m4571m) {
            return 0;
        }
        return i12;
    }

    /* renamed from: o */
    public void m4544o(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.AbstractC0674e0 m4551v;
        int m4564f;
        if (this.f4880c != null || i10 != 2 || this.f4891n == 2 || !this.f4890m.mo4575q() || this.f4895r.getScrollState() == 1 || (m4551v = m4551v(motionEvent)) == null || (m4564f = (this.f4890m.m4564f(this.f4895r, m4551v) & 65280) >> 8) == 0) {
            return;
        }
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f4881d;
        float f11 = y10 - this.f4882e;
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        int i12 = this.f4894q;
        if (abs >= i12 || abs2 >= i12) {
            if (abs > abs2) {
                if (f10 < 0.0f && (m4564f & 4) == 0) {
                    return;
                }
                if (f10 > 0.0f && (m4564f & 8) == 0) {
                    return;
                }
            } else {
                if (f11 < 0.0f && (m4564f & 1) == 0) {
                    return;
                }
                if (f11 > 0.0f && (m4564f & 2) == 0) {
                    return;
                }
            }
            this.f4886i = 0.0f;
            this.f4885h = 0.0f;
            this.f4889l = motionEvent.getPointerId(0);
            m4534F(m4551v, 1);
        }
    }

    /* renamed from: p */
    public final int m4545p(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = 2;
        int i12 = this.f4886i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f4897t;
        if (velocityTracker != null && this.f4889l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f4890m.m4572n(this.f4884g));
            float xVelocity = this.f4897t.getXVelocity(this.f4889l);
            float yVelocity = this.f4897t.getYVelocity(this.f4889l);
            if (yVelocity <= 0.0f) {
                i11 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i11 & i10) != 0 && i11 == i12 && abs >= this.f4890m.m4570l(this.f4883f) && abs > Math.abs(xVelocity)) {
                return i11;
            }
        }
        float height = this.f4895r.getHeight();
        float m4571m = this.f4890m.m4571m(abstractC0674e0);
        if ((i10 & i12) == 0 || Math.abs(this.f4886i) <= height * m4571m) {
            return 0;
        }
        return i12;
    }

    /* renamed from: q */
    public final void m4546q() {
        this.f4895r.m3923b1(this);
        this.f4895r.m3927d1(this.f4875B);
        this.f4895r.m3925c1(this);
        for (int size = this.f4893p.size() - 1; size >= 0; size--) {
            g gVar = this.f4893p.get(0);
            gVar.m4584a();
            this.f4890m.mo4562c(this.f4895r, gVar.f4921f);
        }
        this.f4893p.clear();
        this.f4901x = null;
        this.f4902y = -1;
        m4531C();
        m4538J();
    }

    /* renamed from: r */
    public void m4547r(RecyclerView.AbstractC0674e0 abstractC0674e0, boolean z10) {
        for (int size = this.f4893p.size() - 1; size >= 0; size--) {
            g gVar = this.f4893p.get(size);
            if (gVar.f4921f == abstractC0674e0) {
                gVar.f4928m |= z10;
                if (!gVar.f4929n) {
                    gVar.m4584a();
                }
                this.f4893p.remove(size);
                return;
            }
        }
    }

    /* renamed from: s */
    public g m4548s(MotionEvent motionEvent) {
        if (this.f4893p.isEmpty()) {
            return null;
        }
        View m4549t = m4549t(motionEvent);
        for (int size = this.f4893p.size() - 1; size >= 0; size--) {
            g gVar = this.f4893p.get(size);
            if (gVar.f4921f.f4620a == m4549t) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    public View m4549t(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.AbstractC0674e0 abstractC0674e0 = this.f4880c;
        if (abstractC0674e0 != null) {
            View view = abstractC0674e0.f4620a;
            if (m4528y(view, x10, y10, this.f4887j + this.f4885h, this.f4888k + this.f4886i)) {
                return view;
            }
        }
        for (int size = this.f4893p.size() - 1; size >= 0; size--) {
            g gVar = this.f4893p.get(size);
            View view2 = gVar.f4921f.f4620a;
            if (m4528y(view2, x10, y10, gVar.f4926k, gVar.f4927l)) {
                return view2;
            }
        }
        return this.f4895r.m3904S(x10, y10);
    }

    /* renamed from: u */
    public final List<RecyclerView.AbstractC0674e0> m4550u(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        List<RecyclerView.AbstractC0674e0> list = this.f4898u;
        if (list == null) {
            this.f4898u = new ArrayList();
            this.f4899v = new ArrayList();
        } else {
            list.clear();
            this.f4899v.clear();
        }
        int m4566h = this.f4890m.m4566h();
        int round = Math.round(this.f4887j + this.f4885h) - m4566h;
        int round2 = Math.round(this.f4888k + this.f4886i) - m4566h;
        int i10 = m4566h * 2;
        int width = abstractC0674e0.f4620a.getWidth() + round + i10;
        int height = abstractC0674e0.f4620a.getHeight() + round2 + i10;
        int i11 = (round + width) / 2;
        int i12 = (round2 + height) / 2;
        RecyclerView.AbstractC0685p layoutManager = this.f4895r.getLayoutManager();
        int m4217h0 = layoutManager.m4217h0();
        for (int i13 = 0; i13 < m4217h0; i13++) {
            View m4216g0 = layoutManager.m4216g0(i13);
            if (m4216g0 != abstractC0674e0.f4620a && m4216g0.getBottom() >= round2 && m4216g0.getTop() <= height && m4216g0.getRight() >= round && m4216g0.getLeft() <= width) {
                RecyclerView.AbstractC0674e0 m3939i0 = this.f4895r.m3939i0(m4216g0);
                if (this.f4890m.m4560a(this.f4895r, this.f4880c, m3939i0)) {
                    int abs = Math.abs(i11 - ((m4216g0.getLeft() + m4216g0.getRight()) / 2));
                    int abs2 = Math.abs(i12 - ((m4216g0.getTop() + m4216g0.getBottom()) / 2));
                    int i14 = (abs * abs) + (abs2 * abs2);
                    int size = this.f4898u.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.f4899v.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.f4898u.add(i15, m3939i0);
                    this.f4899v.add(i15, Integer.valueOf(i14));
                }
            }
        }
        return this.f4898u;
    }

    /* renamed from: v */
    public final RecyclerView.AbstractC0674e0 m4551v(MotionEvent motionEvent) {
        View m4549t;
        RecyclerView.AbstractC0685p layoutManager = this.f4895r.getLayoutManager();
        int i10 = this.f4889l;
        if (i10 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(findPointerIndex);
        float f10 = this.f4881d;
        float y10 = motionEvent.getY(findPointerIndex);
        float f11 = this.f4882e;
        float abs = Math.abs(x10 - f10);
        float abs2 = Math.abs(y10 - f11);
        int i11 = this.f4894q;
        if (abs < i11 && abs2 < i11) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo2731H()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo2736I()) && (m4549t = m4549t(motionEvent)) != null) {
            return this.f4895r.m3939i0(m4549t);
        }
        return null;
    }

    /* renamed from: w */
    public final void m4552w(float[] fArr) {
        if ((this.f4892o & 12) != 0) {
            fArr[0] = (this.f4887j + this.f4885h) - this.f4880c.f4620a.getLeft();
        } else {
            fArr[0] = this.f4880c.f4620a.getTranslationX();
        }
        if ((this.f4892o & 3) != 0) {
            fArr[1] = (this.f4888k + this.f4886i) - this.f4880c.f4620a.getTop();
        } else {
            fArr[1] = this.f4880c.f4620a.getTranslationY();
        }
    }

    /* renamed from: x */
    public boolean m4553x() {
        int size = this.f4893p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f4893p.get(i10).f4929n) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void m4554z(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        if (!this.f4895r.isLayoutRequested() && this.f4891n == 2) {
            float m4568j = this.f4890m.m4568j(abstractC0674e0);
            int i10 = (int) (this.f4887j + this.f4885h);
            int i11 = (int) (this.f4888k + this.f4886i);
            if (Math.abs(i11 - abstractC0674e0.f4620a.getTop()) >= abstractC0674e0.f4620a.getHeight() * m4568j || Math.abs(i10 - abstractC0674e0.f4620a.getLeft()) >= abstractC0674e0.f4620a.getWidth() * m4568j) {
                List<RecyclerView.AbstractC0674e0> m4550u = m4550u(abstractC0674e0);
                if (m4550u.size() == 0) {
                    return;
                }
                RecyclerView.AbstractC0674e0 m4561b = this.f4890m.m4561b(abstractC0674e0, m4550u, i10, i11);
                if (m4561b == null) {
                    this.f4898u.clear();
                    this.f4899v.clear();
                    return;
                }
                int m4063m = m4561b.m4063m();
                int m4063m2 = abstractC0674e0.m4063m();
                if (this.f4890m.mo4581y(this.f4895r, abstractC0674e0, m4561b)) {
                    this.f4890m.m4582z(this.f4895r, abstractC0674e0, m4063m2, m4561b, m4063m, i10, i11);
                }
            }
        }
    }
}
