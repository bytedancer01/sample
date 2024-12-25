package p086f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0307d1;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p020b2.C0783b;
import p020b2.C0788g;
import p069e0.C4570i;
import p086f.C4734b;
import p086f.C4737e;
import p105g.C4914b;
import p106g0.InterfaceC4924j;
import p294r.C7933f;
import p294r.C7937j;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f/a.class
 */
@SuppressLint({"RestrictedAPI"})
/* renamed from: f.a */
/* loaded from: combined.jar:classes1.jar:f/a.class */
public class C4733a extends C4737e implements InterfaceC4924j {

    /* renamed from: u */
    public static final String f27884u = C4733a.class.getSimpleName();

    /* renamed from: p */
    public c f27885p;

    /* renamed from: q */
    public g f27886q;

    /* renamed from: r */
    public int f27887r;

    /* renamed from: s */
    public int f27888s;

    /* renamed from: t */
    public boolean f27889t;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/a$b.class
     */
    /* renamed from: f.a$b */
    /* loaded from: combined.jar:classes1.jar:f/a$b.class */
    public static class b extends g {

        /* renamed from: a */
        public final Animatable f27890a;

        public b(Animatable animatable) {
            super();
            this.f27890a = animatable;
        }

        @Override // p086f.C4733a.g
        /* renamed from: c */
        public void mo23900c() {
            this.f27890a.start();
        }

        @Override // p086f.C4733a.g
        /* renamed from: d */
        public void mo23901d() {
            this.f27890a.stop();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/a$c.class
     */
    /* renamed from: f.a$c */
    /* loaded from: combined.jar:classes1.jar:f/a$c.class */
    public static class c extends C4737e.a {

        /* renamed from: K */
        public C7933f<Long> f27891K;

        /* renamed from: L */
        public C7937j<Integer> f27892L;

        public c(c cVar, C4733a c4733a, Resources resources) {
            super(cVar, c4733a, resources);
            C7937j<Integer> c7937j;
            if (cVar != null) {
                this.f27891K = cVar.f27891K;
                c7937j = cVar.f27892L;
            } else {
                this.f27891K = new C7933f<>();
                c7937j = new C7937j<>();
            }
            this.f27892L = c7937j;
        }

        /* renamed from: D */
        public static long m23902D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        /* renamed from: B */
        public int m23903B(int[] iArr, Drawable drawable, int i10) {
            int m23961z = super.m23961z(iArr, drawable);
            this.f27892L.m34452j(m23961z, Integer.valueOf(i10));
            return m23961z;
        }

        /* renamed from: C */
        public int m23904C(int i10, int i11, Drawable drawable, boolean z10) {
            int m23927a = super.m23927a(drawable);
            long m23902D = m23902D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = m23927a;
            this.f27891K.m34395a(m23902D, Long.valueOf(j11 | j10));
            if (z10) {
                this.f27891K.m34395a(m23902D(i11, i10), Long.valueOf(IjkMediaMeta.AV_CH_WIDE_RIGHT | j11 | j10));
            }
            return m23927a;
        }

        /* renamed from: E */
        public int m23905E(int i10) {
            return i10 < 0 ? 0 : this.f27892L.m34449g(i10, 0).intValue();
        }

        /* renamed from: F */
        public int m23906F(int[] iArr) {
            int m23960A = super.m23960A(iArr);
            return m23960A >= 0 ? m23960A : super.m23960A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        public int m23907G(int i10, int i11) {
            return (int) this.f27891K.m34400g(m23902D(i10, i11), -1L).longValue();
        }

        /* renamed from: H */
        public boolean m23908H(int i10, int i11) {
            return (this.f27891K.m34400g(m23902D(i10, i11), -1L).longValue() & IjkMediaMeta.AV_CH_WIDE_RIGHT) != 0;
        }

        /* renamed from: I */
        public boolean m23909I(int i10, int i11) {
            return (this.f27891K.m34400g(m23902D(i10, i11), -1L).longValue() & IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) != 0;
        }

        @Override // p086f.C4737e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C4733a(this, null);
        }

        @Override // p086f.C4737e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C4733a(this, resources);
        }

        @Override // p086f.C4737e.a, p086f.C4734b.d
        /* renamed from: r */
        public void mo23910r() {
            this.f27891K = this.f27891K.clone();
            this.f27892L = this.f27892L.clone();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/a$d.class
     */
    /* renamed from: f.a$d */
    /* loaded from: combined.jar:classes1.jar:f/a$d.class */
    public static class d extends g {

        /* renamed from: a */
        public final C0783b f27893a;

        public d(C0783b c0783b) {
            super();
            this.f27893a = c0783b;
        }

        @Override // p086f.C4733a.g
        /* renamed from: c */
        public void mo23900c() {
            this.f27893a.start();
        }

        @Override // p086f.C4733a.g
        /* renamed from: d */
        public void mo23901d() {
            this.f27893a.stop();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/a$e.class
     */
    /* renamed from: f.a$e */
    /* loaded from: combined.jar:classes1.jar:f/a$e.class */
    public static class e extends g {

        /* renamed from: a */
        public final ObjectAnimator f27894a;

        /* renamed from: b */
        public final boolean f27895b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.m23913a());
            ofInt.setInterpolator(fVar);
            this.f27895b = z11;
            this.f27894a = ofInt;
        }

        @Override // p086f.C4733a.g
        /* renamed from: a */
        public boolean mo23911a() {
            return this.f27895b;
        }

        @Override // p086f.C4733a.g
        /* renamed from: b */
        public void mo23912b() {
            this.f27894a.reverse();
        }

        @Override // p086f.C4733a.g
        /* renamed from: c */
        public void mo23900c() {
            this.f27894a.start();
        }

        @Override // p086f.C4733a.g
        /* renamed from: d */
        public void mo23901d() {
            this.f27894a.cancel();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/a$f.class
     */
    /* renamed from: f.a$f */
    /* loaded from: combined.jar:classes1.jar:f/a$f.class */
    public static class f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f27896a;

        /* renamed from: b */
        public int f27897b;

        /* renamed from: c */
        public int f27898c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            m23914b(animationDrawable, z10);
        }

        /* renamed from: a */
        public int m23913a() {
            return this.f27898c;
        }

        /* renamed from: b */
        public int m23914b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f27897b = numberOfFrames;
            int[] iArr = this.f27896a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f27896a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f27896a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f27898c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10;
            int i11 = (int) ((f10 * this.f27898c) + 0.5f);
            int i12 = this.f27897b;
            int[] iArr = this.f27896a;
            int i13 = 0;
            while (i13 < i12 && i11 >= (i10 = iArr[i13])) {
                i11 -= i10;
                i13++;
            }
            return (i13 / i12) + (i13 < i12 ? i11 / this.f27898c : 0.0f);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:f/a$g.class
     */
    /* renamed from: f.a$g */
    /* loaded from: combined.jar:classes1.jar:f/a$g.class */
    public static abstract class g {
        public g() {
        }

        /* renamed from: a */
        public boolean mo23911a() {
            return false;
        }

        /* renamed from: b */
        public void mo23912b() {
        }

        /* renamed from: c */
        public abstract void mo23900c();

        /* renamed from: d */
        public abstract void mo23901d();
    }

    public C4733a() {
        this(null, null);
    }

    public C4733a(c cVar, Resources resources) {
        super(null);
        this.f27887r = -1;
        this.f27888s = -1;
        mo23890h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: m */
    public static C4733a m23888m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C4733a c4733a = new C4733a();
            c4733a.m23893n(context, resources, xmlPullParser, attributeSet, theme);
            return c4733a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // p086f.C4737e, p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p086f.C4737e, p086f.C4734b
    /* renamed from: h */
    public void mo23890h(C4734b.d dVar) {
        super.mo23890h(dVar);
        if (dVar instanceof c) {
            this.f27885p = (c) dVar;
        }
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // p086f.C4737e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f27886q;
        if (gVar != null) {
            gVar.mo23901d();
            this.f27886q = null;
            m23920g(this.f27887r);
            this.f27887r = -1;
            this.f27888s = -1;
        }
    }

    @Override // p086f.C4737e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c mo23889b() {
        return new c(this.f27885p, this, null);
    }

    @Override // p086f.C4737e, p086f.C4734b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f27889t && super.mutate() == this) {
            this.f27885p.mo23910r();
            this.f27889t = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m23893n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C4914b.f28596a);
        setVisible(m23087s.getBoolean(C4914b.f28598c, true), true);
        m23899t(m23087s);
        m23921i(resources);
        m23087s.recycle();
        m23894o(context, resources, xmlPullParser, attributeSet, theme);
        m23895p();
    }

    /* renamed from: o */
    public final void m23894o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m23896q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m23897r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i10) {
        return super.onLayoutDirectionChanged(i10);
    }

    @Override // p086f.C4737e, p086f.C4734b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m23906F = this.f27885p.m23906F(iArr);
        boolean z10 = m23906F != m23917c() && (m23898s(m23906F) || m23920g(m23906F));
        Drawable current = getCurrent();
        boolean z11 = z10;
        if (current != null) {
            z11 = z10 | current.setState(iArr);
        }
        return z11;
    }

    /* renamed from: p */
    public final void m23895p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    public final int m23896q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C4914b.f28603h);
        int resourceId = m23087s.getResourceId(C4914b.f28604i, 0);
        int resourceId2 = m23087s.getResourceId(C4914b.f28605j, -1);
        Drawable m1296j = resourceId2 > 0 ? C0307d1.m1285h().m1296j(context, resourceId2) : null;
        m23087s.recycle();
        int[] m23959k = m23959k(attributeSet);
        Drawable drawable = m1296j;
        if (m1296j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawable = xmlPullParser.getName().equals("vector") ? C0788g.m5048c(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable != null) {
            return this.f27885p.m23903B(m23959k, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    public final int m23897r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray m23087s = C4570i.m23087s(resources, theme, attributeSet, C4914b.f28606k);
        int resourceId = m23087s.getResourceId(C4914b.f28609n, -1);
        int resourceId2 = m23087s.getResourceId(C4914b.f28608m, -1);
        int resourceId3 = m23087s.getResourceId(C4914b.f28607l, -1);
        Drawable m1296j = resourceId3 > 0 ? C0307d1.m1285h().m1296j(context, resourceId3) : null;
        boolean z10 = m23087s.getBoolean(C4914b.f28610o, false);
        m23087s.recycle();
        Drawable drawable = m1296j;
        if (m1296j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawable = xmlPullParser.getName().equals("animated-vector") ? C0783b.m5021a(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f27885p.m23904C(resourceId, resourceId2, drawable, z10);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* renamed from: s */
    public final boolean m23898s(int i10) {
        int m23917c;
        int m23907G;
        g bVar;
        g gVar = this.f27886q;
        if (gVar == null) {
            m23917c = m23917c();
        } else {
            if (i10 == this.f27887r) {
                return true;
            }
            if (i10 == this.f27888s && gVar.mo23911a()) {
                gVar.mo23912b();
                this.f27887r = this.f27888s;
                this.f27888s = i10;
                return true;
            }
            m23917c = this.f27887r;
            gVar.mo23901d();
        }
        this.f27886q = null;
        this.f27888s = -1;
        this.f27887r = -1;
        c cVar = this.f27885p;
        int m23905E = cVar.m23905E(m23917c);
        int m23905E2 = cVar.m23905E(i10);
        if (m23905E2 == 0 || m23905E == 0 || (m23907G = cVar.m23907G(m23905E, m23905E2)) < 0) {
            return false;
        }
        boolean m23909I = cVar.m23909I(m23905E, m23905E2);
        m23920g(m23907G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m23908H(m23905E, m23905E2), m23909I);
        } else if (current instanceof C0783b) {
            bVar = new d((C0783b) current);
        } else {
            if (!(current instanceof Animatable)) {
                return false;
            }
            bVar = new b((Animatable) current);
        }
        bVar.mo23900c();
        this.f27886q = bVar;
        this.f27888s = m23917c;
        this.f27887r = i10;
        return true;
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        super.scheduleDrawable(drawable, runnable, j10);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z10) {
        super.setAutoMirrored(z10);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z10) {
        super.setDither(z10);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f27886q;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.mo23900c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    /* renamed from: t */
    public final void m23899t(TypedArray typedArray) {
        c cVar = this.f27885p;
        cVar.f27925d |= typedArray.getChangingConfigurations();
        cVar.m23949x(typedArray.getBoolean(C4914b.f28599d, cVar.f27930i));
        cVar.m23945t(typedArray.getBoolean(C4914b.f28600e, cVar.f27933l));
        cVar.m23946u(typedArray.getInt(C4914b.f28601f, cVar.f27913A));
        cVar.m23947v(typedArray.getInt(C4914b.f28602g, cVar.f27914B));
        setDither(typedArray.getBoolean(C4914b.f28597b, cVar.f27945x));
    }

    @Override // p086f.C4734b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
