package pa;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pa/l.class
 */
/* renamed from: pa.l */
/* loaded from: combined.jar:classes2.jar:pa/l.class */
public final class C7693l extends AbstractC7690i {

    /* renamed from: a */
    public final C7692k f37435a = new C7692k();

    @Override // pa.AbstractC7690i
    /* renamed from: a */
    public final void mo33630a(Throwable th2, Throwable th3) {
        if (th3 == th2) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th3);
        }
        this.f37435a.m33631a(th2, true).add(th3);
    }
}
