package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInterval;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/ReadableIntervalConverter.class */
class ReadableIntervalConverter extends AbstractConverter implements IntervalConverter, DurationConverter, PeriodConverter {
    public static final ReadableIntervalConverter INSTANCE = new ReadableIntervalConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        return ((ReadableInterval) obj).toDurationMillis();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return ReadableInterval.class;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.IntervalConverter
    public boolean isReadableInterval(Object obj, Chronology chronology) {
        return true;
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        ReadableInterval readableInterval = (ReadableInterval) obj;
        readWritableInterval.setInterval(readableInterval);
        if (chronology != null) {
            readWritableInterval.setChronology(chronology);
        } else {
            readWritableInterval.setChronology(readableInterval.getChronology());
        }
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        ReadableInterval readableInterval = (ReadableInterval) obj;
        if (chronology == null) {
            chronology = DateTimeUtils.getIntervalChronology(readableInterval);
        }
        int[] iArr = chronology.get(readWritablePeriod, readableInterval.getStartMillis(), readableInterval.getEndMillis());
        for (int i10 = 0; i10 < iArr.length; i10++) {
            readWritablePeriod.setValue(i10, iArr[i10]);
        }
    }
}
