package p327t1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.C0725c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p342u1.AbstractC8784a;
import p375w1.InterfaceC9397b;
import p375w1.InterfaceC9398c;
import p375w1.InterfaceC9400e;
import p375w1.InterfaceC9401f;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:t1/e.class
 */
/* renamed from: t1.e */
/* loaded from: combined.jar:classes1.jar:t1/e.class */
public abstract class AbstractC8597e {

    /* renamed from: a */
    @Deprecated
    public volatile InterfaceC9397b f40077a;

    /* renamed from: b */
    public Executor f40078b;

    /* renamed from: c */
    public Executor f40079c;

    /* renamed from: d */
    public InterfaceC9398c f40080d;

    /* renamed from: f */
    public boolean f40082f;

    /* renamed from: g */
    public boolean f40083g;

    /* renamed from: h */
    @Deprecated
    public List<b> f40084h;

    /* renamed from: i */
    public final ReentrantReadWriteLock f40085i = new ReentrantReadWriteLock();

    /* renamed from: j */
    public final ThreadLocal<Integer> f40086j = new ThreadLocal<>();

    /* renamed from: k */
    public final Map<String, Object> f40087k = new ConcurrentHashMap();

    /* renamed from: e */
    public final C0725c f40081e = mo4910e();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t1/e$a.class
     */
    /* renamed from: t1.e$a */
    /* loaded from: combined.jar:classes1.jar:t1/e$a.class */
    public static class a<T extends AbstractC8597e> {

        /* renamed from: a */
        public final Class<T> f40088a;

        /* renamed from: b */
        public final String f40089b;

        /* renamed from: c */
        public final Context f40090c;

        /* renamed from: d */
        public ArrayList<b> f40091d;

        /* renamed from: e */
        public Executor f40092e;

        /* renamed from: f */
        public Executor f40093f;

        /* renamed from: g */
        public InterfaceC9398c.c f40094g;

        /* renamed from: h */
        public boolean f40095h;

        /* renamed from: j */
        public boolean f40097j;

        /* renamed from: l */
        public boolean f40099l;

        /* renamed from: n */
        public Set<Integer> f40101n;

        /* renamed from: o */
        public Set<Integer> f40102o;

        /* renamed from: p */
        public String f40103p;

        /* renamed from: q */
        public File f40104q;

        /* renamed from: i */
        public c f40096i = c.AUTOMATIC;

        /* renamed from: k */
        public boolean f40098k = true;

        /* renamed from: m */
        public final d f40100m = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f40090c = context;
            this.f40088a = cls;
            this.f40089b = str;
        }

        /* renamed from: a */
        public a<T> m36911a(b bVar) {
            if (this.f40091d == null) {
                this.f40091d = new ArrayList<>();
            }
            this.f40091d.add(bVar);
            return this;
        }

        /* renamed from: b */
        public a<T> m36912b(AbstractC8784a... abstractC8784aArr) {
            if (this.f40102o == null) {
                this.f40102o = new HashSet();
            }
            for (AbstractC8784a abstractC8784a : abstractC8784aArr) {
                this.f40102o.add(Integer.valueOf(abstractC8784a.f40743a));
                this.f40102o.add(Integer.valueOf(abstractC8784a.f40744b));
            }
            this.f40100m.m36921b(abstractC8784aArr);
            return this;
        }

        /* renamed from: c */
        public a<T> m36913c() {
            this.f40095h = true;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x004c, code lost:
        
            if (r19 != null) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T m36914d() {
            /*
                Method dump skipped, instructions count: 382
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p327t1.AbstractC8597e.a.m36914d():t1.e");
        }

        /* renamed from: e */
        public a<T> m36915e() {
            this.f40098k = false;
            this.f40099l = true;
            return this;
        }

        /* renamed from: f */
        public a<T> m36916f(InterfaceC9398c.c cVar) {
            this.f40094g = cVar;
            return this;
        }

        /* renamed from: g */
        public a<T> m36917g(Executor executor) {
            this.f40092e = executor;
            return this;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t1/e$b.class
     */
    /* renamed from: t1.e$b */
    /* loaded from: combined.jar:classes1.jar:t1/e$b.class */
    public static abstract class b {
        /* renamed from: a */
        public void m36918a(InterfaceC9397b interfaceC9397b) {
        }

        /* renamed from: b */
        public void m36919b(InterfaceC9397b interfaceC9397b) {
        }

        /* renamed from: c */
        public void mo4898c(InterfaceC9397b interfaceC9397b) {
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t1/e$c.class
     */
    /* renamed from: t1.e$c */
    /* loaded from: combined.jar:classes1.jar:t1/e$c.class */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:t1/e$d.class
     */
    /* renamed from: t1.e$d */
    /* loaded from: combined.jar:classes1.jar:t1/e$d.class */
    public static class d {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, AbstractC8784a>> f40105a = new HashMap<>();

        /* renamed from: a */
        public final void m36920a(AbstractC8784a abstractC8784a) {
            int i10 = abstractC8784a.f40743a;
            int i11 = abstractC8784a.f40744b;
            TreeMap<Integer, AbstractC8784a> treeMap = this.f40105a.get(Integer.valueOf(i10));
            TreeMap<Integer, AbstractC8784a> treeMap2 = treeMap;
            if (treeMap == null) {
                treeMap2 = new TreeMap<>();
                this.f40105a.put(Integer.valueOf(i10), treeMap2);
            }
            AbstractC8784a abstractC8784a2 = treeMap2.get(Integer.valueOf(i11));
            if (abstractC8784a2 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC8784a2 + " with " + abstractC8784a);
            }
            treeMap2.put(Integer.valueOf(i11), abstractC8784a);
        }

        /* renamed from: b */
        public void m36921b(AbstractC8784a... abstractC8784aArr) {
            for (AbstractC8784a abstractC8784a : abstractC8784aArr) {
                m36920a(abstractC8784a);
            }
        }

        /* renamed from: c */
        public List<AbstractC8784a> m36922c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return m36923d(new ArrayList(), i11 > i10, i10, i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        
            if (r0 > r7) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        
            r9 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        
            if (r0 < r7) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:1: B:11:0x0048->B:30:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0028 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<p342u1.AbstractC8784a> m36923d(java.util.List<p342u1.AbstractC8784a> r5, boolean r6, int r7, int r8) {
            /*
                r4 = this;
            L0:
                r0 = r6
                if (r0 == 0) goto Ld
                r0 = r7
                r1 = r8
                if (r0 >= r1) goto Lcc
                goto L13
            Ld:
                r0 = r7
                r1 = r8
                if (r0 <= r1) goto Lcc
            L13:
                r0 = r4
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, u1.a>> r0 = r0.f40105a
                r1 = r7
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r15 = r0
                r0 = r15
                if (r0 != 0) goto L2a
                r0 = 0
                return r0
            L2a:
                r0 = r6
                if (r0 == 0) goto L38
                r0 = r15
                java.util.NavigableSet r0 = r0.descendingKeySet()
                r14 = r0
                goto L3f
            L38:
                r0 = r15
                java.util.Set r0 = r0.keySet()
                r14 = r0
            L3f:
                r0 = r14
                java.util.Iterator r0 = r0.iterator()
                r14 = r0
            L48:
                r0 = r14
                boolean r0 = r0.hasNext()
                r13 = r0
                r0 = 1
                r10 = r0
                r0 = 0
                r12 = r0
                r0 = r13
                if (r0 == 0) goto Lc2
                r0 = r14
                java.lang.Object r0 = r0.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r11 = r0
                r0 = r6
                if (r0 == 0) goto L8a
                r0 = r12
                r9 = r0
                r0 = r11
                r1 = r8
                if (r0 > r1) goto La2
                r0 = r12
                r9 = r0
                r0 = r11
                r1 = r7
                if (r0 <= r1) goto La2
            L84:
                r0 = 1
                r9 = r0
                goto La2
            L8a:
                r0 = r12
                r9 = r0
                r0 = r11
                r1 = r8
                if (r0 < r1) goto La2
                r0 = r12
                r9 = r0
                r0 = r11
                r1 = r7
                if (r0 >= r1) goto La2
                goto L84
            La2:
                r0 = r9
                if (r0 == 0) goto L48
                r0 = r5
                r1 = r15
                r2 = r11
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r1 = r1.get(r2)
                boolean r0 = r0.add(r1)
                r0 = r11
                r7 = r0
                r0 = r10
                r9 = r0
                goto Lc5
            Lc2:
                r0 = 0
                r9 = r0
            Lc5:
                r0 = r9
                if (r0 != 0) goto L0
                r0 = 0
                return r0
            Lcc:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p327t1.AbstractC8597e.d.m36923d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    /* renamed from: n */
    public static boolean m36895n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public void m36896a() {
        if (!this.f40082f && m36895n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: b */
    public void m36897b() {
        if (!m36904k() && this.f40086j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void m36898c() {
        m36896a();
        InterfaceC9397b writableDatabase = this.f40080d.getWritableDatabase();
        this.f40081e.m4722m(writableDatabase);
        writableDatabase.mo39711A();
    }

    /* renamed from: d */
    public InterfaceC9401f m36899d(String str) {
        m36896a();
        m36897b();
        return this.f40080d.getWritableDatabase().mo39718j0(str);
    }

    /* renamed from: e */
    public abstract C0725c mo4910e();

    /* renamed from: f */
    public abstract InterfaceC9398c mo4911f(C8593a c8593a);

    @Deprecated
    /* renamed from: g */
    public void m36900g() {
        this.f40080d.getWritableDatabase().mo39717S();
        if (m36904k()) {
            return;
        }
        this.f40081e.m4715f();
    }

    /* renamed from: h */
    public Lock m36901h() {
        return this.f40085i.readLock();
    }

    /* renamed from: i */
    public InterfaceC9398c m36902i() {
        return this.f40080d;
    }

    /* renamed from: j */
    public Executor m36903j() {
        return this.f40078b;
    }

    /* renamed from: k */
    public boolean m36904k() {
        return this.f40080d.getWritableDatabase().mo39720u0();
    }

    /* renamed from: l */
    public void m36905l(C8593a c8593a) {
        InterfaceC9398c mo4911f = mo4911f(c8593a);
        this.f40080d = mo4911f;
        if (mo4911f instanceof C8601i) {
            ((C8601i) mo4911f).m36947l(c8593a);
        }
        boolean z10 = c8593a.f40066g == c.WRITE_AHEAD_LOGGING;
        this.f40080d.setWriteAheadLoggingEnabled(z10);
        this.f40084h = c8593a.f40064e;
        this.f40078b = c8593a.f40067h;
        this.f40079c = new ExecutorC8604l(c8593a.f40068i);
        this.f40082f = c8593a.f40065f;
        this.f40083g = z10;
        if (c8593a.f40069j) {
            this.f40081e.m4718i(c8593a.f40061b, c8593a.f40062c);
        }
    }

    /* renamed from: m */
    public void m36906m(InterfaceC9397b interfaceC9397b) {
        this.f40081e.m4713d(interfaceC9397b);
    }

    /* renamed from: o */
    public boolean m36907o() {
        InterfaceC9397b interfaceC9397b = this.f40077a;
        return interfaceC9397b != null && interfaceC9397b.isOpen();
    }

    /* renamed from: p */
    public Cursor m36908p(InterfaceC9400e interfaceC9400e) {
        return m36909q(interfaceC9400e, null);
    }

    /* renamed from: q */
    public Cursor m36909q(InterfaceC9400e interfaceC9400e, CancellationSignal cancellationSignal) {
        m36896a();
        m36897b();
        return cancellationSignal != null ? this.f40080d.getWritableDatabase().mo39716R(interfaceC9400e, cancellationSignal) : this.f40080d.getWritableDatabase().mo39721w0(interfaceC9400e);
    }

    @Deprecated
    /* renamed from: r */
    public void m36910r() {
        this.f40080d.getWritableDatabase().mo39714O();
    }
}
