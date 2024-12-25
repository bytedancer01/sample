package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/ReadableInstantConverter.class */
class ReadableInstantConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    public static final ReadableInstantConverter INSTANCE = new ReadableInstantConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, Chronology chronology) {
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = DateTimeUtils.getChronology(((ReadableInstant) obj).getChronology());
        }
        return chronology2;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter, org.joda.time.convert.PartialConverter
    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        Chronology chronology = ((ReadableInstant) obj).getChronology();
        if (chronology == null) {
            return ISOChronology.getInstance(dateTimeZone);
        }
        Chronology chronology2 = chronology;
        if (chronology.getZone() != dateTimeZone) {
            Chronology withZone = chronology.withZone(dateTimeZone);
            chronology2 = withZone;
            if (withZone == null) {
                chronology2 = ISOChronology.getInstance(dateTimeZone);
            }
        }
        return chronology2;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((ReadableInstant) obj).getMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadableInstant.class;
    }
}
