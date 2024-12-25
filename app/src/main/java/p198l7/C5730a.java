package p198l7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.io.EOFException;
import java.io.IOException;
import p057d7.C4326i;
import p057d7.C4335r;
import p057d7.InterfaceC4324g;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:l7/a.class
 */
/* renamed from: l7.a */
/* loaded from: combined.jar:classes2.jar:l7/a.class */
public final class C5730a implements InterfaceC5736g {

    /* renamed from: a */
    public final C5735f f32097a;

    /* renamed from: b */
    public final long f32098b;

    /* renamed from: c */
    public final long f32099c;

    /* renamed from: d */
    public final AbstractC5738i f32100d;

    /* renamed from: e */
    public int f32101e;

    /* renamed from: f */
    public long f32102f;

    /* renamed from: g */
    public long f32103g;

    /* renamed from: h */
    public long f32104h;

    /* renamed from: i */
    public long f32105i;

    /* renamed from: j */
    public long f32106j;

    /* renamed from: k */
    public long f32107k;

    /* renamed from: l */
    public long f32108l;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:l7/a$b.class
     */
    /* renamed from: l7.a$b */
    /* loaded from: combined.jar:classes2.jar:l7/a$b.class */
    public final class b implements InterfaceC2348g {

        /* renamed from: a */
        public final C5730a f32109a;

        public b(C5730a c5730a) {
            this.f32109a = c5730a;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
        /* renamed from: e */
        public InterfaceC2348g.a mo12034e(long j10) {
            return new InterfaceC2348g.a(new C4335r(j10, C4401z0.m22411t((this.f32109a.f32098b + ((this.f32109a.f32100d.m28119c(j10) * (this.f32109a.f32099c - this.f32109a.f32098b)) / this.f32109a.f32102f)) - 30000, this.f32109a.f32098b, this.f32109a.f32099c - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
        /* renamed from: g */
        public boolean mo12035g() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
        /* renamed from: i */
        public long mo12036i() {
            return this.f32109a.f32100d.m28118b(this.f32109a.f32102f);
        }
    }

    public C5730a(AbstractC5738i abstractC5738i, long j10, long j11, long j12, long j13, boolean z10) {
        C4349a.m21878a(j10 >= 0 && j11 > j10);
        this.f32100d = abstractC5738i;
        this.f32098b = j10;
        this.f32099c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f32102f = j13;
            this.f32101e = 4;
        } else {
            this.f32101e = 0;
        }
        this.f32097a = new C5735f();
    }

    @Override // p198l7.InterfaceC5736g
    /* renamed from: a */
    public long mo28087a(InterfaceC4324g interfaceC4324g) {
        int i10 = this.f32101e;
        if (i10 == 0) {
            long position = interfaceC4324g.getPosition();
            this.f32103g = position;
            this.f32101e = 1;
            long j10 = this.f32099c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long m28091i = m28091i(interfaceC4324g);
                if (m28091i != -1) {
                    return m28091i;
                }
                this.f32101e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m28093k(interfaceC4324g);
            this.f32101e = 4;
            return -(this.f32107k + 2);
        }
        this.f32102f = m28092j(interfaceC4324g);
        this.f32101e = 4;
        return this.f32103g;
    }

    @Override // p198l7.InterfaceC5736g
    /* renamed from: c */
    public void mo28089c(long j10) {
        this.f32104h = C4401z0.m22411t(j10, 0L, this.f32102f - 1);
        this.f32101e = 2;
        this.f32105i = this.f32098b;
        this.f32106j = this.f32099c;
        this.f32107k = 0L;
        this.f32108l = this.f32102f;
    }

    @Override // p198l7.InterfaceC5736g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b mo28088b() {
        b bVar = null;
        if (this.f32102f != 0) {
            bVar = new b();
        }
        return bVar;
    }

    /* renamed from: i */
    public final long m28091i(InterfaceC4324g interfaceC4324g) {
        if (this.f32105i == this.f32106j) {
            return -1L;
        }
        long position = interfaceC4324g.getPosition();
        if (!this.f32097a.m28114d(interfaceC4324g, this.f32106j)) {
            long j10 = this.f32105i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f32097a.m28111a(interfaceC4324g, false);
        interfaceC4324g.mo21801f();
        long j11 = this.f32104h;
        C5735f c5735f = this.f32097a;
        long j12 = c5735f.f32127c;
        long j13 = j11 - j12;
        int i10 = c5735f.f32132h + c5735f.f32133i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f32106j = position;
            this.f32108l = j12;
        } else {
            this.f32105i = interfaceC4324g.getPosition() + i10;
            this.f32107k = this.f32097a.f32127c;
        }
        long j14 = this.f32106j;
        long j15 = this.f32105i;
        if (j14 - j15 < 100000) {
            this.f32106j = j15;
            return j15;
        }
        long j16 = i10;
        long j17 = j13 <= 0 ? 2L : 1L;
        long position2 = interfaceC4324g.getPosition();
        long j18 = this.f32106j;
        long j19 = this.f32105i;
        return C4401z0.m22411t((position2 - (j16 * j17)) + ((j13 * (j18 - j19)) / (this.f32108l - this.f32107k)), j19, j18 - 1);
    }

    /* renamed from: j */
    public long m28092j(InterfaceC4324g interfaceC4324g) {
        long j10;
        C5735f c5735f;
        this.f32097a.m28112b();
        if (!this.f32097a.m28113c(interfaceC4324g)) {
            throw new EOFException();
        }
        this.f32097a.m28111a(interfaceC4324g, false);
        C5735f c5735f2 = this.f32097a;
        interfaceC4324g.mo21809o(c5735f2.f32132h + c5735f2.f32133i);
        do {
            j10 = this.f32097a.f32127c;
            C5735f c5735f3 = this.f32097a;
            if ((c5735f3.f32126b & 4) == 4 || !c5735f3.m28113c(interfaceC4324g) || interfaceC4324g.getPosition() >= this.f32099c || !this.f32097a.m28111a(interfaceC4324g, true)) {
                break;
            }
            c5735f = this.f32097a;
        } while (C4326i.m21823e(interfaceC4324g, c5735f.f32132h + c5735f.f32133i));
        return j10;
    }

    /* renamed from: k */
    public final void m28093k(InterfaceC4324g interfaceC4324g) {
        while (true) {
            this.f32097a.m28113c(interfaceC4324g);
            this.f32097a.m28111a(interfaceC4324g, false);
            C5735f c5735f = this.f32097a;
            if (c5735f.f32127c > this.f32104h) {
                interfaceC4324g.mo21801f();
                return;
            } else {
                interfaceC4324g.mo21809o(c5735f.f32132h + c5735f.f32133i);
                this.f32105i = interfaceC4324g.getPosition();
                this.f32107k = this.f32097a.f32127c;
            }
        }
    }
}
