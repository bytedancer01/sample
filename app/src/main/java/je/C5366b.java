package je;

import ie.C5246b;
import ie.C5247c;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:je/b.class
 */
/* renamed from: je.b */
/* loaded from: combined.jar:classes2.jar:je/b.class */
public final class C5366b {

    /* renamed from: a */
    public final C5246b f30679a;

    /* renamed from: b */
    public final C5246b f30680b;

    /* renamed from: c */
    public final C5247c f30681c;

    public C5366b(C5246b c5246b, C5246b c5246b2, C5247c c5247c) {
        this.f30679a = c5246b;
        this.f30680b = c5246b2;
        this.f30681c = c5247c;
    }

    /* renamed from: a */
    public C5247c m26669a() {
        return this.f30681c;
    }

    /* renamed from: b */
    public C5246b m26670b() {
        return this.f30679a;
    }

    /* renamed from: c */
    public C5246b m26671c() {
        return this.f30680b;
    }

    /* renamed from: d */
    public boolean m26672d() {
        return this.f30680b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5366b)) {
            return false;
        }
        C5366b c5366b = (C5366b) obj;
        return Objects.equals(this.f30679a, c5366b.f30679a) && Objects.equals(this.f30680b, c5366b.f30680b) && Objects.equals(this.f30681c, c5366b.f30681c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f30679a) ^ Objects.hashCode(this.f30680b)) ^ Objects.hashCode(this.f30681c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f30679a);
        sb2.append(" , ");
        sb2.append(this.f30680b);
        sb2.append(" : ");
        C5247c c5247c = this.f30681c;
        sb2.append(c5247c == null ? "null" : Integer.valueOf(c5247c.m26176c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
