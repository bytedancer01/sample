package tg;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpHeaders;
import org.apache.http.cookie.ClientCookie;
import vg.C9349d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:tg/d.class
 */
/* renamed from: tg.d */
/* loaded from: combined.jar:classes2.jar:tg/d.class */
public final class C8728d {

    /* renamed from: k */
    public static final C8728d f40576k = new b().m37328c().m37326a();

    /* renamed from: l */
    public static final C8728d f40577l = new b().m37330e().m37327b(Integer.MAX_VALUE, TimeUnit.SECONDS).m37326a();

    /* renamed from: a */
    public final boolean f40578a;

    /* renamed from: b */
    public final boolean f40579b;

    /* renamed from: c */
    public final int f40580c;

    /* renamed from: d */
    public final int f40581d;

    /* renamed from: e */
    public final boolean f40582e;

    /* renamed from: f */
    public final boolean f40583f;

    /* renamed from: g */
    public final int f40584g;

    /* renamed from: h */
    public final int f40585h;

    /* renamed from: i */
    public final boolean f40586i;

    /* renamed from: j */
    public final boolean f40587j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:tg/d$b.class
     */
    /* renamed from: tg.d$b */
    /* loaded from: combined.jar:classes2.jar:tg/d$b.class */
    public static final class b {

        /* renamed from: a */
        public boolean f40588a;

        /* renamed from: b */
        public boolean f40589b;

        /* renamed from: c */
        public int f40590c = -1;

        /* renamed from: d */
        public int f40591d = -1;

        /* renamed from: e */
        public int f40592e = -1;

        /* renamed from: f */
        public boolean f40593f;

        /* renamed from: g */
        public boolean f40594g;

        /* renamed from: a */
        public C8728d m37326a() {
            return new C8728d(this);
        }

        /* renamed from: b */
        public b m37327b(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f40591d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        /* renamed from: c */
        public b m37328c() {
            this.f40588a = true;
            return this;
        }

        /* renamed from: d */
        public b m37329d() {
            this.f40589b = true;
            return this;
        }

        /* renamed from: e */
        public b m37330e() {
            this.f40593f = true;
            return this;
        }
    }

    public C8728d(b bVar) {
        this.f40578a = bVar.f40588a;
        this.f40579b = bVar.f40589b;
        this.f40580c = bVar.f40590c;
        this.f40581d = -1;
        this.f40582e = false;
        this.f40583f = false;
        this.f40584g = bVar.f40591d;
        this.f40585h = bVar.f40592e;
        this.f40586i = bVar.f40593f;
        this.f40587j = bVar.f40594g;
    }

    public C8728d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15) {
        this.f40578a = z10;
        this.f40579b = z11;
        this.f40580c = i10;
        this.f40581d = i11;
        this.f40582e = z12;
        this.f40583f = z13;
        this.f40584g = i12;
        this.f40585h = i13;
        this.f40586i = z14;
        this.f40587j = z15;
    }

    /* renamed from: h */
    public static C8728d m37318h(C8739o c8739o) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        String str;
        boolean z16;
        boolean z17;
        int i14;
        int i15;
        boolean z18;
        boolean z19;
        int i16;
        int i17;
        boolean z20;
        int i18 = 0;
        boolean z21 = false;
        boolean z22 = false;
        int i19 = -1;
        int i20 = -1;
        boolean z23 = false;
        boolean z24 = false;
        int i21 = -1;
        int i22 = -1;
        boolean z25 = false;
        boolean z26 = false;
        while (true) {
            boolean z27 = z26;
            if (i18 >= c8739o.m37401f()) {
                return new C8728d(z21, z22, i19, i20, z23, z24, i21, i22, z25, z27);
            }
            if (c8739o.m37399d(i18).equalsIgnoreCase("Cache-Control") || c8739o.m37399d(i18).equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                String m37402g = c8739o.m37402g(i18);
                int i23 = 0;
                while (true) {
                    z10 = z21;
                    z11 = z22;
                    i10 = i19;
                    i11 = i20;
                    z12 = z23;
                    z13 = z24;
                    i12 = i21;
                    i13 = i22;
                    z14 = z25;
                    z15 = z27;
                    if (i23 < m37402g.length()) {
                        int m39399b = C9349d.m39399b(m37402g, i23, "=,;");
                        String trim = m37402g.substring(i23, m39399b).trim();
                        if (m39399b == m37402g.length() || m37402g.charAt(m39399b) == ',' || m37402g.charAt(m39399b) == ';') {
                            str = null;
                            i23 = m39399b + 1;
                        } else {
                            int m39400c = C9349d.m39400c(m37402g, m39399b + 1);
                            if (m39400c >= m37402g.length() || m37402g.charAt(m39400c) != '\"') {
                                i23 = C9349d.m39399b(m37402g, m39400c, ",;");
                                str = m37402g.substring(m39400c, i23).trim();
                            } else {
                                int i24 = m39400c + 1;
                                int m39399b2 = C9349d.m39399b(m37402g, i24, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                                str = m37402g.substring(i24, m39399b2);
                                i23 = m39399b2 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            z16 = true;
                            z17 = z22;
                            i14 = i19;
                            i15 = i20;
                            z18 = z23;
                            z19 = z24;
                            i16 = i21;
                            i17 = i22;
                            z20 = z25;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            z17 = true;
                            z16 = z21;
                            i14 = i19;
                            i15 = i20;
                            z18 = z23;
                            z19 = z24;
                            i16 = i21;
                            i17 = i22;
                            z20 = z25;
                        } else if (ClientCookie.MAX_AGE_ATTR.equalsIgnoreCase(trim)) {
                            i14 = C9349d.m39398a(str, -1);
                            z16 = z21;
                            z17 = z22;
                            i15 = i20;
                            z18 = z23;
                            z19 = z24;
                            i16 = i21;
                            i17 = i22;
                            z20 = z25;
                        } else if ("s-maxage".equalsIgnoreCase(trim)) {
                            i15 = C9349d.m39398a(str, -1);
                            z16 = z21;
                            z17 = z22;
                            i14 = i19;
                            z18 = z23;
                            z19 = z24;
                            i16 = i21;
                            i17 = i22;
                            z20 = z25;
                        } else if ("public".equalsIgnoreCase(trim)) {
                            z18 = true;
                            z16 = z21;
                            z17 = z22;
                            i14 = i19;
                            i15 = i20;
                            z19 = z24;
                            i16 = i21;
                            i17 = i22;
                            z20 = z25;
                        } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                            z19 = true;
                            z16 = z21;
                            z17 = z22;
                            i14 = i19;
                            i15 = i20;
                            z18 = z23;
                            i16 = i21;
                            i17 = i22;
                            z20 = z25;
                        } else if ("max-stale".equalsIgnoreCase(trim)) {
                            i16 = C9349d.m39398a(str, Integer.MAX_VALUE);
                            z16 = z21;
                            z17 = z22;
                            i14 = i19;
                            i15 = i20;
                            z18 = z23;
                            z19 = z24;
                            i17 = i22;
                            z20 = z25;
                        } else if ("min-fresh".equalsIgnoreCase(trim)) {
                            i17 = C9349d.m39398a(str, -1);
                            z16 = z21;
                            z17 = z22;
                            i14 = i19;
                            i15 = i20;
                            z18 = z23;
                            z19 = z24;
                            i16 = i21;
                            z20 = z25;
                        } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                            z20 = true;
                            z16 = z21;
                            z17 = z22;
                            i14 = i19;
                            i15 = i20;
                            z18 = z23;
                            z19 = z24;
                            i16 = i21;
                            i17 = i22;
                        } else {
                            z16 = z21;
                            z17 = z22;
                            i14 = i19;
                            i15 = i20;
                            z18 = z23;
                            z19 = z24;
                            i16 = i21;
                            i17 = i22;
                            z20 = z25;
                            if ("no-transform".equalsIgnoreCase(trim)) {
                                z27 = true;
                                z20 = z25;
                                i17 = i22;
                                i16 = i21;
                                z19 = z24;
                                z18 = z23;
                                i15 = i20;
                                i14 = i19;
                                z17 = z22;
                                z16 = z21;
                            }
                        }
                        z21 = z16;
                        z22 = z17;
                        i19 = i14;
                        i20 = i15;
                        z23 = z18;
                        z24 = z19;
                        i21 = i16;
                        i22 = i17;
                        z25 = z20;
                    }
                }
            } else {
                z10 = z21;
                z11 = z22;
                i10 = i19;
                i11 = i20;
                z12 = z23;
                z13 = z24;
                i12 = i21;
                i13 = i22;
                z14 = z25;
                z15 = z27;
            }
            i18++;
            z21 = z10;
            z22 = z11;
            i19 = i10;
            i20 = i11;
            z23 = z12;
            z24 = z13;
            i21 = i12;
            i22 = i13;
            z25 = z14;
            z26 = z15;
        }
    }

    /* renamed from: a */
    public int m37319a() {
        return this.f40580c;
    }

    /* renamed from: b */
    public int m37320b() {
        return this.f40584g;
    }

    /* renamed from: c */
    public int m37321c() {
        return this.f40585h;
    }

    /* renamed from: d */
    public boolean m37322d() {
        return this.f40583f;
    }

    /* renamed from: e */
    public boolean m37323e() {
        return this.f40578a;
    }

    /* renamed from: f */
    public boolean m37324f() {
        return this.f40579b;
    }

    /* renamed from: g */
    public boolean m37325g() {
        return this.f40586i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f40578a) {
            sb2.append("no-cache, ");
        }
        if (this.f40579b) {
            sb2.append("no-store, ");
        }
        if (this.f40580c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f40580c);
            sb2.append(", ");
        }
        if (this.f40581d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f40581d);
            sb2.append(", ");
        }
        if (this.f40582e) {
            sb2.append("public, ");
        }
        if (this.f40583f) {
            sb2.append("must-revalidate, ");
        }
        if (this.f40584g != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f40584g);
            sb2.append(", ");
        }
        if (this.f40585h != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f40585h);
            sb2.append(", ");
        }
        if (this.f40586i) {
            sb2.append("only-if-cached, ");
        }
        if (this.f40587j) {
            sb2.append("no-transform, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }
}
