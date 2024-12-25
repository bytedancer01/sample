package p173ji;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kh.C5616j;
import kh.C5624r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p356uh.InterfaceC9185a;
import p372vh.AbstractC9368g;
import p372vh.C9365d;
import p372vh.C9367f;
import p372vh.C9375n;
import p411xi.C9764h;
import vi.AbstractC9378c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/g.class
 */
/* renamed from: ji.g */
/* loaded from: combined.jar:classes2.jar:ji/g.class */
public final class C5411g {

    /* renamed from: a */
    @NotNull
    public final Set<c> f30939a;

    /* renamed from: b */
    @Nullable
    public final AbstractC9378c f30940b;

    /* renamed from: d */
    public static final b f30938d = new b(null);

    /* renamed from: c */
    @NotNull
    public static final C5411g f30937c = new a().m26956a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/g$a.class
     */
    /* renamed from: ji.g$a */
    /* loaded from: combined.jar:classes2.jar:ji/g$a.class */
    public static final class a {

        /* renamed from: a */
        @NotNull
        public final List<c> f30941a = new ArrayList();

        @NotNull
        /* renamed from: a */
        public final C5411g m26956a() {
            return new C5411g(C5624r.m27721J(this.f30941a), null, 2, null);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/g$b.class
     */
    /* renamed from: ji.g$b */
    /* loaded from: combined.jar:classes2.jar:ji/g$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final String m26957a(@NotNull Certificate certificate) {
            C9367f.m39526e(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + m26959c((X509Certificate) certificate).mo41190d();
        }

        @NotNull
        /* renamed from: b */
        public final C9764h m26958b(@NotNull X509Certificate x509Certificate) {
            C9367f.m39526e(x509Certificate, "$this$sha1Hash");
            C9764h.a aVar = C9764h.f44531f;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C9367f.m39525d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C9367f.m39525d(encoded, "publicKey.encoded");
            return C9764h.a.m41208g(aVar, encoded, 0, 0, 3, null).m41206y();
        }

        @NotNull
        /* renamed from: c */
        public final C9764h m26959c(@NotNull X509Certificate x509Certificate) {
            C9367f.m39526e(x509Certificate, "$this$sha256Hash");
            C9764h.a aVar = C9764h.f44531f;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C9367f.m39525d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C9367f.m39525d(encoded, "publicKey.encoded");
            return C9764h.a.m41208g(aVar, encoded, 0, 0, 3, null).m41207z();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/g$c.class
     */
    /* renamed from: ji.g$c */
    /* loaded from: combined.jar:classes2.jar:ji/g$c.class */
    public static final class c {

        /* renamed from: a */
        @NotNull
        public final String f30942a;

        /* renamed from: b */
        @NotNull
        public final String f30943b;

        /* renamed from: c */
        @NotNull
        public final C9764h f30944c;

        @NotNull
        /* renamed from: a */
        public final C9764h m26960a() {
            return this.f30944c;
        }

        @NotNull
        /* renamed from: b */
        public final String m26961b() {
            return this.f30943b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
        
            if (ci.C1129o.m6751S(r10, '.', (r0 - r0) - 1, false, 4, null) == (-1)) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
        
            if (r10.charAt(r0 - 1) == '.') goto L10;
         */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m26962c(@org.jetbrains.annotations.NotNull java.lang.String r10) {
            /*
                Method dump skipped, instructions count: 193
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p173ji.C5411g.c.m26962c(java.lang.String):boolean");
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return ((C9367f.m39522a(this.f30942a, cVar.f30942a) ^ true) || (C9367f.m39522a(this.f30943b, cVar.f30943b) ^ true) || (C9367f.m39522a(this.f30944c, cVar.f30944c) ^ true)) ? false : true;
        }

        public int hashCode() {
            return (((this.f30942a.hashCode() * 31) + this.f30943b.hashCode()) * 31) + this.f30944c.hashCode();
        }

        @NotNull
        public String toString() {
            return this.f30943b + '/' + this.f30944c.mo41190d();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/g$d.class
     */
    /* renamed from: ji.g$d */
    /* loaded from: combined.jar:classes2.jar:ji/g$d.class */
    public static final class d extends AbstractC9368g implements InterfaceC9185a<List<? extends X509Certificate>> {

        /* renamed from: c */
        public final C5411g f30945c;

        /* renamed from: d */
        public final List f30946d;

        /* renamed from: e */
        public final String f30947e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C5411g c5411g, List list, String str) {
            super(0);
            this.f30945c = c5411g;
            this.f30946d = list;
            this.f30947e = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
        
            if (r6 != null) goto L8;
         */
        @Override // p356uh.InterfaceC9185a
        @org.jetbrains.annotations.NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<java.security.cert.X509Certificate> mo20777h() {
            /*
                r5 = this;
                r0 = r5
                ji.g r0 = r0.f30945c
                vi.c r0 = r0.m26954d()
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L20
                r0 = r6
                r1 = r5
                java.util.List r1 = r1.f30946d
                r2 = r5
                java.lang.String r2 = r2.f30947e
                java.util.List r0 = r0.mo37549a(r1, r2)
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L20
                goto L25
            L20:
                r0 = r5
                java.util.List r0 = r0.f30946d
                r6 = r0
            L25:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r2 = r6
                r3 = 10
                int r2 = kh.C5617k.m27708n(r2, r3)
                r1.<init>(r2)
                r7 = r0
                r0 = r6
                java.util.Iterator r0 = r0.iterator()
                r8 = r0
            L3a:
                r0 = r8
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L69
                r0 = r8
                java.lang.Object r0 = r0.next()
                java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L5f
                r0 = r7
                r1 = r6
                java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
                boolean r0 = r0.add(r1)
                goto L3a
            L5f:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
                r1.<init>(r2)
                throw r0
            L69:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p173ji.C5411g.d.mo20777h():java.util.List");
        }
    }

    public C5411g(@NotNull Set<c> set, @Nullable AbstractC9378c abstractC9378c) {
        C9367f.m39526e(set, "pins");
        this.f30939a = set;
        this.f30940b = abstractC9378c;
    }

    public /* synthetic */ C5411g(Set set, AbstractC9378c abstractC9378c, int i10, C9365d c9365d) {
        this(set, (i10 & 2) != 0 ? null : abstractC9378c);
    }

    /* renamed from: a */
    public final void m26951a(@NotNull String str, @NotNull List<? extends Certificate> list) {
        C9367f.m39526e(str, "hostname");
        C9367f.m39526e(list, "peerCertificates");
        m26952b(str, new d(this, list, str));
    }

    /* renamed from: b */
    public final void m26952b(@NotNull String str, @NotNull InterfaceC9185a<? extends List<? extends X509Certificate>> interfaceC9185a) {
        C9367f.m39526e(str, "hostname");
        C9367f.m39526e(interfaceC9185a, "cleanedPeerCertificatesFn");
        List<c> m26953c = m26953c(str);
        if (m26953c.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> mo20777h = interfaceC9185a.mo20777h();
        for (X509Certificate x509Certificate : mo20777h) {
            C9764h c9764h = null;
            C9764h c9764h2 = null;
            for (c cVar : m26953c) {
                String m26961b = cVar.m26961b();
                int hashCode = m26961b.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && m26961b.equals("sha1")) {
                        C9764h c9764h3 = c9764h2;
                        if (c9764h2 == null) {
                            c9764h3 = f30938d.m26958b(x509Certificate);
                        }
                        c9764h2 = c9764h3;
                        if (C9367f.m39522a(cVar.m26960a(), c9764h3)) {
                            return;
                        }
                    }
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.m26961b());
                }
                if (!m26961b.equals("sha256")) {
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.m26961b());
                }
                C9764h c9764h4 = c9764h;
                if (c9764h == null) {
                    c9764h4 = f30938d.m26959c(x509Certificate);
                }
                c9764h = c9764h4;
                if (C9367f.m39522a(cVar.m26960a(), c9764h4)) {
                    return;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : mo20777h) {
            sb2.append("\n    ");
            sb2.append(f30938d.m26957a(x509Certificate2));
            sb2.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            C9367f.m39525d(subjectDN, "element.subjectDN");
            sb2.append(subjectDN.getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (c cVar2 : m26953c) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        C9367f.m39525d(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    @NotNull
    /* renamed from: c */
    public final List<c> m26953c(@NotNull String str) {
        C9367f.m39526e(str, "hostname");
        Set<c> set = this.f30939a;
        List<c> m27700f = C5616j.m27700f();
        for (Object obj : set) {
            if (((c) obj).m26962c(str)) {
                List<c> list = m27700f;
                if (m27700f.isEmpty()) {
                    list = new ArrayList();
                }
                C9375n.m39543a(list).add(obj);
                m27700f = list;
            }
        }
        return m27700f;
    }

    @Nullable
    /* renamed from: d */
    public final AbstractC9378c m26954d() {
        return this.f30940b;
    }

    @NotNull
    /* renamed from: e */
    public final C5411g m26955e(@NotNull AbstractC9378c abstractC9378c) {
        C9367f.m39526e(abstractC9378c, "certificateChainCleaner");
        return C9367f.m39522a(this.f30940b, abstractC9378c) ? this : new C5411g(this.f30939a, abstractC9378c);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z10;
        if (obj instanceof C5411g) {
            C5411g c5411g = (C5411g) obj;
            if (C9367f.m39522a(c5411g.f30939a, this.f30939a) && C9367f.m39522a(c5411g.f30940b, this.f30940b)) {
                z10 = true;
                return z10;
            }
        }
        z10 = false;
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f30939a.hashCode();
        AbstractC9378c abstractC9378c = this.f30940b;
        return ((1517 + hashCode) * 41) + (abstractC9378c != null ? abstractC9378c.hashCode() : 0);
    }
}
