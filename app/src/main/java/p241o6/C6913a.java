package p241o6;

import android.util.SparseArray;
import java.util.HashMap;
import p437z5.EnumC10056d;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:o6/a.class
 */
/* renamed from: o6.a */
/* loaded from: combined.jar:classes1.jar:o6/a.class */
public final class C6913a {

    /* renamed from: a */
    public static SparseArray<EnumC10056d> f35750a = new SparseArray<>();

    /* renamed from: b */
    public static HashMap<EnumC10056d, Integer> f35751b;

    static {
        HashMap<EnumC10056d, Integer> hashMap = new HashMap<>();
        f35751b = hashMap;
        hashMap.put(EnumC10056d.DEFAULT, 0);
        f35751b.put(EnumC10056d.VERY_LOW, 1);
        f35751b.put(EnumC10056d.HIGHEST, 2);
        for (EnumC10056d enumC10056d : f35751b.keySet()) {
            f35750a.append(f35751b.get(enumC10056d).intValue(), enumC10056d);
        }
    }

    /* renamed from: a */
    public static int m31838a(EnumC10056d enumC10056d) {
        Integer num = f35751b.get(enumC10056d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC10056d);
    }

    /* renamed from: b */
    public static EnumC10056d m31839b(int i10) {
        EnumC10056d enumC10056d = f35750a.get(i10);
        if (enumC10056d != null) {
            return enumC10056d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
