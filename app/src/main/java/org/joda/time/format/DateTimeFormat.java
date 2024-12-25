package org.joda.time.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import p136hi.C5131m;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormat.class */
public class DateTimeFormat {
    public static final int DATE = 0;
    public static final int DATETIME = 2;
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int NONE = 4;
    private static final int PATTERN_CACHE_SIZE = 500;
    public static final int SHORT = 3;
    public static final int TIME = 1;
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<>();
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<>(25);

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormat$StyleFormatter.class */
    public static class StyleFormatter implements InternalPrinter, InternalParser {
        private static final ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<>();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        public StyleFormatter(int i10, int i11, int i12) {
            this.iDateStyle = i10;
            this.iTimeStyle = i11;
            this.iType = i12;
        }

        private DateTimeFormatter getFormatter(Locale locale) {
            Locale locale2 = locale;
            if (locale == null) {
                locale2 = Locale.getDefault();
            }
            StyleFormatterCacheKey styleFormatterCacheKey = new StyleFormatterCacheKey(this.iType, this.iDateStyle, this.iTimeStyle, locale2);
            ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> concurrentHashMap = cCache;
            DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(styleFormatterCacheKey);
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = DateTimeFormat.forPattern(getPattern(locale2));
                DateTimeFormatter putIfAbsent = concurrentHashMap.putIfAbsent(styleFormatterCacheKey, dateTimeFormatter2);
                if (putIfAbsent != null) {
                    dateTimeFormatter2 = putIfAbsent;
                }
            }
            return dateTimeFormatter2;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 40;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 40;
        }

        public String getPattern(Locale locale) {
            int i10 = this.iType;
            DateFormat dateTimeInstance = i10 != 0 ? i10 != 1 ? i10 != 2 ? null : DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale) : DateFormat.getTimeInstance(this.iTimeStyle, locale) : DateFormat.getDateInstance(this.iDateStyle, locale);
            if (dateTimeInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateTimeInstance).toPattern();
            }
            throw new IllegalArgumentException("No datetime pattern for locale: " + locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            return getFormatter(dateTimeParserBucket.getLocale()).getParser0().parseInto(dateTimeParserBucket, charSequence, i10);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            getFormatter(locale).getPrinter0().printTo(appendable, j10, chronology, i10, dateTimeZone, locale);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            getFormatter(locale).getPrinter0().printTo(appendable, readablePartial, locale);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormat$StyleFormatterCacheKey.class */
    public static class StyleFormatterCacheKey {
        private final int combinedTypeAndStyle;
        private final Locale locale;

        public StyleFormatterCacheKey(int i10, int i11, int i12, Locale locale) {
            this.locale = locale;
            this.combinedTypeAndStyle = i10 + (i11 << 4) + (i12 << 8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StyleFormatterCacheKey)) {
                return false;
            }
            StyleFormatterCacheKey styleFormatterCacheKey = (StyleFormatterCacheKey) obj;
            if (this.combinedTypeAndStyle != styleFormatterCacheKey.combinedTypeAndStyle) {
                return false;
            }
            Locale locale = this.locale;
            Locale locale2 = styleFormatterCacheKey.locale;
            return locale == null ? locale2 == null : locale.equals(locale2);
        }

        public int hashCode() {
            int i10 = this.combinedTypeAndStyle;
            Locale locale = this.locale;
            return ((i10 + 31) * 31) + (locale == null ? 0 : locale.hashCode());
        }
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    private static DateTimeFormatter createDateTimeFormatter(int i10, int i11) {
        StyleFormatter styleFormatter = new StyleFormatter(i10, i11, i10 == 4 ? 1 : i11 == 4 ? 0 : 2);
        return new DateTimeFormatter(styleFormatter, styleFormatter);
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        ConcurrentHashMap<String, DateTimeFormatter> concurrentHashMap = cPatternCache;
        DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(str);
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        if (dateTimeFormatter == null) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            parsePatternTo(dateTimeFormatterBuilder, str);
            DateTimeFormatter formatter = dateTimeFormatterBuilder.toFormatter();
            dateTimeFormatter2 = formatter;
            if (concurrentHashMap.size() < 500) {
                DateTimeFormatter putIfAbsent = concurrentHashMap.putIfAbsent(str, formatter);
                dateTimeFormatter2 = formatter;
                if (putIfAbsent != null) {
                    dateTimeFormatter2 = putIfAbsent;
                }
            }
        }
        return dateTimeFormatter2;
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str == null || str.length() != 2) {
            throw new IllegalArgumentException("Invalid style specification: " + str);
        }
        int selectStyle = selectStyle(str.charAt(0));
        int selectStyle2 = selectStyle(str.charAt(1));
        if (selectStyle == 4 && selectStyle2 == 4) {
            throw new IllegalArgumentException("Style '--' is invalid");
        }
        return createFormatterForStyleIndex(selectStyle, selectStyle2);
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i10, int i11) {
        int i12 = (i10 << 2) + i10 + i11;
        AtomicReferenceArray<DateTimeFormatter> atomicReferenceArray = cStyleCache;
        if (i12 >= atomicReferenceArray.length()) {
            return createDateTimeFormatter(i10, i11);
        }
        DateTimeFormatter dateTimeFormatter = atomicReferenceArray.get(i12);
        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
        if (dateTimeFormatter == null) {
            DateTimeFormatter createDateTimeFormatter = createDateTimeFormatter(i10, i11);
            dateTimeFormatter2 = createDateTimeFormatter;
            if (!C5131m.m25720a(atomicReferenceArray, i12, null, createDateTimeFormatter)) {
                dateTimeFormatter2 = atomicReferenceArray.get(i12);
            }
        }
        return dateTimeFormatter2;
    }

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        switch (str.charAt(0)) {
            case 'C':
            case 'D':
            case 'F':
            case 'H':
            case 'K':
            case 'S':
            case 'W':
            case 'Y':
            case 'c':
            case 'd':
            case 'e':
            case 'h':
            case 'k':
            case 'm':
            case 's':
            case 'w':
            case 'x':
            case 'y':
                return true;
            case 'M':
                return length <= 2;
            default:
                return false;
        }
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        boolean z10;
        boolean z11;
        int length = str.length();
        int[] iArr = new int[1];
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= length) {
                return;
            }
            iArr[0] = i11;
            String parseToken = parseToken(str, iArr);
            int i12 = iArr[0];
            int length2 = parseToken.length();
            if (length2 == 0) {
                return;
            }
            char charAt = parseToken.charAt(0);
            if (charAt == '\'') {
                String substring = parseToken.substring(1);
                if (substring.length() == 1) {
                    dateTimeFormatterBuilder.appendLiteral(substring.charAt(0));
                } else {
                    dateTimeFormatterBuilder.appendLiteral(new String(substring));
                }
            } else if (charAt == 'K') {
                dateTimeFormatterBuilder.appendHourOfHalfday(length2);
            } else if (charAt != 'M') {
                if (charAt == 'S') {
                    dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                } else if (charAt == 'a') {
                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                } else if (charAt == 'h') {
                    dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                } else if (charAt == 'k') {
                    dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                } else if (charAt == 'm') {
                    dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                } else if (charAt == 's') {
                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                } else if (charAt == 'G') {
                    dateTimeFormatterBuilder.appendEraText();
                } else if (charAt != 'H') {
                    if (charAt != 'Y') {
                        if (charAt == 'Z') {
                            if (length2 == 1) {
                                z11 = false;
                            } else if (length2 == 2) {
                                z11 = true;
                            } else {
                                dateTimeFormatterBuilder.appendTimeZoneId();
                            }
                            dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", z11, 2, 2);
                        } else if (charAt == 'd') {
                            dateTimeFormatterBuilder.appendDayOfMonth(length2);
                        } else if (charAt != 'e') {
                            switch (charAt) {
                                case 'C':
                                    dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                    continue;
                                case 'D':
                                    dateTimeFormatterBuilder.appendDayOfYear(length2);
                                    continue;
                                case 'E':
                                    if (length2 < 4) {
                                        dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                        break;
                                    } else {
                                        dateTimeFormatterBuilder.appendDayOfWeekText();
                                        continue;
                                    }
                                default:
                                    switch (charAt) {
                                        case 'w':
                                            dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                            break;
                                        case 'x':
                                        case 'y':
                                            break;
                                        case 'z':
                                            if (length2 < 4) {
                                                dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                                break;
                                            } else {
                                                dateTimeFormatterBuilder.appendTimeZoneName();
                                                break;
                                            }
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: " + parseToken);
                                    }
                            }
                        } else {
                            dateTimeFormatterBuilder.appendDayOfWeek(length2);
                        }
                    }
                    if (length2 == 2) {
                        if (i12 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            z10 = !isNumericToken(parseToken(str, iArr));
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z10 = true;
                        }
                        if (charAt != 'x') {
                            dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z10);
                        } else {
                            dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z10);
                        }
                    } else {
                        int i13 = 9;
                        int i14 = 9;
                        if (i12 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            if (isNumericToken(parseToken(str, iArr))) {
                                i13 = length2;
                            }
                            iArr[0] = iArr[0] - 1;
                            i14 = i13;
                        }
                        if (charAt == 'Y') {
                            dateTimeFormatterBuilder.appendYearOfEra(length2, i14);
                        } else if (charAt == 'x') {
                            dateTimeFormatterBuilder.appendWeekyear(length2, i14);
                        } else if (charAt == 'y') {
                            dateTimeFormatterBuilder.appendYear(length2, i14);
                        }
                    }
                } else {
                    dateTimeFormatterBuilder.appendHourOfDay(length2);
                }
            } else if (length2 < 3) {
                dateTimeFormatterBuilder.appendMonthOfYear(length2);
            } else if (length2 >= 4) {
                dateTimeFormatterBuilder.appendMonthOfYearText();
            } else {
                dateTimeFormatterBuilder.appendMonthOfYearShortText();
            }
            i10 = i12 + 1;
        }
    }

    private static String parseToken(String str, int[] iArr) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        int i11 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i11);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb2.append(charAt);
            while (true) {
                int i12 = i11 + 1;
                i10 = i11;
                if (i12 >= length) {
                    break;
                }
                i10 = i11;
                if (str.charAt(i12) != charAt) {
                    break;
                }
                sb2.append(charAt);
                i11 = i12;
            }
        } else {
            sb2.append('\'');
            boolean z10 = false;
            while (true) {
                i10 = i11;
                if (i11 >= length) {
                    break;
                }
                char charAt2 = str.charAt(i11);
                if (charAt2 == '\'') {
                    int i13 = i11 + 1;
                    if (i13 >= length || str.charAt(i13) != '\'') {
                        z10 = !z10;
                    } else {
                        sb2.append(charAt2);
                        i11 = i13;
                    }
                } else if (z10 || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb2.append(charAt2);
                }
                i11++;
            }
            i10 = i11 - 1;
        }
        iArr[0] = i10;
        return sb2.toString();
    }

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter createFormatterForStyle = createFormatterForStyle(str);
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        return ((StyleFormatter) createFormatterForStyle.getPrinter0()).getPattern(locale2);
    }

    private static int selectStyle(char c10) {
        if (c10 == '-') {
            return 4;
        }
        if (c10 == 'F') {
            return 0;
        }
        if (c10 == 'S') {
            return 3;
        }
        if (c10 == 'L') {
            return 1;
        }
        if (c10 == 'M') {
            return 2;
        }
        throw new IllegalArgumentException("Invalid style character: " + c10);
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }
}
