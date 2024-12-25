package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/v.class
 */
/* renamed from: ra.v */
/* loaded from: combined.jar:classes2.jar:ra/v.class */
public abstract class AbstractRunnableC8374v implements Runnable {

    /* renamed from: b */
    public final long f39326b;

    /* renamed from: c */
    public final long f39327c;

    /* renamed from: d */
    public final boolean f39328d;

    /* renamed from: e */
    public final C8120e0 f39329e;

    public AbstractRunnableC8374v(C8120e0 c8120e0, boolean z10) {
        this.f39329e = c8120e0;
        this.f39326b = c8120e0.f39044b.mo22432a();
        this.f39327c = c8120e0.f39044b.mo22433b();
        this.f39328d = z10;
    }

    /* renamed from: a */
    public abstract void mo34987a();

    /* renamed from: b */
    public void mo35176b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        z10 = this.f39329e.f39049g;
        if (z10) {
            mo35176b();
            return;
        }
        try {
            mo34987a();
        } catch (Exception e10) {
            this.f39329e.m35245q(e10, false, this.f39328d);
            mo35176b();
        }
    }
}
