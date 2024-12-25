package si;

import com.amazonaws.services.p045s3.internal.crypto.CryptoRuntime;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kh.C5617k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5402b0;
import p173ji.EnumC5404c0;
import p339ti.C8752c;
import p372vh.C9365d;
import p372vh.C9367f;
import p411xi.C9761e;
import vi.AbstractC9378c;
import vi.C9376a;
import vi.C9377b;
import vi.InterfaceC9380e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/j.class
 */
/* renamed from: si.j */
/* loaded from: combined.jar:classes2.jar:si/j.class */
public class C8588j {

    /* renamed from: a */
    public static volatile C8588j f40040a;

    /* renamed from: b */
    public static final Logger f40041b;

    /* renamed from: c */
    public static final a f40042c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/j$a.class
     */
    /* renamed from: si.j$a */
    /* loaded from: combined.jar:classes2.jar:si/j$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: b */
        public final List<String> m36875b(@NotNull List<? extends EnumC5404c0> list) {
            C9367f.m39526e(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC5404c0) obj) != EnumC5404c0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C5617k.m27708n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC5404c0) it.next()).toString());
            }
            return arrayList2;
        }

        @NotNull
        /* renamed from: c */
        public final byte[] m36876c(@NotNull List<? extends EnumC5404c0> list) {
            C9367f.m39526e(list, "protocols");
            C9761e c9761e = new C9761e();
            for (String str : m36875b(list)) {
                c9761e.writeByte(str.length());
                c9761e.mo41136Q(str);
            }
            return c9761e.m41128J0();
        }

        /* renamed from: d */
        public final C8588j m36877d() {
            C8752c.f40718c.m37552b();
            C8588j m36839a = C8579a.f40011f.m36839a();
            if (m36839a == null) {
                m36839a = C8580b.f40014g.m36846a();
                C9367f.m39524c(m36839a);
            }
            return m36839a;
        }

        /* renamed from: e */
        public final C8588j m36878e() {
            C8587i m36869a;
            C8581c m36852a;
            C8582d m36857b;
            if (m36883j() && (m36857b = C8582d.f40023f.m36857b()) != null) {
                return m36857b;
            }
            if (m36882i() && (m36852a = C8581c.f40020f.m36852a()) != null) {
                return m36852a;
            }
            if (m36884k() && (m36869a = C8587i.f40038f.m36869a()) != null) {
                return m36869a;
            }
            C8586h m36866a = C8586h.f40036e.m36866a();
            if (m36866a != null) {
                return m36866a;
            }
            C8588j m36862a = C8583e.f40026i.m36862a();
            return m36862a != null ? m36862a : new C8588j();
        }

        /* renamed from: f */
        public final C8588j m36879f() {
            return m36881h() ? m36877d() : m36878e();
        }

        @NotNull
        /* renamed from: g */
        public final C8588j m36880g() {
            return C8588j.f40040a;
        }

        /* renamed from: h */
        public final boolean m36881h() {
            return C9367f.m39522a("Dalvik", System.getProperty("java.vm.name"));
        }

        /* renamed from: i */
        public final boolean m36882i() {
            Provider provider = Security.getProviders()[0];
            C9367f.m39525d(provider, "Security.getProviders()[0]");
            return C9367f.m39522a(CryptoRuntime.BOUNCY_CASTLE_PROVIDER, provider.getName());
        }

        /* renamed from: j */
        public final boolean m36883j() {
            Provider provider = Security.getProviders()[0];
            C9367f.m39525d(provider, "Security.getProviders()[0]");
            return C9367f.m39522a("Conscrypt", provider.getName());
        }

        /* renamed from: k */
        public final boolean m36884k() {
            Provider provider = Security.getProviders()[0];
            C9367f.m39525d(provider, "Security.getProviders()[0]");
            return C9367f.m39522a("OpenJSSE", provider.getName());
        }
    }

    static {
        a aVar = new a(null);
        f40042c = aVar;
        f40040a = aVar.m36879f();
        f40041b = Logger.getLogger(C5402b0.class.getName());
    }

    /* renamed from: k */
    public static /* synthetic */ void m36872k(C8588j c8588j, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        c8588j.m36873j(str, i10, th2);
    }

    /* renamed from: b */
    public void mo36859b(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
    }

    @NotNull
    /* renamed from: c */
    public AbstractC9378c mo36835c(@NotNull X509TrustManager x509TrustManager) {
        C9367f.m39526e(x509TrustManager, "trustManager");
        return new C9376a(mo36842d(x509TrustManager));
    }

    @NotNull
    /* renamed from: d */
    public InterfaceC9380e mo36842d(@NotNull X509TrustManager x509TrustManager) {
        C9367f.m39526e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C9367f.m39525d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C9377b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<EnumC5404c0> list) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
    }

    /* renamed from: f */
    public void mo36843f(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int i10) {
        C9367f.m39526e(socket, "socket");
        C9367f.m39526e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    @Nullable
    /* renamed from: g */
    public String mo36837g(@NotNull SSLSocket sSLSocket) {
        C9367f.m39526e(sSLSocket, "sslSocket");
        return null;
    }

    @Nullable
    /* renamed from: h */
    public Object mo36844h(@NotNull String str) {
        C9367f.m39526e(str, "closer");
        return f40041b.isLoggable(Level.FINE) ? new Throwable(str) : null;
    }

    /* renamed from: i */
    public boolean mo36838i(@NotNull String str) {
        C9367f.m39526e(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m36873j(@NotNull String str, int i10, @Nullable Throwable th2) {
        C9367f.m39526e(str, "message");
        f40041b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    /* renamed from: l */
    public void mo36845l(@NotNull String str, @Nullable Object obj) {
        C9367f.m39526e(str, "message");
        String str2 = str;
        if (obj == null) {
            str2 = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m36873j(str2, 5, (Throwable) obj);
    }

    @NotNull
    /* renamed from: m */
    public SSLContext mo36850m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C9367f.m39525d(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    @NotNull
    /* renamed from: n */
    public SSLSocketFactory mo36855n(@NotNull X509TrustManager x509TrustManager) {
        C9367f.m39526e(x509TrustManager, "trustManager");
        try {
            SSLContext mo36850m = mo36850m();
            mo36850m.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = mo36850m.getSocketFactory();
            C9367f.m39525d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    @NotNull
    /* renamed from: o */
    public X509TrustManager mo36851o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    @NotNull
    public String toString() {
        String simpleName = getClass().getSimpleName();
        C9367f.m39525d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
