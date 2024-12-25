package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/UnsupportedDurationField.class */
public final class UnsupportedDurationField extends DurationField implements Serializable {
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    public static UnsupportedDurationField getInstance(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        UnsupportedDurationField unsupportedDurationField2;
        synchronized (UnsupportedDurationField.class) {
            try {
                HashMap<DurationFieldType, UnsupportedDurationField> hashMap = cCache;
                if (hashMap == null) {
                    cCache = new HashMap<>(7);
                    unsupportedDurationField = null;
                } else {
                    unsupportedDurationField = hashMap.get(durationFieldType);
                }
                unsupportedDurationField2 = unsupportedDurationField;
                if (unsupportedDurationField == null) {
                    unsupportedDurationField2 = new UnsupportedDurationField(durationFieldType);
                    cCache.put(durationFieldType, unsupportedDurationField2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unsupportedDurationField2;
    }

    private Object readResolve() {
        return getInstance(this.iType);
    }

    private UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // org.joda.time.DurationField
    public long add(long j10, int i10) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long add(long j10, long j11) {
        throw unsupported();
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.getName() != null) {
            return unsupportedDurationField.getName().equals(getName());
        }
        if (getName() != null) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j10, long j11) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j10, long j11) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i10) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i10, long j10) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j10) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j10, long j11) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return 0L;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j10) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j10, long j11) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j10) {
        throw unsupported();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j10, long j11) {
        throw unsupported();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return false;
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        return "UnsupportedDurationField[" + getName() + ']';
    }
}
