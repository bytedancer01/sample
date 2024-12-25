package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/p9.class
 */
/* renamed from: ua.p9 */
/* loaded from: combined.jar:classes2.jar:ua/p9.class */
public abstract class AbstractC9030p9 extends C9018o9 {

    /* renamed from: c */
    public boolean f41550c;

    public AbstractC9030p9(C9123x9 c9123x9) {
        super(c9123x9);
        this.f41516b.m38394u();
    }

    /* renamed from: i */
    public final boolean m38182i() {
        return this.f41550c;
    }

    /* renamed from: j */
    public final void m38183j() {
        if (!m38182i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: k */
    public final void m38184k() {
        if (this.f41550c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo37812l();
        this.f41516b.m38395v();
        this.f41550c = true;
    }

    /* renamed from: l */
    public abstract boolean mo37812l();
}
