package p007a6;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p036c6.InterfaceC0996g;
import p437z5.C10054b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:a6/a.class
 */
/* renamed from: a6.a */
/* loaded from: combined.jar:classes1.jar:a6/a.class */
public final class C0073a implements InterfaceC0996g {

    /* renamed from: c */
    public static final String f227c;

    /* renamed from: d */
    public static final String f228d;

    /* renamed from: e */
    public static final String f229e;

    /* renamed from: f */
    public static final Set<C10054b> f230f;

    /* renamed from: g */
    public static final C0073a f231g;

    /* renamed from: h */
    public static final C0073a f232h;

    /* renamed from: a */
    public final String f233a;

    /* renamed from: b */
    public final String f234b;

    static {
        String m295a = C0077e.m295a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f227c = m295a;
        String m295a2 = C0077e.m295a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f228d = m295a2;
        String m295a3 = C0077e.m295a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f229e = m295a3;
        f230f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C10054b.m42268b("proto"), C10054b.m42268b("json"))));
        f231g = new C0073a(m295a, null);
        f232h = new C0073a(m295a2, m295a3);
    }

    public C0073a(String str, String str2) {
        this.f233a = str;
        this.f234b = str2;
    }

    /* renamed from: c */
    public static C0073a m274c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        String str4 = str3;
        if (str3.isEmpty()) {
            str4 = null;
        }
        return new C0073a(str2, str4);
    }

    @Override // p036c6.InterfaceC0996g
    /* renamed from: a */
    public Set<C10054b> mo275a() {
        return f230f;
    }

    /* renamed from: b */
    public byte[] m276b() {
        String str = this.f234b;
        if (str == null && this.f233a == null) {
            return null;
        }
        String str2 = this.f233a;
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str3).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    public String m277d() {
        return this.f234b;
    }

    /* renamed from: e */
    public String m278e() {
        return this.f233a;
    }

    @Override // p036c6.InterfaceC0995f
    public byte[] getExtras() {
        return m276b();
    }

    @Override // p036c6.InterfaceC0995f
    public String getName() {
        return "cct";
    }
}
