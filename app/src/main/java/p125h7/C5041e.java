package p125h7;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p059d9.C4351a1;
import p059d9.C4392v;
import p099fc.AbstractC4834t;
import p125h7.C5038b;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h7/e.class
 */
/* renamed from: h7.e */
/* loaded from: combined.jar:classes2.jar:h7/e.class */
public final class C5041e {

    /* renamed from: a */
    public static final String[] f29106a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f29107b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f29108c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C5038b m25253a(String str) {
        try {
            return m25254b(str);
        } catch (NumberFormatException | XmlPullParserException | C7594k1 e10) {
            C4392v.m22275i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    public static C5038b m25254b(String str) {
        AbstractC4834t<C5038b.a> abstractC4834t;
        long j10;
        String str2;
        String str3;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!C4351a1.m21904f(newPullParser, "x:xmpmeta")) {
            throw C7594k1.m32822a("Couldn't find xmp metadata", null);
        }
        long j11 = -9223372036854775807L;
        AbstractC4834t<C5038b.a> m24539E = AbstractC4834t.m24539E();
        do {
            newPullParser.next();
            if (!C4351a1.m21904f(newPullParser, "rdf:Description")) {
                if (C4351a1.m21904f(newPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else {
                    abstractC4834t = m24539E;
                    j10 = j11;
                    if (C4351a1.m21904f(newPullParser, "GContainer:Directory")) {
                        str2 = "GContainer";
                        str3 = "GContainerItem";
                    }
                }
                abstractC4834t = m25258f(newPullParser, str2, str3);
                j10 = j11;
            } else {
                if (!m25256d(newPullParser)) {
                    return null;
                }
                j10 = m25257e(newPullParser);
                abstractC4834t = m25255c(newPullParser);
            }
            m24539E = abstractC4834t;
            j11 = j10;
        } while (!C4351a1.m21902d(newPullParser, "x:xmpmeta"));
        if (abstractC4834t.isEmpty()) {
            return null;
        }
        return new C5038b(j10, abstractC4834t);
    }

    /* renamed from: c */
    public static AbstractC4834t<C5038b.a> m25255c(XmlPullParser xmlPullParser) {
        for (String str : f29108c) {
            String m21899a = C4351a1.m21899a(xmlPullParser, str);
            if (m21899a != null) {
                return AbstractC4834t.m24541G(new C5038b.a("image/jpeg", "Primary", 0L, 0L), new C5038b.a("video/mp4", "MotionPhoto", Long.parseLong(m21899a), 0L));
            }
        }
        return AbstractC4834t.m24539E();
    }

    /* renamed from: d */
    public static boolean m25256d(XmlPullParser xmlPullParser) {
        for (String str : f29106a) {
            String m21899a = C4351a1.m21899a(xmlPullParser, str);
            if (m21899a != null) {
                return Integer.parseInt(m21899a) == 1;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static long m25257e(XmlPullParser xmlPullParser) {
        for (String str : f29107b) {
            String m21899a = C4351a1.m21899a(xmlPullParser, str);
            if (m21899a != null) {
                long parseLong = Long.parseLong(m21899a);
                if (parseLong == -1) {
                    parseLong = -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    public static AbstractC4834t<C5038b.a> m25258f(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC4834t.a m24548x = AbstractC4834t.m24548x();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, str3)) {
                String m21899a = C4351a1.m21899a(xmlPullParser, str2 + ":Mime");
                String m21899a2 = C4351a1.m21899a(xmlPullParser, str2 + ":Semantic");
                String m21899a3 = C4351a1.m21899a(xmlPullParser, str2 + ":Length");
                String m21899a4 = C4351a1.m21899a(xmlPullParser, str2 + ":Padding");
                if (m21899a == null || m21899a2 == null) {
                    return AbstractC4834t.m24539E();
                }
                m24548x.m24554d(new C5038b.a(m21899a, m21899a2, m21899a3 != null ? Long.parseLong(m21899a3) : 0L, m21899a4 != null ? Long.parseLong(m21899a4) : 0L));
            }
        } while (!C4351a1.m21902d(xmlPullParser, str4));
        return m24548x.m24555e();
    }
}
