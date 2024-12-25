package za;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/b0.class
 */
/* renamed from: za.b0 */
/* loaded from: combined.jar:classes2.jar:za/b0.class */
public final class RunnableC10131b0 implements Runnable {

    /* renamed from: b */
    public final AbstractC10144i f46554b;

    /* renamed from: c */
    public final C10133c0 f46555c;

    public RunnableC10131b0(C10133c0 c10133c0, AbstractC10144i abstractC10144i) {
        this.f46555c = c10133c0;
        this.f46554b = abstractC10144i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10142h interfaceC10142h;
        try {
            interfaceC10142h = this.f46555c.f46557b;
            AbstractC10144i mo37125a = interfaceC10142h.mo37125a(this.f46554b.mo42563l());
            if (mo37125a == null) {
                this.f46555c.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C10147k.f46573b;
            mo37125a.mo42557f(executor, this.f46555c);
            mo37125a.mo42555d(executor, this.f46555c);
            mo37125a.mo42552a(executor, this.f46555c);
        } catch (CancellationException e10) {
            this.f46555c.mo42548b();
        } catch (C10140g e11) {
            if (e11.getCause() instanceof Exception) {
                this.f46555c.onFailure((Exception) e11.getCause());
            } else {
                this.f46555c.onFailure(e11);
            }
        } catch (Exception e12) {
            this.f46555c.onFailure(e12);
        }
    }
}
