package org.joda.time;

import org.apache.http.impl.auth.NTLMEngineImpl;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* loaded from: combined.jar:classes3.jar:org/joda/time/Weeks.class */
public final class Weeks extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380866L;
    public static final Weeks ZERO = new Weeks(0);
    public static final Weeks ONE = new Weeks(1);
    public static final Weeks TWO = new Weeks(2);
    public static final Weeks THREE = new Weeks(3);
    public static final Weeks MAX_VALUE = new Weeks(Integer.MAX_VALUE);
    public static final Weeks MIN_VALUE = new Weeks(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.weeks());

    private Weeks(int i10) {
        super(i10);
    }

    @FromString
    public static Weeks parseWeeks(String str) {
        return str == null ? ZERO : weeks(PARSER.parsePeriod(str).getWeeks());
    }

    private Object readResolve() {
        return weeks(getValue());
    }

    public static Weeks standardWeeksIn(ReadablePeriod readablePeriod) {
        return weeks(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 604800000L));
    }

    public static Weeks weeks(int i10) {
        return i10 != Integer.MIN_VALUE ? i10 != Integer.MAX_VALUE ? i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? new Weeks(i10) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Weeks weeksBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return weeks(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.weeks()));
    }

    public static Weeks weeksBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return weeks(((readablePartial instanceof LocalDate) && (readablePartial2 instanceof LocalDate)) ? DateTimeUtils.getChronology(readablePartial.getChronology()).weeks().getDifference(((LocalDate) readablePartial2).getLocalMillis(), ((LocalDate) readablePartial).getLocalMillis()) : BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO));
    }

    public static Weeks weeksIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : weeks(BaseSingleFieldPeriod.between(readableInterval.getStart(), readableInterval.getEnd(), DurationFieldType.weeks()));
    }

    public Weeks dividedBy(int i10) {
        return i10 == 1 ? this : weeks(getValue() / i10);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.weeks();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return PeriodType.weeks();
    }

    public int getWeeks() {
        return getValue();
    }

    public boolean isGreaterThan(Weeks weeks) {
        boolean z10 = true;
        if (weeks != null) {
            return getValue() > weeks.getValue();
        }
        if (getValue() <= 0) {
            z10 = false;
        }
        return z10;
    }

    public boolean isLessThan(Weeks weeks) {
        boolean z10 = true;
        if (weeks != null) {
            return getValue() < weeks.getValue();
        }
        if (getValue() >= 0) {
            z10 = false;
        }
        return z10;
    }

    public Weeks minus(int i10) {
        return plus(FieldUtils.safeNegate(i10));
    }

    public Weeks minus(Weeks weeks) {
        return weeks == null ? this : minus(weeks.getValue());
    }

    public Weeks multipliedBy(int i10) {
        return weeks(FieldUtils.safeMultiply(getValue(), i10));
    }

    public Weeks negated() {
        return weeks(FieldUtils.safeNegate(getValue()));
    }

    public Weeks plus(int i10) {
        return i10 == 0 ? this : weeks(FieldUtils.safeAdd(getValue(), i10));
    }

    public Weeks plus(Weeks weeks) {
        return weeks == null ? this : plus(weeks.getValue());
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeMultiply(getValue(), 7));
    }

    public Duration toStandardDuration() {
        return new Duration(getValue() * 604800000);
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeMultiply(getValue(), DateTimeConstants.HOURS_PER_WEEK));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), DateTimeConstants.MINUTES_PER_WEEK));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), DateTimeConstants.SECONDS_PER_WEEK));
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "W";
    }
}
