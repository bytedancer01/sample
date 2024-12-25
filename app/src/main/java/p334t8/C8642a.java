package p334t8;

import android.text.Layout;
import ec.C4699b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4392v;
import p059d9.C4401z0;
import p243o8.AbstractC6921c;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;
import p334t8.C8644c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t8/a.class
 */
/* renamed from: t8.a */
/* loaded from: combined.jar:classes2.jar:t8/a.class */
public final class C8642a extends AbstractC6921c {

    /* renamed from: t */
    public static final Pattern f40356t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o */
    public final boolean f40357o;

    /* renamed from: p */
    public final C8643b f40358p;

    /* renamed from: q */
    public Map<String, C8644c> f40359q;

    /* renamed from: r */
    public float f40360r;

    /* renamed from: s */
    public float f40361s;

    public C8642a(List<byte[]> list) {
        super("SsaDecoder");
        this.f40360r = -3.4028235E38f;
        this.f40361s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f40357o = false;
            this.f40358p = null;
            return;
        }
        this.f40357o = true;
        String m22323F = C4401z0.m22323F(list.get(0));
        C4349a.m21878a(m22323F.startsWith("Format:"));
        this.f40358p = (C8643b) C4349a.m21882e(C8643b.m37111a(m22323F));
        m37109G(new C4361f0(list.get(1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r7.add(r9, java.lang.Long.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        if (r9 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        r8.add(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        r0 = new java.util.ArrayList(r8.get(r9 - 1));
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m37099B(long r5, java.util.List<java.lang.Long> r7, java.util.List<java.util.List<p243o8.C6919a>> r8) {
        /*
            r0 = r7
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r9 = r0
        La:
            r0 = r9
            if (r0 < 0) goto L44
            r0 = r7
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r1 = r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            r0 = r9
            return r0
        L25:
            r0 = r7
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r1 = r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3e
            int r9 = r9 + 1
            goto L47
        L3e:
            int r9 = r9 + (-1)
            goto La
        L44:
            r0 = 0
            r9 = r0
        L47:
            r0 = r7
            r1 = r9
            r2 = r5
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.add(r1, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L63
            r0 = r7
            r0.<init>()
            goto L74
        L63:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r1 = r1.get(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
        L74:
            r0 = r8
            r1 = r9
            r2 = r7
            r0.add(r1, r2)
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p334t8.C8642a.m37099B(long, java.util.List, java.util.List):int");
    }

    /* renamed from: C */
    public static float m37100C(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p243o8.C6919a m37101D(java.lang.String r6, p334t8.C8644c r7, p334t8.C8644c.b r8, float r9, float r10) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p334t8.C8642a.m37101D(java.lang.String, t8.c, t8.c$b, float, float):o8.a");
    }

    /* renamed from: I */
    public static Map<String, C8644c> m37102I(C4361f0 c4361f0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C8644c.a aVar = null;
        while (true) {
            String m22000p = c4361f0.m22000p();
            if (m22000p == null || (c4361f0.m21985a() != 0 && c4361f0.m21992h() == 91)) {
                break;
            }
            if (m22000p.startsWith("Format:")) {
                aVar = C8644c.a.m37119a(m22000p);
            } else if (m22000p.startsWith("Style:")) {
                if (aVar == null) {
                    C4392v.m22275i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + m22000p);
                } else {
                    C8644c m37113b = C8644c.m37113b(m22000p, aVar);
                    if (m37113b != null) {
                        linkedHashMap.put(m37113b.f40367a, m37113b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: J */
    public static long m37103J(String str) {
        Matcher matcher = f40356t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) C4401z0.m22391j(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) C4401z0.m22391j(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) C4401z0.m22391j(matcher.group(3))) * 1000000) + (Long.parseLong((String) C4401z0.m22391j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    /* renamed from: K */
    public static int m37104K(int i10) {
        switch (i10) {
            case -1:
                return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            case 0:
            default:
                C4392v.m22275i("SsaDecoder", "Unknown alignment: " + i10);
                return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    /* renamed from: L */
    public static int m37105L(int i10) {
        switch (i10) {
            case -1:
                return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            case 0:
            default:
                C4392v.m22275i("SsaDecoder", "Unknown alignment: " + i10);
                return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    /* renamed from: M */
    public static Layout.Alignment m37106M(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                C4392v.m22275i("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    /* renamed from: E */
    public final void m37107E(String str, C8643b c8643b, List<List<C6919a>> list, List<Long> list2) {
        int i10;
        StringBuilder sb2;
        C4349a.m21878a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", c8643b.f40366e);
        if (split.length != c8643b.f40366e) {
            sb2 = new StringBuilder();
            sb2.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long m37103J = m37103J(split[c8643b.f40362a]);
            if (m37103J == -9223372036854775807L) {
                sb2 = new StringBuilder();
            } else {
                long m37103J2 = m37103J(split[c8643b.f40363b]);
                if (m37103J2 != -9223372036854775807L) {
                    Map<String, C8644c> map = this.f40359q;
                    C8644c c8644c = (map == null || (i10 = c8643b.f40364c) == -1) ? null : map.get(split[i10].trim());
                    String str2 = split[c8643b.f40365d];
                    C6919a m37101D = m37101D(C8644c.b.m37123d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c8644c, C8644c.b.m37121b(str2), this.f40360r, this.f40361s);
                    int m37099B = m37099B(m37103J2, list2, list);
                    for (int m37099B2 = m37099B(m37103J, list2, list); m37099B2 < m37099B; m37099B2++) {
                        list.get(m37099B2).add(m37101D);
                    }
                    return;
                }
                sb2 = new StringBuilder();
            }
            sb2.append("Skipping invalid timing: ");
        }
        sb2.append(str);
        C4392v.m22275i("SsaDecoder", sb2.toString());
    }

    /* renamed from: F */
    public final void m37108F(C4361f0 c4361f0, List<List<C6919a>> list, List<Long> list2) {
        C8643b c8643b = this.f40357o ? this.f40358p : null;
        while (true) {
            String m22000p = c4361f0.m22000p();
            if (m22000p == null) {
                return;
            }
            if (m22000p.startsWith("Format:")) {
                c8643b = C8643b.m37111a(m22000p);
            } else if (m22000p.startsWith("Dialogue:")) {
                if (c8643b == null) {
                    C4392v.m22275i("SsaDecoder", "Skipping dialogue line before complete format: " + m22000p);
                } else {
                    m37107E(m22000p, c8643b, list, list2);
                }
            }
        }
    }

    /* renamed from: G */
    public final void m37109G(C4361f0 c4361f0) {
        while (true) {
            String m22000p = c4361f0.m22000p();
            if (m22000p == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(m22000p)) {
                m37110H(c4361f0);
            } else if ("[V4+ Styles]".equalsIgnoreCase(m22000p)) {
                this.f40359q = m37102I(c4361f0);
            } else if ("[V4 Styles]".equalsIgnoreCase(m22000p)) {
                C4392v.m22273g("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(m22000p)) {
                return;
            }
        }
    }

    /* renamed from: H */
    public final void m37110H(C4361f0 c4361f0) {
        while (true) {
            String m22000p = c4361f0.m22000p();
            if (m22000p == null) {
                return;
            }
            if (c4361f0.m21985a() != 0 && c4361f0.m21992h() == 91) {
                return;
            }
            String[] split = m22000p.split(":");
            if (split.length == 2) {
                String m23638e = C4699b.m23638e(split[0].trim());
                m23638e.hashCode();
                if (m23638e.equals("playresx")) {
                    this.f40360r = Float.parseFloat(split[1].trim());
                } else if (m23638e.equals("playresy")) {
                    try {
                        this.f40361s = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException e10) {
                    }
                }
            }
        }
    }

    @Override // p243o8.AbstractC6921c
    /* renamed from: z */
    public InterfaceC6923e mo31882z(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4361f0 c4361f0 = new C4361f0(bArr, i10);
        if (!this.f40357o) {
            m37109G(c4361f0);
        }
        m37108F(c4361f0, arrayList, arrayList2);
        return new C8645d(arrayList, arrayList2);
    }
}
