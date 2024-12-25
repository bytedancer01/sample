package p072e3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p033c3.AbstractC0984d;
import p033c3.C0986f;
import p053d3.C4301a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/f.class
 */
/* renamed from: e3.f */
/* loaded from: combined.jar:classes1.jar:e3/f.class */
public abstract class AbstractC4600f {

    /* renamed from: a */
    public AbstractC0984d<AbstractC4600f> f27253a = AbstractC0984d.m5887a();

    /* renamed from: a */
    public final AbstractC4600f m23190a(AbstractC4600f abstractC4600f) {
        C0986f.m5892c(abstractC4600f, "cache == null");
        AbstractC4600f abstractC4600f2 = this;
        while (true) {
            AbstractC4600f abstractC4600f3 = abstractC4600f2;
            if (!abstractC4600f3.f27253a.mo5882f()) {
                abstractC4600f3.f27253a = AbstractC0984d.m5889h(abstractC4600f);
                return this;
            }
            abstractC4600f2 = abstractC4600f3.f27253a.mo5881e();
        }
    }

    /* renamed from: b */
    public abstract void mo23191b();

    /* renamed from: c */
    public abstract C4603i mo23192c(String str, C4301a c4301a);

    /* renamed from: d */
    public Collection<C4603i> m23193d(Collection<String> collection, C4301a c4301a) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            C4603i mo23192c = mo23192c(it.next(), c4301a);
            if (mo23192c != null) {
                arrayList.add(mo23192c);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public abstract Set<String> mo23194e(C4603i c4603i, C4301a c4301a);

    /* renamed from: f */
    public Set<String> m23195f(Collection<C4603i> collection, C4301a c4301a) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C4603i> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(mo23194e(it.next(), c4301a));
        }
        return linkedHashSet;
    }

    /* renamed from: g */
    public final AbstractC0984d<AbstractC4600f> m23196g() {
        return this.f27253a;
    }

    /* renamed from: h */
    public abstract boolean mo23197h(C4596b c4596b);
}
