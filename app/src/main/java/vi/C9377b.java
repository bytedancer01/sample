package vi;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vi/b.class
 */
/* renamed from: vi.b */
/* loaded from: combined.jar:classes2.jar:vi/b.class */
public final class C9377b implements InterfaceC9380e {

    /* renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f42910a;

    public C9377b(@NotNull X509Certificate... x509CertificateArr) {
        C9367f.m39526e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C9367f.m39525d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            Object obj2 = obj;
            if (obj == null) {
                obj2 = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj2);
            }
            ((Set) obj2).add(x509Certificate);
        }
        this.f42910a = linkedHashMap;
    }

    @Override // vi.InterfaceC9380e
    @Nullable
    /* renamed from: a */
    public X509Certificate mo36848a(@NotNull X509Certificate x509Certificate) {
        Object obj;
        boolean z10;
        C9367f.m39526e(x509Certificate, "cert");
        Set<X509Certificate> set = this.f42910a.get(x509Certificate.getIssuerX500Principal());
        X509Certificate x509Certificate2 = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) obj).getPublicKey());
                    z10 = true;
                } catch (Exception e10) {
                    z10 = false;
                }
            } while (!z10);
            x509Certificate2 = (X509Certificate) obj;
        }
        return x509Certificate2;
    }

    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof C9377b) && C9367f.m39522a(((C9377b) obj).f42910a, this.f42910a));
    }

    public int hashCode() {
        return this.f42910a.hashCode();
    }
}
