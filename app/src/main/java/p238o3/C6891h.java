package p238o3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p238o3.AbstractC6887d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o3/h.class
 */
/* renamed from: o3.h */
/* loaded from: combined.jar:classes1.jar:o3/h.class */
public class C6891h {

    /* renamed from: a */
    public final AbstractC6887d f35711a;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o3/h$a.class
     */
    /* renamed from: o3.h$a */
    /* loaded from: combined.jar:classes1.jar:o3/h$a.class */
    public class a implements d<Map<String, Object>> {

        /* renamed from: a */
        public final C6891h f35712a;

        public a(C6891h c6891h) {
            this.f35712a = c6891h;
        }

        @Override // p238o3.C6891h.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<String, Object> mo31795a(C6891h c6891h) {
            return c6891h.m31794u();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o3/h$b.class
     */
    /* renamed from: o3.h$b */
    /* loaded from: combined.jar:classes1.jar:o3/h$b.class */
    public class b implements c<Object> {

        /* renamed from: a */
        public final C6891h f35713a;

        /* renamed from: b */
        public final C6891h f35714b;

        public b(C6891h c6891h, C6891h c6891h2) {
            this.f35714b = c6891h;
            this.f35713a = c6891h2;
        }

        @Override // p238o3.C6891h.c
        /* renamed from: a */
        public Object mo31797a(C6891h c6891h) {
            return this.f35713a.m31782h() ? this.f35714b.m31791r(c6891h) : this.f35713a.m31785k() ? this.f35714b.m31792s(c6891h) : c6891h.mo31752p(true);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o3/h$c.class
     */
    /* renamed from: o3.h$c */
    /* loaded from: combined.jar:classes1.jar:o3/h$c.class */
    public interface c<T> {
        /* renamed from: a */
        T mo31797a(C6891h c6891h);
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:o3/h$d.class
     */
    /* renamed from: o3.h$d */
    /* loaded from: combined.jar:classes1.jar:o3/h$d.class */
    public interface d<T> {
        /* renamed from: a */
        T mo31795a(C6891h c6891h);
    }

    public C6891h(AbstractC6887d abstractC6887d) {
        this.f35711a = abstractC6887d;
    }

    /* renamed from: e */
    public final void m31779e(boolean z10) {
        if (!z10 && this.f35711a.mo31751y() == AbstractC6887d.a.NULL) {
            throw new NullPointerException("corrupted response reader, expected non null value");
        }
    }

    /* renamed from: f */
    public boolean m31780f() {
        return this.f35711a.mo31745q();
    }

    /* renamed from: g */
    public final boolean m31781g() {
        return this.f35711a.mo31751y() == AbstractC6887d.a.BOOLEAN;
    }

    /* renamed from: h */
    public final boolean m31782h() {
        return this.f35711a.mo31751y() == AbstractC6887d.a.BEGIN_ARRAY;
    }

    /* renamed from: i */
    public final boolean m31783i() {
        return this.f35711a.mo31751y() == AbstractC6887d.a.NULL;
    }

    /* renamed from: j */
    public final boolean m31784j() {
        return this.f35711a.mo31751y() == AbstractC6887d.a.NUMBER;
    }

    /* renamed from: k */
    public final boolean m31785k() {
        return this.f35711a.mo31751y() == AbstractC6887d.a.BEGIN_OBJECT;
    }

    /* renamed from: l */
    public Boolean m31786l(boolean z10) {
        m31779e(z10);
        if (this.f35711a.mo31751y() != AbstractC6887d.a.NULL) {
            return Boolean.valueOf(this.f35711a.mo31747t());
        }
        this.f35711a.mo31728B();
        return null;
    }

    /* renamed from: m */
    public <T> List<T> m31787m(boolean z10, c<T> cVar) {
        m31779e(z10);
        if (this.f35711a.mo31751y() == AbstractC6887d.a.NULL) {
            this.f35711a.mo31728B();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f35711a.mo31740f();
        while (this.f35711a.mo31745q()) {
            arrayList.add(cVar.mo31797a(this));
        }
        this.f35711a.mo31742o();
        return arrayList;
    }

    /* renamed from: n */
    public String m31788n() {
        return this.f35711a.mo31748v();
    }

    /* renamed from: o */
    public <T> T m31789o(boolean z10, d<T> dVar) {
        m31779e(z10);
        if (this.f35711a.mo31751y() == AbstractC6887d.a.NULL) {
            this.f35711a.mo31728B();
            return null;
        }
        this.f35711a.mo31741l();
        T mo31795a = dVar.mo31795a(this);
        this.f35711a.mo31744p();
        return mo31795a;
    }

    /* renamed from: p */
    public Object mo31752p(boolean z10) {
        m31779e(z10);
        if (!m31783i()) {
            return m31781g() ? m31786l(false) : m31784j() ? new BigDecimal(m31790q(false)) : m31790q(false);
        }
        m31793t();
        return null;
    }

    /* renamed from: q */
    public String m31790q(boolean z10) {
        m31779e(z10);
        if (this.f35711a.mo31751y() != AbstractC6887d.a.NULL) {
            return this.f35711a.mo31750w();
        }
        this.f35711a.mo31728B();
        return null;
    }

    /* renamed from: r */
    public final List<?> m31791r(C6891h c6891h) {
        return c6891h.m31787m(false, new b(this, c6891h));
    }

    /* renamed from: s */
    public final Map<String, Object> m31792s(C6891h c6891h) {
        return (Map) c6891h.m31789o(false, new a(this));
    }

    /* renamed from: t */
    public void m31793t() {
        this.f35711a.mo31728B();
    }

    /* renamed from: u */
    public Map<String, Object> m31794u() {
        Object m31792s;
        if (m31785k()) {
            return m31792s(this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (m31780f()) {
            String m31788n = m31788n();
            if (m31783i()) {
                m31793t();
                m31792s = null;
            } else {
                m31792s = m31785k() ? m31792s(this) : m31782h() ? m31791r(this) : mo31752p(true);
            }
            linkedHashMap.put(m31788n, m31792s);
        }
        return linkedHashMap;
    }
}
