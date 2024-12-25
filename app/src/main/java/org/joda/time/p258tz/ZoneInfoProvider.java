package org.joda.time.p258tz;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/ZoneInfoProvider.class */
public class ZoneInfoProvider implements Provider {
    private final File iFileDir;
    private final ClassLoader iLoader;
    private final String iResourcePath;
    private final Set<String> iZoneInfoKeys;
    private final Map<String, Object> iZoneInfoMap;

    public ZoneInfoProvider(File file) {
        if (file == null) {
            throw new IllegalArgumentException("No file directory provided");
        }
        if (!file.exists()) {
            throw new IOException("File directory doesn't exist: " + file);
        }
        if (!file.isDirectory()) {
            throw new IOException("File doesn't refer to a directory: " + file);
        }
        this.iFileDir = file;
        this.iResourcePath = null;
        this.iLoader = null;
        Map<String, Object> loadZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
        this.iZoneInfoMap = loadZoneInfoMap;
        this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(loadZoneInfoMap.keySet()));
    }

    public ZoneInfoProvider(String str) {
        this(str, null, false);
    }

    public ZoneInfoProvider(String str, ClassLoader classLoader) {
        this(str, classLoader, true);
    }

    private ZoneInfoProvider(String str, ClassLoader classLoader, boolean z10) {
        if (str == null) {
            throw new IllegalArgumentException("No resource path provided");
        }
        String str2 = str;
        if (!str.endsWith("/")) {
            str2 = str + '/';
        }
        this.iFileDir = null;
        this.iResourcePath = str2;
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = classLoader;
            if (!z10) {
                classLoader2 = getClass().getClassLoader();
            }
        }
        this.iLoader = classLoader2;
        Map<String, Object> loadZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
        this.iZoneInfoMap = loadZoneInfoMap;
        this.iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(loadZoneInfoMap.keySet()));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.joda.time.DateTimeZone loadZoneData(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            r6 = r0
            r0 = r4
            r1 = r5
            java.io.InputStream r0 = r0.openResource(r1)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L52
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r5
            org.joda.time.DateTimeZone r0 = org.joda.time.p258tz.DateTimeZoneBuilder.readFrom(r0, r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L47
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.iZoneInfoMap     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L47
            r9 = r0
            r0 = r7
            r6 = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L47
            r10 = r0
            r0 = r7
            r6 = r0
            r0 = r10
            r1 = r8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L47
            r0 = r7
            r6 = r0
            r0 = r9
            r1 = r5
            r2 = r10
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L47
            r0 = r7
            if (r0 == 0) goto L3e
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L7f
        L3e:
            r0 = r8
            return r0
        L41:
            r7 = move-exception
            r0 = r6
            r5 = r0
            goto L75
        L47:
            r8 = move-exception
            goto L56
        L4c:
            r7 = move-exception
            r0 = r6
            r5 = r0
            goto L75
        L52:
            r8 = move-exception
            r0 = 0
            r7 = r0
        L56:
            r0 = r7
            r6 = r0
            r0 = r4
            r1 = r8
            r0.uncaughtException(r1)     // Catch: java.lang.Throwable -> L41
            r0 = r7
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.iZoneInfoMap     // Catch: java.lang.Throwable -> L41
            r1 = r5
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L41
            r0 = r7
            if (r0 == 0) goto L73
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L83
        L73:
            r0 = 0
            return r0
        L75:
            r0 = r5
            if (r0 == 0) goto L7d
            r0 = r5
            r0.close()     // Catch: java.io.IOException -> L87
        L7d:
            r0 = r7
            throw r0
        L7f:
            r5 = move-exception
            goto L3e
        L83:
            r5 = move-exception
            goto L73
        L87:
            r5 = move-exception
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p258tz.ZoneInfoProvider.loadZoneData(java.lang.String):org.joda.time.DateTimeZone");
    }

    private static Map<String, Object> loadZoneInfoMap(InputStream inputStream) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            readZoneInfoMap(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException e10) {
            }
        }
    }

    private InputStream openResource(String str) {
        InputStream inputStream;
        if (this.iFileDir != null) {
            inputStream = new FileInputStream(new File(this.iFileDir, str));
        } else {
            String concat = this.iResourcePath.concat(str);
            ClassLoader classLoader = this.iLoader;
            InputStream resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(concat) : ClassLoader.getSystemResourceAsStream(concat);
            inputStream = resourceAsStream;
            if (resourceAsStream == null) {
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Resource not found: \"");
                sb2.append(concat);
                sb2.append("\" ClassLoader: ");
                ClassLoader classLoader2 = this.iLoader;
                sb2.append(classLoader2 != null ? classLoader2.toString() : "system");
                throw new IOException(sb2.toString());
            }
        }
        return inputStream;
    }

    private static void readZoneInfoMap(DataInputStream dataInputStream, Map<String, Object> map) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            strArr[i10] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        for (int i11 = 0; i11 < readUnsignedShort2; i11++) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    @Override // org.joda.time.p258tz.Provider
    public Set<String> getAvailableIDs() {
        return this.iZoneInfoKeys;
    }

    @Override // org.joda.time.p258tz.Provider
    public DateTimeZone getZone(String str) {
        Object obj;
        if (str == null || (obj = this.iZoneInfoMap.get(str)) == null) {
            return null;
        }
        if (!(obj instanceof SoftReference)) {
            return str.equals(obj) ? loadZoneData(str) : getZone((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : loadZoneData(str);
    }

    public void uncaughtException(Exception exc) {
        exc.printStackTrace();
    }
}
