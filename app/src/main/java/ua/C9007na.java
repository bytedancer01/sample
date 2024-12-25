package ua;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p294r.C7928a;
import p305ra.C8122e2;
import p305ra.C8137f2;
import p305ra.C8152g2;
import p305ra.C8167h2;
import p305ra.C8211k1;
import p305ra.C8226l1;
import p305ra.C8241m1;
import p305ra.C8256n1;
import p305ra.C8355ta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/na.class
 */
/* renamed from: ua.na */
/* loaded from: combined.jar:classes2.jar:ua/na.class */
public final class C9007na {

    /* renamed from: a */
    public String f41460a;

    /* renamed from: b */
    public boolean f41461b;

    /* renamed from: c */
    public C8137f2 f41462c;

    /* renamed from: d */
    public BitSet f41463d;

    /* renamed from: e */
    public BitSet f41464e;

    /* renamed from: f */
    public Map<Integer, Long> f41465f;

    /* renamed from: g */
    public Map<Integer, List<Long>> f41466g;

    /* renamed from: h */
    public final C9067sa f41467h;

    public /* synthetic */ C9007na(C9067sa c9067sa, String str, C8137f2 c8137f2, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C8995ma c8995ma) {
        this.f41467h = c9067sa;
        this.f41460a = str;
        this.f41463d = bitSet;
        this.f41464e = bitSet2;
        this.f41465f = map;
        this.f41466g = new C7928a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f41466g.put(num, arrayList);
        }
        this.f41461b = false;
        this.f41462c = c8137f2;
    }

    public /* synthetic */ C9007na(C9067sa c9067sa, String str, C8995ma c8995ma) {
        this.f41467h = c9067sa;
        this.f41460a = str;
        this.f41461b = true;
        this.f41463d = new BitSet();
        this.f41464e = new BitSet();
        this.f41465f = new C7928a();
        this.f41466g = new C7928a();
    }

    /* renamed from: a */
    public final void m38163a(AbstractC9043qa abstractC9043qa) {
        int mo38185a = abstractC9043qa.mo38185a();
        Boolean bool = abstractC9043qa.f41584c;
        if (bool != null) {
            this.f41464e.set(mo38185a, bool.booleanValue());
        }
        Boolean bool2 = abstractC9043qa.f41585d;
        if (bool2 != null) {
            this.f41463d.set(mo38185a, bool2.booleanValue());
        }
        if (abstractC9043qa.f41586e != null) {
            Map<Integer, Long> map = this.f41465f;
            Integer valueOf = Integer.valueOf(mo38185a);
            Long l10 = map.get(valueOf);
            long longValue = abstractC9043qa.f41586e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f41465f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC9043qa.f41587f != null) {
            Map<Integer, List<Long>> map2 = this.f41466g;
            Integer valueOf2 = Integer.valueOf(mo38185a);
            List<Long> list = map2.get(valueOf2);
            List<Long> list2 = list;
            if (list == null) {
                list2 = new ArrayList();
                this.f41466g.put(valueOf2, list2);
            }
            if (abstractC9043qa.mo38186b()) {
                list2.clear();
            }
            C8355ta.m35833a();
            C8900f m37797z = this.f41467h.f41723a.m37797z();
            String str = this.f41460a;
            C8976l3<Boolean> c8976l3 = C8988m3.f41356c0;
            if (m37797z.m37900w(str, c8976l3) && abstractC9043qa.mo38187c()) {
                list2.clear();
            }
            C8355ta.m35833a();
            boolean m37900w = this.f41467h.f41723a.m37797z().m37900w(this.f41460a, c8976l3);
            Long valueOf3 = Long.valueOf(abstractC9043qa.f41587f.longValue() / 1000);
            if (!m37900w) {
                list2.add(valueOf3);
            } else {
                if (list2.contains(valueOf3)) {
                    return;
                }
                list2.add(valueOf3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.List] */
    /* renamed from: b */
    public final C8226l1 m38164b(int i10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C8211k1 m35554H = C8226l1.m35554H();
        m35554H.m35521s(i10);
        m35554H.m35524z(this.f41461b);
        C8137f2 c8137f2 = this.f41462c;
        if (c8137f2 != null) {
            m35554H.m35523x(c8137f2);
        }
        C8122e2 m35336K = C8137f2.m35336K();
        m35336K.m35259x(C9145z9.m38444D(this.f41463d));
        m35336K.m35257s(C9145z9.m38444D(this.f41464e));
        Map<Integer, Long> map = this.f41465f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            Iterator<Integer> it = this.f41465f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                C8241m1 m35637E = C8256n1.m35637E();
                m35637E.m35600s(intValue);
                m35637E.m35601u(this.f41465f.get(Integer.valueOf(intValue)).longValue());
                arrayList.add(m35637E.m35445l());
            }
        }
        m35336K.m35253A(arrayList);
        Map<Integer, List<Long>> map2 = this.f41466g;
        if (map2 == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(map2.size());
            for (Integer num : this.f41466g.keySet()) {
                C8152g2 m35405F = C8167h2.m35405F();
                m35405F.m35383s(num.intValue());
                List<Long> list = this.f41466g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    m35405F.m35384u(list);
                }
                arrayList2.add((C8167h2) m35405F.m35445l());
            }
        }
        m35336K.m35255D(arrayList2);
        m35554H.m35522u(m35336K);
        return m35554H.m35445l();
    }
}
