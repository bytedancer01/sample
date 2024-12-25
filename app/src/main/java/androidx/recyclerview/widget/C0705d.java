package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/d.class
 */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/d.class */
public class C0705d extends RecyclerView.AbstractC0684o implements RecyclerView.InterfaceC0689t {

    /* renamed from: D */
    public static final int[] f4823D = {R.attr.state_pressed};

    /* renamed from: E */
    public static final int[] f4824E = new int[0];

    /* renamed from: A */
    public int f4825A;

    /* renamed from: B */
    public final Runnable f4826B;

    /* renamed from: C */
    public final RecyclerView.AbstractC0690u f4827C;

    /* renamed from: a */
    public final int f4828a;

    /* renamed from: b */
    public final int f4829b;

    /* renamed from: c */
    public final StateListDrawable f4830c;

    /* renamed from: d */
    public final Drawable f4831d;

    /* renamed from: e */
    public final int f4832e;

    /* renamed from: f */
    public final int f4833f;

    /* renamed from: g */
    public final StateListDrawable f4834g;

    /* renamed from: h */
    public final Drawable f4835h;

    /* renamed from: i */
    public final int f4836i;

    /* renamed from: j */
    public final int f4837j;

    /* renamed from: k */
    public int f4838k;

    /* renamed from: l */
    public int f4839l;

    /* renamed from: m */
    public float f4840m;

    /* renamed from: n */
    public int f4841n;

    /* renamed from: o */
    public int f4842o;

    /* renamed from: p */
    public float f4843p;

    /* renamed from: s */
    public RecyclerView f4846s;

    /* renamed from: z */
    public final ValueAnimator f4853z;

    /* renamed from: q */
    public int f4844q = 0;

    /* renamed from: r */
    public int f4845r = 0;

    /* renamed from: t */
    public boolean f4847t = false;

    /* renamed from: u */
    public boolean f4848u = false;

    /* renamed from: v */
    public int f4849v = 0;

    /* renamed from: w */
    public int f4850w = 0;

    /* renamed from: x */
    public final int[] f4851x = new int[2];

    /* renamed from: y */
    public final int[] f4852y = new int[2];

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/d$a.class
     */
    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/d$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final C0705d f4854b;

        public a(C0705d c0705d) {
            this.f4854b = c0705d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4854b.m4504s(500);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/d$b.class
     */
    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/d$b.class */
    public class b extends RecyclerView.AbstractC0690u {

        /* renamed from: a */
        public final C0705d f4855a;

        public b(C0705d c0705d) {
            this.f4855a = c0705d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0690u
        /* renamed from: b */
        public void mo4259b(RecyclerView recyclerView, int i10, int i11) {
            this.f4855a.m4495D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/d$c.class
     */
    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/d$c.class */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: b */
        public boolean f4856b = false;

        /* renamed from: c */
        public final C0705d f4857c;

        public c(C0705d c0705d) {
            this.f4857c = c0705d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4856b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4856b) {
                this.f4856b = false;
                return;
            }
            if (((Float) this.f4857c.f4853z.getAnimatedValue()).floatValue() == 0.0f) {
                C0705d c0705d = this.f4857c;
                c0705d.f4825A = 0;
                c0705d.m4492A(0);
            } else {
                C0705d c0705d2 = this.f4857c;
                c0705d2.f4825A = 2;
                c0705d2.m4509x();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/d$d.class
     */
    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/d$d.class */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        public final C0705d f4858b;

        public d(C0705d c0705d) {
            this.f4858b = c0705d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            this.f4858b.f4830c.setAlpha(floatValue);
            this.f4858b.f4831d.setAlpha(floatValue);
            this.f4858b.m4509x();
        }
    }

    public C0705d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4853z = ofFloat;
        this.f4825A = 0;
        this.f4826B = new a(this);
        this.f4827C = new b(this);
        this.f4830c = stateListDrawable;
        this.f4831d = drawable;
        this.f4834g = stateListDrawable2;
        this.f4835h = drawable2;
        this.f4832e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4833f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4836i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4837j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4828a = i11;
        this.f4829b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c(this));
        ofFloat.addUpdateListener(new d(this));
        m4497l(recyclerView);
    }

    /* renamed from: A */
    public void m4492A(int i10) {
        int i11;
        if (i10 == 2 && this.f4849v != 2) {
            this.f4830c.setState(f4823D);
            m4498m();
        }
        if (i10 == 0) {
            m4509x();
        } else {
            m4494C();
        }
        if (this.f4849v != 2 || i10 == 2) {
            if (i10 == 1) {
                i11 = 1500;
            }
            this.f4849v = i10;
        }
        this.f4830c.setState(f4824E);
        i11 = 1200;
        m4510y(i11);
        this.f4849v = i10;
    }

    /* renamed from: B */
    public final void m4493B() {
        this.f4846s.m3935h(this);
        this.f4846s.m3943k(this);
        this.f4846s.m3945l(this.f4827C);
    }

    /* renamed from: C */
    public void m4494C() {
        int i10 = this.f4825A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f4853z.cancel();
            }
        }
        this.f4825A = 1;
        ValueAnimator valueAnimator = this.f4853z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4853z.setDuration(500L);
        this.f4853z.setStartDelay(0L);
        this.f4853z.start();
    }

    /* renamed from: D */
    public void m4495D(int i10, int i11) {
        int computeVerticalScrollRange = this.f4846s.computeVerticalScrollRange();
        int i12 = this.f4845r;
        this.f4847t = computeVerticalScrollRange - i12 > 0 && i12 >= this.f4828a;
        int computeHorizontalScrollRange = this.f4846s.computeHorizontalScrollRange();
        int i13 = this.f4844q;
        boolean z10 = computeHorizontalScrollRange - i13 > 0 && i13 >= this.f4828a;
        this.f4848u = z10;
        boolean z11 = this.f4847t;
        if (!z11 && !z10) {
            if (this.f4849v != 0) {
                m4492A(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f4839l = (int) ((f10 * (i11 + (f10 / 2.0f))) / computeVerticalScrollRange);
            this.f4838k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (this.f4848u) {
            float f11 = i13;
            this.f4842o = (int) ((f11 * (i10 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f4841n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = this.f4849v;
        if (i14 == 0 || i14 == 1) {
            m4492A(1);
        }
    }

    /* renamed from: E */
    public final void m4496E(float f10) {
        int[] m4503r = m4503r();
        float max = Math.max(m4503r[0], Math.min(m4503r[1], f10));
        if (Math.abs(this.f4839l - max) < 2.0f) {
            return;
        }
        int m4511z = m4511z(this.f4840m, max, m4503r, this.f4846s.computeVerticalScrollRange(), this.f4846s.computeVerticalScrollOffset(), this.f4845r);
        if (m4511z != 0) {
            this.f4846s.scrollBy(0, m4511z);
        }
        this.f4840m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0689t
    /* renamed from: a */
    public void mo4255a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4849v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m4508w = m4508w(motionEvent.getX(), motionEvent.getY());
            boolean m4507v = m4507v(motionEvent.getX(), motionEvent.getY());
            if (m4508w || m4507v) {
                if (m4507v) {
                    this.f4850w = 1;
                    this.f4843p = (int) motionEvent.getX();
                } else if (m4508w) {
                    this.f4850w = 2;
                    this.f4840m = (int) motionEvent.getY();
                }
                m4492A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4849v == 2) {
            this.f4840m = 0.0f;
            this.f4843p = 0.0f;
            m4492A(1);
            this.f4850w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4849v == 2) {
            m4494C();
            if (this.f4850w == 1) {
                m4505t(motionEvent.getX());
            }
            if (this.f4850w == 2) {
                m4496E(motionEvent.getY());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r0 == 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r0 != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0689t
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo4256c(androidx.recyclerview.widget.RecyclerView r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            r0 = r4
            int r0 = r0.f4849v
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L75
            r0 = r4
            r1 = r6
            float r1 = r1.getX()
            r2 = r6
            float r2 = r2.getY()
            boolean r0 = r0.m4508w(r1, r2)
            r10 = r0
            r0 = r4
            r1 = r6
            float r1 = r1.getX()
            r2 = r6
            float r2 = r2.getY()
            boolean r0 = r0.m4507v(r1, r2)
            r11 = r0
            r0 = r9
            r8 = r0
            r0 = r6
            int r0 = r0.getAction()
            if (r0 != 0) goto L81
            r0 = r10
            if (r0 != 0) goto L42
            r0 = r9
            r8 = r0
            r0 = r11
            if (r0 == 0) goto L81
        L42:
            r0 = r11
            if (r0 == 0) goto L59
            r0 = r4
            r1 = 1
            r0.f4850w = r1
            r0 = r4
            r1 = r6
            float r1 = r1.getX()
            int r1 = (int) r1
            float r1 = (float) r1
            r0.f4843p = r1
            goto L6d
        L59:
            r0 = r10
            if (r0 == 0) goto L6d
            r0 = r4
            r1 = 2
            r0.f4850w = r1
            r0 = r4
            r1 = r6
            float r1 = r1.getY()
            int r1 = (int) r1
            float r1 = (float) r1
            r0.f4840m = r1
        L6d:
            r0 = r4
            r1 = 2
            r0.m4492A(r1)
            goto L7e
        L75:
            r0 = r9
            r8 = r0
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L81
        L7e:
            r0 = 1
            r8 = r0
        L81:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0705d.mo4256c(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0689t
    /* renamed from: e */
    public void mo4257e(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0684o
    /* renamed from: k */
    public void mo4146k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0668b0 c0668b0) {
        if (this.f4844q != this.f4846s.getWidth() || this.f4845r != this.f4846s.getHeight()) {
            this.f4844q = this.f4846s.getWidth();
            this.f4845r = this.f4846s.getHeight();
            m4492A(0);
        } else if (this.f4825A != 0) {
            if (this.f4847t) {
                m4501p(canvas);
            }
            if (this.f4848u) {
                m4500o(canvas);
            }
        }
    }

    /* renamed from: l */
    public void m4497l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4846s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m4499n();
        }
        this.f4846s = recyclerView;
        if (recyclerView != null) {
            m4493B();
        }
    }

    /* renamed from: m */
    public final void m4498m() {
        this.f4846s.removeCallbacks(this.f4826B);
    }

    /* renamed from: n */
    public final void m4499n() {
        this.f4846s.m3923b1(this);
        this.f4846s.m3927d1(this);
        this.f4846s.m3929e1(this.f4827C);
        m4498m();
    }

    /* renamed from: o */
    public final void m4500o(Canvas canvas) {
        int i10 = this.f4845r;
        int i11 = this.f4836i;
        int i12 = i10 - i11;
        int i13 = this.f4842o;
        int i14 = this.f4841n;
        this.f4834g.setBounds(0, 0, i14, i11);
        this.f4835h.setBounds(0, 0, this.f4844q, this.f4837j);
        canvas.translate(0.0f, i12);
        this.f4835h.draw(canvas);
        canvas.translate(i13 - (i14 / 2), 0.0f);
        this.f4834g.draw(canvas);
        canvas.translate(-r0, -i12);
    }

    /* renamed from: p */
    public final void m4501p(Canvas canvas) {
        int i10 = this.f4844q;
        int i11 = this.f4832e;
        int i12 = i10 - i11;
        int i13 = this.f4839l;
        int i14 = this.f4838k;
        int i15 = i13 - (i14 / 2);
        this.f4830c.setBounds(0, 0, i11, i14);
        this.f4831d.setBounds(0, 0, this.f4833f, this.f4845r);
        if (m4506u()) {
            this.f4831d.draw(canvas);
            canvas.translate(this.f4832e, i15);
            canvas.scale(-1.0f, 1.0f);
            this.f4830c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i12 = this.f4832e;
        } else {
            canvas.translate(i12, 0.0f);
            this.f4831d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f4830c.draw(canvas);
        }
        canvas.translate(-i12, -i15);
    }

    /* renamed from: q */
    public final int[] m4502q() {
        int[] iArr = this.f4852y;
        int i10 = this.f4829b;
        iArr[0] = i10;
        iArr[1] = this.f4844q - i10;
        return iArr;
    }

    /* renamed from: r */
    public final int[] m4503r() {
        int[] iArr = this.f4851x;
        int i10 = this.f4829b;
        iArr[0] = i10;
        iArr[1] = this.f4845r - i10;
        return iArr;
    }

    /* renamed from: s */
    public void m4504s(int i10) {
        int i11 = this.f4825A;
        if (i11 == 1) {
            this.f4853z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.f4825A = 3;
        ValueAnimator valueAnimator = this.f4853z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4853z.setDuration(i10);
        this.f4853z.start();
    }

    /* renamed from: t */
    public final void m4505t(float f10) {
        int[] m4502q = m4502q();
        float max = Math.max(m4502q[0], Math.min(m4502q[1], f10));
        if (Math.abs(this.f4842o - max) < 2.0f) {
            return;
        }
        int m4511z = m4511z(this.f4843p, max, m4502q, this.f4846s.computeHorizontalScrollRange(), this.f4846s.computeHorizontalScrollOffset(), this.f4844q);
        if (m4511z != 0) {
            this.f4846s.scrollBy(m4511z, 0);
        }
        this.f4843p = max;
    }

    /* renamed from: u */
    public final boolean m4506u() {
        boolean z10 = true;
        if (C6824g0.m31473C(this.f4846s) != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: v */
    public boolean m4507v(float f10, float f11) {
        boolean z10;
        if (f11 >= this.f4845r - this.f4836i) {
            int i10 = this.f4842o;
            int i11 = this.f4841n;
            if (f10 >= i10 - (i11 / 2) && f10 <= i10 + (i11 / 2)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: w */
    public boolean m4508w(float f10, float f11) {
        boolean z10;
        if (!m4506u() ? f10 >= this.f4844q - this.f4832e : f10 <= this.f4832e) {
            int i10 = this.f4839l;
            int i11 = this.f4838k;
            if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    /* renamed from: x */
    public void m4509x() {
        this.f4846s.invalidate();
    }

    /* renamed from: y */
    public final void m4510y(int i10) {
        m4498m();
        this.f4846s.postDelayed(this.f4826B, i10);
    }

    /* renamed from: z */
    public final int m4511z(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        float f12 = (f11 - f10) / i13;
        int i14 = i10 - i12;
        int i15 = (int) (f12 * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }
}
