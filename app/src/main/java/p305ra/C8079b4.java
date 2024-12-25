package p305ra;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b4.class
 */
/* renamed from: ra.b4 */
/* loaded from: combined.jar:classes2.jar:ra/b4.class */
public final class C8079b4<T> extends AbstractC8109d4<T> {

    /* renamed from: b */
    public static final C8079b4<Object> f38944b = new C8079b4<>();

    @Override // p305ra.AbstractC8109d4
    /* renamed from: a */
    public final boolean mo35033a() {
        return false;
    }

    @Override // p305ra.AbstractC8109d4
    /* renamed from: b */
    public final T mo35034b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
