package org.joda.time;

/* loaded from: combined.jar:classes3.jar:org/joda/time/ReadWritableInterval.class */
public interface ReadWritableInterval extends ReadableInterval {
    void setChronology(Chronology chronology);

    void setDurationAfterStart(ReadableDuration readableDuration);

    void setDurationBeforeEnd(ReadableDuration readableDuration);

    void setEnd(ReadableInstant readableInstant);

    void setEndMillis(long j10);

    void setInterval(long j10, long j11);

    void setInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2);

    void setInterval(ReadableInterval readableInterval);

    void setPeriodAfterStart(ReadablePeriod readablePeriod);

    void setPeriodBeforeEnd(ReadablePeriod readablePeriod);

    void setStart(ReadableInstant readableInstant);

    void setStartMillis(long j10);
}
