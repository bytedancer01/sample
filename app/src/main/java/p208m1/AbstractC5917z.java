package p208m1;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.impl.auth.NTLMEngineImpl;
import p192l1.C5654j;
import p208m1.AbstractC5897f;
import p208m1.C5895d;
import p208m1.C5898g;
import p208m1.C5901j;
import p208m1.C5908q;
import p208m1.C5909r;
import p208m1.C5910s;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:m1/z.class
 */
/* renamed from: m1.z */
/* loaded from: combined.jar:classes1.jar:m1/z.class */
public abstract class AbstractC5917z extends AbstractC5897f {

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/z$a.class
     */
    /* renamed from: m1.z$a */
    /* loaded from: combined.jar:classes1.jar:m1/z$a.class */
    public static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // p208m1.AbstractC5917z.d, p208m1.AbstractC5917z.c, p208m1.AbstractC5917z.b
        /* renamed from: O */
        public void mo29152O(b.C10321b c10321b, C5895d.a aVar) {
            super.mo29152O(c10321b, aVar);
            aVar.m28794i(C5907p.m29023a(c10321b.f33284a));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/z$b.class
     */
    /* renamed from: m1.z$b */
    /* loaded from: combined.jar:classes1.jar:m1/z$b.class */
    public static class b extends AbstractC5917z implements C5908q.a, C5908q.e {

        /* renamed from: t */
        public static final ArrayList<IntentFilter> f33271t;

        /* renamed from: u */
        public static final ArrayList<IntentFilter> f33272u;

        /* renamed from: j */
        public final e f33273j;

        /* renamed from: k */
        public final Object f33274k;

        /* renamed from: l */
        public final Object f33275l;

        /* renamed from: m */
        public final Object f33276m;

        /* renamed from: n */
        public final Object f33277n;

        /* renamed from: o */
        public int f33278o;

        /* renamed from: p */
        public boolean f33279p;

        /* renamed from: q */
        public boolean f33280q;

        /* renamed from: r */
        public final ArrayList<C10321b> f33281r;

        /* renamed from: s */
        public final ArrayList<c> f33282s;

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/z$b$a.class
         */
        /* renamed from: m1.z$b$a */
        /* loaded from: combined.jar:classes1.jar:m1/z$b$a.class */
        public static final class a extends AbstractC5897f.e {

            /* renamed from: a */
            public final Object f33283a;

            public a(Object obj) {
                this.f33283a = obj;
            }

            @Override // p208m1.AbstractC5897f.e
            /* renamed from: f */
            public void mo28752f(int i10) {
                C5908q.c.m29050i(this.f33283a, i10);
            }

            @Override // p208m1.AbstractC5897f.e
            /* renamed from: i */
            public void mo28753i(int i10) {
                C5908q.c.m29051j(this.f33283a, i10);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/z$b$b.class
         */
        /* renamed from: m1.z$b$b, reason: collision with other inner class name */
        /* loaded from: combined.jar:classes1.jar:m1/z$b$b.class */
        public static final class C10321b {

            /* renamed from: a */
            public final Object f33284a;

            /* renamed from: b */
            public final String f33285b;

            /* renamed from: c */
            public C5895d f33286c;

            public C10321b(Object obj, String str) {
                this.f33284a = obj;
                this.f33285b = str;
            }
        }

        /* JADX WARN: Classes with same name are omitted:
          classes1.jar:m1/z$b$c.class
         */
        /* renamed from: m1.z$b$c */
        /* loaded from: combined.jar:classes1.jar:m1/z$b$c.class */
        public static final class c {

            /* renamed from: a */
            public final C5901j.h f33287a;

            /* renamed from: b */
            public final Object f33288b;

            public c(C5901j.h hVar, Object obj) {
                this.f33287a = hVar;
                this.f33288b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            f33271t = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            f33272u = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.f33281r = new ArrayList<>();
            this.f33282s = new ArrayList<>();
            this.f33273j = eVar;
            Object m29028e = C5908q.m29028e(context);
            this.f33274k = m29028e;
            this.f33275l = mo29155G();
            this.f33276m = m29156H();
            this.f33277n = C5908q.m29025b(m29028e, context.getResources().getString(C5654j.f31898s), false);
            m29167T();
        }

        @Override // p208m1.AbstractC5917z
        /* renamed from: A */
        public void mo29148A(C5901j.h hVar) {
            if (hVar.m29002r() == this) {
                int m29157I = m29157I(C5908q.m29030g(this.f33274k, 8388611));
                if (m29157I < 0 || !this.f33281r.get(m29157I).f33285b.equals(hVar.m28989e())) {
                    return;
                }
                hVar.m28981I();
                return;
            }
            Object m29026c = C5908q.m29026c(this.f33274k, this.f33277n);
            c cVar = new c(hVar, m29026c);
            C5908q.c.m29052k(m29026c, cVar);
            C5908q.d.m29058f(m29026c, this.f33276m);
            mo29168U(cVar);
            this.f33282s.add(cVar);
            C5908q.m29024a(this.f33274k, m29026c);
        }

        @Override // p208m1.AbstractC5917z
        /* renamed from: B */
        public void mo29149B(C5901j.h hVar) {
            int m29159K;
            if (hVar.m29002r() == this || (m29159K = m29159K(hVar)) < 0) {
                return;
            }
            mo29168U(this.f33282s.get(m29159K));
        }

        @Override // p208m1.AbstractC5917z
        /* renamed from: C */
        public void mo29150C(C5901j.h hVar) {
            int m29159K;
            if (hVar.m29002r() == this || (m29159K = m29159K(hVar)) < 0) {
                return;
            }
            c remove = this.f33282s.remove(m29159K);
            C5908q.c.m29052k(remove.f33288b, null);
            C5908q.d.m29058f(remove.f33288b, null);
            C5908q.m29032i(this.f33274k, remove.f33288b);
        }

        @Override // p208m1.AbstractC5917z
        /* renamed from: D */
        public void mo29151D(C5901j.h hVar) {
            Object obj;
            if (hVar.m28976C()) {
                if (hVar.m29002r() != this) {
                    int m29159K = m29159K(hVar);
                    if (m29159K < 0) {
                        return;
                    } else {
                        obj = this.f33282s.get(m29159K).f33288b;
                    }
                } else {
                    int m29158J = m29158J(hVar.m28989e());
                    if (m29158J < 0) {
                        return;
                    } else {
                        obj = this.f33281r.get(m29158J).f33284a;
                    }
                }
                mo29164Q(obj);
            }
        }

        /* renamed from: E */
        public final boolean m29153E(Object obj) {
            if (m29162N(obj) != null || m29157I(obj) >= 0) {
                return false;
            }
            C10321b c10321b = new C10321b(obj, m29154F(obj));
            m29166S(c10321b);
            this.f33281r.add(c10321b);
            return true;
        }

        /* renamed from: F */
        public final String m29154F(Object obj) {
            String format = mo29160L() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(m29161M(obj).hashCode()));
            if (m29158J(format) < 0) {
                return format;
            }
            int i10 = 2;
            while (true) {
                String format2 = String.format(Locale.US, "%s_%d", format, Integer.valueOf(i10));
                if (m29158J(format2) < 0) {
                    return format2;
                }
                i10++;
            }
        }

        /* renamed from: G */
        public Object mo29155G() {
            throw null;
        }

        /* renamed from: H */
        public Object m29156H() {
            return C5908q.m29027d(this);
        }

        /* renamed from: I */
        public int m29157I(Object obj) {
            int size = this.f33281r.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33281r.get(i10).f33284a == obj) {
                    return i10;
                }
            }
            return -1;
        }

        /* renamed from: J */
        public int m29158J(String str) {
            int size = this.f33281r.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33281r.get(i10).f33285b.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        /* renamed from: K */
        public int m29159K(C5901j.h hVar) {
            int size = this.f33282s.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f33282s.get(i10).f33287a == hVar) {
                    return i10;
                }
            }
            return -1;
        }

        /* renamed from: L */
        public Object mo29160L() {
            throw null;
        }

        /* renamed from: M */
        public String m29161M(Object obj) {
            CharSequence m29042a = C5908q.c.m29042a(obj, m28813n());
            return m29042a != null ? m29042a.toString() : "";
        }

        /* renamed from: N */
        public c m29162N(Object obj) {
            Object m29046e = C5908q.c.m29046e(obj);
            return m29046e instanceof c ? (c) m29046e : null;
        }

        /* renamed from: O */
        public void mo29152O(C10321b c10321b, C5895d.a aVar) {
            int m29045d = C5908q.c.m29045d(c10321b.f33284a);
            if ((m29045d & 1) != 0) {
                aVar.m28787b(f33271t);
            }
            if ((m29045d & 2) != 0) {
                aVar.m28787b(f33272u);
            }
            aVar.m28801p(C5908q.c.m29044c(c10321b.f33284a));
            aVar.m28800o(C5908q.c.m29043b(c10321b.f33284a));
            aVar.m28803r(C5908q.c.m29047f(c10321b.f33284a));
            aVar.m28805t(C5908q.c.m29049h(c10321b.f33284a));
            aVar.m28804s(C5908q.c.m29048g(c10321b.f33284a));
        }

        /* renamed from: P */
        public void m29163P() {
            C5898g.a aVar = new C5898g.a();
            int size = this.f33281r.size();
            for (int i10 = 0; i10 < size; i10++) {
                aVar.m28847a(this.f33281r.get(i10).f33286c);
            }
            m28818w(aVar.m28849c());
        }

        /* renamed from: Q */
        public void mo29164Q(Object obj) {
            throw null;
        }

        /* renamed from: R */
        public void mo29165R() {
            throw null;
        }

        /* renamed from: S */
        public void m29166S(C10321b c10321b) {
            C5895d.a aVar = new C5895d.a(c10321b.f33285b, m29161M(c10321b.f33284a));
            mo29152O(c10321b, aVar);
            c10321b.f33286c = aVar.m28790e();
        }

        /* renamed from: T */
        public final void m29167T() {
            boolean z10;
            mo29165R();
            Iterator it = C5908q.m29029f(this.f33274k).iterator();
            boolean z11 = false;
            while (true) {
                z10 = z11;
                if (!it.hasNext()) {
                    break;
                } else {
                    z11 = z10 | m29153E(it.next());
                }
            }
            if (z10) {
                m29163P();
            }
        }

        /* renamed from: U */
        public void mo29168U(c cVar) {
            C5908q.d.m29053a(cVar.f33288b, cVar.f33287a.m28997m());
            C5908q.d.m29055c(cVar.f33288b, cVar.f33287a.m28999o());
            C5908q.d.m29054b(cVar.f33288b, cVar.f33287a.m28998n());
            C5908q.d.m29057e(cVar.f33288b, cVar.f33287a.m29003s());
            C5908q.d.m29060h(cVar.f33288b, cVar.f33287a.m29005u());
            C5908q.d.m29059g(cVar.f33288b, cVar.f33287a.m29004t());
        }

        @Override // p208m1.C5908q.e
        /* renamed from: a */
        public void mo29061a(Object obj, int i10) {
            c m29162N = m29162N(obj);
            if (m29162N != null) {
                m29162N.f33287a.m28980H(i10);
            }
        }

        @Override // p208m1.C5908q.a
        /* renamed from: b */
        public void mo29034b(Object obj, Object obj2) {
        }

        @Override // p208m1.C5908q.a
        /* renamed from: c */
        public void mo29035c(Object obj, Object obj2, int i10) {
        }

        @Override // p208m1.C5908q.e
        /* renamed from: d */
        public void mo29062d(Object obj, int i10) {
            c m29162N = m29162N(obj);
            if (m29162N != null) {
                m29162N.f33287a.m28979G(i10);
            }
        }

        @Override // p208m1.C5908q.a
        /* renamed from: e */
        public void mo29036e(Object obj) {
            int m29157I;
            if (m29162N(obj) != null || (m29157I = m29157I(obj)) < 0) {
                return;
            }
            m29166S(this.f33281r.get(m29157I));
            m29163P();
        }

        @Override // p208m1.C5908q.a
        /* renamed from: f */
        public void mo29037f(int i10, Object obj) {
        }

        @Override // p208m1.C5908q.a
        /* renamed from: g */
        public void mo29038g(Object obj) {
            int m29157I;
            if (m29162N(obj) != null || (m29157I = m29157I(obj)) < 0) {
                return;
            }
            this.f33281r.remove(m29157I);
            m29163P();
        }

        @Override // p208m1.C5908q.a
        /* renamed from: h */
        public void mo29039h(int i10, Object obj) {
            if (obj != C5908q.m29030g(this.f33274k, 8388611)) {
                return;
            }
            c m29162N = m29162N(obj);
            if (m29162N != null) {
                m29162N.f33287a.m28981I();
                return;
            }
            int m29157I = m29157I(obj);
            if (m29157I >= 0) {
                this.f33273j.mo28920a(this.f33281r.get(m29157I).f33285b);
            }
        }

        @Override // p208m1.C5908q.a
        /* renamed from: j */
        public void mo29040j(Object obj) {
            if (m29153E(obj)) {
                m29163P();
            }
        }

        @Override // p208m1.C5908q.a
        /* renamed from: k */
        public void mo29041k(Object obj) {
            int m29157I;
            if (m29162N(obj) != null || (m29157I = m29157I(obj)) < 0) {
                return;
            }
            C10321b c10321b = this.f33281r.get(m29157I);
            int m29047f = C5908q.c.m29047f(obj);
            if (m29047f != c10321b.f33286c.m28781t()) {
                c10321b.f33286c = new C5895d.a(c10321b.f33286c).m28803r(m29047f).m28790e();
                m29163P();
            }
        }

        @Override // p208m1.AbstractC5897f
        /* renamed from: s */
        public AbstractC5897f.e mo28743s(String str) {
            int m29158J = m29158J(str);
            if (m29158J >= 0) {
                return new a(this.f33281r.get(m29158J).f33284a);
            }
            return null;
        }

        @Override // p208m1.AbstractC5897f
        /* renamed from: u */
        public void mo28745u(C5896e c5896e) {
            boolean z10;
            int i10;
            int i11;
            int i12 = 0;
            if (c5896e != null) {
                List<String> m28856e = c5896e.m28808c().m28856e();
                int size = m28856e.size();
                i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    String str = m28856e.get(i13);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i10 = i12;
                        i11 = 1;
                    } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        i10 = i12;
                        i11 = 2;
                    } else {
                        i10 = i12;
                        i11 = NTLMEngineImpl.FLAG_TARGETINFO_PRESENT;
                    }
                    i12 = i10 | i11;
                }
                z10 = c5896e.m28809d();
            } else {
                z10 = false;
            }
            if (this.f33278o == i12 && this.f33279p == z10) {
                return;
            }
            this.f33278o = i12;
            this.f33279p = z10;
            m29167T();
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/z$c.class
     */
    /* renamed from: m1.z$c */
    /* loaded from: combined.jar:classes1.jar:m1/z$c.class */
    public static class c extends b implements C5909r.a {
        public c(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // p208m1.AbstractC5917z.b
        /* renamed from: G */
        public Object mo29155G() {
            return C5909r.m29063a(this);
        }

        @Override // p208m1.AbstractC5917z.b
        /* renamed from: O */
        public void mo29152O(b.C10321b c10321b, C5895d.a aVar) {
            super.mo29152O(c10321b, aVar);
            if (!C5909r.c.m29066b(c10321b.f33284a)) {
                aVar.m28795j(false);
            }
            if (mo29169V(c10321b)) {
                aVar.m28792g(1);
            }
            Display m29065a = C5909r.c.m29065a(c10321b.f33284a);
            if (m29065a != null) {
                aVar.m28802q(m29065a.getDisplayId());
            }
        }

        /* renamed from: V */
        public boolean mo29169V(b.C10321b c10321b) {
            throw null;
        }

        @Override // p208m1.C5909r.a
        /* renamed from: i */
        public void mo29064i(Object obj) {
            int m29157I = m29157I(obj);
            if (m29157I >= 0) {
                b.C10321b c10321b = this.f33281r.get(m29157I);
                Display m29065a = C5909r.c.m29065a(obj);
                int displayId = m29065a != null ? m29065a.getDisplayId() : -1;
                if (displayId != c10321b.f33286c.m28779r()) {
                    c10321b.f33286c = new C5895d.a(c10321b.f33286c).m28802q(displayId).m28790e();
                    m29163P();
                }
            }
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/z$d.class
     */
    /* renamed from: m1.z$d */
    /* loaded from: combined.jar:classes1.jar:m1/z$d.class */
    public static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // p208m1.AbstractC5917z.b
        /* renamed from: L */
        public Object mo29160L() {
            return C5910s.m29068b(this.f33274k);
        }

        @Override // p208m1.AbstractC5917z.c, p208m1.AbstractC5917z.b
        /* renamed from: O */
        public void mo29152O(b.C10321b c10321b, C5895d.a aVar) {
            super.mo29152O(c10321b, aVar);
            CharSequence m29069a = C5910s.a.m29069a(c10321b.f33284a);
            if (m29069a != null) {
                aVar.m28793h(m29069a.toString());
            }
        }

        @Override // p208m1.AbstractC5917z.b
        /* renamed from: Q */
        public void mo29164Q(Object obj) {
            C5908q.m29033j(this.f33274k, 8388611, obj);
        }

        @Override // p208m1.AbstractC5917z.b
        /* renamed from: R */
        public void mo29165R() {
            if (this.f33280q) {
                C5908q.m29031h(this.f33274k, this.f33275l);
            }
            this.f33280q = true;
            C5910s.m29067a(this.f33274k, this.f33278o, this.f33275l, (this.f33279p ? 1 : 0) | 2);
        }

        @Override // p208m1.AbstractC5917z.b
        /* renamed from: U */
        public void mo29168U(b.c cVar) {
            super.mo29168U(cVar);
            C5910s.b.m29071a(cVar.f33288b, cVar.f33287a.m28988d());
        }

        @Override // p208m1.AbstractC5917z.c
        /* renamed from: V */
        public boolean mo29169V(b.C10321b c10321b) {
            return C5910s.a.m29070b(c10321b.f33284a);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:m1/z$e.class
     */
    /* renamed from: m1.z$e */
    /* loaded from: combined.jar:classes1.jar:m1/z$e.class */
    public interface e {
        /* renamed from: a */
        void mo28920a(String str);
    }

    public AbstractC5917z(Context context) {
        super(context, new AbstractC5897f.d(new ComponentName("android", AbstractC5917z.class.getName())));
    }

    /* renamed from: z */
    public static AbstractC5917z m29147z(Context context, e eVar) {
        return Build.VERSION.SDK_INT >= 24 ? new a(context, eVar) : new d(context, eVar);
    }

    /* renamed from: A */
    public void mo29148A(C5901j.h hVar) {
    }

    /* renamed from: B */
    public void mo29149B(C5901j.h hVar) {
    }

    /* renamed from: C */
    public void mo29150C(C5901j.h hVar) {
    }

    /* renamed from: D */
    public void mo29151D(C5901j.h hVar) {
    }
}
