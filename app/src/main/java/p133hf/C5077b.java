package p133hf;

import java.util.List;
import p200l9.C5791o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hf/b.class
 */
/* renamed from: hf.b */
/* loaded from: combined.jar:classes2.jar:hf/b.class */
public class C5077b {
    /* renamed from: a */
    public static C5791o[] m25357a(List<C5791o> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C5791o[] c5791oArr = new C5791o[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c5791oArr[i10] = m25358b(list.get(i10));
        }
        return c5791oArr;
    }

    /* renamed from: b */
    public static C5791o m25358b(C5791o c5791o) {
        return new C5791o.a(c5791o).m28292b().m28291a();
    }
}
