package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/o8.class
 */
/* renamed from: ua.o8 */
/* loaded from: combined.jar:classes2.jar:ua/o8.class */
public final class RunnableC9017o8 implements Runnable {

    /* renamed from: b */
    public final InterfaceC9024p3 f41514b;

    /* renamed from: c */
    public final ServiceConnectionC9077t8 f41515c;

    public RunnableC9017o8(ServiceConnectionC9077t8 serviceConnectionC9077t8, InterfaceC9024p3 interfaceC9024p3) {
        this.f41515c = serviceConnectionC9077t8;
        this.f41514b = interfaceC9024p3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41515c) {
            ServiceConnectionC9077t8.m38238d(this.f41515c, false);
            if (!this.f41515c.f41648d.m38291H()) {
                this.f41515c.f41648d.f41723a.mo37780c().m38416w().m38326a("Connected to service");
                this.f41515c.f41648d.m38311s(this.f41514b);
            }
        }
    }
}
