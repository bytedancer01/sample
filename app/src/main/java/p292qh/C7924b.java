package p292qh;

import ci.C1129o;
import org.jetbrains.annotations.NotNull;
import p311rh.C8474a;
import p372vh.C9367f;
import sh.C8578a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:qh/b.class
 */
/* renamed from: qh.b */
/* loaded from: combined.jar:classes2.jar:qh/b.class */
public final class C7924b {

    /* renamed from: a */
    @NotNull
    public static final C7923a f38110a;

    static {
        C7923a c7923a;
        Object newInstance;
        Object newInstance2;
        int m34326a = m34326a();
        if (m34326a >= 65544 || m34326a < 65536) {
            try {
                newInstance = C8578a.class.newInstance();
                C9367f.m39525d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                } catch (ClassCastException e10) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C7923a.class.getClassLoader();
                    if (C9367f.m39522a(classLoader, classLoader2)) {
                        throw e10;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                }
            } catch (ClassNotFoundException e11) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C9367f.m39525d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        c7923a = (C7923a) newInstance3;
                    } catch (ClassCastException e12) {
                        ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                        ClassLoader classLoader4 = C7923a.class.getClassLoader();
                        if (C9367f.m39522a(classLoader3, classLoader4)) {
                            throw e12;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e12);
                    }
                } catch (ClassNotFoundException e13) {
                }
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            c7923a = (C7923a) newInstance;
            f38110a = c7923a;
        }
        if (m34326a >= 65543 || m34326a < 65536) {
            try {
                try {
                    newInstance2 = C8474a.class.newInstance();
                    C9367f.m39525d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e14) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = C7923a.class.getClassLoader();
                        if (C9367f.m39522a(classLoader5, classLoader6)) {
                            throw e14;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e14);
                    }
                } catch (ClassNotFoundException e15) {
                }
            } catch (ClassNotFoundException e16) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                C9367f.m39525d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    c7923a = (C7923a) newInstance4;
                } catch (ClassCastException e17) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = C7923a.class.getClassLoader();
                    if (C9367f.m39522a(classLoader7, classLoader8)) {
                        throw e17;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e17);
                }
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            c7923a = (C7923a) newInstance2;
            f38110a = c7923a;
        }
        c7923a = new C7923a();
        f38110a = c7923a;
    }

    /* renamed from: a */
    public static final int m34326a() {
        String property = System.getProperty("java.specification.version");
        int i10 = 65542;
        if (property == null) {
            return 65542;
        }
        int m6746N = C1129o.m6746N(property, '.', 0, false, 6, null);
        if (m6746N < 0) {
            try {
                i10 = Integer.parseInt(property) * 65536;
            } catch (NumberFormatException e10) {
            }
            return i10;
        }
        int i11 = m6746N + 1;
        int m6746N2 = C1129o.m6746N(property, '.', i11, false, 4, null);
        int i12 = m6746N2;
        if (m6746N2 < 0) {
            i12 = property.length();
        }
        String substring = property.substring(0, m6746N);
        C9367f.m39525d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i11, i12);
        C9367f.m39525d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            i10 = (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException e11) {
        }
        return i10;
    }
}
