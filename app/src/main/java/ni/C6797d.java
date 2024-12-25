package ni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import ki.C5634b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p172jh.C5398q;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ni/d.class
 */
/* renamed from: ni.d */
/* loaded from: combined.jar:classes2.jar:ni/d.class */
public final class C6797d {

    /* renamed from: a */
    public boolean f35426a;

    /* renamed from: b */
    @Nullable
    public AbstractC6794a f35427b;

    /* renamed from: c */
    @NotNull
    public final List<AbstractC6794a> f35428c;

    /* renamed from: d */
    public boolean f35429d;

    /* renamed from: e */
    @NotNull
    public final C6798e f35430e;

    /* renamed from: f */
    @NotNull
    public final String f35431f;

    public C6797d(@NotNull C6798e c6798e, @NotNull String str) {
        C9367f.m39526e(c6798e, "taskRunner");
        C9367f.m39526e(str, "name");
        this.f35430e = c6798e;
        this.f35431f = str;
        this.f35428c = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m31320j(C6797d c6797d, AbstractC6794a abstractC6794a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c6797d.m31329i(abstractC6794a, j10);
    }

    /* renamed from: a */
    public final void m31321a() {
        if (!C5634b.f31711h || !Thread.holdsLock(this)) {
            synchronized (this.f35430e) {
                if (m31322b()) {
                    this.f35430e.m31341h(this);
                }
                C5398q c5398q = C5398q.f30770a;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9367f.m39525d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    /* renamed from: b */
    public final boolean m31322b() {
        AbstractC6794a abstractC6794a = this.f35427b;
        if (abstractC6794a != null) {
            C9367f.m39524c(abstractC6794a);
            if (abstractC6794a.m31310a()) {
                this.f35429d = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f35428c.size() - 1; size >= 0; size--) {
            if (this.f35428c.get(size).m31310a()) {
                AbstractC6794a abstractC6794a2 = this.f35428c.get(size);
                if (C6798e.f35434j.m31347a().isLoggable(Level.FINE)) {
                    C6795b.m31319c(abstractC6794a2, this, "canceled");
                }
                this.f35428c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    @Nullable
    /* renamed from: c */
    public final AbstractC6794a m31323c() {
        return this.f35427b;
    }

    /* renamed from: d */
    public final boolean m31324d() {
        return this.f35429d;
    }

    @NotNull
    /* renamed from: e */
    public final List<AbstractC6794a> m31325e() {
        return this.f35428c;
    }

    @NotNull
    /* renamed from: f */
    public final String m31326f() {
        return this.f35431f;
    }

    /* renamed from: g */
    public final boolean m31327g() {
        return this.f35426a;
    }

    @NotNull
    /* renamed from: h */
    public final C6798e m31328h() {
        return this.f35430e;
    }

    /* renamed from: i */
    public final void m31329i(@NotNull AbstractC6794a abstractC6794a, long j10) {
        C9367f.m39526e(abstractC6794a, "task");
        synchronized (this.f35430e) {
            if (!this.f35426a) {
                if (m31330k(abstractC6794a, j10, false)) {
                    this.f35430e.m31341h(this);
                }
                C5398q c5398q = C5398q.f30770a;
            } else if (abstractC6794a.m31310a()) {
                if (C6798e.f35434j.m31347a().isLoggable(Level.FINE)) {
                    C6795b.m31319c(abstractC6794a, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C6798e.f35434j.m31347a().isLoggable(Level.FINE)) {
                    C6795b.m31319c(abstractC6794a, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: k */
    public final boolean m31330k(@NotNull AbstractC6794a abstractC6794a, long j10, boolean z10) {
        StringBuilder sb2;
        String str;
        C9367f.m39526e(abstractC6794a, "task");
        abstractC6794a.m31314e(this);
        long mo31346c = this.f35430e.m31340g().mo31346c();
        long j11 = mo31346c + j10;
        int indexOf = this.f35428c.indexOf(abstractC6794a);
        if (indexOf != -1) {
            if (abstractC6794a.m31312c() <= j11) {
                if (!C6798e.f35434j.m31347a().isLoggable(Level.FINE)) {
                    return false;
                }
                C6795b.m31319c(abstractC6794a, this, "already scheduled");
                return false;
            }
            this.f35428c.remove(indexOf);
        }
        abstractC6794a.m31316g(j11);
        if (C6798e.f35434j.m31347a().isLoggable(Level.FINE)) {
            if (z10) {
                sb2 = new StringBuilder();
                str = "run again after ";
            } else {
                sb2 = new StringBuilder();
                str = "scheduled after ";
            }
            sb2.append(str);
            sb2.append(C6795b.m31318b(j11 - mo31346c));
            C6795b.m31319c(abstractC6794a, this, sb2.toString());
        }
        Iterator<AbstractC6794a> it = this.f35428c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().m31312c() - mo31346c > j10) {
                break;
            }
            i10++;
        }
        int i11 = i10;
        if (i10 == -1) {
            i11 = this.f35428c.size();
        }
        this.f35428c.add(i11, abstractC6794a);
        boolean z11 = false;
        if (i11 == 0) {
            z11 = true;
        }
        return z11;
    }

    /* renamed from: l */
    public final void m31331l(@Nullable AbstractC6794a abstractC6794a) {
        this.f35427b = abstractC6794a;
    }

    /* renamed from: m */
    public final void m31332m(boolean z10) {
        this.f35429d = z10;
    }

    /* renamed from: n */
    public final void m31333n() {
        if (!C5634b.f31711h || !Thread.holdsLock(this)) {
            synchronized (this.f35430e) {
                this.f35426a = true;
                if (m31322b()) {
                    this.f35430e.m31341h(this);
                }
                C5398q c5398q = C5398q.f30770a;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread = Thread.currentThread();
        C9367f.m39525d(currentThread, "Thread.currentThread()");
        sb2.append(currentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    @NotNull
    public String toString() {
        return this.f35431f;
    }
}
