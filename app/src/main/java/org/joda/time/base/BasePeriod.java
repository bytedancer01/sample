package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.field.FieldUtils;

/* loaded from: combined.jar:classes3.jar:org/joda/time/base/BasePeriod.class */
public abstract class BasePeriod extends AbstractPeriod implements Serializable {
    private static final ReadablePeriod DUMMY_PERIOD = new AbstractPeriod() { // from class: org.joda.time.base.BasePeriod.1
        @Override // org.joda.time.ReadablePeriod
        public PeriodType getPeriodType() {
            return PeriodType.time();
        }

        @Override // org.joda.time.ReadablePeriod
        public int getValue(int i10) {
            return 0;
        }
    };
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    public BasePeriod(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, PeriodType periodType) {
        this.iType = checkPeriodType(periodType);
        this.iValues = setPeriodInternal(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public BasePeriod(long j10) {
        this.iType = PeriodType.standard();
        int[] iArr = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, j10);
        int[] iArr2 = new int[8];
        this.iValues = iArr2;
        System.arraycopy(iArr, 0, iArr2, 4, 4);
    }

    public BasePeriod(long j10, long j11, PeriodType periodType, Chronology chronology) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = checkPeriodType;
        this.iValues = chronology2.get(this, j10, j11);
    }

    public BasePeriod(long j10, PeriodType periodType, Chronology chronology) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iType = checkPeriodType;
        this.iValues = chronology2.get(this, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasePeriod(Object obj, PeriodType periodType, Chronology chronology) {
        PeriodConverter periodConverter = ConverterManager.getInstance().getPeriodConverter(obj);
        PeriodType checkPeriodType = checkPeriodType(periodType == null ? periodConverter.getPeriodType(obj) : periodType);
        this.iType = checkPeriodType;
        if (!(this instanceof ReadWritablePeriod)) {
            this.iValues = new MutablePeriod(obj, checkPeriodType, chronology).getValues();
        } else {
            this.iValues = new int[size()];
            periodConverter.setInto((ReadWritablePeriod) this, obj, DateTimeUtils.getChronology(chronology));
        }
    }

    public BasePeriod(ReadableDuration readableDuration, ReadableInstant readableInstant, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long durationMillis = DateTimeUtils.getDurationMillis(readableDuration);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long safeSubtract = FieldUtils.safeSubtract(instantMillis, durationMillis);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = checkPeriodType;
        this.iValues = instantChronology.get(this, safeSubtract, instantMillis);
    }

    public BasePeriod(ReadableInstant readableInstant, ReadableDuration readableDuration, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long safeAdd = FieldUtils.safeAdd(instantMillis, DateTimeUtils.getDurationMillis(readableDuration));
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iType = checkPeriodType;
        this.iValues = instantChronology.get(this, instantMillis, safeAdd);
    }

    public BasePeriod(ReadableInstant readableInstant, ReadableInstant readableInstant2, PeriodType periodType) {
        PeriodType checkPeriodType = checkPeriodType(periodType);
        if (readableInstant == null && readableInstant2 == null) {
            this.iType = checkPeriodType;
            this.iValues = new int[size()];
            return;
        }
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long instantMillis2 = DateTimeUtils.getInstantMillis(readableInstant2);
        Chronology intervalChronology = DateTimeUtils.getIntervalChronology(readableInstant, readableInstant2);
        this.iType = checkPeriodType;
        this.iValues = intervalChronology.get(this, instantMillis, instantMillis2);
    }

    public BasePeriod(ReadablePartial readablePartial, ReadablePartial readablePartial2, PeriodType periodType) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if ((readablePartial instanceof BaseLocal) && (readablePartial2 instanceof BaseLocal) && readablePartial.getClass() == readablePartial2.getClass()) {
            PeriodType checkPeriodType = checkPeriodType(periodType);
            long localMillis = ((BaseLocal) readablePartial).getLocalMillis();
            long localMillis2 = ((BaseLocal) readablePartial2).getLocalMillis();
            Chronology chronology = DateTimeUtils.getChronology(readablePartial.getChronology());
            this.iType = checkPeriodType;
            this.iValues = chronology.get(this, localMillis, localMillis2);
            return;
        }
        if (readablePartial.size() != readablePartial2.size()) {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        int size = readablePartial.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (readablePartial.getFieldType(i10) != readablePartial2.getFieldType(i10)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        }
        this.iType = checkPeriodType(periodType);
        Chronology withUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
        this.iValues = withUTC.get(this, withUTC.set(readablePartial, 0L), withUTC.set(readablePartial2, 0L));
    }

    public BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }

    private void checkAndUpdate(DurationFieldType durationFieldType, int[] iArr, int i10) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i10;
        } else {
            if (i10 == 0) {
                return;
            }
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType.getName() + "'");
        }
    }

    private void setPeriodInternal(ReadablePeriod readablePeriod) {
        int[] iArr = new int[size()];
        int size = readablePeriod.size();
        for (int i10 = 0; i10 < size; i10++) {
            checkAndUpdate(readablePeriod.getFieldType(i10), iArr, readablePeriod.getValue(i10));
        }
        setValues(iArr);
    }

    private int[] setPeriodInternal(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int[] iArr = new int[size()];
        checkAndUpdate(DurationFieldType.years(), iArr, i10);
        checkAndUpdate(DurationFieldType.months(), iArr, i11);
        checkAndUpdate(DurationFieldType.weeks(), iArr, i12);
        checkAndUpdate(DurationFieldType.days(), iArr, i13);
        checkAndUpdate(DurationFieldType.hours(), iArr, i14);
        checkAndUpdate(DurationFieldType.minutes(), iArr, i15);
        checkAndUpdate(DurationFieldType.seconds(), iArr, i16);
        checkAndUpdate(DurationFieldType.millis(), iArr, i17);
        return iArr;
    }

    public void addField(DurationFieldType durationFieldType, int i10) {
        addFieldInto(this.iValues, durationFieldType, i10);
    }

    public void addFieldInto(int[] iArr, DurationFieldType durationFieldType, int i10) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = FieldUtils.safeAdd(iArr[indexOf], i10);
            return;
        }
        if (i10 != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    public void addPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(addPeriodInto(getValues(), readablePeriod));
        }
    }

    public int[] addPeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i10 = 0; i10 < size; i10++) {
            DurationFieldType fieldType = readablePeriod.getFieldType(i10);
            int value = readablePeriod.getValue(i10);
            if (value != 0) {
                int indexOf = indexOf(fieldType);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Period does not support field '" + fieldType.getName() + "'");
                }
                iArr[indexOf] = FieldUtils.safeAdd(getValue(indexOf), value);
            }
        }
        return iArr;
    }

    public PeriodType checkPeriodType(PeriodType periodType) {
        return DateTimeUtils.getPeriodType(periodType);
    }

    @Override // org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return this.iType;
    }

    @Override // org.joda.time.ReadablePeriod
    public int getValue(int i10) {
        return this.iValues[i10];
    }

    public void mergePeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod != null) {
            setValues(mergePeriodInto(getValues(), readablePeriod));
        }
    }

    public int[] mergePeriodInto(int[] iArr, ReadablePeriod readablePeriod) {
        int size = readablePeriod.size();
        for (int i10 = 0; i10 < size; i10++) {
            checkAndUpdate(readablePeriod.getFieldType(i10), iArr, readablePeriod.getValue(i10));
        }
        return iArr;
    }

    public void setField(DurationFieldType durationFieldType, int i10) {
        setFieldInto(this.iValues, durationFieldType, i10);
    }

    public void setFieldInto(int[] iArr, DurationFieldType durationFieldType, int i10) {
        int indexOf = indexOf(durationFieldType);
        if (indexOf != -1) {
            iArr[indexOf] = i10;
            return;
        }
        if (i10 != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    public void setPeriod(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        setValues(setPeriodInternal(i10, i11, i12, i13, i14, i15, i16, i17));
    }

    public void setPeriod(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setValues(new int[size()]);
        } else {
            setPeriodInternal(readablePeriod);
        }
    }

    public void setValue(int i10, int i11) {
        this.iValues[i10] = i11;
    }

    public void setValues(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public Duration toDurationFrom(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(instantMillis, DateTimeUtils.getInstantChronology(readableInstant).add(this, instantMillis, 1));
    }

    public Duration toDurationTo(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        return new Duration(DateTimeUtils.getInstantChronology(readableInstant).add(this, instantMillis, -1), instantMillis);
    }
}
