package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GregorianChronology.class */
public final class GregorianChronology extends BasicGJChronology {
    private static final int DAYS_0000_TO_1970 = 719527;
    private static final int MAX_YEAR = 292278993;
    private static final long MILLIS_PER_MONTH = 2629746000L;
    private static final long MILLIS_PER_YEAR = 31556952000L;
    private static final int MIN_YEAR = -292275054;
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> cCache = new ConcurrentHashMap<>();
    private static final GregorianChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    private GregorianChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj, i10);
    }

    public static GregorianChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static GregorianChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    /* JADX WARN: Finally extract failed */
    public static GregorianChronology getInstance(DateTimeZone dateTimeZone, int i10) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, GregorianChronology[]> concurrentHashMap = cCache;
        GregorianChronology[] gregorianChronologyArr = concurrentHashMap.get(dateTimeZone2);
        GregorianChronology[] gregorianChronologyArr2 = gregorianChronologyArr;
        if (gregorianChronologyArr == null) {
            gregorianChronologyArr2 = new GregorianChronology[7];
            GregorianChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, gregorianChronologyArr2);
            if (putIfAbsent != null) {
                gregorianChronologyArr2 = putIfAbsent;
            }
        }
        int i11 = i10 - 1;
        GregorianChronology gregorianChronology = gregorianChronologyArr2[i11];
        GregorianChronology gregorianChronology2 = gregorianChronology;
        if (gregorianChronology == null) {
            synchronized (gregorianChronologyArr2) {
                GregorianChronology gregorianChronology3 = gregorianChronologyArr2[i11];
                gregorianChronology2 = gregorianChronology3;
                if (gregorianChronology3 == null) {
                    try {
                        DateTimeZone dateTimeZone3 = DateTimeZone.UTC;
                        gregorianChronology2 = dateTimeZone2 == dateTimeZone3 ? new GregorianChronology(null, null, i10) : new GregorianChronology(ZonedChronology.getInstance(getInstance(dateTimeZone3, i10), dateTimeZone2), null, i10);
                        gregorianChronologyArr2[i11] = gregorianChronology2;
                    } catch (Throwable th2) {
                        GregorianChronology[] gregorianChronologyArr3 = gregorianChronologyArr2;
                        throw th2;
                    }
                }
            }
        }
        return gregorianChronology2;
    }

    public static GregorianChronology getInstanceUTC() {
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
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i10) {
        int i11;
        int i12 = i10 / 100;
        if (i10 < 0) {
            i11 = ((((i10 + 3) >> 2) - i12) + ((i12 + 3) >> 2)) - 1;
        } else {
            int i13 = ((i10 >> 2) - i12) + (i12 >> 2);
            i11 = i13;
            if (isLeapYear(i10)) {
                i11 = i13 - 1;
            }
        }
        return ((i10 * 365) + (i11 - DAYS_0000_TO_1970)) * TimeChart.DAY;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 31083597720000L;
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
        return 15778476000L;
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
        return (i10 & 3) == 0 && (i10 % 100 != 0 || i10 % 400 == 0);
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
