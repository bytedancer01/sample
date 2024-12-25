package za;

import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/r.class
 */
/* renamed from: za.r */
/* loaded from: combined.jar:classes2.jar:za/r.class */
public final class RunnableC10154r implements Runnable {

    /* renamed from: b */
    public final AbstractC10144i f46580b;

    /* renamed from: c */
    public final C10155s f46581c;

    public RunnableC10154r(C10155s c10155s, AbstractC10144i abstractC10144i) {
        this.f46581c = c10155s;
        this.f46580b = abstractC10144i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10143h0 c10143h0;
        C10143h0 c10143h02;
        C10143h0 c10143h03;
        InterfaceC10128a interfaceC10128a;
        try {
            interfaceC10128a = this.f46581c.f46583b;
            AbstractC10144i abstractC10144i = (AbstractC10144i) interfaceC10128a.mo26105a(this.f46580b);
            if (abstractC10144i == null) {
                this.f46581c.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C10147k.f46573b;
            abstractC10144i.mo42557f(executor, this.f46581c);
            abstractC10144i.mo42555d(executor, this.f46581c);
            abstractC10144i.mo42552a(executor, this.f46581c);
        } catch (C10140g e10) {
            if (e10.getCause() instanceof Exception) {
                c10143h03 = this.f46581c.f46584c;
                c10143h03.m42569r((Exception) e10.getCause());
            } else {
                c10143h02 = this.f46581c.f46584c;
                c10143h02.m42569r(e10);
            }
        } catch (Exception e11) {
            c10143h0 = this.f46581c.f46584c;
            c10143h0.m42569r(e11);
        }
    }
}
