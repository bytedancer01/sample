package org.joda.time.convert;

import org.joda.time.Chronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/LongConverter.class */
class LongConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter {
    public static final LongConverter INSTANCE = new LongConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Long) obj).longValue();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return Long.class;
    }
}
