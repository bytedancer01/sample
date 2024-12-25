package org.apache.http.impl.cookie;

import java.util.BitSet;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.InterfaceC7038SM;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/impl/cookie/LaxExpiresHandler.class */
public class LaxExpiresHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    private static final Pattern DAY_OF_MONTH_PATTERN;
    private static final BitSet DELIMS;
    private static final Map<String, Integer> MONTHS;
    private static final Pattern MONTH_PATTERN;
    private static final Pattern TIME_PATTERN;
    public static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Pattern YEAR_PATTERN;

    static {
        BitSet bitSet = new BitSet();
        bitSet.set(9);
        for (int i10 = 32; i10 <= 47; i10++) {
            bitSet.set(i10);
        }
        for (int i11 = 59; i11 <= 64; i11++) {
            bitSet.set(i11);
        }
        for (int i12 = 91; i12 <= 96; i12++) {
            bitSet.set(i12);
        }
        for (int i13 = 123; i13 <= 126; i13++) {
            bitSet.set(i13);
        }
        DELIMS = bitSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(12);
        concurrentHashMap.put("jan", 0);
        concurrentHashMap.put("feb", 1);
        concurrentHashMap.put("mar", 2);
        concurrentHashMap.put("apr", 3);
        concurrentHashMap.put("may", 4);
        concurrentHashMap.put("jun", 5);
        concurrentHashMap.put("jul", 6);
        concurrentHashMap.put("aug", 7);
        concurrentHashMap.put("sep", 8);
        concurrentHashMap.put("oct", 9);
        concurrentHashMap.put("nov", 10);
        concurrentHashMap.put("dec", 11);
        MONTHS = concurrentHashMap;
        TIME_PATTERN = Pattern.compile("^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
        DAY_OF_MONTH_PATTERN = Pattern.compile("^([0-9]{1,2})([^0-9].*)?$");
        MONTH_PATTERN = Pattern.compile("^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", 2);
        YEAR_PATTERN = Pattern.compile("^([0-9]{2,4})([^0-9].*)?$");
    }

    private void copyContent(CharSequence charSequence, ParserCursor parserCursor, StringBuilder sb2) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charSequence.charAt(pos2);
            if (DELIMS.get(charAt)) {
                break;
            }
            pos++;
            sb2.append(charAt);
        }
        parserCursor.updatePos(pos);
    }

    private void skipDelims(CharSequence charSequence, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            if (!DELIMS.get(charSequence.charAt(pos2))) {
                break;
            }
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.EXPIRES_ATTR;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, InterfaceC7038SM.COOKIE);
        ParserCursor parserCursor = new ParserCursor(0, str.length());
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (!parserCursor.atEnd()) {
            try {
                skipDelims(str, parserCursor);
                sb2.setLength(0);
                copyContent(str, parserCursor, sb2);
                if (sb2.length() == 0) {
                    break;
                }
                if (!z10) {
                    Matcher matcher = TIME_PATTERN.matcher(sb2);
                    if (matcher.matches()) {
                        i12 = Integer.parseInt(matcher.group(1));
                        i13 = Integer.parseInt(matcher.group(2));
                        i14 = Integer.parseInt(matcher.group(3));
                        z10 = true;
                    }
                }
                if (!z11) {
                    Matcher matcher2 = DAY_OF_MONTH_PATTERN.matcher(sb2);
                    if (matcher2.matches()) {
                        i11 = Integer.parseInt(matcher2.group(1));
                        z11 = true;
                    }
                }
                if (!z12) {
                    Matcher matcher3 = MONTH_PATTERN.matcher(sb2);
                    if (matcher3.matches()) {
                        i15 = MONTHS.get(matcher3.group(1).toLowerCase(Locale.ROOT)).intValue();
                        z12 = true;
                    }
                }
                if (!z13) {
                    Matcher matcher4 = YEAR_PATTERN.matcher(sb2);
                    if (matcher4.matches()) {
                        i10 = Integer.parseInt(matcher4.group(1));
                        z13 = true;
                    }
                }
            } catch (NumberFormatException e10) {
                throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
            }
        }
        if (!z10 || !z11 || !z12 || !z13) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        int i16 = i10;
        if (i10 >= 70) {
            i16 = i10;
            if (i10 <= 99) {
                i16 = i10 + 1900;
            }
        }
        int i17 = i16;
        if (i16 >= 0) {
            i17 = i16;
            if (i16 <= 69) {
                i17 = i16 + 2000;
            }
        }
        if (i11 < 1 || i11 > 31 || i17 < 1601 || i12 > 23 || i13 > 59 || i14 > 59) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(UTC);
        calendar.setTimeInMillis(0L);
        calendar.set(13, i14);
        calendar.set(12, i13);
        calendar.set(11, i12);
        calendar.set(5, i11);
        calendar.set(2, i15);
        calendar.set(1, i17);
        setCookie.setExpiryDate(calendar.getTime());
    }
}
