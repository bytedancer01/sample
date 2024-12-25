package org.apache.commons.net.ftp.parser;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.apache.commons.net.ftp.Configurable;
import org.apache.commons.net.ftp.FTPClientConfig;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ftp/parser/FTPTimestampParserImpl.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ftp/parser/FTPTimestampParserImpl.class */
public class FTPTimestampParserImpl implements FTPTimestampParser, Configurable {
    private static final int[] CALENDAR_UNITS = {14, 13, 12, 11, 5, 2, 1};
    private SimpleDateFormat defaultDateFormat;
    private int defaultDateSmallestUnitIndex;
    private boolean lenientFutureDates = false;
    private SimpleDateFormat recentDateFormat;
    private int recentDateSmallestUnitIndex;

    public FTPTimestampParserImpl() {
        setDefaultDateFormat("MMM d yyyy", null);
        setRecentDateFormat("MMM d HH:mm", null);
    }

    private static int getEntry(SimpleDateFormat simpleDateFormat) {
        int i10;
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c10 : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c10) != -1) {
                if (c10 == 'H') {
                    i10 = 11;
                } else if (c10 == 'M') {
                    i10 = 2;
                } else if (c10 == 'S') {
                    i10 = 14;
                } else if (c10 == 'd') {
                    i10 = 5;
                } else if (c10 == 'm') {
                    i10 = 12;
                } else if (c10 == 's') {
                    i10 = 13;
                }
                return indexOf(i10);
            }
        }
        return 0;
    }

    private static int indexOf(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = CALENDAR_UNITS;
            if (i11 >= iArr.length) {
                return 0;
            }
            if (i10 == iArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    private void setDefaultDateFormat(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.defaultDateFormat = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.defaultDateFormat = new SimpleDateFormat(str);
            }
            this.defaultDateFormat.setLenient(false);
        } else {
            this.defaultDateFormat = null;
        }
        this.defaultDateSmallestUnitIndex = getEntry(this.defaultDateFormat);
    }

    private static void setPrecision(int i10, Calendar calendar) {
        if (i10 <= 0) {
            return;
        }
        int i11 = CALENDAR_UNITS[i10 - 1];
        if (calendar.get(i11) != 0) {
            return;
        }
        calendar.clear(i11);
    }

    private void setRecentDateFormat(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.recentDateFormat = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.recentDateFormat = new SimpleDateFormat(str);
            }
            this.recentDateFormat.setLenient(false);
        } else {
            this.recentDateFormat = null;
        }
        this.recentDateSmallestUnitIndex = getEntry(this.recentDateFormat);
    }

    private void setServerTimeZone(String str) {
        TimeZone timeZone = TimeZone.getDefault();
        if (str != null) {
            timeZone = TimeZone.getTimeZone(str);
        }
        this.defaultDateFormat.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = this.recentDateFormat;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
    }

    @Override // org.apache.commons.net.ftp.Configurable
    public void configure(FTPClientConfig fTPClientConfig) {
        DateFormatSymbols lookupDateFormatSymbols;
        String serverLanguageCode = fTPClientConfig.getServerLanguageCode();
        String shortMonthNames = fTPClientConfig.getShortMonthNames();
        if (shortMonthNames != null) {
            lookupDateFormatSymbols = FTPClientConfig.getDateFormatSymbols(shortMonthNames);
        } else {
            if (serverLanguageCode == null) {
                serverLanguageCode = "en";
            }
            lookupDateFormatSymbols = FTPClientConfig.lookupDateFormatSymbols(serverLanguageCode);
        }
        setRecentDateFormat(fTPClientConfig.getRecentDateFormatStr(), lookupDateFormatSymbols);
        String defaultDateFormatStr = fTPClientConfig.getDefaultDateFormatStr();
        if (defaultDateFormatStr == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        setDefaultDateFormat(defaultDateFormatStr, lookupDateFormatSymbols);
        setServerTimeZone(fTPClientConfig.getServerTimeZoneId());
        this.lenientFutureDates = fTPClientConfig.isLenientFutureDates();
    }

    public SimpleDateFormat getDefaultDateFormat() {
        return this.defaultDateFormat;
    }

    public String getDefaultDateFormatString() {
        return this.defaultDateFormat.toPattern();
    }

    public SimpleDateFormat getRecentDateFormat() {
        return this.recentDateFormat;
    }

    public String getRecentDateFormatString() {
        return this.recentDateFormat.toPattern();
    }

    public TimeZone getServerTimeZone() {
        return this.defaultDateFormat.getTimeZone();
    }

    public String[] getShortMonths() {
        return this.defaultDateFormat.getDateFormatSymbols().getShortMonths();
    }

    public boolean isLenientFutureDates() {
        return this.lenientFutureDates;
    }

    @Override // org.apache.commons.net.ftp.parser.FTPTimestampParser
    public Calendar parseTimestamp(String str) {
        return parseTimestamp(str, Calendar.getInstance());
    }

    public Calendar parseTimestamp(String str, Calendar calendar) {
        int i10;
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(getServerTimeZone());
        if (this.recentDateFormat != null) {
            Calendar calendar3 = (Calendar) calendar.clone();
            calendar3.setTimeZone(getServerTimeZone());
            if (this.lenientFutureDates) {
                calendar3.add(5, 1);
            }
            String str2 = str + " " + Integer.toString(calendar3.get(1));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.recentDateFormat.toPattern() + " yyyy", this.recentDateFormat.getDateFormatSymbols());
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(this.recentDateFormat.getTimeZone());
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = simpleDateFormat.parse(str2, parsePosition);
            if (parse != null && parsePosition.getIndex() == str2.length()) {
                calendar2.setTime(parse);
                if (calendar2.after(calendar3)) {
                    calendar2.add(1, -1);
                }
                i10 = this.recentDateSmallestUnitIndex;
                setPrecision(i10, calendar2);
                return calendar2;
            }
        }
        ParsePosition parsePosition2 = new ParsePosition(0);
        Date parse2 = this.defaultDateFormat.parse(str, parsePosition2);
        if (parse2 != null && parsePosition2.getIndex() == str.length()) {
            calendar2.setTime(parse2);
            i10 = this.defaultDateSmallestUnitIndex;
            setPrecision(i10, calendar2);
            return calendar2;
        }
        throw new ParseException("Timestamp '" + str + "' could not be parsed using a server time of " + calendar.getTime().toString(), parsePosition2.getErrorIndex());
    }

    public void setLenientFutureDates(boolean z10) {
        this.lenientFutureDates = z10;
    }
}
