package tg;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import p411xi.C9764h;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/f.class
 */
/* renamed from: tg.f */
/* loaded from: combined.jar:classes2.jar:tg/f.class */
public final class C8730f {

    /* renamed from: b */
    public static final C8730f f40603b = new b().m37336b();

    /* renamed from: a */
    public final Map<String, List<C9764h>> f40604a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/f$b.class
     */
    /* renamed from: tg.f$b */
    /* loaded from: combined.jar:classes2.jar:tg/f$b.class */
    public static final class b {

        /* renamed from: a */
        public final Map<String, List<C9764h>> f40605a = new LinkedHashMap();

        /* renamed from: b */
        public C8730f m37336b() {
            return new C8730f(this);
        }
    }

    public C8730f(b bVar) {
        this.f40604a = C9183h.m38694n(bVar.f40605a);
    }

    /* renamed from: b */
    public static C9764h m37333b(X509Certificate x509Certificate) {
        return C9183h.m38696p(C9764h.m41184t(x509Certificate.getPublicKey().getEncoded()));
    }

    /* renamed from: a */
    public void m37334a(String str, Certificate... certificateArr) {
        List<C9764h> list = this.f40604a.get(str);
        if (list == null) {
            return;
        }
        for (Certificate certificate : certificateArr) {
            if (list.contains(m37333b((X509Certificate) certificate))) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (Certificate certificate2 : certificateArr) {
            X509Certificate x509Certificate = (X509Certificate) certificate2;
            sb2.append("\n    sha1/");
            sb2.append(m37333b(x509Certificate).mo41190d());
            sb2.append(": ");
            sb2.append(x509Certificate.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (C9764h c9764h : list) {
            sb2.append("\n    sha1/");
            sb2.append(c9764h.mo41190d());
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }
}
