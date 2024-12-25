package p395x2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x2/k.class
 */
/* renamed from: x2.k */
/* loaded from: combined.jar:classes1.jar:x2/k.class */
public class C9632k {

    /* renamed from: a */
    public final int f43980a;

    /* renamed from: b */
    public final byte[] f43981b;

    /* renamed from: c */
    public final Map<String, String> f43982c;

    /* renamed from: d */
    public final List<C9628g> f43983d;

    /* renamed from: e */
    public final boolean f43984e;

    /* renamed from: f */
    public final long f43985f;

    public C9632k(int i10, byte[] bArr, Map<String, String> map, List<C9628g> list, boolean z10, long j10) {
        this.f43980a = i10;
        this.f43981b = bArr;
        this.f43982c = map;
        this.f43983d = list == null ? null : Collections.unmodifiableList(list);
        this.f43984e = z10;
        this.f43985f = j10;
    }

    @Deprecated
    public C9632k(int i10, byte[] bArr, Map<String, String> map, boolean z10, long j10) {
        this(i10, bArr, map, m40526a(map), z10, j10);
    }

    public C9632k(int i10, byte[] bArr, boolean z10, long j10, List<C9628g> list) {
        this(i10, bArr, m40527b(list), list, z10, j10);
    }

    @Deprecated
    public C9632k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    /* renamed from: a */
    public static List<C9628g> m40526a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C9628g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, String> m40527b(List<C9628g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C9628g c9628g : list) {
            treeMap.put(c9628g.m40518a(), c9628g.m40519b());
        }
        return treeMap;
    }
}
