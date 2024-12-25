package p057d7;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d7/r.class
 */
/* renamed from: d7.r */
/* loaded from: combined.jar:classes2.jar:d7/r.class */
public final class C4335r {

    /* renamed from: c */
    public static final C4335r f26492c = new C4335r(0, 0);

    /* renamed from: a */
    public final long f26493a;

    /* renamed from: b */
    public final long f26494b;

    public C4335r(long j10, long j11) {
        this.f26493a = j10;
        this.f26494b = j11;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4335r.class != obj.getClass()) {
            return false;
        }
        C4335r c4335r = (C4335r) obj;
        if (this.f26493a != c4335r.f26493a || this.f26494b != c4335r.f26494b) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return (((int) this.f26493a) * 31) + ((int) this.f26494b);
    }

    public String toString() {
        return "[timeUs=" + this.f26493a + ", position=" + this.f26494b + "]";
    }
}
