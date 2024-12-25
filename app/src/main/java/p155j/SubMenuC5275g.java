package p155j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p118h0.InterfaceSubMenuC5018c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j/g.class
 */
/* renamed from: j.g */
/* loaded from: combined.jar:classes1.jar:j/g.class */
public class SubMenuC5275g extends MenuC5273e implements SubMenu {

    /* renamed from: e */
    public final InterfaceSubMenuC5018c f30317e;

    public SubMenuC5275g(Context context, InterfaceSubMenuC5018c interfaceSubMenuC5018c) {
        super(context, interfaceSubMenuC5018c);
        this.f30317e = interfaceSubMenuC5018c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f30317e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m26337c(this.f30317e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        this.f30317e.setHeaderIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f30317e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        this.f30317e.setHeaderTitle(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f30317e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f30317e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f30317e.setIcon(i10);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f30317e.setIcon(drawable);
        return this;
    }
}
