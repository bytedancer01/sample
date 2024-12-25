package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/u.class
 */
/* renamed from: za.u */
/* loaded from: combined.jar:classes2.jar:za/u.class */
public final class C10157u<TResult> implements InterfaceC10135d0<TResult> {

    /* renamed from: a */
    public final Executor f46586a;

    /* renamed from: b */
    public final Object f46587b = new Object();

    /* renamed from: c */
    public InterfaceC10132c f46588c;

    public C10157u(Executor executor, InterfaceC10132c interfaceC10132c) {
        this.f46586a = executor;
        this.f46588c = interfaceC10132c;
    }

    @Override // za.InterfaceC10135d0
    /* renamed from: a */
    public final void mo42546a(AbstractC10144i<TResult> abstractC10144i) {
        if (abstractC10144i.mo42565n()) {
            synchronized (this.f46587b) {
                if (this.f46588c == null) {
                    return;
                }
                this.f46586a.execute(new RunnableC10156t(this));
            }
        }
    }
}
