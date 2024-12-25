package p214m7;

import com.google.android.exoplayer2.extractor.InterfaceC2348g;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p057d7.C4334q;
import p057d7.InterfaceC4323f;
import p057d7.InterfaceC4324g;
import p057d7.InterfaceC4325h;
import p057d7.InterfaceC4337t;
import p059d9.C4349a;
import p059d9.C4361f0;
import p267p6.C7594k1;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:m7/a.class
 */
/* renamed from: m7.a */
/* loaded from: combined.jar:classes2.jar:m7/a.class */
public final class C5932a implements InterfaceC4323f {

    /* renamed from: a */
    public final C7629w0 f33314a;

    /* renamed from: c */
    public InterfaceC4337t f33316c;

    /* renamed from: e */
    public int f33318e;

    /* renamed from: f */
    public long f33319f;

    /* renamed from: g */
    public int f33320g;

    /* renamed from: h */
    public int f33321h;

    /* renamed from: b */
    public final C4361f0 f33315b = new C4361f0(9);

    /* renamed from: d */
    public int f33317d = 0;

    public C5932a(C7629w0 c7629w0) {
        this.f33314a = c7629w0;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: a */
    public void mo12027a(long j10, long j11) {
        this.f33317d = 0;
    }

    /* renamed from: b */
    public final boolean m29183b(InterfaceC4324g interfaceC4324g) {
        this.f33315b.m21979L(8);
        if (!interfaceC4324g.mo21802g(this.f33315b.m21988d(), 0, 8, true)) {
            return false;
        }
        if (this.f33315b.m21998n() != 1380139777) {
            throw new IOException("Input not RawCC");
        }
        this.f33318e = this.f33315b.m21971D();
        return true;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: c */
    public void mo12028c(InterfaceC4325h interfaceC4325h) {
        interfaceC4325h.mo487p(new InterfaceC2348g.b(-9223372036854775807L));
        InterfaceC4337t mo479e = interfaceC4325h.mo479e(0, 3);
        this.f33316c = mo479e;
        mo479e.mo608f(this.f33314a);
        interfaceC4325h.mo491u();
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: d */
    public boolean mo12029d(InterfaceC4324g interfaceC4324g) {
        this.f33315b.m21979L(8);
        boolean z10 = false;
        interfaceC4324g.mo21811q(this.f33315b.m21988d(), 0, 8);
        if (this.f33315b.m21998n() == 1380139777) {
            z10 = true;
        }
        return z10;
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: e */
    public final void m29184e(InterfaceC4324g interfaceC4324g) {
        while (this.f33320g > 0) {
            this.f33315b.m21979L(3);
            interfaceC4324g.readFully(this.f33315b.m21988d(), 0, 3);
            this.f33316c.mo606e(this.f33315b, 3);
            this.f33321h += 3;
            this.f33320g--;
        }
        int i10 = this.f33321h;
        if (i10 > 0) {
            this.f33316c.mo600b(this.f33319f, 1, i10, 0, null);
        }
    }

    /* renamed from: f */
    public final boolean m29185f(InterfaceC4324g interfaceC4324g) {
        long m22007w;
        int i10 = this.f33318e;
        if (i10 == 0) {
            this.f33315b.m21979L(5);
            if (!interfaceC4324g.mo21802g(this.f33315b.m21988d(), 0, 5, true)) {
                return false;
            }
            m22007w = (this.f33315b.m21973F() * 1000) / 45;
        } else {
            if (i10 != 1) {
                throw C7594k1.m32822a("Unsupported version number: " + this.f33318e, null);
            }
            this.f33315b.m21979L(9);
            if (!interfaceC4324g.mo21802g(this.f33315b.m21988d(), 0, 9, true)) {
                return false;
            }
            m22007w = this.f33315b.m22007w();
        }
        this.f33319f = m22007w;
        this.f33320g = this.f33315b.m21971D();
        this.f33321h = 0;
        return true;
    }

    @Override // p057d7.InterfaceC4323f
    /* renamed from: h */
    public int mo12033h(InterfaceC4324g interfaceC4324g, C4334q c4334q) {
        C4349a.m21886i(this.f33316c);
        while (true) {
            int i10 = this.f33317d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    m29184e(interfaceC4324g);
                    this.f33317d = 1;
                    return 0;
                }
                if (!m29185f(interfaceC4324g)) {
                    this.f33317d = 0;
                    return -1;
                }
                this.f33317d = 2;
            } else {
                if (!m29183b(interfaceC4324g)) {
                    return -1;
                }
                this.f33317d = 1;
            }
        }
    }

    @Override // p057d7.InterfaceC4323f
    public void release() {
    }
}
