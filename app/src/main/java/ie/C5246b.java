package ie;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ie/b.class
 */
/* renamed from: ie.b */
/* loaded from: combined.jar:classes2.jar:ie/b.class */
public class C5246b {

    /* renamed from: a */
    public final int f29986a;

    /* renamed from: b */
    public final int f29987b;

    public C5246b(int i10, int i11) {
        this.f29986a = i10;
        this.f29987b = i11;
    }

    /* renamed from: a */
    public final int m26172a() {
        return this.f29987b;
    }

    /* renamed from: b */
    public final int m26173b() {
        return this.f29986a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5246b)) {
            return false;
        }
        C5246b c5246b = (C5246b) obj;
        return this.f29986a == c5246b.f29986a && this.f29987b == c5246b.f29987b;
    }

    public final int hashCode() {
        return this.f29986a ^ this.f29987b;
    }

    public final String toString() {
        return this.f29986a + "(" + this.f29987b + ')';
    }
}
