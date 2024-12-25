package tg;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/n.class
 */
/* renamed from: tg.n */
/* loaded from: combined.jar:classes2.jar:tg/n.class */
public final class C8738n {

    /* renamed from: a */
    public final String f40643a;

    /* renamed from: b */
    public final List<Certificate> f40644b;

    /* renamed from: c */
    public final List<Certificate> f40645c;

    public C8738n(String str, List<Certificate> list, List<Certificate> list2) {
        this.f40643a = str;
        this.f40644b = list;
        this.f40645c = list2;
    }

    /* renamed from: b */
    public static C8738n m37391b(String str, List<Certificate> list, List<Certificate> list2) {
        if (str != null) {
            return new C8738n(str, C9183h.m38692l(list), C9183h.m38692l(list2));
        }
        throw new IllegalArgumentException("cipherSuite == null");
    }

    /* renamed from: c */
    public static C8738n m37392c(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException e10) {
            certificateArr = null;
        }
        List m38693m = certificateArr != null ? C9183h.m38693m(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C8738n(cipherSuite, m38693m, localCertificates != null ? C9183h.m38693m(localCertificates) : Collections.emptyList());
    }

    /* renamed from: a */
    public String m37393a() {
        return this.f40643a;
    }

    /* renamed from: d */
    public List<Certificate> m37394d() {
        return this.f40645c;
    }

    /* renamed from: e */
    public List<Certificate> m37395e() {
        return this.f40644b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8738n)) {
            return false;
        }
        C8738n c8738n = (C8738n) obj;
        boolean z10 = false;
        if (this.f40643a.equals(c8738n.f40643a)) {
            z10 = false;
            if (this.f40644b.equals(c8738n.f40644b)) {
                z10 = false;
                if (this.f40645c.equals(c8738n.f40645c)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        return ((((527 + this.f40643a.hashCode()) * 31) + this.f40644b.hashCode()) * 31) + this.f40645c.hashCode();
    }
}
