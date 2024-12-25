package p267p6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/v0.class
 */
/* renamed from: p6.v0 */
/* loaded from: combined.jar:classes2.jar:p6/v0.class */
public final class C7626v0 extends RuntimeException {

    /* renamed from: b */
    public final int f37066b;

    public C7626v0(int i10) {
        super(m33155a(i10));
        this.f37066b = i10;
    }

    /* renamed from: a */
    public static String m33155a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
