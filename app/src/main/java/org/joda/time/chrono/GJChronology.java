package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.ISODateTimeFormat;

/* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJChronology.class */
public final class GJChronology extends AssembledChronology {
    public static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJChronology$CutoverField.class */
    public class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        public final boolean iConvertByWeekyear;
        public final long iCutover;
        public DurationField iDurationField;
        public final DateTimeField iGregorianField;
        public final DateTimeField iJulianField;
        public DurationField iRangeDurationField;
        public final GJChronology this$0;

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j10) {
            this(gJChronology, dateTimeField, dateTimeField2, j10, false);
        }

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j10, boolean z10) {
            this(gJChronology, dateTimeField, dateTimeField2, null, j10, z10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j10, boolean z10) {
            super(dateTimeField2.getType());
            this.this$0 = gJChronology;
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j10;
            this.iConvertByWeekyear = z10;
            this.iDurationField = dateTimeField2.getDurationField();
            DurationField durationField2 = durationField;
            if (durationField == null) {
                DurationField rangeDurationField = dateTimeField2.getRangeDurationField();
                durationField2 = rangeDurationField;
                if (rangeDurationField == null) {
                    durationField2 = dateTimeField.getRangeDurationField();
                }
            }
            this.iRangeDurationField = durationField2;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, int i10) {
            return this.iGregorianField.add(j10, i10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, long j11) {
            return this.iGregorianField.add(j10, j11);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int[] add(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
            if (i11 == 0) {
                return iArr;
            }
            if (!DateTimeUtils.isContiguous(readablePartial)) {
                return super.add(readablePartial, i10, iArr, i11);
            }
            long j10 = 0;
            int size = readablePartial.size();
            for (int i12 = 0; i12 < size; i12++) {
                j10 = readablePartial.getFieldType(i12).getField(this.this$0).set(j10, iArr[i12]);
            }
            return this.this$0.get(readablePartial, add(j10, i11));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).get(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i10, Locale locale) {
            return this.iGregorianField.getAsShortText(i10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j10, Locale locale) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getAsShortText(j10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i10, Locale locale) {
            return this.iGregorianField.getAsText(i10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j10, Locale locale) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getAsText(j10, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j10, long j11) {
            return this.iGregorianField.getDifference(j10, j11);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j10, long j11) {
            return this.iGregorianField.getDifferenceAsLong(j10, j11);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getLeapAmount(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j10) {
            if (j10 >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j10);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j10);
            long j11 = this.iJulianField.set(j10, maximumValue);
            long j12 = this.iCutover;
            if (j11 >= j12) {
                DateTimeField dateTimeField = this.iJulianField;
                maximumValue = dateTimeField.get(dateTimeField.add(j12, -1));
            }
            return maximumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0L));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                DateTimeField field = readablePartial.getFieldType(i10).getField(instanceUTC);
                long j11 = j10;
                if (iArr[i10] <= field.getMaximumValue(j10)) {
                    j11 = field.set(j10, iArr[i10]);
                }
                i10++;
                j10 = j11;
            }
            return getMaximumValue(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j10) {
            if (j10 < this.iCutover) {
                return this.iJulianField.getMinimumValue(j10);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j10);
            long j11 = this.iGregorianField.set(j10, minimumValue);
            long j12 = this.iCutover;
            if (j11 < j12) {
                minimumValue = this.iGregorianField.get(j12);
            }
            return minimumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public long gregorianToJulian(long j10) {
            return this.iConvertByWeekyear ? this.this$0.gregorianToJulianByWeekyear(j10) : this.this$0.gregorianToJulianByYear(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).isLeap(j10);
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return false;
        }

        public long julianToGregorian(long j10) {
            return this.iConvertByWeekyear ? this.this$0.julianToGregorianByWeekyear(j10) : this.this$0.julianToGregorianByYear(j10);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j10) {
            long j11;
            if (j10 >= this.iCutover) {
                j11 = this.iGregorianField.roundCeiling(j10);
            } else {
                long roundCeiling = this.iJulianField.roundCeiling(j10);
                j11 = roundCeiling;
                if (roundCeiling >= this.iCutover) {
                    j11 = roundCeiling;
                    if (roundCeiling - this.this$0.iGapDuration >= this.iCutover) {
                        j11 = julianToGregorian(roundCeiling);
                    }
                }
            }
            return j11;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j10) {
            long roundFloor;
            if (j10 >= this.iCutover) {
                long roundFloor2 = this.iGregorianField.roundFloor(j10);
                roundFloor = roundFloor2;
                if (roundFloor2 < this.iCutover) {
                    roundFloor = roundFloor2;
                    if (this.this$0.iGapDuration + roundFloor2 < this.iCutover) {
                        roundFloor = gregorianToJulian(roundFloor2);
                    }
                }
            } else {
                roundFloor = this.iJulianField.roundFloor(j10);
            }
            return roundFloor;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, int i10) {
            long j11;
            if (j10 >= this.iCutover) {
                long j12 = this.iGregorianField.set(j10, i10);
                j11 = j12;
                if (j12 < this.iCutover) {
                    j11 = j12;
                    if (this.this$0.iGapDuration + j12 < this.iCutover) {
                        j11 = gregorianToJulian(j12);
                    }
                    if (get(j11) != i10) {
                        throw new IllegalFieldValueException(this.iGregorianField.getType(), Integer.valueOf(i10), (Number) null, (Number) null);
                    }
                }
            } else {
                long j13 = this.iJulianField.set(j10, i10);
                j11 = j13;
                if (j13 >= this.iCutover) {
                    j11 = j13;
                    if (j13 - this.this$0.iGapDuration >= this.iCutover) {
                        j11 = julianToGregorian(j13);
                    }
                    if (get(j11) != i10) {
                        throw new IllegalFieldValueException(this.iJulianField.getType(), Integer.valueOf(i10), (Number) null, (Number) null);
                    }
                }
            }
            return j11;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j10, String str, Locale locale) {
            long j11;
            if (j10 >= this.iCutover) {
                long j12 = this.iGregorianField.set(j10, str, locale);
                j11 = j12;
                if (j12 < this.iCutover) {
                    j11 = j12;
                    if (this.this$0.iGapDuration + j12 < this.iCutover) {
                        j11 = gregorianToJulian(j12);
                    }
                }
            } else {
                long j13 = this.iJulianField.set(j10, str, locale);
                j11 = j13;
                if (j13 >= this.iCutover) {
                    j11 = j13;
                    if (j13 - this.this$0.iGapDuration >= this.iCutover) {
                        j11 = julianToGregorian(j13);
                    }
                }
            }
            return j11;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJChronology$ImpreciseCutoverField.class */
    public final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;
        public final GJChronology this$0;

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j10) {
            this(gJChronology, dateTimeField, dateTimeField2, (DurationField) null, j10, false);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j10) {
            this(gJChronology, dateTimeField, dateTimeField2, durationField, j10, false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j10, boolean z10) {
            super(gJChronology, dateTimeField, dateTimeField2, j10, z10);
            this.this$0 = gJChronology;
            this.iDurationField = durationField == null ? new LinkedDurationField(this.iDurationField, this) : durationField;
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j10) {
            this(gJChronology, dateTimeField, dateTimeField2, durationField, j10, false);
            this.iRangeDurationField = durationField2;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, int i10) {
            long j11;
            long j12;
            DateTimeField year;
            if (j10 >= this.iCutover) {
                long add = this.iGregorianField.add(j10, i10);
                j11 = add;
                if (add < this.iCutover) {
                    j11 = add;
                    if (this.this$0.iGapDuration + add < this.iCutover) {
                        if (this.iConvertByWeekyear) {
                            j12 = add;
                            if (this.this$0.iGregorianChronology.weekyear().get(add) <= 0) {
                                year = this.this$0.iGregorianChronology.weekyear();
                                j12 = year.add(add, -1);
                            }
                            j11 = gregorianToJulian(j12);
                        } else {
                            j12 = add;
                            if (this.this$0.iGregorianChronology.year().get(add) <= 0) {
                                year = this.this$0.iGregorianChronology.year();
                                j12 = year.add(add, -1);
                            }
                            j11 = gregorianToJulian(j12);
                        }
                    }
                }
            } else {
                long add2 = this.iJulianField.add(j10, i10);
                j11 = add2;
                if (add2 >= this.iCutover) {
                    j11 = add2;
                    if (add2 - this.this$0.iGapDuration >= this.iCutover) {
                        j11 = julianToGregorian(add2);
                    }
                }
            }
            return j11;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j10, long j11) {
            long j12;
            long j13;
            DateTimeField year;
            if (j10 >= this.iCutover) {
                long add = this.iGregorianField.add(j10, j11);
                j12 = add;
                if (add < this.iCutover) {
                    j12 = add;
                    if (this.this$0.iGapDuration + add < this.iCutover) {
                        if (this.iConvertByWeekyear) {
                            j13 = add;
                            if (this.this$0.iGregorianChronology.weekyear().get(add) <= 0) {
                                year = this.this$0.iGregorianChronology.weekyear();
                                j13 = year.add(add, -1);
                            }
                            j12 = gregorianToJulian(j13);
                        } else {
                            j13 = add;
                            if (this.this$0.iGregorianChronology.year().get(add) <= 0) {
                                year = this.this$0.iGregorianChronology.year();
                                j13 = year.add(add, -1);
                            }
                            j12 = gregorianToJulian(j13);
                        }
                    }
                }
            } else {
                long add2 = this.iJulianField.add(j10, j11);
                j12 = add2;
                if (add2 >= this.iCutover) {
                    j12 = add2;
                    if (add2 - this.this$0.iGapDuration >= this.iCutover) {
                        j12 = julianToGregorian(add2);
                    }
                }
            }
            return j12;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j10, long j11) {
            DateTimeField dateTimeField;
            long j12 = this.iCutover;
            if (j10 >= j12) {
                if (j11 < j12) {
                    j10 = gregorianToJulian(j10);
                    dateTimeField = this.iJulianField;
                }
                dateTimeField = this.iGregorianField;
            } else {
                if (j11 >= j12) {
                    j10 = julianToGregorian(j10);
                    dateTimeField = this.iGregorianField;
                }
                dateTimeField = this.iJulianField;
            }
            return dateTimeField.getDifference(j10, j11);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j10, long j11) {
            DateTimeField dateTimeField;
            long j12 = this.iCutover;
            if (j10 >= j12) {
                if (j11 < j12) {
                    j10 = gregorianToJulian(j10);
                    dateTimeField = this.iJulianField;
                }
                dateTimeField = this.iGregorianField;
            } else {
                if (j11 >= j12) {
                    j10 = julianToGregorian(j10);
                    dateTimeField = this.iGregorianField;
                }
                dateTimeField = this.iJulianField;
            }
            return dateTimeField.getDifferenceAsLong(j10, j11);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getMaximumValue(j10);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j10) {
            return (j10 >= this.iCutover ? this.iGregorianField : this.iJulianField).getMinimumValue(j10);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/chrono/GJChronology$LinkedDurationField.class */
    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        public LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j10, int i10) {
            return this.iField.add(j10, i10);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j10, long j11) {
            return this.iField.add(j10, j11);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j10, long j11) {
            return this.iField.getDifference(j10, j11);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j10, long j11) {
            return this.iField.getDifferenceAsLong(j10, j11);
        }
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j10, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0L, chronology.weekyear().get(j10)), chronology.weekOfWeekyear().get(j10)), chronology.dayOfWeek().get(j10)), chronology.millisOfDay().get(j10));
    }

    private static long convertByYear(long j10, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j10), chronology.monthOfYear().get(j10), chronology.dayOfMonth().get(j10), chronology.millisOfDay().get(j10));
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j10, int i10) {
        return getInstance(dateTimeZone, j10 == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j10), i10);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i10) {
        Instant instant;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(zone)).getYear() <= 0) {
                throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i10);
        ConcurrentHashMap<GJCacheKey, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology = concurrentHashMap.get(gJCacheKey);
        GJChronology gJChronology2 = gJChronology;
        if (gJChronology == null) {
            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
            if (zone == dateTimeZone2) {
                gJChronology2 = new GJChronology(JulianChronology.getInstance(zone, i10), GregorianChronology.getInstance(zone, i10), instant);
            } else {
                GJChronology gJChronology3 = getInstance(dateTimeZone2, instant, i10);
                gJChronology2 = new GJChronology(ZonedChronology.getInstance(gJChronology3, zone), gJChronology3.iJulianChronology, gJChronology3.iGregorianChronology, gJChronology3.iCutoverInstant);
            }
            GJChronology putIfAbsent = concurrentHashMap.putIfAbsent(gJCacheKey, gJChronology2);
            if (putIfAbsent != null) {
                gJChronology2 = putIfAbsent;
            }
        }
        return gJChronology2;
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() != gregorianChronology.getMinimumDaysInFirstWeek()) {
            throw new IllegalArgumentException();
        }
        long j10 = this.iCutoverMillis;
        this.iGapDuration = j10 - julianToGregorianByYear(j10);
        fields.copyFieldsFrom(gregorianChronology);
        if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
            fields.millisOfSecond = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
            fields.millisOfDay = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
            fields.secondOfMinute = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
            fields.secondOfDay = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
            fields.minuteOfHour = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
            fields.minuteOfDay = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
            fields.hourOfDay = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
            fields.hourOfHalfday = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
            fields.clockhourOfDay = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
            fields.clockhourOfHalfday = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
            fields.halfdayOfDay = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
        }
        fields.era = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
        fields.year = impreciseCutoverField;
        fields.years = impreciseCutoverField.getDurationField();
        fields.yearOfEra = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField2 = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
        fields.centuryOfEra = impreciseCutoverField2;
        fields.centuries = impreciseCutoverField2.getDurationField();
        fields.yearOfCentury = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField3 = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
        fields.monthOfYear = impreciseCutoverField3;
        fields.months = impreciseCutoverField3.getDurationField();
        ImpreciseCutoverField impreciseCutoverField4 = new ImpreciseCutoverField(this, julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
        fields.weekyear = impreciseCutoverField4;
        fields.weekyears = impreciseCutoverField4.getDurationField();
        fields.weekyearOfCentury = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
        fields.dayOfYear = new CutoverField(this, julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
        fields.weekOfWeekyear = new CutoverField(this, julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
        CutoverField cutoverField = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
        cutoverField.iRangeDurationField = fields.months;
        fields.dayOfMonth = cutoverField;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GJChronology)) {
            return false;
        }
        GJChronology gJChronology = (GJChronology) obj;
        if (this.iCutoverMillis != gJChronology.iCutoverMillis || getMinimumDaysInFirstWeek() != gJChronology.getMinimumDaysInFirstWeek() || !getZone().equals(gJChronology.getZone())) {
            z10 = false;
        }
        return z10;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13) {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i10, i11, i12, i13);
        long j10 = dateTimeMillis;
        if (dateTimeMillis < this.iCutoverMillis) {
            j10 = this.iJulianChronology.getDateTimeMillis(i10, i11, i12, i13);
            if (j10 >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return j10;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long dateTimeMillis;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
        } catch (IllegalFieldValueException e10) {
            if (i11 != 2 || i12 != 29) {
                throw e10;
            }
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i10, i11, 28, i13, i14, i15, i16);
            if (dateTimeMillis >= this.iCutoverMillis) {
                throw e10;
            }
        }
        long j10 = dateTimeMillis;
        if (dateTimeMillis < this.iCutoverMillis) {
            j10 = this.iJulianChronology.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16);
            if (j10 >= this.iCutoverMillis) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return j10;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j10) {
        return convertByWeekyear(j10, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j10) {
        return convertByYear(j10, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return 25025 + getZone().hashCode() + getMinimumDaysInFirstWeek() + this.iCutoverInstant.hashCode();
    }

    public long julianToGregorianByWeekyear(long j10) {
        return convertByWeekyear(j10, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j10) {
        return convertByYear(j10, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology");
        stringBuffer.append('[');
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? ISODateTimeFormat.date() : ISODateTimeFormat.dateTime()).withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZone2 = dateTimeZone;
        if (dateTimeZone == null) {
            dateTimeZone2 = DateTimeZone.getDefault();
        }
        return dateTimeZone2 == getZone() ? this : getInstance(dateTimeZone2, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }
}
