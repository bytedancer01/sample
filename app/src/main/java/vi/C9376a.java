package vi;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vi/a.class
 */
/* renamed from: vi.a */
/* loaded from: combined.jar:classes2.jar:vi/a.class */
public final class C9376a extends AbstractC9378c {

    /* renamed from: c */
    public static final a f42908c = new a(null);

    /* renamed from: b */
    public final InterfaceC9380e f42909b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vi/a$a.class
     */
    /* renamed from: vi.a$a */
    /* loaded from: combined.jar:classes2.jar:vi/a$a.class */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    public C9376a(@NotNull InterfaceC9380e interfaceC9380e) {
        C9367f.m39526e(interfaceC9380e, "trustRootIndex");
        this.f42909b = interfaceC9380e;
    }

    @Override // vi.AbstractC9378c
    @NotNull
    /* renamed from: a */
    public List<Certificate> mo37549a(@NotNull List<? extends Certificate> list, @NotNull String str) {
        C9367f.m39526e(list, "chain");
        C9367f.m39526e(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C9367f.m39525d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate mo36848a = this.f42909b.mo36848a(x509Certificate);
            if (mo36848a == null) {
                Iterator it = arrayDeque.iterator();
                C9367f.m39525d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m39552b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || (!C9367f.m39522a(x509Certificate, mo36848a))) {
                arrayList.add(mo36848a);
            }
            if (m39552b(mo36848a, mo36848a)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* renamed from: b */
    public final boolean m39552b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        boolean z10 = true;
        if (!C9367f.m39522a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
        } catch (GeneralSecurityException e10) {
            z10 = false;
        }
        return z10;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10 = true;
        if (obj != this && (!(obj instanceof C9376a) || !C9367f.m39522a(((C9376a) obj).f42909b, this.f42909b))) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return this.f42909b.hashCode();
    }
}
