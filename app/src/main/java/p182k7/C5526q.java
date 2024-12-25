package p182k7;

import p057d7.InterfaceC4324g;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:k7/q.class
 */
/* renamed from: k7.q */
/* loaded from: combined.jar:classes2.jar:k7/q.class */
public final class C5526q {

    /* renamed from: a */
    public C5512c f31541a;

    /* renamed from: b */
    public long f31542b;

    /* renamed from: c */
    public long f31543c;

    /* renamed from: d */
    public long f31544d;

    /* renamed from: e */
    public int f31545e;

    /* renamed from: f */
    public int f31546f;

    /* renamed from: m */
    public boolean f31553m;

    /* renamed from: o */
    public C5525p f31555o;

    /* renamed from: q */
    public boolean f31557q;

    /* renamed from: r */
    public long f31558r;

    /* renamed from: s */
    public boolean f31559s;

    /* renamed from: g */
    public long[] f31547g = new long[0];

    /* renamed from: h */
    public int[] f31548h = new int[0];

    /* renamed from: i */
    public int[] f31549i = new int[0];

    /* renamed from: j */
    public int[] f31550j = new int[0];

    /* renamed from: k */
    public long[] f31551k = new long[0];

    /* renamed from: l */
    public boolean[] f31552l = new boolean[0];

    /* renamed from: n */
    public boolean[] f31554n = new boolean[0];

    /* renamed from: p */
    public final C4361f0 f31556p = new C4361f0();

    /* renamed from: a */
    public void m27493a(InterfaceC4324g interfaceC4324g) {
        interfaceC4324g.readFully(this.f31556p.m21988d(), 0, this.f31556p.m21990f());
        this.f31556p.m21983P(0);
        this.f31557q = false;
    }

    /* renamed from: b */
    public void m27494b(C4361f0 c4361f0) {
        c4361f0.m21994j(this.f31556p.m21988d(), 0, this.f31556p.m21990f());
        this.f31556p.m21983P(0);
        this.f31557q = false;
    }

    /* renamed from: c */
    public long m27495c(int i10) {
        return this.f31551k[i10] + this.f31550j[i10];
    }

    /* renamed from: d */
    public void m27496d(int i10) {
        this.f31556p.m21979L(i10);
        this.f31553m = true;
        this.f31557q = true;
    }

    /* renamed from: e */
    public void m27497e(int i10, int i11) {
        this.f31545e = i10;
        this.f31546f = i11;
        if (this.f31548h.length < i10) {
            this.f31547g = new long[i10];
            this.f31548h = new int[i10];
        }
        if (this.f31549i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f31549i = new int[i12];
            this.f31550j = new int[i12];
            this.f31551k = new long[i12];
            this.f31552l = new boolean[i12];
            this.f31554n = new boolean[i12];
        }
    }

    /* renamed from: f */
    public void m27498f() {
        this.f31545e = 0;
        this.f31558r = 0L;
        this.f31559s = false;
        this.f31553m = false;
        this.f31557q = false;
        this.f31555o = null;
    }

    /* renamed from: g */
    public boolean m27499g(int i10) {
        return this.f31553m && this.f31554n[i10];
    }
}
