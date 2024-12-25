package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/a0.class
 */
/* renamed from: za.a0 */
/* loaded from: combined.jar:classes2.jar:za/a0.class */
public final class C10129a0<TResult> implements InterfaceC10135d0<TResult> {

    /* renamed from: a */
    public final Executor f46551a;

    /* renamed from: b */
    public final Object f46552b = new Object();

    /* renamed from: c */
    public InterfaceC10138f<? super TResult> f46553c;

    public C10129a0(Executor executor, InterfaceC10138f<? super TResult> interfaceC10138f) {
        this.f46551a = executor;
        this.f46553c = interfaceC10138f;
    }

    @Override // za.InterfaceC10135d0
    /* renamed from: a */
    public final void mo42546a(AbstractC10144i<TResult> abstractC10144i) {
        if (abstractC10144i.mo42567p()) {
            synchronized (this.f46552b) {
                if (this.f46553c == null) {
                    return;
                }
                this.f46551a.execute(new RunnableC10162z(this, abstractC10144i));
            }
        }
    }
}
