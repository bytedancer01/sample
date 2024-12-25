package fi;

import org.jetbrains.annotations.NotNull;
import p067di.InterfaceC4471e0;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/d.class
 */
/* renamed from: fi.d */
/* loaded from: combined.jar:classes2.jar:fi/d.class */
public final class C4865d implements InterfaceC4471e0 {

    /* renamed from: b */
    @NotNull
    public final InterfaceC6792g f28550b;

    public C4865d(@NotNull InterfaceC6792g interfaceC6792g) {
        this.f28550b = interfaceC6792g;
    }

    @Override // p067di.InterfaceC4471e0
    @NotNull
    /* renamed from: i */
    public InterfaceC6792g mo3093i() {
        return this.f28550b;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo3093i() + ')';
    }
}
