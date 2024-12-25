package org.joda.time;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: combined.jar:classes3.jar:org/joda/time/LocalDate.class */
public final class LocalDate extends BaseLocal implements Serializable {
    private static final Set<DurationFieldType> DATE_DURATION_TYPES;
    private static final int DAY_OF_MONTH = 2;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = -8775358157899L;
    private final Chronology iChronology;
    private transient int iHash;
    private final long iLocalMillis;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/LocalDate$Property.class */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;
        private transient DateTimeField iField;
        private transient LocalDate iInstant;

        public Property(LocalDate localDate, DateTimeField dateTimeField) {
            this.iInstant = localDate;
            this.iField = dateTimeField;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iInstant = (LocalDate) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).getField(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.getType());
        }

        public LocalDate addToCopy(int i10) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.add(localDate.getLocalMillis(), i10));
        }

        public LocalDate addWrapFieldToCopy(int i10) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.addWrapField(localDate.getLocalMillis(), i10));
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public Chronology getChronology() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public DateTimeField getField() {
            return this.iField;
        }

        public LocalDate getLocalDate() {
            return this.iInstant;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public long getMillis() {
            return this.iInstant.getLocalMillis();
        }

        public LocalDate roundCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundFloor(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfCeilingCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfCeiling(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfEvenCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfEven(localDate.getLocalMillis()));
        }

        public LocalDate roundHalfFloorCopy() {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.roundHalfFloor(localDate.getLocalMillis()));
        }

        public LocalDate setCopy(int i10) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), i10));
        }

        public LocalDate setCopy(String str) {
            return setCopy(str, null);
        }

        public LocalDate setCopy(String str, Locale locale) {
            LocalDate localDate = this.iInstant;
            return localDate.withLocalMillis(this.iField.set(localDate.getLocalMillis(), str, locale));
        }

        public LocalDate withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public LocalDate withMinimumValue() {
            return setCopy(getMinimumValue());
        }
    }

    static {
        HashSet hashSet = new HashSet();
        DATE_DURATION_TYPES = hashSet;
        hashSet.add(DurationFieldType.days());
        hashSet.add(DurationFieldType.weeks());
        hashSet.add(DurationFieldType.months());
        hashSet.add(DurationFieldType.weekyears());
        hashSet.add(DurationFieldType.years());
        hashSet.add(DurationFieldType.centuries());
        hashSet.add(DurationFieldType.eras());
    }

    public LocalDate() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public LocalDate(int i10, int i11, int i12) {
        this(i10, i11, i12, ISOChronology.getInstanceUTC());
    }

    public LocalDate(int i10, int i11, int i12, Chronology chronology) {
        Chronology withUTC = DateTimeUtils.getChronology(chronology).withUTC();
        long dateTimeMillis = withUTC.getDateTimeMillis(i10, i11, i12, 0);
        this.iChronology = withUTC;
        this.iLocalMillis = dateTimeMillis;
    }

    public LocalDate(long j10) {
        this(j10, ISOChronology.getInstance());
    }

    public LocalDate(long j10, Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        long millisKeepLocal = chronology2.getZone().getMillisKeepLocal(DateTimeZone.UTC, j10);
        Chronology withUTC = chronology2.withUTC();
        this.iLocalMillis = withUTC.dayOfMonth().roundFloor(millisKeepLocal);
        this.iChronology = withUTC;
    }

    public LocalDate(long j10, DateTimeZone dateTimeZone) {
        this(j10, ISOChronology.getInstance(dateTimeZone));
    }

    public LocalDate(Object obj) {
        this(obj, (Chronology) null);
    }

    public LocalDate(Object obj, Chronology chronology) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology2 = DateTimeUtils.getChronology(partialConverter.getChronology(obj, chronology));
        Chronology withUTC = chronology2.withUTC();
        this.iChronology = withUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology2, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = withUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public LocalDate(Object obj, DateTimeZone dateTimeZone) {
        PartialConverter partialConverter = ConverterManager.getInstance().getPartialConverter(obj);
        Chronology chronology = DateTimeUtils.getChronology(partialConverter.getChronology(obj, dateTimeZone));
        Chronology withUTC = chronology.withUTC();
        this.iChronology = withUTC;
        int[] partialValues = partialConverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateParser());
        this.iLocalMillis = withUTC.getDateTimeMillis(partialValues[0], partialValues[1], partialValues[2], 0);
    }

    public LocalDate(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDate(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    public static LocalDate fromCalendarFields(Calendar calendar) {
        if (calendar == null) {
            throw new IllegalArgumentException("The calendar must not be null");
        }
        int i10 = calendar.get(0);
        int i11 = calendar.get(1);
        if (i10 != 1) {
            i11 = 1 - i11;
        }
        return new LocalDate(i11, calendar.get(2) + 1, calendar.get(5));
    }

    public static LocalDate fromDateFields(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return fromCalendarFields(gregorianCalendar);
    }

    public static LocalDate now() {
        return new LocalDate();
    }

    public static LocalDate now(Chronology chronology) {
        if (chronology != null) {
            return new LocalDate(chronology);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    public static LocalDate now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new LocalDate(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @FromString
    public static LocalDate parse(String str) {
        return parse(str, ISODateTimeFormat.localDateParser());
    }

    public static LocalDate parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseLocalDate(str);
    }

    private Object readResolve() {
        Chronology chronology = this.iChronology;
        return chronology == null ? new LocalDate(this.iLocalMillis, ISOChronology.getInstanceUTC()) : !DateTimeZone.UTC.equals(chronology.getZone()) ? new LocalDate(this.iLocalMillis, this.iChronology.withUTC()) : this;
    }

    public Property centuryOfEra() {
        return new Property(this, getChronology().centuryOfEra());
    }

    @Override // org.joda.time.base.AbstractPartial, java.lang.Comparable
    public int compareTo(ReadablePartial readablePartial) {
        int i10 = 0;
        if (this == readablePartial) {
            return 0;
        }
        if (readablePartial instanceof LocalDate) {
            LocalDate localDate = (LocalDate) readablePartial;
            if (this.iChronology.equals(localDate.iChronology)) {
                long j10 = this.iLocalMillis;
                long j11 = localDate.iLocalMillis;
                if (j10 < j11) {
                    i10 = -1;
                } else if (j10 != j11) {
                    i10 = 1;
                }
                return i10;
            }
        }
        return super.compareTo(readablePartial);
    }

    public Property dayOfMonth() {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek() {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear() {
        return new Property(this, getChronology().dayOfYear());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.iChronology.equals(localDate.iChronology)) {
                if (this.iLocalMillis != localDate.iLocalMillis) {
                    z10 = false;
                }
                return z10;
            }
        }
        return super.equals(obj);
    }

    public Property era() {
        return new Property(this, getChronology().era());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int get(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return dateTimeFieldType.getField(getChronology()).get(getLocalMillis());
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public int getCenturyOfEra() {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    public int getDayOfMonth() {
        return getChronology().dayOfMonth().get(getLocalMillis());
    }

    public int getDayOfWeek() {
        return getChronology().dayOfWeek().get(getLocalMillis());
    }

    public int getDayOfYear() {
        return getChronology().dayOfYear().get(getLocalMillis());
    }

    public int getEra() {
        return getChronology().era().get(getLocalMillis());
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i10, Chronology chronology) {
        if (i10 == 0) {
            return chronology.year();
        }
        if (i10 == 1) {
            return chronology.monthOfYear();
        }
        if (i10 == 2) {
            return chronology.dayOfMonth();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i10);
    }

    @Override // org.joda.time.base.BaseLocal
    public long getLocalMillis() {
        return this.iLocalMillis;
    }

    public int getMonthOfYear() {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i10) {
        DateTimeField year;
        if (i10 == 0) {
            year = getChronology().year();
        } else if (i10 == 1) {
            year = getChronology().monthOfYear();
        } else {
            if (i10 != 2) {
                throw new IndexOutOfBoundsException("Invalid index: " + i10);
            }
            year = getChronology().dayOfMonth();
        }
        return year.get(getLocalMillis());
    }

    public int getWeekOfWeekyear() {
        return getChronology().weekOfWeekyear().get(getLocalMillis());
    }

    public int getWeekyear() {
        return getChronology().weekyear().get(getLocalMillis());
    }

    public int getYear() {
        return getChronology().year().get(getLocalMillis());
    }

    public int getYearOfCentury() {
        return getChronology().yearOfCentury().get(getLocalMillis());
    }

    public int getYearOfEra() {
        return getChronology().yearOfEra().get(getLocalMillis());
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public int hashCode() {
        int i10 = this.iHash;
        int i11 = i10;
        if (i10 == 0) {
            i11 = super.hashCode();
            this.iHash = i11;
        }
        return i11;
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType durationType = dateTimeFieldType.getDurationType();
        if (DATE_DURATION_TYPES.contains(durationType) || durationType.getField(getChronology()).getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return dateTimeFieldType.getField(getChronology()).isSupported();
        }
        return false;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        DurationField field = durationFieldType.getField(getChronology());
        if (DATE_DURATION_TYPES.contains(durationFieldType) || field.getUnitMillis() >= getChronology().days().getUnitMillis()) {
            return field.isSupported();
        }
        return false;
    }

    public LocalDate minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public LocalDate minusDays(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().days().subtract(getLocalMillis(), i10));
    }

    public LocalDate minusMonths(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().months().subtract(getLocalMillis(), i10));
    }

    public LocalDate minusWeeks(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i10));
    }

    public LocalDate minusYears(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().years().subtract(getLocalMillis(), i10));
    }

    public Property monthOfYear() {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDate plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public LocalDate plusDays(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().days().add(getLocalMillis(), i10));
    }

    public LocalDate plusMonths(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().months().add(getLocalMillis(), i10));
    }

    public LocalDate plusWeeks(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().weeks().add(getLocalMillis(), i10));
    }

    public LocalDate plusYears(int i10) {
        return i10 == 0 ? this : withLocalMillis(getChronology().years().add(getLocalMillis(), i10));
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return new Property(this, dateTimeFieldType.getField(getChronology()));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return 3;
    }

    public Date toDate() {
        Date date;
        long time;
        int dayOfMonth = getDayOfMonth();
        Date date2 = new Date(getYear() - 1900, getMonthOfYear() - 1, dayOfMonth);
        LocalDate fromDateFields = fromDateFields(date2);
        if (fromDateFields.isBefore(this)) {
            for (LocalDate localDate = fromDateFields; !localDate.equals(this); localDate = fromDateFields(date2)) {
                date2.setTime(date2.getTime() + 3600000);
            }
            while (true) {
                int date3 = date2.getDate();
                time = date2.getTime();
                if (date3 != dayOfMonth) {
                    break;
                }
                date2.setTime(time - 1000);
            }
            date2.setTime(time + 1000);
            date = date2;
        } else {
            date = date2;
            if (fromDateFields.equals(this)) {
                Date date4 = new Date(date2.getTime() - TimeZone.getDefault().getDSTSavings());
                date = date2;
                if (date4.getDate() == dayOfMonth) {
                    date = date4;
                }
            }
        }
        return date;
    }

    @Deprecated
    public DateMidnight toDateMidnight() {
        return toDateMidnight(null);
    }

    @Deprecated
    public DateMidnight toDateMidnight(DateTimeZone dateTimeZone) {
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public DateTime toDateTime(LocalTime localTime) {
        return toDateTime(localTime, null);
    }

    public DateTime toDateTime(LocalTime localTime, DateTimeZone dateTimeZone) {
        if (localTime == null) {
            return toDateTimeAtCurrentTime(dateTimeZone);
        }
        if (getChronology() != localTime.getChronology()) {
            throw new IllegalArgumentException("The chronology of the time does not match");
        }
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), localTime.getHourOfDay(), localTime.getMinuteOfHour(), localTime.getSecondOfMinute(), localTime.getMillisOfSecond(), getChronology().withZone(dateTimeZone));
    }

    public DateTime toDateTimeAtCurrentTime() {
        return toDateTimeAtCurrentTime(null);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone dateTimeZone) {
        Chronology withZone = getChronology().withZone(DateTimeUtils.getZone(dateTimeZone));
        return new DateTime(withZone.set(this, DateTimeUtils.currentTimeMillis()), withZone);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight() {
        return toDateTimeAtMidnight(null);
    }

    @Deprecated
    public DateTime toDateTimeAtMidnight(DateTimeZone dateTimeZone) {
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, getChronology().withZone(DateTimeUtils.getZone(dateTimeZone)));
    }

    public DateTime toDateTimeAtStartOfDay() {
        return toDateTimeAtStartOfDay(null);
    }

    public DateTime toDateTimeAtStartOfDay(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        Chronology withZone = getChronology().withZone(zone);
        return new DateTime(withZone.dayOfMonth().roundFloor(zone.convertLocalToUTC(getLocalMillis() + 21600000, false)), withZone);
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        return new Interval(toDateTimeAtStartOfDay(zone), plusDays(1).toDateTimeAtStartOfDay(zone));
    }

    public LocalDateTime toLocalDateTime(LocalTime localTime) {
        if (localTime == null) {
            throw new IllegalArgumentException("The time must not be null");
        }
        if (getChronology() == localTime.getChronology()) {
            return new LocalDateTime(getLocalMillis() + localTime.getLocalMillis(), getChronology());
        }
        throw new IllegalArgumentException("The chronology of the time does not match");
    }

    @Override // org.joda.time.ReadablePartial
    @ToString
    public String toString() {
        return ISODateTimeFormat.date().print(this);
    }

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).print(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public Property weekOfWeekyear() {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear() {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDate withCenturyOfEra(int i10) {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i10));
    }

    public LocalDate withDayOfMonth(int i10) {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i10));
    }

    public LocalDate withDayOfWeek(int i10) {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i10));
    }

    public LocalDate withDayOfYear(int i10) {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i10));
    }

    public LocalDate withEra(int i10) {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i10));
    }

    public LocalDate withField(DateTimeFieldType dateTimeFieldType, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(dateTimeFieldType)) {
            return withLocalMillis(dateTimeFieldType.getField(getChronology()).set(getLocalMillis(), i10));
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public LocalDate withFieldAdded(DurationFieldType durationFieldType, int i10) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (isSupported(durationFieldType)) {
            return i10 == 0 ? this : withLocalMillis(durationFieldType.getField(getChronology()).add(getLocalMillis(), i10));
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }

    public LocalDate withFields(ReadablePartial readablePartial) {
        return readablePartial == null ? this : withLocalMillis(getChronology().set(readablePartial, getLocalMillis()));
    }

    public LocalDate withLocalMillis(long j10) {
        long roundFloor = this.iChronology.dayOfMonth().roundFloor(j10);
        return roundFloor == getLocalMillis() ? this : new LocalDate(roundFloor, getChronology());
    }

    public LocalDate withMonthOfYear(int i10) {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i10));
    }

    public LocalDate withPeriodAdded(ReadablePeriod readablePeriod, int i10) {
        if (readablePeriod == null || i10 == 0) {
            return this;
        }
        long localMillis = getLocalMillis();
        Chronology chronology = getChronology();
        int i11 = 0;
        while (i11 < readablePeriod.size()) {
            long safeMultiply = FieldUtils.safeMultiply(readablePeriod.getValue(i11), i10);
            DurationFieldType fieldType = readablePeriod.getFieldType(i11);
            long j10 = localMillis;
            if (isSupported(fieldType)) {
                j10 = fieldType.getField(chronology).add(localMillis, safeMultiply);
            }
            i11++;
            localMillis = j10;
        }
        return withLocalMillis(localMillis);
    }

    public LocalDate withWeekOfWeekyear(int i10) {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i10));
    }

    public LocalDate withWeekyear(int i10) {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i10));
    }

    public LocalDate withYear(int i10) {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i10));
    }

    public LocalDate withYearOfCentury(int i10) {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i10));
    }

    public LocalDate withYearOfEra(int i10) {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i10));
    }

    public Property year() {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury() {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra() {
        return new Property(this, getChronology().yearOfEra());
    }
}
