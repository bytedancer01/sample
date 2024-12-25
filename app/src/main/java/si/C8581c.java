package si;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/c.class
 */
/* renamed from: si.c */
/* loaded from: combined.jar:classes2.jar:si/c.class */
public final class C8581c extends C8588j {

    /* renamed from: e */
    public static final boolean f40019e;

    /* renamed from: f */
    public static final a f40020f;

    /* renamed from: d */
    public final Provider f40021d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/c$a.class
     */
    /* renamed from: si.c$a */
    /* loaded from: combined.jar:classes2.jar:si/c$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C8581c m36852a() {
            C8581c c8581c = null;
            if (m36853b()) {
                c8581c = new C8581c(null);
            }
            return c8581c;
        }

        /* renamed from: b */
        public final boolean m36853b() {
            return C8581c.f40019e;
        }
    }

    static {
        a aVar = new a(null);
        f40020f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException e10) {
        }
        f40019e = z10;
    }

    public C8581c() {
        this.f40021d = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ C8581c(C9365d c9365d) {
        this();
    }

    @Override // si.C8588j
    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.mo36836e(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        List<String> m36875b = C8588j.f40042c.m36875b(list);
        C9367f.m39525d(parameters, "sslParameters");
        Object[] array = m36875b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0.equals("") != false) goto L12;
     */
    @Override // si.C8588j
    @org.jetbrains.annotations.Nullable
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String mo36837g(@org.jetbrains.annotations.NotNull javax.net.ssl.SSLSocket r4) {
        /*
            r3 = this;
            r0 = r4
            java.lang.String r1 = "sslSocket"
            p372vh.C9367f.m39526e(r0, r1)
            r0 = r4
            boolean r0 = r0 instanceof org.bouncycastle.jsse.BCSSLSocket
            if (r0 == 0) goto L3a
            r0 = r4
            org.bouncycastle.jsse.BCSSLSocket r0 = (org.bouncycastle.jsse.BCSSLSocket) r0
            java.lang.String r0 = r0.getApplicationProtocol()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1e
            goto L35
        L1e:
            r0 = r5
            int r0 = r0.hashCode()
            if (r0 == 0) goto L2a
            r0 = r5
            r4 = r0
            goto L40
        L2a:
            r0 = r5
            r4 = r0
            r0 = r5
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
        L35:
            r0 = 0
            r4 = r0
            goto L40
        L3a:
            r0 = r3
            r1 = r4
            java.lang.String r0 = super.mo36837g(r1)
            r4 = r0
        L40:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.C8581c.mo36837g(javax.net.ssl.SSLSocket):java.lang.String");
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: m */
    public SSLContext mo36850m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f40021d);
        C9367f.m39525d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: o */
    public X509TrustManager mo36851o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        C9367f.m39525d(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C9367f.m39524c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C9367f.m39525d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }
}
