package id;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import bd.InterfaceC0891b;
import cd.InterfaceC1067g;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import mc.C6553c;
import p169jd.InterfaceC5364i;
import p294r.C7928a;
import p425yc.InterfaceC9979f;
import p443zc.C10182p;
import p443zc.C10185s;
import p443zc.InterfaceC10183q;
import za.AbstractC10144i;
import za.C10146j;
import za.C10148l;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:id/y.class
 */
/* renamed from: id.y */
/* loaded from: combined.jar:classes2.jar:id/y.class */
public class C5243y {

    /* renamed from: i */
    public static final long f29961i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final FirebaseInstanceId f29962a;

    /* renamed from: b */
    public final Context f29963b;

    /* renamed from: c */
    public final C10185s f29964c;

    /* renamed from: d */
    public final C10182p f29965d;

    /* renamed from: f */
    public final ScheduledExecutorService f29967f;

    /* renamed from: h */
    public final C5241w f29969h;

    /* renamed from: e */
    public final Map<String, ArrayDeque<C10146j<Void>>> f29966e = new C7928a();

    /* renamed from: g */
    public boolean f29968g = false;

    public C5243y(FirebaseInstanceId firebaseInstanceId, C10185s c10185s, C5241w c5241w, C10182p c10182p, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f29962a = firebaseInstanceId;
        this.f29964c = c10185s;
        this.f29969h = c5241w;
        this.f29965d = c10182p;
        this.f29963b = context;
        this.f29967f = scheduledExecutorService;
    }

    /* renamed from: a */
    public static <T> T m26134a(AbstractC10144i<T> abstractC10144i) {
        try {
            return (T) C10148l.m42584b(abstractC10144i, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e11);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: d */
    public static AbstractC10144i<C5243y> m26135d(final FirebaseInstanceId firebaseInstanceId, final C10185s c10185s, final C10182p c10182p, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C10148l.m42585c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseInstanceId, c10185s, c10182p) { // from class: id.x

            /* renamed from: a */
            public final Context f29956a;

            /* renamed from: b */
            public final ScheduledExecutorService f29957b;

            /* renamed from: c */
            public final FirebaseInstanceId f29958c;

            /* renamed from: d */
            public final C10185s f29959d;

            /* renamed from: e */
            public final C10182p f29960e;

            {
                this.f29956a = context;
                this.f29957b = scheduledExecutorService;
                this.f29958c = firebaseInstanceId;
                this.f29959d = c10185s;
                this.f29960e = c10182p;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return C5243y.m26138i(this.f29956a, this.f29957b, this.f29958c, this.f29959d, this.f29960e);
            }
        });
    }

    /* renamed from: e */
    public static AbstractC10144i<C5243y> m26136e(C6553c c6553c, FirebaseInstanceId firebaseInstanceId, C10185s c10185s, InterfaceC0891b<InterfaceC5364i> interfaceC0891b, InterfaceC0891b<InterfaceC9979f> interfaceC0891b2, InterfaceC1067g interfaceC1067g, Context context, ScheduledExecutorService scheduledExecutorService) {
        return m26135d(firebaseInstanceId, c10185s, new C10182p(c6553c, c10185s, interfaceC0891b, interfaceC0891b2, interfaceC1067g), context, scheduledExecutorService);
    }

    /* renamed from: g */
    public static boolean m26137g() {
        boolean z10 = false;
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT == 23) {
                if (!Log.isLoggable("FirebaseMessaging", 3)) {
                    return false;
                }
            }
            return z10;
        }
        z10 = true;
        return z10;
    }

    /* renamed from: i */
    public static final /* synthetic */ C5243y m26138i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C10185s c10185s, C10182p c10182p) {
        return new C5243y(firebaseInstanceId, c10185s, C5241w.m26130a(context, scheduledExecutorService), c10182p, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void m26139b(String str) {
        InterfaceC10183q interfaceC10183q = (InterfaceC10183q) m26134a(this.f29962a.m14255i());
        m26134a(this.f29965d.m42633j(interfaceC10183q.getId(), interfaceC10183q.getToken(), str));
    }

    /* renamed from: c */
    public final void m26140c(String str) {
        InterfaceC10183q interfaceC10183q = (InterfaceC10183q) m26134a(this.f29962a.m14255i());
        m26134a(this.f29965d.m42634k(interfaceC10183q.getId(), interfaceC10183q.getToken(), str));
    }

    /* renamed from: f */
    public boolean m26141f() {
        return this.f29969h.m26131b() != null;
    }

    /* renamed from: h */
    public boolean m26142h() {
        boolean z10;
        synchronized (this) {
            z10 = this.f29968g;
        }
        return z10;
    }

    /* renamed from: j */
    public final void m26143j(C5240v c5240v) {
        synchronized (this.f29966e) {
            String m26129e = c5240v.m26129e();
            if (this.f29966e.containsKey(m26129e)) {
                ArrayDeque<C10146j<Void>> arrayDeque = this.f29966e.get(m26129e);
                C10146j<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.m42580c(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f29966e.remove(m26129e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2 A[Catch: IOException -> 0x0108, TRY_ENTER, TryCatch #0 {IOException -> 0x0108, blocks: (B:2:0x0000, B:14:0x0040, B:16:0x0046, B:18:0x0077, B:23:0x007f, B:25:0x008d, B:27:0x00c2, B:29:0x00d0), top: B:1:0x0000 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m26144k(id.C5240v r6) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: id.C5243y.m26144k(id.v):boolean");
    }

    /* renamed from: l */
    public void m26145l(Runnable runnable, long j10) {
        this.f29967f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* renamed from: m */
    public void m26146m(boolean z10) {
        synchronized (this) {
            this.f29968g = z10;
        }
    }

    /* renamed from: n */
    public final void m26147n() {
        if (m26142h()) {
            return;
        }
        m26150q(0L);
    }

    /* renamed from: o */
    public void m26148o() {
        if (m26141f()) {
            m26147n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0011, code lost:
    
        if (m26137g() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0014, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001f, code lost:
    
        return true;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m26149p() {
        /*
            r3 = this;
        L0:
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            id.w r0 = r0.f29969h     // Catch: java.lang.Throwable -> L3e
            id.v r0 = r0.m26131b()     // Catch: java.lang.Throwable -> L3e
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L21
            boolean r0 = m26137g()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L1d
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            int r0 = android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L3e
        L1d:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = 1
            return r0
        L21:
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r3
            r1 = r4
            boolean r0 = r0.m26144k(r1)
            if (r0 != 0) goto L2d
            r0 = 0
            return r0
        L2d:
            r0 = r3
            id.w r0 = r0.f29969h
            r1 = r4
            boolean r0 = r0.m26133d(r1)
            r0 = r3
            r1 = r4
            r0.m26143j(r1)
            goto L0
        L3e:
            r4 = move-exception
            r0 = r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.C5243y.m26149p():boolean");
    }

    /* renamed from: q */
    public void m26150q(long j10) {
        m26145l(new RunnableC5244z(this, this.f29963b, this.f29964c, Math.min(Math.max(30L, j10 + j10), f29961i)), j10);
        m26146m(true);
    }
}
