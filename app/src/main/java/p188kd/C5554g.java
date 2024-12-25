package p188kd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/g.class
 */
/* renamed from: kd.g */
/* loaded from: combined.jar:classes2.jar:kd/g.class */
public final class C5554g extends AbstractC5557j implements Iterable<AbstractC5557j> {

    /* renamed from: b */
    public final List<AbstractC5557j> f31647b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5554g) && ((C5554g) obj).f31647b.equals(this.f31647b));
    }

    public int hashCode() {
        return this.f31647b.hashCode();
    }

    @Override // p188kd.AbstractC5557j
    /* renamed from: i */
    public String mo27575i() {
        if (this.f31647b.size() == 1) {
            return this.f31647b.get(0).mo27575i();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC5557j> iterator() {
        return this.f31647b.iterator();
    }

    /* renamed from: x */
    public void m27576x(AbstractC5557j abstractC5557j) {
        AbstractC5557j abstractC5557j2 = abstractC5557j;
        if (abstractC5557j == null) {
            abstractC5557j2 = C5559l.f31648b;
        }
        this.f31647b.add(abstractC5557j2);
    }
}
