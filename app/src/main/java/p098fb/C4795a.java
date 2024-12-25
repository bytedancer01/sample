package p098fb;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import lb.C5837a;
import p012ab.C0142b;
import p012ab.C0152l;
import p106g0.C4917c;
import p235o0.C6824g0;
import p306rb.C8459k;
import p351ub.C9148c;
import p369vb.C9332a;
import p369vb.C9333b;
import p404xb.C9712g;
import p404xb.C9716k;
import p404xb.InterfaceC9719n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fb/a.class
 */
/* renamed from: fb.a */
/* loaded from: combined.jar:classes2.jar:fb/a.class */
public class C4795a {

    /* renamed from: t */
    public static final boolean f28238t = true;

    /* renamed from: a */
    public final MaterialButton f28239a;

    /* renamed from: b */
    public C9716k f28240b;

    /* renamed from: c */
    public int f28241c;

    /* renamed from: d */
    public int f28242d;

    /* renamed from: e */
    public int f28243e;

    /* renamed from: f */
    public int f28244f;

    /* renamed from: g */
    public int f28245g;

    /* renamed from: h */
    public int f28246h;

    /* renamed from: i */
    public PorterDuff.Mode f28247i;

    /* renamed from: j */
    public ColorStateList f28248j;

    /* renamed from: k */
    public ColorStateList f28249k;

    /* renamed from: l */
    public ColorStateList f28250l;

    /* renamed from: m */
    public Drawable f28251m;

    /* renamed from: n */
    public boolean f28252n = false;

    /* renamed from: o */
    public boolean f28253o = false;

    /* renamed from: p */
    public boolean f28254p = false;

    /* renamed from: q */
    public boolean f28255q;

    /* renamed from: r */
    public LayerDrawable f28256r;

    /* renamed from: s */
    public int f28257s;

    public C4795a(MaterialButton materialButton, C9716k c9716k) {
        this.f28239a = materialButton;
        this.f28240b = c9716k;
    }

    /* renamed from: A */
    public void m24252A(ColorStateList colorStateList) {
        if (this.f28249k != colorStateList) {
            this.f28249k = colorStateList;
            m24260I();
        }
    }

    /* renamed from: B */
    public void m24253B(int i10) {
        if (this.f28246h != i10) {
            this.f28246h = i10;
            m24260I();
        }
    }

    /* renamed from: C */
    public void m24254C(ColorStateList colorStateList) {
        if (this.f28248j != colorStateList) {
            this.f28248j = colorStateList;
            if (m24267f() != null) {
                C4917c.m24851o(m24267f(), this.f28248j);
            }
        }
    }

    /* renamed from: D */
    public void m24255D(PorterDuff.Mode mode) {
        if (this.f28247i != mode) {
            this.f28247i = mode;
            if (m24267f() == null || this.f28247i == null) {
                return;
            }
            C4917c.m24852p(m24267f(), this.f28247i);
        }
    }

    /* renamed from: E */
    public final void m24256E(int i10, int i11) {
        int m31485I = C6824g0.m31485I(this.f28239a);
        int paddingTop = this.f28239a.getPaddingTop();
        int m31483H = C6824g0.m31483H(this.f28239a);
        int paddingBottom = this.f28239a.getPaddingBottom();
        int i12 = this.f28243e;
        int i13 = this.f28244f;
        this.f28244f = i11;
        this.f28243e = i10;
        if (!this.f28253o) {
            m24257F();
        }
        C6824g0.m31472B0(this.f28239a, m31485I, (paddingTop + i10) - i12, m31483H, (paddingBottom + i11) - i13);
    }

    /* renamed from: F */
    public final void m24257F() {
        this.f28239a.setInternalBackground(m24262a());
        C9712g m24267f = m24267f();
        if (m24267f != null) {
            m24267f.m40840W(this.f28257s);
        }
    }

    /* renamed from: G */
    public final void m24258G(C9716k c9716k) {
        if (m24267f() != null) {
            m24267f().setShapeAppearanceModel(c9716k);
        }
        if (m24275n() != null) {
            m24275n().setShapeAppearanceModel(c9716k);
        }
        if (m24266e() != null) {
            m24266e().setShapeAppearanceModel(c9716k);
        }
    }

    /* renamed from: H */
    public void m24259H(int i10, int i11) {
        Drawable drawable = this.f28251m;
        if (drawable != null) {
            drawable.setBounds(this.f28241c, this.f28243e, i11 - this.f28242d, i10 - this.f28244f);
        }
    }

    /* renamed from: I */
    public final void m24260I() {
        C9712g m24267f = m24267f();
        C9712g m24275n = m24275n();
        if (m24267f != null) {
            m24267f.m40846c0(this.f28246h, this.f28249k);
            if (m24275n != null) {
                m24275n.m40845b0(this.f28246h, this.f28252n ? C5837a.m28424c(this.f28239a, C0142b.f653m) : 0);
            }
        }
    }

    /* renamed from: J */
    public final InsetDrawable m24261J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f28241c, this.f28243e, this.f28242d, this.f28244f);
    }

    /* renamed from: a */
    public final Drawable m24262a() {
        C9712g c9712g = new C9712g(this.f28240b);
        c9712g.m40831M(this.f28239a.getContext());
        C4917c.m24851o(c9712g, this.f28248j);
        PorterDuff.Mode mode = this.f28247i;
        if (mode != null) {
            C4917c.m24852p(c9712g, mode);
        }
        c9712g.m40846c0(this.f28246h, this.f28249k);
        C9712g c9712g2 = new C9712g(this.f28240b);
        c9712g2.setTint(0);
        c9712g2.m40845b0(this.f28246h, this.f28252n ? C5837a.m28424c(this.f28239a, C0142b.f653m) : 0);
        if (f28238t) {
            C9712g c9712g3 = new C9712g(this.f28240b);
            this.f28251m = c9712g3;
            C4917c.m24850n(c9712g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C9333b.m39330d(this.f28250l), m24261J(new LayerDrawable(new Drawable[]{c9712g2, c9712g})), this.f28251m);
            this.f28256r = rippleDrawable;
            return rippleDrawable;
        }
        C9332a c9332a = new C9332a(this.f28240b);
        this.f28251m = c9332a;
        C4917c.m24851o(c9332a, C9333b.m39330d(this.f28250l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c9712g2, c9712g, this.f28251m});
        this.f28256r = layerDrawable;
        return m24261J(layerDrawable);
    }

    /* renamed from: b */
    public int m24263b() {
        return this.f28245g;
    }

    /* renamed from: c */
    public int m24264c() {
        return this.f28244f;
    }

    /* renamed from: d */
    public int m24265d() {
        return this.f28243e;
    }

    /* renamed from: e */
    public InterfaceC9719n m24266e() {
        LayerDrawable layerDrawable = this.f28256r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC9719n) (this.f28256r.getNumberOfLayers() > 2 ? this.f28256r.getDrawable(2) : this.f28256r.getDrawable(1));
    }

    /* renamed from: f */
    public C9712g m24267f() {
        return m24268g(false);
    }

    /* renamed from: g */
    public final C9712g m24268g(boolean z10) {
        LayerDrawable layerDrawable = this.f28256r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C9712g) (f28238t ? (LayerDrawable) ((InsetDrawable) this.f28256r.getDrawable(0)).getDrawable() : this.f28256r).getDrawable(!z10 ? 1 : 0);
    }

    /* renamed from: h */
    public ColorStateList m24269h() {
        return this.f28250l;
    }

    /* renamed from: i */
    public C9716k m24270i() {
        return this.f28240b;
    }

    /* renamed from: j */
    public ColorStateList m24271j() {
        return this.f28249k;
    }

    /* renamed from: k */
    public int m24272k() {
        return this.f28246h;
    }

    /* renamed from: l */
    public ColorStateList m24273l() {
        return this.f28248j;
    }

    /* renamed from: m */
    public PorterDuff.Mode m24274m() {
        return this.f28247i;
    }

    /* renamed from: n */
    public final C9712g m24275n() {
        return m24268g(true);
    }

    /* renamed from: o */
    public boolean m24276o() {
        return this.f28253o;
    }

    /* renamed from: p */
    public boolean m24277p() {
        return this.f28255q;
    }

    /* renamed from: q */
    public void m24278q(TypedArray typedArray) {
        this.f28241c = typedArray.getDimensionPixelOffset(C0152l.f1200t2, 0);
        this.f28242d = typedArray.getDimensionPixelOffset(C0152l.f1208u2, 0);
        this.f28243e = typedArray.getDimensionPixelOffset(C0152l.f1216v2, 0);
        this.f28244f = typedArray.getDimensionPixelOffset(C0152l.f1224w2, 0);
        int i10 = C0152l.f845A2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f28245g = dimensionPixelSize;
            m24286y(this.f28240b.m40903w(dimensionPixelSize));
            this.f28254p = true;
        }
        this.f28246h = typedArray.getDimensionPixelSize(C0152l.f925K2, 0);
        this.f28247i = C8459k.m36344e(typedArray.getInt(C0152l.f1248z2, -1), PorterDuff.Mode.SRC_IN);
        this.f28248j = C9148c.m38476a(this.f28239a.getContext(), typedArray, C0152l.f1240y2);
        this.f28249k = C9148c.m38476a(this.f28239a.getContext(), typedArray, C0152l.f917J2);
        this.f28250l = C9148c.m38476a(this.f28239a.getContext(), typedArray, C0152l.f909I2);
        this.f28255q = typedArray.getBoolean(C0152l.f1232x2, false);
        this.f28257s = typedArray.getDimensionPixelSize(C0152l.f853B2, 0);
        int m31485I = C6824g0.m31485I(this.f28239a);
        int paddingTop = this.f28239a.getPaddingTop();
        int m31483H = C6824g0.m31483H(this.f28239a);
        int paddingBottom = this.f28239a.getPaddingBottom();
        if (typedArray.hasValue(C0152l.f1192s2)) {
            m24280s();
        } else {
            m24257F();
        }
        C6824g0.m31472B0(this.f28239a, m31485I + this.f28241c, paddingTop + this.f28243e, m31483H + this.f28242d, paddingBottom + this.f28244f);
    }

    /* renamed from: r */
    public void m24279r(int i10) {
        if (m24267f() != null) {
            m24267f().setTint(i10);
        }
    }

    /* renamed from: s */
    public void m24280s() {
        this.f28253o = true;
        this.f28239a.setSupportBackgroundTintList(this.f28248j);
        this.f28239a.setSupportBackgroundTintMode(this.f28247i);
    }

    /* renamed from: t */
    public void m24281t(boolean z10) {
        this.f28255q = z10;
    }

    /* renamed from: u */
    public void m24282u(int i10) {
        if (this.f28254p && this.f28245g == i10) {
            return;
        }
        this.f28245g = i10;
        this.f28254p = true;
        m24286y(this.f28240b.m40903w(i10));
    }

    /* renamed from: v */
    public void m24283v(int i10) {
        m24256E(this.f28243e, i10);
    }

    /* renamed from: w */
    public void m24284w(int i10) {
        m24256E(i10, this.f28244f);
    }

    /* renamed from: x */
    public void m24285x(ColorStateList colorStateList) {
        if (this.f28250l != colorStateList) {
            this.f28250l = colorStateList;
            boolean z10 = f28238t;
            if (z10 && (this.f28239a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f28239a.getBackground()).setColor(C9333b.m39330d(colorStateList));
            } else {
                if (z10 || !(this.f28239a.getBackground() instanceof C9332a)) {
                    return;
                }
                ((C9332a) this.f28239a.getBackground()).setTintList(C9333b.m39330d(colorStateList));
            }
        }
    }

    /* renamed from: y */
    public void m24286y(C9716k c9716k) {
        this.f28240b = c9716k;
        m24258G(c9716k);
    }

    /* renamed from: z */
    public void m24287z(boolean z10) {
        this.f28252n = z10;
        m24260I();
    }
}
