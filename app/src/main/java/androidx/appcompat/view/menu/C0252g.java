package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0255j;
import p029c.C0927h;
import p068e.C4561b;
import p118h0.InterfaceMenuItemC5017b;
import p235o0.AbstractC6808b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/g.class
 */
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/g.class */
public final class C0252g implements InterfaceMenuItemC5017b {

    /* renamed from: A */
    public View f1611A;

    /* renamed from: B */
    public AbstractC6808b f1612B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f1613C;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f1615E;

    /* renamed from: a */
    public final int f1616a;

    /* renamed from: b */
    public final int f1617b;

    /* renamed from: c */
    public final int f1618c;

    /* renamed from: d */
    public final int f1619d;

    /* renamed from: e */
    public CharSequence f1620e;

    /* renamed from: f */
    public CharSequence f1621f;

    /* renamed from: g */
    public Intent f1622g;

    /* renamed from: h */
    public char f1623h;

    /* renamed from: j */
    public char f1625j;

    /* renamed from: l */
    public Drawable f1627l;

    /* renamed from: n */
    public C0250e f1629n;

    /* renamed from: o */
    public SubMenuC0257l f1630o;

    /* renamed from: p */
    public Runnable f1631p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f1632q;

    /* renamed from: r */
    public CharSequence f1633r;

    /* renamed from: s */
    public CharSequence f1634s;

    /* renamed from: z */
    public int f1641z;

    /* renamed from: i */
    public int f1624i = 4096;

    /* renamed from: k */
    public int f1626k = 4096;

    /* renamed from: m */
    public int f1628m = 0;

    /* renamed from: t */
    public ColorStateList f1635t = null;

    /* renamed from: u */
    public PorterDuff.Mode f1636u = null;

    /* renamed from: v */
    public boolean f1637v = false;

    /* renamed from: w */
    public boolean f1638w = false;

    /* renamed from: x */
    public boolean f1639x = false;

    /* renamed from: y */
    public int f1640y = 16;

    /* renamed from: D */
    public boolean f1614D = false;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/view/menu/g$a.class
     */
    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/g$a.class */
    public class a implements AbstractC6808b.b {

        /* renamed from: a */
        public final C0252g f1642a;

        public a(C0252g c0252g) {
            this.f1642a = c0252g;
        }

        @Override // p235o0.AbstractC6808b.b
        public void onActionProviderVisibilityChanged(boolean z10) {
            C0252g c0252g = this.f1642a;
            c0252g.f1629n.m957J(c0252g);
        }
    }

    public C0252g(C0250e c0250e, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1629n = c0250e;
        this.f1616a = i11;
        this.f1617b = i10;
        this.f1618c = i12;
        this.f1619d = i13;
        this.f1620e = charSequence;
        this.f1641z = i14;
    }

    /* renamed from: d */
    public static void m1009d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    /* renamed from: A */
    public boolean m1010A() {
        return this.f1629n.mo955H() && m1017g() != 0;
    }

    /* renamed from: B */
    public boolean m1011B() {
        return (this.f1641z & 4) == 4;
    }

    @Override // p118h0.InterfaceMenuItemC5017b
    /* renamed from: a */
    public AbstractC6808b mo1012a() {
        return this.f1612B;
    }

    @Override // p118h0.InterfaceMenuItemC5017b
    /* renamed from: b */
    public InterfaceMenuItemC5017b mo1013b(AbstractC6808b abstractC6808b) {
        AbstractC6808b abstractC6808b2 = this.f1612B;
        if (abstractC6808b2 != null) {
            abstractC6808b2.m31375j();
        }
        this.f1611A = null;
        this.f1612B = abstractC6808b;
        this.f1629n.m958K(true);
        AbstractC6808b abstractC6808b3 = this.f1612B;
        if (abstractC6808b3 != null) {
            abstractC6808b3.mo26346l(new a(this));
        }
        return this;
    }

    /* renamed from: c */
    public void m1014c() {
        this.f1629n.m956I(this);
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1641z & 8) == 0) {
            return false;
        }
        if (this.f1611A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1613C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1629n.mo983f(this);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r3.f1638w != false) goto L10;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m1015e(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L4a
            r0 = r4
            r5 = r0
            r0 = r3
            boolean r0 = r0.f1639x
            if (r0 == 0) goto L4a
            r0 = r3
            boolean r0 = r0.f1637v
            if (r0 != 0) goto L1f
            r0 = r4
            r5 = r0
            r0 = r3
            boolean r0 = r0.f1638w
            if (r0 == 0) goto L4a
        L1f:
            r0 = r4
            android.graphics.drawable.Drawable r0 = p106g0.C4917c.m24854r(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r5 = r0
            r0 = r3
            boolean r0 = r0.f1637v
            if (r0 == 0) goto L36
            r0 = r5
            r1 = r3
            android.content.res.ColorStateList r1 = r1.f1635t
            p106g0.C4917c.m24851o(r0, r1)
        L36:
            r0 = r3
            boolean r0 = r0.f1638w
            if (r0 == 0) goto L45
            r0 = r5
            r1 = r3
            android.graphics.PorterDuff$Mode r1 = r1.f1636u
            p106g0.C4917c.m24852p(r0, r1)
        L45:
            r0 = r3
            r1 = 0
            r0.f1639x = r1
        L4a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0252g.m1015e(android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m1020j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1613C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1629n.mo988k(this);
        }
        return false;
    }

    /* renamed from: f */
    public int m1016f() {
        return this.f1619d;
    }

    /* renamed from: g */
    public char m1017g() {
        return this.f1629n.mo954G() ? this.f1625j : this.f1623h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1611A;
        if (view != null) {
            return view;
        }
        AbstractC6808b abstractC6808b = this.f1612B;
        if (abstractC6808b == null) {
            return null;
        }
        View mo26345e = abstractC6808b.mo26345e(this);
        this.f1611A = mo26345e;
        return mo26345e;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1626k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1625j;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1633r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1617b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1627l;
        if (drawable != null) {
            return m1015e(drawable);
        }
        if (this.f1628m == 0) {
            return null;
        }
        Drawable m22999d = C4561b.m22999d(this.f1629n.m997u(), this.f1628m);
        this.f1628m = 0;
        this.f1627l = m22999d;
        return m1015e(m22999d);
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1635t;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1636u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1622g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1616a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1615E;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1624i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1623h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1618c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1630o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1620e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1621f;
        if (charSequence == null) {
            charSequence = this.f1620e;
        }
        return charSequence;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1634s;
    }

    /* renamed from: h */
    public String m1018h() {
        int i10;
        char m1017g = m1017g();
        if (m1017g == 0) {
            return "";
        }
        Resources resources = this.f1629n.m997u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1629n.m997u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C0927h.f6275m));
        }
        int i11 = this.f1629n.mo954G() ? this.f1626k : this.f1624i;
        m1009d(sb2, i11, 65536, resources.getString(C0927h.f6271i));
        m1009d(sb2, i11, 4096, resources.getString(C0927h.f6267e));
        m1009d(sb2, i11, 2, resources.getString(C0927h.f6266d));
        m1009d(sb2, i11, 1, resources.getString(C0927h.f6272j));
        m1009d(sb2, i11, 4, resources.getString(C0927h.f6274l));
        m1009d(sb2, i11, 8, resources.getString(C0927h.f6270h));
        if (m1017g == '\b') {
            i10 = C0927h.f6268f;
        } else if (m1017g == '\n') {
            i10 = C0927h.f6269g;
        } else {
            if (m1017g != ' ') {
                sb2.append(m1017g);
                return sb2.toString();
            }
            i10 = C0927h.f6273k;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1630o != null;
    }

    /* renamed from: i */
    public CharSequence m1019i(InterfaceC0255j.a aVar) {
        return (aVar == null || !aVar.mo886d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1614D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        boolean z10 = true;
        if ((this.f1640y & 1) != 1) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1640y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1640y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC6808b abstractC6808b = this.f1612B;
        boolean z10 = true;
        if (abstractC6808b != null && abstractC6808b.mo3225h()) {
            return (this.f1640y & 8) == 0 && this.f1612B.mo3222c();
        }
        if ((this.f1640y & 8) != 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: j */
    public boolean m1020j() {
        AbstractC6808b abstractC6808b;
        boolean z10 = false;
        if ((this.f1641z & 8) != 0) {
            if (this.f1611A == null && (abstractC6808b = this.f1612B) != null) {
                this.f1611A = abstractC6808b.mo26345e(this);
            }
            z10 = false;
            if (this.f1611A != null) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: k */
    public boolean m1021k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1632q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0250e c0250e = this.f1629n;
        if (c0250e.mo985h(c0250e, this)) {
            return true;
        }
        Runnable runnable = this.f1631p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1622g != null) {
            try {
                this.f1629n.m997u().startActivity(this.f1622g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC6808b abstractC6808b = this.f1612B;
        return abstractC6808b != null && abstractC6808b.mo3224f();
    }

    /* renamed from: l */
    public boolean m1022l() {
        return (this.f1640y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m1023m() {
        return (this.f1640y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m1024n() {
        boolean z10 = true;
        if ((this.f1641z & 1) != 1) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: o */
    public boolean m1025o() {
        return (this.f1641z & 2) == 2;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC5017b setActionView(int i10) {
        Context m997u = this.f1629n.m997u();
        setActionView(LayoutInflater.from(m997u).inflate(i10, (ViewGroup) new LinearLayout(m997u), false));
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC5017b setActionView(View view) {
        int i10;
        this.f1611A = view;
        this.f1612B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1616a) > 0) {
            view.setId(i10);
        }
        this.f1629n.m956I(this);
        return this;
    }

    /* renamed from: r */
    public void m1028r(boolean z10) {
        this.f1614D = z10;
        this.f1629n.m958K(false);
    }

    /* renamed from: s */
    public void m1029s(boolean z10) {
        int i10 = this.f1640y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1640y = i11;
        if (i10 != i11) {
            this.f1629n.m958K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1625j == c10) {
            return this;
        }
        this.f1625j = Character.toLowerCase(c10);
        this.f1629n.m958K(false);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1625j == c10 && this.f1626k == i10) {
            return this;
        }
        this.f1625j = Character.toLowerCase(c10);
        this.f1626k = KeyEvent.normalizeMetaState(i10);
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1640y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1640y = i11;
        if (i10 != i11) {
            this.f1629n.m958K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1640y & 4) != 0) {
            this.f1629n.m967T(this);
        } else {
            m1029s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5017b setContentDescription(CharSequence charSequence) {
        this.f1633r = charSequence;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f1640y = z10 ? this.f1640y | 16 : this.f1640y & (-17);
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1627l = null;
        this.f1628m = i10;
        this.f1639x = true;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1628m = 0;
        this.f1627l = drawable;
        this.f1639x = true;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1635t = colorStateList;
        this.f1637v = true;
        this.f1639x = true;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1636u = mode;
        this.f1638w = true;
        this.f1639x = true;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1622g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1623h == c10) {
            return this;
        }
        this.f1623h = c10;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1623h == c10 && this.f1624i == i10) {
            return this;
        }
        this.f1623h = c10;
        this.f1624i = KeyEvent.normalizeMetaState(i10);
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1613C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1632q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1623h = c10;
        this.f1625j = Character.toLowerCase(c11);
        this.f1629n.m958K(false);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1623h = c10;
        this.f1624i = KeyEvent.normalizeMetaState(i10);
        this.f1625j = Character.toLowerCase(c11);
        this.f1626k = KeyEvent.normalizeMetaState(i11);
        this.f1629n.m958K(false);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1641z = i10;
        this.f1629n.m956I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1629n.m997u().getString(i10));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1620e = charSequence;
        this.f1629n.m958K(false);
        SubMenuC0257l subMenuC0257l = this.f1630o;
        if (subMenuC0257l != null) {
            subMenuC0257l.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1621f = charSequence;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5017b setTooltipText(CharSequence charSequence) {
        this.f1634s = charSequence;
        this.f1629n.m958K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (m1035y(z10)) {
            this.f1629n.m957J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m1030t(boolean z10) {
        this.f1640y = (z10 ? 4 : 0) | (this.f1640y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1620e;
        return charSequence != null ? charSequence.toString() : null;
    }

    /* renamed from: u */
    public void m1031u(boolean z10) {
        this.f1640y = z10 ? this.f1640y | 32 : this.f1640y & (-33);
    }

    /* renamed from: v */
    public void m1032v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1615E = contextMenuInfo;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC5017b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    /* renamed from: x */
    public void m1034x(SubMenuC0257l subMenuC0257l) {
        this.f1630o = subMenuC0257l;
        subMenuC0257l.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m1035y(boolean z10) {
        int i10 = this.f1640y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1640y = i11;
        boolean z11 = false;
        if (i10 != i11) {
            z11 = true;
        }
        return z11;
    }

    /* renamed from: z */
    public boolean m1036z() {
        return this.f1629n.m949A();
    }
}
