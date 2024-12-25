package p235o0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import p118h0.InterfaceMenuItemC5017b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/p.class
 */
/* renamed from: o0.p */
/* loaded from: combined.jar:classes1.jar:o0/p.class */
public final class C6845p {
    /* renamed from: a */
    public static AbstractC6808b m31618a(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            return ((InterfaceMenuItemC5017b) menuItem).mo1012a();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    /* renamed from: b */
    public static View m31619b(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    /* renamed from: c */
    public static MenuItem m31620c(MenuItem menuItem, AbstractC6808b abstractC6808b) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            return ((InterfaceMenuItemC5017b) menuItem).mo1013b(abstractC6808b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: d */
    public static void m31621d(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            ((InterfaceMenuItemC5017b) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c10, i10);
        }
    }

    /* renamed from: e */
    public static void m31622e(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            ((InterfaceMenuItemC5017b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: f */
    public static void m31623f(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            ((InterfaceMenuItemC5017b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: g */
    public static void m31624g(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            ((InterfaceMenuItemC5017b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: h */
    public static void m31625h(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            ((InterfaceMenuItemC5017b) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c10, i10);
        }
    }

    /* renamed from: i */
    public static void m31626i(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC5017b) {
            ((InterfaceMenuItemC5017b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
