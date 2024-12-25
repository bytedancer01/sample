package p067di;

import org.jetbrains.annotations.NotNull;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/u1.class
 */
/* renamed from: di.u1 */
/* loaded from: combined.jar:classes2.jar:di/u1.class */
public final class C4520u1 extends AbstractC4462b0 {

    /* renamed from: c */
    @NotNull
    public static final C4520u1 f26944c = new C4520u1();

    @Override // p067di.AbstractC4462b0
    /* renamed from: A0 */
    public void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable) {
        C4529x1 c4529x1 = (C4529x1) interfaceC6792g.get(C4529x1.f26955c);
        if (c4529x1 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c4529x1.f26956b = true;
    }

    @Override // p067di.AbstractC4462b0
    /* renamed from: B0 */
    public boolean mo22633B0(@NotNull InterfaceC6792g interfaceC6792g) {
        return false;
    }

    @Override // p067di.AbstractC4462b0
    @NotNull
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
