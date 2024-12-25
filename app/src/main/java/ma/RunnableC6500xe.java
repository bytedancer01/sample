package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/xe.class
 */
/* renamed from: ma.xe */
/* loaded from: combined.jar:classes2.jar:ma/xe.class */
public final class RunnableC6500xe extends AbstractC6539zd implements Runnable {

    /* renamed from: i */
    public final Runnable f34154i;

    public RunnableC6500xe(Runnable runnable) {
        runnable.getClass();
        this.f34154i = runnable;
    }

    @Override // ma.AbstractC6062ce
    /* renamed from: g */
    public final String mo29441g() {
        return "task=[" + this.f34154i.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f34154i.run();
        } catch (Error | RuntimeException e10) {
            m29505m(e10);
            throw e10;
        }
    }
}
