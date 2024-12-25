package p305ra;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/i4.class
 */
/* renamed from: ra.i4 */
/* loaded from: combined.jar:classes2.jar:ra/i4.class */
public final class C8184i4<T> implements Serializable, InterfaceC8139f4 {

    /* renamed from: b */
    @NullableDecl
    public final T f39117b;

    public C8184i4(@NullableDecl T t10) {
        this.f39117b = t10;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof C8184i4)) {
            return false;
        }
        T t10 = this.f39117b;
        T t11 = ((C8184i4) obj).f39117b;
        return t10 == t11 || t10.equals(t11);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39117b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f39117b);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 22);
        sb2.append("Suppliers.ofInstance(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // p305ra.InterfaceC8139f4
    public final T zza() {
        return this.f39117b;
    }
}
