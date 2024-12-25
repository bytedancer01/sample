package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: combined.jar:classes3.jar:org/joda/time/Partial.class */
public final class Partial extends AbstractPartial implements Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final Chronology iChronology;
    private transient DateTimeFormatter[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/Partial$Property.class */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        public Property(Partial partial, int i10) {
            this.iPartial = partial;
            this.iFieldIndex = i10;
        }

        public Partial addToCopy(int i10) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i10));
        }

        public Partial addWrapFieldToCopy(int i10) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i10));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(int i10) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i10));
        }

        public Partial setCopy(String str) {
            return setCopy(str, null);
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    public Partial() {
        this((Chronology) null);
    }

    public Partial(Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    public Partial(Chronology chronology, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = chronology;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i10) {
        this(dateTimeFieldType, i10, (Chronology) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i10, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
        int[] iArr = {i10};
        this.iValues = iArr;
        withUTC.validate(this, iArr);
    }

    public Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        this.iChronology = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
        this.iTypes = new DateTimeFieldType[readablePartial.size()];
        this.iValues = new int[readablePartial.size()];
        for (int i10 = 0; i10 < readablePartial.size(); i10++) {
            this.iTypes[i10] = readablePartial.getFieldType(i10);
            this.iValues[i10] = readablePartial.getValue(i10);
        }
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (Chronology) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = withUTC;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        }
        if (iArr == null) {
            throw new IllegalArgumentException("Values array must not be null");
        }
        if (iArr.length != dateTimeFieldTypeArr.length) {
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        }
        if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
            return;
        }
        for (int i10 = 0; i10 < dateTimeFieldTypeArr.length; i10++) {
            if (dateTimeFieldTypeArr[i10] == null) {
                throw new IllegalArgumentException("Types array must not contain null: index " + i10);
            }
        }
        DurationField durationField = null;
        int i11 = 0;
        while (i11 < dateTimeFieldTypeArr.length) {
            DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i11];
            DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
            if (i11 > 0) {
                if (!field.isSupported()) {
                    if (durationField.isSupported()) {
                        throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i11 - 1].getName() + " < " + dateTimeFieldType.getName());
                    }
                    throw new IllegalArgumentException("Types array must not contain duplicate unsupported: " + dateTimeFieldTypeArr[i11 - 1].getName() + " and " + dateTimeFieldType.getName());
                }
                int compareTo = durationField.compareTo(field);
                if (compareTo < 0) {
                    throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i11 - 1].getName() + " < " + dateTimeFieldType.getName());
                }
                if (compareTo != 0) {
                    continue;
                } else if (durationField.equals(field)) {
                    int i12 = i11 - 1;
                    DurationFieldType rangeDurationType = dateTimeFieldTypeArr[i12].getRangeDurationType();
                    DurationFieldType rangeDurationType2 = dateTimeFieldType.getRangeDurationType();
                    if (rangeDurationType == null) {
                        if (rangeDurationType2 == null) {
                            throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i12].getName() + " and " + dateTimeFieldType.getName());
                        }
                    } else {
                        if (rangeDurationType2 == null) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i12].getName() + " < " + dateTimeFieldType.getName());
                        }
                        DurationField field2 = rangeDurationType.getField(this.iChronology);
                        DurationField field3 = rangeDurationType2.getField(this.iChronology);
                        if (field2.compareTo(field3) < 0) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i12].getName() + " < " + dateTimeFieldType.getName());
                        }
                        if (field2.compareTo(field3) == 0) {
                            throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i12].getName() + " and " + dateTimeFieldType.getName());
                        }
                    }
                } else if (durationField.isSupported() && durationField.getType() != DurationFieldType.YEARS_TYPE) {
                    throw new IllegalArgumentException("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: " + dateTimeFieldTypeArr[i11 - 1].getName() + " < " + dateTimeFieldType.getName());
                }
            }
            i11++;
            durationField = field;
        }
        this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
        withUTC.validate(this, iArr);
        this.iValues = (int[]) iArr.clone();
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i10, Chronology chronology) {
        return this.iTypes[i10].getField(chronology);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i10) {
        return this.iTypes[i10];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public DateTimeFormatter getFormatter() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        DateTimeFormatter[] dateTimeFormatterArr2 = dateTimeFormatterArr;
        if (dateTimeFormatterArr == null) {
            if (size() == 0) {
                return null;
            }
            dateTimeFormatterArr2 = new DateTimeFormatter[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                dateTimeFormatterArr2[0] = ISODateTimeFormat.forFields(arrayList, true, false);
                if (arrayList.size() == 0) {
                    dateTimeFormatterArr2[1] = dateTimeFormatterArr2[0];
                }
            } catch (IllegalArgumentException e10) {
            }
            this.iFormatter = dateTimeFormatterArr2;
        }
        return dateTimeFormatterArr2[0];
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i10) {
        return this.iValues[i10];
    }

    @Override // org.joda.time.base.AbstractPartial
    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public boolean isMatch(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        int i10 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i10 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i10].getField(instantChronology).get(instantMillis) != this.iValues[i10]) {
                return false;
            }
            i10++;
        }
    }

    public boolean isMatch(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        int i10 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i10 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (readablePartial.get(dateTimeFieldTypeArr[i10]) != this.iValues[i10]) {
                return false;
            }
            i10++;
        }
    }

    public Partial minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public Partial plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return this.iTypes.length;
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        DateTimeFormatter[] dateTimeFormatterArr2 = dateTimeFormatterArr;
        if (dateTimeFormatterArr == null) {
            getFormatter();
            DateTimeFormatter[] dateTimeFormatterArr3 = this.iFormatter;
            dateTimeFormatterArr2 = dateTimeFormatterArr3;
            if (dateTimeFormatterArr3 == null) {
                return toStringList();
            }
        }
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterArr2[1];
        return dateTimeFormatter == null ? toStringList() : dateTimeFormatter.print(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public String toStringList() {
        int size = size();
        StringBuilder sb2 = new StringBuilder(size * 20);
        sb2.append('[');
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append(',');
                sb2.append(' ');
            }
            sb2.append(this.iTypes[i10].getName());
            sb2.append('=');
            sb2.append(this.iValues[i10]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public Partial with(DateTimeFieldType dateTimeFieldType, int i10) {
        int i11;
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        int indexOf = indexOf(dateTimeFieldType);
        if (indexOf != -1) {
            if (i10 == getValue(indexOf)) {
                return this;
            }
            return new Partial(this, getField(indexOf).set(this, indexOf, getValues(), i10));
        }
        int length = this.iTypes.length + 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
        int[] iArr = new int[length];
        DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
        if (field.isSupported()) {
            int i12 = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                i11 = i12;
                if (i12 >= dateTimeFieldTypeArr2.length) {
                    break;
                }
                DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i12];
                DurationField field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                if (field2.isSupported()) {
                    int compareTo = field.compareTo(field2);
                    if (compareTo <= 0) {
                        if (compareTo == 0) {
                            if (dateTimeFieldType.getRangeDurationType() != null) {
                                if (dateTimeFieldType2.getRangeDurationType() != null && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0) {
                                    i11 = i12;
                                    break;
                                }
                            } else {
                                i11 = i12;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i11 = i12;
                        break;
                    }
                }
                i12++;
            }
        } else {
            i11 = 0;
        }
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i11);
        System.arraycopy(this.iValues, 0, iArr, 0, i11);
        dateTimeFieldTypeArr[i11] = dateTimeFieldType;
        iArr[i11] = i10;
        int i13 = i11 + 1;
        int i14 = (length - i11) - 1;
        System.arraycopy(this.iTypes, i11, dateTimeFieldTypeArr, i13, i14);
        System.arraycopy(this.iValues, i11, iArr, i13, i14);
        Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public Partial withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(withUTC, this.iTypes, this.iValues);
        withUTC.validate(partial, this.iValues);
        return partial;
    }

    public Partial withField(DateTimeFieldType dateTimeFieldType, int i10) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i10 == getValue(indexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i10));
    }

    public Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i10) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i10 == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).addWrapPartial(this, indexOfSupported, getValues(), i10));
    }

    public Partial withFieldAdded(DurationFieldType durationFieldType, int i10) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i10 == 0) {
            return this;
        }
        return new Partial(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i10));
    }

    public Partial withPeriodAdded(ReadablePeriod readablePeriod, int i10) {
        if (readablePeriod == null || i10 == 0) {
            return this;
        }
        int[] values = getValues();
        int i11 = 0;
        while (i11 < readablePeriod.size()) {
            int indexOf = indexOf(readablePeriod.getFieldType(i11));
            int[] iArr = values;
            if (indexOf >= 0) {
                iArr = getField(indexOf).add(this, indexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i11), i10));
            }
            i11++;
            values = iArr;
        }
        return new Partial(this, values);
    }

    public Partial without(DateTimeFieldType dateTimeFieldType) {
        int indexOf = indexOf(dateTimeFieldType);
        if (indexOf == -1) {
            return this;
        }
        int size = size() - 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        int size2 = size() - 1;
        int[] iArr = new int[size2];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, indexOf);
        int i10 = indexOf + 1;
        System.arraycopy(this.iTypes, i10, dateTimeFieldTypeArr, indexOf, size - indexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, indexOf);
        System.arraycopy(this.iValues, i10, iArr, indexOf, size2 - indexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }
}
