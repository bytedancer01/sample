package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.achartengine.chart.TimeChart;
import org.joda.time.field.FieldUtils;

/* loaded from: combined.jar:classes3.jar:org/joda/time/PeriodType.class */
public class PeriodType implements Serializable {
    private static PeriodType cDTime;
    private static PeriodType cDays;
    private static PeriodType cHours;
    private static PeriodType cMillis;
    private static PeriodType cMinutes;
    private static PeriodType cMonths;
    private static PeriodType cSeconds;
    private static PeriodType cStandard;
    private static PeriodType cTime;
    private static PeriodType cWeeks;
    private static PeriodType cYD;
    private static PeriodType cYDTime;
    private static PeriodType cYMD;
    private static PeriodType cYMDTime;
    private static PeriodType cYWD;
    private static PeriodType cYWDTime;
    private static PeriodType cYears;
    private static final long serialVersionUID = 2274324892792009998L;
    private final int[] iIndices;
    private final String iName;
    private final DurationFieldType[] iTypes;
    private static final Map<PeriodType, Object> cTypes = new HashMap(32);
    public static int YEAR_INDEX = 0;
    public static int MONTH_INDEX = 1;
    public static int WEEK_INDEX = 2;
    public static int DAY_INDEX = 3;
    public static int HOUR_INDEX = 4;
    public static int MINUTE_INDEX = 5;
    public static int SECOND_INDEX = 6;
    public static int MILLI_INDEX = 7;

    public PeriodType(String str, DurationFieldType[] durationFieldTypeArr, int[] iArr) {
        this.iName = str;
        this.iTypes = durationFieldTypeArr;
        this.iIndices = iArr;
    }

    public static PeriodType dayTime() {
        PeriodType periodType = cDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("DayTime", new DurationFieldType[]{DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{-1, -1, -1, 0, 1, 2, 3, 4});
            cDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType days() {
        PeriodType periodType = cDays;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Days", new DurationFieldType[]{DurationFieldType.days()}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
            cDays = periodType2;
        }
        return periodType2;
    }

    public static PeriodType forFields(DurationFieldType[] durationFieldTypeArr) {
        synchronized (PeriodType.class) {
            if (durationFieldTypeArr != null) {
                try {
                    if (durationFieldTypeArr.length != 0) {
                        for (DurationFieldType durationFieldType : durationFieldTypeArr) {
                            if (durationFieldType == null) {
                                throw new IllegalArgumentException("Types array must not contain null");
                            }
                        }
                        Map<PeriodType, Object> map = cTypes;
                        if (map.isEmpty()) {
                            map.put(standard(), standard());
                            map.put(yearMonthDayTime(), yearMonthDayTime());
                            map.put(yearMonthDay(), yearMonthDay());
                            map.put(yearWeekDayTime(), yearWeekDayTime());
                            map.put(yearWeekDay(), yearWeekDay());
                            map.put(yearDayTime(), yearDayTime());
                            map.put(yearDay(), yearDay());
                            map.put(dayTime(), dayTime());
                            map.put(time(), time());
                            map.put(years(), years());
                            map.put(months(), months());
                            map.put(weeks(), weeks());
                            map.put(days(), days());
                            map.put(hours(), hours());
                            map.put(minutes(), minutes());
                            map.put(seconds(), seconds());
                            map.put(millis(), millis());
                        }
                        PeriodType periodType = new PeriodType(null, durationFieldTypeArr, null);
                        Object obj = map.get(periodType);
                        if (obj instanceof PeriodType) {
                            return (PeriodType) obj;
                        }
                        if (obj != null) {
                            throw new IllegalArgumentException("PeriodType does not support fields: " + obj);
                        }
                        PeriodType standard = standard();
                        ArrayList arrayList = new ArrayList(Arrays.asList(durationFieldTypeArr));
                        PeriodType periodType2 = standard;
                        if (!arrayList.remove(DurationFieldType.years())) {
                            periodType2 = standard.withYearsRemoved();
                        }
                        PeriodType periodType3 = periodType2;
                        if (!arrayList.remove(DurationFieldType.months())) {
                            periodType3 = periodType2.withMonthsRemoved();
                        }
                        PeriodType periodType4 = periodType3;
                        if (!arrayList.remove(DurationFieldType.weeks())) {
                            periodType4 = periodType3.withWeeksRemoved();
                        }
                        PeriodType periodType5 = periodType4;
                        if (!arrayList.remove(DurationFieldType.days())) {
                            periodType5 = periodType4.withDaysRemoved();
                        }
                        PeriodType periodType6 = periodType5;
                        if (!arrayList.remove(DurationFieldType.hours())) {
                            periodType6 = periodType5.withHoursRemoved();
                        }
                        PeriodType periodType7 = periodType6;
                        if (!arrayList.remove(DurationFieldType.minutes())) {
                            periodType7 = periodType6.withMinutesRemoved();
                        }
                        PeriodType periodType8 = periodType7;
                        if (!arrayList.remove(DurationFieldType.seconds())) {
                            periodType8 = periodType7.withSecondsRemoved();
                        }
                        PeriodType periodType9 = periodType8;
                        if (!arrayList.remove(DurationFieldType.millis())) {
                            periodType9 = periodType8.withMillisRemoved();
                        }
                        if (arrayList.size() > 0) {
                            map.put(periodType, arrayList);
                            throw new IllegalArgumentException("PeriodType does not support fields: " + arrayList);
                        }
                        PeriodType periodType10 = new PeriodType(null, periodType9.iTypes, null);
                        PeriodType periodType11 = (PeriodType) map.get(periodType10);
                        if (periodType11 != null) {
                            map.put(periodType10, periodType11);
                            return periodType11;
                        }
                        map.put(periodType10, periodType9);
                        return periodType9;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw new IllegalArgumentException("Types array must not be null or empty");
        }
    }

    public static PeriodType hours() {
        PeriodType periodType = cHours;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Hours", new DurationFieldType[]{DurationFieldType.hours()}, new int[]{-1, -1, -1, -1, 0, -1, -1, -1});
            cHours = periodType2;
        }
        return periodType2;
    }

    public static PeriodType millis() {
        PeriodType periodType = cMillis;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Millis", new DurationFieldType[]{DurationFieldType.millis()}, new int[]{-1, -1, -1, -1, -1, -1, -1, 0});
            cMillis = periodType2;
        }
        return periodType2;
    }

    public static PeriodType minutes() {
        PeriodType periodType = cMinutes;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Minutes", new DurationFieldType[]{DurationFieldType.minutes()}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
            cMinutes = periodType2;
        }
        return periodType2;
    }

    public static PeriodType months() {
        PeriodType periodType = cMonths;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Months", new DurationFieldType[]{DurationFieldType.months()}, new int[]{-1, 0, -1, -1, -1, -1, -1, -1});
            cMonths = periodType2;
        }
        return periodType2;
    }

    public static PeriodType seconds() {
        PeriodType periodType = cSeconds;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Seconds", new DurationFieldType[]{DurationFieldType.seconds()}, new int[]{-1, -1, -1, -1, -1, -1, 0, -1});
            cSeconds = periodType2;
        }
        return periodType2;
    }

    public static PeriodType standard() {
        PeriodType periodType = cStandard;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Standard", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
            cStandard = periodType2;
        }
        return periodType2;
    }

    public static PeriodType time() {
        PeriodType periodType = cTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType(TimeChart.TYPE, new DurationFieldType[]{DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{-1, -1, -1, -1, 0, 1, 2, 3});
            cTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType weeks() {
        PeriodType periodType = cWeeks;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Weeks", new DurationFieldType[]{DurationFieldType.weeks()}, new int[]{-1, -1, 0, -1, -1, -1, -1, -1});
            cWeeks = periodType2;
        }
        return periodType2;
    }

    private PeriodType withFieldRemoved(int i10, String str) {
        int i11 = this.iIndices[i10];
        if (i11 == -1) {
            return this;
        }
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size() - 1];
        int i12 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr2 = this.iTypes;
            if (i12 >= durationFieldTypeArr2.length) {
                break;
            }
            if (i12 < i11) {
                durationFieldTypeArr[i12] = durationFieldTypeArr2[i12];
            } else if (i12 > i11) {
                durationFieldTypeArr[i12 - 1] = durationFieldTypeArr2[i12];
            }
            i12++;
        }
        int[] iArr = new int[8];
        for (int i13 = 0; i13 < 8; i13++) {
            if (i13 < i10) {
                iArr[i13] = this.iIndices[i13];
            } else if (i13 > i10) {
                int i14 = this.iIndices[i13];
                iArr[i13] = i14 == -1 ? -1 : i14 - 1;
            } else {
                iArr[i13] = -1;
            }
        }
        return new PeriodType(getName() + str, durationFieldTypeArr, iArr);
    }

    public static PeriodType yearDay() {
        PeriodType periodType = cYD;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearDay", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.days()}, new int[]{0, -1, -1, 1, -1, -1, -1, -1});
            cYD = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearDayTime() {
        PeriodType periodType = cYDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearDayTime", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, -1, -1, 1, 2, 3, 4, 5});
            cYDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearMonthDay() {
        PeriodType periodType = cYMD;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearMonthDay", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days()}, new int[]{0, 1, -1, 2, -1, -1, -1, -1});
            cYMD = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearMonthDayTime() {
        PeriodType periodType = cYMDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearMonthDayTime", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, 1, -1, 2, 3, 4, 5, 6});
            cYMDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearWeekDay() {
        PeriodType periodType = cYWD;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearWeekDay", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days()}, new int[]{0, -1, 1, 2, -1, -1, -1, -1});
            cYWD = periodType2;
        }
        return periodType2;
    }

    public static PeriodType yearWeekDayTime() {
        PeriodType periodType = cYWDTime;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("YearWeekDayTime", new DurationFieldType[]{DurationFieldType.years(), DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.hours(), DurationFieldType.minutes(), DurationFieldType.seconds(), DurationFieldType.millis()}, new int[]{0, -1, 1, 2, 3, 4, 5, 6});
            cYWDTime = periodType2;
        }
        return periodType2;
    }

    public static PeriodType years() {
        PeriodType periodType = cYears;
        PeriodType periodType2 = periodType;
        if (periodType == null) {
            periodType2 = new PeriodType("Years", new DurationFieldType[]{DurationFieldType.years()}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
            cYears = periodType2;
        }
        return periodType2;
    }

    public boolean addIndexedField(ReadablePeriod readablePeriod, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            return false;
        }
        int i12 = this.iIndices[i10];
        if (i12 == -1) {
            throw new UnsupportedOperationException("Field is not supported");
        }
        iArr[i12] = FieldUtils.safeAdd(iArr[i12], i11);
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PeriodType) {
            return Arrays.equals(this.iTypes, ((PeriodType) obj).iTypes);
        }
        return false;
    }

    public DurationFieldType getFieldType(int i10) {
        return this.iTypes[i10];
    }

    public int getIndexedField(ReadablePeriod readablePeriod, int i10) {
        int i11 = this.iIndices[i10];
        return i11 == -1 ? 0 : readablePeriod.getValue(i11);
    }

    public String getName() {
        return this.iName;
    }

    public int hashCode() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            DurationFieldType[] durationFieldTypeArr = this.iTypes;
            if (i10 >= durationFieldTypeArr.length) {
                return i11;
            }
            i11 += durationFieldTypeArr[i10].hashCode();
            i10++;
        }
    }

    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.iTypes[i10] == durationFieldType) {
                return i10;
            }
        }
        return -1;
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return indexOf(durationFieldType) >= 0;
    }

    public boolean setIndexedField(ReadablePeriod readablePeriod, int i10, int[] iArr, int i11) {
        int i12 = this.iIndices[i10];
        if (i12 == -1) {
            throw new UnsupportedOperationException("Field is not supported");
        }
        iArr[i12] = i11;
        return true;
    }

    public int size() {
        return this.iTypes.length;
    }

    public String toString() {
        return "PeriodType[" + getName() + "]";
    }

    public PeriodType withDaysRemoved() {
        return withFieldRemoved(3, "NoDays");
    }

    public PeriodType withHoursRemoved() {
        return withFieldRemoved(4, "NoHours");
    }

    public PeriodType withMillisRemoved() {
        return withFieldRemoved(7, "NoMillis");
    }

    public PeriodType withMinutesRemoved() {
        return withFieldRemoved(5, "NoMinutes");
    }

    public PeriodType withMonthsRemoved() {
        return withFieldRemoved(1, "NoMonths");
    }

    public PeriodType withSecondsRemoved() {
        return withFieldRemoved(6, "NoSeconds");
    }

    public PeriodType withWeeksRemoved() {
        return withFieldRemoved(2, "NoWeeks");
    }

    public PeriodType withYearsRemoved() {
        return withFieldRemoved(0, "NoYears");
    }
}
