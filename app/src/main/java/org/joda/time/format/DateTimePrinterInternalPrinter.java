package org.joda.time.format;

import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimePrinterInternalPrinter.class */
class DateTimePrinterInternalPrinter implements InternalPrinter {
    private final DateTimePrinter underlying;

    private DateTimePrinterInternalPrinter(DateTimePrinter dateTimePrinter) {
        this.underlying = dateTimePrinter;
    }

    /* renamed from: of */
    public static InternalPrinter m32149of(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter instanceof InternalPrinterDateTimePrinter) {
            return (InternalPrinter) dateTimePrinter;
        }
        if (dateTimePrinter == null) {
            return null;
        }
        return new DateTimePrinterInternalPrinter(dateTimePrinter);
    }

    @Override // org.joda.time.format.InternalPrinter
    public int estimatePrintedLength() {
        return this.underlying.estimatePrintedLength();
    }

    public DateTimePrinter getUnderlying() {
        return this.underlying;
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
        if (appendable instanceof StringBuffer) {
            this.underlying.printTo((StringBuffer) appendable, j10, chronology, i10, dateTimeZone, locale);
        }
        if (appendable instanceof Writer) {
            this.underlying.printTo((Writer) appendable, j10, chronology, i10, dateTimeZone, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.underlying.printTo(stringBuffer, j10, chronology, i10, dateTimeZone, locale);
        appendable.append(stringBuffer);
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        if (appendable instanceof StringBuffer) {
            this.underlying.printTo((StringBuffer) appendable, readablePartial, locale);
        }
        if (appendable instanceof Writer) {
            this.underlying.printTo((Writer) appendable, readablePartial, locale);
        }
        StringBuffer stringBuffer = new StringBuffer(estimatePrintedLength());
        this.underlying.printTo(stringBuffer, readablePartial, locale);
        appendable.append(stringBuffer);
    }
}
