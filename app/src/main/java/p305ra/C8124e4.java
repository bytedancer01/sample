package p305ra;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/e4.class
 */
/* renamed from: ra.e4 */
/* loaded from: combined.jar:classes2.jar:ra/e4.class */
public final class C8124e4<T> extends AbstractC8109d4<T> {

    /* renamed from: b */
    public final T f39052b;

    public C8124e4(T t10) {
        this.f39052b = t10;
    }

    @Override // p305ra.AbstractC8109d4
    /* renamed from: a */
    public final boolean mo35033a() {
        return true;
    }

    @Override // p305ra.AbstractC8109d4
    /* renamed from: b */
    public final T mo35034b() {
        return this.f39052b;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C8124e4) {
            return this.f39052b.equals(((C8124e4) obj).f39052b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39052b.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f39052b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
