package p321s7;

import java.nio.ByteBuffer;
import java.util.Arrays;
import p059d9.C4349a;
import p059d9.C4361f0;
import p283q7.AbstractC7846h;
import p283q7.C7839a;
import p283q7.C7843e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:s7/b.class
 */
/* renamed from: s7.b */
/* loaded from: combined.jar:classes2.jar:s7/b.class */
public final class C8543b extends AbstractC7846h {
    @Override // p283q7.AbstractC7846h
    /* renamed from: b */
    public C7839a mo34101b(C7843e c7843e, ByteBuffer byteBuffer) {
        return new C7839a(m36771c(new C4361f0(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public C8542a m36771c(C4361f0 c4361f0) {
        return new C8542a((String) C4349a.m21882e(c4361f0.m22008x()), (String) C4349a.m21882e(c4361f0.m22008x()), c4361f0.m22007w(), c4361f0.m22007w(), Arrays.copyOfRange(c4361f0.m21988d(), c4361f0.m21989e(), c4361f0.m21990f()));
    }
}
