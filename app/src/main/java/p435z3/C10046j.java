package p435z3;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:z3/j.class
 */
/* renamed from: z3.j */
/* loaded from: combined.jar:classes1.jar:z3/j.class */
public class C10046j extends Exception {
    public C10046j(Error error) {
        super(error);
        if (error == null) {
            throw new NullPointerException("The causing error must not be null");
        }
    }

    @Override // java.lang.Throwable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Error getCause() {
        return (Error) super.getCause();
    }
}
