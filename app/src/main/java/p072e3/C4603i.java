package p072e3;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p033c3.C0986f;
import p178k3.C5468g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e3/i.class
 */
/* renamed from: e3.i */
/* loaded from: combined.jar:classes1.jar:e3/i.class */
public final class C4603i {

    /* renamed from: a */
    public final String f27272a;

    /* renamed from: b */
    public final Map<String, Object> f27273b;

    /* renamed from: c */
    public volatile UUID f27274c;

    /* renamed from: d */
    public volatile int f27275d = -1;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e3/i$a.class
     */
    /* renamed from: e3.i$a */
    /* loaded from: combined.jar:classes1.jar:e3/i$a.class */
    public static class a {

        /* renamed from: a */
        public final Map<String, Object> f27276a;

        /* renamed from: b */
        public final String f27277b;

        /* renamed from: c */
        public UUID f27278c;

        public a(String str, Map<String, Object> map, UUID uuid) {
            this.f27277b = str;
            this.f27276a = new LinkedHashMap(map);
            this.f27278c = uuid;
        }

        /* renamed from: a */
        public a m23216a(Map<String, Object> map) {
            C0986f.m5892c(map, "fields == null");
            this.f27276a.putAll(map);
            return this;
        }

        /* renamed from: b */
        public C4603i m23217b() {
            return new C4603i(this.f27277b, this.f27276a, this.f27278c);
        }

        /* renamed from: c */
        public a m23218c(UUID uuid) {
            this.f27278c = uuid;
            return this;
        }
    }

    public C4603i(String str, Map<String, Object> map, UUID uuid) {
        this.f27272a = str;
        this.f27273b = map;
        this.f27274c = uuid;
    }

    /* renamed from: b */
    public static a m23209b(String str) {
        return new a((String) C0986f.m5892c(str, "key == null"), new LinkedHashMap(), null);
    }

    /* renamed from: a */
    public final void m23210a(Object obj, Object obj2) {
        if (this.f27275d != -1) {
            this.f27275d += C5468g.m27268a(obj, obj2);
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4603i clone() {
        return m23215g().m23217b();
    }

    /* renamed from: d */
    public Map<String, Object> m23212d() {
        return this.f27273b;
    }

    /* renamed from: e */
    public String m23213e() {
        return this.f27272a;
    }

    /* renamed from: f */
    public Set<String> m23214f(C4603i c4603i) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, Object> entry : c4603i.f27273b.entrySet()) {
            Object value = entry.getValue();
            boolean containsKey = this.f27273b.containsKey(entry.getKey());
            Object obj = this.f27273b.get(entry.getKey());
            if (!containsKey || ((obj == null && value != null) || (obj != null && !obj.equals(value)))) {
                this.f27273b.put(entry.getKey(), value);
                hashSet.add(m23213e() + InstructionFileId.DOT + entry.getKey());
                m23210a(value, obj);
            }
        }
        this.f27274c = c4603i.f27274c;
        return hashSet;
    }

    /* renamed from: g */
    public a m23215g() {
        return new a(m23213e(), this.f27273b, this.f27274c);
    }
}
