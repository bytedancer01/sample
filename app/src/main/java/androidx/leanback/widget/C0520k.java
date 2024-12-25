package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/leanback/widget/k.class
 */
/* renamed from: androidx.leanback.widget.k */
/* loaded from: combined.jar:classes1.jar:androidx/leanback/widget/k.class */
public final class C0520k {
    /* renamed from: a */
    public static Drawable m2658a(View view) {
        Drawable foreground;
        if (Build.VERSION.SDK_INT < 23) {
            return null;
        }
        foreground = view.getForeground();
        return foreground;
    }

    /* renamed from: b */
    public static void m2659b(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(drawable);
        }
    }

    /* renamed from: c */
    public static boolean m2660c() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
