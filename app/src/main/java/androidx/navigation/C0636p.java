package androidx.navigation;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/navigation/p.class
 */
/* renamed from: androidx.navigation.p */
/* loaded from: combined.jar:classes1.jar:androidx/navigation/p.class */
public final class C0636p {

    /* renamed from: a */
    public boolean f4283a;

    /* renamed from: b */
    public int f4284b;

    /* renamed from: c */
    public boolean f4285c;

    /* renamed from: d */
    public int f4286d;

    /* renamed from: e */
    public int f4287e;

    /* renamed from: f */
    public int f4288f;

    /* renamed from: g */
    public int f4289g;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/navigation/p$a.class
     */
    /* renamed from: androidx.navigation.p$a */
    /* loaded from: combined.jar:classes1.jar:androidx/navigation/p$a.class */
    public static final class a {

        /* renamed from: a */
        public boolean f4290a;

        /* renamed from: c */
        public boolean f4292c;

        /* renamed from: b */
        public int f4291b = -1;

        /* renamed from: d */
        public int f4293d = -1;

        /* renamed from: e */
        public int f4294e = -1;

        /* renamed from: f */
        public int f4295f = -1;

        /* renamed from: g */
        public int f4296g = -1;

        /* renamed from: a */
        public C0636p m3600a() {
            return new C0636p(this.f4290a, this.f4291b, this.f4292c, this.f4293d, this.f4294e, this.f4295f, this.f4296g);
        }

        /* renamed from: b */
        public a m3601b(int i10) {
            this.f4293d = i10;
            return this;
        }

        /* renamed from: c */
        public a m3602c(int i10) {
            this.f4294e = i10;
            return this;
        }

        /* renamed from: d */
        public a m3603d(boolean z10) {
            this.f4290a = z10;
            return this;
        }

        /* renamed from: e */
        public a m3604e(int i10) {
            this.f4295f = i10;
            return this;
        }

        /* renamed from: f */
        public a m3605f(int i10) {
            this.f4296g = i10;
            return this;
        }

        /* renamed from: g */
        public a m3606g(int i10, boolean z10) {
            this.f4291b = i10;
            this.f4292c = z10;
            return this;
        }
    }

    public C0636p(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14) {
        this.f4283a = z10;
        this.f4284b = i10;
        this.f4285c = z11;
        this.f4286d = i11;
        this.f4287e = i12;
        this.f4288f = i13;
        this.f4289g = i14;
    }

    /* renamed from: a */
    public int m3593a() {
        return this.f4286d;
    }

    /* renamed from: b */
    public int m3594b() {
        return this.f4287e;
    }

    /* renamed from: c */
    public int m3595c() {
        return this.f4288f;
    }

    /* renamed from: d */
    public int m3596d() {
        return this.f4289g;
    }

    /* renamed from: e */
    public int m3597e() {
        return this.f4284b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0636p.class != obj.getClass()) {
            return false;
        }
        C0636p c0636p = (C0636p) obj;
        if (this.f4283a != c0636p.f4283a || this.f4284b != c0636p.f4284b || this.f4285c != c0636p.f4285c || this.f4286d != c0636p.f4286d || this.f4287e != c0636p.f4287e || this.f4288f != c0636p.f4288f || this.f4289g != c0636p.f4289g) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public boolean m3598f() {
        return this.f4285c;
    }

    /* renamed from: g */
    public boolean m3599g() {
        return this.f4283a;
    }

    public int hashCode() {
        return ((((((((((((m3599g() ? 1 : 0) * 31) + m3597e()) * 31) + (m3598f() ? 1 : 0)) * 31) + m3593a()) * 31) + m3594b()) * 31) + m3595c()) * 31) + m3596d();
    }
}
