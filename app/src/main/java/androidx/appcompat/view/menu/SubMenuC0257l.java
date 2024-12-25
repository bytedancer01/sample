package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0250e;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/view/menu/l.class
 */
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/view/menu/l.class */
public class SubMenuC0257l extends C0250e implements SubMenu {

    /* renamed from: B */
    public C0250e f1679B;

    /* renamed from: C */
    public C0252g f1680C;

    public SubMenuC0257l(Context context, C0250e c0250e, C0252g c0252g) {
        super(context);
        this.f1679B = c0250e;
        this.f1680C = c0252g;
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: D */
    public C0250e mo951D() {
        return this.f1679B.mo951D();
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: F */
    public boolean mo953F() {
        return this.f1679B.mo953F();
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: G */
    public boolean mo954G() {
        return this.f1679B.mo954G();
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: H */
    public boolean mo955H() {
        return this.f1679B.mo955H();
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: R */
    public void mo965R(C0250e.a aVar) {
        this.f1679B.mo965R(aVar);
    }

    /* renamed from: e0 */
    public Menu m1052e0() {
        return this.f1679B;
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: f */
    public boolean mo983f(C0252g c0252g) {
        return this.f1679B.mo983f(c0252g);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1680C;
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: h */
    public boolean mo985h(C0250e c0250e, MenuItem menuItem) {
        return super.mo985h(c0250e, menuItem) || this.f1679B.mo985h(c0250e, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: k */
    public boolean mo988k(C0252g c0252g) {
        return this.f1679B.mo988k(c0252g);
    }

    @Override // androidx.appcompat.view.menu.C0250e, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f1679B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.m968U(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m969V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.m971X(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m972Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m973Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f1680C.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1680C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0250e, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f1679B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.C0250e
    /* renamed from: t */
    public String mo996t() {
        C0252g c0252g = this.f1680C;
        int itemId = c0252g != null ? c0252g.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo996t() + ":" + itemId;
    }
}
