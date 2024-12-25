package p164j8;

import android.os.SystemClock;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p059d9.C4349a;
import p059d9.C4361f0;
import p183k8.C5528a;
import p183k8.InterfaceC5532e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/d.class
 */
/* renamed from: j8.d */
/* loaded from: combined.jar:classes2.jar:j8/d.class */
public final class C5318d implements InterfaceC4323f {

    /* renamed from: a */
    public final InterfaceC5532e f30540a;

    /* renamed from: d */
    public final int f30543d;

    /* renamed from: g */
    public InterfaceC4325h f30546g;

    /* renamed from: h */
    public boolean f30547h;

    /* renamed from: k */
    public boolean f30550k;

    /* renamed from: b */
    public final C4361f0 f30541b = new C4361f0(65507);

    /* renamed from: c */
    public final C4361f0 f30542c = new C4361f0();

    /* renamed from: e */
    public final Object f30544e = new Object();

    /* renamed from: f */
    public final C5321g f30545f = new C5321g();

    /* renamed from: i */
    public volatile long f30548i = -9223372036854775807L;

    /* renamed from: j */
    public volatile int f30549j = -1;

    /* renamed from: l */
    public long f30551l = -9223372036854775807L;

    /* renamed from: m */
    public long f30552m = -9223372036854775807L;

    public C5318d(C5322h c5322h, int i10) {
        this.f30543d = i10;
        this.f30540a = (InterfaceC5532e) C4349a.m21882e(new C5528a().m27502a(c5322h));
    }

    /* renamed from: b */
    public static long m26544b(long j10) {
        return j10 - 30;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        synchronized (this.f30544e) {
            this.f30551l = j10;
            this.f30552m = j11;
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f30540a.mo27507c(interfaceC4325h, this.f30543d);
        interfaceC4325h.mo491u();
        interfaceC4325h.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
        this.f30546g = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* renamed from: e */
    public boolean m26545e() {
        return this.f30547h;
    }

    /* renamed from: f */
    public void m26546f() {
        synchronized (this.f30544e) {
            this.f30550k = true;
        }
    }

    /* renamed from: g */
    public void m26547g(int i10) {
        this.f30549j = i10;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        C5319e m26575g;
        C4349a.m21882e(this.f30546g);
        int read = interfaceC4324g.read(this.f30541b.m21988d(), 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f30541b.m21983P(0);
        this.f30541b.m21982O(read);
        C5319e m26550b = C5319e.m26550b(this.f30541b);
        if (m26550b == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long m26544b = m26544b(elapsedRealtime);
        this.f30545f.m26574f(m26550b, elapsedRealtime);
        C5319e m26575g2 = this.f30545f.m26575g(m26544b);
        if (m26575g2 == null) {
            return 0;
        }
        if (!this.f30547h) {
            if (this.f30548i == -9223372036854775807L) {
                this.f30548i = m26575g2.f30561h;
            }
            if (this.f30549j == -1) {
                this.f30549j = m26575g2.f30560g;
            }
            this.f30540a.mo27508d(this.f30548i, this.f30549j);
            this.f30547h = true;
        }
        synchronized (this.f30544e) {
            if (!this.f30550k) {
                do {
                    this.f30542c.m21980M(m26575g2.f30564k);
                    this.f30540a.mo27506b(this.f30542c, m26575g2.f30561h, m26575g2.f30560g, m26575g2.f30558e);
                    m26575g = this.f30545f.m26575g(m26544b);
                    m26575g2 = m26575g;
                } while (m26575g != null);
            } else if (this.f30551l != -9223372036854775807L && this.f30552m != -9223372036854775807L) {
                this.f30545f.m26576i();
                this.f30540a.mo27505a(this.f30551l, this.f30552m);
                this.f30550k = false;
                this.f30551l = -9223372036854775807L;
                this.f30552m = -9223372036854775807L;
            }
        }
        return 0;
    }

    /* renamed from: i */
    public void m26548i(long j10) {
        this.f30548i = j10;
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
