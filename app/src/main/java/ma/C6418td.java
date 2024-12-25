package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/td.class
 */
/* renamed from: ma.td */
/* loaded from: combined.jar:classes2.jar:ma/td.class */
public final class C6418td {

    /* renamed from: b */
    public static final C6418td f34067b = new C6418td(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    public final Throwable f34068a;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ma/td$a.class
     */
    /* renamed from: ma.td$a */
    /* loaded from: combined.jar:classes2.jar:ma/td$a.class */
    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            synchronized (this) {
            }
            return this;
        }
    }

    public C6418td(Throwable th2) {
        th2.getClass();
        this.f34068a = th2;
    }
}
