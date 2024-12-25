package org.joda.time.p258tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.joda.time.DateTimeUtils;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DefaultNameProvider.class */
public class DefaultNameProvider implements NameProvider {
    private HashMap<Locale, Map<String, Map<String, Object>>> iByLocaleCache = createCache();
    private HashMap<Locale, Map<String, Map<Boolean, Object>>> iByLocaleCache2 = createCache();

    private HashMap createCache() {
        return new HashMap(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map] */
    private String[] getNameSet(Locale locale, String str, String str2) {
        String[] strArr;
        String[] strArr2;
        synchronized (this) {
            if (locale == null || str == null || str2 == null) {
                return null;
            }
            ?? r02 = (Map) this.iByLocaleCache.get(locale);
            HashMap hashMap = r02;
            if (r02 == 0) {
                HashMap<Locale, Map<String, Map<String, Object>>> hashMap2 = this.iByLocaleCache;
                hashMap = createCache();
                hashMap2.put(locale, hashMap);
            }
            ?? r03 = (Map) hashMap.get(str);
            HashMap hashMap3 = r03;
            if (r03 == 0) {
                HashMap createCache = createCache();
                hashMap.put(str, createCache);
                String[][] zoneStrings = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i10];
                    if (strArr != null && strArr.length == 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i10++;
                }
                String[][] zoneStrings2 = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i11 = 0;
                while (true) {
                    strArr2 = null;
                    if (i11 >= length2) {
                        break;
                    }
                    strArr2 = zoneStrings2[i11];
                    if (strArr2 != null && strArr2.length == 5 && str.equals(strArr2[0])) {
                        break;
                    }
                    i11++;
                }
                hashMap3 = createCache;
                if (strArr != null) {
                    hashMap3 = createCache;
                    if (strArr2 != null) {
                        createCache.put(strArr[2], new String[]{strArr2[2], strArr2[1]});
                        if (strArr[2].equals(strArr[4])) {
                            createCache.put(strArr[4] + "-Summer", new String[]{strArr2[4], strArr2[3]});
                            hashMap3 = createCache;
                        } else {
                            createCache.put(strArr[4], new String[]{strArr2[4], strArr2[3]});
                            hashMap3 = createCache;
                        }
                    }
                }
            }
            return (String[]) hashMap3.get(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Map] */
    private String[] getNameSet(Locale locale, String str, String str2, boolean z10) {
        String[] strArr;
        String[] strArr2;
        synchronized (this) {
            if (locale == null || str == null || str2 == null) {
                return null;
            }
            ?? r02 = (Map) this.iByLocaleCache2.get(locale);
            HashMap hashMap = r02;
            if (r02 == 0) {
                HashMap<Locale, Map<String, Map<Boolean, Object>>> hashMap2 = this.iByLocaleCache2;
                hashMap = createCache();
                hashMap2.put(locale, hashMap);
            }
            ?? r03 = (Map) hashMap.get(str);
            HashMap hashMap3 = r03;
            if (r03 == 0) {
                HashMap createCache = createCache();
                hashMap.put(str, createCache);
                String[][] zoneStrings = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i10];
                    if (strArr != null && strArr.length == 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i10++;
                }
                String[][] zoneStrings2 = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
                int length2 = zoneStrings2.length;
                int i11 = 0;
                while (true) {
                    strArr2 = null;
                    if (i11 >= length2) {
                        break;
                    }
                    strArr2 = zoneStrings2[i11];
                    if (strArr2 != null && strArr2.length == 5 && str.equals(strArr2[0])) {
                        break;
                    }
                    i11++;
                }
                hashMap3 = createCache;
                if (strArr != null) {
                    hashMap3 = createCache;
                    if (strArr2 != null) {
                        createCache.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                        createCache.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                        hashMap3 = createCache;
                    }
                }
            }
            return (String[]) hashMap3.get(Boolean.valueOf(z10));
        }
    }

    @Override // org.joda.time.p258tz.NameProvider
    public String getName(Locale locale, String str, String str2) {
        String[] nameSet = getNameSet(locale, str, str2);
        return nameSet == null ? null : nameSet[1];
    }

    public String getName(Locale locale, String str, String str2, boolean z10) {
        String[] nameSet = getNameSet(locale, str, str2, z10);
        return nameSet == null ? null : nameSet[1];
    }

    @Override // org.joda.time.p258tz.NameProvider
    public String getShortName(Locale locale, String str, String str2) {
        String[] nameSet = getNameSet(locale, str, str2);
        return nameSet == null ? null : nameSet[0];
    }

    public String getShortName(Locale locale, String str, String str2, boolean z10) {
        String[] nameSet = getNameSet(locale, str, str2, z10);
        return nameSet == null ? null : nameSet[0];
    }
}
