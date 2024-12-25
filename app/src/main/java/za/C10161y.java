package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/y.class
 */
/* renamed from: za.y */
/* loaded from: combined.jar:classes2.jar:za/y.class */
public final class C10161y<TResult> implements InterfaceC10135d0<TResult> {

    /* renamed from: a */
    public final Executor f46596a;

    /* renamed from: b */
    public final Object f46597b = new Object();

    /* renamed from: c */
    public InterfaceC10136e f46598c;

    public C10161y(Executor executor, InterfaceC10136e interfaceC10136e) {
        this.f46596a = executor;
        this.f46598c = interfaceC10136e;
    }

    @Override // za.InterfaceC10135d0
    /* renamed from: a */
    public final void mo42546a(AbstractC10144i<TResult> abstractC10144i) {
        if (abstractC10144i.mo42567p() || abstractC10144i.mo42565n()) {
            return;
        }
        synchronized (this.f46597b) {
            if (this.f46598c == null) {
                return;
            }
            this.f46596a.execute(new RunnableC10160x(this, abstractC10144i));
        }
    }
}
