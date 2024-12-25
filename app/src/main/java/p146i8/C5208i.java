package p146i8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.apache.http.protocol.HTTP;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p027b9.C0843g0;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4393v0;
import p059d9.C4400z;
import p059d9.C4401z0;
import p114g8.C4986s;
import p146i8.C5205f;
import p146i8.C5206g;
import p182k7.C5521l;
import p267p6.C7583h;
import p267p6.C7594k1;
import p267p6.C7629w0;
import p283q7.C7839a;
import p365v6.C9273n;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:i8/i.class
 */
/* renamed from: i8.i */
/* loaded from: combined.jar:classes2.jar:i8/i.class */
public final class C5208i implements C0843g0.a<AbstractC5207h> {

    /* renamed from: b */
    public final C5205f f29886b;

    /* renamed from: c */
    public final C5206g f29887c;

    /* renamed from: d */
    public static final Pattern f29860d = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: e */
    public static final Pattern f29861e = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: f */
    public static final Pattern f29862f = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: g */
    public static final Pattern f29864g = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: h */
    public static final Pattern f29866h = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: i */
    public static final Pattern f29868i = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: j */
    public static final Pattern f29869j = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: k */
    public static final Pattern f29870k = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: l */
    public static final Pattern f29871l = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: m */
    public static final Pattern f29872m = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: n */
    public static final Pattern f29873n = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: o */
    public static final Pattern f29874o = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: p */
    public static final Pattern f29875p = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: q */
    public static final Pattern f29876q = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: r */
    public static final Pattern f29877r = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: s */
    public static final Pattern f29878s = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: t */
    public static final Pattern f29879t = m26039c("CAN-SKIP-DATERANGES");

    /* renamed from: u */
    public static final Pattern f29880u = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: v */
    public static final Pattern f29881v = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    public static final Pattern f29882w = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: x */
    public static final Pattern f29883x = m26039c("CAN-BLOCK-RELOAD");

    /* renamed from: y */
    public static final Pattern f29884y = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: z */
    public static final Pattern f29885z = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: A */
    public static final Pattern f29834A = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: B */
    public static final Pattern f29835B = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: C */
    public static final Pattern f29836C = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: D */
    public static final Pattern f29837D = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: E */
    public static final Pattern f29838E = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: F */
    public static final Pattern f29839F = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: G */
    public static final Pattern f29840G = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: H */
    public static final Pattern f29841H = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: I */
    public static final Pattern f29842I = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: J */
    public static final Pattern f29843J = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: K */
    public static final Pattern f29844K = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: L */
    public static final Pattern f29845L = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: M */
    public static final Pattern f29846M = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: N */
    public static final Pattern f29847N = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: O */
    public static final Pattern f29848O = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: P */
    public static final Pattern f29849P = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: Q */
    public static final Pattern f29850Q = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: R */
    public static final Pattern f29851R = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: S */
    public static final Pattern f29852S = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: T */
    public static final Pattern f29853T = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: U */
    public static final Pattern f29854U = m26039c("AUTOSELECT");

    /* renamed from: V */
    public static final Pattern f29855V = m26039c("DEFAULT");

    /* renamed from: W */
    public static final Pattern f29856W = m26039c("FORCED");

    /* renamed from: X */
    public static final Pattern f29857X = m26039c("INDEPENDENT");

    /* renamed from: Y */
    public static final Pattern f29858Y = m26039c("GAP");

    /* renamed from: Z */
    public static final Pattern f29859Z = m26039c("PRECISE");

    /* renamed from: f0 */
    public static final Pattern f29863f0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: g0 */
    public static final Pattern f29865g0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: h0 */
    public static final Pattern f29867h0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/i$a.class
     */
    /* renamed from: i8.i$a */
    /* loaded from: combined.jar:classes2.jar:i8/i$a.class */
    public static final class a extends IOException {
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:i8/i$b.class
     */
    /* renamed from: i8.i$b */
    /* loaded from: combined.jar:classes2.jar:i8/i$b.class */
    public static class b {

        /* renamed from: a */
        public final BufferedReader f29888a;

        /* renamed from: b */
        public final Queue<String> f29889b;

        /* renamed from: c */
        public String f29890c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f29889b = queue;
            this.f29888a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* renamed from: a */
        public boolean m26063a() {
            String trim;
            if (this.f29890c != null) {
                return true;
            }
            if (!this.f29889b.isEmpty()) {
                this.f29890c = (String) C4349a.m21882e(this.f29889b.poll());
                return true;
            }
            do {
                String readLine = this.f29888a.readLine();
                this.f29890c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f29890c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m26064b() {
            if (!m26063a()) {
                throw new NoSuchElementException();
            }
            String str = this.f29890c;
            this.f29890c = null;
            return str;
        }
    }

    public C5208i() {
        this(C5205f.f29768n, null);
    }

    public C5208i(C5205f c5205f, C5206g c5206g) {
        this.f29886b = c5205f;
        this.f29887c = c5206g;
    }

    /* renamed from: A */
    public static String m26036A(String str, Map<String, String> map) {
        Matcher matcher = f29867h0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: B */
    public static int m26037B(BufferedReader bufferedReader, boolean z10, int i10) {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !C4401z0.m22412t0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    /* renamed from: b */
    public static boolean m26038b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        int i10 = read;
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int m26037B = m26037B(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (m26037B != "#EXTM3U".charAt(i11)) {
                return false;
            }
            m26037B = bufferedReader.read();
        }
        return C4401z0.m22412t0(m26037B(bufferedReader, false, m26037B));
    }

    /* renamed from: c */
    public static Pattern m26039c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: d */
    public static C9273n m26040d(String str, C9273n.b[] bVarArr) {
        C9273n.b[] bVarArr2 = new C9273n.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].m39144c(null);
        }
        return new C9273n(str, bVarArr2);
    }

    /* renamed from: e */
    public static String m26041e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    /* renamed from: f */
    public static C5205f.b m26042f(ArrayList<C5205f.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C5205f.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f29786d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C5205f.b m26043g(ArrayList<C5205f.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C5205f.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f29787e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static C5205f.b m26044h(ArrayList<C5205f.b> arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C5205f.b bVar = arrayList.get(i10);
            if (str.equals(bVar.f29785c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static double m26045j(String str, Pattern pattern) {
        return Double.parseDouble(m26061z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    public static C9273n.b m26046k(String str, String str2, Map<String, String> map) {
        String m26056u = m26056u(str, f29844K, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String m26061z = m26061z(str, f29845L, map);
            return new C9273n.b(C7583h.f36779d, "video/mp4", Base64.decode(m26061z.substring(m26061z.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C9273n.b(C7583h.f36779d, "hls", C4401z0.m22396l0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(m26056u)) {
            return null;
        }
        String m26061z2 = m26061z(str, f29845L, map);
        byte[] decode = Base64.decode(m26061z2.substring(m26061z2.indexOf(44)), 0);
        UUID uuid = C7583h.f36780e;
        return new C9273n.b(uuid, "video/mp4", C5521l.m27470a(uuid, decode));
    }

    /* renamed from: l */
    public static String m26047l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: m */
    public static int m26048m(String str, Pattern pattern) {
        return Integer.parseInt(m26061z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    public static long m26049n(String str, Pattern pattern) {
        return Long.parseLong(m26061z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: o */
    public static C5205f m26050o(b bVar, String str) {
        boolean z10;
        String str2;
        int parseInt;
        String str3;
        List list;
        String str4;
        String str5;
        int i10;
        int i11;
        String m26036A;
        boolean z11;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            boolean z14 = z13;
            if (!bVar.m26063a()) {
                ArrayList arrayList9 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    C5205f.b bVar2 = (C5205f.b) arrayList.get(i12);
                    if (hashSet.add(bVar2.f29783a)) {
                        C4349a.m21884g(bVar2.f29784b.f37084k == null);
                        arrayList9.add(bVar2.m26027a(bVar2.f29784b.m33157b().m33213X(new C7839a(new C4986s(null, null, (List) C4349a.m21882e((ArrayList) hashMap.get(bVar2.f29783a))))).m33194E()));
                    }
                }
                int i13 = 0;
                ArrayList arrayList10 = arrayList6;
                C7629w0 c7629w0 = null;
                List list2 = null;
                while (i13 < arrayList10.size()) {
                    String str6 = (String) arrayList10.get(i13);
                    String m26061z = m26061z(str6, f29851R, hashMap2);
                    String m26061z2 = m26061z(str6, f29850Q, hashMap2);
                    C7629w0.b m33211V = new C7629w0.b().m33208S(m26061z + ":" + m26061z2).m33210U(m26061z2).m33200K("application/x-mpegURL").m33222g0(m26059x(str6)).m33218c0(m26058w(str6, hashMap2)).m33211V(m26057v(str6, f29849P, hashMap2));
                    String m26057v = m26057v(str6, f29845L, hashMap2);
                    Uri m22281e = m26057v == null ? null : C4393v0.m22281e(str, m26057v);
                    ArrayList arrayList11 = arrayList10;
                    C7839a c7839a = new C7839a(new C4986s(m26061z, m26061z2, Collections.emptyList()));
                    String m26061z3 = m26061z(str6, f29847N, hashMap2);
                    m26061z3.hashCode();
                    switch (m26061z3.hashCode()) {
                        case -959297733:
                            if (m26061z3.equals("SUBTITLES")) {
                                z10 = false;
                                break;
                            }
                            z10 = -1;
                            break;
                        case -333210994:
                            if (m26061z3.equals("CLOSED-CAPTIONS")) {
                                z10 = true;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 62628790:
                            if (m26061z3.equals("AUDIO")) {
                                z10 = 2;
                                break;
                            }
                            z10 = -1;
                            break;
                        case 81665115:
                            if (m26061z3.equals("VIDEO")) {
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
                            C7629w0 c7629w02 = c7629w0;
                            C5205f.b m26043g = m26043g(arrayList, m26061z);
                            if (m26043g != null) {
                                String m22337M = C4401z0.m22337M(m26043g.f29784b.f37083j, 3);
                                m33211V.m33198I(m22337M);
                                str2 = C4400z.m22299g(m22337M);
                            } else {
                                str2 = null;
                            }
                            String str7 = str2;
                            if (str2 == null) {
                                str7 = "text/vtt";
                            }
                            m33211V.m33220e0(str7).m33213X(c7839a);
                            if (m22281e != null) {
                                arrayList4.add(new C5205f.a(m22281e, m33211V.m33194E(), m26061z, m26061z2));
                                c7629w0 = c7629w02;
                                break;
                            } else {
                                C4392v.m22275i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                c7629w0 = c7629w02;
                                continue;
                            }
                        case true:
                            String m26061z4 = m26061z(str6, f29853T, hashMap2);
                            if (m26061z4.startsWith("CC")) {
                                parseInt = Integer.parseInt(m26061z4.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(m26061z4.substring(7));
                                str3 = "application/cea-708";
                            }
                            list = list2;
                            if (list2 == null) {
                                list = new ArrayList();
                            }
                            m33211V.m33220e0(str3).m33195F(parseInt);
                            list.add(m33211V.m33194E());
                            break;
                        case true:
                            C5205f.b m26042f = m26042f(arrayList, m26061z);
                            if (m26042f != null) {
                                String m22337M2 = C4401z0.m22337M(m26042f.f29784b.f37083j, 1);
                                m33211V.m33198I(m22337M2);
                                str4 = C4400z.m22299g(m22337M2);
                            } else {
                                str4 = null;
                            }
                            String m26057v2 = m26057v(str6, f29869j, hashMap2);
                            if (m26057v2 != null) {
                                m33211V.m33197H(Integer.parseInt(C4401z0.m22358W0(m26057v2, "/")[0]));
                                str5 = str4;
                                if ("audio/eac3".equals(str4)) {
                                    str5 = str4;
                                    if (m26057v2.endsWith("/JOC")) {
                                        m33211V.m33198I("ec+3");
                                        str5 = "audio/eac3-joc";
                                    }
                                }
                            } else {
                                str5 = str4;
                            }
                            m33211V.m33220e0(str5);
                            if (m22281e != null) {
                                m33211V.m33213X(c7839a);
                                arrayList3.add(new C5205f.a(m22281e, m33211V.m33194E(), m26061z, m26061z2));
                                list = list2;
                                break;
                            } else {
                                list = list2;
                                if (m26042f != null) {
                                    c7629w0 = m33211V.m33194E();
                                    list = list2;
                                    break;
                                }
                            }
                            break;
                        case true:
                            C5205f.b m26044h = m26044h(arrayList, m26061z);
                            if (m26044h != null) {
                                C7629w0 c7629w03 = m26044h.f29784b;
                                String m22337M3 = C4401z0.m22337M(c7629w03.f37083j, 2);
                                m33211V.m33198I(m22337M3).m33220e0(C4400z.m22299g(m22337M3)).m33225j0(c7629w03.f37091r).m33206Q(c7629w03.f37092s).m33205P(c7629w03.f37093t);
                            }
                            if (m22281e == null) {
                                break;
                            } else {
                                m33211V.m33213X(c7839a);
                                arrayList2.add(new C5205f.a(m22281e, m33211V.m33194E(), m26061z, m26061z2));
                                continue;
                            }
                    }
                    list2 = list;
                    i13++;
                    arrayList10 = arrayList11;
                }
                if (z14) {
                    list2 = Collections.emptyList();
                }
                return new C5205f(str, arrayList8, arrayList9, arrayList2, arrayList3, arrayList4, arrayList5, c7629w0, list2, z12, hashMap2, arrayList7);
            }
            String m26064b = bVar.m26064b();
            if (m26064b.startsWith("#EXT")) {
                arrayList8.add(m26064b);
            }
            boolean startsWith = m26064b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (m26064b.startsWith("#EXT-X-DEFINE")) {
                hashMap2.put(m26061z(m26064b, f29850Q, hashMap2), m26061z(m26064b, f29863f0, hashMap2));
            } else {
                if (m26064b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z12 = true;
                    z11 = z14;
                } else if (m26064b.startsWith("#EXT-X-MEDIA")) {
                    arrayList6.add(m26064b);
                } else if (m26064b.startsWith("#EXT-X-SESSION-KEY")) {
                    C9273n.b m26046k = m26046k(m26064b, m26056u(m26064b, f29843J, HTTP.IDENTITY_CODING, hashMap2), hashMap2);
                    if (m26046k != null) {
                        arrayList7.add(new C9273n(m26047l(m26061z(m26064b, f29842I, hashMap2)), m26046k));
                    }
                } else if (m26064b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z14 | m26064b.contains("CLOSED-CAPTIONS=NONE");
                    int i14 = startsWith ? 16384 : 0;
                    int m26048m = m26048m(m26064b, f29868i);
                    int m26054s = m26054s(m26064b, f29860d, -1);
                    String m26057v3 = m26057v(m26064b, f29870k, hashMap2);
                    String m26057v4 = m26057v(m26064b, f29871l, hashMap2);
                    if (m26057v4 != null) {
                        String[] m22356V0 = C4401z0.m22356V0(m26057v4, "x");
                        i10 = Integer.parseInt(m22356V0[0]);
                        i11 = Integer.parseInt(m22356V0[1]);
                        if (i10 <= 0 || i11 <= 0) {
                            i11 = -1;
                            i10 = -1;
                        }
                    } else {
                        i10 = -1;
                        i11 = -1;
                    }
                    String m26057v5 = m26057v(m26064b, f29872m, hashMap2);
                    float parseFloat = m26057v5 != null ? Float.parseFloat(m26057v5) : -1.0f;
                    String m26057v6 = m26057v(m26064b, f29861e, hashMap2);
                    String m26057v7 = m26057v(m26064b, f29862f, hashMap2);
                    String m26057v8 = m26057v(m26064b, f29864g, hashMap2);
                    String m26057v9 = m26057v(m26064b, f29866h, hashMap2);
                    if (startsWith) {
                        m26036A = m26061z(m26064b, f29845L, hashMap2);
                    } else {
                        if (!bVar.m26063a()) {
                            throw C7594k1.m32824c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        m26036A = m26036A(bVar.m26064b(), hashMap2);
                    }
                    Uri m22281e2 = C4393v0.m22281e(str, m26036A);
                    arrayList.add(new C5205f.b(m22281e2, new C7629w0.b().m33207R(arrayList.size()).m33200K("application/x-mpegURL").m33198I(m26057v3).m33196G(m26054s).m33215Z(m26048m).m33225j0(i10).m33206Q(i11).m33205P(parseFloat).m33218c0(i14).m33194E(), m26057v6, m26057v7, m26057v8, m26057v9));
                    ArrayList arrayList12 = (ArrayList) hashMap.get(m22281e2);
                    ArrayList arrayList13 = arrayList12;
                    if (arrayList12 == null) {
                        arrayList13 = new ArrayList();
                        hashMap.put(m22281e2, arrayList13);
                    }
                    arrayList13.add(new C4986s.b(m26054s, m26048m, m26057v6, m26057v7, m26057v8, m26057v9));
                    z11 = contains;
                }
                z13 = z11;
            }
            z11 = z14;
            z13 = z11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x07f0, code lost:
    
        if (r0 != (-1)) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02b8, code lost:
    
        if (r89 != null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v504 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p146i8.C5206g m26051p(p146i8.C5205f r28, p146i8.C5206g r29, p146i8.C5208i.b r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 2896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p146i8.C5208i.m26051p(i8.f, i8.g, i8.i$b, java.lang.String):i8.g");
    }

    /* renamed from: q */
    public static boolean m26052q(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    /* renamed from: r */
    public static double m26053r(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) C4349a.m21882e(matcher.group(1))) : d10;
    }

    /* renamed from: s */
    public static int m26054s(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) C4349a.m21882e(matcher.group(1))) : i10;
    }

    /* renamed from: t */
    public static long m26055t(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) C4349a.m21882e(matcher.group(1))) : j10;
    }

    /* renamed from: u */
    public static String m26056u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) C4349a.m21882e(matcher.group(1));
        }
        String str3 = str2;
        if (!map.isEmpty()) {
            str3 = str2 == null ? str2 : m26036A(str2, map);
        }
        return str3;
    }

    /* renamed from: v */
    public static String m26057v(String str, Pattern pattern, Map<String, String> map) {
        return m26056u(str, pattern, null, map);
    }

    /* renamed from: w */
    public static int m26058w(String str, Map<String, String> map) {
        String m26057v = m26057v(str, f29852S, map);
        int i10 = 0;
        if (TextUtils.isEmpty(m26057v)) {
            return 0;
        }
        String[] m22356V0 = C4401z0.m22356V0(m26057v, ",");
        if (C4401z0.m22413u(m22356V0, "public.accessibility.describes-video")) {
            i10 = 512;
        }
        int i11 = i10;
        if (C4401z0.m22413u(m22356V0, "public.accessibility.transcribes-spoken-dialog")) {
            i11 = i10 | 4096;
        }
        int i12 = i11;
        if (C4401z0.m22413u(m22356V0, "public.accessibility.describes-music-and-sound")) {
            i12 = i11 | 1024;
        }
        int i13 = i12;
        if (C4401z0.m22413u(m22356V0, "public.easy-to-read")) {
            i13 = i12 | NTLMEngineImpl.FLAG_WORKSTATION_PRESENT;
        }
        return i13;
    }

    /* renamed from: x */
    public static int m26059x(String str) {
        boolean m26052q = m26052q(str, f29855V, false);
        int i10 = m26052q ? 1 : 0;
        if (m26052q(str, f29856W, false)) {
            i10 = (m26052q ? 1 : 0) | 2;
        }
        int i11 = i10;
        if (m26052q(str, f29854U, false)) {
            i11 = i10 | 4;
        }
        return i11;
    }

    /* renamed from: y */
    public static C5206g.f m26060y(String str) {
        double m26053r = m26053r(str, f29878s, -9.223372036854776E18d);
        long j10 = -9223372036854775807L;
        long j11 = m26053r == -9.223372036854776E18d ? -9223372036854775807L : (long) (m26053r * 1000000.0d);
        boolean m26052q = m26052q(str, f29879t, false);
        double m26053r2 = m26053r(str, f29881v, -9.223372036854776E18d);
        long j12 = m26053r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (m26053r2 * 1000000.0d);
        double m26053r3 = m26053r(str, f29882w, -9.223372036854776E18d);
        if (m26053r3 != -9.223372036854776E18d) {
            j10 = (long) (m26053r3 * 1000000.0d);
        }
        return new C5206g.f(j11, m26052q, j12, j10, m26052q(str, f29883x, false));
    }

    /* renamed from: z */
    public static String m26061z(String str, Pattern pattern, Map<String, String> map) {
        String m26057v = m26057v(str, pattern, map);
        if (m26057v != null) {
            return m26057v;
        }
        throw C7594k1.m32824c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // p027b9.C0843g0.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC5207h mo5362a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!m26038b(bufferedReader)) {
                throw C7594k1.m32824c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    C4401z0.m22403p(bufferedReader);
                    throw C7594k1.m32824c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return m26050o(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return m26051p(this.f29886b, this.f29887c, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            C4401z0.m22403p(bufferedReader);
        }
    }
}
