package ma;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ze.class
 */
/* renamed from: ma.ze */
/* loaded from: combined.jar:classes2.jar:ma/ze.class */
public final class C6540ze {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [ma.ue] */
    /* renamed from: a */
    public static InterfaceExecutorServiceC6440ue m30191a(ExecutorService executorService) {
        return executorService instanceof InterfaceExecutorServiceC6440ue ? (InterfaceExecutorServiceC6440ue) executorService : executorService instanceof ScheduledExecutorService ? new ScheduledExecutorServiceC6520ye((ScheduledExecutorService) executorService) : new C6460ve(executorService);
    }
}
