package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.StrictDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/StrictChronology.class */
public final class StrictChronology extends AssembledChronology {
    private static final long serialVersionUID = 6633006628097111960L;
    private transient Chronology iWithUTC;

    private StrictChronology(Chronology chronology) {
        super(chronology, null);
    }

    private static final DateTimeField convertField(DateTimeField dateTimeField) {
        return StrictDateTimeField.getInstance(dateTimeField);
    }

    public static StrictChronology getInstance(Chronology chronology) {
        if (chronology != null) {
            return new StrictChronology(chronology);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        fields.year = convertField(fields.year);
        fields.yearOfEra = convertField(fields.yearOfEra);
        fields.yearOfCentury = convertField(fields.yearOfCentury);
        fields.centuryOfEra = convertField(fields.centuryOfEra);
        fields.era = convertField(fields.era);
        fields.dayOfWeek = convertField(fields.dayOfWeek);
        fields.dayOfMonth = convertField(fields.dayOfMonth);
        fields.dayOfYear = convertField(fields.dayOfYear);
        fields.monthOfYear = convertField(fields.monthOfYear);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear);
        fields.weekyear = convertField(fields.weekyear);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury);
        fields.millisOfSecond = convertField(fields.millisOfSecond);
        fields.millisOfDay = convertField(fields.millisOfDay);
        fields.secondOfMinute = convertField(fields.secondOfMinute);
        fields.secondOfDay = convertField(fields.secondOfDay);
        fields.minuteOfHour = convertField(fields.minuteOfHour);
        fields.minuteOfDay = convertField(fields.minuteOfDay);
        fields.hourOfDay = convertField(fields.hourOfDay);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StrictChronology) {
            return getBase().equals(((StrictChronology) obj).getBase());
        }
        return false;
    }

    public int hashCode() {
        return (getBase().hashCode() * 7) + 352831696;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        return "StrictChronology[" + getBase().toString() + ']';
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        if (this.iWithUTC == null) {
            if (getZone() == DateTimeZone.UTC) {
                this.iWithUTC = this;
            } else {
                this.iWithUTC = getInstance(getBase().withUTC());
            }
        }
        return this.iWithUTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == DateTimeZone.UTC ? withUTC() : dateTimeZone2 == getZone() ? this : getInstance(getBase().withZone(dateTimeZone2));
    }
}
