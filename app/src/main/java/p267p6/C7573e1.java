package p267p6;

import p009a8.InterfaceC0127w;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/e1.class
 */
/* renamed from: p6.e1 */
/* loaded from: combined.jar:classes2.jar:p6/e1.class */
public final class C7573e1 {

    /* renamed from: a */
    public final InterfaceC0127w.a f36697a;

    /* renamed from: b */
    public final long f36698b;

    /* renamed from: c */
    public final long f36699c;

    /* renamed from: d */
    public final long f36700d;

    /* renamed from: e */
    public final long f36701e;

    /* renamed from: f */
    public final boolean f36702f;

    /* renamed from: g */
    public final boolean f36703g;

    /* renamed from: h */
    public final boolean f36704h;

    /* renamed from: i */
    public final boolean f36705i;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r17 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7573e1(p009a8.InterfaceC0127w.a r5, long r6, long r8, long r10, long r12, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = 0
            r19 = r0
            r0 = r17
            if (r0 == 0) goto L1a
            r0 = r15
            if (r0 == 0) goto L14
            goto L1a
        L14:
            r0 = 0
            r18 = r0
            goto L1d
        L1a:
            r0 = 1
            r18 = r0
        L1d:
            r0 = r18
            p059d9.C4349a.m21878a(r0)
            r0 = r16
            if (r0 == 0) goto L35
            r0 = r15
            if (r0 == 0) goto L2f
            goto L35
        L2f:
            r0 = 0
            r18 = r0
            goto L38
        L35:
            r0 = 1
            r18 = r0
        L38:
            r0 = r18
            p059d9.C4349a.m21878a(r0)
            r0 = r14
            if (r0 == 0) goto L5d
            r0 = r19
            r18 = r0
            r0 = r15
            if (r0 != 0) goto L60
            r0 = r19
            r18 = r0
            r0 = r16
            if (r0 != 0) goto L60
            r0 = r19
            r18 = r0
            r0 = r17
            if (r0 != 0) goto L60
        L5d:
            r0 = 1
            r18 = r0
        L60:
            r0 = r18
            p059d9.C4349a.m21878a(r0)
            r0 = r4
            r1 = r5
            r0.f36697a = r1
            r0 = r4
            r1 = r6
            r0.f36698b = r1
            r0 = r4
            r1 = r8
            r0.f36699c = r1
            r0 = r4
            r1 = r10
            r0.f36700d = r1
            r0 = r4
            r1 = r12
            r0.f36701e = r1
            r0 = r4
            r1 = r14
            r0.f36702f = r1
            r0 = r4
            r1 = r15
            r0.f36703g = r1
            r0 = r4
            r1 = r16
            r0.f36704h = r1
            r0 = r4
            r1 = r17
            r0.f36705i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p267p6.C7573e1.<init>(a8.w$a, long, long, long, long, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    public C7573e1 m32660a(long j10) {
        return j10 == this.f36699c ? this : new C7573e1(this.f36697a, this.f36698b, j10, this.f36700d, this.f36701e, this.f36702f, this.f36703g, this.f36704h, this.f36705i);
    }

    /* renamed from: b */
    public C7573e1 m32661b(long j10) {
        return j10 == this.f36698b ? this : new C7573e1(this.f36697a, j10, this.f36699c, this.f36700d, this.f36701e, this.f36702f, this.f36703g, this.f36704h, this.f36705i);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7573e1.class != obj.getClass()) {
            return false;
        }
        C7573e1 c7573e1 = (C7573e1) obj;
        if (this.f36698b != c7573e1.f36698b || this.f36699c != c7573e1.f36699c || this.f36700d != c7573e1.f36700d || this.f36701e != c7573e1.f36701e || this.f36702f != c7573e1.f36702f || this.f36703g != c7573e1.f36703g || this.f36704h != c7573e1.f36704h || this.f36705i != c7573e1.f36705i || !C4401z0.m22371c(this.f36697a, c7573e1.f36697a)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f36697a.hashCode()) * 31) + ((int) this.f36698b)) * 31) + ((int) this.f36699c)) * 31) + ((int) this.f36700d)) * 31) + ((int) this.f36701e)) * 31) + (this.f36702f ? 1 : 0)) * 31) + (this.f36703g ? 1 : 0)) * 31) + (this.f36704h ? 1 : 0)) * 31) + (this.f36705i ? 1 : 0);
    }
}
