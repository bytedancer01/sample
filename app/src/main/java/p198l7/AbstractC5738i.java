package p198l7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4334q;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/i.class
 */
/* renamed from: l7.i */
/* loaded from: combined.jar:classes2.jar:l7/i.class */
public abstract class AbstractC5738i {

    /* renamed from: b */
    public InterfaceC4337t f32139b;

    /* renamed from: c */
    public InterfaceC4325h f32140c;

    /* renamed from: d */
    public InterfaceC5736g f32141d;

    /* renamed from: e */
    public long f32142e;

    /* renamed from: f */
    public long f32143f;

    /* renamed from: g */
    public long f32144g;

    /* renamed from: h */
    public int f32145h;

    /* renamed from: i */
    public int f32146i;

    /* renamed from: k */
    public long f32148k;

    /* renamed from: l */
    public boolean f32149l;

    /* renamed from: m */
    public boolean f32150m;

    /* renamed from: a */
    public final C5734e f32138a = new C5734e();

    /* renamed from: j */
    public b f32147j = new b();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l7/i$b.class
     */
    /* renamed from: l7.i$b */
    /* loaded from: combined.jar:classes2.jar:l7/i$b.class */
    public static class b {

        /* renamed from: a */
        public C7629w0 f32151a;

        /* renamed from: b */
        public InterfaceC5736g f32152b;
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l7/i$c.class
     */
    /* renamed from: l7.i$c */
    /* loaded from: combined.jar:classes2.jar:l7/i$c.class */
    public static final class c implements InterfaceC5736g {
        public c() {
        }

        @Override // p198l7.InterfaceC5736g
        /* renamed from: a */
        public long mo28087a(InterfaceC4324g interfaceC4324g) {
            return -1L;
        }

        @Override // p198l7.InterfaceC5736g
        /* renamed from: b */
        public InterfaceC2348g mo28088b() {
            return new InterfaceC2348g.b(-9223372036854775807L);
        }

        @Override // p198l7.InterfaceC5736g
        /* renamed from: c */
        public void mo28089c(long j10) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    /* renamed from: a */
    public final void m28117a() {
        C4349a.m21886i(this.f32139b);
        C4401z0.m22391j(this.f32140c);
    }

    /* renamed from: b */
    public long m28118b(long j10) {
        return (j10 * 1000000) / this.f32146i;
    }

    /* renamed from: c */
    public long m28119c(long j10) {
        return (this.f32146i * j10) / 1000000;
    }

    /* renamed from: d */
    public void m28120d(InterfaceC4325h interfaceC4325h, InterfaceC4337t interfaceC4337t) {
        this.f32140c = interfaceC4325h;
        this.f32139b = interfaceC4337t;
        mo28098l(true);
    }

    /* renamed from: e */
    public void mo28121e(long j10) {
        this.f32144g = j10;
    }

    /* renamed from: f */
    public abstract long mo28096f(C4361f0 c4361f0);

    /* renamed from: g */
    public final int m28122g(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        m28117a();
        int i10 = this.f32145h;
        if (i10 == 0) {
            return m28124j(interfaceC4324g);
        }
        if (i10 == 1) {
            interfaceC4324g.mo21809o((int) this.f32143f);
            this.f32145h = 2;
            return 0;
        }
        if (i10 == 2) {
            C4401z0.m22391j(this.f32141d);
            return m28125k(interfaceC4324g, c4334q);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    /* renamed from: h */
    public final boolean m28123h(InterfaceC4324g interfaceC4324g) {
        while (this.f32138a.m28108d(interfaceC4324g)) {
            this.f32148k = interfaceC4324g.getPosition() - this.f32143f;
            if (!mo28097i(this.f32138a.m28107c(), this.f32143f, this.f32147j)) {
                return true;
            }
            this.f32143f = interfaceC4324g.getPosition();
        }
        this.f32145h = 3;
        return false;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public abstract boolean mo28097i(C4361f0 c4361f0, long j10, b bVar);

    @RequiresNonNull({"trackOutput"})
    /* renamed from: j */
    public final int m28124j(InterfaceC4324g interfaceC4324g) {
        InterfaceC5736g cVar;
        if (!m28123h(interfaceC4324g)) {
            return -1;
        }
        C7629w0 c7629w0 = this.f32147j.f32151a;
        this.f32146i = c7629w0.f37068A;
        if (!this.f32150m) {
            this.f32139b.mo608f(c7629w0);
            this.f32150m = true;
        }
        InterfaceC5736g interfaceC5736g = this.f32147j.f32152b;
        if (interfaceC5736g != null) {
            cVar = interfaceC5736g;
        } else {
            if (interfaceC4324g.getLength() != -1) {
                C5735f m28106b = this.f32138a.m28106b();
                this.f32141d = new C5730a(this, this.f32143f, interfaceC4324g.getLength(), m28106b.f32132h + m28106b.f32133i, m28106b.f32127c, (m28106b.f32126b & 4) != 0);
                this.f32145h = 2;
                this.f32138a.m28110f();
                return 0;
            }
            cVar = new c();
        }
        this.f32141d = cVar;
        this.f32145h = 2;
        this.f32138a.m28110f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /* renamed from: k */
    public final int m28125k(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        long mo28087a = this.f32141d.mo28087a(interfaceC4324g);
        if (mo28087a >= 0) {
            c4334q.f26491a = mo28087a;
            return 1;
        }
        if (mo28087a < -1) {
            mo28121e(-(mo28087a + 2));
        }
        if (!this.f32149l) {
            this.f32140c.mo487p((InterfaceC2348g) C4349a.m21886i(this.f32141d.mo28088b()));
            this.f32149l = true;
        }
        if (this.f32148k <= 0 && !this.f32138a.m28108d(interfaceC4324g)) {
            this.f32145h = 3;
            return -1;
        }
        this.f32148k = 0L;
        C4361f0 m28107c = this.f32138a.m28107c();
        long mo28096f = mo28096f(m28107c);
        if (mo28096f >= 0) {
            long j10 = this.f32144g;
            if (j10 + mo28096f >= this.f32142e) {
                long m28118b = m28118b(j10);
                this.f32139b.mo606e(m28107c, m28107c.m21990f());
                this.f32139b.mo600b(m28118b, 1, m28107c.m21990f(), 0, null);
                this.f32142e = -1L;
            }
        }
        this.f32144g += mo28096f;
        return 0;
    }

    /* renamed from: l */
    public void mo28098l(boolean z10) {
        int i10;
        if (z10) {
            this.f32147j = new b();
            this.f32143f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f32145h = i10;
        this.f32142e = -1L;
        this.f32144g = 0L;
    }

    /* renamed from: m */
    public final void m28126m(long j10, long j11) {
        this.f32138a.m28109e();
        if (j10 == 0) {
            mo28098l(!this.f32149l);
        } else if (this.f32145h != 0) {
            this.f32142e = m28119c(j11);
            ((InterfaceC5736g) C4401z0.m22391j(this.f32141d)).mo28089c(this.f32142e);
            this.f32145h = 2;
        }
    }
}
