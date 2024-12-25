package cd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/e.class
 */
/* renamed from: cd.e */
/* loaded from: combined.jar:classes2.jar:cd/e.class */
public final /* synthetic */ class RunnableC1065e implements Runnable {

    /* renamed from: b */
    public final C1066f f7080b;

    /* renamed from: c */
    public final boolean f7081c;

    public RunnableC1065e(C1066f c1066f, boolean z10) {
        this.f7080b = c1066f;
        this.f7081c = z10;
    }

    /* renamed from: a */
    public static Runnable m6279a(C1066f c1066f, boolean z10) {
        return new RunnableC1065e(c1066f, z10);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7080b.m6289e(this.f7081c);
    }
}
