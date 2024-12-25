package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.achartengine.chart.TimeChart;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/CopticChronology.class */
public final class CopticChronology extends BasicFixedMonthChronology {

    /* renamed from: AM */
    public static final int f36184AM = 1;
    private static final int MAX_YEAR = 292272708;
    private static final int MIN_YEAR = -292269337;
    private static final long serialVersionUID = -5972804258688333942L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AM");
    private static final ConcurrentHashMap<DateTimeZone, CopticChronology[]> cCache = new ConcurrentHashMap<>();
    private static final CopticChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    public CopticChronology(Chronology chronology, Object obj, int i10) {
        super(chronology, obj, i10);
    }

    public static CopticChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static CopticChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, 4);
    }

    /* JADX WARN: Finally extract failed */
    public static CopticChronology getInstance(DateTimeZone dateTimeZone, int i10) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, CopticChronology[]> concurrentHashMap = cCache;
        CopticChronology[] copticChronologyArr = concurrentHashMap.get(dateTimeZone2);
        CopticChronology[] copticChronologyArr2 = copticChronologyArr;
        if (copticChronologyArr == null) {
            copticChronologyArr2 = new CopticChronology[7];
            CopticChronology[] putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, copticChronologyArr2);
            if (putIfAbsent != null) {
                copticChronologyArr2 = putIfAbsent;
            }
        }
        int i11 = i10 - 1;
        CopticChronology copticChronology = copticChronologyArr2[i11];
        CopticChronology copticChronology2 = copticChronology;
        if (copticChronology == null) {
            synchronized (copticChronologyArr2) {
                CopticChronology copticChronology3 = copticChronologyArr2[i11];
                copticChronology2 = copticChronology3;
                if (copticChronology3 == null) {
                    try {
                        DateTimeZone dateTimeZone3 = DateTimeZone.UTC;
                        if (dateTimeZone2 == dateTimeZone3) {
                            CopticChronology copticChronology4 = new CopticChronology(null, null, i10);
                            copticChronology2 = new CopticChronology(LimitChronology.getInstance(copticChronology4, new DateTime(1, 1, 1, 0, 0, 0, 0, copticChronology4), null), null, i10);
                        } else {
                            copticChronology2 = new CopticChronology(ZonedChronology.getInstance(getInstance(dateTimeZone3, i10), dateTimeZone2), null, i10);
                        }
                        copticChronologyArr2[i11] = copticChronology2;
                    } catch (Throwable th2) {
                        CopticChronology[] copticChronologyArr3 = copticChronologyArr2;
                        throw th2;
                    }
                }
            }
        }
        return copticChronology2;
    }

    public static CopticChronology getInstanceUTC() {
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
            fields.era = ERA_FIELD;
            BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(this, 13);
            fields.monthOfYear = basicMonthOfYearDateTimeField;
            fields.months = basicMonthOfYearDateTimeField.getDurationField();
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long calculateFirstDayOfYearMillis(int i10) {
        int i11;
        int i12 = i10 - 1687;
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
        return 26607895200000L;
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
