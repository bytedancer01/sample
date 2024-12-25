package org.apache.http.util;

import java.util.ArrayList;

/* loaded from: combined.jar:classes3.jar:org/apache/http/util/VersionInfo.class */
public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    public VersionInfo(String str, String str2, String str3, String str4, String str5) {
        Args.notNull(str, "Package identifier");
        this.infoPackage = str;
        this.infoModule = str2 == null ? UNAVAILABLE : str2;
        this.infoRelease = str3 == null ? UNAVAILABLE : str3;
        this.infoTimestamp = str4 == null ? UNAVAILABLE : str4;
        this.infoClassloader = str5 == null ? UNAVAILABLE : str5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r0.equals("${pom.version}") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.http.util.VersionInfo fromMap(java.lang.String r8, java.util.Map<?, ?> r9, java.lang.ClassLoader r10) {
        /*
            r0 = r8
            java.lang.String r1 = "Package identifier"
            java.lang.Object r0 = org.apache.http.util.Args.notNull(r0, r1)
            r0 = 0
            r14 = r0
            r0 = r9
            if (r0 == 0) goto L94
            r0 = r9
            java.lang.String r1 = "info.module"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            if (r0 == 0) goto L31
            r0 = r12
            r11 = r0
            r0 = r12
            int r0 = r0.length()
            r1 = 1
            if (r0 >= r1) goto L31
            r0 = 0
            r11 = r0
        L31:
            r0 = r9
            java.lang.String r1 = "info.release"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            r12 = r0
            r0 = r13
            if (r0 == 0) goto L61
            r0 = r13
            int r0 = r0.length()
            r1 = 1
            if (r0 < r1) goto L5e
            r0 = r13
            r12 = r0
            r0 = r13
            java.lang.String r1 = "${pom.version}"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L61
        L5e:
            r0 = 0
            r12 = r0
        L61:
            r0 = r9
            java.lang.String r1 = "info.timestamp"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L87
            r0 = r9
            int r0 = r0.length()
            r1 = 1
            if (r0 < r1) goto L82
            r0 = r9
            java.lang.String r1 = "${mvn.timestamp}"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L87
        L82:
            r0 = 0
            r9 = r0
            goto L87
        L87:
            r0 = r12
            r13 = r0
            r0 = r11
            r12 = r0
            r0 = r13
            r11 = r0
            goto L9b
        L94:
            r0 = 0
            r12 = r0
            r0 = 0
            r11 = r0
            r0 = r11
            r9 = r0
        L9b:
            r0 = r14
            r13 = r0
            r0 = r10
            if (r0 == 0) goto La9
            r0 = r10
            java.lang.String r0 = r0.toString()
            r13 = r0
        La9:
            org.apache.http.util.VersionInfo r0 = new org.apache.http.util.VersionInfo
            r1 = r0
            r2 = r8
            r3 = r12
            r4 = r11
            r5 = r9
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.VersionInfo.fromMap(java.lang.String, java.util.Map, java.lang.ClassLoader):org.apache.http.util.VersionInfo");
    }

    public static String getUserAgent(String str, String str2, Class<?> cls) {
        VersionInfo loadVersionInfo = loadVersionInfo(str2, cls.getClassLoader());
        return String.format("%s/%s (Java/%s)", str, loadVersionInfo != null ? loadVersionInfo.getRelease() : UNAVAILABLE, System.getProperty("java.version"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.http.util.VersionInfo loadVersionInfo(java.lang.String r5, java.lang.ClassLoader r6) {
        /*
            r0 = r5
            java.lang.String r1 = "Package identifier"
            java.lang.Object r0 = org.apache.http.util.Args.notNull(r0, r1)
            r0 = r6
            if (r0 == 0) goto Le
            goto L15
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r6 = r0
        L15:
            r0 = 0
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L71
            r7 = r0
            r0 = r7
            r0.<init>()     // Catch: java.io.IOException -> L71
            r0 = r7
            r1 = r5
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.io.IOException -> L71
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L71
            r0 = r7
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L71
            r0 = r7
            java.lang.String r1 = "version.properties"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L71
            r0 = r6
            r1 = r7
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L71
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.io.IOException -> L71
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6c
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Throwable -> L64
            r7 = r0
            r0 = r7
            r0.<init>()     // Catch: java.lang.Throwable -> L64
            r0 = r7
            r1 = r9
            r0.load(r1)     // Catch: java.lang.Throwable -> L64
            r0 = r9
            r0.close()     // Catch: java.io.IOException -> L5f
            goto L75
        L5f:
            r9 = move-exception
            goto L75
        L64:
            r7 = move-exception
            r0 = r9
            r0.close()     // Catch: java.io.IOException -> L71
            r0 = r7
            throw r0     // Catch: java.io.IOException -> L71
        L6c:
            r0 = 0
            r7 = r0
            goto L75
        L71:
            r7 = move-exception
            goto L6c
        L75:
            r0 = r7
            if (r0 == 0) goto L80
            r0 = r5
            r1 = r7
            r2 = r6
            org.apache.http.util.VersionInfo r0 = fromMap(r0, r1, r2)
            r8 = r0
        L80:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.VersionInfo.loadVersionInfo(java.lang.String, java.lang.ClassLoader):org.apache.http.util.VersionInfo");
    }

    public static VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) {
        Args.notNull(strArr, "Package identifier array");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            VersionInfo loadVersionInfo = loadVersionInfo(str, classLoader);
            if (loadVersionInfo != null) {
                arrayList.add(loadVersionInfo);
            }
        }
        return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
    }

    public final String getClassloader() {
        return this.infoClassloader;
    }

    public final String getModule() {
        return this.infoModule;
    }

    public final String getPackage() {
        return this.infoPackage;
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public final String getTimestamp() {
        return this.infoTimestamp;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.infoPackage.length() + 20 + this.infoModule.length() + this.infoRelease.length() + this.infoTimestamp.length() + this.infoClassloader.length());
        sb2.append("VersionInfo(");
        sb2.append(this.infoPackage);
        sb2.append(':');
        sb2.append(this.infoModule);
        if (!UNAVAILABLE.equals(this.infoRelease)) {
            sb2.append(':');
            sb2.append(this.infoRelease);
        }
        if (!UNAVAILABLE.equals(this.infoTimestamp)) {
            sb2.append(':');
            sb2.append(this.infoTimestamp);
        }
        sb2.append(')');
        if (!UNAVAILABLE.equals(this.infoClassloader)) {
            sb2.append('@');
            sb2.append(this.infoClassloader);
        }
        return sb2.toString();
    }
}
