package za;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/h0.class
 */
/* renamed from: za.h0 */
/* loaded from: combined.jar:classes2.jar:za/h0.class */
public final class C10143h0<TResult> extends AbstractC10144i<TResult> {

    /* renamed from: a */
    public final Object f46563a = new Object();

    /* renamed from: b */
    public final C10137e0<TResult> f46564b = new C10137e0<>();

    /* renamed from: c */
    public boolean f46565c;

    /* renamed from: d */
    public volatile boolean f46566d;

    /* renamed from: e */
    public TResult f46567e;

    /* renamed from: f */
    public Exception f46568f;

    @Override // za.AbstractC10144i
    /* renamed from: a */
    public final AbstractC10144i<TResult> mo42552a(Executor executor, InterfaceC10132c interfaceC10132c) {
        this.f46564b.m42550a(new C10157u(executor, interfaceC10132c));
        m42577z();
        return this;
    }

    @Override // za.AbstractC10144i
    /* renamed from: b */
    public final AbstractC10144i<TResult> mo42553b(Executor executor, InterfaceC10134d<TResult> interfaceC10134d) {
        this.f46564b.m42550a(new C10159w(executor, interfaceC10134d));
        m42577z();
        return this;
    }

    @Override // za.AbstractC10144i
    /* renamed from: c */
    public final AbstractC10144i<TResult> mo42554c(InterfaceC10134d<TResult> interfaceC10134d) {
        this.f46564b.m42550a(new C10159w(C10147k.f46572a, interfaceC10134d));
        m42577z();
        return this;
    }

    @Override // za.AbstractC10144i
    /* renamed from: d */
    public final AbstractC10144i<TResult> mo42555d(Executor executor, InterfaceC10136e interfaceC10136e) {
        this.f46564b.m42550a(new C10161y(executor, interfaceC10136e));
        m42577z();
        return this;
    }

    @Override // za.AbstractC10144i
    /* renamed from: e */
    public final AbstractC10144i<TResult> mo42556e(InterfaceC10136e interfaceC10136e) {
        mo42555d(C10147k.f46572a, interfaceC10136e);
        return this;
    }

    @Override // za.AbstractC10144i
    /* renamed from: f */
    public final AbstractC10144i<TResult> mo42557f(Executor executor, InterfaceC10138f<? super TResult> interfaceC10138f) {
        this.f46564b.m42550a(new C10129a0(executor, interfaceC10138f));
        m42577z();
        return this;
    }

    @Override // za.AbstractC10144i
    /* renamed from: g */
    public final AbstractC10144i<TResult> mo42558g(InterfaceC10138f<? super TResult> interfaceC10138f) {
        mo42557f(C10147k.f46572a, interfaceC10138f);
        return this;
    }

    @Override // za.AbstractC10144i
    /* renamed from: h */
    public final <TContinuationResult> AbstractC10144i<TContinuationResult> mo42559h(Executor executor, InterfaceC10128a<TResult, TContinuationResult> interfaceC10128a) {
        C10143h0 c10143h0 = new C10143h0();
        this.f46564b.m42550a(new C10153q(executor, interfaceC10128a, c10143h0));
        m42577z();
        return c10143h0;
    }

    @Override // za.AbstractC10144i
    /* renamed from: i */
    public final <TContinuationResult> AbstractC10144i<TContinuationResult> mo42560i(InterfaceC10128a<TResult, TContinuationResult> interfaceC10128a) {
        return mo42559h(C10147k.f46572a, interfaceC10128a);
    }

    @Override // za.AbstractC10144i
    /* renamed from: j */
    public final <TContinuationResult> AbstractC10144i<TContinuationResult> mo42561j(Executor executor, InterfaceC10128a<TResult, AbstractC10144i<TContinuationResult>> interfaceC10128a) {
        C10143h0 c10143h0 = new C10143h0();
        this.f46564b.m42550a(new C10155s(executor, interfaceC10128a, c10143h0));
        m42577z();
        return c10143h0;
    }

    @Override // za.AbstractC10144i
    /* renamed from: k */
    public final Exception mo42562k() {
        Exception exc;
        synchronized (this.f46563a) {
            exc = this.f46568f;
        }
        return exc;
    }

    @Override // za.AbstractC10144i
    /* renamed from: l */
    public final TResult mo42563l() {
        TResult tresult;
        synchronized (this.f46563a) {
            m42574w();
            m42575x();
            Exception exc = this.f46568f;
            if (exc != null) {
                throw new C10140g(exc);
            }
            tresult = this.f46567e;
        }
        return tresult;
    }

    @Override // za.AbstractC10144i
    /* renamed from: m */
    public final <X extends Throwable> TResult mo42564m(Class<X> cls) {
        TResult tresult;
        synchronized (this.f46563a) {
            m42574w();
            m42575x();
            if (cls.isInstance(this.f46568f)) {
                throw cls.cast(this.f46568f);
            }
            Exception exc = this.f46568f;
            if (exc != null) {
                throw new C10140g(exc);
            }
            tresult = this.f46567e;
        }
        return tresult;
    }

    @Override // za.AbstractC10144i
    /* renamed from: n */
    public final boolean mo42565n() {
        return this.f46566d;
    }

    @Override // za.AbstractC10144i
    /* renamed from: o */
    public final boolean mo42566o() {
        boolean z10;
        synchronized (this.f46563a) {
            z10 = this.f46565c;
        }
        return z10;
    }

    @Override // za.AbstractC10144i
    /* renamed from: p */
    public final boolean mo42567p() {
        boolean z10;
        synchronized (this.f46563a) {
            z10 = false;
            if (this.f46565c) {
                z10 = false;
                if (!this.f46566d) {
                    z10 = false;
                    if (this.f46568f == null) {
                        z10 = true;
                    }
                }
            }
        }
        return z10;
    }

    @Override // za.AbstractC10144i
    /* renamed from: q */
    public final <TContinuationResult> AbstractC10144i<TContinuationResult> mo42568q(Executor executor, InterfaceC10142h<TResult, TContinuationResult> interfaceC10142h) {
        C10143h0 c10143h0 = new C10143h0();
        this.f46564b.m42550a(new C10133c0(executor, interfaceC10142h, c10143h0));
        m42577z();
        return c10143h0;
    }

    /* renamed from: r */
    public final void m42569r(Exception exc) {
        C9935o.m41851k(exc, "Exception must not be null");
        synchronized (this.f46563a) {
            m42576y();
            this.f46565c = true;
            this.f46568f = exc;
        }
        this.f46564b.m42551b(this);
    }

    /* renamed from: s */
    public final void m42570s(TResult tresult) {
        synchronized (this.f46563a) {
            m42576y();
            this.f46565c = true;
            this.f46567e = tresult;
        }
        this.f46564b.m42551b(this);
    }

    /* renamed from: t */
    public final boolean m42571t() {
        synchronized (this.f46563a) {
            if (this.f46565c) {
                return false;
            }
            this.f46565c = true;
            this.f46566d = true;
            this.f46564b.m42551b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean m42572u(Exception exc) {
        C9935o.m41851k(exc, "Exception must not be null");
        synchronized (this.f46563a) {
            if (this.f46565c) {
                return false;
            }
            this.f46565c = true;
            this.f46568f = exc;
            this.f46564b.m42551b(this);
            return true;
        }
    }

    /* renamed from: v */
    public final boolean m42573v(TResult tresult) {
        synchronized (this.f46563a) {
            if (this.f46565c) {
                return false;
            }
            this.f46565c = true;
            this.f46567e = tresult;
            this.f46564b.m42551b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final void m42574w() {
        C9935o.m41854n(this.f46565c, "Task is not yet complete");
    }

    /* renamed from: x */
    public final void m42575x() {
        if (this.f46566d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: y */
    public final void m42576y() {
        if (this.f46565c) {
            throw C10130b.m42547a(this);
        }
    }

    /* renamed from: z */
    public final void m42577z() {
        synchronized (this.f46563a) {
            if (this.f46565c) {
                this.f46564b.m42551b(this);
            }
        }
    }
}
