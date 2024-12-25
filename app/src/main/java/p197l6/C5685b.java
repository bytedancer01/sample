package p197l6;

import p036c6.AbstractC0998i;
import p036c6.AbstractC1004o;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l6/b.class
 */
/* renamed from: l6.b */
/* loaded from: combined.jar:classes1.jar:l6/b.class */
public final class C5685b extends AbstractC5703k {

    /* renamed from: a */
    public final long f32028a;

    /* renamed from: b */
    public final AbstractC1004o f32029b;

    /* renamed from: c */
    public final AbstractC0998i f32030c;

    public C5685b(long j10, AbstractC1004o abstractC1004o, AbstractC0998i abstractC0998i) {
        this.f32028a = j10;
        if (abstractC1004o == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f32029b = abstractC1004o;
        if (abstractC0998i == null) {
            throw new NullPointerException("Null event");
        }
        this.f32030c = abstractC0998i;
    }

    @Override // p197l6.AbstractC5703k
    /* renamed from: b */
    public AbstractC0998i mo27953b() {
        return this.f32030c;
    }

    @Override // p197l6.AbstractC5703k
    /* renamed from: c */
    public long mo27954c() {
        return this.f32028a;
    }

    @Override // p197l6.AbstractC5703k
    /* renamed from: d */
    public AbstractC1004o mo27955d() {
        return this.f32029b;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5703k)) {
            return false;
        }
        AbstractC5703k abstractC5703k = (AbstractC5703k) obj;
        if (this.f32028a != abstractC5703k.mo27954c() || !this.f32029b.equals(abstractC5703k.mo27955d()) || !this.f32030c.equals(abstractC5703k.mo27953b())) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        long j10 = this.f32028a;
        int i10 = (int) (j10 ^ (j10 >>> 32));
        return this.f32030c.hashCode() ^ ((((i10 ^ 1000003) * 1000003) ^ this.f32029b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f32028a + ", transportContext=" + this.f32029b + ", event=" + this.f32030c + "}";
    }
}
