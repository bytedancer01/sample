package org.apache.http.client.utils;

import java.lang.ref.SoftReference;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.apache.http.util.Args;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:org/apache/http/client/utils/DateUtils.class
 */
/* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/DateUtils.class */
public final class DateUtils {
    private static final String[] DEFAULT_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    private static final Date DEFAULT_TWO_DIGIT_YEAR_START;
    public static final TimeZone GMT;
    public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
    public static final String PATTERN_RFC1036 = "EEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:org/apache/http/client/utils/DateUtils$DateFormatHolder.class
     */
    /* loaded from: combined.jar:classes1.jar:org/apache/http/client/utils/DateUtils$DateFormatHolder.class */
    public static final class DateFormatHolder {
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> THREADLOCAL_FORMATS = new ThreadLocal<>();

        public static void clearThreadLocal() {
            THREADLOCAL_FORMATS.remove();
        }

        public static SimpleDateFormat formatFor(String str) {
            ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> threadLocal = THREADLOCAL_FORMATS;
            SoftReference<Map<String, SimpleDateFormat>> softReference = threadLocal.get();
            Map<String, SimpleDateFormat> map = softReference == null ? null : softReference.get();
            Map<String, SimpleDateFormat> map2 = map;
            if (map == null) {
                map2 = new HashMap();
                threadLocal.set(new SoftReference<>(map2));
            }
            SimpleDateFormat simpleDateFormat = map2.get(str);
            SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
            if (simpleDateFormat == null) {
                simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
                simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
                map2.put(str, simpleDateFormat2);
            }
            return simpleDateFormat2;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        GMT = timeZone;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        DEFAULT_TWO_DIGIT_YEAR_START = calendar.getTime();
    }

    private DateUtils() {
    }

    public static void clearThreadLocal() {
        DateFormatHolder.clearThreadLocal();
    }

    public static String formatDate(Date date) {
        return formatDate(date, "EEE, dd MMM yyyy HH:mm:ss zzz");
    }

    public static String formatDate(Date date, String str) {
        Args.notNull(date, "Date");
        Args.notNull(str, "Pattern");
        return DateFormatHolder.formatFor(str).format(date);
    }

    public static Date parseDate(String str) {
        return parseDate(str, null, null);
    }

    public static Date parseDate(String str, String[] strArr) {
        return parseDate(str, strArr, null);
    }

    public static Date parseDate(String str, String[] strArr, Date date) {
        Args.notNull(str, "Date value");
        if (strArr == null) {
            strArr = DEFAULT_PATTERNS;
        }
        if (date == null) {
            date = DEFAULT_TWO_DIGIT_YEAR_START;
        }
        String str2 = str;
        if (str.length() > 1) {
            str2 = str;
            if (str.startsWith("'")) {
                str2 = str;
                if (str.endsWith("'")) {
                    str2 = str.substring(1, str.length() - 1);
                }
            }
        }
        for (String str3 : strArr) {
            SimpleDateFormat formatFor = DateFormatHolder.formatFor(str3);
            formatFor.set2DigitYearStart(date);
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = formatFor.parse(str2, parsePosition);
            if (parsePosition.getIndex() != 0) {
                return parse;
            }
        }
        return null;
    }
}
