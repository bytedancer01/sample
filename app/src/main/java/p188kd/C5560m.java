package p188kd;

import java.util.Map;
import java.util.Set;
import md.C6567h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/m.class
 */
/* renamed from: kd.m */
/* loaded from: combined.jar:classes2.jar:kd/m.class */
public final class C5560m extends AbstractC5557j {

    /* renamed from: b */
    public final C6567h<String, AbstractC5557j> f31649b = new C6567h<>();

    /* renamed from: A */
    public Set<Map.Entry<String, AbstractC5557j>> m27584A() {
        return this.f31649b.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5560m) && ((C5560m) obj).f31649b.equals(this.f31649b));
    }

    public int hashCode() {
        return this.f31649b.hashCode();
    }

    /* renamed from: x */
    public void m27585x(String str, AbstractC5557j abstractC5557j) {
        C6567h<String, AbstractC5557j> c6567h = this.f31649b;
        AbstractC5557j abstractC5557j2 = abstractC5557j;
        if (abstractC5557j == null) {
            abstractC5557j2 = C5559l.f31648b;
        }
        c6567h.put(str, abstractC5557j2);
    }

    /* renamed from: y */
    public void m27586y(String str, String str2) {
        m27585x(str, str2 == null ? C5559l.f31648b : new C5562o(str2));
    }
}
