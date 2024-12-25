package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p221n0.C6614f;
import p221n0.InterfaceC6613e;
import p294r.C7933f;
import p294r.C7936i;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:androidx/recyclerview/widget/s.class
 */
/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/s.class */
public class C0720s {

    /* renamed from: a */
    public final C7936i<RecyclerView.AbstractC0674e0, a> f4974a = new C7936i<>();

    /* renamed from: b */
    public final C7933f<RecyclerView.AbstractC0674e0> f4975b = new C7933f<>();

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/s$a.class
     */
    /* renamed from: androidx.recyclerview.widget.s$a */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/s$a.class */
    public static class a {

        /* renamed from: d */
        public static InterfaceC6613e<a> f4976d = new C6614f(20);

        /* renamed from: a */
        public int f4977a;

        /* renamed from: b */
        public RecyclerView.AbstractC0682m.c f4978b;

        /* renamed from: c */
        public RecyclerView.AbstractC0682m.c f4979c;

        /* renamed from: a */
        public static void m4700a() {
            while (f4976d.mo30521b() != null) {
            }
        }

        /* renamed from: b */
        public static a m4701b() {
            a mo30521b = f4976d.mo30521b();
            a aVar = mo30521b;
            if (mo30521b == null) {
                aVar = new a();
            }
            return aVar;
        }

        /* renamed from: c */
        public static void m4702c(a aVar) {
            aVar.f4977a = 0;
            aVar.f4978b = null;
            aVar.f4979c = null;
            f4976d.mo30520a(aVar);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:androidx/recyclerview/widget/s$b.class
     */
    /* renamed from: androidx.recyclerview.widget.s$b */
    /* loaded from: combined.jar:classes1.jar:androidx/recyclerview/widget/s$b.class */
    public interface b {
        /* renamed from: a */
        void mo4017a(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar, RecyclerView.AbstractC0682m.c cVar2);

        /* renamed from: b */
        void mo4018b(RecyclerView.AbstractC0674e0 abstractC0674e0);

        /* renamed from: c */
        void mo4019c(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar, RecyclerView.AbstractC0682m.c cVar2);

        /* renamed from: d */
        void mo4020d(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar, RecyclerView.AbstractC0682m.c cVar2);
    }

    /* renamed from: a */
    public void m4683a(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar) {
        a aVar = this.f4974a.get(abstractC0674e0);
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = a.m4701b();
            this.f4974a.put(abstractC0674e0, aVar2);
        }
        aVar2.f4977a |= 2;
        aVar2.f4978b = cVar;
    }

    /* renamed from: b */
    public void m4684b(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        a aVar = this.f4974a.get(abstractC0674e0);
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = a.m4701b();
            this.f4974a.put(abstractC0674e0, aVar2);
        }
        aVar2.f4977a |= 1;
    }

    /* renamed from: c */
    public void m4685c(long j10, RecyclerView.AbstractC0674e0 abstractC0674e0) {
        this.f4975b.m34403j(j10, abstractC0674e0);
    }

    /* renamed from: d */
    public void m4686d(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar) {
        a aVar = this.f4974a.get(abstractC0674e0);
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = a.m4701b();
            this.f4974a.put(abstractC0674e0, aVar2);
        }
        aVar2.f4979c = cVar;
        aVar2.f4977a |= 8;
    }

    /* renamed from: e */
    public void m4687e(RecyclerView.AbstractC0674e0 abstractC0674e0, RecyclerView.AbstractC0682m.c cVar) {
        a aVar = this.f4974a.get(abstractC0674e0);
        a aVar2 = aVar;
        if (aVar == null) {
            aVar2 = a.m4701b();
            this.f4974a.put(abstractC0674e0, aVar2);
        }
        aVar2.f4978b = cVar;
        aVar2.f4977a |= 4;
    }

    /* renamed from: f */
    public void m4688f() {
        this.f4974a.clear();
        this.f4975b.m34396b();
    }

    /* renamed from: g */
    public RecyclerView.AbstractC0674e0 m4689g(long j10) {
        return this.f4975b.m34399e(j10);
    }

    /* renamed from: h */
    public boolean m4690h(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        a aVar = this.f4974a.get(abstractC0674e0);
        boolean z10 = true;
        if (aVar == null || (aVar.f4977a & 1) == 0) {
            z10 = false;
        }
        return z10;
    }

    /* renamed from: i */
    public boolean m4691i(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        a aVar = this.f4974a.get(abstractC0674e0);
        return (aVar == null || (aVar.f4977a & 4) == 0) ? false : true;
    }

    /* renamed from: j */
    public void m4692j() {
        a.m4700a();
    }

    /* renamed from: k */
    public void m4693k(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        m4698p(abstractC0674e0);
    }

    /* renamed from: l */
    public final RecyclerView.AbstractC0682m.c m4694l(RecyclerView.AbstractC0674e0 abstractC0674e0, int i10) {
        a m34443n;
        RecyclerView.AbstractC0682m.c cVar;
        int m34436g = this.f4974a.m34436g(abstractC0674e0);
        if (m34436g < 0 || (m34443n = this.f4974a.m34443n(m34436g)) == null) {
            return null;
        }
        int i11 = m34443n.f4977a;
        if ((i11 & i10) == 0) {
            return null;
        }
        int i12 = (i10 ^ (-1)) & i11;
        m34443n.f4977a = i12;
        if (i10 == 4) {
            cVar = m34443n.f4978b;
        } else {
            if (i10 != 8) {
                throw new IllegalArgumentException("Must provide flag PRE or POST");
            }
            cVar = m34443n.f4979c;
        }
        if ((i12 & 12) == 0) {
            this.f4974a.m34441l(m34436g);
            a.m4702c(m34443n);
        }
        return cVar;
    }

    /* renamed from: m */
    public RecyclerView.AbstractC0682m.c m4695m(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        return m4694l(abstractC0674e0, 8);
    }

    /* renamed from: n */
    public RecyclerView.AbstractC0682m.c m4696n(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        return m4694l(abstractC0674e0, 4);
    }

    /* renamed from: o */
    public void m4697o(b bVar) {
        RecyclerView.AbstractC0682m.c cVar;
        RecyclerView.AbstractC0682m.c cVar2;
        for (int size = this.f4974a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0674e0 m34439j = this.f4974a.m34439j(size);
            a m34441l = this.f4974a.m34441l(size);
            int i10 = m34441l.f4977a;
            if ((i10 & 3) != 3) {
                if ((i10 & 1) != 0) {
                    cVar = m34441l.f4978b;
                    cVar2 = cVar != null ? m34441l.f4979c : null;
                } else {
                    if ((i10 & 14) != 14) {
                        if ((i10 & 12) == 12) {
                            bVar.mo4020d(m34439j, m34441l.f4978b, m34441l.f4979c);
                        } else if ((i10 & 4) != 0) {
                            cVar = m34441l.f4978b;
                        } else if ((i10 & 8) == 0) {
                        }
                        a.m4702c(m34441l);
                    }
                    bVar.mo4017a(m34439j, m34441l.f4978b, m34441l.f4979c);
                    a.m4702c(m34441l);
                }
                bVar.mo4019c(m34439j, cVar, cVar2);
                a.m4702c(m34441l);
            }
            bVar.mo4018b(m34439j);
            a.m4702c(m34441l);
        }
    }

    /* renamed from: p */
    public void m4698p(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        a aVar = this.f4974a.get(abstractC0674e0);
        if (aVar == null) {
            return;
        }
        aVar.f4977a &= -2;
    }

    /* renamed from: q */
    public void m4699q(RecyclerView.AbstractC0674e0 abstractC0674e0) {
        int m34406m = this.f4975b.m34406m() - 1;
        while (true) {
            if (m34406m < 0) {
                break;
            }
            if (abstractC0674e0 == this.f4975b.m34407n(m34406m)) {
                this.f4975b.m34405l(m34406m);
                break;
            }
            m34406m--;
        }
        a remove = this.f4974a.remove(abstractC0674e0);
        if (remove != null) {
            a.m4702c(remove);
        }
    }
}
