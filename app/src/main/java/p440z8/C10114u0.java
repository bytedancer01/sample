package p440z8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.exoplayer2.p048ui.C2396b;
import com.google.android.exoplayer2.p048ui.C2399e;
import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:z8/u0.class
 */
/* renamed from: z8.u0 */
/* loaded from: combined.jar:classes2.jar:z8/u0.class */
public final class C10114u0 {

    /* renamed from: A */
    public boolean f46398A;

    /* renamed from: B */
    public boolean f46399B;

    /* renamed from: a */
    public final C2399e f46401a;

    /* renamed from: b */
    public final View f46402b;

    /* renamed from: c */
    public final ViewGroup f46403c;

    /* renamed from: d */
    public final ViewGroup f46404d;

    /* renamed from: e */
    public final ViewGroup f46405e;

    /* renamed from: f */
    public final ViewGroup f46406f;

    /* renamed from: g */
    public final ViewGroup f46407g;

    /* renamed from: h */
    public final ViewGroup f46408h;

    /* renamed from: i */
    public final ViewGroup f46409i;

    /* renamed from: j */
    public final View f46410j;

    /* renamed from: k */
    public final View f46411k;

    /* renamed from: l */
    public final AnimatorSet f46412l;

    /* renamed from: m */
    public final AnimatorSet f46413m;

    /* renamed from: n */
    public final AnimatorSet f46414n;

    /* renamed from: o */
    public final AnimatorSet f46415o;

    /* renamed from: p */
    public final AnimatorSet f46416p;

    /* renamed from: q */
    public final ValueAnimator f46417q;

    /* renamed from: r */
    public final ValueAnimator f46418r;

    /* renamed from: s */
    public final Runnable f46419s = new Runnable(this) { // from class: z8.h0

        /* renamed from: b */
        public final C10114u0 f46262b;

        {
            this.f46262b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46262b.m42469c0();
        }
    };

    /* renamed from: t */
    public final Runnable f46420t = new Runnable(this) { // from class: z8.n0

        /* renamed from: b */
        public final C10114u0 f46277b;

        {
            this.f46277b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46277b.m42449D();
        }
    };

    /* renamed from: u */
    public final Runnable f46421u = new Runnable(this) { // from class: z8.o0

        /* renamed from: b */
        public final C10114u0 f46297b;

        {
            this.f46297b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46297b.m42453H();
        }
    };

    /* renamed from: v */
    public final Runnable f46422v = new Runnable(this) { // from class: z8.p0

        /* renamed from: b */
        public final C10114u0 f46299b;

        {
            this.f46299b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46299b.m42452G();
        }
    };

    /* renamed from: w */
    public final Runnable f46423w = new Runnable(this) { // from class: z8.q0

        /* renamed from: b */
        public final C10114u0 f46348b;

        {
            this.f46348b = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46348b.m42450E();
        }
    };

    /* renamed from: x */
    public final View.OnLayoutChangeListener f46424x = new View.OnLayoutChangeListener(this) { // from class: z8.r0

        /* renamed from: b */
        public final C10114u0 f46351b;

        {
            this.f46351b = this;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f46351b.m42458R(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };

    /* renamed from: C */
    public boolean f46400C = true;

    /* renamed from: z */
    public int f46426z = 0;

    /* renamed from: y */
    public final List<View> f46425y = new ArrayList();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$a.class
     */
    /* renamed from: z8.u0$a */
    /* loaded from: combined.jar:classes2.jar:z8/u0$a.class */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C10114u0 f46427b;

        public a(C10114u0 c10114u0) {
            this.f46427b = c10114u0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f46427b.f46402b != null) {
                this.f46427b.f46402b.setVisibility(4);
            }
            if (this.f46427b.f46403c != null) {
                this.f46427b.f46403c.setVisibility(4);
            }
            if (this.f46427b.f46405e != null) {
                this.f46427b.f46405e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(this.f46427b.f46410j instanceof C2396b) || this.f46427b.f46398A) {
                return;
            }
            ((C2396b) this.f46427b.f46410j).m12624h(250L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$b.class
     */
    /* renamed from: z8.u0$b */
    /* loaded from: combined.jar:classes2.jar:z8/u0$b.class */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C10114u0 f46428b;

        public b(C10114u0 c10114u0) {
            this.f46428b = c10114u0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i10 = 0;
            if (this.f46428b.f46402b != null) {
                this.f46428b.f46402b.setVisibility(0);
            }
            if (this.f46428b.f46403c != null) {
                this.f46428b.f46403c.setVisibility(0);
            }
            if (this.f46428b.f46405e != null) {
                ViewGroup viewGroup = this.f46428b.f46405e;
                if (!this.f46428b.f46398A) {
                    i10 = 4;
                }
                viewGroup.setVisibility(i10);
            }
            if (!(this.f46428b.f46410j instanceof C2396b) || this.f46428b.f46398A) {
                return;
            }
            ((C2396b) this.f46428b.f46410j).m12633u(250L);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$c.class
     */
    /* renamed from: z8.u0$c */
    /* loaded from: combined.jar:classes2.jar:z8/u0$c.class */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C2399e f46429b;

        /* renamed from: c */
        public final C10114u0 f46430c;

        public c(C10114u0 c10114u0, C2399e c2399e) {
            this.f46430c = c10114u0;
            this.f46429b = c2399e;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46430c.m42466Z(1);
            if (this.f46430c.f46399B) {
                this.f46429b.post(this.f46430c.f46419s);
                this.f46430c.f46399B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46430c.m42466Z(3);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$d.class
     */
    /* renamed from: z8.u0$d */
    /* loaded from: combined.jar:classes2.jar:z8/u0$d.class */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C2399e f46431b;

        /* renamed from: c */
        public final C10114u0 f46432c;

        public d(C10114u0 c10114u0, C2399e c2399e) {
            this.f46432c = c10114u0;
            this.f46431b = c2399e;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46432c.m42466Z(2);
            if (this.f46432c.f46399B) {
                this.f46431b.post(this.f46432c.f46419s);
                this.f46432c.f46399B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46432c.m42466Z(3);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$e.class
     */
    /* renamed from: z8.u0$e */
    /* loaded from: combined.jar:classes2.jar:z8/u0$e.class */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C2399e f46433b;

        /* renamed from: c */
        public final C10114u0 f46434c;

        public e(C10114u0 c10114u0, C2399e c2399e) {
            this.f46434c = c10114u0;
            this.f46433b = c2399e;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46434c.m42466Z(2);
            if (this.f46434c.f46399B) {
                this.f46433b.post(this.f46434c.f46419s);
                this.f46434c.f46399B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46434c.m42466Z(3);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$f.class
     */
    /* renamed from: z8.u0$f */
    /* loaded from: combined.jar:classes2.jar:z8/u0$f.class */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C10114u0 f46435b;

        public f(C10114u0 c10114u0) {
            this.f46435b = c10114u0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46435b.m42466Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46435b.m42466Z(4);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$g.class
     */
    /* renamed from: z8.u0$g */
    /* loaded from: combined.jar:classes2.jar:z8/u0$g.class */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C10114u0 f46436b;

        public g(C10114u0 c10114u0) {
            this.f46436b = c10114u0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46436b.m42466Z(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46436b.m42466Z(4);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$h.class
     */
    /* renamed from: z8.u0$h */
    /* loaded from: combined.jar:classes2.jar:z8/u0$h.class */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C10114u0 f46437b;

        public h(C10114u0 c10114u0) {
            this.f46437b = c10114u0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f46437b.f46406f != null) {
                this.f46437b.f46406f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f46437b.f46408h != null) {
                this.f46437b.f46408h.setVisibility(0);
                this.f46437b.f46408h.setTranslationX(this.f46437b.f46408h.getWidth());
                this.f46437b.f46408h.scrollTo(this.f46437b.f46408h.getWidth(), 0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:z8/u0$i.class
     */
    /* renamed from: z8.u0$i */
    /* loaded from: combined.jar:classes2.jar:z8/u0$i.class */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: b */
        public final C10114u0 f46438b;

        public i(C10114u0 c10114u0) {
            this.f46438b = c10114u0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f46438b.f46408h != null) {
                this.f46438b.f46408h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f46438b.f46406f != null) {
                this.f46438b.f46406f.setVisibility(0);
            }
        }
    }

    public C10114u0(C2399e c2399e) {
        this.f46401a = c2399e;
        this.f46402b = c2399e.findViewById(C10105q.f46333l);
        this.f46403c = (ViewGroup) c2399e.findViewById(C10105q.f46328g);
        this.f46405e = (ViewGroup) c2399e.findViewById(C10105q.f46343v);
        ViewGroup viewGroup = (ViewGroup) c2399e.findViewById(C10105q.f46326e);
        this.f46404d = viewGroup;
        this.f46409i = (ViewGroup) c2399e.findViewById(C10105q.f46319T);
        View findViewById = c2399e.findViewById(C10105q.f46307H);
        this.f46410j = findViewById;
        this.f46406f = (ViewGroup) c2399e.findViewById(C10105q.f46325d);
        this.f46407g = (ViewGroup) c2399e.findViewById(C10105q.f46336o);
        this.f46408h = (ViewGroup) c2399e.findViewById(C10105q.f46337p);
        View findViewById2 = c2399e.findViewById(C10105q.f46347z);
        this.f46411k = findViewById2;
        View findViewById3 = c2399e.findViewById(C10105q.f46346y);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: z8.s0

                /* renamed from: b */
                public final C10114u0 f46360b;

                {
                    this.f46360b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46360b.m42460T(view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: z8.s0

                /* renamed from: b */
                public final C10114u0 f46360b;

                {
                    this.f46360b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46360b.m42460T(view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: z8.t0

            /* renamed from: b */
            public final C10114u0 f46363b;

            {
                this.f46363b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f46363b.m42417J(valueAnimator);
            }
        });
        ofFloat.addListener(new a(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: z8.i0

            /* renamed from: b */
            public final C10114u0 f46264b;

            {
                this.f46264b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f46264b.m42418K(valueAnimator);
            }
        });
        ofFloat2.addListener(new b(this));
        Resources resources = c2399e.getResources();
        int i10 = C10099n.f46274b;
        float dimension = resources.getDimension(i10) - resources.getDimension(C10099n.f46275c);
        float dimension2 = resources.getDimension(i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f46412l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(this, c2399e));
        animatorSet.play(ofFloat).with(m42421N(0.0f, dimension, findViewById)).with(m42421N(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f46413m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(this, c2399e));
        animatorSet2.play(m42421N(dimension, dimension2, findViewById)).with(m42421N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f46414n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(this, c2399e));
        animatorSet3.play(ofFloat).with(m42421N(0.0f, dimension2, findViewById)).with(m42421N(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f46415o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f(this));
        animatorSet4.play(ofFloat2).with(m42421N(dimension, 0.0f, findViewById)).with(m42421N(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f46416p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g(this));
        animatorSet5.play(ofFloat2).with(m42421N(dimension2, 0.0f, findViewById)).with(m42421N(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f46417q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: z8.l0

            /* renamed from: b */
            public final C10114u0 f46270b;

            {
                this.f46270b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f46270b.m42419L(valueAnimator);
            }
        });
        ofFloat3.addListener(new h(this));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f46418r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: z8.m0

            /* renamed from: b */
            public final C10114u0 f46272b;

            {
                this.f46272b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f46272b.m42420M(valueAnimator);
            }
        });
        ofFloat4.addListener(new i(this));
    }

    /* renamed from: B */
    public static int m42416B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = width;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i10 = width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m42417J(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f46402b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f46403c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f46405e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m42418K(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f46402b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f46403c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f46405e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m42419L(ValueAnimator valueAnimator) {
        m42472y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m42420M(ValueAnimator valueAnimator) {
        m42472y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: N */
    public static ObjectAnimator m42421N(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    /* renamed from: z */
    public static int m42446z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i10 = height;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i10 = height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return i10;
    }

    /* renamed from: A */
    public boolean m42447A(View view) {
        return view != null && this.f46425y.contains(view);
    }

    /* renamed from: C */
    public void m42448C() {
        int i10 = this.f46426z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        m42462V();
        if (!this.f46400C) {
            m42450E();
        } else if (this.f46426z == 1) {
            m42453H();
        } else {
            m42449D();
        }
    }

    /* renamed from: D */
    public final void m42449D() {
        this.f46414n.start();
    }

    /* renamed from: E */
    public final void m42450E() {
        m42466Z(2);
    }

    /* renamed from: F */
    public void m42451F() {
        int i10 = this.f46426z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        m42462V();
        m42450E();
    }

    /* renamed from: G */
    public final void m42452G() {
        this.f46412l.start();
        m42461U(this.f46421u, 2000L);
    }

    /* renamed from: H */
    public final void m42453H() {
        this.f46413m.start();
    }

    /* renamed from: I */
    public boolean m42454I() {
        return this.f46426z == 0 && this.f46401a.m12780j0();
    }

    /* renamed from: O */
    public void m42455O() {
        this.f46401a.addOnLayoutChangeListener(this.f46424x);
    }

    /* renamed from: P */
    public void m42456P() {
        this.f46401a.removeOnLayoutChangeListener(this.f46424x);
    }

    /* renamed from: Q */
    public void m42457Q(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f46402b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    /* renamed from: R */
    public final void m42458R(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean m42471e0 = m42471e0();
        if (this.f46398A != m42471e0) {
            this.f46398A = m42471e0;
            view.post(new Runnable(this) { // from class: z8.j0

                /* renamed from: b */
                public final C10114u0 f46266b;

                {
                    this.f46266b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f46266b.m42470d0();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.f46398A || !z10) {
            return;
        }
        view.post(new Runnable(this) { // from class: z8.k0

            /* renamed from: b */
            public final C10114u0 f46267b;

            {
                this.f46267b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f46267b.m42459S();
            }
        });
    }

    /* renamed from: S */
    public final void m42459S() {
        if (this.f46406f == null || this.f46407g == null) {
            return;
        }
        int width = (this.f46401a.getWidth() - this.f46401a.getPaddingLeft()) - this.f46401a.getPaddingRight();
        while (this.f46407g.getChildCount() > 1) {
            int childCount = this.f46407g.getChildCount() - 2;
            View childAt = this.f46407g.getChildAt(childCount);
            this.f46407g.removeViewAt(childCount);
            this.f46406f.addView(childAt, 0);
        }
        View view = this.f46411k;
        if (view != null) {
            view.setVisibility(8);
        }
        int m42416B = m42416B(this.f46409i);
        int childCount2 = this.f46406f.getChildCount() - 1;
        for (int i10 = 0; i10 < childCount2; i10++) {
            m42416B += m42416B(this.f46406f.getChildAt(i10));
        }
        if (m42416B <= width) {
            ViewGroup viewGroup = this.f46408h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f46418r.isStarted()) {
                return;
            }
            this.f46417q.cancel();
            this.f46418r.start();
            return;
        }
        View view2 = this.f46411k;
        int i11 = m42416B;
        if (view2 != null) {
            view2.setVisibility(0);
            i11 = m42416B + m42416B(this.f46411k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f46406f.getChildAt(i12);
            i11 -= m42416B(childAt2);
            arrayList.add(childAt2);
            if (i11 <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f46406f.removeViews(0, arrayList.size());
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f46407g.addView((View) arrayList.get(i13), this.f46407g.getChildCount() - 1);
        }
    }

    /* renamed from: T */
    public final void m42460T(View view) {
        ValueAnimator valueAnimator;
        m42463W();
        if (view.getId() == C10105q.f46347z) {
            valueAnimator = this.f46417q;
        } else if (view.getId() != C10105q.f46346y) {
            return;
        } else {
            valueAnimator = this.f46418r;
        }
        valueAnimator.start();
    }

    /* renamed from: U */
    public final void m42461U(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f46401a.postDelayed(runnable, j10);
        }
    }

    /* renamed from: V */
    public void m42462V() {
        this.f46401a.removeCallbacks(this.f46423w);
        this.f46401a.removeCallbacks(this.f46420t);
        this.f46401a.removeCallbacks(this.f46422v);
        this.f46401a.removeCallbacks(this.f46421u);
    }

    /* renamed from: W */
    public void m42463W() {
        Runnable runnable;
        if (this.f46426z == 3) {
            return;
        }
        m42462V();
        int showTimeoutMs = this.f46401a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f46400C) {
                runnable = this.f46423w;
            } else {
                if (this.f46426z == 1) {
                    m42461U(this.f46421u, 2000L);
                    return;
                }
                runnable = this.f46422v;
            }
            m42461U(runnable, showTimeoutMs);
        }
    }

    /* renamed from: X */
    public void m42464X(boolean z10) {
        this.f46400C = z10;
    }

    /* renamed from: Y */
    public void m42465Y(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility((this.f46398A && m42467a0(view)) ? 4 : 0);
            this.f46425y.add(view);
        } else {
            view.setVisibility(8);
            this.f46425y.remove(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m42466Z(int r4) {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.f46426z
            r6 = r0
            r0 = r3
            r1 = r4
            r0.f46426z = r1
            r0 = r4
            r1 = 2
            if (r0 != r1) goto L21
            r0 = r3
            com.google.android.exoplayer2.ui.e r0 = r0.f46401a
            r7 = r0
            r0 = 8
            r5 = r0
        L18:
            r0 = r7
            r1 = r5
            r0.setVisibility(r1)
            goto L31
        L21:
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L31
            r0 = r3
            com.google.android.exoplayer2.ui.e r0 = r0.f46401a
            r7 = r0
            r0 = 0
            r5 = r0
            goto L18
        L31:
            r0 = r6
            r1 = r4
            if (r0 == r1) goto L3d
            r0 = r3
            com.google.android.exoplayer2.ui.e r0 = r0.f46401a
            r0.m12781k0()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p440z8.C10114u0.m42466Z(int):void");
    }

    /* renamed from: a0 */
    public final boolean m42467a0(View view) {
        int id2 = view.getId();
        return id2 == C10105q.f46326e || id2 == C10105q.f46306G || id2 == C10105q.f46345x || id2 == C10105q.f46310K || id2 == C10105q.f46311L || id2 == C10105q.f46338q || id2 == C10105q.f46339r;
    }

    /* renamed from: b0 */
    public void m42468b0() {
        if (!this.f46401a.m12780j0()) {
            this.f46401a.setVisibility(0);
            this.f46401a.m12791u0();
            this.f46401a.m12786p0();
        }
        m42469c0();
    }

    /* renamed from: c0 */
    public final void m42469c0() {
        AnimatorSet animatorSet;
        if (!this.f46400C) {
            m42466Z(0);
            m42463W();
            return;
        }
        int i10 = this.f46426z;
        if (i10 == 1) {
            animatorSet = this.f46415o;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f46399B = true;
                } else if (i10 == 4) {
                    return;
                }
                m42463W();
            }
            animatorSet = this.f46416p;
        }
        animatorSet.start();
        m42463W();
    }

    /* renamed from: d0 */
    public final void m42470d0() {
        ViewGroup viewGroup = this.f46405e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f46398A ? 0 : 4);
        }
        View view = this.f46410j;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int dimensionPixelSize = this.f46401a.getResources().getDimensionPixelSize(C10099n.f46276d);
            if (this.f46398A) {
                dimensionPixelSize = 0;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize;
            this.f46410j.setLayoutParams(marginLayoutParams);
            View view2 = this.f46410j;
            if (view2 instanceof C2396b) {
                C2396b c2396b = (C2396b) view2;
                if (this.f46398A) {
                    c2396b.m12625i(true);
                } else {
                    int i10 = this.f46426z;
                    if (i10 == 1) {
                        c2396b.m12625i(false);
                    } else if (i10 != 3) {
                        c2396b.m12632t();
                    }
                }
            }
        }
        for (View view3 : this.f46425y) {
            view3.setVisibility((this.f46398A && m42467a0(view3)) ? 4 : 0);
        }
    }

    /* renamed from: e0 */
    public final boolean m42471e0() {
        int width = this.f46401a.getWidth();
        int paddingLeft = this.f46401a.getPaddingLeft();
        int paddingRight = this.f46401a.getPaddingRight();
        int height = this.f46401a.getHeight();
        int paddingBottom = this.f46401a.getPaddingBottom();
        int paddingTop = this.f46401a.getPaddingTop();
        int m42416B = m42416B(this.f46403c);
        ViewGroup viewGroup = this.f46403c;
        boolean z10 = false;
        int paddingLeft2 = viewGroup != null ? viewGroup.getPaddingLeft() + this.f46403c.getPaddingRight() : 0;
        int m42446z = m42446z(this.f46403c);
        ViewGroup viewGroup2 = this.f46403c;
        int paddingTop2 = viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f46403c.getPaddingBottom() : 0;
        int max = Math.max(m42416B - paddingLeft2, m42416B(this.f46409i) + m42416B(this.f46411k));
        int m42446z2 = m42446z(this.f46404d);
        if ((width - paddingLeft) - paddingRight <= max || (height - paddingBottom) - paddingTop <= (m42446z - paddingTop2) + (m42446z2 * 2)) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: y */
    public final void m42472y(float f10) {
        if (this.f46408h != null) {
            this.f46408h.setTranslationX((int) (r0.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup = this.f46409i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup2 = this.f46406f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
    }
}
