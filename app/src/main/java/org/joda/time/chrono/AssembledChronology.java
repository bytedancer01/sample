package org.joda.time.chrono;

import java.io.ObjectInputStream;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/AssembledChronology.class */
public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID = -6728465968995518215L;
    private final Chronology iBase;
    private transient int iBaseFlags;
    private transient DurationField iCenturies;
    private transient DateTimeField iCenturyOfEra;
    private transient DateTimeField iClockhourOfDay;
    private transient DateTimeField iClockhourOfHalfday;
    private transient DateTimeField iDayOfMonth;
    private transient DateTimeField iDayOfWeek;
    private transient DateTimeField iDayOfYear;
    private transient DurationField iDays;
    private transient DateTimeField iEra;
    private transient DurationField iEras;
    private transient DateTimeField iHalfdayOfDay;
    private transient DurationField iHalfdays;
    private transient DateTimeField iHourOfDay;
    private transient DateTimeField iHourOfHalfday;
    private transient DurationField iHours;
    private transient DurationField iMillis;
    private transient DateTimeField iMillisOfDay;
    private transient DateTimeField iMillisOfSecond;
    private transient DateTimeField iMinuteOfDay;
    private transient DateTimeField iMinuteOfHour;
    private transient DurationField iMinutes;
    private transient DateTimeField iMonthOfYear;
    private transient DurationField iMonths;
    private final Object iParam;
    private transient DateTimeField iSecondOfDay;
    private transient DateTimeField iSecondOfMinute;
    private transient DurationField iSeconds;
    private transient DateTimeField iWeekOfWeekyear;
    private transient DurationField iWeeks;
    private transient DateTimeField iWeekyear;
    private transient DateTimeField iWeekyearOfCentury;
    private transient DurationField iWeekyears;
    private transient DateTimeField iYear;
    private transient DateTimeField iYearOfCentury;
    private transient DateTimeField iYearOfEra;
    private transient DurationField iYears;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/AssembledChronology$Fields.class */
    public static final class Fields {
        public DurationField centuries;
        public DateTimeField centuryOfEra;
        public DateTimeField clockhourOfDay;
        public DateTimeField clockhourOfHalfday;
        public DateTimeField dayOfMonth;
        public DateTimeField dayOfWeek;
        public DateTimeField dayOfYear;
        public DurationField days;
        public DateTimeField era;
        public DurationField eras;
        public DateTimeField halfdayOfDay;
        public DurationField halfdays;
        public DateTimeField hourOfDay;
        public DateTimeField hourOfHalfday;
        public DurationField hours;
        public DurationField millis;
        public DateTimeField millisOfDay;
        public DateTimeField millisOfSecond;
        public DateTimeField minuteOfDay;
        public DateTimeField minuteOfHour;
        public DurationField minutes;
        public DateTimeField monthOfYear;
        public DurationField months;
        public DateTimeField secondOfDay;
        public DateTimeField secondOfMinute;
        public DurationField seconds;
        public DateTimeField weekOfWeekyear;
        public DurationField weeks;
        public DateTimeField weekyear;
        public DateTimeField weekyearOfCentury;
        public DurationField weekyears;
        public DateTimeField year;
        public DateTimeField yearOfCentury;
        public DateTimeField yearOfEra;
        public DurationField years;

        private static boolean isSupported(DateTimeField dateTimeField) {
            return dateTimeField == null ? false : dateTimeField.isSupported();
        }

        private static boolean isSupported(DurationField durationField) {
            return durationField == null ? false : durationField.isSupported();
        }

        public void copyFieldsFrom(Chronology chronology) {
            DurationField millis = chronology.millis();
            if (isSupported(millis)) {
                this.millis = millis;
            }
            DurationField seconds = chronology.seconds();
            if (isSupported(seconds)) {
                this.seconds = seconds;
            }
            DurationField minutes = chronology.minutes();
            if (isSupported(minutes)) {
                this.minutes = minutes;
            }
            DurationField hours = chronology.hours();
            if (isSupported(hours)) {
                this.hours = hours;
            }
            DurationField halfdays = chronology.halfdays();
            if (isSupported(halfdays)) {
                this.halfdays = halfdays;
            }
            DurationField days = chronology.days();
            if (isSupported(days)) {
                this.days = days;
            }
            DurationField weeks = chronology.weeks();
            if (isSupported(weeks)) {
                this.weeks = weeks;
            }
            DurationField weekyears = chronology.weekyears();
            if (isSupported(weekyears)) {
                this.weekyears = weekyears;
            }
            DurationField months = chronology.months();
            if (isSupported(months)) {
                this.months = months;
            }
            DurationField years = chronology.years();
            if (isSupported(years)) {
                this.years = years;
            }
            DurationField centuries = chronology.centuries();
            if (isSupported(centuries)) {
                this.centuries = centuries;
            }
            DurationField eras = chronology.eras();
            if (isSupported(eras)) {
                this.eras = eras;
            }
            DateTimeField millisOfSecond = chronology.millisOfSecond();
            if (isSupported(millisOfSecond)) {
                this.millisOfSecond = millisOfSecond;
            }
            DateTimeField millisOfDay = chronology.millisOfDay();
            if (isSupported(millisOfDay)) {
                this.millisOfDay = millisOfDay;
            }
            DateTimeField secondOfMinute = chronology.secondOfMinute();
            if (isSupported(secondOfMinute)) {
                this.secondOfMinute = secondOfMinute;
            }
            DateTimeField secondOfDay = chronology.secondOfDay();
            if (isSupported(secondOfDay)) {
                this.secondOfDay = secondOfDay;
            }
            DateTimeField minuteOfHour = chronology.minuteOfHour();
            if (isSupported(minuteOfHour)) {
                this.minuteOfHour = minuteOfHour;
            }
            DateTimeField minuteOfDay = chronology.minuteOfDay();
            if (isSupported(minuteOfDay)) {
                this.minuteOfDay = minuteOfDay;
            }
            DateTimeField hourOfDay = chronology.hourOfDay();
            if (isSupported(hourOfDay)) {
                this.hourOfDay = hourOfDay;
            }
            DateTimeField clockhourOfDay = chronology.clockhourOfDay();
            if (isSupported(clockhourOfDay)) {
                this.clockhourOfDay = clockhourOfDay;
            }
            DateTimeField hourOfHalfday = chronology.hourOfHalfday();
            if (isSupported(hourOfHalfday)) {
                this.hourOfHalfday = hourOfHalfday;
            }
            DateTimeField clockhourOfHalfday = chronology.clockhourOfHalfday();
            if (isSupported(clockhourOfHalfday)) {
                this.clockhourOfHalfday = clockhourOfHalfday;
            }
            DateTimeField halfdayOfDay = chronology.halfdayOfDay();
            if (isSupported(halfdayOfDay)) {
                this.halfdayOfDay = halfdayOfDay;
            }
            DateTimeField dayOfWeek = chronology.dayOfWeek();
            if (isSupported(dayOfWeek)) {
                this.dayOfWeek = dayOfWeek;
            }
            DateTimeField dayOfMonth = chronology.dayOfMonth();
            if (isSupported(dayOfMonth)) {
                this.dayOfMonth = dayOfMonth;
            }
            DateTimeField dayOfYear = chronology.dayOfYear();
            if (isSupported(dayOfYear)) {
                this.dayOfYear = dayOfYear;
            }
            DateTimeField weekOfWeekyear = chronology.weekOfWeekyear();
            if (isSupported(weekOfWeekyear)) {
                this.weekOfWeekyear = weekOfWeekyear;
            }
            DateTimeField weekyear = chronology.weekyear();
            if (isSupported(weekyear)) {
                this.weekyear = weekyear;
            }
            DateTimeField weekyearOfCentury = chronology.weekyearOfCentury();
            if (isSupported(weekyearOfCentury)) {
                this.weekyearOfCentury = weekyearOfCentury;
            }
            DateTimeField monthOfYear = chronology.monthOfYear();
            if (isSupported(monthOfYear)) {
                this.monthOfYear = monthOfYear;
            }
            DateTimeField year = chronology.year();
            if (isSupported(year)) {
                this.year = year;
            }
            DateTimeField yearOfEra = chronology.yearOfEra();
            if (isSupported(yearOfEra)) {
                this.yearOfEra = yearOfEra;
            }
            DateTimeField yearOfCentury = chronology.yearOfCentury();
            if (isSupported(yearOfCentury)) {
                this.yearOfCentury = yearOfCentury;
            }
            DateTimeField centuryOfEra = chronology.centuryOfEra();
            if (isSupported(centuryOfEra)) {
                this.centuryOfEra = centuryOfEra;
            }
            DateTimeField era = chronology.era();
            if (isSupported(era)) {
                this.era = era;
            }
        }
    }

    public AssembledChronology(Chronology chronology, Object obj) {
        this.iBase = chronology;
        this.iParam = obj;
        setFields();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        setFields();
    }

    private void setFields() {
        Fields fields = new Fields();
        Chronology chronology = this.iBase;
        if (chronology != null) {
            fields.copyFieldsFrom(chronology);
        }
        assemble(fields);
        DurationField durationField = fields.millis;
        if (durationField == null) {
            durationField = super.millis();
        }
        this.iMillis = durationField;
        DurationField durationField2 = fields.seconds;
        if (durationField2 == null) {
            durationField2 = super.seconds();
        }
        this.iSeconds = durationField2;
        DurationField durationField3 = fields.minutes;
        if (durationField3 == null) {
            durationField3 = super.minutes();
        }
        this.iMinutes = durationField3;
        DurationField durationField4 = fields.hours;
        if (durationField4 == null) {
            durationField4 = super.hours();
        }
        this.iHours = durationField4;
        DurationField durationField5 = fields.halfdays;
        if (durationField5 == null) {
            durationField5 = super.halfdays();
        }
        this.iHalfdays = durationField5;
        DurationField durationField6 = fields.days;
        if (durationField6 == null) {
            durationField6 = super.days();
        }
        this.iDays = durationField6;
        DurationField durationField7 = fields.weeks;
        if (durationField7 == null) {
            durationField7 = super.weeks();
        }
        this.iWeeks = durationField7;
        DurationField durationField8 = fields.weekyears;
        if (durationField8 == null) {
            durationField8 = super.weekyears();
        }
        this.iWeekyears = durationField8;
        DurationField durationField9 = fields.months;
        if (durationField9 == null) {
            durationField9 = super.months();
        }
        this.iMonths = durationField9;
        DurationField durationField10 = fields.years;
        if (durationField10 == null) {
            durationField10 = super.years();
        }
        this.iYears = durationField10;
        DurationField durationField11 = fields.centuries;
        if (durationField11 == null) {
            durationField11 = super.centuries();
        }
        this.iCenturies = durationField11;
        DurationField durationField12 = fields.eras;
        if (durationField12 == null) {
            durationField12 = super.eras();
        }
        this.iEras = durationField12;
        DateTimeField dateTimeField = fields.millisOfSecond;
        if (dateTimeField == null) {
            dateTimeField = super.millisOfSecond();
        }
        this.iMillisOfSecond = dateTimeField;
        DateTimeField dateTimeField2 = fields.millisOfDay;
        if (dateTimeField2 == null) {
            dateTimeField2 = super.millisOfDay();
        }
        this.iMillisOfDay = dateTimeField2;
        DateTimeField dateTimeField3 = fields.secondOfMinute;
        if (dateTimeField3 == null) {
            dateTimeField3 = super.secondOfMinute();
        }
        this.iSecondOfMinute = dateTimeField3;
        DateTimeField dateTimeField4 = fields.secondOfDay;
        if (dateTimeField4 == null) {
            dateTimeField4 = super.secondOfDay();
        }
        this.iSecondOfDay = dateTimeField4;
        DateTimeField dateTimeField5 = fields.minuteOfHour;
        if (dateTimeField5 == null) {
            dateTimeField5 = super.minuteOfHour();
        }
        this.iMinuteOfHour = dateTimeField5;
        DateTimeField dateTimeField6 = fields.minuteOfDay;
        if (dateTimeField6 == null) {
            dateTimeField6 = super.minuteOfDay();
        }
        this.iMinuteOfDay = dateTimeField6;
        DateTimeField dateTimeField7 = fields.hourOfDay;
        if (dateTimeField7 == null) {
            dateTimeField7 = super.hourOfDay();
        }
        this.iHourOfDay = dateTimeField7;
        DateTimeField dateTimeField8 = fields.clockhourOfDay;
        if (dateTimeField8 == null) {
            dateTimeField8 = super.clockhourOfDay();
        }
        this.iClockhourOfDay = dateTimeField8;
        DateTimeField dateTimeField9 = fields.hourOfHalfday;
        if (dateTimeField9 == null) {
            dateTimeField9 = super.hourOfHalfday();
        }
        this.iHourOfHalfday = dateTimeField9;
        DateTimeField dateTimeField10 = fields.clockhourOfHalfday;
        if (dateTimeField10 == null) {
            dateTimeField10 = super.clockhourOfHalfday();
        }
        this.iClockhourOfHalfday = dateTimeField10;
        DateTimeField dateTimeField11 = fields.halfdayOfDay;
        if (dateTimeField11 == null) {
            dateTimeField11 = super.halfdayOfDay();
        }
        this.iHalfdayOfDay = dateTimeField11;
        DateTimeField dateTimeField12 = fields.dayOfWeek;
        if (dateTimeField12 == null) {
            dateTimeField12 = super.dayOfWeek();
        }
        this.iDayOfWeek = dateTimeField12;
        DateTimeField dateTimeField13 = fields.dayOfMonth;
        if (dateTimeField13 == null) {
            dateTimeField13 = super.dayOfMonth();
        }
        this.iDayOfMonth = dateTimeField13;
        DateTimeField dateTimeField14 = fields.dayOfYear;
        if (dateTimeField14 == null) {
            dateTimeField14 = super.dayOfYear();
        }
        this.iDayOfYear = dateTimeField14;
        DateTimeField dateTimeField15 = fields.weekOfWeekyear;
        if (dateTimeField15 == null) {
            dateTimeField15 = super.weekOfWeekyear();
        }
        this.iWeekOfWeekyear = dateTimeField15;
        DateTimeField dateTimeField16 = fields.weekyear;
        if (dateTimeField16 == null) {
            dateTimeField16 = super.weekyear();
        }
        this.iWeekyear = dateTimeField16;
        DateTimeField dateTimeField17 = fields.weekyearOfCentury;
        if (dateTimeField17 == null) {
            dateTimeField17 = super.weekyearOfCentury();
        }
        this.iWeekyearOfCentury = dateTimeField17;
        DateTimeField dateTimeField18 = fields.monthOfYear;
        if (dateTimeField18 == null) {
            dateTimeField18 = super.monthOfYear();
        }
        this.iMonthOfYear = dateTimeField18;
        DateTimeField dateTimeField19 = fields.year;
        if (dateTimeField19 == null) {
            dateTimeField19 = super.year();
        }
        this.iYear = dateTimeField19;
        DateTimeField dateTimeField20 = fields.yearOfEra;
        if (dateTimeField20 == null) {
            dateTimeField20 = super.yearOfEra();
        }
        this.iYearOfEra = dateTimeField20;
        DateTimeField dateTimeField21 = fields.yearOfCentury;
        if (dateTimeField21 == null) {
            dateTimeField21 = super.yearOfCentury();
        }
        this.iYearOfCentury = dateTimeField21;
        DateTimeField dateTimeField22 = fields.centuryOfEra;
        if (dateTimeField22 == null) {
            dateTimeField22 = super.centuryOfEra();
        }
        this.iCenturyOfEra = dateTimeField22;
        DateTimeField dateTimeField23 = fields.era;
        if (dateTimeField23 == null) {
            dateTimeField23 = super.era();
        }
        this.iEra = dateTimeField23;
        Chronology chronology2 = this.iBase;
        int i10 = 0;
        if (chronology2 != null) {
            int i11 = (this.iHourOfDay == chronology2.hourOfDay() && this.iMinuteOfHour == this.iBase.minuteOfHour() && this.iSecondOfMinute == this.iBase.secondOfMinute() && this.iMillisOfSecond == this.iBase.millisOfSecond()) ? 1 : 0;
            int i12 = this.iMillisOfDay == this.iBase.millisOfDay() ? 2 : 0;
            int i13 = 0;
            if (this.iYear == this.iBase.year()) {
                i13 = 0;
                if (this.iMonthOfYear == this.iBase.monthOfYear()) {
                    i13 = 0;
                    if (this.iDayOfMonth == this.iBase.dayOfMonth()) {
                        i13 = 4;
                    }
                }
            }
            i10 = i13 | i11 | i12;
        }
        this.iBaseFlags = i10;
    }

    public abstract void assemble(Fields fields);

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField centuries() {
        return this.iCenturies;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField centuryOfEra() {
        return this.iCenturyOfEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField clockhourOfDay() {
        return this.iClockhourOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField clockhourOfHalfday() {
        return this.iClockhourOfHalfday;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField dayOfMonth() {
        return this.iDayOfMonth;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField dayOfWeek() {
        return this.iDayOfWeek;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField dayOfYear() {
        return this.iDayOfYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField days() {
        return this.iDays;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField era() {
        return this.iEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField eras() {
        return this.iEras;
    }

    public final Chronology getBase() {
        return this.iBase;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) {
        Chronology chronology = this.iBase;
        return (chronology == null || (this.iBaseFlags & 6) != 6) ? super.getDateTimeMillis(i10, i11, i12, i13) : chronology.getDateTimeMillis(i10, i11, i12, i13);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        Chronology chronology = this.iBase;
        return (chronology == null || (this.iBaseFlags & 5) != 5) ? super.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16) : chronology.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j10, int i10, int i11, int i12, int i13) {
        Chronology chronology = this.iBase;
        return (chronology == null || (this.iBaseFlags & 1) != 1) ? super.getDateTimeMillis(j10, i10, i11, i12, i13) : chronology.getDateTimeMillis(j10, i10, i11, i12, i13);
    }

    public final Object getParam() {
        return this.iParam;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology chronology = this.iBase;
        if (chronology != null) {
            return chronology.getZone();
        }
        return null;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField halfdayOfDay() {
        return this.iHalfdayOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField halfdays() {
        return this.iHalfdays;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField hourOfDay() {
        return this.iHourOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField hourOfHalfday() {
        return this.iHourOfHalfday;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField hours() {
        return this.iHours;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField millis() {
        return this.iMillis;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField millisOfDay() {
        return this.iMillisOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField millisOfSecond() {
        return this.iMillisOfSecond;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField minuteOfDay() {
        return this.iMinuteOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField minuteOfHour() {
        return this.iMinuteOfHour;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField minutes() {
        return this.iMinutes;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField monthOfYear() {
        return this.iMonthOfYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField months() {
        return this.iMonths;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField secondOfDay() {
        return this.iSecondOfDay;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField secondOfMinute() {
        return this.iSecondOfMinute;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField seconds() {
        return this.iSeconds;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField weekOfWeekyear() {
        return this.iWeekOfWeekyear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField weeks() {
        return this.iWeeks;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField weekyear() {
        return this.iWeekyear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField weekyearOfCentury() {
        return this.iWeekyearOfCentury;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField weekyears() {
        return this.iWeekyears;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField year() {
        return this.iYear;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField yearOfCentury() {
        return this.iYearOfCentury;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DateTimeField yearOfEra() {
        return this.iYearOfEra;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public final DurationField years() {
        return this.iYears;
    }
}
