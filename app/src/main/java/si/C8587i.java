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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p173ji.EnumC5404c0;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/i.class
 */
/* renamed from: si.i */
/* loaded from: combined.jar:classes2.jar:si/i.class */
public final class C8587i extends C8588j {

    /* renamed from: e */
    public static final boolean f40037e;

    /* renamed from: f */
    public static final a f40038f;

    /* renamed from: d */
    public final Provider f40039d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/i$a.class
     */
    /* renamed from: si.i$a */
    /* loaded from: combined.jar:classes2.jar:si/i$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C8587i m36869a() {
            C8587i c8587i = null;
            if (m36870b()) {
                c8587i = new C8587i(null);
            }
            return c8587i;
        }

        /* renamed from: b */
        public final boolean m36870b() {
            return C8587i.f40037e;
        }
    }

    static {
        a aVar = new a(null);
        f40038f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException e10) {
        }
        f40037e = z10;
    }

    public C8587i() {
        this.f40039d = new OpenJSSE();
    }

    public /* synthetic */ C8587i(C9365d c9365d) {
        this();
    }

    @Override // si.C8588j
    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.mo36836e(sSLSocket, str, list);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = C8588j.f40042c.m36875b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
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
            boolean r0 = r0 instanceof org.openjsse.javax.net.ssl.SSLSocket
            if (r0 == 0) goto L38
            r0 = r4
            org.openjsse.javax.net.ssl.SSLSocket r0 = (org.openjsse.javax.net.ssl.SSLSocket) r0
            java.lang.String r0 = r0.getApplicationProtocol()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1c
            goto L33
        L1c:
            r0 = r5
            int r0 = r0.hashCode()
            if (r0 == 0) goto L28
            r0 = r5
            r4 = r0
            goto L3e
        L28:
            r0 = r5
            r4 = r0
            r0 = r5
            java.lang.String r1 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
        L33:
            r0 = 0
            r4 = r0
            goto L3e
        L38:
            r0 = r3
            r1 = r4
            java.lang.String r0 = super.mo36837g(r1)
            r4 = r0
        L3e:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: si.C8587i.mo36837g(javax.net.ssl.SSLSocket):java.lang.String");
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: m */
    public SSLContext mo36850m() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f40039d);
        C9367f.m39525d(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: o */
    public X509TrustManager mo36851o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f40039d);
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
