package p118h0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p235o0.AbstractC6808b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:h0/b.class
 */
/* renamed from: h0.b */
/* loaded from: combined.jar:classes1.jar:h0/b.class */
public interface InterfaceMenuItemC5017b extends MenuItem {
    /* renamed from: a */
    AbstractC6808b mo1012a();

    /* renamed from: b */
    InterfaceMenuItemC5017b mo1013b(AbstractC6808b abstractC6808b);

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i10);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    InterfaceMenuItemC5017b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c10, int i10);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    @Override // android.view.MenuItem
    void setShowAsAction(int i10);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i10);

    @Override // android.view.MenuItem
    InterfaceMenuItemC5017b setTooltipText(CharSequence charSequence);
}
