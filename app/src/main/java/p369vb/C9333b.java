package p369vb;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import p087f0.C4738a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vb/b.class
 */
/* renamed from: vb.b */
/* loaded from: combined.jar:classes2.jar:vb/b.class */
public class C9333b {

    /* renamed from: a */
    public static final boolean f42525a = true;

    /* renamed from: b */
    public static final int[] f42526b = {R.attr.state_pressed};

    /* renamed from: c */
    public static final int[] f42527c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f42528d = {R.attr.state_focused};

    /* renamed from: e */
    public static final int[] f42529e = {R.attr.state_hovered};

    /* renamed from: f */
    public static final int[] f42530f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g */
    public static final int[] f42531g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h */
    public static final int[] f42532h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i */
    public static final int[] f42533i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j */
    public static final int[] f42534j = {R.attr.state_selected};

    /* renamed from: k */
    public static final int[] f42535k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l */
    public static final String f42536l = C9333b.class.getSimpleName();

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[], int[][]] */
    /* renamed from: a */
    public static ColorStateList m39327a(ColorStateList colorStateList) {
        if (f42525a) {
            int[] iArr = f42534j;
            int m39329c = m39329c(colorStateList, f42530f);
            return new ColorStateList(new int[]{iArr, StateSet.NOTHING}, new int[]{m39329c, m39329c(colorStateList, f42526b)});
        }
        int[] iArr2 = f42530f;
        int m39329c2 = m39329c(colorStateList, iArr2);
        int[] iArr3 = f42531g;
        int m39329c3 = m39329c(colorStateList, iArr3);
        int[] iArr4 = f42532h;
        int m39329c4 = m39329c(colorStateList, iArr4);
        int[] iArr5 = f42533i;
        int m39329c5 = m39329c(colorStateList, iArr5);
        int[] iArr6 = f42534j;
        int[] iArr7 = f42526b;
        int m39329c6 = m39329c(colorStateList, iArr7);
        int[] iArr8 = f42527c;
        int m39329c7 = m39329c(colorStateList, iArr8);
        int[] iArr9 = f42528d;
        int m39329c8 = m39329c(colorStateList, iArr9);
        int[] iArr10 = f42529e;
        return new ColorStateList(new int[]{iArr2, iArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9, iArr10, StateSet.NOTHING}, new int[]{m39329c2, m39329c3, m39329c4, m39329c5, 0, m39329c6, m39329c7, m39329c8, m39329c(colorStateList, iArr10), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    public static int m39328b(int i10) {
        return C4738a.m23974m(i10, Math.min(Color.alpha(i10) * 2, 255));
    }

    /* renamed from: c */
    public static int m39329c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int i10 = colorForState;
        if (f42525a) {
            i10 = m39328b(colorForState);
        }
        return i10;
    }

    /* renamed from: d */
    public static ColorStateList m39330d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f42535k, 0)) != 0) {
            Log.w(f42536l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m39331e(int[] iArr) {
        boolean z10;
        int length = iArr.length;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i10 < length) {
            int i11 = iArr[i10];
            if (i11 == 16842910) {
                z10 = true;
            } else {
                if (i11 != 16842908 && i11 != 16842919) {
                    z10 = z11;
                    if (i11 != 16843623) {
                    }
                }
                z12 = true;
                z10 = z11;
            }
            i10++;
            z11 = z10;
        }
        boolean z13 = false;
        if (z11) {
            z13 = false;
            if (z12) {
                z13 = true;
            }
        }
        return z13;
    }
}
