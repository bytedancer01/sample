package za;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/t.class
 */
/* renamed from: za.t */
/* loaded from: combined.jar:classes2.jar:za/t.class */
public final class RunnableC10156t implements Runnable {

    /* renamed from: b */
    public final C10157u f46585b;

    public RunnableC10156t(C10157u c10157u) {
        this.f46585b = c10157u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC10132c interfaceC10132c;
        InterfaceC10132c interfaceC10132c2;
        obj = this.f46585b.f46587b;
        synchronized (obj) {
            C10157u c10157u = this.f46585b;
            interfaceC10132c = c10157u.f46588c;
            if (interfaceC10132c != null) {
                interfaceC10132c2 = c10157u.f46588c;
                interfaceC10132c2.mo42548b();
            }
        }
    }
}
