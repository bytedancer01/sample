package vg;

import com.amplifyframework.core.model.ModelIdentifier;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.http.HttpHeaders;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.protocol.HTTP;
import org.slf4j.Marker;
import tg.C8731g;
import tg.C8739o;
import tg.C8743s;
import tg.C8745u;
import tg.InterfaceC8726b;
import ug.C9181f;
import ug.C9183h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/j.class
 */
/* renamed from: vg.j */
/* loaded from: combined.jar:classes2.jar:vg/j.class */
public final class C9355j {

    /* renamed from: a */
    public static final Comparator<String> f42858a = new a();

    /* renamed from: b */
    public static final String f42859b;

    /* renamed from: c */
    public static final String f42860c;

    /* renamed from: d */
    public static final String f42861d;

    /* renamed from: e */
    public static final String f42862e;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:vg/j$a.class
     */
    /* renamed from: vg.j$a */
    /* loaded from: combined.jar:classes2.jar:vg/j$a.class */
    public static final class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        String m38670f = C9181f.m38667e().m38670f();
        f42859b = m38670f;
        f42860c = m38670f + "-Sent-Millis";
        f42861d = m38670f + "-Received-Millis";
        f42862e = m38670f + "-Selected-Protocol";
    }

    /* renamed from: a */
    public static void m39476a(C8743s.b bVar, Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (InterfaceC7038SM.COOKIE.equalsIgnoreCase(key) || InterfaceC7038SM.COOKIE2.equalsIgnoreCase(key)) {
                if (!entry.getValue().isEmpty()) {
                    bVar.m37474g(key, m39477b(entry.getValue()));
                }
            }
        }
    }

    /* renamed from: b */
    public static String m39477b(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(list.get(i10));
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static long m39478c(C8739o c8739o) {
        return m39485j(c8739o.m37397a("Content-Length"));
    }

    /* renamed from: d */
    public static long m39479d(C8743s c8743s) {
        return m39478c(c8743s.m37461k());
    }

    /* renamed from: e */
    public static long m39480e(C8745u c8745u) {
        return m39478c(c8745u.m37505s());
    }

    /* renamed from: f */
    public static boolean m39481f(C8745u c8745u) {
        return m39487l(c8745u).contains(Marker.ANY_MARKER);
    }

    /* renamed from: g */
    public static boolean m39482g(String str) {
        return ("Connection".equalsIgnoreCase(str) || HTTP.CONN_KEEP_ALIVE.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || HttpHeaders.f36150TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: h */
    public static List<C8731g> m39483h(C8739o c8739o, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c8739o.m37401f(); i10++) {
            if (str.equalsIgnoreCase(c8739o.m37399d(i10))) {
                String m37402g = c8739o.m37402g(i10);
                int i11 = 0;
                while (i11 < m37402g.length()) {
                    int m39399b = C9349d.m39399b(m37402g, i11, " ");
                    String trim = m37402g.substring(i11, m39399b).trim();
                    int m39400c = C9349d.m39400c(m37402g, m39399b);
                    if (!m37402g.regionMatches(true, m39400c, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i12 = m39400c + 7;
                    int m39399b2 = C9349d.m39399b(m37402g, i12, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                    String substring = m37402g.substring(i12, m39399b2);
                    i11 = C9349d.m39400c(m37402g, C9349d.m39399b(m37402g, m39399b2 + 1, ",") + 1);
                    arrayList.add(new C8731g(trim, substring));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static C8743s m39484i(InterfaceC8726b interfaceC8726b, C8745u c8745u, Proxy proxy) {
        return c8745u.m37501o() == 407 ? interfaceC8726b.mo37282a(proxy, c8745u) : interfaceC8726b.mo37283b(proxy, c8745u);
    }

    /* renamed from: j */
    public static long m39485j(String str) {
        long j10 = -1;
        if (str == null) {
            return -1L;
        }
        try {
            j10 = Long.parseLong(str);
        } catch (NumberFormatException e10) {
        }
        return j10;
    }

    /* renamed from: k */
    public static Map<String, List<String>> m39486k(C8739o c8739o, String str) {
        TreeMap treeMap = new TreeMap(f42858a);
        for (int i10 = 0; i10 < c8739o.m37401f(); i10++) {
            String m37399d = c8739o.m37399d(i10);
            String m37402g = c8739o.m37402g(i10);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(m37399d);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(m37402g);
            treeMap.put(m37399d, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    /* renamed from: l */
    public static Set<String> m39487l(C8745u c8745u) {
        Set<String> emptySet = Collections.emptySet();
        C8739o m37505s = c8745u.m37505s();
        for (int i10 = 0; i10 < m37505s.m37401f(); i10++) {
            if (HttpHeaders.VARY.equalsIgnoreCase(m37505s.m37399d(i10))) {
                String m37402g = m37505s.m37402g(i10);
                Set<String> set = emptySet;
                if (emptySet.isEmpty()) {
                    set = new TreeSet((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                String[] split = m37402g.split(",");
                int length = split.length;
                int i11 = 0;
                while (true) {
                    emptySet = set;
                    if (i11 < length) {
                        set.add(split[i11].trim());
                        i11++;
                    }
                }
            }
        }
        return emptySet;
    }

    /* renamed from: m */
    public static C8739o m39488m(C8745u c8745u) {
        Set<String> m39487l = m39487l(c8745u);
        if (m39487l.isEmpty()) {
            return new C8739o.b().m37408e();
        }
        C8739o m37461k = c8745u.m37508v().m37511y().m37461k();
        C8739o.b bVar = new C8739o.b();
        for (int i10 = 0; i10 < m37461k.m37401f(); i10++) {
            String m37399d = m37461k.m37399d(i10);
            if (m39487l.contains(m37399d)) {
                bVar.m37405b(m37399d, m37461k.m37402g(i10));
            }
        }
        return bVar.m37408e();
    }

    /* renamed from: n */
    public static boolean m39489n(C8745u c8745u, C8739o c8739o, C8743s c8743s) {
        for (String str : m39487l(c8745u)) {
            if (!C9183h.m38686f(c8739o.m37403h(str), c8743s.m37460j(str))) {
                return false;
            }
        }
        return true;
    }
}
