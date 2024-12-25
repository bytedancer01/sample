package org.apache.commons.logging.impl;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.LogFactory;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/ServletContextCleaner.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/ServletContextCleaner.class */
public class ServletContextCleaner implements ServletContextListener {
    private static final Class[] RELEASE_SIGNATURE;
    public static Class class$java$lang$ClassLoader;

    static {
        Class cls = class$java$lang$ClassLoader;
        Class cls2 = cls;
        if (cls == null) {
            cls2 = class$("java.lang.ClassLoader");
            class$java$lang$ClassLoader = cls2;
        }
        RELEASE_SIGNATURE = new Class[]{cls2};
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        PrintStream printStream;
        String str;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader = contextClassLoader;
        while (classLoader != null) {
            try {
                Class<?> loadClass = classLoader.loadClass(LogFactory.FACTORY_PROPERTY);
                loadClass.getMethod("release", RELEASE_SIGNATURE).invoke(null, contextClassLoader);
                classLoader = loadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException e10) {
                classLoader = null;
            } catch (IllegalAccessException e11) {
                printStream = System.err;
                str = "LogFactory instance found which is not accessable!";
                printStream.println(str);
                classLoader = null;
            } catch (NoSuchMethodException e12) {
                printStream = System.err;
                str = "LogFactory instance found which does not support release method!";
                printStream.println(str);
                classLoader = null;
            } catch (InvocationTargetException e13) {
                printStream = System.err;
                str = "LogFactory instance release method failed!";
                printStream.println(str);
                classLoader = null;
            }
        }
        LogFactory.release(contextClassLoader);
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}
