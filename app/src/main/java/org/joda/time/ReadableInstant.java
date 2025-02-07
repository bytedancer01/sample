package org.joda.time;

/* loaded from: combined.jar:classes3.jar:org/joda/time/ReadableInstant.class */
public interface ReadableInstant extends Comparable<ReadableInstant> {
    boolean equals(Object obj);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    long getMillis();

    DateTimeZone getZone();

    int hashCode();

    boolean isAfter(ReadableInstant readableInstant);

    boolean isBefore(ReadableInstant readableInstant);

    boolean isEqual(ReadableInstant readableInstant);

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    Instant toInstant();

    String toString();
}
