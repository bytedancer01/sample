package org.simpleframework.xml.strategy;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/strategy/Loader.class */
class Loader {
    private static ClassLoader getCallerClassLoader() {
        return Loader.class.getClassLoader();
    }

    private static ClassLoader getClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public Class load(String str) {
        ClassLoader classLoader = getClassLoader();
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = getCallerClassLoader();
        }
        return classLoader2.loadClass(str);
    }
}
