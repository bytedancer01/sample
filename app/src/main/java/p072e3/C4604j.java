package p072e3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p033c3.C0986f;
import p238o3.AbstractC6890g;
import p238o3.C6884a;
import p411xi.C9761e;
import p411xi.C9772p;
import p411xi.InterfaceC9763g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/j.class
 */
/* renamed from: e3.j */
/* loaded from: combined.jar:classes1.jar:e3/j.class */
public final class C4604j {
    /* renamed from: a */
    public static C4604j m23219a() {
        return new C4604j();
    }

    /* renamed from: e */
    public static void m23220e(Object obj, AbstractC6890g abstractC6890g) {
        String m23185d;
        if (obj == null) {
            abstractC6890g.mo31768t();
            return;
        }
        if (obj instanceof String) {
            m23185d = (String) obj;
        } else {
            if (obj instanceof Boolean) {
                abstractC6890g.mo31755A0(((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Number) {
                abstractC6890g.mo31767q0((Number) obj);
                return;
            }
            if (!(obj instanceof C4598d)) {
                if (!(obj instanceof List)) {
                    throw new RuntimeException("Unsupported record value type: " + obj.getClass());
                }
                abstractC6890g.mo31762f();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    m23220e(it.next(), abstractC6890g);
                }
                abstractC6890g.mo31764o();
                return;
            }
            m23185d = ((C4598d) obj).m23185d();
        }
        abstractC6890g.mo31769v0(m23185d);
    }

    /* renamed from: b */
    public Map<String, Object> m23221b(String str) {
        return m23222c(C9772p.m41229c(C9772p.m41237k(new ByteArrayInputStream(str.getBytes()))));
    }

    /* renamed from: c */
    public Map<String, Object> m23222c(InterfaceC9763g interfaceC9763g) {
        return C6884a.m31725b(C6884a.m31724a(interfaceC9763g)).m31794u();
    }

    /* renamed from: d */
    public String m23223d(Map<String, Object> map) {
        C0986f.m5892c(map, "fields == null");
        C9761e c9761e = new C9761e();
        AbstractC6890g m31770v = AbstractC6890g.m31770v(c9761e);
        m31770v.m31772o0(true);
        try {
            m31770v.mo31763l();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                m31770v.mo31766q(key);
                m23220e(value, m31770v);
            }
            m31770v.mo31765p();
            m31770v.close();
            return c9761e.m41134O0();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
