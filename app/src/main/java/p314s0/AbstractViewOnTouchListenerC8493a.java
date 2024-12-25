package p314s0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s0/a.class
 */
/* renamed from: s0.a */
/* loaded from: combined.jar:classes1.jar:s0/a.class */
public abstract class AbstractViewOnTouchListenerC8493a implements View.OnTouchListener {

    /* renamed from: s */
    public static final int f39827s = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    public final View f39830d;

    /* renamed from: e */
    public Runnable f39831e;

    /* renamed from: h */
    public int f39834h;

    /* renamed from: i */
    public int f39835i;

    /* renamed from: m */
    public boolean f39839m;

    /* renamed from: n */
    public boolean f39840n;

    /* renamed from: o */
    public boolean f39841o;

    /* renamed from: p */
    public boolean f39842p;

    /* renamed from: q */
    public boolean f39843q;

    /* renamed from: r */
    public boolean f39844r;

    /* renamed from: b */
    public final a f39828b = new a();

    /* renamed from: c */
    public final Interpolator f39829c = new AccelerateInterpolator();

    /* renamed from: f */
    public float[] f39832f = {0.0f, 0.0f};

    /* renamed from: g */
    public float[] f39833g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    public float[] f39836j = {0.0f, 0.0f};

    /* renamed from: k */
    public float[] f39837k = {0.0f, 0.0f};

    /* renamed from: l */
    public float[] f39838l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s0/a$a.class
     */
    /* renamed from: s0.a$a */
    /* loaded from: combined.jar:classes1.jar:s0/a$a.class */
    public static class a {

        /* renamed from: a */
        public int f39845a;

        /* renamed from: b */
        public int f39846b;

        /* renamed from: c */
        public float f39847c;

        /* renamed from: d */
        public float f39848d;

        /* renamed from: j */
        public float f39854j;

        /* renamed from: k */
        public int f39855k;

        /* renamed from: e */
        public long f39849e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f39853i = -1;

        /* renamed from: f */
        public long f39850f = 0;

        /* renamed from: g */
        public int f39851g = 0;

        /* renamed from: h */
        public int f39852h = 0;

        /* renamed from: a */
        public void m36671a() {
            if (this.f39850f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m36677g = m36677g(m36675e(currentAnimationTimeMillis));
            long j10 = this.f39850f;
            this.f39850f = currentAnimationTimeMillis;
            float f10 = (currentAnimationTimeMillis - j10) * m36677g;
            this.f39851g = (int) (this.f39847c * f10);
            this.f39852h = (int) (f10 * this.f39848d);
        }

        /* renamed from: b */
        public int m36672b() {
            return this.f39851g;
        }

        /* renamed from: c */
        public int m36673c() {
            return this.f39852h;
        }

        /* renamed from: d */
        public int m36674d() {
            float f10 = this.f39847c;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: e */
        public final float m36675e(long j10) {
            if (j10 < this.f39849e) {
                return 0.0f;
            }
            long j11 = this.f39853i;
            if (j11 < 0 || j10 < j11) {
                return AbstractViewOnTouchListenerC8493a.m36649e((j10 - r0) / this.f39845a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f39854j;
            return (1.0f - f10) + (f10 * AbstractViewOnTouchListenerC8493a.m36649e((j10 - j11) / this.f39855k, 0.0f, 1.0f));
        }

        /* renamed from: f */
        public int m36676f() {
            float f10 = this.f39848d;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: g */
        public final float m36677g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        /* renamed from: h */
        public boolean m36678h() {
            return this.f39853i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f39853i + ((long) this.f39855k);
        }

        /* renamed from: i */
        public void m36679i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f39855k = AbstractViewOnTouchListenerC8493a.m36650f((int) (currentAnimationTimeMillis - this.f39849e), 0, this.f39846b);
            this.f39854j = m36675e(currentAnimationTimeMillis);
            this.f39853i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m36680j(int i10) {
            this.f39846b = i10;
        }

        /* renamed from: k */
        public void m36681k(int i10) {
            this.f39845a = i10;
        }

        /* renamed from: l */
        public void m36682l(float f10, float f11) {
            this.f39847c = f10;
            this.f39848d = f11;
        }

        /* renamed from: m */
        public void m36683m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f39849e = currentAnimationTimeMillis;
            this.f39853i = -1L;
            this.f39850f = currentAnimationTimeMillis;
            this.f39854j = 0.5f;
            this.f39851g = 0;
            this.f39852h = 0;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:s0/a$b.class
     */
    /* renamed from: s0.a$b */
    /* loaded from: combined.jar:classes1.jar:s0/a$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final AbstractViewOnTouchListenerC8493a f39856b;

        public b(AbstractViewOnTouchListenerC8493a abstractViewOnTouchListenerC8493a) {
            this.f39856b = abstractViewOnTouchListenerC8493a;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC8493a abstractViewOnTouchListenerC8493a = this.f39856b;
            if (abstractViewOnTouchListenerC8493a.f39842p) {
                if (abstractViewOnTouchListenerC8493a.f39840n) {
                    abstractViewOnTouchListenerC8493a.f39840n = false;
                    abstractViewOnTouchListenerC8493a.f39828b.m36683m();
                }
                a aVar = this.f39856b.f39828b;
                if (aVar.m36678h() || !this.f39856b.m36669u()) {
                    this.f39856b.f39842p = false;
                    return;
                }
                AbstractViewOnTouchListenerC8493a abstractViewOnTouchListenerC8493a2 = this.f39856b;
                if (abstractViewOnTouchListenerC8493a2.f39841o) {
                    abstractViewOnTouchListenerC8493a2.f39841o = false;
                    abstractViewOnTouchListenerC8493a2.m36653c();
                }
                aVar.m36671a();
                this.f39856b.mo36658j(aVar.m36672b(), aVar.m36673c());
                C6824g0.m31523h0(this.f39856b.f39830d, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC8493a(View view) {
        this.f39830d = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        int i10 = (int) ((1575.0f * f10) + 0.5f);
        int i11 = (int) ((f10 * 315.0f) + 0.5f);
        float f11 = i10;
        m36663o(f11, f11);
        float f12 = i11;
        m36664p(f12, f12);
        m36660l(1);
        m36662n(Float.MAX_VALUE, Float.MAX_VALUE);
        m36667s(0.2f, 0.2f);
        m36668t(1.0f, 1.0f);
        m36659k(f39827s);
        m36666r(500);
        m36665q(500);
    }

    /* renamed from: e */
    public static float m36649e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* renamed from: f */
    public static int m36650f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    /* renamed from: a */
    public abstract boolean mo36651a(int i10);

    /* renamed from: b */
    public abstract boolean mo36652b(int i10);

    /* renamed from: c */
    public void m36653c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f39830d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float m36654d(int i10, float f10, float f11, float f12) {
        float m36656h = m36656h(this.f39832f[i10], f11, this.f39833g[i10], f10);
        if (m36656h == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f39836j[i10];
        float f14 = this.f39837k[i10];
        float f15 = this.f39838l[i10];
        float f16 = f13 * f12;
        return m36656h > 0.0f ? m36649e(m36656h * f16, f14, f15) : -m36649e((-m36656h) * f16, f14, f15);
    }

    /* renamed from: g */
    public final float m36655g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f39834h;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                return f10 >= 0.0f ? 1.0f - (f10 / f11) : (this.f39842p && i10 == 1) ? 1.0f : 0.0f;
            }
            return 0.0f;
        }
        if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float m36656h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float m36649e = m36649e(f10 * f11, 0.0f, f12);
        float m36655g = m36655g(f11 - f13, m36649e) - m36655g(f13, m36649e);
        if (m36655g < 0.0f) {
            interpolation = -this.f39829c.getInterpolation(-m36655g);
        } else {
            if (m36655g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f39829c.getInterpolation(m36655g);
        }
        return m36649e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public final void m36657i() {
        if (this.f39840n) {
            this.f39842p = false;
        } else {
            this.f39828b.m36679i();
        }
    }

    /* renamed from: j */
    public abstract void mo36658j(int i10, int i11);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC8493a m36659k(int i10) {
        this.f39835i = i10;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC8493a m36660l(int i10) {
        this.f39834h = i10;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC8493a m36661m(boolean z10) {
        if (this.f39843q && !z10) {
            m36657i();
        }
        this.f39843q = z10;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC8493a m36662n(float f10, float f11) {
        float[] fArr = this.f39833g;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC8493a m36663o(float f10, float f11) {
        float[] fArr = this.f39838l;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0 != 3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r0 = r6
            boolean r0 = r0.f39843q
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r12
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r8
            int r0 = r0.getActionMasked()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L37
            r0 = r11
            r1 = 1
            if (r0 == r1) goto L30
            r0 = r11
            r1 = 2
            if (r0 == r1) goto L41
            r0 = r11
            r1 = 3
            if (r0 == r1) goto L30
            goto L8c
        L30:
            r0 = r6
            r0.m36657i()
            goto L8c
        L37:
            r0 = r6
            r1 = 1
            r0.f39841o = r1
            r0 = r6
            r1 = 0
            r0.f39839m = r1
        L41:
            r0 = r6
            r1 = 0
            r2 = r8
            float r2 = r2.getX()
            r3 = r7
            int r3 = r3.getWidth()
            float r3 = (float) r3
            r4 = r6
            android.view.View r4 = r4.f39830d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r0.m36654d(r1, r2, r3, r4)
            r10 = r0
            r0 = r6
            r1 = 1
            r2 = r8
            float r2 = r2.getY()
            r3 = r7
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4 = r6
            android.view.View r4 = r4.f39830d
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r0 = r0.m36654d(r1, r2, r3, r4)
            r9 = r0
            r0 = r6
            s0.a$a r0 = r0.f39828b
            r1 = r10
            r2 = r9
            r0.m36682l(r1, r2)
            r0 = r6
            boolean r0 = r0.f39842p
            if (r0 != 0) goto L8c
            r0 = r6
            boolean r0 = r0.m36669u()
            if (r0 == 0) goto L8c
            r0 = r6
            r0.m36670v()
        L8c:
            r0 = r13
            r12 = r0
            r0 = r6
            boolean r0 = r0.f39844r
            if (r0 == 0) goto La5
            r0 = r13
            r12 = r0
            r0 = r6
            boolean r0 = r0.f39842p
            if (r0 == 0) goto La5
            r0 = 1
            r12 = r0
        La5:
            r0 = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p314s0.AbstractViewOnTouchListenerC8493a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC8493a m36664p(float f10, float f11) {
        float[] fArr = this.f39837k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC8493a m36665q(int i10) {
        this.f39828b.m36680j(i10);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC8493a m36666r(int i10) {
        this.f39828b.m36681k(i10);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC8493a m36667s(float f10, float f11) {
        float[] fArr = this.f39832f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC8493a m36668t(float f10, float f11) {
        float[] fArr = this.f39836j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    public boolean m36669u() {
        a aVar = this.f39828b;
        int m36676f = aVar.m36676f();
        int m36674d = aVar.m36674d();
        return (m36676f != 0 && mo36652b(m36676f)) || (m36674d != 0 && mo36651a(m36674d));
    }

    /* renamed from: v */
    public final void m36670v() {
        int i10;
        if (this.f39831e == null) {
            this.f39831e = new b(this);
        }
        this.f39842p = true;
        this.f39840n = true;
        if (this.f39839m || (i10 = this.f39835i) <= 0) {
            this.f39831e.run();
        } else {
            C6824g0.m31525i0(this.f39830d, this.f39831e, i10);
        }
        this.f39839m = true;
    }
}
