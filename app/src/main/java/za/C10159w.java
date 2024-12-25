package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/w.class
 */
/* renamed from: za.w */
/* loaded from: combined.jar:classes2.jar:za/w.class */
public final class C10159w<TResult> implements InterfaceC10135d0<TResult> {

    /* renamed from: a */
    public final Executor f46591a;

    /* renamed from: b */
    public final Object f46592b = new Object();

    /* renamed from: c */
    public InterfaceC10134d<TResult> f46593c;

    public C10159w(Executor executor, InterfaceC10134d<TResult> interfaceC10134d) {
        this.f46591a = executor;
        this.f46593c = interfaceC10134d;
    }

    @Override // za.InterfaceC10135d0
    /* renamed from: a */
    public final void mo42546a(AbstractC10144i<TResult> abstractC10144i) {
        synchronized (this.f46592b) {
            if (this.f46593c == null) {
                return;
            }
            this.f46591a.execute(new RunnableC10158v(this, abstractC10144i));
        }
    }
}
