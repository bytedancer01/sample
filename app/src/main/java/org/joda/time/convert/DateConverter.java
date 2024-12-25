package org.joda.time.convert;

import java.util.Date;
import org.joda.time.Chronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/DateConverter.class */
final class DateConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    public static final DateConverter INSTANCE = new DateConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Date) obj).getTime();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return Date.class;
    }
}
