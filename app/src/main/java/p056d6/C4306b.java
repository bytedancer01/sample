package p056d6;

import p056d6.AbstractC4311g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:d6/b.class
 */
/* renamed from: d6.b */
/* loaded from: combined.jar:classes1.jar:d6/b.class */
public final class C4306b extends AbstractC4311g {

    /* renamed from: a */
    public final AbstractC4311g.a f26442a;

    /* renamed from: b */
    public final long f26443b;

    public C4306b(AbstractC4311g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f26442a = aVar;
        this.f26443b = j10;
    }

    @Override // p056d6.AbstractC4311g
    /* renamed from: b */
    public long mo21773b() {
        return this.f26443b;
    }

    @Override // p056d6.AbstractC4311g
    /* renamed from: c */
    public AbstractC4311g.a mo21774c() {
        return this.f26442a;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4311g)) {
            return false;
        }
        AbstractC4311g abstractC4311g = (AbstractC4311g) obj;
        if (!this.f26442a.equals(abstractC4311g.mo21774c()) || this.f26443b != abstractC4311g.mo21773b()) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        int hashCode = this.f26442a.hashCode();
        long j10 = this.f26443b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f26442a + ", nextRequestWaitMillis=" + this.f26443b + "}";
    }
}
