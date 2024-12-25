package p233nh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;
import p233nh.InterfaceC6792g.b;
import p356uh.InterfaceC9196l;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nh/b.class
 */
/* renamed from: nh.b */
/* loaded from: combined.jar:classes2.jar:nh/b.class */
public abstract class AbstractC6787b<B extends InterfaceC6792g.b, E extends B> implements InterfaceC6792g.c<E> {

    /* renamed from: b */
    @NotNull
    public final InterfaceC9196l<InterfaceC6792g.b, E> f35410b;

    /* renamed from: c */
    @NotNull
    public final InterfaceC6792g.c<?> f35411c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uh.l<? super nh.g$b, ? extends E extends B>, uh.l<nh.g$b, E extends B>] */
    public AbstractC6787b(@NotNull InterfaceC6792g.c<B> cVar, @NotNull InterfaceC9196l<? super InterfaceC6792g.b, ? extends E> interfaceC9196l) {
        C9367f.m39526e(cVar, "baseKey");
        C9367f.m39526e(interfaceC9196l, "safeCast");
        this.f35410b = interfaceC9196l;
        this.f35411c = cVar instanceof AbstractC6787b ? ((AbstractC6787b) cVar).f35411c : cVar;
    }

    /* renamed from: a */
    public final boolean m31294a(@NotNull InterfaceC6792g.c<?> cVar) {
        C9367f.m39526e(cVar, "key");
        return cVar == this || this.f35411c == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lnh/g$b;)TE; */
    @Nullable
    /* renamed from: b */
    public final InterfaceC6792g.b m31295b(@NotNull InterfaceC6792g.b bVar) {
        C9367f.m39526e(bVar, "element");
        return (InterfaceC6792g.b) this.f35410b.mo6711d(bVar);
    }
}
