package p301r6;

import java.nio.ByteBuffer;
import p059d9.C4349a;
import p301r6.InterfaceC7980h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/a0.class
 */
/* renamed from: r6.a0 */
/* loaded from: combined.jar:classes2.jar:r6/a0.class */
public final class C7967a0 extends AbstractC8008z {

    /* renamed from: i */
    public int[] f38459i;

    /* renamed from: j */
    public int[] f38460j;

    @Override // p301r6.InterfaceC7980h
    /* renamed from: c */
    public void mo34531c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C4349a.m21882e(this.f38460j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m34846k = m34846k(((limit - position) / this.f38771b.f38605d) * this.f38772c.f38605d);
        while (position < limit) {
            for (int i10 : iArr) {
                m34846k.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f38771b.f38605d;
        }
        byteBuffer.position(limit);
        m34846k.flip();
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: g */
    public InterfaceC7980h.a mo34532g(InterfaceC7980h.a aVar) {
        int[] iArr = this.f38459i;
        if (iArr == null) {
            return InterfaceC7980h.a.f38601e;
        }
        if (aVar.f38604c != 2) {
            throw new InterfaceC7980h.b(aVar);
        }
        boolean z10 = aVar.f38603b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f38603b) {
                throw new InterfaceC7980h.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new InterfaceC7980h.a(aVar.f38602a, iArr.length, 2) : InterfaceC7980h.a.f38601e;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: h */
    public void mo34533h() {
        this.f38460j = this.f38459i;
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: j */
    public void mo34534j() {
        this.f38460j = null;
        this.f38459i = null;
    }

    /* renamed from: l */
    public void m34535l(int[] iArr) {
        this.f38459i = iArr;
    }
}
