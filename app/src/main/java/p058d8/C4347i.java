package p058d8;

import com.google.android.exoplayer2.extractor.C2343b;
import p077e8.C4656i;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d8/i.class
 */
/* renamed from: d8.i */
/* loaded from: combined.jar:classes2.jar:d8/i.class */
public final class C4347i implements InterfaceC4345g {

    /* renamed from: a */
    public final C2343b f26510a;

    /* renamed from: b */
    public final long f26511b;

    public C4347i(C2343b c2343b, long j10) {
        this.f26510a = c2343b;
        this.f26511b = j10;
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: b */
    public long mo21859b(long j10) {
        return this.f26510a.f13793e[(int) j10] - this.f26511b;
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: c */
    public long mo21860c(long j10, long j11) {
        return this.f26510a.f13792d[(int) j10];
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: d */
    public long mo21861d(long j10, long j11) {
        return 0L;
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: e */
    public long mo21862e(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: f */
    public C4656i mo21863f(long j10) {
        return new C4656i(null, this.f26510a.f13791c[(int) j10], r0.f13790b[r0]);
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: g */
    public long mo21864g(long j10, long j11) {
        return this.f26510a.m12094a(j10 + this.f26511b);
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: h */
    public long mo21865h(long j10) {
        return this.f26510a.f13789a;
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: i */
    public boolean mo21866i() {
        return true;
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: j */
    public long mo21867j() {
        return 0L;
    }

    @Override // p058d8.InterfaceC4345g
    /* renamed from: k */
    public long mo21868k(long j10, long j11) {
        return this.f26510a.f13789a;
    }
}
