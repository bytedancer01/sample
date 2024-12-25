package fi;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067di.AbstractC4462b0;
import p067di.AbstractC4492l0;
import p067di.AbstractC4507q0;
import p067di.C4483i0;
import p067di.C4488k;
import p067di.C4517t1;
import p067di.C4524w;
import p067di.C4532z;
import p067di.InterfaceC4485j;
import p172jh.C5398q;
import p233nh.InterfaceC6789d;
import p233nh.InterfaceC6792g;
import p313s.C8490b;
import p372vh.C9367f;
import ph.InterfaceC7717d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fi/e.class
 */
/* renamed from: fi.e */
/* loaded from: combined.jar:classes2.jar:fi/e.class */
public final class C4866e<T> extends AbstractC4492l0<T> implements InterfaceC7717d, InterfaceC6789d<T> {

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f28551i = AtomicReferenceFieldUpdater.newUpdater(C4866e.class, Object.class, "_reusableCancellableContinuation");

    @NotNull
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e */
    @NotNull
    public final AbstractC4462b0 f28552e;

    /* renamed from: f */
    @NotNull
    public final InterfaceC6789d<T> f28553f;

    /* renamed from: g */
    @Nullable
    public Object f28554g;

    /* renamed from: h */
    @NotNull
    public final Object f28555h;

    /* JADX WARN: Multi-variable type inference failed */
    public C4866e(@NotNull AbstractC4462b0 abstractC4462b0, @NotNull InterfaceC6789d<? super T> interfaceC6789d) {
        super(-1);
        C4881t c4881t;
        this.f28552e = abstractC4462b0;
        this.f28553f = interfaceC6789d;
        c4881t = C4867f.f28556a;
        this.f28554g = c4881t;
        this.f28555h = C4885x.m24817b(mo22619b());
        this._reusableCancellableContinuation = null;
    }

    @Override // ph.InterfaceC7717d
    @Nullable
    /* renamed from: a */
    public InterfaceC7717d mo22751a() {
        InterfaceC6789d<T> interfaceC6789d = this.f28553f;
        return interfaceC6789d instanceof InterfaceC7717d ? (InterfaceC7717d) interfaceC6789d : null;
    }

    @Override // p233nh.InterfaceC6789d
    @NotNull
    /* renamed from: b */
    public InterfaceC6792g mo22619b() {
        return this.f28553f.mo22619b();
    }

    @Override // p233nh.InterfaceC6789d
    /* renamed from: c */
    public void mo22620c(@NotNull Object obj) {
        InterfaceC6792g mo22619b;
        Object m24818c;
        InterfaceC6792g mo22619b2 = this.f28553f.mo22619b();
        Object m22852d = C4532z.m22852d(obj, null, 1, null);
        if (this.f28552e.mo22633B0(mo22619b2)) {
            this.f28554g = m22852d;
            this.f26912d = 0;
            this.f28552e.mo22632A0(mo22619b2, this);
            return;
        }
        AbstractC4507q0 m22835a = C4517t1.f26935a.m22835a();
        if (m22835a.m22799I0()) {
            this.f28554g = m22852d;
            this.f26912d = 0;
            m22835a.m22796E0(this);
            return;
        }
        m22835a.m22798G0(true);
        try {
            mo22619b = mo22619b();
            m24818c = C4885x.m24818c(mo22619b, this.f28555h);
        } finally {
            try {
            } finally {
            }
        }
        try {
            this.f28553f.mo22620c(obj);
            C5398q c5398q = C5398q.f30770a;
            do {
            } while (m22835a.m22801K0());
        } finally {
            C4885x.m24816a(mo22619b, m24818c);
        }
    }

    @Override // p067di.AbstractC4492l0
    /* renamed from: d */
    public void mo22752d(@Nullable Object obj, @NotNull Throwable th2) {
        if (obj instanceof C4524w) {
            ((C4524w) obj).f26952b.mo6711d(th2);
        }
    }

    @Override // p067di.AbstractC4492l0
    @NotNull
    /* renamed from: f */
    public InterfaceC6789d<T> mo22753f() {
        return this;
    }

    @Override // p067di.AbstractC4492l0
    @Nullable
    /* renamed from: j */
    public Object mo22756j() {
        C4881t c4881t;
        Object obj = this.f28554g;
        c4881t = C4867f.f28556a;
        this.f28554g = c4881t;
        return obj;
    }

    /* renamed from: k */
    public final void m24743k() {
        while (this._reusableCancellableContinuation == C4867f.f28557b) {
        }
    }

    @Nullable
    /* renamed from: l */
    public final C4488k<?> m24744l() {
        Object obj = this._reusableCancellableContinuation;
        return obj instanceof C4488k ? (C4488k) obj : null;
    }

    /* renamed from: m */
    public final boolean m24745m(@NotNull C4488k<?> c4488k) {
        Object obj = this._reusableCancellableContinuation;
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof C4488k)) {
            return true;
        }
        if (obj == c4488k) {
            z10 = true;
        }
        return z10;
    }

    /* renamed from: n */
    public final boolean m24746n(@NotNull Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C4881t c4881t = C4867f.f28557b;
            if (C9367f.m39522a(obj, c4881t)) {
                if (C8490b.m36639a(f28551i, this, c4881t, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (C8490b.m36639a(f28551i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: o */
    public final void m24747o() {
        m24743k();
        C4488k<?> m24744l = m24744l();
        if (m24744l == null) {
            return;
        }
        m24744l.m22763q();
    }

    @Nullable
    /* renamed from: p */
    public final Throwable m24748p(@NotNull InterfaceC4485j<?> interfaceC4485j) {
        C4881t c4881t;
        do {
            Object obj = this._reusableCancellableContinuation;
            c4881t = C4867f.f28557b;
            if (obj != c4881t) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C9367f.m39532k("Inconsistent state ", obj).toString());
                }
                if (C8490b.m36639a(f28551i, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!C8490b.m36639a(f28551i, this, c4881t, interfaceC4485j));
        return null;
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.f28552e + ", " + C4483i0.m22672c(this.f28553f) + ']';
    }
}
