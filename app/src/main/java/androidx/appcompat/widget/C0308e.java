package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p029c.C0929j;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/e.class
 */
/* renamed from: androidx.appcompat.widget.e */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/e.class */
public class C0308e {

    /* renamed from: a */
    public final View f2026a;

    /* renamed from: d */
    public C0331l1 f2029d;

    /* renamed from: e */
    public C0331l1 f2030e;

    /* renamed from: f */
    public C0331l1 f2031f;

    /* renamed from: c */
    public int f2028c = -1;

    /* renamed from: b */
    public final C0320i f2027b = C0320i.m1437b();

    public C0308e(View view) {
        this.f2026a = view;
    }

    /* renamed from: a */
    public final boolean m1316a(Drawable drawable) {
        if (this.f2031f == null) {
            this.f2031f = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2031f;
        c0331l1.m1465a();
        ColorStateList m31544s = C6824g0.m31544s(this.f2026a);
        if (m31544s != null) {
            c0331l1.f2159d = true;
            c0331l1.f2156a = m31544s;
        }
        PorterDuff.Mode m31546t = C6824g0.m31546t(this.f2026a);
        if (m31546t != null) {
            c0331l1.f2158c = true;
            c0331l1.f2157b = m31546t;
        }
        if (!c0331l1.f2159d && !c0331l1.f2158c) {
            return false;
        }
        C0320i.m1440i(drawable, c0331l1, this.f2026a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m1317b() {
        Drawable background = this.f2026a.getBackground();
        if (background != null) {
            if (m1326k() && m1316a(background)) {
                return;
            }
            C0331l1 c0331l1 = this.f2030e;
            if (c0331l1 != null) {
                C0320i.m1440i(background, c0331l1, this.f2026a.getDrawableState());
                return;
            }
            C0331l1 c0331l12 = this.f2029d;
            if (c0331l12 != null) {
                C0320i.m1440i(background, c0331l12, this.f2026a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m1318c() {
        C0331l1 c0331l1 = this.f2030e;
        return c0331l1 != null ? c0331l1.f2156a : null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m1319d() {
        C0331l1 c0331l1 = this.f2030e;
        return c0331l1 != null ? c0331l1.f2157b : null;
    }

    /* renamed from: e */
    public void m1320e(AttributeSet attributeSet, int i10) {
        Context context = this.f2026a.getContext();
        int[] iArr = C0929j.f6411Z3;
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, iArr, i10, 0);
        View view = this.f2026a;
        C6824g0.m31535n0(view, view.getContext(), iArr, attributeSet, m1505v.m1523r(), i10, 0);
        try {
            int i11 = C0929j.f6417a4;
            if (m1505v.m1524s(i11)) {
                this.f2028c = m1505v.m1519n(i11, -1);
                ColorStateList m1443f = this.f2027b.m1443f(this.f2026a.getContext(), this.f2028c);
                if (m1443f != null) {
                    m1323h(m1443f);
                }
            }
            int i12 = C0929j.f6423b4;
            if (m1505v.m1524s(i12)) {
                C6824g0.m31547t0(this.f2026a, m1505v.m1508c(i12));
            }
            int i13 = C0929j.f6429c4;
            if (m1505v.m1524s(i13)) {
                C6824g0.m31549u0(this.f2026a, C0339o0.m1532e(m1505v.m1516k(i13, -1), null));
            }
        } finally {
            m1505v.m1525w();
        }
    }

    /* renamed from: f */
    public void m1321f(Drawable drawable) {
        this.f2028c = -1;
        m1323h(null);
        m1317b();
    }

    /* renamed from: g */
    public void m1322g(int i10) {
        this.f2028c = i10;
        C0320i c0320i = this.f2027b;
        m1323h(c0320i != null ? c0320i.m1443f(this.f2026a.getContext(), i10) : null);
        m1317b();
    }

    /* renamed from: h */
    public void m1323h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2029d == null) {
                this.f2029d = new C0331l1();
            }
            C0331l1 c0331l1 = this.f2029d;
            c0331l1.f2156a = colorStateList;
            c0331l1.f2159d = true;
        } else {
            this.f2029d = null;
        }
        m1317b();
    }

    /* renamed from: i */
    public void m1324i(ColorStateList colorStateList) {
        if (this.f2030e == null) {
            this.f2030e = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2030e;
        c0331l1.f2156a = colorStateList;
        c0331l1.f2159d = true;
        m1317b();
    }

    /* renamed from: j */
    public void m1325j(PorterDuff.Mode mode) {
        if (this.f2030e == null) {
            this.f2030e = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2030e;
        c0331l1.f2157b = mode;
        c0331l1.f2158c = true;
        m1317b();
    }

    /* renamed from: k */
    public final boolean m1326k() {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 <= 21) {
            return i10 == 21;
        }
        if (this.f2029d == null) {
            z10 = false;
        }
        return z10;
    }
}
