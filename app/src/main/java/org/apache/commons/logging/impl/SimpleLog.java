package org.apache.commons.logging.impl;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/impl/SimpleLog.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/impl/SimpleLog.class */
public class SimpleLog implements Log, Serializable {
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 5;
    public static final int LOG_LEVEL_FATAL = 6;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_OFF = 7;
    public static final int LOG_LEVEL_TRACE = 1;
    public static final int LOG_LEVEL_WARN = 4;
    public static Class class$java$lang$Thread;
    public static Class class$org$apache$commons$logging$impl$SimpleLog;
    public static DateFormat dateFormatter;
    public static volatile String dateTimeFormat;
    private static final long serialVersionUID = 136942970684951178L;
    public static volatile boolean showDateTime = false;
    public static volatile boolean showLogName = false;
    public static volatile boolean showShortName = false;
    public static final Properties simpleLogProps;
    public static final String systemPrefix = "org.apache.commons.logging.simplelog.";
    public volatile int currentLogLevel;
    public volatile String logName;
    private volatile String shortLogName = null;

    static {
        Properties properties = new Properties();
        simpleLogProps = properties;
        showLogName = false;
        showShortName = true;
        showDateTime = false;
        dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
        dateFormatter = null;
        InputStream resourceAsStream = getResourceAsStream("simplelog.properties");
        if (resourceAsStream != null) {
            try {
                properties.load(resourceAsStream);
                resourceAsStream.close();
            } catch (IOException e10) {
            }
        }
        showLogName = getBooleanProperty("org.apache.commons.logging.simplelog.showlogname", showLogName);
        showShortName = getBooleanProperty("org.apache.commons.logging.simplelog.showShortLogname", showShortName);
        showDateTime = getBooleanProperty("org.apache.commons.logging.simplelog.showdatetime", showDateTime);
        if (showDateTime) {
            dateTimeFormat = getStringProperty("org.apache.commons.logging.simplelog.dateTimeFormat", dateTimeFormat);
            try {
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            } catch (IllegalArgumentException e11) {
                dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
                dateFormatter = new SimpleDateFormat(dateTimeFormat);
            }
        }
    }

    public SimpleLog(String str) {
        int i10;
        this.logName = null;
        this.logName = str;
        setLevel(3);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("org.apache.commons.logging.simplelog.log.");
        stringBuffer.append(this.logName);
        String stringProperty = getStringProperty(stringBuffer.toString());
        String valueOf = String.valueOf(str);
        String str2 = str;
        String str3 = stringProperty;
        while (true) {
            int lastIndexOf = valueOf.lastIndexOf(InstructionFileId.DOT);
            if (str3 != null || lastIndexOf <= -1) {
                break;
            }
            str2 = str2.substring(0, lastIndexOf);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("org.apache.commons.logging.simplelog.log.");
            stringBuffer2.append(str2);
            str3 = getStringProperty(stringBuffer2.toString());
            valueOf = String.valueOf(str2);
        }
        String stringProperty2 = str3 == null ? getStringProperty("org.apache.commons.logging.simplelog.defaultlog") : str3;
        if ("all".equalsIgnoreCase(stringProperty2)) {
            setLevel(0);
            return;
        }
        if ("trace".equalsIgnoreCase(stringProperty2)) {
            i10 = 1;
        } else if ("debug".equalsIgnoreCase(stringProperty2)) {
            i10 = 2;
        } else {
            if ("info".equalsIgnoreCase(stringProperty2)) {
                setLevel(3);
                return;
            }
            if ("warn".equalsIgnoreCase(stringProperty2)) {
                i10 = 4;
            } else if ("error".equalsIgnoreCase(stringProperty2)) {
                i10 = 5;
            } else if ("fatal".equalsIgnoreCase(stringProperty2)) {
                i10 = 6;
            } else if (!"off".equalsIgnoreCase(stringProperty2)) {
                return;
            } else {
                i10 = 7;
            }
        }
        setLevel(i10);
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    private static boolean getBooleanProperty(String str, boolean z10) {
        String stringProperty = getStringProperty(str);
        if (stringProperty != null) {
            z10 = "true".equalsIgnoreCase(stringProperty);
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ClassLoader getContextClassLoader() {
        ClassLoader classLoader;
        try {
            Class cls = class$java$lang$Thread;
            Class cls2 = cls;
            if (cls == null) {
                cls2 = class$("java.lang.Thread");
                class$java$lang$Thread = cls2;
            }
            try {
                classLoader = (ClassLoader) cls2.getMethod("getContextClassLoader", null).invoke(Thread.currentThread(), null);
            } catch (InvocationTargetException e10) {
                if (!(e10.getTargetException() instanceof SecurityException)) {
                    throw new LogConfigurationException("Unexpected InvocationTargetException", e10.getTargetException());
                }
                classLoader = null;
            }
        } catch (IllegalAccessException | NoSuchMethodException e11) {
            classLoader = null;
        }
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            Class cls3 = class$org$apache$commons$logging$impl$SimpleLog;
            Class cls4 = cls3;
            if (cls3 == null) {
                cls4 = class$("org.apache.commons.logging.impl.SimpleLog");
                class$org$apache$commons$logging$impl$SimpleLog = cls4;
            }
            classLoader2 = cls4.getClassLoader();
        }
        return classLoader2;
    }

    private static InputStream getResourceAsStream(String str) {
        return (InputStream) AccessController.doPrivileged(new PrivilegedAction(str) { // from class: org.apache.commons.logging.impl.SimpleLog.1
            private final String val$name;

            {
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public Object run() {
                ClassLoader contextClassLoader = SimpleLog.getContextClassLoader();
                return contextClassLoader != null ? contextClassLoader.getResourceAsStream(this.val$name) : ClassLoader.getSystemResourceAsStream(this.val$name);
            }
        });
    }

    private static String getStringProperty(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException e10) {
            str2 = null;
        }
        String str3 = str2;
        if (str2 == null) {
            str3 = simpleLogProps.getProperty(str);
        }
        return str3;
    }

    private static String getStringProperty(String str, String str2) {
        String stringProperty = getStringProperty(str);
        if (stringProperty == null) {
            stringProperty = str2;
        }
        return stringProperty;
    }

    @Override // org.apache.commons.logging.Log
    public final void debug(Object obj) {
        if (isLevelEnabled(2)) {
            log(2, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void debug(Object obj, Throwable th2) {
        if (isLevelEnabled(2)) {
            log(2, obj, th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void error(Object obj) {
        if (isLevelEnabled(5)) {
            log(5, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void error(Object obj, Throwable th2) {
        if (isLevelEnabled(5)) {
            log(5, obj, th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void fatal(Object obj) {
        if (isLevelEnabled(6)) {
            log(6, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void fatal(Object obj, Throwable th2) {
        if (isLevelEnabled(6)) {
            log(6, obj, th2);
        }
    }

    public int getLevel() {
        return this.currentLogLevel;
    }

    @Override // org.apache.commons.logging.Log
    public final void info(Object obj) {
        if (isLevelEnabled(3)) {
            log(3, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void info(Object obj, Throwable th2) {
        if (isLevelEnabled(3)) {
            log(3, obj, th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isDebugEnabled() {
        return isLevelEnabled(2);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isErrorEnabled() {
        return isLevelEnabled(5);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isFatalEnabled() {
        return isLevelEnabled(6);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isInfoEnabled() {
        return isLevelEnabled(3);
    }

    public boolean isLevelEnabled(int i10) {
        return i10 >= this.currentLogLevel;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isTraceEnabled() {
        return isLevelEnabled(1);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isWarnEnabled() {
        return isLevelEnabled(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void log(int r6, java.lang.Object r7, java.lang.Throwable r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.SimpleLog.log(int, java.lang.Object, java.lang.Throwable):void");
    }

    public void setLevel(int i10) {
        this.currentLogLevel = i10;
    }

    @Override // org.apache.commons.logging.Log
    public final void trace(Object obj) {
        if (isLevelEnabled(1)) {
            log(1, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void trace(Object obj, Throwable th2) {
        if (isLevelEnabled(1)) {
            log(1, obj, th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void warn(Object obj) {
        if (isLevelEnabled(4)) {
            log(4, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void warn(Object obj, Throwable th2) {
        if (isLevelEnabled(4)) {
            log(4, obj, th2);
        }
    }

    public void write(StringBuffer stringBuffer) {
        System.err.println(stringBuffer.toString());
    }
}
