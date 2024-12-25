package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/s.class
 */
/* renamed from: za.s */
/* loaded from: combined.jar:classes2.jar:za/s.class */
public final class C10155s<TResult, TContinuationResult> implements InterfaceC10138f<TContinuationResult>, InterfaceC10136e, InterfaceC10132c, InterfaceC10135d0 {

    /* renamed from: a */
    public final Executor f46582a;

    /* renamed from: b */
    public final InterfaceC10128a<TResult, AbstractC10144i<TContinuationResult>> f46583b;

    /* renamed from: c */
    public final C10143h0<TContinuationResult> f46584c;

    public C10155s(Executor executor, InterfaceC10128a<TResult, AbstractC10144i<TContinuationResult>> interfaceC10128a, C10143h0<TContinuationResult> c10143h0) {
        this.f46582a = executor;
        this.f46583b = interfaceC10128a;
        this.f46584c = c10143h0;
    }

    @Override // za.InterfaceC10135d0
    /* renamed from: a */
    public final void mo42546a(AbstractC10144i<TResult> abstractC10144i) {
        this.f46582a.execute(new RunnableC10154r(this, abstractC10144i));
    }

    @Override // za.InterfaceC10132c
    /* renamed from: b */
    public final void mo42548b() {
        this.f46584c.m42571t();
    }

    @Override // za.InterfaceC10136e
    public final void onFailure(Exception exc) {
        this.f46584c.m42569r(exc);
    }

    @Override // za.InterfaceC10138f
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f46584c.m42570s(tcontinuationresult);
    }
}
