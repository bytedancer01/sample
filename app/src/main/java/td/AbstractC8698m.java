package td;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:td/m.class
 */
/* renamed from: td.m */
/* loaded from: combined.jar:classes2.jar:td/m.class */
public abstract class AbstractC8698m extends Exception {

    /* renamed from: b */
    public static final boolean f40476b;

    /* renamed from: c */
    public static final StackTraceElement[] f40477c;

    static {
        f40476b = System.getProperty("surefire.test.class.path") != null;
        f40477c = new StackTraceElement[0];
    }

    public AbstractC8698m() {
    }

    public AbstractC8698m(Throwable th2) {
        super(th2);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }
}
