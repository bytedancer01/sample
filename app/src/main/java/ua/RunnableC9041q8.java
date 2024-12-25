package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/q8.class
 */
/* renamed from: ua.q8 */
/* loaded from: combined.jar:classes2.jar:ua/q8.class */
public final class RunnableC9041q8 implements Runnable {

    /* renamed from: b */
    public final InterfaceC9024p3 f41578b;

    /* renamed from: c */
    public final ServiceConnectionC9077t8 f41579c;

    public RunnableC9041q8(ServiceConnectionC9077t8 serviceConnectionC9077t8, InterfaceC9024p3 interfaceC9024p3) {
        this.f41579c = serviceConnectionC9077t8;
        this.f41578b = interfaceC9024p3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41579c) {
            ServiceConnectionC9077t8.m38238d(this.f41579c, false);
            if (!this.f41579c.f41648d.m38291H()) {
                this.f41579c.f41648d.f41723a.mo37780c().m38415v().m38326a("Connected to remote service");
                this.f41579c.f41648d.m38311s(this.f41578b);
            }
        }
    }
}
