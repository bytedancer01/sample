package org.joda.time.p258tz;

import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;
import org.slf4j.Marker;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/FixedDateTimeZone.class */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, String str2, int i10, int i11) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i10;
        this.iStandardOffset = i11;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDateTimeZone)) {
            return false;
        }
        FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
        if (!getID().equals(fixedDateTimeZone.getID()) || this.iStandardOffset != fixedDateTimeZone.iStandardOffset || this.iWallOffset != fixedDateTimeZone.iWallOffset) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j10) {
        return this.iNameKey;
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j10) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffsetFromLocal(long j10) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j10) {
        return this.iStandardOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return getID().hashCode() + (this.iStandardOffset * 37) + (this.iWallOffset * 31);
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
        String id2 = getID();
        if (id2.length() != 6 || (!id2.startsWith(Marker.ANY_NON_NULL_MARKER) && !id2.startsWith("-"))) {
            return new SimpleTimeZone(this.iWallOffset, getID());
        }
        return TimeZone.getTimeZone("GMT" + getID());
    }
}
