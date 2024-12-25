package org.joda.time;

/* loaded from: combined.jar:classes3.jar:org/joda/time/ReadablePartial.class */
public interface ReadablePartial extends Comparable<ReadablePartial> {
    boolean equals(Object obj);

    int get(DateTimeFieldType dateTimeFieldType);

    Chronology getChronology();

    DateTimeField getField(int i10);

    DateTimeFieldType getFieldType(int i10);

    int getValue(int i10);

    int hashCode();

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    int size();

    DateTime toDateTime(ReadableInstant readableInstant);

    String toString();
}
