package org.pcap4j.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: combined.jar:classes3.jar:org/pcap4j/util/PropertiesLoader.class */
public class PropertiesLoader {
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) PropertiesLoader.class);
    private final Map<String, Object> cache;
    private final boolean caching;
    private final Properties prop;
    private final String resourceName;
    private final boolean systemPropertiesOverPropertiesFile;

    public PropertiesLoader(String str, boolean z10, boolean z11) {
        Properties properties = new Properties();
        this.prop = properties;
        this.cache = new HashMap();
        this.resourceName = str;
        this.systemPropertiesOverPropertiesFile = z10;
        this.caching = z11;
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            logger.warn("{} not found.", str);
            return;
        }
        try {
            properties.load(resourceAsStream);
        } catch (IOException e10) {
            logger.error("Exception follows", (Throwable) e10);
        }
    }

    public final void clearCache() {
        synchronized (this.cache) {
            this.cache.clear();
        }
    }

    public Boolean getBoolean(String str, Boolean bool) {
        synchronized (this.cache) {
            if (this.caching && this.cache.containsKey(str)) {
                Boolean bool2 = (Boolean) this.cache.get(str);
                logger.debug("[{}] Got {} from cache by {}", this.resourceName, bool2, str);
                return bool2;
            }
            Boolean bool3 = null;
            if (this.systemPropertiesOverPropertiesFile) {
                String property = System.getProperty(str);
                bool3 = null;
                if (property != null) {
                    bool3 = Boolean.valueOf(property);
                    logger.info("[System properties] Got \"{}\" which means {} by {}", property, bool3, str);
                }
            }
            if (bool3 == null) {
                String property2 = this.prop.getProperty(str);
                if (property2 != null) {
                    bool = Boolean.valueOf(property2);
                    logger.info("[{}] Got\"{}\" which means {} by {}", this.resourceName, property2, bool, str);
                } else {
                    logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, bool);
                }
            } else {
                bool = bool3;
            }
            if (this.caching) {
                this.cache.put(str, bool);
            }
            return bool;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: all -> 0x017a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x0010, B:8:0x001d, B:9:0x004a, B:14:0x0059, B:16:0x0060, B:21:0x0071, B:23:0x007f, B:27:0x0094, B:29:0x009b, B:31:0x00a9, B:35:0x00bc, B:46:0x00cb, B:38:0x0162, B:40:0x0169, B:42:0x0177, B:37:0x0140, B:50:0x00f5, B:52:0x011b), top: B:3:0x0009, inners: #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169 A[Catch: all -> 0x017a, TryCatch #3 {, blocks: (B:4:0x0009, B:6:0x0010, B:8:0x001d, B:9:0x004a, B:14:0x0059, B:16:0x0060, B:21:0x0071, B:23:0x007f, B:27:0x0094, B:29:0x009b, B:31:0x00a9, B:35:0x00bc, B:46:0x00cb, B:38:0x0162, B:40:0x0169, B:42:0x0177, B:37:0x0140, B:50:0x00f5, B:52:0x011b), top: B:3:0x0009, inners: #5, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Class] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Class<? extends T> getClass(java.lang.String r8, java.lang.Class<? extends T> r9) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.util.PropertiesLoader.getClass(java.lang.String, java.lang.Class):java.lang.Class");
    }

    public InetAddress getInetAddress(String str, InetAddress inetAddress) {
        synchronized (this.cache) {
            if (this.caching && this.cache.containsKey(str)) {
                InetAddress inetAddress2 = (InetAddress) this.cache.get(str);
                logger.debug("[{}] Got {} from cache by {}", this.resourceName, inetAddress2, str);
                return inetAddress2;
            }
            InetAddress inetAddress3 = null;
            if (this.systemPropertiesOverPropertiesFile) {
                String property = System.getProperty(str);
                inetAddress3 = null;
                if (property != null) {
                    inetAddress3 = null;
                    try {
                        InetAddress byName = InetAddress.getByName(property);
                        inetAddress3 = byName;
                        logger.info("[System properties] Got \"{}\" which means {} by {}", property, byName, str);
                        inetAddress3 = byName;
                    } catch (UnknownHostException e10) {
                        logger.error("[System properties] Got Invalid value: {} by {}, ignore it.", property, str);
                    }
                }
            }
            if (inetAddress3 == null) {
                String property2 = this.prop.getProperty(str);
                if (property2 != null) {
                    try {
                        InetAddress byName2 = InetAddress.getByName(property2);
                        logger.info("[{}] Got\"{}\" which means {} by {}", this.resourceName, property2, byName2, str);
                        inetAddress = byName2;
                    } catch (UnknownHostException e11) {
                        logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property2, str, inetAddress);
                    }
                } else {
                    logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, inetAddress);
                }
            } else {
                inetAddress = inetAddress3;
            }
            if (this.caching) {
                this.cache.put(str, inetAddress);
            }
            return inetAddress;
        }
    }

    public int[] getIntArray(String str, int[] iArr) {
        synchronized (this.cache) {
            if (this.caching && this.cache.containsKey(str)) {
                int[] iArr2 = (int[]) this.cache.get(str);
                logger.debug("[{}] Got {} from cache by {}", this.resourceName, Arrays.toString(iArr2), str);
                return (int[]) iArr2.clone();
            }
            int[] iArr3 = null;
            if (this.systemPropertiesOverPropertiesFile) {
                String property = System.getProperty(str);
                iArr3 = null;
                if (property != null) {
                    iArr3 = null;
                    try {
                        String[] split = property.split(",");
                        int[] iArr4 = new int[split.length];
                        for (int i10 = 0; i10 < split.length; i10++) {
                            iArr4[i10] = Integer.parseInt(split[i10]);
                        }
                        iArr3 = iArr4;
                        logger.info("[System properties] Got \"{}\" which means {} by {}", property, Arrays.toString(iArr4), str);
                        iArr3 = iArr4;
                    } catch (NumberFormatException e10) {
                        logger.error("[System properties] Got Invalid value: {} by {}, ignore it.", property, str);
                    }
                }
            }
            if (iArr3 == null) {
                String property2 = this.prop.getProperty(str);
                if (property2 != null) {
                    try {
                        String[] split2 = property2.split(",");
                        int[] iArr5 = new int[split2.length];
                        for (int i11 = 0; i11 < split2.length; i11++) {
                            iArr5[i11] = Integer.parseInt(split2[i11]);
                        }
                        logger.info("[{}] Got\"{}\" which means {} by {}", this.resourceName, property2, Arrays.toString(iArr5), str);
                        iArr = iArr5;
                    } catch (NumberFormatException e11) {
                        logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property2, str, Arrays.toString(iArr));
                    }
                } else {
                    logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, Arrays.toString(iArr));
                }
            } else {
                iArr = iArr3;
            }
            if (this.caching) {
                this.cache.put(str, iArr);
            }
            return iArr;
        }
    }

    public Integer getInteger(String str, Integer num) {
        synchronized (this.cache) {
            if (this.caching && this.cache.containsKey(str)) {
                Integer num2 = (Integer) this.cache.get(str);
                logger.debug("[{}] Got {} from cache by {}", this.resourceName, num2, str);
                return num2;
            }
            Integer num3 = null;
            if (this.systemPropertiesOverPropertiesFile) {
                num3 = Integer.getInteger(str);
            }
            if (num3 != null) {
                logger.info("[System properties] Got {} by {}", num3, str);
                num = num3;
            } else {
                String property = this.prop.getProperty(str);
                if (property != null) {
                    try {
                        Integer decode = Integer.decode(property);
                        logger.info("[{}] Got {} by {}", this.resourceName, decode, str);
                        num = decode;
                    } catch (NumberFormatException e10) {
                        logger.warn("[{}] {} is invalid for {}, use default value: {}", this.resourceName, property, str, num);
                    }
                } else {
                    logger.info("[{}] Could not get value by {}, use default value: {}", this.resourceName, str, num);
                }
            }
            if (this.caching) {
                this.cache.put(str, num);
            }
            return num;
        }
    }

    public final Properties getProp() {
        Properties properties = new Properties();
        properties.putAll(this.prop);
        return properties;
    }

    public final String getResourceName() {
        return this.resourceName;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:8:0x001d, B:9:0x004a, B:14:0x004f, B:16:0x0056, B:19:0x005f, B:23:0x00bb, B:25:0x00c1, B:27:0x00cf, B:30:0x0070, B:32:0x007d, B:33:0x009d), top: B:3:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pcap4j.util.PropertiesLoader.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    public final boolean isCaching() {
        return this.caching;
    }

    public final boolean isSystemPropertiesOverPropertiesFile() {
        return this.systemPropertiesOverPropertiesFile;
    }
}
