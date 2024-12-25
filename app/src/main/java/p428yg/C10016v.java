package p428yg;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p428yg.C10001g0;
import p428yg.C10014t;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:yg/v.class
 */
/* renamed from: yg.v */
/* loaded from: combined.jar:classes2.jar:yg/v.class */
public class C10016v extends ThreadPoolExecutor {

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:yg/v$a.class
     */
    /* renamed from: yg.v$a */
    /* loaded from: combined.jar:classes2.jar:yg/v$a.class */
    public static final class a extends FutureTask<RunnableC9992c> implements Comparable<a> {

        /* renamed from: b */
        public final RunnableC9992c f45923b;

        public a(RunnableC9992c runnableC9992c) {
            super(runnableC9992c, null);
            this.f45923b = runnableC9992c;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            C10014t.f m42019p = this.f45923b.m42019p();
            C10014t.f m42019p2 = aVar.f45923b.m42019p();
            return m42019p == m42019p2 ? this.f45923b.f45805b - aVar.f45923b.f45805b : m42019p2.ordinal() - m42019p.ordinal();
        }
    }

    public C10016v() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C10001g0.f());
    }

    /* renamed from: a */
    public void m42129a(NetworkInfo networkInfo) {
        int i10;
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            m42130b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                i10 = 4;
                m42130b(i10);
                return;
            }
            m42130b(3);
            return;
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                m42130b(1);
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                    default:
                        m42130b(3);
                        break;
                }
                m42130b(i10);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                i10 = 2;
                m42130b(i10);
                break;
        }
    }

    /* renamed from: b */
    public final void m42130b(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((RunnableC9992c) runnable);
        execute(aVar);
        return aVar;
    }
}
