package za;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/p.class
 */
/* renamed from: za.p */
/* loaded from: combined.jar:classes2.jar:za/p.class */
public final class RunnableC10152p implements Runnable {

    /* renamed from: b */
    public final AbstractC10144i f46575b;

    /* renamed from: c */
    public final C10153q f46576c;

    public RunnableC10152p(C10153q c10153q, AbstractC10144i abstractC10144i) {
        this.f46576c = c10153q;
        this.f46575b = abstractC10144i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10143h0 c10143h0;
        C10143h0 c10143h02;
        C10143h0 c10143h03;
        InterfaceC10128a interfaceC10128a;
        C10143h0 c10143h04;
        C10143h0 c10143h05;
        if (this.f46575b.mo42565n()) {
            c10143h05 = this.f46576c.f46579c;
            c10143h05.m42571t();
            return;
        }
        try {
            interfaceC10128a = this.f46576c.f46578b;
            Object mo26105a = interfaceC10128a.mo26105a(this.f46575b);
            c10143h04 = this.f46576c.f46579c;
            c10143h04.m42570s(mo26105a);
        } catch (C10140g e10) {
            if (e10.getCause() instanceof Exception) {
                c10143h03 = this.f46576c.f46579c;
                c10143h03.m42569r((Exception) e10.getCause());
            } else {
                c10143h02 = this.f46576c.f46579c;
                c10143h02.m42569r(e10);
            }
        } catch (Exception e11) {
            c10143h0 = this.f46576c.f46579c;
            c10143h0.m42569r(e11);
        }
    }
}
