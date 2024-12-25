package p106g0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g0/c.class
 */
/* renamed from: g0.c */
/* loaded from: combined.jar:classes1.jar:g0/c.class */
public final class C4917c {

    /* renamed from: a */
    public static Method f28618a;

    /* renamed from: b */
    public static boolean f28619b;

    /* renamed from: c */
    public static Method f28620c;

    /* renamed from: d */
    public static boolean f28621d;

    /* renamed from: a */
    public static void m24837a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* renamed from: b */
    public static boolean m24838b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m24839c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable mo24861a;
        int i10 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i10 >= 23) {
            return;
        }
        if (drawable instanceof InsetDrawable) {
            mo24861a = ((InsetDrawable) drawable).getDrawable();
        } else {
            if (!(drawable instanceof InterfaceC4925k)) {
                if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                }
                int childCount = drawableContainerState.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    Drawable child = drawableContainerState.getChild(i11);
                    if (child != null) {
                        m24839c(child);
                    }
                }
                return;
            }
            mo24861a = ((InterfaceC4925k) drawable).mo24861a();
        }
        m24839c(mo24861a);
    }

    /* renamed from: d */
    public static int m24840d(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* renamed from: e */
    public static ColorFilter m24841e(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: f */
    public static int m24842f(Drawable drawable) {
        int layoutDirection;
        if (Build.VERSION.SDK_INT >= 23) {
            layoutDirection = drawable.getLayoutDirection();
            return layoutDirection;
        }
        if (!f28621d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f28620c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f28621d = true;
        }
        Method method = f28620c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, new Object[0])).intValue();
        } catch (Exception e11) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
            f28620c = null;
            return 0;
        }
    }

    /* renamed from: g */
    public static void m24843g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m24844h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    /* renamed from: i */
    public static void m24845i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m24846j(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    /* renamed from: k */
    public static void m24847k(Drawable drawable, float f10, float f11) {
        drawable.setHotspot(f10, f11);
    }

    /* renamed from: l */
    public static void m24848l(Drawable drawable, int i10, int i11, int i12, int i13) {
        drawable.setHotspotBounds(i10, i11, i12, i13);
    }

    /* renamed from: m */
    public static boolean m24849m(Drawable drawable, int i10) {
        boolean layoutDirection;
        if (Build.VERSION.SDK_INT >= 23) {
            layoutDirection = drawable.setLayoutDirection(i10);
            return layoutDirection;
        }
        if (!f28619b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f28618a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f28619b = true;
        }
        Method method = f28618a;
        if (method == null) {
            return false;
        }
        try {
            method.invoke(drawable, Integer.valueOf(i10));
            return true;
        } catch (Exception e11) {
            Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
            f28618a = null;
            return false;
        }
    }

    /* renamed from: n */
    public static void m24850n(Drawable drawable, int i10) {
        drawable.setTint(i10);
    }

    /* renamed from: o */
    public static void m24851o(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: p */
    public static void m24852p(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.drawable.Drawable] */
    /* renamed from: q */
    public static <T extends Drawable> T m24853q(Drawable drawable) {
        T t10 = drawable;
        if (drawable instanceof InterfaceC4925k) {
            t10 = ((InterfaceC4925k) drawable).mo24861a();
        }
        return t10;
    }

    /* renamed from: r */
    public static Drawable m24854r(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof InterfaceC4924j)) {
            return new C4927m(drawable);
        }
        return drawable;
    }
}
