package p113g7;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p057d7.C4322e;
import p059d9.C4361f0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:g7/d.class
 */
/* renamed from: g7.d */
/* loaded from: combined.jar:classes2.jar:g7/d.class */
public final class C4965d extends AbstractC4966e {

    /* renamed from: b */
    public long f28794b;

    /* renamed from: c */
    public long[] f28795c;

    /* renamed from: d */
    public long[] f28796d;

    public C4965d() {
        super(new C4322e());
        this.f28794b = -9223372036854775807L;
        this.f28795c = new long[0];
        this.f28796d = new long[0];
    }

    /* renamed from: g */
    public static Boolean m24995g(C4361f0 c4361f0) {
        boolean z10 = true;
        if (c4361f0.m21971D() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* renamed from: h */
    public static Object m24996h(C4361f0 c4361f0, int i10) {
        if (i10 == 0) {
            return m24998j(c4361f0);
        }
        if (i10 == 1) {
            return m24995g(c4361f0);
        }
        if (i10 == 2) {
            return m25002n(c4361f0);
        }
        if (i10 == 3) {
            return m25000l(c4361f0);
        }
        if (i10 == 8) {
            return m24999k(c4361f0);
        }
        if (i10 == 10) {
            return m25001m(c4361f0);
        }
        if (i10 != 11) {
            return null;
        }
        return m24997i(c4361f0);
    }

    /* renamed from: i */
    public static Date m24997i(C4361f0 c4361f0) {
        Date date = new Date((long) m24998j(c4361f0).doubleValue());
        c4361f0.m21984Q(2);
        return date;
    }

    /* renamed from: j */
    public static Double m24998j(C4361f0 c4361f0) {
        return Double.valueOf(Double.longBitsToDouble(c4361f0.m22007w()));
    }

    /* renamed from: k */
    public static HashMap<String, Object> m24999k(C4361f0 c4361f0) {
        int m21975H = c4361f0.m21975H();
        HashMap<String, Object> hashMap = new HashMap<>(m21975H);
        for (int i10 = 0; i10 < m21975H; i10++) {
            String m25002n = m25002n(c4361f0);
            Object m24996h = m24996h(c4361f0, m25003o(c4361f0));
            if (m24996h != null) {
                hashMap.put(m25002n, m24996h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    public static HashMap<String, Object> m25000l(C4361f0 c4361f0) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m25002n = m25002n(c4361f0);
            int m25003o = m25003o(c4361f0);
            if (m25003o == 9) {
                return hashMap;
            }
            Object m24996h = m24996h(c4361f0, m25003o);
            if (m24996h != null) {
                hashMap.put(m25002n, m24996h);
            }
        }
    }

    /* renamed from: m */
    public static ArrayList<Object> m25001m(C4361f0 c4361f0) {
        int m21975H = c4361f0.m21975H();
        ArrayList<Object> arrayList = new ArrayList<>(m21975H);
        for (int i10 = 0; i10 < m21975H; i10++) {
            Object m24996h = m24996h(c4361f0, m25003o(c4361f0));
            if (m24996h != null) {
                arrayList.add(m24996h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static String m25002n(C4361f0 c4361f0) {
        int m21977J = c4361f0.m21977J();
        int m21989e = c4361f0.m21989e();
        c4361f0.m21984Q(m21977J);
        return new String(c4361f0.m21988d(), m21989e, m21977J);
    }

    /* renamed from: o */
    public static int m25003o(C4361f0 c4361f0) {
        return c4361f0.m21971D();
    }

    @Override // p113g7.AbstractC4966e
    /* renamed from: b */
    public boolean mo24984b(C4361f0 c4361f0) {
        return true;
    }

    @Override // p113g7.AbstractC4966e
    /* renamed from: c */
    public boolean mo24985c(C4361f0 c4361f0, long j10) {
        if (m25003o(c4361f0) != 2 || !"onMetaData".equals(m25002n(c4361f0)) || m25003o(c4361f0) != 8) {
            return false;
        }
        HashMap<String, Object> m24999k = m24999k(c4361f0);
        Object obj = m24999k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f28794b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m24999k.get("keyframes");
        if (!(obj2 instanceof Map)) {
            return false;
        }
        Map map = (Map) obj2;
        Object obj3 = map.get("filepositions");
        Object obj4 = map.get("times");
        if (!(obj3 instanceof List) || !(obj4 instanceof List)) {
            return false;
        }
        List list = (List) obj3;
        List list2 = (List) obj4;
        int size = list2.size();
        this.f28795c = new long[size];
        this.f28796d = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            Object obj5 = list.get(i10);
            Object obj6 = list2.get(i10);
            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                this.f28795c = new long[0];
                this.f28796d = new long[0];
                return false;
            }
            this.f28795c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
            this.f28796d[i10] = ((Double) obj5).longValue();
        }
        return false;
    }

    /* renamed from: d */
    public long m25004d() {
        return this.f28794b;
    }

    /* renamed from: e */
    public long[] m25005e() {
        return this.f28796d;
    }

    /* renamed from: f */
    public long[] m25006f() {
        return this.f28795c;
    }
}
