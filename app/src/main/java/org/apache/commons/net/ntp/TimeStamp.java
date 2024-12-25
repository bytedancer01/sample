package org.apache.commons.net.ntp;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/net/ntp/TimeStamp.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/net/ntp/TimeStamp.class */
public class TimeStamp implements Serializable, Comparable<TimeStamp> {
    public static final String NTP_DATE_FORMAT = "EEE, MMM dd yyyy HH:mm:ss.SSS";
    public static final long msb0baseTime = 2085978496000L;
    public static final long msb1baseTime = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter;
    private DateFormat utcFormatter;

    public TimeStamp(long j10) {
        this.ntpTime = j10;
    }

    public TimeStamp(String str) {
        this.ntpTime = decodeNtpHexString(str);
    }

    public TimeStamp(Date date) {
        this.ntpTime = date == null ? 0L : toNtpTime(date.getTime());
    }

    private static void appendHexString(StringBuilder sb2, long j10) {
        String hexString = Long.toHexString(j10);
        for (int length = hexString.length(); length < 8; length++) {
            sb2.append('0');
        }
        sb2.append(hexString);
    }

    public static long decodeNtpHexString(String str) {
        if (str == null) {
            throw new NumberFormatException("null");
        }
        int indexOf = str.indexOf(46);
        if (indexOf != -1) {
            return (Long.parseLong(str.substring(0, indexOf), 16) << 32) | Long.parseLong(str.substring(indexOf + 1), 16);
        }
        if (str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str, 16) << 32;
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    public static TimeStamp getNtpTime(long j10) {
        return new TimeStamp(toNtpTime(j10));
    }

    public static long getTime(long j10) {
        long j11 = (j10 >>> 32) & 4294967295L;
        return (j11 * 1000) + ((IjkMediaMeta.AV_CH_WIDE_LEFT & j11) == 0 ? 2085978496000L : -2208988800000L) + Math.round(((j10 & 4294967295L) * 1000.0d) / 4.294967296E9d);
    }

    public static TimeStamp parseNtpString(String str) {
        return new TimeStamp(decodeNtpHexString(str));
    }

    public static long toNtpTime(long j10) {
        long j11 = 2085978496000L;
        boolean z10 = j10 < msb0baseTime;
        if (z10) {
            j11 = -2208988800000L;
        }
        long j12 = j10 - j11;
        long j13 = j12 / 1000;
        long j14 = ((j12 % 1000) * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
        long j15 = j13;
        if (z10) {
            j15 = j13 | IjkMediaMeta.AV_CH_WIDE_LEFT;
        }
        return j14 | (j15 << 32);
    }

    public static String toString(long j10) {
        StringBuilder sb2 = new StringBuilder();
        appendHexString(sb2, (j10 >>> 32) & 4294967295L);
        sb2.append('.');
        appendHexString(sb2, j10 & 4294967295L);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(TimeStamp timeStamp) {
        long j10 = this.ntpTime;
        long j11 = timeStamp.ntpTime;
        return j10 < j11 ? -1 : j10 == j11 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof TimeStamp) {
            z10 = false;
            if (this.ntpTime == ((TimeStamp) obj).ntpValue()) {
                z10 = true;
            }
        }
        return z10;
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public long getFraction() {
        return this.ntpTime & 4294967295L;
    }

    public long getSeconds() {
        return (this.ntpTime >>> 32) & 4294967295L;
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }

    public int hashCode() {
        long j10 = this.ntpTime;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public long ntpValue() {
        return this.ntpTime;
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(NTP_DATE_FORMAT, Locale.US);
            this.simpleFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    public String toUTCString() {
        if (this.utcFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'", Locale.US);
            this.utcFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return this.utcFormatter.format(getDate());
    }
}
