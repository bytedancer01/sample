package p155j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p118h0.InterfaceMenuC5016a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:j/e.class
 */
/* renamed from: j.e */
/* loaded from: combined.jar:classes1.jar:j/e.class */
public class MenuC5273e extends AbstractC5270b implements Menu {

    /* renamed from: d */
    public final InterfaceMenuC5016a f30316d;

    public MenuC5273e(Context context, InterfaceMenuC5016a interfaceMenuC5016a) {
        super(context);
        if (interfaceMenuC5016a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f30316d = interfaceMenuC5016a;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m26337c(this.f30316d.add(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m26337c(this.f30316d.add(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m26337c(this.f30316d.add(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m26337c(this.f30316d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f30316d.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = m26337c(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return m26338d(this.f30316d.addSubMenu(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return m26338d(this.f30316d.addSubMenu(i10, i11, i12, i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return m26338d(this.f30316d.addSubMenu(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m26338d(this.f30316d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m26339e();
        this.f30316d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f30316d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        return m26337c(this.f30316d.findItem(i10));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return m26337c(this.f30316d.getItem(i10));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f30316d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f30316d.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return this.f30316d.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f30316d.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        m26340f(i10);
        this.f30316d.removeGroup(i10);
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m26341g(i10);
        this.f30316d.removeItem(i10);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f30316d.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        this.f30316d.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        this.f30316d.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f30316d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f30316d.size();
    }
}
