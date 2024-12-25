package p024b6;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:b6/d.class
 */
/* renamed from: b6.d */
/* loaded from: combined.jar:classes1.jar:b6/d.class */
public final class C0806d extends AbstractC0812j {

    /* renamed from: a */
    public final List<AbstractC0815m> f5641a;

    public C0806d(List<AbstractC0815m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f5641a = list;
    }

    @Override // p024b6.AbstractC0812j
    /* renamed from: c */
    public List<AbstractC0815m> mo5167c() {
        return this.f5641a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0812j) {
            return this.f5641a.equals(((AbstractC0812j) obj).mo5167c());
        }
        return false;
    }

    public int hashCode() {
        return this.f5641a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f5641a + "}";
    }
}
