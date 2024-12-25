package p228n7;

import p057d7.C4334q;
import p057d7.InterfaceC4324g;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/f0.class
 */
/* renamed from: n7.f0 */
/* loaded from: combined.jar:classes2.jar:n7/f0.class */
public final class C6671f0 {

    /* renamed from: a */
    public final int f34755a;

    /* renamed from: d */
    public boolean f34758d;

    /* renamed from: e */
    public boolean f34759e;

    /* renamed from: f */
    public boolean f34760f;

    /* renamed from: b */
    public final C4389t0 f34756b = new C4389t0(0);

    /* renamed from: g */
    public long f34761g = -9223372036854775807L;

    /* renamed from: h */
    public long f34762h = -9223372036854775807L;

    /* renamed from: i */
    public long f34763i = -9223372036854775807L;

    /* renamed from: c */
    public final C4361f0 f34757c = new C4361f0();

    public C6671f0(int i10) {
        this.f34755a = i10;
    }

    /* renamed from: a */
    public final int m30696a(InterfaceC4324g interfaceC4324g) {
        this.f34757c.m21980M(C4401z0.f26684f);
        this.f34758d = true;
        interfaceC4324g.mo21801f();
        return 0;
    }

    /* renamed from: b */
    public long m30697b() {
        return this.f34763i;
    }

    /* renamed from: c */
    public C4389t0 m30698c() {
        return this.f34756b;
    }

    /* renamed from: d */
    public boolean m30699d() {
        return this.f34758d;
    }

    /* renamed from: e */
    public int m30700e(InterfaceC4324g interfaceC4324g, C4334q c4334q, int i10) {
        if (i10 <= 0) {
            return m30696a(interfaceC4324g);
        }
        if (!this.f34760f) {
            return m30703h(interfaceC4324g, c4334q, i10);
        }
        if (this.f34762h == -9223372036854775807L) {
            return m30696a(interfaceC4324g);
        }
        if (!this.f34759e) {
            return m30701f(interfaceC4324g, c4334q, i10);
        }
        long j10 = this.f34761g;
        if (j10 == -9223372036854775807L) {
            return m30696a(interfaceC4324g);
        }
        this.f34763i = this.f34756b.m22241b(this.f34762h) - this.f34756b.m22241b(j10);
        return m30696a(interfaceC4324g);
    }

    /* renamed from: f */
    public final int m30701f(InterfaceC4324g interfaceC4324g, C4334q c4334q, int i10) {
        int min = (int) Math.min(this.f34755a, interfaceC4324g.getLength());
        long j10 = 0;
        if (interfaceC4324g.getPosition() != j10) {
            c4334q.f26491a = j10;
            return 1;
        }
        this.f34757c.m21979L(min);
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21811q(this.f34757c.m21988d(), 0, min);
        this.f34761g = m30702g(this.f34757c, i10);
        this.f34759e = true;
        return 0;
    }

    /* renamed from: g */
    public final long m30702g(C4361f0 c4361f0, int i10) {
        int m21990f = c4361f0.m21990f();
        for (int m21989e = c4361f0.m21989e(); m21989e < m21990f; m21989e++) {
            if (c4361f0.m21988d()[m21989e] == 71) {
                long m30765c = C6679j0.m30765c(c4361f0, m21989e, i10);
                if (m30765c != -9223372036854775807L) {
                    return m30765c;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: h */
    public final int m30703h(InterfaceC4324g interfaceC4324g, C4334q c4334q, int i10) {
        long length = interfaceC4324g.getLength();
        int min = (int) Math.min(this.f34755a, length);
        long j10 = length - min;
        if (interfaceC4324g.getPosition() != j10) {
            c4334q.f26491a = j10;
            return 1;
        }
        this.f34757c.m21979L(min);
        interfaceC4324g.mo21801f();
        interfaceC4324g.mo21811q(this.f34757c.m21988d(), 0, min);
        this.f34762h = m30704i(this.f34757c, i10);
        this.f34760f = true;
        return 0;
    }

    /* renamed from: i */
    public final long m30704i(C4361f0 c4361f0, int i10) {
        int m21989e = c4361f0.m21989e();
        int m21990f = c4361f0.m21990f();
        for (int i11 = m21990f - 188; i11 >= m21989e; i11--) {
            if (C6679j0.m30764b(c4361f0.m21988d(), m21989e, m21990f, i11)) {
                long m30765c = C6679j0.m30765c(c4361f0, i11, i10);
                if (m30765c != -9223372036854775807L) {
                    return m30765c;
                }
            }
        }
        return -9223372036854775807L;
    }
}
