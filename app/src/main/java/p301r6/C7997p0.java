package p301r6;

import java.nio.ByteBuffer;
import p059d9.C4401z0;
import p301r6.InterfaceC7980h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/p0.class
 */
/* renamed from: r6.p0 */
/* loaded from: combined.jar:classes2.jar:r6/p0.class */
public final class C7997p0 extends AbstractC8008z {

    /* renamed from: i */
    public int f38698i;

    /* renamed from: j */
    public int f38699j;

    /* renamed from: k */
    public boolean f38700k;

    /* renamed from: l */
    public int f38701l;

    /* renamed from: m */
    public byte[] f38702m = C4401z0.f26684f;

    /* renamed from: n */
    public int f38703n;

    /* renamed from: o */
    public long f38704o;

    @Override // p301r6.AbstractC8008z, p301r6.InterfaceC7980h
    /* renamed from: a */
    public ByteBuffer mo34691a() {
        int i10;
        if (super.mo34693d() && (i10 = this.f38703n) > 0) {
            m34846k(i10).put(this.f38702m, 0, this.f38703n).flip();
            this.f38703n = 0;
        }
        return super.mo34691a();
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: c */
    public void mo34531c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f38701l);
        this.f38704o += min / this.f38771b.f38605d;
        this.f38701l -= min;
        byteBuffer.position(position + min);
        if (this.f38701l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f38703n + i11) - this.f38702m.length;
        ByteBuffer m34846k = m34846k(length);
        int m22409s = C4401z0.m22409s(length, 0, this.f38703n);
        m34846k.put(this.f38702m, 0, m22409s);
        int m22409s2 = C4401z0.m22409s(length - m22409s, 0, i11);
        byteBuffer.limit(byteBuffer.position() + m22409s2);
        m34846k.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - m22409s2;
        int i13 = this.f38703n - m22409s;
        this.f38703n = i13;
        byte[] bArr = this.f38702m;
        System.arraycopy(bArr, m22409s, bArr, 0, i13);
        byteBuffer.get(this.f38702m, this.f38703n, i12);
        this.f38703n += i12;
        m34846k.flip();
    }

    @Override // p301r6.AbstractC8008z, p301r6.InterfaceC7980h
    /* renamed from: d */
    public boolean mo34693d() {
        return super.mo34693d() && this.f38703n == 0;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: g */
    public InterfaceC7980h.a mo34532g(InterfaceC7980h.a aVar) {
        if (aVar.f38604c != 2) {
            throw new InterfaceC7980h.b(aVar);
        }
        this.f38700k = true;
        InterfaceC7980h.a aVar2 = aVar;
        if (this.f38698i == 0) {
            aVar2 = this.f38699j != 0 ? aVar : InterfaceC7980h.a.f38601e;
        }
        return aVar2;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: h */
    public void mo34533h() {
        if (this.f38700k) {
            this.f38700k = false;
            int i10 = this.f38699j;
            int i11 = this.f38771b.f38605d;
            this.f38702m = new byte[i10 * i11];
            this.f38701l = this.f38698i * i11;
        }
        this.f38703n = 0;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: i */
    public void mo34738i() {
        if (this.f38700k) {
            if (this.f38703n > 0) {
                this.f38704o += r0 / this.f38771b.f38605d;
            }
            this.f38703n = 0;
        }
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: j */
    public void mo34534j() {
        this.f38702m = C4401z0.f26684f;
    }

    /* renamed from: l */
    public long m34776l() {
        return this.f38704o;
    }

    /* renamed from: m */
    public void m34777m() {
        this.f38704o = 0L;
    }

    /* renamed from: n */
    public void m34778n(int i10, int i11) {
        this.f38698i = i10;
        this.f38699j = i11;
    }
}
