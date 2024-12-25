package p067di;

import bi.C0909g;
import bi.C0911i;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p233nh.InterfaceC6792g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/c0.class
 */
/* renamed from: di.c0 */
/* loaded from: combined.jar:classes2.jar:di/c0.class */
public final class C4465c0 {

    /* renamed from: a */
    @NotNull
    public static final List<CoroutineExceptionHandler> f26878a = C0911i.m5597j(C0909g.m5588a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final void m22638a(@NotNull InterfaceC6792g interfaceC6792g, @NotNull Throwable th2) {
        Iterator<CoroutineExceptionHandler> it = f26878a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(interfaceC6792g, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C4468d0.m22651b(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
