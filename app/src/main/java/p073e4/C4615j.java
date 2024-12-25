package p073e4;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpHeaders;
import org.apache.http.protocol.HTTP;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/j.class
 */
/* renamed from: e4.j */
/* loaded from: combined.jar:classes1.jar:e4/j.class */
public final class C4615j implements InterfaceC4610e {

    /* renamed from: c */
    public final Map<String, List<InterfaceC4614i>> f27302c;

    /* renamed from: d */
    public volatile Map<String, String> f27303d;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e4/j$a.class
     */
    /* renamed from: e4.j$a */
    /* loaded from: combined.jar:classes1.jar:e4/j$a.class */
    public static final class a {

        /* renamed from: e */
        public static final String f27304e;

        /* renamed from: f */
        public static final Map<String, List<InterfaceC4614i>> f27305f;

        /* renamed from: a */
        public boolean f27306a = true;

        /* renamed from: b */
        public Map<String, List<InterfaceC4614i>> f27307b = f27305f;

        /* renamed from: c */
        public boolean f27308c = true;

        /* renamed from: d */
        public boolean f27309d = true;

        static {
            String property = System.getProperty("http.agent");
            f27304e = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            hashMap.put(HttpHeaders.ACCEPT_ENCODING, Collections.singletonList(new b(HTTP.IDENTITY_CODING)));
            f27305f = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: a */
        public C4615j m23249a() {
            this.f27306a = true;
            return new C4615j(this.f27307b);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e4/j$b.class
     */
    /* renamed from: e4.j$b */
    /* loaded from: combined.jar:classes1.jar:e4/j$b.class */
    public static final class b implements InterfaceC4614i {

        /* renamed from: a */
        public final String f27310a;

        public b(String str) {
            this.f27310a = str;
        }

        @Override // p073e4.InterfaceC4614i
        /* renamed from: a */
        public String mo23247a() {
            return this.f27310a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f27310a.equals(((b) obj).f27310a);
            }
            return false;
        }

        public int hashCode() {
            return this.f27310a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f27310a + "'}";
        }
    }

    public C4615j(Map<String, List<InterfaceC4614i>> map) {
        this.f27302c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final Map<String, String> m23248a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<InterfaceC4614i>> entry : this.f27302c.entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            List<InterfaceC4614i> value = entry.getValue();
            for (int i10 = 0; i10 < value.size(); i10++) {
                sb2.append(value.get(i10).mo23247a());
                if (i10 != value.size() - 1) {
                    sb2.append(',');
                }
            }
            hashMap.put(entry.getKey(), sb2.toString());
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4615j) {
            return this.f27302c.equals(((C4615j) obj).f27302c);
        }
        return false;
    }

    @Override // p073e4.InterfaceC4610e
    public Map<String, String> getHeaders() {
        if (this.f27303d == null) {
            synchronized (this) {
                if (this.f27303d == null) {
                    this.f27303d = Collections.unmodifiableMap(m23248a());
                }
            }
        }
        return this.f27303d;
    }

    public int hashCode() {
        return this.f27302c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f27302c + '}';
    }
}
