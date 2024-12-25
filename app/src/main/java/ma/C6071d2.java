package ma;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/d2.class
 */
/* renamed from: ma.d2 */
/* loaded from: combined.jar:classes2.jar:ma/d2.class */
public final class C6071d2 extends AbstractC6507y1 {

    /* renamed from: b */
    public final Object f33726b;

    public C6071d2(Object obj) {
        this.f33726b = obj;
    }

    @Override // ma.AbstractC6507y1
    /* renamed from: a */
    public final Object mo29540a() {
        return this.f33726b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6071d2) {
            return this.f33726b.equals(((C6071d2) obj).f33726b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33726b.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f33726b.toString() + ")";
    }
}
