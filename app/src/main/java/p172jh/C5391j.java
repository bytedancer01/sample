package p172jh;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:jh/j.class
 */
/* renamed from: jh.j */
/* loaded from: combined.jar:classes2.jar:jh/j.class */
public final class C5391j<A, B> implements Serializable {

    /* renamed from: b */
    public final A f30762b;

    /* renamed from: c */
    public final B f30763c;

    public C5391j(A a10, B b10) {
        this.f30762b = a10;
        this.f30763c = b10;
    }

    /* renamed from: a */
    public final A m26737a() {
        return this.f30762b;
    }

    /* renamed from: b */
    public final B m26738b() {
        return this.f30763c;
    }

    /* renamed from: c */
    public final A m26739c() {
        return this.f30762b;
    }

    /* renamed from: d */
    public final B m26740d() {
        return this.f30763c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5391j)) {
            return false;
        }
        C5391j c5391j = (C5391j) obj;
        return C9367f.m39522a(this.f30762b, c5391j.f30762b) && C9367f.m39522a(this.f30763c, c5391j.f30763c);
    }

    public int hashCode() {
        A a10 = this.f30762b;
        int i10 = 0;
        int hashCode = a10 == null ? 0 : a10.hashCode();
        B b10 = this.f30763c;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return (hashCode * 31) + i10;
    }

    @NotNull
    public String toString() {
        return '(' + this.f30762b + ", " + this.f30763c + ')';
    }
}
