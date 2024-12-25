package ma;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/le.class
 */
/* renamed from: ma.le */
/* loaded from: combined.jar:classes2.jar:ma/le.class */
public abstract class AbstractFutureC6251le extends AbstractC6155h2 implements Future {
    /* renamed from: e */
    public abstract Future mo29833e();

    @Override // java.util.concurrent.Future
    public final Object get() {
        return mo29833e().get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return mo29833e().get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo29833e().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo29833e().isDone();
    }
}
