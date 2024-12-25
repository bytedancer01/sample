package p252oh;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5393l;
import p172jh.C5398q;
import p233nh.C6793h;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9200p;
import p372vh.C9367f;
import p372vh.C9375n;
import ph.AbstractC7714a;
import ph.AbstractC7716c;
import ph.AbstractC7722i;
import ph.C7720g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:oh/b.class
 */
/* renamed from: oh.b */
/* loaded from: combined.jar:classes2.jar:oh/b.class */
public class C6975b {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oh/b$a.class
     */
    /* renamed from: oh.b$a */
    /* loaded from: combined.jar:classes2.jar:oh/b$a.class */
    public static final class a extends AbstractC7722i {

        /* renamed from: c */
        public int f35988c;

        /* renamed from: d */
        public final InterfaceC9196l f35989d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6789d interfaceC6789d, InterfaceC9196l interfaceC9196l) {
            super(interfaceC6789d);
            this.f35989d = interfaceC9196l;
        }

        @Override // ph.AbstractC7714a
        @Nullable
        /* renamed from: k */
        public Object mo4817k(@NotNull Object obj) {
            int i10 = this.f35988c;
            if (i10 == 0) {
                this.f35988c = 1;
                C5393l.m26746b(obj);
                obj = ((InterfaceC9196l) C9375n.m39544b(this.f35989d, 1)).mo6711d(this);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f35988c = 2;
                C5393l.m26746b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oh/b$b.class
     */
    /* renamed from: oh.b$b */
    /* loaded from: combined.jar:classes2.jar:oh/b$b.class */
    public static final class b extends AbstractC7716c {

        /* renamed from: e */
        public int f35990e;

        /* renamed from: f */
        public final InterfaceC9196l f35991f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6789d interfaceC6789d, InterfaceC6792g interfaceC6792g, InterfaceC9196l interfaceC9196l) {
            super(interfaceC6789d, interfaceC6792g);
            this.f35991f = interfaceC9196l;
        }

        @Override // ph.AbstractC7714a
        @Nullable
        /* renamed from: k */
        public Object mo4817k(@NotNull Object obj) {
            int i10 = this.f35990e;
            if (i10 == 0) {
                this.f35990e = 1;
                C5393l.m26746b(obj);
                obj = ((InterfaceC9196l) C9375n.m39544b(this.f35991f, 1)).mo6711d(this);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f35990e = 2;
                C5393l.m26746b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oh/b$c.class
     */
    /* renamed from: oh.b$c */
    /* loaded from: combined.jar:classes2.jar:oh/b$c.class */
    public static final class c extends AbstractC7722i {

        /* renamed from: c */
        public int f35992c;

        /* renamed from: d */
        public final InterfaceC9200p f35993d;

        /* renamed from: e */
        public final Object f35994e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC6789d interfaceC6789d, InterfaceC9200p interfaceC9200p, Object obj) {
            super(interfaceC6789d);
            this.f35993d = interfaceC9200p;
            this.f35994e = obj;
        }

        @Override // ph.AbstractC7714a
        @Nullable
        /* renamed from: k */
        public Object mo4817k(@NotNull Object obj) {
            int i10 = this.f35992c;
            if (i10 == 0) {
                this.f35992c = 1;
                C5393l.m26746b(obj);
                obj = ((InterfaceC9200p) C9375n.m39544b(this.f35993d, 2)).mo4818m(this.f35994e, this);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f35992c = 2;
                C5393l.m26746b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:oh/b$d.class
     */
    /* renamed from: oh.b$d */
    /* loaded from: combined.jar:classes2.jar:oh/b$d.class */
    public static final class d extends AbstractC7716c {

        /* renamed from: e */
        public int f35995e;

        /* renamed from: f */
        public final InterfaceC9200p f35996f;

        /* renamed from: g */
        public final Object f35997g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC6789d interfaceC6789d, InterfaceC6792g interfaceC6792g, InterfaceC9200p interfaceC9200p, Object obj) {
            super(interfaceC6789d, interfaceC6792g);
            this.f35996f = interfaceC9200p;
            this.f35997g = obj;
        }

        @Override // ph.AbstractC7714a
        @Nullable
        /* renamed from: k */
        public Object mo4817k(@NotNull Object obj) {
            int i10 = this.f35995e;
            if (i10 == 0) {
                this.f35995e = 1;
                C5393l.m26746b(obj);
                obj = ((InterfaceC9200p) C9375n.m39544b(this.f35996f, 2)).mo4818m(this.f35997g, this);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f35995e = 2;
                C5393l.m26746b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC6789d<C5398q> m32001a(@NotNull InterfaceC9196l<? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9196l, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        InterfaceC6789d aVar;
        C9367f.m39526e(interfaceC9196l, "<this>");
        C9367f.m39526e(interfaceC6789d, "completion");
        InterfaceC6789d<?> m33718a = C7720g.m33718a(interfaceC6789d);
        if (interfaceC9196l instanceof AbstractC7714a) {
            aVar = ((AbstractC7714a) interfaceC9196l).m33704g(m33718a);
        } else {
            InterfaceC6792g mo22619b = m33718a.mo22619b();
            aVar = mo22619b == C6793h.f35418b ? new a(m33718a, interfaceC9196l) : new b(m33718a, mo22619b, interfaceC9196l);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: b */
    public static final <R, T> InterfaceC6789d<C5398q> m32002b(@NotNull InterfaceC9200p<? super R, ? super InterfaceC6789d<? super T>, ? extends Object> interfaceC9200p, R r10, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        InterfaceC6789d cVar;
        C9367f.m39526e(interfaceC9200p, "<this>");
        C9367f.m39526e(interfaceC6789d, "completion");
        InterfaceC6789d<?> m33718a = C7720g.m33718a(interfaceC6789d);
        if (interfaceC9200p instanceof AbstractC7714a) {
            cVar = ((AbstractC7714a) interfaceC9200p).mo4816f(r10, m33718a);
        } else {
            InterfaceC6792g mo22619b = m33718a.mo22619b();
            cVar = mo22619b == C6793h.f35418b ? new c(m33718a, interfaceC9200p, r10) : new d(m33718a, mo22619b, interfaceC9200p, r10);
        }
        return cVar;
    }

    @NotNull
    /* renamed from: c */
    public static final <T> InterfaceC6789d<T> m32003c(@NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        C9367f.m39526e(interfaceC6789d, "<this>");
        AbstractC7716c abstractC7716c = interfaceC6789d instanceof AbstractC7716c ? (AbstractC7716c) interfaceC6789d : null;
        InterfaceC6789d<Object> interfaceC6789d2 = interfaceC6789d;
        if (abstractC7716c != null) {
            interfaceC6789d2 = abstractC7716c.m33708o();
            if (interfaceC6789d2 == null) {
                interfaceC6789d2 = interfaceC6789d;
            }
        }
        return (InterfaceC6789d<T>) interfaceC6789d2;
    }
}
