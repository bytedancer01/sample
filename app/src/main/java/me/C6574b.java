package me;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p202le.C5844a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:me/b.class
 */
/* renamed from: me.b */
/* loaded from: combined.jar:classes2.jar:me/b.class */
public final class C6574b {

    /* renamed from: a */
    public final Map<Integer, Integer> f34405a = new HashMap();

    /* renamed from: a */
    public int[] m30345a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry<Integer, Integer> entry : this.f34405a.entrySet()) {
            if (entry.getValue().intValue() > i10) {
                i10 = entry.getValue().intValue();
                arrayList.clear();
            } else if (entry.getValue().intValue() == i10) {
            }
            arrayList.add(entry.getKey());
        }
        return C5844a.m28430b(arrayList);
    }

    /* renamed from: b */
    public void m30346b(int i10) {
        Integer num = this.f34405a.get(Integer.valueOf(i10));
        Integer num2 = num;
        if (num == null) {
            num2 = 0;
        }
        this.f34405a.put(Integer.valueOf(i10), Integer.valueOf(num2.intValue() + 1));
    }
}
