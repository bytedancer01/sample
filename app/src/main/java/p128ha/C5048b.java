package p128ha;

import android.os.Looper;
import android.util.Log;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ha/b.class
 */
/* renamed from: ha.b */
/* loaded from: combined.jar:classes2.jar:ha/b.class */
public final class C5048b {

    /* renamed from: a */
    public static volatile ClassLoader f29123a;

    /* renamed from: b */
    public static volatile Thread f29124b;

    /* renamed from: a */
    public static ClassLoader m25274a() {
        ClassLoader classLoader;
        synchronized (C5048b.class) {
            try {
                if (f29123a == null) {
                    f29123a = m25275b();
                }
                classLoader = f29123a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return classLoader;
    }

    /* renamed from: b */
    public static ClassLoader m25275b() {
        ClassLoader classLoader;
        synchronized (C5048b.class) {
            try {
                if (f29124b == null) {
                    f29124b = m25276c();
                    if (f29124b == null) {
                        return null;
                    }
                }
                synchronized (f29124b) {
                    try {
                        classLoader = f29124b.getContextClassLoader();
                    } catch (SecurityException e10) {
                        String valueOf = String.valueOf(e10.getMessage());
                        Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                        classLoader = null;
                    }
                }
                return classLoader;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static Thread m25276c() {
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2;
        C5047a c5047a;
        synchronized (C5048b.class) {
            try {
                ThreadGroup threadGroup3 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup3 == null) {
                    return null;
                }
                try {
                    synchronized (Void.class) {
                        try {
                            int activeGroupCount = threadGroup3.activeGroupCount();
                            ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                            threadGroup3.enumerate(threadGroupArr);
                            int i10 = 0;
                            while (true) {
                                if (i10 >= activeGroupCount) {
                                    threadGroup = null;
                                    break;
                                }
                                threadGroup = threadGroupArr[i10];
                                if ("dynamiteLoader".equals(threadGroup.getName())) {
                                    break;
                                }
                                i10++;
                            }
                            threadGroup2 = threadGroup;
                            if (threadGroup == null) {
                                threadGroup2 = new ThreadGroup(threadGroup3, "dynamiteLoader");
                            }
                            int activeCount = threadGroup2.activeCount();
                            Thread[] threadArr = new Thread[activeCount];
                            threadGroup2.enumerate(threadArr);
                            int i11 = 0;
                            while (true) {
                                if (i11 >= activeCount) {
                                    thread = null;
                                    break;
                                }
                                thread = threadArr[i11];
                                if ("GmsDynamite".equals(thread.getName())) {
                                    break;
                                }
                                i11++;
                            }
                            thread2 = thread;
                        } catch (SecurityException e10) {
                            e = e10;
                            thread = null;
                        }
                        if (thread == null) {
                            try {
                                c5047a = new C5047a(threadGroup2, "GmsDynamite");
                            } catch (SecurityException e11) {
                                e = e11;
                            }
                            try {
                                c5047a.setContextClassLoader(null);
                                c5047a.start();
                                thread = c5047a;
                            } catch (SecurityException e12) {
                                e = e12;
                                thread = c5047a;
                                String valueOf = String.valueOf(e.getMessage());
                                Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                                thread2 = thread;
                                return thread2;
                            }
                            thread2 = thread;
                        }
                    }
                    return thread2;
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
