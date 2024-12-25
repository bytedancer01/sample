package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/BasicMonthOfYearDateTimeField.class */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i10) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i10;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        int i11;
        int i12;
        if (i10 == 0) {
            return j10;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j10);
        int year = this.iChronology.getYear(j10);
        int monthOfYear = this.iChronology.getMonthOfYear(j10, year);
        int i13 = (monthOfYear - 1) + i10;
        int i14 = this.iMax;
        if (i13 >= 0) {
            i12 = (i13 / i14) + year;
            i11 = (i13 % i14) + 1;
        } else {
            int i15 = ((i13 / i14) + year) - 1;
            int abs = Math.abs(i13);
            int i16 = this.iMax;
            int i17 = abs % i16;
            int i18 = i17;
            if (i17 == 0) {
                i18 = i16;
            }
            int i19 = (i16 - i18) + 1;
            i11 = i19;
            i12 = i15;
            if (i19 == 1) {
                i12 = i15 + 1;
                i11 = i19;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i12, i11);
        int i20 = dayOfMonth;
        if (dayOfMonth > daysInYearMonth) {
            i20 = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i12, i11, i20) + millisOfDay;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        long j12;
        long j13;
        int i10 = (int) j11;
        if (i10 == j11) {
            return add(j10, i10);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j10);
        int year = this.iChronology.getYear(j10);
        int monthOfYear = this.iChronology.getMonthOfYear(j10, year);
        long j14 = (monthOfYear - 1) + j11;
        if (j14 >= 0) {
            long j15 = year;
            int i11 = this.iMax;
            j13 = j15 + (j14 / i11);
            j12 = (j14 % i11) + 1;
        } else {
            long j16 = (year + (j14 / this.iMax)) - 1;
            long abs = Math.abs(j14);
            int i12 = this.iMax;
            int i13 = (int) (abs % i12);
            int i14 = i13;
            if (i13 == 0) {
                i14 = i12;
            }
            long j17 = (i12 - i14) + 1;
            j12 = j17;
            j13 = j16;
            if (j17 == 1) {
                j13 = j16 + 1;
                j12 = j17;
            }
        }
        if (j13 < this.iChronology.getMinYear() || j13 > this.iChronology.getMaxYear()) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: " + j11);
        }
        int i15 = (int) j13;
        int i16 = (int) j12;
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i15, i16);
        int i17 = dayOfMonth;
        if (dayOfMonth > daysInYearMonth) {
            i17 = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i15, i16, i17) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i10 == 0) {
            return set(readablePartial, 0, iArr, ((((readablePartial.getValue(0) - 1) + (i11 % 12)) + 12) % 12) + 1);
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            return super.add(readablePartial, i10, iArr, i11);
        }
        long j10 = 0;
        int size = readablePartial.size();
        for (int i12 = 0; i12 < size; i12++) {
            j10 = readablePartial.getFieldType(i12).getField(this.iChronology).set(j10, iArr[i12]);
        }
        return this.iChronology.get(readablePartial, add(j10, i11));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return set(j10, FieldUtils.getWrappedValue(get(j10), i10, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return this.iChronology.getMonthOfYear(j10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        if (j10 < j11) {
            return -getDifference(j11, j10);
        }
        int year = this.iChronology.getYear(j10);
        int monthOfYear = this.iChronology.getMonthOfYear(j10, year);
        int year2 = this.iChronology.getYear(j11);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j11, year2);
        long j12 = (((year - year2) * this.iMax) + monthOfYear) - monthOfYear2;
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year, monthOfYear);
        long j13 = j11;
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear)) {
            j13 = j11;
            if (this.iChronology.getDayOfMonth(j11, year2, monthOfYear2) > dayOfMonth) {
                j13 = this.iChronology.dayOfMonth().set(j11, dayOfMonth);
            }
        }
        long j14 = j12;
        if (j10 - this.iChronology.getYearMonthMillis(year, monthOfYear) < j13 - this.iChronology.getYearMonthMillis(year2, monthOfYear2)) {
            j14 = j12 - 1;
        }
        return j14;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j10) {
        return isLeap(j10) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        int year = this.iChronology.getYear(j10);
        boolean z10 = false;
        if (this.iChronology.isLeapYear(year)) {
            z10 = false;
            if (this.iChronology.getMonthOfYear(j10, year) == this.iLeapMonth) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j10) {
        return j10 - roundFloor(j10);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        int year = this.iChronology.getYear(j10);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j10, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, 1, this.iMax);
        int year = this.iChronology.getYear(j10);
        int dayOfMonth = this.iChronology.getDayOfMonth(j10, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i10);
        int i11 = dayOfMonth;
        if (dayOfMonth > daysInYearMonth) {
            i11 = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i10, i11) + this.iChronology.getMillisOfDay(j10);
    }
}
