package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import p086f.C4735c;
import p106g0.C4917c;
import p106g0.InterfaceC4925k;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/o0.class
 */
@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.o0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/o0.class */
public class C0339o0 {

    /* renamed from: a */
    public static final int[] f2173a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f2174b = new int[0];

    /* renamed from: c */
    public static final Rect f2175c = new Rect();

    /* renamed from: d */
    public static Class<?> f2176d;

    static {
        try {
            f2176d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m1528a(Drawable drawable) {
        Drawable drawable2;
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC4925k) {
                drawable2 = ((InterfaceC4925k) drawable).mo24861a();
            } else if (drawable instanceof C4735c) {
                drawable2 = ((C4735c) drawable).m23951a();
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return m1528a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m1528a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m1529b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m1530c(drawable);
        }
    }

    /* renamed from: c */
    public static void m1530c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f2173a);
        } else {
            drawable.setState(f2174b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static Rect m1531d(Drawable drawable) {
        Insets opticalInsets;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f2176d != null) {
            try {
                Drawable m24853q = C4917c.m24853q(drawable);
                Object invoke = m24853q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(m24853q, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f2176d.getFields()) {
                        String name = field.getName();
                        boolean z10 = -1;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    z10 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    z10 = true;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    z10 = false;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    z10 = 2;
                                    break;
                                }
                                break;
                        }
                        if (!z10) {
                            rect2.left = field.getInt(invoke);
                        } else if (z10) {
                            rect2.top = field.getInt(invoke);
                        } else if (z10 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (z10 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception e10) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f2175c;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m1532e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
