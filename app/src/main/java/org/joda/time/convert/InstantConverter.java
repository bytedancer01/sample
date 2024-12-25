package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/InstantConverter.class */
public interface InstantConverter extends Converter {
    Chronology getChronology(Object obj, Chronology chronology);

    Chronology getChronology(Object obj, DateTimeZone dateTimeZone);

    long getInstantMillis(Object obj, Chronology chronology);
}
