package ni;

import com.amazonaws.services.p045s3.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p372vh.C9365d;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ni/e.class
 */
/* renamed from: ni.e */
/* loaded from: combined.jar:classes2.jar:ni/e.class */
public final class C6798e {

    /* renamed from: i */
    @NotNull
    public static final Logger f35433i;

    /* renamed from: a */
    public int f35435a;

    /* renamed from: b */
    public boolean f35436b;

    /* renamed from: c */
    public long f35437c;

    /* renamed from: d */
    public final List<C6797d> f35438d;

    /* renamed from: e */
    public final List<C6797d> f35439e;

    /* renamed from: f */
    public final Runnable f35440f;

    /* renamed from: g */
    @NotNull
    public final a f35441g;

    /* renamed from: j */
    public static final b f35434j = new b(null);

    /* renamed from: h */
    @NotNull
    public static final C6798e f35432h = new C6798e(new c(C5634b.m27766J(C5634b.f31712i + " TaskRunner", true)));

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ni/e$a.class
     */
    /* renamed from: ni.e$a */
    /* loaded from: combined.jar:classes2.jar:ni/e$a.class */
    public interface a {
        /* renamed from: a */
        void mo31344a(@NotNull C6798e c6798e);

        /* renamed from: b */
        void mo31345b(@NotNull C6798e c6798e, long j10);

        /* renamed from: c */
        long mo31346c();

        void execute(@NotNull Runnable runnable);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ni/e$b.class
     */
    /* renamed from: ni.e$b */
    /* loaded from: combined.jar:classes2.jar:ni/e$b.class */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C9365d c9365d) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Logger m31347a() {
            return C6798e.f35433i;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ni/e$c.class
     */
    /* renamed from: ni.e$c */
    /* loaded from: combined.jar:classes2.jar:ni/e$c.class */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f35442a;

        public c(@NotNull ThreadFactory threadFactory) {
            C9367f.m39526e(threadFactory, "threadFactory");
            this.f35442a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // ni.C6798e.a
        /* renamed from: a */
        public void mo31344a(@NotNull C6798e c6798e) {
            C9367f.m39526e(c6798e, "taskRunner");
            c6798e.notify();
        }

        @Override // ni.C6798e.a
        /* renamed from: b */
        public void mo31345b(@NotNull C6798e c6798e, long j10) {
            C9367f.m39526e(c6798e, "taskRunner");
            long j11 = j10 / 1000000;
            if (j11 > 0 || j10 > 0) {
                c6798e.wait(j11, (int) (j10 - (1000000 * j11)));
            }
        }

        @Override // ni.C6798e.a
        /* renamed from: c */
        public long mo31346c() {
            return System.nanoTime();
        }

        @Override // ni.C6798e.a
        public void execute(@NotNull Runnable runnable) {
            C9367f.m39526e(runnable, "runnable");
            this.f35442a.execute(runnable);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ni/e$d.class
     */
    /* renamed from: ni.e$d */
    /* loaded from: combined.jar:classes2.jar:ni/e$d.class */
    public static final class d implements Runnable {

        /* renamed from: b */
        public final C6798e f35443b;

        public d(C6798e c6798e) {
            this.f35443b = c6798e;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC6794a m31337d;
            while (true) {
                synchronized (this.f35443b) {
                    m31337d = this.f35443b.m31337d();
                }
                if (m31337d == null) {
                    return;
                }
                C6797d m31313d = m31337d.m31313d();
                C9367f.m39524c(m31313d);
                long j10 = -1;
                boolean isLoggable = C6798e.f35434j.m31347a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = m31313d.m31328h().m31340g().mo31346c();
                    C6795b.m31319c(m31337d, m31313d, "starting");
                }
                try {
                    try {
                        this.f35443b.m31343j(m31337d);
                        C5398q c5398q = C5398q.f30770a;
                        if (isLoggable) {
                            C6795b.m31319c(m31337d, m31313d, "finished run in " + C6795b.m31318b(m31313d.m31328h().m31340g().mo31346c() - j10));
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C6795b.m31319c(m31337d, m31313d, "failed a run in " + C6795b.m31318b(m31313d.m31328h().m31340g().mo31346c() - j10));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C6798e.class.getName());
        C9367f.m39525d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f35433i = logger;
    }

    public C6798e(@NotNull a aVar) {
        C9367f.m39526e(aVar, "backend");
        this.f35441g = aVar;
        this.f35435a = Constants.MAXIMUM_UPLOAD_PARTS;
        this.f35438d = new ArrayList();
        this.f35439e = new ArrayList();
        this.f35440f = new d(this);
    }

    /* renamed from: c */
    public final void m31336c(AbstractC6794a abstractC6794a, long j10) {
        if (C5634b.f31711h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        C6797d m31313d = abstractC6794a.m31313d();
        C9367f.m39524c(m31313d);
        if (!(m31313d.m31323c() == abstractC6794a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean m31324d = m31313d.m31324d();
        m31313d.m31332m(false);
        m31313d.m31331l(null);
        this.f35438d.remove(m31313d);
        if (j10 != -1 && !m31324d && !m31313d.m31327g()) {
            m31313d.m31330k(abstractC6794a, j10, true);
        }
        if (!m31313d.m31325e().isEmpty()) {
            this.f35439e.add(m31313d);
        }
    }

    @Nullable
    /* renamed from: d */
    public final AbstractC6794a m31337d() {
        boolean z10;
        if (C5634b.f31711h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        while (!this.f35439e.isEmpty()) {
            long mo31346c = this.f35441g.mo31346c();
            long j10 = Long.MAX_VALUE;
            Iterator<C6797d> it = this.f35439e.iterator();
            AbstractC6794a abstractC6794a = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                AbstractC6794a abstractC6794a2 = it.next().m31325e().get(0);
                long max = Math.max(0L, abstractC6794a2.m31312c() - mo31346c);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else {
                    if (abstractC6794a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC6794a = abstractC6794a2;
                }
            }
            if (abstractC6794a != null) {
                m31338e(abstractC6794a);
                if (z10 || (!this.f35436b && (!this.f35439e.isEmpty()))) {
                    this.f35441g.execute(this.f35440f);
                }
                return abstractC6794a;
            }
            if (this.f35436b) {
                if (j10 >= this.f35437c - mo31346c) {
                    return null;
                }
                this.f35441g.mo31344a(this);
                return null;
            }
            this.f35436b = true;
            this.f35437c = mo31346c + j10;
            try {
                try {
                    this.f35441g.mo31345b(this, j10);
                } catch (InterruptedException e10) {
                    m31339f();
                }
            } finally {
                this.f35436b = false;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m31338e(AbstractC6794a abstractC6794a) {
        if (!C5634b.f31711h || Thread.holdsLock(this)) {
            abstractC6794a.m31316g(-1L);
            C6797d m31313d = abstractC6794a.m31313d();
            C9367f.m39524c(m31313d);
            m31313d.m31325e().remove(abstractC6794a);
            this.f35439e.remove(m31313d);
            m31313d.m31331l(abstractC6794a);
            this.f35438d.add(m31313d);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9367f.m39525d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: f */
    public final void m31339f() {
        for (int size = this.f35438d.size() - 1; size >= 0; size--) {
            this.f35438d.get(size).m31322b();
        }
        for (int size2 = this.f35439e.size() - 1; size2 >= 0; size2--) {
            C6797d c6797d = this.f35439e.get(size2);
            c6797d.m31322b();
            if (c6797d.m31325e().isEmpty()) {
                this.f35439e.remove(size2);
            }
        }
    }

    @NotNull
    /* renamed from: g */
    public final a m31340g() {
        return this.f35441g;
    }

    /* renamed from: h */
    public final void m31341h(@NotNull C6797d c6797d) {
        C9367f.m39526e(c6797d, "taskQueue");
        if (C5634b.f31711h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (c6797d.m31323c() == null) {
            if (!c6797d.m31325e().isEmpty()) {
                C5634b.m27781a(this.f35439e, c6797d);
            } else {
                this.f35439e.remove(c6797d);
            }
        }
        if (this.f35436b) {
            this.f35441g.mo31344a(this);
        } else {
            this.f35441g.execute(this.f35440f);
        }
    }

    @NotNull
    /* renamed from: i */
    public final C6797d m31342i() {
        int i10;
        synchronized (this) {
            i10 = this.f35435a;
            this.f35435a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new C6797d(this, sb2.toString());
    }

    /* renamed from: j */
    public final void m31343j(AbstractC6794a abstractC6794a) {
        if (C5634b.f31711h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C9367f.m39525d(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        C9367f.m39525d(currentThread2, "currentThread");
        String name = currentThread2.getName();
        currentThread2.setName(abstractC6794a.m31311b());
        try {
            long mo31315f = abstractC6794a.mo31315f();
            synchronized (this) {
                m31336c(abstractC6794a, mo31315f);
                C5398q c5398q = C5398q.f30770a;
            }
            currentThread2.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                m31336c(abstractC6794a, -1L);
                C5398q c5398q2 = C5398q.f30770a;
                currentThread2.setName(name);
                throw th2;
            }
        }
    }
}
