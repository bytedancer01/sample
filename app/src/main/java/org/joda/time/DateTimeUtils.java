package org.joda.time;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;
import p383w9.C9436a3;

/* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeUtils.class */
public class DateTimeUtils {
    private static final SystemMillisProvider SYSTEM_MILLIS_PROVIDER;
    private static volatile MillisProvider cMillisProvider;
    private static final AtomicReference<Map<String, DateTimeZone>> cZoneNames;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeUtils$FixedMillisProvider.class */
    public static class FixedMillisProvider implements MillisProvider {
        private final long iMillis;

        public FixedMillisProvider(long j10) {
            this.iMillis = j10;
        }

        @Override // org.joda.time.DateTimeUtils.MillisProvider
        public long getMillis() {
            return this.iMillis;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeUtils$MillisProvider.class */
    public interface MillisProvider {
        long getMillis();
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeUtils$OffsetMillisProvider.class */
    public static class OffsetMillisProvider implements MillisProvider {
        private final long iMillis;

        public OffsetMillisProvider(long j10) {
            this.iMillis = j10;
        }

        @Override // org.joda.time.DateTimeUtils.MillisProvider
        public long getMillis() {
            return System.currentTimeMillis() + this.iMillis;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeUtils$SystemMillisProvider.class */
    public static class SystemMillisProvider implements MillisProvider {
        @Override // org.joda.time.DateTimeUtils.MillisProvider
        public long getMillis() {
            return System.currentTimeMillis();
        }
    }

    static {
        SystemMillisProvider systemMillisProvider = new SystemMillisProvider();
        SYSTEM_MILLIS_PROVIDER = systemMillisProvider;
        cMillisProvider = systemMillisProvider;
        cZoneNames = new AtomicReference<>();
    }

    private static Map<String, DateTimeZone> buildDefaultTimeZoneNames() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        linkedHashMap.put("UT", dateTimeZone);
        linkedHashMap.put("UTC", dateTimeZone);
        linkedHashMap.put("GMT", dateTimeZone);
        put(linkedHashMap, "EST", "America/New_York");
        put(linkedHashMap, "EDT", "America/New_York");
        put(linkedHashMap, "CST", "America/Chicago");
        put(linkedHashMap, "CDT", "America/Chicago");
        put(linkedHashMap, "MST", "America/Denver");
        put(linkedHashMap, "MDT", "America/Denver");
        put(linkedHashMap, "PST", "America/Los_Angeles");
        put(linkedHashMap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static void checkPermission() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("CurrentTime.setProvider"));
        }
    }

    public static final long currentTimeMillis() {
        return cMillisProvider.getMillis();
    }

    public static final long fromJulianDay(double d10) {
        return (long) ((d10 - 2440587.5d) * 8.64E7d);
    }

    public static final Chronology getChronology(Chronology chronology) {
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final DateFormatSymbols getDateFormatSymbols(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception e10) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final Map<String, DateTimeZone> getDefaultTimeZoneNames() {
        AtomicReference<Map<String, DateTimeZone>> atomicReference = cZoneNames;
        Map<String, DateTimeZone> map = atomicReference.get();
        Map<String, DateTimeZone> map2 = map;
        if (map == null) {
            Map<String, DateTimeZone> buildDefaultTimeZoneNames = buildDefaultTimeZoneNames();
            map2 = buildDefaultTimeZoneNames;
            if (!C9436a3.m39798a(atomicReference, null, buildDefaultTimeZoneNames)) {
                map2 = atomicReference.get();
            }
        }
        return map2;
    }

    public static final long getDurationMillis(ReadableDuration readableDuration) {
        if (readableDuration == null) {
            return 0L;
        }
        return readableDuration.getMillis();
    }

    public static final Chronology getInstantChronology(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInstant.getChronology();
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final long getInstantMillis(ReadableInstant readableInstant) {
        return readableInstant == null ? currentTimeMillis() : readableInstant.getMillis();
    }

    public static final Chronology getIntervalChronology(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        Chronology chronology = readableInstant != null ? readableInstant.getChronology() : readableInstant2 != null ? readableInstant2.getChronology() : null;
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final Chronology getIntervalChronology(ReadableInterval readableInterval) {
        if (readableInterval == null) {
            return ISOChronology.getInstance();
        }
        Chronology chronology = readableInterval.getChronology();
        Chronology chronology2 = chronology;
        if (chronology == null) {
            chronology2 = ISOChronology.getInstance();
        }
        return chronology2;
    }

    public static final PeriodType getPeriodType(PeriodType periodType) {
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = PeriodType.standard();
        }
        return periodType2;
    }

    public static final ReadableInterval getReadableInterval(ReadableInterval readableInterval) {
        ReadableInterval readableInterval2 = readableInterval;
        if (readableInterval == null) {
            long currentTimeMillis = currentTimeMillis();
            readableInterval2 = new Interval(currentTimeMillis, currentTimeMillis);
        }
        return readableInterval2;
    }

    public static final DateTimeZone getZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2;
    }

    public static final boolean isContiguous(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("Partial must not be null");
        }
        DurationFieldType durationFieldType = null;
        for (int i10 = 0; i10 < readablePartial.size(); i10++) {
            DateTimeField field = readablePartial.getField(i10);
            if (i10 > 0 && (field.getRangeDurationField() == null || field.getRangeDurationField().getType() != durationFieldType)) {
                return false;
            }
            durationFieldType = field.getDurationField().getType();
        }
        return true;
    }

    private static void put(Map<String, DateTimeZone> map, String str, String str2) {
        try {
            map.put(str, DateTimeZone.forID(str2));
        } catch (RuntimeException e10) {
        }
    }

    public static final void setCurrentMillisFixed(long j10) {
        checkPermission();
        cMillisProvider = new FixedMillisProvider(j10);
    }

    public static final void setCurrentMillisOffset(long j10) {
        checkPermission();
        if (j10 == 0) {
            cMillisProvider = SYSTEM_MILLIS_PROVIDER;
        } else {
            cMillisProvider = new OffsetMillisProvider(j10);
        }
    }

    public static final void setCurrentMillisProvider(MillisProvider millisProvider) {
        if (millisProvider == null) {
            throw new IllegalArgumentException("The MillisProvider must not be null");
        }
        checkPermission();
        cMillisProvider = millisProvider;
    }

    public static final void setCurrentMillisSystem() {
        checkPermission();
        cMillisProvider = SYSTEM_MILLIS_PROVIDER;
    }

    public static final void setDefaultTimeZoneNames(Map<String, DateTimeZone> map) {
        cZoneNames.set(Collections.unmodifiableMap(new HashMap(map)));
    }

    public static final double toJulianDay(long j10) {
        return (j10 / 8.64E7d) + 2440587.5d;
    }

    public static final long toJulianDayNumber(long j10) {
        return (long) Math.floor(toJulianDay(j10) + 0.5d);
    }
}
