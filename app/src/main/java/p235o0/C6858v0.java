package p235o0;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o0/v0.class
 */
/* renamed from: o0.v0 */
/* loaded from: combined.jar:classes1.jar:o0/v0.class */
public final class C6858v0 {

    /* renamed from: a */
    public static Method f35577a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f35577a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e10) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static float m31657a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f35577a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception e10) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m31658b(ViewConfiguration viewConfiguration, Context context) {
        float scaledHorizontalScrollFactor;
        if (Build.VERSION.SDK_INT < 26) {
            return m31657a(viewConfiguration, context);
        }
        scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    /* renamed from: c */
    public static int m31659c(ViewConfiguration viewConfiguration) {
        int scaledHoverSlop;
        if (Build.VERSION.SDK_INT < 28) {
            return viewConfiguration.getScaledTouchSlop() / 2;
        }
        scaledHoverSlop = viewConfiguration.getScaledHoverSlop();
        return scaledHoverSlop;
    }

    /* renamed from: d */
    public static float m31660d(ViewConfiguration viewConfiguration, Context context) {
        float scaledVerticalScrollFactor;
        if (Build.VERSION.SDK_INT < 26) {
            return m31657a(viewConfiguration, context);
        }
        scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }

    /* renamed from: e */
    public static boolean m31661e(ViewConfiguration viewConfiguration, Context context) {
        boolean shouldShowMenuShortcutsWhenKeyboardPresent;
        if (Build.VERSION.SDK_INT >= 28) {
            shouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            return shouldShowMenuShortcutsWhenKeyboardPresent;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
