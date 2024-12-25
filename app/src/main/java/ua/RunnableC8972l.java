package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/l.class
 */
/* renamed from: ua.l */
/* loaded from: combined.jar:classes2.jar:ua/l.class */
public final class RunnableC8972l implements Runnable {

    /* renamed from: b */
    public final InterfaceC9130y5 f41273b;

    /* renamed from: c */
    public final AbstractC8984m f41274c;

    public RunnableC8972l(AbstractC8984m abstractC8984m, InterfaceC9130y5 interfaceC9130y5) {
        this.f41274c = abstractC8984m;
        this.f41273b = interfaceC9130y5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f41273b.mo37783f();
        if (C9079ta.m38242a()) {
            this.f41273b.mo37782e().m38436r(this);
            return;
        }
        boolean m38122c = this.f41274c.m38122c();
        AbstractC8984m.m38120e(this.f41274c, 0L);
        if (m38122c) {
            this.f41274c.mo37809a();
        }
    }
}
