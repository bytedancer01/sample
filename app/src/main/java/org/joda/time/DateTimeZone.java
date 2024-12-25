package org.joda.time;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.p258tz.DefaultNameProvider;
import org.joda.time.p258tz.FixedDateTimeZone;
import org.joda.time.p258tz.NameProvider;
import org.joda.time.p258tz.Provider;
import org.joda.time.p258tz.UTCProvider;
import org.joda.time.p258tz.ZoneInfoProvider;
import org.slf4j.Marker;
import p383w9.C9436a3;

/* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeZone.class */
public abstract class DateTimeZone implements Serializable {
    private static final int MAX_MILLIS = 86399999;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    /* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeZone$LazyInit.class */
    public static final class LazyInit {
        public static final Map<String, String> CONVERSION_MAP = buildMap();
        public static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.LazyInit.1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public DateTimeZone getZone() {
                    return null;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public String toString() {
                    return getClass().getName();
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withUTC() {
                    return this;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("GMT", "UTC");
            hashMap.put("WET", "WET");
            hashMap.put("CET", "CET");
            hashMap.put("MET", "CET");
            hashMap.put("ECT", "CET");
            hashMap.put("EET", "EET");
            hashMap.put("MIT", "Pacific/Apia");
            hashMap.put("HST", "Pacific/Honolulu");
            hashMap.put("AST", "America/Anchorage");
            hashMap.put("PST", "America/Los_Angeles");
            hashMap.put("MST", "America/Denver");
            hashMap.put("PNT", "America/Phoenix");
            hashMap.put("CST", "America/Chicago");
            hashMap.put("EST", "America/New_York");
            hashMap.put("IET", "America/Indiana/Indianapolis");
            hashMap.put("PRT", "America/Puerto_Rico");
            hashMap.put("CNT", "America/St_Johns");
            hashMap.put("AGT", "America/Argentina/Buenos_Aires");
            hashMap.put("BET", "America/Sao_Paulo");
            hashMap.put("ART", "Africa/Cairo");
            hashMap.put("CAT", "Africa/Harare");
            hashMap.put("EAT", "Africa/Addis_Ababa");
            hashMap.put("NET", "Asia/Yerevan");
            hashMap.put("PLT", "Asia/Karachi");
            hashMap.put("IST", "Asia/Kolkata");
            hashMap.put("BST", "Asia/Dhaka");
            hashMap.put("VST", "Asia/Ho_Chi_Minh");
            hashMap.put("CTT", "Asia/Shanghai");
            hashMap.put("JST", "Asia/Tokyo");
            hashMap.put("ACT", "Australia/Darwin");
            hashMap.put("AET", "Australia/Sydney");
            hashMap.put("SST", "Pacific/Guadalcanal");
            hashMap.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeZone$Stub.class */
    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        public Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    public DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    private static DateTimeZone fixedOffsetZone(String str, int i10) {
        return i10 == 0 ? UTC : new FixedDateTimeZone(str, null, i10, i10);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith("-")) {
            int parseOffset = parseOffset(str);
            return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
        throw new IllegalArgumentException("The datetime zone id '" + str + "' is not recognised");
    }

    public static DateTimeZone forOffsetHours(int i10) {
        return forOffsetHoursMinutes(i10, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i10, int i11) {
        int abs;
        if (i10 == 0 && i11 == 0) {
            return UTC;
        }
        if (i10 < -23 || i10 > 23) {
            throw new IllegalArgumentException("Hours out of range: " + i10);
        }
        if (i11 < -59 || i11 > 59) {
            throw new IllegalArgumentException("Minutes out of range: " + i11);
        }
        if (i10 > 0 && i11 < 0) {
            throw new IllegalArgumentException("Positive hours must not have negative minutes: " + i11);
        }
        int i12 = i10 * 60;
        if (i12 < 0) {
            try {
                abs = i12 - Math.abs(i11);
            } catch (ArithmeticException e10) {
                throw new IllegalArgumentException("Offset is too large");
            }
        } else {
            abs = i12 + i11;
        }
        return forOffsetMillis(FieldUtils.safeMultiply(abs, DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static DateTimeZone forOffsetMillis(int i10) {
        if (i10 >= -86399999 && i10 <= MAX_MILLIS) {
            return fixedOffsetZone(printOffset(i10), i10);
        }
        throw new IllegalArgumentException("Millis out of range: " + i10);
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            return getDefault();
        }
        String id2 = timeZone.getID();
        if (id2 == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        if (id2.equals("UTC")) {
            return UTC;
        }
        DateTimeZone dateTimeZone = null;
        String convertedId = getConvertedId(id2);
        Provider provider = getProvider();
        if (convertedId != null) {
            dateTimeZone = provider.getZone(convertedId);
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = provider.getZone(id2);
        }
        if (dateTimeZone2 != null) {
            return dateTimeZone2;
        }
        if (convertedId == null && (id2.startsWith("GMT+") || id2.startsWith("GMT-"))) {
            int parseOffset = parseOffset(id2.substring(3));
            return ((long) parseOffset) == 0 ? UTC : fixedOffsetZone(printOffset(parseOffset), parseOffset);
        }
        throw new IllegalArgumentException("The datetime zone id '" + id2 + "' is not recognised");
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZone;
        DateTimeZone dateTimeZone2 = cDefault.get();
        DateTimeZone dateTimeZone3 = dateTimeZone2;
        if (dateTimeZone2 == null) {
            try {
                String property = System.getProperty("user.timezone");
                dateTimeZone = dateTimeZone2;
                if (property != null) {
                    dateTimeZone = forID(property);
                }
            } catch (RuntimeException e10) {
                dateTimeZone = dateTimeZone2;
            }
            DateTimeZone dateTimeZone4 = dateTimeZone;
            if (dateTimeZone == null) {
                try {
                    dateTimeZone4 = forTimeZone(TimeZone.getDefault());
                } catch (IllegalArgumentException e11) {
                    dateTimeZone4 = dateTimeZone;
                }
            }
            DateTimeZone dateTimeZone5 = dateTimeZone4;
            if (dateTimeZone4 == null) {
                dateTimeZone5 = UTC;
            }
            AtomicReference<DateTimeZone> atomicReference = cDefault;
            dateTimeZone3 = dateTimeZone5;
            if (!C9436a3.m39798a(atomicReference, null, dateTimeZone5)) {
                dateTimeZone3 = atomicReference.get();
            }
        }
        return dateTimeZone3;
    }

    private static NameProvider getDefaultNameProvider() {
        NameProvider nameProvider;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            nameProvider = null;
            if (property != null) {
                try {
                    nameProvider = (NameProvider) Class.forName(property).newInstance();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (SecurityException e11) {
            nameProvider = null;
        }
        NameProvider nameProvider2 = nameProvider;
        if (nameProvider == null) {
            nameProvider2 = new DefaultNameProvider();
        }
        return nameProvider2;
    }

    private static Provider getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    return validateProvider((Provider) Class.forName(property).newInstance());
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        } catch (SecurityException e11) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new ZoneInfoProvider(new File(property2)));
                } catch (Exception e12) {
                    throw new RuntimeException(e12);
                }
            }
        } catch (SecurityException e13) {
        }
        try {
            return validateProvider(new ZoneInfoProvider("org/joda/time/tz/data"));
        } catch (Exception e14) {
            e14.printStackTrace();
            return new UTCProvider();
        }
    }

    public static NameProvider getNameProvider() {
        AtomicReference<NameProvider> atomicReference = cNameProvider;
        NameProvider nameProvider = atomicReference.get();
        NameProvider nameProvider2 = nameProvider;
        if (nameProvider == null) {
            NameProvider defaultNameProvider = getDefaultNameProvider();
            nameProvider2 = defaultNameProvider;
            if (!C9436a3.m39798a(atomicReference, null, defaultNameProvider)) {
                nameProvider2 = atomicReference.get();
            }
        }
        return nameProvider2;
    }

    public static Provider getProvider() {
        AtomicReference<Provider> atomicReference = cProvider;
        Provider provider = atomicReference.get();
        Provider provider2 = provider;
        if (provider == null) {
            Provider defaultProvider = getDefaultProvider();
            provider2 = defaultProvider;
            if (!C9436a3.m39798a(atomicReference, null, defaultProvider)) {
                provider2 = atomicReference.get();
            }
        }
        return provider2;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i10 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i10 = -i10;
        }
        int i11 = i10 / DateTimeConstants.MILLIS_PER_HOUR;
        FormatUtils.appendPaddedInteger(stringBuffer, i11, 2);
        int i12 = i10 - (i11 * DateTimeConstants.MILLIS_PER_HOUR);
        int i13 = i12 / DateTimeConstants.MILLIS_PER_MINUTE;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i13, 2);
        int i14 = i12 - (i13 * DateTimeConstants.MILLIS_PER_MINUTE);
        if (i14 == 0) {
            return stringBuffer.toString();
        }
        int i15 = i14 / 1000;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i15, 2);
        int i16 = i14 - (i15 * 1000);
        if (i16 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i16, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        cDefault.set(dateTimeZone);
    }

    public static void setNameProvider(NameProvider nameProvider) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        NameProvider nameProvider2 = nameProvider;
        if (nameProvider == null) {
            nameProvider2 = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider2);
    }

    public static void setProvider(Provider provider) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!availableIDs.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (UTC.equals(provider.getZone("UTC"))) {
            return provider;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }

    public long adjustOffset(long j10, boolean z10) {
        long j11 = j10 - 10800000;
        long offset = getOffset(j11);
        long offset2 = getOffset(10800000 + j10);
        if (offset <= offset2) {
            return j10;
        }
        long j12 = offset - offset2;
        long nextTransition = nextTransition(j11);
        long j13 = nextTransition - j12;
        long j14 = j10;
        if (j10 >= j13) {
            if (j10 >= nextTransition + j12) {
                j14 = j10;
            } else {
                if (j10 - j13 >= j12) {
                    if (!z10) {
                        j10 -= j12;
                    }
                    return j10;
                }
                j14 = j10;
                if (z10) {
                    j14 = j10 + j12;
                }
            }
        }
        return j14;
    }

    public long convertLocalToUTC(long j10, boolean z10) {
        int offset = getOffset(j10);
        long j11 = j10 - offset;
        int offset2 = getOffset(j11);
        if (offset != offset2 && (z10 || offset < 0)) {
            long nextTransition = nextTransition(j11);
            long j12 = Long.MAX_VALUE;
            long j13 = nextTransition;
            if (nextTransition == j11) {
                j13 = Long.MAX_VALUE;
            }
            long j14 = j10 - offset2;
            long nextTransition2 = nextTransition(j14);
            if (nextTransition2 != j14) {
                j12 = nextTransition2;
            }
            if (j13 != j12) {
                if (z10) {
                    throw new IllegalInstantException(j10, getID());
                }
                offset2 = offset;
            }
        }
        long j15 = offset2;
        long j16 = j10 - j15;
        if ((j10 ^ j16) >= 0 || (j10 ^ j15) >= 0) {
            return j16;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    public long convertLocalToUTC(long j10, boolean z10, long j11) {
        int offset = getOffset(j11);
        long j12 = j10 - offset;
        return getOffset(j12) == offset ? j12 : convertLocalToUTC(j10, z10);
    }

    public long convertUTCToLocal(long j10) {
        long offset = getOffset(j10);
        long j11 = j10 + offset;
        if ((j10 ^ j11) >= 0 || (j10 ^ offset) < 0) {
            return j11;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j10) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = getDefault();
        }
        return dateTimeZone2 == this ? j10 : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j10), false, j10);
    }

    public final String getName(long j10) {
        return getName(j10, null);
    }

    public String getName(long j10, Locale locale) {
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        String nameKey = getNameKey(j10);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String name = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getName(locale2, this.iID, nameKey, isStandardOffset(j10)) : nameProvider.getName(locale2, this.iID, nameKey);
        return name != null ? name : printOffset(getOffset(j10));
    }

    public abstract String getNameKey(long j10);

    public abstract int getOffset(long j10);

    public final int getOffset(ReadableInstant readableInstant) {
        return getOffset(readableInstant == null ? DateTimeUtils.currentTimeMillis() : readableInstant.getMillis());
    }

    public int getOffsetFromLocal(long j10) {
        int offset = getOffset(j10);
        long j11 = j10 - offset;
        int offset2 = getOffset(j11);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long nextTransition = nextTransition(j11);
                long j12 = nextTransition;
                if (nextTransition == j11) {
                    j12 = Long.MAX_VALUE;
                }
                long j13 = j10 - offset2;
                long nextTransition2 = nextTransition(j13);
                if (nextTransition2 == j13) {
                    nextTransition2 = Long.MAX_VALUE;
                }
                if (j12 != nextTransition2) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long previousTransition = previousTransition(j11);
            if (previousTransition < j11) {
                int offset3 = getOffset(previousTransition);
                if (j11 - previousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public final String getShortName(long j10) {
        return getShortName(j10, null);
    }

    public String getShortName(long j10, Locale locale) {
        Locale locale2 = locale;
        if (locale == null) {
            locale2 = Locale.getDefault();
        }
        String nameKey = getNameKey(j10);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String shortName = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getShortName(locale2, this.iID, nameKey, isStandardOffset(j10)) : nameProvider.getShortName(locale2, this.iID, nameKey);
        return shortName != null ? shortName : printOffset(getOffset(j10));
    }

    public abstract int getStandardOffset(long j10);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException e10) {
            return true;
        }
    }

    public boolean isStandardOffset(long j10) {
        return getOffset(j10) == getStandardOffset(j10);
    }

    public abstract long nextTransition(long j10);

    public abstract long previousTransition(long j10);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public Object writeReplace() {
        return new Stub(this.iID);
    }
}
