package p125h7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4335r;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:h7/d.class
 */
/* renamed from: h7.d */
/* loaded from: combined.jar:classes2.jar:h7/d.class */
public final class C5040d implements InterfaceC4325h {

    /* renamed from: b */
    public final long f29102b;

    /* renamed from: c */
    public final InterfaceC4325h f29103c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:h7/d$a.class
     */
    /* renamed from: h7.d$a */
    /* loaded from: combined.jar:classes2.jar:h7/d$a.class */
    public class a implements InterfaceC2348g {

        /* renamed from: a */
        public final InterfaceC2348g f29104a;

        /* renamed from: b */
        public final C5040d f29105b;

        public a(C5040d c5040d, InterfaceC2348g interfaceC2348g) {
            this.f29105b = c5040d;
            this.f29104a = interfaceC2348g;
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
        /* renamed from: e */
        public InterfaceC2348g.a mo12034e(long j10) {
            InterfaceC2348g.a mo12034e = this.f29104a.mo12034e(j10);
            C4335r c4335r = mo12034e.f13808a;
            C4335r c4335r2 = new C4335r(c4335r.f26493a, c4335r.f26494b + this.f29105b.f29102b);
            C4335r c4335r3 = mo12034e.f13809b;
            return new InterfaceC2348g.a(c4335r2, new C4335r(c4335r3.f26493a, c4335r3.f26494b + this.f29105b.f29102b));
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
        /* renamed from: g */
        public boolean mo12035g() {
            return this.f29104a.mo12035g();
        }

        @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
        /* renamed from: i */
        public long mo12036i() {
            return this.f29104a.mo12036i();
        }
    }

    public C5040d(long j10, InterfaceC4325h interfaceC4325h) {
        this.f29102b = j10;
        this.f29103c = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: e */
    public InterfaceC4337t mo479e(int i10, int i11) {
        return this.f29103c.mo479e(i10, i11);
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: p */
    public void mo487p(InterfaceC2348g interfaceC2348g) {
        this.f29103c.mo487p(new a(this, interfaceC2348g));
    }

    @Override // p057d7.InterfaceC4325h
    /* renamed from: u */
    public void mo491u() {
        this.f29103c.mo491u();
    }
}
