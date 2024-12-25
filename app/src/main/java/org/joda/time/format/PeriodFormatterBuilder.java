package org.joda.time.format;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder.class */
public class PeriodFormatterBuilder {
    private static final int DAYS = 3;
    private static final int HOURS = 4;
    private static final int MAX_FIELD = 9;
    private static final int MILLIS = 7;
    private static final int MINUTES = 5;
    private static final int MONTHS = 1;
    private static final ConcurrentMap<String, Pattern> PATTERNS = new ConcurrentHashMap();
    private static final int PRINT_ZERO_ALWAYS = 4;
    private static final int PRINT_ZERO_IF_SUPPORTED = 3;
    private static final int PRINT_ZERO_NEVER = 5;
    private static final int PRINT_ZERO_RARELY_FIRST = 1;
    private static final int PRINT_ZERO_RARELY_LAST = 2;
    private static final int SECONDS = 6;
    private static final int SECONDS_MILLIS = 8;
    private static final int SECONDS_OPTIONAL_MILLIS = 9;
    private static final int WEEKS = 2;
    private static final int YEARS = 0;
    private List<Object> iElementPairs;
    private FieldFormatter[] iFieldFormatters;
    private int iMaxParsedDigits;
    private int iMinPrintedDigits;
    private boolean iNotParser;
    private boolean iNotPrinter;
    private PeriodFieldAffix iPrefix;
    private int iPrintZeroSetting;
    private boolean iRejectSignedValues;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$Composite.class */
    public static class Composite implements PeriodPrinter, PeriodParser {
        private final PeriodParser[] iParsers;
        private final PeriodPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.iPrinters = null;
            } else {
                this.iPrinters = (PeriodPrinter[]) arrayList.toArray(new PeriodPrinter[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.iParsers = null;
            } else {
                this.iParsers = (PeriodParser[]) arrayList2.toArray(new PeriodParser[arrayList2.size()]);
            }
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
                if (obj instanceof PeriodPrinter) {
                    if (obj instanceof Composite) {
                        addArrayToList(list2, ((Composite) obj).iPrinters);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i10 + 1);
                if (obj2 instanceof PeriodParser) {
                    if (obj2 instanceof Composite) {
                        addArrayToList(list3, ((Composite) obj2).iParsers);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                length--;
                if (length < 0) {
                    return i11;
                }
                i10 = i11 + periodPrinterArr[length].calculatePrintedLength(readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            int i11;
            PeriodPrinter[] periodPrinterArr = this.iPrinters;
            int length = periodPrinterArr.length;
            int i12 = 0;
            while (true) {
                i11 = i12;
                if (i11 >= i10) {
                    break;
                }
                length--;
                if (length < 0) {
                    break;
                }
                i12 = i11 + periodPrinterArr[length].countFieldsToPrint(readablePeriod, Integer.MAX_VALUE, locale);
            }
            return i11;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            PeriodParser[] periodParserArr = this.iParsers;
            if (periodParserArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = periodParserArr.length;
            int i11 = i10;
            for (int i12 = 0; i12 < length && i11 >= 0; i12++) {
                i11 = periodParserArr[i12].parseInto(readWritablePeriod, str, i11, locale);
            }
            return i11;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(writer, readablePeriod, locale);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            for (PeriodPrinter periodPrinter : this.iPrinters) {
                periodPrinter.printTo(stringBuffer, readablePeriod, locale);
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$CompositeAffix.class */
    public static class CompositeAffix extends IgnorableAffix {
        private final PeriodFieldAffix iLeft;
        private final String[] iLeftRightCombinations;
        private final PeriodFieldAffix iRight;

        public CompositeAffix(PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iLeft = periodFieldAffix;
            this.iRight = periodFieldAffix2;
            HashSet hashSet = new HashSet();
            for (String str : periodFieldAffix.getAffixes()) {
                for (String str2 : this.iRight.getAffixes()) {
                    hashSet.add(str + str2);
                }
            }
            this.iLeftRightCombinations = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iLeft.calculatePrintedLength(i10) + this.iRight.calculatePrintedLength(i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iLeftRightCombinations.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            int parse = this.iLeft.parse(str, i10);
            int i11 = parse;
            if (parse >= 0) {
                int parse2 = this.iRight.parse(str, parse);
                i11 = parse2;
                if (parse2 >= 0) {
                    i11 = parse2;
                    if (matchesOtherAffix(parse(str, parse2) - parse2, str, i10)) {
                        return i10 ^ (-1);
                    }
                }
            }
            return i11;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) {
            this.iLeft.printTo(writer, i10);
            this.iRight.printTo(writer, i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            this.iLeft.printTo(stringBuffer, i10);
            this.iRight.printTo(stringBuffer, i10);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            int scan;
            int scan2 = this.iLeft.scan(str, i10);
            return (scan2 < 0 || ((scan = this.iRight.scan(str, this.iLeft.parse(str, scan2))) >= 0 && matchesOtherAffix(this.iRight.parse(str, scan) - scan2, str, i10))) ? i10 ^ (-1) : scan2 > 0 ? scan2 : scan;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$FieldFormatter.class */
    public static class FieldFormatter implements PeriodPrinter, PeriodParser {
        private final FieldFormatter[] iFieldFormatters;
        private final int iFieldType;
        private final int iMaxParsedDigits;
        private final int iMinPrintedDigits;
        private final PeriodFieldAffix iPrefix;
        private final int iPrintZeroSetting;
        private final boolean iRejectSignedValues;
        private final PeriodFieldAffix iSuffix;

        public FieldFormatter(int i10, int i11, int i12, boolean z10, int i13, FieldFormatter[] fieldFormatterArr, PeriodFieldAffix periodFieldAffix, PeriodFieldAffix periodFieldAffix2) {
            this.iMinPrintedDigits = i10;
            this.iPrintZeroSetting = i11;
            this.iMaxParsedDigits = i12;
            this.iRejectSignedValues = z10;
            this.iFieldType = i13;
            this.iFieldFormatters = fieldFormatterArr;
            this.iPrefix = periodFieldAffix;
            this.iSuffix = periodFieldAffix2;
        }

        public FieldFormatter(FieldFormatter fieldFormatter, PeriodFieldAffix periodFieldAffix) {
            this.iMinPrintedDigits = fieldFormatter.iMinPrintedDigits;
            this.iPrintZeroSetting = fieldFormatter.iPrintZeroSetting;
            this.iMaxParsedDigits = fieldFormatter.iMaxParsedDigits;
            this.iRejectSignedValues = fieldFormatter.iRejectSignedValues;
            this.iFieldType = fieldFormatter.iFieldType;
            this.iFieldFormatters = fieldFormatter.iFieldFormatters;
            this.iPrefix = fieldFormatter.iPrefix;
            PeriodFieldAffix periodFieldAffix2 = fieldFormatter.iSuffix;
            this.iSuffix = periodFieldAffix2 != null ? new CompositeAffix(periodFieldAffix2, periodFieldAffix) : periodFieldAffix;
        }

        private int parseInt(String str, int i10, int i11) {
            if (i11 >= 10) {
                return Integer.parseInt(str.substring(i10, i11 + i10));
            }
            boolean z10 = false;
            if (i11 <= 0) {
                return 0;
            }
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            int i13 = i11 - 1;
            int i14 = i12;
            char c10 = charAt;
            int i15 = i13;
            if (charAt == '-') {
                i15 = i13 - 1;
                if (i15 < 0) {
                    return 0;
                }
                c10 = str.charAt(i12);
                i14 = i12 + 1;
                z10 = true;
            }
            int i16 = c10 - '0';
            int i17 = i16;
            for (int i18 = i15; i18 > 0; i18--) {
                char charAt2 = str.charAt(i14);
                i14++;
                i17 = (((i17 << 3) + (i17 << 1)) + charAt2) - 48;
            }
            int i19 = i17;
            if (z10) {
                i19 = -i17;
            }
            return i19;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return 0;
            }
            int max = Math.max(FormatUtils.calculateDigitCount(fieldValue), this.iMinPrintedDigits);
            int i10 = max;
            long j10 = fieldValue;
            if (this.iFieldType >= 8) {
                int max2 = Math.max(max, fieldValue < 0 ? 5 : 4) + 1;
                i10 = max2;
                if (this.iFieldType == 9) {
                    i10 = max2;
                    if (Math.abs(fieldValue) % 1000 == 0) {
                        i10 = max2 - 4;
                    }
                }
                j10 = fieldValue / 1000;
            }
            int i11 = (int) j10;
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            int i12 = i10;
            if (periodFieldAffix != null) {
                i12 = i10 + periodFieldAffix.calculatePrintedLength(i11);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            int i13 = i12;
            if (periodFieldAffix2 != null) {
                i13 = i12 + periodFieldAffix2.calculatePrintedLength(i11);
            }
            return i13;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            if (i10 <= 0) {
                return 0;
            }
            return (this.iPrintZeroSetting == 4 || getFieldValue(readablePeriod) != Long.MAX_VALUE) ? 1 : 0;
        }

        public void finish(FieldFormatter[] fieldFormatterArr) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (FieldFormatter fieldFormatter : fieldFormatterArr) {
                if (fieldFormatter != null && !equals(fieldFormatter)) {
                    hashSet.add(fieldFormatter.iPrefix);
                    hashSet2.add(fieldFormatter.iSuffix);
                }
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.finish(hashSet);
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.finish(hashSet2);
            }
        }

        public int getFieldType() {
            return this.iFieldType;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long getFieldValue(org.joda.time.ReadablePeriod r6) {
            /*
                Method dump skipped, instructions count: 391
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.FieldFormatter.getFieldValue(org.joda.time.ReadablePeriod):long");
        }

        public boolean isSupported(PeriodType periodType, int i10) {
            DurationFieldType years;
            boolean z10 = false;
            switch (i10) {
                case 0:
                    years = DurationFieldType.years();
                    break;
                case 1:
                    years = DurationFieldType.months();
                    break;
                case 2:
                    years = DurationFieldType.weeks();
                    break;
                case 3:
                    years = DurationFieldType.days();
                    break;
                case 4:
                    years = DurationFieldType.hours();
                    break;
                case 5:
                    years = DurationFieldType.minutes();
                    break;
                case 6:
                    years = DurationFieldType.seconds();
                    break;
                case 7:
                    years = DurationFieldType.millis();
                    break;
                case 8:
                case 9:
                    if (periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis())) {
                        z10 = true;
                    }
                    return z10;
                default:
                    return false;
            }
            return periodType.isSupported(years);
        }

        public boolean isZero(ReadablePeriod readablePeriod) {
            int size = readablePeriod.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (readablePeriod.getValue(i10) != 0) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x02af  */
        @Override // org.joda.time.format.PeriodParser
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int parseInto(org.joda.time.ReadWritablePeriod r9, java.lang.String r10, int r11, java.util.Locale r12) {
            /*
                Method dump skipped, instructions count: 711
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.FieldFormatter.parseInto(org.joda.time.ReadWritablePeriod, java.lang.String, int, java.util.Locale):int");
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i10 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i10 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(writer, i10);
            }
            int i11 = this.iMinPrintedDigits;
            if (i11 <= 1) {
                FormatUtils.writeUnpaddedInteger(writer, i10);
            } else {
                FormatUtils.writePaddedInteger(writer, i10, i11);
            }
            if (this.iFieldType >= 8) {
                int abs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || abs > 0) {
                    writer.write(46);
                    FormatUtils.writePaddedInteger(writer, abs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(writer, i10);
            }
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            long fieldValue = getFieldValue(readablePeriod);
            if (fieldValue == Long.MAX_VALUE) {
                return;
            }
            int i10 = (int) fieldValue;
            if (this.iFieldType >= 8) {
                i10 = (int) (fieldValue / 1000);
            }
            PeriodFieldAffix periodFieldAffix = this.iPrefix;
            if (periodFieldAffix != null) {
                periodFieldAffix.printTo(stringBuffer, i10);
            }
            int length = stringBuffer.length();
            int i11 = this.iMinPrintedDigits;
            if (i11 <= 1) {
                FormatUtils.appendUnpaddedInteger(stringBuffer, i10);
            } else {
                FormatUtils.appendPaddedInteger(stringBuffer, i10, i11);
            }
            if (this.iFieldType >= 8) {
                int abs = (int) (Math.abs(fieldValue) % 1000);
                if (this.iFieldType == 8 || abs > 0) {
                    if (fieldValue < 0 && fieldValue > -1000) {
                        stringBuffer.insert(length, '-');
                    }
                    stringBuffer.append('.');
                    FormatUtils.appendPaddedInteger(stringBuffer, abs, 3);
                }
            }
            PeriodFieldAffix periodFieldAffix2 = this.iSuffix;
            if (periodFieldAffix2 != null) {
                periodFieldAffix2.printTo(stringBuffer, i10);
            }
        }

        public void setFieldValue(ReadWritablePeriod readWritablePeriod, int i10, int i11) {
            switch (i10) {
                case 0:
                    readWritablePeriod.setYears(i11);
                    break;
                case 1:
                    readWritablePeriod.setMonths(i11);
                    break;
                case 2:
                    readWritablePeriod.setWeeks(i11);
                    break;
                case 3:
                    readWritablePeriod.setDays(i11);
                    break;
                case 4:
                    readWritablePeriod.setHours(i11);
                    break;
                case 5:
                    readWritablePeriod.setMinutes(i11);
                    break;
                case 6:
                    readWritablePeriod.setSeconds(i11);
                    break;
                case 7:
                    readWritablePeriod.setMillis(i11);
                    break;
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$IgnorableAffix.class */
    public static abstract class IgnorableAffix implements PeriodFieldAffix {
        private volatile String[] iOtherAffixes;

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void finish(Set<PeriodFieldAffix> set) {
            if (this.iOtherAffixes == null) {
                int i10 = Integer.MAX_VALUE;
                String str = null;
                String[] affixes = getAffixes();
                int length = affixes.length;
                int i11 = 0;
                while (i11 < length) {
                    String str2 = affixes[i11];
                    int i12 = i10;
                    if (str2.length() < i10) {
                        i12 = str2.length();
                        str = str2;
                    }
                    i11++;
                    i10 = i12;
                }
                HashSet hashSet = new HashSet();
                for (PeriodFieldAffix periodFieldAffix : set) {
                    if (periodFieldAffix != null) {
                        for (String str3 : periodFieldAffix.getAffixes()) {
                            if (str3.length() > i10 || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.iOtherAffixes = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }

        public boolean matchesOtherAffix(int i10, String str, int i11) {
            if (this.iOtherAffixes == null) {
                return false;
            }
            for (String str2 : this.iOtherAffixes) {
                int length = str2.length();
                if (i10 < length && str.regionMatches(true, i11, str2, 0, length)) {
                    return true;
                }
                if (i10 == length && str.regionMatches(false, i11, str2, 0, length)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$Literal.class */
    public static class Literal implements PeriodPrinter, PeriodParser {
        public static final Literal EMPTY = new Literal("");
        private final String iText;

        public Literal(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            return 0;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            String str2 = this.iText;
            return str.regionMatches(true, i10, str2, 0, str2.length()) ? i10 + this.iText.length() : i10 ^ (-1);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale) {
            writer.write(this.iText);
        }

        @Override // org.joda.time.format.PeriodPrinter
        public void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale) {
            stringBuffer.append(this.iText);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$PeriodFieldAffix.class */
    public interface PeriodFieldAffix {
        int calculatePrintedLength(int i10);

        void finish(Set<PeriodFieldAffix> set);

        String[] getAffixes();

        int parse(String str, int i10);

        void printTo(Writer writer, int i10);

        void printTo(StringBuffer stringBuffer, int i10);

        int scan(String str, int i10);
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$PluralAffix.class */
    public static class PluralAffix extends IgnorableAffix {
        private final String iPluralText;
        private final String iSingularText;

        public PluralAffix(String str, String str2) {
            this.iSingularText = str;
            this.iPluralText = str2;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return (i10 == 1 ? this.iSingularText : this.iPluralText).length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iSingularText, this.iPluralText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            String str2;
            int length;
            String str3 = this.iPluralText;
            String str4 = this.iSingularText;
            if (str3.length() < str4.length()) {
                str2 = str3;
            } else {
                str2 = str4;
                str4 = str3;
            }
            if (str.regionMatches(true, i10, str4, 0, str4.length()) && !matchesOtherAffix(str4.length(), str, i10)) {
                length = str4.length();
            } else {
                if (!str.regionMatches(true, i10, str2, 0, str2.length()) || matchesOtherAffix(str2.length(), str, i10)) {
                    return i10 ^ (-1);
                }
                length = str2.length();
            }
            return i10 + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) {
            writer.write(i10 == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(i10 == 1 ? this.iSingularText : this.iPluralText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            String str2;
            String str3 = this.iPluralText;
            String str4 = this.iSingularText;
            if (str3.length() < str4.length()) {
                str2 = str3;
            } else {
                str2 = str4;
                str4 = str3;
            }
            int length = str4.length();
            int length2 = str2.length();
            int length3 = str.length();
            for (int i11 = i10; i11 < length3; i11++) {
                if (str.regionMatches(true, i11, str4, 0, length) && !matchesOtherAffix(str4.length(), str, i11)) {
                    return i11;
                }
                if (str.regionMatches(true, i11, str2, 0, length2) && !matchesOtherAffix(str2.length(), str, i11)) {
                    return i11;
                }
            }
            return i10 ^ (-1);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$RegExAffix.class */
    public static class RegExAffix extends IgnorableAffix {
        private static final Comparator<String> LENGTH_DESC_COMPARATOR = new Comparator<String>() { // from class: org.joda.time.format.PeriodFormatterBuilder.RegExAffix.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str2.length() - str.length();
            }
        };
        private final Pattern[] iPatterns;
        private final String[] iSuffixes;
        private final String[] iSuffixesSortedDescByLength;

        public RegExAffix(String[] strArr, String[] strArr2) {
            this.iSuffixes = (String[]) strArr2.clone();
            this.iPatterns = new Pattern[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                Pattern pattern = (Pattern) PeriodFormatterBuilder.PATTERNS.get(strArr[i10]);
                Pattern pattern2 = pattern;
                if (pattern == null) {
                    pattern2 = Pattern.compile(strArr[i10]);
                    PeriodFormatterBuilder.PATTERNS.putIfAbsent(strArr[i10], pattern2);
                }
                this.iPatterns[i10] = pattern2;
            }
            String[] strArr3 = (String[]) this.iSuffixes.clone();
            this.iSuffixesSortedDescByLength = strArr3;
            Arrays.sort(strArr3, LENGTH_DESC_COMPARATOR);
        }

        private int selectSuffixIndex(int i10) {
            int i11 = 0;
            while (true) {
                Pattern[] patternArr = this.iPatterns;
                if (i11 >= patternArr.length) {
                    return patternArr.length - 1;
                }
                if (patternArr[i11].matcher(String.valueOf(i10)).matches()) {
                    return i11;
                }
                i11++;
            }
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iSuffixes[selectSuffixIndex(i10)].length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return (String[]) this.iSuffixes.clone();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            for (String str2 : this.iSuffixesSortedDescByLength) {
                if (str.regionMatches(true, i10, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i10)) {
                    return i10 + str2.length();
                }
            }
            return i10 ^ (-1);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) {
            writer.write(this.iSuffixes[selectSuffixIndex(i10)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(this.iSuffixes[selectSuffixIndex(i10)]);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            int length = str.length();
            for (int i11 = i10; i11 < length; i11++) {
                for (String str2 : this.iSuffixesSortedDescByLength) {
                    if (str.regionMatches(true, i11, str2, 0, str2.length()) && !matchesOtherAffix(str2.length(), str, i11)) {
                        return i11;
                    }
                }
            }
            return i10 ^ (-1);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$Separator.class */
    public static class Separator implements PeriodPrinter, PeriodParser {
        private volatile PeriodParser iAfterParser;
        private volatile PeriodPrinter iAfterPrinter;
        private final PeriodParser iBeforeParser;
        private final PeriodPrinter iBeforePrinter;
        private final String iFinalText;
        private final String[] iParsedForms;
        private final String iText;
        private final boolean iUseAfter;
        private final boolean iUseBefore;

        public Separator(String str, String str2, String[] strArr, PeriodPrinter periodPrinter, PeriodParser periodParser, boolean z10, boolean z11) {
            this.iText = str;
            this.iFinalText = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.iParsedForms = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        } else {
                            treeSet.add(strArr[length]);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.iParsedForms = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.iBeforePrinter = periodPrinter;
            this.iBeforeParser = periodParser;
            this.iUseBefore = z10;
            this.iUseAfter = z11;
        }

        public static /* synthetic */ PeriodParser access$000(Separator separator) {
            return separator.iAfterParser;
        }

        public static /* synthetic */ PeriodPrinter access$100(Separator separator) {
            return separator.iAfterPrinter;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        
            if (r0.countFieldsToPrint(r6, 1, r7) > 0) goto L18;
         */
        @Override // org.joda.time.format.PeriodPrinter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int calculatePrintedLength(org.joda.time.ReadablePeriod r6, java.util.Locale r7) {
            /*
                r5 = this;
                r0 = r5
                org.joda.time.format.PeriodPrinter r0 = r0.iBeforePrinter
                r12 = r0
                r0 = r5
                org.joda.time.format.PeriodPrinter r0 = r0.iAfterPrinter
                r11 = r0
                r0 = r12
                r1 = r6
                r2 = r7
                int r0 = r0.calculatePrintedLength(r1, r2)
                r1 = r11
                r2 = r6
                r3 = r7
                int r1 = r1.calculatePrintedLength(r2, r3)
                int r0 = r0 + r1
                r9 = r0
                r0 = r5
                boolean r0 = r0.iUseBefore
                if (r0 == 0) goto L64
                r0 = r9
                r8 = r0
                r0 = r12
                r1 = r6
                r2 = 1
                r3 = r7
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                if (r0 <= 0) goto L8b
                r0 = r5
                boolean r0 = r0.iUseAfter
                if (r0 == 0) goto L7e
                r0 = r11
                r1 = r6
                r2 = 2
                r3 = r7
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                r10 = r0
                r0 = r9
                r8 = r0
                r0 = r10
                if (r0 <= 0) goto L8b
                r0 = r10
                r1 = 1
                if (r0 <= r1) goto L5c
                goto L7e
            L5c:
                r0 = r5
                java.lang.String r0 = r0.iFinalText
                r6 = r0
                goto L83
            L64:
                r0 = r9
                r8 = r0
                r0 = r5
                boolean r0 = r0.iUseAfter
                if (r0 == 0) goto L8b
                r0 = r9
                r8 = r0
                r0 = r11
                r1 = r6
                r2 = 1
                r3 = r7
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                if (r0 <= 0) goto L8b
            L7e:
                r0 = r5
                java.lang.String r0 = r0.iText
                r6 = r0
            L83:
                r0 = r9
                r1 = r6
                int r1 = r1.length()
                int r0 = r0 + r1
                r8 = r0
            L8b:
                r0 = r8
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.Separator.calculatePrintedLength(org.joda.time.ReadablePeriod, java.util.Locale):int");
        }

        @Override // org.joda.time.format.PeriodPrinter
        public int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale) {
            int countFieldsToPrint = this.iBeforePrinter.countFieldsToPrint(readablePeriod, i10, locale);
            int i11 = countFieldsToPrint;
            if (countFieldsToPrint < i10) {
                i11 = countFieldsToPrint + this.iAfterPrinter.countFieldsToPrint(readablePeriod, i10, locale);
            }
            return i11;
        }

        public Separator finish(PeriodPrinter periodPrinter, PeriodParser periodParser) {
            this.iAfterPrinter = periodPrinter;
            this.iAfterParser = periodParser;
            return this;
        }

        @Override // org.joda.time.format.PeriodParser
        public int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale) {
            String str2;
            int parseInto = this.iBeforeParser.parseInto(readWritablePeriod, str, i10, locale);
            if (parseInto < 0) {
                return parseInto;
            }
            int i11 = parseInto;
            int i12 = -1;
            boolean z10 = false;
            if (parseInto > i10) {
                String[] strArr = this.iParsedForms;
                int length = strArr.length;
                int i13 = 0;
                while (true) {
                    i11 = parseInto;
                    i12 = -1;
                    z10 = false;
                    if (i13 >= length) {
                        break;
                    }
                    str2 = strArr[i13];
                    if (str2 == null || str2.length() == 0 || str.regionMatches(true, parseInto, str2, 0, str2.length())) {
                        break;
                    }
                    i13++;
                }
                int length2 = str2 == null ? 0 : str2.length();
                i11 = parseInto + length2;
                z10 = true;
                i12 = length2;
            }
            int parseInto2 = this.iAfterParser.parseInto(readWritablePeriod, str, i11, locale);
            if (parseInto2 < 0) {
                return parseInto2;
            }
            if (z10 && parseInto2 == i11 && i12 > 0) {
                return i11 ^ (-1);
            }
            int i14 = parseInto2;
            if (parseInto2 > i11) {
                i14 = parseInto2;
                if (!z10) {
                    i14 = parseInto2;
                    if (!this.iUseBefore) {
                        i14 = i11 ^ (-1);
                    }
                }
            }
            return i14;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            if (r0.countFieldsToPrint(r7, 1, r8) > 0) goto L18;
         */
        @Override // org.joda.time.format.PeriodPrinter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void printTo(java.io.Writer r6, org.joda.time.ReadablePeriod r7, java.util.Locale r8) {
            /*
                r5 = this;
                r0 = r5
                org.joda.time.format.PeriodPrinter r0 = r0.iBeforePrinter
                r10 = r0
                r0 = r5
                org.joda.time.format.PeriodPrinter r0 = r0.iAfterPrinter
                r11 = r0
                r0 = r10
                r1 = r6
                r2 = r7
                r3 = r8
                r0.printTo(r1, r2, r3)
                r0 = r5
                boolean r0 = r0.iUseBefore
                if (r0 == 0) goto L54
                r0 = r10
                r1 = r7
                r2 = 1
                r3 = r8
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                if (r0 <= 0) goto L74
                r0 = r5
                boolean r0 = r0.iUseAfter
                if (r0 == 0) goto L68
                r0 = r11
                r1 = r7
                r2 = 2
                r3 = r8
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                r9 = r0
                r0 = r9
                if (r0 <= 0) goto L74
                r0 = r9
                r1 = 1
                if (r0 <= r1) goto L4b
                goto L68
            L4b:
                r0 = r5
                java.lang.String r0 = r0.iFinalText
                r10 = r0
                goto L6e
            L54:
                r0 = r5
                boolean r0 = r0.iUseAfter
                if (r0 == 0) goto L74
                r0 = r11
                r1 = r7
                r2 = 1
                r3 = r8
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                if (r0 <= 0) goto L74
            L68:
                r0 = r5
                java.lang.String r0 = r0.iText
                r10 = r0
            L6e:
                r0 = r6
                r1 = r10
                r0.write(r1)
            L74:
                r0 = r11
                r1 = r6
                r2 = r7
                r3 = r8
                r0.printTo(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.Separator.printTo(java.io.Writer, org.joda.time.ReadablePeriod, java.util.Locale):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            if (r0.countFieldsToPrint(r7, 1, r8) > 0) goto L18;
         */
        @Override // org.joda.time.format.PeriodPrinter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void printTo(java.lang.StringBuffer r6, org.joda.time.ReadablePeriod r7, java.util.Locale r8) {
            /*
                r5 = this;
                r0 = r5
                org.joda.time.format.PeriodPrinter r0 = r0.iBeforePrinter
                r10 = r0
                r0 = r5
                org.joda.time.format.PeriodPrinter r0 = r0.iAfterPrinter
                r11 = r0
                r0 = r10
                r1 = r6
                r2 = r7
                r3 = r8
                r0.printTo(r1, r2, r3)
                r0 = r5
                boolean r0 = r0.iUseBefore
                if (r0 == 0) goto L54
                r0 = r10
                r1 = r7
                r2 = 1
                r3 = r8
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                if (r0 <= 0) goto L75
                r0 = r5
                boolean r0 = r0.iUseAfter
                if (r0 == 0) goto L68
                r0 = r11
                r1 = r7
                r2 = 2
                r3 = r8
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                r9 = r0
                r0 = r9
                if (r0 <= 0) goto L75
                r0 = r9
                r1 = 1
                if (r0 <= r1) goto L4b
                goto L68
            L4b:
                r0 = r5
                java.lang.String r0 = r0.iFinalText
                r10 = r0
                goto L6e
            L54:
                r0 = r5
                boolean r0 = r0.iUseAfter
                if (r0 == 0) goto L75
                r0 = r11
                r1 = r7
                r2 = 1
                r3 = r8
                int r0 = r0.countFieldsToPrint(r1, r2, r3)
                if (r0 <= 0) goto L75
            L68:
                r0 = r5
                java.lang.String r0 = r0.iText
                r10 = r0
            L6e:
                r0 = r6
                r1 = r10
                java.lang.StringBuffer r0 = r0.append(r1)
            L75:
                r0 = r11
                r1 = r6
                r2 = r7
                r3 = r8
                r0.printTo(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.PeriodFormatterBuilder.Separator.printTo(java.lang.StringBuffer, org.joda.time.ReadablePeriod, java.util.Locale):void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodFormatterBuilder$SimpleAffix.class */
    public static class SimpleAffix extends IgnorableAffix {
        private final String iText;

        public SimpleAffix(String str) {
            this.iText = str;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int calculatePrintedLength(int i10) {
            return this.iText.length();
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public String[] getAffixes() {
            return new String[]{this.iText};
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int parse(String str, int i10) {
            String str2 = this.iText;
            int length = str2.length();
            return (!str.regionMatches(true, i10, str2, 0, length) || matchesOtherAffix(length, str, i10)) ? i10 ^ (-1) : i10 + length;
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(Writer writer, int i10) {
            writer.write(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public void printTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append(this.iText);
        }

        @Override // org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix
        public int scan(String str, int i10) {
            String str2 = this.iText;
            int length = str2.length();
            int length2 = str.length();
            for (int i11 = i10; i11 < length2; i11++) {
                if (str.regionMatches(true, i11, str2, 0, length) && !matchesOtherAffix(length, str, i11)) {
                    return i11;
                }
                switch (str.charAt(i11)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                }
                return i10 ^ (-1);
            }
            return i10 ^ (-1);
        }
    }

    public PeriodFormatterBuilder() {
        clear();
    }

    private PeriodFormatterBuilder append0(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        this.iElementPairs.add(periodPrinter);
        this.iElementPairs.add(periodParser);
        this.iNotPrinter = (periodPrinter == null) | this.iNotPrinter;
        this.iNotParser |= periodParser == null;
        return this;
    }

    private void appendField(int i10) {
        appendField(i10, this.iMinPrintedDigits);
    }

    private void appendField(int i10, int i11) {
        FieldFormatter fieldFormatter = new FieldFormatter(i11, this.iPrintZeroSetting, this.iMaxParsedDigits, this.iRejectSignedValues, i10, this.iFieldFormatters, this.iPrefix, null);
        append0(fieldFormatter, fieldFormatter);
        this.iFieldFormatters[i10] = fieldFormatter;
        this.iPrefix = null;
    }

    private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix periodFieldAffix) {
        if (periodFieldAffix == null) {
            throw new IllegalArgumentException();
        }
        PeriodFieldAffix periodFieldAffix2 = this.iPrefix;
        PeriodFieldAffix periodFieldAffix3 = periodFieldAffix;
        if (periodFieldAffix2 != null) {
            periodFieldAffix3 = new CompositeAffix(periodFieldAffix2, periodFieldAffix);
        }
        this.iPrefix = periodFieldAffix3;
        return this;
    }

    private PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr, boolean z10, boolean z11) {
        List<Object> list;
        Separator separator;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        clearPrefix();
        List<Object> list2 = this.iElementPairs;
        if (list2.size() == 0) {
            if (z11 && !z10) {
                Literal literal = Literal.EMPTY;
                Separator separator2 = new Separator(str, str2, strArr, literal, literal, z10, z11);
                append0(separator2, separator2);
            }
            return this;
        }
        int size = list2.size();
        while (true) {
            int i10 = size - 1;
            list = list2;
            separator = null;
            if (i10 < 0) {
                break;
            }
            if (list2.get(i10) instanceof Separator) {
                separator = (Separator) list2.get(i10);
                list = list2.subList(i10 + 1, list2.size());
                break;
            }
            size = i10 - 1;
        }
        if (separator != null && list.size() == 0) {
            throw new IllegalStateException("Cannot have two adjacent separators");
        }
        Object[] createComposite = createComposite(list);
        list.clear();
        Separator separator3 = new Separator(str, str2, strArr, (PeriodPrinter) createComposite[0], (PeriodParser) createComposite[1], z10, z11);
        list.add(separator3);
        list.add(separator3);
        return this;
    }

    private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix periodFieldAffix) {
        Object obj;
        Object obj2 = null;
        if (this.iElementPairs.size() > 0) {
            List<Object> list = this.iElementPairs;
            obj2 = list.get(list.size() - 2);
            List<Object> list2 = this.iElementPairs;
            obj = list2.get(list2.size() - 1);
        } else {
            obj = null;
        }
        if (obj2 == null || obj == null || obj2 != obj || !(obj2 instanceof FieldFormatter)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        clearPrefix();
        FieldFormatter fieldFormatter = new FieldFormatter((FieldFormatter) obj2, periodFieldAffix);
        List<Object> list3 = this.iElementPairs;
        list3.set(list3.size() - 2, fieldFormatter);
        List<Object> list4 = this.iElementPairs;
        list4.set(list4.size() - 1, fieldFormatter);
        this.iFieldFormatters[fieldFormatter.getFieldType()] = fieldFormatter;
        return this;
    }

    private void clearPrefix() {
        if (this.iPrefix != null) {
            throw new IllegalStateException("Prefix not followed by field");
        }
        this.iPrefix = null;
    }

    private static Object[] createComposite(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            Literal literal = Literal.EMPTY;
            return new Object[]{literal, literal};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        Composite composite = new Composite(list);
        return new Object[]{composite, composite};
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static org.joda.time.format.PeriodFormatter toFormatter(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */

    public PeriodFormatterBuilder append(PeriodFormatter periodFormatter) {
        if (periodFormatter == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        clearPrefix();
        append0(periodFormatter.getPrinter(), periodFormatter.getParser());
        return this;
    }

    public PeriodFormatterBuilder append(PeriodPrinter periodPrinter, PeriodParser periodParser) {
        if (periodPrinter == null && periodParser == null) {
            throw new IllegalArgumentException("No printer or parser supplied");
        }
        clearPrefix();
        append0(periodPrinter, periodParser);
        return this;
    }

    public PeriodFormatterBuilder appendDays() {
        appendField(3);
        return this;
    }

    public PeriodFormatterBuilder appendHours() {
        appendField(4);
        return this;
    }

    public PeriodFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        clearPrefix();
        Literal literal = new Literal(str);
        append0(literal, literal);
        return this;
    }

    public PeriodFormatterBuilder appendMillis() {
        appendField(7);
        return this;
    }

    public PeriodFormatterBuilder appendMillis3Digit() {
        appendField(7, 3);
        return this;
    }

    public PeriodFormatterBuilder appendMinutes() {
        appendField(5);
        return this;
    }

    public PeriodFormatterBuilder appendMonths() {
        appendField(1);
        return this;
    }

    public PeriodFormatterBuilder appendPrefix(String str) {
        if (str != null) {
            return appendPrefix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendPrefix(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        return appendPrefix(new PluralAffix(str, str2));
    }

    public PeriodFormatterBuilder appendPrefix(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length < 1 || strArr.length != strArr2.length) {
            throw new IllegalArgumentException();
        }
        return appendPrefix(new RegExAffix(strArr, strArr2));
    }

    public PeriodFormatterBuilder appendSeconds() {
        appendField(6);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithMillis() {
        appendField(8);
        return this;
    }

    public PeriodFormatterBuilder appendSecondsWithOptionalMillis() {
        appendField(9);
        return this;
    }

    public PeriodFormatterBuilder appendSeparator(String str) {
        return appendSeparator(str, str, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2) {
        return appendSeparator(str, str2, null, true, true);
    }

    public PeriodFormatterBuilder appendSeparator(String str, String str2, String[] strArr) {
        return appendSeparator(str, str2, strArr, true, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String str) {
        return appendSeparator(str, str, null, false, true);
    }

    public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String str) {
        return appendSeparator(str, str, null, true, false);
    }

    public PeriodFormatterBuilder appendSuffix(String str) {
        if (str != null) {
            return appendSuffix(new SimpleAffix(str));
        }
        throw new IllegalArgumentException();
    }

    public PeriodFormatterBuilder appendSuffix(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        return appendSuffix(new PluralAffix(str, str2));
    }

    public PeriodFormatterBuilder appendSuffix(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length < 1 || strArr.length != strArr2.length) {
            throw new IllegalArgumentException();
        }
        return appendSuffix(new RegExAffix(strArr, strArr2));
    }

    public PeriodFormatterBuilder appendWeeks() {
        appendField(2);
        return this;
    }

    public PeriodFormatterBuilder appendYears() {
        appendField(0);
        return this;
    }

    public void clear() {
        this.iMinPrintedDigits = 1;
        this.iPrintZeroSetting = 2;
        this.iMaxParsedDigits = 10;
        this.iRejectSignedValues = false;
        this.iPrefix = null;
        List<Object> list = this.iElementPairs;
        if (list == null) {
            this.iElementPairs = new ArrayList();
        } else {
            list.clear();
        }
        this.iNotPrinter = false;
        this.iNotParser = false;
        this.iFieldFormatters = new FieldFormatter[10];
    }

    public PeriodFormatterBuilder maximumParsedDigits(int i10) {
        this.iMaxParsedDigits = i10;
        return this;
    }

    public PeriodFormatterBuilder minimumPrintedDigits(int i10) {
        this.iMinPrintedDigits = i10;
        return this;
    }

    public PeriodFormatterBuilder printZeroAlways() {
        this.iPrintZeroSetting = 4;
        return this;
    }

    public PeriodFormatterBuilder printZeroIfSupported() {
        this.iPrintZeroSetting = 3;
        return this;
    }

    public PeriodFormatterBuilder printZeroNever() {
        this.iPrintZeroSetting = 5;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyFirst() {
        this.iPrintZeroSetting = 1;
        return this;
    }

    public PeriodFormatterBuilder printZeroRarelyLast() {
        this.iPrintZeroSetting = 2;
        return this;
    }

    public PeriodFormatterBuilder rejectSignedValues(boolean z10) {
        this.iRejectSignedValues = z10;
        return this;
    }

    public PeriodFormatter toFormatter() {
        PeriodFormatter formatter = toFormatter(this.iElementPairs, this.iNotPrinter, this.iNotParser);
        for (FieldFormatter fieldFormatter : this.iFieldFormatters) {
            if (fieldFormatter != null) {
                fieldFormatter.finish(this.iFieldFormatters);
            }
        }
        this.iFieldFormatters = (FieldFormatter[]) this.iFieldFormatters.clone();
        return formatter;
    }

    public PeriodParser toParser() {
        if (this.iNotParser) {
            return null;
        }
        return toFormatter().getParser();
    }

    public PeriodPrinter toPrinter() {
        if (this.iNotPrinter) {
            return null;
        }
        return toFormatter().getPrinter();
    }
}
