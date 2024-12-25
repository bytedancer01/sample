package p283q7;

import java.nio.ByteBuffer;
import p059d9.C4349a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q7/h.class
 */
/* renamed from: q7.h */
/* loaded from: combined.jar:classes2.jar:q7/h.class */
public abstract class AbstractC7846h implements InterfaceC7841c {
    @Override // p283q7.InterfaceC7841c
    /* renamed from: a */
    public final C7839a mo34093a(C7843e c7843e) {
        ByteBuffer byteBuffer = (ByteBuffer) C4349a.m21882e(c7843e.f40327c);
        C4349a.m21878a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return c7843e.isDecodeOnly() ? null : mo34101b(c7843e, byteBuffer);
    }

    /* renamed from: b */
    public abstract C7839a mo34101b(C7843e c7843e, ByteBuffer byteBuffer);
}
