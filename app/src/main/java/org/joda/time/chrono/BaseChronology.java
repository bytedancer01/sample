package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/BaseChronology.class */
public abstract class BaseChronology extends Chronology implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // org.joda.time.Chronology
    public long add(long j10, long j11, int i10) {
        long j12 = j10;
        if (j11 != 0) {
            j12 = i10 == 0 ? j10 : FieldUtils.safeAdd(j10, FieldUtils.safeMultiply(j11, i10));
        }
        return j12;
    }

    @Override // org.joda.time.Chronology
    public long add(ReadablePeriod readablePeriod, long j10, int i10) {
        long j11 = j10;
        if (i10 != 0) {
            j11 = j10;
            if (readablePeriod != null) {
                int i11 = 0;
                int size = readablePeriod.size();
                while (true) {
                    j11 = j10;
                    if (i11 >= size) {
                        break;
                    }
                    long value = readablePeriod.getValue(i11);
                    long j12 = j10;
                    if (value != 0) {
                        j12 = readablePeriod.getFieldType(i11).getField(this).add(j10, value * i10);
                    }
                    i11++;
                    j10 = j12;
                }
            }
        }
        return j11;
    }

    @Override // org.joda.time.Chronology
    public DurationField centuries() {
        return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField centuryOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField clockhourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField clockhourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfMonth() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfWeek() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField dayOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }

    @Override // org.joda.time.Chronology
    public DurationField days() {
        return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField era() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }

    @Override // org.joda.time.Chronology
    public DurationField eras() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // org.joda.time.Chronology
    public int[] get(ReadablePartial readablePartial, long j10) {
        int size = readablePartial.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = readablePartial.getFieldType(i10).getField(this).get(j10);
        }
        return iArr;
    }

    @Override // org.joda.time.Chronology
    public int[] get(ReadablePeriod readablePeriod, long j10) {
        int size = readablePeriod.size();
        int[] iArr = new int[size];
        long j11 = 0;
        if (j10 != 0) {
            int i10 = 0;
            while (i10 < size) {
                DurationField field = readablePeriod.getFieldType(i10).getField(this);
                long j12 = j11;
                if (field.isPrecise()) {
                    int difference = field.getDifference(j10, j11);
                    j12 = field.add(j11, difference);
                    iArr[i10] = difference;
                }
                i10++;
                j11 = j12;
            }
        }
        return iArr;
    }

    @Override // org.joda.time.Chronology
    public int[] get(ReadablePeriod readablePeriod, long j10, long j11) {
        int size = readablePeriod.size();
        int[] iArr = new int[size];
        if (j10 != j11) {
            int i10 = 0;
            while (i10 < size) {
                DurationField field = readablePeriod.getFieldType(i10).getField(this);
                int difference = field.getDifference(j11, j10);
                long j12 = j10;
                if (difference != 0) {
                    j12 = field.add(j10, difference);
                }
                iArr[i10] = difference;
                i10++;
                j10 = j12;
            }
        }
        return iArr;
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) {
        return millisOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0L, i10), i11), i12), i13);
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0L, i10), i11), i12), i13), i14), i15), i16);
    }

    @Override // org.joda.time.Chronology
    public long getDateTimeMillis(long j10, int i10, int i11, int i12, int i13) {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(j10, i10), i11), i12), i13);
    }

    @Override // org.joda.time.Chronology
    public abstract DateTimeZone getZone();

    @Override // org.joda.time.Chronology
    public DateTimeField halfdayOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }

    @Override // org.joda.time.Chronology
    public DurationField halfdays() {
        return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField hourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField hourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }

    @Override // org.joda.time.Chronology
    public DurationField hours() {
        return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }

    @Override // org.joda.time.Chronology
    public DurationField millis() {
        return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField millisOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField millisOfSecond() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField minuteOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField minuteOfHour() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }

    @Override // org.joda.time.Chronology
    public DurationField minutes() {
        return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField monthOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }

    @Override // org.joda.time.Chronology
    public DurationField months() {
        return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField secondOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField secondOfMinute() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }

    @Override // org.joda.time.Chronology
    public DurationField seconds() {
        return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }

    @Override // org.joda.time.Chronology
    public long set(ReadablePartial readablePartial, long j10) {
        int size = readablePartial.size();
        for (int i10 = 0; i10 < size; i10++) {
            j10 = readablePartial.getFieldType(i10).getField(this).set(j10, readablePartial.getValue(i10));
        }
        return j10;
    }

    @Override // org.joda.time.Chronology
    public abstract String toString();

    @Override // org.joda.time.Chronology
    public void validate(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = iArr[i11];
                    DateTimeField field = readablePartial.getField(i11);
                    if (i12 < field.getMinimumValue(readablePartial, iArr)) {
                        throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i12), Integer.valueOf(field.getMinimumValue(readablePartial, iArr)), (Number) null);
                    }
                    if (i12 > field.getMaximumValue(readablePartial, iArr)) {
                        throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i12), (Number) null, Integer.valueOf(field.getMaximumValue(readablePartial, iArr)));
                    }
                }
                return;
            }
            int i13 = iArr[i10];
            DateTimeField field2 = readablePartial.getField(i10);
            if (i13 < field2.getMinimumValue()) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i13), Integer.valueOf(field2.getMinimumValue()), (Number) null);
            }
            if (i13 > field2.getMaximumValue()) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i13), (Number) null, Integer.valueOf(field2.getMaximumValue()));
            }
            i10++;
        }
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekOfWeekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }

    @Override // org.joda.time.Chronology
    public DurationField weeks() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField weekyearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }

    @Override // org.joda.time.Chronology
    public DurationField weekyears() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }

    @Override // org.joda.time.Chronology
    public abstract Chronology withUTC();

    @Override // org.joda.time.Chronology
    public abstract Chronology withZone(DateTimeZone dateTimeZone);

    @Override // org.joda.time.Chronology
    public DateTimeField year() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField yearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }

    @Override // org.joda.time.Chronology
    public DateTimeField yearOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }

    @Override // org.joda.time.Chronology
    public DurationField years() {
        return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }
}
