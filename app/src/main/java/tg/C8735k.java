package tg;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import ug.C9181f;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/k.class
 */
/* renamed from: tg.k */
/* loaded from: combined.jar:classes2.jar:tg/k.class */
public final class C8735k {

    /* renamed from: f */
    public static final C8735k f40626f;

    /* renamed from: g */
    public static final C8735k f40627g;

    /* renamed from: h */
    public static final C8735k f40628h;

    /* renamed from: a */
    public final boolean f40629a;

    /* renamed from: b */
    public final String[] f40630b;

    /* renamed from: c */
    public final String[] f40631c;

    /* renamed from: d */
    public final boolean f40632d;

    /* renamed from: e */
    public C8735k f40633e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/k$b.class
     */
    /* renamed from: tg.k$b */
    /* loaded from: combined.jar:classes2.jar:tg/k$b.class */
    public static final class b {

        /* renamed from: a */
        public boolean f40634a;

        /* renamed from: b */
        public String[] f40635b;

        /* renamed from: c */
        public String[] f40636c;

        /* renamed from: d */
        public boolean f40637d;

        public b(C8735k c8735k) {
            this.f40634a = c8735k.f40629a;
            this.f40635b = c8735k.f40630b;
            this.f40636c = c8735k.f40631c;
            this.f40637d = c8735k.f40632d;
        }

        public b(boolean z10) {
            this.f40634a = z10;
        }

        /* renamed from: e */
        public C8735k m37382e() {
            return new C8735k(this);
        }

        /* renamed from: f */
        public b m37383f(String[] strArr) {
            this.f40635b = strArr;
            return this;
        }

        /* renamed from: g */
        public b m37384g(EnumC8732h... enumC8732hArr) {
            if (!this.f40634a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[enumC8732hArr.length];
            for (int i10 = 0; i10 < enumC8732hArr.length; i10++) {
                strArr[i10] = enumC8732hArr[i10].javaName;
            }
            return m37383f(strArr);
        }

        /* renamed from: h */
        public b m37385h(boolean z10) {
            if (!this.f40634a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f40637d = z10;
            return this;
        }

        /* renamed from: i */
        public b m37386i(String... strArr) {
            this.f40636c = strArr;
            return this;
        }

        /* renamed from: j */
        public b m37387j(EnumC8748x... enumC8748xArr) {
            if (!this.f40634a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[enumC8748xArr.length];
            for (int i10 = 0; i10 < enumC8748xArr.length; i10++) {
                strArr[i10] = enumC8748xArr[i10].javaName;
            }
            return m37386i(strArr);
        }
    }

    static {
        b m37384g = new b(true).m37384g(EnumC8732h.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC8732h.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC8732h.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, EnumC8732h.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, EnumC8732h.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, EnumC8732h.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC8732h.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC8732h.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA, EnumC8732h.TLS_ECDHE_RSA_WITH_RC4_128_SHA, EnumC8732h.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, EnumC8732h.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, EnumC8732h.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, EnumC8732h.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC8732h.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC8732h.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC8732h.TLS_RSA_WITH_3DES_EDE_CBC_SHA, EnumC8732h.TLS_RSA_WITH_RC4_128_SHA, EnumC8732h.TLS_RSA_WITH_RC4_128_MD5);
        EnumC8748x enumC8748x = EnumC8748x.TLS_1_2;
        EnumC8748x enumC8748x2 = EnumC8748x.TLS_1_1;
        EnumC8748x enumC8748x3 = EnumC8748x.TLS_1_0;
        EnumC8748x enumC8748x4 = EnumC8748x.SSL_3_0;
        C8735k m37382e = m37384g.m37387j(enumC8748x, enumC8748x2, enumC8748x3, enumC8748x4).m37385h(true).m37382e();
        f40626f = m37382e;
        f40627g = new b(m37382e).m37387j(enumC8748x4).m37382e();
        f40628h = new b(false).m37382e();
    }

    public C8735k(b bVar) {
        this.f40629a = bVar.f40634a;
        this.f40630b = bVar.f40635b;
        this.f40631c = bVar.f40636c;
        this.f40632d = bVar.f40637d;
    }

    /* renamed from: c */
    public void m37372c(SSLSocket sSLSocket, C8747w c8747w) {
        C8735k c8735k = this.f40633e;
        C8735k c8735k2 = c8735k;
        if (c8735k == null) {
            c8735k2 = m37375f(sSLSocket);
            this.f40633e = c8735k2;
        }
        sSLSocket.setEnabledProtocols(c8735k2.f40631c);
        sSLSocket.setEnabledCipherSuites(c8735k2.f40630b);
        C9181f m38667e = C9181f.m38667e();
        if (c8735k2.f40632d) {
            C8725a c8725a = c8747w.f40708a;
            m38667e.mo38668b(sSLSocket, c8725a.f40537b, c8725a.f40544i);
        }
    }

    /* renamed from: d */
    public List<EnumC8732h> m37373d() {
        EnumC8732h[] enumC8732hArr = new EnumC8732h[this.f40630b.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f40630b;
            if (i10 >= strArr.length) {
                return C9183h.m38693m(enumC8732hArr);
            }
            enumC8732hArr[i10] = EnumC8732h.forJavaName(strArr[i10]);
            i10++;
        }
    }

    /* renamed from: e */
    public boolean m37374e() {
        return this.f40629a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8735k)) {
            return false;
        }
        C8735k c8735k = (C8735k) obj;
        boolean z10 = this.f40629a;
        if (z10 != c8735k.f40629a) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f40630b, c8735k.f40630b) && Arrays.equals(this.f40631c, c8735k.f40631c) && this.f40632d == c8735k.f40632d;
        }
        return true;
    }

    /* renamed from: f */
    public final C8735k m37375f(SSLSocket sSLSocket) {
        List m38695o = C9183h.m38695o(Arrays.asList(this.f40630b), Arrays.asList(sSLSocket.getSupportedCipherSuites()));
        List m38695o2 = C9183h.m38695o(Arrays.asList(this.f40631c), Arrays.asList(sSLSocket.getSupportedProtocols()));
        return new b(this).m37383f((String[]) m38695o.toArray(new String[m38695o.size()])).m37386i((String[]) m38695o2.toArray(new String[m38695o2.size()])).m37382e();
    }

    /* renamed from: g */
    public boolean m37376g() {
        return this.f40632d;
    }

    /* renamed from: h */
    public List<EnumC8748x> m37377h() {
        EnumC8748x[] enumC8748xArr = new EnumC8748x[this.f40631c.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f40631c;
            if (i10 >= strArr.length) {
                return C9183h.m38693m(enumC8748xArr);
            }
            enumC8748xArr[i10] = EnumC8748x.forJavaName(strArr[i10]);
            i10++;
        }
    }

    public int hashCode() {
        return this.f40629a ? ((((527 + Arrays.hashCode(this.f40630b)) * 31) + Arrays.hashCode(this.f40631c)) * 31) + (!this.f40632d ? 1 : 0) : 17;
    }

    public String toString() {
        if (!this.f40629a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + m37373d() + ", tlsVersions=" + m37377h() + ", supportsTlsExtensions=" + this.f40632d + ")";
    }
}
