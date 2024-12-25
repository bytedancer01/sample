package je;

import java.util.List;
import p444zd.C10193a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:je/a.class
 */
/* renamed from: je.a */
/* loaded from: combined.jar:classes2.jar:je/a.class */
public final class C5365a {
    /* renamed from: a */
    public static C10193a m26668a(List<C5366b> list) {
        int size = (list.size() << 1) - 1;
        int i10 = size;
        if (list.get(list.size() - 1).m26671c() == null) {
            i10 = size - 1;
        }
        C10193a c10193a = new C10193a(i10 * 12);
        int i11 = 0;
        int m26173b = list.get(0).m26671c().m26173b();
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & m26173b) != 0) {
                c10193a.m42667l(i11);
            }
            i11++;
        }
        int i13 = 1;
        while (i13 < list.size()) {
            C5366b c5366b = list.get(i13);
            int m26173b2 = c5366b.m26670b().m26173b();
            for (int i14 = 11; i14 >= 0; i14--) {
                if (((1 << i14) & m26173b2) != 0) {
                    c10193a.m42667l(i11);
                }
                i11++;
            }
            int i15 = i11;
            if (c5366b.m26671c() != null) {
                int m26173b3 = c5366b.m26671c().m26173b();
                int i16 = 11;
                while (true) {
                    i15 = i11;
                    if (i16 >= 0) {
                        if (((1 << i16) & m26173b3) != 0) {
                            c10193a.m42667l(i11);
                        }
                        i11++;
                        i16--;
                    }
                }
            }
            i13++;
            i11 = i15;
        }
        return c10193a;
    }
}
