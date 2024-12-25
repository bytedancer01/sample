package org.apache.commons.logging.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Hashtable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/LogFactoryImpl.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/LogFactoryImpl.class */
public class LogFactoryImpl extends LogFactory {
    public static final String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static final String LOG_PROPERTY = "org.apache.commons.logging.Log";
    public static final String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
    private static final String PKG_IMPL = "org.apache.commons.logging.impl.";
    private static final int PKG_LEN = 32;
    public static Class class$java$lang$String;
    public static Class class$org$apache$commons$logging$Log;
    public static Class class$org$apache$commons$logging$LogFactory;
    public static Class class$org$apache$commons$logging$impl$LogFactoryImpl;
    private boolean allowFlawedContext;
    private boolean allowFlawedDiscovery;
    private boolean allowFlawedHierarchy;
    private String diagnosticPrefix;
    private String logClassName;
    public Class[] logConstructorSignature;
    public Method logMethod;
    public Class[] logMethodSignature;
    private static final String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
    private static final String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
    private static final String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    private static final String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
    private static final String[] classesToDiscover = {LOGGING_IMPL_LOG4J_LOGGER, LOGGING_IMPL_JDK14_LOGGER, LOGGING_IMPL_LUMBERJACK_LOGGER, LOGGING_IMPL_SIMPLE_LOGGER};
    private boolean useTCCL = true;
    public Hashtable attributes = new Hashtable();
    public Hashtable instances = new Hashtable();
    public Constructor logConstructor = null;

    public LogFactoryImpl() {
        Class cls = class$java$lang$String;
        Class cls2 = cls;
        if (cls == null) {
            cls2 = class$("java.lang.String");
            class$java$lang$String = cls2;
        }
        this.logConstructorSignature = new Class[]{cls2};
        this.logMethod = null;
        Class cls3 = class$org$apache$commons$logging$LogFactory;
        Class cls4 = cls3;
        if (cls3 == null) {
            cls4 = class$(LogFactory.FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = cls4;
        }
        this.logMethodSignature = new Class[]{cls4};
        initDiagnostics();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x04f0 A[LOOP:0: B:5:0x003b->B:85:0x04f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0573 A[EDGE_INSN: B:86:0x0573->B:87:0x0573 BREAK  A[LOOP:0: B:5:0x003b->B:85:0x04f0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x057a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.apache.commons.logging.Log createLogFromClass(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 1625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.LogFactoryImpl.createLogFromClass(java.lang.String, java.lang.String, boolean):org.apache.commons.logging.Log");
    }

    private Log discoverLogImplementation(String str) {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Discovering a Log implementation...");
        }
        initConfiguration();
        Log log = null;
        String findUserSpecifiedLogClassName = findUserSpecifiedLogClassName();
        if (findUserSpecifiedLogClassName == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
            }
            int i10 = 0;
            while (true) {
                String[] strArr = classesToDiscover;
                if (i10 >= strArr.length || log != null) {
                    break;
                }
                log = createLogFromClass(strArr[i10], str, true);
                i10++;
            }
            if (log != null) {
                return log;
            }
            throw new LogConfigurationException("No suitable Log implementation");
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attempting to load user-specified log class '");
            stringBuffer.append(findUserSpecifiedLogClassName);
            stringBuffer.append("'...");
            logDiagnostic(stringBuffer.toString());
        }
        Log createLogFromClass = createLogFromClass(findUserSpecifiedLogClassName, str, true);
        if (createLogFromClass != null) {
            return createLogFromClass;
        }
        StringBuffer stringBuffer2 = new StringBuffer("User-specified log class '");
        stringBuffer2.append(findUserSpecifiedLogClassName);
        stringBuffer2.append("' cannot be found or is not useable.");
        informUponSimilarName(stringBuffer2, findUserSpecifiedLogClassName, LOGGING_IMPL_LOG4J_LOGGER);
        informUponSimilarName(stringBuffer2, findUserSpecifiedLogClassName, LOGGING_IMPL_JDK14_LOGGER);
        informUponSimilarName(stringBuffer2, findUserSpecifiedLogClassName, LOGGING_IMPL_LUMBERJACK_LOGGER);
        informUponSimilarName(stringBuffer2, findUserSpecifiedLogClassName, LOGGING_IMPL_SIMPLE_LOGGER);
        throw new LogConfigurationException(stringBuffer2.toString());
    }

    private String findUserSpecifiedLogClassName() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = (String) getAttribute(LOG_PROPERTY);
        String str2 = str;
        if (str == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str2 = (String) getAttribute(LOG_PROPERTY_OLD);
        }
        String str3 = str2;
        if (str2 == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str3 = getSystemProperty(LOG_PROPERTY, null);
            } catch (SecurityException e10) {
                str3 = str2;
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e10.getMessage());
                    logDiagnostic(stringBuffer.toString());
                    str3 = str2;
                }
            }
        }
        String str4 = str3;
        if (str3 == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str4 = getSystemProperty(LOG_PROPERTY_OLD, null);
            } catch (SecurityException e11) {
                str4 = str3;
                if (isDiagnosticsEnabled()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e11.getMessage());
                    logDiagnostic(stringBuffer2.toString());
                    str4 = str3;
                }
            }
        }
        String str5 = str4;
        if (str4 != null) {
            str5 = str4.trim();
        }
        return str5;
    }

    private ClassLoader getBaseClassLoader() {
        Class cls = class$org$apache$commons$logging$impl$LogFactoryImpl;
        Class cls2 = cls;
        if (cls == null) {
            cls2 = class$(LogFactory.FACTORY_DEFAULT);
            class$org$apache$commons$logging$impl$LogFactoryImpl = cls2;
        }
        ClassLoader classLoader = getClassLoader(cls2);
        if (!this.useTCCL) {
            return classLoader;
        }
        ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        ClassLoader lowestClassLoader = getLowestClassLoader(contextClassLoaderInternal, classLoader);
        if (lowestClassLoader == null) {
            if (!this.allowFlawedContext) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return contextClassLoaderInternal;
        }
        if (lowestClassLoader != contextClassLoaderInternal) {
            if (!this.allowFlawedContext) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
            }
        }
        return lowestClassLoader;
    }

    private boolean getBooleanConfiguration(String str, boolean z10) {
        String configurationValue = getConfigurationValue(str);
        return configurationValue == null ? z10 : Boolean.valueOf(configurationValue).booleanValue();
    }

    public static ClassLoader getClassLoader(Class cls) {
        return LogFactory.getClassLoader(cls);
    }

    private String getConfigurationValue(String str) {
        String systemProperty;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            logDiagnostic(stringBuffer.toString());
        }
        Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(attribute);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                logDiagnostic(stringBuffer2.toString());
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            logDiagnostic(stringBuffer3.toString());
        }
        try {
            systemProperty = getSystemProperty(str, null);
        } catch (SecurityException e10) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Security prevented reading system property ");
                stringBuffer4.append(str);
                logDiagnostic(stringBuffer4.toString());
            }
        }
        if (systemProperty != null) {
            if (isDiagnosticsEnabled()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Found system property [");
                stringBuffer5.append(systemProperty);
                stringBuffer5.append("] for ");
                stringBuffer5.append(str);
                logDiagnostic(stringBuffer5.toString());
            }
            return systemProperty;
        }
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[ENV] No system property found for property ");
            stringBuffer6.append(str);
            logDiagnostic(stringBuffer6.toString());
        }
        if (!isDiagnosticsEnabled()) {
            return null;
        }
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("[ENV] No configuration defined for item ");
        stringBuffer7.append(str);
        logDiagnostic(stringBuffer7.toString());
        return null;
    }

    public static ClassLoader getContextClassLoader() {
        return LogFactory.getContextClassLoader();
    }

    private static ClassLoader getContextClassLoaderInternal() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LogFactory.directGetContextClassLoader();
            }
        });
    }

    private ClassLoader getLowestClassLoader(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        ClassLoader classLoader3 = classLoader;
        while (true) {
            ClassLoader classLoader4 = classLoader3;
            if (classLoader4 == null) {
                ClassLoader classLoader5 = classLoader2;
                while (true) {
                    ClassLoader classLoader6 = classLoader5;
                    if (classLoader6 == null) {
                        return null;
                    }
                    if (classLoader6 == classLoader) {
                        return classLoader2;
                    }
                    classLoader5 = getParentClassLoader(classLoader6);
                }
            } else {
                if (classLoader4 == classLoader2) {
                    return classLoader;
                }
                classLoader3 = getParentClassLoader(classLoader4);
            }
        }
    }

    private ClassLoader getParentClassLoader(ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction(this, classLoader) { // from class: org.apache.commons.logging.impl.LogFactoryImpl.3
                private final LogFactoryImpl this$0;
                private final ClassLoader val$cl;

                {
                    this.this$0 = this;
                    this.val$cl = classLoader;
                }

                @Override // java.security.PrivilegedAction
                public Object run() {
                    return this.val$cl.getParent();
                }
            });
        } catch (SecurityException e10) {
            logDiagnostic("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    private static String getSystemProperty(String str, String str2) {
        return (String) AccessController.doPrivileged(new PrivilegedAction(str, str2) { // from class: org.apache.commons.logging.impl.LogFactoryImpl.2
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

    private void handleFlawedDiscovery(String str, ClassLoader classLoader, Throwable th2) {
        Throwable targetException;
        Throwable exception;
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th2.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th2.getLocalizedMessage());
            logDiagnostic(stringBuffer.toString());
            if ((th2 instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th2).getTargetException()) != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                logDiagnostic(stringBuffer2.toString());
                if ((targetException instanceof ExceptionInInitializerError) && (exception = ((ExceptionInInitializerError) targetException).getException()) != null) {
                    StringWriter stringWriter = new StringWriter();
                    exception.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    logDiagnostic(stringBuffer3.toString());
                }
            }
        }
        if (!this.allowFlawedDiscovery) {
            throw new LogConfigurationException(th2);
        }
    }

    private void handleFlawedHierarchy(ClassLoader classLoader, Class cls) {
        boolean z10;
        StringBuffer stringBuffer;
        Class cls2 = class$org$apache$commons$logging$Log;
        Class cls3 = cls2;
        if (cls2 == null) {
            cls3 = class$(LOG_PROPERTY);
            class$org$apache$commons$logging$Log = cls3;
        }
        String name = cls3.getName();
        Class<?>[] interfaces = cls.getInterfaces();
        int i10 = 0;
        while (true) {
            z10 = false;
            if (i10 >= interfaces.length) {
                break;
            }
            if (name.equals(interfaces[i10].getName())) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            if (isDiagnosticsEnabled()) {
                try {
                    Class cls4 = class$org$apache$commons$logging$Log;
                    Class cls5 = cls4;
                    if (cls4 == null) {
                        cls5 = class$(LOG_PROPERTY);
                        class$org$apache$commons$logging$Log = cls5;
                    }
                    ClassLoader classLoader2 = getClassLoader(cls5);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Class '");
                    stringBuffer2.append(cls.getName());
                    stringBuffer2.append("' was found in classloader ");
                    stringBuffer2.append(LogFactory.objectId(classLoader));
                    stringBuffer2.append(". It is bound to a Log interface which is not");
                    stringBuffer2.append(" the one loaded from classloader ");
                    stringBuffer2.append(LogFactory.objectId(classLoader2));
                    logDiagnostic(stringBuffer2.toString());
                } catch (Throwable th2) {
                    LogFactory.handleThrowable(th2);
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("Error while trying to output diagnostics about bad class '");
                    stringBuffer3.append(cls);
                    stringBuffer3.append("'");
                    logDiagnostic(stringBuffer3.toString());
                }
            }
            if (!this.allowFlawedHierarchy) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Terminating logging for this context ");
                stringBuffer4.append("due to bad log hierarchy. ");
                stringBuffer4.append("You have more than one version of '");
                Class cls6 = class$org$apache$commons$logging$Log;
                Class cls7 = cls6;
                if (cls6 == null) {
                    cls7 = class$(LOG_PROPERTY);
                    class$org$apache$commons$logging$Log = cls7;
                }
                stringBuffer4.append(cls7.getName());
                stringBuffer4.append("' visible.");
                if (isDiagnosticsEnabled()) {
                    logDiagnostic(stringBuffer4.toString());
                }
                throw new LogConfigurationException(stringBuffer4.toString());
            }
            if (!isDiagnosticsEnabled()) {
                return;
            }
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append("Warning: bad log hierarchy. ");
            stringBuffer5.append("You have more than one version of '");
            Class cls8 = class$org$apache$commons$logging$Log;
            Class cls9 = cls8;
            if (cls8 == null) {
                cls9 = class$(LOG_PROPERTY);
                class$org$apache$commons$logging$Log = cls9;
            }
            stringBuffer5.append(cls9.getName());
            stringBuffer5.append("' visible.");
            stringBuffer = stringBuffer5;
        } else {
            if (!this.allowFlawedDiscovery) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Terminating logging for this context. ");
                stringBuffer6.append("Log class '");
                stringBuffer6.append(cls.getName());
                stringBuffer6.append("' does not implement the Log interface.");
                if (isDiagnosticsEnabled()) {
                    logDiagnostic(stringBuffer6.toString());
                }
                throw new LogConfigurationException(stringBuffer6.toString());
            }
            if (!isDiagnosticsEnabled()) {
                return;
            }
            stringBuffer = new StringBuffer();
            stringBuffer.append("[WARNING] Log class '");
            stringBuffer.append(cls.getName());
            stringBuffer.append("' does not implement the Log interface.");
        }
        logDiagnostic(stringBuffer.toString());
    }

    private void informUponSimilarName(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, PKG_LEN + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    private void initConfiguration() {
        this.allowFlawedContext = getBooleanConfiguration(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.allowFlawedDiscovery = getBooleanConfiguration(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.allowFlawedHierarchy = getBooleanConfiguration(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    private void initDiagnostics() {
        String str;
        ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = LogFactory.objectId(classLoader);
            } catch (SecurityException e10) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        this.diagnosticPrefix = stringBuffer.toString();
    }

    public static boolean isDiagnosticsEnabled() {
        return LogFactory.isDiagnosticsEnabled();
    }

    private boolean isLogLibraryAvailable(String str, String str2) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            logDiagnostic(stringBuffer.toString());
        }
        try {
            if (createLogFromClass(str2, getClass().getName(), false) == null) {
                if (!isDiagnosticsEnabled()) {
                    return false;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Did not find '");
                stringBuffer2.append(str);
                stringBuffer2.append("'.");
                logDiagnostic(stringBuffer2.toString());
                return false;
            }
            if (!isDiagnosticsEnabled()) {
                return true;
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Found '");
            stringBuffer3.append(str);
            stringBuffer3.append("'.");
            logDiagnostic(stringBuffer3.toString());
            return true;
        } catch (LogConfigurationException e10) {
            if (!isDiagnosticsEnabled()) {
                return false;
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("Logging system '");
            stringBuffer4.append(str);
            stringBuffer4.append("' is available but not useable.");
            logDiagnostic(stringBuffer4.toString());
            return false;
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public Object getAttribute(String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public String[] getAttributeNames() {
        return (String[]) this.attributes.keySet().toArray(new String[this.attributes.size()]);
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    @Override // org.apache.commons.logging.LogFactory
    public Log getInstance(String str) {
        Log log = (Log) this.instances.get(str);
        Log log2 = log;
        if (log == null) {
            log2 = newInstance(str);
            this.instances.put(str, log2);
        }
        return log2;
    }

    public String getLogClassName() {
        if (this.logClassName == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logClassName;
    }

    public Constructor getLogConstructor() {
        if (this.logConstructor == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logConstructor;
    }

    public boolean isJdk13LumberjackAvailable() {
        return isLogLibraryAvailable("Jdk13Lumberjack", LOGGING_IMPL_LUMBERJACK_LOGGER);
    }

    public boolean isJdk14Available() {
        return isLogLibraryAvailable("Jdk14", LOGGING_IMPL_JDK14_LOGGER);
    }

    public boolean isLog4JAvailable() {
        return isLogLibraryAvailable("Log4J", LOGGING_IMPL_LOG4J_LOGGER);
    }

    public void logDiagnostic(String str) {
        if (isDiagnosticsEnabled()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.diagnosticPrefix);
            stringBuffer.append(str);
            LogFactory.logRawDiagnostic(stringBuffer.toString());
        }
    }

    public Log newInstance(String str) {
        try {
            Constructor constructor = this.logConstructor;
            Log discoverLogImplementation = constructor == null ? discoverLogImplementation(str) : (Log) constructor.newInstance(str);
            Method method = this.logMethod;
            if (method != null) {
                method.invoke(discoverLogImplementation, this);
            }
            return discoverLogImplementation;
        } catch (InvocationTargetException e10) {
            e = e10;
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new LogConfigurationException(e);
        } catch (LogConfigurationException e11) {
            throw e11;
        } catch (Throwable th2) {
            LogFactory.handleThrowable(th2);
            throw new LogConfigurationException(th2);
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    @Override // org.apache.commons.logging.LogFactory
    public void removeAttribute(String str) {
        this.attributes.remove(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public void setAttribute(String str, Object obj) {
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        Hashtable hashtable = this.attributes;
        if (obj == null) {
            hashtable.remove(str);
        } else {
            hashtable.put(str, obj);
        }
        if (str.equals(LogFactory.TCCL_KEY)) {
            this.useTCCL = obj != null && Boolean.valueOf(obj.toString()).booleanValue();
        }
    }
}
