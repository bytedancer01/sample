package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.NoOpLog;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/logging/LogSource.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/logging/LogSource.class */
public class LogSource {
    public static boolean jdk14IsAvailable;
    public static boolean log4jIsAvailable;
    public static Hashtable logs = new Hashtable();
    public static Constructor logImplctor = null;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:26:0x008e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0068 -> B:18:0x008d). Please report as a decompilation issue!!! */
    static {
        /*
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = r0
            r1.<init>()
            org.apache.commons.logging.LogSource.logs = r0
            r0 = 0
            org.apache.commons.logging.LogSource.log4jIsAvailable = r0
            r0 = 0
            org.apache.commons.logging.LogSource.jdk14IsAvailable = r0
            r0 = 0
            r3 = r0
            r0 = 0
            org.apache.commons.logging.LogSource.logImplctor = r0
            java.lang.String r0 = "org.apache.log4j.Logger"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L25
            r0 = 1
            org.apache.commons.logging.LogSource.log4jIsAvailable = r0     // Catch: java.lang.Throwable -> L25
            goto L2a
        L25:
            r4 = move-exception
            r0 = 0
            org.apache.commons.logging.LogSource.log4jIsAvailable = r0
        L2a:
            java.lang.String r0 = "java.util.logging.Logger"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk14Logger"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3d
            r0 = 1
            org.apache.commons.logging.LogSource.jdk14IsAvailable = r0     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r4 = move-exception
            r0 = 0
            org.apache.commons.logging.LogSource.jdk14IsAvailable = r0
        L42:
            java.lang.String r0 = "org.apache.commons.logging.log"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L5b
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L5c
            r0 = r4
            r3 = r0
            java.lang.String r0 = "org.apache.commons.logging.Log"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L5b
            r4 = r0
            r0 = r4
            r3 = r0
            goto L5c
        L5b:
            r4 = move-exception
        L5c:
            r0 = r3
            if (r0 == 0) goto L70
        L60:
            r0 = r3
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L67
            goto L8d
        L67:
            r3 = move-exception
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L8e
            goto L8d
        L70:
            boolean r0 = org.apache.commons.logging.LogSource.log4jIsAvailable     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L7c
            java.lang.String r0 = "org.apache.commons.logging.impl.Log4JLogger"
            r3 = r0
            goto L60
        L7c:
            boolean r0 = org.apache.commons.logging.LogSource.jdk14IsAvailable     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L88
            java.lang.String r0 = "org.apache.commons.logging.impl.Jdk14Logger"
            r3 = r0
            goto L60
        L88:
            java.lang.String r0 = "org.apache.commons.logging.impl.NoOpLog"
            setLogImplementation(r0)     // Catch: java.lang.Throwable -> L67
        L8d:
            return
        L8e:
            r3 = move-exception
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.LogSource.m45220clinit():void");
    }

    private LogSource() {
    }

    public static Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    public static Log getInstance(String str) {
        Log log = (Log) logs.get(str);
        Log log2 = log;
        if (log == null) {
            log2 = makeNewLogInstance(str);
            logs.put(str, log2);
        }
        return log2;
    }

    public static String[] getLogNames() {
        return (String[]) logs.keySet().toArray(new String[logs.size()]);
    }

    public static Log makeNewLogInstance(String str) {
        Log log;
        try {
            log = (Log) logImplctor.newInstance(str);
        } catch (Throwable th2) {
            log = null;
        }
        Log log2 = log;
        if (log == null) {
            log2 = new NoOpLog(str);
        }
        return log2;
    }

    public static void setLogImplementation(Class cls) {
        logImplctor = cls.getConstructor("".getClass());
    }

    public static void setLogImplementation(String str) {
        try {
            logImplctor = Class.forName(str).getConstructor("".getClass());
        } catch (Throwable th2) {
            logImplctor = null;
        }
    }
}
