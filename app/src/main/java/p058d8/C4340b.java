package p058d8;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p059d9.C4401z0;
import p077e8.C4649b;
import p099fc.C4844y;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d8/b.class
 */
/* renamed from: d8.b */
/* loaded from: combined.jar:classes2.jar:d8/b.class */
public final class C4340b {

    /* renamed from: a */
    public final Map<String, Long> f26503a;

    /* renamed from: b */
    public final Map<Integer, Long> f26504b;

    /* renamed from: c */
    public final Map<List<Pair<String, Integer>>, C4649b> f26505c;

    /* renamed from: d */
    public final Random f26506d;

    public C4340b() {
        this(new Random());
    }

    public C4340b(Random random) {
        this.f26505c = new HashMap();
        this.f26506d = random;
        this.f26503a = new HashMap();
        this.f26504b = new HashMap();
    }

    /* renamed from: b */
    public static <T> void m21849b(T t10, long j10, Map<T, Long> map) {
        long j11 = j10;
        if (map.containsKey(t10)) {
            j11 = Math.max(j10, ((Long) C4401z0.m22391j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j11));
    }

    /* renamed from: d */
    public static int m21850d(C4649b c4649b, C4649b c4649b2) {
        int compare = Integer.compare(c4649b.f27409c, c4649b2.f27409c);
        if (compare == 0) {
            compare = c4649b.f27408b.compareTo(c4649b2.f27408b);
        }
        return compare;
    }

    /* renamed from: f */
    public static int m21851f(List<C4649b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f27409c));
        }
        return hashSet.size();
    }

    /* renamed from: h */
    public static <T> void m21852h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    /* renamed from: c */
    public final List<C4649b> m21853c(List<C4649b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m21852h(elapsedRealtime, this.f26503a);
        m21852h(elapsedRealtime, this.f26504b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4649b c4649b = list.get(i10);
            if (!this.f26503a.containsKey(c4649b.f27408b) && !this.f26504b.containsKey(Integer.valueOf(c4649b.f27409c))) {
                arrayList.add(c4649b);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void m21854e(C4649b c4649b, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        m21849b(c4649b.f27408b, elapsedRealtime, this.f26503a);
        m21849b(Integer.valueOf(c4649b.f27409c), elapsedRealtime, this.f26504b);
    }

    /* renamed from: g */
    public int m21855g(List<C4649b> list) {
        HashSet hashSet = new HashSet();
        List<C4649b> m21853c = m21853c(list);
        for (int i10 = 0; i10 < m21853c.size(); i10++) {
            hashSet.add(Integer.valueOf(m21853c.get(i10).f27409c));
        }
        return hashSet.size();
    }

    /* renamed from: i */
    public void m21856i() {
        this.f26503a.clear();
        this.f26504b.clear();
        this.f26505c.clear();
    }

    /* renamed from: j */
    public C4649b m21857j(List<C4649b> list) {
        Object obj;
        List<C4649b> m21853c = m21853c(list);
        if (m21853c.size() >= 2) {
            Collections.sort(m21853c, new Comparator() { // from class: d8.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m21850d;
                    m21850d = C4340b.m21850d((C4649b) obj2, (C4649b) obj3);
                    return m21850d;
                }
            });
            ArrayList arrayList = new ArrayList();
            int i10 = m21853c.get(0).f27409c;
            int i11 = 0;
            while (true) {
                if (i11 >= m21853c.size()) {
                    break;
                }
                C4649b c4649b = m21853c.get(i11);
                if (i10 == c4649b.f27409c) {
                    arrayList.add(new Pair(c4649b.f27408b, Integer.valueOf(c4649b.f27410d)));
                    i11++;
                } else if (arrayList.size() == 1) {
                    obj = m21853c.get(0);
                }
            }
            C4649b c4649b2 = this.f26505c.get(arrayList);
            C4649b c4649b3 = c4649b2;
            if (c4649b2 == null) {
                c4649b3 = m21858k(m21853c.subList(0, arrayList.size()));
                this.f26505c.put(arrayList, c4649b3);
            }
            return c4649b3;
        }
        obj = C4844y.m24602b(m21853c, null);
        return (C4649b) obj;
    }

    /* renamed from: k */
    public final C4649b m21858k(List<C4649b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f27410d;
        }
        int nextInt = this.f26506d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            C4649b c4649b = list.get(i13);
            i12 += c4649b.f27410d;
            if (nextInt < i12) {
                return c4649b;
            }
        }
        return (C4649b) C4844y.m24603c(list);
    }
}
