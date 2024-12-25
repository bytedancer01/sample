package p024b6;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/h.class
 */
/* renamed from: b6.h */
/* loaded from: combined.jar:classes1.jar:b6/h.class */
public final class C0810h extends AbstractC0816n {

    /* renamed from: a */
    public final long f5674a;

    public C0810h(long j10) {
        this.f5674a = j10;
    }

    @Override // p024b6.AbstractC0816n
    /* renamed from: c */
    public long mo5203c() {
        return this.f5674a;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0816n)) {
            return false;
        }
        if (this.f5674a != ((AbstractC0816n) obj).mo5203c()) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        long j10 = this.f5674a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f5674a + "}";
    }
}
