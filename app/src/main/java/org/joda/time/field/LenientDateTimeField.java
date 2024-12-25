package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/LenientDateTimeField.class */
public class LenientDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 8714085824173290599L;
    private final Chronology iBase;

    public LenientDateTimeField(DateTimeField dateTimeField, Chronology chronology) {
        super(dateTimeField);
        this.iBase = chronology;
    }

    public static DateTimeField getInstance(DateTimeField dateTimeField, Chronology chronology) {
        if (dateTimeField == null) {
            return null;
        }
        DateTimeField dateTimeField2 = dateTimeField;
        if (dateTimeField instanceof StrictDateTimeField) {
            dateTimeField2 = ((StrictDateTimeField) dateTimeField).getWrappedField();
        }
        return dateTimeField2.isLenient() ? dateTimeField2 : new LenientDateTimeField(dateTimeField2, chronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public final boolean isLenient() {
        return true;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        return this.iBase.getZone().convertLocalToUTC(getType().getField(this.iBase.withUTC()).add(this.iBase.getZone().convertUTCToLocal(j10), FieldUtils.safeSubtract(i10, get(j10))), false, j10);
    }
}
