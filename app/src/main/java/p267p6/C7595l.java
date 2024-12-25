package p267p6;

import org.apache.commons.net.tftp.TFTP;
import p009a8.C0083a1;
import p027b9.C0859q;
import p027b9.InterfaceC0832b;
import p059d9.C4349a;
import p059d9.C4392v;
import p059d9.C4401z0;
import p421y8.InterfaceC9884h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/l.class
 */
/* renamed from: p6.l */
/* loaded from: combined.jar:classes2.jar:p6/l.class */
public class C7595l implements InterfaceC7557a1 {

    /* renamed from: a */
    public final C0859q f36841a;

    /* renamed from: b */
    public final long f36842b;

    /* renamed from: c */
    public final long f36843c;

    /* renamed from: d */
    public final long f36844d;

    /* renamed from: e */
    public final long f36845e;

    /* renamed from: f */
    public final int f36846f;

    /* renamed from: g */
    public final boolean f36847g;

    /* renamed from: h */
    public final long f36848h;

    /* renamed from: i */
    public final boolean f36849i;

    /* renamed from: j */
    public int f36850j;

    /* renamed from: k */
    public boolean f36851k;

    public C7595l() {
        this(new C0859q(true, 65536), 50000, 50000, 2500, TFTP.DEFAULT_TIMEOUT, -1, false, 0, false);
    }

    public C7595l(C0859q c0859q, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        m32827i(i12, 0, "bufferForPlaybackMs", "0");
        m32827i(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m32827i(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        m32827i(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m32827i(i11, i10, "maxBufferMs", "minBufferMs");
        m32827i(i15, 0, "backBufferDurationMs", "0");
        this.f36841a = c0859q;
        this.f36842b = C7583h.m32760d(i10);
        this.f36843c = C7583h.m32760d(i11);
        this.f36844d = C7583h.m32760d(i12);
        this.f36845e = C7583h.m32760d(i13);
        this.f36846f = i14;
        this.f36850j = i14 == -1 ? 13107200 : i14;
        this.f36847g = z10;
        this.f36848h = C7583h.m32760d(i15);
        this.f36849i = z11;
    }

    /* renamed from: i */
    public static void m32827i(int i10, int i11, String str, String str2) {
        C4349a.m21879b(i10 >= i11, str + " cannot be less than " + str2);
    }

    /* renamed from: k */
    public static int m32828k(int i10) {
        if (i10 == 0) {
            return 144310272;
        }
        if (i10 == 1) {
            return 13107200;
        }
        if (i10 == 2) {
            return 131072000;
        }
        if (i10 == 3 || i10 == 5 || i10 == 6) {
            return 131072;
        }
        if (i10 == 7) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: a */
    public boolean mo32332a() {
        return this.f36849i;
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: b */
    public long mo32333b() {
        return this.f36848h;
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: c */
    public boolean mo32334c(long j10, float f10, boolean z10, long j11) {
        long m22378e0 = C4401z0.m22378e0(j10, f10);
        long j12 = z10 ? this.f36845e : this.f36844d;
        long j13 = j12;
        if (j11 != -9223372036854775807L) {
            j13 = Math.min(j11 / 2, j12);
        }
        return j13 <= 0 || m22378e0 >= j13 || (!this.f36847g && this.f36841a.m5394f() >= this.f36850j);
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: d */
    public InterfaceC0832b mo32335d() {
        return this.f36841a;
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: e */
    public void mo32336e() {
        m32830l(true);
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: f */
    public void mo32337f(InterfaceC7627v1[] interfaceC7627v1Arr, C0083a1 c0083a1, InterfaceC9884h[] interfaceC9884hArr) {
        int i10 = this.f36846f;
        int i11 = i10;
        if (i10 == -1) {
            i11 = m32829j(interfaceC7627v1Arr, interfaceC9884hArr);
        }
        this.f36850j = i11;
        this.f36841a.m5396h(i11);
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: g */
    public void mo32338g() {
        m32830l(true);
    }

    @Override // p267p6.InterfaceC7557a1
    /* renamed from: h */
    public boolean mo32339h(long j10, long j11, float f10) {
        boolean z10 = this.f36841a.m5394f() >= this.f36850j;
        long j12 = this.f36842b;
        long j13 = j12;
        if (f10 > 1.0f) {
            j13 = Math.min(C4401z0.m22363Z(j12, f10), this.f36843c);
        }
        if (j11 < Math.max(j13, 500000L)) {
            boolean z11 = true;
            if (!this.f36847g) {
                z11 = !z10;
            }
            this.f36851k = z11;
            if (!z11 && j11 < 500000) {
                C4392v.m22275i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f36843c || z10) {
            this.f36851k = false;
        }
        return this.f36851k;
    }

    /* renamed from: j */
    public int m32829j(InterfaceC7627v1[] interfaceC7627v1Arr, InterfaceC9884h[] interfaceC9884hArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= interfaceC7627v1Arr.length) {
                return Math.max(13107200, i12);
            }
            int i13 = i12;
            if (interfaceC9884hArr[i10] != null) {
                i13 = i12 + m32828k(interfaceC7627v1Arr[i10].getTrackType());
            }
            i10++;
            i11 = i13;
        }
    }

    /* renamed from: l */
    public final void m32830l(boolean z10) {
        int i10 = this.f36846f;
        int i11 = i10;
        if (i10 == -1) {
            i11 = 13107200;
        }
        this.f36850j = i11;
        this.f36851k = false;
        if (z10) {
            this.f36841a.m5395g();
        }
    }

    @Override // p267p6.InterfaceC7557a1
    public void onPrepared() {
        m32830l(false);
    }
}
