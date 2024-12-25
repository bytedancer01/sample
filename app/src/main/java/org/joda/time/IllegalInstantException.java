package org.joda.time;

import org.joda.time.format.DateTimeFormat;

/* loaded from: combined.jar:classes3.jar:org/joda/time/IllegalInstantException.class */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(long j10, String str) {
        super(createMessage(j10, str));
    }

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j10, String str) {
        String str2;
        String print = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j10));
        if (str != null) {
            str2 = " (" + str + ")";
        } else {
            str2 = "";
        }
        return "Illegal instant due to time zone offset transition (daylight savings time 'gap'): " + print + str2;
    }

    public static boolean isIllegalInstant(Throwable th2) {
        if (th2 instanceof IllegalInstantException) {
            return true;
        }
        if (th2.getCause() == null || th2.getCause() == th2) {
            return false;
        }
        return isIllegalInstant(th2.getCause());
    }
}
