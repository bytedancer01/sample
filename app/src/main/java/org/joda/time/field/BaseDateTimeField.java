package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/BaseDateTimeField.class */
public abstract class BaseDateTimeField extends DateTimeField {
    private final DateTimeFieldType iType;

    public BaseDateTimeField(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = dateTimeFieldType;
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        return getDurationField().add(j10, i10);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        return getDurationField().add(j10, j11);
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        DateTimeField dateTimeField;
        int[] iArr2;
        int i12;
        if (i11 == 0) {
            return iArr;
        }
        DateTimeField dateTimeField2 = null;
        while (true) {
            DateTimeField dateTimeField3 = dateTimeField2;
            dateTimeField = dateTimeField3;
            iArr2 = iArr;
            i12 = i11;
            if (i11 <= 0) {
                break;
            }
            int maximumValue = getMaximumValue(readablePartial, iArr);
            long j10 = iArr[i10] + i11;
            if (j10 <= maximumValue) {
                iArr[i10] = (int) j10;
                dateTimeField = dateTimeField3;
                iArr2 = iArr;
                i12 = i11;
                break;
            }
            DateTimeField dateTimeField4 = dateTimeField3;
            if (dateTimeField3 == null) {
                if (i10 == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                dateTimeField4 = readablePartial.getField(i10 - 1);
                if (getRangeDurationField().getType() != dateTimeField4.getDurationField().getType()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i11 -= (maximumValue + 1) - iArr[i10];
            iArr = dateTimeField4.add(readablePartial, i10 - 1, iArr, 1);
            iArr[i10] = getMinimumValue(readablePartial, iArr);
            dateTimeField2 = dateTimeField4;
        }
        while (true) {
            if (i12 >= 0) {
                break;
            }
            int minimumValue = getMinimumValue(readablePartial, iArr2);
            long j11 = iArr2[i10] + i12;
            if (j11 >= minimumValue) {
                iArr2[i10] = (int) j11;
                break;
            }
            DateTimeField dateTimeField5 = dateTimeField;
            if (dateTimeField == null) {
                if (i10 == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                dateTimeField5 = readablePartial.getField(i10 - 1);
                if (getRangeDurationField().getType() != dateTimeField5.getDurationField().getType()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i12 -= (minimumValue - 1) - iArr2[i10];
            iArr2 = dateTimeField5.add(readablePartial, i10 - 1, iArr2, -1);
            iArr2[i10] = getMaximumValue(readablePartial, iArr2);
            dateTimeField = dateTimeField5;
        }
        return set(readablePartial, i10, iArr2, iArr2[i10]);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return set(j10, FieldUtils.getWrappedValue(get(j10), i10, getMinimumValue(j10), getMaximumValue(j10)));
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        return set(readablePartial, i10, iArr, FieldUtils.getWrappedValue(iArr[i10], i11, getMinimumValue(readablePartial), getMaximumValue(readablePartial)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0179, code lost:
    
        return set(r8, r9, r18, r18[r9]);
     */
    @Override // org.joda.time.DateTimeField
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int[] addWrapPartial(org.joda.time.ReadablePartial r8, int r9, int[] r10, int r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.field.BaseDateTimeField.addWrapPartial(org.joda.time.ReadablePartial, int, int[], int):int[]");
    }

    public int convertText(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    @Override // org.joda.time.DateTimeField
    public abstract int get(long j10);

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i10, Locale locale) {
        return getAsText(i10, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j10) {
        return getAsShortText(j10, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j10, Locale locale) {
        return getAsShortText(get(j10), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i10, Locale locale) {
        return getAsShortText(i10, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return getAsShortText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i10, Locale locale) {
        return Integer.toString(i10);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j10) {
        return getAsText(j10, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j10, Locale locale) {
        return getAsText(get(j10), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i10, Locale locale) {
        return getAsText(i10, locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        return getAsText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j10, long j11) {
        return getDurationField().getDifference(j10, j11);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        return getDurationField().getDifferenceAsLong(j10, j11);
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getDurationField();

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMaximumValue();

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j10) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMinimumValue();

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j10) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j10) {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j10) {
        return j10 - roundFloor(j10);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j10) {
        long roundFloor = roundFloor(j10);
        long j11 = j10;
        if (roundFloor != j10) {
            j11 = add(roundFloor, 1);
        }
        return j11;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long roundFloor(long j10);

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j10) {
        long roundFloor = roundFloor(j10);
        long roundCeiling = roundCeiling(j10);
        return roundCeiling - j10 <= j10 - roundFloor ? roundCeiling : roundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j10) {
        long roundFloor = roundFloor(j10);
        long roundCeiling = roundCeiling(j10);
        long j11 = j10 - roundFloor;
        long j12 = roundCeiling - j10;
        if (j11 < j12) {
            return roundFloor;
        }
        if (j12 >= j11 && (get(roundCeiling) & 1) != 0) {
            return roundFloor;
        }
        return roundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j10) {
        long roundFloor = roundFloor(j10);
        long roundCeiling = roundCeiling(j10);
        return j10 - roundFloor <= roundCeiling - j10 ? roundFloor : roundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long set(long j10, int i10);

    @Override // org.joda.time.DateTimeField
    public final long set(long j10, String str) {
        return set(j10, str, null);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j10, String str, Locale locale) {
        return set(j10, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        FieldUtils.verifyValueBounds(this, i11, getMinimumValue(readablePartial, iArr), getMaximumValue(readablePartial, iArr));
        iArr[i10] = i11;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= readablePartial.size()) {
                return iArr;
            }
            DateTimeField field = readablePartial.getField(i12);
            if (iArr[i12] > field.getMaximumValue(readablePartial, iArr)) {
                iArr[i12] = field.getMaximumValue(readablePartial, iArr);
            }
            i10 = i12;
            if (iArr[i12] < field.getMinimumValue(readablePartial, iArr)) {
                iArr[i12] = field.getMinimumValue(readablePartial, iArr);
                i10 = i12;
            }
        }
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i10, int[] iArr, String str, Locale locale) {
        return set(readablePartial, i10, iArr, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }
}
