package p305ra;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/x8.class
 */
/* renamed from: ra.x8 */
/* loaded from: combined.jar:classes2.jar:ra/x8.class */
public final class C8413x8 implements PrivilegedExceptionAction<Unsafe> {
    /* renamed from: a */
    public static final Unsafe m36082a() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Unsafe run() {
        return m36082a();
    }
}
