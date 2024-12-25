package p163j7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import p057d7.C4335r;
import p059d9.C4394w;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j7/b.class
 */
/* renamed from: j7.b */
/* loaded from: combined.jar:classes2.jar:j7/b.class */
public final class C5306b implements InterfaceC5311g {

    /* renamed from: a */
    public final long f30472a;

    /* renamed from: b */
    public final C4394w f30473b;

    /* renamed from: c */
    public final C4394w f30474c;

    /* renamed from: d */
    public long f30475d;

    public C5306b(long j10, long j11, long j12) {
        this.f30475d = j10;
        this.f30472a = j12;
        C4394w c4394w = new C4394w();
        this.f30473b = c4394w;
        C4394w c4394w2 = new C4394w();
        this.f30474c = c4394w2;
        c4394w.m22282a(0L);
        c4394w2.m22282a(j11);
    }

    /* renamed from: a */
    public boolean m26497a(long j10) {
        C4394w c4394w = this.f30473b;
        boolean z10 = true;
        if (j10 - c4394w.m22283b(c4394w.m22284c() - 1) >= 100000) {
            z10 = false;
        }
        return z10;
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: b */
    public long mo26495b(long j10) {
        return this.f30473b.m22283b(C4401z0.m22380f(this.f30474c, j10, true, true));
    }

    /* renamed from: c */
    public void m26498c(long j10, long j11) {
        if (m26497a(j10)) {
            return;
        }
        this.f30473b.m22282a(j10);
        this.f30474c.m22282a(j11);
    }

    /* renamed from: d */
    public void m26499d(long j10) {
        this.f30475d = j10;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: e */
    public InterfaceC2348g.a mo12034e(long j10) {
        int m22380f = C4401z0.m22380f(this.f30473b, j10, true, true);
        C4335r c4335r = new C4335r(this.f30473b.m22283b(m22380f), this.f30474c.m22283b(m22380f));
        if (c4335r.f26493a == j10 || m22380f == this.f30473b.m22284c() - 1) {
            return new InterfaceC2348g.a(c4335r);
        }
        int i10 = m22380f + 1;
        return new InterfaceC2348g.a(c4335r, new C4335r(this.f30473b.m22283b(i10), this.f30474c.m22283b(i10)));
    }

    @Override // p163j7.InterfaceC5311g
    /* renamed from: f */
    public long mo26496f() {
        return this.f30472a;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: g */
    public boolean mo12035g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC2348g
    /* renamed from: i */
    public long mo12036i() {
        return this.f30475d;
    }
}
