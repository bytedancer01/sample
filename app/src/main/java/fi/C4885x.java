package fi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.InterfaceC4514s1;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9200p;
import p372vh.AbstractC9368g;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/x.class
 */
/* renamed from: fi.x */
/* loaded from: combined.jar:classes2.jar:fi/x.class */
public final class C4885x {

    /* renamed from: a */
    @NotNull
    public static final C4881t f28587a = new C4881t("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    @NotNull
    public static final InterfaceC9200p<Object, InterfaceC6792g.b, Object> f28588b = a.f28591c;

    /* renamed from: c */
    @NotNull
    public static final InterfaceC9200p<InterfaceC4514s1<?>, InterfaceC6792g.b, InterfaceC4514s1<?>> f28589c = b.f28592c;

    /* renamed from: d */
    @NotNull
    public static final InterfaceC9200p<C4862a0, InterfaceC6792g.b, C4862a0> f28590d = c.f28593c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fi/x$a.class
     */
    /* renamed from: fi.x$a */
    /* loaded from: combined.jar:classes2.jar:fi/x$a.class */
    public static final class a extends AbstractC9368g implements InterfaceC9200p<Object, InterfaceC6792g.b, Object> {

        /* renamed from: c */
        public static final a f28591c = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Integer] */
        @Override // p356uh.InterfaceC9200p
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo4818m(@Nullable Object obj, @NotNull InterfaceC6792g.b bVar) {
            if (!(bVar instanceof InterfaceC4514s1)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            if (intValue != 0) {
                bVar = Integer.valueOf(intValue + 1);
            }
            return bVar;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fi/x$b.class
     */
    /* renamed from: fi.x$b */
    /* loaded from: combined.jar:classes2.jar:fi/x$b.class */
    public static final class b extends AbstractC9368g implements InterfaceC9200p<InterfaceC4514s1<?>, InterfaceC6792g.b, InterfaceC4514s1<?>> {

        /* renamed from: c */
        public static final b f28592c = new b();

        public b() {
            super(2);
        }

        @Override // p356uh.InterfaceC9200p
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4514s1<?> mo4818m(@Nullable InterfaceC4514s1<?> interfaceC4514s1, @NotNull InterfaceC6792g.b bVar) {
            if (interfaceC4514s1 != null) {
                return interfaceC4514s1;
            }
            return bVar instanceof InterfaceC4514s1 ? (InterfaceC4514s1) bVar : null;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:fi/x$c.class
     */
    /* renamed from: fi.x$c */
    /* loaded from: combined.jar:classes2.jar:fi/x$c.class */
    public static final class c extends AbstractC9368g implements InterfaceC9200p<C4862a0, InterfaceC6792g.b, C4862a0> {

        /* renamed from: c */
        public static final c f28593c = new c();

        public c() {
            super(2);
        }

        @Override // p356uh.InterfaceC9200p
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4862a0 mo4818m(@NotNull C4862a0 c4862a0, @NotNull InterfaceC6792g.b bVar) {
            if (bVar instanceof InterfaceC4514s1) {
                InterfaceC4514s1<?> interfaceC4514s1 = (InterfaceC4514s1) bVar;
                c4862a0.m24736a(interfaceC4514s1, interfaceC4514s1.m22833t(c4862a0.f28543a));
            }
            return c4862a0;
        }
    }

    /* renamed from: a */
    public static final void m24816a(@NotNull InterfaceC6792g interfaceC6792g, @Nullable Object obj) {
        if (obj == f28587a) {
            return;
        }
        if (obj instanceof C4862a0) {
            ((C4862a0) obj).m24737b(interfaceC6792g);
            return;
        }
        Object fold = interfaceC6792g.fold(null, f28589c);
        if (fold == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((InterfaceC4514s1) fold).m22832q(interfaceC6792g, obj);
    }

    @NotNull
    /* renamed from: b */
    public static final Object m24817b(@NotNull InterfaceC6792g interfaceC6792g) {
        Object fold = interfaceC6792g.fold(0, f28588b);
        C9367f.m39524c(fold);
        return fold;
    }

    @Nullable
    /* renamed from: c */
    public static final Object m24818c(@NotNull InterfaceC6792g interfaceC6792g, @Nullable Object obj) {
        Object obj2 = obj;
        if (obj == null) {
            obj2 = m24817b(interfaceC6792g);
        }
        return obj2 == 0 ? f28587a : obj2 instanceof Integer ? interfaceC6792g.fold(new C4862a0(interfaceC6792g, ((Number) obj2).intValue()), f28590d) : ((InterfaceC4514s1) obj2).m22833t(interfaceC6792g);
    }
}
