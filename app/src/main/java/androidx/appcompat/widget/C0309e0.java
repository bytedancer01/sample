package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p029c.C0929j;
import p069e0.C4568g;
import p235o0.C6824g0;
import p295r0.C7939b;
import p314s0.InterfaceC8494b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/e0.class
 */
/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/e0.class */
public class C0309e0 {

    /* renamed from: a */
    public final TextView f2032a;

    /* renamed from: b */
    public C0331l1 f2033b;

    /* renamed from: c */
    public C0331l1 f2034c;

    /* renamed from: d */
    public C0331l1 f2035d;

    /* renamed from: e */
    public C0331l1 f2036e;

    /* renamed from: f */
    public C0331l1 f2037f;

    /* renamed from: g */
    public C0331l1 f2038g;

    /* renamed from: h */
    public C0331l1 f2039h;

    /* renamed from: i */
    public final C0318h0 f2040i;

    /* renamed from: j */
    public int f2041j = 0;

    /* renamed from: k */
    public int f2042k = -1;

    /* renamed from: l */
    public Typeface f2043l;

    /* renamed from: m */
    public boolean f2044m;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/e0$a.class
     */
    /* renamed from: androidx.appcompat.widget.e0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/e0$a.class */
    public class a extends C4568g.c {

        /* renamed from: a */
        public final int f2045a;

        /* renamed from: b */
        public final int f2046b;

        /* renamed from: c */
        public final WeakReference f2047c;

        /* renamed from: d */
        public final C0309e0 f2048d;

        public a(C0309e0 c0309e0, int i10, int i11, WeakReference weakReference) {
            this.f2048d = c0309e0;
            this.f2045a = i10;
            this.f2046b = i11;
            this.f2047c = weakReference;
        }

        @Override // p069e0.C4568g.c
        /* renamed from: d */
        public void mo1356d(int i10) {
        }

        @Override // p069e0.C4568g.c
        /* renamed from: e */
        public void mo1357e(Typeface typeface) {
            Typeface create;
            Typeface typeface2 = typeface;
            if (Build.VERSION.SDK_INT >= 28) {
                int i10 = this.f2045a;
                typeface2 = typeface;
                if (i10 != -1) {
                    create = Typeface.create(typeface, i10, (this.f2046b & 2) != 0);
                    typeface2 = create;
                }
            }
            this.f2048d.m1343n(this.f2047c, typeface2);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/e0$b.class
     */
    /* renamed from: androidx.appcompat.widget.e0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/e0$b.class */
    public class b implements Runnable {

        /* renamed from: b */
        public final TextView f2049b;

        /* renamed from: c */
        public final Typeface f2050c;

        /* renamed from: d */
        public final int f2051d;

        /* renamed from: e */
        public final C0309e0 f2052e;

        public b(C0309e0 c0309e0, TextView textView, Typeface typeface, int i10) {
            this.f2052e = c0309e0;
            this.f2049b = textView;
            this.f2050c = typeface;
            this.f2051d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2049b.setTypeface(this.f2050c, this.f2051d);
        }
    }

    public C0309e0(TextView textView) {
        this.f2032a = textView;
        this.f2040i = new C0318h0(textView);
    }

    /* renamed from: d */
    public static C0331l1 m1327d(Context context, C0320i c0320i, int i10) {
        ColorStateList m1443f = c0320i.m1443f(context, i10);
        if (m1443f == null) {
            return null;
        }
        C0331l1 c0331l1 = new C0331l1();
        c0331l1.f2159d = true;
        c0331l1.f2156a = m1443f;
        return c0331l1;
    }

    /* renamed from: A */
    public void m1328A(int i10, float f10) {
        if (InterfaceC8494b.f39857e0 || m1341l()) {
            return;
        }
        m1329B(i10, f10);
    }

    /* renamed from: B */
    public final void m1329B(int i10, float f10) {
        this.f2040i.m1407v(i10, f10);
    }

    /* renamed from: C */
    public final void m1330C(Context context, C0337n1 c0337n1) {
        String m1520o;
        Typeface create;
        Typeface create2;
        Typeface create3;
        Typeface typeface;
        this.f2041j = c0337n1.m1516k(C0929j.f6463i3, this.f2041j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int m1516k = c0337n1.m1516k(C0929j.f6488n3, -1);
            this.f2042k = m1516k;
            if (m1516k != -1) {
                this.f2041j = (this.f2041j & 2) | 0;
            }
        }
        int i11 = C0929j.f6483m3;
        if (!c0337n1.m1524s(i11) && !c0337n1.m1524s(C0929j.f6493o3)) {
            int i12 = C0929j.f6458h3;
            if (c0337n1.m1524s(i12)) {
                this.f2044m = false;
                int m1516k2 = c0337n1.m1516k(i12, 1);
                if (m1516k2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m1516k2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m1516k2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f2043l = typeface;
                return;
            }
            return;
        }
        this.f2043l = null;
        int i13 = C0929j.f6493o3;
        if (c0337n1.m1524s(i13)) {
            i11 = i13;
        }
        int i14 = this.f2042k;
        int i15 = this.f2041j;
        if (!context.isRestricted()) {
            try {
                Typeface m1515j = c0337n1.m1515j(i11, this.f2041j, new a(this, i14, i15, new WeakReference(this.f2032a)));
                if (m1515j != null) {
                    Typeface typeface2 = m1515j;
                    if (i10 >= 28) {
                        typeface2 = m1515j;
                        if (this.f2042k != -1) {
                            create3 = Typeface.create(Typeface.create(m1515j, 0), this.f2042k, (this.f2041j & 2) != 0);
                            typeface2 = create3;
                        }
                    }
                    this.f2043l = typeface2;
                }
                this.f2044m = this.f2043l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException e10) {
            }
        }
        if (this.f2043l != null || (m1520o = c0337n1.m1520o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2042k == -1) {
            create = Typeface.create(m1520o, this.f2041j);
        } else {
            Typeface create4 = Typeface.create(m1520o, 0);
            int i16 = this.f2042k;
            boolean z10 = false;
            if ((this.f2041j & 2) != 0) {
                z10 = true;
            }
            create2 = Typeface.create(create4, i16, z10);
            create = create2;
        }
        this.f2043l = create;
    }

    /* renamed from: a */
    public final void m1331a(Drawable drawable, C0331l1 c0331l1) {
        if (drawable == null || c0331l1 == null) {
            return;
        }
        C0320i.m1440i(drawable, c0331l1, this.f2032a.getDrawableState());
    }

    /* renamed from: b */
    public void m1332b() {
        if (this.f2033b != null || this.f2034c != null || this.f2035d != null || this.f2036e != null) {
            Drawable[] compoundDrawables = this.f2032a.getCompoundDrawables();
            m1331a(compoundDrawables[0], this.f2033b);
            m1331a(compoundDrawables[1], this.f2034c);
            m1331a(compoundDrawables[2], this.f2035d);
            m1331a(compoundDrawables[3], this.f2036e);
        }
        if (this.f2037f == null && this.f2038g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f2032a.getCompoundDrawablesRelative();
        m1331a(compoundDrawablesRelative[0], this.f2037f);
        m1331a(compoundDrawablesRelative[2], this.f2038g);
    }

    /* renamed from: c */
    public void m1333c() {
        this.f2040i.m1388a();
    }

    /* renamed from: e */
    public int m1334e() {
        return this.f2040i.m1395h();
    }

    /* renamed from: f */
    public int m1335f() {
        return this.f2040i.m1396i();
    }

    /* renamed from: g */
    public int m1336g() {
        return this.f2040i.m1397j();
    }

    /* renamed from: h */
    public int[] m1337h() {
        return this.f2040i.m1398k();
    }

    /* renamed from: i */
    public int m1338i() {
        return this.f2040i.m1399l();
    }

    /* renamed from: j */
    public ColorStateList m1339j() {
        C0331l1 c0331l1 = this.f2039h;
        return c0331l1 != null ? c0331l1.f2156a : null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m1340k() {
        C0331l1 c0331l1 = this.f2039h;
        return c0331l1 != null ? c0331l1.f2157b : null;
    }

    /* renamed from: l */
    public boolean m1341l() {
        return this.f2040i.m1401p();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03c5  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1342m(android.util.AttributeSet r9, int r10) {
        /*
            Method dump skipped, instructions count: 1478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0309e0.m1342m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    public void m1343n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2044m) {
            this.f2043l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C6824g0.m31501T(textView)) {
                    textView.post(new b(this, textView, typeface, this.f2041j));
                } else {
                    textView.setTypeface(typeface, this.f2041j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m1344o(boolean z10, int i10, int i11, int i12, int i13) {
        if (InterfaceC8494b.f39857e0) {
            return;
        }
        m1333c();
    }

    /* renamed from: p */
    public void m1345p() {
        m1332b();
    }

    /* renamed from: q */
    public void m1346q(Context context, int i10) {
        String m1520o;
        ColorStateList m1508c;
        ColorStateList m1508c2;
        ColorStateList m1508c3;
        C0337n1 m1503t = C0337n1.m1503t(context, i10, C0929j.f6446f3);
        int i11 = C0929j.f6503q3;
        if (m1503t.m1524s(i11)) {
            m1348s(m1503t.m1506a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = C0929j.f6468j3;
            if (m1503t.m1524s(i13) && (m1508c3 = m1503t.m1508c(i13)) != null) {
                this.f2032a.setTextColor(m1508c3);
            }
            int i14 = C0929j.f6478l3;
            if (m1503t.m1524s(i14) && (m1508c2 = m1503t.m1508c(i14)) != null) {
                this.f2032a.setLinkTextColor(m1508c2);
            }
            int i15 = C0929j.f6473k3;
            if (m1503t.m1524s(i15) && (m1508c = m1503t.m1508c(i15)) != null) {
                this.f2032a.setHintTextColor(m1508c);
            }
        }
        int i16 = C0929j.f6452g3;
        if (m1503t.m1524s(i16) && m1503t.m1511f(i16, -1) == 0) {
            this.f2032a.setTextSize(0, 0.0f);
        }
        m1330C(context, m1503t);
        if (i12 >= 26) {
            int i17 = C0929j.f6498p3;
            if (m1503t.m1524s(i17) && (m1520o = m1503t.m1520o(i17)) != null) {
                this.f2032a.setFontVariationSettings(m1520o);
            }
        }
        m1503t.m1525w();
        Typeface typeface = this.f2043l;
        if (typeface != null) {
            this.f2032a.setTypeface(typeface, this.f2041j);
        }
    }

    /* renamed from: r */
    public void m1347r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C7939b.m34462f(editorInfo, textView.getText());
    }

    /* renamed from: s */
    public void m1348s(boolean z10) {
        this.f2032a.setAllCaps(z10);
    }

    /* renamed from: t */
    public void m1349t(int i10, int i11, int i12, int i13) {
        this.f2040i.m1403r(i10, i11, i12, i13);
    }

    /* renamed from: u */
    public void m1350u(int[] iArr, int i10) {
        this.f2040i.m1404s(iArr, i10);
    }

    /* renamed from: v */
    public void m1351v(int i10) {
        this.f2040i.m1405t(i10);
    }

    /* renamed from: w */
    public void m1352w(ColorStateList colorStateList) {
        if (this.f2039h == null) {
            this.f2039h = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2039h;
        c0331l1.f2156a = colorStateList;
        c0331l1.f2159d = colorStateList != null;
        m1355z();
    }

    /* renamed from: x */
    public void m1353x(PorterDuff.Mode mode) {
        if (this.f2039h == null) {
            this.f2039h = new C0331l1();
        }
        C0331l1 c0331l1 = this.f2039h;
        c0331l1.f2157b = mode;
        c0331l1.f2158c = mode != null;
        m1355z();
    }

    /* renamed from: y */
    public final void m1354y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f2032a.getCompoundDrawablesRelative();
            TextView textView = this.f2032a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f2032a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f2032a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f2032a.getCompoundDrawables();
        TextView textView3 = this.f2032a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: z */
    public final void m1355z() {
        C0331l1 c0331l1 = this.f2039h;
        this.f2033b = c0331l1;
        this.f2034c = c0331l1;
        this.f2035d = c0331l1;
        this.f2036e = c0331l1;
        this.f2037f = c0331l1;
        this.f2038g = c0331l1;
    }
}
