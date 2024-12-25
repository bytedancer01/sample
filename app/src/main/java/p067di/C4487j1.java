package p067di;

import fi.AbstractC4878q;
import fi.C4871j;
import fi.C4872k;
import fi.C4881t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.InterfaceC4466c1;
import p172jh.C5382a;
import p172jh.C5398q;
import p233nh.InterfaceC6792g;
import p313s.C8490b;
import p356uh.InterfaceC9196l;
import p356uh.InterfaceC9200p;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/j1.class
 */
/* renamed from: di.j1 */
/* loaded from: combined.jar:classes2.jar:di/j1.class */
public class C4487j1 implements InterfaceC4466c1, InterfaceC4503p, InterfaceC4508q1 {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f26889b = AtomicReferenceFieldUpdater.newUpdater(C4487j1.class, Object.class, "_state");

    @NotNull
    private volatile Object _parentHandle;

    @NotNull
    private volatile Object _state;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/j1$a.class
     */
    /* renamed from: di.j1$a */
    /* loaded from: combined.jar:classes2.jar:di/j1$a.class */
    public static final class a extends AbstractC4484i1 {

        /* renamed from: f */
        @NotNull
        public final C4487j1 f26890f;

        /* renamed from: g */
        @NotNull
        public final b f26891g;

        /* renamed from: h */
        @NotNull
        public final C4500o f26892h;

        /* renamed from: i */
        @Nullable
        public final Object f26893i;

        public a(@NotNull C4487j1 c4487j1, @NotNull b bVar, @NotNull C4500o c4500o, @Nullable Object obj) {
            this.f26890f = c4487j1;
            this.f26891g = bVar;
            this.f26892h = c4500o;
            this.f26893i = obj;
        }

        @Override // p356uh.InterfaceC9196l
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C5398q mo6711d(Throwable th2) {
            mo22631t(th2);
            return C5398q.f30770a;
        }

        @Override // p067di.AbstractC4527x
        /* renamed from: t */
        public void mo22631t(@Nullable Throwable th2) {
            this.f26890f.m22684A(this.f26891g, this.f26892h, this.f26893i);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/j1$b.class
     */
    /* renamed from: di.j1$b */
    /* loaded from: combined.jar:classes2.jar:di/j1$b.class */
    public static final class b implements InterfaceC4528x0 {

        @NotNull
        private volatile Object _exceptionsHolder = null;

        @NotNull
        private volatile int _isCompleting;

        @NotNull
        private volatile Object _rootCause;

        /* renamed from: b */
        @NotNull
        public final C4499n1 f26894b;

        public b(@NotNull C4499n1 c4499n1, boolean z10, @Nullable Throwable th2) {
            this.f26894b = c4499n1;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        @Override // p067di.InterfaceC4528x0
        @NotNull
        /* renamed from: a */
        public C4499n1 mo22673a() {
            return this.f26894b;
        }

        /* renamed from: b */
        public final void m22729b(@NotNull Throwable th2) {
            Throwable m22732e = m22732e();
            if (m22732e == null) {
                m22739l(th2);
                return;
            }
            if (th2 == m22732e) {
                return;
            }
            Object m22731d = m22731d();
            if (m22731d == null) {
                m22738k(th2);
                return;
            }
            if (!(m22731d instanceof Throwable)) {
                if (!(m22731d instanceof ArrayList)) {
                    throw new IllegalStateException(C9367f.m39532k("State is ", m22731d).toString());
                }
                ((ArrayList) m22731d).add(th2);
            } else {
                if (th2 == m22731d) {
                    return;
                }
                ArrayList<Throwable> m22730c = m22730c();
                m22730c.add(m22731d);
                m22730c.add(th2);
                C5398q c5398q = C5398q.f30770a;
                m22738k(m22730c);
            }
        }

        /* renamed from: c */
        public final ArrayList<Throwable> m22730c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public final Object m22731d() {
            return this._exceptionsHolder;
        }

        @Nullable
        /* renamed from: e */
        public final Throwable m22732e() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: f */
        public final boolean m22733f() {
            return m22732e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
        /* renamed from: g */
        public final boolean m22734g() {
            return this._isCompleting;
        }

        /* renamed from: h */
        public final boolean m22735h() {
            C4881t c4881t;
            Object m22731d = m22731d();
            c4881t = C4490k1.f26908e;
            return m22731d == c4881t;
        }

        @NotNull
        /* renamed from: i */
        public final List<Throwable> m22736i(@Nullable Throwable th2) {
            ArrayList<Throwable> arrayList;
            C4881t c4881t;
            Object m22731d = m22731d();
            if (m22731d == null) {
                arrayList = m22730c();
            } else if (m22731d instanceof Throwable) {
                arrayList = m22730c();
                arrayList.add(m22731d);
            } else {
                if (!(m22731d instanceof ArrayList)) {
                    throw new IllegalStateException(C9367f.m39532k("State is ", m22731d).toString());
                }
                arrayList = (ArrayList) m22731d;
            }
            Throwable m22732e = m22732e();
            if (m22732e != null) {
                arrayList.add(0, m22732e);
            }
            if (th2 != null && !C9367f.m39522a(th2, m22732e)) {
                arrayList.add(th2);
            }
            c4881t = C4490k1.f26908e;
            m22738k(c4881t);
            return arrayList;
        }

        @Override // p067di.InterfaceC4528x0
        public boolean isActive() {
            return m22732e() == null;
        }

        /* renamed from: j */
        public final void m22737j(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        /* renamed from: k */
        public final void m22738k(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: l */
        public final void m22739l(@Nullable Throwable th2) {
            this._rootCause = th2;
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + m22733f() + ", completing=" + m22734g() + ", rootCause=" + m22732e() + ", exceptions=" + m22731d() + ", list=" + mo22673a() + ']';
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:di/j1$c.class
     */
    /* renamed from: di.j1$c */
    /* loaded from: combined.jar:classes2.jar:di/j1$c.class */
    public static final class c extends C4872k.a {

        /* renamed from: d */
        public final C4872k f26895d;

        /* renamed from: e */
        public final C4487j1 f26896e;

        /* renamed from: f */
        public final Object f26897f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4872k c4872k, C4487j1 c4487j1, Object obj) {
            super(c4872k);
            this.f26895d = c4872k;
            this.f26896e = c4487j1;
            this.f26897f = obj;
        }

        @Override // fi.AbstractC4864c
        @Nullable
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo22740g(@NotNull C4872k c4872k) {
            return this.f26896e.m22692K() == this.f26897f ? null : C4871j.m24760a();
        }
    }

    public C4487j1(boolean z10) {
        C4504p0 c4504p0;
        C4504p0 c4504p02;
        C4504p0 c4504p03;
        if (z10) {
            c4504p03 = C4490k1.f26910g;
            c4504p02 = c4504p03;
        } else {
            c4504p0 = C4490k1.f26909f;
            c4504p02 = c4504p0;
        }
        this._state = c4504p02;
        this._parentHandle = null;
    }

    /* renamed from: h0 */
    public static /* synthetic */ CancellationException m22683h0(C4487j1 c4487j1, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c4487j1.m22711g0(th2, str);
    }

    /* renamed from: A */
    public final void m22684A(b bVar, C4500o c4500o, Object obj) {
        C4500o m22700U = m22700U(c4500o);
        if (m22700U == null || !m22722n0(bVar, m22700U, obj)) {
            mo22716k(m22686C(bVar, obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* renamed from: B */
    public final Throwable m22685B(Object obj) {
        CancellationException mo22726v;
        if (obj == null ? true : obj instanceof Throwable) {
            ?? r02 = (Throwable) obj;
            mo22726v = r02;
            if (r02 == 0) {
                mo22726v = new C4469d1(mo22625u(), null, this);
            }
        } else {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            }
            mo22726v = ((InterfaceC4508q1) obj).mo22726v();
        }
        return mo22726v;
    }

    /* renamed from: C */
    public final Object m22686C(b bVar, Object obj) {
        boolean m22733f;
        Throwable m22689F;
        C4521v c4521v = obj instanceof C4521v ? (C4521v) obj : null;
        Throwable th2 = c4521v == null ? null : c4521v.f26946a;
        synchronized (bVar) {
            m22733f = bVar.m22733f();
            List<Throwable> m22736i = bVar.m22736i(th2);
            m22689F = m22689F(bVar, m22736i);
            if (m22689F != null) {
                m22714j(m22689F, m22736i);
            }
        }
        boolean z10 = false;
        if (m22689F != null && m22689F != th2) {
            obj = new C4521v(m22689F, false, 2, null);
        }
        if (m22689F != null) {
            if (m22725s(m22689F) || mo22693L(m22689F)) {
                z10 = true;
            }
            if (z10) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((C4521v) obj).m22845b();
            }
        }
        if (!m22733f) {
            m22703X(m22689F);
        }
        mo22618Y(obj);
        C8490b.m36639a(f26889b, this, bVar, C4490k1.m22780g(obj));
        m22728z(bVar, obj);
        return obj;
    }

    /* renamed from: D */
    public final C4500o m22687D(InterfaceC4528x0 interfaceC4528x0) {
        C4500o c4500o;
        C4500o c4500o2 = interfaceC4528x0 instanceof C4500o ? (C4500o) interfaceC4528x0 : null;
        if (c4500o2 == null) {
            C4499n1 mo22673a = interfaceC4528x0.mo22673a();
            c4500o = mo22673a == null ? null : m22700U(mo22673a);
        } else {
            c4500o = c4500o2;
        }
        return c4500o;
    }

    /* renamed from: E */
    public final Throwable m22688E(Object obj) {
        C4521v c4521v = obj instanceof C4521v ? (C4521v) obj : null;
        return c4521v == null ? null : c4521v.f26946a;
    }

    /* renamed from: F */
    public final Throwable m22689F(b bVar, List<? extends Throwable> list) {
        Object obj;
        if (list.isEmpty()) {
            if (bVar.m22733f()) {
                return new C4469d1(mo22625u(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!(!(((Throwable) obj) instanceof CancellationException)));
        Throwable th2 = (Throwable) obj;
        return th2 != null ? th2 : list.get(0);
    }

    /* renamed from: G */
    public boolean mo22656G() {
        return true;
    }

    /* renamed from: H */
    public boolean mo22657H() {
        return false;
    }

    /* renamed from: I */
    public final C4499n1 m22690I(InterfaceC4528x0 interfaceC4528x0) {
        C4499n1 mo22673a = interfaceC4528x0.mo22673a();
        C4499n1 c4499n1 = mo22673a;
        if (mo22673a == null) {
            if (interfaceC4528x0 instanceof C4504p0) {
                c4499n1 = new C4499n1();
            } else {
                if (!(interfaceC4528x0 instanceof AbstractC4484i1)) {
                    throw new IllegalStateException(C9367f.m39532k("State should have list: ", interfaceC4528x0).toString());
                }
                m22706b0((AbstractC4484i1) interfaceC4528x0);
                c4499n1 = null;
            }
        }
        return c4499n1;
    }

    @Nullable
    /* renamed from: J */
    public final InterfaceC4497n m22691J() {
        return (InterfaceC4497n) this._parentHandle;
    }

    @Nullable
    /* renamed from: K */
    public final Object m22692K() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC4878q)) {
                return obj;
            }
            ((AbstractC4878q) obj).mo24739c(this);
        }
    }

    /* renamed from: L */
    public boolean mo22693L(@NotNull Throwable th2) {
        return false;
    }

    /* renamed from: M */
    public void mo22616M(@NotNull Throwable th2) {
        throw th2;
    }

    /* renamed from: N */
    public final void m22694N(@Nullable InterfaceC4466c1 interfaceC4466c1) {
        if (interfaceC4466c1 == null) {
            m22708d0(C4502o1.f26920b);
            return;
        }
        interfaceC4466c1.start();
        InterfaceC4497n mo22642o0 = interfaceC4466c1.mo22642o0(this);
        m22708d0(mo22642o0);
        if (m22695O()) {
            mo22642o0.dispose();
            m22708d0(C4502o1.f26920b);
        }
    }

    /* renamed from: O */
    public final boolean m22695O() {
        return !(m22692K() instanceof InterfaceC4528x0);
    }

    /* renamed from: P */
    public boolean mo22696P() {
        return false;
    }

    /* renamed from: Q */
    public final Object m22697Q(Object obj) {
        C4881t c4881t;
        C4881t c4881t2;
        C4881t c4881t3;
        C4881t c4881t4;
        C4881t c4881t5;
        C4881t c4881t6;
        Throwable th2 = null;
        while (true) {
            Object m22692K = m22692K();
            if (m22692K instanceof b) {
                synchronized (m22692K) {
                    if (((b) m22692K).m22735h()) {
                        c4881t2 = C4490k1.f26907d;
                        return c4881t2;
                    }
                    boolean m22733f = ((b) m22692K).m22733f();
                    if (obj != null || !m22733f) {
                        Throwable th3 = th2;
                        if (th2 == null) {
                            th3 = m22685B(obj);
                        }
                        ((b) m22692K).m22729b(th3);
                    }
                    Throwable m22732e = ((b) m22692K).m22732e();
                    Throwable th4 = null;
                    if (!m22733f) {
                        th4 = m22732e;
                    }
                    if (th4 != null) {
                        m22701V(((b) m22692K).mo22673a(), th4);
                    }
                    c4881t = C4490k1.f26904a;
                    return c4881t;
                }
            }
            if (!(m22692K instanceof InterfaceC4528x0)) {
                c4881t3 = C4490k1.f26907d;
                return c4881t3;
            }
            Throwable th5 = th2;
            if (th2 == null) {
                th5 = m22685B(obj);
            }
            InterfaceC4528x0 interfaceC4528x0 = (InterfaceC4528x0) m22692K;
            if (interfaceC4528x0.isActive()) {
                th2 = th5;
                if (m22717k0(interfaceC4528x0, th5)) {
                    c4881t4 = C4490k1.f26904a;
                    return c4881t4;
                }
            } else {
                Object m22718l0 = m22718l0(m22692K, new C4521v(th5, false, 2, null));
                c4881t5 = C4490k1.f26904a;
                if (m22718l0 == c4881t5) {
                    throw new IllegalStateException(C9367f.m39532k("Cannot happen in ", m22692K).toString());
                }
                c4881t6 = C4490k1.f26906c;
                if (m22718l0 != c4881t6) {
                    return m22718l0;
                }
                th2 = th5;
            }
        }
    }

    @Nullable
    /* renamed from: R */
    public final Object m22698R(@Nullable Object obj) {
        Object m22718l0;
        C4881t c4881t;
        C4881t c4881t2;
        do {
            m22718l0 = m22718l0(m22692K(), obj);
            c4881t = C4490k1.f26904a;
            if (m22718l0 == c4881t) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m22688E(obj));
            }
            c4881t2 = C4490k1.f26906c;
        } while (m22718l0 == c4881t2);
        return m22718l0;
    }

    /* renamed from: S */
    public final AbstractC4484i1 m22699S(InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l, boolean z10) {
        AbstractC4484i1 abstractC4484i1;
        AbstractC4484i1 abstractC4484i12 = null;
        if (z10) {
            AbstractC4484i1 abstractC4484i13 = null;
            if (interfaceC9196l instanceof AbstractC4472e1) {
                abstractC4484i13 = (AbstractC4472e1) interfaceC9196l;
            }
            abstractC4484i1 = abstractC4484i13;
            if (abstractC4484i13 == null) {
                abstractC4484i1 = new C4460a1(interfaceC9196l);
            }
        } else {
            AbstractC4484i1 abstractC4484i14 = interfaceC9196l instanceof AbstractC4484i1 ? (AbstractC4484i1) interfaceC9196l : null;
            if (abstractC4484i14 != null) {
                abstractC4484i12 = abstractC4484i14;
            }
            abstractC4484i1 = abstractC4484i12;
            if (abstractC4484i12 == null) {
                abstractC4484i1 = new C4463b1(interfaceC9196l);
            }
        }
        abstractC4484i1.m22675v(this);
        return abstractC4484i1;
    }

    @NotNull
    /* renamed from: T */
    public String mo22617T() {
        return C4483i0.m22670a(this);
    }

    /* renamed from: U */
    public final C4500o m22700U(C4872k c4872k) {
        C4872k c4872k2;
        while (true) {
            c4872k2 = c4872k;
            if (!c4872k.mo24759o()) {
                break;
            }
            c4872k = c4872k.m24769n();
        }
        while (true) {
            C4872k m24768k = c4872k2.m24768k();
            if (m24768k.mo24759o()) {
                c4872k2 = m24768k;
            } else {
                if (m24768k instanceof C4500o) {
                    return (C4500o) m24768k;
                }
                c4872k2 = m24768k;
                if (m24768k instanceof C4499n1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: V */
    public final void m22701V(C4499n1 c4499n1, Throwable th2) {
        C4530y c4530y;
        C4530y c4530y2;
        m22703X(th2);
        C4872k c4872k = (C4872k) c4499n1.m24767j();
        C4530y c4530y3 = null;
        while (true) {
            c4530y = c4530y3;
            if (C9367f.m39522a(c4872k, c4499n1)) {
                break;
            }
            C4530y c4530y4 = c4530y;
            if (c4872k instanceof AbstractC4472e1) {
                AbstractC4484i1 abstractC4484i1 = (AbstractC4484i1) c4872k;
                try {
                    abstractC4484i1.mo22631t(th2);
                    c4530y4 = c4530y;
                } catch (Throwable th3) {
                    if (c4530y == null) {
                        c4530y2 = null;
                    } else {
                        C5382a.m26732a(c4530y, th3);
                        c4530y2 = c4530y;
                    }
                    c4530y4 = c4530y;
                    if (c4530y2 == null) {
                        c4530y4 = new C4530y("Exception in completion handler " + abstractC4484i1 + " for " + this, th3);
                    }
                }
            }
            c4872k = c4872k.m24768k();
            c4530y3 = c4530y4;
        }
        if (c4530y != null) {
            mo22616M(c4530y);
        }
        m22725s(th2);
    }

    /* renamed from: W */
    public final void m22702W(C4499n1 c4499n1, Throwable th2) {
        C4530y c4530y;
        C4530y c4530y2;
        C4872k c4872k = (C4872k) c4499n1.m24767j();
        C4530y c4530y3 = null;
        while (true) {
            c4530y = c4530y3;
            if (C9367f.m39522a(c4872k, c4499n1)) {
                break;
            }
            C4530y c4530y4 = c4530y;
            if (c4872k instanceof AbstractC4484i1) {
                AbstractC4484i1 abstractC4484i1 = (AbstractC4484i1) c4872k;
                try {
                    abstractC4484i1.mo22631t(th2);
                    c4530y4 = c4530y;
                } catch (Throwable th3) {
                    if (c4530y == null) {
                        c4530y2 = null;
                    } else {
                        C5382a.m26732a(c4530y, th3);
                        c4530y2 = c4530y;
                    }
                    c4530y4 = c4530y;
                    if (c4530y2 == null) {
                        c4530y4 = new C4530y("Exception in completion handler " + abstractC4484i1 + " for " + this, th3);
                    }
                }
            }
            c4872k = c4872k.m24768k();
            c4530y3 = c4530y4;
        }
        if (c4530y == null) {
            return;
        }
        mo22616M(c4530y);
    }

    /* renamed from: X */
    public void m22703X(@Nullable Throwable th2) {
    }

    /* renamed from: Y */
    public void mo22618Y(@Nullable Object obj) {
    }

    /* renamed from: Z */
    public void mo22704Z() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [di.w0] */
    /* renamed from: a0 */
    public final void m22705a0(C4504p0 c4504p0) {
        C4499n1 c4499n1 = new C4499n1();
        if (!c4504p0.isActive()) {
            c4499n1 = new C4525w0(c4499n1);
        }
        C8490b.m36639a(f26889b, this, c4504p0, c4499n1);
    }

    /* renamed from: b0 */
    public final void m22706b0(AbstractC4484i1 abstractC4484i1) {
        abstractC4484i1.m24763e(new C4499n1());
        C8490b.m36639a(f26889b, this, abstractC4484i1, abstractC4484i1.m24768k());
    }

    /* renamed from: c0 */
    public final void m22707c0(@NotNull AbstractC4484i1 abstractC4484i1) {
        Object m22692K;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C4504p0 c4504p0;
        do {
            m22692K = m22692K();
            if (!(m22692K instanceof AbstractC4484i1)) {
                if (!(m22692K instanceof InterfaceC4528x0) || ((InterfaceC4528x0) m22692K).mo22673a() == null) {
                    return;
                }
                abstractC4484i1.m24770p();
                return;
            }
            if (m22692K != abstractC4484i1) {
                return;
            }
            atomicReferenceFieldUpdater = f26889b;
            c4504p0 = C4490k1.f26910g;
        } while (!C8490b.m36639a(atomicReferenceFieldUpdater, this, m22692K, c4504p0));
    }

    /* renamed from: d0 */
    public final void m22708d0(@Nullable InterfaceC4497n interfaceC4497n) {
        this._parentHandle = interfaceC4497n;
    }

    /* renamed from: e0 */
    public final int m22709e0(Object obj) {
        C4504p0 c4504p0;
        if (!(obj instanceof C4504p0)) {
            if (!(obj instanceof C4525w0)) {
                return 0;
            }
            if (!C8490b.m36639a(f26889b, this, obj, ((C4525w0) obj).mo22673a())) {
                return -1;
            }
            mo22704Z();
            return 1;
        }
        if (((C4504p0) obj).isActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f26889b;
        c4504p0 = C4490k1.f26910g;
        if (!C8490b.m36639a(atomicReferenceFieldUpdater, this, obj, c4504p0)) {
            return -1;
        }
        mo22704Z();
        return 1;
    }

    @Override // p067di.InterfaceC4466c1
    @NotNull
    /* renamed from: f */
    public final InterfaceC4501o0 mo22639f(@NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        return mo22641o(false, true, interfaceC9196l);
    }

    /* renamed from: f0 */
    public final String m22710f0(Object obj) {
        String str;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.m22733f()) {
                str = "Cancelling";
            } else {
                str = "Active";
                if (bVar.m22734g()) {
                    str = "Completing";
                }
            }
        } else {
            str = obj instanceof InterfaceC4528x0 ? ((InterfaceC4528x0) obj).isActive() ? "Active" : "New" : obj instanceof C4521v ? "Cancelled" : "Completed";
        }
        return str;
    }

    @Override // p233nh.InterfaceC6792g
    public <R> R fold(R r10, @NotNull InterfaceC9200p<? super R, ? super InterfaceC6792g.b, ? extends R> interfaceC9200p) {
        return (R) InterfaceC4466c1.a.m22645b(this, r10, interfaceC9200p);
    }

    @NotNull
    /* renamed from: g0 */
    public final CancellationException m22711g0(@NotNull Throwable th2, @Nullable String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            String str2 = str;
            if (str == null) {
                str2 = mo22625u();
            }
            cancellationException2 = new C4469d1(str2, th2, this);
        }
        return cancellationException2;
    }

    @Override // p233nh.InterfaceC6792g.b, p233nh.InterfaceC6792g
    @Nullable
    public <E extends InterfaceC6792g.b> E get(@NotNull InterfaceC6792g.c<E> cVar) {
        return (E) InterfaceC4466c1.a.m22646c(this, cVar);
    }

    @Override // p233nh.InterfaceC6792g.b
    @NotNull
    public final InterfaceC6792g.c<?> getKey() {
        return InterfaceC4466c1.f26879b0;
    }

    /* renamed from: h */
    public final boolean m22712h(Object obj, C4499n1 c4499n1, AbstractC4484i1 abstractC4484i1) {
        boolean z10;
        c cVar = new c(abstractC4484i1, this, obj);
        while (true) {
            int m24773s = c4499n1.m24769n().m24773s(abstractC4484i1, c4499n1, cVar);
            z10 = true;
            if (m24773s != 1) {
                if (m24773s == 2) {
                    z10 = false;
                    break;
                }
            } else {
                break;
            }
        }
        return z10;
    }

    @NotNull
    /* renamed from: i0 */
    public final String m22713i0() {
        return mo22617T() + '{' + m22710f0(m22692K()) + '}';
    }

    @Override // p067di.InterfaceC4466c1
    public boolean isActive() {
        Object m22692K = m22692K();
        return (m22692K instanceof InterfaceC4528x0) && ((InterfaceC4528x0) m22692K).isActive();
    }

    /* renamed from: j */
    public final void m22714j(Throwable th2, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th3 : list) {
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                C5382a.m26732a(th2, th3);
            }
        }
    }

    /* renamed from: j0 */
    public final boolean m22715j0(InterfaceC4528x0 interfaceC4528x0, Object obj) {
        if (!C8490b.m36639a(f26889b, this, interfaceC4528x0, C4490k1.m22780g(obj))) {
            return false;
        }
        m22703X(null);
        mo22618Y(obj);
        m22728z(interfaceC4528x0, obj);
        return true;
    }

    /* renamed from: k */
    public void mo22716k(@Nullable Object obj) {
    }

    /* renamed from: k0 */
    public final boolean m22717k0(InterfaceC4528x0 interfaceC4528x0, Throwable th2) {
        C4499n1 m22690I = m22690I(interfaceC4528x0);
        if (m22690I == null) {
            return false;
        }
        if (!C8490b.m36639a(f26889b, this, interfaceC4528x0, new b(m22690I, false, th2))) {
            return false;
        }
        m22701V(m22690I, th2);
        return true;
    }

    @Override // p067di.InterfaceC4466c1
    @NotNull
    /* renamed from: l */
    public final CancellationException mo22640l() {
        CancellationException m22683h0;
        Object m22692K = m22692K();
        if (m22692K instanceof b) {
            Throwable m22732e = ((b) m22692K).m22732e();
            if (m22732e == null) {
                throw new IllegalStateException(C9367f.m39532k("Job is still new or active: ", this).toString());
            }
            m22683h0 = m22711g0(m22732e, C9367f.m39532k(C4483i0.m22670a(this), " is cancelling"));
        } else {
            if (m22692K instanceof InterfaceC4528x0) {
                throw new IllegalStateException(C9367f.m39532k("Job is still new or active: ", this).toString());
            }
            m22683h0 = m22692K instanceof C4521v ? m22683h0(this, ((C4521v) m22692K).f26946a, null, 1, null) : new C4469d1(C9367f.m39532k(C4483i0.m22670a(this), " has completed normally"), null, this);
        }
        return m22683h0;
    }

    /* renamed from: l0 */
    public final Object m22718l0(Object obj, Object obj2) {
        C4881t c4881t;
        C4881t c4881t2;
        if (!(obj instanceof InterfaceC4528x0)) {
            c4881t2 = C4490k1.f26904a;
            return c4881t2;
        }
        if ((!(obj instanceof C4504p0) && !(obj instanceof AbstractC4484i1)) || (obj instanceof C4500o) || (obj2 instanceof C4521v)) {
            return m22720m0((InterfaceC4528x0) obj, obj2);
        }
        if (m22715j0((InterfaceC4528x0) obj, obj2)) {
            return obj2;
        }
        c4881t = C4490k1.f26906c;
        return c4881t;
    }

    /* renamed from: m */
    public final boolean m22719m(@Nullable Object obj) {
        C4881t c4881t;
        C4881t c4881t2;
        C4881t c4881t3;
        C4881t c4881t4;
        c4881t = C4490k1.f26904a;
        Object obj2 = c4881t;
        boolean z10 = true;
        if (mo22657H()) {
            Object m22724r = m22724r(obj);
            obj2 = m22724r;
            if (m22724r == C4490k1.f26905b) {
                return true;
            }
        }
        Object obj3 = obj2;
        Object obj4 = obj2;
        c4881t2 = C4490k1.f26904a;
        if (obj4 == c4881t2) {
            obj3 = m22697Q(obj);
        }
        Object obj5 = obj3;
        c4881t3 = C4490k1.f26904a;
        if (obj5 != c4881t3 && obj3 != C4490k1.f26905b) {
            Object obj6 = obj3;
            c4881t4 = C4490k1.f26907d;
            if (obj6 == c4881t4) {
                z10 = false;
            } else {
                mo22716k(obj3);
            }
        }
        return z10;
    }

    /* renamed from: m0 */
    public final Object m22720m0(InterfaceC4528x0 interfaceC4528x0, Object obj) {
        C4881t c4881t;
        C4881t c4881t2;
        C4881t c4881t3;
        C4499n1 m22690I = m22690I(interfaceC4528x0);
        if (m22690I == null) {
            c4881t3 = C4490k1.f26906c;
            return c4881t3;
        }
        b bVar = interfaceC4528x0 instanceof b ? (b) interfaceC4528x0 : null;
        b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new b(m22690I, false, null);
        }
        synchronized (bVar2) {
            try {
                if (bVar2.m22734g()) {
                    c4881t2 = C4490k1.f26904a;
                    return c4881t2;
                }
                bVar2.m22737j(true);
                if (bVar2 != interfaceC4528x0 && !C8490b.m36639a(f26889b, this, interfaceC4528x0, bVar2)) {
                    c4881t = C4490k1.f26906c;
                    return c4881t;
                }
                boolean m22733f = bVar2.m22733f();
                C4521v c4521v = obj instanceof C4521v ? (C4521v) obj : null;
                if (c4521v != null) {
                    bVar2.m22729b(c4521v.f26946a);
                }
                Throwable m22732e = bVar2.m22732e();
                Throwable th2 = null;
                if (true ^ m22733f) {
                    th2 = m22732e;
                }
                C5398q c5398q = C5398q.f30770a;
                if (bVar2 != null) {
                    m22701V(m22690I, bVar2);
                }
                C4500o m22687D = m22687D(interfaceC4528x0);
                return (m22687D == null || !m22722n0(bVar2, m22687D, obj)) ? m22686C(bVar2, obj) : C4490k1.f26905b;
            } finally {
                b bVar3 = bVar2;
            }
        }
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g minusKey(@NotNull InterfaceC6792g.c<?> cVar) {
        return InterfaceC4466c1.a.m22648e(this, cVar);
    }

    /* renamed from: n */
    public void m22721n(@NotNull Throwable th2) {
        m22719m(th2);
    }

    /* renamed from: n0 */
    public final boolean m22722n0(b bVar, C4500o c4500o, Object obj) {
        while (InterfaceC4466c1.a.m22647d(c4500o.f26919f, false, false, new a(this, bVar, c4500o, obj), 1, null) == C4502o1.f26920b) {
            C4500o m22700U = m22700U(c4500o);
            c4500o = m22700U;
            if (m22700U == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p067di.InterfaceC4466c1
    @NotNull
    /* renamed from: o */
    public final InterfaceC4501o0 mo22641o(boolean z10, boolean z11, @NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        AbstractC4484i1 m22699S = m22699S(interfaceC9196l, z10);
        while (true) {
            Object m22692K = m22692K();
            if (m22692K instanceof C4504p0) {
                C4504p0 c4504p0 = (C4504p0) m22692K;
                if (!c4504p0.isActive()) {
                    m22705a0(c4504p0);
                } else if (C8490b.m36639a(f26889b, this, m22692K, m22699S)) {
                    return m22699S;
                }
            } else {
                if (!(m22692K instanceof InterfaceC4528x0)) {
                    if (z11) {
                        C4521v c4521v = m22692K instanceof C4521v ? (C4521v) m22692K : null;
                        interfaceC9196l.mo6711d(c4521v == null ? null : c4521v.f26946a);
                    }
                    return C4502o1.f26920b;
                }
                C4499n1 mo22673a = ((InterfaceC4528x0) m22692K).mo22673a();
                if (mo22673a != null) {
                    InterfaceC4501o0 interfaceC4501o0 = C4502o1.f26920b;
                    Throwable th2 = null;
                    InterfaceC4501o0 interfaceC4501o02 = interfaceC4501o0;
                    if (z10) {
                        th2 = null;
                        interfaceC4501o02 = interfaceC4501o0;
                        if (m22692K instanceof b) {
                            synchronized (m22692K) {
                                th2 = ((b) m22692K).m22732e();
                                if (th2 != null) {
                                    interfaceC4501o02 = interfaceC4501o0;
                                    if (interfaceC9196l instanceof C4500o) {
                                        interfaceC4501o02 = interfaceC4501o0;
                                        if (((b) m22692K).m22734g()) {
                                        }
                                    }
                                    C5398q c5398q = C5398q.f30770a;
                                }
                                if (m22712h(m22692K, mo22673a, m22699S)) {
                                    if (th2 == null) {
                                        return m22699S;
                                    }
                                    interfaceC4501o02 = m22699S;
                                    C5398q c5398q2 = C5398q.f30770a;
                                }
                            }
                        }
                    }
                    if (th2 != null) {
                        if (z11) {
                            interfaceC9196l.mo6711d(th2);
                        }
                        return interfaceC4501o02;
                    }
                    if (m22712h(m22692K, mo22673a, m22699S)) {
                        return m22699S;
                    }
                } else {
                    if (m22692K == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    m22706b0((AbstractC4484i1) m22692K);
                }
            }
        }
    }

    @Override // p067di.InterfaceC4466c1
    @NotNull
    /* renamed from: o0 */
    public final InterfaceC4497n mo22642o0(@NotNull InterfaceC4503p interfaceC4503p) {
        return (InterfaceC4497n) InterfaceC4466c1.a.m22647d(this, true, false, new C4500o(interfaceC4503p), 2, null);
    }

    @Override // p067di.InterfaceC4503p
    /* renamed from: p */
    public final void mo22723p(@NotNull InterfaceC4508q1 interfaceC4508q1) {
        m22719m(interfaceC4508q1);
    }

    @Override // p233nh.InterfaceC6792g
    @NotNull
    public InterfaceC6792g plus(@NotNull InterfaceC6792g interfaceC6792g) {
        return InterfaceC4466c1.a.m22649f(this, interfaceC6792g);
    }

    /* renamed from: r */
    public final Object m22724r(Object obj) {
        C4881t c4881t;
        Object m22718l0;
        C4881t c4881t2;
        do {
            Object m22692K = m22692K();
            if (!(m22692K instanceof InterfaceC4528x0) || ((m22692K instanceof b) && ((b) m22692K).m22734g())) {
                c4881t = C4490k1.f26904a;
                return c4881t;
            }
            m22718l0 = m22718l0(m22692K, new C4521v(m22685B(obj), false, 2, null));
            c4881t2 = C4490k1.f26906c;
        } while (m22718l0 == c4881t2);
        return m22718l0;
    }

    /* renamed from: s */
    public final boolean m22725s(Throwable th2) {
        if (mo22696P()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        InterfaceC4497n m22691J = m22691J();
        if (m22691J == null || m22691J == C4502o1.f26920b) {
            return z10;
        }
        boolean z11 = true;
        if (!m22691J.mo22790b(th2)) {
            z11 = z10;
        }
        return z11;
    }

    @Override // p067di.InterfaceC4466c1
    public final boolean start() {
        int m22709e0;
        do {
            m22709e0 = m22709e0(m22692K());
            if (m22709e0 == 0) {
                return false;
            }
        } while (m22709e0 != 1);
        return true;
    }

    @NotNull
    public String toString() {
        return m22713i0() + '@' + C4483i0.m22671b(this);
    }

    @NotNull
    /* renamed from: u */
    public String mo22625u() {
        return "Job was cancelled";
    }

    @Override // p067di.InterfaceC4508q1
    @NotNull
    /* renamed from: v */
    public CancellationException mo22726v() {
        Throwable th2;
        Object m22692K = m22692K();
        CancellationException cancellationException = null;
        if (m22692K instanceof b) {
            th2 = ((b) m22692K).m22732e();
        } else if (m22692K instanceof C4521v) {
            th2 = ((C4521v) m22692K).f26946a;
        } else {
            if (m22692K instanceof InterfaceC4528x0) {
                throw new IllegalStateException(C9367f.m39532k("Cannot be cancelling child in this state: ", m22692K).toString());
            }
            th2 = null;
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new C4469d1(C9367f.m39532k("Parent job is ", m22710f0(m22692K)), th2, this);
        }
        return cancellationException2;
    }

    @Override // p067di.InterfaceC4466c1
    /* renamed from: w */
    public void mo22643w(@Nullable CancellationException cancellationException) {
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException == null) {
            cancellationException2 = new C4469d1(mo22625u(), null, this);
        }
        m22721n(cancellationException2);
    }

    /* renamed from: x */
    public boolean m22727x(@NotNull Throwable th2) {
        boolean z10 = true;
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (!m22719m(th2) || !mo22656G()) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: z */
    public final void m22728z(InterfaceC4528x0 interfaceC4528x0, Object obj) {
        InterfaceC4497n m22691J = m22691J();
        if (m22691J != null) {
            m22691J.dispose();
            m22708d0(C4502o1.f26920b);
        }
        C4521v c4521v = obj instanceof C4521v ? (C4521v) obj : null;
        Throwable th2 = c4521v == null ? null : c4521v.f26946a;
        if (!(interfaceC4528x0 instanceof AbstractC4484i1)) {
            C4499n1 mo22673a = interfaceC4528x0.mo22673a();
            if (mo22673a == null) {
                return;
            }
            m22702W(mo22673a, th2);
            return;
        }
        try {
            ((AbstractC4484i1) interfaceC4528x0).mo22631t(th2);
        } catch (Throwable th3) {
            mo22616M(new C4530y("Exception in completion handler " + interfaceC4528x0 + " for " + this, th3));
        }
    }
}
