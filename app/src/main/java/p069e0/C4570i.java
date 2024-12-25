package p069e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e0/i.class
 */
/* renamed from: e0.i */
/* loaded from: combined.jar:classes1.jar:e0/i.class */
public class C4570i {
    /* renamed from: a */
    public static int m23069a(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    /* renamed from: b */
    public static boolean m23070b(TypedArray typedArray, int i10, int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    /* renamed from: c */
    public static Drawable m23071c(TypedArray typedArray, int i10, int i11) {
        Drawable drawable = typedArray.getDrawable(i10);
        Drawable drawable2 = drawable;
        if (drawable == null) {
            drawable2 = typedArray.getDrawable(i11);
        }
        return drawable2;
    }

    /* renamed from: d */
    public static int m23072d(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getInt(i10, typedArray.getInt(i11, i12));
    }

    /* renamed from: e */
    public static boolean m23073e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !m23086r(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    /* renamed from: f */
    public static int m23074f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m23086r(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    /* renamed from: g */
    public static ColorStateList m23075g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (!m23086r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            return (i11 < 28 || i11 > 31) ? C4562a.m23006d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme) : m23076h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    /* renamed from: h */
    public static ColorStateList m23076h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: i */
    public static C4563b m23077i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (m23086r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return C4563b.m23012b(typedValue.data);
            }
            C4563b m23015g = C4563b.m23015g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (m23015g != null) {
                return m23015g;
            }
        }
        return C4563b.m23012b(i11);
    }

    /* renamed from: j */
    public static float m23078j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !m23086r(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    /* renamed from: k */
    public static int m23079k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m23086r(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    /* renamed from: l */
    public static int m23080l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m23086r(xmlPullParser, str) ? i11 : typedArray.getResourceId(i10, i11);
    }

    /* renamed from: m */
    public static String m23081m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m23086r(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    /* renamed from: n */
    public static int m23082n(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getResourceId(i10, typedArray.getResourceId(i11, i12));
    }

    /* renamed from: o */
    public static String m23083o(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        String str = string;
        if (string == null) {
            str = typedArray.getString(i11);
        }
        return str;
    }

    /* renamed from: p */
    public static CharSequence m23084p(TypedArray typedArray, int i10, int i11) {
        CharSequence text = typedArray.getText(i10);
        CharSequence charSequence = text;
        if (text == null) {
            charSequence = typedArray.getText(i11);
        }
        return charSequence;
    }

    /* renamed from: q */
    public static CharSequence[] m23085q(TypedArray typedArray, int i10, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        CharSequence[] charSequenceArr = textArray;
        if (textArray == null) {
            charSequenceArr = typedArray.getTextArray(i11);
        }
        return charSequenceArr;
    }

    /* renamed from: r */
    public static boolean m23086r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: s */
    public static TypedArray m23087s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: t */
    public static TypedValue m23088t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (m23086r(xmlPullParser, str)) {
            return typedArray.peekValue(i10);
        }
        return null;
    }
}
