package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/DelegatedDurationField.class */
public class DelegatedDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final DurationField iField;
    private final DurationFieldType iType;

    public DelegatedDurationField(DurationField durationField) {
        this(durationField, null);
    }

    public DelegatedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        if (durationField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.iField = durationField;
        this.iType = durationFieldType == null ? durationField.getType() : durationFieldType;
    }

    @Override // org.joda.time.DurationField
    public long add(long j10, int i10) {
        return this.iField.add(j10, i10);
    }

    @Override // org.joda.time.DurationField
    public long add(long j10, long j11) {
        return this.iField.add(j10, j11);
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        return this.iField.compareTo(durationField);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j10, long j11) {
        return this.iField.getDifference(j10, j11);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j10, long j11) {
        return this.iField.getDifferenceAsLong(j10, j11);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i10) {
        return this.iField.getMillis(i10);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i10, long j10) {
        return this.iField.getMillis(i10, j10);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j10) {
        return this.iField.getMillis(j10);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j10, long j11) {
        return this.iField.getMillis(j10, j11);
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j10) {
        return this.iField.getValue(j10);
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j10, long j11) {
        return this.iField.getValue(j10, j11);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j10) {
        return this.iField.getValueAsLong(j10);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j10, long j11) {
        return this.iField.getValueAsLong(j10, j11);
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        String str;
        if (this.iType == null) {
            str = this.iField.toString();
        } else {
            str = "DurationField[" + this.iType + ']';
        }
        return str;
    }
}
