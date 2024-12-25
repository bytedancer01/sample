package p351ub;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0337n1;
import p068e.C4561b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ub/c.class
 */
/* renamed from: ub.c */
/* loaded from: combined.jar:classes2.jar:ub/c.class */
public class C9148c {
    /* renamed from: a */
    public static ColorStateList m38476a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList m22998c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (m22998c = C4561b.m22998c(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : m22998c;
    }

    /* renamed from: b */
    public static ColorStateList m38477b(Context context, C0337n1 c0337n1, int i10) {
        int m1519n;
        ColorStateList m22998c;
        return (!c0337n1.m1524s(i10) || (m1519n = c0337n1.m1519n(i10, 0)) == 0 || (m22998c = C4561b.m22998c(context, m1519n)) == null) ? c0337n1.m1508c(i10) : m22998c;
    }

    /* renamed from: c */
    public static int m38478c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m38479d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable m22999d;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (m22999d = C4561b.m22999d(context, resourceId)) == null) ? typedArray.getDrawable(i10) : m22999d;
    }

    /* renamed from: e */
    public static int m38480e(TypedArray typedArray, int i10, int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    /* renamed from: f */
    public static C9149d m38481f(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new C9149d(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m38482g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m38483h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
