package p059d9;

import org.xmlpull.v1.XmlPullParser;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/a1.class
 */
/* renamed from: d9.a1 */
/* loaded from: combined.jar:classes2.jar:d9/a1.class */
public final class C4351a1 {
    /* renamed from: a */
    public static String m21899a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m21900b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (m21906h(xmlPullParser.getAttributeName(i10)).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m21901c(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: d */
    public static boolean m21902d(XmlPullParser xmlPullParser, String str) {
        return m21901c(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: e */
    public static boolean m21903e(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: f */
    public static boolean m21904f(XmlPullParser xmlPullParser, String str) {
        return m21903e(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: g */
    public static boolean m21905g(XmlPullParser xmlPullParser, String str) {
        return m21903e(xmlPullParser) && m21906h(xmlPullParser.getName()).equals(str);
    }

    /* renamed from: h */
    public static String m21906h(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        return str;
    }
}
