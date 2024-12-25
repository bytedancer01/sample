package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p029c.C0929j;
import p087f0.C4738a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/i1.class
 */
/* renamed from: androidx.appcompat.widget.i1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/i1.class */
public class C0322i1 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f2134a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f2135b = {-16842910};

    /* renamed from: c */
    public static final int[] f2136c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f2137d = {R.attr.state_activated};

    /* renamed from: e */
    public static final int[] f2138e = {R.attr.state_pressed};

    /* renamed from: f */
    public static final int[] f2139f = {R.attr.state_checked};

    /* renamed from: g */
    public static final int[] f2140g = {R.attr.state_selected};

    /* renamed from: h */
    public static final int[] f2141h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f2142i = new int[0];

    /* renamed from: j */
    public static final int[] f2143j = new int[1];

    /* renamed from: a */
    public static void m1454a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0929j.f6545z0);
        try {
            if (!obtainStyledAttributes.hasValue(C0929j.f6303E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1455b(Context context, int i10) {
        ColorStateList m1458e = m1458e(context, i10);
        if (m1458e != null && m1458e.isStateful()) {
            return m1458e.getColorForState(f2135b, m1458e.getDefaultColor());
        }
        TypedValue m1459f = m1459f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m1459f, true);
        return m1457d(context, i10, m1459f.getFloat());
    }

    /* renamed from: c */
    public static int m1456c(Context context, int i10) {
        int[] iArr = f2143j;
        iArr[0] = i10;
        C0337n1 m1504u = C0337n1.m1504u(context, null, iArr);
        try {
            return m1504u.m1507b(0, 0);
        } finally {
            m1504u.m1525w();
        }
    }

    /* renamed from: d */
    public static int m1457d(Context context, int i10, float f10) {
        return C4738a.m23974m(m1456c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    /* renamed from: e */
    public static ColorStateList m1458e(Context context, int i10) {
        int[] iArr = f2143j;
        iArr[0] = i10;
        C0337n1 m1504u = C0337n1.m1504u(context, null, iArr);
        try {
            return m1504u.m1508c(0);
        } finally {
            m1504u.m1525w();
        }
    }

    /* renamed from: f */
    public static TypedValue m1459f() {
        ThreadLocal<TypedValue> threadLocal = f2134a;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }
}
