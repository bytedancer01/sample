package p089f2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071e2.AbstractC4582k;
import p071e2.AbstractC4590s;
import p071e2.AbstractC4593v;
import p071e2.EnumC4575d;
import p071e2.InterfaceC4585n;
import p237o2.RunnableC6869b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f2/g.class
 */
/* renamed from: f2.g */
/* loaded from: combined.jar:classes1.jar:f2/g.class */
public class C4757g extends AbstractC4590s {

    /* renamed from: j */
    public static final String f28030j = AbstractC4582k.m23128f("WorkContinuationImpl");

    /* renamed from: a */
    public final C4759i f28031a;

    /* renamed from: b */
    public final String f28032b;

    /* renamed from: c */
    public final EnumC4575d f28033c;

    /* renamed from: d */
    public final List<? extends AbstractC4593v> f28034d;

    /* renamed from: e */
    public final List<String> f28035e;

    /* renamed from: f */
    public final List<String> f28036f;

    /* renamed from: g */
    public final List<C4757g> f28037g;

    /* renamed from: h */
    public boolean f28038h;

    /* renamed from: i */
    public InterfaceC4585n f28039i;

    public C4757g(C4759i c4759i, String str, EnumC4575d enumC4575d, List<? extends AbstractC4593v> list) {
        this(c4759i, str, enumC4575d, list, null);
    }

    public C4757g(C4759i c4759i, String str, EnumC4575d enumC4575d, List<? extends AbstractC4593v> list, List<C4757g> list2) {
        this.f28031a = c4759i;
        this.f28032b = str;
        this.f28033c = enumC4575d;
        this.f28034d = list;
        this.f28037g = list2;
        this.f28035e = new ArrayList(list.size());
        this.f28036f = new ArrayList();
        if (list2 != null) {
            Iterator<C4757g> it = list2.iterator();
            while (it.hasNext()) {
                this.f28036f.addAll(it.next().f28036f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String m23149a = list.get(i10).m23149a();
            this.f28035e.add(m23149a);
            this.f28036f.add(m23149a);
        }
    }

    public C4757g(C4759i c4759i, List<? extends AbstractC4593v> list) {
        this(c4759i, null, EnumC4575d.KEEP, list, null);
    }

    /* renamed from: i */
    public static boolean m24091i(C4757g c4757g, Set<String> set) {
        set.addAll(c4757g.m24095c());
        Set<String> m24092l = m24092l(c4757g);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (m24092l.contains(it.next())) {
                return true;
            }
        }
        List<C4757g> m24097e = c4757g.m24097e();
        if (m24097e != null && !m24097e.isEmpty()) {
            Iterator<C4757g> it2 = m24097e.iterator();
            while (it2.hasNext()) {
                if (m24091i(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c4757g.m24095c());
        return false;
    }

    /* renamed from: l */
    public static Set<String> m24092l(C4757g c4757g) {
        HashSet hashSet = new HashSet();
        List<C4757g> m24097e = c4757g.m24097e();
        if (m24097e != null && !m24097e.isEmpty()) {
            Iterator<C4757g> it = m24097e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().m24095c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public InterfaceC4585n m24093a() {
        if (this.f28038h) {
            AbstractC4582k.m23126c().mo23133h(f28030j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f28035e)), new Throwable[0]);
        } else {
            RunnableC6869b runnableC6869b = new RunnableC6869b(this);
            this.f28031a.m24120r().mo33902b(runnableC6869b);
            this.f28039i = runnableC6869b.m31701d();
        }
        return this.f28039i;
    }

    /* renamed from: b */
    public EnumC4575d m24094b() {
        return this.f28033c;
    }

    /* renamed from: c */
    public List<String> m24095c() {
        return this.f28035e;
    }

    /* renamed from: d */
    public String m24096d() {
        return this.f28032b;
    }

    /* renamed from: e */
    public List<C4757g> m24097e() {
        return this.f28037g;
    }

    /* renamed from: f */
    public List<? extends AbstractC4593v> m24098f() {
        return this.f28034d;
    }

    /* renamed from: g */
    public C4759i m24099g() {
        return this.f28031a;
    }

    /* renamed from: h */
    public boolean m24100h() {
        return m24091i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean m24101j() {
        return this.f28038h;
    }

    /* renamed from: k */
    public void m24102k() {
        this.f28038h = true;
    }
}
