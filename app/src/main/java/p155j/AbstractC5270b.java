package p155j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p118h0.InterfaceMenuItemC5017b;
import p118h0.InterfaceSubMenuC5018c;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j/b.class
 */
/* renamed from: j.b */
/* loaded from: combined.jar:classes1.jar:j/b.class */
public abstract class AbstractC5270b {

    /* renamed from: a */
    public final Context f30301a;

    /* renamed from: b */
    public C7936i<InterfaceMenuItemC5017b, MenuItem> f30302b;

    /* renamed from: c */
    public C7936i<InterfaceSubMenuC5018c, SubMenu> f30303c;

    public AbstractC5270b(Context context) {
        this.f30301a = context;
    }

    /* renamed from: c */
    public final MenuItem m26337c(MenuItem menuItem) {
        MenuItem menuItem2 = menuItem;
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            InterfaceMenuItemC5017b interfaceMenuItemC5017b = (InterfaceMenuItemC5017b) menuItem;
            if (this.f30302b == null) {
                this.f30302b = new C7936i<>();
            }
            MenuItem menuItem3 = this.f30302b.get(menuItem);
            menuItem2 = menuItem3;
            if (menuItem3 == null) {
                menuItem2 = new MenuItemC5271c(this.f30301a, interfaceMenuItemC5017b);
                this.f30302b.put(interfaceMenuItemC5017b, menuItem2);
            }
        }
        return menuItem2;
    }

    /* renamed from: d */
    public final SubMenu m26338d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC5018c)) {
            return subMenu;
        }
        InterfaceSubMenuC5018c interfaceSubMenuC5018c = (InterfaceSubMenuC5018c) subMenu;
        if (this.f30303c == null) {
            this.f30303c = new C7936i<>();
        }
        SubMenu subMenu2 = this.f30303c.get(interfaceSubMenuC5018c);
        SubMenu subMenu3 = subMenu2;
        if (subMenu2 == null) {
            subMenu3 = new SubMenuC5275g(this.f30301a, interfaceSubMenuC5018c);
            this.f30303c.put(interfaceSubMenuC5018c, subMenu3);
        }
        return subMenu3;
    }

    /* renamed from: e */
    public final void m26339e() {
        C7936i<InterfaceMenuItemC5017b, MenuItem> c7936i = this.f30302b;
        if (c7936i != null) {
            c7936i.clear();
        }
        C7936i<InterfaceSubMenuC5018c, SubMenu> c7936i2 = this.f30303c;
        if (c7936i2 != null) {
            c7936i2.clear();
        }
    }

    /* renamed from: f */
    public final void m26340f(int i10) {
        if (this.f30302b == null) {
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= this.f30302b.size()) {
                return;
            }
            int i13 = i12;
            if (this.f30302b.m34439j(i12).getGroupId() == i10) {
                this.f30302b.m34441l(i12);
                i13 = i12 - 1;
            }
            i11 = i13 + 1;
        }
    }

    /* renamed from: g */
    public final void m26341g(int i10) {
        if (this.f30302b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f30302b.size(); i11++) {
            if (this.f30302b.m34439j(i11).getItemId() == i10) {
                this.f30302b.m34441l(i11);
                return;
            }
        }
    }
}
