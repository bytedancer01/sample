package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/q.class
 */
/* renamed from: za.q */
/* loaded from: combined.jar:classes2.jar:za/q.class */
public final class C10153q<TResult, TContinuationResult> implements InterfaceC10135d0<TResult> {

    /* renamed from: a */
    public final Executor f46577a;

    /* renamed from: b */
    public final InterfaceC10128a<TResult, TContinuationResult> f46578b;

    /* renamed from: c */
    public final C10143h0<TContinuationResult> f46579c;

    public C10153q(Executor executor, InterfaceC10128a<TResult, TContinuationResult> interfaceC10128a, C10143h0<TContinuationResult> c10143h0) {
        this.f46577a = executor;
        this.f46578b = interfaceC10128a;
        this.f46579c = c10143h0;
    }

    @Override // za.InterfaceC10135d0
    /* renamed from: a */
    public final void mo42546a(AbstractC10144i<TResult> abstractC10144i) {
        this.f46577a.execute(new RunnableC10152p(this, abstractC10144i));
    }
}
