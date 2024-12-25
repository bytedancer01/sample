package ua;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/x4.class
 */
/* renamed from: ua.x4 */
/* loaded from: combined.jar:classes2.jar:ua/x4.class */
public final class C9118x4<V> extends FutureTask<V> implements Comparable<C9118x4<V>> {

    /* renamed from: b */
    public final long f41744b;

    /* renamed from: c */
    public final boolean f41745c;

    /* renamed from: d */
    public final String f41746d;

    /* renamed from: e */
    public final C9140z4 f41747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9118x4(C9140z4 c9140z4, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.f41747e = c9140z4;
        C9935o.m41850j(str);
        atomicLong = C9140z4.f41819l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f41744b = andIncrement;
        this.f41746d = str;
        this.f41745c = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c9140z4.f41723a.mo37780c().m38408o().m38326a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9118x4(C9140z4 c9140z4, Callable<V> callable, boolean z10, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.f41747e = c9140z4;
        C9935o.m41850j("Task exception on worker thread");
        atomicLong = C9140z4.f41819l;
        long andIncrement = atomicLong.getAndIncrement();
        this.f41744b = andIncrement;
        this.f41746d = "Task exception on worker thread";
        this.f41745c = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c9140z4.f41723a.mo37780c().m38408o().m38326a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C9118x4 c9118x4 = (C9118x4) obj;
        boolean z10 = this.f41745c;
        int i10 = 1;
        if (z10 == c9118x4.f41745c) {
            long j10 = this.f41744b;
            long j11 = c9118x4.f41744b;
            if (j10 < j11) {
                i10 = -1;
            } else if (j10 <= j11) {
                this.f41747e.f41723a.mo37780c().m38409p().m38327b("Two tasks share the same index. index", Long.valueOf(this.f41744b));
                return 0;
            }
        } else if (z10) {
            return -1;
        }
        return i10;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        this.f41747e.f41723a.mo37780c().m38408o().m38327b(this.f41746d, th2);
        super.setException(th2);
    }
}
