package org.apache.commons.logging;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/LogFactory.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/LogFactory.class */
public abstract class LogFactory {
    public static final String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final String PRIORITY_KEY = "priority";
    public static final String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final String TCCL_KEY = "use_tccl";
    private static final String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    public static Class class$org$apache$commons$logging$LogFactory;
    private static final String diagnosticPrefix;
    private static PrintStream diagnosticsStream;
    public static Hashtable factories;
    public static volatile LogFactory nullClassLoaderFactory;
    private static final ClassLoader thisClassLoader;

    static {
        String str;
        Class cls = class$org$apache$commons$logging$LogFactory;
        Class cls2 = cls;
        if (cls == null) {
            cls2 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls2;
        }
        ClassLoader classLoader = getClassLoader(cls2);
        thisClassLoader = classLoader;
        if (classLoader == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = objectId(classLoader);
            } catch (SecurityException e10) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        diagnosticPrefix = stringBuffer.toString();
        diagnosticsStream = initDiagnostics();
        Class cls3 = class$org$apache$commons$logging$LogFactory;
        Class cls4 = cls3;
        if (cls3 == null) {
            cls4 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls4;
        }
        logClassLoaderEnvironment(cls4);
        factories = createFactoryStore();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    private static void cacheFactory(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
            } else {
                factories.put(classLoader, logFactory);
            }
        }
    }

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    public static Object createFactory(String str, ClassLoader classLoader) {
        String str2;
        Class<?> cls = null;
        Class<?> cls2 = null;
        Class<?> cls3 = null;
        Class<?> cls4 = null;
        Class<?> cls5 = null;
        try {
            if (classLoader != null) {
                try {
                    Class<?> loadClass = classLoader.loadClass(str);
                    Class cls6 = class$org$apache$commons$logging$LogFactory;
                    Class cls7 = cls6;
                    if (cls6 == null) {
                        cls7 = class$(FACTORY_PROPERTY);
                        class$org$apache$commons$logging$LogFactory = cls7;
                    }
                    if (cls7.isAssignableFrom(loadClass)) {
                        if (isDiagnosticsEnabled()) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Loaded class ");
                            stringBuffer.append(loadClass.getName());
                            stringBuffer.append(" from classloader ");
                            stringBuffer.append(objectId(classLoader));
                            logDiagnostic(stringBuffer.toString());
                        }
                    } else if (isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Factory class ");
                        stringBuffer2.append(loadClass.getName());
                        stringBuffer2.append(" loaded from classloader ");
                        stringBuffer2.append(objectId(loadClass.getClassLoader()));
                        stringBuffer2.append(" does not extend '");
                        Class cls8 = class$org$apache$commons$logging$LogFactory;
                        Class cls9 = cls8;
                        if (cls8 == null) {
                            cls9 = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = cls9;
                        }
                        stringBuffer2.append(cls9.getName());
                        stringBuffer2.append("' as loaded by this classloader.");
                        logDiagnostic(stringBuffer2.toString());
                        logHierarchy("[BAD CL TREE] ", classLoader);
                    }
                    cls5 = loadClass;
                    cls = loadClass;
                    cls2 = loadClass;
                    cls4 = loadClass;
                    return (LogFactory) loadClass.newInstance();
                } catch (ClassCastException e10) {
                    cls3 = cls5;
                    if (classLoader == thisClassLoader) {
                        Class<?> cls10 = cls5;
                        boolean implementsLogFactory = implementsLogFactory(cls5);
                        Class<?> cls11 = cls5;
                        Class<?> cls12 = cls5;
                        StringBuffer stringBuffer3 = new StringBuffer();
                        Class<?> cls13 = cls5;
                        stringBuffer3.append("The application has specified that a custom LogFactory implementation ");
                        Class<?> cls14 = cls5;
                        stringBuffer3.append("should be used but Class '");
                        Class<?> cls15 = cls5;
                        stringBuffer3.append(str);
                        Class<?> cls16 = cls5;
                        stringBuffer3.append("' cannot be converted to '");
                        Class<?> cls17 = cls5;
                        Class cls18 = class$org$apache$commons$logging$LogFactory;
                        Class cls19 = cls18;
                        if (cls18 == null) {
                            cls19 = class$(FACTORY_PROPERTY);
                            Class<?> cls20 = cls5;
                            class$org$apache$commons$logging$LogFactory = cls19;
                        }
                        Class<?> cls21 = cls5;
                        stringBuffer3.append(cls19.getName());
                        Class<?> cls22 = cls5;
                        stringBuffer3.append("'. ");
                        if (implementsLogFactory) {
                            stringBuffer3.append("The conflict is caused by the presence of multiple LogFactory classes ");
                            Class<?> cls23 = cls5;
                            stringBuffer3.append("in incompatible classloaders. ");
                            Class<?> cls24 = cls5;
                            stringBuffer3.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                            Class<?> cls25 = cls5;
                            stringBuffer3.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                            Class<?> cls26 = cls5;
                            stringBuffer3.append("that the container has set one without your knowledge. ");
                            Class<?> cls27 = cls5;
                            stringBuffer3.append("In this case, consider using the commons-logging-adapters.jar file or ");
                            str2 = "specifying the standard LogFactory from the command line. ";
                        } else {
                            str2 = "Please check the custom implementation. ";
                        }
                        stringBuffer3.append(str2);
                        stringBuffer3.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                        Class<?> cls28 = cls5;
                        if (isDiagnosticsEnabled()) {
                            Class<?> cls29 = cls5;
                            logDiagnostic(stringBuffer3.toString());
                        }
                        Class<?> cls30 = cls5;
                        Class<?> cls31 = cls5;
                        ClassCastException classCastException = new ClassCastException(stringBuffer3.toString());
                        Class<?> cls32 = cls5;
                        throw classCastException;
                    }
                } catch (ClassNotFoundException e11) {
                    cls3 = cls2;
                    if (classLoader == thisClassLoader) {
                        Class<?> cls33 = cls2;
                        if (isDiagnosticsEnabled()) {
                            Class<?> cls34 = cls2;
                            Class<?> cls35 = cls2;
                            StringBuffer stringBuffer4 = new StringBuffer();
                            Class<?> cls36 = cls2;
                            stringBuffer4.append("Unable to locate any class called '");
                            Class<?> cls37 = cls2;
                            stringBuffer4.append(str);
                            Class<?> cls38 = cls2;
                            stringBuffer4.append("' via classloader ");
                            Class<?> cls39 = cls2;
                            stringBuffer4.append(objectId(classLoader));
                            Class<?> cls40 = cls2;
                            logDiagnostic(stringBuffer4.toString());
                        }
                        Class<?> cls41 = cls2;
                        throw e11;
                    }
                } catch (NoClassDefFoundError e12) {
                    cls3 = cls;
                    if (classLoader == thisClassLoader) {
                        Class<?> cls42 = cls;
                        if (isDiagnosticsEnabled()) {
                            Class<?> cls43 = cls;
                            Class<?> cls44 = cls;
                            StringBuffer stringBuffer5 = new StringBuffer();
                            Class<?> cls45 = cls;
                            stringBuffer5.append("Class '");
                            Class<?> cls46 = cls;
                            stringBuffer5.append(str);
                            Class<?> cls47 = cls;
                            stringBuffer5.append("' cannot be loaded");
                            Class<?> cls48 = cls;
                            stringBuffer5.append(" via classloader ");
                            Class<?> cls49 = cls;
                            stringBuffer5.append(objectId(classLoader));
                            Class<?> cls50 = cls;
                            stringBuffer5.append(" - it depends on some other class that cannot be found.");
                            Class<?> cls51 = cls;
                            logDiagnostic(stringBuffer5.toString());
                        }
                        Class<?> cls52 = cls;
                        throw e12;
                    }
                }
            }
            Class<?> cls53 = cls3;
            if (isDiagnosticsEnabled()) {
                Class<?> cls54 = cls3;
                Class<?> cls55 = cls3;
                StringBuffer stringBuffer6 = new StringBuffer();
                Class<?> cls56 = cls3;
                stringBuffer6.append("Unable to load factory class via classloader ");
                Class<?> cls57 = cls3;
                stringBuffer6.append(objectId(classLoader));
                Class<?> cls58 = cls3;
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                Class<?> cls59 = cls3;
                logDiagnostic(stringBuffer6.toString());
            }
            Class<?> cls60 = cls3;
            return (LogFactory) Class.forName(str).newInstance();
        } catch (Exception e13) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to create LogFactory instance.");
            }
            if (cls4 != null) {
                Class cls61 = class$org$apache$commons$logging$LogFactory;
                Class cls62 = cls61;
                if (cls61 == null) {
                    cls62 = class$(FACTORY_PROPERTY);
                    class$org$apache$commons$logging$LogFactory = cls62;
                }
                if (!cls62.isAssignableFrom(cls4)) {
                    return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e13);
                }
            }
            return new LogConfigurationException(e13);
        }
    }

    private static final Hashtable createFactoryStore() {
        String str;
        Hashtable hashtable;
        try {
            str = getSystemProperty(HASHTABLE_IMPLEMENTATION_PROPERTY, null);
        } catch (SecurityException e10) {
            str = null;
        }
        String str2 = str;
        if (str == null) {
            str2 = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (Hashtable) Class.forName(str2).newInstance();
        } catch (Throwable th2) {
            handleThrowable(th2);
            hashtable = null;
            if (!WEAK_HASHTABLE_CLASSNAME.equals(str2)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                    hashtable = null;
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                    hashtable = null;
                }
            }
        }
        Hashtable hashtable2 = hashtable;
        if (hashtable == null) {
            hashtable2 = new Hashtable();
        }
        return hashtable2;
    }

    public static ClassLoader directGetContextClassLoader() {
        ClassLoader classLoader;
        try {
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (SecurityException e10) {
            classLoader = null;
        }
        return classLoader;
    }

    private static LogFactory getCachedFactory(ClassLoader classLoader) {
        return classLoader == null ? nullClassLoaderFactory : (LogFactory) factories.get(classLoader);
    }

    public static ClassLoader getClassLoader(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e10) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e10.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.util.Properties getConfigurationFile(java.lang.ClassLoader r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.getConfigurationFile(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    public static ClassLoader getContextClassLoader() {
        return directGetContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    public static LogFactory getFactory() {
        LogFactory logFactory;
        String str;
        BufferedReader bufferedReader;
        String property;
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        if (contextClassLoaderInternal == null && isDiagnosticsEnabled()) {
            logDiagnostic("Context classloader is null.");
        }
        LogFactory cachedFactory = getCachedFactory(contextClassLoaderInternal);
        if (cachedFactory != null) {
            return cachedFactory;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(objectId(contextClassLoaderInternal));
            logDiagnostic(stringBuffer.toString());
            logHierarchy("[LOOKUP] ", contextClassLoaderInternal);
        }
        Properties configurationFile = getConfigurationFile(contextClassLoaderInternal, FACTORY_PROPERTIES);
        ClassLoader classLoader = (configurationFile == null || (property = configurationFile.getProperty(TCCL_KEY)) == null || Boolean.valueOf(property).booleanValue()) ? contextClassLoaderInternal : thisClassLoader;
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String systemProperty = getSystemProperty(FACTORY_PROPERTY, null);
            if (systemProperty != null) {
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(systemProperty);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append(FACTORY_PROPERTY);
                    logDiagnostic(stringBuffer2.toString());
                }
                logFactory = newFactory(systemProperty, classLoader, contextClassLoaderInternal);
            } else {
                logFactory = cachedFactory;
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
                    logFactory = cachedFactory;
                }
            }
        } catch (SecurityException e10) {
            logFactory = cachedFactory;
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(trim(e10.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                logDiagnostic(stringBuffer3.toString());
                logFactory = cachedFactory;
            }
        } catch (RuntimeException e11) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(trim(e11.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                logDiagnostic(stringBuffer4.toString());
            }
            throw e11;
        }
        LogFactory logFactory2 = logFactory;
        if (logFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream resourceAsStream = getResourceAsStream(contextClassLoaderInternal, SERVICE_ID);
                if (resourceAsStream != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                    } catch (UnsupportedEncodingException e12) {
                        bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                    }
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    logFactory2 = logFactory;
                    if (readLine != null) {
                        logFactory2 = logFactory;
                        if (!"".equals(readLine)) {
                            if (isDiagnosticsEnabled()) {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                                stringBuffer5.append(readLine);
                                stringBuffer5.append(" as specified by file '");
                                stringBuffer5.append(SERVICE_ID);
                                stringBuffer5.append("' which was present in the path of the context classloader.");
                                logDiagnostic(stringBuffer5.toString());
                            }
                            logFactory2 = newFactory(readLine, classLoader, contextClassLoaderInternal);
                        }
                    }
                } else {
                    logFactory2 = logFactory;
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                        logFactory2 = logFactory;
                    }
                }
            } catch (Exception e13) {
                logFactory2 = logFactory;
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                    stringBuffer6.append(trim(e13.getMessage()));
                    stringBuffer6.append("]. Trying alternative implementations...");
                    logDiagnostic(stringBuffer6.toString());
                    logFactory2 = logFactory;
                }
            }
        }
        LogFactory logFactory3 = logFactory2;
        if (logFactory2 == null) {
            boolean isDiagnosticsEnabled = isDiagnosticsEnabled();
            if (configurationFile != null) {
                if (isDiagnosticsEnabled) {
                    logDiagnostic("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = configurationFile.getProperty(FACTORY_PROPERTY);
                if (property2 != null) {
                    if (isDiagnosticsEnabled()) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                        stringBuffer7.append(property2);
                        stringBuffer7.append("'");
                        logDiagnostic(stringBuffer7.toString());
                    }
                    logFactory3 = newFactory(property2, classLoader, contextClassLoaderInternal);
                } else {
                    logFactory3 = logFactory2;
                    if (isDiagnosticsEnabled()) {
                        str = "[LOOKUP] Properties file has no entry specifying LogFactory subclass.";
                        logDiagnostic(str);
                        logFactory3 = logFactory2;
                    }
                }
            } else {
                logFactory3 = logFactory2;
                if (isDiagnosticsEnabled) {
                    str = "[LOOKUP] No properties file available to determine LogFactory subclass from..";
                    logDiagnostic(str);
                    logFactory3 = logFactory2;
                }
            }
        }
        LogFactory logFactory4 = logFactory3;
        if (logFactory3 == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            logFactory4 = newFactory(FACTORY_DEFAULT, thisClassLoader, contextClassLoaderInternal);
        }
        if (logFactory4 != null) {
            cacheFactory(contextClassLoaderInternal, logFactory4);
            if (configurationFile != null) {
                Enumeration<?> propertyNames = configurationFile.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    String str2 = (String) propertyNames.nextElement();
                    logFactory4.setAttribute(str2, configurationFile.getProperty(str2));
                }
            }
        }
        return logFactory4;
    }

    public static Log getLog(Class cls) {
        return getFactory().getInstance(cls);
    }

    public static Log getLog(String str) {
        return getFactory().getInstance(str);
    }

    private static Properties getProperties(URL url) {
        return (Properties) AccessController.doPrivileged(new PrivilegedAction(url) { // from class: org.apache.commons.logging.LogFactory.5
            private final URL val$url;

            {
                this.val$url = url;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.security.PrivilegedAction
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object run() {
                /*
                    Method dump skipped, instructions count: 250
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogFactory.C70135.run():java.lang.Object");
            }
        });
    }

    private static InputStream getResourceAsStream(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction(classLoader, str) { // from class: org.apache.commons.logging.LogFactory.3
            private final ClassLoader val$loader;
            private final String val$name;

            {
                this.val$loader = classLoader;
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader classLoader2 = this.val$loader;
                return classLoader2 != null ? classLoader2.getResourceAsStream(this.val$name) : ClassLoader.getSystemResourceAsStream(this.val$name);
            }
        });
    }

    private static Enumeration getResources(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new PrivilegedAction(classLoader, str) { // from class: org.apache.commons.logging.LogFactory.4
            private final ClassLoader val$loader;
            private final String val$name;

            {
                this.val$loader = classLoader;
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader classLoader2;
                Enumeration<URL> enumeration = null;
                try {
                    classLoader2 = this.val$loader;
                } catch (IOException e10) {
                    if (!LogFactory.isDiagnosticsEnabled()) {
                        return null;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Exception while trying to find configuration file ");
                    stringBuffer.append(this.val$name);
                    stringBuffer.append(":");
                    stringBuffer.append(e10.getMessage());
                    LogFactory.logDiagnostic(stringBuffer.toString());
                    return null;
                } catch (NoSuchMethodError e11) {
                }
                if (classLoader2 != null) {
                    return classLoader2.getResources(this.val$name);
                }
                enumeration = ClassLoader.getSystemResources(this.val$name);
                return enumeration;
            }
        });
    }

    private static String getSystemProperty(String str, String str2) {
        return (String) AccessController.doPrivileged(new PrivilegedAction(str, str2) { // from class: org.apache.commons.logging.LogFactory.6
            private final String val$def;
            private final String val$key;

            {
                this.val$key = str;
                this.val$def = str2;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return System.getProperty(this.val$key, this.val$def);
            }
        });
    }

    public static void handleThrowable(Throwable th2) {
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
    }

    private static boolean implementsLogFactory(Class cls) {
        StringBuffer stringBuffer;
        String str;
        String stringBuffer2;
        String stringBuffer3;
        boolean z10 = false;
        if (cls != null) {
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    stringBuffer3 = "[CUSTOM LOG FACTORY] was loaded by the boot classloader";
                    z10 = false;
                } else {
                    logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                    z10 = Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                    if (z10) {
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer4.append(cls.getName());
                        stringBuffer4.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        stringBuffer3 = stringBuffer4.toString();
                    } else {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer5.append(cls.getName());
                        stringBuffer5.append(" does not implement LogFactory.");
                        stringBuffer3 = stringBuffer5.toString();
                    }
                }
                z11 = z10;
                z12 = z10;
                z13 = z10;
                logDiagnostic(stringBuffer3);
            } catch (ClassNotFoundException e10) {
                stringBuffer2 = "[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?";
                z10 = z11;
                logDiagnostic(stringBuffer2);
                return z10;
            } catch (LinkageError e11) {
                e = e11;
                stringBuffer = new StringBuffer();
                str = "[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ";
                z13 = z12;
                stringBuffer.append(str);
                stringBuffer.append(e.getMessage());
                stringBuffer2 = stringBuffer.toString();
                z10 = z13;
                logDiagnostic(stringBuffer2);
                return z10;
            } catch (SecurityException e12) {
                e = e12;
                stringBuffer = new StringBuffer();
                str = "[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ";
                stringBuffer.append(str);
                stringBuffer.append(e.getMessage());
                stringBuffer2 = stringBuffer.toString();
                z10 = z13;
                logDiagnostic(stringBuffer2);
                return z10;
            }
        }
        return z10;
    }

    private static PrintStream initDiagnostics() {
        String systemProperty = getSystemProperty(DIAGNOSTICS_DEST_PROPERTY, null);
        if (systemProperty == null) {
            return null;
        }
        if (systemProperty.equals("STDOUT")) {
            return System.out;
        }
        if (systemProperty.equals("STDERR")) {
            return System.err;
        }
        try {
            return new PrintStream(new FileOutputStream(systemProperty, true));
        } catch (IOException | SecurityException e10) {
            return null;
        }
    }

    public static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    private static void logClassLoaderEnvironment(Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                logDiagnostic(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                logDiagnostic(stringBuffer2.toString());
            } catch (SecurityException e10) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoader = getClassLoader(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(objectId(classLoader));
                logDiagnostic(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                logHierarchy(stringBuffer4.toString(), classLoader);
            } catch (SecurityException e11) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                logDiagnostic(stringBuffer5.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    private static void logHierarchy(String str, ClassLoader classLoader) {
        String str2;
        ClassLoader parent;
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(objectId(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                logDiagnostic(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            parent = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                            classLoader = parent;
                        } catch (SecurityException e10) {
                            str2 = " --> SECRET";
                        }
                    } while (parent != null);
                    str2 = "BOOT";
                    stringBuffer3.append(str2);
                    logDiagnostic(stringBuffer3.toString());
                }
            } catch (SecurityException e11) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                logDiagnostic(stringBuffer4.toString());
            }
        }
    }

    public static final void logRawDiagnostic(String str) {
        PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.println(str);
            diagnosticsStream.flush();
        }
    }

    public static LogFactory newFactory(String str, ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }

    public static LogFactory newFactory(String str, ClassLoader classLoader, ClassLoader classLoader2) {
        Object doPrivileged = AccessController.doPrivileged((PrivilegedAction<Object>) new PrivilegedAction(str, classLoader) { // from class: org.apache.commons.logging.LogFactory.2
            private final ClassLoader val$classLoader;
            private final String val$factoryClass;

            {
                this.val$factoryClass = str;
                this.val$classLoader = classLoader;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.createFactory(this.val$factoryClass, this.val$classLoader);
            }
        });
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(objectId(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(objectId(classLoader2));
            logDiagnostic(stringBuffer2.toString());
        }
        return (LogFactory) doPrivileged;
    }

    public static String objectId(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    public static void release(ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Releasing factory for classloader ");
            stringBuffer.append(objectId(classLoader));
            logDiagnostic(stringBuffer.toString());
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            if (classLoader != null) {
                LogFactory logFactory = (LogFactory) hashtable.get(classLoader);
                if (logFactory != null) {
                    logFactory.release();
                    hashtable.remove(classLoader);
                }
            } else if (nullClassLoaderFactory != null) {
                nullClassLoaderFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        Hashtable hashtable = factories;
        synchronized (hashtable) {
            Enumeration elements = hashtable.elements();
            while (elements.hasMoreElements()) {
                ((LogFactory) elements.nextElement()).release();
            }
            hashtable.clear();
            if (nullClassLoaderFactory != null) {
                nullClassLoaderFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    private static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public abstract Object getAttribute(String str);

    public abstract String[] getAttributeNames();

    public abstract Log getInstance(Class cls);

    public abstract Log getInstance(String str);

    public abstract void release();

    public abstract void removeAttribute(String str);

    public abstract void setAttribute(String str, Object obj);
}
