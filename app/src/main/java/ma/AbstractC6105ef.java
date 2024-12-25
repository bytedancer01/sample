package ma;

import java.io.IOException;
import ma.AbstractC6084df;
import ma.AbstractC6105ef;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ef.class
 */
/* renamed from: ma.ef */
/* loaded from: combined.jar:classes2.jar:ma/ef.class */
public abstract class AbstractC6105ef<MessageType extends AbstractC6105ef<MessageType, BuilderType>, BuilderType extends AbstractC6084df<MessageType, BuilderType>> implements InterfaceC6443uh {
    public int zza = 0;

    /* renamed from: a */
    public int mo29568a(InterfaceC6150gi interfaceC6150gi) {
        throw null;
    }

    @Override // ma.InterfaceC6443uh
    /* renamed from: i */
    public final AbstractC6399sf mo29569i() {
        try {
            int mo29916r = mo29916r();
            AbstractC6399sf abstractC6399sf = AbstractC6399sf.f34033c;
            byte[] bArr = new byte[mo29916r];
            AbstractC6022ag m29400A = AbstractC6022ag.m29400A(bArr, 0, mo29916r);
            mo29909g(m29400A);
            m29400A.m29408a();
            return new C6336pf(bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
