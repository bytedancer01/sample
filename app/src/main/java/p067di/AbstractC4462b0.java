package p067di;

import fi.C4866e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.AbstractC6786a;
import p233nh.AbstractC6787b;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6790e;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9196l;
import p372vh.AbstractC9368g;
import p372vh.C9365d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/b0.class
 */
/* renamed from: di.b0 */
/* loaded from: combined.jar:classes2.jar:di/b0.class */
public abstract class AbstractC4462b0 extends AbstractC6786a implements InterfaceC6790e {

    /* renamed from: b */
    @NotNull
    public static final a f26875b = new a(null);

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/b0$a.class
     */
    /* renamed from: di.b0$a */
    /* loaded from: combined.jar:classes2.jar:di/b0$a.class */
    public static final class a extends AbstractC6787b<InterfaceC6790e, AbstractC4462b0> {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:di/b0$a$a.class
         */
        /* renamed from: di.b0$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:di/b0$a$a.class */
        public static final class C10283a extends AbstractC9368g implements InterfaceC9196l<InterfaceC6792g.b, AbstractC4462b0> {

            /* renamed from: c */
            public static final C10283a f26876c = new C10283a();

            public C10283a() {
                super(1);
            }

            @Override // p356uh.InterfaceC9196l
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC4462b0 mo6711d(@NotNull InterfaceC6792g.b bVar) {
                return bVar instanceof AbstractC4462b0 ? (AbstractC4462b0) bVar : null;
            }
        }

        public a() {
            super(InterfaceC6790e.f35415d0, C10283a.f26876c);
        }

        public /* synthetic */ a(C9365d c9365d) {
            this();
        }
    }

    public AbstractC4462b0() {
        super(InterfaceC6790e.f35415d0);
    }

    /* renamed from: A0 */
    public abstract void mo22632A0(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Runnable runnable);

    /* renamed from: B0 */
    public boolean mo22633B0(@NotNull InterfaceC6792g interfaceC6792g) {
        return true;
    }

    @Override // p233nh.AbstractC6786a, p233nh.InterfaceC6792g.b, p233nh.InterfaceC6792g
    @Nullable
    public <E extends InterfaceC6792g.b> E get(@NotNull InterfaceC6792g.c<E> cVar) {
        return (E) InterfaceC6790e.a.m31300a(this, cVar);
    }

    @Override // p233nh.AbstractC6786a, p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g minusKey(@NotNull InterfaceC6792g.c<?> cVar) {
        return InterfaceC6790e.a.m31301b(this, cVar);
    }

    @NotNull
    public String toString() {
        return C4483i0.m22670a(this) + '@' + C4483i0.m22671b(this);
    }

    @Override // p233nh.InterfaceC6790e
    /* renamed from: v0 */
    public void mo22634v0(@NotNull InterfaceC6789d<?> interfaceC6789d) {
        ((C4866e) interfaceC6789d).m24747o();
    }

    @Override // p233nh.InterfaceC6790e
    @NotNull
    /* renamed from: y */
    public final <T> InterfaceC6789d<T> mo22635y(@NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        return new C4866e(this, interfaceC6789d);
    }
}
