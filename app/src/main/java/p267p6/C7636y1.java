package p267p6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/y1.class
 */
/* renamed from: p6.y1 */
/* loaded from: combined.jar:classes2.jar:p6/y1.class */
public final class C7636y1 {

    /* renamed from: b */
    public static final C7636y1 f37137b = new C7636y1(false);

    /* renamed from: a */
    public final boolean f37138a;

    public C7636y1(boolean z10) {
        this.f37138a = z10;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7636y1.class != obj.getClass()) {
            return false;
        }
        if (this.f37138a != ((C7636y1) obj).f37138a) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return !this.f37138a ? 1 : 0;
    }
}
