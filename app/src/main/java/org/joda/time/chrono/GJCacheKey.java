package org.joda.time.chrono;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJCacheKey.class */
class GJCacheKey {
    private final Instant cutoverInstant;
    private final int minDaysInFirstWeek;
    private final DateTimeZone zone;

    public GJCacheKey(DateTimeZone dateTimeZone, Instant instant, int i10) {
        this.zone = dateTimeZone;
        this.cutoverInstant = instant;
        this.minDaysInFirstWeek = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GJCacheKey)) {
            return false;
        }
        GJCacheKey gJCacheKey = (GJCacheKey) obj;
        Instant instant = this.cutoverInstant;
        if (instant == null) {
            if (gJCacheKey.cutoverInstant != null) {
                return false;
            }
        } else if (!instant.equals(gJCacheKey.cutoverInstant)) {
            return false;
        }
        if (this.minDaysInFirstWeek != gJCacheKey.minDaysInFirstWeek) {
            return false;
        }
        DateTimeZone dateTimeZone = this.zone;
        DateTimeZone dateTimeZone2 = gJCacheKey.zone;
        return dateTimeZone == null ? dateTimeZone2 == null : dateTimeZone.equals(dateTimeZone2);
    }

    public int hashCode() {
        Instant instant = this.cutoverInstant;
        int i10 = 0;
        int hashCode = instant == null ? 0 : instant.hashCode();
        int i11 = this.minDaysInFirstWeek;
        DateTimeZone dateTimeZone = this.zone;
        if (dateTimeZone != null) {
            i10 = dateTimeZone.hashCode();
        }
        return ((((hashCode + 31) * 31) + i11) * 31) + i10;
    }
}
