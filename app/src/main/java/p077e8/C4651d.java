package p077e8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import ec.C4699b;
import ec.C4701d;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.simpleframework.xml.strategy.Name;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p027b9.C0843g0;
import p059d9.C4349a;
import p059d9.C4351a1;
import p059d9.C4392v;
import p059d9.C4393v0;
import p059d9.C4400z;
import p059d9.C4401z0;
import p077e8.AbstractC4658k;
import p099fc.AbstractC4834t;
import p099fc.C4799b0;
import p267p6.C7583h;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p321s7.C8542a;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/d.class
 */
/* renamed from: e8.d */
/* loaded from: combined.jar:classes2.jar:e8/d.class */
public class C4651d extends DefaultHandler implements C0843g0.a<C4650c> {

    /* renamed from: c */
    public static final Pattern f27424c = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: d */
    public static final Pattern f27425d = Pattern.compile("CC([1-4])=.*");

    /* renamed from: e */
    public static final Pattern f27426e = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: f */
    public static final int[] f27427f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: b */
    public final XmlPullParserFactory f27428b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:e8/d$a.class
     */
    /* renamed from: e8.d$a */
    /* loaded from: combined.jar:classes2.jar:e8/d$a.class */
    public static final class a {

        /* renamed from: a */
        public final C7629w0 f27429a;

        /* renamed from: b */
        public final AbstractC4834t<C4649b> f27430b;

        /* renamed from: c */
        public final AbstractC4658k f27431c;

        /* renamed from: d */
        public final String f27432d;

        /* renamed from: e */
        public final ArrayList<C9273n.b> f27433e;

        /* renamed from: f */
        public final ArrayList<C4652e> f27434f;

        /* renamed from: g */
        public final long f27435g;

        public a(C7629w0 c7629w0, List<C4649b> list, AbstractC4658k abstractC4658k, String str, ArrayList<C9273n.b> arrayList, ArrayList<C4652e> arrayList2, long j10) {
            this.f27429a = c7629w0;
            this.f27430b = AbstractC4834t.m24538A(list);
            this.f27431c = abstractC4658k;
            this.f27432d = str;
            this.f27433e = arrayList;
            this.f27434f = arrayList2;
            this.f27435g = j10;
        }
    }

    public C4651d() {
        try {
            this.f27428b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: B */
    public static int m23302B(List<C4652e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4652e c4652e = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(c4652e.f27436a) && (str = c4652e.f27437b) != null) {
                Matcher matcher = f27425d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C4392v.m22275i("MpdParser", "Unable to parse CEA-608 channel number from: " + c4652e.f27437b);
            }
        }
        return -1;
    }

    /* renamed from: C */
    public static int m23303C(List<C4652e> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4652e c4652e = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(c4652e.f27436a) && (str = c4652e.f27437b) != null) {
                Matcher matcher = f27426e.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C4392v.m22275i("MpdParser", "Unable to parse CEA-708 service block number from: " + c4652e.f27437b);
            }
        }
        return -1;
    }

    /* renamed from: F */
    public static long m23304F(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : C4401z0.m22332J0(attributeValue);
    }

    /* renamed from: G */
    public static C4652e m23305G(XmlPullParser xmlPullParser, String str) {
        String m23315m0 = m23315m0(xmlPullParser, "schemeIdUri", "");
        String m23315m02 = m23315m0(xmlPullParser, "value", null);
        String m23315m03 = m23315m0(xmlPullParser, Name.MARK, null);
        do {
            xmlPullParser.next();
        } while (!C4351a1.m21902d(xmlPullParser, str));
        return new C4652e(m23315m0, m23315m02, m23315m03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: H */
    public static int m23306H(XmlPullParser xmlPullParser) {
        boolean z10;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String m23638e = C4699b.m23638e(attributeValue);
        m23638e.hashCode();
        switch (m23638e.hashCode()) {
            case 1596796:
                if (m23638e.equals("4000")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case 2937391:
                if (m23638e.equals("a000")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case 3094035:
                if (m23638e.equals("f801")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case 3133436:
                if (m23638e.equals("fa01")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        switch (z10) {
        }
        return -1;
    }

    /* renamed from: I */
    public static long m23307I(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : C4401z0.m22334K0(attributeValue);
    }

    /* renamed from: J */
    public static String m23308J(List<C4652e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4652e c4652e = list.get(i10);
            String str = c4652e.f27436a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(c4652e.f27437b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(c4652e.f27437b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: N */
    public static float m23309N(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            f10 = Float.parseFloat(attributeValue);
        }
        return f10;
    }

    /* renamed from: O */
    public static float m23310O(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        float f11 = f10;
        if (attributeValue != null) {
            Matcher matcher = f27424c.matcher(attributeValue);
            f11 = f10;
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                boolean isEmpty = TextUtils.isEmpty(matcher.group(2));
                float f12 = parseInt;
                f11 = f12;
                if (!isEmpty) {
                    f11 = f12 / Integer.parseInt(r0);
                }
            }
        }
        return f11;
    }

    /* renamed from: Q */
    public static int m23311Q(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            i10 = Integer.parseInt(attributeValue);
        }
        return i10;
    }

    /* renamed from: S */
    public static long m23312S(List<C4652e> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4652e c4652e = list.get(i10);
            if (C4699b.m23634a("http://dashif.org/guidelines/last-segment-number", c4652e.f27436a)) {
                return Long.parseLong(c4652e.f27437b);
            }
        }
        return -1L;
    }

    /* renamed from: T */
    public static long m23313T(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            j10 = Long.parseLong(attributeValue);
        }
        return j10;
    }

    /* renamed from: V */
    public static int m23314V(XmlPullParser xmlPullParser) {
        int m23311Q = m23311Q(xmlPullParser, "value", -1);
        int i10 = -1;
        if (m23311Q >= 0) {
            int[] iArr = f27427f;
            i10 = -1;
            if (m23311Q < iArr.length) {
                i10 = iArr[m23311Q];
            }
        }
        return i10;
    }

    /* renamed from: m0 */
    public static String m23315m0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            attributeValue = str2;
        }
        return attributeValue;
    }

    /* renamed from: n0 */
    public static String m23316n0(XmlPullParser xmlPullParser, String str) {
        String str2;
        String str3 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m23322u(xmlPullParser);
                str2 = str3;
            }
            str3 = str2;
        } while (!C4351a1.m21902d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: p */
    public static int m23317p(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        C4349a.m21884g(i10 == i11);
        return i10;
    }

    /* renamed from: q */
    public static String m23318q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C4349a.m21884g(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    public static void m23319r(ArrayList<C9273n.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C9273n.b bVar = arrayList.get(size);
            if (!bVar.m39145j()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i10).m39143b(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i10++;
                }
            }
        }
    }

    /* renamed from: s */
    public static long m23320s(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: t */
    public static String m23321t(String str, String str2) {
        if (C4400z.m22308p(str)) {
            return C4400z.m22295c(str2);
        }
        if (C4400z.m22311s(str)) {
            return C4400z.m22307o(str2);
        }
        if (C4400z.m22310r(str)) {
            String str3 = str;
            if ("application/x-rawcc".equals(str)) {
                str3 = C4400z.m22302j(str2);
            }
            return str3;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String m22299g = C4400z.m22299g(str2);
        String str4 = m22299g;
        if ("text/vtt".equals(m22299g)) {
            str4 = "application/x-mp4-vtt";
        }
        return str4;
    }

    /* renamed from: u */
    public static void m23322u(XmlPullParser xmlPullParser) {
        if (C4351a1.m21903e(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (C4351a1.m21903e(xmlPullParser)) {
                    i10++;
                } else if (C4351a1.m21901c(xmlPullParser)) {
                    i10--;
                }
            }
        }
    }

    /* renamed from: A */
    public List<C4649b> m23323A(XmlPullParser xmlPullParser, List<C4649b> list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 1;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String m23316n0 = m23316n0(xmlPullParser, "BaseURL");
        String str = attributeValue3;
        if (attributeValue3 == null) {
            str = m23316n0;
        }
        if (C4393v0.m22278b(m23316n0)) {
            return C4799b0.m24302k(new C4649b(m23316n0, str, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4649b c4649b = list.get(i10);
            arrayList.add(new C4649b(C4393v0.m22280d(c4649b.f27407a, m23316n0), c4649b.f27408b, c4649b.f27409c, c4649b.f27410d));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015b  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<java.lang.String, p365v6.C9273n.b> m23324D(org.xmlpull.v1.XmlPullParser r8) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p077e8.C4651d.m23324D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: E */
    public int m23325E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        int i10 = -1;
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                i10 = 1;
            } else if ("video".equals(attributeValue)) {
                i10 = 2;
            } else if ("text".equals(attributeValue)) {
                i10 = 3;
            }
        }
        return i10;
    }

    /* renamed from: K */
    public Pair<Long, C8542a> m23326K(XmlPullParser xmlPullParser, String str, String str2, long j10, ByteArrayOutputStream byteArrayOutputStream) {
        long m23313T = m23313T(xmlPullParser, Name.MARK, 0L);
        long m23313T2 = m23313T(xmlPullParser, "duration", -9223372036854775807L);
        long m23313T3 = m23313T(xmlPullParser, "presentationTime", 0L);
        long m22346Q0 = C4401z0.m22346Q0(m23313T2, 1000L, j10);
        long m22346Q02 = C4401z0.m22346Q0(m23313T3, 1000000L, j10);
        String m23315m0 = m23315m0(xmlPullParser, "messageData", null);
        byte[] m23327L = m23327L(xmlPullParser, byteArrayOutputStream);
        if (m23315m0 != null) {
            m23327L = C4401z0.m22396l0(m23315m0);
        }
        return Pair.create(Long.valueOf(m22346Q02), m23341d(str, str2, m23313T, m22346Q0, m23327L));
    }

    /* renamed from: L */
    public byte[] m23327L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, C4701d.f27717c.name());
        while (true) {
            xmlPullParser.nextToken();
            if (C4351a1.m21902d(xmlPullParser, "Event")) {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    /* renamed from: M */
    public C4653f m23328M(XmlPullParser xmlPullParser) {
        String m23315m0 = m23315m0(xmlPullParser, "schemeIdUri", "");
        String m23315m02 = m23315m0(xmlPullParser, "value", "");
        long m23313T = m23313T(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "Event")) {
                arrayList.add(m23326K(xmlPullParser, m23315m0, m23315m02, m23313T, byteArrayOutputStream));
            } else {
                m23322u(xmlPullParser);
            }
        } while (!C4351a1.m21902d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        C8542a[] c8542aArr = new C8542a[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            c8542aArr[i10] = (C8542a) pair.second;
        }
        return m23343e(m23315m0, m23315m02, m23313T, jArr, c8542aArr);
    }

    /* renamed from: P */
    public C4656i m23329P(XmlPullParser xmlPullParser) {
        return m23334Y(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: R */
    public String m23330R(XmlPullParser xmlPullParser) {
        return m23316n0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0288  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p077e8.C4650c m23331U(org.xmlpull.v1.XmlPullParser r23, p077e8.C4649b r24) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p077e8.C4651d.m23331U(org.xmlpull.v1.XmlPullParser, e8.b):e8.c");
    }

    /* renamed from: W */
    public Pair<C4654g, Long> m23332W(XmlPullParser xmlPullParser, List<C4649b> list, long j10, long j11, long j12, long j13) {
        long m23369z;
        String attributeValue = xmlPullParser.getAttributeValue(null, Name.MARK);
        long m23307I = m23307I(xmlPullParser, "start", j10);
        long j14 = j12 != -9223372036854775807L ? j12 + m23307I : -9223372036854775807L;
        long m23307I2 = m23307I(xmlPullParser, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j15 = j11;
        long j16 = -9223372036854775807L;
        AbstractC4658k abstractC4658k = null;
        C4652e c4652e = null;
        boolean z10 = false;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "BaseURL")) {
                long j17 = j15;
                boolean z11 = z10;
                if (!z10) {
                    j17 = m23369z(xmlPullParser, j15);
                    z11 = true;
                }
                arrayList3.addAll(m23323A(xmlPullParser, list));
                j15 = j17;
                z10 = z11;
            } else if (C4351a1.m21904f(xmlPullParser, "AdaptationSet")) {
                arrayList.add(m23366w(xmlPullParser, !arrayList3.isEmpty() ? arrayList3 : list, abstractC4658k, m23307I2, j15, j16, j14, j13));
            } else if (C4351a1.m21904f(xmlPullParser, "EventStream")) {
                arrayList2.add(m23328M(xmlPullParser));
            } else if (C4351a1.m21904f(xmlPullParser, "SegmentBase")) {
                abstractC4658k = m23344e0(xmlPullParser, null);
            } else {
                if (C4351a1.m21904f(xmlPullParser, "SegmentList")) {
                    m23369z = m23369z(xmlPullParser, -9223372036854775807L);
                    abstractC4658k = m23346f0(xmlPullParser, null, j14, m23307I2, j15, m23369z, j13);
                } else if (C4351a1.m21904f(xmlPullParser, "SegmentTemplate")) {
                    m23369z = m23369z(xmlPullParser, -9223372036854775807L);
                    abstractC4658k = m23348g0(xmlPullParser, null, AbstractC4834t.m24539E(), j14, m23307I2, j15, m23369z, j13);
                } else if (C4351a1.m21904f(xmlPullParser, "AssetIdentifier")) {
                    c4652e = m23305G(xmlPullParser, "AssetIdentifier");
                } else {
                    m23322u(xmlPullParser);
                }
                j16 = m23369z;
            }
        } while (!C4351a1.m21902d(xmlPullParser, "Period"));
        return Pair.create(m23349h(attributeValue, m23307I, arrayList, arrayList2, c4652e), Long.valueOf(m23307I2));
    }

    /* renamed from: X */
    public C4655h m23333X(XmlPullParser xmlPullParser) {
        String str = null;
        String m23315m0 = m23315m0(xmlPullParser, "moreInformationURL", null);
        String m23315m02 = m23315m0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C4351a1.m21904f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C4351a1.m21904f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m23322u(xmlPullParser);
            }
        } while (!C4351a1.m21902d(xmlPullParser, "ProgramInformation"));
        return new C4655h(str, str2, str3, m23315m0, m23315m02);
    }

    /* renamed from: Y */
    public C4656i m23334Y(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = parseLong;
            if (split.length == 2) {
                j10 = parseLong;
                j11 = (Long.parseLong(split[1]) - parseLong) + 1;
                return m23351i(attributeValue, j10, j11);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return m23351i(attributeValue, j10, j11);
    }

    /* renamed from: Z */
    public a m23335Z(XmlPullParser xmlPullParser, List<C4649b> list, String str, String str2, int i10, int i11, float f10, int i12, int i13, String str3, List<C4652e> list2, List<C4652e> list3, List<C4652e> list4, List<C4652e> list5, AbstractC4658k abstractC4658k, long j10, long j11, long j12, long j13, long j14) {
        String attributeValue = xmlPullParser.getAttributeValue(null, Name.MARK);
        int m23311Q = m23311Q(xmlPullParser, "bandwidth", -1);
        String m23315m0 = m23315m0(xmlPullParser, "mimeType", str);
        String m23315m02 = m23315m0(xmlPullParser, "codecs", str2);
        int m23311Q2 = m23311Q(xmlPullParser, "width", i10);
        int m23311Q3 = m23311Q(xmlPullParser, "height", i11);
        float m23310O = m23310O(xmlPullParser, f10);
        int m23311Q4 = m23311Q(xmlPullParser, "audioSamplingRate", i13);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list4);
        ArrayList arrayList4 = new ArrayList(list5);
        ArrayList arrayList5 = new ArrayList();
        int i14 = i12;
        String str4 = null;
        boolean z10 = false;
        AbstractC4658k abstractC4658k2 = abstractC4658k;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "BaseURL")) {
                long j15 = j12;
                boolean z11 = z10;
                if (!z10) {
                    j15 = m23369z(xmlPullParser, j12);
                    z11 = true;
                }
                arrayList5.addAll(m23323A(xmlPullParser, list));
                z10 = z11;
                j12 = j15;
            } else if (C4351a1.m21904f(xmlPullParser, "AudioChannelConfiguration")) {
                i14 = m23368y(xmlPullParser);
            } else if (C4351a1.m21904f(xmlPullParser, "SegmentBase")) {
                abstractC4658k2 = m23344e0(xmlPullParser, (AbstractC4658k.e) abstractC4658k2);
            } else if (C4351a1.m21904f(xmlPullParser, "SegmentList")) {
                j13 = m23369z(xmlPullParser, j13);
                abstractC4658k2 = m23346f0(xmlPullParser, (AbstractC4658k.b) abstractC4658k2, j10, j11, j12, j13, j14);
            } else if (C4351a1.m21904f(xmlPullParser, "SegmentTemplate")) {
                j13 = m23369z(xmlPullParser, j13);
                abstractC4658k2 = m23348g0(xmlPullParser, (AbstractC4658k.c) abstractC4658k2, list5, j10, j11, j12, j13, j14);
            } else if (C4351a1.m21904f(xmlPullParser, "ContentProtection")) {
                Pair<String, C9273n.b> m23324D = m23324D(xmlPullParser);
                Object obj = m23324D.first;
                if (obj != null) {
                    str4 = (String) obj;
                }
                Object obj2 = m23324D.second;
                if (obj2 != null) {
                    arrayList.add((C9273n.b) obj2);
                }
            } else if (C4351a1.m21904f(xmlPullParser, "InbandEventStream")) {
                arrayList2.add(m23305G(xmlPullParser, "InbandEventStream"));
            } else if (C4351a1.m21904f(xmlPullParser, "EssentialProperty")) {
                arrayList3.add(m23305G(xmlPullParser, "EssentialProperty"));
            } else if (C4351a1.m21904f(xmlPullParser, "SupplementalProperty")) {
                arrayList4.add(m23305G(xmlPullParser, "SupplementalProperty"));
            } else {
                m23322u(xmlPullParser);
            }
        } while (!C4351a1.m21902d(xmlPullParser, "Representation"));
        C7629w0 m23345f = m23345f(attributeValue, m23315m0, m23311Q2, m23311Q3, m23310O, i14, m23311Q4, m23311Q, str3, list2, list3, m23315m02, arrayList3, arrayList4);
        if (abstractC4658k2 == null) {
            abstractC4658k2 = new AbstractC4658k.e();
        }
        boolean isEmpty = arrayList5.isEmpty();
        List<C4649b> list6 = arrayList5;
        if (isEmpty) {
            list6 = list;
        }
        return new a(m23345f, list6, abstractC4658k2, str4, arrayList, arrayList2, -1L);
    }

    /* renamed from: a0 */
    public int m23336a0(List<C4652e> list) {
        int i10;
        int m23362o0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= list.size()) {
                return i13;
            }
            C4652e c4652e = list.get(i11);
            if (C4699b.m23634a("urn:mpeg:dash:role:2011", c4652e.f27436a)) {
                m23362o0 = m23338b0(c4652e.f27437b);
            } else {
                i10 = i13;
                if (C4699b.m23634a("urn:tva:metadata:cs:AudioPurposeCS:2007", c4652e.f27436a)) {
                    m23362o0 = m23362o0(c4652e.f27437b);
                } else {
                    i11++;
                    i12 = i10;
                }
            }
            i10 = i13 | m23362o0;
            i11++;
            i12 = i10;
        }
    }

    /* renamed from: b */
    public final long m23337b(List<AbstractC4658k.d> list, long j10, long j11, int i10, long j12) {
        int m22397m = i10 >= 0 ? i10 + 1 : (int) C4401z0.m22397m(j12 - j10, j11);
        for (int i11 = 0; i11 < m22397m; i11++) {
            list.add(m23359m(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    /* renamed from: b0 */
    public int m23338b0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: c */
    public C4648a m23339c(int i10, int i11, List<AbstractC4657j> list, List<C4652e> list2, List<C4652e> list3, List<C4652e> list4) {
        return new C4648a(i10, i11, list, list2, list3, list4);
    }

    /* renamed from: c0 */
    public int m23340c0(List<C4652e> list) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= list.size()) {
                return i12;
            }
            int i13 = i12;
            if (C4699b.m23634a("http://dashif.org/guidelines/trickmode", list.get(i10).f27436a)) {
                i13 = i12 | 16384;
            }
            i10++;
            i11 = i13;
        }
    }

    /* renamed from: d */
    public C8542a m23341d(String str, String str2, long j10, long j11, byte[] bArr) {
        return new C8542a(str, str2, j11, j10, bArr);
    }

    /* renamed from: d0 */
    public int m23342d0(List<C4652e> list) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= list.size()) {
                return i12;
            }
            C4652e c4652e = list.get(i10);
            int i13 = i12;
            if (C4699b.m23634a("urn:mpeg:dash:role:2011", c4652e.f27436a)) {
                i13 = i12 | m23338b0(c4652e.f27437b);
            }
            i10++;
            i11 = i13;
        }
    }

    /* renamed from: e */
    public C4653f m23343e(String str, String str2, long j10, long[] jArr, C8542a[] c8542aArr) {
        return new C4653f(str, str2, j10, jArr, c8542aArr);
    }

    /* renamed from: e0 */
    public AbstractC4658k.e m23344e0(XmlPullParser xmlPullParser, AbstractC4658k.e eVar) {
        long j10;
        long j11;
        C4656i c4656i;
        long m23313T = m23313T(xmlPullParser, "timescale", eVar != null ? eVar.f27471b : 1L);
        long j12 = 0;
        long m23313T2 = m23313T(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f27472c : 0L);
        long j13 = eVar != null ? eVar.f27485d : 0L;
        if (eVar != null) {
            j12 = eVar.f27486e;
        }
        C4656i c4656i2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j10 = Long.parseLong(split[0]);
            j11 = (Long.parseLong(split[1]) - j10) + 1;
        } else {
            j10 = j13;
            j11 = j12;
        }
        if (eVar != null) {
            c4656i2 = eVar.f27470a;
        }
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "Initialization")) {
                c4656i = m23329P(xmlPullParser);
            } else {
                m23322u(xmlPullParser);
                c4656i = c4656i2;
            }
            c4656i2 = c4656i;
        } while (!C4351a1.m21902d(xmlPullParser, "SegmentBase"));
        return m23360n(c4656i, m23313T, m23313T2, j10, j11);
    }

    /* renamed from: f */
    public C7629w0 m23345f(String str, String str2, int i10, int i11, float f10, int i12, int i13, int i14, String str3, List<C4652e> list, List<C4652e> list2, String str4, List<C4652e> list3, List<C4652e> list4) {
        String m23321t = m23321t(str2, str4);
        String str5 = str4;
        String str6 = m23321t;
        if ("audio/eac3".equals(m23321t)) {
            String m23308J = m23308J(list4);
            str5 = str4;
            str6 = m23308J;
            if ("audio/eac3-joc".equals(m23308J)) {
                str5 = "ec+3";
                str6 = m23308J;
            }
        }
        int m23356k0 = m23356k0(list);
        int m23342d0 = m23342d0(list);
        int m23336a0 = m23336a0(list2);
        C7629w0.b m33211V = new C7629w0.b().m33208S(str).m33200K(str2).m33220e0(str6).m33198I(str5).m33215Z(i14).m33222g0(m23356k0).m33218c0(m23342d0 | m23336a0 | m23340c0(list3) | m23340c0(list4)).m33211V(str3);
        if (C4400z.m22311s(str6)) {
            m33211V.m33225j0(i10).m33206Q(i11).m33205P(f10);
        } else if (C4400z.m22308p(str6)) {
            m33211V.m33197H(i12).m33221f0(i13);
        } else if (C4400z.m22310r(str6)) {
            int i15 = -1;
            if ("application/cea-608".equals(str6)) {
                i15 = m23302B(list2);
            } else if ("application/cea-708".equals(str6)) {
                i15 = m23303C(list2);
            }
            m33211V.m33195F(i15);
        }
        return m33211V.m33194E();
    }

    /* renamed from: f0 */
    public AbstractC4658k.b m23346f0(XmlPullParser xmlPullParser, AbstractC4658k.b bVar, long j10, long j11, long j12, long j13, long j14) {
        C4656i c4656i;
        ArrayList arrayList;
        List<AbstractC4658k.d> list;
        long m23313T = m23313T(xmlPullParser, "timescale", bVar != null ? bVar.f27471b : 1L);
        long m23313T2 = m23313T(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f27472c : 0L);
        long m23313T3 = m23313T(xmlPullParser, "duration", bVar != null ? bVar.f27474e : -9223372036854775807L);
        long j15 = 1;
        if (bVar != null) {
            j15 = bVar.f27473d;
        }
        long m23313T4 = m23313T(xmlPullParser, "startNumber", j15);
        long m23320s = m23320s(j12, j13);
        List<AbstractC4658k.d> list2 = null;
        ArrayList arrayList2 = null;
        C4656i c4656i2 = null;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "Initialization")) {
                c4656i = m23329P(xmlPullParser);
                list = list2;
                arrayList = arrayList2;
            } else if (C4351a1.m21904f(xmlPullParser, "SegmentTimeline")) {
                list = m23350h0(xmlPullParser, m23313T, j11);
                arrayList = arrayList2;
                c4656i = c4656i2;
            } else if (C4351a1.m21904f(xmlPullParser, "SegmentURL")) {
                arrayList = arrayList2;
                if (arrayList2 == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m23352i0(xmlPullParser));
                list = list2;
                c4656i = c4656i2;
            } else {
                m23322u(xmlPullParser);
                c4656i = c4656i2;
                arrayList = arrayList2;
                list = list2;
            }
            list2 = list;
            arrayList2 = arrayList;
            c4656i2 = c4656i;
        } while (!C4351a1.m21902d(xmlPullParser, "SegmentList"));
        List<AbstractC4658k.d> list3 = list;
        List<C4656i> list4 = arrayList;
        C4656i c4656i3 = c4656i;
        if (bVar != null) {
            if (c4656i == null) {
                c4656i = bVar.f27470a;
            }
            if (list == null) {
                list = bVar.f27475f;
            }
            if (arrayList != null) {
                list3 = list;
                list4 = arrayList;
                c4656i3 = c4656i;
            } else {
                list4 = bVar.f27479j;
                c4656i3 = c4656i;
                list3 = list;
            }
        }
        return m23355k(c4656i3, m23313T, m23313T2, m23313T4, m23313T3, list3, m23320s, list4, j14, j10);
    }

    /* renamed from: g */
    public C4650c m23347g(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, C4655h c4655h, C4662o c4662o, C4659l c4659l, Uri uri, List<C4654g> list) {
        return new C4650c(j10, j11, j12, z10, j13, j14, j15, j16, c4655h, c4662o, c4659l, uri, list);
    }

    /* renamed from: g0 */
    public AbstractC4658k.c m23348g0(XmlPullParser xmlPullParser, AbstractC4658k.c cVar, List<C4652e> list, long j10, long j11, long j12, long j13, long j14) {
        long m23313T = m23313T(xmlPullParser, "timescale", cVar != null ? cVar.f27471b : 1L);
        long m23313T2 = m23313T(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f27472c : 0L);
        long m23313T3 = m23313T(xmlPullParser, "duration", cVar != null ? cVar.f27474e : -9223372036854775807L);
        long j15 = 1;
        if (cVar != null) {
            j15 = cVar.f27473d;
        }
        long m23313T4 = m23313T(xmlPullParser, "startNumber", j15);
        long m23312S = m23312S(list);
        long m23320s = m23320s(j12, j13);
        List<AbstractC4658k.d> list2 = null;
        C4661n m23363p0 = m23363p0(xmlPullParser, "media", cVar != null ? cVar.f27481k : null);
        C4661n m23363p02 = m23363p0(xmlPullParser, "initialization", cVar != null ? cVar.f27480j : null);
        C4656i c4656i = null;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "Initialization")) {
                c4656i = m23329P(xmlPullParser);
            } else if (C4351a1.m21904f(xmlPullParser, "SegmentTimeline")) {
                list2 = m23350h0(xmlPullParser, m23313T, j11);
            } else {
                m23322u(xmlPullParser);
            }
        } while (!C4351a1.m21902d(xmlPullParser, "SegmentTemplate"));
        List<AbstractC4658k.d> list3 = list2;
        C4656i c4656i2 = c4656i;
        if (cVar != null) {
            if (c4656i == null) {
                c4656i = cVar.f27470a;
            }
            if (list2 != null) {
                list3 = list2;
                c4656i2 = c4656i;
            } else {
                list3 = cVar.f27475f;
                c4656i2 = c4656i;
            }
        }
        return m23357l(c4656i2, m23313T, m23313T2, m23313T4, m23312S, m23313T3, list3, m23320s, m23363p02, m23363p0, j14, j10);
    }

    /* renamed from: h */
    public C4654g m23349h(String str, long j10, List<C4648a> list, List<C4653f> list2, C4652e c4652e) {
        return new C4654g(str, j10, list, list2, c4652e);
    }

    /* renamed from: h0 */
    public List<AbstractC4658k.d> m23350h0(XmlPullParser xmlPullParser, long j10, long j11) {
        int i10;
        long j12;
        long j13;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        long j14 = 0;
        long j15 = -9223372036854775807L;
        boolean z11 = false;
        int i11 = 0;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "S")) {
                long m23313T = m23313T(xmlPullParser, "t", -9223372036854775807L);
                long j16 = j14;
                if (z11) {
                    j16 = m23337b(arrayList, j14, j15, i11, m23313T);
                }
                long j17 = m23313T != -9223372036854775807L ? m23313T : j16;
                j12 = m23313T(xmlPullParser, "d", -9223372036854775807L);
                i10 = m23311Q(xmlPullParser, "r", 0);
                z10 = true;
                j13 = j17;
            } else {
                m23322u(xmlPullParser);
                i10 = i11;
                j12 = j15;
                j13 = j14;
                z10 = z11;
            }
            z11 = z10;
            j14 = j13;
            j15 = j12;
            i11 = i10;
        } while (!C4351a1.m21902d(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            m23337b(arrayList, j13, j12, i10, C4401z0.m22346Q0(j11, j10, 1000L));
        }
        return arrayList;
    }

    /* renamed from: i */
    public C4656i m23351i(String str, long j10, long j11) {
        return new C4656i(str, j10, j11);
    }

    /* renamed from: i0 */
    public C4656i m23352i0(XmlPullParser xmlPullParser) {
        return m23334Y(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: j */
    public AbstractC4657j m23353j(a aVar, String str, String str2, ArrayList<C9273n.b> arrayList, ArrayList<C4652e> arrayList2) {
        C7629w0.b m33157b = aVar.f27429a.m33157b();
        if (str != null) {
            m33157b.m33210U(str);
        }
        String str3 = aVar.f27432d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C9273n.b> arrayList3 = aVar.f27433e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m23319r(arrayList3);
            m33157b.m33201L(new C9273n(str2, arrayList3));
        }
        ArrayList<C4652e> arrayList4 = aVar.f27434f;
        arrayList4.addAll(arrayList2);
        return AbstractC4657j.m23375o(aVar.f27435g, m33157b.m33194E(), aVar.f27430b, aVar.f27431c, arrayList4);
    }

    /* renamed from: j0 */
    public int m23354j0(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("forced_subtitle")) {
            return 2;
        }
        return !str.equals("main") ? 0 : 1;
    }

    /* renamed from: k */
    public AbstractC4658k.b m23355k(C4656i c4656i, long j10, long j11, long j12, long j13, List<AbstractC4658k.d> list, long j14, List<C4656i> list2, long j15, long j16) {
        return new AbstractC4658k.b(c4656i, j10, j11, j12, j13, list, j14, list2, C7583h.m32760d(j15), C7583h.m32760d(j16));
    }

    /* renamed from: k0 */
    public int m23356k0(List<C4652e> list) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= list.size()) {
                return i12;
            }
            C4652e c4652e = list.get(i10);
            int i13 = i12;
            if (C4699b.m23634a("urn:mpeg:dash:role:2011", c4652e.f27436a)) {
                i13 = i12 | m23354j0(c4652e.f27437b);
            }
            i10++;
            i11 = i13;
        }
    }

    /* renamed from: l */
    public AbstractC4658k.c m23357l(C4656i c4656i, long j10, long j11, long j12, long j13, long j14, List<AbstractC4658k.d> list, long j15, C4661n c4661n, C4661n c4661n2, long j16, long j17) {
        return new AbstractC4658k.c(c4656i, j10, j11, j12, j13, j14, list, j15, c4661n, c4661n2, C7583h.m32760d(j16), C7583h.m32760d(j17));
    }

    /* renamed from: l0 */
    public C4659l m23358l0(XmlPullParser xmlPullParser) {
        long j10;
        long j11;
        long j12;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        long j15 = -9223372036854775807L;
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "Latency")) {
                j10 = m23313T(xmlPullParser, "target", -9223372036854775807L);
                j11 = m23313T(xmlPullParser, "min", -9223372036854775807L);
                j12 = m23313T(xmlPullParser, "max", -9223372036854775807L);
            } else {
                j10 = j13;
                j11 = j14;
                j12 = j15;
                if (C4351a1.m21904f(xmlPullParser, "PlaybackRate")) {
                    f10 = m23309N(xmlPullParser, "min", -3.4028235E38f);
                    f11 = m23309N(xmlPullParser, "max", -3.4028235E38f);
                    j12 = j15;
                    j11 = j14;
                    j10 = j13;
                }
            }
            if (C4351a1.m21902d(xmlPullParser, "ServiceDescription")) {
                return new C4659l(j10, j11, j12, f10, f11);
            }
            j13 = j10;
            j15 = j12;
            j14 = j11;
        }
    }

    /* renamed from: m */
    public AbstractC4658k.d m23359m(long j10, long j11) {
        return new AbstractC4658k.d(j10, j11);
    }

    /* renamed from: n */
    public AbstractC4658k.e m23360n(C4656i c4656i, long j10, long j11, long j12, long j13) {
        return new AbstractC4658k.e(c4656i, j10, j11, j12, j13);
    }

    /* renamed from: o */
    public C4662o m23361o(String str, String str2) {
        return new C4662o(str, str2);
    }

    /* renamed from: o0 */
    public int m23362o0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* renamed from: p0 */
    public C4661n m23363p0(XmlPullParser xmlPullParser, String str, C4661n c4661n) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? C4661n.m23394b(attributeValue) : c4661n;
    }

    /* renamed from: q0 */
    public C4662o m23364q0(XmlPullParser xmlPullParser) {
        return m23361o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // p027b9.C0843g0.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C4650c mo5362a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f27428b.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m23331U(newPullParser, new C4649b(uri.toString()));
            }
            throw C7594k1.m32824c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw C7594k1.m32824c(null, e10);
        }
    }

    /* renamed from: w */
    public C4648a m23366w(XmlPullParser xmlPullParser, List<C4649b> list, AbstractC4658k abstractC4658k, long j10, long j11, long j12, long j13, long j14) {
        String str;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int m23311Q = m23311Q(xmlPullParser2, Name.MARK, -1);
        int m23325E = m23325E(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int m23311Q2 = m23311Q(xmlPullParser2, "width", -1);
        int m23311Q3 = m23311Q(xmlPullParser2, "height", -1);
        float m23310O = m23310O(xmlPullParser2, -1.0f);
        int m23311Q4 = m23311Q(xmlPullParser2, "audioSamplingRate", -1);
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList<C9273n.b> arrayList = new ArrayList<>();
        ArrayList<C4652e> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        AbstractC4658k abstractC4658k2 = abstractC4658k;
        String str2 = attributeValue3;
        String str3 = null;
        int i10 = -1;
        boolean z10 = false;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser2, "BaseURL")) {
                long j15 = j11;
                boolean z11 = z10;
                if (!z10) {
                    j15 = m23369z(xmlPullParser2, j11);
                    z11 = true;
                }
                arrayList8.addAll(m23323A(xmlPullParser, list));
                z10 = z11;
                j11 = j15;
            } else if (C4351a1.m21904f(xmlPullParser2, "ContentProtection")) {
                Pair<String, C9273n.b> m23324D = m23324D(xmlPullParser);
                Object obj = m23324D.first;
                if (obj != null) {
                    str3 = (String) obj;
                }
                Object obj2 = m23324D.second;
                if (obj2 != null) {
                    arrayList.add((C9273n.b) obj2);
                }
            } else if (C4351a1.m21904f(xmlPullParser2, "ContentComponent")) {
                str2 = m23318q(str2, xmlPullParser2.getAttributeValue(null, "lang"));
                m23325E = m23317p(m23325E, m23325E(xmlPullParser));
            } else {
                if (C4351a1.m21904f(xmlPullParser2, "Role")) {
                    arrayList4.add(m23305G(xmlPullParser2, "Role"));
                } else if (C4351a1.m21904f(xmlPullParser2, "AudioChannelConfiguration")) {
                    i10 = m23368y(xmlPullParser);
                } else if (C4351a1.m21904f(xmlPullParser2, "Accessibility")) {
                    arrayList3.add(m23305G(xmlPullParser2, "Accessibility"));
                } else if (C4351a1.m21904f(xmlPullParser2, "EssentialProperty")) {
                    arrayList5.add(m23305G(xmlPullParser2, "EssentialProperty"));
                } else if (C4351a1.m21904f(xmlPullParser2, "SupplementalProperty")) {
                    arrayList6.add(m23305G(xmlPullParser2, "SupplementalProperty"));
                } else if (C4351a1.m21904f(xmlPullParser2, "Representation")) {
                    a m23335Z = m23335Z(xmlPullParser, !arrayList8.isEmpty() ? arrayList8 : list, attributeValue, attributeValue2, m23311Q2, m23311Q3, m23310O, i10, m23311Q4, str2, arrayList4, arrayList3, arrayList5, arrayList6, abstractC4658k2, j13, j10, j11, j12, j14);
                    m23325E = m23317p(m23325E, C4400z.m22304l(m23335Z.f27429a.f37086m));
                    arrayList7.add(m23335Z);
                    xmlPullParser2 = xmlPullParser;
                } else {
                    long j16 = j11;
                    if (C4351a1.m21904f(xmlPullParser, "SegmentBase")) {
                        abstractC4658k2 = m23344e0(xmlPullParser, (AbstractC4658k.e) abstractC4658k2);
                        xmlPullParser2 = xmlPullParser;
                        j11 = j16;
                    } else {
                        if (C4351a1.m21904f(xmlPullParser, "SegmentList")) {
                            j12 = m23369z(xmlPullParser, j12);
                            abstractC4658k2 = m23346f0(xmlPullParser, (AbstractC4658k.b) abstractC4658k2, j13, j10, j16, j12, j14);
                        } else if (C4351a1.m21904f(xmlPullParser, "SegmentTemplate")) {
                            j12 = m23369z(xmlPullParser, j12);
                            abstractC4658k2 = m23348g0(xmlPullParser, (AbstractC4658k.c) abstractC4658k2, arrayList6, j13, j10, j16, j12, j14);
                        } else {
                            if (C4351a1.m21904f(xmlPullParser, "InbandEventStream")) {
                                arrayList2.add(m23305G(xmlPullParser, "InbandEventStream"));
                                xmlPullParser2 = xmlPullParser;
                                str = attributeValue4;
                            } else if (C4351a1.m21904f(xmlPullParser, "Label")) {
                                str = m23330R(xmlPullParser);
                                xmlPullParser2 = xmlPullParser;
                            } else {
                                xmlPullParser2 = xmlPullParser;
                                str = attributeValue4;
                                if (C4351a1.m21903e(xmlPullParser)) {
                                    m23367x(xmlPullParser);
                                    str = attributeValue4;
                                    xmlPullParser2 = xmlPullParser;
                                }
                            }
                            attributeValue4 = str;
                        }
                        xmlPullParser2 = xmlPullParser;
                    }
                }
                str = attributeValue4;
                attributeValue4 = str;
            }
        } while (!C4351a1.m21902d(xmlPullParser2, "AdaptationSet"));
        List<AbstractC4657j> arrayList9 = new ArrayList<>(arrayList7.size());
        for (int i11 = 0; i11 < arrayList7.size(); i11++) {
            arrayList9.add(m23353j((a) arrayList7.get(i11), attributeValue4, str3, arrayList, arrayList2));
        }
        return m23339c(m23311Q, m23325E, arrayList9, arrayList3, arrayList5, arrayList6);
    }

    /* renamed from: x */
    public void m23367x(XmlPullParser xmlPullParser) {
        m23322u(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: y */
    public int m23368y(XmlPullParser xmlPullParser) {
        boolean z10;
        int m23311Q;
        String m23315m0 = m23315m0(xmlPullParser, "schemeIdUri", null);
        m23315m0.hashCode();
        switch (m23315m0.hashCode()) {
            case -1352850286:
                if (m23315m0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    z10 = false;
                    break;
                }
                z10 = -1;
                break;
            case -1138141449:
                if (m23315m0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    z10 = true;
                    break;
                }
                z10 = -1;
                break;
            case -986633423:
                if (m23315m0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    z10 = 2;
                    break;
                }
                z10 = -1;
                break;
            case 2036691300:
                if (m23315m0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    z10 = 3;
                    break;
                }
                z10 = -1;
                break;
            default:
                z10 = -1;
                break;
        }
        switch (z10) {
            case false:
                m23311Q = m23311Q(xmlPullParser, "value", -1);
                break;
            case true:
            case true:
                m23311Q = m23306H(xmlPullParser);
                break;
            case true:
                m23311Q = m23314V(xmlPullParser);
                break;
            default:
                m23311Q = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!C4351a1.m21902d(xmlPullParser, "AudioChannelConfiguration"));
        return m23311Q;
    }

    /* renamed from: z */
    public long m23369z(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }
}
