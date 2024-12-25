package p305ra;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/n4.class
 */
/* renamed from: ra.n4 */
/* loaded from: combined.jar:classes2.jar:ra/n4.class */
public final class C8259n4 extends AbstractC8214k4 {

    /* renamed from: a */
    public final C8244m4 f39206a = new C8244m4();

    @Override // p305ra.AbstractC8214k4
    /* renamed from: a */
    public final void mo35529a(Throwable th2, Throwable th3) {
        if (th3 == th2) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th3);
        }
        this.f39206a.m35604a(th2, true).add(th3);
    }
}
