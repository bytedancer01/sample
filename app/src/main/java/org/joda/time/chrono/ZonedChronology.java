package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/ZonedChronology.class */
public final class ZonedChronology extends AssembledChronology {
    private static final long serialVersionUID = -1079258847191166848L;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/ZonedChronology$ZonedDateTimeField.class */
    public static final class ZonedDateTimeField extends BaseDateTimeField {
        private static final long serialVersionUID = -3968986277775529794L;
        public final DurationField iDurationField;
        public final DateTimeField iField;
        public final DurationField iLeapDurationField;
        public final DurationField iRangeDurationField;
        public final boolean iTimeField;
        public final DateTimeZone iZone;

        public ZonedDateTimeField(DateTimeField dateTimeField, DateTimeZone dateTimeZone, DurationField durationField, DurationField durationField2, DurationField durationField3) {
            super(dateTimeField.getType());
            if (!dateTimeField.isSupported()) {
                throw new IllegalArgumentException();
            }
            this.iField = dateTimeField;
            this.iZone = dateTimeZone;
            this.iDurationField = durationField;
            this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
            this.iRangeDurationField = durationField2;
            this.iLeapDurationField = durationField3;
        }

        private int getOffsetToAdd(long j10) {
            int offset = this.iZone.getOffset(j10);
            long j11 = offset;
            if (((j10 + j11) ^ j10) >= 0 || (j10 ^ j11) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, int i10) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j10);
                return this.iField.add(j10 + offsetToAdd, i10) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j10), i10), false, j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, long j11) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j10);
                return this.iField.add(j10 + offsetToAdd, j11) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j10), j11), false, j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long addWrapField(long j10, int i10) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j10);
                return this.iField.addWrapField(j10 + offsetToAdd, i10) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.addWrapField(this.iZone.convertUTCToLocal(j10), i10), false, j10);
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDateTimeField)) {
                return false;
            }
            ZonedDateTimeField zonedDateTimeField = (ZonedDateTimeField) obj;
            if (!this.iField.equals(zonedDateTimeField.iField) || !this.iZone.equals(zonedDateTimeField.iZone) || !this.iDurationField.equals(zonedDateTimeField.iDurationField) || !this.iRangeDurationField.equals(zonedDateTimeField.iRangeDurationField)) {
                z10 = false;
            }
            return z10;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j10) {
            return this.iField.get(this.iZone.convertUTCToLocal(j10));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i10, Locale locale) {
            return this.iField.getAsShortText(i10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j10, Locale locale) {
            return this.iField.getAsShortText(this.iZone.convertUTCToLocal(j10), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i10, Locale locale) {
            return this.iField.getAsText(i10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j10, Locale locale) {
            return this.iField.getAsText(this.iZone.convertUTCToLocal(j10), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j10, long j11) {
            return this.iField.getDifference(j10 + (this.iTimeField ? r0 : getOffsetToAdd(j10)), j11 + getOffsetToAdd(j11));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j10, long j11) {
            return this.iField.getDifferenceAsLong(j10 + (this.iTimeField ? r0 : getOffsetToAdd(j10)), j11 + getOffsetToAdd(j11));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j10) {
            return this.iField.getLeapAmount(this.iZone.convertUTCToLocal(j10));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getLeapDurationField() {
            return this.iLeapDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return this.iField.getMaximumShortTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return this.iField.getMaximumTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j10) {
            return this.iField.getMaximumValue(this.iZone.convertUTCToLocal(j10));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return this.iField.getMaximumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMaximumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j10) {
            return this.iField.getMinimumValue(this.iZone.convertUTCToLocal(j10));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iField.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j10) {
            return this.iField.isLeap(this.iZone.convertUTCToLocal(j10));
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return this.iField.isLenient();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long remainder(long j10) {
            return this.iField.remainder(this.iZone.convertUTCToLocal(j10));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j10) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j10);
                return this.iField.roundCeiling(j10 + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundCeiling(this.iZone.convertUTCToLocal(j10)), false, j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j10) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j10);
                return this.iField.roundFloor(j10 + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundFloor(this.iZone.convertUTCToLocal(j10)), false, j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, int i10) {
            long j11 = this.iField.set(this.iZone.convertUTCToLocal(j10), i10);
            long convertLocalToUTC = this.iZone.convertLocalToUTC(j11, false, j10);
            if (get(convertLocalToUTC) == i10) {
                return convertLocalToUTC;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(j11, this.iZone.getID());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.iField.getType(), Integer.valueOf(i10), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, String str, Locale locale) {
            return this.iZone.convertLocalToUTC(this.iField.set(this.iZone.convertUTCToLocal(j10), str, locale), false, j10);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/ZonedChronology$ZonedDurationField.class */
    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        public final DurationField iField;
        public final boolean iTimeField;
        public final DateTimeZone iZone;

        public ZonedDurationField(DurationField durationField, DateTimeZone dateTimeZone) {
            super(durationField.getType());
            if (!durationField.isSupported()) {
                throw new IllegalArgumentException();
            }
            this.iField = durationField;
            this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
            this.iZone = dateTimeZone;
        }

        private long addOffset(long j10) {
            return this.iZone.convertUTCToLocal(j10);
        }

        private int getOffsetFromLocalToSubtract(long j10) {
            int offsetFromLocal = this.iZone.getOffsetFromLocal(j10);
            long j11 = offsetFromLocal;
            if (((j10 - j11) ^ j10) >= 0 || (j10 ^ j11) >= 0) {
                return offsetFromLocal;
            }
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }

        private int getOffsetToAdd(long j10) {
            int offset = this.iZone.getOffset(j10);
            long j11 = offset;
            if (((j10 + j11) ^ j10) >= 0 || (j10 ^ j11) < 0) {
                return offset;
            }
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }

        @Override // org.joda.time.DurationField
        public long add(long j10, int i10) {
            return this.iField.add(j10 + getOffsetToAdd(j10), i10) - (this.iTimeField ? r0 : getOffsetFromLocalToSubtract(r0));
        }

        @Override // org.joda.time.DurationField
        public long add(long j10, long j11) {
            int offsetToAdd = getOffsetToAdd(j10);
            long add = this.iField.add(j10 + offsetToAdd, j11);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(add);
            }
            return add - offsetToAdd;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZonedDurationField)) {
                return false;
            }
            ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
            if (!this.iField.equals(zonedDurationField.iField) || !this.iZone.equals(zonedDurationField.iZone)) {
                z10 = false;
            }
            return z10;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j10, long j11) {
            return this.iField.getDifference(j10 + (this.iTimeField ? r0 : getOffsetToAdd(j10)), j11 + getOffsetToAdd(j11));
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j10, long j11) {
            return this.iField.getDifferenceAsLong(j10 + (this.iTimeField ? r0 : getOffsetToAdd(j10)), j11 + getOffsetToAdd(j11));
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i10, long j10) {
            return this.iField.getMillis(i10, addOffset(j10));
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j10, long j11) {
            return this.iField.getMillis(j10, addOffset(j11));
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return this.iField.getUnitMillis();
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j10, long j11) {
            return this.iField.getValue(j10, addOffset(j11));
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j10, long j11) {
            return this.iField.getValueAsLong(j10, addOffset(j11));
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            return this.iTimeField ? this.iField.isPrecise() : this.iField.isPrecise() && this.iZone.isFixed();
        }
    }

    private ZonedChronology(Chronology chronology, DateTimeZone dateTimeZone) {
        super(chronology, dateTimeZone);
    }

    private DateTimeField convertField(DateTimeField dateTimeField, HashMap<Object, Object> hashMap) {
        if (dateTimeField == null || !dateTimeField.isSupported()) {
            return dateTimeField;
        }
        if (hashMap.containsKey(dateTimeField)) {
            return (DateTimeField) hashMap.get(dateTimeField);
        }
        ZonedDateTimeField zonedDateTimeField = new ZonedDateTimeField(dateTimeField, getZone(), convertField(dateTimeField.getDurationField(), hashMap), convertField(dateTimeField.getRangeDurationField(), hashMap), convertField(dateTimeField.getLeapDurationField(), hashMap));
        hashMap.put(dateTimeField, zonedDateTimeField);
        return zonedDateTimeField;
    }

    private DurationField convertField(DurationField durationField, HashMap<Object, Object> hashMap) {
        if (durationField == null || !durationField.isSupported()) {
            return durationField;
        }
        if (hashMap.containsKey(durationField)) {
            return (DurationField) hashMap.get(durationField);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(durationField, getZone());
        hashMap.put(durationField, zonedDurationField);
        return zonedDurationField;
    }

    public static ZonedChronology getInstance(Chronology chronology, DateTimeZone dateTimeZone) {
        if (chronology == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        Chronology withUTC = chronology.withUTC();
        if (withUTC == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(withUTC, dateTimeZone);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    private long localToUTC(long j10) {
        DateTimeZone zone = getZone();
        int offsetFromLocal = zone.getOffsetFromLocal(j10);
        long j11 = j10 - offsetFromLocal;
        if (offsetFromLocal == zone.getOffset(j11)) {
            return j11;
        }
        throw new IllegalInstantException(j10, zone.getID());
    }

    public static boolean useTimeArithmetic(DurationField durationField) {
        return durationField != null && durationField.getUnitMillis() < 43200000;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        fields.eras = convertField(fields.eras, hashMap);
        fields.centuries = convertField(fields.centuries, hashMap);
        fields.years = convertField(fields.years, hashMap);
        fields.months = convertField(fields.months, hashMap);
        fields.weekyears = convertField(fields.weekyears, hashMap);
        fields.weeks = convertField(fields.weeks, hashMap);
        fields.days = convertField(fields.days, hashMap);
        fields.halfdays = convertField(fields.halfdays, hashMap);
        fields.hours = convertField(fields.hours, hashMap);
        fields.minutes = convertField(fields.minutes, hashMap);
        fields.seconds = convertField(fields.seconds, hashMap);
        fields.millis = convertField(fields.millis, hashMap);
        fields.year = convertField(fields.year, hashMap);
        fields.yearOfEra = convertField(fields.yearOfEra, hashMap);
        fields.yearOfCentury = convertField(fields.yearOfCentury, hashMap);
        fields.centuryOfEra = convertField(fields.centuryOfEra, hashMap);
        fields.era = convertField(fields.era, hashMap);
        fields.dayOfWeek = convertField(fields.dayOfWeek, hashMap);
        fields.dayOfMonth = convertField(fields.dayOfMonth, hashMap);
        fields.dayOfYear = convertField(fields.dayOfYear, hashMap);
        fields.monthOfYear = convertField(fields.monthOfYear, hashMap);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, hashMap);
        fields.weekyear = convertField(fields.weekyear, hashMap);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, hashMap);
        fields.millisOfSecond = convertField(fields.millisOfSecond, hashMap);
        fields.millisOfDay = convertField(fields.millisOfDay, hashMap);
        fields.secondOfMinute = convertField(fields.secondOfMinute, hashMap);
        fields.secondOfDay = convertField(fields.secondOfDay, hashMap);
        fields.minuteOfHour = convertField(fields.minuteOfHour, hashMap);
        fields.minuteOfDay = convertField(fields.minuteOfDay, hashMap);
        fields.hourOfDay = convertField(fields.hourOfDay, hashMap);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday, hashMap);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay, hashMap);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, hashMap);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay, hashMap);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        if (!getBase().equals(zonedChronology.getBase()) || !getZone().equals(zonedChronology.getZone())) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) {
        return localToUTC(getBase().getDateTimeMillis(i10, i11, i12, i13));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return localToUTC(getBase().getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j10, int i10, int i11, int i12, int i13) {
        return localToUTC(getBase().getDateTimeMillis(getZone().getOffset(j10) + j10, i10, i11, i12, i13));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        return (DateTimeZone) getParam();
    }

    public int hashCode() {
        return (getZone().hashCode() * 11) + 326565 + (getBase().hashCode() * 7);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        return "ZonedChronology[" + getBase() + ", " + getZone().getID() + ']';
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return getBase();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getParam() ? this : dateTimeZone2 == DateTimeZone.UTC ? getBase() : new ZonedChronology(getBase(), dateTimeZone2);
    }
}
