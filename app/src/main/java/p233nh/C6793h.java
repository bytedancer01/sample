package p233nh;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9200p;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nh/h.class
 */
/* renamed from: nh.h */
/* loaded from: combined.jar:classes2.jar:nh/h.class */
public final class C6793h implements InterfaceC6792g, Serializable {

    /* renamed from: b */
    @NotNull
    public static final C6793h f35418b = new C6793h();

    @Override // p233nh.InterfaceC6792g
    public <R> R fold(R r10, @NotNull InterfaceC9200p<? super R, ? super InterfaceC6792g.b, ? extends R> interfaceC9200p) {
        C9367f.m39526e(interfaceC9200p, "operation");
        return r10;
    }

    @Override // p233nh.InterfaceC6792g
    @Nullable
    public <E extends InterfaceC6792g.b> E get(@NotNull InterfaceC6792g.c<E> cVar) {
        C9367f.m39526e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g minusKey(@NotNull InterfaceC6792g.c<?> cVar) {
        C9367f.m39526e(cVar, "key");
        return this;
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g plus(@NotNull InterfaceC6792g interfaceC6792g) {
        C9367f.m39526e(interfaceC6792g, "context");
        return interfaceC6792g;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
