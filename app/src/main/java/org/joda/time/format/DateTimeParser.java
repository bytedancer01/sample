package org.joda.time.format;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeParser.class */
public interface DateTimeParser {
    int estimateParsedLength();

    int parseInto(DateTimeParserBucket dateTimeParserBucket, String str, int i10);
}
