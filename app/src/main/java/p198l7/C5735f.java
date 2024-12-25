package p198l7;

import p057d7.C4326i;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p059d9.C4361f0;
import p267p6.C7594k1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/f.class
 */
/* renamed from: l7.f */
/* loaded from: combined.jar:classes2.jar:l7/f.class */
public final class C5735f {

    /* renamed from: a */
    public int f32125a;

    /* renamed from: b */
    public int f32126b;

    /* renamed from: c */
    public long f32127c;

    /* renamed from: d */
    public long f32128d;

    /* renamed from: e */
    public long f32129e;

    /* renamed from: f */
    public long f32130f;

    /* renamed from: g */
    public int f32131g;

    /* renamed from: h */
    public int f32132h;

    /* renamed from: i */
    public int f32133i;

    /* renamed from: j */
    public final int[] f32134j = new int[255];

    /* renamed from: k */
    public final C4361f0 f32135k = new C4361f0(255);

    /* renamed from: a */
    public boolean m28111a(InterfaceC4324g interfaceC4324g, boolean z10) {
        m28112b();
        this.f32135k.m21979L(27);
        if (!C4326i.m21820b(interfaceC4324g, this.f32135k.m21988d(), 0, 27, z10) || this.f32135k.m21973F() != 1332176723) {
            return false;
        }
        int m21971D = this.f32135k.m21971D();
        this.f32125a = m21971D;
        if (m21971D != 0) {
            if (z10) {
                return false;
            }
            throw C7594k1.m32826e("unsupported bit stream revision");
        }
        this.f32126b = this.f32135k.m21971D();
        this.f32127c = this.f32135k.m22002r();
        this.f32128d = this.f32135k.m22004t();
        this.f32129e = this.f32135k.m22004t();
        this.f32130f = this.f32135k.m22004t();
        int m21971D2 = this.f32135k.m21971D();
        this.f32131g = m21971D2;
        this.f32132h = m21971D2 + 27;
        this.f32135k.m21979L(m21971D2);
        if (!C4326i.m21820b(interfaceC4324g, this.f32135k.m21988d(), 0, this.f32131g, z10)) {
            return false;
        }
        for (int i10 = 0; i10 < this.f32131g; i10++) {
            this.f32134j[i10] = this.f32135k.m21971D();
            this.f32133i += this.f32134j[i10];
        }
        return true;
    }

    /* renamed from: b */
    public void m28112b() {
        this.f32125a = 0;
        this.f32126b = 0;
        this.f32127c = 0L;
        this.f32128d = 0L;
        this.f32129e = 0L;
        this.f32130f = 0L;
        this.f32131g = 0;
        this.f32132h = 0;
        this.f32133i = 0;
    }

    /* renamed from: c */
    public boolean m28113c(InterfaceC4324g interfaceC4324g) {
        return m28114d(interfaceC4324g, -1L);
    }

    /* renamed from: d */
    public boolean m28114d(InterfaceC4324g interfaceC4324g, long j10) {
        C4349a.m21878a(interfaceC4324g.getPosition() == interfaceC4324g.mo21804i());
        this.f32135k.m21979L(4);
        while (true) {
            if ((j10 == -1 || interfaceC4324g.getPosition() + 4 < j10) && C4326i.m21820b(interfaceC4324g, this.f32135k.m21988d(), 0, 4, true)) {
                this.f32135k.m21983P(0);
                if (this.f32135k.m21973F() == 1332176723) {
                    interfaceC4324g.mo21801f();
                    return true;
                }
                interfaceC4324g.mo21809o(1);
            }
        }
        do {
            if (j10 != -1 && interfaceC4324g.getPosition() >= j10) {
                return false;
            }
        } while (interfaceC4324g.mo21806l(1) != -1);
        return false;
    }
}
