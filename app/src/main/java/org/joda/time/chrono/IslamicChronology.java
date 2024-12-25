package org.joda.time.chrono;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/IslamicChronology.class */
public final class IslamicChronology extends BasicChronology {

    /* renamed from: AH */
    public static final int f36186AH = 1;
    private static final int CYCLE = 30;
    private static final int LONG_MONTH_LENGTH = 30;
    private static final int MAX_YEAR = 292271022;
    private static final long MILLIS_PER_CYCLE = 918518400000L;
    private static final long MILLIS_PER_LONG_MONTH = 2592000000L;
    private static final long MILLIS_PER_LONG_YEAR = 30672000000L;
    private static final long MILLIS_PER_MONTH = 2551440384L;
    private static final long MILLIS_PER_MONTH_PAIR = 5097600000L;
    private static final long MILLIS_PER_SHORT_YEAR = 30585600000L;
    private static final long MILLIS_PER_YEAR = 30617280288L;
    private static final long MILLIS_YEAR_1 = -42521587200000L;
    private static final int MIN_YEAR = -292269337;
    private static final int MONTH_PAIR_LENGTH = 59;
    private static final int SHORT_MONTH_LENGTH = 29;
    private static final long serialVersionUID = -3663823829888L;
    private final LeapYearPatternType iLeapYears;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AH");
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 623158436);
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 623191204);
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 690562340);
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 153692453);
    private static final ConcurrentHashMap<DateTimeZone, IslamicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final IslamicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/IslamicChronology$LeapYearPatternType.class */
    public static class LeapYearPatternType implements Serializable {
        private static final long serialVersionUID = 26581275372698L;
        public final byte index;
        public final int pattern;

        public LeapYearPatternType(int i10, int i11) {
            this.index = (byte) i10;
            this.pattern = i11;
        }

        private Object readResolve() {
            byte b10 = this.index;
            return b10 != 0 ? b10 != 1 ? b10 != 2 ? b10 != 3 ? this : IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB : IslamicChronology.LEAP_YEAR_INDIAN : IslamicChronology.LEAP_YEAR_16_BASED : IslamicChronology.LEAP_YEAR_15_BASED;
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof LeapYearPatternType) {
                z10 = false;
                if (this.index == ((LeapYearPatternType) obj).index) {
                    z10 = true;
                }
            }
            return z10;
        }

        public int hashCode() {
            return this.index;
        }

        public boolean isLeapYear(int i10) {
            boolean z10 = true;
            if (((1 << (i10 % 30)) & this.pattern) <= 0) {
                z10 = false;
            }
            return z10;
        }
    }

    public IslamicChronology(Chronology chronology, Object obj, LeapYearPatternType leapYearPatternType) {
        super(chronology, obj, 4);
        this.iLeapYears = leapYearPatternType;
    }

    public static IslamicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone dateTimeZone, LeapYearPatternType leapYearPatternType) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, IslamicChronology[]> concurrentHashMap = cCache;
        IslamicChronology[] islamicChronologyArr = concurrentHashMap.get(dateTimeZone2);
        IslamicChronology[] islamicChronologyArr2 = islamicChronologyArr;
        if (islamicChronologyArr == null) {
            islamicChronologyArr2 = new IslamicChronology[4];
            IslamicChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, islamicChronologyArr2);
            if (putIfAbsent != null) {
                islamicChronologyArr2 = putIfAbsent;
            }
        }
        IslamicChronology islamicChronology = islamicChronologyArr2[leapYearPatternType.index];
        IslamicChronology islamicChronology2 = islamicChronology;
        if (islamicChronology == null) {
            synchronized (islamicChronologyArr2) {
                try {
                    IslamicChronology islamicChronology3 = islamicChronologyArr2[leapYearPatternType.index];
                    islamicChronology2 = islamicChronology3;
                    if (islamicChronology3 == null) {
                        DateTimeZone dateTimeZone3 = DateTimeZone.UTC;
                        if (dateTimeZone2 == dateTimeZone3) {
                            IslamicChronology islamicChronology4 = new IslamicChronology(null, null, leapYearPatternType);
                            islamicChronology2 = new IslamicChronology(LimitChronology.getInstance(islamicChronology4, new DateTime(1, 1, 1, 0, 0, 0, 0, islamicChronology4), null), null, leapYearPatternType);
                        } else {
                            islamicChronology2 = new IslamicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone3, leapYearPatternType), dateTimeZone2), null, leapYearPatternType);
                        }
                        islamicChronologyArr2[leapYearPatternType.index] = islamicChronology2;
                    }
                } catch (Throwable th2) {
                    IslamicChronology[] islamicChronologyArr3 = islamicChronologyArr2;
                    throw th2;
                }
            }
        }
        return islamicChronology2;
    }

    public static IslamicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 12);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i10) {
        if (i10 > MAX_YEAR) {
            throw new ArithmeticException("Year is too large: " + i10 + " > " + MAX_YEAR);
        }
        if (i10 < MIN_YEAR) {
            throw new ArithmeticException("Year is too small: " + i10 + " < " + MIN_YEAR);
        }
        int i11 = i10 - 1;
        long j10 = ((i11 / 30) * MILLIS_PER_CYCLE) - 42521587200000L;
        for (int i12 = 1; i12 < (i11 % 30) + 1; i12++) {
            j10 += isLeapYear(i12) ? MILLIS_PER_LONG_YEAR : MILLIS_PER_SHORT_YEAR;
        }
        return j10;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IslamicChronology)) {
            return false;
        }
        if (getLeapYearPatternType().index != ((IslamicChronology) obj).getLeapYearPatternType().index || !super.equals(obj)) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 21260793600000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15308640144L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDayOfMonth(long j10) {
        int dayOfYear = getDayOfYear(j10) - 1;
        if (dayOfYear == 354) {
            return 30;
        }
        return ((dayOfYear % 59) % 30) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax() {
        return 30;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i10) {
        if (i10 == 12) {
            return 30;
        }
        return (i10 - 1) % 2 == 0 ? 30 : 29;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYear(int i10) {
        return isLeapYear(i10) ? 355 : 354;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMax() {
        return 355;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i10, int i11) {
        if (i11 == 12 && isLeapYear(i10)) {
            return 30;
        }
        return (i11 - 1) % 2 == 0 ? 30 : 29;
    }

    public LeapYearPatternType getLeapYearPatternType() {
        return this.iLeapYears;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMinYear() {
        return 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j10, int i10) {
        int yearMillis = (int) ((j10 - getYearMillis(i10)) / TimeChart.DAY);
        if (yearMillis == 354) {
            return 12;
        }
        return ((yearMillis * 2) / 59) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i10, int i11) {
        int i12 = i11 - 1;
        int i13 = i12 / 2;
        return i12 % 2 == 1 ? (i13 * MILLIS_PER_MONTH_PAIR) + 2592000000L : i13 * MILLIS_PER_MONTH_PAIR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r10 = 30585600000L;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0063 -> B:4:0x0035). Please report as a decompilation issue!!! */
    @Override // org.joda.time.chrono.BasicChronology
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getYear(long r6) {
        /*
            r5 = this;
            r0 = r6
            r1 = 42521587200000(0x26ac5419b000, double:2.1008455442163E-310)
            long r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r0 = r0 / r1
            r6 = r0
            r0 = r10
            r1 = 918518400000(0xd5dbf68400, double:4.53808386513E-312)
            long r0 = r0 % r1
            r10 = r0
            r0 = r6
            r1 = 30
            long r0 = r0 * r1
            r1 = 1
            long r0 = r0 + r1
            int r0 = (int) r0
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r10
            r6 = r0
            r0 = r5
            r1 = r9
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L3d
            r0 = r10
            r6 = r0
            r0 = r9
            r8 = r0
        L35:
            r0 = 30672000000(0x724319400, double:1.5153981489E-313)
            r10 = r0
            goto L42
        L3d:
            r0 = 30585600000(0x71f0b3800, double:1.51112942174E-313)
            r10 = r0
        L42:
            r0 = r6
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L6c
            r0 = r6
            r1 = r10
            long r0 = r0 - r1
            r10 = r0
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r10
            r6 = r0
            r0 = r5
            r1 = r9
            boolean r0 = r0.isLeapYear(r1)
            if (r0 == 0) goto L3d
            r0 = r9
            r8 = r0
            r0 = r10
            r6 = r0
            goto L35
        L6c:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.IslamicChronology.getYear(long):int");
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j10, long j11) {
        int year = getYear(j10);
        int year2 = getYear(j11);
        long yearMillis = getYearMillis(year);
        long yearMillis2 = getYearMillis(year2);
        int i10 = year - year2;
        int i11 = i10;
        if (j10 - yearMillis < j11 - yearMillis2) {
            i11 = i10 - 1;
        }
        return i11;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int hashCode() {
        return (super.hashCode() * 13) + getLeapYearPatternType().hashCode();
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i10) {
        return this.iLeapYears.isLeapYear(i10);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j10, int i10) {
        int dayOfYear = getDayOfYear(j10, getYear(j10));
        int millisOfDay = getMillisOfDay(j10);
        int i11 = dayOfYear;
        if (dayOfYear > 354) {
            i11 = dayOfYear;
            if (!isLeapYear(i10)) {
                i11 = dayOfYear - 1;
            }
        }
        return getYearMonthDayMillis(i10, 1, i11) + millisOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getZone() ? this : getInstance(dateTimeZone2);
    }
}
