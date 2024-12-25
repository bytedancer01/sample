package p228n7;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.InterfaceC4325h;
import p059d9.C4359e0;
import p059d9.C4361f0;
import p059d9.C4389t0;
import p059d9.C4392v;
import p228n7.InterfaceC6677i0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n7/w.class
 */
/* renamed from: n7.w */
/* loaded from: combined.jar:classes2.jar:n7/w.class */
public final class C6693w implements InterfaceC6677i0 {

    /* renamed from: a */
    public final InterfaceC6683m f35030a;

    /* renamed from: b */
    public final C4359e0 f35031b = new C4359e0(new byte[10]);

    /* renamed from: c */
    public int f35032c = 0;

    /* renamed from: d */
    public int f35033d;

    /* renamed from: e */
    public C4389t0 f35034e;

    /* renamed from: f */
    public boolean f35035f;

    /* renamed from: g */
    public boolean f35036g;

    /* renamed from: h */
    public boolean f35037h;

    /* renamed from: i */
    public int f35038i;

    /* renamed from: j */
    public int f35039j;

    /* renamed from: k */
    public boolean f35040k;

    /* renamed from: l */
    public long f35041l;

    public C6693w(InterfaceC6683m interfaceC6683m) {
        this.f35030a = interfaceC6683m;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0101 -> B:14:0x0104). Please report as a decompilation issue!!! */
    @Override // p228n7.InterfaceC6677i0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo30685a(p059d9.C4361f0 r6, int r7) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p228n7.C6693w.mo30685a(d9.f0, int):void");
    }

    @Override // p228n7.InterfaceC6677i0
    /* renamed from: b */
    public void mo30686b(C4389t0 c4389t0, InterfaceC4325h interfaceC4325h, InterfaceC6677i0.d dVar) {
        this.f35034e = c4389t0;
        this.f35030a.mo30680d(interfaceC4325h, dVar);
    }

    @Override // p228n7.InterfaceC6677i0
    /* renamed from: c */
    public final void mo30687c() {
        this.f35032c = 0;
        this.f35033d = 0;
        this.f35037h = false;
        this.f35030a.mo30679c();
    }

    /* renamed from: d */
    public final boolean m30834d(C4361f0 c4361f0, byte[] bArr, int i10) {
        int min = Math.min(c4361f0.m21985a(), i10 - this.f35033d);
        boolean z10 = true;
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c4361f0.m21984Q(min);
        } else {
            c4361f0.m21994j(bArr, this.f35033d, min);
        }
        int i11 = this.f35033d + min;
        this.f35033d = i11;
        if (i11 != i10) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: e */
    public final boolean m30835e() {
        this.f35031b.m21958p(0);
        int m21950h = this.f35031b.m21950h(24);
        if (m21950h != 1) {
            C4392v.m22275i("PesReader", "Unexpected start code prefix: " + m21950h);
            this.f35039j = -1;
            return false;
        }
        this.f35031b.m21960r(8);
        int m21950h2 = this.f35031b.m21950h(16);
        this.f35031b.m21960r(5);
        this.f35040k = this.f35031b.m21949g();
        this.f35031b.m21960r(2);
        this.f35035f = this.f35031b.m21949g();
        this.f35036g = this.f35031b.m21949g();
        this.f35031b.m21960r(6);
        int m21950h3 = this.f35031b.m21950h(8);
        this.f35038i = m21950h3;
        if (m21950h2 != 0) {
            int i10 = ((m21950h2 + 6) - 9) - m21950h3;
            this.f35039j = i10;
            if (i10 >= 0) {
                return true;
            }
            C4392v.m22275i("PesReader", "Found negative packet payload size: " + this.f35039j);
        }
        this.f35039j = -1;
        return true;
    }

    @RequiresNonNull({"timestampAdjuster"})
    /* renamed from: f */
    public final void m30836f() {
        this.f35031b.m21958p(0);
        this.f35041l = -9223372036854775807L;
        if (this.f35035f) {
            this.f35031b.m21960r(4);
            long m21950h = this.f35031b.m21950h(3);
            this.f35031b.m21960r(1);
            long m21950h2 = this.f35031b.m21950h(15) << 15;
            this.f35031b.m21960r(1);
            long m21950h3 = this.f35031b.m21950h(15);
            this.f35031b.m21960r(1);
            if (!this.f35037h && this.f35036g) {
                this.f35031b.m21960r(4);
                long m21950h4 = this.f35031b.m21950h(3);
                this.f35031b.m21960r(1);
                long m21950h5 = this.f35031b.m21950h(15) << 15;
                this.f35031b.m21960r(1);
                long m21950h6 = this.f35031b.m21950h(15);
                this.f35031b.m21960r(1);
                this.f35034e.m22241b((m21950h4 << 30) | m21950h5 | m21950h6);
                this.f35037h = true;
            }
            this.f35041l = this.f35034e.m22241b((m21950h << 30) | m21950h2 | m21950h3);
        }
    }

    /* renamed from: g */
    public final void m30837g(int i10) {
        this.f35032c = i10;
        this.f35033d = 0;
    }
}
