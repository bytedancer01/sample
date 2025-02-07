package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/BuddhistChronology.class */
public final class BuddhistChronology extends AssembledChronology {

    /* renamed from: BE */
    public static final int f36183BE = 1;
    private static final int BUDDHIST_OFFSET = 543;
    private static final long serialVersionUID = -3474595157769370126L;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("BE");
    private static final ConcurrentHashMap<DateTimeZone, BuddhistChronology> cCache = new ConcurrentHashMap<>();
    private static final BuddhistChronology INSTANCE_UTC = getInstance(DateTimeZone.UTC);

    private BuddhistChronology(Chronology chronology, Object obj) {
        super(chronology, obj);
    }

    public static BuddhistChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static BuddhistChronology getInstance(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, BuddhistChronology> concurrentHashMap = cCache;
        BuddhistChronology buddhistChronology = concurrentHashMap.get(dateTimeZone2);
        BuddhistChronology buddhistChronology2 = buddhistChronology;
        if (buddhistChronology == null) {
            BuddhistChronology buddhistChronology3 = new BuddhistChronology(GJChronology.getInstance(dateTimeZone2, null), null);
            buddhistChronology2 = new BuddhistChronology(LimitChronology.getInstance(buddhistChronology3, new DateTime(1, 1, 1, 0, 0, 0, 0, buddhistChronology3), null), "");
            BuddhistChronology putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, buddhistChronology2);
            if (putIfAbsent != null) {
                buddhistChronology2 = putIfAbsent;
            }
        }
        return buddhistChronology2;
    }

    public static BuddhistChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object readResolve() {
        Chronology base = getBase();
        return base == null ? getInstanceUTC() : getInstance(base.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getParam() == null) {
            fields.eras = UnsupportedDurationField.getInstance(DurationFieldType.eras());
            OffsetDateTimeField offsetDateTimeField = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.year), BUDDHIST_OFFSET);
            fields.year = offsetDateTimeField;
            fields.yearOfEra = new DelegatedDateTimeField(offsetDateTimeField, fields.eras, DateTimeFieldType.yearOfEra());
            fields.weekyear = new OffsetDateTimeField(new SkipUndoDateTimeField(this, fields.weekyear), BUDDHIST_OFFSET);
            DividedDateTimeField dividedDateTimeField = new DividedDateTimeField(new OffsetDateTimeField(fields.yearOfEra, 99), fields.eras, DateTimeFieldType.centuryOfEra(), 100);
            fields.centuryOfEra = dividedDateTimeField;
            fields.centuries = dividedDateTimeField.getDurationField();
            fields.yearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra), DateTimeFieldType.yearOfCentury(), 1);
            fields.weekyearOfCentury = new OffsetDateTimeField(new RemainderDateTimeField(fields.weekyear, fields.centuries, DateTimeFieldType.weekyearOfCentury(), 100), DateTimeFieldType.weekyearOfCentury(), 1);
            fields.era = ERA_FIELD;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuddhistChronology) {
            return getZone().equals(((BuddhistChronology) obj).getZone());
        }
        return false;
    }

    public int hashCode() {
        return 499287079 + getZone().hashCode();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        DateTimeZone zone = getZone();
        String str = "BuddhistChronology";
        if (zone != null) {
            str = "BuddhistChronology[" + zone.getID() + ']';
        }
        return str;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return INSTANCE_UTC;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getZone() ? this : getInstance(dateTimeZone2);
    }
}
