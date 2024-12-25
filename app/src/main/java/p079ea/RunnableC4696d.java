package p079ea;

import android.os.Process;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ea/d.class
 */
/* renamed from: ea.d */
/* loaded from: combined.jar:classes2.jar:ea/d.class */
public final class RunnableC4696d implements Runnable {

    /* renamed from: b */
    public final Runnable f27703b;

    public RunnableC4696d(Runnable runnable, int i10) {
        this.f27703b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f27703b.run();
    }
}
