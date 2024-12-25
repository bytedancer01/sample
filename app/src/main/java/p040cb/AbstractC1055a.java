package p040cb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p138i0.C5146a;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cb/a.class
 */
/* renamed from: cb.a */
/* loaded from: combined.jar:classes2.jar:cb/a.class */
public abstract class AbstractC1055a<V extends View> extends C1057c<V> {

    /* renamed from: d */
    public Runnable f7042d;

    /* renamed from: e */
    public OverScroller f7043e;

    /* renamed from: f */
    public boolean f7044f;

    /* renamed from: g */
    public int f7045g;

    /* renamed from: h */
    public int f7046h;

    /* renamed from: i */
    public int f7047i;

    /* renamed from: j */
    public VelocityTracker f7048j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:cb/a$a.class
     */
    /* renamed from: cb.a$a */
    /* loaded from: combined.jar:classes2.jar:cb/a$a.class */
    public class a implements Runnable {

        /* renamed from: b */
        public final CoordinatorLayout f7049b;

        /* renamed from: c */
        public final V f7050c;

        /* renamed from: d */
        public final AbstractC1055a f7051d;

        public a(AbstractC1055a abstractC1055a, CoordinatorLayout coordinatorLayout, V v10) {
            this.f7051d = abstractC1055a;
            this.f7049b = coordinatorLayout;
            this.f7050c = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f7050c == null || (overScroller = this.f7051d.f7043e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                this.f7051d.mo6241N(this.f7049b, this.f7050c);
                return;
            }
            AbstractC1055a abstractC1055a = this.f7051d;
            abstractC1055a.m6243P(this.f7049b, this.f7050c, abstractC1055a.f7043e.getCurrY());
            C6824g0.m31523h0(this.f7050c, this);
        }
    }

    public AbstractC1055a() {
        this.f7045g = -1;
        this.f7047i = -1;
    }

    public AbstractC1055a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7045g = -1;
        this.f7047i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0381c
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1817D(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p040cb.AbstractC1055a.mo1817D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: H */
    public boolean mo6235H(V v10) {
        return false;
    }

    /* renamed from: I */
    public final void m6236I() {
        if (this.f7048j == null) {
            this.f7048j = VelocityTracker.obtain();
        }
    }

    /* renamed from: J */
    public final boolean m6237J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f7042d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f7042d = null;
        }
        if (this.f7043e == null) {
            this.f7043e = new OverScroller(v10.getContext());
        }
        this.f7043e.fling(0, mo6255E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f7043e.computeScrollOffset()) {
            mo6241N(coordinatorLayout, v10);
            return false;
        }
        a aVar = new a(this, coordinatorLayout, v10);
        this.f7042d = aVar;
        C6824g0.m31523h0(v10, aVar);
        return true;
    }

    /* renamed from: K */
    public int mo6238K(V v10) {
        return -v10.getHeight();
    }

    /* renamed from: L */
    public int mo6239L(V v10) {
        return v10.getHeight();
    }

    /* renamed from: M */
    public int mo6240M() {
        return mo6255E();
    }

    /* renamed from: N */
    public void mo6241N(CoordinatorLayout coordinatorLayout, V v10) {
    }

    /* renamed from: O */
    public final int m6242O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return mo6244Q(coordinatorLayout, v10, mo6240M() - i10, i11, i12);
    }

    /* renamed from: P */
    public int m6243P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return mo6244Q(coordinatorLayout, v10, i10, NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, Integer.MAX_VALUE);
    }

    /* renamed from: Q */
    public int mo6244Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int i13;
        int m25779b;
        int mo6255E = mo6255E();
        if (i11 == 0 || mo6255E < i11 || mo6255E > i12 || mo6255E == (m25779b = C5146a.m25779b(i10, i11, i12))) {
            i13 = 0;
        } else {
            mo6256G(m25779b);
            i13 = mo6255E - m25779b;
        }
        return i13;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0381c
    /* renamed from: k */
    public boolean mo1828k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f7047i < 0) {
            this.f7047i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f7044f) {
            int i10 = this.f7045g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f7046h) > this.f7047i) {
                this.f7046h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7045g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = mo6235H(v10) && coordinatorLayout.m1777C(v10, x10, y11);
            this.f7044f = z10;
            if (z10) {
                this.f7046h = y11;
                this.f7045g = motionEvent.getPointerId(0);
                m6236I();
                OverScroller overScroller = this.f7043e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f7043e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f7048j;
        if (velocityTracker == null) {
            return false;
        }
        velocityTracker.addMovement(motionEvent);
        return false;
    }
}
