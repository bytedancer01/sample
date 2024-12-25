package org.joda.time.chrono;

import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/BasicGJChronology.class */
abstract class BasicGJChronology extends BasicChronology {
    private static final long FEB_29 = 5097600000L;
    private static final long serialVersionUID = 538276888268L;
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];

    static {
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= 11) {
                return;
            }
            j10 += MIN_DAYS_PER_MONTH_ARRAY[i11] * TimeChart.DAY;
            int i12 = i11 + 1;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i12] = j10;
            j11 += MAX_DAYS_PER_MONTH_ARRAY[i11] * TimeChart.DAY;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i12] = j11;
            i10 = i12;
        }
    }

    public BasicGJChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj, i10);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i10) {
        return MAX_DAYS_PER_MONTH_ARRAY[i10 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMaxForSet(long j10, int i10) {
        int i11 = 28;
        if (i10 > 28 || i10 < 1) {
            i11 = getDaysInMonthMax(j10);
        }
        return i11;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i10, int i11) {
        return isLeapYear(i10) ? MAX_DAYS_PER_MONTH_ARRAY[i11 - 1] : MIN_DAYS_PER_MONTH_ARRAY[i11 - 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0 < 5062500) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ab, code lost:
    
        r8 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a6, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r0 < 12825000) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c8, code lost:
    
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c3, code lost:
    
        r8 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r0 < 20587500) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ef, code lost:
    
        r8 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
    
        r8 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        if (r0 < 28265625) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
    
        r8 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0109, code lost:
    
        r8 = 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        if (r0 < 4978125) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
    
        if (r0 < 12740625) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e6, code lost:
    
        if (r0 < 20503125) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0106, code lost:
    
        if (r0 < 28181250) goto L66;
     */
    @Override // org.joda.time.chrono.BasicChronology
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getMonthOfYear(long r6, int r8) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicGJChronology.getMonthOfYear(long, int):int");
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i10, int i11) {
        return isLeapYear(i10) ? MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i11 - 1] : MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i11 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j10, long j11) {
        int year = getYear(j10);
        int year2 = getYear(j11);
        long yearMillis = j10 - getYearMillis(year);
        long yearMillis2 = j11 - getYearMillis(year2);
        long j12 = yearMillis;
        long j13 = yearMillis2;
        if (yearMillis2 >= FEB_29) {
            if (isLeapYear(year2)) {
                j12 = yearMillis;
                j13 = yearMillis2;
                if (!isLeapYear(year)) {
                    j13 = yearMillis2 - TimeChart.DAY;
                    j12 = yearMillis;
                }
            } else {
                j12 = yearMillis;
                j13 = yearMillis2;
                if (yearMillis >= FEB_29) {
                    j12 = yearMillis;
                    j13 = yearMillis2;
                    if (isLeapYear(year)) {
                        j12 = yearMillis - TimeChart.DAY;
                        j13 = yearMillis2;
                    }
                }
            }
        }
        int i10 = year - year2;
        int i11 = i10;
        if (j12 < j13) {
            i11 = i10 - 1;
        }
        return i11;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapDay(long j10) {
        return dayOfMonth().get(j10) == 29 && monthOfYear().isLeap(j10);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j10, int i10) {
        int year = getYear(j10);
        int dayOfYear = getDayOfYear(j10, year);
        int millisOfDay = getMillisOfDay(j10);
        int i11 = dayOfYear;
        if (dayOfYear > 59) {
            if (isLeapYear(year)) {
                i11 = dayOfYear;
                if (!isLeapYear(i10)) {
                    i11 = dayOfYear - 1;
                }
            } else {
                i11 = dayOfYear;
                if (isLeapYear(i10)) {
                    i11 = dayOfYear + 1;
                }
            }
        }
        return getYearMonthDayMillis(i10, 1, i11) + millisOfDay;
    }
}
