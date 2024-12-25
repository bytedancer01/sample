package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/ImpreciseDateTimeField.class */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 7190739608550251860L;
    private final DurationField iDurationField;
    public final long iUnitMillis;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/field/ImpreciseDateTimeField$LinkedDurationField.class */
    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;
        public final ImpreciseDateTimeField this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkedDurationField(ImpreciseDateTimeField impreciseDateTimeField, DurationFieldType durationFieldType) {
            super(durationFieldType);
            this.this$0 = impreciseDateTimeField;
        }

        @Override // org.joda.time.DurationField
        public long add(long j10, int i10) {
            return this.this$0.add(j10, i10);
        }

        @Override // org.joda.time.DurationField
        public long add(long j10, long j11) {
            return this.this$0.add(j10, j11);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j10, long j11) {
            return this.this$0.getDifference(j10, j11);
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j10, long j11) {
            return this.this$0.getDifferenceAsLong(j10, j11);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i10, long j10) {
            return this.this$0.add(j10, i10) - j10;
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j10, long j11) {
            return this.this$0.add(j11, j10) - j11;
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return this.this$0.iUnitMillis;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j10, long j11) {
            return this.this$0.getDifference(j10 + j11, j11);
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j10, long j11) {
            return this.this$0.getDifferenceAsLong(j10 + j11, j11);
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            return false;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j10) {
        super(dateTimeFieldType);
        this.iUnitMillis = j10;
        this.iDurationField = new LinkedDurationField(this, dateTimeFieldType.getDurationType());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j10, int i10);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j10, long j11);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract int get(long j10);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j10, long j11) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j10, j11));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        long j12;
        long j13;
        if (j10 < j11) {
            return -getDifferenceAsLong(j11, j10);
        }
        long j14 = (j10 - j11) / this.iUnitMillis;
        if (add(j11, j14) < j10) {
            do {
                j13 = j14 + 1;
                j14 = j13;
            } while (add(j11, j13) <= j10);
            j12 = j13 - 1;
        } else {
            j12 = j14;
            if (add(j11, j14) > j10) {
                do {
                    j12 = j14 - 1;
                    j14 = j12;
                } while (add(j11, j12) > j10);
            }
        }
        return j12;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    public final long getDurationUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long roundFloor(long j10);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long set(long j10, int i10);
}
