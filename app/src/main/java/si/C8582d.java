package si;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/d.class
 */
/* renamed from: si.d */
/* loaded from: combined.jar:classes2.jar:si/d.class */
public final class C8582d extends C8588j {

    /* renamed from: e */
    public static final boolean f40022e;

    /* renamed from: f */
    public static final a f40023f;

    /* renamed from: d */
    public final Provider f40024d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/d$a.class
     */
    /* renamed from: si.d$a */
    /* loaded from: combined.jar:classes2.jar:si/d$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        /* renamed from: a */
        public final boolean m36856a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            boolean z10 = true;
            if (version.major() != i10) {
                return version.major() > i10;
            }
            if (version.minor() != i11) {
                return version.minor() > i11;
            }
            if (version.patch() < i12) {
                z10 = false;
            }
            return z10;
        }

        @Nullable
        /* renamed from: b */
        public final C8582d m36857b() {
            C8582d c8582d = null;
            if (m36858c()) {
                c8582d = new C8582d(null);
            }
            return c8582d;
        }

        /* renamed from: c */
        public final boolean m36858c() {
            return C8582d.f40022e;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/d$b.class
     */
    /* renamed from: si.d$b */
    /* loaded from: combined.jar:classes2.jar:si/d$b.class */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f40025a = new b();
    }

    static {
        boolean z10;
        a aVar = new a(null);
        f40023f = aVar;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            z10 = false;
            if (Conscrypt.isAvailable()) {
                z10 = false;
                if (aVar.m36856a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError e10) {
            z10 = false;
        }
        f40022e = z10;
    }

    public C8582d() {
        Provider newProvider = Conscrypt.newProvider();
        C9367f.m39525d(newProvider, "Conscrypt.newProvider()");
        this.f40024d = newProvider;
    }

    public /* synthetic */ C8582d(C9365d c9365d) {
        this();
    }

    @Override // si.C8588j
    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo36836e(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = C8588j.f40042c.m36875b(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // si.C8588j
    @Nullable
    /* renamed from: g */
    public String mo36837g(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo36837g(sSLSocket);
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: m */
    public SSLContext mo36850m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f40024d);
        C9367f.m39525d(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: n */
    public SSLSocketFactory mo36855n(@NotNull X509TrustManager x509TrustManager) {
        C9367f.m39526e(x509TrustManager, "trustManager");
        SSLContext mo36850m = mo36850m();
        mo36850m.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = mo36850m.getSocketFactory();
        C9367f.m39525d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: o */
    public X509TrustManager mo36851o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        C9367f.m39525d(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C9367f.m39524c(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f40025a);
            return x509TrustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        C9367f.m39525d(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }
}
