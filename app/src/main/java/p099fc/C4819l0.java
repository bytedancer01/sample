package p099fc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/l0.class
 */
/* renamed from: fc.l0 */
/* loaded from: combined.jar:classes2.jar:fc/l0.class */
public final class C4819l0 {
    /* renamed from: a */
    public static <T> T[] m24447a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    /* renamed from: b */
    public static <T> T[] m24448b(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m24449c(int i10) {
        return C4818l.m24418k(i10);
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m24450d() {
        return C4818l.m24417g();
    }
}
