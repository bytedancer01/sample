package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/JulianChronology.class */
public final class JulianChronology extends BasicGJChronology {
    private static final int MAX_YEAR = 292272992;
    private static final long MILLIS_PER_MONTH = 2629800000L;
    private static final long MILLIS_PER_YEAR = 31557600000L;
    private static final int MIN_YEAR = -292269054;
    private static final long serialVersionUID = -8731039522547897247L;
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final JulianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public JulianChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj, i10);
    }

    public static int adjustYearForSet(int i10) {
        int i11 = i10;
        if (i10 <= 0) {
            if (i10 == 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i10), (Number) null, (Number) null);
            }
            i11 = i10 + 1;
        }
        return i11;
    }

    public static JulianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static JulianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    /* JADX WARN: Finally extract failed */
    public static JulianChronology getInstance(DateTimeZone dateTimeZone, int i10) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, JulianChronology[]> concurrentHashMap = cCache;
        JulianChronology[] julianChronologyArr = concurrentHashMap.get(dateTimeZone2);
        JulianChronology[] julianChronologyArr2 = julianChronologyArr;
        if (julianChronologyArr == null) {
            julianChronologyArr2 = new JulianChronology[7];
            JulianChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, julianChronologyArr2);
            if (putIfAbsent != null) {
                julianChronologyArr2 = putIfAbsent;
            }
        }
        int i11 = i10 - 1;
        JulianChronology julianChronology = julianChronologyArr2[i11];
        JulianChronology julianChronology2 = julianChronology;
        if (julianChronology == null) {
            synchronized (julianChronologyArr2) {
                JulianChronology julianChronology3 = julianChronologyArr2[i11];
                julianChronology2 = julianChronology3;
                if (julianChronology3 == null) {
                    try {
                        DateTimeZone dateTimeZone3 = DateTimeZone.UTC;
                        julianChronology2 = dateTimeZone2 == dateTimeZone3 ? new JulianChronology(null, null, i10) : new JulianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone3, i10), dateTimeZone2), null, i10);
                        julianChronologyArr2[i11] = julianChronology2;
                    } catch (Throwable th2) {
                        JulianChronology[] julianChronologyArr3 = julianChronologyArr2;
                        throw th2;
                    }
                }
            }
        }
        return julianChronology2;
    }

    public static JulianChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        int minimumDaysInFirstWeek = getMinimumDaysInFirstWeek();
        int i10 = minimumDaysInFirstWeek;
        if (minimumDaysInFirstWeek == 0) {
            i10 = 4;
        }
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), i10);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i10) {
        int i11;
        int i12 = i10 - 1968;
        if (i12 <= 0) {
            i11 = (i12 + 3) >> 2;
        } else {
            int i13 = i12 >> 2;
            i11 = !isLeapYear(i10) ? i13 + 1 : i13;
        }
        return (((i12 * 365) + i11) * TimeChart.DAY) - 62035200000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083663600000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return 31557600000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getDateMidnightMillis(int i10, int i11, int i12) {
        return super.getDateMidnightMillis(adjustYearForSet(i10), i11, i12);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxYear() {
        return MAX_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMinYear() {
        return MIN_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i10) {
        return (i10 & 3) == 0;
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
