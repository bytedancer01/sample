package p009a8;

import android.net.Uri;
import p059d9.C4349a;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/v0.class
 */
/* renamed from: a8.v0 */
/* loaded from: combined.jar:classes2.jar:a8/v0.class */
public final class C0126v0 extends AbstractC7574e2 {

    /* renamed from: p */
    public static final Object f552p = new Object();

    /* renamed from: q */
    public static final C7561b1 f553q = new C7561b1.c().m32371v("SinglePeriodTimeline").m32348B(Uri.EMPTY).m32350a();

    /* renamed from: c */
    public final long f554c;

    /* renamed from: d */
    public final long f555d;

    /* renamed from: e */
    public final long f556e;

    /* renamed from: f */
    public final long f557f;

    /* renamed from: g */
    public final long f558g;

    /* renamed from: h */
    public final long f559h;

    /* renamed from: i */
    public final long f560i;

    /* renamed from: j */
    public final boolean f561j;

    /* renamed from: k */
    public final boolean f562k;

    /* renamed from: l */
    public final boolean f563l;

    /* renamed from: m */
    public final Object f564m;

    /* renamed from: n */
    public final C7561b1 f565n;

    /* renamed from: o */
    public final C7561b1.f f566o;

    public C0126v0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, C7561b1 c7561b1, C7561b1.f fVar) {
        this.f554c = j10;
        this.f555d = j11;
        this.f556e = j12;
        this.f557f = j13;
        this.f558g = j14;
        this.f559h = j15;
        this.f560i = j16;
        this.f561j = z10;
        this.f562k = z11;
        this.f563l = z12;
        this.f564m = obj;
        this.f565n = (C7561b1) C4349a.m21882e(c7561b1);
        this.f566o = fVar;
    }

    public C0126v0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, C7561b1 c7561b1) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, c7561b1, z12 ? c7561b1.f36450c : null);
    }

    public C0126v0(long j10, boolean z10, boolean z11, boolean z12, Object obj, C7561b1 c7561b1) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, c7561b1);
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: b */
    public int mo506b(Object obj) {
        return f552p.equals(obj) ? 0 : -1;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: g */
    public AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
        C4349a.m21880c(i10, 0, 1);
        return bVar.m32687s(null, z10 ? f552p : null, 0, this.f557f, -this.f559h);
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: i */
    public int mo509i() {
        return 1;
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: m */
    public Object mo511m(int i10) {
        C4349a.m21880c(i10, 0, 1);
        return f552p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r0 > r0) goto L10;
     */
    @Override // p267p6.AbstractC7574e2
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p267p6.AbstractC7574e2.c mo405o(int r23, p267p6.AbstractC7574e2.c r24, long r25) {
        /*
            r22 = this;
            r0 = r23
            r1 = 0
            r2 = 1
            int r0 = p059d9.C4349a.m21880c(r0, r1, r2)
            r0 = r22
            long r0 = r0.f560i
            r29 = r0
            r0 = r22
            boolean r0 = r0.f562k
            r33 = r0
            r0 = r29
            r27 = r0
            r0 = r33
            if (r0 == 0) goto L59
            r0 = r29
            r27 = r0
            r0 = r22
            boolean r0 = r0.f563l
            if (r0 != 0) goto L59
            r0 = r29
            r27 = r0
            r0 = r25
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L59
            r0 = r22
            long r0 = r0.f558g
            r31 = r0
            r0 = r31
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L47
        L40:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = r0
            goto L5c
        L47:
            r0 = r29
            r1 = r25
            long r0 = r0 + r1
            r25 = r0
            r0 = r25
            r27 = r0
            r0 = r25
            r1 = r31
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L59
            goto L40
        L59:
            r0 = r27
            r25 = r0
        L5c:
            r0 = r24
            java.lang.Object r1 = p267p6.AbstractC7574e2.c.f36716r
            r2 = r22
            p6.b1 r2 = r2.f565n
            r3 = r22
            java.lang.Object r3 = r3.f564m
            r4 = r22
            long r4 = r4.f554c
            r5 = r22
            long r5 = r5.f555d
            r6 = r22
            long r6 = r6.f556e
            r7 = r22
            boolean r7 = r7.f561j
            r8 = r33
            r9 = r22
            p6.b1$f r9 = r9.f566o
            r10 = r25
            r11 = r22
            long r11 = r11.f558g
            r12 = 0
            r13 = 0
            r14 = r22
            long r14 = r14.f559h
            p6.e2$c r0 = r0.m32695g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0126v0.mo405o(int, p6.e2$c, long):p6.e2$c");
    }

    @Override // p267p6.AbstractC7574e2
    /* renamed from: p */
    public int mo512p() {
        return 1;
    }
}
