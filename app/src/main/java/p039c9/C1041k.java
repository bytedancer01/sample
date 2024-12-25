package p039c9;

import java.io.InterruptedIOException;
import p027b9.C0858p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/k.class
 */
/* renamed from: c9.k */
/* loaded from: combined.jar:classes2.jar:c9/k.class */
public final class C1041k {

    /* renamed from: a */
    public final C1033c f6981a;

    /* renamed from: b */
    public final InterfaceC1031a f6982b;

    /* renamed from: c */
    public final C0858p f6983c;

    /* renamed from: d */
    public final String f6984d;

    /* renamed from: e */
    public final byte[] f6985e;

    /* renamed from: f */
    public final a f6986f;

    /* renamed from: g */
    public long f6987g;

    /* renamed from: h */
    public long f6988h;

    /* renamed from: i */
    public long f6989i;

    /* renamed from: j */
    public volatile boolean f6990j;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:c9/k$a.class
     */
    /* renamed from: c9.k$a */
    /* loaded from: combined.jar:classes2.jar:c9/k$a.class */
    public interface a {
        /* renamed from: a */
        void mo6121a(long j10, long j11, long j12);
    }

    public C1041k(C1033c c1033c, C0858p c0858p, byte[] bArr, a aVar) {
        this.f6981a = c1033c;
        this.f6982b = c1033c.m6077r();
        this.f6983c = c0858p;
        this.f6985e = bArr == null ? new byte[131072] : bArr;
        this.f6986f = aVar;
        this.f6984d = c1033c.m6078s().mo6109a(c0858p);
        this.f6987g = c0858p.f5853g;
    }

    /* renamed from: a */
    public void m6114a() {
        long j10;
        m6120g();
        InterfaceC1031a interfaceC1031a = this.f6982b;
        String str = this.f6984d;
        C0858p c0858p = this.f6983c;
        this.f6989i = interfaceC1031a.mo6056c(str, c0858p.f5853g, c0858p.f5854h);
        C0858p c0858p2 = this.f6983c;
        long j11 = c0858p2.f5854h;
        if (j11 != -1) {
            this.f6988h = c0858p2.f5853g + j11;
        } else {
            long m6177a = C1044n.m6177a(this.f6982b.mo6055b(this.f6984d));
            long j12 = m6177a;
            if (m6177a == -1) {
                j12 = -1;
            }
            this.f6988h = j12;
        }
        a aVar = this.f6986f;
        if (aVar != null) {
            aVar.mo6121a(m6116c(), this.f6989i, 0L);
        }
        while (true) {
            long j13 = this.f6988h;
            if (j13 != -1 && this.f6987g >= j13) {
                return;
            }
            m6120g();
            long j14 = this.f6988h;
            long mo6058e = this.f6982b.mo6058e(this.f6984d, this.f6987g, j14 == -1 ? Long.MAX_VALUE : j14 - this.f6987g);
            if (mo6058e > 0) {
                j10 = this.f6987g;
            } else {
                long j15 = -mo6058e;
                long j16 = j15;
                if (j15 == Long.MAX_VALUE) {
                    j16 = -1;
                }
                j10 = this.f6987g;
                mo6058e = m6119f(j10, j16);
            }
            this.f6987g = j10 + mo6058e;
        }
    }

    /* renamed from: b */
    public void m6115b() {
        this.f6990j = true;
    }

    /* renamed from: c */
    public final long m6116c() {
        long j10 = this.f6988h;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - this.f6983c.f5853g;
        }
        return j11;
    }

    /* renamed from: d */
    public final void m6117d(long j10) {
        this.f6989i += j10;
        a aVar = this.f6986f;
        if (aVar != null) {
            aVar.mo6121a(m6116c(), this.f6989i, j10);
        }
    }

    /* renamed from: e */
    public final void m6118e(long j10) {
        if (this.f6988h == j10) {
            return;
        }
        this.f6988h = j10;
        a aVar = this.f6986f;
        if (aVar != null) {
            aVar.mo6121a(m6116c(), this.f6989i, 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[Catch: IOException -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ae, blocks: (B:26:0x00a4, B:33:0x00bf, B:37:0x00e6, B:45:0x0100), top: B:25:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100 A[Catch: IOException -> 0x00ae, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ae, blocks: (B:26:0x00a4, B:33:0x00bf, B:37:0x00e6, B:45:0x0100), top: B:25:0x00a4 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m6119f(long r7, long r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p039c9.C1041k.m6119f(long, long):long");
    }

    /* renamed from: g */
    public final void m6120g() {
        if (this.f6990j) {
            throw new InterruptedIOException();
        }
    }
}
