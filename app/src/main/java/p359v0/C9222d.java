package p359v0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:v0/d.class
 */
/* renamed from: v0.d */
/* loaded from: combined.jar:classes1.jar:v0/d.class */
public class C9222d {

    /* renamed from: x */
    public static final Interpolator f42121x = new a();

    /* renamed from: a */
    public int f42122a;

    /* renamed from: b */
    public int f42123b;

    /* renamed from: d */
    public float[] f42125d;

    /* renamed from: e */
    public float[] f42126e;

    /* renamed from: f */
    public float[] f42127f;

    /* renamed from: g */
    public float[] f42128g;

    /* renamed from: h */
    public int[] f42129h;

    /* renamed from: i */
    public int[] f42130i;

    /* renamed from: j */
    public int[] f42131j;

    /* renamed from: k */
    public int f42132k;

    /* renamed from: l */
    public VelocityTracker f42133l;

    /* renamed from: m */
    public float f42134m;

    /* renamed from: n */
    public float f42135n;

    /* renamed from: o */
    public int f42136o;

    /* renamed from: p */
    public final int f42137p;

    /* renamed from: q */
    public int f42138q;

    /* renamed from: r */
    public OverScroller f42139r;

    /* renamed from: s */
    public final c f42140s;

    /* renamed from: t */
    public View f42141t;

    /* renamed from: u */
    public boolean f42142u;

    /* renamed from: v */
    public final ViewGroup f42143v;

    /* renamed from: c */
    public int f42124c = -1;

    /* renamed from: w */
    public final Runnable f42144w = new b(this);

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/d$a.class
     */
    /* renamed from: v0.d$a */
    /* loaded from: combined.jar:classes1.jar:v0/d$a.class */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/d$b.class
     */
    /* renamed from: v0.d$b */
    /* loaded from: combined.jar:classes1.jar:v0/d$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final C9222d f42145b;

        public b(C9222d c9222d) {
            this.f42145b = c9222d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f42145b.m38854E(0);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:v0/d$c.class
     */
    /* renamed from: v0.d$c */
    /* loaded from: combined.jar:classes1.jar:v0/d$c.class */
    public static abstract class c {
        /* renamed from: a */
        public abstract int mo13273a(View view, int i10, int i11);

        /* renamed from: b */
        public abstract int mo13274b(View view, int i10, int i11);

        /* renamed from: c */
        public int m38883c(int i10) {
            return i10;
        }

        /* renamed from: d */
        public int mo13275d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo13379e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void m38884f(int i10, int i11) {
        }

        /* renamed from: g */
        public boolean m38885g(int i10) {
            return false;
        }

        /* renamed from: h */
        public void m38886h(int i10, int i11) {
        }

        /* renamed from: i */
        public void mo13276i(View view, int i10) {
        }

        /* renamed from: j */
        public void mo13277j(int i10) {
        }

        /* renamed from: k */
        public void mo13278k(View view, int i10, int i11, int i12, int i13) {
        }

        /* renamed from: l */
        public abstract void mo13279l(View view, float f10, float f11);

        /* renamed from: m */
        public abstract boolean mo13280m(View view, int i10);
    }

    public C9222d(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f42143v = viewGroup;
        this.f42140s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f42137p = i10;
        this.f42136o = i10;
        this.f42123b = viewConfiguration.getScaledTouchSlop();
        this.f42134m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f42135n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f42139r = new OverScroller(context, f42121x);
    }

    /* renamed from: l */
    public static C9222d m38848l(ViewGroup viewGroup, float f10, c cVar) {
        C9222d m38849m = m38849m(viewGroup, cVar);
        m38849m.f42123b = (int) (m38849m.f42123b * (1.0f / f10));
        return m38849m;
    }

    /* renamed from: m */
    public static C9222d m38849m(ViewGroup viewGroup, c cVar) {
        return new C9222d(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: A */
    public final void m38850A() {
        this.f42133l.computeCurrentVelocity(1000, this.f42134m);
        m38870n(m38863e(this.f42133l.getXVelocity(this.f42124c), this.f42135n, this.f42134m), m38863e(this.f42133l.getYVelocity(this.f42124c), this.f42135n, this.f42134m));
    }

    /* renamed from: B */
    public final void m38851B(float f10, float f11, int i10) {
        boolean m38861c = m38861c(f10, f11, i10, 1);
        int i11 = m38861c ? 1 : 0;
        if (m38861c(f11, f10, i10, 4)) {
            i11 = (m38861c ? 1 : 0) | 4;
        }
        int i12 = i11;
        if (m38861c(f10, f11, i10, 2)) {
            i12 = i11 | 2;
        }
        int i13 = i12;
        if (m38861c(f11, f10, i10, 8)) {
            i13 = i12 | 8;
        }
        if (i13 != 0) {
            int[] iArr = this.f42130i;
            iArr[i10] = iArr[i10] | i13;
            this.f42140s.m38884f(i13, i10);
        }
    }

    /* renamed from: C */
    public final void m38852C(float f10, float f11, int i10) {
        m38873q(i10);
        float[] fArr = this.f42125d;
        this.f42127f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f42126e;
        this.f42128g[i10] = f11;
        fArr2[i10] = f11;
        this.f42129h[i10] = m38876t((int) f10, (int) f11);
        this.f42132k |= 1 << i10;
    }

    /* renamed from: D */
    public final void m38853D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (m38880x(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f42127f[pointerId] = x10;
                this.f42128g[pointerId] = y10;
            }
        }
    }

    /* renamed from: E */
    public void m38854E(int i10) {
        this.f42143v.removeCallbacks(this.f42144w);
        if (this.f42122a != i10) {
            this.f42122a = i10;
            this.f42140s.mo13277j(i10);
            if (this.f42122a == 0) {
                this.f42141t = null;
            }
        }
    }

    /* renamed from: F */
    public boolean m38855F(int i10, int i11) {
        if (this.f42142u) {
            return m38875s(i10, i11, (int) this.f42133l.getXVelocity(this.f42124c), (int) this.f42133l.getYVelocity(this.f42124c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01b5, code lost:
    
        if (r0 != r0) goto L64;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m38856G(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p359v0.C9222d.m38856G(android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean m38857H(View view, int i10, int i11) {
        this.f42141t = view;
        this.f42124c = -1;
        boolean m38875s = m38875s(i10, i11, 0, 0);
        if (!m38875s && this.f42122a == 0 && this.f42141t != null) {
            this.f42141t = null;
        }
        return m38875s;
    }

    /* renamed from: I */
    public boolean m38858I(View view, int i10) {
        if (view == this.f42141t && this.f42124c == i10) {
            return true;
        }
        if (view == null || !this.f42140s.mo13280m(view, i10)) {
            return false;
        }
        this.f42124c = i10;
        m38860b(view, i10);
        return true;
    }

    /* renamed from: a */
    public void m38859a() {
        this.f42124c = -1;
        m38865g();
        VelocityTracker velocityTracker = this.f42133l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f42133l = null;
        }
    }

    /* renamed from: b */
    public void m38860b(View view, int i10) {
        if (view.getParent() == this.f42143v) {
            this.f42141t = view;
            this.f42124c = i10;
            this.f42140s.mo13276i(view, i10);
            m38854E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f42143v + ")");
    }

    /* renamed from: c */
    public final boolean m38861c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        boolean z10 = false;
        if ((this.f42129h[i10] & i11) == i11) {
            z10 = false;
            if ((this.f42138q & i11) != 0) {
                z10 = false;
                if ((this.f42131j[i10] & i11) != i11) {
                    z10 = false;
                    if ((this.f42130i[i10] & i11) != i11) {
                        int i12 = this.f42123b;
                        if (abs <= i12 && abs2 <= i12) {
                            z10 = false;
                        } else {
                            if (abs < abs2 * 0.5f && this.f42140s.m38885g(i11)) {
                                int[] iArr = this.f42131j;
                                iArr[i10] = iArr[i10] | i11;
                                return false;
                            }
                            z10 = false;
                            if ((this.f42130i[i10] & i11) == 0) {
                                z10 = false;
                                if (abs > this.f42123b) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: d */
    public final boolean m38862d(View view, float f10, float f11) {
        boolean z10 = false;
        if (view == null) {
            return false;
        }
        boolean z11 = this.f42140s.mo13275d(view) > 0;
        boolean z12 = this.f42140s.mo13379e(view) > 0;
        if (z11 && z12) {
            int i10 = this.f42123b;
            if ((f10 * f10) + (f11 * f11) > i10 * i10) {
                z10 = true;
            }
            return z10;
        }
        if (z11) {
            boolean z13 = false;
            if (Math.abs(f10) > this.f42123b) {
                z13 = true;
            }
            return z13;
        }
        boolean z14 = false;
        if (z12) {
            z14 = false;
            if (Math.abs(f11) > this.f42123b) {
                z14 = true;
            }
        }
        return z14;
    }

    /* renamed from: e */
    public final float m38863e(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        if (abs <= f12) {
            return f10;
        }
        if (f10 <= 0.0f) {
            f12 = -f12;
        }
        return f12;
    }

    /* renamed from: f */
    public final int m38864f(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        if (abs <= i12) {
            return i10;
        }
        if (i10 <= 0) {
            i12 = -i12;
        }
        return i12;
    }

    /* renamed from: g */
    public final void m38865g() {
        float[] fArr = this.f42125d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f42126e, 0.0f);
        Arrays.fill(this.f42127f, 0.0f);
        Arrays.fill(this.f42128g, 0.0f);
        Arrays.fill(this.f42129h, 0);
        Arrays.fill(this.f42130i, 0);
        Arrays.fill(this.f42131j, 0);
        this.f42132k = 0;
    }

    /* renamed from: h */
    public final void m38866h(int i10) {
        if (this.f42125d == null || !m38879w(i10)) {
            return;
        }
        this.f42125d[i10] = 0.0f;
        this.f42126e[i10] = 0.0f;
        this.f42127f[i10] = 0.0f;
        this.f42128g[i10] = 0.0f;
        this.f42129h[i10] = 0;
        this.f42130i[i10] = 0;
        this.f42131j[i10] = 0;
        this.f42132k = ((1 << i10) ^ (-1)) & this.f42132k;
    }

    /* renamed from: i */
    public final int m38867i(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f42143v.getWidth();
        int i13 = width / 2;
        float min = Math.min(1.0f, Math.abs(i10) / width);
        float f10 = i13;
        float m38871o = m38871o(min);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs((f10 + (m38871o * f10)) / abs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: j */
    public final int m38868j(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int m38864f = m38864f(i12, (int) this.f42135n, (int) this.f42134m);
        int m38864f2 = m38864f(i13, (int) this.f42135n, (int) this.f42134m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(m38864f);
        int abs4 = Math.abs(m38864f2);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (m38864f != 0) {
            f10 = abs3;
            f11 = i14;
        } else {
            f10 = abs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (m38864f2 != 0) {
            f12 = abs4;
            f13 = i14;
        } else {
            f12 = abs2;
            f13 = i15;
        }
        return (int) ((m38867i(i10, m38864f, this.f42140s.mo13275d(view)) * f14) + (m38867i(i11, m38864f2, this.f42140s.mo13379e(view)) * (f12 / f13)));
    }

    /* renamed from: k */
    public boolean m38869k(boolean z10) {
        if (this.f42122a == 2) {
            boolean computeScrollOffset = this.f42139r.computeScrollOffset();
            int currX = this.f42139r.getCurrX();
            int currY = this.f42139r.getCurrY();
            int left = currX - this.f42141t.getLeft();
            int top = currY - this.f42141t.getTop();
            if (left != 0) {
                C6824g0.m31507Z(this.f42141t, left);
            }
            if (top != 0) {
                C6824g0.m31509a0(this.f42141t, top);
            }
            if (left != 0 || top != 0) {
                this.f42140s.mo13278k(this.f42141t, currX, currY, left, top);
            }
            boolean z11 = computeScrollOffset;
            if (computeScrollOffset) {
                z11 = computeScrollOffset;
                if (currX == this.f42139r.getFinalX()) {
                    z11 = computeScrollOffset;
                    if (currY == this.f42139r.getFinalY()) {
                        this.f42139r.abortAnimation();
                        z11 = false;
                    }
                }
            }
            if (!z11) {
                if (z10) {
                    this.f42143v.post(this.f42144w);
                } else {
                    m38854E(0);
                }
            }
        }
        boolean z12 = false;
        if (this.f42122a == 2) {
            z12 = true;
        }
        return z12;
    }

    /* renamed from: n */
    public final void m38870n(float f10, float f11) {
        this.f42142u = true;
        this.f42140s.mo13279l(this.f42141t, f10, f11);
        this.f42142u = false;
        if (this.f42122a == 1) {
            m38854E(0);
        }
    }

    /* renamed from: o */
    public final float m38871o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    /* renamed from: p */
    public final void m38872p(int i10, int i11, int i12, int i13) {
        int left = this.f42141t.getLeft();
        int top = this.f42141t.getTop();
        int i14 = i10;
        if (i12 != 0) {
            i14 = this.f42140s.mo13273a(this.f42141t, i10, i12);
            C6824g0.m31507Z(this.f42141t, i14 - left);
        }
        int i15 = i11;
        if (i13 != 0) {
            i15 = this.f42140s.mo13274b(this.f42141t, i11, i13);
            C6824g0.m31509a0(this.f42141t, i15 - top);
        }
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f42140s.mo13278k(this.f42141t, i14, i15, i14 - left, i15 - top);
    }

    /* renamed from: q */
    public final void m38873q(int i10) {
        float[] fArr = this.f42125d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f42126e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f42127f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f42128g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f42129h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f42130i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f42131j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f42125d = fArr2;
            this.f42126e = fArr3;
            this.f42127f = fArr4;
            this.f42128g = fArr5;
            this.f42129h = iArr;
            this.f42130i = iArr2;
            this.f42131j = iArr3;
        }
    }

    /* renamed from: r */
    public View m38874r(int i10, int i11) {
        for (int childCount = this.f42143v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f42143v.getChildAt(this.f42140s.m38883c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: s */
    public final boolean m38875s(int i10, int i11, int i12, int i13) {
        int left = this.f42141t.getLeft();
        int top = this.f42141t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f42139r.abortAnimation();
            m38854E(0);
            return false;
        }
        this.f42139r.startScroll(left, top, i14, i15, m38868j(this.f42141t, i14, i15, i12, i13));
        m38854E(2);
        return true;
    }

    /* renamed from: t */
    public final int m38876t(int i10, int i11) {
        int i12 = i10 < this.f42143v.getLeft() + this.f42136o ? 1 : 0;
        int i13 = i12;
        if (i11 < this.f42143v.getTop() + this.f42136o) {
            i13 = i12 | 4;
        }
        int i14 = i13;
        if (i10 > this.f42143v.getRight() - this.f42136o) {
            i14 = i13 | 2;
        }
        int i15 = i14;
        if (i11 > this.f42143v.getBottom() - this.f42136o) {
            i15 = i14 | 8;
        }
        return i15;
    }

    /* renamed from: u */
    public int m38877u() {
        return this.f42123b;
    }

    /* renamed from: v */
    public boolean m38878v(int i10, int i11) {
        return m38881y(this.f42141t, i10, i11);
    }

    /* renamed from: w */
    public boolean m38879w(int i10) {
        boolean z10 = true;
        if (((1 << i10) & this.f42132k) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: x */
    public final boolean m38880x(int i10) {
        if (m38879w(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: y */
    public boolean m38881y(View view, int i10, int i11) {
        if (view == null) {
            return false;
        }
        boolean z10 = false;
        if (i10 >= view.getLeft()) {
            z10 = false;
            if (i10 < view.getRight()) {
                z10 = false;
                if (i11 >= view.getTop()) {
                    z10 = false;
                    if (i11 < view.getBottom()) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    /* renamed from: z */
    public void m38882z(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m38859a();
        }
        if (this.f42133l == null) {
            this.f42133l = VelocityTracker.obtain();
        }
        this.f42133l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m38874r = m38874r((int) x10, (int) y10);
            m38852C(x10, y10, pointerId);
            m38858I(m38874r, pointerId);
            int i12 = this.f42129h[pointerId];
            int i13 = this.f42138q;
            if ((i12 & i13) != 0) {
                this.f42140s.m38886h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f42122a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i14 = 0; i14 < pointerCount; i14++) {
                        int pointerId2 = motionEvent.getPointerId(i14);
                        if (m38880x(pointerId2)) {
                            float x11 = motionEvent.getX(i14);
                            float y11 = motionEvent.getY(i14);
                            float f10 = x11 - this.f42125d[pointerId2];
                            float f11 = y11 - this.f42126e[pointerId2];
                            m38851B(f10, f11, pointerId2);
                            if (this.f42122a == 1) {
                                break;
                            }
                            View m38874r2 = m38874r((int) x11, (int) y11);
                            if (m38862d(m38874r2, f10, f11) && m38858I(m38874r2, pointerId2)) {
                                break;
                            }
                        }
                    }
                } else {
                    if (!m38880x(this.f42124c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f42124c);
                    float x12 = motionEvent.getX(findPointerIndex);
                    float y12 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f42127f;
                    int i15 = this.f42124c;
                    int i16 = (int) (x12 - fArr[i15]);
                    int i17 = (int) (y12 - this.f42128g[i15]);
                    m38872p(this.f42141t.getLeft() + i16, this.f42141t.getTop() + i17, i16, i17);
                }
                m38853D(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x13 = motionEvent.getX(actionIndex);
                    float y13 = motionEvent.getY(actionIndex);
                    m38852C(x13, y13, pointerId3);
                    if (this.f42122a != 0) {
                        if (m38878v((int) x13, (int) y13)) {
                            m38858I(this.f42141t, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        m38858I(m38874r((int) x13, (int) y13), pointerId3);
                        int i18 = this.f42129h[pointerId3];
                        int i19 = this.f42138q;
                        if ((i18 & i19) != 0) {
                            this.f42140s.m38886h(i18 & i19, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f42122a == 1 && pointerId4 == this.f42124c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i11 >= pointerCount2) {
                            i10 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i11);
                        if (pointerId5 != this.f42124c) {
                            View m38874r3 = m38874r((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                            View view = this.f42141t;
                            if (m38874r3 == view && m38858I(view, pointerId5)) {
                                i10 = this.f42124c;
                                break;
                            }
                        }
                        i11++;
                    }
                    if (i10 == -1) {
                        m38850A();
                    }
                }
                m38866h(pointerId4);
                return;
            }
            if (this.f42122a == 1) {
                m38870n(0.0f, 0.0f);
            }
        } else if (this.f42122a == 1) {
            m38850A();
        }
        m38859a();
    }
}
