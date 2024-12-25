package org.joda.time;

import org.apache.http.impl.auth.NTLMEngineImpl;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* loaded from: combined.jar:classes3.jar:org/joda/time/Years.class */
public final class Years extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380868L;
    public static final Years ZERO = new Years(0);
    public static final Years ONE = new Years(1);
    public static final Years TWO = new Years(2);
    public static final Years THREE = new Years(3);
    public static final Years MAX_VALUE = new Years(Integer.MAX_VALUE);
    public static final Years MIN_VALUE = new Years(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.years());

    private Years(int i10) {
        super(i10);
    }

    @FromString
    public static Years parseYears(String str) {
        return str == null ? ZERO : years(PARSER.parsePeriod(str).getYears());
    }

    private Object readResolve() {
        return years(getValue());
    }

    public static Years years(int i10) {
        return i10 != Integer.MIN_VALUE ? i10 != Integer.MAX_VALUE ? i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? new Years(i10) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Years yearsBetween(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        return years(BaseSingleFieldPeriod.between(readableInstant, readableInstant2, DurationFieldType.years()));
    }

    public static Years yearsBetween(ReadablePartial readablePartial, ReadablePartial readablePartial2) {
        return years(((readablePartial instanceof LocalDate) && (readablePartial2 instanceof LocalDate)) ? DateTimeUtils.getChronology(readablePartial.getChronology()).years().getDifference(((LocalDate) readablePartial2).getLocalMillis(), ((LocalDate) readablePartial).getLocalMillis()) : BaseSingleFieldPeriod.between(readablePartial, readablePartial2, ZERO));
    }

    public static Years yearsIn(ReadableInterval readableInterval) {
        return readableInterval == null ? ZERO : years(BaseSingleFieldPeriod.between(readableInterval.getStart(), readableInterval.getEnd(), DurationFieldType.years()));
    }

    public Years dividedBy(int i10) {
        return i10 == 1 ? this : years(getValue() / i10);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.years();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.ReadablePeriod
    public PeriodType getPeriodType() {
        return PeriodType.years();
    }

    public int getYears() {
        return getValue();
    }

    public boolean isGreaterThan(Years years) {
        boolean z10 = true;
        if (years == null) {
            return getValue() > 0;
        }
        if (getValue() <= years.getValue()) {
            z10 = false;
        }
        return z10;
    }

    public boolean isLessThan(Years years) {
        boolean z10 = true;
        if (years == null) {
            return getValue() < 0;
        }
        if (getValue() >= years.getValue()) {
            z10 = false;
        }
        return z10;
    }

    public Years minus(int i10) {
        return plus(FieldUtils.safeNegate(i10));
    }

    public Years minus(Years years) {
        return years == null ? this : minus(years.getValue());
    }

    public Years multipliedBy(int i10) {
        return years(FieldUtils.safeMultiply(getValue(), i10));
    }

    public Years negated() {
        return years(FieldUtils.safeNegate(getValue()));
    }

    public Years plus(int i10) {
        return i10 == 0 ? this : years(FieldUtils.safeAdd(getValue(), i10));
    }

    public Years plus(Years years) {
        return years == null ? this : plus(years.getValue());
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "Y";
    }
}
