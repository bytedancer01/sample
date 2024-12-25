package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/j6.class
 */
/* renamed from: ua.j6 */
/* loaded from: combined.jar:classes2.jar:ua/j6.class */
public final class RunnableC8955j6 implements Runnable {

    /* renamed from: b */
    public final boolean f41216b;

    /* renamed from: c */
    public final C8908f7 f41217c;

    public RunnableC8955j6(C8908f7 c8908f7, boolean z10) {
        this.f41217c = c8908f7;
        this.f41216b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m37787k = this.f41217c.f41723a.m37787k();
        boolean m37786j = this.f41217c.f41723a.m37786j();
        this.f41217c.f41723a.m37785i(this.f41216b);
        if (m37786j == this.f41216b) {
            this.f41217c.f41723a.mo37780c().m38416w().m38327b("Default data collection state already set to", Boolean.valueOf(this.f41216b));
        }
        if (this.f41217c.f41723a.m37787k() == m37787k || this.f41217c.f41723a.m37787k() != this.f41217c.f41723a.m37786j()) {
            this.f41217c.f41723a.mo37780c().m38413t().m38328c("Default data collection is different than actual status", Boolean.valueOf(this.f41216b), Boolean.valueOf(m37787k));
        }
        this.f41217c.m37922M();
    }
}
