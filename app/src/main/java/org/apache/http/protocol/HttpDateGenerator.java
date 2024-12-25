package org.apache.http.protocol;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: combined.jar:classes3.jar:org/apache/http/protocol/HttpDateGenerator.class */
public class HttpDateGenerator {
    public static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private long dateAsLong = 0;
    private String dateAsText = null;
    private final DateFormat dateformat;

    public HttpDateGenerator() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        this.dateformat = simpleDateFormat;
        simpleDateFormat.setTimeZone(GMT);
    }

    public String getCurrentDate() {
        String str;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.dateAsLong > 1000) {
                this.dateAsText = this.dateformat.format(new Date(currentTimeMillis));
                this.dateAsLong = currentTimeMillis;
            }
            str = this.dateAsText;
        }
        return str;
    }
}
