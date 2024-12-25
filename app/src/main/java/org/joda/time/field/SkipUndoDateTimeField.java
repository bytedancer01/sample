package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/SkipUndoDateTimeField.class */
public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i10) {
        super(dateTimeField);
        int i11;
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i10) {
            i11 = minimumValue + 1;
        } else {
            i11 = minimumValue;
            if (minimumValue == i10 + 1) {
                this.iMinValue = i10;
                this.iSkip = i10;
            }
        }
        this.iMinValue = i11;
        this.iSkip = i10;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        int i10 = super.get(j10);
        int i11 = i10;
        if (i10 < this.iSkip) {
            i11 = i10 + 1;
        }
        return i11;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, this.iMinValue, getMaximumValue());
        int i11 = i10;
        if (i10 <= this.iSkip) {
            i11 = i10 - 1;
        }
        return super.set(j10, i11);
    }
}
