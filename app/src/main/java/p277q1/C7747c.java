package p277q1;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q1/c.class
 */
/* renamed from: q1.c */
/* loaded from: combined.jar:classes1.jar:q1/c.class */
public final class C7747c {

    /* renamed from: e */
    public static final C7747c f37599e;

    /* renamed from: f */
    public static final C7747c f37600f;

    /* renamed from: g */
    public static final C7747c f37601g;

    /* renamed from: h */
    public static final C7747c f37602h;

    /* renamed from: i */
    public static final C7747c f37603i;

    /* renamed from: j */
    public static final C7747c f37604j;

    /* renamed from: a */
    public final float[] f37605a;

    /* renamed from: b */
    public final float[] f37606b;

    /* renamed from: c */
    public final float[] f37607c = new float[3];

    /* renamed from: d */
    public boolean f37608d = true;

    static {
        C7747c c7747c = new C7747c();
        f37599e = c7747c;
        m33884m(c7747c);
        m33887p(c7747c);
        C7747c c7747c2 = new C7747c();
        f37600f = c7747c2;
        m33886o(c7747c2);
        m33887p(c7747c2);
        C7747c c7747c3 = new C7747c();
        f37601g = c7747c3;
        m33883l(c7747c3);
        m33887p(c7747c3);
        C7747c c7747c4 = new C7747c();
        f37602h = c7747c4;
        m33884m(c7747c4);
        m33885n(c7747c4);
        C7747c c7747c5 = new C7747c();
        f37603i = c7747c5;
        m33886o(c7747c5);
        m33885n(c7747c5);
        C7747c c7747c6 = new C7747c();
        f37604j = c7747c6;
        m33883l(c7747c6);
        m33885n(c7747c6);
    }

    public C7747c() {
        float[] fArr = new float[3];
        this.f37605a = fArr;
        float[] fArr2 = new float[3];
        this.f37606b = fArr2;
        m33888r(fArr);
        m33888r(fArr2);
        m33900q();
    }

    /* renamed from: l */
    public static void m33883l(C7747c c7747c) {
        float[] fArr = c7747c.f37606b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    public static void m33884m(C7747c c7747c) {
        float[] fArr = c7747c.f37606b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    public static void m33885n(C7747c c7747c) {
        float[] fArr = c7747c.f37605a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    public static void m33886o(C7747c c7747c) {
        float[] fArr = c7747c.f37606b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    public static void m33887p(C7747c c7747c) {
        float[] fArr = c7747c.f37605a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: r */
    public static void m33888r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float m33889a() {
        return this.f37607c[1];
    }

    /* renamed from: b */
    public float m33890b() {
        return this.f37606b[2];
    }

    /* renamed from: c */
    public float m33891c() {
        return this.f37605a[2];
    }

    /* renamed from: d */
    public float m33892d() {
        return this.f37606b[0];
    }

    /* renamed from: e */
    public float m33893e() {
        return this.f37605a[0];
    }

    /* renamed from: f */
    public float m33894f() {
        return this.f37607c[2];
    }

    /* renamed from: g */
    public float m33895g() {
        return this.f37607c[0];
    }

    /* renamed from: h */
    public float m33896h() {
        return this.f37606b[1];
    }

    /* renamed from: i */
    public float m33897i() {
        return this.f37605a[1];
    }

    /* renamed from: j */
    public boolean m33898j() {
        return this.f37608d;
    }

    /* renamed from: k */
    public void m33899k() {
        float f10;
        int length = this.f37607c.length;
        int i10 = 0;
        float f11 = 0.0f;
        while (true) {
            f10 = f11;
            if (i10 >= length) {
                break;
            }
            float f12 = this.f37607c[i10];
            float f13 = f10;
            if (f12 > 0.0f) {
                f13 = f10 + f12;
            }
            i10++;
            f11 = f13;
        }
        if (f10 != 0.0f) {
            int length2 = this.f37607c.length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] fArr = this.f37607c;
                float f14 = fArr[i11];
                if (f14 > 0.0f) {
                    fArr[i11] = f14 / f10;
                }
            }
        }
    }

    /* renamed from: q */
    public final void m33900q() {
        float[] fArr = this.f37607c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
