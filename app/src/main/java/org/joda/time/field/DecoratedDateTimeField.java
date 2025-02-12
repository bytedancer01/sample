package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/DecoratedDateTimeField.class */
public abstract class DecoratedDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 203115783733757597L;
    private final DateTimeField iField;

    public DecoratedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        super(dateTimeFieldType);
        if (dateTimeField == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!dateTimeField.isSupported()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.iField = dateTimeField;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return this.iField.get(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iField.getDurationField();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iField.getMaximumValue();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iField.getMinimumValue();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iField.getRangeDurationField();
    }

    public final DateTimeField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return this.iField.isLenient();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        return this.iField.roundFloor(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        return this.iField.set(j10, i10);
    }
}
