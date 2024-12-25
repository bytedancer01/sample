package za;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/e0.class
 */
/* renamed from: za.e0 */
/* loaded from: combined.jar:classes2.jar:za/e0.class */
public final class C10137e0<TResult> {

    /* renamed from: a */
    public final Object f46559a = new Object();

    /* renamed from: b */
    public Queue<InterfaceC10135d0<TResult>> f46560b;

    /* renamed from: c */
    public boolean f46561c;

    /* renamed from: a */
    public final void m42550a(InterfaceC10135d0<TResult> interfaceC10135d0) {
        synchronized (this.f46559a) {
            if (this.f46560b == null) {
                this.f46560b = new ArrayDeque();
            }
            this.f46560b.add(interfaceC10135d0);
        }
    }

    /* renamed from: b */
    public final void m42551b(AbstractC10144i<TResult> abstractC10144i) {
        InterfaceC10135d0<TResult> poll;
        synchronized (this.f46559a) {
            if (this.f46560b != null && !this.f46561c) {
                this.f46561c = true;
                while (true) {
                    synchronized (this.f46559a) {
                        poll = this.f46560b.poll();
                        if (poll == null) {
                            this.f46561c = false;
                            return;
                        }
                    }
                    poll.mo42546a(abstractC10144i);
                }
            }
        }
    }
}
