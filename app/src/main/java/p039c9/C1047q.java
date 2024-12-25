package p039c9;

import ec.C4701d;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:c9/q.class
 */
/* renamed from: c9.q */
/* loaded from: combined.jar:classes2.jar:c9/q.class */
public final class C1047q implements InterfaceC1045o {

    /* renamed from: c */
    public static final C1047q f7018c = new C1047q(Collections.emptyMap());

    /* renamed from: a */
    public int f7019a;

    /* renamed from: b */
    public final Map<String, byte[]> f7020b;

    public C1047q() {
        this(Collections.emptyMap());
    }

    public C1047q(Map<String, byte[]> map) {
        this.f7020b = Collections.unmodifiableMap(map);
    }

    /* renamed from: c */
    public static void m6189c(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), m6191g(entry.getValue()));
        }
    }

    /* renamed from: d */
    public static Map<String, byte[]> m6190d(Map<String, byte[]> map, C1046p c1046p) {
        HashMap hashMap = new HashMap(map);
        m6193i(hashMap, c1046p.m6185c());
        m6189c(hashMap, c1046p.m6184b());
        return hashMap;
    }

    /* renamed from: g */
    public static byte[] m6191g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(C4701d.f27717c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static boolean m6192h(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static void m6193i(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.remove(list.get(i10));
        }
    }

    @Override // p039c9.InterfaceC1045o
    /* renamed from: a */
    public final long mo6179a(String str, long j10) {
        byte[] bArr = this.f7020b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j10;
    }

    @Override // p039c9.InterfaceC1045o
    /* renamed from: b */
    public final String mo6180b(String str, String str2) {
        byte[] bArr = this.f7020b.get(str);
        if (bArr != null) {
            str2 = new String(bArr, C4701d.f27717c);
        }
        return str2;
    }

    /* renamed from: e */
    public C1047q m6194e(C1046p c1046p) {
        Map<String, byte[]> m6190d = m6190d(this.f7020b, c1046p);
        return m6192h(this.f7020b, m6190d) ? this : new C1047q(m6190d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1047q.class != obj.getClass()) {
            return false;
        }
        return m6192h(this.f7020b, ((C1047q) obj).f7020b);
    }

    /* renamed from: f */
    public Set<Map.Entry<String, byte[]>> m6195f() {
        return this.f7020b.entrySet();
    }

    public int hashCode() {
        if (this.f7019a == 0) {
            int i10 = 0;
            for (Map.Entry<String, byte[]> entry : this.f7020b.entrySet()) {
                i10 += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f7019a = i10;
        }
        return this.f7019a;
    }
}
