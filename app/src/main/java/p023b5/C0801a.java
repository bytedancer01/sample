package p023b5;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b5/a.class
 */
/* renamed from: b5.a */
/* loaded from: combined.jar:classes1.jar:b5/a.class */
public final class C0801a {

    /* renamed from: a */
    public final C0801a f5549a = null;

    /* renamed from: b */
    public final AtomicReference<a> f5550b;

    /* renamed from: c */
    public final int f5551c;

    /* renamed from: d */
    public boolean f5552d;

    /* renamed from: e */
    public final boolean f5553e;

    /* renamed from: f */
    public int[] f5554f;

    /* renamed from: g */
    public int f5555g;

    /* renamed from: h */
    public int f5556h;

    /* renamed from: i */
    public int f5557i;

    /* renamed from: j */
    public int f5558j;

    /* renamed from: k */
    public int f5559k;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b5/a$a.class
     */
    /* renamed from: b5.a$a */
    /* loaded from: combined.jar:classes1.jar:b5/a$a.class */
    public static final class a {

        /* renamed from: a */
        public final int f5560a;

        /* renamed from: b */
        public final int f5561b;

        /* renamed from: c */
        public final int f5562c;

        /* renamed from: d */
        public final int[] f5563d;

        /* renamed from: e */
        public final String[] f5564e;

        /* renamed from: f */
        public final int f5565f;

        /* renamed from: g */
        public final int f5566g;

        public a(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.f5560a = i10;
            this.f5561b = i11;
            this.f5562c = i12;
            this.f5563d = iArr;
            this.f5564e = strArr;
            this.f5565f = i13;
            this.f5566g = i14;
        }

        /* renamed from: a */
        public static a m5127a(int i10) {
            int i11 = i10 << 3;
            return new a(i10, 0, C0801a.m5118a(i10), new int[i11], new String[i10 << 1], i11 - i10, i11);
        }
    }

    public C0801a(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        this.f5551c = i11;
        this.f5552d = z10;
        this.f5553e = z11;
        if (i10 < 16) {
            i12 = 16;
        } else {
            i12 = i10;
            if (((i10 - 1) & i10) != 0) {
                int i13 = 16;
                while (true) {
                    i12 = i13;
                    if (i12 >= i10) {
                        break;
                    } else {
                        i13 = i12 + i12;
                    }
                }
            }
        }
        this.f5550b = new AtomicReference<>(a.m5127a(i12));
    }

    /* renamed from: a */
    public static int m5118a(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    /* renamed from: c */
    public static C0801a m5119c() {
        long currentTimeMillis = System.currentTimeMillis();
        return m5120d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: d */
    public static C0801a m5120d(int i10) {
        return new C0801a(64, true, i10, true);
    }

    /* renamed from: b */
    public final int m5121b() {
        int i10 = this.f5555g;
        return (i10 << 3) - i10;
    }

    /* renamed from: e */
    public int m5122e() {
        int i10 = this.f5556h;
        int i11 = 0;
        int i12 = 3;
        while (i12 < i10) {
            int i13 = i11;
            if (this.f5554f[i12] != 0) {
                i13 = i11 + 1;
            }
            i12 += 4;
            i11 = i13;
        }
        return i11;
    }

    /* renamed from: f */
    public int m5123f() {
        int i10 = this.f5556h + 3;
        int i11 = this.f5557i;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i10 >= i11) {
                return i13;
            }
            int i14 = i13;
            if (this.f5554f[i10] != 0) {
                i14 = i13 + 1;
            }
            i10 += 4;
            i12 = i14;
        }
    }

    /* renamed from: g */
    public int m5124g() {
        return (this.f5559k - m5121b()) >> 2;
    }

    /* renamed from: h */
    public int m5125h() {
        int i10 = this.f5557i + 3;
        int i11 = this.f5555g;
        int i12 = 0;
        int i13 = i10;
        while (i13 < i11 + i10) {
            int i14 = i12;
            if (this.f5554f[i13] != 0) {
                i14 = i12 + 1;
            }
            i13 += 4;
            i12 = i14;
        }
        return i12;
    }

    /* renamed from: i */
    public int m5126i() {
        int i10 = this.f5555g;
        int i11 = 3;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= (i10 << 3)) {
                return i13;
            }
            int i14 = i13;
            if (this.f5554f[i11] != 0) {
                i14 = i13 + 1;
            }
            i11 += 4;
            i12 = i14;
        }
    }

    public String toString() {
        int m5122e = m5122e();
        int m5123f = m5123f();
        int m5125h = m5125h();
        int m5124g = m5124g();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C0801a.class.getName(), Integer.valueOf(this.f5558j), Integer.valueOf(this.f5555g), Integer.valueOf(m5122e), Integer.valueOf(m5123f), Integer.valueOf(m5125h), Integer.valueOf(m5124g), Integer.valueOf(m5122e + m5123f + m5125h + m5124g), Integer.valueOf(m5126i()));
    }
}
