package p401x8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p059d9.C4349a;
import p059d9.C4401z0;
import p243o8.C6919a;
import p243o8.InterfaceC6923e;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:x8/k.class
 */
/* renamed from: x8.k */
/* loaded from: combined.jar:classes2.jar:x8/k.class */
public final class C9690k implements InterfaceC6923e {

    /* renamed from: b */
    public final List<C9684e> f44228b;

    /* renamed from: c */
    public final long[] f44229c;

    /* renamed from: d */
    public final long[] f44230d;

    public C9690k(List<C9684e> list) {
        this.f44228b = Collections.unmodifiableList(new ArrayList(list));
        this.f44229c = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C9684e c9684e = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f44229c;
            jArr[i11] = c9684e.f44199b;
            jArr[i11 + 1] = c9684e.f44200c;
        }
        long[] jArr2 = this.f44229c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f44230d = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: f */
    public static /* synthetic */ int m40800f(C9684e c9684e, C9684e c9684e2) {
        return Long.compare(c9684e.f44199b, c9684e2.f44199b);
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: a */
    public int mo31883a(long j10) {
        int m22377e = C4401z0.m22377e(this.f44230d, j10, false, false);
        if (m22377e >= this.f44230d.length) {
            m22377e = -1;
        }
        return m22377e;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: b */
    public List<C6919a> mo31884b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f44228b.size(); i10++) {
            long[] jArr = this.f44229c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                C9684e c9684e = this.f44228b.get(i10);
                C6919a c6919a = c9684e.f44198a;
                if (c6919a.f35800e == -3.4028235E38f) {
                    arrayList2.add(c9684e);
                } else {
                    arrayList.add(c6919a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: x8.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m40800f;
                m40800f = C9690k.m40800f((C9684e) obj, (C9684e) obj2);
                return m40800f;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((C9684e) arrayList2.get(i12)).f44198a.m31856a().m31864h((-1) - i12, 1).m31857a());
        }
        return arrayList;
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: c */
    public long mo31885c(int i10) {
        C4349a.m21878a(i10 >= 0);
        C4349a.m21878a(i10 < this.f44230d.length);
        return this.f44230d[i10];
    }

    @Override // p243o8.InterfaceC6923e
    /* renamed from: d */
    public int mo31886d() {
        return this.f44230d.length;
    }
}
