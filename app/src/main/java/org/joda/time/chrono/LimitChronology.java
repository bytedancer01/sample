package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/LimitChronology.class */
public final class LimitChronology extends AssembledChronology {
    private static final long serialVersionUID = 7670866536893052522L;
    public final DateTime iLowerLimit;
    public final DateTime iUpperLimit;
    private transient LimitChronology iWithUTC;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/LimitChronology$LimitDateTimeField.class */
    public class LimitDateTimeField extends DecoratedDateTimeField {
        private static final long serialVersionUID = -2435306746995699312L;
        private final DurationField iDurationField;
        private final DurationField iLeapDurationField;
        private final DurationField iRangeDurationField;
        public final LimitChronology this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitDateTimeField(LimitChronology limitChronology, DateTimeField dateTimeField, DurationField durationField, DurationField durationField2, DurationField durationField3) {
            super(dateTimeField, dateTimeField.getType());
            this.this$0 = limitChronology;
            this.iDurationField = durationField;
            this.iRangeDurationField = durationField2;
            this.iLeapDurationField = durationField3;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, int i10) {
            this.this$0.checkLimits(j10, null);
            long add = getWrappedField().add(j10, i10);
            this.this$0.checkLimits(add, "resulting");
            return add;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, long j11) {
            this.this$0.checkLimits(j10, null);
            long add = getWrappedField().add(j10, j11);
            this.this$0.checkLimits(add, "resulting");
            return add;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long addWrapField(long j10, int i10) {
            this.this$0.checkLimits(j10, null);
            long addWrapField = getWrappedField().addWrapField(j10, i10);
            this.this$0.checkLimits(addWrapField, "resulting");
            return addWrapField;
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j10) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().get(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j10, Locale locale) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().getAsShortText(j10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j10, Locale locale) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().getAsText(j10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j10, long j11) {
            this.this$0.checkLimits(j10, "minuend");
            this.this$0.checkLimits(j11, "subtrahend");
            return getWrappedField().getDifference(j10, j11);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j10, long j11) {
            this.this$0.checkLimits(j10, "minuend");
            this.this$0.checkLimits(j11, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j10, j11);
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j10) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().getLeapAmount(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getLeapDurationField() {
            return this.iLeapDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return getWrappedField().getMaximumShortTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return getWrappedField().getMaximumTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j10) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().getMaximumValue(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j10) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().getMinimumValue(j10);
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j10) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().isLeap(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long remainder(long j10) {
            this.this$0.checkLimits(j10, null);
            long remainder = getWrappedField().remainder(j10);
            this.this$0.checkLimits(remainder, "resulting");
            return remainder;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j10) {
            this.this$0.checkLimits(j10, null);
            long roundCeiling = getWrappedField().roundCeiling(j10);
            this.this$0.checkLimits(roundCeiling, "resulting");
            return roundCeiling;
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j10) {
            this.this$0.checkLimits(j10, null);
            long roundFloor = getWrappedField().roundFloor(j10);
            this.this$0.checkLimits(roundFloor, "resulting");
            return roundFloor;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundHalfCeiling(long j10) {
            this.this$0.checkLimits(j10, null);
            long roundHalfCeiling = getWrappedField().roundHalfCeiling(j10);
            this.this$0.checkLimits(roundHalfCeiling, "resulting");
            return roundHalfCeiling;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundHalfEven(long j10) {
            this.this$0.checkLimits(j10, null);
            long roundHalfEven = getWrappedField().roundHalfEven(j10);
            this.this$0.checkLimits(roundHalfEven, "resulting");
            return roundHalfEven;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundHalfFloor(long j10) {
            this.this$0.checkLimits(j10, null);
            long roundHalfFloor = getWrappedField().roundHalfFloor(j10);
            this.this$0.checkLimits(roundHalfFloor, "resulting");
            return roundHalfFloor;
        }

        @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, int i10) {
            this.this$0.checkLimits(j10, null);
            long j11 = getWrappedField().set(j10, i10);
            this.this$0.checkLimits(j11, "resulting");
            return j11;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, String str, Locale locale) {
            this.this$0.checkLimits(j10, null);
            long j11 = getWrappedField().set(j10, str, locale);
            this.this$0.checkLimits(j11, "resulting");
            return j11;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/LimitChronology$LimitDurationField.class */
    public class LimitDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 8049297699408782284L;
        public final LimitChronology this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitDurationField(LimitChronology limitChronology, DurationField durationField) {
            super(durationField, durationField.getType());
            this.this$0 = limitChronology;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j10, int i10) {
            this.this$0.checkLimits(j10, null);
            long add = getWrappedField().add(j10, i10);
            this.this$0.checkLimits(add, "resulting");
            return add;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j10, long j11) {
            this.this$0.checkLimits(j10, null);
            long add = getWrappedField().add(j10, j11);
            this.this$0.checkLimits(add, "resulting");
            return add;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j10, long j11) {
            this.this$0.checkLimits(j10, "minuend");
            this.this$0.checkLimits(j11, "subtrahend");
            return getWrappedField().getDifference(j10, j11);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j10, long j11) {
            this.this$0.checkLimits(j10, "minuend");
            this.this$0.checkLimits(j11, "subtrahend");
            return getWrappedField().getDifferenceAsLong(j10, j11);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getMillis(int i10, long j10) {
            this.this$0.checkLimits(j10, null);
            return getWrappedField().getMillis(i10, j10);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getMillis(long j10, long j11) {
            this.this$0.checkLimits(j11, null);
            return getWrappedField().getMillis(j10, j11);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j10, long j11) {
            this.this$0.checkLimits(j11, null);
            return getWrappedField().getValue(j10, j11);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getValueAsLong(long j10, long j11) {
            this.this$0.checkLimits(j11, null);
            return getWrappedField().getValueAsLong(j10, j11);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/LimitChronology$LimitException.class */
    public class LimitException extends IllegalArgumentException {
        private static final long serialVersionUID = -5924689995607498581L;
        private final boolean iIsLow;
        public final LimitChronology this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitException(LimitChronology limitChronology, String str, boolean z10) {
            super(str);
            this.this$0 = limitChronology;
            this.iIsLow = z10;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            DateTime upperLimit;
            StringBuffer stringBuffer = new StringBuffer(85);
            stringBuffer.append("The");
            String message = super.getMessage();
            if (message != null) {
                stringBuffer.append(' ');
                stringBuffer.append(message);
            }
            stringBuffer.append(" instant is ");
            DateTimeFormatter withChronology = ISODateTimeFormat.dateTime().withChronology(this.this$0.getBase());
            if (this.iIsLow) {
                stringBuffer.append("below the supported minimum of ");
                upperLimit = this.this$0.getLowerLimit();
            } else {
                stringBuffer.append("above the supported maximum of ");
                upperLimit = this.this$0.getUpperLimit();
            }
            withChronology.printTo(stringBuffer, upperLimit.getMillis());
            stringBuffer.append(" (");
            stringBuffer.append(this.this$0.getBase());
            stringBuffer.append(')');
            return stringBuffer.toString();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IllegalArgumentException: " + getMessage();
        }
    }

    private LimitChronology(Chronology chronology, DateTime dateTime, DateTime dateTime2) {
        super(chronology, null);
        this.iLowerLimit = dateTime;
        this.iUpperLimit = dateTime2;
    }

    private DateTimeField convertField(DateTimeField dateTimeField, HashMap<Object, Object> hashMap) {
        if (dateTimeField == null || !dateTimeField.isSupported()) {
            return dateTimeField;
        }
        if (hashMap.containsKey(dateTimeField)) {
            return (DateTimeField) hashMap.get(dateTimeField);
        }
        LimitDateTimeField limitDateTimeField = new LimitDateTimeField(this, dateTimeField, convertField(dateTimeField.getDurationField(), hashMap), convertField(dateTimeField.getRangeDurationField(), hashMap), convertField(dateTimeField.getLeapDurationField(), hashMap));
        hashMap.put(dateTimeField, limitDateTimeField);
        return limitDateTimeField;
    }

    private DurationField convertField(DurationField durationField, HashMap<Object, Object> hashMap) {
        if (durationField == null || !durationField.isSupported()) {
            return durationField;
        }
        if (hashMap.containsKey(durationField)) {
            return (DurationField) hashMap.get(durationField);
        }
        LimitDurationField limitDurationField = new LimitDurationField(this, durationField);
        hashMap.put(durationField, limitDurationField);
        return limitDurationField;
    }

    public static LimitChronology getInstance(Chronology chronology, ReadableDateTime readableDateTime, ReadableDateTime readableDateTime2) {
        if (chronology == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        DateTime dateTime = readableDateTime == null ? null : readableDateTime.toDateTime();
        DateTime dateTime2 = readableDateTime2 == null ? null : readableDateTime2.toDateTime();
        if (dateTime == null || dateTime2 == null || dateTime.isBefore(dateTime2)) {
            return new LimitChronology(chronology, dateTime, dateTime2);
        }
        throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
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

    public void checkLimits(long j10, String str) {
        DateTime dateTime = this.iLowerLimit;
        if (dateTime != null && j10 < dateTime.getMillis()) {
            throw new LimitException(this, str, true);
        }
        DateTime dateTime2 = this.iUpperLimit;
        if (dateTime2 != null && j10 >= dateTime2.getMillis()) {
            throw new LimitException(this, str, false);
        }
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitChronology)) {
            return false;
        }
        LimitChronology limitChronology = (LimitChronology) obj;
        if (!getBase().equals(limitChronology.getBase()) || !FieldUtils.equals(getLowerLimit(), limitChronology.getLowerLimit()) || !FieldUtils.equals(getUpperLimit(), limitChronology.getUpperLimit())) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) {
        long dateTimeMillis = getBase().getDateTimeMillis(i10, i11, i12, i13);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long dateTimeMillis = getBase().getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j10, int i10, int i11, int i12, int i13) {
        checkLimits(j10, null);
        long dateTimeMillis = getBase().getDateTimeMillis(j10, i10, i11, i12, i13);
        checkLimits(dateTimeMillis, "resulting");
        return dateTimeMillis;
    }

    public DateTime getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTime getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        int i10 = 0;
        int hashCode = getLowerLimit() != null ? getLowerLimit().hashCode() : 0;
        if (getUpperLimit() != null) {
            i10 = getUpperLimit().hashCode();
        }
        return hashCode + 317351877 + i10 + (getBase().hashCode() * 7);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LimitChronology[");
        sb2.append(getBase().toString());
        sb2.append(", ");
        sb2.append(getLowerLimit() == null ? "NoLimit" : getLowerLimit().toString());
        sb2.append(", ");
        sb2.append(getUpperLimit() == null ? "NoLimit" : getUpperLimit().toString());
        sb2.append(']');
        return sb2.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        LimitChronology limitChronology;
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        if (dateTimeZone2 == getZone()) {
            return this;
        }
        DateTimeZone dateTimeZone3 = DateTimeZone.UTC;
        if (dateTimeZone2 == dateTimeZone3 && (limitChronology = this.iWithUTC) != null) {
            return limitChronology;
        }
        DateTime dateTime = this.iLowerLimit;
        DateTime dateTime2 = dateTime;
        if (dateTime != null) {
            MutableDateTime mutableDateTime = dateTime.toMutableDateTime();
            mutableDateTime.setZoneRetainFields(dateTimeZone2);
            dateTime2 = mutableDateTime.toDateTime();
        }
        DateTime dateTime3 = this.iUpperLimit;
        DateTime dateTime4 = dateTime3;
        if (dateTime3 != null) {
            MutableDateTime mutableDateTime2 = dateTime3.toMutableDateTime();
            mutableDateTime2.setZoneRetainFields(dateTimeZone2);
            dateTime4 = mutableDateTime2.toDateTime();
        }
        LimitChronology limitChronology2 = getInstance(getBase().withZone(dateTimeZone2), dateTime2, dateTime4);
        if (dateTimeZone2 == dateTimeZone3) {
            this.iWithUTC = limitChronology2;
        }
        return limitChronology2;
    }
}
