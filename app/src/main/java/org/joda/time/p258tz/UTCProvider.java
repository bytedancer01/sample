package org.joda.time.p258tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/UTCProvider.class */
public final class UTCProvider implements Provider {
    private static final Set<String> AVAILABLE_IDS = Collections.singleton("UTC");

    @Override // org.joda.time.p258tz.Provider
    public Set<String> getAvailableIDs() {
        return AVAILABLE_IDS;
    }

    @Override // org.joda.time.p258tz.Provider
    public DateTimeZone getZone(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }
}
