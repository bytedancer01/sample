package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import p449zi.C10246f;

/* renamed from: pl.droidsonroids.gif.c */
/* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/c.class */
public final class C7737c {

    /* renamed from: a */
    public static final List<String> f37544a = Arrays.asList("raw", "drawable", "mipmap");

    /* renamed from: pl.droidsonroids.gif.c$a */
    /* loaded from: combined.jar:classes3.jar:pl/droidsonroids/gif/c$a.class */
    public static class a {

        /* renamed from: a */
        public boolean f37545a;

        /* renamed from: b */
        public final int f37546b;

        public a() {
            this.f37545a = false;
            this.f37546b = -1;
        }

        public a(View view, AttributeSet attributeSet, int i10, int i11) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C10246f.f46846b, i10, i11);
            this.f37545a = obtainStyledAttributes.getBoolean(C10246f.f46847c, false);
            this.f37546b = obtainStyledAttributes.getInt(C10246f.f46848d, -1);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static void m33808a(int i10, Drawable drawable) {
        if (drawable instanceof C7735a) {
            ((C7735a) drawable).m33800h(i10);
        }
    }

    /* renamed from: b */
    public static float m33809b(Resources resources, int i10) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        if (i11 <= 0 || i12 <= 0) {
            return 1.0f;
        }
        return i12 / i11;
    }
}
