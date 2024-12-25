package p367v8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p059d9.C4349a;
import p243o8.C6919a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:v8/d.class
 */
/* renamed from: v8.d */
/* loaded from: combined.jar:classes2.jar:v8/d.class */
public final class C9310d {

    /* renamed from: a */
    public final String f42467a;

    /* renamed from: b */
    public final String f42468b;

    /* renamed from: c */
    public final boolean f42469c;

    /* renamed from: d */
    public final long f42470d;

    /* renamed from: e */
    public final long f42471e;

    /* renamed from: f */
    public final C9313g f42472f;

    /* renamed from: g */
    public final String[] f42473g;

    /* renamed from: h */
    public final String f42474h;

    /* renamed from: i */
    public final String f42475i;

    /* renamed from: j */
    public final C9310d f42476j;

    /* renamed from: k */
    public final HashMap<String, Integer> f42477k;

    /* renamed from: l */
    public final HashMap<String, Integer> f42478l;

    /* renamed from: m */
    public List<C9310d> f42479m;

    public C9310d(String str, String str2, long j10, long j11, C9313g c9313g, String[] strArr, String str3, String str4, C9310d c9310d) {
        this.f42467a = str;
        this.f42468b = str2;
        this.f42475i = str4;
        this.f42472f = c9313g;
        this.f42473g = strArr;
        this.f42469c = str2 != null;
        this.f42470d = j10;
        this.f42471e = j11;
        this.f42474h = (String) C4349a.m21882e(str3);
        this.f42476j = c9310d;
        this.f42477k = new HashMap<>();
        this.f42478l = new HashMap<>();
    }

    /* renamed from: c */
    public static C9310d m39254c(String str, long j10, long j11, C9313g c9313g, String[] strArr, String str2, String str3, C9310d c9310d) {
        return new C9310d(str, null, j10, j11, c9313g, strArr, str2, str3, c9310d);
    }

    /* renamed from: d */
    public static C9310d m39255d(String str) {
        return new C9310d(null, C9312f.m39271b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    public static void m39256e(SpannableStringBuilder spannableStringBuilder) {
        for (C9307a c9307a : (C9307a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C9307a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c9307a), spannableStringBuilder.getSpanEnd(c9307a), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == '\n') {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        int i16 = 0;
        if (spannableStringBuilder.length() > 0) {
            i16 = 0;
            if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                i16 = 0;
            }
        }
        while (i16 < spannableStringBuilder.length() - 1) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
            i16++;
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    /* renamed from: k */
    public static SpannableStringBuilder m39257k(String str, Map<String, C6919a.b> map) {
        if (!map.containsKey(str)) {
            C6919a.b bVar = new C6919a.b();
            bVar.m31871o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C4349a.m21882e(map.get(str).m31861e());
    }

    /* renamed from: a */
    public void m39258a(C9310d c9310d) {
        if (this.f42479m == null) {
            this.f42479m = new ArrayList();
        }
        this.f42479m.add(c9310d);
    }

    /* renamed from: b */
    public final void m39259b(Map<String, C9313g> map, C6919a.b bVar, int i10, int i11, int i12) {
        C9313g m39275f = C9312f.m39275f(this.f42472f, this.f42473g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.m31861e();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (spannableStringBuilder == null) {
            spannableStringBuilder2 = new SpannableStringBuilder();
            bVar.m31871o(spannableStringBuilder2);
        }
        if (m39275f != null) {
            C9312f.m39270a(spannableStringBuilder2, i10, i11, m39275f, this.f42476j, map, i12);
            if ("p".equals(this.f42467a)) {
                if (m39275f.m39297k() != Float.MAX_VALUE) {
                    bVar.m31869m((m39275f.m39297k() * (-90.0f)) / 100.0f);
                }
                if (m39275f.m39299m() != null) {
                    bVar.m31872p(m39275f.m39299m());
                }
                if (m39275f.m39294h() != null) {
                    bVar.m31866j(m39275f.m39294h());
                }
            }
        }
    }

    /* renamed from: f */
    public C9310d m39260f(int i10) {
        List<C9310d> list = this.f42479m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m39261g() {
        List<C9310d> list = this.f42479m;
        return list == null ? 0 : list.size();
    }

    /* renamed from: h */
    public List<C6919a> m39262h(long j10, Map<String, C9313g> map, Map<String, C9311e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m39267n(j10, this.f42474h, arrayList);
        TreeMap treeMap = new TreeMap();
        m39269p(j10, false, this.f42474h, treeMap);
        m39268o(j10, map, map2, this.f42474h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C9311e c9311e = (C9311e) C4349a.m21882e(map2.get(pair.first));
                arrayList2.add(new C6919a.b().m31862f(decodeByteArray).m31867k(c9311e.f42481b).m31868l(0).m31864h(c9311e.f42482c, 0).m31865i(c9311e.f42484e).m31870n(c9311e.f42485f).m31863g(c9311e.f42486g).m31874r(c9311e.f42489j).m31857a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C9311e c9311e2 = (C9311e) C4349a.m21882e(map2.get(entry.getKey()));
            C6919a.b bVar = (C6919a.b) entry.getValue();
            m39256e((SpannableStringBuilder) C4349a.m21882e(bVar.m31861e()));
            bVar.m31864h(c9311e2.f42482c, c9311e2.f42483d);
            bVar.m31865i(c9311e2.f42484e);
            bVar.m31867k(c9311e2.f42481b);
            bVar.m31870n(c9311e2.f42485f);
            bVar.m31873q(c9311e2.f42488i, c9311e2.f42487h);
            bVar.m31874r(c9311e2.f42489j);
            arrayList2.add(bVar.m31857a());
        }
        return arrayList2;
    }

    /* renamed from: i */
    public final void m39263i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f42467a);
        boolean equals2 = "div".equals(this.f42467a);
        if (z10 || equals || (equals2 && this.f42475i != null)) {
            long j10 = this.f42470d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f42471e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f42479m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f42479m.size(); i10++) {
            this.f42479m.get(i10).m39263i(treeSet, z10 || equals);
        }
    }

    /* renamed from: j */
    public long[] m39264j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        m39263i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] m39265l() {
        return this.f42473g;
    }

    /* renamed from: m */
    public boolean m39266m(long j10) {
        long j11 = this.f42470d;
        return (j11 == -9223372036854775807L && this.f42471e == -9223372036854775807L) || (j11 <= j10 && this.f42471e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f42471e) || (j11 <= j10 && j10 < this.f42471e));
    }

    /* renamed from: n */
    public final void m39267n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f42474h)) {
            str = this.f42474h;
        }
        if (m39266m(j10) && "div".equals(this.f42467a) && this.f42475i != null) {
            list.add(new Pair<>(str, this.f42475i));
            return;
        }
        for (int i10 = 0; i10 < m39261g(); i10++) {
            m39260f(i10).m39267n(j10, str, list);
        }
    }

    /* renamed from: o */
    public final void m39268o(long j10, Map<String, C9313g> map, Map<String, C9311e> map2, String str, Map<String, C6919a.b> map3) {
        int i10;
        if (m39266m(j10)) {
            if (!"".equals(this.f42474h)) {
                str = this.f42474h;
            }
            Iterator<Map.Entry<String, Integer>> it = this.f42478l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.f42477k.containsKey(key) ? this.f42477k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    m39259b(map, (C6919a.b) C4349a.m21882e(map3.get(key)), intValue, intValue2, ((C9311e) C4349a.m21882e(map2.get(str))).f42489j);
                }
            }
            for (i10 = 0; i10 < m39261g(); i10++) {
                m39260f(i10).m39268o(j10, map, map2, str, map3);
            }
        }
    }

    /* renamed from: p */
    public final void m39269p(long j10, boolean z10, String str, Map<String, C6919a.b> map) {
        this.f42477k.clear();
        this.f42478l.clear();
        if ("metadata".equals(this.f42467a)) {
            return;
        }
        if (!"".equals(this.f42474h)) {
            str = this.f42474h;
        }
        if (this.f42469c && z10) {
            m39257k(str, map).append((CharSequence) C4349a.m21882e(this.f42468b));
            return;
        }
        if ("br".equals(this.f42467a) && z10) {
            m39257k(str, map).append('\n');
            return;
        }
        if (m39266m(j10)) {
            for (Map.Entry<String, C6919a.b> entry : map.entrySet()) {
                this.f42477k.put(entry.getKey(), Integer.valueOf(((CharSequence) C4349a.m21882e(entry.getValue().m31861e())).length()));
            }
            boolean equals = "p".equals(this.f42467a);
            for (int i10 = 0; i10 < m39261g(); i10++) {
                m39260f(i10).m39269p(j10, z10 || equals, str, map);
            }
            if (equals) {
                C9312f.m39272c(m39257k(str, map));
            }
            for (Map.Entry<String, C6919a.b> entry2 : map.entrySet()) {
                this.f42478l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C4349a.m21882e(entry2.getValue().m31861e())).length()));
            }
        }
    }
}
