package p096f9;

import java.nio.ByteBuffer;
import p059d9.C4361f0;
import p059d9.C4401z0;
import p267p6.AbstractC7575f;
import p267p6.C7629w0;
import p267p6.C7630w1;
import p332t6.C8638f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:f9/b.class
 */
/* renamed from: f9.b */
/* loaded from: combined.jar:classes2.jar:f9/b.class */
public final class C4778b extends AbstractC7575f {

    /* renamed from: n */
    public final C8638f f28142n;

    /* renamed from: o */
    public final C4361f0 f28143o;

    /* renamed from: p */
    public long f28144p;

    /* renamed from: q */
    public InterfaceC4777a f28145q;

    /* renamed from: r */
    public long f28146r;

    public C4778b() {
        super(6);
        this.f28142n = new C8638f(1);
        this.f28143o = new C4361f0();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: C */
    public void mo23405C() {
        m24187M();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: E */
    public void mo23407E(long j10, boolean z10) {
        this.f28146r = Long.MIN_VALUE;
        m24187M();
    }

    @Override // p267p6.AbstractC7575f
    /* renamed from: I */
    public void mo23410I(C7629w0[] c7629w0Arr, long j10, long j11) {
        this.f28144p = j11;
    }

    /* renamed from: L */
    public final float[] m24186L(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f28143o.m21981N(byteBuffer.array(), byteBuffer.limit());
        this.f28143o.m21983P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f28143o.m22001q());
        }
        return fArr;
    }

    /* renamed from: M */
    public final void m24187M() {
        InterfaceC4777a interfaceC4777a = this.f28145q;
        if (interfaceC4777a != null) {
            interfaceC4777a.mo24185c();
        }
    }

    @Override // p267p6.InterfaceC7633x1
    /* renamed from: a */
    public int mo5981a(C7629w0 c7629w0) {
        return C7630w1.m33226a("application/x-camera-motion".equals(c7629w0.f37086m) ? 4 : 0);
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: d */
    public boolean mo23425d() {
        return mo32700f();
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: e */
    public boolean mo23427e() {
        return true;
    }

    @Override // p267p6.InterfaceC7627v1, p267p6.InterfaceC7633x1
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // p267p6.AbstractC7575f, p267p6.C7615r1.b
    /* renamed from: i */
    public void mo23432i(int i10, Object obj) {
        if (i10 == 7) {
            this.f28145q = (InterfaceC4777a) obj;
        } else {
            super.mo23432i(i10, obj);
        }
    }

    @Override // p267p6.InterfaceC7627v1
    /* renamed from: q */
    public void mo23439q(long j10, long j11) {
        while (!mo32700f() && this.f28146r < 100000 + j10) {
            this.f28142n.clear();
            if (m32698J(m32714y(), this.f28142n, 0) != -4 || this.f28142n.isEndOfStream()) {
                return;
            }
            C8638f c8638f = this.f28142n;
            this.f28146r = c8638f.f40329e;
            if (this.f28145q != null && !c8638f.isDecodeOnly()) {
                this.f28142n.m37082g();
                float[] m24186L = m24186L((ByteBuffer) C4401z0.m22391j(this.f28142n.f40327c));
                if (m24186L != null) {
                    ((InterfaceC4777a) C4401z0.m22391j(this.f28145q)).mo24184b(this.f28146r - this.f28144p, m24186L);
                }
            }
        }
    }
}
