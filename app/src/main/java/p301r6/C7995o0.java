package p301r6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p059d9.C4349a;
import p059d9.C4401z0;
import p301r6.InterfaceC7980h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/o0.class
 */
/* renamed from: r6.o0 */
/* loaded from: combined.jar:classes2.jar:r6/o0.class */
public final class C7995o0 implements InterfaceC7980h {

    /* renamed from: b */
    public int f38681b;

    /* renamed from: c */
    public float f38682c = 1.0f;

    /* renamed from: d */
    public float f38683d = 1.0f;

    /* renamed from: e */
    public InterfaceC7980h.a f38684e;

    /* renamed from: f */
    public InterfaceC7980h.a f38685f;

    /* renamed from: g */
    public InterfaceC7980h.a f38686g;

    /* renamed from: h */
    public InterfaceC7980h.a f38687h;

    /* renamed from: i */
    public boolean f38688i;

    /* renamed from: j */
    public C7993n0 f38689j;

    /* renamed from: k */
    public ByteBuffer f38690k;

    /* renamed from: l */
    public ShortBuffer f38691l;

    /* renamed from: m */
    public ByteBuffer f38692m;

    /* renamed from: n */
    public long f38693n;

    /* renamed from: o */
    public long f38694o;

    /* renamed from: p */
    public boolean f38695p;

    public C7995o0() {
        InterfaceC7980h.a aVar = InterfaceC7980h.a.f38601e;
        this.f38684e = aVar;
        this.f38685f = aVar;
        this.f38686g = aVar;
        this.f38687h = aVar;
        ByteBuffer byteBuffer = InterfaceC7980h.f38600a;
        this.f38690k = byteBuffer;
        this.f38691l = byteBuffer.asShortBuffer();
        this.f38692m = byteBuffer;
        this.f38681b = -1;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: a */
    public ByteBuffer mo34691a() {
        int m34761k;
        C7993n0 c7993n0 = this.f38689j;
        if (c7993n0 != null && (m34761k = c7993n0.m34761k()) > 0) {
            if (this.f38690k.capacity() < m34761k) {
                ByteBuffer order = ByteBuffer.allocateDirect(m34761k).order(ByteOrder.nativeOrder());
                this.f38690k = order;
                this.f38691l = order.asShortBuffer();
            } else {
                this.f38690k.clear();
                this.f38691l.clear();
            }
            c7993n0.m34760j(this.f38691l);
            this.f38694o += m34761k;
            this.f38690k.limit(m34761k);
            this.f38692m = this.f38690k;
        }
        ByteBuffer byteBuffer = this.f38692m;
        this.f38692m = InterfaceC7980h.f38600a;
        return byteBuffer;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: b */
    public InterfaceC7980h.a mo34692b(InterfaceC7980h.a aVar) {
        if (aVar.f38604c != 2) {
            throw new InterfaceC7980h.b(aVar);
        }
        int i10 = this.f38681b;
        int i11 = i10;
        if (i10 == -1) {
            i11 = aVar.f38602a;
        }
        this.f38684e = aVar;
        InterfaceC7980h.a aVar2 = new InterfaceC7980h.a(i11, aVar.f38603b, 2);
        this.f38685f = aVar2;
        this.f38688i = true;
        return aVar2;
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: c */
    public void mo34531c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C7993n0 c7993n0 = (C7993n0) C4349a.m21882e(this.f38689j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f38693n += remaining;
            c7993n0.m34769t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: d */
    public boolean mo34693d() {
        C7993n0 c7993n0;
        return this.f38695p && ((c7993n0 = this.f38689j) == null || c7993n0.m34761k() == 0);
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: e */
    public void mo34694e() {
        C7993n0 c7993n0 = this.f38689j;
        if (c7993n0 != null) {
            c7993n0.m34768s();
        }
        this.f38695p = true;
    }

    /* renamed from: f */
    public long m34773f(long j10) {
        if (this.f38694o < 1024) {
            return (long) (this.f38682c * j10);
        }
        long m34762l = this.f38693n - ((C7993n0) C4349a.m21882e(this.f38689j)).m34762l();
        int i10 = this.f38687h.f38602a;
        int i11 = this.f38686g.f38602a;
        return i10 == i11 ? C4401z0.m22346Q0(j10, m34762l, this.f38694o) : C4401z0.m22346Q0(j10, m34762l * i10, this.f38694o * i11);
    }

    @Override // p301r6.InterfaceC7980h
    public void flush() {
        if (isActive()) {
            InterfaceC7980h.a aVar = this.f38684e;
            this.f38686g = aVar;
            InterfaceC7980h.a aVar2 = this.f38685f;
            this.f38687h = aVar2;
            if (this.f38688i) {
                this.f38689j = new C7993n0(aVar.f38602a, aVar.f38603b, this.f38682c, this.f38683d, aVar2.f38602a);
            } else {
                C7993n0 c7993n0 = this.f38689j;
                if (c7993n0 != null) {
                    c7993n0.m34759i();
                }
            }
        }
        this.f38692m = InterfaceC7980h.f38600a;
        this.f38693n = 0L;
        this.f38694o = 0L;
        this.f38695p = false;
    }

    /* renamed from: g */
    public void m34774g(float f10) {
        if (this.f38683d != f10) {
            this.f38683d = f10;
            this.f38688i = true;
        }
    }

    /* renamed from: h */
    public void m34775h(float f10) {
        if (this.f38682c != f10) {
            this.f38682c = f10;
            this.f38688i = true;
        }
    }

    @Override // p301r6.InterfaceC7980h
    public boolean isActive() {
        return this.f38685f.f38602a != -1 && (Math.abs(this.f38682c - 1.0f) >= 1.0E-4f || Math.abs(this.f38683d - 1.0f) >= 1.0E-4f || this.f38685f.f38602a != this.f38684e.f38602a);
    }

    @Override // p301r6.InterfaceC7980h
    public void reset() {
        this.f38682c = 1.0f;
        this.f38683d = 1.0f;
        InterfaceC7980h.a aVar = InterfaceC7980h.a.f38601e;
        this.f38684e = aVar;
        this.f38685f = aVar;
        this.f38686g = aVar;
        this.f38687h = aVar;
        ByteBuffer byteBuffer = InterfaceC7980h.f38600a;
        this.f38690k = byteBuffer;
        this.f38691l = byteBuffer.asShortBuffer();
        this.f38692m = byteBuffer;
        this.f38681b = -1;
        this.f38688i = false;
        this.f38689j = null;
        this.f38693n = 0L;
        this.f38694o = 0L;
        this.f38695p = false;
    }
}
