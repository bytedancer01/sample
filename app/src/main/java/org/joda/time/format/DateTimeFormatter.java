package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatter.class */
public class DateTimeFormatter {
    private final Chronology iChrono;
    private final int iDefaultYear;
    private final Locale iLocale;
    private final boolean iOffsetParsed;
    private final InternalParser iParser;
    private final Integer iPivotYear;
    private final InternalPrinter iPrinter;
    private final DateTimeZone iZone;

    public DateTimeFormatter(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        this(DateTimePrinterInternalPrinter.m32149of(dateTimePrinter), DateTimeParserInternalParser.m32148of(dateTimeParser));
    }

    public DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = null;
        this.iOffsetParsed = false;
        this.iChrono = null;
        this.iZone = null;
        this.iPivotYear = null;
        this.iDefaultYear = 2000;
    }

    private DateTimeFormatter(InternalPrinter internalPrinter, InternalParser internalParser, Locale locale, boolean z10, Chronology chronology, DateTimeZone dateTimeZone, Integer num, int i10) {
        this.iPrinter = internalPrinter;
        this.iParser = internalParser;
        this.iLocale = locale;
        this.iOffsetParsed = z10;
        this.iChrono = chronology;
        this.iZone = dateTimeZone;
        this.iPivotYear = num;
        this.iDefaultYear = i10;
    }

    private void printTo(Appendable appendable, long j10, Chronology chronology) {
        InternalPrinter requirePrinter = requirePrinter();
        Chronology selectChronology = selectChronology(chronology);
        DateTimeZone zone = selectChronology.getZone();
        int offset = zone.getOffset(j10);
        long j11 = offset;
        long j12 = j10 + j11;
        DateTimeZone dateTimeZone = zone;
        int i10 = offset;
        long j13 = j12;
        if ((j10 ^ j12) < 0) {
            dateTimeZone = zone;
            i10 = offset;
            j13 = j12;
            if ((j11 ^ j10) >= 0) {
                dateTimeZone = DateTimeZone.UTC;
                i10 = 0;
                j13 = j10;
            }
        }
        requirePrinter.printTo(appendable, j13, selectChronology.withUTC(), i10, dateTimeZone, this.iLocale);
    }

    private InternalParser requireParser() {
        InternalParser internalParser = this.iParser;
        if (internalParser != null) {
            return internalParser;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private InternalPrinter requirePrinter() {
        InternalPrinter internalPrinter = this.iPrinter;
        if (internalPrinter != null) {
            return internalPrinter;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private Chronology selectChronology(Chronology chronology) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        Chronology chronology3 = this.iChrono;
        if (chronology3 != null) {
            chronology2 = chronology3;
        }
        DateTimeZone dateTimeZone = this.iZone;
        Chronology chronology4 = chronology2;
        if (dateTimeZone != null) {
            chronology4 = chronology2.withZone(dateTimeZone);
        }
        return chronology4;
    }

    @Deprecated
    public Chronology getChronolgy() {
        return this.iChrono;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public int getDefaultYear() {
        return this.iDefaultYear;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    public DateTimeParser getParser() {
        return InternalParserDateTimeParser.m32150of(this.iParser);
    }

    public InternalParser getParser0() {
        return this.iParser;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimePrinter getPrinter() {
        return InternalPrinterDateTimePrinter.m32151of(this.iPrinter);
    }

    public InternalPrinter getPrinter0() {
        return this.iPrinter;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public boolean isOffsetParsed() {
        return this.iOffsetParsed;
    }

    public boolean isParser() {
        return this.iParser != null;
    }

    public boolean isPrinter() {
        return this.iPrinter != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.joda.time.DateTime parseDateTime(java.lang.String r10) {
        /*
            r9 = this;
            r0 = r9
            org.joda.time.format.InternalParser r0 = r0.requireParser()
            r17 = r0
            r0 = r9
            r1 = 0
            org.joda.time.Chronology r0 = r0.selectChronology(r1)
            r15 = r0
            org.joda.time.format.DateTimeParserBucket r0 = new org.joda.time.format.DateTimeParserBucket
            r1 = r0
            r2 = 0
            r3 = r15
            r4 = r9
            java.util.Locale r4 = r4.iLocale
            r5 = r9
            java.lang.Integer r5 = r5.iPivotYear
            r6 = r9
            int r6 = r6.iDefaultYear
            r1.<init>(r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r17
            r1 = r16
            r2 = r10
            r3 = 0
            int r0 = r0.parseInto(r1, r2, r3)
            r12 = r0
            r0 = r12
            if (r0 < 0) goto La2
            r0 = r12
            r11 = r0
            r0 = r12
            r1 = r10
            int r1 = r1.length()
            if (r0 < r1) goto La6
            r0 = r16
            r1 = 1
            r2 = r10
            long r0 = r0.computeMillis(r1, r2)
            r13 = r0
            r0 = r9
            boolean r0 = r0.iOffsetParsed
            if (r0 == 0) goto L66
            r0 = r16
            java.lang.Integer r0 = r0.getOffsetInteger()
            if (r0 == 0) goto L66
            r0 = r16
            java.lang.Integer r0 = r0.getOffsetInteger()
            int r0 = r0.intValue()
            org.joda.time.DateTimeZone r0 = org.joda.time.DateTimeZone.forOffsetMillis(r0)
            r10 = r0
            goto L77
        L66:
            r0 = r15
            r10 = r0
            r0 = r16
            org.joda.time.DateTimeZone r0 = r0.getZone()
            if (r0 == 0) goto L7e
            r0 = r16
            org.joda.time.DateTimeZone r0 = r0.getZone()
            r10 = r0
        L77:
            r0 = r15
            r1 = r10
            org.joda.time.Chronology r0 = r0.withZone(r1)
            r10 = r0
        L7e:
            org.joda.time.DateTime r0 = new org.joda.time.DateTime
            r1 = r0
            r2 = r13
            r3 = r10
            r1.<init>(r2, r3)
            r15 = r0
            r0 = r9
            org.joda.time.DateTimeZone r0 = r0.iZone
            r16 = r0
            r0 = r15
            r10 = r0
            r0 = r16
            if (r0 == 0) goto La0
            r0 = r15
            r1 = r16
            org.joda.time.DateTime r0 = r0.withZone(r1)
            r10 = r0
        La0:
            r0 = r10
            return r0
        La2:
            r0 = r12
            r1 = -1
            r0 = r0 ^ r1
            r11 = r0
        La6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r10
            r3 = r11
            java.lang.String r2 = org.joda.time.format.FormatUtils.createErrorMessage(r2, r3)
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatter.parseDateTime(java.lang.String):org.joda.time.DateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int parseInto(org.joda.time.ReadWritableInstant r10, java.lang.String r11, int r12) {
        /*
            r9 = this;
            r0 = r9
            org.joda.time.format.InternalParser r0 = r0.requireParser()
            r19 = r0
            r0 = r10
            if (r0 == 0) goto Lc0
            r0 = r10
            long r0 = r0.getMillis()
            r16 = r0
            r0 = r10
            org.joda.time.Chronology r0 = r0.getChronology()
            r18 = r0
            r0 = r18
            org.joda.time.Chronology r0 = org.joda.time.DateTimeUtils.getChronology(r0)
            org.joda.time.DateTimeField r0 = r0.year()
            r1 = r16
            int r0 = r0.get(r1)
            r13 = r0
            r0 = r18
            org.joda.time.DateTimeZone r0 = r0.getZone()
            r1 = r16
            int r0 = r0.getOffset(r1)
            long r0 = (long) r0
            r14 = r0
            r0 = r9
            r1 = r18
            org.joda.time.Chronology r0 = r0.selectChronology(r1)
            r18 = r0
            org.joda.time.format.DateTimeParserBucket r0 = new org.joda.time.format.DateTimeParserBucket
            r1 = r0
            r2 = r16
            r3 = r14
            long r2 = r2 + r3
            r3 = r18
            r4 = r9
            java.util.Locale r4 = r4.iLocale
            r5 = r9
            java.lang.Integer r5 = r5.iPivotYear
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r20 = r0
            r0 = r19
            r1 = r20
            r2 = r11
            r3 = r12
            int r0 = r0.parseInto(r1, r2, r3)
            r12 = r0
            r0 = r10
            r1 = r20
            r2 = 0
            r3 = r11
            long r1 = r1.computeMillis(r2, r3)
            r0.setMillis(r1)
            r0 = r9
            boolean r0 = r0.iOffsetParsed
            if (r0 == 0) goto L8f
            r0 = r20
            java.lang.Integer r0 = r0.getOffsetInteger()
            if (r0 == 0) goto L8f
            r0 = r20
            java.lang.Integer r0 = r0.getOffsetInteger()
            int r0 = r0.intValue()
            org.joda.time.DateTimeZone r0 = org.joda.time.DateTimeZone.forOffsetMillis(r0)
            r11 = r0
            goto La0
        L8f:
            r0 = r18
            r11 = r0
            r0 = r20
            org.joda.time.DateTimeZone r0 = r0.getZone()
            if (r0 == 0) goto La7
            r0 = r20
            org.joda.time.DateTimeZone r0 = r0.getZone()
            r11 = r0
        La0:
            r0 = r18
            r1 = r11
            org.joda.time.Chronology r0 = r0.withZone(r1)
            r11 = r0
        La7:
            r0 = r10
            r1 = r11
            r0.setChronology(r1)
            r0 = r9
            org.joda.time.DateTimeZone r0 = r0.iZone
            r11 = r0
            r0 = r11
            if (r0 == 0) goto Lbe
            r0 = r10
            r1 = r11
            r0.setZone(r1)
        Lbe:
            r0 = r12
            return r0
        Lc0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Instant must not be null"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatter.parseInto(org.joda.time.ReadWritableInstant, java.lang.String, int):int");
    }

    public LocalDate parseLocalDate(String str) {
        return parseLocalDateTime(str).toLocalDate();
    }

    public LocalDateTime parseLocalDateTime(String str) {
        int i10;
        Chronology chronology;
        DateTimeZone zone;
        InternalParser requireParser = requireParser();
        Chronology withUTC = selectChronology(null).withUTC();
        DateTimeParserBucket dateTimeParserBucket = new DateTimeParserBucket(0L, withUTC, this.iLocale, this.iPivotYear, this.iDefaultYear);
        int parseInto = requireParser.parseInto(dateTimeParserBucket, str, 0);
        if (parseInto >= 0) {
            i10 = parseInto;
            if (parseInto >= str.length()) {
                long computeMillis = dateTimeParserBucket.computeMillis(true, str);
                if (dateTimeParserBucket.getOffsetInteger() == null) {
                    chronology = withUTC;
                    if (dateTimeParserBucket.getZone() != null) {
                        zone = dateTimeParserBucket.getZone();
                    }
                    return new LocalDateTime(computeMillis, chronology);
                }
                zone = DateTimeZone.forOffsetMillis(dateTimeParserBucket.getOffsetInteger().intValue());
                chronology = withUTC.withZone(zone);
                return new LocalDateTime(computeMillis, chronology);
            }
        } else {
            i10 = parseInto ^ (-1);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(str, i10));
    }

    public LocalTime parseLocalTime(String str) {
        return parseLocalDateTime(str).toLocalTime();
    }

    public long parseMillis(String str) {
        return new DateTimeParserBucket(0L, selectChronology(this.iChrono), this.iLocale, this.iPivotYear, this.iDefaultYear).doParseMillis(requireParser(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.joda.time.MutableDateTime parseMutableDateTime(java.lang.String r10) {
        /*
            r9 = this;
            r0 = r9
            org.joda.time.format.InternalParser r0 = r0.requireParser()
            r17 = r0
            r0 = r9
            r1 = 0
            org.joda.time.Chronology r0 = r0.selectChronology(r1)
            r15 = r0
            org.joda.time.format.DateTimeParserBucket r0 = new org.joda.time.format.DateTimeParserBucket
            r1 = r0
            r2 = 0
            r3 = r15
            r4 = r9
            java.util.Locale r4 = r4.iLocale
            r5 = r9
            java.lang.Integer r5 = r5.iPivotYear
            r6 = r9
            int r6 = r6.iDefaultYear
            r1.<init>(r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r17
            r1 = r16
            r2 = r10
            r3 = 0
            int r0 = r0.parseInto(r1, r2, r3)
            r12 = r0
            r0 = r12
            if (r0 < 0) goto L9c
            r0 = r12
            r11 = r0
            r0 = r12
            r1 = r10
            int r1 = r1.length()
            if (r0 < r1) goto La0
            r0 = r16
            r1 = 1
            r2 = r10
            long r0 = r0.computeMillis(r1, r2)
            r13 = r0
            r0 = r9
            boolean r0 = r0.iOffsetParsed
            if (r0 == 0) goto L66
            r0 = r16
            java.lang.Integer r0 = r0.getOffsetInteger()
            if (r0 == 0) goto L66
            r0 = r16
            java.lang.Integer r0 = r0.getOffsetInteger()
            int r0 = r0.intValue()
            org.joda.time.DateTimeZone r0 = org.joda.time.DateTimeZone.forOffsetMillis(r0)
            r10 = r0
            goto L77
        L66:
            r0 = r15
            r10 = r0
            r0 = r16
            org.joda.time.DateTimeZone r0 = r0.getZone()
            if (r0 == 0) goto L7e
            r0 = r16
            org.joda.time.DateTimeZone r0 = r0.getZone()
            r10 = r0
        L77:
            r0 = r15
            r1 = r10
            org.joda.time.Chronology r0 = r0.withZone(r1)
            r10 = r0
        L7e:
            org.joda.time.MutableDateTime r0 = new org.joda.time.MutableDateTime
            r1 = r0
            r2 = r13
            r3 = r10
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r9
            org.joda.time.DateTimeZone r0 = r0.iZone
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L9a
            r0 = r10
            r1 = r15
            r0.setZone(r1)
        L9a:
            r0 = r10
            return r0
        L9c:
            r0 = r12
            r1 = -1
            r0 = r0 ^ r1
            r11 = r0
        La0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r10
            r3 = r11
            java.lang.String r2 = org.joda.time.format.FormatUtils.createErrorMessage(r2, r3)
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatter.parseMutableDateTime(java.lang.String):org.joda.time.MutableDateTime");
    }

    public String print(long j10) {
        StringBuilder sb2 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo(sb2, j10);
        } catch (IOException e10) {
        }
        return sb2.toString();
    }

    public String print(ReadableInstant readableInstant) {
        StringBuilder sb2 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo(sb2, readableInstant);
        } catch (IOException e10) {
        }
        return sb2.toString();
    }

    public String print(ReadablePartial readablePartial) {
        StringBuilder sb2 = new StringBuilder(requirePrinter().estimatePrintedLength());
        try {
            printTo(sb2, readablePartial);
        } catch (IOException e10) {
        }
        return sb2.toString();
    }

    public void printTo(Writer writer, long j10) {
        printTo((Appendable) writer, j10);
    }

    public void printTo(Writer writer, ReadableInstant readableInstant) {
        printTo((Appendable) writer, readableInstant);
    }

    public void printTo(Writer writer, ReadablePartial readablePartial) {
        printTo((Appendable) writer, readablePartial);
    }

    public void printTo(Appendable appendable, long j10) {
        printTo(appendable, j10, null);
    }

    public void printTo(Appendable appendable, ReadableInstant readableInstant) {
        printTo(appendable, DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantChronology(readableInstant));
    }

    public void printTo(Appendable appendable, ReadablePartial readablePartial) {
        InternalPrinter requirePrinter = requirePrinter();
        if (readablePartial == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        requirePrinter.printTo(appendable, readablePartial, this.iLocale);
    }

    public void printTo(StringBuffer stringBuffer, long j10) {
        try {
            printTo((Appendable) stringBuffer, j10);
        } catch (IOException e10) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadableInstant readableInstant) {
        try {
            printTo((Appendable) stringBuffer, readableInstant);
        } catch (IOException e10) {
        }
    }

    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial) {
        try {
            printTo((Appendable) stringBuffer, readablePartial);
        } catch (IOException e10) {
        }
    }

    public DateTimeFormatter withChronology(Chronology chronology) {
        return this.iChrono == chronology ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, chronology, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withDefaultYear(int i10) {
        return new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, i10);
    }

    public DateTimeFormatter withLocale(Locale locale) {
        return (locale == getLocale() || (locale != null && locale.equals(getLocale()))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, locale, this.iOffsetParsed, this.iChrono, this.iZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withOffsetParsed() {
        return this.iOffsetParsed ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, true, this.iChrono, null, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withPivotYear(int i10) {
        return withPivotYear(Integer.valueOf(i10));
    }

    public DateTimeFormatter withPivotYear(Integer num) {
        Integer num2 = this.iPivotYear;
        return (num2 == num || (num2 != null && num2.equals(num))) ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, this.iOffsetParsed, this.iChrono, this.iZone, num, this.iDefaultYear);
    }

    public DateTimeFormatter withZone(DateTimeZone dateTimeZone) {
        return this.iZone == dateTimeZone ? this : new DateTimeFormatter(this.iPrinter, this.iParser, this.iLocale, false, this.iChrono, dateTimeZone, this.iPivotYear, this.iDefaultYear);
    }

    public DateTimeFormatter withZoneUTC() {
        return withZone(DateTimeZone.UTC);
    }
}
