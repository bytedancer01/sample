package p301r6;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:r6/y.class
 */
/* renamed from: r6.y */
/* loaded from: combined.jar:classes2.jar:r6/y.class */
public final class C8007y {

    /* renamed from: a */
    public final int f38769a;

    /* renamed from: b */
    public final float f38770b;

    public C8007y(int i10, float f10) {
        this.f38769a = i10;
        this.f38770b = f10;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8007y.class != obj.getClass()) {
            return false;
        }
        C8007y c8007y = (C8007y) obj;
        if (this.f38769a != c8007y.f38769a || Float.compare(c8007y.f38770b, this.f38770b) != 0) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((527 + this.f38769a) * 31) + Float.floatToIntBits(this.f38770b);
    }
}
