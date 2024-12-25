package p188kd;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import md.C6562c;
import md.C6563d;
import md.C6570k;
import md.C6571l;
import p232nd.C6765a;
import p232nd.C6766b;
import p232nd.C6767c;
import p232nd.C6769e;
import p232nd.C6772h;
import p232nd.C6773i;
import p232nd.C6774j;
import p232nd.C6775k;
import p232nd.C6778n;
import p288qd.C7909d;
import p308rd.C8462a;
import sd.C8555a;
import sd.C8557c;
import sd.C8558d;
import sd.EnumC8556b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:kd/e.class
 */
/* renamed from: kd.e */
/* loaded from: combined.jar:classes2.jar:kd/e.class */
public final class C5552e {

    /* renamed from: x */
    public static final C8462a<?> f31618x = C8462a.m36348a(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<C8462a<?>, f<?>>> f31619a;

    /* renamed from: b */
    public final Map<C8462a<?>, AbstractC5569v<?>> f31620b;

    /* renamed from: c */
    public final C6562c f31621c;

    /* renamed from: d */
    public final C6769e f31622d;

    /* renamed from: e */
    public final List<InterfaceC5570w> f31623e;

    /* renamed from: f */
    public final C6563d f31624f;

    /* renamed from: g */
    public final InterfaceC5551d f31625g;

    /* renamed from: h */
    public final Map<Type, InterfaceC5553f<?>> f31626h;

    /* renamed from: i */
    public final boolean f31627i;

    /* renamed from: j */
    public final boolean f31628j;

    /* renamed from: k */
    public final boolean f31629k;

    /* renamed from: l */
    public final boolean f31630l;

    /* renamed from: m */
    public final boolean f31631m;

    /* renamed from: n */
    public final boolean f31632n;

    /* renamed from: o */
    public final boolean f31633o;

    /* renamed from: p */
    public final String f31634p;

    /* renamed from: q */
    public final int f31635q;

    /* renamed from: r */
    public final int f31636r;

    /* renamed from: s */
    public final EnumC5566s f31637s;

    /* renamed from: t */
    public final List<InterfaceC5570w> f31638t;

    /* renamed from: u */
    public final List<InterfaceC5570w> f31639u;

    /* renamed from: v */
    public final InterfaceC5568u f31640v;

    /* renamed from: w */
    public final InterfaceC5568u f31641w;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/e$a.class
     */
    /* renamed from: kd.e$a */
    /* loaded from: combined.jar:classes2.jar:kd/e$a.class */
    public class a extends AbstractC5569v<Number> {

        /* renamed from: a */
        public final C5552e f31642a;

        public a(C5552e c5552e) {
            this.f31642a = c5552e;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return Double.valueOf(c8555a.mo31099A0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            if (number == null) {
                c8557c.mo31133v0();
            } else {
                C5552e.m27540d(number.doubleValue());
                c8557c.mo31122M0(number);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/e$b.class
     */
    /* renamed from: kd.e$b */
    /* loaded from: combined.jar:classes2.jar:kd/e$b.class */
    public class b extends AbstractC5569v<Number> {

        /* renamed from: a */
        public final C5552e f31643a;

        public b(C5552e c5552e) {
            this.f31643a = c5552e;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return Float.valueOf((float) c8555a.mo31099A0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            if (number == null) {
                c8557c.mo31133v0();
            } else {
                C5552e.m27540d(number.floatValue());
                c8557c.mo31122M0(number);
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/e$c.class
     */
    /* renamed from: kd.e$c */
    /* loaded from: combined.jar:classes2.jar:kd/e$c.class */
    public class c extends AbstractC5569v<Number> {
        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number mo27561b(C8555a c8555a) {
            if (c8555a.mo31105J0() != EnumC8556b.NULL) {
                return Long.valueOf(c8555a.mo31101C0());
            }
            c8555a.mo31103F0();
            return null;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, Number number) {
            if (number == null) {
                c8557c.mo31133v0();
            } else {
                c8557c.mo31123N0(number.toString());
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/e$d.class
     */
    /* renamed from: kd.e$d */
    /* loaded from: combined.jar:classes2.jar:kd/e$d.class */
    public class d extends AbstractC5569v<AtomicLong> {

        /* renamed from: a */
        public final AbstractC5569v f31644a;

        public d(AbstractC5569v abstractC5569v) {
            this.f31644a = abstractC5569v;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong mo27561b(C8555a c8555a) {
            return new AtomicLong(((Number) this.f31644a.mo27561b(c8555a)).longValue());
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, AtomicLong atomicLong) {
            this.f31644a.mo27562d(c8557c, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/e$e.class
     */
    /* renamed from: kd.e$e */
    /* loaded from: combined.jar:classes2.jar:kd/e$e.class */
    public class e extends AbstractC5569v<AtomicLongArray> {

        /* renamed from: a */
        public final AbstractC5569v f31645a;

        public e(AbstractC5569v abstractC5569v) {
            this.f31645a = abstractC5569v;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray mo27561b(C8555a c8555a) {
            ArrayList arrayList = new ArrayList();
            c8555a.mo31113f();
            while (c8555a.mo31118y()) {
                arrayList.add(Long.valueOf(((Number) this.f31645a.mo27561b(c8555a)).longValue()));
            }
            c8555a.mo31115t();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo27562d(C8557c c8557c, AtomicLongArray atomicLongArray) {
            c8557c.mo31128o();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f31645a.mo27562d(c8557c, Long.valueOf(atomicLongArray.get(i10)));
            }
            c8557c.mo31131t();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:kd/e$f.class
     */
    /* renamed from: kd.e$f */
    /* loaded from: combined.jar:classes2.jar:kd/e$f.class */
    public static class f<T> extends AbstractC5569v<T> {

        /* renamed from: a */
        public AbstractC5569v<T> f31646a;

        @Override // p188kd.AbstractC5569v
        /* renamed from: b */
        public T mo27561b(C8555a c8555a) {
            AbstractC5569v<T> abstractC5569v = this.f31646a;
            if (abstractC5569v != null) {
                return abstractC5569v.mo27561b(c8555a);
            }
            throw new IllegalStateException();
        }

        @Override // p188kd.AbstractC5569v
        /* renamed from: d */
        public void mo27562d(C8557c c8557c, T t10) {
            AbstractC5569v<T> abstractC5569v = this.f31646a;
            if (abstractC5569v == null) {
                throw new IllegalStateException();
            }
            abstractC5569v.mo27562d(c8557c, t10);
        }

        /* renamed from: e */
        public void m27573e(AbstractC5569v<T> abstractC5569v) {
            if (this.f31646a != null) {
                throw new AssertionError();
            }
            this.f31646a = abstractC5569v;
        }
    }

    public C5552e() {
        this(C6563d.f34352h, EnumC5550c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC5566s.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), EnumC5567t.DOUBLE, EnumC5567t.LAZILY_PARSED_NUMBER);
    }

    public C5552e(C6563d c6563d, InterfaceC5551d interfaceC5551d, Map<Type, InterfaceC5553f<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, EnumC5566s enumC5566s, String str, int i10, int i11, List<InterfaceC5570w> list, List<InterfaceC5570w> list2, List<InterfaceC5570w> list3, InterfaceC5568u interfaceC5568u, InterfaceC5568u interfaceC5568u2) {
        this.f31619a = new ThreadLocal<>();
        this.f31620b = new ConcurrentHashMap();
        this.f31624f = c6563d;
        this.f31625g = interfaceC5551d;
        this.f31626h = map;
        C6562c c6562c = new C6562c(map);
        this.f31621c = c6562c;
        this.f31627i = z10;
        this.f31628j = z11;
        this.f31629k = z12;
        this.f31630l = z13;
        this.f31631m = z14;
        this.f31632n = z15;
        this.f31633o = z16;
        this.f31637s = enumC5566s;
        this.f31634p = str;
        this.f31635q = i10;
        this.f31636r = i11;
        this.f31638t = list;
        this.f31639u = list2;
        this.f31640v = interfaceC5568u;
        this.f31641w = interfaceC5568u2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6778n.f35331V);
        arrayList.add(C6774j.m31142e(interfaceC5568u));
        arrayList.add(c6563d);
        arrayList.addAll(list3);
        arrayList.add(C6778n.f35311B);
        arrayList.add(C6778n.f35345m);
        arrayList.add(C6778n.f35339g);
        arrayList.add(C6778n.f35341i);
        arrayList.add(C6778n.f35343k);
        AbstractC5569v<Number> m27541o = m27541o(enumC5566s);
        arrayList.add(C6778n.m31154a(Long.TYPE, Long.class, m27541o));
        arrayList.add(C6778n.m31154a(Double.TYPE, Double.class, m27542e(z16)));
        arrayList.add(C6778n.m31154a(Float.TYPE, Float.class, m27543f(z16)));
        arrayList.add(C6773i.m31138e(interfaceC5568u2));
        arrayList.add(C6778n.f35347o);
        arrayList.add(C6778n.f35349q);
        arrayList.add(C6778n.m31155b(AtomicLong.class, m27538b(m27541o)));
        arrayList.add(C6778n.m31155b(AtomicLongArray.class, m27539c(m27541o)));
        arrayList.add(C6778n.f35351s);
        arrayList.add(C6778n.f35356x);
        arrayList.add(C6778n.f35313D);
        arrayList.add(C6778n.f35315F);
        arrayList.add(C6778n.m31155b(BigDecimal.class, C6778n.f35358z));
        arrayList.add(C6778n.m31155b(BigInteger.class, C6778n.f35310A));
        arrayList.add(C6778n.f35317H);
        arrayList.add(C6778n.f35319J);
        arrayList.add(C6778n.f35323N);
        arrayList.add(C6778n.f35325P);
        arrayList.add(C6778n.f35329T);
        arrayList.add(C6778n.f35321L);
        arrayList.add(C6778n.f35336d);
        arrayList.add(C6767c.f35251b);
        arrayList.add(C6778n.f35327R);
        if (C7909d.f38036a) {
            arrayList.add(C7909d.f38040e);
            arrayList.add(C7909d.f38039d);
            arrayList.add(C7909d.f38041f);
        }
        arrayList.add(C6765a.f35245c);
        arrayList.add(C6778n.f35334b);
        arrayList.add(new C6766b(c6562c));
        arrayList.add(new C6772h(c6562c, z11));
        C6769e c6769e = new C6769e(c6562c);
        this.f31622d = c6769e;
        arrayList.add(c6769e);
        arrayList.add(C6778n.f35332W);
        arrayList.add(new C6775k(c6562c, interfaceC5551d, c6563d, c6769e));
        this.f31623e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m27537a(Object obj, C8555a c8555a) {
        if (obj != null) {
            try {
                if (c8555a.mo31105J0() == EnumC8556b.END_DOCUMENT) {
                } else {
                    throw new C5558k("JSON document was not fully consumed.");
                }
            } catch (C8558d e10) {
                throw new C5565r(e10);
            } catch (IOException e11) {
                throw new C5558k(e11);
            }
        }
    }

    /* renamed from: b */
    public static AbstractC5569v<AtomicLong> m27538b(AbstractC5569v<Number> abstractC5569v) {
        return new d(abstractC5569v).m27596a();
    }

    /* renamed from: c */
    public static AbstractC5569v<AtomicLongArray> m27539c(AbstractC5569v<Number> abstractC5569v) {
        return new e(abstractC5569v).m27596a();
    }

    /* renamed from: d */
    public static void m27540d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: o */
    public static AbstractC5569v<Number> m27541o(EnumC5566s enumC5566s) {
        return enumC5566s == EnumC5566s.DEFAULT ? C6778n.f35352t : new c();
    }

    /* renamed from: e */
    public final AbstractC5569v<Number> m27542e(boolean z10) {
        return z10 ? C6778n.f35354v : new a(this);
    }

    /* renamed from: f */
    public final AbstractC5569v<Number> m27543f(boolean z10) {
        return z10 ? C6778n.f35353u : new b(this);
    }

    /* renamed from: g */
    public <T> T m27544g(Reader reader, Class<T> cls) {
        C8555a m27552p = m27552p(reader);
        Object m27548k = m27548k(m27552p, cls);
        m27537a(m27548k, m27552p);
        return (T) C6570k.m30333b(cls).cast(m27548k);
    }

    /* renamed from: h */
    public <T> T m27545h(Reader reader, Type type) {
        C8555a m27552p = m27552p(reader);
        T t10 = (T) m27548k(m27552p, type);
        m27537a(t10, m27552p);
        return t10;
    }

    /* renamed from: i */
    public <T> T m27546i(String str, Class<T> cls) {
        return (T) C6570k.m30333b(cls).cast(m27547j(str, cls));
    }

    /* renamed from: j */
    public <T> T m27547j(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) m27545h(new StringReader(str), type);
    }

    /* renamed from: k */
    public <T> T m27548k(C8555a c8555a, Type type) {
        boolean m36786B = c8555a.m36786B();
        boolean z10 = true;
        c8555a.m36794O0(true);
        try {
            try {
                try {
                    c8555a.mo31105J0();
                    z10 = false;
                    T mo27561b = m27550m(C8462a.m36349b(type)).mo27561b(c8555a);
                    c8555a.m36794O0(m36786B);
                    return mo27561b;
                } catch (IOException e10) {
                    throw new C5565r(e10);
                } catch (AssertionError e11) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                    assertionError.initCause(e11);
                    throw assertionError;
                }
            } catch (EOFException e12) {
                if (!z10) {
                    throw new C5565r(e12);
                }
                c8555a.m36794O0(m36786B);
                return null;
            } catch (IllegalStateException e13) {
                throw new C5565r(e13);
            }
        } catch (Throwable th2) {
            c8555a.m36794O0(m36786B);
            throw th2;
        }
    }

    /* renamed from: l */
    public <T> AbstractC5569v<T> m27549l(Class<T> cls) {
        return m27550m(C8462a.m36348a(cls));
    }

    /* renamed from: m */
    public <T> AbstractC5569v<T> m27550m(C8462a<T> c8462a) {
        AbstractC5569v<T> abstractC5569v = (AbstractC5569v) this.f31620b.get(c8462a == null ? f31618x : c8462a);
        if (abstractC5569v != null) {
            return abstractC5569v;
        }
        Map<C8462a<?>, f<?>> map = this.f31619a.get();
        boolean z10 = false;
        Map<C8462a<?>, f<?>> map2 = map;
        if (map == null) {
            map2 = new HashMap();
            this.f31619a.set(map2);
            z10 = true;
        }
        f<?> fVar = map2.get(c8462a);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map2.put(c8462a, fVar2);
            Iterator<InterfaceC5570w> it = this.f31623e.iterator();
            while (it.hasNext()) {
                AbstractC5569v<T> mo27598a = it.next().mo27598a(this, c8462a);
                if (mo27598a != null) {
                    fVar2.m27573e(mo27598a);
                    this.f31620b.put(c8462a, mo27598a);
                    map2.remove(c8462a);
                    if (z10) {
                        this.f31619a.remove();
                    }
                    return mo27598a;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + c8462a);
        } catch (Throwable th2) {
            map2.remove(c8462a);
            if (z10) {
                this.f31619a.remove();
            }
            throw th2;
        }
    }

    /* renamed from: n */
    public <T> AbstractC5569v<T> m27551n(InterfaceC5570w interfaceC5570w, C8462a<T> c8462a) {
        InterfaceC5570w interfaceC5570w2 = interfaceC5570w;
        if (!this.f31623e.contains(interfaceC5570w)) {
            interfaceC5570w2 = this.f31622d;
        }
        boolean z10 = false;
        for (InterfaceC5570w interfaceC5570w3 : this.f31623e) {
            if (z10) {
                AbstractC5569v<T> mo27598a = interfaceC5570w3.mo27598a(this, c8462a);
                if (mo27598a != null) {
                    return mo27598a;
                }
            } else if (interfaceC5570w3 == interfaceC5570w2) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c8462a);
    }

    /* renamed from: p */
    public C8555a m27552p(Reader reader) {
        C8555a c8555a = new C8555a(reader);
        c8555a.m36794O0(this.f31632n);
        return c8555a;
    }

    /* renamed from: q */
    public C8557c m27553q(Writer writer) {
        if (this.f31629k) {
            writer.write(")]}'\n");
        }
        C8557c c8557c = new C8557c(writer);
        if (this.f31631m) {
            c8557c.m36812F0("  ");
        }
        c8557c.m36814H0(this.f31627i);
        return c8557c;
    }

    /* renamed from: r */
    public String m27554r(Object obj) {
        return obj == null ? m27556t(C5559l.f31648b) : m27555s(obj, obj.getClass());
    }

    /* renamed from: s */
    public String m27555s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m27557u(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: t */
    public String m27556t(AbstractC5557j abstractC5557j) {
        StringWriter stringWriter = new StringWriter();
        m27559w(abstractC5557j, stringWriter);
        return stringWriter.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f31627i + ",factories:" + this.f31623e + ",instanceCreators:" + this.f31621c + "}";
    }

    /* renamed from: u */
    public void m27557u(Object obj, Type type, Appendable appendable) {
        try {
            m27558v(obj, type, m27553q(C6571l.m30336c(appendable)));
        } catch (IOException e10) {
            throw new C5558k(e10);
        }
    }

    /* renamed from: v */
    public void m27558v(Object obj, Type type, C8557c c8557c) {
        AbstractC5569v m27550m = m27550m(C8462a.m36349b(type));
        boolean m36807B = c8557c.m36807B();
        c8557c.m36813G0(true);
        boolean m36822y = c8557c.m36822y();
        c8557c.m36811E0(this.f31630l);
        boolean m36821w = c8557c.m36821w();
        c8557c.m36814H0(this.f31627i);
        try {
            try {
                m27550m.mo27562d(c8557c, obj);
                c8557c.m36813G0(m36807B);
                c8557c.m36811E0(m36822y);
                c8557c.m36814H0(m36821w);
            } catch (IOException e10) {
                throw new C5558k(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } catch (Throwable th2) {
            c8557c.m36813G0(m36807B);
            c8557c.m36811E0(m36822y);
            c8557c.m36814H0(m36821w);
            throw th2;
        }
    }

    /* renamed from: w */
    public void m27559w(AbstractC5557j abstractC5557j, Appendable appendable) {
        try {
            m27560x(abstractC5557j, m27553q(C6571l.m30336c(appendable)));
        } catch (IOException e10) {
            throw new C5558k(e10);
        }
    }

    /* renamed from: x */
    public void m27560x(AbstractC5557j abstractC5557j, C8557c c8557c) {
        boolean m36807B = c8557c.m36807B();
        c8557c.m36813G0(true);
        boolean m36822y = c8557c.m36822y();
        c8557c.m36811E0(this.f31630l);
        boolean m36821w = c8557c.m36821w();
        c8557c.m36814H0(this.f31627i);
        try {
            try {
                C6571l.m30335b(abstractC5557j, c8557c);
                c8557c.m36813G0(m36807B);
                c8557c.m36811E0(m36822y);
                c8557c.m36814H0(m36821w);
            } catch (IOException e10) {
                throw new C5558k(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } catch (Throwable th2) {
            c8557c.m36813G0(m36807B);
            c8557c.m36811E0(m36822y);
            c8557c.m36814H0(m36821w);
            throw th2;
        }
    }
}
