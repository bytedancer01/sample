package p230n9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p200l9.C5791o;
import p230n9.C6721i;
import p304r9.C8013a;
import p304r9.C8015b;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:n9/f1.class
 */
/* renamed from: n9.f1 */
/* loaded from: combined.jar:classes2.jar:n9/f1.class */
public final class C6715f1 extends C6721i.a {

    /* renamed from: a */
    public final C6707d f35100a;

    public C6715f1(C6707d c6707d) {
        this.f35100a = c6707d;
    }

    @Override // p230n9.C6721i.a
    /* renamed from: g */
    public final void mo14733g() {
        long m30893r;
        m30893r = this.f35100a.m30893r();
        C6707d c6707d = this.f35100a;
        if (m30893r != c6707d.f35076b) {
            c6707d.f35076b = m30893r;
            c6707d.m30889n();
            C6707d c6707d2 = this.f35100a;
            if (c6707d2.f35076b != 0) {
                c6707d2.m30892q();
            }
        }
    }

    @Override // p230n9.C6721i.a
    /* renamed from: h */
    public final void mo30915h(int[] iArr) {
        List m34869j = C8013a.m34869j(iArr);
        if (this.f35100a.f35078d.equals(m34869j)) {
            return;
        }
        this.f35100a.m30901z();
        this.f35100a.f35080f.evictAll();
        this.f35100a.f35081g.clear();
        C6707d c6707d = this.f35100a;
        c6707d.f35078d = m34869j;
        C6707d.m30885m(c6707d);
        this.f35100a.m30899x();
        this.f35100a.m30898w();
    }

    @Override // p230n9.C6721i.a
    /* renamed from: i */
    public final void mo30916i(int[] iArr, int i10) {
        int i11;
        if (i10 == 0) {
            i11 = this.f35100a.f35078d.size();
        } else {
            int i12 = this.f35100a.f35079e.get(i10, -1);
            i11 = i12;
            if (i12 == -1) {
                this.f35100a.m30892q();
                return;
            }
        }
        int length = iArr.length;
        this.f35100a.m30901z();
        this.f35100a.f35078d.addAll(i11, C8013a.m34869j(iArr));
        C6707d.m30885m(this.f35100a);
        C6707d.m30879g(this.f35100a, i11, length);
        this.f35100a.m30898w();
    }

    @Override // p230n9.C6721i.a
    /* renamed from: j */
    public final void mo30917j(C5791o[] c5791oArr) {
        HashSet hashSet = new HashSet();
        this.f35100a.f35081g.clear();
        for (C5791o c5791o : c5791oArr) {
            int m28282S = c5791o.m28282S();
            this.f35100a.f35080f.put(Integer.valueOf(m28282S), c5791o);
            int i10 = this.f35100a.f35079e.get(m28282S, -1);
            if (i10 == -1) {
                this.f35100a.m30892q();
                return;
            }
            hashSet.add(Integer.valueOf(i10));
        }
        Iterator it = this.f35100a.f35081g.iterator();
        while (it.hasNext()) {
            int i11 = this.f35100a.f35079e.get(((Integer) it.next()).intValue(), -1);
            if (i11 != -1) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        this.f35100a.f35081g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f35100a.m30901z();
        this.f35100a.m30900y(C8013a.m34871l(arrayList));
        this.f35100a.m30898w();
    }

    @Override // p230n9.C6721i.a
    /* renamed from: k */
    public final void mo30918k(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            this.f35100a.f35080f.remove(Integer.valueOf(i10));
            int i11 = this.f35100a.f35079e.get(i10, -1);
            if (i11 == -1) {
                this.f35100a.m30892q();
                return;
            } else {
                this.f35100a.f35079e.delete(i10);
                arrayList.add(Integer.valueOf(i11));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.f35100a.m30901z();
        this.f35100a.f35078d.removeAll(C8013a.m34869j(iArr));
        C6707d.m30885m(this.f35100a);
        C6707d.m30880h(this.f35100a, C8013a.m34871l(arrayList));
        this.f35100a.m30898w();
    }

    @Override // p230n9.C6721i.a
    /* renamed from: l */
    public final void mo30919l(List list, List list2, int i10) {
        int i11;
        C8015b c8015b;
        ArrayList arrayList = new ArrayList();
        if (i10 == 0) {
            i11 = this.f35100a.f35078d.size();
        } else if (list2.isEmpty()) {
            c8015b = this.f35100a.f35075a;
            c8015b.m34878f("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
            i11 = -1;
        } else {
            int i12 = this.f35100a.f35079e.get(i10, -1);
            i11 = i12;
            if (i12 == -1) {
                i11 = this.f35100a.f35079e.get(((Integer) list2.get(0)).intValue(), -1);
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i13 = this.f35100a.f35079e.get(((Integer) it.next()).intValue(), -1);
            if (i13 == -1) {
                this.f35100a.m30892q();
                return;
            }
            arrayList.add(Integer.valueOf(i13));
        }
        this.f35100a.m30901z();
        C6707d c6707d = this.f35100a;
        c6707d.f35078d = list;
        C6707d.m30885m(c6707d);
        C6707d.m30881i(this.f35100a, arrayList, i11);
        this.f35100a.m30898w();
    }

    @Override // p230n9.C6721i.a
    /* renamed from: m */
    public final void mo30920m(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            this.f35100a.f35080f.remove(Integer.valueOf(i10));
            int i11 = this.f35100a.f35079e.get(i10, -1);
            if (i11 == -1) {
                this.f35100a.m30892q();
                return;
            }
            arrayList.add(Integer.valueOf(i11));
        }
        Collections.sort(arrayList);
        this.f35100a.m30901z();
        this.f35100a.m30900y(C8013a.m34871l(arrayList));
        this.f35100a.m30898w();
    }

    @Override // p230n9.C6721i.a
    /* renamed from: n */
    public final void mo30921n() {
        this.f35100a.m30892q();
    }
}
