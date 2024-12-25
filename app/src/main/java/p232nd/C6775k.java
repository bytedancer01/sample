package p232nd;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.C6561b;
import md.C6562c;
import md.C6563d;
import md.C6570k;
import md.InterfaceC6568i;
import p188kd.AbstractC5569v;
import p188kd.C5552e;
import p188kd.C5565r;
import p188kd.InterfaceC5551d;
import p188kd.InterfaceC5570w;
import p201ld.InterfaceC5840b;
import p201ld.InterfaceC5841c;
import p273pd.AbstractC7702b;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:nd/k.class
 */
/* renamed from: nd.k */
/* loaded from: combined.jar:classes2.jar:nd/k.class */
public final class C6775k implements InterfaceC5570w {

    /* renamed from: b */
    public final C6562c f35282b;

    /* renamed from: c */
    public final InterfaceC5551d f35283c;

    /* renamed from: d */
    public final C6563d f35284d;

    /* renamed from: e */
    public final C6769e f35285e;

    /* renamed from: f */
    public final AbstractC7702b f35286f = AbstractC7702b.m33645a();

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/k$a.class
     */
    /* renamed from: nd.k$a */
    /* loaded from: combined.jar:classes2.jar:nd/k$a.class */
    public class a extends c {

        /* renamed from: d */
        public final Field f35287d;

        /* renamed from: e */
        public final boolean f35288e;

        /* renamed from: f */
        public final AbstractC5569v f35289f;

        /* renamed from: g */
        public final C5552e f35290g;

        /* renamed from: h */
        public final C8462a f35291h;

        /* renamed from: i */
        public final boolean f35292i;

        /* renamed from: j */
        public final C6775k f35293j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6775k c6775k, String str, boolean z10, boolean z11, Field field, boolean z12, AbstractC5569v abstractC5569v, C5552e c5552e, C8462a c8462a, boolean z13) {
            super(str, z10, z11);
            this.f35293j = c6775k;
            this.f35287d = field;
            this.f35288e = z12;
            this.f35289f = abstractC5569v;
            this.f35290g = c5552e;
            this.f35291h = c8462a;
            this.f35292i = z13;
        }

        @Override // p232nd.C6775k.c
        /* renamed from: a */
        public void mo31149a(C8555a c8555a, Object obj) {
            Object mo27561b = this.f35289f.mo27561b(c8555a);
            if (mo27561b == null && this.f35292i) {
                return;
            }
            this.f35287d.set(obj, mo27561b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [kd.v] */
        @Override // p232nd.C6775k.c
        /* renamed from: b */
        public void mo31150b(C8557c c8557c, Object obj) {
            (this.f35288e ? this.f35289f : new C6777m(this.f35290g, this.f35289f, this.f35291h.m36352e())).mo27562d(c8557c, this.f35287d.get(obj));
        }

        @Override // p232nd.C6775k.c
        /* renamed from: c */
        public boolean mo31151c(Object obj) {
            boolean z10 = false;
            if (!this.f35297b) {
                return false;
            }
            if (this.f35287d.get(obj) != obj) {
                z10 = true;
            }
            return z10;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/k$b.class
     */
    /* renamed from: nd.k$b */
    /* loaded from: combined.jar:classes2.jar:nd/k$b.class */
    public static final class b<T> extends AbstractC5569v<T> {

        /* renamed from: a */
        public final InterfaceC6568i<T> f35294a;

        /* renamed from: b */
        public final Map<String, c> f35295b;

        public b(InterfaceC6568i<T> interfaceC6568i, Map<String, c> map) {
            this.f35294a = interfaceC6568i;
            this.f35295b = map;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: b */
        public T mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() == EnumC8556b.NULL) {
                c8555a.mo31103F0();
                return null;
            }
            T mo30294a = this.f35294a.mo30294a();
            try {
                c8555a.mo31114l();
                while (c8555a.mo31118y()) {
                    c cVar = this.f35295b.get(c8555a.mo31102D0());
                    if (cVar != null && cVar.f35298c) {
                        cVar.mo31149a(c8555a, mo30294a);
                    }
                    c8555a.mo31106T0();
                }
                c8555a.mo31116v();
                return mo30294a;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new C5565r(e11);
            }
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: d */
        public void mo27562d(C8557c c8557c, T t10) {
            if (t10 == null) {
                c8557c.mo31133v0();
                return;
            }
            c8557c.mo31130p();
            try {
                for (c cVar : this.f35295b.values()) {
                    if (cVar.mo31151c(t10)) {
                        c8557c.mo31129o0(cVar.f35296a);
                        cVar.mo31150b(c8557c, t10);
                    }
                }
                c8557c.mo31132v();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:nd/k$c.class
     */
    /* renamed from: nd.k$c */
    /* loaded from: combined.jar:classes2.jar:nd/k$c.class */
    public static abstract class c {

        /* renamed from: a */
        public final String f35296a;

        /* renamed from: b */
        public final boolean f35297b;

        /* renamed from: c */
        public final boolean f35298c;

        public c(String str, boolean z10, boolean z11) {
            this.f35296a = str;
            this.f35297b = z10;
            this.f35298c = z11;
        }

        /* renamed from: a */
        public abstract void mo31149a(C8555a c8555a, Object obj);

        /* renamed from: b */
        public abstract void mo31150b(C8557c c8557c, Object obj);

        /* renamed from: c */
        public abstract boolean mo31151c(Object obj);
    }

    public C6775k(C6562c c6562c, InterfaceC5551d interfaceC5551d, C6563d c6563d, C6769e c6769e) {
        this.f35282b = c6562c;
        this.f35283c = interfaceC5551d;
        this.f35284d = c6563d;
        this.f35285e = c6769e;
    }

    /* renamed from: d */
    public static boolean m31144d(Field field, boolean z10, C6563d c6563d) {
        return (c6563d.m30296c(field.getType(), z10) || c6563d.m30299g(field, z10)) ? false : true;
    }

    @Override // p188kd.InterfaceC5570w
    /* renamed from: a */
    public <T> AbstractC5569v<T> mo27598a(C5552e c5552e, C8462a<T> c8462a) {
        Class<? super T> m36351c = c8462a.m36351c();
        if (Object.class.isAssignableFrom(m36351c)) {
            return new b(this.f35282b.m30290a(c8462a), m31147e(c5552e, c8462a, m36351c));
        }
        return null;
    }

    /* renamed from: b */
    public final c m31145b(C5552e c5552e, Field field, String str, C8462a<?> c8462a, boolean z10, boolean z11) {
        boolean m30332a = C6570k.m30332a(c8462a.m36351c());
        InterfaceC5840b interfaceC5840b = (InterfaceC5840b) field.getAnnotation(InterfaceC5840b.class);
        AbstractC5569v<?> m31097b = interfaceC5840b != null ? this.f35285e.m31097b(this.f35282b, c5552e, c8462a, interfaceC5840b) : null;
        boolean z12 = m31097b != null;
        AbstractC5569v<?> abstractC5569v = m31097b;
        if (m31097b == null) {
            abstractC5569v = c5552e.m27550m(c8462a);
        }
        return new a(this, str, z10, z11, field, z12, abstractC5569v, c5552e, c8462a, m30332a);
    }

    /* renamed from: c */
    public boolean m31146c(Field field, boolean z10) {
        return m31144d(field, z10, this.f35284d);
    }

    /* renamed from: e */
    public final Map<String, c> m31147e(C5552e c5552e, C8462a<?> c8462a, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type m36352e = c8462a.m36352e();
        C8462a<?> c8462a2 = c8462a;
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                boolean m31146c = m31146c(field, true);
                boolean m31146c2 = m31146c(field, false);
                if (m31146c || m31146c2) {
                    this.f35286f.mo33644b(field);
                    Type m30284p = C6561b.m30284p(c8462a2.m36352e(), cls, field.getGenericType());
                    List<String> m31148f = m31148f(field);
                    int size = m31148f.size();
                    c cVar = null;
                    for (int i10 = 0; i10 < size; i10++) {
                        String str = m31148f.get(i10);
                        if (i10 != 0) {
                            m31146c = false;
                        }
                        c cVar2 = (c) linkedHashMap.put(str, m31145b(c5552e, field, str, C8462a.m36349b(m30284p), m31146c, m31146c2));
                        if (cVar == null) {
                            cVar = cVar2;
                        }
                    }
                    if (cVar != null) {
                        throw new IllegalArgumentException(m36352e + " declares multiple JSON fields named " + cVar.f35296a);
                    }
                }
            }
            c8462a2 = C8462a.m36349b(C6561b.m30284p(c8462a2.m36352e(), cls, cls.getGenericSuperclass()));
            cls = c8462a2.m36351c();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    public final List<String> m31148f(Field field) {
        InterfaceC5841c interfaceC5841c = (InterfaceC5841c) field.getAnnotation(InterfaceC5841c.class);
        if (interfaceC5841c == null) {
            return Collections.singletonList(this.f35283c.translateName(field));
        }
        String value = interfaceC5841c.value();
        String[] alternate = interfaceC5841c.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }
}
