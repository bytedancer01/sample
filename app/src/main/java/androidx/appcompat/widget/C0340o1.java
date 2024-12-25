package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0250e;
import androidx.appcompat.view.menu.InterfaceC0254i;
import androidx.appcompat.widget.Toolbar;
import p029c.C0920a;
import p029c.C0924e;
import p029c.C0925f;
import p029c.C0927h;
import p029c.C0929j;
import p068e.C4561b;
import p155j.C5269a;
import p235o0.C6807a1;
import p235o0.C6824g0;
import p235o0.C6864y0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/o1.class
 */
/* renamed from: androidx.appcompat.widget.o1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/o1.class */
public class C0340o1 implements InterfaceC0333m0 {

    /* renamed from: a */
    public Toolbar f2177a;

    /* renamed from: b */
    public int f2178b;

    /* renamed from: c */
    public View f2179c;

    /* renamed from: d */
    public View f2180d;

    /* renamed from: e */
    public Drawable f2181e;

    /* renamed from: f */
    public Drawable f2182f;

    /* renamed from: g */
    public Drawable f2183g;

    /* renamed from: h */
    public boolean f2184h;

    /* renamed from: i */
    public CharSequence f2185i;

    /* renamed from: j */
    public CharSequence f2186j;

    /* renamed from: k */
    public CharSequence f2187k;

    /* renamed from: l */
    public Window.Callback f2188l;

    /* renamed from: m */
    public boolean f2189m;

    /* renamed from: n */
    public C0302c f2190n;

    /* renamed from: o */
    public int f2191o;

    /* renamed from: p */
    public int f2192p;

    /* renamed from: q */
    public Drawable f2193q;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/o1$a.class
     */
    /* renamed from: androidx.appcompat.widget.o1$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/o1$a.class */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        public final C5269a f2194b;

        /* renamed from: c */
        public final C0340o1 f2195c;

        public a(C0340o1 c0340o1) {
            this.f2195c = c0340o1;
            this.f2194b = new C5269a(c0340o1.f2177a.getContext(), 0, R.id.home, 0, 0, c0340o1.f2185i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0340o1 c0340o1 = this.f2195c;
            Window.Callback callback = c0340o1.f2188l;
            if (callback == null || !c0340o1.f2189m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f2194b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/o1$b.class
     */
    /* renamed from: androidx.appcompat.widget.o1$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/o1$b.class */
    public class b extends C6807a1 {

        /* renamed from: a */
        public boolean f2196a = false;

        /* renamed from: b */
        public final int f2197b;

        /* renamed from: c */
        public final C0340o1 f2198c;

        public b(C0340o1 c0340o1, int i10) {
            this.f2198c = c0340o1;
            this.f2197b = i10;
        }

        @Override // p235o0.C6807a1, p235o0.InterfaceC6866z0
        /* renamed from: a */
        public void mo1238a(View view) {
            this.f2196a = true;
        }

        @Override // p235o0.InterfaceC6866z0
        /* renamed from: b */
        public void mo1239b(View view) {
            if (this.f2196a) {
                return;
            }
            this.f2198c.f2177a.setVisibility(this.f2197b);
        }

        @Override // p235o0.C6807a1, p235o0.InterfaceC6866z0
        /* renamed from: c */
        public void mo1240c(View view) {
            this.f2198c.f2177a.setVisibility(0);
        }
    }

    public C0340o1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, C0927h.f6263a, C0924e.f6188n);
    }

    public C0340o1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f2191o = 0;
        this.f2192p = 0;
        this.f2177a = toolbar;
        this.f2185i = toolbar.getTitle();
        this.f2186j = toolbar.getSubtitle();
        this.f2184h = this.f2185i != null;
        this.f2183g = toolbar.getNavigationIcon();
        C0337n1 m1505v = C0337n1.m1505v(toolbar.getContext(), null, C0929j.f6412a, C0920a.f6108c, 0);
        this.f2193q = m1505v.m1512g(C0929j.f6474l);
        if (z10) {
            CharSequence m1521p = m1505v.m1521p(C0929j.f6504r);
            if (!TextUtils.isEmpty(m1521p)) {
                setTitle(m1521p);
            }
            CharSequence m1521p2 = m1505v.m1521p(C0929j.f6494p);
            if (!TextUtils.isEmpty(m1521p2)) {
                mo1486k(m1521p2);
            }
            Drawable m1512g = m1505v.m1512g(C0929j.f6484n);
            if (m1512g != null) {
                m1536D(m1512g);
            }
            Drawable m1512g2 = m1505v.m1512g(C0929j.f6479m);
            if (m1512g2 != null) {
                setIcon(m1512g2);
            }
            if (this.f2183g == null && (drawable = this.f2193q) != null) {
                m1539G(drawable);
            }
            mo1485j(m1505v.m1516k(C0929j.f6454h, 0));
            int m1519n = m1505v.m1519n(C0929j.f6448g, 0);
            if (m1519n != 0) {
                m1534B(LayoutInflater.from(this.f2177a.getContext()).inflate(m1519n, (ViewGroup) this.f2177a, false));
                mo1485j(this.f2178b | 16);
            }
            int m1518m = m1505v.m1518m(C0929j.f6464j, 0);
            if (m1518m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2177a.getLayoutParams();
                layoutParams.height = m1518m;
                this.f2177a.setLayoutParams(layoutParams);
            }
            int m1510e = m1505v.m1510e(C0929j.f6442f, -1);
            int m1510e2 = m1505v.m1510e(C0929j.f6436e, -1);
            if (m1510e >= 0 || m1510e2 >= 0) {
                this.f2177a.m1193H(Math.max(m1510e, 0), Math.max(m1510e2, 0));
            }
            int m1519n2 = m1505v.m1519n(C0929j.f6509s, 0);
            if (m1519n2 != 0) {
                Toolbar toolbar2 = this.f2177a;
                toolbar2.m1197L(toolbar2.getContext(), m1519n2);
            }
            int m1519n3 = m1505v.m1519n(C0929j.f6499q, 0);
            if (m1519n3 != 0) {
                Toolbar toolbar3 = this.f2177a;
                toolbar3.m1196K(toolbar3.getContext(), m1519n3);
            }
            int m1519n4 = m1505v.m1519n(C0929j.f6489o, 0);
            if (m1519n4 != 0) {
                this.f2177a.setPopupTheme(m1519n4);
            }
        } else {
            this.f2178b = m1533A();
        }
        m1505v.m1525w();
        m1535C(i10);
        this.f2187k = this.f2177a.getNavigationContentDescription();
        this.f2177a.setNavigationOnClickListener(new a(this));
    }

    /* renamed from: A */
    public final int m1533A() {
        int i10;
        if (this.f2177a.getNavigationIcon() != null) {
            i10 = 15;
            this.f2193q = this.f2177a.getNavigationIcon();
        } else {
            i10 = 11;
        }
        return i10;
    }

    /* renamed from: B */
    public void m1534B(View view) {
        View view2 = this.f2180d;
        if (view2 != null && (this.f2178b & 16) != 0) {
            this.f2177a.removeView(view2);
        }
        this.f2180d = view;
        if (view == null || (this.f2178b & 16) == 0) {
            return;
        }
        this.f2177a.addView(view);
    }

    /* renamed from: C */
    public void m1535C(int i10) {
        if (i10 == this.f2192p) {
            return;
        }
        this.f2192p = i10;
        if (TextUtils.isEmpty(this.f2177a.getNavigationContentDescription())) {
            m1537E(this.f2192p);
        }
    }

    /* renamed from: D */
    public void m1536D(Drawable drawable) {
        this.f2182f = drawable;
        m1543K();
    }

    /* renamed from: E */
    public void m1537E(int i10) {
        m1538F(i10 == 0 ? null : mo1477b().getString(i10));
    }

    /* renamed from: F */
    public void m1538F(CharSequence charSequence) {
        this.f2187k = charSequence;
        m1541I();
    }

    /* renamed from: G */
    public void m1539G(Drawable drawable) {
        this.f2183g = drawable;
        m1542J();
    }

    /* renamed from: H */
    public final void m1540H(CharSequence charSequence) {
        this.f2185i = charSequence;
        if ((this.f2178b & 8) != 0) {
            this.f2177a.setTitle(charSequence);
        }
    }

    /* renamed from: I */
    public final void m1541I() {
        if ((this.f2178b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2187k)) {
                this.f2177a.setNavigationContentDescription(this.f2192p);
            } else {
                this.f2177a.setNavigationContentDescription(this.f2187k);
            }
        }
    }

    /* renamed from: J */
    public final void m1542J() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f2178b & 4) != 0) {
            toolbar = this.f2177a;
            drawable = this.f2183g;
            if (drawable == null) {
                drawable = this.f2193q;
            }
        } else {
            toolbar = this.f2177a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r5 != null) goto L11;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1543K() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.f2178b
            r4 = r0
            r0 = r4
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r4
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L1d
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.f2182f
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1d
            goto L27
        L1d:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.f2181e
            r5 = r0
            goto L27
        L25:
            r0 = 0
            r5 = r0
        L27:
            r0 = r3
            androidx.appcompat.widget.Toolbar r0 = r0.f2177a
            r1 = r5
            r0.setLogo(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0340o1.m1543K():void");
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: a */
    public boolean mo1476a() {
        return this.f2177a.m1204d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: b */
    public Context mo1477b() {
        return this.f2177a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: c */
    public boolean mo1478c() {
        return this.f2177a.m1223w();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    public void collapseActionView() {
        this.f2177a.m1205e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: d */
    public boolean mo1479d() {
        return this.f2177a.m1200O();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: e */
    public void mo1480e(Menu menu, InterfaceC0254i.a aVar) {
        if (this.f2190n == null) {
            C0302c c0302c = new C0302c(this.f2177a.getContext());
            this.f2190n = c0302c;
            c0302c.m915p(C0925f.f6223g);
        }
        this.f2190n.mo904d(aVar);
        this.f2177a.m1194I((C0250e) menu, this.f2190n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: f */
    public boolean mo1481f() {
        return this.f2177a.m1186A();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: g */
    public void mo1482g() {
        this.f2189m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    public CharSequence getTitle() {
        return this.f2177a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: h */
    public boolean mo1483h() {
        return this.f2177a.m1226z();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: i */
    public boolean mo1484i() {
        return this.f2177a.m1222v();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: j */
    public void mo1485j(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f2178b ^ i10;
        this.f2178b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    m1541I();
                }
                m1542J();
            }
            if ((i11 & 3) != 0) {
                m1543K();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f2177a.setTitle(this.f2185i);
                    toolbar = this.f2177a;
                    charSequence = this.f2186j;
                } else {
                    charSequence = null;
                    this.f2177a.setTitle((CharSequence) null);
                    toolbar = this.f2177a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f2180d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f2177a.addView(view);
            } else {
                this.f2177a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: k */
    public void mo1486k(CharSequence charSequence) {
        this.f2186j = charSequence;
        if ((this.f2178b & 8) != 0) {
            this.f2177a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: l */
    public Menu mo1487l() {
        return this.f2177a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: m */
    public int mo1488m() {
        return this.f2191o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: n */
    public C6864y0 mo1489n(int i10, long j10) {
        return C6824g0.m31514d(this.f2177a).m31671a(i10 == 0 ? 1.0f : 0.0f).m31676f(j10).m31678h(new b(this, i10));
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: o */
    public ViewGroup mo1490o() {
        return this.f2177a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: p */
    public void mo1491p(boolean z10) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: q */
    public void mo1492q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: r */
    public void mo1493r(boolean z10) {
        this.f2177a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: s */
    public void mo1494s() {
        this.f2177a.m1206f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? C4561b.m22999d(mo1477b(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    public void setIcon(Drawable drawable) {
        this.f2181e = drawable;
        m1543K();
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    public void setTitle(CharSequence charSequence) {
        this.f2184h = true;
        m1540H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    public void setWindowCallback(Window.Callback callback) {
        this.f2188l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f2184h) {
            return;
        }
        m1540H(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: t */
    public void mo1495t(C0316g1 c0316g1) {
        View view = this.f2179c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2177a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2179c);
            }
        }
        this.f2179c = c0316g1;
        if (c0316g1 == null || this.f2191o != 2) {
            return;
        }
        this.f2177a.addView(c0316g1, 0);
        Toolbar.C0292e c0292e = (Toolbar.C0292e) this.f2179c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0292e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0292e).height = -2;
        c0292e.f26228a = 8388691;
        c0316g1.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: u */
    public void mo1496u(int i10) {
        m1536D(i10 != 0 ? C4561b.m22999d(mo1477b(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: v */
    public void mo1497v(int i10) {
        m1539G(i10 != 0 ? C4561b.m22999d(mo1477b(), i10) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: w */
    public void mo1498w(InterfaceC0254i.a aVar, C0250e.a aVar2) {
        this.f2177a.m1195J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: x */
    public void mo1499x(int i10) {
        this.f2177a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: y */
    public int mo1500y() {
        return this.f2178b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0333m0
    /* renamed from: z */
    public void mo1501z() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
}
