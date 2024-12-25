package org.joda.time.field;

import org.joda.time.DateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/StrictDateTimeField.class */
public class StrictDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 3154803964207950910L;

    public StrictDateTimeField(DateTimeField dateTimeField) {
        super(dateTimeField);
    }

    public static DateTimeField getInstance(DateTimeField dateTimeField) {
        if (dateTimeField == null) {
            return null;
        }
        DateTimeField dateTimeField2 = dateTimeField;
        if (dateTimeField instanceof LenientDateTimeField) {
            dateTimeField2 = ((LenientDateTimeField) dateTimeField).getWrappedField();
        }
        return !dateTimeField2.isLenient() ? dateTimeField2 : new StrictDateTimeField(dateTimeField2);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public final boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, getMinimumValue(j10), getMaximumValue(j10));
        return super.set(j10, i10);
    }
}
