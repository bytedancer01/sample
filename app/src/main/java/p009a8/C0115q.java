package p009a8;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p009a8.InterfaceC0127w;
import p026b8.C0820a;
import p027b9.InterfaceC0832b;
import p027b9.InterfaceC0853l0;
import p059d9.C4401z0;
import p267p6.AbstractC7574e2;
import p267p6.C7561b1;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:a8/q.class
 */
/* renamed from: a8.q */
/* loaded from: combined.jar:classes2.jar:a8/q.class */
public final class C0115q extends AbstractC0095g<Void> {

    /* renamed from: k */
    public final InterfaceC0127w f485k;

    /* renamed from: l */
    public final boolean f486l;

    /* renamed from: m */
    public final AbstractC7574e2.c f487m;

    /* renamed from: n */
    public final AbstractC7574e2.b f488n;

    /* renamed from: o */
    public a f489o;

    /* renamed from: p */
    public C0113p f490p;

    /* renamed from: q */
    public boolean f491q;

    /* renamed from: r */
    public boolean f492r;

    /* renamed from: s */
    public boolean f493s;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/q$a.class
     */
    /* renamed from: a8.q$a */
    /* loaded from: combined.jar:classes2.jar:a8/q$a.class */
    public static final class a extends AbstractC0107m {

        /* renamed from: f */
        public static final Object f494f = new Object();

        /* renamed from: d */
        public final Object f495d;

        /* renamed from: e */
        public final Object f496e;

        public a(AbstractC7574e2 abstractC7574e2, Object obj, Object obj2) {
            super(abstractC7574e2);
            this.f495d = obj;
            this.f496e = obj2;
        }

        /* renamed from: u */
        public static a m566u(C7561b1 c7561b1) {
            return new a(new b(c7561b1), AbstractC7574e2.c.f36716r, f494f);
        }

        /* renamed from: v */
        public static a m567v(AbstractC7574e2 abstractC7574e2, Object obj, Object obj2) {
            return new a(abstractC7574e2, obj, obj2);
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: b */
        public int mo506b(Object obj) {
            AbstractC7574e2 abstractC7574e2 = this.f427c;
            Object obj2 = obj;
            if (f494f.equals(obj)) {
                Object obj3 = this.f496e;
                obj2 = obj;
                if (obj3 != null) {
                    obj2 = obj3;
                }
            }
            return abstractC7574e2.mo506b(obj2);
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: g */
        public AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
            this.f427c.mo404g(i10, bVar, z10);
            if (C4401z0.m22371c(bVar.f36710b, this.f496e) && z10) {
                bVar.f36710b = f494f;
            }
            return bVar;
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: m */
        public Object mo511m(int i10) {
            Object mo511m = this.f427c.mo511m(i10);
            Object obj = mo511m;
            if (C4401z0.m22371c(mo511m, this.f496e)) {
                obj = f494f;
            }
            return obj;
        }

        @Override // p009a8.AbstractC0107m, p267p6.AbstractC7574e2
        /* renamed from: o */
        public AbstractC7574e2.c mo405o(int i10, AbstractC7574e2.c cVar, long j10) {
            this.f427c.mo405o(i10, cVar, j10);
            if (C4401z0.m22371c(cVar.f36720a, this.f495d)) {
                cVar.f36720a = AbstractC7574e2.c.f36716r;
            }
            return cVar;
        }

        /* renamed from: t */
        public a m568t(AbstractC7574e2 abstractC7574e2) {
            return new a(abstractC7574e2, this.f495d, this.f496e);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:a8/q$b.class
     */
    /* renamed from: a8.q$b */
    /* loaded from: combined.jar:classes2.jar:a8/q$b.class */
    public static final class b extends AbstractC7574e2 {

        /* renamed from: c */
        public final C7561b1 f497c;

        public b(C7561b1 c7561b1) {
            this.f497c = c7561b1;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: b */
        public int mo506b(Object obj) {
            return obj == a.f494f ? 0 : -1;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: g */
        public AbstractC7574e2.b mo404g(int i10, AbstractC7574e2.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f494f;
            }
            bVar.m32688t(num, obj, 0, -9223372036854775807L, 0L, C0820a.f5682g, true);
            return bVar;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: i */
        public int mo509i() {
            return 1;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: m */
        public Object mo511m(int i10) {
            return a.f494f;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: o */
        public AbstractC7574e2.c mo405o(int i10, AbstractC7574e2.c cVar, long j10) {
            cVar.m32695g(AbstractC7574e2.c.f36716r, this.f497c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f36731l = true;
            return cVar;
        }

        @Override // p267p6.AbstractC7574e2
        /* renamed from: p */
        public int mo512p() {
            return 1;
        }
    }

    public C0115q(InterfaceC0127w interfaceC0127w, boolean z10) {
        this.f485k = interfaceC0127w;
        this.f486l = z10 && interfaceC0127w.mo313n();
        this.f487m = new AbstractC7574e2.c();
        this.f488n = new AbstractC7574e2.b();
        AbstractC7574e2 mo314p = interfaceC0127w.mo314p();
        if (mo314p == null) {
            this.f489o = a.m566u(interfaceC0127w.mo400d());
        } else {
            this.f489o = a.m567v(mo314p, null, null);
            this.f493s = true;
        }
    }

    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: B */
    public void mo303B(InterfaceC0853l0 interfaceC0853l0) {
        super.mo303B(interfaceC0853l0);
        if (this.f486l) {
            return;
        }
        this.f491q = true;
        m421K(null, this.f485k);
    }

    @Override // p009a8.AbstractC0095g, p009a8.AbstractC0081a
    /* renamed from: D */
    public void mo305D() {
        this.f492r = false;
        this.f491q = false;
        super.mo305D();
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public C0113p mo401h(InterfaceC0127w.a aVar, InterfaceC0832b interfaceC0832b, long j10) {
        C0113p c0113p = new C0113p(aVar, interfaceC0832b, j10);
        c0113p.m534y(this.f485k);
        if (this.f492r) {
            c0113p.m527e(aVar.m641c(m560O(aVar.f544a)));
        } else {
            this.f490p = c0113p;
            if (!this.f491q) {
                this.f491q = true;
                m421K(null, this.f485k);
            }
        }
        return c0113p;
    }

    /* renamed from: N */
    public final Object m559N(Object obj) {
        Object obj2 = obj;
        if (this.f489o.f496e != null) {
            obj2 = obj;
            if (this.f489o.f496e.equals(obj)) {
                obj2 = a.f494f;
            }
        }
        return obj2;
    }

    /* renamed from: O */
    public final Object m560O(Object obj) {
        Object obj2 = obj;
        if (this.f489o.f496e != null) {
            obj2 = obj;
            if (obj.equals(a.f494f)) {
                obj2 = this.f489o.f496e;
            }
        }
        return obj2;
    }

    @Override // p009a8.AbstractC0095g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC0127w.a mo418F(Void r52, InterfaceC0127w.a aVar) {
        return aVar.m641c(m559N(aVar.f544a));
    }

    /* renamed from: Q */
    public AbstractC7574e2 m562Q() {
        return this.f489o;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x013a  */
    @Override // p009a8.AbstractC0095g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m417I(java.lang.Void r8, p009a8.InterfaceC0127w r9, p267p6.AbstractC7574e2 r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p009a8.C0115q.m417I(java.lang.Void, a8.w, p6.e2):void");
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: S */
    public final void m564S(long j10) {
        C0113p c0113p = this.f490p;
        int mo506b = this.f489o.mo506b(c0113p.f464b.f544a);
        if (mo506b == -1) {
            return;
        }
        long j11 = this.f489o.m32663f(mo506b, this.f488n).f36712d;
        long j12 = j10;
        if (j11 != -9223372036854775807L) {
            j12 = j10;
            if (j10 >= j11) {
                j12 = Math.max(0L, j11 - 1);
            }
        }
        c0113p.m532u(j12);
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: d */
    public C7561b1 mo400d() {
        return this.f485k.mo400d();
    }

    @Override // p009a8.AbstractC0095g, p009a8.InterfaceC0127w
    /* renamed from: m */
    public void mo402m() {
    }

    @Override // p009a8.InterfaceC0127w
    /* renamed from: q */
    public void mo403q(InterfaceC0121t interfaceC0121t) {
        ((C0113p) interfaceC0121t).m533x();
        if (interfaceC0121t == this.f490p) {
            this.f490p = null;
        }
    }
}
