package ug;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ug/d.class
 */
/* renamed from: ug.d */
/* loaded from: combined.jar:classes2.jar:ug/d.class */
public abstract class AbstractRunnableC9179d implements Runnable {

    /* renamed from: b */
    public final String f41994b;

    public AbstractRunnableC9179d(String str, Object... objArr) {
        this.f41994b = String.format(str, objArr);
    }

    /* renamed from: k */
    public abstract void mo38663k();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f41994b);
        try {
            mo38663k();
            Thread.currentThread().setName(name);
        } catch (Throwable th2) {
            Thread.currentThread().setName(name);
            throw th2;
        }
    }
}
