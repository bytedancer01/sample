package org.joda.time;

/* loaded from: combined.jar:classes3.jar:org/joda/time/ReadWritableInstant.class */
public interface ReadWritableInstant extends ReadableInstant {
    void add(long j10);

    void add(DurationFieldType durationFieldType, int i10);

    void add(ReadableDuration readableDuration);

    void add(ReadableDuration readableDuration, int i10);

    void add(ReadablePeriod readablePeriod);

    void add(ReadablePeriod readablePeriod, int i10);

    void set(DateTimeFieldType dateTimeFieldType, int i10);

    void setChronology(Chronology chronology);

    void setMillis(long j10);

    void setMillis(ReadableInstant readableInstant);

    void setZone(DateTimeZone dateTimeZone);

    void setZoneRetainFields(DateTimeZone dateTimeZone);
}
