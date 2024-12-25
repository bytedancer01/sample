package p305ra;

import p305ra.AbstractC8334s4;
import p305ra.AbstractC8349t4;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/s4.class
 */
/* renamed from: ra.s4 */
/* loaded from: combined.jar:classes2.jar:ra/s4.class */
public abstract class AbstractC8334s4<MessageType extends AbstractC8349t4<MessageType, BuilderType>, BuilderType extends AbstractC8334s4<MessageType, BuilderType>> implements InterfaceC8292p7 {
    @Override // p305ra.InterfaceC8292p7
    /* renamed from: B */
    public final /* bridge */ /* synthetic */ InterfaceC8292p7 mo35682B(byte[] bArr) {
        return mo35442h(bArr, 0, bArr.length);
    }

    /* renamed from: h */
    public abstract BuilderType mo35442h(byte[] bArr, int i10, int i11);

    /* renamed from: i */
    public abstract BuilderType mo35443i(byte[] bArr, int i10, int i11, C8425y5 c8425y5);

    /* renamed from: j */
    public abstract BuilderType mo35444j(MessageType messagetype);

    @Override // p305ra.InterfaceC8292p7
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ InterfaceC8292p7 mo35683v(byte[] bArr, C8425y5 c8425y5) {
        return mo35443i(bArr, 0, bArr.length, c8425y5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p305ra.InterfaceC8292p7
    /* renamed from: y */
    public final /* bridge */ /* synthetic */ InterfaceC8292p7 mo35684y(InterfaceC8307q7 interfaceC8307q7) {
        if (mo35441d().getClass().isInstance(interfaceC8307q7)) {
            return mo35444j((AbstractC8349t4) interfaceC8307q7);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
