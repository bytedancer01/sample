package cd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/c.class
 */
/* renamed from: cd.c */
/* loaded from: combined.jar:classes2.jar:cd/c.class */
public final /* synthetic */ class RunnableC1063c implements Runnable {

    /* renamed from: b */
    public final C1066f f7077b;

    public RunnableC1063c(C1066f c1066f) {
        this.f7077b = c1066f;
    }

    /* renamed from: a */
    public static Runnable m6277a(C1066f c1066f) {
        return new RunnableC1063c(c1066f);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7077b.m6290f(false);
    }
}
