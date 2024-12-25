package p069e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e0/a.class
 */
/* renamed from: e0.a */
/* loaded from: combined.jar:classes1.jar:e0/a.class */
public final class C4562a {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f27163a = new ThreadLocal<>();

    /* renamed from: a */
    public static ColorStateList m23003a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m23004b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    public static ColorStateList m23004b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m23007e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    public static TypedValue m23005c() {
        ThreadLocal<TypedValue> threadLocal = f27163a;
        TypedValue typedValue = threadLocal.get();
        TypedValue typedValue2 = typedValue;
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        return typedValue2;
    }

    /* renamed from: d */
    public static ColorStateList m23006d(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m23003a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0100, code lost:
    
        if (r0.hasValue(r13) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0181 A[EDGE_INSN: B:49:0x0181->B:50:0x0181 BREAK  A[LOOP:1: B:31:0x011f->B:44:0x0177], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Type inference failed for: r0v15, types: [int[], int[][], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int[][]] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m23007e(android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p069e0.C4562a.m23007e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    public static boolean m23008f(Resources resources, int i10) {
        TypedValue m23005c = m23005c();
        boolean z10 = true;
        resources.getValue(i10, m23005c, true);
        int i11 = m23005c.type;
        if (i11 < 28 || i11 > 31) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: g */
    public static int m23009g(int i10, float f10) {
        return (i10 & 16777215) | (Math.round(Color.alpha(i10) * f10) << 24);
    }

    /* renamed from: h */
    public static TypedArray m23010h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
