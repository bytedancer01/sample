package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/x5.class
 */
/* renamed from: ua.x5 */
/* loaded from: combined.jar:classes2.jar:ua/x5.class */
public abstract class AbstractC9119x5 extends C9108w5 {

    /* renamed from: b */
    public boolean f41748b;

    public AbstractC9119x5(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41723a.m37791o();
    }

    /* renamed from: i */
    public abstract boolean mo37851i();

    /* renamed from: j */
    public void mo37852j() {
    }

    /* renamed from: k */
    public final boolean m38334k() {
        return this.f41748b;
    }

    /* renamed from: l */
    public final void m38335l() {
        if (!m38334k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: m */
    public final void m38336m() {
        if (this.f41748b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo37851i()) {
            return;
        }
        this.f41723a.m37792p();
        this.f41748b = true;
    }

    /* renamed from: n */
    public final void m38337n() {
        if (this.f41748b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo37852j();
        this.f41723a.m37792p();
        this.f41748b = true;
    }
}
