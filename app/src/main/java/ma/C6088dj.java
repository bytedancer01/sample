package ma;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/dj.class
 */
/* renamed from: ma.dj */
/* loaded from: combined.jar:classes2.jar:ma/dj.class */
public final class C6088dj implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        Unsafe unsafe;
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        while (true) {
            unsafe = null;
            if (i10 >= length) {
                break;
            }
            Field field = declaredFields[i10];
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                unsafe = (Unsafe) Unsafe.class.cast(obj);
                break;
            }
            i10++;
        }
        return unsafe;
    }
}
