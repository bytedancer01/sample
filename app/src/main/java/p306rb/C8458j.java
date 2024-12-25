package p306rb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0337n1;
import p012ab.C0142b;
import p012ab.C0152l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:rb/j.class
 */
/* renamed from: rb.j */
/* loaded from: combined.jar:classes2.jar:rb/j.class */
public final class C8458j {

    /* renamed from: a */
    public static final int[] f39542a = {C0142b.f651k};

    /* renamed from: b */
    public static final int[] f39543b = {C0142b.f652l};

    /* renamed from: a */
    public static void m36331a(Context context) {
        m36335e(context, f39542a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m36332b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0152l.f913I6, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(C0152l.f929K6, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C0142b.f658r, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m36333c(context);
            }
        }
        m36331a(context);
    }

    /* renamed from: c */
    public static void m36333c(Context context) {
        m36335e(context, f39543b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    public static void m36334d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0152l.f913I6, i10, i11);
        boolean z10 = false;
        if (!obtainStyledAttributes.getBoolean(C0152l.f937L6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z10 = m36336f(context, attributeSet, iArr, i10, i11, iArr2);
        } else if (obtainStyledAttributes.getResourceId(C0152l.f921J6, -1) != -1) {
            z10 = true;
        }
        obtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    public static void m36335e(Context context, int[] iArr, String str) {
        if (m36337g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    public static boolean m36336f(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i12, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    public static boolean m36337g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m36338h(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m36332b(context, attributeSet, i10, i11);
        m36334d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    /* renamed from: i */
    public static C0337n1 m36339i(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m36332b(context, attributeSet, i10, i11);
        m36334d(context, attributeSet, iArr, i10, i11, iArr2);
        return C0337n1.m1505v(context, attributeSet, iArr, i10, i11);
    }
}
