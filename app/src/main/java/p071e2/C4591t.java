package p071e2;

import androidx.work.C0757b;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e2/t.class
 */
/* renamed from: e2.t */
/* loaded from: combined.jar:classes1.jar:e2/t.class */
public final class C4591t {

    /* renamed from: a */
    public UUID f27229a;

    /* renamed from: b */
    public a f27230b;

    /* renamed from: c */
    public C0757b f27231c;

    /* renamed from: d */
    public Set<String> f27232d;

    /* renamed from: e */
    public C0757b f27233e;

    /* renamed from: f */
    public int f27234f;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e2/t$a.class
     */
    /* renamed from: e2.t$a */
    /* loaded from: combined.jar:classes1.jar:e2/t$a.class */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C4591t(UUID uuid, a aVar, C0757b c0757b, List<String> list, C0757b c0757b2, int i10) {
        this.f27229a = uuid;
        this.f27230b = aVar;
        this.f27231c = c0757b;
        this.f27232d = new HashSet(list);
        this.f27233e = c0757b2;
        this.f27234f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4591t.class != obj.getClass()) {
            return false;
        }
        C4591t c4591t = (C4591t) obj;
        if (this.f27234f == c4591t.f27234f && this.f27229a.equals(c4591t.f27229a) && this.f27230b == c4591t.f27230b && this.f27231c.equals(c4591t.f27231c) && this.f27232d.equals(c4591t.f27232d)) {
            return this.f27233e.equals(c4591t.f27233e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f27229a.hashCode() * 31) + this.f27230b.hashCode()) * 31) + this.f27231c.hashCode()) * 31) + this.f27232d.hashCode()) * 31) + this.f27233e.hashCode()) * 31) + this.f27234f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f27229a + "', mState=" + this.f27230b + ", mOutputData=" + this.f27231c + ", mTags=" + this.f27232d + ", mProgress=" + this.f27233e + '}';
    }
}
