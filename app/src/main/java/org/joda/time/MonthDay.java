package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: combined.jar:classes3.jar:org/joda/time/MonthDay.class */
public final class MonthDay extends BasePartial {
    public static final int DAY_OF_MONTH = 1;
    public static final int MONTH_OF_YEAR = 0;
    private static final long serialVersionUID = 2954560699050434609L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    private static final DateTimeFormatter PARSER = new DateTimeFormatterBuilder().appendOptional(ISODateTimeFormat.localDateParser().getParser()).appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();

    /* loaded from: combined.jar:classes3.jar:org/joda/time/MonthDay$Property.class */
    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        public Property(MonthDay monthDay, int i10) {
            this.iBase = monthDay;
            this.iFieldIndex = i10;
        }

        public MonthDay addToCopy(int i10) {
            return new MonthDay(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i10));
        }

        public MonthDay addWrapFieldToCopy(int i10) {
            return new MonthDay(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i10));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        public MonthDay getMonthDay() {
            return this.iBase;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iBase;
        }

        public MonthDay setCopy(int i10) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i10));
        }

        public MonthDay setCopy(String str) {
            return setCopy(str, null);
        }

        public MonthDay setCopy(String str, Locale locale) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }
    }

    public MonthDay() {
    }

    public MonthDay(int i10, int i11) {
        this(i10, i11, null);
    }

    public MonthDay(int i10, int i11, Chronology chronology) {
        super(new int[]{i10, i11}, chronology);
    }

    public MonthDay(long j10) {
        super(j10);
    }

    public MonthDay(long j10, Chronology chronology) {
        super(j10, chronology);
    }

    public MonthDay(Object obj) {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Object obj, Chronology chronology) {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Chronology chronology) {
        super(chronology);
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public MonthDay(MonthDay monthDay, Chronology chronology) {
        super((BasePartial) monthDay, chronology);
    }

    public MonthDay(MonthDay monthDay, int[] iArr) {
        super(monthDay, iArr);
    }

    public static MonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static MonthDay fromDateFields(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static MonthDay now() {
        return new MonthDay();
    }

    public static MonthDay now(Chronology chronology) {
        if (chronology != null) {
            return new MonthDay(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static MonthDay now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MonthDay(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static MonthDay parse(String str) {
        return parse(str, PARSER);
    }

    public static MonthDay parse(String str, DateTimeFormatter dateTimeFormatter) {
        LocalDate parseLocalDate = dateTimeFormatter.parseLocalDate(str);
        return new MonthDay(parseLocalDate.getMonthOfYear(), parseLocalDate.getDayOfMonth());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new MonthDay(this, getChronology().withUTC()) : this;
    }

    public Property dayOfMonth() {
        return new Property(this, 1);
    }

    public int getDayOfMonth() {
        return getValue(1);
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i10, Chronology chronology) {
        if (i10 == 0) {
            return chronology.monthOfYear();
        }
        if (i10 == 1) {
            return chronology.dayOfMonth();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i10);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i10) {
        return FIELD_TYPES[i10];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(0);
    }

    public MonthDay minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public MonthDay minusDays(int i10) {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i10));
    }

    public MonthDay minusMonths(int i10) {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i10));
    }

    public Property monthOfYear() {
        return new Property(this, 0);
    }

    public MonthDay plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public MonthDay plusDays(int i10) {
        return withFieldAdded(DurationFieldType.days(), i10);
    }

    public MonthDay plusMonths(int i10) {
        return withFieldAdded(DurationFieldType.months(), i10);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 2;
    }

    public LocalDate toLocalDate(int i10) {
        return new LocalDate(i10, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.monthOfYear());
        arrayList.add(DateTimeFieldType.dayOfMonth());
        return ISODateTimeFormat.forFields(arrayList, true, true).print(this);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public MonthDay withChronologyRetainFields(Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (withUTC == getChronology()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, withUTC);
        withUTC.validate(monthDay, getValues());
        return monthDay;
    }

    public MonthDay withDayOfMonth(int i10) {
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, getValues(), i10));
    }

    public MonthDay withField(DateTimeFieldType dateTimeFieldType, int i10) {
        int indexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i10 == getValue(indexOfSupported)) {
            return this;
        }
        return new MonthDay(this, getField(indexOfSupported).set(this, indexOfSupported, getValues(), i10));
    }

    public MonthDay withFieldAdded(DurationFieldType durationFieldType, int i10) {
        int indexOfSupported = indexOfSupported(durationFieldType);
        if (i10 == 0) {
            return this;
        }
        return new MonthDay(this, getField(indexOfSupported).add(this, indexOfSupported, getValues(), i10));
    }

    public MonthDay withMonthOfYear(int i10) {
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, getValues(), i10));
    }

    public MonthDay withPeriodAdded(ReadablePeriod readablePeriod, int i10) {
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
        return new MonthDay(this, values);
    }
}
