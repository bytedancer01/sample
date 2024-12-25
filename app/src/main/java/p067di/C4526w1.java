package p067di;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9200p;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/w1.class
 */
/* renamed from: di.w1 */
/* loaded from: combined.jar:classes2.jar:di/w1.class */
public final class C4526w1 implements InterfaceC6792g.b, InterfaceC6792g.c<C4526w1> {

    /* renamed from: b */
    @NotNull
    public static final C4526w1 f26954b = new C4526w1();

    @Override // p233nh.InterfaceC6792g
    public <R> R fold(R r10, @NotNull InterfaceC9200p<? super R, ? super InterfaceC6792g.b, ? extends R> interfaceC9200p) {
        return (R) InterfaceC6792g.b.a.m31306a(this, r10, interfaceC9200p);
    }

    @Override // p233nh.InterfaceC6792g.b, p233nh.InterfaceC6792g
    @Nullable
    public <E extends InterfaceC6792g.b> E get(@NotNull InterfaceC6792g.c<E> cVar) {
        return (E) InterfaceC6792g.b.a.m31307b(this, cVar);
    }

    @Override // p233nh.InterfaceC6792g.b
    @NotNull
    public InterfaceC6792g.c<?> getKey() {
        return this;
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g minusKey(@NotNull InterfaceC6792g.c<?> cVar) {
        return InterfaceC6792g.b.a.m31308c(this, cVar);
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g plus(@NotNull InterfaceC6792g interfaceC6792g) {
        return InterfaceC6792g.b.a.m31309d(this, interfaceC6792g);
    }
}
