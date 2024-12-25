package p068e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C0307d1;
import java.util.WeakHashMap;
import p050d0.C4290b;
import p069e0.C4562a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e/b.class
 */
@SuppressLint({"RestrictedAPI"})
/* renamed from: e.b */
/* loaded from: combined.jar:classes1.jar:e/b.class */
public final class C4561b {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f27158a = new ThreadLocal<>();

    /* renamed from: b */
    public static final WeakHashMap<Context, SparseArray<a>> f27159b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f27160c = new Object();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e/b$a.class
     */
    /* renamed from: e.b$a */
    /* loaded from: combined.jar:classes1.jar:e/b$a.class */
    public static class a {

        /* renamed from: a */
        public final ColorStateList f27161a;

        /* renamed from: b */
        public final Configuration f27162b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f27161a = colorStateList;
            this.f27162b = configuration;
        }
    }

    /* renamed from: a */
    public static void m22996a(Context context, int i10, ColorStateList colorStateList) {
        synchronized (f27160c) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = f27159b;
            SparseArray<a> sparseArray = weakHashMap.get(context);
            SparseArray<a> sparseArray2 = sparseArray;
            if (sparseArray == null) {
                sparseArray2 = new SparseArray<>();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i10, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: b */
    public static ColorStateList m22997b(Context context, int i10) {
        a aVar;
        synchronized (f27160c) {
            SparseArray<a> sparseArray = f27159b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i10)) != null) {
                if (aVar.f27162b.equals(context.getResources().getConfiguration())) {
                    return aVar.f27161a;
                }
                sparseArray.remove(i10);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static ColorStateList m22998c(Context context, int i10) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList = context.getColorStateList(i10);
            return colorStateList;
        }
        ColorStateList m22997b = m22997b(context, i10);
        if (m22997b != null) {
            return m22997b;
        }
        ColorStateList m23001f = m23001f(context, i10);
        if (m23001f == null) {
            return C4290b.m21725d(context, i10);
        }
        m22996a(context, i10, m23001f);
        return m23001f;
    }

    /* renamed from: d */
    public static Drawable m22999d(Context context, int i10) {
        return C0307d1.m1285h().m1296j(context, i10);
    }

    /* renamed from: e */
    public static TypedValue m23000e() {
        ThreadLocal<TypedValue> threadLocal = f27158a;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }

    /* renamed from: f */
    public static ColorStateList m23001f(Context context, int i10) {
        if (m23002g(context, i10)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C4562a.m23003a(resources, resources.getXml(i10), context.getTheme());
        } catch (Exception e10) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m23002g(Context context, int i10) {
        Resources resources = context.getResources();
        TypedValue m23000e = m23000e();
        boolean z10 = true;
        resources.getValue(i10, m23000e, true);
        int i11 = m23000e.type;
        if (i11 < 28 || i11 > 31) {
            z10 = false;
        }
        return z10;
    }
}
