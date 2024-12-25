package ke;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ke/m.class
 */
/* renamed from: ke.m */
/* loaded from: combined.jar:classes2.jar:ke/m.class */
public final class C5583m {

    /* renamed from: a */
    public int f31658a = 0;

    /* renamed from: b */
    public a f31659b = a.NUMERIC;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ke/m$a.class
     */
    /* renamed from: ke.m$a */
    /* loaded from: combined.jar:classes2.jar:ke/m$a.class */
    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int m27612a() {
        return this.f31658a;
    }

    /* renamed from: b */
    public void m27613b(int i10) {
        this.f31658a += i10;
    }

    /* renamed from: c */
    public boolean m27614c() {
        return this.f31659b == a.ALPHA;
    }

    /* renamed from: d */
    public boolean m27615d() {
        return this.f31659b == a.ISO_IEC_646;
    }

    /* renamed from: e */
    public void m27616e() {
        this.f31659b = a.ALPHA;
    }

    /* renamed from: f */
    public void m27617f() {
        this.f31659b = a.ISO_IEC_646;
    }

    /* renamed from: g */
    public void m27618g() {
        this.f31659b = a.NUMERIC;
    }

    /* renamed from: h */
    public void m27619h(int i10) {
        this.f31658a = i10;
    }
}
