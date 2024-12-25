package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* loaded from: combined.jar:classes3.jar:org/joda/time/convert/StringConverter.class */
class StringConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    public static final StringConverter INSTANCE = new StringConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        long parseLong;
        long j10;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i10 = length - 1;
            if (str.charAt(i10) == 'S' || str.charAt(i10) == 's') {
                String substring = str.substring(2, i10);
                int i11 = 0;
                int i12 = -1;
                for (int i13 = 0; i13 < substring.length(); i13++) {
                    if (substring.charAt(i13) < '0' || substring.charAt(i13) > '9') {
                        if (i13 == 0 && substring.charAt(0) == '-') {
                            i11 = 1;
                        } else {
                            if (i13 <= i11 || substring.charAt(i13) != '.' || i12 != -1) {
                                throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
                            }
                            i12 = i13;
                        }
                    }
                }
                if (i12 > 0) {
                    parseLong = Long.parseLong(substring.substring(i11, i12));
                    String substring2 = substring.substring(i12 + 1);
                    String str2 = substring2;
                    if (substring2.length() != 3) {
                        str2 = (substring2 + "000").substring(0, 3);
                    }
                    j10 = Integer.parseInt(str2);
                } else {
                    parseLong = i11 != 0 ? Long.parseLong(substring.substring(i11, substring.length())) : Long.parseLong(substring);
                    j10 = 0;
                }
                return i11 != 0 ? FieldUtils.safeAdd(FieldUtils.safeMultiply(-parseLong, 1000), -j10) : FieldUtils.safeAdd(FieldUtils.safeMultiply(parseLong, 1000), j10);
            }
        }
        throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis((String) obj);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        Chronology chronology2 = chronology;
        if (dateTimeFormatter.getZone() != null) {
            chronology2 = chronology.withZone(dateTimeFormatter.getZone());
        }
        return chronology2.get(readablePartial, dateTimeFormatter.withChronology(chronology2).parseMillis((String) obj));
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return String.class;
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        Period parsePeriod;
        long add;
        Chronology chronology2;
        String str = (String) obj;
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }
        String substring = str.substring(0, indexOf);
        if (substring.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        DateTimeFormatter withChronology = ISODateTimeFormat.dateTimeParser().withChronology(chronology);
        PeriodFormatter standard = ISOPeriodFormat.standard();
        long j10 = 0;
        char charAt = substring.charAt(0);
        Chronology chronology3 = null;
        if (charAt == 'P' || charAt == 'p') {
            parsePeriod = standard.withParseType(getPeriodType(substring)).parsePeriod(substring);
        } else {
            DateTime parseDateTime = withChronology.parseDateTime(substring);
            j10 = parseDateTime.getMillis();
            chronology3 = parseDateTime.getChronology();
            parsePeriod = null;
        }
        char charAt2 = substring2.charAt(0);
        if (charAt2 != 'P' && charAt2 != 'p') {
            DateTime parseDateTime2 = withChronology.parseDateTime(substring2);
            long millis = parseDateTime2.getMillis();
            if (chronology3 == null) {
                chronology3 = parseDateTime2.getChronology();
            }
            if (chronology != null) {
                chronology3 = chronology;
            }
            add = millis;
            chronology2 = chronology3;
            if (parsePeriod != null) {
                j10 = chronology3.add(parsePeriod, millis, -1);
                add = millis;
                chronology2 = chronology3;
            }
        } else {
            if (parsePeriod != null) {
                throw new IllegalArgumentException("Interval composed of two durations: " + str);
            }
            Period parsePeriod2 = standard.withParseType(getPeriodType(substring2)).parsePeriod(substring2);
            if (chronology != null) {
                chronology3 = chronology;
            }
            add = chronology3.add(parsePeriod2, j10, 1);
            chronology2 = chronology3;
        }
        readWritableInterval.setInterval(j10, add);
        readWritableInterval.setChronology(chronology2);
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        String str = (String) obj;
        PeriodFormatter standard = ISOPeriodFormat.standard();
        readWritablePeriod.clear();
        int parseInto = standard.parseInto(readWritablePeriod, str, 0);
        if (parseInto < str.length()) {
            if (parseInto < 0) {
                standard.withParseType(readWritablePeriod.getPeriodType()).parseMutablePeriod(str);
            }
            throw new IllegalArgumentException("Invalid format: \"" + str + '\"');
        }
    }
}
