package org.joda.time.format;

import java.util.Collection;
import org.joda.time.DateTimeFieldType;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/ISODateTimeFormat.class */
public class ISODateTimeFormat {

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/ISODateTimeFormat$Constants.class */
    public static final class Constants {

        /* renamed from: ye */
        private static final DateTimeFormatter f36200ye = yearElement();
        private static final DateTimeFormatter mye = monthElement();
        private static final DateTimeFormatter dme = dayOfMonthElement();

        /* renamed from: we */
        private static final DateTimeFormatter f36198we = weekyearElement();
        private static final DateTimeFormatter wwe = weekElement();
        private static final DateTimeFormatter dwe = dayOfWeekElement();
        private static final DateTimeFormatter dye = dayOfYearElement();
        private static final DateTimeFormatter hde = hourElement();
        private static final DateTimeFormatter mhe = minuteElement();
        private static final DateTimeFormatter sme = secondElement();
        private static final DateTimeFormatter fse = fractionElement();

        /* renamed from: ze */
        private static final DateTimeFormatter f36202ze = offsetElement();
        private static final DateTimeFormatter lte = literalTElement();

        /* renamed from: ym */
        private static final DateTimeFormatter f36201ym = yearMonth();
        private static final DateTimeFormatter ymd = yearMonthDay();

        /* renamed from: ww */
        private static final DateTimeFormatter f36199ww = weekyearWeek();
        private static final DateTimeFormatter wwd = weekyearWeekDay();

        /* renamed from: hm */
        private static final DateTimeFormatter f36192hm = hourMinute();
        private static final DateTimeFormatter hms = hourMinuteSecond();
        private static final DateTimeFormatter hmsl = hourMinuteSecondMillis();
        private static final DateTimeFormatter hmsf = hourMinuteSecondFraction();

        /* renamed from: dh */
        private static final DateTimeFormatter f36189dh = dateHour();
        private static final DateTimeFormatter dhm = dateHourMinute();
        private static final DateTimeFormatter dhms = dateHourMinuteSecond();
        private static final DateTimeFormatter dhmsl = dateHourMinuteSecondMillis();
        private static final DateTimeFormatter dhmsf = dateHourMinuteSecondFraction();

        /* renamed from: t */
        private static final DateTimeFormatter f36194t = time();

        /* renamed from: tx */
        private static final DateTimeFormatter f36197tx = timeNoMillis();

        /* renamed from: tt */
        private static final DateTimeFormatter f36196tt = tTime();
        private static final DateTimeFormatter ttx = tTimeNoMillis();

        /* renamed from: dt */
        private static final DateTimeFormatter f36191dt = dateTime();
        private static final DateTimeFormatter dtx = dateTimeNoMillis();
        private static final DateTimeFormatter wdt = weekDateTime();
        private static final DateTimeFormatter wdtx = weekDateTimeNoMillis();

        /* renamed from: od */
        private static final DateTimeFormatter f36193od = ordinalDate();
        private static final DateTimeFormatter odt = ordinalDateTime();
        private static final DateTimeFormatter odtx = ordinalDateTimeNoMillis();

        /* renamed from: bd */
        private static final DateTimeFormatter f36187bd = basicDate();

        /* renamed from: bt */
        private static final DateTimeFormatter f36188bt = basicTime();
        private static final DateTimeFormatter btx = basicTimeNoMillis();
        private static final DateTimeFormatter btt = basicTTime();
        private static final DateTimeFormatter bttx = basicTTimeNoMillis();
        private static final DateTimeFormatter bdt = basicDateTime();
        private static final DateTimeFormatter bdtx = basicDateTimeNoMillis();
        private static final DateTimeFormatter bod = basicOrdinalDate();
        private static final DateTimeFormatter bodt = basicOrdinalDateTime();
        private static final DateTimeFormatter bodtx = basicOrdinalDateTimeNoMillis();
        private static final DateTimeFormatter bwd = basicWeekDate();
        private static final DateTimeFormatter bwdt = basicWeekDateTime();
        private static final DateTimeFormatter bwdtx = basicWeekDateTimeNoMillis();
        private static final DateTimeFormatter dpe = dateElementParser();
        private static final DateTimeFormatter tpe = timeElementParser();

        /* renamed from: dp */
        private static final DateTimeFormatter f36190dp = dateParser();
        private static final DateTimeFormatter ldp = localDateParser();

        /* renamed from: tp */
        private static final DateTimeFormatter f36195tp = timeParser();
        private static final DateTimeFormatter ltp = localTimeParser();
        private static final DateTimeFormatter dtp = dateTimeParser();
        private static final DateTimeFormatter dotp = dateOptionalTimeParser();
        private static final DateTimeFormatter ldotp = localDateOptionalTimeParser();

        private static DateTimeFormatter basicDate() {
            DateTimeFormatter dateTimeFormatter = f36187bd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicDateTime() {
            DateTimeFormatter dateTimeFormatter = bdt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bdtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicOrdinalDate() {
            DateTimeFormatter dateTimeFormatter = bod;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicOrdinalDateTime() {
            DateTimeFormatter dateTimeFormatter = bodt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bodtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTTime() {
            DateTimeFormatter dateTimeFormatter = btt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bttx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTime() {
            DateTimeFormatter dateTimeFormatter = f36188bt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = btx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicWeekDate() {
            DateTimeFormatter dateTimeFormatter = bwd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicWeekDateTime() {
            DateTimeFormatter dateTimeFormatter = bwdt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bwdtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateElementParser() {
            DateTimeFormatter dateTimeFormatter = dpe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser()}).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHour() {
            DateTimeFormatter dateTimeFormatter = f36189dh;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(ISODateTimeFormat.hour()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinute() {
            DateTimeFormatter dateTimeFormatter = dhm;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinute()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = dhms;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = dhmsf;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateHourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = dhmsl;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = dotp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateParser() {
            DateTimeFormatter dateTimeFormatter = f36190dp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateTime() {
            DateTimeFormatter dateTimeFormatter = f36191dt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = dtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dateTimeParser() {
            DateTimeFormatter dateTimeFormatter = dtp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser(), dateOptionalTimeParser().getParser()}).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dayOfMonthElement() {
            DateTimeFormatter dateTimeFormatter = dme;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfMonth(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dayOfWeekElement() {
            DateTimeFormatter dateTimeFormatter = dwe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfWeek(1).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter dayOfYearElement() {
            DateTimeFormatter dateTimeFormatter = dye;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfYear(3).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter fractionElement() {
            DateTimeFormatter dateTimeFormatter = fse;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourElement() {
            DateTimeFormatter dateTimeFormatter = hde;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinute() {
            DateTimeFormatter dateTimeFormatter = f36192hm;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = hms;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = hmsf;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter hourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = hmsl;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter literalTElement() {
            DateTimeFormatter dateTimeFormatter = lte;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('T').toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter localDateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = ldotp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser()).toFormatter().withZoneUTC();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter localDateParser() {
            DateTimeFormatter dateTimeFormatter = ldp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = dateElementParser().withZoneUTC();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter localTimeParser() {
            DateTimeFormatter dateTimeFormatter = ltp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter minuteElement() {
            DateTimeFormatter dateTimeFormatter = mhe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral(':').appendMinuteOfHour(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter monthElement() {
            DateTimeFormatter dateTimeFormatter = mye;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter offsetElement() {
            DateTimeFormatter dateTimeFormatter = f36202ze;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter ordinalDate() {
            DateTimeFormatter dateTimeFormatter = f36193od;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter ordinalDateTime() {
            DateTimeFormatter dateTimeFormatter = odt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter ordinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = odtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter secondElement() {
            DateTimeFormatter dateTimeFormatter = sme;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral(':').appendSecondOfMinute(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter tTime() {
            DateTimeFormatter dateTimeFormatter = f36196tt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter tTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = ttx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter time() {
            DateTimeFormatter dateTimeFormatter = f36194t;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter timeElementParser() {
            DateTimeFormatter dateTimeFormatter = tpe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                DateTimeParser parser = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('.').toParser(), new DateTimeFormatterBuilder().appendLiteral(',').toParser()}).toParser();
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(minuteElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(parser).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfMinute(1, 9).toParser(), null}).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfHour(1, 9).toParser(), null}).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter timeNoMillis() {
            DateTimeFormatter dateTimeFormatter = f36197tx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter timeParser() {
            DateTimeFormatter dateTimeFormatter = f36195tp;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekDateTime() {
            DateTimeFormatter dateTimeFormatter = wdt;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTime()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = wdtx;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTimeNoMillis()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekElement() {
            DateTimeFormatter dateTimeFormatter = wwe;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekyearElement() {
            DateTimeFormatter dateTimeFormatter = f36198we;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekyearWeek() {
            DateTimeFormatter dateTimeFormatter = f36199ww;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter weekyearWeekDay() {
            DateTimeFormatter dateTimeFormatter = wwd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter yearElement() {
            DateTimeFormatter dateTimeFormatter = f36200ye;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter yearMonth() {
            DateTimeFormatter dateTimeFormatter = f36201ym;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }

        private static DateTimeFormatter yearMonthDay() {
            DateTimeFormatter dateTimeFormatter = ymd;
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            if (dateTimeFormatter == null) {
                dateTimeFormatter2 = new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter();
            }
            return dateTimeFormatter2;
        }
    }

    private static void appendSeparator(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z10) {
        if (z10) {
            dateTimeFormatterBuilder.appendLiteral('-');
        }
    }

    public static DateTimeFormatter basicDate() {
        return Constants.f36187bd;
    }

    public static DateTimeFormatter basicDateTime() {
        return Constants.bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis() {
        return Constants.bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate() {
        return Constants.bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime() {
        return Constants.bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
        return Constants.bodtx;
    }

    public static DateTimeFormatter basicTTime() {
        return Constants.btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis() {
        return Constants.bttx;
    }

    public static DateTimeFormatter basicTime() {
        return Constants.f36188bt;
    }

    public static DateTimeFormatter basicTimeNoMillis() {
        return Constants.btx;
    }

    public static DateTimeFormatter basicWeekDate() {
        return Constants.bwd;
    }

    public static DateTimeFormatter basicWeekDateTime() {
        return Constants.bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis() {
        return Constants.bwdtx;
    }

    private static void checkNotStrictISO(Collection<DateTimeFieldType> collection, boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
        }
    }

    public static DateTimeFormatter date() {
        return yearMonthDay();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r4.remove(org.joda.time.DateTimeFieldType.dayOfMonth()) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean dateByMonth(org.joda.time.format.DateTimeFormatterBuilder r3, java.util.Collection<org.joda.time.DateTimeFieldType> r4, boolean r5, boolean r6) {
        /*
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.year()
            boolean r0 = r0.remove(r1)
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L65
            r0 = r3
            org.joda.time.format.DateTimeFormatter r1 = org.joda.time.format.ISODateTimeFormat.Constants.access$000()
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.append(r1)
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.monthOfYear()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L51
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfMonth()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L41
            r0 = r3
            r1 = r5
            appendSeparator(r0, r1)
            r0 = r3
            r1 = 2
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendMonthOfYear(r1)
            goto L91
        L41:
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 2
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendMonthOfYear(r1)
            goto Lc3
        L51:
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfMonth()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto Lc3
            r0 = r4
            r1 = r6
            checkNotStrictISO(r0, r1)
            goto Lac
        L65:
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.monthOfYear()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L99
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 2
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendMonthOfYear(r1)
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfMonth()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto Lc3
        L91:
            r0 = r3
            r1 = r5
            appendSeparator(r0, r1)
            goto Lba
        L99:
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfMonth()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto Lc0
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
        Lac:
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
        Lba:
            r0 = r3
            r1 = 2
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendDayOfMonth(r1)
        Lc0:
            r0 = 0
            r7 = r0
        Lc3:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.ISODateTimeFormat.dateByMonth(org.joda.time.format.DateTimeFormatterBuilder, java.util.Collection, boolean, boolean):boolean");
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z10, boolean z11) {
        boolean z12;
        if (!collection.remove(DateTimeFieldType.year())) {
            if (collection.remove(DateTimeFieldType.dayOfYear())) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            z12 = false;
            return z12;
        }
        dateTimeFormatterBuilder.append(Constants.f36200ye);
        if (!collection.remove(DateTimeFieldType.dayOfYear())) {
            z12 = true;
            return z12;
        }
        appendSeparator(dateTimeFormatterBuilder, z10);
        dateTimeFormatterBuilder.appendDayOfYear(3);
        z12 = false;
        return z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008d, code lost:
    
        appendSeparator(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r4.remove(org.joda.time.DateTimeFieldType.dayOfWeek()) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (r4.remove(org.joda.time.DateTimeFieldType.dayOfWeek()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean dateByWeek(org.joda.time.format.DateTimeFormatterBuilder r3, java.util.Collection<org.joda.time.DateTimeFieldType> r4, boolean r5, boolean r6) {
        /*
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.weekyear()
            boolean r0 = r0.remove(r1)
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L61
            r0 = r3
            org.joda.time.format.DateTimeFormatter r1 = org.joda.time.format.ISODateTimeFormat.Constants.access$100()
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.append(r1)
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.weekOfWeekyear()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L48
            r0 = r3
            r1 = r5
            appendSeparator(r0, r1)
            r0 = r3
            r1 = 87
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 2
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendWeekOfWeekyear(r1)
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfWeek()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto Lbf
            goto L8d
        L48:
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfWeek()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto Lbf
            r0 = r4
            r1 = r6
            checkNotStrictISO(r0, r1)
            r0 = r3
            r1 = r5
            appendSeparator(r0, r1)
            goto La8
        L61:
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.weekOfWeekyear()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L95
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 87
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 2
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendWeekOfWeekyear(r1)
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfWeek()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto Lbf
        L8d:
            r0 = r3
            r1 = r5
            appendSeparator(r0, r1)
            goto Lb6
        L95:
            r0 = r4
            org.joda.time.DateTimeFieldType r1 = org.joda.time.DateTimeFieldType.dayOfWeek()
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto Lbc
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
        La8:
            r0 = r3
            r1 = 87
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
            r0 = r3
            r1 = 45
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendLiteral(r1)
        Lb6:
            r0 = r3
            r1 = 1
            org.joda.time.format.DateTimeFormatterBuilder r0 = r0.appendDayOfWeek(r1)
        Lbc:
            r0 = 0
            r7 = r0
        Lbf:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.ISODateTimeFormat.dateByWeek(org.joda.time.format.DateTimeFormatterBuilder, java.util.Collection, boolean, boolean):boolean");
    }

    public static DateTimeFormatter dateElementParser() {
        return Constants.dpe;
    }

    public static DateTimeFormatter dateHour() {
        return Constants.f36189dh;
    }

    public static DateTimeFormatter dateHourMinute() {
        return Constants.dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond() {
        return Constants.dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction() {
        return Constants.dhmsf;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis() {
        return Constants.dhmsl;
    }

    public static DateTimeFormatter dateOptionalTimeParser() {
        return Constants.dotp;
    }

    public static DateTimeFormatter dateParser() {
        return Constants.f36190dp;
    }

    public static DateTimeFormatter dateTime() {
        return Constants.f36191dt;
    }

    public static DateTimeFormatter dateTimeNoMillis() {
        return Constants.dtx;
    }

    public static DateTimeFormatter dateTimeParser() {
        return Constants.dtp;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.joda.time.format.DateTimeFormatter forFields(java.util.Collection<org.joda.time.DateTimeFieldType> r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.ISODateTimeFormat.forFields(java.util.Collection, boolean, boolean):org.joda.time.format.DateTimeFormatter");
    }

    public static DateTimeFormatter hour() {
        return Constants.hde;
    }

    public static DateTimeFormatter hourMinute() {
        return Constants.f36192hm;
    }

    public static DateTimeFormatter hourMinuteSecond() {
        return Constants.hms;
    }

    public static DateTimeFormatter hourMinuteSecondFraction() {
        return Constants.hmsf;
    }

    public static DateTimeFormatter hourMinuteSecondMillis() {
        return Constants.hmsl;
    }

    public static DateTimeFormatter localDateOptionalTimeParser() {
        return Constants.ldotp;
    }

    public static DateTimeFormatter localDateParser() {
        return Constants.ldp;
    }

    public static DateTimeFormatter localTimeParser() {
        return Constants.ltp;
    }

    public static DateTimeFormatter ordinalDate() {
        return Constants.f36193od;
    }

    public static DateTimeFormatter ordinalDateTime() {
        return Constants.odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis() {
        return Constants.odtx;
    }

    public static DateTimeFormatter tTime() {
        return Constants.f36196tt;
    }

    public static DateTimeFormatter tTimeNoMillis() {
        return Constants.ttx;
    }

    public static DateTimeFormatter time() {
        return Constants.f36194t;
    }

    private static void time(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean remove = collection.remove(DateTimeFieldType.hourOfDay());
        boolean remove2 = collection.remove(DateTimeFieldType.minuteOfHour());
        boolean remove3 = collection.remove(DateTimeFieldType.secondOfMinute());
        boolean remove4 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (remove || remove2 || remove3 || remove4) {
            if (remove || remove2 || remove3 || remove4) {
                if (z11 && z12) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Date was reduced precision: " + collection);
                }
                if (z13) {
                    dateTimeFormatterBuilder.appendLiteral('T');
                }
            }
            if ((!remove || !remove2 || !remove3) && (!remove || remove3 || remove4)) {
                if (z11 && z13) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields because Time was truncated: " + collection);
                }
                if ((remove || ((!remove2 || !remove3) && ((!remove2 || remove4) && !remove3))) && z11) {
                    throw new IllegalArgumentException("No valid ISO8601 format for fields: " + collection);
                }
            }
            if (remove) {
                dateTimeFormatterBuilder.appendHourOfDay(2);
            } else if (remove2 || remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z10 && remove && remove2) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove2) {
                dateTimeFormatterBuilder.appendMinuteOfHour(2);
            } else if (remove3 || remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z10 && remove2 && remove3) {
                dateTimeFormatterBuilder.appendLiteral(':');
            }
            if (remove3) {
                dateTimeFormatterBuilder.appendSecondOfMinute(2);
            } else if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (remove4) {
                dateTimeFormatterBuilder.appendLiteral('.');
                dateTimeFormatterBuilder.appendMillisOfSecond(3);
            }
        }
    }

    public static DateTimeFormatter timeElementParser() {
        return Constants.tpe;
    }

    public static DateTimeFormatter timeNoMillis() {
        return Constants.f36197tx;
    }

    public static DateTimeFormatter timeParser() {
        return Constants.f36195tp;
    }

    public static DateTimeFormatter weekDate() {
        return Constants.wwd;
    }

    public static DateTimeFormatter weekDateTime() {
        return Constants.wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis() {
        return Constants.wdtx;
    }

    public static DateTimeFormatter weekyear() {
        return Constants.f36198we;
    }

    public static DateTimeFormatter weekyearWeek() {
        return Constants.f36199ww;
    }

    public static DateTimeFormatter weekyearWeekDay() {
        return Constants.wwd;
    }

    public static DateTimeFormatter year() {
        return Constants.f36200ye;
    }

    public static DateTimeFormatter yearMonth() {
        return Constants.f36201ym;
    }

    public static DateTimeFormatter yearMonthDay() {
        return Constants.ymd;
    }
}
