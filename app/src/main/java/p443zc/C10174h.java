package p443zc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p079ea.ThreadFactoryC4694b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zc/h.class
 */
/* renamed from: zc.h */
/* loaded from: combined.jar:classes2.jar:zc/h.class */
public class C10174h {

    /* renamed from: a */
    public static final Executor f46624a = ExecutorC10173g.f46623b;

    /* renamed from: a */
    public static Executor m42622a() {
        return f46624a;
    }

    /* renamed from: b */
    public static ExecutorService m42623b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4694b("firebase-iid-executor"));
    }
}
