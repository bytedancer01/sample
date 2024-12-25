package org.joda.time;

import java.util.Locale;

/* loaded from: combined.jar:classes3.jar:org/joda/time/ReadableDateTime.class */
public interface ReadableDateTime extends ReadableInstant {
    int getCenturyOfEra();

    int getDayOfMonth();

    int getDayOfWeek();

    int getDayOfYear();

    int getEra();

    int getHourOfDay();

    int getMillisOfDay();

    int getMillisOfSecond();

    int getMinuteOfDay();

    int getMinuteOfHour();

    int getMonthOfYear();

    int getSecondOfDay();

    int getSecondOfMinute();

    int getWeekOfWeekyear();

    int getWeekyear();

    int getYear();

    int getYearOfCentury();

    int getYearOfEra();

    DateTime toDateTime();

    MutableDateTime toMutableDateTime();

    String toString(String str);

    String toString(String str, Locale locale);
}
