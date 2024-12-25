package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.IllegalFieldValueException;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJLocaleSymbols.class */
class GJLocaleSymbols {
    private static ConcurrentMap<Locale, GJLocaleSymbols> cCache = new ConcurrentHashMap();
    private final String[] iDaysOfWeek;
    private final String[] iEras;
    private final String[] iHalfday;
    private final int iMaxDayOfWeekLength;
    private final int iMaxEraLength;
    private final int iMaxHalfdayLength;
    private final int iMaxMonthLength;
    private final int iMaxShortDayOfWeekLength;
    private final int iMaxShortMonthLength;
    private final String[] iMonths;
    private final TreeMap<String, Integer> iParseDaysOfWeek;
    private final TreeMap<String, Integer> iParseEras;
    private final TreeMap<String, Integer> iParseMonths;
    private final String[] iShortDaysOfWeek;
    private final String[] iShortMonths;

    private GJLocaleSymbols(Locale locale) {
        DateFormatSymbols dateFormatSymbols = DateTimeUtils.getDateFormatSymbols(locale);
        this.iEras = dateFormatSymbols.getEras();
        this.iDaysOfWeek = realignDaysOfWeek(dateFormatSymbols.getWeekdays());
        this.iShortDaysOfWeek = realignDaysOfWeek(dateFormatSymbols.getShortWeekdays());
        this.iMonths = realignMonths(dateFormatSymbols.getMonths());
        this.iShortMonths = realignMonths(dateFormatSymbols.getShortMonths());
        this.iHalfday = dateFormatSymbols.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i10 = 0; i10 < 13; i10++) {
            numArr[i10] = Integer.valueOf(i10);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>((Comparator<? super String>) comparator);
        this.iParseEras = treeMap;
        addSymbols(treeMap, this.iEras, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>((Comparator<? super String>) comparator);
        this.iParseDaysOfWeek = treeMap2;
        addSymbols(treeMap2, this.iDaysOfWeek, numArr);
        addSymbols(treeMap2, this.iShortDaysOfWeek, numArr);
        addNumerals(treeMap2, 1, 7, numArr);
        TreeMap<String, Integer> treeMap3 = new TreeMap<>((Comparator<? super String>) comparator);
        this.iParseMonths = treeMap3;
        addSymbols(treeMap3, this.iMonths, numArr);
        addSymbols(treeMap3, this.iShortMonths, numArr);
        addNumerals(treeMap3, 1, 12, numArr);
        this.iMaxEraLength = maxLength(this.iEras);
        this.iMaxDayOfWeekLength = maxLength(this.iDaysOfWeek);
        this.iMaxShortDayOfWeekLength = maxLength(this.iShortDaysOfWeek);
        this.iMaxMonthLength = maxLength(this.iMonths);
        this.iMaxShortMonthLength = maxLength(this.iShortMonths);
        this.iMaxHalfdayLength = maxLength(this.iHalfday);
    }

    private static void addNumerals(TreeMap<String, Integer> treeMap, int i10, int i11, Integer[] numArr) {
        while (i10 <= i11) {
            treeMap.put(String.valueOf(i10).intern(), numArr[i10]);
            i10++;
        }
    }

    private static void addSymbols(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            int i10 = length - 1;
            if (i10 < 0) {
                return;
            }
            String str = strArr[i10];
            length = i10;
            if (str != null) {
                treeMap.put(str, numArr[i10]);
                length = i10;
            }
        }
    }

    public static GJLocaleSymbols forLocale(Locale locale) {
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        GJLocaleSymbols gJLocaleSymbols = cCache.get(locale2);
        GJLocaleSymbols gJLocaleSymbols2 = gJLocaleSymbols;
        if (gJLocaleSymbols == null) {
            gJLocaleSymbols2 = new GJLocaleSymbols(locale2);
            GJLocaleSymbols putIfAbsent = cCache.putIfAbsent(locale2, gJLocaleSymbols2);
            if (putIfAbsent != null) {
                gJLocaleSymbols2 = putIfAbsent;
            }
        }
        return gJLocaleSymbols2;
    }

    private static int maxLength(String[] strArr) {
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            int i11 = length - 1;
            if (i11 < 0) {
                return i10;
            }
            String str = strArr[i11];
            length = i11;
            if (str != null) {
                int length2 = str.length();
                length = i11;
                if (length2 > i10) {
                    i10 = length2;
                    length = i11;
                }
            }
        }
    }

    private static String[] realignDaysOfWeek(String[] strArr) {
        String[] strArr2 = new String[8];
        int i10 = 1;
        while (i10 < 8) {
            strArr2[i10] = strArr[i10 < 7 ? i10 + 1 : 1];
            i10++;
        }
        return strArr2;
    }

    private static String[] realignMonths(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i10 = 1; i10 < 13; i10++) {
            strArr2[i10] = strArr[i10 - 1];
        }
        return strArr2;
    }

    public int dayOfWeekTextToValue(String str) {
        Integer num = this.iParseDaysOfWeek.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), str);
    }

    public String dayOfWeekValueToShortText(int i10) {
        return this.iShortDaysOfWeek[i10];
    }

    public String dayOfWeekValueToText(int i10) {
        return this.iDaysOfWeek[i10];
    }

    public int eraTextToValue(String str) {
        Integer num = this.iParseEras.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }

    public String eraValueToText(int i10) {
        return this.iEras[i10];
    }

    public int getDayOfWeekMaxShortTextLength() {
        return this.iMaxShortDayOfWeekLength;
    }

    public int getDayOfWeekMaxTextLength() {
        return this.iMaxDayOfWeekLength;
    }

    public int getEraMaxTextLength() {
        return this.iMaxEraLength;
    }

    public int getHalfdayMaxTextLength() {
        return this.iMaxHalfdayLength;
    }

    public int getMonthMaxShortTextLength() {
        return this.iMaxShortMonthLength;
    }

    public int getMonthMaxTextLength() {
        return this.iMaxMonthLength;
    }

    public int halfdayTextToValue(String str) {
        int i10;
        String[] strArr = this.iHalfday;
        int length = strArr.length;
        do {
            i10 = length - 1;
            if (i10 < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), str);
            }
            length = i10;
        } while (!strArr[i10].equalsIgnoreCase(str));
        return i10;
    }

    public String halfdayValueToText(int i10) {
        return this.iHalfday[i10];
    }

    public int monthOfYearTextToValue(String str) {
        Integer num = this.iParseMonths.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), str);
    }

    public String monthOfYearValueToShortText(int i10) {
        return this.iShortMonths[i10];
    }

    public String monthOfYearValueToText(int i10) {
        return this.iMonths[i10];
    }
}
