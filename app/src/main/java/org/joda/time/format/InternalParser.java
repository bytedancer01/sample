package org.joda.time.format;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/InternalParser.class */
interface InternalParser {
    int estimateParsedLength();

    int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i10);
}
