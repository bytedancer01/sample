package id;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p079ea.ThreadFactoryC4694b;
import pa.C7685d;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/g.class
 */
/* renamed from: id.g */
/* loaded from: combined.jar:classes2.jar:id/g.class */
public class C5225g {
    /* renamed from: a */
    public static Executor m26099a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4694b("Firebase-Messaging-Trigger-Topics-Io"));
    }

    /* renamed from: b */
    public static ScheduledExecutorService m26100b() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC4694b("Firebase-Messaging-Init"));
    }

    /* renamed from: c */
    public static ExecutorService m26101c() {
        C7685d.m33625a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC4694b("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: d */
    public static ExecutorService m26102d() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC4694b("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: e */
    public static ScheduledExecutorService m26103e() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC4694b("Firebase-Messaging-Topics-Io"));
    }

    /* renamed from: f */
    public static Executor m26104f() {
        return m26099a("Firebase-Messaging-Trigger-Topics-Io");
    }
}
