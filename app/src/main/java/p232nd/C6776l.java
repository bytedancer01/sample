package p232nd;

import md.C6571l;
import p188kd.AbstractC5557j;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.InterfaceC5555h;
import p188kd.InterfaceC5556i;
import p188kd.InterfaceC5563p;
import p188kd.InterfaceC5564q;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/l.class
 */
/* renamed from: nd.l */
/* loaded from: combined.jar:classes2.jar:nd/l.class */
public final class C6776l<T> extends AbstractC5569v<T> {

    /* renamed from: a */
    public final InterfaceC5564q<T> f35299a;

    /* renamed from: b */
    public final InterfaceC5556i<T> f35300b;

    /* renamed from: c */
    public final C5552e f35301c;

    /* renamed from: d */
    public final C8462a<T> f35302d;

    /* renamed from: e */
    public final InterfaceC5570w f35303e;

    /* renamed from: f */
    public final C6776l<T>.b f35304f = new b();

    /* renamed from: g */
    public AbstractC5569v<T> f35305g;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/l$b.class
     */
    /* renamed from: nd.l$b */
    /* loaded from: combined.jar:classes2.jar:nd/l$b.class */
    public final class b implements InterfaceC5563p, InterfaceC5555h {

        /* renamed from: a */
        public final C6776l f35306a;

        public b(C6776l c6776l) {
            this.f35306a = c6776l;
        }
    }

    public C6776l(InterfaceC5564q<T> interfaceC5564q, InterfaceC5556i<T> interfaceC5556i, C5552e c5552e, C8462a<T> c8462a, InterfaceC5570w interfaceC5570w) {
        this.f35299a = interfaceC5564q;
        this.f35300b = interfaceC5556i;
        this.f35301c = c5552e;
        this.f35302d = c8462a;
        this.f35303e = interfaceC5570w;
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: b */
    public T mo27561b(C8555a c8555a) {
        if (this.f35300b == null) {
            return m31152e().mo27561b(c8555a);
        }
        AbstractC5557j m30334a = C6571l.m30334a(c8555a);
        if (m30334a.m27581t()) {
            return null;
        }
        return this.f35300b.deserialize(m30334a, this.f35302d.m36352e(), this.f35304f);
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: d */
    public void mo27562d(C8557c c8557c, T t10) {
        InterfaceC5564q<T> interfaceC5564q = this.f35299a;
        if (interfaceC5564q == null) {
            m31152e().mo27562d(c8557c, t10);
        } else if (t10 == null) {
            c8557c.mo31133v0();
        } else {
            C6571l.m30335b(interfaceC5564q.serialize(t10, this.f35302d.m36352e(), this.f35304f), c8557c);
        }
    }

    /* renamed from: e */
    public final AbstractC5569v<T> m31152e() {
        AbstractC5569v<T> abstractC5569v = this.f35305g;
        if (abstractC5569v == null) {
            abstractC5569v = this.f35301c.m27551n(this.f35303e, this.f35302d);
            this.f35305g = abstractC5569v;
        }
        return abstractC5569v;
    }
}
