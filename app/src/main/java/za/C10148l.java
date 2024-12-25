package za;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:za/l.class
 */
/* renamed from: za.l */
/* loaded from: combined.jar:classes2.jar:za/l.class */
public final class C10148l {
    /* renamed from: a */
    public static <TResult> TResult m42583a(AbstractC10144i<TResult> abstractC10144i) {
        C9935o.m41848h();
        C9935o.m41851k(abstractC10144i, "Task must not be null");
        if (abstractC10144i.mo42566o()) {
            return (TResult) m42588f(abstractC10144i);
        }
        C10150n c10150n = new C10150n(null);
        m42589g(abstractC10144i, c10150n);
        c10150n.m42590a();
        return (TResult) m42588f(abstractC10144i);
    }

    /* renamed from: b */
    public static <TResult> TResult m42584b(AbstractC10144i<TResult> abstractC10144i, long j10, TimeUnit timeUnit) {
        C9935o.m41848h();
        C9935o.m41851k(abstractC10144i, "Task must not be null");
        C9935o.m41851k(timeUnit, "TimeUnit must not be null");
        if (abstractC10144i.mo42566o()) {
            return (TResult) m42588f(abstractC10144i);
        }
        C10150n c10150n = new C10150n(null);
        m42589g(abstractC10144i, c10150n);
        if (c10150n.m42591c(j10, timeUnit)) {
            return (TResult) m42588f(abstractC10144i);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> AbstractC10144i<TResult> m42585c(Executor executor, Callable<TResult> callable) {
        C9935o.m41851k(executor, "Executor must not be null");
        C9935o.m41851k(callable, "Callback must not be null");
        C10143h0 c10143h0 = new C10143h0();
        executor.execute(new RunnableC10145i0(c10143h0, callable));
        return c10143h0;
    }

    /* renamed from: d */
    public static <TResult> AbstractC10144i<TResult> m42586d(Exception exc) {
        C10143h0 c10143h0 = new C10143h0();
        c10143h0.m42569r(exc);
        return c10143h0;
    }

    /* renamed from: e */
    public static <TResult> AbstractC10144i<TResult> m42587e(TResult tresult) {
        C10143h0 c10143h0 = new C10143h0();
        c10143h0.m42570s(tresult);
        return c10143h0;
    }

    /* renamed from: f */
    public static <TResult> TResult m42588f(AbstractC10144i<TResult> abstractC10144i) {
        if (abstractC10144i.mo42567p()) {
            return abstractC10144i.mo42563l();
        }
        if (abstractC10144i.mo42565n()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC10144i.mo42562k());
    }

    /* renamed from: g */
    public static <T> void m42589g(AbstractC10144i<T> abstractC10144i, InterfaceC10151o<? super T> interfaceC10151o) {
        Executor executor = C10147k.f46573b;
        abstractC10144i.mo42557f(executor, interfaceC10151o);
        abstractC10144i.mo42555d(executor, interfaceC10151o);
        abstractC10144i.mo42552a(executor, interfaceC10151o);
    }
}
