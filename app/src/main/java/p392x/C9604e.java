package p392x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p373w.C9385e;
import p373w.C9386f;
import p373w.C9387g;
import p373w.C9389i;
import p392x.C9601b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:x/e.class
 */
/* renamed from: x.e */
/* loaded from: combined.jar:classes1.jar:x/e.class */
public class C9604e {

    /* renamed from: a */
    public C9386f f43871a;

    /* renamed from: d */
    public C9386f f43874d;

    /* renamed from: b */
    public boolean f43872b = true;

    /* renamed from: c */
    public boolean f43873c = true;

    /* renamed from: e */
    public ArrayList<AbstractC9612m> f43875e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<C9610k> f43876f = new ArrayList<>();

    /* renamed from: g */
    public C9601b.b f43877g = null;

    /* renamed from: h */
    public C9601b.a f43878h = new C9601b.a();

    /* renamed from: i */
    public ArrayList<C9610k> f43879i = new ArrayList<>();

    public C9604e(C9386f c9386f) {
        this.f43871a = c9386f;
        this.f43874d = c9386f;
    }

    /* renamed from: a */
    public final void m40458a(C9605f c9605f, int i10, int i11, C9605f c9605f2, ArrayList<C9610k> arrayList, C9610k c9610k) {
        AbstractC9612m abstractC9612m = c9605f.f43883d;
        if (abstractC9612m.f43908c == null) {
            C9386f c9386f = this.f43871a;
            if (abstractC9612m == c9386f.f42981e || abstractC9612m == c9386f.f42983f) {
                return;
            }
            C9610k c9610k2 = c9610k;
            if (c9610k == null) {
                c9610k2 = new C9610k(abstractC9612m, i11);
                arrayList.add(c9610k2);
            }
            abstractC9612m.f43908c = c9610k2;
            c9610k2.m40479a(abstractC9612m);
            for (InterfaceC9603d interfaceC9603d : abstractC9612m.f43913h.f43890k) {
                if (interfaceC9603d instanceof C9605f) {
                    m40458a((C9605f) interfaceC9603d, i10, 0, c9605f2, arrayList, c9610k2);
                }
            }
            for (InterfaceC9603d interfaceC9603d2 : abstractC9612m.f43914i.f43890k) {
                if (interfaceC9603d2 instanceof C9605f) {
                    m40458a((C9605f) interfaceC9603d2, i10, 1, c9605f2, arrayList, c9610k2);
                }
            }
            if (i10 == 1 && (abstractC9612m instanceof C9611l)) {
                for (InterfaceC9603d interfaceC9603d3 : ((C9611l) abstractC9612m).f43903k.f43890k) {
                    if (interfaceC9603d3 instanceof C9605f) {
                        m40458a((C9605f) interfaceC9603d3, i10, 2, c9605f2, arrayList, c9610k2);
                    }
                }
            }
            for (C9605f c9605f3 : abstractC9612m.f43913h.f43891l) {
                if (c9605f3 == c9605f2) {
                    c9610k2.f43897b = true;
                }
                m40458a(c9605f3, i10, 0, c9605f2, arrayList, c9610k2);
            }
            for (C9605f c9605f4 : abstractC9612m.f43914i.f43891l) {
                if (c9605f4 == c9605f2) {
                    c9610k2.f43897b = true;
                }
                m40458a(c9605f4, i10, 1, c9605f2, arrayList, c9610k2);
            }
            if (i10 == 1 && (abstractC9612m instanceof C9611l)) {
                Iterator<C9605f> it = ((C9611l) abstractC9612m).f43903k.f43891l.iterator();
                while (it.hasNext()) {
                    m40458a(it.next(), i10, 2, c9605f2, arrayList, c9610k2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r0.f42997m == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        if (r0.f42950D.f42941d == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        if (r0.f42951E.f42941d == null) goto L61;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m40459b(p373w.C9386f r8) {
        /*
            Method dump skipped, instructions count: 1297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.C9604e.m40459b(w.f):boolean");
    }

    /* renamed from: c */
    public void m40460c() {
        m40461d(this.f43875e);
        this.f43879i.clear();
        C9610k.f43895h = 0;
        m40466i(this.f43871a.f42981e, 0, this.f43879i);
        m40466i(this.f43871a.f42983f, 1, this.f43879i);
        this.f43872b = false;
    }

    /* renamed from: d */
    public void m40461d(ArrayList<AbstractC9612m> arrayList) {
        AbstractC9612m c9607h;
        HashSet hashSet;
        arrayList.clear();
        this.f43874d.f42981e.mo40452f();
        this.f43874d.f42983f.mo40452f();
        arrayList.add(this.f43874d.f42981e);
        arrayList.add(this.f43874d.f42983f);
        Iterator<C9385e> it = this.f43874d.f43068w0.iterator();
        HashSet hashSet2 = null;
        while (it.hasNext()) {
            C9385e next = it.next();
            if (next instanceof C9387g) {
                c9607h = new C9607h(next);
            } else {
                if (next.m39614T()) {
                    if (next.f42977c == null) {
                        next.f42977c = new C9602c(next, 0);
                    }
                    HashSet hashSet3 = hashSet2;
                    if (hashSet2 == null) {
                        hashSet3 = new HashSet();
                    }
                    hashSet3.add(next.f42977c);
                    hashSet2 = hashSet3;
                } else {
                    arrayList.add(next.f42981e);
                }
                if (next.m39616V()) {
                    if (next.f42979d == null) {
                        next.f42979d = new C9602c(next, 1);
                    }
                    hashSet = hashSet2;
                    if (hashSet2 == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f42979d);
                } else {
                    arrayList.add(next.f42983f);
                    hashSet = hashSet2;
                }
                hashSet2 = hashSet;
                if (next instanceof C9389i) {
                    hashSet2 = hashSet;
                    c9607h = new C9608i(next);
                }
            }
            arrayList.add(c9607h);
        }
        if (hashSet2 != null) {
            arrayList.addAll(hashSet2);
        }
        Iterator<AbstractC9612m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo40452f();
        }
        Iterator<AbstractC9612m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC9612m next2 = it3.next();
            if (next2.f43907b != this.f43874d) {
                next2.mo40450d();
            }
        }
    }

    /* renamed from: e */
    public final int m40462e(C9386f c9386f, int i10) {
        int size = this.f43879i.size();
        long j10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            j10 = Math.max(j10, this.f43879i.get(i11).m40480b(c9386f, i10));
        }
        return (int) j10;
    }

    /* renamed from: f */
    public boolean m40463f(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13 = z10 & true;
        if (this.f43872b || this.f43873c) {
            Iterator<C9385e> it = this.f43871a.f43068w0.iterator();
            while (it.hasNext()) {
                C9385e next = it.next();
                next.f42973a = false;
                next.f42981e.m40478r();
                next.f42983f.m40483q();
            }
            C9386f c9386f = this.f43871a;
            c9386f.f42973a = false;
            c9386f.f42981e.m40478r();
            this.f43871a.f42983f.m40483q();
            this.f43873c = false;
        }
        if (m40459b(this.f43874d)) {
            return false;
        }
        this.f43871a.m39593C0(0);
        this.f43871a.m39595D0(0);
        C9385e.b m39648q = this.f43871a.m39648q(0);
        C9385e.b m39648q2 = this.f43871a.m39648q(1);
        if (this.f43872b) {
            m40460c();
        }
        int m39609O = this.f43871a.m39609O();
        int m39610P = this.f43871a.m39610P();
        this.f43871a.f42981e.f43913h.mo40474d(m39609O);
        this.f43871a.f42983f.f43913h.mo40474d(m39610P);
        m40470m();
        C9385e.b bVar = C9385e.b.WRAP_CONTENT;
        if (m39648q == bVar || m39648q2 == bVar) {
            boolean z14 = z13;
            if (z13) {
                Iterator<AbstractC9612m> it2 = this.f43875e.iterator();
                while (true) {
                    z14 = z13;
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().mo40454m()) {
                        z14 = false;
                        break;
                    }
                }
            }
            if (z14 && m39648q == C9385e.b.WRAP_CONTENT) {
                this.f43871a.m39633i0(C9385e.b.FIXED);
                C9386f c9386f2 = this.f43871a;
                c9386f2.m39591B0(m40462e(c9386f2, 0));
                C9386f c9386f3 = this.f43871a;
                c9386f3.f42981e.f43910e.mo40474d(c9386f3.m39608N());
            }
            if (z14 && m39648q2 == C9385e.b.WRAP_CONTENT) {
                this.f43871a.m39663x0(C9385e.b.FIXED);
                C9386f c9386f4 = this.f43871a;
                c9386f4.m39627e0(m40462e(c9386f4, 1));
                C9386f c9386f5 = this.f43871a;
                c9386f5.f42983f.f43910e.mo40474d(c9386f5.m39654t());
            }
        }
        C9386f c9386f6 = this.f43871a;
        C9385e.b bVar2 = c9386f6.f42959M[0];
        C9385e.b bVar3 = C9385e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == C9385e.b.MATCH_PARENT) {
            int m39608N = c9386f6.m39608N() + m39609O;
            this.f43871a.f42981e.f43914i.mo40474d(m39608N);
            this.f43871a.f42981e.f43910e.mo40474d(m39608N - m39609O);
            m40470m();
            C9386f c9386f7 = this.f43871a;
            C9385e.b bVar4 = c9386f7.f42959M[1];
            if (bVar4 == bVar3 || bVar4 == C9385e.b.MATCH_PARENT) {
                int m39654t = c9386f7.m39654t() + m39610P;
                this.f43871a.f42983f.f43914i.mo40474d(m39654t);
                this.f43871a.f42983f.f43910e.mo40474d(m39654t - m39610P);
            }
            m40470m();
            z11 = true;
        } else {
            z11 = false;
        }
        Iterator<AbstractC9612m> it3 = this.f43875e.iterator();
        while (it3.hasNext()) {
            AbstractC9612m next2 = it3.next();
            if (next2.f43907b != this.f43871a || next2.f43912g) {
                next2.mo40451e();
            }
        }
        Iterator<AbstractC9612m> it4 = this.f43875e.iterator();
        while (true) {
            z12 = true;
            if (!it4.hasNext()) {
                break;
            }
            AbstractC9612m next3 = it4.next();
            if (z11 || next3.f43907b != this.f43871a) {
                if (!next3.f43913h.f43889j || ((!next3.f43914i.f43889j && !(next3 instanceof C9607h)) || (!next3.f43910e.f43889j && !(next3 instanceof C9602c) && !(next3 instanceof C9607h)))) {
                    break;
                }
            }
        }
        z12 = false;
        this.f43871a.m39633i0(m39648q);
        this.f43871a.m39663x0(m39648q2);
        return z12;
    }

    /* renamed from: g */
    public boolean m40464g(boolean z10) {
        if (this.f43872b) {
            Iterator<C9385e> it = this.f43871a.f43068w0.iterator();
            while (it.hasNext()) {
                C9385e next = it.next();
                next.f42973a = false;
                C9609j c9609j = next.f42981e;
                c9609j.f43910e.f43889j = false;
                c9609j.f43912g = false;
                c9609j.m40478r();
                C9611l c9611l = next.f42983f;
                c9611l.f43910e.f43889j = false;
                c9611l.f43912g = false;
                c9611l.m40483q();
            }
            C9386f c9386f = this.f43871a;
            c9386f.f42973a = false;
            C9609j c9609j2 = c9386f.f42981e;
            c9609j2.f43910e.f43889j = false;
            c9609j2.f43912g = false;
            c9609j2.m40478r();
            C9611l c9611l2 = this.f43871a.f42983f;
            c9611l2.f43910e.f43889j = false;
            c9611l2.f43912g = false;
            c9611l2.m40483q();
            m40460c();
        }
        if (m40459b(this.f43874d)) {
            return false;
        }
        this.f43871a.m39593C0(0);
        this.f43871a.m39595D0(0);
        this.f43871a.f42981e.f43913h.mo40474d(0);
        this.f43871a.f42983f.f43913h.mo40474d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m40465h(boolean z10, int i10) {
        boolean z11;
        boolean z12;
        C9385e.b bVar;
        boolean z13;
        C9606g c9606g;
        int m39654t;
        boolean z14 = z10 & true;
        C9385e.b m39648q = this.f43871a.m39648q(0);
        C9385e.b m39648q2 = this.f43871a.m39648q(1);
        int m39609O = this.f43871a.m39609O();
        int m39610P = this.f43871a.m39610P();
        if (z14 && (m39648q == (bVar = C9385e.b.WRAP_CONTENT) || m39648q2 == bVar)) {
            Iterator<AbstractC9612m> it = this.f43875e.iterator();
            while (true) {
                z13 = z14;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC9612m next = it.next();
                if (next.f43911f == i10 && !next.mo40454m()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && m39648q == C9385e.b.WRAP_CONTENT) {
                    this.f43871a.m39633i0(C9385e.b.FIXED);
                    C9386f c9386f = this.f43871a;
                    c9386f.m39591B0(m40462e(c9386f, 0));
                    C9386f c9386f2 = this.f43871a;
                    c9606g = c9386f2.f42981e.f43910e;
                    m39654t = c9386f2.m39608N();
                    c9606g.mo40474d(m39654t);
                }
            } else if (z13 && m39648q2 == C9385e.b.WRAP_CONTENT) {
                this.f43871a.m39663x0(C9385e.b.FIXED);
                C9386f c9386f3 = this.f43871a;
                c9386f3.m39627e0(m40462e(c9386f3, 1));
                C9386f c9386f4 = this.f43871a;
                c9606g = c9386f4.f42983f.f43910e;
                m39654t = c9386f4.m39654t();
                c9606g.mo40474d(m39654t);
            }
        }
        C9386f c9386f5 = this.f43871a;
        if (i10 == 0) {
            C9385e.b bVar2 = c9386f5.f42959M[0];
            if (bVar2 == C9385e.b.FIXED || bVar2 == C9385e.b.MATCH_PARENT) {
                int m39608N = c9386f5.m39608N() + m39609O;
                this.f43871a.f42981e.f43914i.mo40474d(m39608N);
                this.f43871a.f42981e.f43910e.mo40474d(m39608N - m39609O);
                z11 = true;
            }
            z11 = false;
        } else {
            C9385e.b bVar3 = c9386f5.f42959M[1];
            if (bVar3 == C9385e.b.FIXED || bVar3 == C9385e.b.MATCH_PARENT) {
                int m39654t2 = c9386f5.m39654t() + m39610P;
                this.f43871a.f42983f.f43914i.mo40474d(m39654t2);
                this.f43871a.f42983f.f43910e.mo40474d(m39654t2 - m39610P);
                z11 = true;
            }
            z11 = false;
        }
        m40470m();
        Iterator<AbstractC9612m> it2 = this.f43875e.iterator();
        while (it2.hasNext()) {
            AbstractC9612m next2 = it2.next();
            if (next2.f43911f == i10 && (next2.f43907b != this.f43871a || next2.f43912g)) {
                next2.mo40451e();
            }
        }
        Iterator<AbstractC9612m> it3 = this.f43875e.iterator();
        while (true) {
            z12 = true;
            if (!it3.hasNext()) {
                break;
            }
            AbstractC9612m next3 = it3.next();
            if (next3.f43911f == i10 && (z11 || next3.f43907b != this.f43871a)) {
                if (!next3.f43913h.f43889j || !next3.f43914i.f43889j || (!(next3 instanceof C9602c) && !next3.f43910e.f43889j)) {
                    break;
                }
            }
        }
        this.f43871a.m39633i0(m39648q);
        this.f43871a.m39663x0(m39648q2);
        return z12;
    }

    /* renamed from: i */
    public final void m40466i(AbstractC9612m abstractC9612m, int i10, ArrayList<C9610k> arrayList) {
        for (InterfaceC9603d interfaceC9603d : abstractC9612m.f43913h.f43890k) {
            if (interfaceC9603d instanceof C9605f) {
                m40458a((C9605f) interfaceC9603d, i10, 0, abstractC9612m.f43914i, arrayList, null);
            } else if (interfaceC9603d instanceof AbstractC9612m) {
                m40458a(((AbstractC9612m) interfaceC9603d).f43913h, i10, 0, abstractC9612m.f43914i, arrayList, null);
            }
        }
        for (InterfaceC9603d interfaceC9603d2 : abstractC9612m.f43914i.f43890k) {
            if (interfaceC9603d2 instanceof C9605f) {
                m40458a((C9605f) interfaceC9603d2, i10, 1, abstractC9612m.f43913h, arrayList, null);
            } else if (interfaceC9603d2 instanceof AbstractC9612m) {
                m40458a(((AbstractC9612m) interfaceC9603d2).f43914i, i10, 1, abstractC9612m.f43913h, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (InterfaceC9603d interfaceC9603d3 : ((C9611l) abstractC9612m).f43903k.f43890k) {
                if (interfaceC9603d3 instanceof C9605f) {
                    m40458a((C9605f) interfaceC9603d3, i10, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: j */
    public void m40467j() {
        this.f43872b = true;
    }

    /* renamed from: k */
    public void m40468k() {
        this.f43873c = true;
    }

    /* renamed from: l */
    public final void m40469l(C9385e c9385e, C9385e.b bVar, int i10, C9385e.b bVar2, int i11) {
        C9601b.a aVar = this.f43878h;
        aVar.f43859a = bVar;
        aVar.f43860b = bVar2;
        aVar.f43861c = i10;
        aVar.f43862d = i11;
        this.f43877g.mo1715b(c9385e, aVar);
        c9385e.m39591B0(this.f43878h.f43863e);
        c9385e.m39627e0(this.f43878h.f43864f);
        c9385e.m39625d0(this.f43878h.f43866h);
        c9385e.m39619Y(this.f43878h.f43865g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r0 == 1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x000c A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016c  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40470m() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p392x.C9604e.m40470m():void");
    }

    /* renamed from: n */
    public void m40471n(C9601b.b bVar) {
        this.f43877g = bVar;
    }
}
