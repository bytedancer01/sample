package p228n7;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4328k;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4329l;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4389t0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/a0.class
 */
/* renamed from: n7.a0 */
/* loaded from: combined.jar:classes2.jar:n7/a0.class */
public final class C6661a0 implements InterfaceC4323f {

    /* renamed from: l */
    public static final InterfaceC4329l f34690l = new InterfaceC4329l() { // from class: n7.z
        @Override // p057d7.InterfaceC4329l
        /* renamed from: a */
        public /* synthetic */ InterfaceC4323f[] mo12020a(Uri uri, Map map) {
            return C4328k.m21824a(this, uri, map);
        }

        @Override // p057d7.InterfaceC4329l
        /* renamed from: b */
        public final InterfaceC4323f[] mo12021b() {
            InterfaceC4323f[] m30667e;
            m30667e = C6661a0.m30667e();
            return m30667e;
        }
    };

    /* renamed from: a */
    public final C4389t0 f34691a;

    /* renamed from: b */
    public final SparseArray<a> f34692b;

    /* renamed from: c */
    public final C4361f0 f34693c;

    /* renamed from: d */
    public final C6695y f34694d;

    /* renamed from: e */
    public boolean f34695e;

    /* renamed from: f */
    public boolean f34696f;

    /* renamed from: g */
    public boolean f34697g;

    /* renamed from: h */
    public long f34698h;

    /* renamed from: i */
    public C6694x f34699i;

    /* renamed from: j */
    public InterfaceC4325h f34700j;

    /* renamed from: k */
    public boolean f34701k;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:n7/a0$a.class
     */
    /* renamed from: n7.a0$a */
    /* loaded from: combined.jar:classes2.jar:n7/a0$a.class */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC6683m f34702a;

        /* renamed from: b */
        public final C4389t0 f34703b;

        /* renamed from: c */
        public final C4359e0 f34704c = new C4359e0(new byte[64]);

        /* renamed from: d */
        public boolean f34705d;

        /* renamed from: e */
        public boolean f34706e;

        /* renamed from: f */
        public boolean f34707f;

        /* renamed from: g */
        public int f34708g;

        /* renamed from: h */
        public long f34709h;

        public a(InterfaceC6683m interfaceC6683m, C4389t0 c4389t0) {
            this.f34702a = interfaceC6683m;
            this.f34703b = c4389t0;
        }

        /* renamed from: a */
        public void m30669a(C4361f0 c4361f0) {
            c4361f0.m21994j(this.f34704c.f26561a, 0, 3);
            this.f34704c.m21958p(0);
            m30670b();
            c4361f0.m21994j(this.f34704c.f26561a, 0, this.f34708g);
            this.f34704c.m21958p(0);
            m30671c();
            this.f34702a.mo30682f(this.f34709h, 4);
            this.f34702a.mo30677a(c4361f0);
            this.f34702a.mo30681e();
        }

        /* renamed from: b */
        public final void m30670b() {
            this.f34704c.m21960r(8);
            this.f34705d = this.f34704c.m21949g();
            this.f34706e = this.f34704c.m21949g();
            this.f34704c.m21960r(6);
            this.f34708g = this.f34704c.m21950h(8);
        }

        /* renamed from: c */
        public final void m30671c() {
            this.f34709h = 0L;
            if (this.f34705d) {
                this.f34704c.m21960r(4);
                long m21950h = this.f34704c.m21950h(3);
                this.f34704c.m21960r(1);
                long m21950h2 = this.f34704c.m21950h(15) << 15;
                this.f34704c.m21960r(1);
                long m21950h3 = this.f34704c.m21950h(15);
                this.f34704c.m21960r(1);
                if (!this.f34707f && this.f34706e) {
                    this.f34704c.m21960r(4);
                    long m21950h4 = this.f34704c.m21950h(3);
                    this.f34704c.m21960r(1);
                    long m21950h5 = this.f34704c.m21950h(15) << 15;
                    this.f34704c.m21960r(1);
                    long m21950h6 = this.f34704c.m21950h(15);
                    this.f34704c.m21960r(1);
                    this.f34703b.m22241b((m21950h4 << 30) | m21950h5 | m21950h6);
                    this.f34707f = true;
                }
                this.f34709h = this.f34703b.m22241b((m21950h << 30) | m21950h2 | m21950h3);
            }
        }

        /* renamed from: d */
        public void m30672d() {
            this.f34707f = false;
            this.f34702a.mo30679c();
        }
    }

    public C6661a0() {
        this(new C4389t0(0L));
    }

    public C6661a0(C4389t0 c4389t0) {
        this.f34691a = c4389t0;
        this.f34693c = new C4361f0(4096);
        this.f34692b = new SparseArray<>();
        this.f34694d = new C6695y();
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC4323f[] m30667e() {
        return new InterfaceC4323f[]{new C6661a0()};
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        boolean z10 = this.f34691a.m22244e() == -9223372036854775807L;
        boolean z11 = z10;
        if (!z10) {
            long m22242c = this.f34691a.m22242c();
            z11 = (m22242c == -9223372036854775807L || m22242c == 0 || m22242c == j11) ? false : true;
        }
        if (z11) {
            this.f34691a.m22245g(j11);
        }
        C6694x c6694x = this.f34699i;
        int i10 = 0;
        if (c6694x != null) {
            c6694x.m12064h(j11);
            i10 = 0;
        }
        while (i10 < this.f34692b.size()) {
            this.f34692b.valueAt(i10).m30672d();
            i10++;
        }
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        this.f34700j = interfaceC4325h;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        byte[] bArr = new byte[14];
        boolean z10 = false;
        interfaceC4324g.mo21811q(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC4324g.mo21805k(bArr[13] & 7);
        interfaceC4324g.mo21811q(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            z10 = true;
        }
        return z10;
    }

    @RequiresNonNull({"output"})
    /* renamed from: f */
    public final void m30668f(long j10) {
        InterfaceC4325h interfaceC4325h;
        InterfaceC2348g bVar;
        if (this.f34701k) {
            return;
        }
        this.f34701k = true;
        if (this.f34694d.m30846c() != -9223372036854775807L) {
            C6694x c6694x = new C6694x(this.f34694d.m30847d(), this.f34694d.m30846c(), j10);
            this.f34699i = c6694x;
            interfaceC4325h = this.f34700j;
            bVar = c6694x.m12059b();
        } else {
            interfaceC4325h = this.f34700j;
            bVar = new InterfaceC2348g.b(this.f34694d.m30846c());
        }
        interfaceC4325h.mo487p(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01bd  */
    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo12033h(p057d7.InterfaceC4324g r7, p057d7.C4334q r8) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p228n7.C6661a0.mo12033h(d7.g, d7.q):int");
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
