package p449zi;

import java.lang.Thread;
import pl.droidsonroids.gif.C7735a;

/* renamed from: zi.g */
/* loaded from: combined.jar:classes3.jar:zi/g.class */
public abstract class AbstractRunnableC10247g implements Runnable {

    /* renamed from: b */
    public final C7735a f46849b;

    public AbstractRunnableC10247g(C7735a c7735a) {
        this.f46849b = c7735a;
    }

    /* renamed from: a */
    public abstract void mo33804a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f46849b.m33797e()) {
                return;
            }
            mo33804a();
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
            throw th2;
        }
    }
}
