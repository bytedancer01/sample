package org.joda.time.field;

import java.util.Locale;
import org.apache.commons.net.telnet.TelnetCommand;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/AbstractPartialFieldProperty.class */
public abstract class AbstractPartialFieldProperty {
    public int compareTo(ReadableInstant readableInstant) {
        if (readableInstant == null) {
            throw new IllegalArgumentException("The instant must not be null");
        }
        int i10 = get();
        int i11 = readableInstant.get(getFieldType());
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public int compareTo(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            throw new IllegalArgumentException("The instant must not be null");
        }
        int i10 = get();
        int i11 = readablePartial.get(getFieldType());
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractPartialFieldProperty)) {
            return false;
        }
        AbstractPartialFieldProperty abstractPartialFieldProperty = (AbstractPartialFieldProperty) obj;
        if (get() != abstractPartialFieldProperty.get() || getFieldType() != abstractPartialFieldProperty.getFieldType() || !FieldUtils.equals(getReadablePartial().getChronology(), abstractPartialFieldProperty.getReadablePartial().getChronology())) {
            z10 = false;
        }
        return z10;
    }

    public abstract int get();

    public String getAsShortText() {
        return getAsShortText(null);
    }

    public String getAsShortText(Locale locale) {
        return getField().getAsShortText(getReadablePartial(), get(), locale);
    }

    public String getAsString() {
        return Integer.toString(get());
    }

    public String getAsText() {
        return getAsText(null);
    }

    public String getAsText(Locale locale) {
        return getField().getAsText(getReadablePartial(), get(), locale);
    }

    public DurationField getDurationField() {
        return getField().getDurationField();
    }

    public abstract DateTimeField getField();

    public DateTimeFieldType getFieldType() {
        return getField().getType();
    }

    public int getMaximumShortTextLength(Locale locale) {
        return getField().getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale) {
        return getField().getMaximumTextLength(locale);
    }

    public int getMaximumValue() {
        return getField().getMaximumValue(getReadablePartial());
    }

    public int getMaximumValueOverall() {
        return getField().getMaximumValue();
    }

    public int getMinimumValue() {
        return getField().getMinimumValue(getReadablePartial());
    }

    public int getMinimumValueOverall() {
        return getField().getMinimumValue();
    }

    public String getName() {
        return getField().getName();
    }

    public DurationField getRangeDurationField() {
        return getField().getRangeDurationField();
    }

    public abstract ReadablePartial getReadablePartial();

    public int hashCode() {
        return ((((TelnetCommand.f36138EC + get()) * 13) + getFieldType().hashCode()) * 13) + getReadablePartial().getChronology().hashCode();
    }

    public String toString() {
        return "Property[" + getName() + "]";
    }
}
