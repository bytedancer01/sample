package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.PreciseDurationDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJDayOfWeekDateTimeField.class */
final class GJDayOfWeekDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -3857947176719041436L;
    private final BasicChronology iChronology;

    public GJDayOfWeekDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfWeek(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfWeek();
    }

    @Override // org.joda.time.field.BaseDateTimeField
    public int convertText(String str, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekTextToValue(str);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        return this.iChronology.getDayOfWeek(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsShortText(int i10, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToShortText(i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsText(int i10, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).dayOfWeekValueToText(i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxShortTextLength();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getDayOfWeekMaxTextLength();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return 7;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.weeks();
    }
}
