package ua;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/f4.class
 */
/* renamed from: ua.f4 */
/* loaded from: combined.jar:classes2.jar:ua/f4.class */
public abstract class AbstractC8905f4 extends C8892e3 {

    /* renamed from: b */
    public boolean f41058b;

    public AbstractC8905f4(C8870c5 c8870c5) {
        super(c8870c5);
        this.f41723a.m37791o();
    }

    /* renamed from: i */
    public final boolean m37904i() {
        return this.f41058b;
    }

    /* renamed from: j */
    public final void m37905j() {
        if (!m37904i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: k */
    public final void m37906k() {
        if (this.f41058b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo37908m()) {
            return;
        }
        this.f41723a.m37792p();
        this.f41058b = true;
    }

    /* renamed from: l */
    public final void m37907l() {
        if (this.f41058b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo37909n();
        this.f41723a.m37792p();
        this.f41058b = true;
    }

    /* renamed from: m */
    public abstract boolean mo37908m();

    /* renamed from: n */
    public void mo37909n() {
    }
}
