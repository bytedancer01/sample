package je;

import java.util.ArrayList;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:je/c.class
 */
/* renamed from: je.c */
/* loaded from: combined.jar:classes2.jar:je/c.class */
public final class C5367c {

    /* renamed from: a */
    public final List<C5366b> f30682a;

    /* renamed from: b */
    public final int f30683b;

    /* renamed from: c */
    public final boolean f30684c;

    public C5367c(List<C5366b> list, int i10, boolean z10) {
        this.f30682a = new ArrayList(list);
        this.f30683b = i10;
        this.f30684c = z10;
    }

    /* renamed from: a */
    public List<C5366b> m26673a() {
        return this.f30682a;
    }

    /* renamed from: b */
    public int m26674b() {
        return this.f30683b;
    }

    /* renamed from: c */
    public boolean m26675c(List<C5366b> list) {
        return this.f30682a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5367c)) {
            return false;
        }
        C5367c c5367c = (C5367c) obj;
        return this.f30682a.equals(c5367c.f30682a) && this.f30684c == c5367c.f30684c;
    }

    public int hashCode() {
        return this.f30682a.hashCode() ^ Boolean.valueOf(this.f30684c).hashCode();
    }

    public String toString() {
        return "{ " + this.f30682a + " }";
    }
}
