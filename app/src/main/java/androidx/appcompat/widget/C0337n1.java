package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p068e.C4561b;
import p069e0.C4568g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/appcompat/widget/n1.class
 */
/* renamed from: androidx.appcompat.widget.n1 */
/* loaded from: combined.jar:classes1.jar:androidx/appcompat/widget/n1.class */
public class C0337n1 {

    /* renamed from: a */
    public final Context f2168a;

    /* renamed from: b */
    public final TypedArray f2169b;

    /* renamed from: c */
    public TypedValue f2170c;

    public C0337n1(Context context, TypedArray typedArray) {
        this.f2168a = context;
        this.f2169b = typedArray;
    }

    /* renamed from: t */
    public static C0337n1 m1503t(Context context, int i10, int[] iArr) {
        return new C0337n1(context, context.obtainStyledAttributes(i10, iArr));
    }

    /* renamed from: u */
    public static C0337n1 m1504u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0337n1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0337n1 m1505v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new C0337n1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    /* renamed from: a */
    public boolean m1506a(int i10, boolean z10) {
        return this.f2169b.getBoolean(i10, z10);
    }

    /* renamed from: b */
    public int m1507b(int i10, int i11) {
        return this.f2169b.getColor(i10, i11);
    }

    /* renamed from: c */
    public ColorStateList m1508c(int i10) {
        int resourceId;
        ColorStateList m22998c;
        return (!this.f2169b.hasValue(i10) || (resourceId = this.f2169b.getResourceId(i10, 0)) == 0 || (m22998c = C4561b.m22998c(this.f2168a, resourceId)) == null) ? this.f2169b.getColorStateList(i10) : m22998c;
    }

    /* renamed from: d */
    public float m1509d(int i10, float f10) {
        return this.f2169b.getDimension(i10, f10);
    }

    /* renamed from: e */
    public int m1510e(int i10, int i11) {
        return this.f2169b.getDimensionPixelOffset(i10, i11);
    }

    /* renamed from: f */
    public int m1511f(int i10, int i11) {
        return this.f2169b.getDimensionPixelSize(i10, i11);
    }

    /* renamed from: g */
    public Drawable m1512g(int i10) {
        int resourceId;
        return (!this.f2169b.hasValue(i10) || (resourceId = this.f2169b.getResourceId(i10, 0)) == 0) ? this.f2169b.getDrawable(i10) : C4561b.m22999d(this.f2168a, resourceId);
    }

    /* renamed from: h */
    public Drawable m1513h(int i10) {
        int resourceId;
        if (!this.f2169b.hasValue(i10) || (resourceId = this.f2169b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C0320i.m1437b().m1442d(this.f2168a, resourceId, true);
    }

    /* renamed from: i */
    public float m1514i(int i10, float f10) {
        return this.f2169b.getFloat(i10, f10);
    }

    /* renamed from: j */
    public Typeface m1515j(int i10, int i11, C4568g.c cVar) {
        int resourceId = this.f2169b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2170c == null) {
            this.f2170c = new TypedValue();
        }
        return C4568g.m23055f(this.f2168a, resourceId, this.f2170c, i11, cVar);
    }

    /* renamed from: k */
    public int m1516k(int i10, int i11) {
        return this.f2169b.getInt(i10, i11);
    }

    /* renamed from: l */
    public int m1517l(int i10, int i11) {
        return this.f2169b.getInteger(i10, i11);
    }

    /* renamed from: m */
    public int m1518m(int i10, int i11) {
        return this.f2169b.getLayoutDimension(i10, i11);
    }

    /* renamed from: n */
    public int m1519n(int i10, int i11) {
        return this.f2169b.getResourceId(i10, i11);
    }

    /* renamed from: o */
    public String m1520o(int i10) {
        return this.f2169b.getString(i10);
    }

    /* renamed from: p */
    public CharSequence m1521p(int i10) {
        return this.f2169b.getText(i10);
    }

    /* renamed from: q */
    public CharSequence[] m1522q(int i10) {
        return this.f2169b.getTextArray(i10);
    }

    /* renamed from: r */
    public TypedArray m1523r() {
        return this.f2169b;
    }

    /* renamed from: s */
    public boolean m1524s(int i10) {
        return this.f2169b.hasValue(i10);
    }

    /* renamed from: w */
    public void m1525w() {
        this.f2169b.recycle();
    }
}
