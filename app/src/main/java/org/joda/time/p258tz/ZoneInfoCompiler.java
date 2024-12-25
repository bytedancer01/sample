package org.joda.time.p258tz;

import com.facebook.ads.AdError;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/ZoneInfoCompiler.class */
public class ZoneInfoCompiler {
    public static Chronology cLenientISO;
    public static DateTimeOfYear cStartOfYear;
    public static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() { // from class: org.joda.time.tz.ZoneInfoCompiler.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iLinks = new ArrayList();

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/ZoneInfoCompiler$DateTimeOfYear.class */
    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        public DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }

        public DateTimeOfYear(StringTokenizer stringTokenizer) {
            int i10;
            int i11;
            boolean z10;
            LocalDate localDate;
            LocalDate plusDays;
            int i12 = 0;
            int i13 = 1;
            char c10 = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                i13 = ZoneInfoCompiler.parseMonth(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.startsWith("last")) {
                        i12 = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(4));
                        i11 = -1;
                    } else {
                        try {
                            i11 = Integer.parseInt(nextToken);
                            i12 = 0;
                        } catch (NumberFormatException e10) {
                            int indexOf = nextToken.indexOf(">=");
                            if (indexOf > 0) {
                                i11 = Integer.parseInt(nextToken.substring(indexOf + 2));
                                i12 = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(0, indexOf));
                                z10 = true;
                            } else {
                                int indexOf2 = nextToken.indexOf("<=");
                                if (indexOf2 <= 0) {
                                    throw new IllegalArgumentException(nextToken);
                                }
                                i11 = Integer.parseInt(nextToken.substring(indexOf2 + 2));
                                i12 = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(0, indexOf2));
                            }
                        }
                    }
                    z10 = false;
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken2 = stringTokenizer.nextToken();
                        c10 = ZoneInfoCompiler.parseZoneChar(nextToken2.charAt(nextToken2.length() - 1));
                        String str = nextToken2;
                        if (nextToken2.equals("24:00")) {
                            if (i13 == 12 && i11 == 31) {
                                str = "23:59:59.999";
                            } else {
                                if (i11 == -1) {
                                    localDate = new LocalDate(AdError.INTERNAL_ERROR_CODE, i13, 1);
                                    plusDays = localDate.plusMonths(1);
                                } else {
                                    localDate = new LocalDate(AdError.INTERNAL_ERROR_CODE, i13, i11);
                                    plusDays = localDate.plusDays(1);
                                }
                                z10 = (i11 == -1 || i12 == 0) ? false : true;
                                i13 = plusDays.getMonthOfYear();
                                int dayOfMonth = plusDays.getDayOfMonth();
                                i12 = i12 != 0 ? (((i12 - 1) + 1) % 7) + 1 : i12;
                                i11 = dayOfMonth;
                            }
                        }
                        i10 = ZoneInfoCompiler.parseTime(str);
                        this.iMonthOfYear = i13;
                        this.iDayOfMonth = i11;
                        this.iDayOfWeek = i12;
                        this.iAdvanceDayOfWeek = z10;
                        this.iMillisOfDay = i10;
                        this.iZoneChar = c10;
                    }
                    i10 = 0;
                    this.iMonthOfYear = i13;
                    this.iDayOfMonth = i11;
                    this.iDayOfWeek = i12;
                    this.iAdvanceDayOfWeek = z10;
                    this.iMillisOfDay = i10;
                    this.iZoneChar = c10;
                }
            }
            i10 = 0;
            i11 = 1;
            z10 = false;
            this.iMonthOfYear = i13;
            this.iDayOfMonth = i11;
            this.iDayOfWeek = i12;
            this.iAdvanceDayOfWeek = z10;
            this.iMillisOfDay = i10;
            this.iZoneChar = c10;
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i10) {
            dateTimeZoneBuilder.addCutover(i10, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i10, int i11, int i12) {
            dateTimeZoneBuilder.addRecurringSavings(str, i10, i11, i12, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            return "MonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvanceDayOfWeek + "\nMillisOfDay: " + this.iMillisOfDay + "\nZoneChar: " + this.iZoneChar + "\n";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/ZoneInfoCompiler$Rule.class */
    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        public Rule(StringTokenizer stringTokenizer) {
            this.iName = stringTokenizer.nextToken().intern();
            int parseYear = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
            this.iFromYear = parseYear;
            int parseYear2 = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), parseYear);
            this.iToYear = parseYear2;
            if (parseYear2 < parseYear) {
                throw new IllegalArgumentException();
            }
            this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
            this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
        }

        private String formatName(String str) {
            String str2;
            int indexOf = str.indexOf(47);
            if (indexOf > 0) {
                return (this.iSaveMillis == 0 ? str.substring(0, indexOf) : str.substring(indexOf + 1)).intern();
            }
            int indexOf2 = str.indexOf("%s");
            if (indexOf2 < 0) {
                return str;
            }
            String substring = str.substring(0, indexOf2);
            String substring2 = str.substring(indexOf2 + 2);
            if (this.iLetterS == null) {
                str2 = substring.concat(substring2);
            } else {
                str2 = substring + this.iLetterS + substring2;
            }
            return str2.intern();
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str), this.iSaveMillis, this.iFromYear, this.iToYear);
        }

        public String toString() {
            return "[Rule]\nName: " + this.iName + "\nFromYear: " + this.iFromYear + "\nToYear: " + this.iToYear + "\nType: " + this.iType + "\n" + this.iDateTimeOfYear + "SaveMillis: " + this.iSaveMillis + "\nLetterS: " + this.iLetterS + "\n";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/ZoneInfoCompiler$RuleSet.class */
    public static class RuleSet {
        private List<Rule> iRules;

        public RuleSet(Rule rule) {
            ArrayList arrayList = new ArrayList();
            this.iRules = arrayList;
            arrayList.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str) {
            for (int i10 = 0; i10 < this.iRules.size(); i10++) {
                this.iRules.get(i10).addRecurring(dateTimeZoneBuilder, str);
            }
        }

        public void addRule(Rule rule) {
            if (!rule.iName.equals(this.iRules.get(0).iName)) {
                throw new IllegalArgumentException("Rule name mismatch");
            }
            this.iRules.add(rule);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/ZoneInfoCompiler$Zone.class */
    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        private Zone(String str, StringTokenizer stringTokenizer) {
            int i10;
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                int parseInt = Integer.parseInt(stringTokenizer.nextToken());
                i10 = parseInt;
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                    i10 = parseInt;
                }
            } else {
                i10 = Integer.MAX_VALUE;
            }
            this.iUntilYear = i10;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        public Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                String str = zone.iRules;
                if (str == null) {
                    dateTimeZoneBuilder.setFixedSavings(zone.iFormat, 0);
                } else {
                    try {
                        dateTimeZoneBuilder.setFixedSavings(zone.iFormat, ZoneInfoCompiler.parseTime(str));
                    } catch (Exception e10) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet == null) {
                            throw new IllegalArgumentException("Rules not found: " + zone.iRules);
                        }
                        ruleSet.addRecurring(dateTimeZoneBuilder, zone.iFormat);
                    }
                }
                int i10 = zone.iUntilYear;
                if (i10 == Integer.MAX_VALUE) {
                    return;
                }
                zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, i10);
                zone = zone.iNext;
            }
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }

        public void chain(StringTokenizer stringTokenizer) {
            Zone zone = this.iNext;
            if (zone != null) {
                zone.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.iName + "\nOffsetMillis: " + this.iOffsetMillis + "\nRules: " + this.iRules + "\nFormat: " + this.iFormat + "\nUntilYear: " + this.iUntilYear + "\n" + this.iUntilDateTimeOfYear;
            if (this.iNext == null) {
                return str;
            }
            return str + "...\n" + this.iNext.toString();
        }
    }

    public static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    public static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if ("-?".equals(r5[r6]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        printUsage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void main(java.lang.String[] r5) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p258tz.ZoneInfoCompiler.main(java.lang.String[]):void");
    }

    public static int parseDayOfWeek(String str) {
        DateTimeField dayOfWeek = ISOChronology.getInstanceUTC().dayOfWeek();
        return dayOfWeek.get(dayOfWeek.set(0L, str, Locale.ENGLISH));
    }

    public static int parseMonth(String str) {
        DateTimeField monthOfYear = ISOChronology.getInstanceUTC().monthOfYear();
        return monthOfYear.get(monthOfYear.set(0L, str, Locale.ENGLISH));
    }

    public static String parseOptional(String str) {
        String str2 = str;
        if (str.equals("-")) {
            str2 = null;
        }
        return str2;
    }

    public static int parseTime(String str) {
        DateTimeFormatter hourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        boolean startsWith = str.startsWith("-");
        if (hourMinuteSecondFraction.parseInto(mutableDateTime, str, startsWith ? 1 : 0) == ((startsWith ? 1 : 0) ^ (-1))) {
            throw new IllegalArgumentException(str);
        }
        int millis = (int) mutableDateTime.getMillis();
        int i10 = millis;
        if (startsWith) {
            i10 = -millis;
        }
        return i10;
    }

    public static int parseYear(String str, int i10) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION;
        }
        if (lowerCase.equals("maximum") || lowerCase.equals("max")) {
            return Integer.MAX_VALUE;
        }
        return lowerCase.equals("only") ? i10 : Integer.parseInt(lowerCase);
    }

    public static char parseZoneChar(char c10) {
        if (c10 == 'G') {
            return 'u';
        }
        if (c10 == 'S') {
            return 's';
        }
        if (c10 == 'U' || c10 == 'Z' || c10 == 'g') {
            return 'u';
        }
        if (c10 != 's') {
            return (c10 == 'u' || c10 == 'z') ? 'u' : 'w';
        }
        return 's';
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b4, code lost:
    
        r8.append(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014c, code lost:
    
        r11 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
        r0 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
        r9 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0172, code lost:
    
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0176, code lost:
    
        if (r9 < 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0179, code lost:
    
        r0 = r8.previousTransition(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0186, code lost:
    
        if (r0 == r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018e, code lost:
    
        if (r0 >= r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0194, code lost:
    
        r0 = ((java.lang.Long) r0.get(r9)).longValue() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ab, code lost:
    
        if (r0 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0206, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ae, code lost:
    
        r7 = java.lang.System.out;
        r0 = new java.lang.StringBuilder();
        r0.append("*r* Error in ");
        r0.append(r8.getID());
        r0.append(" ");
        r0.append(new org.joda.time.DateTime(r0, org.joda.time.chrono.ISOChronology.getInstanceUTC()));
        r0.append(" != ");
        r17 = new org.joda.time.DateTime(r0, org.joda.time.chrono.ISOChronology.getInstanceUTC());
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean test(java.lang.String r7, org.joda.time.DateTimeZone r8) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p258tz.ZoneInfoCompiler.test(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    public static boolean verbose() {
        return cVerbose.get().booleanValue();
    }

    public static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) {
        HashMap hashMap = new HashMap(map.size());
        TreeMap treeMap = new TreeMap();
        short s10 = 0;
        for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
            String key = entry.getKey();
            short s11 = s10;
            if (!hashMap.containsKey(key)) {
                Short valueOf = Short.valueOf(s10);
                hashMap.put(key, valueOf);
                treeMap.put(valueOf, key);
                s11 = (short) (s10 + 1);
                if (s11 == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
            String id2 = entry.getValue().getID();
            s10 = s11;
            if (!hashMap.containsKey(id2)) {
                Short valueOf2 = Short.valueOf(s11);
                hashMap.put(id2, valueOf2);
                treeMap.put(valueOf2, id2);
                s10 = (short) (s11 + 1);
                if (s10 == 0) {
                    throw new InternalError("Too many time zone ids");
                }
            }
        }
        dataOutputStream.writeShort(treeMap.size());
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            dataOutputStream.writeUTF((String) it.next());
        }
        dataOutputStream.writeShort(map.size());
        for (Map.Entry<String, DateTimeZone> entry2 : map.entrySet()) {
            dataOutputStream.writeShort(((Short) hashMap.get(entry2.getKey())).shortValue());
            dataOutputStream.writeShort(((Short) hashMap.get(entry2.getValue().getID())).shortValue());
        }
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) {
        if (fileArr != null) {
            for (File file2 : fileArr) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file2));
                parseDataFile(bufferedReader);
                bufferedReader.close();
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Destination directory doesn't exist and cannot be created: " + file);
            }
            if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i10 = 0; i10 < this.iZones.size(); i10++) {
            Zone zone = this.iZones.get(i10);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                if (file == null) {
                    continue;
                } else {
                    if (verbose()) {
                        System.out.println("Writing " + dateTimeZone.getID());
                    }
                    File file3 = new File(file, dateTimeZone.getID());
                    if (!file3.getParentFile().exists()) {
                        file3.getParentFile().mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        dateTimeZoneBuilder.writeTo(zone.iName, fileOutputStream);
                        fileOutputStream.close();
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        DateTimeZone readFrom = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
                        fileInputStream.close();
                        if (!dateTimeZone.equals(readFrom)) {
                            System.out.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
                        }
                    } catch (Throwable th2) {
                        fileOutputStream.close();
                        throw th2;
                    }
                }
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            for (int i12 = 0; i12 < this.iLinks.size(); i12 += 2) {
                String str = this.iLinks.get(i12);
                String str2 = this.iLinks.get(i12 + 1);
                DateTimeZone dateTimeZone2 = (DateTimeZone) treeMap.get(str);
                if (dateTimeZone2 != null) {
                    treeMap.put(str2, dateTimeZone2);
                } else if (i11 > 0) {
                    System.out.println("Cannot find time zone '" + str + "' to link alias '" + str2 + "' to");
                }
            }
        }
        if (file != null) {
            System.out.println("Writing ZoneInfoMap");
            File file4 = new File(file, "ZoneInfoMap");
            if (!file4.getParentFile().exists()) {
                file4.getParentFile().mkdirs();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file4));
            try {
                TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                treeMap2.putAll(treeMap);
                writeZoneInfoMap(dataOutputStream, treeMap2);
            } finally {
                dataOutputStream.close();
            }
        }
        return treeMap;
    }

    public void parseDataFile(BufferedReader bufferedReader) {
        Zone zone;
        loop0: while (true) {
            zone = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                String trim = readLine.trim();
                if (trim.length() != 0 && trim.charAt(0) != '#') {
                    int indexOf = readLine.indexOf(35);
                    String str = readLine;
                    if (indexOf >= 0) {
                        str = readLine.substring(0, indexOf);
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(str, " \t");
                    if (!Character.isWhitespace(str.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                        if (zone != null) {
                            this.iZones.add(zone);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            String nextToken = stringTokenizer.nextToken();
                            if (nextToken.equalsIgnoreCase("Rule")) {
                                Rule rule = new Rule(stringTokenizer);
                                RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                                if (ruleSet == null) {
                                    this.iRuleSets.put(rule.iName, new RuleSet(rule));
                                } else {
                                    ruleSet.addRule(rule);
                                }
                            } else if (nextToken.equalsIgnoreCase("Zone")) {
                                zone = new Zone(stringTokenizer);
                            } else if (nextToken.equalsIgnoreCase("Link")) {
                                this.iLinks.add(stringTokenizer.nextToken());
                                this.iLinks.add(stringTokenizer.nextToken());
                            } else {
                                System.out.println("Unknown line: " + str);
                            }
                        }
                    } else if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                }
            }
        }
        if (zone != null) {
            this.iZones.add(zone);
        }
    }
}
