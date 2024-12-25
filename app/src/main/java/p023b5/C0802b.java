package p023b5;

import p397x4.C9653c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b5/b.class
 */
/* renamed from: b5.b */
/* loaded from: combined.jar:classes1.jar:b5/b.class */
public final class C0802b {

    /* renamed from: l */
    public static final C0802b f5567l = new C0802b();

    /* renamed from: a */
    public C0802b f5568a;

    /* renamed from: b */
    public final int f5569b;

    /* renamed from: c */
    public final int f5570c;

    /* renamed from: d */
    public boolean f5571d;

    /* renamed from: e */
    public String[] f5572e;

    /* renamed from: f */
    public a[] f5573f;

    /* renamed from: g */
    public int f5574g;

    /* renamed from: h */
    public int f5575h;

    /* renamed from: i */
    public int f5576i;

    /* renamed from: j */
    public int f5577j;

    /* renamed from: k */
    public boolean f5578k;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:b5/b$a.class
     */
    /* renamed from: b5.b$a */
    /* loaded from: combined.jar:classes1.jar:b5/b$a.class */
    public static final class a {
    }

    public C0802b() {
        this.f5571d = true;
        this.f5570c = -1;
        this.f5578k = true;
        this.f5569b = 0;
        this.f5577j = 0;
        m5131d(64);
    }

    public C0802b(C0802b c0802b, int i10, String[] strArr, a[] aVarArr, int i11, int i12, int i13) {
        this.f5568a = c0802b;
        this.f5570c = i10;
        this.f5571d = C9653c.a.CANONICALIZE_FIELD_NAMES.enabledIn(i10);
        this.f5572e = strArr;
        this.f5573f = aVarArr;
        this.f5574g = i11;
        this.f5569b = i12;
        int length = strArr.length;
        this.f5575h = m5128a(length);
        this.f5576i = length - 1;
        this.f5577j = i13;
        this.f5578k = false;
    }

    /* renamed from: a */
    public static int m5128a(int i10) {
        return i10 - (i10 >> 2);
    }

    /* renamed from: b */
    public static C0802b m5129b() {
        long currentTimeMillis = System.currentTimeMillis();
        return m5130c((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: c */
    public static C0802b m5130c(int i10) {
        return f5567l.m5132e(i10);
    }

    /* renamed from: d */
    public final void m5131d(int i10) {
        this.f5572e = new String[i10];
        this.f5573f = new a[i10 >> 1];
        this.f5576i = i10 - 1;
        this.f5574g = 0;
        this.f5577j = 0;
        this.f5575h = m5128a(i10);
    }

    /* renamed from: e */
    public final C0802b m5132e(int i10) {
        return new C0802b(null, -1, this.f5572e, this.f5573f, this.f5574g, i10, this.f5577j);
    }
}
