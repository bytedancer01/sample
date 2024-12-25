package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/InternalPrinterDateTimePrinter.class */
class InternalPrinterDateTimePrinter implements DateTimePrinter, InternalPrinter {
    private final InternalPrinter underlying;

    private InternalPrinterDateTimePrinter(InternalPrinter internalPrinter) {
        this.underlying = internalPrinter;
    }

    /* renamed from: of */
    public static DateTimePrinter m32151of(InternalPrinter internalPrinter) {
        if (internalPrinter instanceof DateTimePrinterInternalPrinter) {
            return ((DateTimePrinterInternalPrinter) internalPrinter).getUnderlying();
        }
        if (internalPrinter instanceof DateTimePrinter) {
            return (DateTimePrinter) internalPrinter;
        }
        if (internalPrinter == null) {
            return null;
        }
        return new InternalPrinterDateTimePrinter(internalPrinter);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternalPrinterDateTimePrinter) {
            return this.underlying.equals(((InternalPrinterDateTimePrinter) obj).underlying);
        }
        return false;
    }

    @Override // org.joda.time.format.DateTimePrinter, org.joda.time.format.InternalPrinter
    public int estimatePrintedLength() {
        return this.underlying.estimatePrintedLength();
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(Writer writer, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
        this.underlying.printTo(writer, j10, chronology, i10, dateTimeZone, locale);
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(Writer writer, ReadablePartial readablePartial, Locale locale) {
        this.underlying.printTo(writer, readablePartial, locale);
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
        this.underlying.printTo(appendable, j10, chronology, i10, dateTimeZone, locale);
    }

    @Override // org.joda.time.format.InternalPrinter
    public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        this.underlying.printTo(appendable, readablePartial, locale);
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(StringBuffer stringBuffer, long j10, Chronology chronology, int i10, DateTimeZone dateTimeZone, Locale locale) {
        try {
            this.underlying.printTo(stringBuffer, j10, chronology, i10, dateTimeZone, locale);
        } catch (IOException e10) {
        }
    }

    @Override // org.joda.time.format.DateTimePrinter
    public void printTo(StringBuffer stringBuffer, ReadablePartial readablePartial, Locale locale) {
        try {
            this.underlying.printTo(stringBuffer, readablePartial, locale);
        } catch (IOException e10) {
        }
    }
}
