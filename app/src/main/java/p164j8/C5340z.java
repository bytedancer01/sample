package p164j8;

import android.net.Uri;
import java.util.HashMap;
import p059d9.C4401z0;
import p099fc.AbstractC4834t;
import p099fc.AbstractC4838v;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/z.class
 */
/* renamed from: j8.z */
/* loaded from: combined.jar:classes2.jar:j8/z.class */
public final class C5340z {

    /* renamed from: a */
    public final AbstractC4838v<String, String> f30616a;

    /* renamed from: b */
    public final AbstractC4834t<C5314a> f30617b;

    /* renamed from: c */
    public final String f30618c;

    /* renamed from: d */
    public final String f30619d;

    /* renamed from: e */
    public final String f30620e;

    /* renamed from: f */
    public final int f30621f;

    /* renamed from: g */
    public final Uri f30622g;

    /* renamed from: h */
    public final String f30623h;

    /* renamed from: i */
    public final String f30624i;

    /* renamed from: j */
    public final String f30625j;

    /* renamed from: k */
    public final String f30626k;

    /* renamed from: l */
    public final String f30627l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:j8/z$b.class
     */
    /* renamed from: j8.z$b */
    /* loaded from: combined.jar:classes2.jar:j8/z$b.class */
    public static final class b {

        /* renamed from: a */
        public final HashMap<String, String> f30628a = new HashMap<>();

        /* renamed from: b */
        public final AbstractC4834t.a<C5314a> f30629b = new AbstractC4834t.a<>();

        /* renamed from: c */
        public int f30630c = -1;

        /* renamed from: d */
        public String f30631d;

        /* renamed from: e */
        public String f30632e;

        /* renamed from: f */
        public String f30633f;

        /* renamed from: g */
        public Uri f30634g;

        /* renamed from: h */
        public String f30635h;

        /* renamed from: i */
        public String f30636i;

        /* renamed from: j */
        public String f30637j;

        /* renamed from: k */
        public String f30638k;

        /* renamed from: l */
        public String f30639l;

        /* renamed from: m */
        public b m26605m(String str, String str2) {
            this.f30628a.put(str, str2);
            return this;
        }

        /* renamed from: n */
        public b m26606n(C5314a c5314a) {
            this.f30629b.m24554d(c5314a);
            return this;
        }

        /* renamed from: o */
        public C5340z m26607o() {
            if (this.f30631d == null || this.f30632e == null || this.f30633f == null) {
                throw new IllegalStateException("One of more mandatory SDP fields are not set.");
            }
            return new C5340z(this);
        }

        /* renamed from: p */
        public b m26608p(int i10) {
            this.f30630c = i10;
            return this;
        }

        /* renamed from: q */
        public b m26609q(String str) {
            this.f30635h = str;
            return this;
        }

        /* renamed from: r */
        public b m26610r(String str) {
            this.f30638k = str;
            return this;
        }

        /* renamed from: s */
        public b m26611s(String str) {
            this.f30636i = str;
            return this;
        }

        /* renamed from: t */
        public b m26612t(String str) {
            this.f30632e = str;
            return this;
        }

        /* renamed from: u */
        public b m26613u(String str) {
            this.f30639l = str;
            return this;
        }

        /* renamed from: v */
        public b m26614v(String str) {
            this.f30637j = str;
            return this;
        }

        /* renamed from: w */
        public b m26615w(String str) {
            this.f30631d = str;
            return this;
        }

        /* renamed from: x */
        public b m26616x(String str) {
            this.f30633f = str;
            return this;
        }

        /* renamed from: y */
        public b m26617y(Uri uri) {
            this.f30634g = uri;
            return this;
        }
    }

    public C5340z(b bVar) {
        this.f30616a = AbstractC4838v.m24567d(bVar.f30628a);
        this.f30617b = bVar.f30629b.m24555e();
        this.f30618c = (String) C4401z0.m22391j(bVar.f30631d);
        this.f30619d = (String) C4401z0.m22391j(bVar.f30632e);
        this.f30620e = (String) C4401z0.m22391j(bVar.f30633f);
        this.f30622g = bVar.f30634g;
        this.f30623h = bVar.f30635h;
        this.f30621f = bVar.f30630c;
        this.f30624i = bVar.f30636i;
        this.f30625j = bVar.f30638k;
        this.f30626k = bVar.f30639l;
        this.f30627l = bVar.f30637j;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5340z.class != obj.getClass()) {
            return false;
        }
        C5340z c5340z = (C5340z) obj;
        if (this.f30621f != c5340z.f30621f || !this.f30616a.equals(c5340z.f30616a) || !this.f30617b.equals(c5340z.f30617b) || !this.f30619d.equals(c5340z.f30619d) || !this.f30618c.equals(c5340z.f30618c) || !this.f30620e.equals(c5340z.f30620e) || !C4401z0.m22371c(this.f30627l, c5340z.f30627l) || !C4401z0.m22371c(this.f30622g, c5340z.f30622g) || !C4401z0.m22371c(this.f30625j, c5340z.f30625j) || !C4401z0.m22371c(this.f30626k, c5340z.f30626k) || !C4401z0.m22371c(this.f30623h, c5340z.f30623h) || !C4401z0.m22371c(this.f30624i, c5340z.f30624i)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f30616a.hashCode();
        int hashCode2 = this.f30617b.hashCode();
        int hashCode3 = this.f30619d.hashCode();
        int hashCode4 = this.f30618c.hashCode();
        int hashCode5 = this.f30620e.hashCode();
        int i10 = this.f30621f;
        String str = this.f30627l;
        int i11 = 0;
        int hashCode6 = str == null ? 0 : str.hashCode();
        Uri uri = this.f30622g;
        int hashCode7 = uri == null ? 0 : uri.hashCode();
        String str2 = this.f30625j;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f30626k;
        int hashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f30623h;
        int hashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f30624i;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return ((((((((((((((((((((((217 + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i10) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i11;
    }
}
