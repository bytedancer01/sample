package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p029c.C0929j;
import p235o0.C6824g0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/h0.class
 */
/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/h0.class */
public class C0318h0 {

    /* renamed from: l */
    public static final RectF f2092l = new RectF();

    /* renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f2093m = new ConcurrentHashMap<>();

    /* renamed from: n */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f2094n = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f2095a = 0;

    /* renamed from: b */
    public boolean f2096b = false;

    /* renamed from: c */
    public float f2097c = -1.0f;

    /* renamed from: d */
    public float f2098d = -1.0f;

    /* renamed from: e */
    public float f2099e = -1.0f;

    /* renamed from: f */
    public int[] f2100f = new int[0];

    /* renamed from: g */
    public boolean f2101g = false;

    /* renamed from: h */
    public TextPaint f2102h;

    /* renamed from: i */
    public final TextView f2103i;

    /* renamed from: j */
    public final Context f2104j;

    /* renamed from: k */
    public final c f2105k;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/h0$a.class
     */
    /* renamed from: androidx.appcompat.widget.h0$a */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/h0$a.class */
    public static class a extends c {
        @Override // androidx.appcompat.widget.C0318h0.c
        /* renamed from: a */
        public void mo1412a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
            staticLayout$Builder.setTextDirection((TextDirectionHeuristic) C0318h0.m1385o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/h0$b.class
     */
    /* renamed from: androidx.appcompat.widget.h0$b */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/h0$b.class */
    public static class b extends a {
        @Override // androidx.appcompat.widget.C0318h0.a, androidx.appcompat.widget.C0318h0.c
        /* renamed from: a */
        public void mo1412a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            staticLayout$Builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C0318h0.c
        /* renamed from: b */
        public boolean mo1413b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/appcompat/widget/h0$c.class
     */
    /* renamed from: androidx.appcompat.widget.h0$c */
    /* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/h0$c.class */
    public static class c {
        /* renamed from: a */
        public void mo1412a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
        }

        /* renamed from: b */
        public boolean mo1413b(TextView textView) {
            return ((Boolean) C0318h0.m1385o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C0318h0(TextView textView) {
        this.f2103i = textView;
        this.f2104j = textView.getContext();
        int i10 = Build.VERSION.SDK_INT;
        this.f2105k = i10 >= 29 ? new b() : i10 >= 23 ? new a() : new c();
    }

    /* renamed from: m */
    public static Method m1384m(String str) {
        try {
            Method method = f2093m.get(str);
            Method method2 = method;
            if (method == null) {
                Method declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0]);
                method2 = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    f2093m.put(str, declaredMethod);
                    method2 = declaredMethod;
                }
            }
            return method2;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static <T> T m1385o(Object obj, String str, T t10) {
        try {
            t10 = m1384m(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
        }
        return t10;
    }

    /* renamed from: A */
    public final boolean m1386A() {
        return !(this.f2103i instanceof C0323j);
    }

    /* renamed from: B */
    public final void m1387B(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f2095a = 1;
        this.f2098d = f10;
        this.f2099e = f11;
        this.f2097c = f12;
        this.f2101g = false;
    }

    /* renamed from: a */
    public void m1388a() {
        if (m1401p()) {
            if (this.f2096b) {
                if (this.f2103i.getMeasuredHeight() <= 0 || this.f2103i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2105k.mo1413b(this.f2103i) ? 1048576 : (this.f2103i.getMeasuredWidth() - this.f2103i.getTotalPaddingLeft()) - this.f2103i.getTotalPaddingRight();
                int height = (this.f2103i.getHeight() - this.f2103i.getCompoundPaddingBottom()) - this.f2103i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2092l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m1394g = m1394g(rectF);
                    if (m1394g != this.f2103i.getTextSize()) {
                        m1407v(0, m1394g);
                    }
                }
            }
            this.f2096b = true;
        }
    }

    /* renamed from: b */
    public final int[] m1389b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    public final void m1390c() {
        this.f2095a = 0;
        this.f2098d = -1.0f;
        this.f2099e = -1.0f;
        this.f2097c = -1.0f;
        this.f2100f = new int[0];
        this.f2096b = false;
    }

    /* renamed from: d */
    public StaticLayout m1391d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return Build.VERSION.SDK_INT >= 23 ? m1392e(charSequence, alignment, i10, i11) : m1393f(charSequence, alignment, i10);
    }

    /* renamed from: e */
    public final StaticLayout m1392e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        int breakStrategy;
        int hyphenationFrequency;
        StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), this.f2102h, i10);
        StaticLayout$Builder includePad = obtain.setAlignment(alignment).setLineSpacing(this.f2103i.getLineSpacingExtra(), this.f2103i.getLineSpacingMultiplier()).setIncludePad(this.f2103i.getIncludeFontPadding());
        breakStrategy = this.f2103i.getBreakStrategy();
        StaticLayout$Builder breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
        hyphenationFrequency = this.f2103i.getHyphenationFrequency();
        StaticLayout$Builder hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
        int i12 = i11;
        if (i11 == -1) {
            i12 = Integer.MAX_VALUE;
        }
        hyphenationFrequency2.setMaxLines(i12);
        try {
            this.f2105k.mo1412a(obtain, this.f2103i);
        } catch (ClassCastException e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: f */
    public final StaticLayout m1393f(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f2102h, i10, alignment, this.f2103i.getLineSpacingMultiplier(), this.f2103i.getLineSpacingExtra(), this.f2103i.getIncludeFontPadding());
    }

    /* renamed from: g */
    public final int m1394g(RectF rectF) {
        int length = this.f2100f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            if (m1411z(this.f2100f[i13], rectF)) {
                i12 = i11;
                i11 = i13 + 1;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f2100f[i12];
    }

    /* renamed from: h */
    public int m1395h() {
        return Math.round(this.f2099e);
    }

    /* renamed from: i */
    public int m1396i() {
        return Math.round(this.f2098d);
    }

    /* renamed from: j */
    public int m1397j() {
        return Math.round(this.f2097c);
    }

    /* renamed from: k */
    public int[] m1398k() {
        return this.f2100f;
    }

    /* renamed from: l */
    public int m1399l() {
        return this.f2095a;
    }

    /* renamed from: n */
    public void m1400n(int i10) {
        TextPaint textPaint = this.f2102h;
        if (textPaint == null) {
            this.f2102h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2102h.set(this.f2103i.getPaint());
        this.f2102h.setTextSize(i10);
    }

    /* renamed from: p */
    public boolean m1401p() {
        return m1386A() && this.f2095a != 0;
    }

    /* renamed from: q */
    public void m1402q(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f2104j;
        int[] iArr = C0929j.f6460i0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f2103i;
        C6824g0.m31535n0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = C0929j.f6485n0;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f2095a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = C0929j.f6480m0;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = C0929j.f6470k0;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = C0929j.f6465j0;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = C0929j.f6475l0;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1409x(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1386A()) {
            this.f2095a = 0;
            return;
        }
        if (this.f2095a == 1) {
            if (!this.f2101g) {
                DisplayMetrics displayMetrics = this.f2104j.getResources().getDisplayMetrics();
                float f10 = dimension2;
                if (dimension2 == -1.0f) {
                    f10 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                float f11 = dimension3;
                if (dimension3 == -1.0f) {
                    f11 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f12 = dimension;
                if (dimension == -1.0f) {
                    f12 = 1.0f;
                }
                m1387B(f10, f11, f12);
            }
            m1408w();
        }
    }

    /* renamed from: r */
    public void m1403r(int i10, int i11, int i12, int i13) {
        if (m1386A()) {
            DisplayMetrics displayMetrics = this.f2104j.getResources().getDisplayMetrics();
            m1387B(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (m1408w()) {
                m1388a();
            }
        }
    }

    /* renamed from: s */
    public void m1404s(int[] iArr, int i10) {
        int[] iArr2;
        if (m1386A()) {
            int length = iArr.length;
            int i11 = 0;
            if (length > 0) {
                int[] iArr3 = new int[length];
                if (i10 != 0) {
                    DisplayMetrics displayMetrics = this.f2104j.getResources().getDisplayMetrics();
                    while (true) {
                        iArr2 = iArr3;
                        if (i11 >= length) {
                            break;
                        }
                        iArr3[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                        i11++;
                    }
                } else {
                    iArr2 = Arrays.copyOf(iArr, length);
                }
                this.f2100f = m1389b(iArr2);
                if (!m1410y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2101g = false;
            }
            if (m1408w()) {
                m1388a();
            }
        }
    }

    /* renamed from: t */
    public void m1405t(int i10) {
        if (m1386A()) {
            if (i10 == 0) {
                m1390c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f2104j.getResources().getDisplayMetrics();
            m1387B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1408w()) {
                m1388a();
            }
        }
    }

    /* renamed from: u */
    public final void m1406u(float f10) {
        if (f10 != this.f2103i.getPaint().getTextSize()) {
            this.f2103i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f2103i.isInLayout();
            if (this.f2103i.getLayout() != null) {
                this.f2096b = false;
                try {
                    Method m1384m = m1384m("nullLayouts");
                    if (m1384m != null) {
                        m1384m.invoke(this.f2103i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    this.f2103i.forceLayout();
                } else {
                    this.f2103i.requestLayout();
                }
                this.f2103i.invalidate();
            }
        }
    }

    /* renamed from: v */
    public void m1407v(int i10, float f10) {
        Context context = this.f2104j;
        m1406u(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* renamed from: w */
    public final boolean m1408w() {
        if (m1386A() && this.f2095a == 1) {
            if (!this.f2101g || this.f2100f.length == 0) {
                int floor = ((int) Math.floor((this.f2099e - this.f2098d) / this.f2097c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f2098d + (i10 * this.f2097c));
                }
                this.f2100f = m1389b(iArr);
            }
            this.f2096b = true;
        } else {
            this.f2096b = false;
        }
        return this.f2096b;
    }

    /* renamed from: x */
    public final void m1409x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f2100f = m1389b(iArr);
            m1410y();
        }
    }

    /* renamed from: y */
    public final boolean m1410y() {
        boolean z10 = this.f2100f.length > 0;
        this.f2101g = z10;
        if (z10) {
            this.f2095a = 1;
            this.f2098d = r0[0];
            this.f2099e = r0[r0 - 1];
            this.f2097c = -1.0f;
        }
        return z10;
    }

    /* renamed from: z */
    public final boolean m1411z(int i10, RectF rectF) {
        CharSequence text = this.f2103i.getText();
        TransformationMethod transformationMethod = this.f2103i.getTransformationMethod();
        CharSequence charSequence = text;
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.f2103i);
            charSequence = text;
            if (transformation != null) {
                charSequence = transformation;
            }
        }
        int maxLines = this.f2103i.getMaxLines();
        m1400n(i10);
        StaticLayout m1391d = m1391d(charSequence, (Layout.Alignment) m1385o(this.f2103i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (m1391d.getLineCount() <= maxLines && m1391d.getLineEnd(m1391d.getLineCount() - 1) == charSequence.length())) && ((float) m1391d.getHeight()) <= rectF.bottom;
    }
}
