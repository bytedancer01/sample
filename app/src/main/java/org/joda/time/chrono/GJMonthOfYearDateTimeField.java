package org.joda.time.chrono;

import java.util.Locale;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJMonthOfYearDateTimeField.class */
final class GJMonthOfYearDateTimeField extends BasicMonthOfYearDateTimeField {
    private static final long serialVersionUID = -4748157875845286249L;

    public GJMonthOfYearDateTimeField(BasicChronology basicChronology) {
        super(basicChronology, 2);
    }

    @Override // org.joda.time.field.BaseDateTimeField
    public int convertText(String str, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).monthOfYearTextToValue(str);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsShortText(int i10, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).monthOfYearValueToShortText(i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public String getAsText(int i10, Locale locale) {
        return GJLocaleSymbols.forLocale(locale).monthOfYearValueToText(i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getMonthMaxShortTextLength();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return GJLocaleSymbols.forLocale(locale).getMonthMaxTextLength();
    }
}
