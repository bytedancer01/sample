package si;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kh.C5616j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.EnumC5404c0;
import p339ti.C8751b;
import p339ti.C8755f;
import p339ti.C8756g;
import p339ti.C8757h;
import p339ti.C8758i;
import p339ti.C8759j;
import p339ti.C8761l;
import p339ti.InterfaceC8760k;
import p372vh.C9365d;
import p372vh.C9367f;
import vi.AbstractC9378c;
import vi.InterfaceC9380e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:si/b.class
 */
/* renamed from: si.b */
/* loaded from: combined.jar:classes2.jar:si/b.class */
public final class C8580b extends C8588j {

    /* renamed from: f */
    public static final boolean f40013f;

    /* renamed from: g */
    public static final a f40014g = new a(null);

    /* renamed from: d */
    public final List<InterfaceC8760k> f40015d;

    /* renamed from: e */
    public final C8757h f40016e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/b$a.class
     */
    /* renamed from: si.b$a */
    /* loaded from: combined.jar:classes2.jar:si/b$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C8588j m36846a() {
            return m36847b() ? new C8580b() : null;
        }

        /* renamed from: b */
        public final boolean m36847b() {
            return C8580b.f40013f;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:si/b$b.class
     */
    /* renamed from: si.b$b */
    /* loaded from: combined.jar:classes2.jar:si/b$b.class */
    public static final class b implements InterfaceC9380e {

        /* renamed from: a */
        public final X509TrustManager f40017a;

        /* renamed from: b */
        public final Method f40018b;

        public b(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            C9367f.m39526e(x509TrustManager, "trustManager");
            C9367f.m39526e(method, "findByIssuerAndSignatureMethod");
            this.f40017a = x509TrustManager;
            this.f40018b = method;
        }

        @Override // vi.InterfaceC9380e
        @Nullable
        /* renamed from: a */
        public X509Certificate mo36848a(@NotNull X509Certificate x509Certificate) {
            X509Certificate x509Certificate2;
            Object invoke;
            C9367f.m39526e(x509Certificate, "cert");
            try {
                invoke = this.f40018b.invoke(this.f40017a, x509Certificate);
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException e11) {
                x509Certificate2 = null;
            }
            if (invoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            }
            x509Certificate2 = ((TrustAnchor) invoke).getTrustedCert();
            return x509Certificate2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C9367f.m39522a(this.f40017a, bVar.f40017a) && C9367f.m39522a(this.f40018b, bVar.f40018b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f40017a;
            int i10 = 0;
            int hashCode = x509TrustManager != null ? x509TrustManager.hashCode() : 0;
            Method method = this.f40018b;
            if (method != null) {
                i10 = method.hashCode();
            }
            return (hashCode * 31) + i10;
        }

        @NotNull
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f40017a + ", findByIssuerAndSignatureMethod=" + this.f40018b + ")";
        }
    }

    static {
        boolean z10 = false;
        if (C8588j.f40042c.m36881h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f40013f = z10;
    }

    public C8580b() {
        List m27703i = C5616j.m27703i(C8761l.a.m37572b(C8761l.f40738j, null, 1, null), new C8759j(C8755f.f40721g.m37561d()), new C8759j(C8758i.f40735b.m37570a()), new C8759j(C8756g.f40729b.m37565a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m27703i) {
            if (((InterfaceC8760k) obj).mo37544b()) {
                arrayList.add(obj);
            }
        }
        this.f40015d = arrayList;
        this.f40016e = C8757h.f40730d.m37568a();
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: c */
    public AbstractC9378c mo36835c(@NotNull X509TrustManager x509TrustManager) {
        C9367f.m39526e(x509TrustManager, "trustManager");
        C8751b m37550a = C8751b.f40713d.m37550a(x509TrustManager);
        return m37550a != null ? m37550a : super.mo36835c(x509TrustManager);
    }

    @Override // si.C8588j
    @NotNull
    /* renamed from: d */
    public InterfaceC9380e mo36842d(@NotNull X509TrustManager x509TrustManager) {
        InterfaceC9380e mo36842d;
        C9367f.m39526e(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            C9367f.m39525d(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            mo36842d = new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException e10) {
            mo36842d = super.mo36842d(x509TrustManager);
        }
        return mo36842d;
    }

    @Override // si.C8588j
    /* renamed from: e */
    public void mo36836e(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<EnumC5404c0> list) {
        Object obj;
        C9367f.m39526e(sSLSocket, "sslSocket");
        C9367f.m39526e(list, "protocols");
        Iterator<T> it = this.f40015d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC8760k) obj).mo37543a(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC8760k interfaceC8760k = (InterfaceC8760k) obj;
        if (interfaceC8760k != null) {
            interfaceC8760k.mo37546d(sSLSocket, str, list);
        }
    }

    @Override // si.C8588j
    /* renamed from: f */
    public void mo36843f(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int i10) {
        C9367f.m39526e(socket, "socket");
        C9367f.m39526e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // si.C8588j
    @Nullable
    /* renamed from: g */
    public String mo36837g(@NotNull SSLSocket sSLSocket) {
        Object obj;
        C9367f.m39526e(sSLSocket, "sslSocket");
        Iterator<T> it = this.f40015d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC8760k) obj).mo37543a(sSLSocket)) {
                break;
            }
        }
        InterfaceC8760k interfaceC8760k = (InterfaceC8760k) obj;
        String str = null;
        if (interfaceC8760k != null) {
            str = interfaceC8760k.mo37545c(sSLSocket);
        }
        return str;
    }

    @Override // si.C8588j
    @Nullable
    /* renamed from: h */
    public Object mo36844h(@NotNull String str) {
        C9367f.m39526e(str, "closer");
        return this.f40016e.m37566a(str);
    }

    @Override // si.C8588j
    /* renamed from: i */
    public boolean mo36838i(@NotNull String str) {
        boolean z10;
        boolean isCleartextTrafficPermitted;
        C9367f.m39526e(str, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            z10 = isCleartextTrafficPermitted;
        } else if (i10 >= 23) {
            NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            C9367f.m39525d(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
            z10 = networkSecurityPolicy.isCleartextTrafficPermitted();
        } else {
            z10 = true;
        }
        return z10;
    }

    @Override // si.C8588j
    /* renamed from: l */
    public void mo36845l(@NotNull String str, @Nullable Object obj) {
        C9367f.m39526e(str, "message");
        if (this.f40016e.m37567b(obj)) {
            return;
        }
        C8588j.m36872k(this, str, 5, null, 4, null);
    }
}
