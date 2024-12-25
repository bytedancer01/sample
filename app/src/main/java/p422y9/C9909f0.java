package p422y9;

import p350u9.C8804b;
import p383w9.InterfaceC9487l;
import p422y9.AbstractC9899c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:y9/f0.class
 */
/* renamed from: y9.f0 */
/* loaded from: combined.jar:classes2.jar:y9/f0.class */
public final class C9909f0 implements AbstractC9899c.b {

    /* renamed from: b */
    public final InterfaceC9487l f45562b;

    public C9909f0(InterfaceC9487l interfaceC9487l) {
        this.f45562b = interfaceC9487l;
    }

    @Override // p422y9.AbstractC9899c.b
    public final void onConnectionFailed(C8804b c8804b) {
        this.f45562b.onConnectionFailed(c8804b);
    }
}
