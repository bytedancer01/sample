package org.joda.time.chrono;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.RemainderDateTimeField;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/ISOChronology.class */
public final class ISOChronology extends AssembledChronology {
    private static final ISOChronology INSTANCE_UTC;
    private static final ConcurrentHashMap<DateTimeZone, ISOChronology> cCache;
    private static final long serialVersionUID = -6212696554273812441L;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/ISOChronology$Stub.class */
    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;
        private transient DateTimeZone iZone;

        public Stub(DateTimeZone dateTimeZone) {
            this.iZone = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            this.iZone = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.getInstance(this.iZone);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.writeObject(this.iZone);
        }
    }

    static {
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = new ConcurrentHashMap<>();
        cCache = concurrentHashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.getInstanceUTC());
        INSTANCE_UTC = iSOChronology;
        concurrentHashMap.put(DateTimeZone.UTC, iSOChronology);
    }

    private ISOChronology(Chronology chronology) {
        super(chronology, null);
    }

    public static ISOChronology getInstance() {
        return getInstance(DateTimeZone.getDefault());
    }

    public static ISOChronology getInstance(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = cCache;
        ISOChronology iSOChronology = concurrentHashMap.get(dateTimeZone2);
        ISOChronology iSOChronology2 = iSOChronology;
        if (iSOChronology == null) {
            iSOChronology2 = new ISOChronology(ZonedChronology.getInstance(INSTANCE_UTC, dateTimeZone2));
            ISOChronology putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone2, iSOChronology2);
            if (putIfAbsent != null) {
                iSOChronology2 = putIfAbsent;
            }
        }
        return iSOChronology2;
    }

    public static ISOChronology getInstanceUTC() {
        return INSTANCE_UTC;
    }

    private Object writeReplace() {
        return new Stub(getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        if (getBase().getZone() == DateTimeZone.UTC) {
            DividedDateTimeField dividedDateTimeField = new DividedDateTimeField(ISOYearOfEraDateTimeField.INSTANCE, DateTimeFieldType.centuryOfEra(), 100);
            fields.centuryOfEra = dividedDateTimeField;
            fields.centuries = dividedDateTimeField.getDurationField();
            fields.yearOfCentury = new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra, DateTimeFieldType.yearOfCentury());
            fields.weekyearOfCentury = new RemainderDateTimeField((DividedDateTimeField) fields.centuryOfEra, fields.weekyears, DateTimeFieldType.weekyearOfCentury());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return getZone().equals(((ISOChronology) obj).getZone());
        }
        return false;
    }

    public int hashCode() {
        return 800855 + getZone().hashCode();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        DateTimeZone zone = getZone();
        String str = "ISOChronology";
        if (zone != null) {
            str = "ISOChronology[" + zone.getID() + ']';
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
