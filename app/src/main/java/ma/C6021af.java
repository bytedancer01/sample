package ma;

import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/af.class
 */
/* renamed from: ma.af */
/* loaded from: combined.jar:classes2.jar:ma/af.class */
public final class C6021af extends AbstractRunnableC6419te {

    /* renamed from: d */
    public final Callable f33659d;

    /* renamed from: e */
    public final RunnableFutureC6042bf f33660e;

    public C6021af(RunnableFutureC6042bf runnableFutureC6042bf, Callable callable) {
        this.f33660e = runnableFutureC6042bf;
        callable.getClass();
        this.f33659d = callable;
    }

    @Override // ma.AbstractRunnableC6419te
    /* renamed from: a */
    public final Object mo29395a() {
        return this.f33659d.call();
    }

    @Override // ma.AbstractRunnableC6419te
    /* renamed from: b */
    public final String mo29396b() {
        return this.f33659d.toString();
    }

    @Override // ma.AbstractRunnableC6419te
    /* renamed from: c */
    public final void mo29397c(Throwable th2) {
        this.f33660e.m29505m(th2);
    }

    @Override // ma.AbstractRunnableC6419te
    /* renamed from: d */
    public final void mo29398d(Object obj) {
        this.f33660e.m29504l(obj);
    }

    @Override // ma.AbstractRunnableC6419te
    /* renamed from: f */
    public final boolean mo29399f() {
        return this.f33660e.isDone();
    }
}
