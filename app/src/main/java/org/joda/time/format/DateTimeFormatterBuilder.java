package org.joda.time.format;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder.class */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$CharacterLiteral.class */
    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c10) {
            this.iValue = c10;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            char upperCase;
            char upperCase2;
            if (i10 >= charSequence.length()) {
                return i10 ^ (-1);
            }
            char charAt = charSequence.charAt(i10);
            char c10 = this.iValue;
            return (charAt == c10 || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c10)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i10 + 1 : i10 ^ (-1);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            appendable.append(this.iValue);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$Composite.class */
    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i11);
                    i10 += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i11] = internalPrinter;
                }
                this.iPrintedLengthEstimate = i10;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int i12 = 0;
            for (int i13 = 0; i13 < size2; i13++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i13);
                i12 += internalParser.estimateParsedLength();
                this.iParsers[i13] = internalParser;
            }
            this.iParsedLengthEstimate = i12;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10 += 2) {
                Object obj = list.get(i10);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i10 + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = internalParserArr.length;
            int i11 = i10;
            for (int i12 = 0; i12 < length && i11 >= 0; i12++) {
                i11 = internalParserArr[i12].parseInto(dateTimeParserBucket, charSequence, i11);
            }
            return i11;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j10, chronology, i10, dateTimeZone, locale);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale;
            if (locale == null) {
                locale2 = Locale.getDefault();
            }
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, readablePartial, locale2);
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$FixedNumber.class */
    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            super(dateTimeFieldType, i10, z10, i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r0 == '+') goto L14;
         */
        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r6, java.lang.CharSequence r7, int r8) {
            /*
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.parseInto(r1, r2, r3)
                r11 = r0
                r0 = r11
                if (r0 >= 0) goto L11
                r0 = r11
                return r0
            L11:
                r0 = r5
                int r0 = r0.iMaxParsedDigits
                r1 = r8
                int r0 = r0 + r1
                r12 = r0
                r0 = r11
                r10 = r0
                r0 = r11
                r1 = r12
                if (r0 == r1) goto L6c
                r0 = r12
                r9 = r0
                r0 = r5
                boolean r0 = r0.iSigned
                if (r0 == 0) goto L4d
                r0 = r7
                r1 = r8
                char r0 = r0.charAt(r1)
                r8 = r0
                r0 = r8
                r1 = 45
                if (r0 == r1) goto L47
                r0 = r12
                r9 = r0
                r0 = r8
                r1 = 43
                if (r0 != r1) goto L4d
            L47:
                r0 = r12
                r1 = 1
                int r0 = r0 + r1
                r9 = r0
            L4d:
                r0 = r11
                r1 = r9
                if (r0 <= r1) goto L5b
                r0 = r9
                r1 = 1
                int r0 = r0 + r1
                r1 = -1
                r0 = r0 ^ r1
                return r0
            L5b:
                r0 = r11
                r10 = r0
                r0 = r11
                r1 = r9
                if (r0 >= r1) goto L6c
                r0 = r11
                r1 = -1
                r0 = r0 ^ r1
                r10 = r0
            L6c:
                r0 = r10
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.FixedNumber.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$Fraction.class */
    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        public int iMaxDigits;
        public int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
            this.iFieldType = dateTimeFieldType;
            int i12 = i11 > 18 ? 18 : i11;
            this.iMinDigits = i10;
            this.iMaxDigits = i12;
        }

        private long[] getFractionData(long j10, DateTimeField dateTimeField) {
            long j11;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i10 = this.iMaxDigits;
            while (true) {
                switch (i10) {
                    case 1:
                        j11 = 10;
                        break;
                    case 2:
                        j11 = 100;
                        break;
                    case 3:
                        j11 = 1000;
                        break;
                    case 4:
                        j11 = 10000;
                        break;
                    case 5:
                        j11 = 100000;
                        break;
                    case 6:
                        j11 = 1000000;
                        break;
                    case 7:
                        j11 = 10000000;
                        break;
                    case 8:
                        j11 = 100000000;
                        break;
                    case 9:
                        j11 = 1000000000;
                        break;
                    case 10:
                        j11 = 10000000000L;
                        break;
                    case 11:
                        j11 = 100000000000L;
                        break;
                    case 12:
                        j11 = 1000000000000L;
                        break;
                    case 13:
                        j11 = 10000000000000L;
                        break;
                    case 14:
                        j11 = 100000000000000L;
                        break;
                    case 15:
                        j11 = 1000000000000000L;
                        break;
                    case 16:
                        j11 = 10000000000000000L;
                        break;
                    case 17:
                        j11 = 100000000000000000L;
                        break;
                    case 18:
                        j11 = 1000000000000000000L;
                        break;
                    default:
                        j11 = 1;
                        break;
                }
                if ((unitMillis * j11) / j11 == unitMillis) {
                    return new long[]{(j10 * j11) / unitMillis, i10};
                }
                i10--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            char charAt;
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int min = Math.min(this.iMaxDigits, charSequence.length() - i10);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j10 = 0;
            int i11 = 0;
            while (i11 < min && (charAt = charSequence.charAt(i10 + i11)) >= '0' && charAt <= '9') {
                i11++;
                unitMillis /= 10;
                j10 += (charAt - '0') * unitMillis;
            }
            long j11 = j10 / 10;
            if (i11 != 0 && j11 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j11);
                return i10 + i11;
            }
            return i10 ^ (-1);
        }

        public void printTo(Appendable appendable, long j10, Chronology chronology) {
            DateTimeField field = this.iFieldType.getField(chronology);
            int i10 = this.iMinDigits;
            try {
                long remainder = field.remainder(j10);
                if (remainder != 0) {
                    long[] fractionData = getFractionData(remainder, field);
                    long j11 = fractionData[0];
                    int i11 = (int) fractionData[1];
                    String num = (2147483647L & j11) == j11 ? Integer.toString((int) j11) : Long.toString(j11);
                    int length = num.length();
                    while (length < i11) {
                        appendable.append('0');
                        i10--;
                        i11--;
                    }
                    if (i10 < i11) {
                        int i12 = i11;
                        int i13 = length;
                        while (i10 < i12 && i13 > 1 && num.charAt(i13 - 1) == '0') {
                            i12--;
                            i13--;
                        }
                        if (i13 < num.length()) {
                            for (int i14 = 0; i14 < i13; i14++) {
                                appendable.append(num.charAt(i14));
                            }
                            return;
                        }
                    }
                    appendable.append(num);
                    return;
                }
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException e10) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i10);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            printTo(appendable, j10, chronology);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$MatchingParser.class */
    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i10 = 0;
            while (true) {
                int i11 = length - 1;
                if (i11 < 0) {
                    this.iParsedLengthEstimate = i10;
                    return;
                }
                InternalParser internalParser = internalParserArr[i11];
                length = i11;
                if (internalParser != null) {
                    int estimateParsedLength = internalParser.estimateParsedLength();
                    length = i11;
                    if (estimateParsedLength > i10) {
                        i10 = estimateParsedLength;
                        length = i11;
                    }
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
        
            return r0;
         */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r6, java.lang.CharSequence r7, int r8) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.MatchingParser.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$NumberFormatter.class */
    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        public final DateTimeFieldType iFieldType;
        public final int iMaxParsedDigits;
        public final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i10;
            this.iSigned = z10;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            boolean z10;
            int charAt;
            int i11;
            int min = Math.min(this.iMaxParsedDigits, charSequence.length() - i10);
            int i12 = 0;
            int i13 = i10;
            boolean z11 = false;
            while (true) {
                z10 = z11;
                if (i12 >= min) {
                    break;
                }
                int i14 = i13 + i12;
                char charAt2 = charSequence.charAt(i14);
                if (i12 == 0 && ((charAt2 == '-' || charAt2 == '+') && this.iSigned)) {
                    z11 = charAt2 == '-';
                    int i15 = i12 + 1;
                    z10 = z11;
                    if (i15 >= min) {
                        break;
                    }
                    char charAt3 = charSequence.charAt(i14 + 1);
                    z10 = z11;
                    if (charAt3 < '0') {
                        break;
                    }
                    if (charAt3 > '9') {
                        z10 = z11;
                        break;
                    }
                    if (z11) {
                        i12 = i15;
                    } else {
                        i13++;
                    }
                    min = Math.min(min + 1, charSequence.length() - i13);
                } else {
                    z10 = z11;
                    if (charAt2 < '0') {
                        break;
                    }
                    if (charAt2 > '9') {
                        z10 = z11;
                        break;
                    }
                    i12++;
                }
            }
            if (i12 == 0) {
                return i13 ^ (-1);
            }
            if (i12 >= 9) {
                int i16 = i12 + i13;
                charAt = Integer.parseInt(charSequence.subSequence(i13, i16).toString());
                i11 = i16;
            } else {
                int i17 = z10 ? i13 + 1 : i13;
                int i18 = i17 + 1;
                try {
                    charAt = charSequence.charAt(i17) - '0';
                    int i19 = i12 + i13;
                    int i20 = i18;
                    while (i20 < i19) {
                        char charAt4 = charSequence.charAt(i20);
                        i20++;
                        charAt = (((charAt << 3) + (charAt << 1)) + charAt4) - 48;
                    }
                    if (z10) {
                        charAt = -charAt;
                        i11 = i19;
                    } else {
                        i11 = i19;
                    }
                } catch (StringIndexOutOfBoundsException e10) {
                    return i13 ^ (-1);
                }
            }
            dateTimeParserBucket.saveField(this.iFieldType, charAt);
            return i11;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$PaddedNumber.class */
    public static class PaddedNumber extends NumberFormatter {
        public final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i10, boolean z10, int i11) {
            super(dateTimeFieldType, i10, z10);
            this.iMinPrintedDigits = i11;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j10), this.iMinPrintedDigits);
            } catch (RuntimeException e10) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
                    return;
                } catch (RuntimeException e10) {
                }
            }
            DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$StringLiteral.class */
    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i10, this.iValue) ? i10 + this.iValue.length() : i10 ^ (-1);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            appendable.append(this.iValue);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$TextField.class */
    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z10) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z10;
        }

        private String print(long j10, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            return this.iShort ? field.getAsShortText(j10, locale) : field.getAsText(j10, locale);
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            return this.iShort ? field.getAsShortText(readablePartial, locale) : field.getAsText(readablePartial, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            Map map;
            int intValue;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> map2 = cParseCache.get(locale);
            Map<DateTimeFieldType, Object[]> map3 = map2;
            if (map2 == null) {
                map3 = new ConcurrentHashMap();
                cParseCache.put(locale, map3);
            }
            Object[] objArr = map3.get(this.iFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return i10 ^ (-1);
                }
                int maximumTextLength = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap.put(asShortText, bool);
                    concurrentHashMap.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                intValue = maximumTextLength;
                if ("en".equals(locale.getLanguage())) {
                    intValue = maximumTextLength;
                    if (this.iFieldType == DateTimeFieldType.era()) {
                        Boolean bool2 = Boolean.TRUE;
                        concurrentHashMap.put("BCE", bool2);
                        concurrentHashMap.put("bce", bool2);
                        concurrentHashMap.put("CE", bool2);
                        concurrentHashMap.put("ce", bool2);
                        intValue = 3;
                    }
                }
                map3.put(this.iFieldType, new Object[]{concurrentHashMap, Integer.valueOf(intValue)});
                map = concurrentHashMap;
            } else {
                map = (Map) objArr[0];
                intValue = ((Integer) objArr[1]).intValue();
            }
            for (int min = Math.min(charSequence.length(), intValue + i10); min > i10; min--) {
                String obj = charSequence.subSequence(i10, min).toString();
                if (map.containsKey(obj)) {
                    dateTimeParserBucket.saveField(this.iFieldType, obj, locale);
                    return min;
                }
            }
            return i10 ^ (-1);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            try {
                appendable.append(print(j10, chronology, locale));
            } catch (RuntimeException e10) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException e10) {
                appendable.append((char) 65533);
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$TimeZoneId.class */
    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        public static final Set<String> ALL_IDS;
        public static final int MAX_LENGTH;

        static {
            int i10 = 0;
            Set<String> availableIDs = DateTimeZone.getAvailableIDs();
            ALL_IDS = availableIDs;
            Iterator<String> it = availableIDs.iterator();
            while (it.hasNext()) {
                i10 = Math.max(i10, it.next().length());
            }
            MAX_LENGTH = i10;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            String str = null;
            for (String str2 : ALL_IDS) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i10, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return i10 ^ (-1);
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(str));
            return i10 + str.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$TimeZoneName.class */
    public static class TimeZoneName implements InternalPrinter, InternalParser {
        public static final int LONG_NAME = 0;
        public static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i10, Map<String, DateTimeZone> map) {
            this.iType = i10;
            this.iParseLookup = map;
        }

        private String print(long j10, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i10 = this.iType;
            return i10 != 0 ? i10 != 1 ? "" : dateTimeZone.getShortName(j10, locale) : dateTimeZone.getName(j10, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            Map<String, DateTimeZone> map = this.iParseLookup;
            if (map == null) {
                map = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : map.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i10, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return i10 ^ (-1);
            }
            dateTimeParserBucket.setZone(map.get(str));
            return i10 + str.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            appendable.append(print(j10 - i10, dateTimeZone, locale));
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$TimeZoneOffset.class */
    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z10, int i10, int i11) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z10;
            if (i10 <= 0 || i11 < i10) {
                throw new IllegalArgumentException();
            }
            int i12 = i10;
            if (i10 > 4) {
                i12 = 4;
                i11 = 4;
            }
            this.iMinFields = i12;
            this.iMaxFields = i11;
        }

        private int digitCount(CharSequence charSequence, int i10, int i11) {
            char charAt;
            int i12 = 0;
            for (int min = Math.min(charSequence.length() - i10, i11); min > 0 && (charAt = charSequence.charAt(i10 + i12)) >= '0' && charAt <= '9'; min--) {
                i12++;
            }
            return i12;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i10 = this.iMinFields;
            int i11 = (i10 + 1) << 1;
            int i12 = i11;
            if (this.iShowSeparators) {
                i12 = i11 + (i10 - 1);
            }
            String str = this.iZeroOffsetPrintText;
            int i13 = i12;
            if (str != null) {
                i13 = i12;
                if (str.length() > i12) {
                    i13 = this.iZeroOffsetPrintText.length();
                }
            }
            return i13;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10) {
            boolean z10;
            int parseTwoDigits;
            int i11;
            int i12;
            boolean z11;
            int i13;
            int parseTwoDigits2;
            int parseTwoDigits3;
            char charAt;
            int length = charSequence.length() - i10;
            String str = this.iZeroOffsetParseText;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((charAt = charSequence.charAt(i10)) != '-' && charAt != '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i10;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i10, this.iZeroOffsetParseText)) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return i10 + this.iZeroOffsetParseText.length();
                }
            }
            if (length <= 1) {
                return i10 ^ (-1);
            }
            char charAt2 = charSequence.charAt(i10);
            if (charAt2 == '-') {
                z10 = true;
            } else {
                if (charAt2 != '+') {
                    return i10 ^ (-1);
                }
                z10 = false;
            }
            int i14 = i10 + 1;
            if (digitCount(charSequence, i14, 2) >= 2 && (parseTwoDigits = FormatUtils.parseTwoDigits(charSequence, i14)) <= 23) {
                int i15 = parseTwoDigits * DateTimeConstants.MILLIS_PER_HOUR;
                int i16 = (length - 1) - 2;
                int i17 = i14 + 2;
                if (i16 <= 0) {
                    i11 = i15;
                    i12 = i17;
                } else {
                    char charAt3 = charSequence.charAt(i17);
                    if (charAt3 == ':') {
                        i12 = i17 + 1;
                        i13 = i16 - 1;
                        z11 = true;
                    } else {
                        i11 = i15;
                        i12 = i17;
                        if (charAt3 >= '0') {
                            i11 = i15;
                            i12 = i17;
                            if (charAt3 <= '9') {
                                i12 = i17;
                                z11 = false;
                                i13 = i16;
                            }
                        }
                    }
                    int digitCount = digitCount(charSequence, i12, 2);
                    if (digitCount != 0 || z11) {
                        if (digitCount >= 2 && (parseTwoDigits2 = FormatUtils.parseTwoDigits(charSequence, i12)) <= 59) {
                            int i18 = i15 + (parseTwoDigits2 * DateTimeConstants.MILLIS_PER_MINUTE);
                            int i19 = i13 - 2;
                            int i20 = i12 + 2;
                            if (i19 <= 0) {
                                i11 = i18;
                                i12 = i20;
                            } else {
                                int i21 = i19;
                                i12 = i20;
                                if (z11) {
                                    if (charSequence.charAt(i20) != ':') {
                                        i11 = i18;
                                        i12 = i20;
                                    } else {
                                        i21 = i19 - 1;
                                        i12 = i20 + 1;
                                    }
                                }
                                int digitCount2 = digitCount(charSequence, i12, 2);
                                if (digitCount2 != 0 || z11) {
                                    if (digitCount2 >= 2 && (parseTwoDigits3 = FormatUtils.parseTwoDigits(charSequence, i12)) <= 59) {
                                        int i22 = i18 + (parseTwoDigits3 * 1000);
                                        int i23 = i12 + 2;
                                        if (i21 - 2 <= 0) {
                                            i11 = i22;
                                            i12 = i23;
                                        } else {
                                            i12 = i23;
                                            if (z11) {
                                                if (charSequence.charAt(i23) == '.' || charSequence.charAt(i23) == ',') {
                                                    i12 = i23 + 1;
                                                } else {
                                                    i11 = i22;
                                                    i12 = i23;
                                                }
                                            }
                                            int digitCount3 = digitCount(charSequence, i12, 3);
                                            if (digitCount3 == 0 && !z11) {
                                                i11 = i22;
                                            } else {
                                                if (digitCount3 < 1) {
                                                    return i12 ^ (-1);
                                                }
                                                int i24 = i12 + 1;
                                                i11 = i22 + ((charSequence.charAt(i12) - '0') * 100);
                                                if (digitCount3 > 1) {
                                                    int i25 = i24 + 1;
                                                    int charAt4 = i11 + ((charSequence.charAt(i24) - '0') * 10);
                                                    i11 = charAt4;
                                                    i12 = i25;
                                                    if (digitCount3 > 2) {
                                                        i11 = charAt4 + (charSequence.charAt(i25) - '0');
                                                        i12 = i25 + 1;
                                                    }
                                                } else {
                                                    i12 = i24;
                                                }
                                            }
                                        }
                                    }
                                    return i12 ^ (-1);
                                }
                                i11 = i18;
                            }
                        }
                        return i12 ^ (-1);
                    }
                    i11 = i15;
                }
                int i26 = i11;
                if (z10) {
                    i26 = -i11;
                }
                dateTimeParserBucket.setOffset(Integer.valueOf(i26));
                return i12;
            }
            return i14 ^ (-1);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i10 == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i10 >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i10 = -i10;
            }
            int i11 = i10 / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i11, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i12 = i10 - (i11 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i12 != 0 || this.iMinFields > 1) {
                int i13 = i12 / DateTimeConstants.MILLIS_PER_MINUTE;
                if (this.iShowSeparators) {
                    appendable.append(':');
                }
                FormatUtils.appendPaddedInteger(appendable, i13, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i14 = i12 - (i13 * DateTimeConstants.MILLIS_PER_MINUTE);
                if (i14 != 0 || this.iMinFields > 2) {
                    int i15 = i14 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(':');
                    }
                    FormatUtils.appendPaddedInteger(appendable, i15, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i16 = i14 - (i15 * 1000);
                    if (i16 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i16, 3);
                    }
                }
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$TwoDigitYear.class */
    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            this.iType = dateTimeFieldType;
            this.iPivot = i10;
            this.iLenientParse = z10;
        }

        private int getTwoDigitYear(long j10, Chronology chronology) {
            try {
                int i10 = this.iType.getField(chronology).get(j10);
                int i11 = i10;
                if (i10 < 0) {
                    i11 = -i10;
                }
                return i11 % 100;
            } catch (RuntimeException e10) {
                return -1;
            }
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i10 = readablePartial.get(this.iType);
                int i11 = i10;
                if (i10 < 0) {
                    i11 = -i10;
                }
                return i11 % 100;
            } catch (RuntimeException e10) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x00ae, code lost:
        
            if (r10 != 2) goto L67;
         */
        @Override // org.joda.time.format.InternalParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.format.DateTimeParserBucket r7, java.lang.CharSequence r8, int r9) {
            /*
                Method dump skipped, instructions count: 506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear.parseInto(org.joda.time.format.DateTimeParserBucket, java.lang.CharSequence, int):int");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            int twoDigitYear = getTwoDigitYear(j10, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeFormatterBuilder$UnpaddedNumber.class */
    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i10, boolean z10) {
            super(dateTimeFieldType, i10, z10);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j10));
            } catch (RuntimeException e10) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            if (readablePartial.isSupported(this.iFieldType)) {
                try {
                    FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
                    return;
                } catch (RuntimeException e10) {
                }
            }
            appendable.append((char) 65533);
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i10) {
        while (true) {
            i10--;
            if (i10 < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public static boolean csStartsWith(CharSequence charSequence, int i10, String str) {
        int length = str.length();
        if (charSequence.length() - i10 < length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i10 + i11) != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i10, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i10 < length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = charSequence.charAt(i10 + i11);
            char charAt2 = str.charAt(i11);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object getFormatter() {
        /*
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.iFormatter
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L5d
            r0 = r6
            r5 = r0
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.iElementPairs
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto L44
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.iElementPairs
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            r0 = r4
            java.util.ArrayList<java.lang.Object> r0 = r0.iElementPairs
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L42
            r0 = r8
            r1 = r7
            if (r0 == r1) goto L3c
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L44
        L3c:
            r0 = r8
            r5 = r0
            goto L44
        L42:
            r0 = r7
            r5 = r0
        L44:
            r0 = r5
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L56
            org.joda.time.format.DateTimeFormatterBuilder$Composite r0 = new org.joda.time.format.DateTimeFormatterBuilder$Composite
            r1 = r0
            r2 = r4
            java.util.ArrayList<java.lang.Object> r2 = r2.iElementPairs
            r1.<init>(r2)
            r6 = r0
        L56:
            r0 = r4
            r1 = r6
            r0.iFormatter = r1
            r0 = r6
            r5 = r0
        L5d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.getFormatter():java.lang.Object");
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.m32148of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.m32149of(dateTimePrinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.m32149of(dateTimePrinter), DateTimeParserInternalParser.m32148of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        InternalPrinter m32149of;
        InternalParser matchingParser;
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int length = dateTimeParserArr.length;
        int i10 = 0;
        if (length != 1) {
            InternalParser[] internalParserArr = new InternalParser[length];
            while (i10 < length - 1) {
                InternalParser m32148of = DateTimeParserInternalParser.m32148of(dateTimeParserArr[i10]);
                internalParserArr[i10] = m32148of;
                if (m32148of == null) {
                    throw new IllegalArgumentException("Incomplete parser array");
                }
                i10++;
            }
            internalParserArr[i10] = DateTimeParserInternalParser.m32148of(dateTimeParserArr[i10]);
            m32149of = DateTimePrinterInternalPrinter.m32149of(dateTimePrinter);
            matchingParser = new MatchingParser(internalParserArr);
        } else {
            if (dateTimeParserArr[0] == null) {
                throw new IllegalArgumentException("No parser supplied");
            }
            InternalPrinter m32149of2 = DateTimePrinterInternalPrinter.m32149of(dateTimePrinter);
            matchingParser = DateTimeParserInternalParser.m32148of(dateTimeParserArr[0]);
            m32149of = m32149of2;
        }
        return append0(m32149of, matchingParser);
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i10, int i11) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i10, i11);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i10, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i10) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i10, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i10) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i10, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i10) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i10, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i10) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i10, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int i12 = i11;
        if (i11 < i10) {
            i12 = i10;
        }
        if (i10 < 0 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        return i10 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i12, false)) : append0(new PaddedNumber(dateTimeFieldType, i12, false, i10));
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i10 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i10, false));
        }
        throw new IllegalArgumentException("Illegal number of digits: " + i10);
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i10) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i10 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i10, true));
        }
        throw new IllegalArgumentException("Illegal number of digits: " + i10);
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int i12 = i11;
        if (i11 < i10) {
            i12 = i10;
        }
        if (i10 < 0 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        return append0(new Fraction(dateTimeFieldType, i10, i12));
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i10, int i11) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i10, i11);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i10, int i11) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i10, i11);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i10, int i11) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i10, i11);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i10, int i11) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i10, i11);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i10, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i10) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i10, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(char c10) {
        return append0(new CharacterLiteral(c10));
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        if (length != 0) {
            return append0(length != 1 ? new StringLiteral(str) : new CharacterLiteral(str.charAt(0)));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i10, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i10) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i10, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i10, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i10) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i10, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i10) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i10, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.m32148of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i10) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i10, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i10) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i10, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i10, int i11) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        int i12 = i11;
        if (i11 < i10) {
            i12 = i10;
        }
        if (i10 < 0 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        return i10 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i12, true)) : append0(new PaddedNumber(dateTimeFieldType, i12, true, i10));
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z10, int i10, int i11) {
        return append0(new TimeZoneOffset(str, str2, z10, i10, i11));
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z10, int i10, int i11) {
        return append0(new TimeZoneOffset(str, str, z10, i10, i11));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i10) {
        return appendTwoDigitWeekyear(i10, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i10, boolean z10) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i10, z10));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i10) {
        return appendTwoDigitYear(i10, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i10, boolean z10) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i10, z10));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i10) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i10, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i10, int i11) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i10, i11);
    }

    public DateTimeFormatterBuilder appendYear(int i10, int i11) {
        return appendSignedDecimal(DateTimeFieldType.year(), i10, i11);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i10, int i11) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i10, i11);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i10, int i11) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i10, i11);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalParser internalParser = null;
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        if (isParser(formatter)) {
            internalParser = (InternalParser) formatter;
        }
        if (internalPrinter == null && internalParser == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new DateTimeFormatter(internalPrinter, internalParser);
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.m32150of((InternalParser) formatter);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.m32151of((InternalPrinter) formatter);
        }
        throw new UnsupportedOperationException("Printing is not supported");
    }
}
