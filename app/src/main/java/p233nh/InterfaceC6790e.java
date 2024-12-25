package p233nh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6792g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nh/e.class
 */
/* renamed from: nh.e */
/* loaded from: combined.jar:classes2.jar:nh/e.class */
public interface InterfaceC6790e extends InterfaceC6792g.b {

    /* renamed from: d0 */
    @NotNull
    public static final b f35415d0 = b.f35416b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nh/e$a.class
     */
    /* renamed from: nh.e$a */
    /* loaded from: combined.jar:classes2.jar:nh/e$a.class */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static <E extends InterfaceC6792g.b> E m31300a(@NotNull InterfaceC6790e interfaceC6790e, @NotNull InterfaceC6792g.c<E> cVar) {
            C9367f.m39526e(cVar, "key");
            if (!(cVar instanceof AbstractC6787b)) {
                if (InterfaceC6790e.f35415d0 != cVar) {
                    interfaceC6790e = null;
                }
                return interfaceC6790e;
            }
            AbstractC6787b abstractC6787b = (AbstractC6787b) cVar;
            InterfaceC6792g.b bVar = null;
            if (abstractC6787b.m31294a(interfaceC6790e.getKey())) {
                InterfaceC6792g.b m31295b = abstractC6787b.m31295b(interfaceC6790e);
                bVar = null;
                if (m31295b instanceof InterfaceC6792g.b) {
                    bVar = m31295b;
                }
            }
            return (E) bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [nh.h] */
        @NotNull
        /* renamed from: b */
        public static InterfaceC6792g m31301b(@NotNull InterfaceC6790e interfaceC6790e, @NotNull InterfaceC6792g.c<?> cVar) {
            C9367f.m39526e(cVar, "key");
            if (!(cVar instanceof AbstractC6787b)) {
                if (InterfaceC6790e.f35415d0 == cVar) {
                    interfaceC6790e = C6793h.f35418b;
                }
                return interfaceC6790e;
            }
            AbstractC6787b abstractC6787b = (AbstractC6787b) cVar;
            InterfaceC6792g interfaceC6792g = interfaceC6790e;
            if (abstractC6787b.m31294a(interfaceC6790e.getKey())) {
                interfaceC6792g = interfaceC6790e;
                if (abstractC6787b.m31295b(interfaceC6790e) != null) {
                    interfaceC6792g = C6793h.f35418b;
                }
            }
            return interfaceC6792g;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nh/e$b.class
     */
    /* renamed from: nh.e$b */
    /* loaded from: combined.jar:classes2.jar:nh/e$b.class */
    public static final class b implements InterfaceC6792g.c<InterfaceC6790e> {

        /* renamed from: b */
        public static final b f35416b = new b();
    }

    /* renamed from: v0 */
    void mo22634v0(@NotNull InterfaceC6789d<?> interfaceC6789d);

    @NotNull
    /* renamed from: y */
    <T> InterfaceC6789d<T> mo22635y(@NotNull InterfaceC6789d<? super T> interfaceC6789d);
}
