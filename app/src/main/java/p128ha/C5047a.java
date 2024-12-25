package p128ha;

import android.os.Process;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ha/a.class
 */
/* renamed from: ha.a */
/* loaded from: combined.jar:classes2.jar:ha/a.class */
public final class C5047a extends Thread {
    public C5047a(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException e10) {
                    return;
                }
            }
        }
    }
}
