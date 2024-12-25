package p067di;

import fi.C4866e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.InterfaceC4466c1;
import p172jh.C5384c;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p252oh.C6976c;
import p313s.C8490b;
import p356uh.InterfaceC9196l;
import p372vh.C9367f;
import ph.InterfaceC7717d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/k.class
 */
/* renamed from: di.k */
/* loaded from: combined.jar:classes2.jar:di/k.class */
public class C4488k<T> extends AbstractC4492l0<T> implements InterfaceC4485j<T>, InterfaceC7717d {

    /* renamed from: h */
    public static final AtomicIntegerFieldUpdater f26898h = AtomicIntegerFieldUpdater.newUpdater(C4488k.class, "_decision");

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f26899i = AtomicReferenceFieldUpdater.newUpdater(C4488k.class, Object.class, "_state");

    @NotNull
    private volatile int _decision;

    @NotNull
    private volatile Object _state;

    /* renamed from: e */
    @NotNull
    public final InterfaceC6789d<T> f26900e;

    /* renamed from: f */
    @NotNull
    public final InterfaceC6792g f26901f;

    /* renamed from: g */
    @Nullable
    public InterfaceC4501o0 f26902g;

    /* JADX WARN: Multi-variable type inference failed */
    public C4488k(@NotNull InterfaceC6789d<? super T> interfaceC6789d, int i10) {
        super(i10);
        this.f26900e = interfaceC6789d;
        this.f26901f = interfaceC6789d.mo22619b();
        this._decision = 0;
        this._state = C4467d.f26881b;
    }

    /* renamed from: F */
    public static /* synthetic */ void m22742F(C4488k c4488k, Object obj, int i10, InterfaceC9196l interfaceC9196l, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            interfaceC9196l = null;
        }
        c4488k.m22747E(obj, i10, interfaceC9196l);
    }

    /* renamed from: A */
    public final void m22743A(InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC9196l + ", already has " + obj).toString());
    }

    @NotNull
    /* renamed from: B */
    public String m22744B() {
        return "CancellableContinuation";
    }

    /* renamed from: C */
    public final void m22745C(@NotNull Throwable th2) {
        if (m22762p(th2)) {
            return;
        }
        m22761o(th2);
        m22764r();
    }

    /* renamed from: D */
    public final void m22746D() {
        InterfaceC6789d<T> interfaceC6789d = this.f26900e;
        C4866e c4866e = interfaceC6789d instanceof C4866e ? (C4866e) interfaceC6789d : null;
        Throwable m24748p = c4866e == null ? null : c4866e.m24748p(this);
        if (m24748p == null) {
            return;
        }
        m22763q();
        m22761o(m24748p);
    }

    /* renamed from: E */
    public final void m22747E(Object obj, int i10, InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof InterfaceC4505p1)) {
                if (obj2 instanceof C4491l) {
                    C4491l c4491l = (C4491l) obj2;
                    if (c4491l.m22781c()) {
                        if (interfaceC9196l == null) {
                            return;
                        }
                        m22760n(interfaceC9196l, c4491l.f26946a);
                        return;
                    }
                }
                m22757k(obj);
                throw new C5384c();
            }
        } while (!C8490b.m36639a(f26899i, this, obj2, m22748G((InterfaceC4505p1) obj2, obj, i10, interfaceC9196l, null)));
        m22764r();
        m22765s(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r15 != null) goto L17;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m22748G(p067di.InterfaceC4505p1 r11, java.lang.Object r12, int r13, p356uh.InterfaceC9196l<? super java.lang.Throwable, p172jh.C5398q> r14, java.lang.Object r15) {
        /*
            r10 = this;
            r0 = r12
            boolean r0 = r0 instanceof p067di.C4521v
            if (r0 == 0) goto Ld
            r0 = r12
            r16 = r0
            goto L5a
        Ld:
            r0 = r13
            boolean r0 = p067di.C4495m0.m22784b(r0)
            if (r0 != 0) goto L1f
            r0 = r15
            if (r0 != 0) goto L1f
            r0 = r12
            r16 = r0
            goto L5a
        L1f:
            r0 = r14
            if (r0 != 0) goto L36
            r0 = r11
            boolean r0 = r0 instanceof p067di.AbstractC4479h
            if (r0 == 0) goto L2e
            goto L36
        L2e:
            r0 = r12
            r16 = r0
            r0 = r15
            if (r0 == 0) goto L5a
        L36:
            r0 = r11
            boolean r0 = r0 instanceof p067di.AbstractC4479h
            if (r0 == 0) goto L45
            r0 = r11
            di.h r0 = (p067di.AbstractC4479h) r0
            r11 = r0
            goto L47
        L45:
            r0 = 0
            r11 = r0
        L47:
            di.u r0 = new di.u
            r1 = r0
            r2 = r12
            r3 = r11
            r4 = r14
            r5 = r15
            r6 = 0
            r7 = 16
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r16 = r0
        L5a:
            r0 = r16
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067di.C4488k.m22748G(di.p1, java.lang.Object, int, uh.l, java.lang.Object):java.lang.Object");
    }

    /* renamed from: H */
    public final boolean m22749H() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f26898h.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: I */
    public final boolean m22750I() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f26898h.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // ph.InterfaceC7717d
    @Nullable
    /* renamed from: a */
    public InterfaceC7717d mo22751a() {
        InterfaceC6789d<T> interfaceC6789d = this.f26900e;
        return interfaceC6789d instanceof InterfaceC7717d ? (InterfaceC7717d) interfaceC6789d : null;
    }

    @Override // p233nh.InterfaceC6789d
    @NotNull
    /* renamed from: b */
    public InterfaceC6792g mo22619b() {
        return this.f26901f;
    }

    @Override // p233nh.InterfaceC6789d
    /* renamed from: c */
    public void mo22620c(@NotNull Object obj) {
        m22742F(this, C4532z.m22850b(obj, this), this.f26912d, null, 4, null);
    }

    @Override // p067di.AbstractC4492l0
    /* renamed from: d */
    public void mo22752d(@Nullable Object obj, @NotNull Throwable th2) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC4505p1) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C4521v) {
                return;
            }
            if (obj2 instanceof C4518u) {
                C4518u c4518u = (C4518u) obj2;
                if (!(!c4518u.m22840c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (C8490b.m36639a(f26899i, this, obj2, C4518u.m22838b(c4518u, null, null, null, null, th2, 15, null))) {
                    c4518u.m22841d(this, th2);
                    return;
                }
            } else if (C8490b.m36639a(f26899i, this, obj2, new C4518u(obj2, null, null, null, th2, 14, null))) {
                return;
            }
        }
    }

    @Override // p067di.InterfaceC4485j
    /* renamed from: e */
    public void mo22676e(@NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        AbstractC4479h m22772z = m22772z(interfaceC9196l);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C4467d) {
                if (C8490b.m36639a(f26899i, this, obj, m22772z)) {
                    return;
                }
            } else if (obj instanceof AbstractC4479h) {
                m22743A(interfaceC9196l, obj);
            } else {
                boolean z10 = obj instanceof C4521v;
                if (z10) {
                    C4521v c4521v = (C4521v) obj;
                    if (!c4521v.m22845b()) {
                        m22743A(interfaceC9196l, obj);
                    }
                    if (obj instanceof C4491l) {
                        if (!z10) {
                            c4521v = null;
                        }
                        m22759m(interfaceC9196l, c4521v == null ? null : c4521v.f26946a);
                        return;
                    }
                    return;
                }
                if (obj instanceof C4518u) {
                    C4518u c4518u = (C4518u) obj;
                    if (c4518u.f26938b != null) {
                        m22743A(interfaceC9196l, obj);
                    }
                    if (c4518u.m22840c()) {
                        m22759m(interfaceC9196l, c4518u.f26941e);
                        return;
                    } else {
                        if (C8490b.m36639a(f26899i, this, obj, C4518u.m22838b(c4518u, null, m22772z, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (C8490b.m36639a(f26899i, this, obj, new C4518u(obj, m22772z, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // p067di.AbstractC4492l0
    @NotNull
    /* renamed from: f */
    public final InterfaceC6789d<T> mo22753f() {
        return this.f26900e;
    }

    @Override // p067di.AbstractC4492l0
    @Nullable
    /* renamed from: g */
    public Throwable mo22754g(@Nullable Object obj) {
        Throwable mo22754g = super.mo22754g(obj);
        if (mo22754g == null) {
            mo22754g = null;
        } else {
            mo22753f();
        }
        return mo22754g;
    }

    @Override // p067di.AbstractC4492l0
    /* renamed from: h */
    public <T> T mo22755h(@Nullable Object obj) {
        Object obj2 = obj;
        if (obj instanceof C4518u) {
            obj2 = ((C4518u) obj).f26937a;
        }
        return (T) obj2;
    }

    @Override // p067di.AbstractC4492l0
    @Nullable
    /* renamed from: j */
    public Object mo22756j() {
        return m22768v();
    }

    /* renamed from: k */
    public final Void m22757k(Object obj) {
        throw new IllegalStateException(C9367f.m39532k("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: l */
    public final void m22758l(@NotNull AbstractC4479h abstractC4479h, @Nullable Throwable th2) {
        try {
            abstractC4479h.mo22669a(th2);
        } catch (Throwable th3) {
            C4468d0.m22650a(mo22619b(), new C4530y(C9367f.m39532k("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    /* renamed from: m */
    public final void m22759m(InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l, Throwable th2) {
        try {
            interfaceC9196l.mo6711d(th2);
        } catch (Throwable th3) {
            C4468d0.m22650a(mo22619b(), new C4530y(C9367f.m39532k("Exception in invokeOnCancellation handler for ", this), th3));
        }
    }

    /* renamed from: n */
    public final void m22760n(@NotNull InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l, @NotNull Throwable th2) {
        try {
            interfaceC9196l.mo6711d(th2);
        } catch (Throwable th3) {
            C4468d0.m22650a(mo22619b(), new C4530y(C9367f.m39532k("Exception in resume onCancellation handler for ", this), th3));
        }
    }

    /* renamed from: o */
    public boolean m22761o(@Nullable Throwable th2) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC4505p1)) {
                return false;
            }
            z10 = obj instanceof AbstractC4479h;
        } while (!C8490b.m36639a(f26899i, this, obj, new C4491l(this, th2, z10)));
        AbstractC4479h abstractC4479h = z10 ? (AbstractC4479h) obj : null;
        if (abstractC4479h != null) {
            m22758l(abstractC4479h, th2);
        }
        m22764r();
        m22765s(this.f26912d);
        return true;
    }

    /* renamed from: p */
    public final boolean m22762p(Throwable th2) {
        if (C4495m0.m22785c(this.f26912d) && m22771y()) {
            return ((C4866e) this.f26900e).m24746n(th2);
        }
        return false;
    }

    /* renamed from: q */
    public final void m22763q() {
        InterfaceC4501o0 interfaceC4501o0 = this.f26902g;
        if (interfaceC4501o0 == null) {
            return;
        }
        interfaceC4501o0.dispose();
        this.f26902g = C4502o1.f26920b;
    }

    /* renamed from: r */
    public final void m22764r() {
        if (m22771y()) {
            return;
        }
        m22763q();
    }

    /* renamed from: s */
    public final void m22765s(int i10) {
        if (m22749H()) {
            return;
        }
        C4495m0.m22783a(this, i10);
    }

    @NotNull
    /* renamed from: t */
    public Throwable m22766t(@NotNull InterfaceC4466c1 interfaceC4466c1) {
        return interfaceC4466c1.mo22640l();
    }

    @NotNull
    public String toString() {
        return m22744B() + '(' + C4483i0.m22672c(this.f26900e) + "){" + m22769w() + "}@" + C4483i0.m22671b(this);
    }

    @Nullable
    /* renamed from: u */
    public final Object m22767u() {
        InterfaceC4466c1 interfaceC4466c1;
        boolean m22771y = m22771y();
        if (m22750I()) {
            if (this.f26902g == null) {
                m22770x();
            }
            if (m22771y) {
                m22746D();
            }
            return C6976c.m32004d();
        }
        if (m22771y) {
            m22746D();
        }
        Object m22768v = m22768v();
        if (m22768v instanceof C4521v) {
            throw ((C4521v) m22768v).f26946a;
        }
        if (!C4495m0.m22784b(this.f26912d) || (interfaceC4466c1 = (InterfaceC4466c1) mo22619b().get(InterfaceC4466c1.f26879b0)) == null || interfaceC4466c1.isActive()) {
            return mo22755h(m22768v);
        }
        CancellationException mo22640l = interfaceC4466c1.mo22640l();
        mo22752d(m22768v, mo22640l);
        throw mo22640l;
    }

    @Nullable
    /* renamed from: v */
    public final Object m22768v() {
        return this._state;
    }

    /* renamed from: w */
    public final String m22769w() {
        Object m22768v = m22768v();
        return m22768v instanceof InterfaceC4505p1 ? "Active" : m22768v instanceof C4491l ? "Cancelled" : "Completed";
    }

    /* renamed from: x */
    public final InterfaceC4501o0 m22770x() {
        InterfaceC4466c1 interfaceC4466c1 = (InterfaceC4466c1) mo22619b().get(InterfaceC4466c1.f26879b0);
        if (interfaceC4466c1 == null) {
            return null;
        }
        InterfaceC4501o0 m22647d = InterfaceC4466c1.a.m22647d(interfaceC4466c1, true, false, new C4494m(this), 2, null);
        this.f26902g = m22647d;
        return m22647d;
    }

    /* renamed from: y */
    public final boolean m22771y() {
        InterfaceC6789d<T> interfaceC6789d = this.f26900e;
        return (interfaceC6789d instanceof C4866e) && ((C4866e) interfaceC6789d).m24745m(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [di.h] */
    /* renamed from: z */
    public final AbstractC4479h m22772z(InterfaceC9196l<? super Throwable, C5398q> interfaceC9196l) {
        return interfaceC9196l instanceof AbstractC4479h ? (AbstractC4479h) interfaceC9196l : new C4533z0(interfaceC9196l);
    }
}
