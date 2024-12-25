package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p356uh.InterfaceC9196l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/z0.class
 */
/* renamed from: di.z0 */
/* loaded from: combined.jar:classes2.jar:di/z0.class */
public final class C4533z0 extends AbstractC4479h {

    /* renamed from: b */
    @NotNull
    public final InterfaceC9196l<Throwable, C5398q> f26958b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4533z0(@NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        this.f26958b = interfaceC9196l;
    }

    @Override // p067di.AbstractC4482i
    /* renamed from: a */
    public void mo22669a(@Nullable Throwable th2) {
        this.f26958b.mo6711d(th2);
    }

    @Override // p356uh.InterfaceC9196l
    /* renamed from: d */
    public /* bridge */ /* synthetic */ C5398q mo6711d(Throwable th2) {
        mo22669a(th2);
        return C5398q.f30770a;
    }

    @NotNull
    public String toString() {
        return "InvokeOnCancel[" + C4483i0.m22670a(this.f26958b) + '@' + C4483i0.m22671b(this) + ']';
    }
}
