package org.joda.time;

import org.apache.http.impl.auth.NTLMEngineImpl;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* loaded from: combined.jar:classes3.jar:org/joda/time/Seconds.class */
public final class Seconds extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380862L;
    public static final Seconds ZERO = new Seconds(0);
    public static final Seconds ONE = new Seconds(1);
    public static final Seconds TWO = new Seconds(2);
    public static final Seconds THREE = new Seconds(3);
    public static final Seconds MAX_VALUE = new Seconds(Integer.MAX_VALUE);
    public static final Seconds MIN_VALUE = new Seconds(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.seconds());

    private Seconds(int i10) {
        super(i10);
    }

    @FromString
    public static Seconds parseSeconds(String str) {
        return str == null ? ZERO : seconds(PARSER.parsePeriod(str).getSeconds());
    }

    private Object readResolve() {
        return seconds(getValue());
    }

    public static Seconds seconds(int i10) {
        return i10 != Integer.MIN_VALUE ? i10 != Integer.MAX_VALUE ? i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? new Seconds(i10) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Seconds secondsBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return seconds(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.seconds()));
    }

    public static Seconds secondsBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return seconds(((readablePartial instanceof LocalTime) && (readablePartial2 instanceof LocalTime)) ? DateTimeUtils.getChronology(readablePartial.getChronology()).seconds().getDifference(((LocalTime) readablePartial2).getLocalMillis(), ((LocalTime) readablePartial).getLocalMillis()) : BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO));
    }

    public static Seconds secondsIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : seconds(BaseSingleFieldPeriod.between(readableInterval.getStart(), readableInterval.getEnd(), DurationFieldType.seconds()));
    }

    public static Seconds standardSecondsIn(ReadablePeriod readablePeriod) {
        return seconds(BaseSingleFieldPeriod.standardPeriodIn(readablePeriod, 1000L));
    }

    public Seconds dividedBy(int i10) {
        return i10 == 1 ? this : seconds(getValue() / i10);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.seconds();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return PeriodType.seconds();
    }

    public int getSeconds() {
        return getValue();
    }

    public boolean isGreaterThan(Seconds seconds) {
        boolean z10 = true;
        if (seconds == null) {
            return getValue() > 0;
        }
        if (getValue() <= seconds.getValue()) {
            z10 = false;
        }
        return z10;
    }

    public boolean isLessThan(Seconds seconds) {
        boolean z10 = true;
        if (seconds == null) {
            return getValue() < 0;
        }
        if (getValue() >= seconds.getValue()) {
            z10 = false;
        }
        return z10;
    }

    public Seconds minus(int i10) {
        return plus(FieldUtils.safeNegate(i10));
    }

    public Seconds minus(Seconds seconds) {
        return seconds == null ? this : minus(seconds.getValue());
    }

    public Seconds multipliedBy(int i10) {
        return seconds(FieldUtils.safeMultiply(getValue(), i10));
    }

    public Seconds negated() {
        return seconds(FieldUtils.safeNegate(getValue()));
    }

    public Seconds plus(int i10) {
        return i10 == 0 ? this : seconds(FieldUtils.safeAdd(getValue(), i10));
    }

    public Seconds plus(Seconds seconds) {
        return seconds == null ? this : plus(seconds.getValue());
    }

    public Days toStandardDays() {
        return Days.days(getValue() / DateTimeConstants.SECONDS_PER_DAY);
    }

    public Duration toStandardDuration() {
        return new Duration(getValue() * 1000);
    }

    public Hours toStandardHours() {
        return Hours.hours(getValue() / 3600);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(getValue() / 60);
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / DateTimeConstants.SECONDS_PER_WEEK);
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + "S";
    }
}
