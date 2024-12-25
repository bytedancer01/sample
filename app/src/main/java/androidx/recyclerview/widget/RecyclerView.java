package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C0702a;
import androidx.recyclerview.widget.C0703b;
import androidx.recyclerview.widget.C0715n;
import androidx.recyclerview.widget.C0719r;
import androidx.recyclerview.widget.C0720s;
import androidx.recyclerview.widget.RunnableC0706e;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p175k0.C5450k;
import p221n0.C6616h;
import p235o0.C6805a;
import p235o0.C6824g0;
import p235o0.C6847q;
import p235o0.C6851s;
import p235o0.C6858v0;
import p235o0.InterfaceC6849r;
import p261p0.C7526b;
import p261p0.C7535k;
import p315s1.C8516a;
import p315s1.C8517b;
import p315s1.C8519d;
import p341u0.AbstractC8783a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/RecyclerView.class
 */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView.class */
public class RecyclerView extends ViewGroup implements InterfaceC6849r {

    /* renamed from: I0 */
    public static final int[] f4490I0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: J0 */
    public static final boolean f4491J0;

    /* renamed from: K0 */
    public static final boolean f4492K0;

    /* renamed from: L0 */
    public static final boolean f4493L0;

    /* renamed from: M0 */
    public static final boolean f4494M0;

    /* renamed from: N0 */
    public static final boolean f4495N0;

    /* renamed from: O0 */
    public static final boolean f4496O0;

    /* renamed from: P0 */
    public static final Class<?>[] f4497P0;

    /* renamed from: Q0 */
    public static final Interpolator f4498Q0;

    /* renamed from: A */
    public boolean f4499A;

    /* renamed from: A0 */
    public final int[] f4500A0;

    /* renamed from: B */
    public int f4501B;

    /* renamed from: B0 */
    public final int[] f4502B0;

    /* renamed from: C */
    public boolean f4503C;

    /* renamed from: C0 */
    public final List<AbstractC0674e0> f4504C0;

    /* renamed from: D */
    public final AccessibilityManager f4505D;

    /* renamed from: D0 */
    public Runnable f4506D0;

    /* renamed from: E */
    public List<InterfaceC0687r> f4507E;

    /* renamed from: E0 */
    public boolean f4508E0;

    /* renamed from: F */
    public boolean f4509F;

    /* renamed from: F0 */
    public int f4510F0;

    /* renamed from: G */
    public boolean f4511G;

    /* renamed from: G0 */
    public int f4512G0;

    /* renamed from: H */
    public int f4513H;

    /* renamed from: H0 */
    public final C0720s.b f4514H0;

    /* renamed from: I */
    public int f4515I;

    /* renamed from: J */
    public C0681l f4516J;

    /* renamed from: K */
    public EdgeEffect f4517K;

    /* renamed from: L */
    public EdgeEffect f4518L;

    /* renamed from: M */
    public EdgeEffect f4519M;

    /* renamed from: N */
    public EdgeEffect f4520N;

    /* renamed from: O */
    public AbstractC0682m f4521O;

    /* renamed from: P */
    public int f4522P;

    /* renamed from: Q */
    public int f4523Q;

    /* renamed from: R */
    public VelocityTracker f4524R;

    /* renamed from: S */
    public int f4525S;

    /* renamed from: T */
    public int f4526T;

    /* renamed from: U */
    public int f4527U;

    /* renamed from: V */
    public int f4528V;

    /* renamed from: W */
    public int f4529W;

    /* renamed from: b */
    public final C0694y f4530b;

    /* renamed from: c */
    public final C0692w f4531c;

    /* renamed from: d */
    public C0695z f4532d;

    /* renamed from: e */
    public C0702a f4533e;

    /* renamed from: f */
    public C0703b f4534f;

    /* renamed from: f0 */
    public AbstractC0688s f4535f0;

    /* renamed from: g */
    public final C0720s f4536g;

    /* renamed from: g0 */
    public final int f4537g0;

    /* renamed from: h */
    public boolean f4538h;

    /* renamed from: h0 */
    public final int f4539h0;

    /* renamed from: i */
    public final Runnable f4540i;

    /* renamed from: i0 */
    public float f4541i0;

    /* renamed from: j */
    public final Rect f4542j;

    /* renamed from: j0 */
    public float f4543j0;

    /* renamed from: k */
    public final Rect f4544k;

    /* renamed from: k0 */
    public boolean f4545k0;

    /* renamed from: l */
    public final RectF f4546l;

    /* renamed from: l0 */
    public final RunnableC0672d0 f4547l0;

    /* renamed from: m */
    public AbstractC0677h f4548m;

    /* renamed from: m0 */
    public RunnableC0706e f4549m0;

    /* renamed from: n */
    public AbstractC0685p f4550n;

    /* renamed from: n0 */
    public RunnableC0706e.b f4551n0;

    /* renamed from: o */
    public InterfaceC0693x f4552o;

    /* renamed from: o0 */
    public final C0668b0 f4553o0;

    /* renamed from: p */
    public final List<InterfaceC0693x> f4554p;

    /* renamed from: p0 */
    public AbstractC0690u f4555p0;

    /* renamed from: q */
    public final ArrayList<AbstractC0684o> f4556q;

    /* renamed from: q0 */
    public List<AbstractC0690u> f4557q0;

    /* renamed from: r */
    public final ArrayList<InterfaceC0689t> f4558r;

    /* renamed from: r0 */
    public boolean f4559r0;

    /* renamed from: s */
    public InterfaceC0689t f4560s;

    /* renamed from: s0 */
    public boolean f4561s0;

    /* renamed from: t */
    public boolean f4562t;

    /* renamed from: t0 */
    public AbstractC0682m.b f4563t0;

    /* renamed from: u */
    public boolean f4564u;

    /* renamed from: u0 */
    public boolean f4565u0;

    /* renamed from: v */
    public boolean f4566v;

    /* renamed from: v0 */
    public C0715n f4567v0;

    /* renamed from: w */
    public boolean f4568w;

    /* renamed from: w0 */
    public InterfaceC0680k f4569w0;

    /* renamed from: x */
    public int f4570x;

    /* renamed from: x0 */
    public final int[] f4571x0;

    /* renamed from: y */
    public boolean f4572y;

    /* renamed from: y0 */
    public C6851s f4573y0;

    /* renamed from: z */
    public boolean f4574z;

    /* renamed from: z0 */
    public final int[] f4575z0;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$a.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$a.class */
    public class RunnableC0665a implements Runnable {

        /* renamed from: b */
        public final RecyclerView f4576b;

        public RunnableC0665a(RecyclerView recyclerView) {
            this.f4576b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = this.f4576b;
            if (!recyclerView.f4568w || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = this.f4576b;
            if (!recyclerView2.f4562t) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4574z) {
                recyclerView2.f4572y = true;
            } else {
                recyclerView2.m3973v();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$a0.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$a0.class */
    public static abstract class AbstractC0666a0 {

        /* renamed from: b */
        public RecyclerView f4578b;

        /* renamed from: c */
        public AbstractC0685p f4579c;

        /* renamed from: d */
        public boolean f4580d;

        /* renamed from: e */
        public boolean f4581e;

        /* renamed from: f */
        public View f4582f;

        /* renamed from: h */
        public boolean f4584h;

        /* renamed from: a */
        public int f4577a = -1;

        /* renamed from: g */
        public final a f4583g = new a(0, 0);

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$a0$a.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$a0$a.class */
        public static class a {

            /* renamed from: a */
            public int f4585a;

            /* renamed from: b */
            public int f4586b;

            /* renamed from: c */
            public int f4587c;

            /* renamed from: d */
            public int f4588d;

            /* renamed from: e */
            public Interpolator f4589e;

            /* renamed from: f */
            public boolean f4590f;

            /* renamed from: g */
            public int f4591g;

            public a(int i10, int i11) {
                this(i10, i11, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, null);
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4588d = -1;
                this.f4590f = false;
                this.f4591g = 0;
                this.f4585a = i10;
                this.f4586b = i11;
                this.f4587c = i12;
                this.f4589e = interpolator;
            }

            /* renamed from: a */
            public boolean m4002a() {
                return this.f4588d >= 0;
            }

            /* renamed from: b */
            public void m4003b(int i10) {
                this.f4588d = i10;
            }

            /* renamed from: c */
            public void m4004c(RecyclerView recyclerView) {
                int i10 = this.f4588d;
                if (i10 >= 0) {
                    this.f4588d = -1;
                    recyclerView.m3866A0(i10);
                    this.f4590f = false;
                } else {
                    if (!this.f4590f) {
                        this.f4591g = 0;
                        return;
                    }
                    m4006e();
                    recyclerView.f4547l0.m4025e(this.f4585a, this.f4586b, this.f4587c, this.f4589e);
                    int i11 = this.f4591g + 1;
                    this.f4591g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4590f = false;
                }
            }

            /* renamed from: d */
            public void m4005d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f4585a = i10;
                this.f4586b = i11;
                this.f4587c = i12;
                this.f4589e = interpolator;
                this.f4590f = true;
            }

            /* renamed from: e */
            public final void m4006e() {
                if (this.f4589e != null && this.f4587c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4587c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$a0$b.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$a0$b.class */
        public interface b {
            /* renamed from: d */
            PointF mo3816d(int i10);
        }

        /* renamed from: a */
        public PointF mo2879a(int i10) {
            Object m3990e = m3990e();
            if (m3990e instanceof b) {
                return ((b) m3990e).mo3816d(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m3987b(int i10) {
            return this.f4578b.f4550n.mo3812a0(i10);
        }

        /* renamed from: c */
        public int m3988c() {
            return this.f4578b.f4550n.m4217h0();
        }

        /* renamed from: d */
        public int m3989d(View view) {
            return this.f4578b.m3936h0(view);
        }

        /* renamed from: e */
        public AbstractC0685p m3990e() {
            return this.f4579c;
        }

        /* renamed from: f */
        public int m3991f() {
            return this.f4577a;
        }

        /* renamed from: g */
        public boolean m3992g() {
            return this.f4580d;
        }

        /* renamed from: h */
        public boolean m3993h() {
            return this.f4581e;
        }

        /* renamed from: i */
        public void m3994i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: j */
        public void m3995j(int i10, int i11) {
            PointF mo2879a;
            RecyclerView recyclerView = this.f4578b;
            if (this.f4577a == -1 || recyclerView == null) {
                m4001r();
            }
            if (this.f4580d && this.f4582f == null && this.f4579c != null && (mo2879a = mo2879a(this.f4577a)) != null) {
                float f10 = mo2879a.x;
                if (f10 != 0.0f || mo2879a.y != 0.0f) {
                    recyclerView.m3950m1((int) Math.signum(f10), (int) Math.signum(mo2879a.y), null);
                }
            }
            this.f4580d = false;
            View view = this.f4582f;
            if (view != null) {
                if (m3989d(view) == this.f4577a) {
                    mo2882o(this.f4582f, recyclerView.f4553o0, this.f4583g);
                    this.f4583g.m4004c(recyclerView);
                    m4001r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4582f = null;
                }
            }
            if (this.f4581e) {
                mo3997l(i10, i11, recyclerView.f4553o0, this.f4583g);
                boolean m4002a = this.f4583g.m4002a();
                this.f4583g.m4004c(recyclerView);
                if (m4002a && this.f4581e) {
                    this.f4580d = true;
                    recyclerView.f4547l0.m4024d();
                }
            }
        }

        /* renamed from: k */
        public void m3996k(View view) {
            if (m3989d(view) == m3991f()) {
                this.f4582f = view;
            }
        }

        /* renamed from: l */
        public abstract void mo3997l(int i10, int i11, C0668b0 c0668b0, a aVar);

        /* renamed from: m */
        public abstract void mo3998m();

        /* renamed from: n */
        public abstract void mo2881n();

        /* renamed from: o */
        public abstract void mo2882o(View view, C0668b0 c0668b0, a aVar);

        /* renamed from: p */
        public void m3999p(int i10) {
            this.f4577a = i10;
        }

        /* renamed from: q */
        public void m4000q(RecyclerView recyclerView, AbstractC0685p abstractC0685p) {
            recyclerView.f4547l0.m4026f();
            if (this.f4584h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4578b = recyclerView;
            this.f4579c = abstractC0685p;
            int i10 = this.f4577a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f4553o0.f4593a = i10;
            this.f4581e = true;
            this.f4580d = true;
            this.f4582f = m3987b(m3991f());
            mo3998m();
            this.f4578b.f4547l0.m4024d();
            this.f4584h = true;
        }

        /* renamed from: r */
        public final void m4001r() {
            if (this.f4581e) {
                this.f4581e = false;
                mo2881n();
                this.f4578b.f4553o0.f4593a = -1;
                this.f4582f = null;
                this.f4577a = -1;
                this.f4580d = false;
                this.f4579c.m4156B1(this);
                this.f4579c = null;
                this.f4578b = null;
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$b.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$b.class */
    public class RunnableC0667b implements Runnable {

        /* renamed from: b */
        public final RecyclerView f4592b;

        public RunnableC0667b(RecyclerView recyclerView) {
            this.f4592b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0682m abstractC0682m = this.f4592b.f4521O;
            if (abstractC0682m != null) {
                abstractC0682m.mo4135v();
            }
            this.f4592b.f4565u0 = false;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$b0.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$b0.class */
    public static class C0668b0 {

        /* renamed from: b */
        public SparseArray<Object> f4594b;

        /* renamed from: m */
        public int f4605m;

        /* renamed from: n */
        public long f4606n;

        /* renamed from: o */
        public int f4607o;

        /* renamed from: p */
        public int f4608p;

        /* renamed from: q */
        public int f4609q;

        /* renamed from: a */
        public int f4593a = -1;

        /* renamed from: c */
        public int f4595c = 0;

        /* renamed from: d */
        public int f4596d = 0;

        /* renamed from: e */
        public int f4597e = 1;

        /* renamed from: f */
        public int f4598f = 0;

        /* renamed from: g */
        public boolean f4599g = false;

        /* renamed from: h */
        public boolean f4600h = false;

        /* renamed from: i */
        public boolean f4601i = false;

        /* renamed from: j */
        public boolean f4602j = false;

        /* renamed from: k */
        public boolean f4603k = false;

        /* renamed from: l */
        public boolean f4604l = false;

        /* renamed from: a */
        public void m4007a(int i10) {
            if ((this.f4597e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f4597e));
        }

        /* renamed from: b */
        public boolean m4008b() {
            return this.f4599g;
        }

        /* renamed from: c */
        public int m4009c() {
            return this.f4600h ? this.f4595c - this.f4596d : this.f4598f;
        }

        /* renamed from: d */
        public int m4010d() {
            return this.f4608p;
        }

        /* renamed from: e */
        public int m4011e() {
            return this.f4609q;
        }

        /* renamed from: f */
        public int m4012f() {
            return this.f4593a;
        }

        /* renamed from: g */
        public boolean m4013g() {
            return this.f4593a != -1;
        }

        /* renamed from: h */
        public boolean m4014h() {
            return this.f4600h;
        }

        /* renamed from: i */
        public void m4015i(AbstractC0677h abstractC0677h) {
            this.f4597e = 1;
            this.f4598f = abstractC0677h.mo3013n();
            this.f4600h = false;
            this.f4601i = false;
            this.f4602j = false;
        }

        /* renamed from: j */
        public boolean m4016j() {
            return this.f4604l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4593a + ", mData=" + this.f4594b + ", mItemCount=" + this.f4598f + ", mIsMeasuring=" + this.f4602j + ", mPreviousLayoutItemCount=" + this.f4595c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4596d + ", mStructureChanged=" + this.f4599g + ", mInPreLayout=" + this.f4600h + ", mRunSimpleAnimations=" + this.f4603k + ", mRunPredictiveAnimations=" + this.f4604l + '}';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$c.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$c.class */
    public class InterpolatorC0669c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$c0.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$c0.class */
    public static abstract class AbstractC0670c0 {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$d.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$d.class */
    public class C0671d implements C0720s.b {

        /* renamed from: a */
        public final RecyclerView f4610a;

        public C0671d(RecyclerView recyclerView) {
            this.f4610a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.C0720s.b
        /* renamed from: a */
        public void mo4017a(AbstractC0674e0 abstractC0674e0, AbstractC0682m.c cVar, AbstractC0682m.c cVar2) {
            this.f4610a.m3948m(abstractC0674e0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0720s.b
        /* renamed from: b */
        public void mo4018b(AbstractC0674e0 abstractC0674e0) {
            RecyclerView recyclerView = this.f4610a;
            recyclerView.f4550n.m4172J1(abstractC0674e0.f4620a, recyclerView.f4531c);
        }

        @Override // androidx.recyclerview.widget.C0720s.b
        /* renamed from: c */
        public void mo4019c(AbstractC0674e0 abstractC0674e0, AbstractC0682m.c cVar, AbstractC0682m.c cVar2) {
            this.f4610a.f4531c.m4282J(abstractC0674e0);
            this.f4610a.m3953o(abstractC0674e0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C0720s.b
        /* renamed from: d */
        public void mo4020d(AbstractC0674e0 abstractC0674e0, AbstractC0682m.c cVar, AbstractC0682m.c cVar2) {
            abstractC0674e0.m4048L(false);
            RecyclerView recyclerView = this.f4610a;
            boolean z10 = recyclerView.f4509F;
            AbstractC0682m abstractC0682m = recyclerView.f4521O;
            if (z10) {
                if (!abstractC0682m.mo4116b(abstractC0674e0, abstractC0674e0, cVar, cVar2)) {
                    return;
                }
            } else if (!abstractC0682m.mo4118d(abstractC0674e0, cVar, cVar2)) {
                return;
            }
            this.f4610a.m3903R0();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$d0.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$d0.class */
    public class RunnableC0672d0 implements Runnable {

        /* renamed from: b */
        public int f4611b;

        /* renamed from: c */
        public int f4612c;

        /* renamed from: d */
        public OverScroller f4613d;

        /* renamed from: e */
        public Interpolator f4614e;

        /* renamed from: f */
        public boolean f4615f;

        /* renamed from: g */
        public boolean f4616g;

        /* renamed from: h */
        public final RecyclerView f4617h;

        public RunnableC0672d0(RecyclerView recyclerView) {
            this.f4617h = recyclerView;
            Interpolator interpolator = RecyclerView.f4498Q0;
            this.f4614e = interpolator;
            this.f4615f = false;
            this.f4616g = false;
            this.f4613d = new OverScroller(recyclerView.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int m4021a(int i10, int i11) {
            boolean z10 = Math.abs(i10) > Math.abs(i11);
            RecyclerView recyclerView = this.f4617h;
            return Math.min((int) ((((z10 ? r0 : r0) / (z10 ? recyclerView.getWidth() : recyclerView.getHeight())) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: b */
        public void m4022b(int i10, int i11) {
            this.f4617h.setScrollState(2);
            this.f4612c = 0;
            this.f4611b = 0;
            Interpolator interpolator = this.f4614e;
            Interpolator interpolator2 = RecyclerView.f4498Q0;
            if (interpolator != interpolator2) {
                this.f4614e = interpolator2;
                this.f4613d = new OverScroller(this.f4617h.getContext(), interpolator2);
            }
            this.f4613d.fling(0, 0, i10, i11, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, Integer.MAX_VALUE, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, Integer.MAX_VALUE);
            m4024d();
        }

        /* renamed from: c */
        public final void m4023c() {
            this.f4617h.removeCallbacks(this);
            C6824g0.m31523h0(this.f4617h, this);
        }

        /* renamed from: d */
        public void m4024d() {
            if (this.f4615f) {
                this.f4616g = true;
            } else {
                m4023c();
            }
        }

        /* renamed from: e */
        public void m4025e(int i10, int i11, int i12, Interpolator interpolator) {
            int i13 = i12;
            if (i12 == Integer.MIN_VALUE) {
                i13 = m4021a(i10, i11);
            }
            Interpolator interpolator2 = interpolator;
            if (interpolator == null) {
                interpolator2 = RecyclerView.f4498Q0;
            }
            if (this.f4614e != interpolator2) {
                this.f4614e = interpolator2;
                this.f4613d = new OverScroller(this.f4617h.getContext(), interpolator2);
            }
            this.f4612c = 0;
            this.f4611b = 0;
            this.f4617h.setScrollState(2);
            this.f4613d.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4613d.computeScrollOffset();
            }
            m4024d();
        }

        /* renamed from: f */
        public void m4026f() {
            this.f4617h.removeCallbacks(this);
            this.f4613d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = this.f4617h;
            if (recyclerView.f4550n == null) {
                m4026f();
                return;
            }
            this.f4616g = false;
            this.f4615f = true;
            recyclerView.m3973v();
            OverScroller overScroller = this.f4613d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f4611b;
                int i14 = currY - this.f4612c;
                this.f4611b = currX;
                this.f4612c = currY;
                RecyclerView recyclerView2 = this.f4617h;
                int[] iArr = recyclerView2.f4502B0;
                iArr[0] = 0;
                iArr[1] = 0;
                int i15 = i13;
                int i16 = i14;
                if (recyclerView2.m3880G(i13, i14, iArr, null, 1)) {
                    int[] iArr2 = this.f4617h.f4502B0;
                    i15 = i13 - iArr2[0];
                    i16 = i14 - iArr2[1];
                }
                if (this.f4617h.getOverScrollMode() != 2) {
                    this.f4617h.m3970u(i15, i16);
                }
                RecyclerView recyclerView3 = this.f4617h;
                if (recyclerView3.f4548m != null) {
                    int[] iArr3 = recyclerView3.f4502B0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m3950m1(i15, i16, iArr3);
                    RecyclerView recyclerView4 = this.f4617h;
                    int[] iArr4 = recyclerView4.f4502B0;
                    int i17 = iArr4[0];
                    int i18 = iArr4[1];
                    int i19 = i15 - i17;
                    int i20 = i16 - i18;
                    AbstractC0666a0 abstractC0666a0 = recyclerView4.f4550n.f4661g;
                    i15 = i19;
                    i10 = i18;
                    i12 = i17;
                    i11 = i20;
                    if (abstractC0666a0 != null) {
                        i15 = i19;
                        i10 = i18;
                        i12 = i17;
                        i11 = i20;
                        if (!abstractC0666a0.m3992g()) {
                            i15 = i19;
                            i10 = i18;
                            i12 = i17;
                            i11 = i20;
                            if (abstractC0666a0.m3993h()) {
                                int m4009c = this.f4617h.f4553o0.m4009c();
                                if (m4009c == 0) {
                                    abstractC0666a0.m4001r();
                                    i15 = i19;
                                    i10 = i18;
                                    i12 = i17;
                                    i11 = i20;
                                } else {
                                    if (abstractC0666a0.m3991f() >= m4009c) {
                                        abstractC0666a0.m3999p(m4009c - 1);
                                    }
                                    abstractC0666a0.m3995j(i17, i18);
                                    i15 = i19;
                                    i10 = i18;
                                    i12 = i17;
                                    i11 = i20;
                                }
                            }
                        }
                    }
                } else {
                    i10 = 0;
                    i11 = i16;
                    i12 = 0;
                }
                if (!this.f4617h.f4556q.isEmpty()) {
                    this.f4617h.invalidate();
                }
                RecyclerView recyclerView5 = this.f4617h;
                int[] iArr5 = recyclerView5.f4502B0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m3882H(i12, i10, i15, i11, null, 1, iArr5);
                RecyclerView recyclerView6 = this.f4617h;
                int[] iArr6 = recyclerView6.f4502B0;
                int i21 = i15 - iArr6[0];
                int i22 = i11 - iArr6[1];
                if (i12 != 0 || i10 != 0) {
                    recyclerView6.m3886J(i12, i10);
                }
                if (!this.f4617h.awakenScrollBars()) {
                    this.f4617h.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i21 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i22 != 0));
                AbstractC0666a0 abstractC0666a02 = this.f4617h.f4550n.f4661g;
                if ((abstractC0666a02 != null && abstractC0666a02.m3992g()) || !z10) {
                    m4024d();
                    RecyclerView recyclerView7 = this.f4617h;
                    RunnableC0706e runnableC0706e = recyclerView7.f4549m0;
                    if (runnableC0706e != null) {
                        runnableC0706e.m4517f(recyclerView7, i12, i10);
                    }
                } else {
                    if (this.f4617h.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i23 = i21 < 0 ? -currVelocity : i21 > 0 ? currVelocity : 0;
                        if (i22 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i22 <= 0) {
                            currVelocity = 0;
                        }
                        this.f4617h.m3921b(i23, currVelocity);
                    }
                    if (RecyclerView.f4494M0) {
                        this.f4617h.f4551n0.m4523b();
                    }
                }
            }
            AbstractC0666a0 abstractC0666a03 = this.f4617h.f4550n.f4661g;
            if (abstractC0666a03 != null && abstractC0666a03.m3992g()) {
                abstractC0666a03.m3995j(0, 0);
            }
            this.f4615f = false;
            if (this.f4616g) {
                m4023c();
            } else {
                this.f4617h.setScrollState(0);
                this.f4617h.m3986z1(1);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$e.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$e.class */
    public class C0673e implements C0703b.b {

        /* renamed from: a */
        public final RecyclerView f4618a;

        public C0673e(RecyclerView recyclerView) {
            this.f4618a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: a */
        public View mo4027a(int i10) {
            return this.f4618a.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        public void addView(View view, int i10) {
            this.f4618a.addView(view, i10);
            this.f4618a.m3984z(view);
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: b */
        public void mo4028b(View view) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (m3862j0 != null) {
                m3862j0.m4043G(this.f4618a);
            }
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: c */
        public int mo4029c() {
            return this.f4618a.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: d */
        public AbstractC0674e0 mo4030d(View view) {
            return RecyclerView.m3862j0(view);
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: e */
        public void mo4031e(int i10) {
            AbstractC0674e0 m3862j0;
            View mo4027a = mo4027a(i10);
            if (mo4027a != null && (m3862j0 = RecyclerView.m3862j0(mo4027a)) != null) {
                if (m3862j0.m4039C() && !m3862j0.m4051O()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m3862j0 + this.f4618a.m3900Q());
                }
                m3862j0.m4055e(256);
            }
            this.f4618a.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: f */
        public void mo4032f() {
            int mo4029c = mo4029c();
            for (int i10 = 0; i10 < mo4029c; i10++) {
                View mo4027a = mo4027a(i10);
                this.f4618a.m3865A(mo4027a);
                mo4027a.clearAnimation();
            }
            this.f4618a.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: g */
        public int mo4033g(View view) {
            return this.f4618a.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: h */
        public void mo4034h(View view) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (m3862j0 != null) {
                m3862j0.m4044H(this.f4618a);
            }
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: i */
        public void mo4035i(int i10) {
            View childAt = this.f4618a.getChildAt(i10);
            if (childAt != null) {
                this.f4618a.m3865A(childAt);
                childAt.clearAnimation();
            }
            this.f4618a.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.C0703b.b
        /* renamed from: j */
        public void mo4036j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (m3862j0 != null) {
                if (!m3862j0.m4039C() && !m3862j0.m4051O()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m3862j0 + this.f4618a.m3900Q());
                }
                m3862j0.m4059i();
            }
            this.f4618a.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$e0.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$e0 */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$e0.class */
    public static abstract class AbstractC0674e0 {

        /* renamed from: t */
        public static final List<Object> f4619t = Collections.emptyList();

        /* renamed from: a */
        public final View f4620a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f4621b;

        /* renamed from: j */
        public int f4629j;

        /* renamed from: r */
        public RecyclerView f4637r;

        /* renamed from: s */
        public AbstractC0677h<? extends AbstractC0674e0> f4638s;

        /* renamed from: c */
        public int f4622c = -1;

        /* renamed from: d */
        public int f4623d = -1;

        /* renamed from: e */
        public long f4624e = -1;

        /* renamed from: f */
        public int f4625f = -1;

        /* renamed from: g */
        public int f4626g = -1;

        /* renamed from: h */
        public AbstractC0674e0 f4627h = null;

        /* renamed from: i */
        public AbstractC0674e0 f4628i = null;

        /* renamed from: k */
        public List<Object> f4630k = null;

        /* renamed from: l */
        public List<Object> f4631l = null;

        /* renamed from: m */
        public int f4632m = 0;

        /* renamed from: n */
        public C0692w f4633n = null;

        /* renamed from: o */
        public boolean f4634o = false;

        /* renamed from: p */
        public int f4635p = 0;

        /* renamed from: q */
        public int f4636q = -1;

        public AbstractC0674e0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f4620a = view;
        }

        /* renamed from: A */
        public boolean m4037A() {
            return (this.f4629j & 8) != 0;
        }

        /* renamed from: B */
        public boolean m4038B() {
            return this.f4633n != null;
        }

        /* renamed from: C */
        public boolean m4039C() {
            return (this.f4629j & 256) != 0;
        }

        /* renamed from: D */
        public boolean m4040D() {
            return (this.f4629j & 2) != 0;
        }

        /* renamed from: E */
        public boolean m4041E() {
            return (this.f4629j & 2) != 0;
        }

        /* renamed from: F */
        public void m4042F(int i10, boolean z10) {
            if (this.f4623d == -1) {
                this.f4623d = this.f4622c;
            }
            if (this.f4626g == -1) {
                this.f4626g = this.f4622c;
            }
            if (z10) {
                this.f4626g += i10;
            }
            this.f4622c += i10;
            if (this.f4620a.getLayoutParams() != null) {
                ((C0686q) this.f4620a.getLayoutParams()).f4681d = true;
            }
        }

        /* renamed from: G */
        public void m4043G(RecyclerView recyclerView) {
            int i10 = this.f4636q;
            if (i10 == -1) {
                i10 = C6824g0.m31469A(this.f4620a);
            }
            this.f4635p = i10;
            recyclerView.m3958p1(this, 4);
        }

        /* renamed from: H */
        public void m4044H(RecyclerView recyclerView) {
            recyclerView.m3958p1(this, this.f4635p);
            this.f4635p = 0;
        }

        /* renamed from: I */
        public void m4045I() {
            this.f4629j = 0;
            this.f4622c = -1;
            this.f4623d = -1;
            this.f4624e = -1L;
            this.f4626g = -1;
            this.f4632m = 0;
            this.f4627h = null;
            this.f4628i = null;
            m4057g();
            this.f4635p = 0;
            this.f4636q = -1;
            RecyclerView.m3864s(this);
        }

        /* renamed from: J */
        public void m4046J() {
            if (this.f4623d == -1) {
                this.f4623d = this.f4622c;
            }
        }

        /* renamed from: K */
        public void m4047K(int i10, int i11) {
            this.f4629j = (i10 & i11) | (this.f4629j & (i11 ^ (-1)));
        }

        /* renamed from: L */
        public final void m4048L(boolean z10) {
            int i10;
            int i11 = this.f4632m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f4632m = i12;
            if (i12 < 0) {
                this.f4632m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f4629j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f4629j & (-17);
            }
            this.f4629j = i10;
        }

        /* renamed from: M */
        public void m4049M(C0692w c0692w, boolean z10) {
            this.f4633n = c0692w;
            this.f4634o = z10;
        }

        /* renamed from: N */
        public boolean m4050N() {
            return (this.f4629j & 16) != 0;
        }

        /* renamed from: O */
        public boolean m4051O() {
            return (this.f4629j & 128) != 0;
        }

        /* renamed from: P */
        public void m4052P() {
            this.f4633n.m4282J(this);
        }

        /* renamed from: Q */
        public boolean m4053Q() {
            return (this.f4629j & 32) != 0;
        }

        /* renamed from: d */
        public void m4054d(Object obj) {
            if (obj == null) {
                m4055e(1024);
            } else if ((1024 & this.f4629j) == 0) {
                m4060j();
                this.f4630k.add(obj);
            }
        }

        /* renamed from: e */
        public void m4055e(int i10) {
            this.f4629j = i10 | this.f4629j;
        }

        /* renamed from: f */
        public void m4056f() {
            this.f4623d = -1;
            this.f4626g = -1;
        }

        /* renamed from: g */
        public void m4057g() {
            List<Object> list = this.f4630k;
            if (list != null) {
                list.clear();
            }
            this.f4629j &= -1025;
        }

        /* renamed from: h */
        public void m4058h() {
            this.f4629j &= -33;
        }

        /* renamed from: i */
        public void m4059i() {
            this.f4629j &= -257;
        }

        /* renamed from: j */
        public final void m4060j() {
            if (this.f4630k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4630k = arrayList;
                this.f4631l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: k */
        public boolean m4061k() {
            return (this.f4629j & 16) == 0 && C6824g0.m31499R(this.f4620a);
        }

        /* renamed from: l */
        public void m4062l(int i10, int i11, boolean z10) {
            m4055e(8);
            m4042F(i11, z10);
            this.f4622c = i10;
        }

        /* renamed from: m */
        public final int m4063m() {
            RecyclerView recyclerView = this.f4637r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m3928e0(this);
        }

        @Deprecated
        /* renamed from: n */
        public final int m4064n() {
            return m4065o();
        }

        /* renamed from: o */
        public final int m4065o() {
            RecyclerView recyclerView;
            AbstractC0677h adapter;
            int m3928e0;
            if (this.f4638s == null || (recyclerView = this.f4637r) == null || (adapter = recyclerView.getAdapter()) == null || (m3928e0 = this.f4637r.m3928e0(this)) == -1) {
                return -1;
            }
            return adapter.m4096m(this.f4638s, this, m3928e0);
        }

        /* renamed from: p */
        public final long m4066p() {
            return this.f4624e;
        }

        /* renamed from: q */
        public final int m4067q() {
            return this.f4625f;
        }

        /* renamed from: r */
        public final int m4068r() {
            int i10 = this.f4626g;
            int i11 = i10;
            if (i10 == -1) {
                i11 = this.f4622c;
            }
            return i11;
        }

        /* renamed from: s */
        public final int m4069s() {
            return this.f4623d;
        }

        /* renamed from: t */
        public List<Object> m4070t() {
            if ((this.f4629j & 1024) != 0) {
                return f4619t;
            }
            List<Object> list = this.f4630k;
            return (list == null || list.size() == 0) ? f4619t : this.f4631l;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4622c + " id=" + this.f4624e + ", oldPos=" + this.f4623d + ", pLpos:" + this.f4626g);
            if (m4038B()) {
                sb2.append(" scrap ");
                sb2.append(this.f4634o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m4075y()) {
                sb2.append(" invalid");
            }
            if (!m4074x()) {
                sb2.append(" unbound");
            }
            if (m4041E()) {
                sb2.append(" update");
            }
            if (m4037A()) {
                sb2.append(" removed");
            }
            if (m4051O()) {
                sb2.append(" ignored");
            }
            if (m4039C()) {
                sb2.append(" tmpDetached");
            }
            if (!m4076z()) {
                sb2.append(" not recyclable(" + this.f4632m + ")");
            }
            if (m4072v()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f4620a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* renamed from: u */
        public boolean m4071u(int i10) {
            return (i10 & this.f4629j) != 0;
        }

        /* renamed from: v */
        public boolean m4072v() {
            return (this.f4629j & 512) != 0 || m4075y();
        }

        /* renamed from: w */
        public boolean m4073w() {
            return (this.f4620a.getParent() == null || this.f4620a.getParent() == this.f4637r) ? false : true;
        }

        /* renamed from: x */
        public boolean m4074x() {
            boolean z10 = true;
            if ((this.f4629j & 1) == 0) {
                z10 = false;
            }
            return z10;
        }

        /* renamed from: y */
        public boolean m4075y() {
            return (this.f4629j & 4) != 0;
        }

        /* renamed from: z */
        public final boolean m4076z() {
            return (this.f4629j & 16) == 0 && !C6824g0.m31499R(this.f4620a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$f.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$f.class */
    public class C0675f implements C0702a.a {

        /* renamed from: a */
        public final RecyclerView f4639a;

        public C0675f(RecyclerView recyclerView) {
            this.f4639a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: a */
        public void mo4077a(int i10, int i11) {
            this.f4639a.m3883H0(i10, i11);
            this.f4639a.f4559r0 = true;
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: b */
        public void mo4078b(C0702a.b bVar) {
            m4085i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: c */
        public void mo4079c(C0702a.b bVar) {
            m4085i(bVar);
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: d */
        public void mo4080d(int i10, int i11) {
            this.f4639a.m3885I0(i10, i11, false);
            this.f4639a.f4559r0 = true;
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: e */
        public void mo4081e(int i10, int i11, Object obj) {
            this.f4639a.m3873C1(i10, i11, obj);
            this.f4639a.f4561s0 = true;
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: f */
        public AbstractC0674e0 mo4082f(int i10) {
            AbstractC0674e0 m3924c0 = this.f4639a.m3924c0(i10, true);
            if (m3924c0 == null || this.f4639a.f4534f.m4463n(m3924c0.f4620a)) {
                return null;
            }
            return m3924c0;
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: g */
        public void mo4083g(int i10, int i11) {
            this.f4639a.m3881G0(i10, i11);
            this.f4639a.f4559r0 = true;
        }

        @Override // androidx.recyclerview.widget.C0702a.a
        /* renamed from: h */
        public void mo4084h(int i10, int i11) {
            this.f4639a.m3885I0(i10, i11, true);
            RecyclerView recyclerView = this.f4639a;
            recyclerView.f4559r0 = true;
            recyclerView.f4553o0.f4596d += i11;
        }

        /* renamed from: i */
        public void m4085i(C0702a.b bVar) {
            int i10 = bVar.f4763a;
            if (i10 == 1) {
                RecyclerView recyclerView = this.f4639a;
                recyclerView.f4550n.mo2826n1(recyclerView, bVar.f4764b, bVar.f4766d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = this.f4639a;
                recyclerView2.f4550n.mo2839q1(recyclerView2, bVar.f4764b, bVar.f4766d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = this.f4639a;
                recyclerView3.f4550n.mo3767s1(recyclerView3, bVar.f4764b, bVar.f4766d, bVar.f4765c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = this.f4639a;
                recyclerView4.f4550n.mo2835p1(recyclerView4, bVar.f4764b, bVar.f4766d, 1);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$g.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$g.class */
    public static /* synthetic */ class C0676g {

        /* renamed from: a */
        public static final int[] f4640a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0020
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.AbstractC0677h.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                androidx.recyclerview.widget.RecyclerView.C0676g.f4640a = r0
                r0 = r4
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.AbstractC0677h.a.PREVENT     // Catch: java.lang.NoSuchFieldError -> L20
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L20
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L20
            L14:
                int[] r0 = androidx.recyclerview.widget.RecyclerView.C0676g.f4640a     // Catch: java.lang.NoSuchFieldError -> L20 java.lang.NoSuchFieldError -> L24
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.AbstractC0677h.a.PREVENT_WHEN_EMPTY     // Catch: java.lang.NoSuchFieldError -> L24
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L24
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L24
            L1f:
                return
            L20:
                r4 = move-exception
                goto L14
            L24:
                r4 = move-exception
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0676g.m43077clinit():void");
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$h.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$h.class */
    public static abstract class AbstractC0677h<VH extends AbstractC0674e0> {

        /* renamed from: b */
        public final C0678i f4641b = new C0678i();

        /* renamed from: c */
        public boolean f4642c = false;

        /* renamed from: d */
        public a f4643d = a.ALLOW;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$h$a.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$h$a.class */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* renamed from: A */
        public final void m4086A(int i10, int i11) {
            this.f4641b.m4105d(i10, i11);
        }

        /* renamed from: B */
        public final void m4087B(int i10) {
            this.f4641b.m4107f(i10, 1);
        }

        /* renamed from: F */
        public void mo4088F(RecyclerView recyclerView) {
        }

        /* renamed from: G */
        public abstract void mo2996G(VH vh2, int i10);

        /* renamed from: I */
        public void mo2997I(VH vh2, int i10, List<Object> list) {
            mo2996G(vh2, i10);
        }

        /* renamed from: J */
        public abstract VH mo2998J(ViewGroup viewGroup, int i10);

        /* renamed from: M */
        public void m4089M(RecyclerView recyclerView) {
        }

        /* renamed from: N */
        public boolean mo2999N(VH vh2) {
            return false;
        }

        /* renamed from: O */
        public void mo3000O(VH vh2) {
        }

        /* renamed from: S */
        public void mo3001S(VH vh2) {
        }

        /* renamed from: T */
        public void mo3002T(VH vh2) {
        }

        /* renamed from: U */
        public void m4090U(AbstractC0679j abstractC0679j) {
            this.f4641b.registerObserver(abstractC0679j);
        }

        /* renamed from: X */
        public void m4091X(boolean z10) {
            if (m4097s()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f4642c = z10;
        }

        /* renamed from: Z */
        public void m4092Z(AbstractC0679j abstractC0679j) {
            this.f4641b.unregisterObserver(abstractC0679j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: h */
        public final void m4093h(VH vh2, int i10) {
            boolean z10 = vh2.f4638s == null;
            if (z10) {
                vh2.f4622c = i10;
                if (m4098u()) {
                    vh2.f4624e = mo3016p(i10);
                }
                vh2.m4047K(1, 519);
                C5450k.m27205a("RV OnBindView");
            }
            vh2.f4638s = this;
            mo2997I(vh2, i10, vh2.m4070t());
            if (z10) {
                vh2.m4057g();
                ViewGroup.LayoutParams layoutParams = vh2.f4620a.getLayoutParams();
                if (layoutParams instanceof C0686q) {
                    ((C0686q) layoutParams).f4681d = true;
                }
                C5450k.m27206b();
            }
        }

        /* renamed from: j */
        public boolean m4094j() {
            int i10 = C0676g.f4640a[this.f4643d.ordinal()];
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                z10 = false;
                if (mo3013n() > 0) {
                    z10 = true;
                }
            }
            return z10;
        }

        /* renamed from: l */
        public final VH m4095l(ViewGroup viewGroup, int i10) {
            try {
                C5450k.m27205a("RV CreateView");
                VH mo2998J = mo2998J(viewGroup, i10);
                if (mo2998J.f4620a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                mo2998J.f4625f = i10;
                C5450k.m27206b();
                return mo2998J;
            } catch (Throwable th2) {
                C5450k.m27206b();
                throw th2;
            }
        }

        /* renamed from: m */
        public int m4096m(AbstractC0677h<? extends AbstractC0674e0> abstractC0677h, AbstractC0674e0 abstractC0674e0, int i10) {
            if (abstractC0677h == this) {
                return i10;
            }
            return -1;
        }

        /* renamed from: n */
        public abstract int mo3013n();

        /* renamed from: p */
        public long mo3016p(int i10) {
            return -1L;
        }

        /* renamed from: q */
        public int mo3018q(int i10) {
            return 0;
        }

        /* renamed from: s */
        public final boolean m4097s() {
            return this.f4641b.m4102a();
        }

        /* renamed from: u */
        public final boolean m4098u() {
            return this.f4642c;
        }

        /* renamed from: w */
        public final void m4099w() {
            this.f4641b.m4103b();
        }

        /* renamed from: x */
        public final void m4100x(int i10) {
            this.f4641b.m4105d(i10, 1);
        }

        /* renamed from: y */
        public final void m4101y(int i10, int i11) {
            this.f4641b.m4104c(i10, i11);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$i.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$i.class */
    public static class C0678i extends Observable<AbstractC0679j> {
        /* renamed from: a */
        public boolean m4102a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m4103b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0679j) ((Observable) this).mObservers.get(size)).mo2418a();
            }
        }

        /* renamed from: c */
        public void m4104c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0679j) ((Observable) this).mObservers.get(size)).mo4110d(i10, i11, 1);
            }
        }

        /* renamed from: d */
        public void m4105d(int i10, int i11) {
            m4106e(i10, i11, null);
        }

        /* renamed from: e */
        public void m4106e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0679j) ((Observable) this).mObservers.get(size)).mo4109c(i10, i11, obj);
            }
        }

        /* renamed from: f */
        public void m4107f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC0679j) ((Observable) this).mObservers.get(size)).mo4111e(i10, i11);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$j.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$j.class */
    public static abstract class AbstractC0679j {
        /* renamed from: a */
        public void mo2418a() {
        }

        /* renamed from: b */
        public void m4108b(int i10, int i11) {
        }

        /* renamed from: c */
        public void mo4109c(int i10, int i11, Object obj) {
            m4108b(i10, i11);
        }

        /* renamed from: d */
        public void mo4110d(int i10, int i11, int i12) {
        }

        /* renamed from: e */
        public void mo4111e(int i10, int i11) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$k.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$k.class */
    public interface InterfaceC0680k {
        /* renamed from: a */
        int m4112a(int i10, int i11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$l.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$l.class */
    public static class C0681l {
        /* renamed from: a */
        public EdgeEffect m4113a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$m.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$m.class */
    public static abstract class AbstractC0682m {

        /* renamed from: a */
        public b f4644a = null;

        /* renamed from: b */
        public ArrayList<a> f4645b = new ArrayList<>();

        /* renamed from: c */
        public long f4646c = 120;

        /* renamed from: d */
        public long f4647d = 120;

        /* renamed from: e */
        public long f4648e = 250;

        /* renamed from: f */
        public long f4649f = 250;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$m$a.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$m$a.class */
        public interface a {
            /* renamed from: a */
            void m4137a();
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$m$b.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$m$b.class */
        public interface b {
            /* renamed from: a */
            void mo4138a(AbstractC0674e0 abstractC0674e0);
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$m$c.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$m$c.class */
        public static class c {

            /* renamed from: a */
            public int f4650a;

            /* renamed from: b */
            public int f4651b;

            /* renamed from: c */
            public int f4652c;

            /* renamed from: d */
            public int f4653d;

            /* renamed from: a */
            public c m4139a(AbstractC0674e0 abstractC0674e0) {
                return m4140b(abstractC0674e0, 0);
            }

            /* renamed from: b */
            public c m4140b(AbstractC0674e0 abstractC0674e0, int i10) {
                View view = abstractC0674e0.f4620a;
                this.f4650a = view.getLeft();
                this.f4651b = view.getTop();
                this.f4652c = view.getRight();
                this.f4653d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        public static int m4114e(AbstractC0674e0 abstractC0674e0) {
            int i10 = abstractC0674e0.f4629j & 14;
            if (abstractC0674e0.m4075y()) {
                return 4;
            }
            int i11 = i10;
            if ((i10 & 4) == 0) {
                int m4069s = abstractC0674e0.m4069s();
                int m4063m = abstractC0674e0.m4063m();
                i11 = i10;
                if (m4069s != -1) {
                    i11 = i10;
                    if (m4063m != -1) {
                        i11 = i10;
                        if (m4069s != m4063m) {
                            i11 = i10 | 2048;
                        }
                    }
                }
            }
            return i11;
        }

        /* renamed from: a */
        public abstract boolean mo4115a(AbstractC0674e0 abstractC0674e0, c cVar, c cVar2);

        /* renamed from: b */
        public abstract boolean mo4116b(AbstractC0674e0 abstractC0674e0, AbstractC0674e0 abstractC0674e02, c cVar, c cVar2);

        /* renamed from: c */
        public abstract boolean mo4117c(AbstractC0674e0 abstractC0674e0, c cVar, c cVar2);

        /* renamed from: d */
        public abstract boolean mo4118d(AbstractC0674e0 abstractC0674e0, c cVar, c cVar2);

        /* renamed from: f */
        public abstract boolean mo4119f(AbstractC0674e0 abstractC0674e0);

        /* renamed from: g */
        public boolean mo4120g(AbstractC0674e0 abstractC0674e0, List<Object> list) {
            return mo4119f(abstractC0674e0);
        }

        /* renamed from: h */
        public final void m4121h(AbstractC0674e0 abstractC0674e0) {
            m4132s(abstractC0674e0);
            b bVar = this.f4644a;
            if (bVar != null) {
                bVar.mo4138a(abstractC0674e0);
            }
        }

        /* renamed from: i */
        public final void m4122i() {
            int size = this.f4645b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4645b.get(i10).m4137a();
            }
            this.f4645b.clear();
        }

        /* renamed from: j */
        public abstract void mo4123j(AbstractC0674e0 abstractC0674e0);

        /* renamed from: k */
        public abstract void mo4124k();

        /* renamed from: l */
        public long m4125l() {
            return this.f4646c;
        }

        /* renamed from: m */
        public long m4126m() {
            return this.f4649f;
        }

        /* renamed from: n */
        public long m4127n() {
            return this.f4648e;
        }

        /* renamed from: o */
        public long m4128o() {
            return this.f4647d;
        }

        /* renamed from: p */
        public abstract boolean mo4129p();

        /* renamed from: q */
        public final boolean m4130q(a aVar) {
            boolean mo4129p = mo4129p();
            if (aVar != null) {
                if (mo4129p) {
                    this.f4645b.add(aVar);
                } else {
                    aVar.m4137a();
                }
            }
            return mo4129p;
        }

        /* renamed from: r */
        public c m4131r() {
            return new c();
        }

        /* renamed from: s */
        public void m4132s(AbstractC0674e0 abstractC0674e0) {
        }

        /* renamed from: t */
        public c m4133t(C0668b0 c0668b0, AbstractC0674e0 abstractC0674e0) {
            return m4131r().m4139a(abstractC0674e0);
        }

        /* renamed from: u */
        public c m4134u(C0668b0 c0668b0, AbstractC0674e0 abstractC0674e0, int i10, List<Object> list) {
            return m4131r().m4139a(abstractC0674e0);
        }

        /* renamed from: v */
        public abstract void mo4135v();

        /* renamed from: w */
        public void m4136w(b bVar) {
            this.f4644a = bVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$n.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$n.class */
    public class C0683n implements AbstractC0682m.b {

        /* renamed from: a */
        public final RecyclerView f4654a;

        public C0683n(RecyclerView recyclerView) {
            this.f4654a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0682m.b
        /* renamed from: a */
        public void mo4138a(AbstractC0674e0 abstractC0674e0) {
            abstractC0674e0.m4048L(true);
            if (abstractC0674e0.f4627h != null && abstractC0674e0.f4628i == null) {
                abstractC0674e0.f4627h = null;
            }
            abstractC0674e0.f4628i = null;
            if (abstractC0674e0.m4050N() || this.f4654a.m3920a1(abstractC0674e0.f4620a) || !abstractC0674e0.m4039C()) {
                return;
            }
            this.f4654a.removeDetachedView(abstractC0674e0.f4620a, false);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$o.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$o.class */
    public static abstract class AbstractC0684o {
        @Deprecated
        /* renamed from: f */
        public void m4141f(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo4142g(Rect rect, View view, RecyclerView recyclerView, C0668b0 c0668b0) {
            m4141f(rect, ((C0686q) view.getLayoutParams()).m4247c(), recyclerView);
        }

        @Deprecated
        /* renamed from: h */
        public void m4143h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo4144i(Canvas canvas, RecyclerView recyclerView, C0668b0 c0668b0) {
            m4143h(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: j */
        public void m4145j(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: k */
        public void mo4146k(Canvas canvas, RecyclerView recyclerView, C0668b0 c0668b0) {
            m4145j(canvas, recyclerView);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$p.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$p.class */
    public static abstract class AbstractC0685p {

        /* renamed from: a */
        public C0703b f4655a;

        /* renamed from: b */
        public RecyclerView f4656b;

        /* renamed from: c */
        public final C0719r.b f4657c;

        /* renamed from: d */
        public final C0719r.b f4658d;

        /* renamed from: e */
        public C0719r f4659e;

        /* renamed from: f */
        public C0719r f4660f;

        /* renamed from: g */
        public AbstractC0666a0 f4661g;

        /* renamed from: h */
        public boolean f4662h;

        /* renamed from: i */
        public boolean f4663i;

        /* renamed from: j */
        public boolean f4664j;

        /* renamed from: k */
        public boolean f4665k;

        /* renamed from: l */
        public boolean f4666l;

        /* renamed from: m */
        public int f4667m;

        /* renamed from: n */
        public boolean f4668n;

        /* renamed from: o */
        public int f4669o;

        /* renamed from: p */
        public int f4670p;

        /* renamed from: q */
        public int f4671q;

        /* renamed from: r */
        public int f4672r;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$p$a.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$p$a.class */
        public class a implements C0719r.b {

            /* renamed from: a */
            public final AbstractC0685p f4673a;

            public a(AbstractC0685p abstractC0685p) {
                this.f4673a = abstractC0685p;
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: a */
            public View mo4240a(int i10) {
                return this.f4673a.m4216g0(i10);
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: b */
            public int mo4241b(View view) {
                return this.f4673a.mo2830o0(view) - ((ViewGroup.MarginLayoutParams) ((C0686q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: c */
            public int mo4242c() {
                return this.f4673a.m4226o();
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: d */
            public int mo4243d() {
                return this.f4673a.m4169I0() - this.f4673a.m4222k();
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: e */
            public int mo4244e(View view) {
                return this.f4673a.mo2843r0(view) + ((ViewGroup.MarginLayoutParams) ((C0686q) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$p$b.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$p$b.class */
        public class b implements C0719r.b {

            /* renamed from: a */
            public final AbstractC0685p f4674a;

            public b(AbstractC0685p abstractC0685p) {
                this.f4674a = abstractC0685p;
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: a */
            public View mo4240a(int i10) {
                return this.f4674a.m4216g0(i10);
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: b */
            public int mo4241b(View view) {
                return this.f4674a.mo2848s0(view) - ((ViewGroup.MarginLayoutParams) ((C0686q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: c */
            public int mo4242c() {
                return this.f4674a.m4225n();
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: d */
            public int mo4243d() {
                return this.f4674a.m4230u0() - this.f4674a.m4206a();
            }

            @Override // androidx.recyclerview.widget.C0719r.b
            /* renamed from: e */
            public int mo4244e(View view) {
                return this.f4674a.mo2820m0(view) + ((ViewGroup.MarginLayoutParams) ((C0686q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$p$c.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$p$c.class */
        public interface c {
            /* renamed from: a */
            void mo4245a(int i10, int i11);
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$p$d.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$p$d.class */
        public static class d {

            /* renamed from: a */
            public int f4675a;

            /* renamed from: b */
            public int f4676b;

            /* renamed from: c */
            public boolean f4677c;

            /* renamed from: d */
            public boolean f4678d;
        }

        public AbstractC0685p() {
            a aVar = new a(this);
            this.f4657c = aVar;
            b bVar = new b(this);
            this.f4658d = bVar;
            this.f4659e = new C0719r(aVar);
            this.f4660f = new C0719r(bVar);
            this.f4662h = false;
            this.f4663i = false;
            this.f4664j = false;
            this.f4665k = true;
            this.f4666l = true;
        }

        /* renamed from: C0 */
        public static d m4147C0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8519d.f39884f, i10, i11);
            dVar.f4675a = obtainStyledAttributes.getInt(C8519d.f39885g, 1);
            dVar.f4676b = obtainStyledAttributes.getInt(C8519d.f39895q, 1);
            dVar.f4677c = obtainStyledAttributes.getBoolean(C8519d.f39894p, false);
            dVar.f4678d = obtainStyledAttributes.getBoolean(C8519d.f39896r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: K */
        public static int m4148K(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i11, i12));
            }
            if (mode != 1073741824) {
                size = Math.max(i11, i12);
            }
            return size;
        }

        /* renamed from: S0 */
        public static boolean m4149S0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            boolean z10 = false;
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i10) {
                    z10 = true;
                }
                return z10;
            }
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824) {
                return false;
            }
            boolean z11 = false;
            if (size == i10) {
                z11 = true;
            }
            return z11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        
            if (r5 != 1073741824) goto L32;
         */
        /* renamed from: i0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m4150i0(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                r0 = 0
                r1 = r4
                r2 = r6
                int r1 = r1 - r2
                int r0 = java.lang.Math.max(r0, r1)
                r6 = r0
                r0 = r8
                if (r0 == 0) goto L30
                r0 = r7
                if (r0 < 0) goto L14
                goto L34
            L14:
                r0 = r7
                r1 = -1
                if (r0 != r1) goto L66
                r0 = r5
                r4 = r0
                r0 = r5
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L41
                r0 = r5
                if (r0 == 0) goto L66
                r0 = r5
                r4 = r0
                r0 = r5
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto L41
                goto L66
            L30:
                r0 = r7
                if (r0 < 0) goto L3a
            L34:
                r0 = 1073741824(0x40000000, float:2.0)
                r4 = r0
                goto L6a
            L3a:
                r0 = r7
                r1 = -1
                if (r0 != r1) goto L46
                r0 = r5
                r4 = r0
            L41:
                r0 = r6
                r7 = r0
                goto L6a
            L46:
                r0 = r7
                r1 = -2
                if (r0 != r1) goto L66
                r0 = r5
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L60
                r0 = r5
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 != r1) goto L5b
                goto L60
            L5b:
                r0 = 0
                r4 = r0
                goto L41
            L60:
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r0
                goto L41
            L66:
                r0 = 0
                r4 = r0
                r0 = 0
                r7 = r0
            L6a:
                r0 = r7
                r1 = r4
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC0685p.m4150i0(int, int, int, int, boolean):int");
        }

        /* renamed from: A */
        public void m4151A(View view) {
            m4154B(view, -1);
        }

        /* renamed from: A0 */
        public int m4152A0() {
            return C6824g0.m31477E(this.f4656b);
        }

        /* renamed from: A1 */
        public void mo4153A1(int i10) {
        }

        /* renamed from: B */
        public void m4154B(View view, int i10) {
            m4157C(view, i10, false);
        }

        /* renamed from: B0 */
        public int m4155B0(View view) {
            return ((C0686q) view.getLayoutParams()).m4247c();
        }

        /* renamed from: B1 */
        public void m4156B1(AbstractC0666a0 abstractC0666a0) {
            if (this.f4661g == abstractC0666a0) {
                this.f4661g = null;
            }
        }

        /* renamed from: C */
        public final void m4157C(View view, int i10, boolean z10) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (z10 || m3862j0.m4037A()) {
                this.f4656b.f4536g.m4684b(m3862j0);
            } else {
                this.f4656b.f4536g.m4698p(m3862j0);
            }
            C0686q c0686q = (C0686q) view.getLayoutParams();
            if (m3862j0.m4053Q() || m3862j0.m4038B()) {
                if (m3862j0.m4038B()) {
                    m3862j0.m4052P();
                } else {
                    m3862j0.m4058h();
                }
                this.f4655a.m4452c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4656b) {
                int m4462m = this.f4655a.m4462m(view);
                int i11 = i10;
                if (i10 == -1) {
                    i11 = this.f4655a.m4456g();
                }
                if (m4462m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4656b.indexOfChild(view) + this.f4656b.m3900Q());
                }
                if (m4462m != i11) {
                    this.f4656b.f4550n.m4198X0(m4462m, i11);
                }
            } else {
                this.f4655a.m4450a(view, i10, false);
                c0686q.f4681d = true;
                AbstractC0666a0 abstractC0666a0 = this.f4661g;
                if (abstractC0666a0 != null && abstractC0666a0.m3993h()) {
                    this.f4661g.m3996k(view);
                }
            }
            if (c0686q.f4682e) {
                m3862j0.f4620a.invalidate();
                c0686q.f4682e = false;
            }
        }

        /* renamed from: C1 */
        public boolean m4158C1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4656b;
            return mo2717D1(recyclerView.f4531c, recyclerView.f4553o0, i10, bundle);
        }

        /* renamed from: D */
        public void mo3789D(String str) {
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView != null) {
                recyclerView.m3956p(str);
            }
        }

        /* renamed from: D0 */
        public int m4159D0(View view) {
            return ((C0686q) view.getLayoutParams()).f4680c.right;
        }

        /* renamed from: D1 */
        public boolean mo2717D1(C0692w c0692w, C0668b0 c0668b0, int i10, Bundle bundle) {
            int m4230u0;
            int i11;
            int m4169I0;
            int i12;
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView == null) {
                return false;
            }
            if (i10 == 4096) {
                m4230u0 = recyclerView.canScrollVertically(1) ? (m4230u0() - m4225n()) - m4206a() : 0;
                i11 = m4230u0;
                if (this.f4656b.canScrollHorizontally(1)) {
                    m4169I0 = (m4169I0() - m4226o()) - m4222k();
                    int i13 = m4230u0;
                    i12 = m4169I0;
                    i11 = i13;
                }
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                m4230u0 = recyclerView.canScrollVertically(-1) ? -((m4230u0() - m4225n()) - m4206a()) : 0;
                i11 = m4230u0;
                if (this.f4656b.canScrollHorizontally(-1)) {
                    m4169I0 = -((m4169I0() - m4226o()) - m4222k());
                    int i132 = m4230u0;
                    i12 = m4169I0;
                    i11 = i132;
                }
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f4656b.m3972u1(i12, i11, null, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, true);
            return true;
        }

        /* renamed from: E */
        public void m4160E(View view, int i10) {
            m4162F(view, i10, (C0686q) view.getLayoutParams());
        }

        /* renamed from: E0 */
        public int mo2721E0(C0692w c0692w, C0668b0 c0668b0) {
            return -1;
        }

        /* renamed from: E1 */
        public boolean m4161E1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f4656b;
            return m4164F1(recyclerView.f4531c, recyclerView.f4553o0, view, i10, bundle);
        }

        /* renamed from: F */
        public void m4162F(View view, int i10, C0686q c0686q) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (m3862j0.m4037A()) {
                this.f4656b.f4536g.m4684b(m3862j0);
            } else {
                this.f4656b.f4536g.m4698p(m3862j0);
            }
            this.f4655a.m4452c(view, i10, c0686q, m3862j0.m4037A());
        }

        /* renamed from: F0 */
        public int m4163F0(C0692w c0692w, C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: F1 */
        public boolean m4164F1(C0692w c0692w, C0668b0 c0668b0, View view, int i10, Bundle bundle) {
            return false;
        }

        /* renamed from: G */
        public void m4165G(View view, Rect rect) {
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m3952n0(view));
            }
        }

        /* renamed from: G0 */
        public int m4166G0(View view) {
            return ((C0686q) view.getLayoutParams()).f4680c.top;
        }

        /* renamed from: G1 */
        public void m4167G1() {
            for (int m4217h0 = m4217h0() - 1; m4217h0 >= 0; m4217h0--) {
                this.f4655a.m4466q(m4217h0);
            }
        }

        /* renamed from: H */
        public boolean mo2731H() {
            return false;
        }

        /* renamed from: H0 */
        public void m4168H0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((C0686q) view.getLayoutParams()).f4680c;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4656b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4656b.f4546l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: H1 */
        public void mo2732H1(C0692w c0692w) {
            for (int m4217h0 = m4217h0() - 1; m4217h0 >= 0; m4217h0--) {
                if (!RecyclerView.m3862j0(m4216g0(m4217h0)).m4051O()) {
                    m4174K1(m4217h0, c0692w);
                }
            }
        }

        /* renamed from: I */
        public boolean mo2736I() {
            return false;
        }

        /* renamed from: I0 */
        public int m4169I0() {
            return this.f4671q;
        }

        /* renamed from: I1 */
        public void m4170I1(C0692w c0692w) {
            int m4295j = c0692w.m4295j();
            for (int i10 = m4295j - 1; i10 >= 0; i10--) {
                View m4299n = c0692w.m4299n(i10);
                AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(m4299n);
                if (!m3862j0.m4051O()) {
                    m3862j0.m4048L(false);
                    if (m3862j0.m4039C()) {
                        this.f4656b.removeDetachedView(m4299n, false);
                    }
                    AbstractC0682m abstractC0682m = this.f4656b.f4521O;
                    if (abstractC0682m != null) {
                        abstractC0682m.mo4123j(m3862j0);
                    }
                    m3862j0.m4048L(true);
                    c0692w.m4310y(m4299n);
                }
            }
            c0692w.m4290e();
            if (m4295j > 0) {
                this.f4656b.invalidate();
            }
        }

        /* renamed from: J */
        public boolean mo3747J(C0686q c0686q) {
            return c0686q != null;
        }

        /* renamed from: J0 */
        public int m4171J0() {
            return this.f4669o;
        }

        /* renamed from: J1 */
        public void m4172J1(View view, C0692w c0692w) {
            m4178M1(view);
            c0692w.m4274B(view);
        }

        /* renamed from: K0 */
        public boolean m4173K0() {
            int m4217h0 = m4217h0();
            for (int i10 = 0; i10 < m4217h0; i10++) {
                ViewGroup.LayoutParams layoutParams = m4216g0(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: K1 */
        public void m4174K1(int i10, C0692w c0692w) {
            View m4216g0 = m4216g0(i10);
            m4179N1(i10);
            c0692w.m4274B(m4216g0);
        }

        /* renamed from: L */
        public void mo2746L(int i10, int i11, C0668b0 c0668b0, c cVar) {
        }

        /* renamed from: L0 */
        public boolean m4175L0() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        /* renamed from: L1 */
        public boolean m4176L1(Runnable runnable) {
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: M */
        public void mo2750M(int i10, c cVar) {
        }

        /* renamed from: M0 */
        public boolean m4177M0() {
            return this.f4663i;
        }

        /* renamed from: M1 */
        public void m4178M1(View view) {
            this.f4655a.m4465p(view);
        }

        /* renamed from: N */
        public int mo3798N(C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: N0 */
        public boolean mo3799N0() {
            return this.f4664j;
        }

        /* renamed from: N1 */
        public void m4179N1(int i10) {
            if (m4216g0(i10) != null) {
                this.f4655a.m4466q(i10);
            }
        }

        /* renamed from: O */
        public int mo3749O(C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: O0 */
        public final boolean m4180O0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int m4226o = m4226o();
            int m4225n = m4225n();
            int m4169I0 = m4169I0();
            int m4222k = m4222k();
            int m4230u0 = m4230u0();
            int m4206a = m4206a();
            Rect rect = this.f4656b.f4542j;
            mo2825n0(focusedChild, rect);
            return rect.left - i10 < m4169I0 - m4222k && rect.right - i10 > m4226o && rect.top - i11 < m4230u0 - m4206a && rect.bottom - i11 > m4225n;
        }

        /* renamed from: O1 */
        public boolean mo2755O1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return m4182P1(recyclerView, view, rect, z10, false);
        }

        /* renamed from: P */
        public int mo3751P(C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: P0 */
        public final boolean m4181P0() {
            return this.f4666l;
        }

        /* renamed from: P1 */
        public boolean m4182P1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] m4220j0 = m4220j0(view, rect);
            int i10 = m4220j0[0];
            int i11 = m4220j0[1];
            if (z11 && !m4180O0(recyclerView, i10, i11)) {
                return false;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
                return true;
            }
            recyclerView.m3964r1(i10, i11);
            return true;
        }

        /* renamed from: Q */
        public int mo3802Q(C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: Q0 */
        public boolean m4183Q0(C0692w c0692w, C0668b0 c0668b0) {
            return false;
        }

        /* renamed from: Q1 */
        public void m4184Q1() {
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: R */
        public int mo3752R(C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: R0 */
        public boolean m4185R0() {
            return this.f4665k;
        }

        /* renamed from: R1 */
        public void m4186R1() {
            this.f4662h = true;
        }

        /* renamed from: S */
        public int mo3753S(C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: S1 */
        public final void m4187S1(C0692w c0692w, int i10, View view) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (m3862j0.m4051O()) {
                return;
            }
            if (m3862j0.m4075y() && !m3862j0.m4037A() && !this.f4656b.f4548m.m4098u()) {
                m4179N1(i10);
                c0692w.m4275C(m3862j0);
            } else {
                m4192V(i10);
                c0692w.m4276D(view);
                this.f4656b.f4536g.m4693k(m3862j0);
            }
        }

        /* renamed from: T */
        public void m4188T(C0692w c0692w) {
            for (int m4217h0 = m4217h0() - 1; m4217h0 >= 0; m4217h0--) {
                m4187S1(c0692w, m4217h0, m4216g0(m4217h0));
            }
        }

        /* renamed from: T0 */
        public boolean m4189T0() {
            AbstractC0666a0 abstractC0666a0 = this.f4661g;
            return abstractC0666a0 != null && abstractC0666a0.m3993h();
        }

        /* renamed from: T1 */
        public int mo2766T1(int i10, C0692w c0692w, C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: U */
        public void m4190U(View view, C0692w c0692w) {
            m4187S1(c0692w, this.f4655a.m4462m(view), view);
        }

        /* renamed from: U0 */
        public boolean m4191U0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f4659e.m4677b(view, 24579) && this.f4660f.m4677b(view, 24579);
            return z10 ? z12 : !z12;
        }

        /* renamed from: U1 */
        public void mo2769U1(int i10) {
        }

        /* renamed from: V */
        public void m4192V(int i10) {
            m4194W(i10, m4216g0(i10));
        }

        /* renamed from: V0 */
        public void m4193V0(View view, int i10, int i11, int i12, int i13) {
            C0686q c0686q = (C0686q) view.getLayoutParams();
            Rect rect = c0686q.f4680c;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) c0686q).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) c0686q).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) c0686q).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0686q).bottomMargin);
        }

        /* renamed from: V1 */
        public int mo2772V1(int i10, C0692w c0692w, C0668b0 c0668b0) {
            return 0;
        }

        /* renamed from: W */
        public final void m4194W(int i10, View view) {
            this.f4655a.m4453d(i10);
        }

        /* renamed from: W0 */
        public void m4195W0(View view, int i10, int i11) {
            C0686q c0686q = (C0686q) view.getLayoutParams();
            Rect m3952n0 = this.f4656b.m3952n0(view);
            int i12 = m3952n0.left;
            int i13 = m3952n0.right;
            int i14 = m3952n0.top;
            int i15 = m3952n0.bottom;
            int m4150i0 = m4150i0(m4169I0(), m4171J0(), m4226o() + m4222k() + ((ViewGroup.MarginLayoutParams) c0686q).leftMargin + ((ViewGroup.MarginLayoutParams) c0686q).rightMargin + i10 + i12 + i13, ((ViewGroup.MarginLayoutParams) c0686q).width, mo2731H());
            int m4150i02 = m4150i0(m4230u0(), m4231v0(), m4225n() + m4206a() + ((ViewGroup.MarginLayoutParams) c0686q).topMargin + ((ViewGroup.MarginLayoutParams) c0686q).bottomMargin + i11 + i14 + i15, ((ViewGroup.MarginLayoutParams) c0686q).height, mo2736I());
            if (m4212d2(view, m4150i0, m4150i02, c0686q)) {
                view.measure(m4150i0, m4150i02);
            }
        }

        /* renamed from: W1 */
        public void m4196W1(RecyclerView recyclerView) {
            m4202Y1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH));
        }

        /* renamed from: X */
        public void m4197X(RecyclerView recyclerView) {
            this.f4663i = true;
            mo4209c1(recyclerView);
        }

        /* renamed from: X0 */
        public void m4198X0(int i10, int i11) {
            View m4216g0 = m4216g0(i10);
            if (m4216g0 != null) {
                m4192V(i10);
                m4160E(m4216g0, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f4656b.toString());
            }
        }

        /* renamed from: X1 */
        public final void m4199X1(boolean z10) {
            if (z10 != this.f4666l) {
                this.f4666l = z10;
                this.f4667m = 0;
                RecyclerView recyclerView = this.f4656b;
                if (recyclerView != null) {
                    recyclerView.f4531c.m4283K();
                }
            }
        }

        /* renamed from: Y */
        public void m4200Y(RecyclerView recyclerView, C0692w c0692w) {
            this.f4663i = false;
            mo3818e1(recyclerView, c0692w);
        }

        /* renamed from: Y0 */
        public void mo4201Y0(int i10) {
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView != null) {
                recyclerView.m3877E0(i10);
            }
        }

        /* renamed from: Y1 */
        public void m4202Y1(int i10, int i11) {
            this.f4671q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f4669o = mode;
            if (mode == 0 && !RecyclerView.f4492K0) {
                this.f4671q = 0;
            }
            this.f4672r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4670p = mode2;
            if (mode2 != 0 || RecyclerView.f4492K0) {
                return;
            }
            this.f4672r = 0;
        }

        /* renamed from: Z */
        public View m4203Z(View view) {
            View m3906T;
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView == null || (m3906T = recyclerView.m3906T(view)) == null || this.f4655a.m4463n(m3906T)) {
                return null;
            }
            return m3906T;
        }

        /* renamed from: Z0 */
        public void mo4204Z0(int i10) {
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView != null) {
                recyclerView.m3879F0(i10);
            }
        }

        /* renamed from: Z1 */
        public void m4205Z1(int i10, int i11) {
            this.f4656b.setMeasuredDimension(i10, i11);
        }

        /* renamed from: a */
        public int m4206a() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null ? recyclerView.getPaddingBottom() : 0;
        }

        /* renamed from: a0 */
        public View mo3812a0(int i10) {
            int m4217h0 = m4217h0();
            for (int i11 = 0; i11 < m4217h0; i11++) {
                View m4216g0 = m4216g0(i11);
                AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(m4216g0);
                if (m3862j0 != null && m3862j0.m4068r() == i10 && !m3862j0.m4051O() && (this.f4656b.f4553o0.m4014h() || !m3862j0.m4037A())) {
                    return m4216g0;
                }
            }
            return null;
        }

        /* renamed from: a1 */
        public void mo2783a1(AbstractC0677h abstractC0677h, AbstractC0677h abstractC0677h2) {
        }

        /* renamed from: a2 */
        public void mo3755a2(Rect rect, int i10, int i11) {
            int width = rect.width();
            int m4226o = m4226o();
            int m4222k = m4222k();
            int height = rect.height();
            int m4225n = m4225n();
            m4205Z1(m4148K(i10, width + m4226o + m4222k, m4152A0()), m4148K(i11, height + m4225n + m4206a(), m4239z0()));
        }

        /* renamed from: b */
        public int m4207b() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null ? C6824g0.m31483H(recyclerView) : 0;
        }

        /* renamed from: b0 */
        public abstract C0686q mo2786b0();

        /* renamed from: b1 */
        public boolean mo2787b1(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        /* renamed from: b2 */
        public void m4208b2(int i10, int i11) {
            int m4217h0 = m4217h0();
            if (m4217h0 == 0) {
                this.f4656b.m3978x(i10, i11);
                return;
            }
            int i12 = 0;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            while (true) {
                int i17 = i16;
                if (i12 >= m4217h0) {
                    this.f4656b.f4542j.set(i15, i17, i13, i14);
                    mo3755a2(this.f4656b.f4542j, i10, i11);
                    return;
                }
                View m4216g0 = m4216g0(i12);
                Rect rect = this.f4656b.f4542j;
                mo2825n0(m4216g0, rect);
                int i18 = rect.left;
                int i19 = i15;
                if (i18 < i15) {
                    i19 = i18;
                }
                int i20 = rect.right;
                int i21 = i13;
                if (i20 > i13) {
                    i21 = i20;
                }
                int i22 = rect.top;
                int i23 = i17;
                if (i22 < i17) {
                    i23 = i22;
                }
                int i24 = rect.bottom;
                int i25 = i14;
                if (i24 > i14) {
                    i25 = i24;
                }
                i12++;
                i13 = i21;
                i14 = i25;
                i15 = i19;
                i16 = i23;
            }
        }

        /* renamed from: c0 */
        public C0686q mo2790c0(Context context, AttributeSet attributeSet) {
            return new C0686q(context, attributeSet);
        }

        /* renamed from: c1 */
        public void mo4209c1(RecyclerView recyclerView) {
        }

        /* renamed from: c2 */
        public void m4210c2(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f4656b = null;
                this.f4655a = null;
                height = 0;
                this.f4671q = 0;
            } else {
                this.f4656b = recyclerView;
                this.f4655a = recyclerView.f4534f;
                this.f4671q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f4672r = height;
            this.f4669o = NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
            this.f4670p = NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH;
        }

        /* renamed from: d0 */
        public C0686q mo2793d0(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0686q ? new C0686q((C0686q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0686q((ViewGroup.MarginLayoutParams) layoutParams) : new C0686q(layoutParams);
        }

        @Deprecated
        /* renamed from: d1 */
        public void m4211d1(RecyclerView recyclerView) {
        }

        /* renamed from: d2 */
        public boolean m4212d2(View view, int i10, int i11, C0686q c0686q) {
            return (!view.isLayoutRequested() && this.f4665k && m4149S0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) c0686q).width) && m4149S0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) c0686q).height)) ? false : true;
        }

        /* renamed from: e0 */
        public int m4213e0() {
            return -1;
        }

        /* renamed from: e1 */
        public void mo3818e1(RecyclerView recyclerView, C0692w c0692w) {
            m4211d1(recyclerView);
        }

        /* renamed from: e2 */
        public boolean mo3819e2() {
            return false;
        }

        /* renamed from: f0 */
        public int m4214f0(View view) {
            return ((C0686q) view.getLayoutParams()).f4680c.bottom;
        }

        /* renamed from: f1 */
        public View mo3756f1(View view, int i10, C0692w c0692w, C0668b0 c0668b0) {
            return null;
        }

        /* renamed from: f2 */
        public boolean m4215f2(View view, int i10, int i11, C0686q c0686q) {
            return (this.f4665k && m4149S0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) c0686q).width) && m4149S0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) c0686q).height)) ? false : true;
        }

        /* renamed from: g0 */
        public View m4216g0(int i10) {
            C0703b c0703b = this.f4655a;
            return c0703b != null ? c0703b.m4455f(i10) : null;
        }

        /* renamed from: g1 */
        public void mo3822g1(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4656b;
            m4218h1(recyclerView.f4531c, recyclerView.f4553o0, accessibilityEvent);
        }

        /* renamed from: g2 */
        public void mo2800g2(RecyclerView recyclerView, C0668b0 c0668b0, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: h0 */
        public int m4217h0() {
            C0703b c0703b = this.f4655a;
            return c0703b != null ? c0703b.m4456g() : 0;
        }

        /* renamed from: h1 */
        public void m4218h1(C0692w c0692w, C0668b0 c0668b0, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1)) {
                z10 = true;
                if (!this.f4656b.canScrollVertically(-1)) {
                    z10 = true;
                    if (!this.f4656b.canScrollHorizontally(-1)) {
                        z10 = this.f4656b.canScrollHorizontally(1);
                    }
                }
            }
            accessibilityEvent.setScrollable(z10);
            AbstractC0677h abstractC0677h = this.f4656b.f4548m;
            if (abstractC0677h != null) {
                accessibilityEvent.setItemCount(abstractC0677h.mo3013n());
            }
        }

        /* renamed from: h2 */
        public void mo2803h2(AbstractC0666a0 abstractC0666a0) {
            AbstractC0666a0 abstractC0666a02 = this.f4661g;
            if (abstractC0666a02 != null && abstractC0666a0 != abstractC0666a02 && abstractC0666a02.m3993h()) {
                this.f4661g.m4001r();
            }
            this.f4661g = abstractC0666a0;
            abstractC0666a0.m4000q(this.f4656b, this);
        }

        /* renamed from: i1 */
        public void mo2806i1(C0692w c0692w, C0668b0 c0668b0, C7535k c7535k) {
            if (this.f4656b.canScrollVertically(-1) || this.f4656b.canScrollHorizontally(-1)) {
                c7535k.m32202a(NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
                c7535k.m32231p0(true);
            }
            if (this.f4656b.canScrollVertically(1) || this.f4656b.canScrollHorizontally(1)) {
                c7535k.m32202a(4096);
                c7535k.m32231p0(true);
            }
            c7535k.m32201Z(C7535k.b.m32253a(mo2721E0(c0692w, c0668b0), mo2815l0(c0692w, c0668b0), m4183Q0(c0692w, c0668b0), m4163F0(c0692w, c0668b0)));
        }

        /* renamed from: i2 */
        public void m4219i2() {
            AbstractC0666a0 abstractC0666a0 = this.f4661g;
            if (abstractC0666a0 != null) {
                abstractC0666a0.m4001r();
            }
        }

        /* renamed from: j0 */
        public final int[] m4220j0(View view, Rect rect) {
            int m4226o = m4226o();
            int m4225n = m4225n();
            int m4169I0 = m4169I0();
            int m4222k = m4222k();
            int m4230u0 = m4230u0();
            int m4206a = m4206a();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width();
            int height = rect.height();
            int i10 = left - m4226o;
            int min = Math.min(0, i10);
            int i11 = top - m4225n;
            int min2 = Math.min(0, i11);
            int i12 = (width + left) - (m4169I0 - m4222k);
            int max = Math.max(0, i12);
            int max2 = Math.max(0, (height + top) - (m4230u0 - m4206a));
            if (m4234x0() == 1) {
                min = max != 0 ? max : Math.max(min, i12);
            } else if (min == 0) {
                min = Math.min(i10, max);
            }
            if (min2 == 0) {
                min2 = Math.min(i11, max2);
            }
            return new int[]{min, min2};
        }

        /* renamed from: j1 */
        public void m4221j1(C7535k c7535k) {
            RecyclerView recyclerView = this.f4656b;
            mo2806i1(recyclerView.f4531c, recyclerView.f4553o0, c7535k);
        }

        /* renamed from: j2 */
        public boolean mo2809j2() {
            return false;
        }

        /* renamed from: k */
        public int m4222k() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null ? recyclerView.getPaddingRight() : 0;
        }

        /* renamed from: k0 */
        public boolean m4223k0() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null && recyclerView.f4538h;
        }

        /* renamed from: k1 */
        public void m4224k1(View view, C7535k c7535k) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (m3862j0 == null || m3862j0.m4037A() || this.f4655a.m4463n(m3862j0.f4620a)) {
                return;
            }
            RecyclerView recyclerView = this.f4656b;
            mo2816l1(recyclerView.f4531c, recyclerView.f4553o0, view, c7535k);
        }

        /* renamed from: l0 */
        public int mo2815l0(C0692w c0692w, C0668b0 c0668b0) {
            return -1;
        }

        /* renamed from: l1 */
        public void mo2816l1(C0692w c0692w, C0668b0 c0668b0, View view, C7535k c7535k) {
        }

        /* renamed from: m0 */
        public int mo2820m0(View view) {
            return view.getBottom() + m4214f0(view);
        }

        /* renamed from: m1 */
        public View mo2821m1(View view, int i10) {
            return null;
        }

        /* renamed from: n */
        public int m4225n() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null ? recyclerView.getPaddingTop() : 0;
        }

        /* renamed from: n0 */
        public void mo2825n0(View view, Rect rect) {
            RecyclerView.m3863k0(view, rect);
        }

        /* renamed from: n1 */
        public void mo2826n1(RecyclerView recyclerView, int i10, int i11) {
        }

        /* renamed from: o */
        public int m4226o() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null ? recyclerView.getPaddingLeft() : 0;
        }

        /* renamed from: o0 */
        public int mo2830o0(View view) {
            return view.getLeft() - m4237y0(view);
        }

        /* renamed from: o1 */
        public void mo2831o1(RecyclerView recyclerView) {
        }

        /* renamed from: p0 */
        public int m4227p0(View view) {
            Rect rect = ((C0686q) view.getLayoutParams()).f4680c;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: p1 */
        public void mo2835p1(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        /* renamed from: q0 */
        public int m4228q0(View view) {
            Rect rect = ((C0686q) view.getLayoutParams()).f4680c;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: q1 */
        public void mo2839q1(RecyclerView recyclerView, int i10, int i11) {
        }

        /* renamed from: r0 */
        public int mo2843r0(View view) {
            return view.getRight() + m4159D0(view);
        }

        /* renamed from: r1 */
        public void mo2844r1(RecyclerView recyclerView, int i10, int i11) {
        }

        /* renamed from: s0 */
        public int mo2848s0(View view) {
            return view.getTop() - m4166G0(view);
        }

        /* renamed from: s1 */
        public void mo3767s1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            mo2844r1(recyclerView, i10, i11);
        }

        /* renamed from: t0 */
        public View m4229t0() {
            View focusedChild;
            RecyclerView recyclerView = this.f4656b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4655a.m4463n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: t1 */
        public void mo2852t1(C0692w c0692w, C0668b0 c0668b0) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: u0 */
        public int m4230u0() {
            return this.f4672r;
        }

        /* renamed from: u1 */
        public void mo2856u1(C0668b0 c0668b0) {
        }

        /* renamed from: v0 */
        public int m4231v0() {
            return this.f4670p;
        }

        /* renamed from: v1 */
        public void mo2860v1(C0692w c0692w, C0668b0 c0668b0, int i10, int i11) {
            this.f4656b.m3978x(i10, i11);
        }

        /* renamed from: w */
        public int m4232w() {
            RecyclerView recyclerView = this.f4656b;
            return recyclerView != null ? C6824g0.m31485I(recyclerView) : 0;
        }

        /* renamed from: w0 */
        public int m4233w0() {
            RecyclerView recyclerView = this.f4656b;
            AbstractC0677h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            return adapter != null ? adapter.mo3013n() : 0;
        }

        @Deprecated
        /* renamed from: w1 */
        public boolean mo2864w1(RecyclerView recyclerView, View view, View view2) {
            return m4189T0() || recyclerView.m3982y0();
        }

        /* renamed from: x0 */
        public int m4234x0() {
            return C6824g0.m31473C(this.f4656b);
        }

        /* renamed from: x1 */
        public boolean m4235x1(RecyclerView recyclerView, C0668b0 c0668b0, View view, View view2) {
            return mo2864w1(recyclerView, view, view2);
        }

        /* renamed from: y */
        public void m4236y(View view) {
            m4238z(view, -1);
        }

        /* renamed from: y0 */
        public int m4237y0(View view) {
            return ((C0686q) view.getLayoutParams()).f4680c.left;
        }

        /* renamed from: y1 */
        public void mo2871y1(Parcelable parcelable) {
        }

        /* renamed from: z */
        public void m4238z(View view, int i10) {
            m4157C(view, i10, true);
        }

        /* renamed from: z0 */
        public int m4239z0() {
            return C6824g0.m31475D(this.f4656b);
        }

        /* renamed from: z1 */
        public Parcelable mo2875z1() {
            return null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$q.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$q.class */
    public static class C0686q extends ViewGroup.MarginLayoutParams {

        /* renamed from: b */
        public AbstractC0674e0 f4679b;

        /* renamed from: c */
        public final Rect f4680c;

        /* renamed from: d */
        public boolean f4681d;

        /* renamed from: e */
        public boolean f4682e;

        public C0686q(int i10, int i11) {
            super(i10, i11);
            this.f4680c = new Rect();
            this.f4681d = true;
            this.f4682e = false;
        }

        public C0686q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4680c = new Rect();
            this.f4681d = true;
            this.f4682e = false;
        }

        public C0686q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4680c = new Rect();
            this.f4681d = true;
            this.f4682e = false;
        }

        public C0686q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4680c = new Rect();
            this.f4681d = true;
            this.f4682e = false;
        }

        public C0686q(C0686q c0686q) {
            super((ViewGroup.LayoutParams) c0686q);
            this.f4680c = new Rect();
            this.f4681d = true;
            this.f4682e = false;
        }

        @Deprecated
        /* renamed from: b */
        public int m4246b() {
            return this.f4679b.m4065o();
        }

        /* renamed from: c */
        public int m4247c() {
            return this.f4679b.m4068r();
        }

        /* renamed from: j */
        public boolean m4248j() {
            return this.f4679b.m4040D();
        }

        /* renamed from: k */
        public boolean m4249k() {
            return this.f4679b.m4037A();
        }

        /* renamed from: l */
        public boolean m4250l() {
            return this.f4679b.m4075y();
        }

        /* renamed from: m */
        public boolean m4251m() {
            return this.f4679b.m4041E();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$r.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$r.class */
    public interface InterfaceC0687r {
        /* renamed from: b */
        void mo4252b(View view);

        /* renamed from: d */
        void mo4253d(View view);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$s.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$s.class */
    public static abstract class AbstractC0688s {
        /* renamed from: a */
        public abstract boolean mo4254a(int i10, int i11);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$t.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$t.class */
    public interface InterfaceC0689t {
        /* renamed from: a */
        void mo4255a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo4256c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: e */
        void mo4257e(boolean z10);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$u.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$u.class */
    public static abstract class AbstractC0690u {
        /* renamed from: a */
        public void mo4258a(RecyclerView recyclerView, int i10) {
        }

        /* renamed from: b */
        public void mo4259b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$v.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$v.class */
    public static class C0691v {

        /* renamed from: a */
        public SparseArray<a> f4683a = new SparseArray<>();

        /* renamed from: b */
        public int f4684b = 0;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$v$a.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$v$a.class */
        public static class a {

            /* renamed from: a */
            public final ArrayList<AbstractC0674e0> f4685a = new ArrayList<>();

            /* renamed from: b */
            public int f4686b = 5;

            /* renamed from: c */
            public long f4687c = 0;

            /* renamed from: d */
            public long f4688d = 0;
        }

        /* renamed from: a */
        public void m4260a() {
            this.f4684b++;
        }

        /* renamed from: b */
        public void m4261b() {
            for (int i10 = 0; i10 < this.f4683a.size(); i10++) {
                this.f4683a.valueAt(i10).f4685a.clear();
            }
        }

        /* renamed from: c */
        public void m4262c() {
            this.f4684b--;
        }

        /* renamed from: d */
        public void m4263d(int i10, long j10) {
            a m4266g = m4266g(i10);
            m4266g.f4688d = m4269j(m4266g.f4688d, j10);
        }

        /* renamed from: e */
        public void m4264e(int i10, long j10) {
            a m4266g = m4266g(i10);
            m4266g.f4687c = m4269j(m4266g.f4687c, j10);
        }

        /* renamed from: f */
        public AbstractC0674e0 m4265f(int i10) {
            a aVar = this.f4683a.get(i10);
            if (aVar == null || aVar.f4685a.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC0674e0> arrayList = aVar.f4685a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).m4073w()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: g */
        public final a m4266g(int i10) {
            a aVar = this.f4683a.get(i10);
            a aVar2 = aVar;
            if (aVar == null) {
                aVar2 = new a();
                this.f4683a.put(i10, aVar2);
            }
            return aVar2;
        }

        /* renamed from: h */
        public void m4267h(AbstractC0677h abstractC0677h, AbstractC0677h abstractC0677h2, boolean z10) {
            if (abstractC0677h != null) {
                m4262c();
            }
            if (!z10 && this.f4684b == 0) {
                m4261b();
            }
            if (abstractC0677h2 != null) {
                m4260a();
            }
        }

        /* renamed from: i */
        public void m4268i(AbstractC0674e0 abstractC0674e0) {
            int m4067q = abstractC0674e0.m4067q();
            ArrayList<AbstractC0674e0> arrayList = m4266g(m4067q).f4685a;
            if (this.f4683a.get(m4067q).f4686b <= arrayList.size()) {
                return;
            }
            abstractC0674e0.m4045I();
            arrayList.add(abstractC0674e0);
        }

        /* renamed from: j */
        public long m4269j(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        /* renamed from: k */
        public void m4270k(int i10, int i11) {
            a m4266g = m4266g(i10);
            m4266g.f4686b = i11;
            ArrayList<AbstractC0674e0> arrayList = m4266g.f4685a;
            while (arrayList.size() > i11) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: l */
        public boolean m4271l(int i10, long j10, long j11) {
            long j12 = m4266g(i10).f4688d;
            return j12 == 0 || j10 + j12 < j11;
        }

        /* renamed from: m */
        public boolean m4272m(int i10, long j10, long j11) {
            long j12 = m4266g(i10).f4687c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$w.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$w.class */
    public final class C0692w {

        /* renamed from: a */
        public final ArrayList<AbstractC0674e0> f4689a;

        /* renamed from: b */
        public ArrayList<AbstractC0674e0> f4690b;

        /* renamed from: c */
        public final ArrayList<AbstractC0674e0> f4691c;

        /* renamed from: d */
        public final List<AbstractC0674e0> f4692d;

        /* renamed from: e */
        public int f4693e;

        /* renamed from: f */
        public int f4694f;

        /* renamed from: g */
        public C0691v f4695g;

        /* renamed from: h */
        public final RecyclerView f4696h;

        public C0692w(RecyclerView recyclerView) {
            this.f4696h = recyclerView;
            ArrayList<AbstractC0674e0> arrayList = new ArrayList<>();
            this.f4689a = arrayList;
            this.f4690b = null;
            this.f4691c = new ArrayList<>();
            this.f4692d = Collections.unmodifiableList(arrayList);
            this.f4693e = 2;
            this.f4694f = 2;
        }

        /* renamed from: A */
        public void m4273A(int i10) {
            m4286a(this.f4691c.get(i10), true);
            this.f4691c.remove(i10);
        }

        /* renamed from: B */
        public void m4274B(View view) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (m3862j0.m4039C()) {
                this.f4696h.removeDetachedView(view, false);
            }
            if (m3862j0.m4038B()) {
                m3862j0.m4052P();
            } else if (m3862j0.m4053Q()) {
                m3862j0.m4058h();
            }
            m4275C(m3862j0);
            if (this.f4696h.f4521O == null || m3862j0.m4076z()) {
                return;
            }
            this.f4696h.f4521O.mo4123j(m3862j0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (r5.m4076z() != false) goto L25;
         */
        /* renamed from: C */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m4275C(androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 r5) {
            /*
                Method dump skipped, instructions count: 481
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0692w.m4275C(androidx.recyclerview.widget.RecyclerView$e0):void");
        }

        /* renamed from: D */
        public void m4276D(View view) {
            ArrayList<AbstractC0674e0> arrayList;
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            if (!m3862j0.m4071u(12) && m3862j0.m4040D() && !this.f4696h.m3959q(m3862j0)) {
                if (this.f4690b == null) {
                    this.f4690b = new ArrayList<>();
                }
                m3862j0.m4049M(this, true);
                arrayList = this.f4690b;
            } else {
                if (m3862j0.m4075y() && !m3862j0.m4037A() && !this.f4696h.f4548m.m4098u()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.f4696h.m3900Q());
                }
                m3862j0.m4049M(this, false);
                arrayList = this.f4689a;
            }
            arrayList.add(m3862j0);
        }

        /* renamed from: E */
        public void m4277E(C0691v c0691v) {
            C0691v c0691v2 = this.f4695g;
            if (c0691v2 != null) {
                c0691v2.m4262c();
            }
            this.f4695g = c0691v;
            if (c0691v == null || this.f4696h.getAdapter() == null) {
                return;
            }
            this.f4695g.m4260a();
        }

        /* renamed from: F */
        public void m4278F(AbstractC0670c0 abstractC0670c0) {
        }

        /* renamed from: G */
        public void m4279G(int i10) {
            this.f4693e = i10;
            m4283K();
        }

        /* renamed from: H */
        public final boolean m4280H(AbstractC0674e0 abstractC0674e0, int i10, int i11, long j10) {
            abstractC0674e0.f4638s = null;
            abstractC0674e0.f4637r = this.f4696h;
            int m4067q = abstractC0674e0.m4067q();
            long nanoTime = this.f4696h.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f4695g.m4271l(m4067q, nanoTime, j10)) {
                return false;
            }
            this.f4696h.f4548m.m4093h(abstractC0674e0, i10);
            this.f4695g.m4263d(abstractC0674e0.m4067q(), this.f4696h.getNanoTime() - nanoTime);
            m4287b(abstractC0674e0);
            if (!this.f4696h.f4553o0.m4014h()) {
                return true;
            }
            abstractC0674e0.f4626g = i11;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0310  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x035a  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x032d  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02d5  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 m4281I(int r8, boolean r9, long r10) {
            /*
                Method dump skipped, instructions count: 971
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0692w.m4281I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        /* renamed from: J */
        public void m4282J(AbstractC0674e0 abstractC0674e0) {
            (abstractC0674e0.f4634o ? this.f4690b : this.f4689a).remove(abstractC0674e0);
            abstractC0674e0.f4633n = null;
            abstractC0674e0.f4634o = false;
            abstractC0674e0.m4058h();
        }

        /* renamed from: K */
        public void m4283K() {
            AbstractC0685p abstractC0685p = this.f4696h.f4550n;
            this.f4694f = this.f4693e + (abstractC0685p != null ? abstractC0685p.f4667m : 0);
            for (int size = this.f4691c.size() - 1; size >= 0 && this.f4691c.size() > this.f4694f; size--) {
                m4273A(size);
            }
        }

        /* renamed from: L */
        public boolean m4284L(AbstractC0674e0 abstractC0674e0) {
            if (abstractC0674e0.m4037A()) {
                return this.f4696h.f4553o0.m4014h();
            }
            int i10 = abstractC0674e0.f4622c;
            if (i10 < 0 || i10 >= this.f4696h.f4548m.mo3013n()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC0674e0 + this.f4696h.m3900Q());
            }
            boolean z10 = false;
            if (!this.f4696h.f4553o0.m4014h() && this.f4696h.f4548m.mo3018q(abstractC0674e0.f4622c) != abstractC0674e0.m4067q()) {
                return false;
            }
            if (!this.f4696h.f4548m.m4098u()) {
                return true;
            }
            if (abstractC0674e0.m4066p() == this.f4696h.f4548m.mo3016p(abstractC0674e0.f4622c)) {
                z10 = true;
            }
            return z10;
        }

        /* renamed from: M */
        public void m4285M(int i10, int i11) {
            int i12;
            for (int size = this.f4691c.size() - 1; size >= 0; size--) {
                AbstractC0674e0 abstractC0674e0 = this.f4691c.get(size);
                if (abstractC0674e0 != null && (i12 = abstractC0674e0.f4622c) >= i10 && i12 < i11 + i10) {
                    abstractC0674e0.m4055e(2);
                    m4273A(size);
                }
            }
        }

        /* renamed from: a */
        public void m4286a(AbstractC0674e0 abstractC0674e0, boolean z10) {
            RecyclerView.m3864s(abstractC0674e0);
            View view = abstractC0674e0.f4620a;
            C0715n c0715n = this.f4696h.f4567v0;
            if (c0715n != null) {
                C6805a m4641n = c0715n.m4641n();
                C6824g0.m31539p0(view, m4641n instanceof C0715n.a ? ((C0715n.a) m4641n).m4649n(view) : null);
            }
            if (z10) {
                m4292g(abstractC0674e0);
            }
            abstractC0674e0.f4638s = null;
            abstractC0674e0.f4637r = null;
            m4294i().m4268i(abstractC0674e0);
        }

        /* renamed from: b */
        public final void m4287b(AbstractC0674e0 abstractC0674e0) {
            if (this.f4696h.m3979x0()) {
                View view = abstractC0674e0.f4620a;
                if (C6824g0.m31469A(view) == 0) {
                    C6824g0.m31557y0(view, 1);
                }
                C0715n c0715n = this.f4696h.f4567v0;
                if (c0715n == null) {
                    return;
                }
                C6805a m4641n = c0715n.m4641n();
                if (m4641n instanceof C0715n.a) {
                    ((C0715n.a) m4641n).m4650o(view);
                }
                C6824g0.m31539p0(view, m4641n);
            }
        }

        /* renamed from: c */
        public void m4288c() {
            this.f4689a.clear();
            m4311z();
        }

        /* renamed from: d */
        public void m4289d() {
            int size = this.f4691c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4691c.get(i10).m4056f();
            }
            int size2 = this.f4689a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f4689a.get(i11).m4056f();
            }
            ArrayList<AbstractC0674e0> arrayList = this.f4690b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f4690b.get(i12).m4056f();
                }
            }
        }

        /* renamed from: e */
        public void m4290e() {
            this.f4689a.clear();
            ArrayList<AbstractC0674e0> arrayList = this.f4690b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m4291f(int i10) {
            if (i10 >= 0 && i10 < this.f4696h.f4553o0.m4009c()) {
                return !this.f4696h.f4553o0.m4014h() ? i10 : this.f4696h.f4533e.m4436m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + this.f4696h.f4553o0.m4009c() + this.f4696h.m3900Q());
        }

        /* renamed from: g */
        public void m4292g(AbstractC0674e0 abstractC0674e0) {
            InterfaceC0693x interfaceC0693x = this.f4696h.f4552o;
            if (interfaceC0693x != null) {
                interfaceC0693x.mo2559a(abstractC0674e0);
            }
            int size = this.f4696h.f4554p.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f4696h.f4554p.get(i10).mo2559a(abstractC0674e0);
            }
            AbstractC0677h abstractC0677h = this.f4696h.f4548m;
            if (abstractC0677h != null) {
                abstractC0677h.mo3002T(abstractC0674e0);
            }
            RecyclerView recyclerView = this.f4696h;
            if (recyclerView.f4553o0 != null) {
                recyclerView.f4536g.m4699q(abstractC0674e0);
            }
        }

        /* renamed from: h */
        public AbstractC0674e0 m4293h(int i10) {
            int size;
            int m4436m;
            ArrayList<AbstractC0674e0> arrayList = this.f4690b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0674e0 abstractC0674e0 = this.f4690b.get(i11);
                if (!abstractC0674e0.m4053Q() && abstractC0674e0.m4068r() == i10) {
                    abstractC0674e0.m4055e(32);
                    return abstractC0674e0;
                }
            }
            if (!this.f4696h.f4548m.m4098u() || (m4436m = this.f4696h.f4533e.m4436m(i10)) <= 0 || m4436m >= this.f4696h.f4548m.mo3013n()) {
                return null;
            }
            long mo3016p = this.f4696h.f4548m.mo3016p(m4436m);
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC0674e0 abstractC0674e02 = this.f4690b.get(i12);
                if (!abstractC0674e02.m4053Q() && abstractC0674e02.m4066p() == mo3016p) {
                    abstractC0674e02.m4055e(32);
                    return abstractC0674e02;
                }
            }
            return null;
        }

        /* renamed from: i */
        public C0691v m4294i() {
            if (this.f4695g == null) {
                this.f4695g = new C0691v();
            }
            return this.f4695g;
        }

        /* renamed from: j */
        public int m4295j() {
            return this.f4689a.size();
        }

        /* renamed from: k */
        public List<AbstractC0674e0> m4296k() {
            return this.f4692d;
        }

        /* renamed from: l */
        public AbstractC0674e0 m4297l(long j10, int i10, boolean z10) {
            for (int size = this.f4689a.size() - 1; size >= 0; size--) {
                AbstractC0674e0 abstractC0674e0 = this.f4689a.get(size);
                if (abstractC0674e0.m4066p() == j10 && !abstractC0674e0.m4053Q()) {
                    if (i10 == abstractC0674e0.m4067q()) {
                        abstractC0674e0.m4055e(32);
                        if (abstractC0674e0.m4037A() && !this.f4696h.f4553o0.m4014h()) {
                            abstractC0674e0.m4047K(2, 14);
                        }
                        return abstractC0674e0;
                    }
                    if (!z10) {
                        this.f4689a.remove(size);
                        this.f4696h.removeDetachedView(abstractC0674e0.f4620a, false);
                        m4310y(abstractC0674e0.f4620a);
                    }
                }
            }
            for (int size2 = this.f4691c.size() - 1; size2 >= 0; size2--) {
                AbstractC0674e0 abstractC0674e02 = this.f4691c.get(size2);
                if (abstractC0674e02.m4066p() == j10 && !abstractC0674e02.m4073w()) {
                    if (i10 == abstractC0674e02.m4067q()) {
                        if (!z10) {
                            this.f4691c.remove(size2);
                        }
                        return abstractC0674e02;
                    }
                    if (!z10) {
                        m4273A(size2);
                        return null;
                    }
                }
            }
            return null;
        }

        /* renamed from: m */
        public AbstractC0674e0 m4298m(int i10, boolean z10) {
            View m4454e;
            int size = this.f4689a.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC0674e0 abstractC0674e0 = this.f4689a.get(i11);
                if (!abstractC0674e0.m4053Q() && abstractC0674e0.m4068r() == i10 && !abstractC0674e0.m4075y() && (this.f4696h.f4553o0.f4600h || !abstractC0674e0.m4037A())) {
                    abstractC0674e0.m4055e(32);
                    return abstractC0674e0;
                }
            }
            if (z10 || (m4454e = this.f4696h.f4534f.m4454e(i10)) == null) {
                int size2 = this.f4691c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    AbstractC0674e0 abstractC0674e02 = this.f4691c.get(i12);
                    if (!abstractC0674e02.m4075y() && abstractC0674e02.m4068r() == i10 && !abstractC0674e02.m4073w()) {
                        if (!z10) {
                            this.f4691c.remove(i12);
                        }
                        return abstractC0674e02;
                    }
                }
                return null;
            }
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(m4454e);
            this.f4696h.f4534f.m4468s(m4454e);
            int m4462m = this.f4696h.f4534f.m4462m(m4454e);
            if (m4462m != -1) {
                this.f4696h.f4534f.m4453d(m4462m);
                m4276D(m4454e);
                m3862j0.m4055e(8224);
                return m3862j0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m3862j0 + this.f4696h.m3900Q());
        }

        /* renamed from: n */
        public View m4299n(int i10) {
            return this.f4689a.get(i10).f4620a;
        }

        /* renamed from: o */
        public View m4300o(int i10) {
            return m4301p(i10, false);
        }

        /* renamed from: p */
        public View m4301p(int i10, boolean z10) {
            return m4281I(i10, z10, Long.MAX_VALUE).f4620a;
        }

        /* renamed from: q */
        public final void m4302q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m4302q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: r */
        public final void m4303r(AbstractC0674e0 abstractC0674e0) {
            View view = abstractC0674e0.f4620a;
            if (view instanceof ViewGroup) {
                m4302q((ViewGroup) view, false);
            }
        }

        /* renamed from: s */
        public void m4304s() {
            int size = this.f4691c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0686q c0686q = (C0686q) this.f4691c.get(i10).f4620a.getLayoutParams();
                if (c0686q != null) {
                    c0686q.f4681d = true;
                }
            }
        }

        /* renamed from: t */
        public void m4305t() {
            int size = this.f4691c.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC0674e0 abstractC0674e0 = this.f4691c.get(i10);
                if (abstractC0674e0 != null) {
                    abstractC0674e0.m4055e(6);
                    abstractC0674e0.m4054d(null);
                }
            }
            AbstractC0677h abstractC0677h = this.f4696h.f4548m;
            if (abstractC0677h == null || !abstractC0677h.m4098u()) {
                m4311z();
            }
        }

        /* renamed from: u */
        public void m4306u(int i10, int i11) {
            int size = this.f4691c.size();
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC0674e0 abstractC0674e0 = this.f4691c.get(i12);
                if (abstractC0674e0 != null && abstractC0674e0.f4622c >= i10) {
                    abstractC0674e0.m4042F(i11, false);
                }
            }
        }

        /* renamed from: v */
        public void m4307v(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f4691c.size();
            for (int i16 = 0; i16 < size; i16++) {
                AbstractC0674e0 abstractC0674e0 = this.f4691c.get(i16);
                if (abstractC0674e0 != null && (i15 = abstractC0674e0.f4622c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        abstractC0674e0.m4042F(i11 - i10, false);
                    } else {
                        abstractC0674e0.m4042F(i12, false);
                    }
                }
            }
        }

        /* renamed from: w */
        public void m4308w(int i10, int i11, boolean z10) {
            for (int size = this.f4691c.size() - 1; size >= 0; size--) {
                AbstractC0674e0 abstractC0674e0 = this.f4691c.get(size);
                if (abstractC0674e0 != null) {
                    int i12 = abstractC0674e0.f4622c;
                    if (i12 >= i10 + i11) {
                        abstractC0674e0.m4042F(-i11, z10);
                    } else if (i12 >= i10) {
                        abstractC0674e0.m4055e(8);
                        m4273A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        public void m4309x(AbstractC0677h abstractC0677h, AbstractC0677h abstractC0677h2, boolean z10) {
            m4288c();
            m4294i().m4267h(abstractC0677h, abstractC0677h2, z10);
        }

        /* renamed from: y */
        public void m4310y(View view) {
            AbstractC0674e0 m3862j0 = RecyclerView.m3862j0(view);
            m3862j0.f4633n = null;
            m3862j0.f4634o = false;
            m3862j0.m4058h();
            m4275C(m3862j0);
        }

        /* renamed from: z */
        public void m4311z() {
            for (int size = this.f4691c.size() - 1; size >= 0; size--) {
                m4273A(size);
            }
            this.f4691c.clear();
            if (RecyclerView.f4494M0) {
                this.f4696h.f4551n0.m4523b();
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$x.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$x.class */
    public interface InterfaceC0693x {
        /* renamed from: a */
        void mo2559a(AbstractC0674e0 abstractC0674e0);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$y.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$y.class */
    public class C0694y extends AbstractC0679j {

        /* renamed from: a */
        public final RecyclerView f4697a;

        public C0694y(RecyclerView recyclerView) {
            this.f4697a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0679j
        /* renamed from: a */
        public void mo2418a() {
            this.f4697a.m3956p(null);
            RecyclerView recyclerView = this.f4697a;
            recyclerView.f4553o0.f4599g = true;
            recyclerView.m3909U0(true);
            if (this.f4697a.f4533e.m4439p()) {
                return;
            }
            this.f4697a.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0679j
        /* renamed from: c */
        public void mo4109c(int i10, int i11, Object obj) {
            this.f4697a.m3956p(null);
            if (this.f4697a.f4533e.m4441r(i10, i11, obj)) {
                m4312f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0679j
        /* renamed from: d */
        public void mo4110d(int i10, int i11, int i12) {
            this.f4697a.m3956p(null);
            if (this.f4697a.f4533e.m4442s(i10, i11, i12)) {
                m4312f();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0679j
        /* renamed from: e */
        public void mo4111e(int i10, int i11) {
            this.f4697a.m3956p(null);
            if (this.f4697a.f4533e.m4443t(i10, i11)) {
                m4312f();
            }
        }

        /* renamed from: f */
        public void m4312f() {
            if (RecyclerView.f4493L0) {
                RecyclerView recyclerView = this.f4697a;
                if (recyclerView.f4564u && recyclerView.f4562t) {
                    C6824g0.m31523h0(recyclerView, recyclerView.f4540i);
                    return;
                }
            }
            RecyclerView recyclerView2 = this.f4697a;
            recyclerView2.f4503C = true;
            recyclerView2.requestLayout();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/RecyclerView$z.class
     */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$z.class */
    public static class C0695z extends AbstractC8783a {
        public static final Parcelable.Creator<C0695z> CREATOR = new a();

        /* renamed from: d */
        public Parcelable f4698d;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:androidx/recyclerview/widget/RecyclerView$z$a.class
         */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/RecyclerView$z$a.class */
        public class a implements Parcelable.ClassLoaderCreator<C0695z> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0695z createFromParcel(Parcel parcel) {
                return new C0695z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0695z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0695z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0695z[] newArray(int i10) {
                return new C0695z[i10];
            }
        }

        public C0695z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4698d = parcel.readParcelable(classLoader == null ? AbstractC0685p.class.getClassLoader() : classLoader);
        }

        public C0695z(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: c */
        public void m4313c(C0695z c0695z) {
            this.f4698d = c0695z.f4698d;
        }

        @Override // p341u0.AbstractC8783a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f4698d, 0);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f4491J0 = false;
        f4492K0 = i10 >= 23;
        f4493L0 = true;
        f4494M0 = true;
        f4495N0 = false;
        f4496O0 = false;
        Class<?> cls = Integer.TYPE;
        f4497P0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4498Q0 = new InterpolatorC0669c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8516a.f39871a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4530b = new C0694y(this);
        this.f4531c = new C0692w(this);
        this.f4536g = new C0720s();
        this.f4540i = new RunnableC0665a(this);
        this.f4542j = new Rect();
        this.f4544k = new Rect();
        this.f4546l = new RectF();
        this.f4554p = new ArrayList();
        this.f4556q = new ArrayList<>();
        this.f4558r = new ArrayList<>();
        this.f4570x = 0;
        this.f4509F = false;
        this.f4511G = false;
        this.f4513H = 0;
        this.f4515I = 0;
        this.f4516J = new C0681l();
        this.f4521O = new C0704c();
        this.f4522P = 0;
        this.f4523Q = -1;
        this.f4541i0 = Float.MIN_VALUE;
        this.f4543j0 = Float.MIN_VALUE;
        this.f4545k0 = true;
        this.f4547l0 = new RunnableC0672d0(this);
        this.f4551n0 = f4494M0 ? new RunnableC0706e.b() : null;
        this.f4553o0 = new C0668b0();
        this.f4559r0 = false;
        this.f4561s0 = false;
        this.f4563t0 = new C0683n(this);
        this.f4565u0 = false;
        this.f4571x0 = new int[2];
        this.f4575z0 = new int[2];
        this.f4500A0 = new int[2];
        this.f4502B0 = new int[2];
        this.f4504C0 = new ArrayList();
        this.f4506D0 = new RunnableC0667b(this);
        this.f4510F0 = 0;
        this.f4512G0 = 0;
        this.f4514H0 = new C0671d(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4529W = viewConfiguration.getScaledTouchSlop();
        this.f4541i0 = C6858v0.m31658b(viewConfiguration, context);
        this.f4543j0 = C6858v0.m31660d(viewConfiguration, context);
        this.f4537g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4539h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4521O.m4136w(this.f4563t0);
        m3965s0();
        m3971u0();
        m3968t0();
        if (C6824g0.m31469A(this) == 0) {
            C6824g0.m31557y0(this, 1);
        }
        this.f4505D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0715n(this));
        int[] iArr = C8519d.f39884f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        C6824g0.m31535n0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(C8519d.f39893o);
        if (obtainStyledAttributes.getInt(C8519d.f39887i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4538h = obtainStyledAttributes.getBoolean(C8519d.f39886h, true);
        boolean z10 = obtainStyledAttributes.getBoolean(C8519d.f39888j, false);
        this.f4566v = z10;
        if (z10) {
            m3974v0((StateListDrawable) obtainStyledAttributes.getDrawable(C8519d.f39891m), obtainStyledAttributes.getDrawable(C8519d.f39892n), (StateListDrawable) obtainStyledAttributes.getDrawable(C8519d.f39889k), obtainStyledAttributes.getDrawable(C8519d.f39890l));
        }
        obtainStyledAttributes.recycle();
        m3975w(context, string, attributeSet, i10, 0);
        int[] iArr2 = f4490I0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        C6824g0.m31535n0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
    }

    /* renamed from: X */
    public static RecyclerView m3857X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView m3857X = m3857X(viewGroup.getChildAt(i10));
            if (m3857X != null) {
                return m3857X;
            }
        }
        return null;
    }

    private C6851s getScrollingChildHelper() {
        if (this.f4573y0 == null) {
            this.f4573y0 = new C6851s(this);
        }
        return this.f4573y0;
    }

    /* renamed from: j0 */
    public static AbstractC0674e0 m3862j0(View view) {
        if (view == null) {
            return null;
        }
        return ((C0686q) view.getLayoutParams()).f4679b;
    }

    /* renamed from: k0 */
    public static void m3863k0(View view, Rect rect) {
        C0686q c0686q = (C0686q) view.getLayoutParams();
        Rect rect2 = c0686q.f4680c;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0686q).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0686q).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0686q).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0686q).bottomMargin);
    }

    /* renamed from: s */
    public static void m3864s(AbstractC0674e0 abstractC0674e0) {
        WeakReference<RecyclerView> weakReference = abstractC0674e0.f4621b;
        if (weakReference == null) {
            return;
        }
        Object obj = weakReference.get();
        while (true) {
            RecyclerView recyclerView = (View) obj;
            while (true) {
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView2 == null) {
                    abstractC0674e0.f4621b = null;
                    return;
                } else {
                    if (recyclerView2 == abstractC0674e0.f4620a) {
                        return;
                    }
                    obj = recyclerView2.getParent();
                    if (obj instanceof View) {
                        break;
                    } else {
                        recyclerView = null;
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public void m3865A(View view) {
        AbstractC0674e0 m3862j0 = m3862j0(view);
        m3889K0(view);
        AbstractC0677h abstractC0677h = this.f4548m;
        if (abstractC0677h != null && m3862j0 != null) {
            abstractC0677h.mo3001S(m3862j0);
        }
        List<InterfaceC0687r> list = this.f4507E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4507E.get(size).mo4252b(view);
            }
        }
    }

    /* renamed from: A0 */
    public void m3866A0(int i10) {
        if (this.f4550n == null) {
            return;
        }
        setScrollState(2);
        this.f4550n.mo2769U1(i10);
        awakenScrollBars();
    }

    /* renamed from: A1 */
    public void m3867A1() {
        setScrollState(0);
        m3870B1();
    }

    /* renamed from: B */
    public final void m3868B() {
        int i10 = this.f4501B;
        this.f4501B = 0;
        if (i10 == 0 || !m3979x0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        C7526b.m32164b(obtain, i10);
        sendAccessibilityEventUnchecked(obtain);
    }

    /* renamed from: B0 */
    public void m3869B0() {
        int m4459j = this.f4534f.m4459j();
        for (int i10 = 0; i10 < m4459j; i10++) {
            ((C0686q) this.f4534f.m4458i(i10).getLayoutParams()).f4681d = true;
        }
        this.f4531c.m4304s();
    }

    /* renamed from: B1 */
    public final void m3870B1() {
        this.f4547l0.m4026f();
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.m4219i2();
        }
    }

    /* renamed from: C */
    public void m3871C() {
        if (this.f4548m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f4550n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f4553o0.f4602j = false;
        boolean z10 = this.f4508E0 && !(this.f4510F0 == getWidth() && this.f4512G0 == getHeight());
        this.f4510F0 = 0;
        this.f4512G0 = 0;
        this.f4508E0 = false;
        if (this.f4553o0.f4597e == 1) {
            m3874D();
        } else if (!this.f4533e.m4440q() && !z10 && this.f4550n.m4169I0() == getWidth() && this.f4550n.m4230u0() == getHeight()) {
            this.f4550n.m4196W1(this);
            m3878F();
        }
        this.f4550n.m4196W1(this);
        m3876E();
        m3878F();
    }

    /* renamed from: C0 */
    public void m3872C0() {
        int m4459j = this.f4534f.m4459j();
        for (int i10 = 0; i10 < m4459j; i10++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i10));
            if (m3862j0 != null && !m3862j0.m4051O()) {
                m3862j0.m4055e(6);
            }
        }
        m3869B0();
        this.f4531c.m4305t();
    }

    /* renamed from: C1 */
    public void m3873C1(int i10, int i11, Object obj) {
        int i12;
        int m4459j = this.f4534f.m4459j();
        for (int i13 = 0; i13 < m4459j; i13++) {
            View m4458i = this.f4534f.m4458i(i13);
            AbstractC0674e0 m3862j0 = m3862j0(m4458i);
            if (m3862j0 != null && !m3862j0.m4051O() && (i12 = m3862j0.f4622c) >= i10 && i12 < i10 + i11) {
                m3862j0.m4055e(2);
                m3862j0.m4054d(obj);
                ((C0686q) m4458i.getLayoutParams()).f4681d = true;
            }
        }
        this.f4531c.m4285M(i10, i11);
    }

    /* renamed from: D */
    public final void m3874D() {
        this.f4553o0.m4007a(1);
        m3902R(this.f4553o0);
        this.f4553o0.f4602j = false;
        m3977w1();
        this.f4536g.m4688f();
        m3891L0();
        m3907T0();
        m3942j1();
        C0668b0 c0668b0 = this.f4553o0;
        c0668b0.f4601i = c0668b0.f4603k && this.f4561s0;
        this.f4561s0 = false;
        this.f4559r0 = false;
        c0668b0.f4600h = c0668b0.f4604l;
        c0668b0.f4598f = this.f4548m.mo3013n();
        m3912W(this.f4571x0);
        if (this.f4553o0.f4603k) {
            int m4456g = this.f4534f.m4456g();
            for (int i10 = 0; i10 < m4456g; i10++) {
                AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4455f(i10));
                if (!m3862j0.m4051O() && (!m3862j0.m4075y() || this.f4548m.m4098u())) {
                    this.f4536g.m4687e(m3862j0, this.f4521O.m4134u(this.f4553o0, m3862j0, AbstractC0682m.m4114e(m3862j0), m3862j0.m4070t()));
                    if (this.f4553o0.f4601i && m3862j0.m4040D() && !m3862j0.m4037A() && !m3862j0.m4051O() && !m3862j0.m4075y()) {
                        this.f4536g.m4685c(m3930f0(m3862j0), m3862j0);
                    }
                }
            }
        }
        if (this.f4553o0.f4604l) {
            m3944k1();
            C0668b0 c0668b02 = this.f4553o0;
            boolean z10 = c0668b02.f4599g;
            c0668b02.f4599g = false;
            this.f4550n.mo2852t1(this.f4531c, c0668b02);
            this.f4553o0.f4599g = z10;
            for (int i11 = 0; i11 < this.f4534f.m4456g(); i11++) {
                AbstractC0674e0 m3862j02 = m3862j0(this.f4534f.m4455f(i11));
                if (!m3862j02.m4051O() && !this.f4536g.m4691i(m3862j02)) {
                    int m4114e = AbstractC0682m.m4114e(m3862j02);
                    boolean m4071u = m3862j02.m4071u(NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
                    int i12 = m4114e;
                    if (!m4071u) {
                        i12 = m4114e | 4096;
                    }
                    AbstractC0682m.c m4134u = this.f4521O.m4134u(this.f4553o0, m3862j02, i12, m3862j02.m4070t());
                    if (m4071u) {
                        m3913W0(m3862j02, m4134u);
                    } else {
                        this.f4536g.m4683a(m3862j02, m4134u);
                    }
                }
            }
        }
        m3967t();
        m3893M0();
        m3983y1(false);
        this.f4553o0.f4597e = 2;
    }

    /* renamed from: D0 */
    public final void m3875D0(int i10, int i11, MotionEvent motionEvent, int i12) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4574z) {
            return;
        }
        int[] iArr = this.f4502B0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean mo2731H = abstractC0685p.mo2731H();
        boolean mo2736I = this.f4550n.mo2736I();
        m3980x1(mo2736I ? (mo2731H ? 1 : 0) | 2 : mo2731H ? 1 : 0, i12);
        int i13 = i10;
        int i14 = i11;
        if (m3880G(mo2731H ? i10 : 0, mo2736I ? i11 : 0, this.f4502B0, this.f4575z0, i12)) {
            int[] iArr2 = this.f4502B0;
            i13 = i10 - iArr2[0];
            i14 = i11 - iArr2[1];
        }
        int i15 = mo2731H ? i13 : 0;
        int i16 = 0;
        if (mo2736I) {
            i16 = i14;
        }
        m3947l1(i15, i16, motionEvent, i12);
        RunnableC0706e runnableC0706e = this.f4549m0;
        if (runnableC0706e != null && (i13 != 0 || i14 != 0)) {
            runnableC0706e.m4517f(this, i13, i14);
        }
        m3986z1(i12);
    }

    /* renamed from: E */
    public final void m3876E() {
        m3977w1();
        m3891L0();
        this.f4553o0.m4007a(6);
        this.f4533e.m4433j();
        this.f4553o0.f4598f = this.f4548m.mo3013n();
        this.f4553o0.f4596d = 0;
        if (this.f4532d != null && this.f4548m.m4094j()) {
            Parcelable parcelable = this.f4532d.f4698d;
            if (parcelable != null) {
                this.f4550n.mo2871y1(parcelable);
            }
            this.f4532d = null;
        }
        C0668b0 c0668b0 = this.f4553o0;
        c0668b0.f4600h = false;
        this.f4550n.mo2852t1(this.f4531c, c0668b0);
        C0668b0 c0668b02 = this.f4553o0;
        c0668b02.f4599g = false;
        c0668b02.f4603k = c0668b02.f4603k && this.f4521O != null;
        c0668b02.f4597e = 4;
        m3893M0();
        m3983y1(false);
    }

    /* renamed from: E0 */
    public void m3877E0(int i10) {
        int m4456g = this.f4534f.m4456g();
        for (int i11 = 0; i11 < m4456g; i11++) {
            this.f4534f.m4455f(i11).offsetLeftAndRight(i10);
        }
    }

    /* renamed from: F */
    public final void m3878F() {
        this.f4553o0.m4007a(4);
        m3977w1();
        m3891L0();
        C0668b0 c0668b0 = this.f4553o0;
        c0668b0.f4597e = 1;
        if (c0668b0.f4603k) {
            for (int m4456g = this.f4534f.m4456g() - 1; m4456g >= 0; m4456g--) {
                AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4455f(m4456g));
                if (!m3862j0.m4051O()) {
                    long m3930f0 = m3930f0(m3862j0);
                    AbstractC0682m.c m4133t = this.f4521O.m4133t(this.f4553o0, m3862j0);
                    AbstractC0674e0 m4689g = this.f4536g.m4689g(m3930f0);
                    if (m4689g != null && !m4689g.m4051O()) {
                        boolean m4690h = this.f4536g.m4690h(m4689g);
                        boolean m4690h2 = this.f4536g.m4690h(m3862j0);
                        if (!m4690h || m4689g != m3862j0) {
                            AbstractC0682m.c m4696n = this.f4536g.m4696n(m4689g);
                            this.f4536g.m4686d(m3862j0, m4133t);
                            AbstractC0682m.c m4695m = this.f4536g.m4695m(m3862j0);
                            if (m4696n == null) {
                                m3954o0(m3930f0, m3862j0, m4689g);
                            } else {
                                m3951n(m4689g, m3862j0, m4696n, m4695m, m4690h, m4690h2);
                            }
                        }
                    }
                    this.f4536g.m4686d(m3862j0, m4133t);
                }
            }
            this.f4536g.m4697o(this.f4514H0);
        }
        this.f4550n.m4170I1(this.f4531c);
        C0668b0 c0668b02 = this.f4553o0;
        c0668b02.f4595c = c0668b02.f4598f;
        this.f4509F = false;
        this.f4511G = false;
        c0668b02.f4603k = false;
        c0668b02.f4604l = false;
        this.f4550n.f4662h = false;
        ArrayList<AbstractC0674e0> arrayList = this.f4531c.f4690b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p.f4668n) {
            abstractC0685p.f4667m = 0;
            abstractC0685p.f4668n = false;
            this.f4531c.m4283K();
        }
        this.f4550n.mo2856u1(this.f4553o0);
        m3893M0();
        m3983y1(false);
        this.f4536g.m4688f();
        int[] iArr = this.f4571x0;
        if (m3981y(iArr[0], iArr[1])) {
            m3886J(0, 0);
        }
        m3914X0();
        m3937h1();
    }

    /* renamed from: F0 */
    public void m3879F0(int i10) {
        int m4456g = this.f4534f.m4456g();
        for (int i11 = 0; i11 < m4456g; i11++) {
            this.f4534f.m4455f(i11).offsetTopAndBottom(i10);
        }
    }

    /* renamed from: G */
    public boolean m3880G(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().m31635d(i10, i11, iArr, iArr2, i12);
    }

    /* renamed from: G0 */
    public void m3881G0(int i10, int i11) {
        int m4459j = this.f4534f.m4459j();
        for (int i12 = 0; i12 < m4459j; i12++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i12));
            if (m3862j0 != null && !m3862j0.m4051O() && m3862j0.f4622c >= i10) {
                m3862j0.m4042F(i11, false);
                this.f4553o0.f4599g = true;
            }
        }
        this.f4531c.m4306u(i10, i11);
        requestLayout();
    }

    /* renamed from: H */
    public final void m3882H(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().m31636e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* renamed from: H0 */
    public void m3883H0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int m4459j = this.f4534f.m4459j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < m4459j; i16++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i16));
            if (m3862j0 != null && (i15 = m3862j0.f4622c) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    m3862j0.m4042F(i11 - i10, false);
                } else {
                    m3862j0.m4042F(i14, false);
                }
                this.f4553o0.f4599g = true;
            }
        }
        this.f4531c.m4307v(i10, i11);
        requestLayout();
    }

    /* renamed from: I */
    public void m3884I(int i10) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.mo4153A1(i10);
        }
        m3899P0(i10);
        AbstractC0690u abstractC0690u = this.f4555p0;
        if (abstractC0690u != null) {
            abstractC0690u.mo4258a(this, i10);
        }
        List<AbstractC0690u> list = this.f4557q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4557q0.get(size).mo4258a(this, i10);
            }
        }
    }

    /* renamed from: I0 */
    public void m3885I0(int i10, int i11, boolean z10) {
        int m4459j = this.f4534f.m4459j();
        for (int i12 = 0; i12 < m4459j; i12++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i12));
            if (m3862j0 != null && !m3862j0.m4051O()) {
                int i13 = m3862j0.f4622c;
                if (i13 >= i10 + i11) {
                    m3862j0.m4042F(-i11, z10);
                } else if (i13 >= i10) {
                    m3862j0.m4062l(i10 - 1, -i11, z10);
                }
                this.f4553o0.f4599g = true;
            }
        }
        this.f4531c.m4308w(i10, i11, z10);
        requestLayout();
    }

    /* renamed from: J */
    public void m3886J(int i10, int i11) {
        this.f4515I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        m3901Q0(i10, i11);
        AbstractC0690u abstractC0690u = this.f4555p0;
        if (abstractC0690u != null) {
            abstractC0690u.mo4259b(this, i10, i11);
        }
        List<AbstractC0690u> list = this.f4557q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4557q0.get(size).mo4259b(this, i10, i11);
            }
        }
        this.f4515I--;
    }

    /* renamed from: J0 */
    public void m3887J0(View view) {
    }

    /* renamed from: K */
    public void m3888K() {
        int i10;
        for (int size = this.f4504C0.size() - 1; size >= 0; size--) {
            AbstractC0674e0 abstractC0674e0 = this.f4504C0.get(size);
            if (abstractC0674e0.f4620a.getParent() == this && !abstractC0674e0.m4051O() && (i10 = abstractC0674e0.f4636q) != -1) {
                C6824g0.m31557y0(abstractC0674e0.f4620a, i10);
                abstractC0674e0.f4636q = -1;
            }
        }
        this.f4504C0.clear();
    }

    /* renamed from: K0 */
    public void m3889K0(View view) {
    }

    /* renamed from: L */
    public final boolean m3890L(MotionEvent motionEvent) {
        InterfaceC0689t interfaceC0689t = this.f4560s;
        if (interfaceC0689t == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m3910V(motionEvent);
        }
        interfaceC0689t.mo4255a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.f4560s = null;
        return true;
    }

    /* renamed from: L0 */
    public void m3891L0() {
        this.f4513H++;
    }

    /* renamed from: M */
    public void m3892M() {
        int measuredWidth;
        int measuredHeight;
        if (this.f4520N != null) {
            return;
        }
        EdgeEffect m4113a = this.f4516J.m4113a(this, 3);
        this.f4520N = m4113a;
        if (this.f4538h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m4113a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: M0 */
    public void m3893M0() {
        m3895N0(true);
    }

    /* renamed from: N */
    public void m3894N() {
        int measuredHeight;
        int measuredWidth;
        if (this.f4517K != null) {
            return;
        }
        EdgeEffect m4113a = this.f4516J.m4113a(this, 0);
        this.f4517K = m4113a;
        if (this.f4538h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m4113a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: N0 */
    public void m3895N0(boolean z10) {
        int i10 = this.f4513H - 1;
        this.f4513H = i10;
        if (i10 < 1) {
            this.f4513H = 0;
            if (z10) {
                m3868B();
                m3888K();
            }
        }
    }

    /* renamed from: O */
    public void m3896O() {
        int measuredHeight;
        int measuredWidth;
        if (this.f4519M != null) {
            return;
        }
        EdgeEffect m4113a = this.f4516J.m4113a(this, 2);
        this.f4519M = m4113a;
        if (this.f4538h) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        m4113a.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: O0 */
    public final void m3897O0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4523Q) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f4523Q = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f4527U = x10;
            this.f4525S = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f4528V = y10;
            this.f4526T = y10;
        }
    }

    /* renamed from: P */
    public void m3898P() {
        int measuredWidth;
        int measuredHeight;
        if (this.f4518L != null) {
            return;
        }
        EdgeEffect m4113a = this.f4516J.m4113a(this, 1);
        this.f4518L = m4113a;
        if (this.f4538h) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        m4113a.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: P0 */
    public void m3899P0(int i10) {
    }

    /* renamed from: Q */
    public String m3900Q() {
        return " " + super.toString() + ", adapter:" + this.f4548m + ", layout:" + this.f4550n + ", context:" + getContext();
    }

    /* renamed from: Q0 */
    public void m3901Q0(int i10, int i11) {
    }

    /* renamed from: R */
    public final void m3902R(C0668b0 c0668b0) {
        if (getScrollState() != 2) {
            c0668b0.f4608p = 0;
            c0668b0.f4609q = 0;
        } else {
            OverScroller overScroller = this.f4547l0.f4613d;
            c0668b0.f4608p = overScroller.getFinalX() - overScroller.getCurrX();
            c0668b0.f4609q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    /* renamed from: R0 */
    public void m3903R0() {
        if (this.f4565u0 || !this.f4562t) {
            return;
        }
        C6824g0.m31523h0(this, this.f4506D0);
        this.f4565u0 = true;
    }

    /* renamed from: S */
    public View m3904S(float f10, float f11) {
        for (int m4456g = this.f4534f.m4456g() - 1; m4456g >= 0; m4456g--) {
            View m4455f = this.f4534f.m4455f(m4456g);
            float translationX = m4455f.getTranslationX();
            float translationY = m4455f.getTranslationY();
            if (f10 >= m4455f.getLeft() + translationX && f10 <= m4455f.getRight() + translationX && f11 >= m4455f.getTop() + translationY && f11 <= m4455f.getBottom() + translationY) {
                return m4455f;
            }
        }
        return null;
    }

    /* renamed from: S0 */
    public final boolean m3905S0() {
        return this.f4521O != null && this.f4550n.mo2809j2();
    }

    /* renamed from: T */
    public View m3906T(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent != this) {
            view = null;
        }
        return view;
    }

    /* renamed from: T0 */
    public final void m3907T0() {
        boolean z10;
        if (this.f4509F) {
            this.f4533e.m4447x();
            if (this.f4511G) {
                this.f4550n.mo2831o1(this);
            }
        }
        if (m3905S0()) {
            this.f4533e.m4445v();
        } else {
            this.f4533e.m4433j();
        }
        boolean z11 = this.f4559r0 || this.f4561s0;
        this.f4553o0.f4603k = this.f4568w && this.f4521O != null && ((z10 = this.f4509F) || z11 || this.f4550n.f4662h) && (!z10 || this.f4548m.m4098u());
        C0668b0 c0668b0 = this.f4553o0;
        boolean z12 = false;
        if (c0668b0.f4603k) {
            z12 = false;
            if (z11) {
                z12 = false;
                if (!this.f4509F) {
                    z12 = false;
                    if (m3905S0()) {
                        z12 = true;
                    }
                }
            }
        }
        c0668b0.f4604l = z12;
    }

    /* renamed from: U */
    public AbstractC0674e0 m3908U(View view) {
        View m3906T = m3906T(view);
        return m3906T == null ? null : m3939i0(m3906T);
    }

    /* renamed from: U0 */
    public void m3909U0(boolean z10) {
        this.f4511G = z10 | this.f4511G;
        this.f4509F = true;
        m3872C0();
    }

    /* renamed from: V */
    public final boolean m3910V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4558r.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC0689t interfaceC0689t = this.f4558r.get(i10);
            if (interfaceC0689t.mo4256c(this, motionEvent) && action != 3) {
                this.f4560s = interfaceC0689t;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0063  */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3911V0(float r7, float r8, float r9, float r10) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3911V0(float, float, float, float):void");
    }

    /* renamed from: W */
    public final void m3912W(int[] iArr) {
        int i10;
        int m4456g = this.f4534f.m4456g();
        if (m4456g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        while (i13 < m4456g) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4455f(i13));
            if (m3862j0.m4051O()) {
                i10 = i12;
            } else {
                int m4068r = m3862j0.m4068r();
                int i14 = i11;
                if (m4068r < i11) {
                    i14 = m4068r;
                }
                i11 = i14;
                i10 = i12;
                if (m4068r > i12) {
                    i10 = m4068r;
                    i11 = i14;
                }
            }
            i13++;
            i12 = i10;
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    /* renamed from: W0 */
    public void m3913W0(AbstractC0674e0 abstractC0674e0, AbstractC0682m.c cVar) {
        abstractC0674e0.m4047K(0, NTLMEngineImpl.FLAG_WORKSTATION_PRESENT);
        if (this.f4553o0.f4601i && abstractC0674e0.m4040D() && !abstractC0674e0.m4037A() && !abstractC0674e0.m4051O()) {
            this.f4536g.m4685c(m3930f0(abstractC0674e0), abstractC0674e0);
        }
        this.f4536g.m4687e(abstractC0674e0, cVar);
    }

    /* renamed from: X0 */
    public final void m3914X0() {
        View view;
        if (!this.f4545k0 || this.f4548m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f4496O0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f4534f.m4463n(focusedChild)) {
                    return;
                }
            } else if (this.f4534f.m4456g() == 0) {
                requestFocus();
                return;
            }
        }
        AbstractC0674e0 m3919a0 = (this.f4553o0.f4606n == -1 || !this.f4548m.m4098u()) ? null : m3919a0(this.f4553o0.f4606n);
        if (m3919a0 == null || this.f4534f.m4463n(m3919a0.f4620a) || !m3919a0.f4620a.hasFocusable()) {
            view = null;
            if (this.f4534f.m4456g() > 0) {
                view = m3915Y();
            }
        } else {
            view = m3919a0.f4620a;
        }
        if (view != null) {
            int i10 = this.f4553o0.f4607o;
            View view2 = view;
            if (i10 != -1) {
                View findViewById = view.findViewById(i10);
                view2 = view;
                if (findViewById != null) {
                    view2 = view;
                    if (findViewById.isFocusable()) {
                        view2 = findViewById;
                    }
                }
            }
            view2.requestFocus();
        }
    }

    /* renamed from: Y */
    public final View m3915Y() {
        AbstractC0674e0 m3917Z;
        AbstractC0674e0 m3917Z2;
        C0668b0 c0668b0 = this.f4553o0;
        int i10 = c0668b0.f4605m;
        if (i10 == -1) {
            i10 = 0;
        }
        int m4009c = c0668b0.m4009c();
        for (int i11 = i10; i11 < m4009c && (m3917Z2 = m3917Z(i11)) != null; i11++) {
            if (m3917Z2.f4620a.hasFocusable()) {
                return m3917Z2.f4620a;
            }
        }
        for (int min = Math.min(m4009c, i10) - 1; min >= 0 && (m3917Z = m3917Z(min)) != null; min--) {
            if (m3917Z.f4620a.hasFocusable()) {
                return m3917Z.f4620a;
            }
        }
        return null;
    }

    /* renamed from: Y0 */
    public final void m3916Y0() {
        boolean z10;
        EdgeEffect edgeEffect = this.f4517K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f4517K.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f4518L;
        boolean z11 = z10;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 = z10 | this.f4518L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4519M;
        boolean z12 = z11;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z12 = z11 | this.f4519M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4520N;
        boolean z13 = z12;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z13 = z12 | this.f4520N.isFinished();
        }
        if (z13) {
            C6824g0.m31521g0(this);
        }
    }

    /* renamed from: Z */
    public AbstractC0674e0 m3917Z(int i10) {
        AbstractC0674e0 abstractC0674e0 = null;
        if (this.f4509F) {
            return null;
        }
        int m4459j = this.f4534f.m4459j();
        int i11 = 0;
        while (i11 < m4459j) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i11));
            AbstractC0674e0 abstractC0674e02 = abstractC0674e0;
            if (m3862j0 != null) {
                abstractC0674e02 = abstractC0674e0;
                if (m3862j0.m4037A()) {
                    continue;
                } else {
                    abstractC0674e02 = abstractC0674e0;
                    if (m3928e0(m3862j0) != i10) {
                        continue;
                    } else {
                        if (!this.f4534f.m4463n(m3862j0.f4620a)) {
                            return m3862j0;
                        }
                        abstractC0674e02 = m3862j0;
                    }
                }
            }
            i11++;
            abstractC0674e0 = abstractC0674e02;
        }
        return abstractC0674e0;
    }

    /* renamed from: Z0 */
    public void m3918Z0() {
        AbstractC0682m abstractC0682m = this.f4521O;
        if (abstractC0682m != null) {
            abstractC0682m.mo4124k();
        }
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.mo2732H1(this.f4531c);
            this.f4550n.m4170I1(this.f4531c);
        }
        this.f4531c.m4288c();
    }

    /* renamed from: a0 */
    public AbstractC0674e0 m3919a0(long j10) {
        AbstractC0677h abstractC0677h = this.f4548m;
        AbstractC0674e0 abstractC0674e0 = null;
        if (abstractC0677h != null) {
            if (abstractC0677h.m4098u()) {
                int m4459j = this.f4534f.m4459j();
                int i10 = 0;
                AbstractC0674e0 abstractC0674e02 = null;
                while (true) {
                    AbstractC0674e0 abstractC0674e03 = abstractC0674e02;
                    abstractC0674e0 = abstractC0674e03;
                    if (i10 >= m4459j) {
                        break;
                    }
                    AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i10));
                    AbstractC0674e0 abstractC0674e04 = abstractC0674e03;
                    if (m3862j0 != null) {
                        abstractC0674e04 = abstractC0674e03;
                        if (m3862j0.m4037A()) {
                            continue;
                        } else {
                            abstractC0674e04 = abstractC0674e03;
                            if (m3862j0.m4066p() != j10) {
                                continue;
                            } else {
                                if (!this.f4534f.m4463n(m3862j0.f4620a)) {
                                    return m3862j0;
                                }
                                abstractC0674e04 = m3862j0;
                            }
                        }
                    }
                    i10++;
                    abstractC0674e02 = abstractC0674e04;
                }
            } else {
                abstractC0674e0 = null;
            }
        }
        return abstractC0674e0;
    }

    /* renamed from: a1 */
    public boolean m3920a1(View view) {
        m3977w1();
        boolean m4467r = this.f4534f.m4467r(view);
        if (m4467r) {
            AbstractC0674e0 m3862j0 = m3862j0(view);
            this.f4531c.m4282J(m3862j0);
            this.f4531c.m4275C(m3862j0);
        }
        m3983y1(!m4467r);
        return m4467r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null || !abstractC0685p.mo2787b1(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    /* renamed from: b */
    public void m3921b(int i10, int i11) {
        if (i10 < 0) {
            m3894N();
            if (this.f4517K.isFinished()) {
                this.f4517K.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            m3896O();
            if (this.f4519M.isFinished()) {
                this.f4519M.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            m3898P();
            if (this.f4518L.isFinished()) {
                this.f4518L.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            m3892M();
            if (this.f4520N.isFinished()) {
                this.f4520N.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        C6824g0.m31521g0(this);
    }

    @Deprecated
    /* renamed from: b0 */
    public AbstractC0674e0 m3922b0(int i10) {
        return m3924c0(i10, false);
    }

    /* renamed from: b1 */
    public void m3923b1(AbstractC0684o abstractC0684o) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.mo3789D("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4556q.remove(abstractC0684o);
        if (this.f4556q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        m3869B0();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[SYNTHETIC] */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0674e0 m3924c0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = r3
            androidx.recyclerview.widget.b r0 = r0.f4534f
            int r0 = r0.m4459j()
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r6 = r0
        Le:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L7d
            r0 = r3
            androidx.recyclerview.widget.b r0 = r0.f4534f
            r1 = r6
            android.view.View r0 = r0.m4458i(r1)
            androidx.recyclerview.widget.RecyclerView$e0 r0 = m3862j0(r0)
            r10 = r0
            r0 = r9
            r8 = r0
            r0 = r10
            if (r0 == 0) goto L73
            r0 = r9
            r8 = r0
            r0 = r10
            boolean r0 = r0.m4037A()
            if (r0 != 0) goto L73
            r0 = r5
            if (r0 == 0) goto L4a
            r0 = r10
            int r0 = r0.f4622c
            r1 = r4
            if (r0 == r1) goto L5a
            r0 = r9
            r8 = r0
            goto L73
        L4a:
            r0 = r10
            int r0 = r0.m4068r()
            r1 = r4
            if (r0 == r1) goto L5a
            r0 = r9
            r8 = r0
            goto L73
        L5a:
            r0 = r3
            androidx.recyclerview.widget.b r0 = r0.f4534f
            r1 = r10
            android.view.View r1 = r1.f4620a
            boolean r0 = r0.m4463n(r1)
            if (r0 == 0) goto L70
            r0 = r10
            r8 = r0
            goto L73
        L70:
            r0 = r10
            return r0
        L73:
            int r6 = r6 + 1
            r0 = r8
            r9 = r0
            goto Le
        L7d:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3924c0(int, boolean):androidx.recyclerview.widget.RecyclerView$e0");
    }

    /* renamed from: c1 */
    public void m3925c1(InterfaceC0687r interfaceC0687r) {
        List<InterfaceC0687r> list = this.f4507E;
        if (list == null) {
            return;
        }
        list.remove(interfaceC0687r);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0686q) && this.f4550n.mo3747J((C0686q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC0685p abstractC0685p = this.f4550n;
        int i10 = 0;
        if (abstractC0685p == null) {
            return 0;
        }
        if (abstractC0685p.mo2731H()) {
            i10 = this.f4550n.mo3798N(this.f4553o0);
        }
        return i10;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC0685p abstractC0685p = this.f4550n;
        int i10 = 0;
        if (abstractC0685p == null) {
            return 0;
        }
        if (abstractC0685p.mo2731H()) {
            i10 = this.f4550n.mo3749O(this.f4553o0);
        }
        return i10;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC0685p abstractC0685p = this.f4550n;
        int i10 = 0;
        if (abstractC0685p == null) {
            return 0;
        }
        if (abstractC0685p.mo2731H()) {
            i10 = this.f4550n.mo3751P(this.f4553o0);
        }
        return i10;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC0685p abstractC0685p = this.f4550n;
        int i10 = 0;
        if (abstractC0685p == null) {
            return 0;
        }
        if (abstractC0685p.mo2736I()) {
            i10 = this.f4550n.mo3802Q(this.f4553o0);
        }
        return i10;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC0685p abstractC0685p = this.f4550n;
        int i10 = 0;
        if (abstractC0685p == null) {
            return 0;
        }
        if (abstractC0685p.mo2736I()) {
            i10 = this.f4550n.mo3752R(this.f4553o0);
        }
        return i10;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC0685p abstractC0685p = this.f4550n;
        int i10 = 0;
        if (abstractC0685p == null) {
            return 0;
        }
        if (abstractC0685p.mo2736I()) {
            i10 = this.f4550n.mo3753S(this.f4553o0);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (java.lang.Math.abs(r6) < r5.f4537g0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (java.lang.Math.abs(r7) < r5.f4537g0) goto L19;
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m3926d0(int r6, int r7) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3926d0(int, int):boolean");
    }

    /* renamed from: d1 */
    public void m3927d1(InterfaceC0689t interfaceC0689t) {
        this.f4558r.remove(interfaceC0689t);
        if (this.f4560s == interfaceC0689t) {
            this.f4560s = null;
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().m31632a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().m31633b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m31634c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().m31637f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        float f10;
        int i10;
        super.draw(canvas);
        int size = this.f4556q.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f4556q.get(i11).mo4146k(canvas, this, this.f4553o0);
        }
        EdgeEffect edgeEffect = this.f4517K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4538h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4517K;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4518L;
        boolean z11 = z10;
        if (edgeEffect3 != null) {
            z11 = z10;
            if (!edgeEffect3.isFinished()) {
                int save2 = canvas.save();
                if (this.f4538h) {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                EdgeEffect edgeEffect4 = this.f4518L;
                z11 = z10 | (edgeEffect4 != null && edgeEffect4.draw(canvas));
                canvas.restoreToCount(save2);
            }
        }
        EdgeEffect edgeEffect5 = this.f4519M;
        boolean z12 = z11;
        if (edgeEffect5 != null) {
            z12 = z11;
            if (!edgeEffect5.isFinished()) {
                int save3 = canvas.save();
                int width = getWidth();
                int paddingTop = this.f4538h ? getPaddingTop() : 0;
                canvas.rotate(90.0f);
                canvas.translate(paddingTop, -width);
                EdgeEffect edgeEffect6 = this.f4519M;
                z12 = z11 | (edgeEffect6 != null && edgeEffect6.draw(canvas));
                canvas.restoreToCount(save3);
            }
        }
        EdgeEffect edgeEffect7 = this.f4520N;
        boolean z13 = z12;
        if (edgeEffect7 != null) {
            z13 = z12;
            if (!edgeEffect7.isFinished()) {
                int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.f4538h) {
                    f10 = (-getWidth()) + getPaddingRight();
                    i10 = (-getHeight()) + getPaddingBottom();
                } else {
                    f10 = -getWidth();
                    i10 = -getHeight();
                }
                canvas.translate(f10, i10);
                EdgeEffect edgeEffect8 = this.f4520N;
                boolean z14 = false;
                if (edgeEffect8 != null) {
                    z14 = false;
                    if (edgeEffect8.draw(canvas)) {
                        z14 = true;
                    }
                }
                z13 = z12 | z14;
                canvas.restoreToCount(save4);
            }
        }
        if (!z13 && this.f4521O != null && this.f4556q.size() > 0 && this.f4521O.mo4129p()) {
            z13 = true;
        }
        if (z13) {
            C6824g0.m31521g0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    /* renamed from: e0 */
    public int m3928e0(AbstractC0674e0 abstractC0674e0) {
        if (abstractC0674e0.m4071u(524) || !abstractC0674e0.m4074x()) {
            return -1;
        }
        return this.f4533e.m4428e(abstractC0674e0.f4622c);
    }

    /* renamed from: e1 */
    public void m3929e1(AbstractC0690u abstractC0690u) {
        List<AbstractC0690u> list = this.f4557q0;
        if (list != null) {
            list.remove(abstractC0690u);
        }
    }

    /* renamed from: f0 */
    public long m3930f0(AbstractC0674e0 abstractC0674e0) {
        return this.f4548m.m4098u() ? abstractC0674e0.m4066p() : abstractC0674e0.f4622c;
    }

    /* renamed from: f1 */
    public void m3931f1() {
        AbstractC0674e0 abstractC0674e0;
        int m4456g = this.f4534f.m4456g();
        for (int i10 = 0; i10 < m4456g; i10++) {
            View m4455f = this.f4534f.m4455f(i10);
            AbstractC0674e0 m3939i0 = m3939i0(m4455f);
            if (m3939i0 != null && (abstractC0674e0 = m3939i0.f4628i) != null) {
                View view = abstractC0674e0.f4620a;
                int left = m4455f.getLeft();
                int top = m4455f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View findNextFocus;
        boolean z10;
        View mo2821m1 = this.f4550n.mo2821m1(view, i10);
        if (mo2821m1 != null) {
            return mo2821m1;
        }
        boolean z11 = (this.f4548m == null || this.f4550n == null || m3982y0() || this.f4574z) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f4550n.mo2736I()) {
                int i11 = i10 == 2 ? 130 : 33;
                boolean z12 = focusFinder.findNextFocus(this, view, i11) == null;
                z10 = z12;
                if (f4495N0) {
                    i10 = i11;
                    z10 = z12;
                }
            } else {
                z10 = false;
            }
            boolean z13 = z10;
            int i12 = i10;
            if (!z10) {
                z13 = z10;
                i12 = i10;
                if (this.f4550n.mo2731H()) {
                    int i13 = (this.f4550n.m4234x0() == 1) ^ (i10 == 2) ? 66 : 17;
                    boolean z14 = focusFinder.findNextFocus(this, view, i13) == null;
                    if (f4495N0) {
                        i10 = i13;
                    }
                    z13 = z14;
                    i12 = i10;
                }
            }
            if (z13) {
                m3973v();
                if (m3906T(view) == null) {
                    return null;
                }
                m3977w1();
                this.f4550n.mo3756f1(view, i12, this.f4531c, this.f4553o0);
                m3983y1(false);
            }
            findNextFocus = focusFinder.findNextFocus(this, view, i12);
            i10 = i12;
        } else {
            findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z11) {
                m3973v();
                if (m3906T(view) == null) {
                    return null;
                }
                m3977w1();
                findNextFocus = this.f4550n.mo3756f1(view, i10, this.f4531c, this.f4553o0);
                m3983y1(false);
            }
        }
        if (findNextFocus == null || findNextFocus.hasFocusable()) {
            if (!m3985z0(view, findNextFocus, i10)) {
                findNextFocus = super.focusSearch(view, i10);
            }
            return findNextFocus;
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        m3934g1(findNextFocus, null);
        return view;
    }

    /* renamed from: g */
    public final void m3932g(AbstractC0674e0 abstractC0674e0) {
        View view = abstractC0674e0.f4620a;
        boolean z10 = view.getParent() == this;
        this.f4531c.m4282J(m3939i0(view));
        if (abstractC0674e0.m4039C()) {
            this.f4534f.m4452c(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0703b c0703b = this.f4534f;
        if (z10) {
            c0703b.m4460k(view);
        } else {
            c0703b.m4451b(view, true);
        }
    }

    /* renamed from: g0 */
    public int m3933g0(View view) {
        AbstractC0674e0 m3862j0 = m3862j0(view);
        return m3862j0 != null ? m3862j0.m4063m() : -1;
    }

    /* renamed from: g1 */
    public final void m3934g1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4542j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0686q) {
            C0686q c0686q = (C0686q) layoutParams;
            if (!c0686q.f4681d) {
                Rect rect = c0686q.f4680c;
                Rect rect2 = this.f4542j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4542j);
            offsetRectIntoDescendantCoords(view, this.f4542j);
        }
        this.f4550n.m4182P1(this, view, this.f4542j, !this.f4568w, view2 == null);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            return abstractC0685p.mo2786b0();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m3900Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            return abstractC0685p.mo2790c0(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m3900Q());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            return abstractC0685p.mo2793d0(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m3900Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0677h getAdapter() {
        return this.f4548m;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0685p abstractC0685p = this.f4550n;
        return abstractC0685p != null ? abstractC0685p.m4213e0() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        InterfaceC0680k interfaceC0680k = this.f4569w0;
        return interfaceC0680k == null ? super.getChildDrawingOrder(i10, i11) : interfaceC0680k.m4112a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4538h;
    }

    public C0715n getCompatAccessibilityDelegate() {
        return this.f4567v0;
    }

    public C0681l getEdgeEffectFactory() {
        return this.f4516J;
    }

    public AbstractC0682m getItemAnimator() {
        return this.f4521O;
    }

    public int getItemDecorationCount() {
        return this.f4556q.size();
    }

    public AbstractC0685p getLayoutManager() {
        return this.f4550n;
    }

    public int getMaxFlingVelocity() {
        return this.f4539h0;
    }

    public int getMinFlingVelocity() {
        return this.f4537g0;
    }

    public long getNanoTime() {
        if (f4494M0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0688s getOnFlingListener() {
        return this.f4535f0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4545k0;
    }

    public C0691v getRecycledViewPool() {
        return this.f4531c.m4294i();
    }

    public int getScrollState() {
        return this.f4522P;
    }

    /* renamed from: h */
    public void m3935h(AbstractC0684o abstractC0684o) {
        m3938i(abstractC0684o, -1);
    }

    /* renamed from: h0 */
    public int m3936h0(View view) {
        AbstractC0674e0 m3862j0 = m3862j0(view);
        return m3862j0 != null ? m3862j0.m4068r() : -1;
    }

    /* renamed from: h1 */
    public final void m3937h1() {
        C0668b0 c0668b0 = this.f4553o0;
        c0668b0.f4606n = -1L;
        c0668b0.f4605m = -1;
        c0668b0.f4607o = -1;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m31641j();
    }

    /* renamed from: i */
    public void m3938i(AbstractC0684o abstractC0684o, int i10) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.mo3789D("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4556q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f4556q.add(abstractC0684o);
        } else {
            this.f4556q.add(i10, abstractC0684o);
        }
        m3869B0();
        requestLayout();
    }

    /* renamed from: i0 */
    public AbstractC0674e0 m3939i0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m3862j0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: i1 */
    public final void m3940i1() {
        VelocityTracker velocityTracker = this.f4524R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m3986z1(0);
        m3916Y0();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4562t;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4574z;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m31643l();
    }

    /* renamed from: j */
    public void m3941j(InterfaceC0687r interfaceC0687r) {
        if (this.f4507E == null) {
            this.f4507E = new ArrayList();
        }
        this.f4507E.add(interfaceC0687r);
    }

    /* renamed from: j1 */
    public final void m3942j1() {
        View focusedChild = (this.f4545k0 && hasFocus() && this.f4548m != null) ? getFocusedChild() : null;
        AbstractC0674e0 m3908U = focusedChild == null ? null : m3908U(focusedChild);
        if (m3908U == null) {
            m3937h1();
            return;
        }
        this.f4553o0.f4606n = this.f4548m.m4098u() ? m3908U.m4066p() : -1L;
        this.f4553o0.f4605m = this.f4509F ? -1 : m3908U.m4037A() ? m3908U.f4623d : m3908U.m4063m();
        this.f4553o0.f4607o = m3946l0(m3908U.f4620a);
    }

    /* renamed from: k */
    public void m3943k(InterfaceC0689t interfaceC0689t) {
        this.f4558r.add(interfaceC0689t);
    }

    /* renamed from: k1 */
    public void m3944k1() {
        int m4459j = this.f4534f.m4459j();
        for (int i10 = 0; i10 < m4459j; i10++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i10));
            if (!m3862j0.m4051O()) {
                m3862j0.m4046J();
            }
        }
    }

    /* renamed from: l */
    public void m3945l(AbstractC0690u abstractC0690u) {
        if (this.f4557q0 == null) {
            this.f4557q0 = new ArrayList();
        }
        this.f4557q0.add(abstractC0690u);
    }

    /* renamed from: l0 */
    public final int m3946l0(View view) {
        int id2;
        View focusedChild;
        loop0: while (true) {
            id2 = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                focusedChild = ((ViewGroup) view).getFocusedChild();
                view = focusedChild;
                if (focusedChild.getId() != -1) {
                    break;
                }
            }
            view = focusedChild;
        }
        return id2;
    }

    /* renamed from: l1 */
    public boolean m3947l1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        m3973v();
        if (this.f4548m != null) {
            int[] iArr = this.f4502B0;
            iArr[0] = 0;
            iArr[1] = 0;
            m3950m1(i10, i11, iArr);
            int[] iArr2 = this.f4502B0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f4556q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4502B0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m3882H(i14, i13, i15, i16, this.f4575z0, i12, iArr3);
        int[] iArr4 = this.f4502B0;
        boolean z10 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i19 = this.f4527U;
        int[] iArr5 = this.f4575z0;
        int i20 = iArr5[0];
        this.f4527U = i19 - i20;
        int i21 = this.f4528V;
        int i22 = iArr5[1];
        this.f4528V = i21 - i22;
        int[] iArr6 = this.f4500A0;
        iArr6[0] = iArr6[0] + i20;
        iArr6[1] = iArr6[1] + i22;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C6847q.m31629b(motionEvent, 8194)) {
                m3911V0(motionEvent.getX(), i15 - r0, motionEvent.getY(), i16 - r0);
            }
            m3970u(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            m3886J(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        boolean z11 = true;
        if (!z10) {
            z11 = true;
            if (i14 == 0) {
                z11 = i13 != 0;
            }
        }
        return z11;
    }

    /* renamed from: m */
    public void m3948m(AbstractC0674e0 abstractC0674e0, AbstractC0682m.c cVar, AbstractC0682m.c cVar2) {
        abstractC0674e0.m4048L(false);
        if (this.f4521O.mo4115a(abstractC0674e0, cVar, cVar2)) {
            m3903R0();
        }
    }

    /* renamed from: m0 */
    public final String m3949m0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(InstructionFileId.DOT)) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* renamed from: m1 */
    public void m3950m1(int i10, int i11, int[] iArr) {
        m3977w1();
        m3891L0();
        C5450k.m27205a("RV Scroll");
        m3902R(this.f4553o0);
        int mo2766T1 = i10 != 0 ? this.f4550n.mo2766T1(i10, this.f4531c, this.f4553o0) : 0;
        int mo2772V1 = i11 != 0 ? this.f4550n.mo2772V1(i11, this.f4531c, this.f4553o0) : 0;
        C5450k.m27206b();
        m3931f1();
        m3893M0();
        m3983y1(false);
        if (iArr != null) {
            iArr[0] = mo2766T1;
            iArr[1] = mo2772V1;
        }
    }

    /* renamed from: n */
    public final void m3951n(AbstractC0674e0 abstractC0674e0, AbstractC0674e0 abstractC0674e02, AbstractC0682m.c cVar, AbstractC0682m.c cVar2, boolean z10, boolean z11) {
        abstractC0674e0.m4048L(false);
        if (z10) {
            m3932g(abstractC0674e0);
        }
        if (abstractC0674e0 != abstractC0674e02) {
            if (z11) {
                m3932g(abstractC0674e02);
            }
            abstractC0674e0.f4627h = abstractC0674e02;
            m3932g(abstractC0674e0);
            this.f4531c.m4282J(abstractC0674e0);
            abstractC0674e02.m4048L(false);
            abstractC0674e02.f4628i = abstractC0674e0;
        }
        if (this.f4521O.mo4116b(abstractC0674e0, abstractC0674e02, cVar, cVar2)) {
            m3903R0();
        }
    }

    /* renamed from: n0 */
    public Rect m3952n0(View view) {
        C0686q c0686q = (C0686q) view.getLayoutParams();
        if (!c0686q.f4681d) {
            return c0686q.f4680c;
        }
        if (this.f4553o0.m4014h() && (c0686q.m4248j() || c0686q.m4250l())) {
            return c0686q.f4680c;
        }
        Rect rect = c0686q.f4680c;
        rect.set(0, 0, 0, 0);
        int size = this.f4556q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4542j.set(0, 0, 0, 0);
            this.f4556q.get(i10).mo4142g(this.f4542j, view, this, this.f4553o0);
            int i11 = rect.left;
            Rect rect2 = this.f4542j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0686q.f4681d = false;
        return rect;
    }

    /* renamed from: n1 */
    public void mo2557n1(int i10) {
        if (this.f4574z) {
            return;
        }
        m3867A1();
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0685p.mo2769U1(i10);
            awakenScrollBars();
        }
    }

    /* renamed from: o */
    public void m3953o(AbstractC0674e0 abstractC0674e0, AbstractC0682m.c cVar, AbstractC0682m.c cVar2) {
        m3932g(abstractC0674e0);
        abstractC0674e0.m4048L(false);
        if (this.f4521O.mo4117c(abstractC0674e0, cVar, cVar2)) {
            m3903R0();
        }
    }

    /* renamed from: o0 */
    public final void m3954o0(long j10, AbstractC0674e0 abstractC0674e0, AbstractC0674e0 abstractC0674e02) {
        int m4456g = this.f4534f.m4456g();
        for (int i10 = 0; i10 < m4456g; i10++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4455f(i10));
            if (m3862j0 != abstractC0674e0 && m3930f0(m3862j0) == j10) {
                AbstractC0677h abstractC0677h = this.f4548m;
                if (abstractC0677h == null || !abstractC0677h.m4098u()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m3862j0 + " \n View Holder 2:" + abstractC0674e0 + m3900Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m3862j0 + " \n View Holder 2:" + abstractC0674e0 + m3900Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0674e02 + " cannot be found but it is necessary for " + abstractC0674e0 + m3900Q());
    }

    /* renamed from: o1 */
    public final void m3955o1(AbstractC0677h abstractC0677h, boolean z10, boolean z11) {
        AbstractC0677h abstractC0677h2 = this.f4548m;
        if (abstractC0677h2 != null) {
            abstractC0677h2.m4092Z(this.f4530b);
            this.f4548m.m4089M(this);
        }
        if (!z10 || z11) {
            m3918Z0();
        }
        this.f4533e.m4447x();
        AbstractC0677h abstractC0677h3 = this.f4548m;
        this.f4548m = abstractC0677h;
        if (abstractC0677h != null) {
            abstractC0677h.m4090U(this.f4530b);
            abstractC0677h.mo4088F(this);
        }
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.mo2783a1(abstractC0677h3, this.f4548m);
        }
        this.f4531c.m4309x(abstractC0677h3, this.f4548m, z10);
        this.f4553o0.f4599g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4513H = 0;
        boolean z10 = true;
        this.f4562t = true;
        if (!this.f4568w || isLayoutRequested()) {
            z10 = false;
        }
        this.f4568w = z10;
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.m4197X(this);
        }
        this.f4565u0 = false;
        if (f4494M0) {
            ThreadLocal<RunnableC0706e> threadLocal = RunnableC0706e.f4859f;
            RunnableC0706e runnableC0706e = threadLocal.get();
            this.f4549m0 = runnableC0706e;
            if (runnableC0706e == null) {
                this.f4549m0 = new RunnableC0706e();
                Display m31550v = C6824g0.m31550v(this);
                float f10 = 60.0f;
                if (!isInEditMode()) {
                    f10 = 60.0f;
                    if (m31550v != null) {
                        float refreshRate = m31550v.getRefreshRate();
                        f10 = 60.0f;
                        if (refreshRate >= 30.0f) {
                            f10 = refreshRate;
                        }
                    }
                }
                RunnableC0706e runnableC0706e2 = this.f4549m0;
                runnableC0706e2.f4863d = (long) (1.0E9f / f10);
                threadLocal.set(runnableC0706e2);
            }
            this.f4549m0.m4513a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC0706e runnableC0706e;
        super.onDetachedFromWindow();
        AbstractC0682m abstractC0682m = this.f4521O;
        if (abstractC0682m != null) {
            abstractC0682m.mo4124k();
        }
        m3867A1();
        this.f4562t = false;
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p != null) {
            abstractC0685p.m4200Y(this, this.f4531c);
        }
        this.f4504C0.clear();
        removeCallbacks(this.f4506D0);
        this.f4536g.m4692j();
        if (!f4494M0 || (runnableC0706e = this.f4549m0) == null) {
            return;
        }
        runnableC0706e.m4521j(this);
        this.f4549m0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4556q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4556q.get(i10).mo4144i(canvas, this, this.f4553o0);
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f4550n == null || this.f4574z || motionEvent.getAction() != 8) {
            return false;
        }
        if ((motionEvent.getSource() & 2) != 0) {
            float f11 = this.f4550n.mo2736I() ? -motionEvent.getAxisValue(9) : 0.0f;
            f10 = f11;
            if (this.f4550n.mo2731H()) {
                f10 = f11;
                axisValue = motionEvent.getAxisValue(10);
            }
            axisValue = 0.0f;
        } else {
            if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.f4550n.mo2736I()) {
                    f10 = -axisValue;
                    axisValue = 0.0f;
                } else if (this.f4550n.mo2731H()) {
                    f10 = 0.0f;
                }
            }
            f10 = 0.0f;
            axisValue = 0.0f;
        }
        if (f10 == 0.0f && axisValue == 0.0f) {
            return false;
        }
        m3875D0((int) (axisValue * this.f4541i0), (int) (f10 * this.f4543j0), motionEvent, 1);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        byte b10;
        boolean z10 = false;
        if (this.f4574z) {
            return false;
        }
        this.f4560s = null;
        if (m3910V(motionEvent)) {
            m3962r();
            return true;
        }
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null) {
            return false;
        }
        boolean mo2731H = abstractC0685p.mo2731H();
        boolean mo2736I = this.f4550n.mo2736I();
        if (this.f4524R == null) {
            this.f4524R = VelocityTracker.obtain();
        }
        this.f4524R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4499A) {
                this.f4499A = false;
            }
            this.f4523Q = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f4527U = x10;
            this.f4525S = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f4528V = y10;
            this.f4526T = y10;
            if (this.f4522P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m3986z1(1);
            }
            int[] iArr = this.f4500A0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = mo2731H ? 1 : 0;
            if (mo2736I) {
                i10 = (mo2731H ? 1 : 0) | 2;
            }
            m3980x1(i10, 0);
        } else if (actionMasked == 1) {
            this.f4524R.clear();
            m3986z1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4523Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4523Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4522P != 1) {
                int i11 = this.f4525S;
                int i12 = this.f4526T;
                if (!mo2731H || Math.abs(x11 - i11) <= this.f4529W) {
                    b10 = false;
                } else {
                    this.f4527U = x11;
                    b10 = true;
                }
                byte b11 = b10;
                if (mo2736I) {
                    b11 = b10;
                    if (Math.abs(y11 - i12) > this.f4529W) {
                        this.f4528V = y11;
                        b11 = true;
                    }
                }
                if (b11 != false) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m3962r();
        } else if (actionMasked == 5) {
            this.f4523Q = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4527U = x12;
            this.f4525S = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4528V = y12;
            this.f4526T = y12;
        } else if (actionMasked == 6) {
            m3897O0(motionEvent);
        }
        if (this.f4522P == 1) {
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        C5450k.m27205a("RV OnLayout");
        m3871C();
        C5450k.m27206b();
        this.f4568w = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null) {
            m3978x(i10, i11);
            return;
        }
        if (abstractC0685p.mo3799N0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f4550n.mo2860v1(this.f4531c, this.f4553o0, i10, i11);
            boolean z10 = false;
            if (mode == 1073741824) {
                z10 = false;
                if (mode2 == 1073741824) {
                    z10 = true;
                }
            }
            this.f4508E0 = z10;
            if (z10 || this.f4548m == null) {
                return;
            }
            if (this.f4553o0.f4597e == 1) {
                m3874D();
            }
            this.f4550n.m4202Y1(i10, i11);
            this.f4553o0.f4602j = true;
            m3876E();
            this.f4550n.m4208b2(i10, i11);
            if (this.f4550n.mo3819e2()) {
                this.f4550n.m4202Y1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH));
                this.f4553o0.f4602j = true;
                m3876E();
                this.f4550n.m4208b2(i10, i11);
            }
            this.f4510F0 = getMeasuredWidth();
            this.f4512G0 = getMeasuredHeight();
            return;
        }
        if (this.f4564u) {
            this.f4550n.mo2860v1(this.f4531c, this.f4553o0, i10, i11);
            return;
        }
        if (this.f4503C) {
            m3977w1();
            m3891L0();
            m3907T0();
            m3893M0();
            C0668b0 c0668b0 = this.f4553o0;
            if (c0668b0.f4604l) {
                c0668b0.f4600h = true;
            } else {
                this.f4533e.m4433j();
                this.f4553o0.f4600h = false;
            }
            this.f4503C = false;
            m3983y1(false);
        } else if (this.f4553o0.f4604l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0677h abstractC0677h = this.f4548m;
        if (abstractC0677h != null) {
            this.f4553o0.f4598f = abstractC0677h.mo3013n();
        } else {
            this.f4553o0.f4598f = 0;
        }
        m3977w1();
        this.f4550n.mo2860v1(this.f4531c, this.f4553o0, i10, i11);
        m3983y1(false);
        this.f4553o0.f4600h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (m3982y0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0695z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0695z c0695z = (C0695z) parcelable;
        this.f4532d = c0695z;
        super.onRestoreInstanceState(c0695z.m37586b());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0695z c0695z = new C0695z(super.onSaveInstanceState());
        C0695z c0695z2 = this.f4532d;
        if (c0695z2 != null) {
            c0695z.m4313c(c0695z2);
        } else {
            AbstractC0685p abstractC0685p = this.f4550n;
            c0695z.f4698d = abstractC0685p != null ? abstractC0685p.mo2875z1() : null;
        }
        return c0695z;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        m3976w0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x033a, code lost:
    
        if (r11 != 0) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void m3956p(String str) {
        if (m3982y0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m3900Q());
        }
        if (this.f4515I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m3900Q()));
        }
    }

    /* renamed from: p0 */
    public boolean m3957p0() {
        return this.f4564u;
    }

    /* renamed from: p1 */
    public boolean m3958p1(AbstractC0674e0 abstractC0674e0, int i10) {
        if (!m3982y0()) {
            C6824g0.m31557y0(abstractC0674e0.f4620a, i10);
            return true;
        }
        abstractC0674e0.f4636q = i10;
        this.f4504C0.add(abstractC0674e0);
        return false;
    }

    /* renamed from: q */
    public boolean m3959q(AbstractC0674e0 abstractC0674e0) {
        AbstractC0682m abstractC0682m = this.f4521O;
        return abstractC0682m == null || abstractC0682m.mo4120g(abstractC0674e0, abstractC0674e0.m4070t());
    }

    /* renamed from: q0 */
    public boolean m3960q0() {
        return !this.f4568w || this.f4509F || this.f4533e.m4439p();
    }

    /* renamed from: q1 */
    public boolean m3961q1(AccessibilityEvent accessibilityEvent) {
        if (!m3982y0()) {
            return false;
        }
        int m32163a = accessibilityEvent != null ? C7526b.m32163a(accessibilityEvent) : 0;
        if (m32163a == 0) {
            m32163a = 0;
        }
        this.f4501B |= m32163a;
        return true;
    }

    /* renamed from: r */
    public final void m3962r() {
        m3940i1();
        setScrollState(0);
    }

    /* renamed from: r0 */
    public final boolean m3963r0() {
        int m4456g = this.f4534f.m4456g();
        for (int i10 = 0; i10 < m4456g; i10++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4455f(i10));
            if (m3862j0 != null && !m3862j0.m4051O() && m3862j0.m4040D()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r1 */
    public void m3964r1(int i10, int i11) {
        m3966s1(i10, i11, null);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        AbstractC0674e0 m3862j0 = m3862j0(view);
        if (m3862j0 != null) {
            if (m3862j0.m4039C()) {
                m3862j0.m4059i();
            } else if (!m3862j0.m4051O()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m3862j0 + m3900Q());
            }
        }
        view.clearAnimation();
        m3865A(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4550n.m4235x1(this, this.f4553o0, view, view2) && view2 != null) {
            m3934g1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f4550n.mo2755O1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f4558r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4558r.get(i10).mo4257e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4570x != 0 || this.f4574z) {
            this.f4572y = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s0 */
    public void m3965s0() {
        this.f4533e = new C0702a(new C0675f(this));
    }

    /* renamed from: s1 */
    public void m3966s1(int i10, int i11, Interpolator interpolator) {
        m3969t1(i10, i11, interpolator, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4574z) {
            return;
        }
        boolean mo2731H = abstractC0685p.mo2731H();
        boolean mo2736I = this.f4550n.mo2736I();
        if (mo2731H || mo2736I) {
            if (!mo2731H) {
                i10 = 0;
            }
            if (!mo2736I) {
                i11 = 0;
            }
            m3947l1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m3961q1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0715n c0715n) {
        this.f4567v0 = c0715n;
        C6824g0.m31539p0(this, c0715n);
    }

    public void setAdapter(AbstractC0677h abstractC0677h) {
        setLayoutFrozen(false);
        m3955o1(abstractC0677h, false, true);
        m3909U0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0680k interfaceC0680k) {
        if (interfaceC0680k == this.f4569w0) {
            return;
        }
        this.f4569w0 = interfaceC0680k;
        setChildrenDrawingOrderEnabled(interfaceC0680k != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f4538h) {
            m3976w0();
        }
        this.f4538h = z10;
        super.setClipToPadding(z10);
        if (this.f4568w) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0681l c0681l) {
        C6616h.m30527e(c0681l);
        this.f4516J = c0681l;
        m3976w0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f4564u = z10;
    }

    public void setItemAnimator(AbstractC0682m abstractC0682m) {
        AbstractC0682m abstractC0682m2 = this.f4521O;
        if (abstractC0682m2 != null) {
            abstractC0682m2.mo4124k();
            this.f4521O.m4136w(null);
        }
        this.f4521O = abstractC0682m;
        if (abstractC0682m != null) {
            abstractC0682m.m4136w(this.f4563t0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f4531c.m4279G(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(AbstractC0685p abstractC0685p) {
        if (abstractC0685p == this.f4550n) {
            return;
        }
        m3867A1();
        if (this.f4550n != null) {
            AbstractC0682m abstractC0682m = this.f4521O;
            if (abstractC0682m != null) {
                abstractC0682m.mo4124k();
            }
            this.f4550n.mo2732H1(this.f4531c);
            this.f4550n.m4170I1(this.f4531c);
            this.f4531c.m4288c();
            if (this.f4562t) {
                this.f4550n.m4200Y(this, this.f4531c);
            }
            this.f4550n.m4210c2(null);
            this.f4550n = null;
        } else {
            this.f4531c.m4288c();
        }
        this.f4534f.m4464o();
        this.f4550n = abstractC0685p;
        if (abstractC0685p != null) {
            if (abstractC0685p.f4656b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0685p + " is already attached to a RecyclerView:" + abstractC0685p.f4656b.m3900Q());
            }
            abstractC0685p.m4210c2(this);
            if (this.f4562t) {
                this.f4550n.m4197X(this);
            }
        }
        this.f4531c.m4283K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m31644m(z10);
    }

    public void setOnFlingListener(AbstractC0688s abstractC0688s) {
        this.f4535f0 = abstractC0688s;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0690u abstractC0690u) {
        this.f4555p0 = abstractC0690u;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f4545k0 = z10;
    }

    public void setRecycledViewPool(C0691v c0691v) {
        this.f4531c.m4277E(c0691v);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC0693x interfaceC0693x) {
        this.f4552o = interfaceC0693x;
    }

    void setScrollState(int i10) {
        if (i10 == this.f4522P) {
            return;
        }
        this.f4522P = i10;
        if (i10 != 2) {
            m3870B1();
        }
        m3884I(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f4529W = scaledTouchSlop;
            } else {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f4529W = scaledTouchSlop;
    }

    public void setViewCacheExtension(AbstractC0670c0 abstractC0670c0) {
        this.f4531c.m4278F(abstractC0670c0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().m31646o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m31648q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f4574z) {
            m3956p("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f4574z = true;
                this.f4499A = true;
                m3867A1();
                return;
            }
            this.f4574z = false;
            if (this.f4572y && this.f4550n != null && this.f4548m != null) {
                requestLayout();
            }
            this.f4572y = false;
        }
    }

    /* renamed from: t */
    public void m3967t() {
        int m4459j = this.f4534f.m4459j();
        for (int i10 = 0; i10 < m4459j; i10++) {
            AbstractC0674e0 m3862j0 = m3862j0(this.f4534f.m4458i(i10));
            if (!m3862j0.m4051O()) {
                m3862j0.m4056f();
            }
        }
        this.f4531c.m4289d();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: t0 */
    public final void m3968t0() {
        if (C6824g0.m31471B(this) == 0) {
            C6824g0.m31559z0(this, 8);
        }
    }

    /* renamed from: t1 */
    public void m3969t1(int i10, int i11, Interpolator interpolator, int i12) {
        m3972u1(i10, i11, interpolator, i12, false);
    }

    /* renamed from: u */
    public void m3970u(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f4517K;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f4517K.onRelease();
            z10 = this.f4517K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4519M;
        boolean z11 = z10;
        if (edgeEffect2 != null) {
            z11 = z10;
            if (!edgeEffect2.isFinished()) {
                z11 = z10;
                if (i10 < 0) {
                    this.f4519M.onRelease();
                    z11 = z10 | this.f4519M.isFinished();
                }
            }
        }
        EdgeEffect edgeEffect3 = this.f4518L;
        boolean z12 = z11;
        if (edgeEffect3 != null) {
            z12 = z11;
            if (!edgeEffect3.isFinished()) {
                z12 = z11;
                if (i11 > 0) {
                    this.f4518L.onRelease();
                    z12 = z11 | this.f4518L.isFinished();
                }
            }
        }
        EdgeEffect edgeEffect4 = this.f4520N;
        boolean z13 = z12;
        if (edgeEffect4 != null) {
            z13 = z12;
            if (!edgeEffect4.isFinished()) {
                z13 = z12;
                if (i11 < 0) {
                    this.f4520N.onRelease();
                    z13 = z12 | this.f4520N.isFinished();
                }
            }
        }
        if (z13) {
            C6824g0.m31521g0(this);
        }
    }

    /* renamed from: u0 */
    public final void m3971u0() {
        this.f4534f = new C0703b(new C0673e(this));
    }

    /* renamed from: u1 */
    public void m3972u1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4574z) {
            return;
        }
        int i13 = i10;
        if (!abstractC0685p.mo2731H()) {
            i13 = 0;
        }
        if (!this.f4550n.mo2736I()) {
            i11 = 0;
        }
        if (i13 == 0 && i11 == 0) {
            return;
        }
        if (!(i12 == Integer.MIN_VALUE || i12 > 0)) {
            scrollBy(i13, i11);
            return;
        }
        if (z10) {
            int i14 = 0;
            if (i13 != 0) {
                i14 = 1;
            }
            int i15 = i14;
            if (i11 != 0) {
                i15 = i14 | 2;
            }
            m3980x1(i15, 1);
        }
        this.f4547l0.m4025e(i13, i11, i12, interpolator);
    }

    /* renamed from: v */
    public void m3973v() {
        if (!this.f4568w || this.f4509F) {
            C5450k.m27205a("RV FullInvalidate");
            m3871C();
            C5450k.m27206b();
            return;
        }
        if (this.f4533e.m4439p()) {
            if (this.f4533e.m4438o(4) && !this.f4533e.m4438o(11)) {
                C5450k.m27205a("RV PartialInvalidate");
                m3977w1();
                m3891L0();
                this.f4533e.m4445v();
                if (!this.f4572y) {
                    if (m3963r0()) {
                        m3871C();
                    } else {
                        this.f4533e.m4432i();
                    }
                }
                m3983y1(true);
                m3893M0();
            } else {
                if (!this.f4533e.m4439p()) {
                    return;
                }
                C5450k.m27205a("RV FullInvalidate");
                m3871C();
            }
            C5450k.m27206b();
        }
    }

    /* renamed from: v0 */
    public void m3974v0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0705d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C8517b.f39872a), resources.getDimensionPixelSize(C8517b.f39874c), resources.getDimensionPixelOffset(C8517b.f39873b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m3900Q());
        }
    }

    /* renamed from: v1 */
    public void mo2558v1(int i10) {
        if (this.f4574z) {
            return;
        }
        AbstractC0685p abstractC0685p = this.f4550n;
        if (abstractC0685p == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0685p.mo2800g2(this, this.f4553o0, i10);
        }
    }

    /* renamed from: w */
    public final void m3975w(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m3949m0 = m3949m0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(m3949m0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0685p.class);
                Object[] objArr = null;
                try {
                    Constructor constructor2 = asSubclass.getConstructor(f4497P0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    constructor = constructor2;
                } catch (NoSuchMethodException e10) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m3949m0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC0685p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m3949m0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m3949m0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m3949m0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m3949m0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m3949m0, e16);
            }
        }
    }

    /* renamed from: w0 */
    public void m3976w0() {
        this.f4520N = null;
        this.f4518L = null;
        this.f4519M = null;
        this.f4517K = null;
    }

    /* renamed from: w1 */
    public void m3977w1() {
        int i10 = this.f4570x + 1;
        this.f4570x = i10;
        if (i10 != 1 || this.f4574z) {
            return;
        }
        this.f4572y = false;
    }

    /* renamed from: x */
    public void m3978x(int i10, int i11) {
        setMeasuredDimension(AbstractC0685p.m4148K(i10, getPaddingLeft() + getPaddingRight(), C6824g0.m31477E(this)), AbstractC0685p.m4148K(i11, getPaddingTop() + getPaddingBottom(), C6824g0.m31475D(this)));
    }

    /* renamed from: x0 */
    public boolean m3979x0() {
        AccessibilityManager accessibilityManager = this.f4505D;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: x1 */
    public boolean m3980x1(int i10, int i11) {
        return getScrollingChildHelper().m31647p(i10, i11);
    }

    /* renamed from: y */
    public final boolean m3981y(int i10, int i11) {
        m3912W(this.f4571x0);
        int[] iArr = this.f4571x0;
        boolean z10 = false;
        if (iArr[0] != i10 || iArr[1] != i11) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: y0 */
    public boolean m3982y0() {
        return this.f4513H > 0;
    }

    /* renamed from: y1 */
    public void m3983y1(boolean z10) {
        if (this.f4570x < 1) {
            this.f4570x = 1;
        }
        if (!z10 && !this.f4574z) {
            this.f4572y = false;
        }
        if (this.f4570x == 1) {
            if (z10 && this.f4572y && !this.f4574z && this.f4550n != null && this.f4548m != null) {
                m3871C();
            }
            if (!this.f4574z) {
                this.f4572y = false;
            }
        }
        this.f4570x--;
    }

    /* renamed from: z */
    public void m3984z(View view) {
        AbstractC0674e0 m3862j0 = m3862j0(view);
        m3887J0(view);
        AbstractC0677h abstractC0677h = this.f4548m;
        if (abstractC0677h != null && m3862j0 != null) {
            abstractC0677h.mo3000O(m3862j0);
        }
        List<InterfaceC0687r> list = this.f4507E;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f4507E.get(size).mo4253d(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ee, code lost:
    
        if ((r10 * r12) > 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020e, code lost:
    
        if ((r10 * r12) < 0) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m3985z0(android.view.View r7, android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m3985z0(android.view.View, android.view.View, int):boolean");
    }

    /* renamed from: z1 */
    public void m3986z1(int i10) {
        getScrollingChildHelper().m31649r(i10);
    }
}
