package za;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/v.class
 */
/* renamed from: za.v */
/* loaded from: combined.jar:classes2.jar:za/v.class */
public final class RunnableC10158v implements Runnable {

    /* renamed from: b */
    public final AbstractC10144i f46589b;

    /* renamed from: c */
    public final C10159w f46590c;

    public RunnableC10158v(C10159w c10159w, AbstractC10144i abstractC10144i) {
        this.f46590c = c10159w;
        this.f46589b = abstractC10144i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC10134d interfaceC10134d;
        InterfaceC10134d interfaceC10134d2;
        obj = this.f46590c.f46592b;
        synchronized (obj) {
            C10159w c10159w = this.f46590c;
            interfaceC10134d = c10159w.f46593c;
            if (interfaceC10134d != null) {
                interfaceC10134d2 = c10159w.f46593c;
                interfaceC10134d2.mo26091a(this.f46589b);
            }
        }
    }
}
