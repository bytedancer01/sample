package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/NullConverter.class */
class NullConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    public static final NullConverter INSTANCE = new NullConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return 0L;
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return null;
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        readWritableInterval.setChronology(chronology);
        long currentTimeMillis = DateTimeUtils.currentTimeMillis();
        readWritableInterval.setInterval(currentTimeMillis, currentTimeMillis);
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        readWritablePeriod.setPeriod((ReadablePeriod) null);
    }
}
