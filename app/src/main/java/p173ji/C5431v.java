package p173ji;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kh.C5616j;
import kh.C5617k;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5389h;
import p172jh.InterfaceC5388g;
import p356uh.InterfaceC9185a;
import p372vh.AbstractC9368g;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/v.class
 */
/* renamed from: ji.v */
/* loaded from: combined.jar:classes2.jar:ji/v.class */
public final class C5431v {

    /* renamed from: e */
    public static final a f31136e = new a(null);

    /* renamed from: a */
    @NotNull
    public final InterfaceC5388g f31137a;

    /* renamed from: b */
    @NotNull
    public final EnumC5416i0 f31138b;

    /* renamed from: c */
    @NotNull
    public final C5415i f31139c;

    /* renamed from: d */
    @NotNull
    public final List<Certificate> f31140d;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/v$a.class
     */
    /* renamed from: ji.v$a */
    /* loaded from: combined.jar:classes2.jar:ji/v$a.class */
    public static final class a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:ji/v$a$a.class
         */
        /* renamed from: ji.v$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:ji/v$a$a.class */
        public static final class C10308a extends AbstractC9368g implements InterfaceC9185a<List<? extends Certificate>> {

            /* renamed from: c */
            public final List f31141c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10308a(List list) {
                super(0);
                this.f31141c = list;
            }

            @Override // p356uh.InterfaceC9185a
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> mo20777h() {
                return this.f31141c;
            }
        }

        public a() {
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C5431v m27076a(@NotNull SSLSession sSLSession) {
            List<Certificate> m27700f;
            C9367f.m39526e(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C5415i m26986b = C5415i.f31069s1.m26986b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (C9367f.m39522a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            EnumC5416i0 m26990a = EnumC5416i0.Companion.m26990a(protocol);
            try {
                m27700f = m27077b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException e10) {
                m27700f = C5616j.m27700f();
            }
            return new C5431v(m26990a, m26986b, m27077b(sSLSession.getLocalCertificates()), new C10308a(m27700f));
        }

        /* renamed from: b */
        public final List<Certificate> m27077b(Certificate[] certificateArr) {
            return certificateArr != null ? C5634b.m27800t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : C5616j.m27700f();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/v$b.class
     */
    /* renamed from: ji.v$b */
    /* loaded from: combined.jar:classes2.jar:ji/v$b.class */
    public static final class b extends AbstractC9368g implements InterfaceC9185a<List<? extends Certificate>> {

        /* renamed from: c */
        public final InterfaceC9185a f31142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC9185a interfaceC9185a) {
            super(0);
            this.f31142c = interfaceC9185a;
        }

        @Override // p356uh.InterfaceC9185a
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> mo20777h() {
            List<Certificate> m27700f;
            try {
                m27700f = (List) this.f31142c.mo20777h();
            } catch (SSLPeerUnverifiedException e10) {
                m27700f = C5616j.m27700f();
            }
            return m27700f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5431v(@NotNull EnumC5416i0 enumC5416i0, @NotNull C5415i c5415i, @NotNull List<? extends Certificate> list, @NotNull InterfaceC9185a<? extends List<? extends Certificate>> interfaceC9185a) {
        C9367f.m39526e(enumC5416i0, "tlsVersion");
        C9367f.m39526e(c5415i, "cipherSuite");
        C9367f.m39526e(list, "localCertificates");
        C9367f.m39526e(interfaceC9185a, "peerCertificatesFn");
        this.f31138b = enumC5416i0;
        this.f31139c = c5415i;
        this.f31140d = list;
        this.f31137a = C5389h.m26736a(new b(interfaceC9185a));
    }

    @NotNull
    /* renamed from: a */
    public final C5415i m27071a() {
        return this.f31139c;
    }

    /* renamed from: b */
    public final String m27072b(Certificate certificate) {
        String type;
        if (certificate instanceof X509Certificate) {
            type = ((X509Certificate) certificate).getSubjectDN().toString();
        } else {
            type = certificate.getType();
            C9367f.m39525d(type, "type");
        }
        return type;
    }

    @NotNull
    /* renamed from: c */
    public final List<Certificate> m27073c() {
        return this.f31140d;
    }

    @NotNull
    /* renamed from: d */
    public final List<Certificate> m27074d() {
        return (List) this.f31137a.getValue();
    }

    @NotNull
    /* renamed from: e */
    public final EnumC5416i0 m27075e() {
        return this.f31138b;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10;
        if (obj instanceof C5431v) {
            C5431v c5431v = (C5431v) obj;
            if (c5431v.f31138b == this.f31138b && C9367f.m39522a(c5431v.f31139c, this.f31139c) && C9367f.m39522a(c5431v.m27074d(), m27074d()) && C9367f.m39522a(c5431v.f31140d, this.f31140d)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        return ((((((527 + this.f31138b.hashCode()) * 31) + this.f31139c.hashCode()) * 31) + m27074d().hashCode()) * 31) + this.f31140d.hashCode();
    }

    @NotNull
    public String toString() {
        List<Certificate> m27074d = m27074d();
        ArrayList arrayList = new ArrayList(C5617k.m27708n(m27074d, 10));
        Iterator<T> it = m27074d.iterator();
        while (it.hasNext()) {
            arrayList.add(m27072b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f31138b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f31139c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.f31140d;
        ArrayList arrayList2 = new ArrayList(C5617k.m27708n(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m27072b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
