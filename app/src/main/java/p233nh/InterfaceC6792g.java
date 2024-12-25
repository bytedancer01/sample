package p233nh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233nh.InterfaceC6790e;
import p356uh.InterfaceC9200p;
import p372vh.AbstractC9368g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nh/g.class
 */
/* renamed from: nh.g */
/* loaded from: combined.jar:classes2.jar:nh/g.class */
public interface InterfaceC6792g {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nh/g$a.class
     */
    /* renamed from: nh.g$a */
    /* loaded from: combined.jar:classes2.jar:nh/g$a.class */
    public static final class a {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:nh/g$a$a.class
         */
        /* renamed from: nh.g$a$a, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes2.jar:nh/g$a$a.class */
        public static final class C10326a extends AbstractC9368g implements InterfaceC9200p<InterfaceC6792g, b, InterfaceC6792g> {

            /* renamed from: c */
            public static final C10326a f35417c = new C10326a();

            public C10326a() {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15, types: [nh.c] */
            /* JADX WARN: Type inference failed for: r0v16, types: [nh.c] */
            /* JADX WARN: Type inference failed for: r0v18, types: [nh.c] */
            @Override // p356uh.InterfaceC9200p
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC6792g mo4818m(@NotNull InterfaceC6792g interfaceC6792g, @NotNull b bVar) {
                b c6788c;
                C9367f.m39526e(interfaceC6792g, "acc");
                C9367f.m39526e(bVar, "element");
                InterfaceC6792g minusKey = interfaceC6792g.minusKey(bVar.getKey());
                C6793h c6793h = C6793h.f35418b;
                if (minusKey != c6793h) {
                    InterfaceC6790e.b bVar2 = InterfaceC6790e.f35415d0;
                    InterfaceC6790e interfaceC6790e = (InterfaceC6790e) minusKey.get(bVar2);
                    if (interfaceC6790e == null) {
                        c6788c = new C6788c(minusKey, bVar);
                    } else {
                        InterfaceC6792g minusKey2 = minusKey.minusKey(bVar2);
                        if (minusKey2 == c6793h) {
                            bVar = new C6788c(bVar, interfaceC6790e);
                        } else {
                            c6788c = new C6788c(new C6788c(minusKey2, bVar), interfaceC6790e);
                        }
                    }
                    bVar = c6788c;
                }
                return bVar;
            }
        }

        @NotNull
        /* renamed from: a */
        public static InterfaceC6792g m31304a(@NotNull InterfaceC6792g interfaceC6792g, @NotNull InterfaceC6792g interfaceC6792g2) {
            C9367f.m39526e(interfaceC6792g2, "context");
            if (interfaceC6792g2 != C6793h.f35418b) {
                interfaceC6792g = (InterfaceC6792g) interfaceC6792g2.fold(interfaceC6792g, C10326a.f35417c);
            }
            return interfaceC6792g;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nh/g$b.class
     */
    /* renamed from: nh.g$b */
    /* loaded from: combined.jar:classes2.jar:nh/g$b.class */
    public interface b extends InterfaceC6792g {

        /* JADX WARN: Classes with same name are omitted:
          classes2.jar:nh/g$b$a.class
         */
        /* renamed from: nh.g$b$a */
        /* loaded from: combined.jar:classes2.jar:nh/g$b$a.class */
        public static final class a {
            /* renamed from: a */
            public static <R> R m31306a(@NotNull b bVar, R r10, @NotNull InterfaceC9200p<? super R, ? super b, ? extends R> interfaceC9200p) {
                C9367f.m39526e(interfaceC9200p, "operation");
                return interfaceC9200p.mo4818m(r10, bVar);
            }

            @Nullable
            /* renamed from: b */
            public static <E extends b> E m31307b(@NotNull b bVar, @NotNull c<E> cVar) {
                C9367f.m39526e(cVar, "key");
                if (!C9367f.m39522a(bVar.getKey(), cVar)) {
                    bVar = null;
                }
                return (E) bVar;
            }

            @NotNull
            /* renamed from: c */
            public static InterfaceC6792g m31308c(@NotNull b bVar, @NotNull c<?> cVar) {
                C9367f.m39526e(cVar, "key");
                InterfaceC6792g interfaceC6792g = bVar;
                if (C9367f.m39522a(bVar.getKey(), cVar)) {
                    interfaceC6792g = C6793h.f35418b;
                }
                return interfaceC6792g;
            }

            @NotNull
            /* renamed from: d */
            public static InterfaceC6792g m31309d(@NotNull b bVar, @NotNull InterfaceC6792g interfaceC6792g) {
                C9367f.m39526e(interfaceC6792g, "context");
                return a.m31304a(bVar, interfaceC6792g);
            }
        }

        @Override // p233nh.InterfaceC6792g
        @Nullable
        <E extends b> E get(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nh/g$c.class
     */
    /* renamed from: nh.g$c */
    /* loaded from: combined.jar:classes2.jar:nh/g$c.class */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, @NotNull InterfaceC9200p<? super R, ? super b, ? extends R> interfaceC9200p);

    @Nullable
    <E extends b> E get(@NotNull c<E> cVar);

    @NotNull
    InterfaceC6792g minusKey(@NotNull c<?> cVar);

    @NotNull
    InterfaceC6792g plus(@NotNull InterfaceC6792g interfaceC6792g);
}
