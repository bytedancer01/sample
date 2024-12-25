package p339ti;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;
import vi.AbstractC9378c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/b.class
 */
/* renamed from: ti.b */
/* loaded from: combined.jar:classes2.jar:ti/b.class */
public final class C8751b extends AbstractC9378c {

    /* renamed from: d */
    public static final a f40713d = new a(null);

    /* renamed from: b */
    public final X509TrustManager f40714b;

    /* renamed from: c */
    public final X509TrustManagerExtensions f40715c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ti/b$a.class
     */
    /* renamed from: ti.b$a */
    /* loaded from: combined.jar:classes2.jar:ti/b$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final C8751b m37550a(@NotNull X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C9367f.m39526e(x509TrustManager, "trustManager");
            C8751b c8751b = null;
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException e10) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                c8751b = new C8751b(x509TrustManager, x509TrustManagerExtensions);
            }
            return c8751b;
        }
    }

    public C8751b(@NotNull X509TrustManager x509TrustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        C9367f.m39526e(x509TrustManager, "trustManager");
        C9367f.m39526e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f40714b = x509TrustManager;
        this.f40715c = x509TrustManagerExtensions;
    }

    @Override // vi.AbstractC9378c
    @NotNull
    /* renamed from: a */
    public List<Certificate> mo37549a(@NotNull List<? extends Certificate> list, @NotNull String str) {
        C9367f.m39526e(list, "chain");
        C9367f.m39526e(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f40715c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            C9367f.m39525d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C8751b) && ((C8751b) obj).f40714b == this.f40714b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f40714b);
    }
}
