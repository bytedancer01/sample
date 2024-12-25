package p398x5;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p364v5.AbstractC9244b;
import p364v5.AbstractC9245c;
import p364v5.C9243a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x5/f.class
 */
/* renamed from: x5.f */
/* loaded from: combined.jar:classes1.jar:x5/f.class */
public abstract class AbstractC9668f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* renamed from: e */
    public float f44075e;

    /* renamed from: f */
    public float f44076f;

    /* renamed from: g */
    public int f44077g;

    /* renamed from: h */
    public int f44078h;

    /* renamed from: i */
    public int f44079i;

    /* renamed from: j */
    public int f44080j;

    /* renamed from: k */
    public int f44081k;

    /* renamed from: l */
    public int f44082l;

    /* renamed from: m */
    public float f44083m;

    /* renamed from: n */
    public float f44084n;

    /* renamed from: o */
    public ValueAnimator f44085o;

    /* renamed from: t */
    public static final Rect f44065t = new Rect();

    /* renamed from: u */
    public static final Property<AbstractC9668f, Integer> f44066u = new c("rotateX");

    /* renamed from: v */
    public static final Property<AbstractC9668f, Integer> f44067v = new d("rotate");

    /* renamed from: w */
    public static final Property<AbstractC9668f, Integer> f44068w = new e("rotateY");

    /* renamed from: x */
    public static final Property<AbstractC9668f, Integer> f44069x = new f("translateX");

    /* renamed from: y */
    public static final Property<AbstractC9668f, Integer> f44070y = new g("translateY");

    /* renamed from: z */
    public static final Property<AbstractC9668f, Float> f44071z = new h("translateXPercentage");

    /* renamed from: A */
    public static final Property<AbstractC9668f, Float> f44060A = new i("translateYPercentage");

    /* renamed from: B */
    public static final Property<AbstractC9668f, Float> f44061B = new j("scaleX");

    /* renamed from: C */
    public static final Property<AbstractC9668f, Float> f44062C = new k("scaleY");

    /* renamed from: D */
    public static final Property<AbstractC9668f, Float> f44063D = new a("scale");

    /* renamed from: E */
    public static final Property<AbstractC9668f, Integer> f44064E = new b("alpha");

    /* renamed from: b */
    public float f44072b = 1.0f;

    /* renamed from: c */
    public float f44073c = 1.0f;

    /* renamed from: d */
    public float f44074d = 1.0f;

    /* renamed from: p */
    public int f44086p = 255;

    /* renamed from: q */
    public Rect f44087q = f44065t;

    /* renamed from: r */
    public Camera f44088r = new Camera();

    /* renamed from: s */
    public Matrix f44089s = new Matrix();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$a.class
     */
    /* renamed from: x5.f$a */
    /* loaded from: combined.jar:classes1.jar:x5/f$a.class */
    public static final class a extends AbstractC9244b<AbstractC9668f> {
        public a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC9668f abstractC9668f) {
            return Float.valueOf(abstractC9668f.m40612j());
        }

        @Override // p364v5.AbstractC9244b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38982b(AbstractC9668f abstractC9668f, float f10) {
            abstractC9668f.m40598C(f10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$b.class
     */
    /* renamed from: x5.f$b */
    /* loaded from: combined.jar:classes1.jar:x5/f$b.class */
    public static final class b extends AbstractC9245c<AbstractC9668f> {
        public b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(AbstractC9668f abstractC9668f) {
            return Integer.valueOf(abstractC9668f.getAlpha());
        }

        @Override // p364v5.AbstractC9245c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38984b(AbstractC9668f abstractC9668f, int i10) {
            abstractC9668f.setAlpha(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$c.class
     */
    /* renamed from: x5.f$c */
    /* loaded from: combined.jar:classes1.jar:x5/f$c.class */
    public static final class c extends AbstractC9245c<AbstractC9668f> {
        public c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(AbstractC9668f abstractC9668f) {
            return Integer.valueOf(abstractC9668f.m40610h());
        }

        @Override // p364v5.AbstractC9245c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38984b(AbstractC9668f abstractC9668f, int i10) {
            abstractC9668f.m40596A(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$d.class
     */
    /* renamed from: x5.f$d */
    /* loaded from: combined.jar:classes1.jar:x5/f$d.class */
    public static final class d extends AbstractC9245c<AbstractC9668f> {
        public d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(AbstractC9668f abstractC9668f) {
            return Integer.valueOf(abstractC9668f.m40609g());
        }

        @Override // p364v5.AbstractC9245c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38984b(AbstractC9668f abstractC9668f, int i10) {
            abstractC9668f.m40627z(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$e.class
     */
    /* renamed from: x5.f$e */
    /* loaded from: combined.jar:classes1.jar:x5/f$e.class */
    public static final class e extends AbstractC9245c<AbstractC9668f> {
        public e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(AbstractC9668f abstractC9668f) {
            return Integer.valueOf(abstractC9668f.m40611i());
        }

        @Override // p364v5.AbstractC9245c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38984b(AbstractC9668f abstractC9668f, int i10) {
            abstractC9668f.m40597B(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$f.class
     */
    /* renamed from: x5.f$f */
    /* loaded from: combined.jar:classes1.jar:x5/f$f.class */
    public static final class f extends AbstractC9245c<AbstractC9668f> {
        public f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(AbstractC9668f abstractC9668f) {
            return Integer.valueOf(abstractC9668f.m40615m());
        }

        @Override // p364v5.AbstractC9245c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38984b(AbstractC9668f abstractC9668f, int i10) {
            abstractC9668f.m40601F(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$g.class
     */
    /* renamed from: x5.f$g */
    /* loaded from: combined.jar:classes1.jar:x5/f$g.class */
    public static final class g extends AbstractC9245c<AbstractC9668f> {
        public g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer get(AbstractC9668f abstractC9668f) {
            return Integer.valueOf(abstractC9668f.m40617o());
        }

        @Override // p364v5.AbstractC9245c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38984b(AbstractC9668f abstractC9668f, int i10) {
            abstractC9668f.m40603H(i10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$h.class
     */
    /* renamed from: x5.f$h */
    /* loaded from: combined.jar:classes1.jar:x5/f$h.class */
    public static final class h extends AbstractC9244b<AbstractC9668f> {
        public h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC9668f abstractC9668f) {
            return Float.valueOf(abstractC9668f.m40616n());
        }

        @Override // p364v5.AbstractC9244b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38982b(AbstractC9668f abstractC9668f, float f10) {
            abstractC9668f.m40602G(f10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$i.class
     */
    /* renamed from: x5.f$i */
    /* loaded from: combined.jar:classes1.jar:x5/f$i.class */
    public static final class i extends AbstractC9244b<AbstractC9668f> {
        public i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC9668f abstractC9668f) {
            return Float.valueOf(abstractC9668f.m40618p());
        }

        @Override // p364v5.AbstractC9244b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38982b(AbstractC9668f abstractC9668f, float f10) {
            abstractC9668f.m40604I(f10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$j.class
     */
    /* renamed from: x5.f$j */
    /* loaded from: combined.jar:classes1.jar:x5/f$j.class */
    public static final class j extends AbstractC9244b<AbstractC9668f> {
        public j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC9668f abstractC9668f) {
            return Float.valueOf(abstractC9668f.m40613k());
        }

        @Override // p364v5.AbstractC9244b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38982b(AbstractC9668f abstractC9668f, float f10) {
            abstractC9668f.m40599D(f10);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:x5/f$k.class
     */
    /* renamed from: x5.f$k */
    /* loaded from: combined.jar:classes1.jar:x5/f$k.class */
    public static final class k extends AbstractC9244b<AbstractC9668f> {
        public k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC9668f abstractC9668f) {
            return Float.valueOf(abstractC9668f.m40614l());
        }

        @Override // p364v5.AbstractC9244b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo38982b(AbstractC9668f abstractC9668f, float f10) {
            abstractC9668f.m40600E(f10);
        }
    }

    /* renamed from: A */
    public void m40596A(int i10) {
        this.f44078h = i10;
    }

    /* renamed from: B */
    public void m40597B(int i10) {
        this.f44079i = i10;
    }

    /* renamed from: C */
    public void m40598C(float f10) {
        this.f44072b = f10;
        m40599D(f10);
        m40600E(f10);
    }

    /* renamed from: D */
    public void m40599D(float f10) {
        this.f44073c = f10;
    }

    /* renamed from: E */
    public void m40600E(float f10) {
        this.f44074d = f10;
    }

    /* renamed from: F */
    public void m40601F(int i10) {
        this.f44080j = i10;
    }

    /* renamed from: G */
    public void m40602G(float f10) {
        this.f44083m = f10;
    }

    /* renamed from: H */
    public void m40603H(int i10) {
        this.f44081k = i10;
    }

    /* renamed from: I */
    public void m40604I(float f10) {
        this.f44084n = f10;
    }

    /* renamed from: a */
    public Rect m40605a(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i10 = min / 2;
        return new Rect(centerX - i10, centerY - i10, centerX + i10, centerY + i10);
    }

    /* renamed from: b */
    public abstract void mo40593b(Canvas canvas);

    /* renamed from: c */
    public abstract int mo40594c();

    /* renamed from: d */
    public Rect m40606d() {
        return this.f44087q;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int m40615m = m40615m();
        int i10 = m40615m;
        if (m40615m == 0) {
            i10 = (int) (getBounds().width() * m40616n());
        }
        int m40617o = m40617o();
        int i11 = m40617o;
        if (m40617o == 0) {
            i11 = (int) (getBounds().height() * m40618p());
        }
        canvas.translate(i10, i11);
        canvas.scale(m40613k(), m40614l(), m40607e(), m40608f());
        canvas.rotate(m40609g(), m40607e(), m40608f());
        if (m40610h() != 0 || m40611i() != 0) {
            this.f44088r.save();
            this.f44088r.rotateX(m40610h());
            this.f44088r.rotateY(m40611i());
            this.f44088r.getMatrix(this.f44089s);
            this.f44089s.preTranslate(-m40607e(), -m40608f());
            this.f44089s.postTranslate(m40607e(), m40608f());
            this.f44088r.restore();
            canvas.concat(this.f44089s);
        }
        mo40593b(canvas);
    }

    /* renamed from: e */
    public float m40607e() {
        return this.f44075e;
    }

    /* renamed from: f */
    public float m40608f() {
        return this.f44076f;
    }

    /* renamed from: g */
    public int m40609g() {
        return this.f44082l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f44086p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int m40610h() {
        return this.f44078h;
    }

    /* renamed from: i */
    public int m40611i() {
        return this.f44079i;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return C9243a.m38975a(this.f44085o);
    }

    /* renamed from: j */
    public float m40612j() {
        return this.f44072b;
    }

    /* renamed from: k */
    public float m40613k() {
        return this.f44073c;
    }

    /* renamed from: l */
    public float m40614l() {
        return this.f44074d;
    }

    /* renamed from: m */
    public int m40615m() {
        return this.f44080j;
    }

    /* renamed from: n */
    public float m40616n() {
        return this.f44083m;
    }

    /* renamed from: o */
    public int m40617o() {
        return this.f44081k;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m40624w(rect);
    }

    /* renamed from: p */
    public float m40618p() {
        return this.f44084n;
    }

    /* renamed from: q */
    public ValueAnimator m40619q() {
        if (this.f44085o == null) {
            this.f44085o = mo40620r();
        }
        ValueAnimator valueAnimator = this.f44085o;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.f44085o.setStartDelay(this.f44077g);
        }
        return this.f44085o;
    }

    /* renamed from: r */
    public abstract ValueAnimator mo40620r();

    /* renamed from: s */
    public void m40621s() {
        this.f44072b = 1.0f;
        this.f44078h = 0;
        this.f44079i = 0;
        this.f44080j = 0;
        this.f44081k = 0;
        this.f44082l = 0;
        this.f44083m = 0.0f;
        this.f44084n = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f44086p = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (C9243a.m38977c(this.f44085o)) {
            return;
        }
        ValueAnimator m40619q = m40619q();
        this.f44085o = m40619q;
        if (m40619q == null) {
            return;
        }
        C9243a.m38978d(m40619q);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (C9243a.m38977c(this.f44085o)) {
            this.f44085o.removeAllUpdateListeners();
            this.f44085o.end();
            m40621s();
        }
    }

    /* renamed from: t */
    public AbstractC9668f m40622t(int i10) {
        this.f44077g = i10;
        return this;
    }

    /* renamed from: u */
    public abstract void mo40595u(int i10);

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* renamed from: v */
    public void m40623v(int i10, int i11, int i12, int i13) {
        this.f44087q = new Rect(i10, i11, i12, i13);
        m40625x(m40606d().centerX());
        m40626y(m40606d().centerY());
    }

    /* renamed from: w */
    public void m40624w(Rect rect) {
        m40623v(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: x */
    public void m40625x(float f10) {
        this.f44075e = f10;
    }

    /* renamed from: y */
    public void m40626y(float f10) {
        this.f44076f = f10;
    }

    /* renamed from: z */
    public void m40627z(int i10) {
        this.f44082l = i10;
    }
}
