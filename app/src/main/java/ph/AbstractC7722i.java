package ph;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.C6793h;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ph/i.class
 */
/* renamed from: ph.i */
/* loaded from: combined.jar:classes2.jar:ph/i.class */
public abstract class AbstractC7722i extends AbstractC7714a {
    public AbstractC7722i(@Nullable InterfaceC6789d<Object> interfaceC6789d) {
        super(interfaceC6789d);
        if (interfaceC6789d != null) {
            if (!(interfaceC6789d.mo22619b() == C6793h.f35418b)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p233nh.InterfaceC6789d
    @NotNull
    /* renamed from: b */
    public InterfaceC6792g mo22619b() {
        return C6793h.f35418b;
    }
}
