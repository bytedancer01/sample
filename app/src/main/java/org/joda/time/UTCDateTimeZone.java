package org.joda.time;

import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* loaded from: combined.jar:classes3.jar:org/joda/time/UTCDateTimeZone.class */
final class UTCDateTimeZone extends DateTimeZone {
    public static final DateTimeZone INSTANCE = new UTCDateTimeZone();
    private static final long serialVersionUID = -3513011772763289092L;

    public UTCDateTimeZone() {
        super("UTC");
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        return obj instanceof UTCDateTimeZone;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j10) {
        return "UTC";
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffsetFromLocal(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j10) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return getID().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return true;
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j10) {
        return j10;
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j10) {
        return j10;
    }

    @Override // org.joda.time.DateTimeZone
    public TimeZone toTimeZone() {
        return new SimpleTimeZone(0, getID());
    }
}
