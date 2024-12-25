package p447zg;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/h.class
 */
/* renamed from: zg.h */
/* loaded from: combined.jar:classes2.jar:zg/h.class */
public abstract class AbstractC10217h extends Number implements InterfaceC10226q {

    /* renamed from: b */
    public int f46784b;

    /* renamed from: c */
    public Number f46785c;

    /* renamed from: d */
    public boolean f46786d;

    /* renamed from: e */
    public long f46787e;

    public AbstractC10217h(int i10, long j10, boolean z10) {
        this.f46784b = i10;
        this.f46786d = z10;
        m42754d(j10);
    }

    @Override // p447zg.InterfaceC10226q
    /* renamed from: a */
    public Class<?> mo42751a() {
        return this.f46785c.getClass();
    }

    @Override // p447zg.InterfaceC10226q
    /* renamed from: b */
    public Object mo42752b(Object obj, C10213d c10213d) {
        long longValue = obj == null ? 0L : ((Number) obj).longValue();
        AbstractC10217h abstractC10217h = (AbstractC10217h) AbstractC10220k.m42756a(getClass());
        abstractC10217h.m42754d(longValue);
        return abstractC10217h;
    }

    @Override // p447zg.InterfaceC10226q
    /* renamed from: c */
    public Object mo42753c() {
        return this.f46785c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0150 A[ORIG_RETURN, RETURN] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m42754d(long r7) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p447zg.AbstractC10217h.m42754d(long):void");
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.f46785c.doubleValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC10217h) && this.f46785c.equals(((AbstractC10217h) obj).f46785c);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f46785c.floatValue();
    }

    public int hashCode() {
        return this.f46785c.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.f46787e;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f46787e;
    }

    public String toString() {
        return this.f46785c.toString();
    }
}
