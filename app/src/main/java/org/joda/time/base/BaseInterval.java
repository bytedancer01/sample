package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.MutableInterval;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;
import org.joda.time.field.FieldUtils;

/* loaded from: combined.jar:classes3.jar:org/joda/time/base/BaseInterval.class */
public abstract class BaseInterval extends AbstractInterval implements Serializable {
    private static final long serialVersionUID = 576586928732749278L;
    private volatile Chronology iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    public BaseInterval(long j10, long j11, Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology);
        checkInterval(j10, j11);
        this.iStartMillis = j10;
        this.iEndMillis = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseInterval(Object obj, Chronology chronology) {
        long endMillis;
        IntervalConverter intervalConverter = ConverterManager.getInstance().getIntervalConverter(obj);
        if (intervalConverter.isReadableInterval(obj, chronology)) {
            ReadableInterval readableInterval = (ReadableInterval) obj;
            this.iChronology = chronology == null ? readableInterval.getChronology() : chronology;
            this.iStartMillis = readableInterval.getStartMillis();
            endMillis = readableInterval.getEndMillis();
        } else if (this instanceof ReadWritableInterval) {
            intervalConverter.setInto((ReadWritableInterval) this, obj, chronology);
            checkInterval(this.iStartMillis, this.iEndMillis);
        } else {
            MutableInterval mutableInterval = new MutableInterval();
            intervalConverter.setInto(mutableInterval, obj, chronology);
            this.iChronology = mutableInterval.getChronology();
            this.iStartMillis = mutableInterval.getStartMillis();
            endMillis = mutableInterval.getEndMillis();
        }
        this.iEndMillis = endMillis;
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iStartMillis = FieldUtils.safeAdd(this.iEndMillis, -DateTimeUtils.getDurationMillis(readableDuration));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iEndMillis = FieldUtils.safeAdd(this.iStartMillis, DateTimeUtils.getDurationMillis(readableDuration));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == null && readableInstant2 == null) {
            long currentTimeMillis = DateTimeUtils.currentTimeMillis();
            this.iEndMillis = currentTimeMillis;
            this.iStartMillis = currentTimeMillis;
            this.iChronology = ISOChronology.getInstance();
            return;
        }
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant2);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iChronology = instantChronology;
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iEndMillis = readablePeriod == null ? this.iStartMillis : instantChronology.add(readablePeriod, this.iStartMillis, 1);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iChronology = instantChronology;
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iStartMillis = readablePeriod == null ? this.iEndMillis : instantChronology.add(readablePeriod, this.iEndMillis, -1);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    @Override // org.joda.time.ReadableInterval
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.ReadableInterval
    public long getEndMillis() {
        return this.iEndMillis;
    }

    @Override // org.joda.time.ReadableInterval
    public long getStartMillis() {
        return this.iStartMillis;
    }

    public void setInterval(long j10, long j11, Chronology chronology) {
        checkInterval(j10, j11);
        this.iStartMillis = j10;
        this.iEndMillis = j11;
        this.iChronology = DateTimeUtils.getChronology(chronology);
    }
}
