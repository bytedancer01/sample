package za;

import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/x.class
 */
/* renamed from: za.x */
/* loaded from: combined.jar:classes2.jar:za/x.class */
public final class RunnableC10160x implements Runnable {

    /* renamed from: b */
    public final AbstractC10144i f46594b;

    /* renamed from: c */
    public final C10161y f46595c;

    public RunnableC10160x(C10161y c10161y, AbstractC10144i abstractC10144i) {
        this.f46595c = c10161y;
        this.f46594b = abstractC10144i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC10136e interfaceC10136e;
        InterfaceC10136e interfaceC10136e2;
        obj = this.f46595c.f46597b;
        synchronized (obj) {
            C10161y c10161y = this.f46595c;
            interfaceC10136e = c10161y.f46598c;
            if (interfaceC10136e != null) {
                interfaceC10136e2 = c10161y.f46598c;
                interfaceC10136e2.onFailure((Exception) C9935o.m41850j(this.f46594b.mo42562k()));
            }
        }
    }
}
