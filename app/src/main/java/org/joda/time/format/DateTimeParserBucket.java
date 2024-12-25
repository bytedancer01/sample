package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeParserBucket.class */
public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeParserBucket$SavedField.class */
    public static class SavedField implements Comparable<SavedField> {
        public DateTimeField iField;
        public Locale iLocale;
        public String iText;
        public int iValue;

        @Override // java.lang.Comparable
        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int compareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            return compareReverse != 0 ? compareReverse : DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        public void init(DateTimeField dateTimeField, int i10) {
            this.iField = dateTimeField;
            this.iValue = i10;
            this.iText = null;
            this.iLocale = null;
        }

        public void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }

        public long set(long j10, boolean z10) {
            String str = this.iText;
            long j11 = str == null ? this.iField.set(j10, this.iValue) : this.iField.set(j10, str, this.iLocale);
            long j12 = j11;
            if (z10) {
                j12 = this.iField.roundFloor(j11);
            }
            return j12;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/format/DateTimeParserBucket$SavedState.class */
    public class SavedState {
        public final Integer iOffset;
        public final SavedField[] iSavedFields;
        public final int iSavedFieldsCount;
        public final DateTimeZone iZone;
        public final DateTimeParserBucket this$0;

        public SavedState(DateTimeParserBucket dateTimeParserBucket) {
            this.this$0 = dateTimeParserBucket;
            this.iZone = dateTimeParserBucket.iZone;
            this.iOffset = dateTimeParserBucket.iOffset;
            this.iSavedFields = dateTimeParserBucket.iSavedFields;
            this.iSavedFieldsCount = dateTimeParserBucket.iSavedFieldsCount;
        }

        public boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != this.this$0) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    @Deprecated
    public DateTimeParserBucket(long j10, Chronology chronology, Locale locale) {
        this(j10, chronology, locale, null, 2000);
    }

    @Deprecated
    public DateTimeParserBucket(long j10, Chronology chronology, Locale locale, Integer num) {
        this(j10, chronology, locale, num, 2000);
    }

    public DateTimeParserBucket(long j10, Chronology chronology, Locale locale, Integer num, int i10) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j10;
        DateTimeZone zone = chronology2.getZone();
        this.iDefaultZone = zone;
        this.iChrono = chronology2.withUTC();
        this.iLocale = locale == null ? Locale.getDefault() : locale;
        this.iDefaultYear = i10;
        this.iDefaultPivotYear = num;
        this.iZone = zone;
        this.iPivotYear = num;
        this.iSavedFields = new SavedField[8];
    }

    public static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r6.iSavedFieldsShared != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.joda.time.format.DateTimeParserBucket.SavedField obtainSaveField() {
        /*
            r6 = this;
            r0 = r6
            org.joda.time.format.DateTimeParserBucket$SavedField[] r0 = r0.iSavedFields
            r10 = r0
            r0 = r6
            int r0 = r0.iSavedFieldsCount
            r8 = r0
            r0 = r8
            r1 = r10
            int r1 = r1.length
            if (r0 == r1) goto L1c
            r0 = r10
            r9 = r0
            r0 = r6
            boolean r0 = r0.iSavedFieldsShared
            if (r0 == 0) goto L46
        L1c:
            r0 = r8
            r1 = r10
            int r1 = r1.length
            if (r0 != r1) goto L2a
            r0 = r8
            r1 = 2
            int r0 = r0 * r1
            r7 = r0
            goto L2e
        L2a:
            r0 = r10
            int r0 = r0.length
            r7 = r0
        L2e:
            r0 = r7
            org.joda.time.format.DateTimeParserBucket$SavedField[] r0 = new org.joda.time.format.DateTimeParserBucket.SavedField[r0]
            r9 = r0
            r0 = r10
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r8
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            r1 = r9
            r0.iSavedFields = r1
            r0 = r6
            r1 = 0
            r0.iSavedFieldsShared = r1
        L46:
            r0 = r6
            r1 = 0
            r0.iSavedState = r1
            r0 = r9
            r1 = r8
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L67
            org.joda.time.format.DateTimeParserBucket$SavedField r0 = new org.joda.time.format.DateTimeParserBucket$SavedField
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r9
            r1 = r8
            r2 = r10
            r0[r1] = r2
        L67:
            r0 = r6
            r1 = r8
            r2 = 1
            int r1 = r1 + r2
            r0.iSavedFieldsCount = r1
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeParserBucket.obtainSaveField():org.joda.time.format.DateTimeParserBucket$SavedField");
    }

    private static void sort(SavedField[] savedFieldArr, int i10) {
        if (i10 > 10) {
            Arrays.sort(savedFieldArr, 0, i10);
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = i11; i12 > 0; i12--) {
                int i13 = i12 - 1;
                if (savedFieldArr[i13].compareTo(savedFieldArr[i12]) > 0) {
                    SavedField savedField = savedFieldArr[i12];
                    savedFieldArr[i12] = savedFieldArr[i13];
                    savedFieldArr[i13] = savedField;
                }
            }
        }
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }

    public long computeMillis(boolean z10) {
        return computeMillis(z10, (CharSequence) null);
    }

    public long computeMillis(boolean z10, CharSequence charSequence) {
        long j10;
        SavedField[] savedFieldArr = this.iSavedFields;
        int i10 = this.iSavedFieldsCount;
        SavedField[] savedFieldArr2 = savedFieldArr;
        if (this.iSavedFieldsShared) {
            savedFieldArr2 = (SavedField[]) savedFieldArr.clone();
            this.iSavedFields = savedFieldArr2;
            this.iSavedFieldsShared = false;
        }
        sort(savedFieldArr2, i10);
        if (i10 > 0) {
            DurationField field = DurationFieldType.months().getField(this.iChrono);
            DurationField field2 = DurationFieldType.days().getField(this.iChrono);
            DurationField durationField = savedFieldArr2[0].iField.getDurationField();
            if (compareReverse(durationField, field) >= 0 && compareReverse(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.iDefaultYear);
                return computeMillis(z10, charSequence);
            }
        }
        long j11 = this.iMillis;
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                j11 = savedFieldArr2[i11].set(j11, z10);
            } catch (IllegalFieldValueException e10) {
                if (charSequence != null) {
                    e10.prependMessage("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e10;
            }
        }
        long j12 = j11;
        if (z10) {
            int i12 = 0;
            while (true) {
                j12 = j11;
                if (i12 >= i10) {
                    break;
                }
                j11 = savedFieldArr2[i12].set(j11, i12 == i10 - 1);
                i12++;
            }
        }
        if (this.iOffset != null) {
            j10 = j12 - r0.intValue();
        } else {
            DateTimeZone dateTimeZone = this.iZone;
            j10 = j12;
            if (dateTimeZone != null) {
                int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j12);
                long j13 = j12 - offsetFromLocal;
                j10 = j13;
                if (offsetFromLocal != this.iZone.getOffset(j13)) {
                    String str = "Illegal instant due to time zone offset transition (" + this.iZone + ')';
                    String str2 = str;
                    if (charSequence != null) {
                        str2 = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
                    }
                    throw new IllegalInstantException(str2);
                }
            }
        }
        return j10;
    }

    public long computeMillis(boolean z10, String str) {
        return computeMillis(z10, (CharSequence) str);
    }

    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int i10;
        int parseInto = internalParser.parseInto(this, charSequence, 0);
        if (parseInto >= 0) {
            i10 = parseInto;
            if (parseInto >= charSequence.length()) {
                return computeMillis(true, charSequence);
            }
        } else {
            i10 = parseInto ^ (-1);
        }
        throw new IllegalArgumentException(FormatUtils.createErrorMessage(charSequence.toString(), i10));
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        return num != null ? num.intValue() : 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.m32148of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeField dateTimeField, int i10) {
        obtainSaveField().init(dateTimeField, i10);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i10) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i10);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState(this);
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i10) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i10);
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }
}
