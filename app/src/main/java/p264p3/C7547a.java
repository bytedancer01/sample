package p264p3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p004a3.C0047a;
import p004a3.C0053g;
import p004a3.InterfaceC0050d;
import p004a3.InterfaceC0050d.a;
import p004a3.InterfaceC0055i;
import p178k3.AbstractC5469h;
import p210m3.C5921c;
import p238o3.C6884a;
import p238o3.C6885b;
import p238o3.C6891h;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:p3/a.class
 */
/* renamed from: p3.a */
/* loaded from: combined.jar:classes1.jar:p3/a.class */
public class C7547a<D extends InterfaceC0050d.a, W> {

    /* renamed from: a */
    public final InterfaceC0050d<D, W, ?> f36414a;

    /* renamed from: b */
    public final InterfaceC0055i f36415b;

    /* renamed from: c */
    public final C7550d f36416c;

    /* renamed from: d */
    public final AbstractC5469h<Map<String, Object>> f36417d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/a$a.class
     */
    /* renamed from: p3.a$a */
    /* loaded from: combined.jar:classes1.jar:p3/a$a.class */
    public class a implements C6891h.d<Object> {

        /* renamed from: a */
        public final C7547a f36418a;

        public a(C7547a c7547a) {
            this.f36418a = c7547a;
        }

        @Override // p238o3.C6891h.d
        /* renamed from: a */
        public Object mo31795a(C6891h c6891h) {
            Map<String, Object> m31794u = c6891h.m31794u();
            this.f36418a.f36414a.m208e();
            return this.f36418a.f36415b.m226a(new C7548b(null, m31794u, new C5921c(), this.f36418a.f36416c, this.f36418a.f36417d));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:p3/a$b.class
     */
    /* renamed from: p3.a$b */
    /* loaded from: combined.jar:classes1.jar:p3/a$b.class */
    public class b implements C6891h.c<C0047a> {

        /* renamed from: a */
        public final C7547a f36419a;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:p3/a$b$a.class
         */
        /* renamed from: p3.a$b$a */
        /* loaded from: combined.jar:classes1.jar:p3/a$b$a.class */
        public class a implements C6891h.d<C0047a> {

            /* renamed from: a */
            public final b f36420a;

            public a(b bVar) {
                this.f36420a = bVar;
            }

            @Override // p238o3.C6891h.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0047a mo31795a(C6891h c6891h) {
                return this.f36420a.f36419a.m32309g(c6891h.m31794u());
            }
        }

        public b(C7547a c7547a) {
            this.f36419a = c7547a;
        }

        @Override // p238o3.C6891h.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0047a mo31797a(C6891h c6891h) {
            return (C0047a) c6891h.m31789o(true, new a(this));
        }
    }

    public C7547a(InterfaceC0050d<D, W, ?> interfaceC0050d, InterfaceC0055i interfaceC0055i, C7550d c7550d, AbstractC5469h<Map<String, Object>> abstractC5469h) {
        this.f36414a = interfaceC0050d;
        this.f36415b = interfaceC0055i;
        this.f36416c = c7550d;
        this.f36417d = abstractC5469h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [a3.d$a] */
    /* renamed from: f */
    public C0053g<W> m32308f(InterfaceC9763g interfaceC9763g) {
        C6885b c6885b;
        this.f36417d.mo27274f(this.f36414a);
        C6885b c6885b2 = null;
        try {
            c6885b = new C6885b(interfaceC9763g);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            c6885b.mo31741l();
            C6891h m31726c = C6884a.m31726c(c6885b);
            List<C0047a> list = null;
            D d10 = null;
            while (m31726c.m31780f()) {
                String m31788n = m31726c.m31788n();
                if ("data".equals(m31788n)) {
                    d10 = (InterfaceC0050d.a) m31726c.m31789o(true, new a(this));
                } else if ("errors".equals(m31788n)) {
                    list = m32311i(m31726c);
                } else {
                    m31726c.m31793t();
                }
            }
            c6885b.mo31744p();
            C0053g<W> m221f = C0053g.m210a(this.f36414a).m222g(this.f36414a.m206c(d10)).m224i(list).m223h(this.f36417d.mo27270b()).m221f();
            c6885b.close();
            return m221f;
        } catch (Throwable th3) {
            th = th3;
            c6885b2 = c6885b;
            if (c6885b2 != null) {
                c6885b2.close();
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final C0047a m32309g(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        while (true) {
            String str = null;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if ("message".equals(entry.getKey())) {
                    Object value = entry.getValue();
                    if (value != null) {
                        str = value.toString();
                    }
                } else if ("locations".equals(entry.getKey())) {
                    List list = (List) entry.getValue();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(m32310h((Map) it.next()));
                        }
                    }
                } else if (entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new C0047a(str, arrayList, hashMap);
        }
    }

    /* renamed from: h */
    public final C0047a.a m32310h(Map<String, Object> map) {
        long j10;
        long j11;
        long j12 = -1;
        if (map != null) {
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            long j13 = -1;
            while (true) {
                j11 = j12;
                j10 = j13;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Object> next = it.next();
                if ("line".equals(next.getKey())) {
                    j12 = ((BigDecimal) next.getValue()).longValue();
                } else if ("column".equals(next.getKey())) {
                    j13 = ((BigDecimal) next.getValue()).longValue();
                }
            }
        } else {
            j10 = -1;
            j11 = -1;
        }
        return new C0047a.a(j11, j10);
    }

    /* renamed from: i */
    public final List<C0047a> m32311i(C6891h c6891h) {
        return c6891h.m31787m(true, new b(this));
    }
}
