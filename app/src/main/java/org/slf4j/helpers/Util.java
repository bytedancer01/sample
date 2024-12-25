package org.slf4j.helpers;

/* loaded from: combined.jar:classes3.jar:org/slf4j/helpers/Util.class */
public final class Util {
    private static ClassContextSecurityManager SECURITY_MANAGER;
    private static boolean SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED;

    /* loaded from: combined.jar:classes3.jar:org/slf4j/helpers/Util$ClassContextSecurityManager.class */
    public static final class ClassContextSecurityManager extends SecurityManager {
        private ClassContextSecurityManager() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Util() {
    }

    public static Class<?> getCallingClass() {
        int i10;
        ClassContextSecurityManager securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Class<?>[] classContext = securityManager.getClassContext();
        String name = Util.class.getName();
        int i11 = 0;
        while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
            i11++;
        }
        if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i10];
    }

    private static ClassContextSecurityManager getSecurityManager() {
        ClassContextSecurityManager classContextSecurityManager = SECURITY_MANAGER;
        if (classContextSecurityManager != null) {
            return classContextSecurityManager;
        }
        if (SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED) {
            return null;
        }
        ClassContextSecurityManager safeCreateSecurityManager = safeCreateSecurityManager();
        SECURITY_MANAGER = safeCreateSecurityManager;
        SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = true;
        return safeCreateSecurityManager;
    }

    public static final void report(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void report(String str, Throwable th2) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th2.printStackTrace();
    }

    private static ClassContextSecurityManager safeCreateSecurityManager() {
        try {
            return new ClassContextSecurityManager();
        } catch (SecurityException e10) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String safeGetSystemProperty = safeGetSystemProperty(str);
        if (safeGetSystemProperty == null) {
            return false;
        }
        return safeGetSystemProperty.equalsIgnoreCase("true");
    }

    public static String safeGetSystemProperty(String str) {
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException e10) {
            str2 = null;
        }
        return str2;
    }
}
