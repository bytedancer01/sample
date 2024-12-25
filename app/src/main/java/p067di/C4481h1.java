package p067di;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/h1.class
 */
/* renamed from: di.h1 */
/* loaded from: combined.jar:classes2.jar:di/h1.class */
public final /* synthetic */ class C4481h1 {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC4515t m22665a(@Nullable InterfaceC4466c1 interfaceC4466c1) {
        return new C4475f1(interfaceC4466c1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC4515t m22666b(InterfaceC4466c1 interfaceC4466c1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4466c1 = null;
        }
        return C4478g1.m22661a(interfaceC4466c1);
    }

    /* renamed from: c */
    public static final void m22667c(@NotNull InterfaceC6792g interfaceC6792g, @Nullable CancellationException cancellationException) {
        InterfaceC4466c1 interfaceC4466c1 = (InterfaceC4466c1) interfaceC6792g.get(InterfaceC4466c1.f26879b0);
        if (interfaceC4466c1 == null) {
            return;
        }
        interfaceC4466c1.mo22643w(cancellationException);
    }

    /* renamed from: d */
    public static /* synthetic */ void m22668d(InterfaceC6792g interfaceC6792g, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C4478g1.m22663c(interfaceC6792g, cancellationException);
    }
}
