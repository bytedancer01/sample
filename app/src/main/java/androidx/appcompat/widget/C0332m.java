package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p029c.C0929j;
import p068e.C4561b;
import p235o0.C6824g0;
import p314s0.C8498f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/m.class
 */
/* renamed from: androidx.appcompat.widget.m */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/m.class */
public class C0332m {

    /* renamed from: a */
    public final ImageView f2160a;

    /* renamed from: b */
    public C0331l1 f2161b;

    /* renamed from: c */
    public C0331l1 f2162c;

    /* renamed from: d */
    public C0331l1 f2163d;

    public C0332m(ImageView imageView) {
        this.f2160a = imageView;
    }

    /* renamed from: a */
    public final boolean m1466a(Drawable drawable) {
        if (this.f2163d == null) {
            this.f2163d = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2163d;
        c0331l1.m1465a();
        ColorStateList m36690a = C8498f.m36690a(this.f2160a);
        if (m36690a != null) {
            c0331l1.f2159d = true;
            c0331l1.f2156a = m36690a;
        }
        PorterDuff.Mode m36691b = C8498f.m36691b(this.f2160a);
        if (m36691b != null) {
            c0331l1.f2158c = true;
            c0331l1.f2157b = m36691b;
        }
        if (!c0331l1.f2159d && !c0331l1.f2158c) {
            return false;
        }
        C0320i.m1440i(drawable, c0331l1, this.f2160a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    public void m1467b() {
        Drawable drawable = this.f2160a.getDrawable();
        if (drawable != null) {
            C0339o0.m1529b(drawable);
        }
        if (drawable != null) {
            if (m1475j() && m1466a(drawable)) {
                return;
            }
            C0331l1 c0331l1 = this.f2162c;
            if (c0331l1 != null) {
                C0320i.m1440i(drawable, c0331l1, this.f2160a.getDrawableState());
                return;
            }
            C0331l1 c0331l12 = this.f2161b;
            if (c0331l12 != null) {
                C0320i.m1440i(drawable, c0331l12, this.f2160a.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public ColorStateList m1468c() {
        C0331l1 c0331l1 = this.f2162c;
        return c0331l1 != null ? c0331l1.f2156a : null;
    }

    /* renamed from: d */
    public PorterDuff.Mode m1469d() {
        C0331l1 c0331l1 = this.f2162c;
        return c0331l1 != null ? c0331l1.f2157b : null;
    }

    /* renamed from: e */
    public boolean m1470e() {
        return !(this.f2160a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void m1471f(AttributeSet attributeSet, int i10) {
        Context context = this.f2160a.getContext();
        int[] iArr = C0929j.f6367R;
        C0337n1 m1505v = C0337n1.m1505v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f2160a;
        C6824g0.m31535n0(imageView, imageView.getContext(), iArr, attributeSet, m1505v.m1523r(), i10, 0);
        try {
            Drawable drawable = this.f2160a.getDrawable();
            Drawable drawable2 = drawable;
            if (drawable == null) {
                int m1519n = m1505v.m1519n(C0929j.f6372S, -1);
                drawable2 = drawable;
                if (m1519n != -1) {
                    Drawable m22999d = C4561b.m22999d(this.f2160a.getContext(), m1519n);
                    drawable2 = m22999d;
                    if (m22999d != null) {
                        this.f2160a.setImageDrawable(m22999d);
                        drawable2 = m22999d;
                    }
                }
            }
            if (drawable2 != null) {
                C0339o0.m1529b(drawable2);
            }
            int i11 = C0929j.f6377T;
            if (m1505v.m1524s(i11)) {
                C8498f.m36692c(this.f2160a, m1505v.m1508c(i11));
            }
            int i12 = C0929j.f6382U;
            if (m1505v.m1524s(i12)) {
                C8498f.m36693d(this.f2160a, C0339o0.m1532e(m1505v.m1516k(i12, -1), null));
            }
        } finally {
            m1505v.m1525w();
        }
    }

    /* renamed from: g */
    public void m1472g(int i10) {
        if (i10 != 0) {
            Drawable m22999d = C4561b.m22999d(this.f2160a.getContext(), i10);
            if (m22999d != null) {
                C0339o0.m1529b(m22999d);
            }
            this.f2160a.setImageDrawable(m22999d);
        } else {
            this.f2160a.setImageDrawable(null);
        }
        m1467b();
    }

    /* renamed from: h */
    public void m1473h(ColorStateList colorStateList) {
        if (this.f2162c == null) {
            this.f2162c = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2162c;
        c0331l1.f2156a = colorStateList;
        c0331l1.f2159d = true;
        m1467b();
    }

    /* renamed from: i */
    public void m1474i(PorterDuff.Mode mode) {
        if (this.f2162c == null) {
            this.f2162c = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2162c;
        c0331l1.f2157b = mode;
        c0331l1.f2158c = true;
        m1467b();
    }

    /* renamed from: j */
    public final boolean m1475j() {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 <= 21) {
            return i10 == 21;
        }
        if (this.f2161b == null) {
            z10 = false;
        }
        return z10;
    }
}
