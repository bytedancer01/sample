package td;

import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/n.class
 */
/* renamed from: td.n */
/* loaded from: combined.jar:classes2.jar:td/n.class */
public final class C8699n {

    /* renamed from: a */
    public final String f40478a;

    /* renamed from: b */
    public final byte[] f40479b;

    /* renamed from: c */
    public final int f40480c;

    /* renamed from: d */
    public C8701p[] f40481d;

    /* renamed from: e */
    public final EnumC8686a f40482e;

    /* renamed from: f */
    public Map<EnumC8700o, Object> f40483f;

    /* renamed from: g */
    public final long f40484g;

    public C8699n(String str, byte[] bArr, int i10, C8701p[] c8701pArr, EnumC8686a enumC8686a, long j10) {
        this.f40478a = str;
        this.f40479b = bArr;
        this.f40480c = i10;
        this.f40481d = c8701pArr;
        this.f40482e = enumC8686a;
        this.f40483f = null;
        this.f40484g = j10;
    }

    public C8699n(String str, byte[] bArr, C8701p[] c8701pArr, EnumC8686a enumC8686a) {
        this(str, bArr, c8701pArr, enumC8686a, System.currentTimeMillis());
    }

    public C8699n(String str, byte[] bArr, C8701p[] c8701pArr, EnumC8686a enumC8686a, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, c8701pArr, enumC8686a, j10);
    }

    /* renamed from: a */
    public void m37211a(C8701p[] c8701pArr) {
        C8701p[] c8701pArr2 = this.f40481d;
        if (c8701pArr2 == null) {
            this.f40481d = c8701pArr;
            return;
        }
        if (c8701pArr == null || c8701pArr.length <= 0) {
            return;
        }
        C8701p[] c8701pArr3 = new C8701p[c8701pArr2.length + c8701pArr.length];
        System.arraycopy(c8701pArr2, 0, c8701pArr3, 0, c8701pArr2.length);
        System.arraycopy(c8701pArr, 0, c8701pArr3, c8701pArr2.length, c8701pArr.length);
        this.f40481d = c8701pArr3;
    }

    /* renamed from: b */
    public EnumC8686a m37212b() {
        return this.f40482e;
    }

    /* renamed from: c */
    public byte[] m37213c() {
        return this.f40479b;
    }

    /* renamed from: d */
    public Map<EnumC8700o, Object> m37214d() {
        return this.f40483f;
    }

    /* renamed from: e */
    public C8701p[] m37215e() {
        return this.f40481d;
    }

    /* renamed from: f */
    public String m37216f() {
        return this.f40478a;
    }

    /* renamed from: g */
    public void m37217g(Map<EnumC8700o, Object> map) {
        if (map != null) {
            Map<EnumC8700o, Object> map2 = this.f40483f;
            if (map2 == null) {
                this.f40483f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void m37218h(EnumC8700o enumC8700o, Object obj) {
        if (this.f40483f == null) {
            this.f40483f = new EnumMap(EnumC8700o.class);
        }
        this.f40483f.put(enumC8700o, obj);
    }

    public String toString() {
        return this.f40478a;
    }
}
