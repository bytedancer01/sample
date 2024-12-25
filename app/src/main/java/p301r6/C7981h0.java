package p301r6;

import java.nio.ByteBuffer;
import p059d9.C4401z0;
import p301r6.InterfaceC7980h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/h0.class
 */
/* renamed from: r6.h0 */
/* loaded from: combined.jar:classes2.jar:r6/h0.class */
public final class C7981h0 extends AbstractC8008z {

    /* renamed from: i */
    public static final int f38606i = Float.floatToIntBits(Float.NaN);

    /* renamed from: l */
    public static void m34695l(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        int i11 = floatToIntBits;
        if (floatToIntBits == f38606i) {
            i11 = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(i11);
    }

    @Override // p301r6.InterfaceC7980h
    /* renamed from: c */
    public void mo34531c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f38771b.f38604c;
        if (i11 == 536870912) {
            ByteBuffer m34846k = m34846k((i10 / 3) * 4);
            while (true) {
                byteBuffer2 = m34846k;
                if (position >= limit) {
                    break;
                }
                m34695l(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m34846k);
                position += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            ByteBuffer m34846k2 = m34846k(i10);
            while (true) {
                byteBuffer2 = m34846k2;
                if (position >= limit) {
                    break;
                }
                m34695l((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m34846k2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override // p301r6.AbstractC8008z
    /* renamed from: g */
    public InterfaceC7980h.a mo34532g(InterfaceC7980h.a aVar) {
        int i10 = aVar.f38604c;
        if (C4401z0.m22408r0(i10)) {
            return i10 != 4 ? new InterfaceC7980h.a(aVar.f38602a, aVar.f38603b, 4) : InterfaceC7980h.a.f38601e;
        }
        throw new InterfaceC7980h.b(aVar);
    }
}
