package p069e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e0/b.class
 */
/* renamed from: e0.b */
/* loaded from: combined.jar:classes1.jar:e0/b.class */
public final class C4563b {

    /* renamed from: a */
    public final Shader f27164a;

    /* renamed from: b */
    public final ColorStateList f27165b;

    /* renamed from: c */
    public int f27166c;

    public C4563b(Shader shader, ColorStateList colorStateList, int i10) {
        this.f27164a = shader;
        this.f27165b = colorStateList;
        this.f27166c = i10;
    }

    /* renamed from: a */
    public static C4563b m23011a(Resources resources, int i10, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m23014d(C4565d.m23043b(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m23013c(C4562a.m23004b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: b */
    public static C4563b m23012b(int i10) {
        return new C4563b(null, null, i10);
    }

    /* renamed from: c */
    public static C4563b m23013c(ColorStateList colorStateList) {
        return new C4563b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    public static C4563b m23014d(Shader shader) {
        return new C4563b(shader, null, 0);
    }

    /* renamed from: g */
    public static C4563b m23015g(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m23011a(resources, i10, theme);
        } catch (Exception e10) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
            return null;
        }
    }

    /* renamed from: e */
    public int m23016e() {
        return this.f27166c;
    }

    /* renamed from: f */
    public Shader m23017f() {
        return this.f27164a;
    }

    /* renamed from: h */
    public boolean m23018h() {
        return this.f27164a != null;
    }

    /* renamed from: i */
    public boolean m23019i() {
        ColorStateList colorStateList;
        return this.f27164a == null && (colorStateList = this.f27165b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean m23020j(int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        int colorForState;
        if (!m23019i() || (colorForState = (colorStateList = this.f27165b).getColorForState(iArr, colorStateList.getDefaultColor())) == this.f27166c) {
            z10 = false;
        } else {
            z10 = true;
            this.f27166c = colorForState;
        }
        return z10;
    }

    /* renamed from: k */
    public void m23021k(int i10) {
        this.f27166c = i10;
    }

    /* renamed from: l */
    public boolean m23022l() {
        return m23018h() || this.f27166c != 0;
    }
}
