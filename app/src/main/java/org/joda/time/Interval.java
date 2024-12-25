package org.joda.time;

import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/Interval.class */
public final class Interval extends BaseInterval {
    private static final long serialVersionUID = 4922451897541386752L;

    public Interval(long j10, long j11) {
        super(j10, j11, null);
    }

    public Interval(long j10, long j11, Chronology chronology) {
        super(j10, j11, chronology);
    }

    public Interval(long j10, long j11, DateTimeZone dateTimeZone) {
        super(j10, j11, ISOChronology.getInstance(dateTimeZone));
    }

    public Interval(Object obj) {
        super(obj, (Chronology) null);
    }

    public Interval(Object obj, Chronology chronology) {
        super(obj, chronology);
    }

    public Interval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant);
    }

    public Interval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration);
    }

    public Interval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public Interval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        super(readableInstant, readablePeriod);
    }

    public Interval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        super(readablePeriod, readableInstant);
    }

    public static Interval parse(String str) {
        return new Interval(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (getEndMillis() == r6.getStartMillis()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean abuts(org.joda.time.ReadableInterval r6) {
        /*
            r5 = this;
            r0 = 0
            r8 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L25
            long r0 = org.joda.time.DateTimeUtils.currentTimeMillis()
            r9 = r0
            r0 = r5
            long r0 = r0.getStartMillis()
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L21
            r0 = r5
            long r0 = r0.getEndMillis()
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L23
        L21:
            r0 = 1
            r7 = r0
        L23:
            r0 = r7
            return r0
        L25:
            r0 = r6
            long r0 = r0.getEndMillis()
            r1 = r5
            long r1 = r1.getStartMillis()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L43
            r0 = r8
            r7 = r0
            r0 = r5
            long r0 = r0.getEndMillis()
            r1 = r6
            long r1 = r1.getStartMillis()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L45
        L43:
            r0 = 1
            r7 = r0
        L45:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.Interval.abuts(org.joda.time.ReadableInterval):boolean");
    }

    public Interval gap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        long startMillis = readableInterval2.getStartMillis();
        long endMillis = readableInterval2.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        if (startMillis2 > endMillis) {
            return new Interval(endMillis, startMillis2, getChronology());
        }
        if (startMillis > endMillis2) {
            return new Interval(endMillis2, startMillis, getChronology());
        }
        return null;
    }

    public Interval overlap(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = DateTimeUtils.getReadableInterval(readableInterval);
        if (overlaps(readableInterval2)) {
            return new Interval(Math.max(getStartMillis(), readableInterval2.getStartMillis()), Math.min(getEndMillis(), readableInterval2.getEndMillis()), getChronology());
        }
        return null;
    }

    @Override // org.joda.time.base.AbstractInterval, org.joda.time.ReadableInterval
    public Interval toInterval() {
        return this;
    }

    public Interval withChronology(Chronology chronology) {
        return getChronology() == chronology ? this : new Interval(getStartMillis(), getEndMillis(), chronology);
    }

    public Interval withDurationAfterStart(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(startMillis, durationMillis, 1), chronology);
    }

    public Interval withDurationBeforeEnd(ReadableDuration readableDuration) {
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        if (durationMillis == toDurationMillis()) {
            return this;
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(endMillis, durationMillis, -1), endMillis, chronology);
    }

    public Interval withEnd(ReadableInstant readableInstant) {
        return withEndMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public Interval withEndMillis(long j10) {
        return j10 == getEndMillis() ? this : new Interval(getStartMillis(), j10, getChronology());
    }

    public Interval withPeriodAfterStart(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationAfterStart(null);
        }
        Chronology chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(readablePeriod, startMillis, 1), chronology);
    }

    public Interval withPeriodBeforeEnd(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            return withDurationBeforeEnd(null);
        }
        Chronology chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(readablePeriod, endMillis, -1), endMillis, chronology);
    }

    public Interval withStart(ReadableInstant readableInstant) {
        return withStartMillis(DateTimeUtils.getInstantMillis(readableInstant));
    }

    public Interval withStartMillis(long j10) {
        return j10 == getStartMillis() ? this : new Interval(j10, getEndMillis(), getChronology());
    }
}
