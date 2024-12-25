package p173ji;

import ci.C1129o;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ji/d.class
 */
/* renamed from: ji.d */
/* loaded from: combined.jar:classes2.jar:ji/d.class */
public final class C5405d {

    /* renamed from: a */
    public final boolean f30869a;

    /* renamed from: b */
    public final boolean f30870b;

    /* renamed from: c */
    public final int f30871c;

    /* renamed from: d */
    public final int f30872d;

    /* renamed from: e */
    public final boolean f30873e;

    /* renamed from: f */
    public final boolean f30874f;

    /* renamed from: g */
    public final boolean f30875g;

    /* renamed from: h */
    public final int f30876h;

    /* renamed from: i */
    public final int f30877i;

    /* renamed from: j */
    public final boolean f30878j;

    /* renamed from: k */
    public final boolean f30879k;

    /* renamed from: l */
    public final boolean f30880l;

    /* renamed from: m */
    public String f30881m;

    /* renamed from: p */
    public static final b f30868p = new b(null);

    /* renamed from: n */
    @NotNull
    public static final C5405d f30866n = new a().m26867d().m26864a();

    /* renamed from: o */
    @NotNull
    public static final C5405d f30867o = new a().m26868e().m26866c(Integer.MAX_VALUE, TimeUnit.SECONDS).m26864a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/d$a.class
     */
    /* renamed from: ji.d$a */
    /* loaded from: combined.jar:classes2.jar:ji/d$a.class */
    public static final class a {

        /* renamed from: a */
        public boolean f30882a;

        /* renamed from: b */
        public boolean f30883b;

        /* renamed from: c */
        public int f30884c = -1;

        /* renamed from: d */
        public int f30885d = -1;

        /* renamed from: e */
        public int f30886e = -1;

        /* renamed from: f */
        public boolean f30887f;

        /* renamed from: g */
        public boolean f30888g;

        /* renamed from: h */
        public boolean f30889h;

        @NotNull
        /* renamed from: a */
        public final C5405d m26864a() {
            return new C5405d(this.f30882a, this.f30883b, this.f30884c, -1, false, false, false, this.f30885d, this.f30886e, this.f30887f, this.f30888g, this.f30889h, null, null);
        }

        /* renamed from: b */
        public final int m26865b(long j10) {
            int i10 = Integer.MAX_VALUE;
            if (j10 <= Integer.MAX_VALUE) {
                i10 = (int) j10;
            }
            return i10;
        }

        @NotNull
        /* renamed from: c */
        public final a m26866c(int i10, @NotNull TimeUnit timeUnit) {
            C9367f.m39526e(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f30885d = m26865b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        @NotNull
        /* renamed from: d */
        public final a m26867d() {
            this.f30882a = true;
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final a m26868e() {
            this.f30887f = true;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ji/d$b.class
     */
    /* renamed from: ji.d$b */
    /* loaded from: combined.jar:classes2.jar:ji/d$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        /* renamed from: a */
        public final int m26869a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (C1129o.m6735C(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
        @org.jetbrains.annotations.NotNull
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p173ji.C5405d m26870b(@org.jetbrains.annotations.NotNull p173ji.C5432w r18) {
            /*
                Method dump skipped, instructions count: 1135
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p173ji.C5405d.b.m26870b(ji.w):ji.d");
        }
    }

    public C5405d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f30869a = z10;
        this.f30870b = z11;
        this.f30871c = i10;
        this.f30872d = i11;
        this.f30873e = z12;
        this.f30874f = z13;
        this.f30875g = z14;
        this.f30876h = i12;
        this.f30877i = i13;
        this.f30878j = z15;
        this.f30879k = z16;
        this.f30880l = z17;
        this.f30881m = str;
    }

    public /* synthetic */ C5405d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, C9365d c9365d) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    /* renamed from: a */
    public final boolean m26855a() {
        return this.f30873e;
    }

    /* renamed from: b */
    public final boolean m26856b() {
        return this.f30874f;
    }

    /* renamed from: c */
    public final int m26857c() {
        return this.f30871c;
    }

    /* renamed from: d */
    public final int m26858d() {
        return this.f30876h;
    }

    /* renamed from: e */
    public final int m26859e() {
        return this.f30877i;
    }

    /* renamed from: f */
    public final boolean m26860f() {
        return this.f30875g;
    }

    /* renamed from: g */
    public final boolean m26861g() {
        return this.f30869a;
    }

    /* renamed from: h */
    public final boolean m26862h() {
        return this.f30870b;
    }

    /* renamed from: i */
    public final boolean m26863i() {
        return this.f30878j;
    }

    @NotNull
    public String toString() {
        String str = this.f30881m;
        String str2 = str;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f30869a) {
                sb2.append("no-cache, ");
            }
            if (this.f30870b) {
                sb2.append("no-store, ");
            }
            if (this.f30871c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f30871c);
                sb2.append(", ");
            }
            if (this.f30872d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f30872d);
                sb2.append(", ");
            }
            if (this.f30873e) {
                sb2.append("private, ");
            }
            if (this.f30874f) {
                sb2.append("public, ");
            }
            if (this.f30875g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f30876h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f30876h);
                sb2.append(", ");
            }
            if (this.f30877i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f30877i);
                sb2.append(", ");
            }
            if (this.f30878j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f30879k) {
                sb2.append("no-transform, ");
            }
            if (this.f30880l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            str2 = sb2.toString();
            C9367f.m39525d(str2, "StringBuilder().apply(builderAction).toString()");
            this.f30881m = str2;
        }
        return str2;
    }
}
