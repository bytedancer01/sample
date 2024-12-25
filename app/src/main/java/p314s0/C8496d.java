package p314s0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:s0/d.class
 */
/* renamed from: s0.d */
/* loaded from: combined.jar:classes1.jar:s0/d.class */
public final class C8496d {

    /* renamed from: a */
    public static Field f39858a;

    /* renamed from: b */
    public static boolean f39859b;

    /* renamed from: a */
    public static Drawable m36685a(CompoundButton compoundButton) {
        Drawable buttonDrawable;
        if (Build.VERSION.SDK_INT >= 23) {
            buttonDrawable = compoundButton.getButtonDrawable();
            return buttonDrawable;
        }
        if (!f39859b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f39858a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f39859b = true;
        }
        Field field = f39858a;
        if (field == null) {
            return null;
        }
        try {
            return (Drawable) field.get(compoundButton);
        } catch (IllegalAccessException e11) {
            Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
            f39858a = null;
            return null;
        }
    }

    /* renamed from: b */
    public static ColorStateList m36686b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* renamed from: c */
    public static void m36687c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: d */
    public static void m36688d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
