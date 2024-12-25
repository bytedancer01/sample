package p367v8;

import android.text.Layout;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import ec.C4699b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p059d9.C4349a;
import p059d9.C4351a1;
import p059d9.C4392v;
import p059d9.C4401z0;
import p243o8.AbstractC6921c;
import p243o8.C6925g;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v8/c.class
 */
/* renamed from: v8.c */
/* loaded from: combined.jar:classes2.jar:v8/c.class */
public final class C9309c extends AbstractC6921c {

    /* renamed from: p */
    public static final Pattern f42450p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    public static final Pattern f42451q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    public static final Pattern f42452r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    public static final Pattern f42453s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    public static final Pattern f42454t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u */
    public static final Pattern f42455u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v */
    public static final Pattern f42456v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w */
    public static final b f42457w = new b(30.0f, 1, 1);

    /* renamed from: x */
    public static final a f42458x = new a(32, 15);

    /* renamed from: o */
    public final XmlPullParserFactory f42459o;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v8/c$a.class
     */
    /* renamed from: v8.c$a */
    /* loaded from: combined.jar:classes2.jar:v8/c$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f42460a;

        /* renamed from: b */
        public final int f42461b;

        public a(int i10, int i11) {
            this.f42460a = i10;
            this.f42461b = i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v8/c$b.class
     */
    /* renamed from: v8.c$b */
    /* loaded from: combined.jar:classes2.jar:v8/c$b.class */
    public static final class b {

        /* renamed from: a */
        public final float f42462a;

        /* renamed from: b */
        public final int f42463b;

        /* renamed from: c */
        public final int f42464c;

        public b(float f10, int i10, int i11) {
            this.f42462a = f10;
            this.f42463b = i10;
            this.f42464c = i11;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:v8/c$c.class
     */
    /* renamed from: v8.c$c */
    /* loaded from: combined.jar:classes2.jar:v8/c$c.class */
    public static final class c {

        /* renamed from: a */
        public final int f42465a;

        /* renamed from: b */
        public final int f42466b;

        public c(int i10, int i11) {
            this.f42465a = i10;
            this.f42466b = i11;
        }
    }

    public C9309c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f42459o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* renamed from: B */
    public static C9313g m39239B(C9313g c9313g) {
        C9313g c9313g2 = c9313g;
        if (c9313g == null) {
            c9313g2 = new C9313g();
        }
        return c9313g2;
    }

    /* renamed from: C */
    public static boolean m39240C(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals(AppSyncMutationsSqlHelper.COLUMN_REGION) || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* renamed from: D */
    public static Layout.Alignment m39241D(String str) {
        String m23638e = C4699b.m23638e(str);
        m23638e.hashCode();
        switch (m23638e) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: E */
    public static a m39242E(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f42456v.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt((String) C4349a.m21882e(matcher.group(1)));
                int parseInt2 = Integer.parseInt((String) C4349a.m21882e(matcher.group(2)));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new a(parseInt, parseInt2);
                }
                throw new C6925g("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException e10) {
                sb2 = new StringBuilder();
            }
        } else {
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed cell resolution: ");
        sb2.append(attributeValue);
        C4392v.m22275i("TtmlDecoder", sb2.toString());
        return aVar;
    }

    /* renamed from: F */
    public static void m39243F(String str, C9313g c9313g) {
        Matcher matcher;
        String str2;
        String[] m22356V0 = C4401z0.m22356V0(str, "\\s+");
        if (m22356V0.length == 1) {
            matcher = f42452r.matcher(str);
        } else {
            if (m22356V0.length != 2) {
                throw new C6925g("Invalid number of entries for fontSize: " + m22356V0.length + InstructionFileId.DOT);
            }
            matcher = f42452r.matcher(m22356V0[1]);
            C4392v.m22275i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C6925g("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) C4349a.m21882e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                c9313g.m39312z(3);
                break;
            case "em":
                c9313g.m39312z(2);
                break;
            case "px":
                c9313g.m39312z(1);
                break;
            default:
                throw new C6925g("Invalid unit for fontSize: '" + str2 + "'.");
        }
        c9313g.m39311y(Float.parseFloat((String) C4349a.m21882e(matcher.group(1))));
    }

    /* renamed from: G */
    public static b m39244G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (C4401z0.m22356V0(attributeValue2, " ").length != 2) {
                throw new C6925g("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r0[0]) / Integer.parseInt(r0[1]);
        }
        b bVar = f42457w;
        int i10 = bVar.f42463b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f42464c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    /* renamed from: H */
    public static Map<String, C9313g> m39245H(XmlPullParser xmlPullParser, Map<String, C9313g> map, a aVar, c cVar, Map<String, C9311e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "style")) {
                String m21899a = C4351a1.m21899a(xmlPullParser, "style");
                C9313g m39250M = m39250M(xmlPullParser, new C9313g());
                if (m21899a != null) {
                    for (String str : m39251N(m21899a)) {
                        m39250M.m39287a(map.get(str));
                    }
                }
                String m39293g = m39250M.m39293g();
                if (m39293g != null) {
                    map.put(m39293g, m39250M);
                }
            } else if (C4351a1.m21904f(xmlPullParser, AppSyncMutationsSqlHelper.COLUMN_REGION)) {
                C9311e m39248K = m39248K(xmlPullParser, aVar, cVar);
                if (m39248K != null) {
                    map2.put(m39248K.f42480a, m39248K);
                }
            } else if (C4351a1.m21904f(xmlPullParser, "metadata")) {
                m39246I(xmlPullParser, map3);
            }
        } while (!C4351a1.m21902d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: I */
    public static void m39246I(XmlPullParser xmlPullParser, Map<String, String> map) {
        String m21899a;
        do {
            xmlPullParser.next();
            if (C4351a1.m21904f(xmlPullParser, "image") && (m21899a = C4351a1.m21899a(xmlPullParser, Name.MARK)) != null) {
                map.put(m21899a, xmlPullParser.nextText());
            }
        } while (!C4351a1.m21902d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02d9, code lost:
    
        if (r18 != (-9223372036854775807L)) goto L71;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p367v8.C9310d m39247J(org.xmlpull.v1.XmlPullParser r11, p367v8.C9310d r12, java.util.Map<java.lang.String, p367v8.C9311e> r13, p367v8.C9309c.b r14) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p367v8.C9309c.m39247J(org.xmlpull.v1.XmlPullParser, v8.d, java.util.Map, v8.c$b):v8.d");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0287, code lost:
    
        if (r0.equals("tb") == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0222  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p367v8.C9311e m39248K(org.xmlpull.v1.XmlPullParser r13, p367v8.C9309c.a r14, p367v8.C9309c.c r15) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p367v8.C9309c.m39248K(org.xmlpull.v1.XmlPullParser, v8.c$a, v8.c$c):v8.e");
    }

    /* renamed from: L */
    public static float m39249L(String str) {
        Matcher matcher = f42453s.matcher(str);
        if (!matcher.matches()) {
            C4392v.m22275i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C4349a.m21882e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            C4392v.m22276j("TtmlDecoder", "Failed to parse shear: " + str, e10);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03bf, code lost:
    
        if (r0.equals("text") == false) goto L106;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p367v8.C9313g m39250M(org.xmlpull.v1.XmlPullParser r4, p367v8.C9313g r5) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p367v8.C9309c.m39250M(org.xmlpull.v1.XmlPullParser, v8.g):v8.g");
    }

    /* renamed from: N */
    public static String[] m39251N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C4401z0.m22356V0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        if (r0.equals("ms") == false) goto L21;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long m39252O(java.lang.String r5, p367v8.C9309c.b r6) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p367v8.C9309c.m39252O(java.lang.String, v8.c$b):long");
    }

    /* renamed from: P */
    public static c m39253P(XmlPullParser xmlPullParser) {
        StringBuilder sb2;
        String str;
        String m21899a = C4351a1.m21899a(xmlPullParser, "extent");
        if (m21899a == null) {
            return null;
        }
        Matcher matcher = f42455u.matcher(m21899a);
        if (matcher.matches()) {
            try {
                return new c(Integer.parseInt((String) C4349a.m21882e(matcher.group(1))), Integer.parseInt((String) C4349a.m21882e(matcher.group(2))));
            } catch (NumberFormatException e10) {
                sb2 = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb2 = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb2.append(str);
        sb2.append(m21899a);
        C4392v.m22275i("TtmlDecoder", sb2.toString());
        return null;
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        c cVar;
        b bVar;
        a aVar;
        int i11;
        C9314h c9314h;
        try {
            XmlPullParser newPullParser = this.f42459o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C9311e(""));
            c cVar2 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            b bVar2 = f42457w;
            a aVar2 = f42458x;
            C9314h c9314h2 = null;
            int i12 = 0;
            while (eventType != 1) {
                C9310d c9310d = (C9310d) arrayDeque.peek();
                if (i12 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m39244G(newPullParser);
                            aVar2 = m39242E(newPullParser, f42458x);
                            cVar2 = m39253P(newPullParser);
                        }
                        if (!m39240C(name)) {
                            C4392v.m22273g("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11 = i12 + 1;
                        } else if ("head".equals(name)) {
                            m39245H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            i11 = i12;
                        } else {
                            try {
                                C9310d m39247J = m39247J(newPullParser, c9310d, hashMap2, bVar2);
                                arrayDeque.push(m39247J);
                                i11 = i12;
                                if (c9310d != null) {
                                    c9310d.m39258a(m39247J);
                                    i11 = i12;
                                }
                            } catch (C6925g e10) {
                                C4392v.m22276j("TtmlDecoder", "Suppressing parser error", e10);
                                i11 = i12 + 1;
                            }
                        }
                        cVar = cVar2;
                        bVar = bVar2;
                        aVar = aVar2;
                        c9314h = c9314h2;
                    } else if (eventType == 4) {
                        ((C9310d) C4349a.m21882e(c9310d)).m39258a(C9310d.m39255d(newPullParser.getText()));
                        cVar = cVar2;
                        bVar = bVar2;
                        aVar = aVar2;
                        i11 = i12;
                        c9314h = c9314h2;
                    } else {
                        cVar = cVar2;
                        bVar = bVar2;
                        aVar = aVar2;
                        i11 = i12;
                        c9314h = c9314h2;
                        if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                c9314h2 = new C9314h((C9310d) C4349a.m21882e((C9310d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                            }
                            arrayDeque.pop();
                            cVar = cVar2;
                            bVar = bVar2;
                            aVar = aVar2;
                            i11 = i12;
                            c9314h = c9314h2;
                        }
                    }
                } else if (eventType == 2) {
                    i11 = i12 + 1;
                    cVar = cVar2;
                    bVar = bVar2;
                    aVar = aVar2;
                    c9314h = c9314h2;
                } else {
                    cVar = cVar2;
                    bVar = bVar2;
                    aVar = aVar2;
                    i11 = i12;
                    c9314h = c9314h2;
                    if (eventType == 3) {
                        i11 = i12 - 1;
                        c9314h = c9314h2;
                        aVar = aVar2;
                        bVar = bVar2;
                        cVar = cVar2;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                cVar2 = cVar;
                bVar2 = bVar;
                aVar2 = aVar;
                i12 = i11;
                c9314h2 = c9314h;
            }
            if (c9314h2 != null) {
                return c9314h2;
            }
            throw new C6925g("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new C6925g("Unable to decode source", e12);
        }
    }
}
