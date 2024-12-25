package za;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/z.class
 */
/* renamed from: za.z */
/* loaded from: combined.jar:classes2.jar:za/z.class */
public final class RunnableC10162z implements Runnable {

    /* renamed from: b */
    public final AbstractC10144i f46599b;

    /* renamed from: c */
    public final C10129a0 f46600c;

    public RunnableC10162z(C10129a0 c10129a0, AbstractC10144i abstractC10144i) {
        this.f46600c = c10129a0;
        this.f46599b = abstractC10144i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC10138f interfaceC10138f;
        InterfaceC10138f interfaceC10138f2;
        obj = this.f46600c.f46552b;
        synchronized (obj) {
            C10129a0 c10129a0 = this.f46600c;
            interfaceC10138f = c10129a0.f46553c;
            if (interfaceC10138f != null) {
                interfaceC10138f2 = c10129a0.f46553c;
                interfaceC10138f2.onSuccess(this.f46599b.mo42563l());
            }
        }
    }
}
