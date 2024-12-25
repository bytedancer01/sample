package td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/g.class
 */
/* renamed from: td.g */
/* loaded from: combined.jar:classes2.jar:td/g.class */
public final class C8692g extends AbstractC8693h {

    /* renamed from: c */
    public final AbstractC8693h f40464c;

    public C8692g(AbstractC8693h abstractC8693h) {
        super(abstractC8693h.m37205d(), abstractC8693h.m37204a());
        this.f40464c = abstractC8693h;
    }

    @Override // td.AbstractC8693h
    /* renamed from: b */
    public byte[] mo37199b() {
        byte[] mo37199b = this.f40464c.mo37199b();
        int m37205d = m37205d() * m37204a();
        byte[] bArr = new byte[m37205d];
        for (int i10 = 0; i10 < m37205d; i10++) {
            bArr[i10] = (byte) (255 - (mo37199b[i10] & 255));
        }
        return bArr;
    }

    @Override // td.AbstractC8693h
    /* renamed from: c */
    public byte[] mo37200c(int i10, byte[] bArr) {
        byte[] mo37200c = this.f40464c.mo37200c(i10, bArr);
        int m37205d = m37205d();
        for (int i11 = 0; i11 < m37205d; i11++) {
            mo37200c[i11] = (byte) (255 - (mo37200c[i11] & 255));
        }
        return mo37200c;
    }

    @Override // td.AbstractC8693h
    /* renamed from: e */
    public AbstractC8693h mo37201e() {
        return this.f40464c;
    }

    @Override // td.AbstractC8693h
    /* renamed from: f */
    public boolean mo37202f() {
        return this.f40464c.mo37202f();
    }

    @Override // td.AbstractC8693h
    /* renamed from: g */
    public AbstractC8693h mo37203g() {
        return new C8692g(this.f40464c.mo37203g());
    }
}
