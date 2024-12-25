package p232nd;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import md.C6561b;
import md.C6562c;
import md.InterfaceC6568i;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/b.class
 */
/* renamed from: nd.b */
/* loaded from: combined.jar:classes2.jar:nd/b.class */
public final class C6766b implements InterfaceC5570w {

    /* renamed from: b */
    public final C6562c f35248b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/b$a.class
     */
    /* renamed from: nd.b$a */
    /* loaded from: combined.jar:classes2.jar:nd/b$a.class */
    public static final class a<E> extends AbstractC5569v<Collection<E>> {

        /* renamed from: a */
        public final AbstractC5569v<E> f35249a;

        /* renamed from: b */
        public final InterfaceC6568i<? extends Collection<E>> f35250b;

        public a(C5552e c5552e, Type type, AbstractC5569v<E> abstractC5569v, InterfaceC6568i<? extends Collection<E>> interfaceC6568i) {
            this.f35249a = new C6777m(c5552e, abstractC5569v, type);
            this.f35250b = interfaceC6568i;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            Collection<E> mo30294a = this.f35250b.mo30294a();
            c8555a.mo31113f();
            while (c8555a.mo31118y()) {
                mo30294a.add(this.f35249a.mo27561b(c8555a));
            }
            c8555a.mo31115t();
            return mo30294a;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Collection<E> collection) {
            if (collection == null) {
                c8557c.mo31133v0();
                return;
            }
            c8557c.mo31128o();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f35249a.mo27562d(c8557c, it.next());
            }
            c8557c.mo31131t();
        }
    }

    public C6766b(C6562c c6562c) {
        this.f35248b = c6562c;
    }

    @Override // p188kd.InterfaceC5570w
    /* renamed from: a */
    public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
        Type m36352e = c8462a.m36352e();
        Class<? super T> m36351c = c8462a.m36351c();
        if (!Collection.class.isAssignableFrom(m36351c)) {
            return null;
        }
        Type m30276h = C6561b.m30276h(m36352e, m36351c);
        return new a(c5552e, m30276h, c5552e.m27550m(C8462a.m36349b(m30276h)), this.f35248b.m30290a(c8462a));
    }
}
