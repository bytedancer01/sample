package p128ha;

import dalvik.system.PathClassLoader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ha/c.class
 */
/* renamed from: ha.c */
/* loaded from: combined.jar:classes2.jar:ha/c.class */
public final class C5049c extends PathClassLoader {
    public C5049c(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException e10) {
            }
        }
        return super.loadClass(str, z10);
    }
}
