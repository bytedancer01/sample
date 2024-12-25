package org.joda.time.format;

import java.util.Locale;
import org.joda.time.ReadWritablePeriod;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodParser.class */
public interface PeriodParser {
    int parseInto(ReadWritablePeriod readWritablePeriod, String str, int i10, Locale locale);
}
