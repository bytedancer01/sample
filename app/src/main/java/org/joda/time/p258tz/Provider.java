package org.joda.time.p258tz;

import java.util.Set;
import org.joda.time.DateTimeZone;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/Provider.class */
public interface Provider {
    Set<String> getAvailableIDs();

    DateTimeZone getZone(String str);
}
