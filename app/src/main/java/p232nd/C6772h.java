package p232nd;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import md.AbstractC6565f;
import md.C6561b;
import md.C6562c;
import md.C6571l;
import md.InterfaceC6568i;
import p188kd.AbstractC5557j;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.C5562o;
import p188kd.C5565r;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/h.class
 */
/* renamed from: nd.h */
/* loaded from: combined.jar:classes2.jar:nd/h.class */
public final class C6772h implements InterfaceC5570w {

    /* renamed from: b */
    public final C6562c f35267b;

    /* renamed from: c */
    public final boolean f35268c;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/h$a.class
     */
    /* renamed from: nd.h$a */
    /* loaded from: combined.jar:classes2.jar:nd/h$a.class */
    public final class a<K, V> extends AbstractC5569v<Map<K, V>> {

        /* renamed from: a */
        public final AbstractC5569v<K> f35269a;

        /* renamed from: b */
        public final AbstractC5569v<V> f35270b;

        /* renamed from: c */
        public final InterfaceC6568i<? extends Map<K, V>> f35271c;

        /* renamed from: d */
        public final C6772h f35272d;

        public a(C6772h c6772h, C5552e c5552e, Type type, AbstractC5569v<K> abstractC5569v, Type type2, AbstractC5569v<V> abstractC5569v2, InterfaceC6568i<? extends Map<K, V>> interfaceC6568i) {
            this.f35272d = c6772h;
            this.f35269a = new C6777m(c5552e, abstractC5569v, type);
            this.f35270b = new C6777m(c5552e, abstractC5569v2, type2);
            this.f35271c = interfaceC6568i;
        }

        /* renamed from: e */
        public final String m31135e(AbstractC5557j abstractC5557j) {
            if (!abstractC5557j.m27583w()) {
                if (abstractC5557j.m27581t()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C5562o m27579g = abstractC5557j.m27579g();
            if (m27579g.m27592G()) {
                return String.valueOf(m27579g.m27590D());
            }
            if (m27579g.m27591E()) {
                return Boolean.toString(m27579g.m27594x());
            }
            if (m27579g.m27593H()) {
                return m27579g.mo27575i();
            }
            throw new AssertionError();
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> mo27561b(C8555a c8555a) {
            EnumC8556b mo31105J0 = c8555a.mo31105J0();
            if (mo31105J0 == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            Map<K, V> mo30294a = this.f35271c.mo30294a();
            if (mo31105J0 == EnumC8556b.BEGIN_ARRAY) {
                c8555a.mo31113f();
                while (c8555a.mo31118y()) {
                    c8555a.mo31113f();
                    K mo27561b = this.f35269a.mo27561b(c8555a);
                    if (mo30294a.put(mo27561b, this.f35270b.mo27561b(c8555a)) != null) {
                        throw new C5565r("duplicate key: " + mo27561b);
                    }
                    c8555a.mo31115t();
                }
                c8555a.mo31115t();
            } else {
                c8555a.mo31114l();
                while (c8555a.mo31118y()) {
                    AbstractC6565f.f34366a.mo30313a(c8555a);
                    K mo27561b2 = this.f35269a.mo27561b(c8555a);
                    if (mo30294a.put(mo27561b2, this.f35270b.mo27561b(c8555a)) != null) {
                        throw new C5565r("duplicate key: " + mo27561b2);
                    }
                }
                c8555a.mo31116v();
            }
            return mo30294a;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Map<K, V> map) {
            boolean z10;
            if (map == null) {
                c8557c.mo31133v0();
                return;
            }
            if (!this.f35272d.f35268c) {
                c8557c.mo31130p();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c8557c.mo31129o0(String.valueOf(entry.getKey()));
                    this.f35270b.mo27562d(c8557c, entry.getValue());
                }
                c8557c.mo31132v();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z11 = false;
            while (true) {
                z10 = z11;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                AbstractC5557j m27597c = this.f35269a.m27597c(next.getKey());
                arrayList.add(m27597c);
                arrayList2.add(next.getValue());
                z11 = z10 | (m27597c.m27580q() || m27597c.m27582v());
            }
            if (!z10) {
                c8557c.mo31130p();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c8557c.mo31129o0(m31135e((AbstractC5557j) arrayList.get(i10)));
                    this.f35270b.mo27562d(c8557c, arrayList2.get(i10));
                }
                c8557c.mo31132v();
                return;
            }
            c8557c.mo31128o();
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c8557c.mo31128o();
                C6571l.m30335b((AbstractC5557j) arrayList.get(i11), c8557c);
                this.f35270b.mo27562d(c8557c, arrayList2.get(i11));
                c8557c.mo31131t();
            }
            c8557c.mo31131t();
        }
    }

    public C6772h(C6562c c6562c, boolean z10) {
        this.f35267b = c6562c;
        this.f35268c = z10;
    }

    @Override // p188kd.InterfaceC5570w
    /* renamed from: a */
    public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
        Type m36352e = c8462a.m36352e();
        if (!Map.class.isAssignableFrom(c8462a.m36351c())) {
            return null;
        }
        Type[] m30278j = C6561b.m30278j(m36352e, C6561b.m30279k(m36352e));
        return new a(this, c5552e, m30278j[0], m31134b(c5552e, m30278j[0]), m30278j[1], c5552e.m27550m(C8462a.m36349b(m30278j[1])), this.f35267b.m30290a(c8462a));
    }

    /* renamed from: b */
    public final AbstractC5569v<?> m31134b(C5552e c5552e, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C6778n.f35338f : c5552e.m27550m(C8462a.m36349b(type));
    }
}
