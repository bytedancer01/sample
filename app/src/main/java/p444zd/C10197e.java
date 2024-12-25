package p444zd;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zd/e.class
 */
/* renamed from: zd.e */
/* loaded from: combined.jar:classes2.jar:zd/e.class */
public final class C10197e {

    /* renamed from: a */
    public final byte[] f46675a;

    /* renamed from: b */
    public int f46676b;

    /* renamed from: c */
    public final String f46677c;

    /* renamed from: d */
    public final List<byte[]> f46678d;

    /* renamed from: e */
    public final String f46679e;

    /* renamed from: f */
    public Integer f46680f;

    /* renamed from: g */
    public Integer f46681g;

    /* renamed from: h */
    public Object f46682h;

    /* renamed from: i */
    public final int f46683i;

    /* renamed from: j */
    public final int f46684j;

    public C10197e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C10197e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f46675a = bArr;
        this.f46676b = bArr == null ? 0 : bArr.length * 8;
        this.f46677c = str;
        this.f46678d = list;
        this.f46679e = str2;
        this.f46683i = i11;
        this.f46684j = i10;
    }

    /* renamed from: a */
    public List<byte[]> m42688a() {
        return this.f46678d;
    }

    /* renamed from: b */
    public String m42689b() {
        return this.f46679e;
    }

    /* renamed from: c */
    public int m42690c() {
        return this.f46676b;
    }

    /* renamed from: d */
    public Object m42691d() {
        return this.f46682h;
    }

    /* renamed from: e */
    public byte[] m42692e() {
        return this.f46675a;
    }

    /* renamed from: f */
    public int m42693f() {
        return this.f46683i;
    }

    /* renamed from: g */
    public int m42694g() {
        return this.f46684j;
    }

    /* renamed from: h */
    public String m42695h() {
        return this.f46677c;
    }

    /* renamed from: i */
    public boolean m42696i() {
        return this.f46683i >= 0 && this.f46684j >= 0;
    }

    /* renamed from: j */
    public void m42697j(Integer num) {
        this.f46681g = num;
    }

    /* renamed from: k */
    public void m42698k(Integer num) {
        this.f46680f = num;
    }

    /* renamed from: l */
    public void m42699l(int i10) {
        this.f46676b = i10;
    }

    /* renamed from: m */
    public void m42700m(Object obj) {
        this.f46682h = obj;
    }
}
