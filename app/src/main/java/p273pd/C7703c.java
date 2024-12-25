package p273pd;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p188kd.C5558k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:pd/c.class
 */
/* renamed from: pd.c */
/* loaded from: combined.jar:classes2.jar:pd/c.class */
public final class C7703c extends AbstractC7702b {

    /* renamed from: d */
    public static Class f37448d;

    /* renamed from: b */
    public final Object f37449b = m33647d();

    /* renamed from: c */
    public final Field f37450c = m33646c();

    /* renamed from: c */
    public static Field m33646c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception e10) {
            return null;
        }
    }

    /* renamed from: d */
    public static Object m33647d() {
        Object obj = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f37448d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception e10) {
        }
        return obj;
    }

    @Override // p273pd.AbstractC7702b
    /* renamed from: b */
    public void mo33644b(AccessibleObject accessibleObject) {
        if (m33648e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            throw new C5558k("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e10);
        }
    }

    /* renamed from: e */
    public boolean m33648e(AccessibleObject accessibleObject) {
        if (this.f37449b == null || this.f37450c == null) {
            return false;
        }
        try {
            f37448d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f37449b, accessibleObject, Long.valueOf(((Long) f37448d.getMethod("objectFieldOffset", Field.class).invoke(this.f37449b, this.f37450c)).longValue()), Boolean.TRUE);
            return true;
        } catch (Exception e10) {
            return false;
        }
    }
}
