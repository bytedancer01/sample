package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/EthiopicChronology.class */
public final class EthiopicChronology extends BasicFixedMonthChronology {

    /* renamed from: EE */
    public static final int f36185EE = 1;
    private static final int MAX_YEAR = 292272984;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("EE");
    private static final ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> cCache = new ConcurrentHashMap<>();
    private static final EthiopicChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public EthiopicChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj, i10);
    }

    public static EthiopicChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    /* JADX WARN: Finally extract failed */
    public static EthiopicChronology getInstance(DateTimeZone dateTimeZone, int i10) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, EthiopicChronology[]> concurrentHashMap = cCache;
        EthiopicChronology[] ethiopicChronologyArr = concurrentHashMap.get(dateTimeZone2);
        EthiopicChronology[] ethiopicChronologyArr2 = ethiopicChronologyArr;
        if (ethiopicChronologyArr == null) {
            ethiopicChronologyArr2 = new EthiopicChronology[7];
            EthiopicChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, ethiopicChronologyArr2);
            if (putIfAbsent != null) {
                ethiopicChronologyArr2 = putIfAbsent;
            }
        }
        int i11 = i10 - 1;
        EthiopicChronology ethiopicChronology = ethiopicChronologyArr2[i11];
        EthiopicChronology ethiopicChronology2 = ethiopicChronology;
        if (ethiopicChronology == null) {
            synchronized (ethiopicChronologyArr2) {
                EthiopicChronology ethiopicChronology3 = ethiopicChronologyArr2[i11];
                ethiopicChronology2 = ethiopicChronology3;
                if (ethiopicChronology3 == null) {
                    try {
                        DateTimeZone dateTimeZone3 = DateTimeZone.UTC;
                        if (dateTimeZone2 == dateTimeZone3) {
                            EthiopicChronology ethiopicChronology4 = new EthiopicChronology(null, null, i10);
                            ethiopicChronology2 = new EthiopicChronology(LimitChronology.getInstance(ethiopicChronology4, new DateTime(1, 1, 1, 0, 0, 0, 0, ethiopicChronology4), null), null, i10);
                        } else {
                            ethiopicChronology2 = new EthiopicChronology(ZonedChronology.getInstance(getInstance(dateTimeZone3, i10), dateTimeZone2), null, i10);
                        }
                        ethiopicChronologyArr2[i11] = ethiopicChronology2;
                    } catch (Throwable th2) {
                        EthiopicChronology[] ethiopicChronologyArr3 = ethiopicChronologyArr2;
                        throw th2;
                    }
                }
            }
        }
        return ethiopicChronology2;
    }

    public static EthiopicChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return getInstance(base == null ? DateTimeZone.UTC : base.getZone(), getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase() == null) {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 13);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i10) {
        int i11;
        int i12 = i10 - 1963;
        if (i12 <= 0) {
            i11 = (i12 + 3) >> 2;
        } else {
            int i13 = i12 >> 2;
            i11 = !isLeapYear(i10) ? i13 + 1 : i13;
        }
        return (((i12 * 365) + i11) * TimeChart.DAY) + 21859200000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getApproxMillisAtEpochDividedByTwo() {
        return 30962844000000L;
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
    public boolean isLeapDay(long j10) {
        return dayOfMonth().get(j10) == 6 && monthOfYear().isLeap(j10);
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
