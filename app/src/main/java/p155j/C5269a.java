package p155j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p050d0.C4290b;
import p106g0.C4917c;
import p118h0.InterfaceMenuItemC5017b;
import p235o0.AbstractC6808b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j/a.class
 */
/* renamed from: j.a */
/* loaded from: combined.jar:classes1.jar:j/a.class */
public class C5269a implements InterfaceMenuItemC5017b {

    /* renamed from: a */
    public final int f30281a;

    /* renamed from: b */
    public final int f30282b;

    /* renamed from: c */
    public final int f30283c;

    /* renamed from: d */
    public CharSequence f30284d;

    /* renamed from: e */
    public CharSequence f30285e;

    /* renamed from: f */
    public Intent f30286f;

    /* renamed from: g */
    public char f30287g;

    /* renamed from: i */
    public char f30289i;

    /* renamed from: k */
    public Drawable f30291k;

    /* renamed from: l */
    public Context f30292l;

    /* renamed from: m */
    public MenuItem.OnMenuItemClickListener f30293m;

    /* renamed from: n */
    public CharSequence f30294n;

    /* renamed from: o */
    public CharSequence f30295o;

    /* renamed from: h */
    public int f30288h = 4096;

    /* renamed from: j */
    public int f30290j = 4096;

    /* renamed from: p */
    public ColorStateList f30296p = null;

    /* renamed from: q */
    public PorterDuff.Mode f30297q = null;

    /* renamed from: r */
    public boolean f30298r = false;

    /* renamed from: s */
    public boolean f30299s = false;

    /* renamed from: t */
    public int f30300t = 16;

    public C5269a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f30292l = context;
        this.f30281a = i11;
        this.f30282b = i10;
        this.f30283c = i13;
        this.f30284d = charSequence;
    }

    @Override // p118h0.InterfaceMenuItemC5017b
    /* renamed from: a */
    public AbstractC6808b mo1012a() {
        return null;
    }

    @Override // p118h0.InterfaceMenuItemC5017b
    /* renamed from: b */
    public InterfaceMenuItemC5017b mo1013b(AbstractC6808b abstractC6808b) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void m26333c() {
        Drawable drawable = this.f30291k;
        if (drawable != null) {
            if (this.f30298r || this.f30299s) {
                Drawable m24854r = C4917c.m24854r(drawable);
                this.f30291k = m24854r;
                Drawable mutate = m24854r.mutate();
                this.f30291k = mutate;
                if (this.f30298r) {
                    C4917c.m24851o(mutate, this.f30296p);
                }
                if (this.f30299s) {
                    C4917c.m24852p(this.f30291k, this.f30297q);
                }
            }
        }
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC5017b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC5017b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC5017b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f30290j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f30289i;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f30294n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f30282b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f30291k;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f30296p;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f30297q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f30286f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f30281a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f30288h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f30287g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f30283c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f30284d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f30285e;
        if (charSequence == null) {
            charSequence = this.f30284d;
        }
        return charSequence;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f30295o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        boolean z10 = true;
        if ((this.f30300t & 1) == 0) {
            z10 = false;
        }
        return z10;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f30300t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f30300t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f30300t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f30289i = Character.toLowerCase(c10);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f30289i = Character.toLowerCase(c10);
        this.f30290j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f30300t = (z10 ? 1 : 0) | (this.f30300t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f30300t = (z10 ? 2 : 0) | (this.f30300t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5017b setContentDescription(CharSequence charSequence) {
        this.f30294n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f30300t = (z10 ? 16 : 0) | (this.f30300t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f30291k = C4290b.m21726e(this.f30292l, i10);
        m26333c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f30291k = drawable;
        m26333c();
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f30296p = colorStateList;
        this.f30298r = true;
        m26333c();
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f30297q = mode;
        this.f30299s = true;
        m26333c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f30286f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f30287g = c10;
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f30287g = c10;
        this.f30288h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f30293m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f30287g = c10;
        this.f30289i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f30287g = c10;
        this.f30288h = KeyEvent.normalizeMetaState(i10);
        this.f30289i = Character.toLowerCase(c11);
        this.f30290j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // p118h0.InterfaceMenuItemC5017b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f30284d = this.f30292l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f30284d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f30285e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC5017b setTooltipText(CharSequence charSequence) {
        this.f30295o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        int i10 = this.f30300t;
        int i11 = 8;
        if (z10) {
            i11 = 0;
        }
        this.f30300t = (i10 & 8) | i11;
        return this;
    }
}
