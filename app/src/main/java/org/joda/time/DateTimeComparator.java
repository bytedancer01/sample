package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

/* loaded from: combined.jar:classes3.jar:org/joda/time/DateTimeComparator.class */
public class DateTimeComparator implements Comparator<Object>, Serializable {
    private static final DateTimeComparator ALL_INSTANCE = new DateTimeComparator(null, null);
    private static final DateTimeComparator DATE_INSTANCE = new DateTimeComparator(DateTimeFieldType.dayOfYear(), null);
    private static final DateTimeComparator TIME_INSTANCE = new DateTimeComparator(null, DateTimeFieldType.dayOfYear());
    private static final long serialVersionUID = -6097339773320178364L;
    private final DateTimeFieldType iLowerLimit;
    private final DateTimeFieldType iUpperLimit;

    public DateTimeComparator(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        this.iLowerLimit = dateTimeFieldType;
        this.iUpperLimit = dateTimeFieldType2;
    }

    public static DateTimeComparator getDateOnlyInstance() {
        return DATE_INSTANCE;
    }

    public static DateTimeComparator getInstance() {
        return ALL_INSTANCE;
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType) {
        return getInstance(dateTimeFieldType, null);
    }

    public static DateTimeComparator getInstance(DateTimeFieldType dateTimeFieldType, DateTimeFieldType dateTimeFieldType2) {
        return (dateTimeFieldType == null && dateTimeFieldType2 == null) ? ALL_INSTANCE : (dateTimeFieldType == DateTimeFieldType.dayOfYear() && dateTimeFieldType2 == null) ? DATE_INSTANCE : (dateTimeFieldType == null && dateTimeFieldType2 == DateTimeFieldType.dayOfYear()) ? TIME_INSTANCE : new DateTimeComparator(dateTimeFieldType, dateTimeFieldType2);
    }

    public static DateTimeComparator getTimeOnlyInstance() {
        return TIME_INSTANCE;
    }

    private Object readResolve() {
        return getInstance(this.iLowerLimit, this.iUpperLimit);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology chronology = instantConverter.getChronology(obj, (Chronology) null);
        long instantMillis = instantConverter.getInstantMillis(obj, chronology);
        InstantConverter instantConverter2 = ConverterManager.getInstance().getInstantConverter(obj2);
        Chronology chronology2 = instantConverter2.getChronology(obj2, (Chronology) null);
        long instantMillis2 = instantConverter2.getInstantMillis(obj2, chronology2);
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        long j10 = instantMillis;
        long j11 = instantMillis2;
        if (dateTimeFieldType != null) {
            j10 = dateTimeFieldType.getField(chronology).roundFloor(instantMillis);
            j11 = this.iLowerLimit.getField(chronology2).roundFloor(instantMillis2);
        }
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        long j12 = j10;
        long j13 = j11;
        if (dateTimeFieldType2 != null) {
            j12 = dateTimeFieldType2.getField(chronology).remainder(j10);
            j13 = this.iUpperLimit.getField(chronology2).remainder(j11);
        }
        long j14 = j12;
        long j15 = j13;
        if (j14 < j15) {
            return -1;
        }
        return j14 > j15 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r0.equals(r0.getUpperLimit()) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r0.equals(r0.getLowerLimit()) != false) goto L10;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.joda.time.DateTimeComparator
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L62
            r0 = r4
            org.joda.time.DateTimeComparator r0 = (org.joda.time.DateTimeComparator) r0
            r4 = r0
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iLowerLimit
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getLowerLimit()
            if (r0 == r1) goto L3a
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iLowerLimit
            r8 = r0
            r0 = r6
            r5 = r0
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r6
            r5 = r0
            r0 = r8
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getLowerLimit()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L62
        L3a:
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iUpperLimit
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getUpperLimit()
            if (r0 == r1) goto L60
            r0 = r3
            org.joda.time.DateTimeFieldType r0 = r0.iUpperLimit
            r8 = r0
            r0 = r6
            r5 = r0
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r6
            r5 = r0
            r0 = r8
            r1 = r4
            org.joda.time.DateTimeFieldType r1 = r1.getUpperLimit()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L62
        L60:
            r0 = 1
            r5 = r0
        L62:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.DateTimeComparator.equals(java.lang.Object):boolean");
    }

    public DateTimeFieldType getLowerLimit() {
        return this.iLowerLimit;
    }

    public DateTimeFieldType getUpperLimit() {
        return this.iUpperLimit;
    }

    public int hashCode() {
        DateTimeFieldType dateTimeFieldType = this.iLowerLimit;
        int i10 = 0;
        int hashCode = dateTimeFieldType == null ? 0 : dateTimeFieldType.hashCode();
        DateTimeFieldType dateTimeFieldType2 = this.iUpperLimit;
        if (dateTimeFieldType2 != null) {
            i10 = dateTimeFieldType2.hashCode();
        }
        return hashCode + (i10 * 123);
    }

    public String toString() {
        StringBuilder sb2;
        DateTimeFieldType dateTimeFieldType;
        String str;
        if (this.iLowerLimit == this.iUpperLimit) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DateTimeComparator[");
            DateTimeFieldType dateTimeFieldType2 = this.iLowerLimit;
            sb2 = sb3;
            dateTimeFieldType = dateTimeFieldType2;
            if (dateTimeFieldType2 == null) {
                sb2 = sb3;
                str = "";
            }
            str = dateTimeFieldType.getName();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("DateTimeComparator[");
            DateTimeFieldType dateTimeFieldType3 = this.iLowerLimit;
            sb4.append(dateTimeFieldType3 == null ? "" : dateTimeFieldType3.getName());
            sb4.append("-");
            DateTimeFieldType dateTimeFieldType4 = this.iUpperLimit;
            sb2 = sb4;
            dateTimeFieldType = dateTimeFieldType4;
            if (dateTimeFieldType4 == null) {
                sb2 = sb4;
                str = "";
            }
            str = dateTimeFieldType.getName();
        }
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }
}
