package ba;

import java.util.concurrent.ScheduledExecutorService;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ba/a.class
 */
@Deprecated
/* renamed from: ba.a */
/* loaded from: combined.jar:classes2.jar:ba/a.class */
public class C0869a {

    /* renamed from: a */
    public static a f5950a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ba/a$a.class
     */
    /* renamed from: ba.a$a */
    /* loaded from: combined.jar:classes2.jar:ba/a$a.class */
    public interface a {
        @Deprecated
        /* renamed from: a */
        ScheduledExecutorService mo5436a();
    }

    @Deprecated
    /* renamed from: a */
    public static a m5435a() {
        a aVar;
        synchronized (C0869a.class) {
            try {
                if (f5950a == null) {
                    f5950a = new C0870b();
                }
                aVar = f5950a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
