package p232nd;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import md.C6561b;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.InterfaceC5570w;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/a.class
 */
/* renamed from: nd.a */
/* loaded from: combined.jar:classes2.jar:nd/a.class */
public final class C6765a<E> extends AbstractC5569v<Object> {

    /* renamed from: c */
    public static final InterfaceC5570w f35245c = new a();

    /* renamed from: a */
    public final Class<E> f35246a;

    /* renamed from: b */
    public final AbstractC5569v<E> f35247b;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/a$a.class
     */
    /* renamed from: nd.a$a */
    /* loaded from: combined.jar:classes2.jar:nd/a$a.class */
    public class a implements InterfaceC5570w {
        @Override // p188kd.InterfaceC5570w
        /* renamed from: a */
        public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
            Type m36352e = c8462a.m36352e();
            if (!(m36352e instanceof GenericArrayType) && (!(m36352e instanceof Class) || !((Class) m36352e).isArray())) {
                return null;
            }
            Type m30275g = C6561b.m30275g(m36352e);
            return new C6765a(c5552e, c5552e.m27550m(C8462a.m36349b(m30275g)), C6561b.m30279k(m30275g));
        }
    }

    public C6765a(C5552e c5552e, AbstractC5569v<E> abstractC5569v, Class<E> cls) {
        this.f35247b = new C6777m(c5552e, abstractC5569v, cls);
        this.f35246a = cls;
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: b */
    public Object mo27561b(C8555a c8555a) {
        if (c8555a.mo31105J0() == EnumC8556b.NULL) {
            c8555a.mo31103F0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c8555a.mo31113f();
        while (c8555a.mo31118y()) {
            arrayList.add(this.f35247b.mo27561b(c8555a));
        }
        c8555a.mo31115t();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f35246a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // p188kd.AbstractC5569v
    /* renamed from: d */
    public void mo27562d(C8557c c8557c, Object obj) {
        if (obj == null) {
            c8557c.mo31133v0();
            return;
        }
        c8557c.mo31128o();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f35247b.mo27562d(c8557c, Array.get(obj, i10));
        }
        c8557c.mo31131t();
    }
}
