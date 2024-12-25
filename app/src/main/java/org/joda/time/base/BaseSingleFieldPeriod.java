package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

/* loaded from: combined.jar:classes3.jar:org/joda/time/base/BaseSingleFieldPeriod.class */
public abstract class BaseSingleFieldPeriod implements ReadablePeriod, Comparable<BaseSingleFieldPeriod>, Serializable {
    private static final long START_1972 = 63072000000L;
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    public BaseSingleFieldPeriod(int i10) {
        this.iPeriod = i10;
    }

    public static int between(ReadableInstant readableInstant, ReadableInstant readableInstant2, DurationFieldType durationFieldType) {
        if (readableInstant == null || readableInstant2 == null) {
            throw new IllegalArgumentException("ReadableInstant objects must not be null");
        }
        return durationFieldType.getField(DateTimeUtils.getInstantChronology(readableInstant)).getDifference(readableInstant2.getMillis(), readableInstant.getMillis());
    }

    public static int between(ReadablePartial readablePartial, ReadablePartial readablePartial2, ReadablePeriod readablePeriod) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (readablePartial.size() != readablePartial2.size()) {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        int size = readablePartial.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (readablePartial.getFieldType(i10) != readablePartial2.getFieldType(i10)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        }
        Chronology withUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
        return withUTC.get(readablePeriod, withUTC.set(readablePartial, START_1972), withUTC.set(readablePartial2, START_1972))[0];
    }

    public static int standardPeriodIn(ReadablePeriod readablePeriod, long j10) {
        int i10 = 0;
        if (readablePeriod == null) {
            return 0;
        }
        ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
        long j11 = 0;
        while (true) {
            long j12 = j11;
            if (i10 >= readablePeriod.size()) {
                return FieldUtils.safeToInt(j12 / j10);
            }
            int value = readablePeriod.getValue(i10);
            long j13 = j12;
            if (value != 0) {
                DurationField field = readablePeriod.getFieldType(i10).getField(instanceUTC);
                if (!field.isPrecise()) {
                    throw new IllegalArgumentException("Cannot convert period to duration as " + field.getName() + " is not precise in the period " + readablePeriod);
                }
                j13 = FieldUtils.safeAdd(j12, FieldUtils.safeMultiply(field.getUnitMillis(), value));
            }
            i10++;
            j11 = j13;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() == getClass()) {
            int value = baseSingleFieldPeriod.getValue();
            int value2 = getValue();
            if (value2 > value) {
                return 1;
            }
            return value2 < value ? -1 : 0;
        }
        throw new ClassCastException(getClass() + " cannot be compared to " + baseSingleFieldPeriod.getClass());
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        if (readablePeriod.getPeriodType() != getPeriodType() || readablePeriod.getValue(0) != getValue()) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.ReadablePeriod
    public int get(DurationFieldType durationFieldType) {
        if (durationFieldType == getFieldType()) {
            return getValue();
        }
        return 0;
    }

    public abstract DurationFieldType getFieldType();

    @Override // org.joda.time.ReadablePeriod
    public DurationFieldType getFieldType(int i10) {
        if (i10 == 0) {
            return getFieldType();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    @Override // org.joda.time.ReadablePeriod
    public abstract PeriodType getPeriodType();

    public int getValue() {
        return this.iPeriod;
    }

    @Override // org.joda.time.ReadablePeriod
    public int getValue(int i10) {
        if (i10 == 0) {
            return getValue();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    @Override // org.joda.time.ReadablePeriod
    public int hashCode() {
        return ((459 + getValue()) * 27) + getFieldType().hashCode();
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean isSupported(DurationFieldType durationFieldType) {
        return durationFieldType == getFieldType();
    }

    public void setValue(int i10) {
        this.iPeriod = i10;
    }

    @Override // org.joda.time.ReadablePeriod
    public int size() {
        return 1;
    }

    @Override // org.joda.time.ReadablePeriod
    public MutablePeriod toMutablePeriod() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.add(this);
        return mutablePeriod;
    }

    @Override // org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return Period.ZERO.withFields(this);
    }
}
