package p285q9;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:q9/c.class
 */
/* renamed from: q9.c */
/* loaded from: combined.jar:classes2.jar:q9/c.class */
public final class C7852c {

    /* renamed from: a */
    public final int f37918a;

    /* renamed from: b */
    public final int f37919b;

    /* renamed from: c */
    public final boolean f37920c;

    public C7852c(int i10, int i11, boolean z10) {
        this.f37918a = i10;
        this.f37919b = i11;
        this.f37920c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7852c) && this.f37918a == ((C7852c) obj).f37918a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.f37918a).hashCode();
    }
}
