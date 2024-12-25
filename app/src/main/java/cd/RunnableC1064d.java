package cd;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:cd/d.class
 */
/* renamed from: cd.d */
/* loaded from: combined.jar:classes2.jar:cd/d.class */
public final /* synthetic */ class RunnableC1064d implements Runnable {

    /* renamed from: b */
    public final C1066f f7078b;

    /* renamed from: c */
    public final boolean f7079c;

    public RunnableC1064d(C1066f c1066f, boolean z10) {
        this.f7078b = c1066f;
        this.f7079c = z10;
    }

    /* renamed from: a */
    public static Runnable m6278a(C1066f c1066f, boolean z10) {
        return new RunnableC1064d(c1066f, z10);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7078b.m6290f(this.f7079c);
    }
}
