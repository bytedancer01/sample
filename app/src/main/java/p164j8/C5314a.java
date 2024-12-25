package p164j8;

import com.google.android.exoplayer2.source.rtsp.C2373h;
import java.util.HashMap;
import p059d9.C4349a;
import p059d9.C4401z0;
import p099fc.AbstractC4838v;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/a.class
 */
/* renamed from: j8.a */
/* loaded from: combined.jar:classes2.jar:j8/a.class */
public final class C5314a {

    /* renamed from: a */
    public final String f30511a;

    /* renamed from: b */
    public final int f30512b;

    /* renamed from: c */
    public final String f30513c;

    /* renamed from: d */
    public final int f30514d;

    /* renamed from: e */
    public final int f30515e;

    /* renamed from: f */
    public final String f30516f;

    /* renamed from: g */
    public final String f30517g;

    /* renamed from: h */
    public final String f30518h;

    /* renamed from: i */
    public final AbstractC4838v<String, String> f30519i;

    /* renamed from: j */
    public final c f30520j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:j8/a$b.class
     */
    /* renamed from: j8.a$b */
    /* loaded from: combined.jar:classes2.jar:j8/a$b.class */
    public static final class b {

        /* renamed from: a */
        public final String f30521a;

        /* renamed from: b */
        public final int f30522b;

        /* renamed from: c */
        public final String f30523c;

        /* renamed from: d */
        public final int f30524d;

        /* renamed from: e */
        public final HashMap<String, String> f30525e = new HashMap<>();

        /* renamed from: f */
        public int f30526f = -1;

        /* renamed from: g */
        public String f30527g;

        /* renamed from: h */
        public String f30528h;

        /* renamed from: i */
        public String f30529i;

        public b(String str, int i10, String str2, int i11) {
            this.f30521a = str;
            this.f30522b = i10;
            this.f30523c = str2;
            this.f30524d = i11;
        }

        /* renamed from: i */
        public b m26533i(String str, String str2) {
            this.f30525e.put(str, str2);
            return this;
        }

        /* renamed from: j */
        public C5314a m26534j() {
            try {
                C4349a.m21884g(this.f30525e.containsKey("rtpmap"));
                return new C5314a(this, AbstractC4838v.m24567d(this.f30525e), c.m26539a((String) C4401z0.m22391j(this.f30525e.get("rtpmap"))));
            } catch (C7594k1 e10) {
                throw new IllegalStateException(e10);
            }
        }

        /* renamed from: k */
        public b m26535k(int i10) {
            this.f30526f = i10;
            return this;
        }

        /* renamed from: l */
        public b m26536l(String str) {
            this.f30528h = str;
            return this;
        }

        /* renamed from: m */
        public b m26537m(String str) {
            this.f30529i = str;
            return this;
        }

        /* renamed from: n */
        public b m26538n(String str) {
            this.f30527g = str;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:j8/a$c.class
     */
    /* renamed from: j8.a$c */
    /* loaded from: combined.jar:classes2.jar:j8/a$c.class */
    public static final class c {

        /* renamed from: a */
        public final int f30530a;

        /* renamed from: b */
        public final String f30531b;

        /* renamed from: c */
        public final int f30532c;

        /* renamed from: d */
        public final int f30533d;

        public c(int i10, String str, int i11, int i12) {
            this.f30530a = i10;
            this.f30531b = str;
            this.f30532c = i11;
            this.f30533d = i12;
        }

        /* renamed from: a */
        public static c m26539a(String str) {
            String[] m22356V0 = C4401z0.m22356V0(str, " ");
            C4349a.m21878a(m22356V0.length == 2);
            int m12432e = C2373h.m12432e(m22356V0[0]);
            String[] m22356V02 = C4401z0.m22356V0(m22356V0[1], "/");
            C4349a.m21878a(m22356V02.length >= 2);
            int m12432e2 = C2373h.m12432e(m22356V02[1]);
            int i10 = -1;
            if (m22356V02.length == 3) {
                i10 = C2373h.m12432e(m22356V02[2]);
            }
            return new c(m12432e, m22356V02[0], m12432e2, i10);
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f30530a != cVar.f30530a || !this.f30531b.equals(cVar.f30531b) || this.f30532c != cVar.f30532c || this.f30533d != cVar.f30533d) {
                z10 = false;
            }
            return z10;
        }

        public int hashCode() {
            return ((((((217 + this.f30530a) * 31) + this.f30531b.hashCode()) * 31) + this.f30532c) * 31) + this.f30533d;
        }
    }

    public C5314a(b bVar, AbstractC4838v<String, String> abstractC4838v, c cVar) {
        this.f30511a = bVar.f30521a;
        this.f30512b = bVar.f30522b;
        this.f30513c = bVar.f30523c;
        this.f30514d = bVar.f30524d;
        this.f30516f = bVar.f30527g;
        this.f30517g = bVar.f30528h;
        this.f30515e = bVar.f30526f;
        this.f30518h = bVar.f30529i;
        this.f30519i = abstractC4838v;
        this.f30520j = cVar;
    }

    /* renamed from: a */
    public AbstractC4838v<String, String> m26524a() {
        String str = this.f30519i.get("fmtp");
        if (str == null) {
            return AbstractC4838v.m24568k();
        }
        String[] m22358W0 = C4401z0.m22358W0(str, " ");
        C4349a.m21879b(m22358W0.length == 2, str);
        String[] split = m22358W0[1].split(";\\s?", 0);
        AbstractC4838v.a aVar = new AbstractC4838v.a();
        for (String str2 : split) {
            String[] m22358W02 = C4401z0.m22358W0(str2, "=");
            aVar.m24575c(m22358W02[0], m22358W02[1]);
        }
        return aVar.m24573a();
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5314a.class != obj.getClass()) {
            return false;
        }
        C5314a c5314a = (C5314a) obj;
        if (!this.f30511a.equals(c5314a.f30511a) || this.f30512b != c5314a.f30512b || !this.f30513c.equals(c5314a.f30513c) || this.f30514d != c5314a.f30514d || this.f30515e != c5314a.f30515e || !this.f30519i.equals(c5314a.f30519i) || !this.f30520j.equals(c5314a.f30520j) || !C4401z0.m22371c(this.f30516f, c5314a.f30516f) || !C4401z0.m22371c(this.f30517g, c5314a.f30517g) || !C4401z0.m22371c(this.f30518h, c5314a.f30518h)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f30511a.hashCode();
        int i10 = this.f30512b;
        int hashCode2 = this.f30513c.hashCode();
        int i11 = this.f30514d;
        int i12 = this.f30515e;
        int hashCode3 = this.f30519i.hashCode();
        int hashCode4 = this.f30520j.hashCode();
        String str = this.f30516f;
        int i13 = 0;
        int hashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.f30517g;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f30518h;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((((((((((((((((217 + hashCode) * 31) + i10) * 31) + hashCode2) * 31) + i11) * 31) + i12) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i13;
    }
}
