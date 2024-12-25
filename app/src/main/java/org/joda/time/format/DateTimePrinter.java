package org.joda.time.format;

import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimePrinter.class */
public interface DateTimePrinter {
    int estimatePrintedLength();

    void printTo(Writer writer, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale);

    void printTo(Writer writer, ReadablePartial readablePartial, Locale locale);

    void printTo(StringBuffer stringBuffer, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale);

    void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale);
}
