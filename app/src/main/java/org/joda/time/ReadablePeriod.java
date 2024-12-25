package org.joda.time;

/* loaded from: combined.jar:classes3.jar:org/joda/time/ReadablePeriod.class */
public interface ReadablePeriod {
    boolean equals(Object obj);

    int get(DurationFieldType durationFieldType);

    DurationFieldType getFieldType(int i10);

    PeriodType getPeriodType();

    int getValue(int i10);

    int hashCode();

    boolean isSupported(DurationFieldType durationFieldType);

    int size();

    MutablePeriod toMutablePeriod();

    Period toPeriod();

    String toString();
}
