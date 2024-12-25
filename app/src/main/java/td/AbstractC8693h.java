package td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/h.class
 */
/* renamed from: td.h */
/* loaded from: combined.jar:classes2.jar:td/h.class */
public abstract class AbstractC8693h {

    /* renamed from: a */
    public final int f40465a;

    /* renamed from: b */
    public final int f40466b;

    public AbstractC8693h(int i10, int i11) {
        this.f40465a = i10;
        this.f40466b = i11;
    }

    /* renamed from: a */
    public final int m37204a() {
        return this.f40466b;
    }

    /* renamed from: b */
    public abstract byte[] mo37199b();

    /* renamed from: c */
    public abstract byte[] mo37200c(int i10, byte[] bArr);

    /* renamed from: d */
    public final int m37205d() {
        return this.f40465a;
    }

    /* renamed from: e */
    public AbstractC8693h mo37201e() {
        return new C8692g(this);
    }

    /* renamed from: f */
    public boolean mo37202f() {
        return false;
    }

    /* renamed from: g */
    public AbstractC8693h mo37203g() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i10 = this.f40465a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f40466b * (i10 + 1));
        for (int i11 = 0; i11 < this.f40466b; i11++) {
            bArr = mo37200c(i11, bArr);
            for (int i12 = 0; i12 < this.f40465a; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
