package p215m8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p027b9.C0843g0;
import p059d9.C4349a;
import p059d9.C4356d;
import p059d9.C4401z0;
import p182k7.C5521l;
import p182k7.C5525p;
import p215m8.C5933a;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p301r6.C7966a;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m8/b.class
 */
/* renamed from: m8.b */
/* loaded from: combined.jar:classes2.jar:m8/b.class */
public class C5934b implements C0843g0.a<C5933a> {

    /* renamed from: b */
    public final XmlPullParserFactory f33349b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/b$a.class
     */
    /* renamed from: m8.b$a */
    /* loaded from: combined.jar:classes2.jar:m8/b$a.class */
    public static abstract class a {

        /* renamed from: a */
        public final String f33350a;

        /* renamed from: b */
        public final String f33351b;

        /* renamed from: c */
        public final a f33352c;

        /* renamed from: d */
        public final List<Pair<String, Object>> f33353d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f33352c = aVar;
            this.f33350a = str;
            this.f33351b = str2;
        }

        /* renamed from: a */
        public void mo29193a(Object obj) {
        }

        /* renamed from: b */
        public abstract Object mo29194b();

        /* renamed from: c */
        public final Object m29195c(String str) {
            for (int i10 = 0; i10 < this.f33353d.size(); i10++) {
                Pair<String, Object> pair = this.f33353d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f33352c;
            return aVar == null ? null : aVar.m29195c(str);
        }

        /* renamed from: d */
        public boolean mo29196d(String str) {
            return false;
        }

        /* renamed from: e */
        public final a m29197e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        /* renamed from: f */
        public final Object m29198f(XmlPullParser xmlPullParser) {
            boolean z10;
            int i10;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f33351b.equals(name)) {
                        mo29206n(xmlPullParser);
                        z10 = true;
                        i10 = i12;
                    } else {
                        z10 = z11;
                        i10 = i12;
                        if (z11) {
                            if (i12 > 0) {
                                i10 = i12 + 1;
                                z10 = z11;
                            } else if (mo29196d(name)) {
                                mo29206n(xmlPullParser);
                                z10 = z11;
                                i10 = i12;
                            } else {
                                a m29197e = m29197e(this, name, this.f33350a);
                                if (m29197e == null) {
                                    i10 = 1;
                                    z10 = z11;
                                } else {
                                    mo29193a(m29197e.m29198f(xmlPullParser));
                                    i10 = i12;
                                    z10 = z11;
                                }
                            }
                        }
                    }
                } else if (eventType == 3) {
                    z10 = z11;
                    i10 = i12;
                    if (!z11) {
                        continue;
                    } else if (i12 > 0) {
                        i10 = i12 - 1;
                        z10 = z11;
                    } else {
                        String name2 = xmlPullParser.getName();
                        mo29200h(xmlPullParser);
                        z10 = z11;
                        i10 = i12;
                        if (!mo29196d(name2)) {
                            return mo29194b();
                        }
                    }
                } else if (eventType != 4) {
                    z10 = z11;
                    i10 = i12;
                } else {
                    z10 = z11;
                    i10 = i12;
                    if (z11) {
                        z10 = z11;
                        i10 = i12;
                        if (i12 == 0) {
                            mo29207o(xmlPullParser);
                            z10 = z11;
                            i10 = i12;
                        }
                    }
                }
                xmlPullParser.next();
                z11 = z10;
                i11 = i10;
            }
        }

        /* renamed from: g */
        public final boolean m29199g(XmlPullParser xmlPullParser, String str, boolean z10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z10;
        }

        /* renamed from: h */
        public void mo29200h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        public final int m29201i(XmlPullParser xmlPullParser, String str, int i10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i10;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C7594k1.m32824c(null, e10);
            }
        }

        /* renamed from: j */
        public final long m29202j(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C7594k1.m32824c(null, e10);
            }
        }

        /* renamed from: k */
        public final int m29203k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw C7594k1.m32824c(null, e10);
            }
        }

        /* renamed from: l */
        public final long m29204l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw C7594k1.m32824c(null, e10);
            }
        }

        /* renamed from: m */
        public final String m29205m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        /* renamed from: n */
        public abstract void mo29206n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        public void mo29207o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        public final void m29208p(String str, Object obj) {
            this.f33353d.add(Pair.create(str, obj));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/b$b.class
     */
    /* renamed from: m8.b$b */
    /* loaded from: combined.jar:classes2.jar:m8/b$b.class */
    public static class b extends C7594k1 {
        public b(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/b$c.class
     */
    /* renamed from: m8.b$c */
    /* loaded from: combined.jar:classes2.jar:m8/b$c.class */
    public static class c extends a {

        /* renamed from: e */
        public boolean f33354e;

        /* renamed from: f */
        public UUID f33355f;

        /* renamed from: g */
        public byte[] f33356g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: q */
        public static C5525p[] m29209q(byte[] bArr) {
            return new C5525p[]{new C5525p(true, null, 8, m29210r(bArr), 0, 0, null)};
        }

        /* renamed from: r */
        public static byte[] m29210r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            m29212t(decode, 0, 3);
            m29212t(decode, 1, 2);
            m29212t(decode, 4, 5);
            m29212t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        public static String m29211s(String str) {
            String str2 = str;
            if (str.charAt(0) == '{') {
                str2 = str;
                if (str.charAt(str.length() - 1) == '}') {
                    str2 = str.substring(1, str.length() - 1);
                }
            }
            return str2;
        }

        /* renamed from: t */
        public static void m29212t(byte[] bArr, int i10, int i11) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }

        @Override // p215m8.C5934b.a
        /* renamed from: b */
        public Object mo29194b() {
            UUID uuid = this.f33355f;
            return new C5933a.a(uuid, C5521l.m27470a(uuid, this.f33356g), m29209q(this.f33356g));
        }

        @Override // p215m8.C5934b.a
        /* renamed from: d */
        public boolean mo29196d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p215m8.C5934b.a
        /* renamed from: h */
        public void mo29200h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f33354e = false;
            }
        }

        @Override // p215m8.C5934b.a
        /* renamed from: n */
        public void mo29206n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f33354e = true;
                this.f33355f = UUID.fromString(m29211s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p215m8.C5934b.a
        /* renamed from: o */
        public void mo29207o(XmlPullParser xmlPullParser) {
            if (this.f33354e) {
                this.f33356g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/b$d.class
     */
    /* renamed from: m8.b$d */
    /* loaded from: combined.jar:classes2.jar:m8/b$d.class */
    public static class d extends a {

        /* renamed from: e */
        public C7629w0 f33357e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: q */
        public static List<byte[]> m29213q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] m22333K = C4401z0.m22333K(str);
                byte[][] m21937i = C4356d.m21937i(m22333K);
                if (m21937i == null) {
                    arrayList.add(m22333K);
                } else {
                    Collections.addAll(arrayList, m21937i);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        public static String m29214r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // p215m8.C5934b.a
        /* renamed from: b */
        public Object mo29194b() {
            return this.f33357e;
        }

        @Override // p215m8.C5934b.a
        /* renamed from: n */
        public void mo29206n(XmlPullParser xmlPullParser) {
            String str;
            C7629w0.b bVar = new C7629w0.b();
            String m29214r = m29214r(m29205m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) m29195c("Type")).intValue();
            if (intValue == 2) {
                bVar.m33200K("video/mp4").m33225j0(m29203k(xmlPullParser, "MaxWidth")).m33206Q(m29203k(xmlPullParser, "MaxHeight")).m33209T(m29213q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
                str = m29214r;
            } else if (intValue == 1) {
                str = m29214r;
                if (m29214r == null) {
                    str = "audio/mp4a-latm";
                }
                int m29203k = m29203k(xmlPullParser, "Channels");
                int m29203k2 = m29203k(xmlPullParser, "SamplingRate");
                List<byte[]> m29213q = m29213q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                List<byte[]> list = m29213q;
                if (m29213q.isEmpty()) {
                    list = m29213q;
                    if ("audio/mp4a-latm".equals(str)) {
                        list = Collections.singletonList(C7966a.m34523a(m29203k2, m29203k));
                    }
                }
                bVar.m33200K("audio/mp4").m33197H(m29203k).m33221f0(m29203k2).m33209T(list);
            } else if (intValue == 3) {
                String str2 = (String) m29195c("Subtype");
                int i10 = 0;
                if (str2 != null) {
                    i10 = !str2.equals("CAPT") ? !str2.equals("DESC") ? 0 : 1024 : 64;
                }
                bVar.m33200K("application/mp4").m33218c0(i10);
                str = m29214r;
            } else {
                bVar.m33200K("application/mp4");
                str = m29214r;
            }
            this.f33357e = bVar.m33208S(xmlPullParser.getAttributeValue(null, "Index")).m33210U((String) m29195c("Name")).m33220e0(str).m33196G(m29203k(xmlPullParser, "Bitrate")).m33211V((String) m29195c("Language")).m33194E();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/b$e.class
     */
    /* renamed from: m8.b$e */
    /* loaded from: combined.jar:classes2.jar:m8/b$e.class */
    public static class e extends a {

        /* renamed from: e */
        public final List<C5933a.b> f33358e;

        /* renamed from: f */
        public int f33359f;

        /* renamed from: g */
        public int f33360g;

        /* renamed from: h */
        public long f33361h;

        /* renamed from: i */
        public long f33362i;

        /* renamed from: j */
        public long f33363j;

        /* renamed from: k */
        public int f33364k;

        /* renamed from: l */
        public boolean f33365l;

        /* renamed from: m */
        public C5933a.a f33366m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.f33364k = -1;
            this.f33366m = null;
            this.f33358e = new LinkedList();
        }

        @Override // p215m8.C5934b.a
        /* renamed from: a */
        public void mo29193a(Object obj) {
            if (obj instanceof C5933a.b) {
                this.f33358e.add((C5933a.b) obj);
            } else if (obj instanceof C5933a.a) {
                C4349a.m21884g(this.f33366m == null);
                this.f33366m = (C5933a.a) obj;
            }
        }

        @Override // p215m8.C5934b.a
        /* renamed from: b */
        public Object mo29194b() {
            int size = this.f33358e.size();
            C5933a.b[] bVarArr = new C5933a.b[size];
            this.f33358e.toArray(bVarArr);
            if (this.f33366m != null) {
                C5933a.a aVar = this.f33366m;
                C9273n c9273n = new C9273n(new C9273n.b(aVar.f33330a, "video/mp4", aVar.f33331b));
                for (int i10 = 0; i10 < size; i10++) {
                    C5933a.b bVar = bVarArr[i10];
                    int i11 = bVar.f33333a;
                    if (i11 == 2 || i11 == 1) {
                        C7629w0[] c7629w0Arr = bVar.f33342j;
                        for (int i12 = 0; i12 < c7629w0Arr.length; i12++) {
                            c7629w0Arr[i12] = c7629w0Arr[i12].m33157b().m33201L(c9273n).m33194E();
                        }
                    }
                }
            }
            return new C5933a(this.f33359f, this.f33360g, this.f33361h, this.f33362i, this.f33363j, this.f33364k, this.f33365l, this.f33366m, bVarArr);
        }

        @Override // p215m8.C5934b.a
        /* renamed from: n */
        public void mo29206n(XmlPullParser xmlPullParser) {
            this.f33359f = m29203k(xmlPullParser, "MajorVersion");
            this.f33360g = m29203k(xmlPullParser, "MinorVersion");
            this.f33361h = m29202j(xmlPullParser, "TimeScale", 10000000L);
            this.f33362i = m29204l(xmlPullParser, "Duration");
            this.f33363j = m29202j(xmlPullParser, "DVRWindowLength", 0L);
            this.f33364k = m29201i(xmlPullParser, "LookaheadCount", -1);
            this.f33365l = m29199g(xmlPullParser, "IsLive", false);
            m29208p("TimeScale", Long.valueOf(this.f33361h));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:m8/b$f.class
     */
    /* renamed from: m8.b$f */
    /* loaded from: combined.jar:classes2.jar:m8/b$f.class */
    public static class f extends a {

        /* renamed from: e */
        public final String f33367e;

        /* renamed from: f */
        public final List<C7629w0> f33368f;

        /* renamed from: g */
        public int f33369g;

        /* renamed from: h */
        public String f33370h;

        /* renamed from: i */
        public long f33371i;

        /* renamed from: j */
        public String f33372j;

        /* renamed from: k */
        public String f33373k;

        /* renamed from: l */
        public int f33374l;

        /* renamed from: m */
        public int f33375m;

        /* renamed from: n */
        public int f33376n;

        /* renamed from: o */
        public int f33377o;

        /* renamed from: p */
        public String f33378p;

        /* renamed from: q */
        public ArrayList<Long> f33379q;

        /* renamed from: r */
        public long f33380r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f33367e = str;
            this.f33368f = new LinkedList();
        }

        @Override // p215m8.C5934b.a
        /* renamed from: a */
        public void mo29193a(Object obj) {
            if (obj instanceof C7629w0) {
                this.f33368f.add((C7629w0) obj);
            }
        }

        @Override // p215m8.C5934b.a
        /* renamed from: b */
        public Object mo29194b() {
            C7629w0[] c7629w0Arr = new C7629w0[this.f33368f.size()];
            this.f33368f.toArray(c7629w0Arr);
            return new C5933a.b(this.f33367e, this.f33373k, this.f33369g, this.f33370h, this.f33371i, this.f33372j, this.f33374l, this.f33375m, this.f33376n, this.f33377o, this.f33378p, c7629w0Arr, this.f33379q, this.f33380r);
        }

        @Override // p215m8.C5934b.a
        /* renamed from: d */
        public boolean mo29196d(String str) {
            return "c".equals(str);
        }

        @Override // p215m8.C5934b.a
        /* renamed from: n */
        public void mo29206n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m29216r(xmlPullParser);
            } else {
                m29215q(xmlPullParser);
            }
        }

        /* renamed from: q */
        public final void m29215q(XmlPullParser xmlPullParser) {
            int m29217s = m29217s(xmlPullParser);
            this.f33369g = m29217s;
            m29208p("Type", Integer.valueOf(m29217s));
            this.f33370h = this.f33369g == 3 ? m29205m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            m29208p("Subtype", this.f33370h);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f33372j = attributeValue;
            m29208p("Name", attributeValue);
            this.f33373k = m29205m(xmlPullParser, "Url");
            this.f33374l = m29201i(xmlPullParser, "MaxWidth", -1);
            this.f33375m = m29201i(xmlPullParser, "MaxHeight", -1);
            this.f33376n = m29201i(xmlPullParser, "DisplayWidth", -1);
            this.f33377o = m29201i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f33378p = attributeValue2;
            m29208p("Language", attributeValue2);
            long m29201i = m29201i(xmlPullParser, "TimeScale", -1);
            this.f33371i = m29201i;
            if (m29201i == -1) {
                this.f33371i = ((Long) m29195c("TimeScale")).longValue();
            }
            this.f33379q = new ArrayList<>();
        }

        /* renamed from: r */
        public final void m29216r(XmlPullParser xmlPullParser) {
            int size = this.f33379q.size();
            long m29202j = m29202j(xmlPullParser, "t", -9223372036854775807L);
            long j10 = m29202j;
            if (m29202j == -9223372036854775807L) {
                if (size == 0) {
                    j10 = 0;
                } else {
                    if (this.f33380r == -1) {
                        throw C7594k1.m32824c("Unable to infer start time", null);
                    }
                    j10 = this.f33379q.get(size - 1).longValue() + this.f33380r;
                }
            }
            this.f33379q.add(Long.valueOf(j10));
            this.f33380r = m29202j(xmlPullParser, "d", -9223372036854775807L);
            long m29202j2 = m29202j(xmlPullParser, "r", 1L);
            int i10 = 1;
            if (m29202j2 > 1) {
                if (this.f33380r == -9223372036854775807L) {
                    throw C7594k1.m32824c("Repeated chunk with unspecified duration", null);
                }
                i10 = 1;
            }
            while (true) {
                long j11 = i10;
                if (j11 >= m29202j2) {
                    return;
                }
                this.f33379q.add(Long.valueOf((this.f33380r * j11) + j10));
                i10++;
            }
        }

        /* renamed from: s */
        public final int m29217s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw C7594k1.m32824c("Invalid key value[" + attributeValue + "]", null);
        }
    }

    public C5934b() {
        try {
            this.f33349b = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // p027b9.C0843g0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5933a mo5362a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f33349b.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C5933a) new e(null, uri.toString()).m29198f(newPullParser);
        } catch (XmlPullParserException e10) {
            throw C7594k1.m32824c(null, e10);
        }
    }
}
