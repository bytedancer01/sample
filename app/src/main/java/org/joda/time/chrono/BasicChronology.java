package org.joda.time.chrono;

import java.util.Locale;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.ZeroIsMaxDateTimeField;
import org.minidns.dnsserverlookup.AndroidUsingExec;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/BasicChronology.class */
abstract class BasicChronology extends AssembledChronology {
    private static final int CACHE_MASK = 1023;
    private static final int CACHE_SIZE = 1024;
    private static final DateTimeField cClockhourOfDayField;
    private static final DateTimeField cClockhourOfHalfdayField;
    private static final DurationField cDaysField;
    private static final DateTimeField cHalfdayOfDayField;
    private static final DurationField cHalfdaysField;
    private static final DateTimeField cHourOfDayField;
    private static final DateTimeField cHourOfHalfdayField;
    private static final DurationField cHoursField;
    private static final DurationField cMillisField;
    private static final DateTimeField cMillisOfDayField;
    private static final DateTimeField cMillisOfSecondField;
    private static final DateTimeField cMinuteOfDayField;
    private static final DateTimeField cMinuteOfHourField;
    private static final DurationField cMinutesField;
    private static final DateTimeField cSecondOfDayField;
    private static final DateTimeField cSecondOfMinuteField;
    private static final DurationField cSecondsField;
    private static final DurationField cWeeksField;
    private static final long serialVersionUID = 8283225332206808863L;
    private final int iMinDaysInFirstWeek;
    private final transient YearInfo[] iYearInfoCache;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/BasicChronology$HalfdayField.class */
    public static class HalfdayField extends PreciseDateTimeField {
        private static final long serialVersionUID = 581601443656929254L;

        public HalfdayField() {
            super(DateTimeFieldType.halfdayOfDay(), BasicChronology.cHalfdaysField, BasicChronology.cDaysField);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i10, Locale locale) {
            return GJLocaleSymbols.forLocale(locale).halfdayValueToText(i10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return GJLocaleSymbols.forLocale(locale).getHalfdayMaxTextLength();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, String str, Locale locale) {
            return set(j10, GJLocaleSymbols.forLocale(locale).halfdayTextToValue(str));
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/BasicChronology$YearInfo.class */
    public static class YearInfo {
        public final long iFirstDayMillis;
        public final int iYear;

        public YearInfo(int i10, long j10) {
            this.iYear = i10;
            this.iFirstDayMillis = j10;
        }
    }

    static {
        DurationField durationField = MillisDurationField.INSTANCE;
        cMillisField = durationField;
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.seconds(), 1000L);
        cSecondsField = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.minutes(), 60000L);
        cMinutesField = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.hours(), 3600000L);
        cHoursField = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.halfdays(), 43200000L);
        cHalfdaysField = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.days(), TimeChart.DAY);
        cDaysField = preciseDurationField5;
        cWeeksField = new PreciseDurationField(DurationFieldType.weeks(), 604800000L);
        cMillisOfSecondField = new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), durationField, preciseDurationField);
        cMillisOfDayField = new PreciseDateTimeField(DateTimeFieldType.millisOfDay(), durationField, preciseDurationField5);
        cSecondOfMinuteField = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), preciseDurationField, preciseDurationField2);
        cSecondOfDayField = new PreciseDateTimeField(DateTimeFieldType.secondOfDay(), preciseDurationField, preciseDurationField5);
        cMinuteOfHourField = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), preciseDurationField2, preciseDurationField3);
        cMinuteOfDayField = new PreciseDateTimeField(DateTimeFieldType.minuteOfDay(), preciseDurationField2, preciseDurationField5);
        PreciseDateTimeField preciseDateTimeField = new PreciseDateTimeField(DateTimeFieldType.hourOfDay(), preciseDurationField3, preciseDurationField5);
        cHourOfDayField = preciseDateTimeField;
        PreciseDateTimeField preciseDateTimeField2 = new PreciseDateTimeField(DateTimeFieldType.hourOfHalfday(), preciseDurationField3, preciseDurationField4);
        cHourOfHalfdayField = preciseDateTimeField2;
        cClockhourOfDayField = new ZeroIsMaxDateTimeField(preciseDateTimeField, DateTimeFieldType.clockhourOfDay());
        cClockhourOfHalfdayField = new ZeroIsMaxDateTimeField(preciseDateTimeField2, DateTimeFieldType.clockhourOfHalfday());
        cHalfdayOfDayField = new HalfdayField();
    }

    public BasicChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj);
        this.iYearInfoCache = new YearInfo[1024];
        if (i10 >= 1 && i10 <= 7) {
            this.iMinDaysInFirstWeek = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid min days in first week: " + i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r0.iYear != r7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.joda.time.chrono.BasicChronology.YearInfo getYearInfo(int r7) {
        /*
            r6 = this;
            r0 = r6
            org.joda.time.chrono.BasicChronology$YearInfo[] r0 = r0.iYearInfoCache
            r9 = r0
            r0 = r7
            r1 = 1023(0x3ff, float:1.434E-42)
            r0 = r0 & r1
            r8 = r0
            r0 = r9
            r1 = r8
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L21
            r0 = r10
            r9 = r0
            r0 = r10
            int r0 = r0.iYear
            r1 = r7
            if (r0 == r1) goto L36
        L21:
            org.joda.time.chrono.BasicChronology$YearInfo r0 = new org.joda.time.chrono.BasicChronology$YearInfo
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = r7
            long r3 = r3.calculateFirstDayOfYearMillis(r4)
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            org.joda.time.chrono.BasicChronology$YearInfo[] r0 = r0.iYearInfoCache
            r1 = r8
            r2 = r9
            r0[r1] = r2
        L36:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.chrono.BasicChronology.getYearInfo(int):org.joda.time.chrono.BasicChronology$YearInfo");
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        fields.millis = cMillisField;
        fields.seconds = cSecondsField;
        fields.minutes = cMinutesField;
        fields.hours = cHoursField;
        fields.halfdays = cHalfdaysField;
        fields.days = cDaysField;
        fields.weeks = cWeeksField;
        fields.millisOfSecond = cMillisOfSecondField;
        fields.millisOfDay = cMillisOfDayField;
        fields.secondOfMinute = cSecondOfMinuteField;
        fields.secondOfDay = cSecondOfDayField;
        fields.minuteOfHour = cMinuteOfHourField;
        fields.minuteOfDay = cMinuteOfDayField;
        fields.hourOfDay = cHourOfDayField;
        fields.hourOfHalfday = cHourOfHalfdayField;
        fields.clockhourOfDay = cClockhourOfDayField;
        fields.clockhourOfHalfday = cClockhourOfHalfdayField;
        fields.halfdayOfDay = cHalfdayOfDayField;
        BasicYearDateTimeField basicYearDateTimeField = new BasicYearDateTimeField(this);
        fields.year = basicYearDateTimeField;
        GJYearOfEraDateTimeField gJYearOfEraDateTimeField = new GJYearOfEraDateTimeField(basicYearDateTimeField, this);
        fields.yearOfEra = gJYearOfEraDateTimeField;
        DividedDateTimeField dividedDateTimeField = new DividedDateTimeField(new OffsetDateTimeField(gJYearOfEraDateTimeField, 99), DateTimeFieldType.centuryOfEra(), 100);
        fields.centuryOfEra = dividedDateTimeField;
        fields.centuries = dividedDateTimeField.getDurationField();
        fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
        fields.era = new GJEraDateTimeField(this);
        fields.dayOfWeek = new GJDayOfWeekDateTimeField(this, fields.days);
        fields.dayOfMonth = new BasicDayOfMonthDateTimeField(this, fields.days);
        fields.dayOfYear = new BasicDayOfYearDateTimeField(this, fields.days);
        fields.monthOfYear = new GJMonthOfYearDateTimeField(this);
        fields.weekyear = new BasicWeekyearDateTimeField(this);
        fields.weekOfWeekyear = new BasicWeekOfWeekyearDateTimeField(this, fields.weeks);
        fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
        fields.years = fields.year.getDurationField();
        fields.months = fields.monthOfYear.getDurationField();
        fields.weekyears = fields.weekyear.getDurationField();
    }

    public abstract long calculateFirstDayOfYearMillis(int i10);

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        if (getMinimumDaysInFirstWeek() != basicChronology.getMinimumDaysInFirstWeek() || !getZone().equals(basicChronology.getZone())) {
            z10 = false;
        }
        return z10;
    }

    public abstract long getApproxMillisAtEpochDividedByTwo();

    public abstract long getAverageMillisPerMonth();

    public abstract long getAverageMillisPerYear();

    public abstract long getAverageMillisPerYearDividedByTwo();

    public long getDateMidnightMillis(int i10, int i11, int i12) {
        FieldUtils.verifyValueBounds(DateTimeFieldType.year(), i10, getMinYear(), getMaxYear());
        FieldUtils.verifyValueBounds(DateTimeFieldType.monthOfYear(), i11, 1, getMaxMonth(i10));
        FieldUtils.verifyValueBounds(DateTimeFieldType.dayOfMonth(), i12, 1, getDaysInYearMonth(i10, i11));
        return getYearMonthDayMillis(i10, i11, i12);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfDay(), i13, 0, 86399999);
        return getDateMidnightMillis(i10, i11, i12) + i13;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        }
        FieldUtils.verifyValueBounds(DateTimeFieldType.hourOfDay(), i13, 0, 23);
        FieldUtils.verifyValueBounds(DateTimeFieldType.minuteOfHour(), i14, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.secondOfMinute(), i15, 0, 59);
        FieldUtils.verifyValueBounds(DateTimeFieldType.millisOfSecond(), i16, 0, AndroidUsingExec.PRIORITY);
        return getDateMidnightMillis(i10, i11, i12) + (i13 * DateTimeConstants.MILLIS_PER_HOUR) + (i14 * DateTimeConstants.MILLIS_PER_MINUTE) + (i15 * 1000) + i16;
    }

    public int getDayOfMonth(long j10) {
        int year = getYear(j10);
        return getDayOfMonth(j10, year, getMonthOfYear(j10, year));
    }

    public int getDayOfMonth(long j10, int i10) {
        return getDayOfMonth(j10, i10, getMonthOfYear(j10, i10));
    }

    public int getDayOfMonth(long j10, int i10, int i11) {
        return ((int) ((j10 - (getYearMillis(i10) + getTotalMillisByYearMonth(i10, i11))) / TimeChart.DAY)) + 1;
    }

    public int getDayOfWeek(long j10) {
        long j11;
        if (j10 >= 0) {
            j11 = j10 / TimeChart.DAY;
        } else {
            long j12 = (j10 - 86399999) / TimeChart.DAY;
            j11 = j12;
            if (j12 < -3) {
                return ((int) ((j12 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j11 + 3) % 7)) + 1;
    }

    public int getDayOfYear(long j10) {
        return getDayOfYear(j10, getYear(j10));
    }

    public int getDayOfYear(long j10, int i10) {
        return ((int) ((j10 - getYearMillis(i10)) / TimeChart.DAY)) + 1;
    }

    public int getDaysInMonthMax() {
        return 31;
    }

    public abstract int getDaysInMonthMax(int i10);

    public int getDaysInMonthMax(long j10) {
        int year = getYear(j10);
        return getDaysInYearMonth(year, getMonthOfYear(j10, year));
    }

    public int getDaysInMonthMaxForSet(long j10, int i10) {
        return getDaysInMonthMax(j10);
    }

    public int getDaysInYear(int i10) {
        return isLeapYear(i10) ? 366 : 365;
    }

    public int getDaysInYearMax() {
        return 366;
    }

    public abstract int getDaysInYearMonth(int i10, int i11);

    public long getFirstWeekOfYearMillis(int i10) {
        long yearMillis = getYearMillis(i10);
        return getDayOfWeek(yearMillis) > 8 - this.iMinDaysInFirstWeek ? yearMillis + ((8 - r0) * TimeChart.DAY) : yearMillis - ((r0 - 1) * TimeChart.DAY);
    }

    public int getMaxMonth() {
        return 12;
    }

    public int getMaxMonth(int i10) {
        return getMaxMonth();
    }

    public abstract int getMaxYear();

    public int getMillisOfDay(long j10) {
        return j10 >= 0 ? (int) (j10 % TimeChart.DAY) : ((int) ((j10 + 1) % TimeChart.DAY)) + 86399999;
    }

    public abstract int getMinYear();

    public int getMinimumDaysInFirstWeek() {
        return this.iMinDaysInFirstWeek;
    }

    public int getMonthOfYear(long j10) {
        return getMonthOfYear(j10, getYear(j10));
    }

    public abstract int getMonthOfYear(long j10, int i10);

    public abstract long getTotalMillisByYearMonth(int i10, int i11);

    public int getWeekOfWeekyear(long j10) {
        return getWeekOfWeekyear(j10, getYear(j10));
    }

    public int getWeekOfWeekyear(long j10, int i10) {
        long firstWeekOfYearMillis = getFirstWeekOfYearMillis(i10);
        if (j10 < firstWeekOfYearMillis) {
            return getWeeksInYear(i10 - 1);
        }
        if (j10 >= getFirstWeekOfYearMillis(i10 + 1)) {
            return 1;
        }
        return ((int) ((j10 - firstWeekOfYearMillis) / 604800000)) + 1;
    }

    public int getWeeksInYear(int i10) {
        return (int) ((getFirstWeekOfYearMillis(i10 + 1) - getFirstWeekOfYearMillis(i10)) / 604800000);
    }

    public int getWeekyear(long j10) {
        long j11;
        int year = getYear(j10);
        int weekOfWeekyear = getWeekOfWeekyear(j10, year);
        if (weekOfWeekyear == 1) {
            j11 = j10 + 604800000;
        } else {
            if (weekOfWeekyear <= 51) {
                return year;
            }
            j11 = j10 - 1209600000;
        }
        return getYear(j11);
    }

    public int getYear(long j10) {
        int i10;
        long averageMillisPerYearDividedByTwo = getAverageMillisPerYearDividedByTwo();
        long approxMillisAtEpochDividedByTwo = (j10 >> 1) + getApproxMillisAtEpochDividedByTwo();
        long j11 = approxMillisAtEpochDividedByTwo;
        if (approxMillisAtEpochDividedByTwo < 0) {
            j11 = (approxMillisAtEpochDividedByTwo - averageMillisPerYearDividedByTwo) + 1;
        }
        int i11 = (int) (j11 / averageMillisPerYearDividedByTwo);
        long yearMillis = getYearMillis(i11);
        long j12 = j10 - yearMillis;
        if (j12 < 0) {
            i10 = i11 - 1;
        } else {
            long j13 = 31536000000L;
            i10 = i11;
            if (j12 >= 31536000000L) {
                if (isLeapYear(i11)) {
                    j13 = 31622400000L;
                }
                i10 = i11;
                if (yearMillis + j13 <= j10) {
                    i10 = i11 + 1;
                }
            }
        }
        return i10;
    }

    public abstract long getYearDifference(long j10, long j11);

    public long getYearMillis(int i10) {
        return getYearInfo(i10).iFirstDayMillis;
    }

    public long getYearMonthDayMillis(int i10, int i11, int i12) {
        return getYearMillis(i10) + getTotalMillisByYearMonth(i10, i11) + ((i12 - 1) * TimeChart.DAY);
    }

    public long getYearMonthMillis(int i10, int i11) {
        return getYearMillis(i10) + getTotalMillisByYearMonth(i10, i11);
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public int hashCode() {
        return (getClass().getName().hashCode() * 11) + getZone().hashCode() + getMinimumDaysInFirstWeek();
    }

    public boolean isLeapDay(long j10) {
        return false;
    }

    public abstract boolean isLeapYear(int i10);

    public abstract long setYear(long j10, int i10);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        String str = name;
        if (lastIndexOf >= 0) {
            str = name.substring(lastIndexOf + 1);
        }
        sb2.append(str);
        sb2.append('[');
        DateTimeZone zone = getZone();
        if (zone != null) {
            sb2.append(zone.getID());
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            sb2.append(",mdfw=");
            sb2.append(getMinimumDaysInFirstWeek());
        }
        sb2.append(']');
        return sb2.toString();
    }
}
