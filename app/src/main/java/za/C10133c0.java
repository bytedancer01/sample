package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/c0.class
 */
/* renamed from: za.c0 */
/* loaded from: combined.jar:classes2.jar:za/c0.class */
public final class C10133c0<TResult, TContinuationResult> implements InterfaceC10138f<TContinuationResult>, InterfaceC10136e, InterfaceC10132c, InterfaceC10135d0 {

    /* renamed from: a */
    public final Executor f46556a;

    /* renamed from: b */
    public final InterfaceC10142h<TResult, TContinuationResult> f46557b;

    /* renamed from: c */
    public final C10143h0<TContinuationResult> f46558c;

    public C10133c0(Executor executor, InterfaceC10142h<TResult, TContinuationResult> interfaceC10142h, C10143h0<TContinuationResult> c10143h0) {
        this.f46556a = executor;
        this.f46557b = interfaceC10142h;
        this.f46558c = c10143h0;
    }

    @Override // za.InterfaceC10135d0
    /* renamed from: a */
    public final void mo42546a(AbstractC10144i<TResult> abstractC10144i) {
        this.f46556a.execute(new RunnableC10131b0(this, abstractC10144i));
    }

    @Override // za.InterfaceC10132c
    /* renamed from: b */
    public final void mo42548b() {
        this.f46558c.m42571t();
    }

    @Override // za.InterfaceC10136e
    public final void onFailure(Exception exc) {
        this.f46558c.m42569r(exc);
    }

    @Override // za.InterfaceC10138f
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f46558c.m42570s(tcontinuationresult);
    }
}
