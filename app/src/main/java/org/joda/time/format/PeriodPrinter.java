package org.joda.time.format;

import java.io.Writer;
import java.util.Locale;
import org.joda.time.ReadablePeriod;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/PeriodPrinter.class */
public interface PeriodPrinter {
    int calculatePrintedLength(ReadablePeriod readablePeriod, Locale locale);

    int countFieldsToPrint(ReadablePeriod readablePeriod, int i10, Locale locale);

    void printTo(Writer writer, ReadablePeriod readablePeriod, Locale locale);

    void printTo(StringBuffer stringBuffer, ReadablePeriod readablePeriod, Locale locale);
}
