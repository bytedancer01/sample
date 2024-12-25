package ga;

import android.os.IBinder;
import ga.InterfaceC4993a;
import java.lang.reflect.Field;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ga/b.class
 */
/* renamed from: ga.b */
/* loaded from: combined.jar:classes2.jar:ga/b.class */
public final class BinderC4994b<T> extends InterfaceC4993a.a {

    /* renamed from: b */
    public final T f29006b;

    public BinderC4994b(T t10) {
        this.f29006b = t10;
    }

    /* renamed from: B1 */
    public static <T> InterfaceC4993a m25160B1(T t10) {
        return new BinderC4994b(t10);
    }

    /* renamed from: U0 */
    public static <T> T m25161U0(InterfaceC4993a interfaceC4993a) {
        int i10;
        if (interfaceC4993a instanceof BinderC4994b) {
            return ((BinderC4994b) interfaceC4993a).f29006b;
        }
        IBinder asBinder = interfaceC4993a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = i12;
            if (i11 >= length) {
                break;
            }
            Field field2 = declaredFields[i11];
            int i13 = i10;
            if (!field2.isSynthetic()) {
                i13 = i10 + 1;
                field = field2;
            }
            i11++;
            i12 = i13;
        }
        if (i10 != 1) {
            int length2 = declaredFields.length;
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Unexpected number of IObjectWrapper declared fields: ");
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        C9935o.m41850j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
