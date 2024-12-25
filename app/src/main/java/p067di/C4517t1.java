package p067di;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:di/t1.class
 */
/* renamed from: di.t1 */
/* loaded from: combined.jar:classes2.jar:di/t1.class */
public final class C4517t1 {

    /* renamed from: a */
    @NotNull
    public static final C4517t1 f26935a = new C4517t1();

    /* renamed from: b */
    @NotNull
    public static final ThreadLocal<AbstractC4507q0> f26936b = new ThreadLocal<>();

    @NotNull
    /* renamed from: a */
    public final AbstractC4507q0 m22835a() {
        ThreadLocal<AbstractC4507q0> threadLocal = f26936b;
        AbstractC4507q0 abstractC4507q0 = threadLocal.get();
        AbstractC4507q0 abstractC4507q02 = abstractC4507q0;
        if (abstractC4507q0 == null) {
            abstractC4507q02 = C4516t0.m22834a();
            threadLocal.set(abstractC4507q02);
        }
        return abstractC4507q02;
    }

    /* renamed from: b */
    public final void m22836b() {
        f26936b.set(null);
    }

    /* renamed from: c */
    public final void m22837c(@NotNull AbstractC4507q0 abstractC4507q0) {
        f26936b.set(abstractC4507q0);
    }
}
