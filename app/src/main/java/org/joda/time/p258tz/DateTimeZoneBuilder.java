package org.joda.time.p258tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder.class */
public class DateTimeZoneBuilder {
    private final ArrayList<RuleSet> iRuleSets = new ArrayList<>(10);

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder$DSTZone.class */
    public static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        public final Recurrence iEndRecurrence;
        public final int iStandardOffset;
        public final Recurrence iStartRecurrence;

        public DSTZone(String str, int i10, Recurrence recurrence, Recurrence recurrence2) {
            super(str);
            this.iStandardOffset = i10;
            this.iStartRecurrence = recurrence;
            this.iEndRecurrence = recurrence2;
        }

        private Recurrence findMatchingRecurrence(long j10) {
            long j11;
            int i10 = this.iStandardOffset;
            Recurrence recurrence = this.iStartRecurrence;
            Recurrence recurrence2 = this.iEndRecurrence;
            try {
                j11 = recurrence.next(j10, i10, recurrence2.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException e10) {
                j11 = j10;
            }
            try {
                j10 = recurrence2.next(j10, i10, recurrence.getSaveMillis());
            } catch (ArithmeticException | IllegalArgumentException e11) {
            }
            if (j11 > j10) {
                recurrence2 = recurrence;
            }
            return recurrence2;
        }

        public static DSTZone readFrom(DataInput dataInput, String str) {
            return new DSTZone(str, (int) DateTimeZoneBuilder.readMillis(dataInput), Recurrence.readFrom(dataInput), Recurrence.readFrom(dataInput));
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            if (!getID().equals(dSTZone.getID()) || this.iStandardOffset != dSTZone.iStandardOffset || !this.iStartRecurrence.equals(dSTZone.iStartRecurrence) || !this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                z10 = false;
            }
            return z10;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j10) {
            return findMatchingRecurrence(j10).getNameKey();
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j10) {
            return this.iStandardOffset + findMatchingRecurrence(j10).getSaveMillis();
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j10) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
        
            if (r0 < 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long nextTransition(long r7) {
            /*
                r6 = this;
                r0 = r6
                int r0 = r0.iStandardOffset
                r9 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iStartRecurrence
                r14 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iEndRecurrence
                r16 = r0
                r0 = r14
                r1 = r7
                r2 = r9
                r3 = r16
                int r3 = r3.getSaveMillis()     // Catch: java.lang.Throwable -> L6e
                long r0 = r0.next(r1, r2, r3)     // Catch: java.lang.Throwable -> L6e
                r12 = r0
                r0 = r12
                r10 = r0
                r0 = r7
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L37
                r0 = r12
                r10 = r0
                r0 = r12
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L37
            L34:
                r0 = r7
                r10 = r0
            L37:
                r0 = r16
                r1 = r7
                r2 = r9
                r3 = r14
                int r3 = r3.getSaveMillis()     // Catch: java.lang.Throwable -> L5b
                long r0 = r0.next(r1, r2, r3)     // Catch: java.lang.Throwable -> L5b
                r12 = r0
                r0 = r7
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L55
                r0 = r12
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L55
                goto L5d
            L55:
                r0 = r12
                r7 = r0
                goto L5d
            L5b:
                r14 = move-exception
            L5d:
                r0 = r10
                r12 = r0
                r0 = r10
                r1 = r7
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L6b
                r0 = r7
                r12 = r0
            L6b:
                r0 = r12
                return r0
            L6e:
                r15 = move-exception
                goto L34
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.nextTransition(long):long");
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
        
            if (r0 > 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long previousTransition(long r7) {
            /*
                r6 = this;
                r0 = r7
                r1 = 1
                long r0 = r0 + r1
                r10 = r0
                r0 = r6
                int r0 = r0.iStandardOffset
                r9 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iStartRecurrence
                r15 = r0
                r0 = r6
                org.joda.time.tz.DateTimeZoneBuilder$Recurrence r0 = r0.iEndRecurrence
                r16 = r0
                r0 = r15
                r1 = r10
                r2 = r9
                r3 = r16
                int r3 = r3.getSaveMillis()     // Catch: java.lang.Throwable -> L76
                long r0 = r0.previous(r1, r2, r3)     // Catch: java.lang.Throwable -> L76
                r12 = r0
                r0 = r12
                r7 = r0
                r0 = r10
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L3c
                r0 = r12
                r7 = r0
                r0 = r12
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L3c
            L39:
                r0 = r10
                r7 = r0
            L3c:
                r0 = r16
                r1 = r10
                r2 = r9
                r3 = r15
                int r3 = r3.getSaveMillis()     // Catch: java.lang.Throwable -> L63
                long r0 = r0.previous(r1, r2, r3)     // Catch: java.lang.Throwable -> L63
                r12 = r0
                r0 = r10
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L5c
                r0 = r12
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L5c
                goto L65
            L5c:
                r0 = r12
                r10 = r0
                goto L65
            L63:
                r14 = move-exception
            L65:
                r0 = r7
                r1 = r10
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L6f
                goto L72
            L6f:
                r0 = r10
                r7 = r0
            L72:
                r0 = r7
                r1 = 1
                long r0 = r0 - r1
                return r0
            L76:
                r14 = move-exception
                goto L39
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.DateTimeZoneBuilder.DSTZone.previousTransition(long):long");
        }

        public void writeTo(DataOutput dataOutput) {
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffset);
            this.iStartRecurrence.writeTo(dataOutput);
            this.iEndRecurrence.writeTo(dataOutput);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder$OfYear.class */
    public static final class OfYear {
        public final boolean iAdvance;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final char iMode;
        public final int iMonthOfYear;

        public OfYear(char c10, int i10, int i11, int i12, boolean z10, int i13) {
            if (c10 != 'u' && c10 != 'w' && c10 != 's') {
                throw new IllegalArgumentException("Unknown mode: " + c10);
            }
            this.iMode = c10;
            this.iMonthOfYear = i10;
            this.iDayOfMonth = i11;
            this.iDayOfWeek = i12;
            this.iAdvance = z10;
            this.iMillisOfDay = i13;
        }

        public static OfYear readFrom(DataInput dataInput) {
            return new OfYear((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        private long setDayOfMonth(Chronology chronology, long j10) {
            long add;
            if (this.iDayOfMonth >= 0) {
                add = chronology.dayOfMonth().set(j10, this.iDayOfMonth);
            } else {
                add = chronology.dayOfMonth().add(chronology.monthOfYear().add(chronology.dayOfMonth().set(j10, 1), 1), this.iDayOfMonth);
            }
            return add;
        }

        private long setDayOfMonthNext(Chronology chronology, long j10) {
            long dayOfMonth;
            try {
                dayOfMonth = setDayOfMonth(chronology, j10);
            } catch (IllegalArgumentException e10) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e10;
                }
                while (!chronology.year().isLeap(j10)) {
                    j10 = chronology.year().add(j10, 1);
                }
                dayOfMonth = setDayOfMonth(chronology, j10);
            }
            return dayOfMonth;
        }

        private long setDayOfMonthPrevious(Chronology chronology, long j10) {
            long dayOfMonth;
            try {
                dayOfMonth = setDayOfMonth(chronology, j10);
            } catch (IllegalArgumentException e10) {
                if (this.iMonthOfYear != 2 || this.iDayOfMonth != 29) {
                    throw e10;
                }
                while (!chronology.year().isLeap(j10)) {
                    j10 = chronology.year().add(j10, -1);
                }
                dayOfMonth = setDayOfMonth(chronology, j10);
            }
            return dayOfMonth;
        }

        private long setDayOfWeek(Chronology chronology, long j10) {
            int i10;
            int i11 = this.iDayOfWeek - chronology.dayOfWeek().get(j10);
            long j11 = j10;
            if (i11 != 0) {
                if (this.iAdvance) {
                    i10 = i11;
                    if (i11 < 0) {
                        i10 = i11 + 7;
                    }
                } else {
                    i10 = i11;
                    if (i11 > 0) {
                        i10 = i11 - 7;
                    }
                }
                j11 = chronology.dayOfWeek().add(j10, i10);
            }
            return j11;
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfYear)) {
                return false;
            }
            OfYear ofYear = (OfYear) obj;
            if (this.iMode != ofYear.iMode || this.iMonthOfYear != ofYear.iMonthOfYear || this.iDayOfMonth != ofYear.iDayOfMonth || this.iDayOfWeek != ofYear.iDayOfWeek || this.iAdvance != ofYear.iAdvance || this.iMillisOfDay != ofYear.iMillisOfDay) {
                z10 = false;
            }
            return z10;
        }

        public long next(long j10, int i10, int i11) {
            long j11;
            char c10 = this.iMode;
            if (c10 == 'w') {
                i10 += i11;
            } else if (c10 != 's') {
                i10 = 0;
            }
            long j12 = i10;
            long j13 = j10 + j12;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthNext = setDayOfMonthNext(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j13, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek == 0) {
                j11 = dayOfMonthNext;
                if (dayOfMonthNext <= j13) {
                    j11 = setDayOfMonthNext(instanceUTC, instanceUTC.year().add(dayOfMonthNext, 1));
                }
            } else {
                long dayOfWeek = setDayOfWeek(instanceUTC, dayOfMonthNext);
                j11 = dayOfWeek;
                if (dayOfWeek <= j13) {
                    j11 = setDayOfWeek(instanceUTC, setDayOfMonthNext(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfWeek, 1), this.iMonthOfYear)));
                }
            }
            return j11 - j12;
        }

        public long previous(long j10, int i10, int i11) {
            long j11;
            char c10 = this.iMode;
            if (c10 == 'w') {
                i10 += i11;
            } else if (c10 != 's') {
                i10 = 0;
            }
            long j12 = i10;
            long j13 = j10 + j12;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonthPrevious = setDayOfMonthPrevious(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j13, this.iMonthOfYear), 0), this.iMillisOfDay));
            if (this.iDayOfWeek == 0) {
                j11 = dayOfMonthPrevious;
                if (dayOfMonthPrevious >= j13) {
                    j11 = setDayOfMonthPrevious(instanceUTC, instanceUTC.year().add(dayOfMonthPrevious, -1));
                }
            } else {
                long dayOfWeek = setDayOfWeek(instanceUTC, dayOfMonthPrevious);
                j11 = dayOfWeek;
                if (dayOfWeek >= j13) {
                    j11 = setDayOfWeek(instanceUTC, setDayOfMonthPrevious(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(dayOfWeek, -1), this.iMonthOfYear)));
                }
            }
            return j11 - j12;
        }

        public long setInstant(int i10, int i11, int i12) {
            char c10 = this.iMode;
            if (c10 == 'w') {
                i11 += i12;
            } else if (c10 != 's') {
                i11 = 0;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long dayOfMonth = setDayOfMonth(instanceUTC, instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(instanceUTC.year().set(0L, i10), this.iMonthOfYear), this.iMillisOfDay));
            long j10 = dayOfMonth;
            if (this.iDayOfWeek != 0) {
                j10 = setDayOfWeek(instanceUTC, dayOfMonth);
            }
            return j10 - i11;
        }

        public void writeTo(DataOutput dataOutput) {
            dataOutput.writeByte(this.iMode);
            dataOutput.writeByte(this.iMonthOfYear);
            dataOutput.writeByte(this.iDayOfMonth);
            dataOutput.writeByte(this.iDayOfWeek);
            dataOutput.writeBoolean(this.iAdvance);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iMillisOfDay);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder$PrecalculatedZone.class */
    public static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        public static PrecalculatedZone create(String str, boolean z10, ArrayList<Transition> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalArgumentException();
            }
            long[] jArr = new long[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            String[] strArr = new String[size];
            Transition transition = null;
            int i10 = 0;
            while (i10 < size) {
                Transition transition2 = arrayList.get(i10);
                if (!transition2.isTransitionFrom(transition)) {
                    throw new IllegalArgumentException(str);
                }
                jArr[i10] = transition2.getMillis();
                iArr[i10] = transition2.getWallOffset();
                iArr2[i10] = transition2.getStandardOffset();
                strArr[i10] = transition2.getNameKey();
                i10++;
                transition = transition2;
            }
            String[] strArr2 = new String[5];
            String[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
            int i11 = 0;
            while (i11 < zoneStrings.length) {
                String[] strArr3 = zoneStrings[i11];
                String[] strArr4 = strArr2;
                if (strArr3 != null) {
                    strArr4 = strArr2;
                    if (strArr3.length == 5) {
                        strArr4 = strArr2;
                        if (str.equals(strArr3[0])) {
                            strArr4 = strArr3;
                        }
                    }
                }
                i11++;
                strArr2 = strArr4;
            }
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 >= size - 1) {
                    break;
                }
                String str2 = strArr[i13];
                int i14 = i13 + 1;
                String str3 = strArr[i14];
                long j10 = iArr[i13];
                long j11 = iArr[i14];
                long j12 = iArr2[i13];
                long j13 = iArr2[i14];
                Period period = new Period(jArr[i13], jArr[i14], PeriodType.yearMonthDay(), instanceUTC);
                int i15 = i13;
                if (j10 != j11) {
                    i15 = i13;
                    if (j12 == j13) {
                        i15 = i13;
                        if (str2.equals(str3)) {
                            i15 = i13;
                            if (period.getYears() == 0) {
                                i15 = i13;
                                if (period.getMonths() > 4) {
                                    i15 = i13;
                                    if (period.getMonths() < 8) {
                                        i15 = i13;
                                        if (str2.equals(strArr2[2])) {
                                            i15 = i13;
                                            if (str2.equals(strArr2[4])) {
                                                if (ZoneInfoCompiler.verbose()) {
                                                    System.out.println("Fixing duplicate name key - " + str3);
                                                    System.out.println("     - " + new DateTime(jArr[i13], instanceUTC) + " - " + new DateTime(jArr[i14], instanceUTC));
                                                }
                                                if (j10 > j11) {
                                                    strArr[i13] = (str2 + "-Summer").intern();
                                                    i15 = i13;
                                                } else {
                                                    i15 = i13;
                                                    if (j10 < j11) {
                                                        strArr[i14] = (str3 + "-Summer").intern();
                                                        i15 = i14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i12 = i15 + 1;
            }
            if (dSTZone == null || !dSTZone.iStartRecurrence.getNameKey().equals(dSTZone.iEndRecurrence.getNameKey())) {
                dSTZone2 = dSTZone;
            } else {
                if (ZoneInfoCompiler.verbose()) {
                    System.out.println("Fixing duplicate recurrent name key - " + dSTZone.iStartRecurrence.getNameKey());
                }
                dSTZone2 = dSTZone.iStartRecurrence.getSaveMillis() > 0 ? new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence.renameAppend("-Summer"), dSTZone.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone.iStandardOffset, dSTZone.iStartRecurrence, dSTZone.iEndRecurrence.renameAppend("-Summer"));
            }
            if (!z10) {
                str = "";
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr, dSTZone2);
        }

        public static PrecalculatedZone readFrom(DataInput dataInput, String str) {
            int readUnsignedByte;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i10 = 0; i10 < readUnsignedShort; i10++) {
                strArr[i10] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i11 = 0; i11 < readInt; i11++) {
                jArr[i11] = DateTimeZoneBuilder.readMillis(dataInput);
                iArr[i11] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                iArr2[i11] = (int) DateTimeZoneBuilder.readMillis(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        readUnsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    readUnsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i11] = strArr[readUnsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone != null) {
                }
                return z10;
            }
            z10 = false;
            return z10;
        }

        @Override // org.joda.time.DateTimeZone
        public String getNameKey(long j10) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j10);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i10 = binarySearch ^ (-1);
            if (i10 < jArr.length) {
                return i10 > 0 ? this.iNameKeys[i10 - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i10 - 1] : dSTZone.getNameKey(j10);
        }

        @Override // org.joda.time.DateTimeZone
        public int getOffset(long j10) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j10);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i10 = binarySearch ^ (-1);
            if (i10 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i10 - 1] : dSTZone.getOffset(j10);
            }
            if (i10 > 0) {
                return this.iWallOffsets[i10 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public int getStandardOffset(long j10) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j10);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i10 = binarySearch ^ (-1);
            if (i10 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i10 - 1] : dSTZone.getStandardOffset(j10);
            }
            if (i10 > 0) {
                return this.iStandardOffsets[i10 - 1];
            }
            return 0;
        }

        public boolean isCachable() {
            int i10;
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d10 = 0.0d;
            int i11 = 1;
            int i12 = 0;
            while (true) {
                i10 = i12;
                if (i11 >= jArr.length) {
                    break;
                }
                long j10 = jArr[i11] - jArr[i11 - 1];
                double d11 = d10;
                int i13 = i10;
                if (j10 < 63158400000L) {
                    d11 = d10 + j10;
                    i13 = i10 + 1;
                }
                i11++;
                d10 = d11;
                i12 = i13;
            }
            return i10 > 0 && (d10 / ((double) i10)) / 8.64E7d >= 25.0d;
        }

        @Override // org.joda.time.DateTimeZone
        public boolean isFixed() {
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public long nextTransition(long j10) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j10);
            int i10 = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ (-1);
            if (i10 < jArr.length) {
                return jArr[i10];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j10;
            }
            long j11 = jArr[jArr.length - 1];
            long j12 = j10;
            if (j10 < j11) {
                j12 = j11;
            }
            return dSTZone.nextTransition(j12);
        }

        @Override // org.joda.time.DateTimeZone
        public long previousTransition(long j10) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j10);
            if (binarySearch >= 0) {
                long j11 = j10;
                if (j10 > Long.MIN_VALUE) {
                    j11 = j10 - 1;
                }
                return j11;
            }
            int i10 = binarySearch ^ (-1);
            if (i10 < jArr.length) {
                if (i10 > 0) {
                    long j12 = jArr[i10 - 1];
                    if (j12 > Long.MIN_VALUE) {
                        return j12 - 1;
                    }
                }
                return j10;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long previousTransition = dSTZone.previousTransition(j10);
                if (previousTransition < j10) {
                    return previousTransition;
                }
            }
            long j13 = jArr[i10 - 1];
            return j13 > Long.MIN_VALUE ? j13 - 1 : j10;
        }

        public void writeTo(DataOutput dataOutput) {
            int length = this.iTransitions.length;
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < length; i10++) {
                hashSet.add(this.iNameKeys[i10]);
            }
            int size = hashSet.size();
            if (size > 65535) {
                throw new UnsupportedOperationException("String pool is too large");
            }
            String[] strArr = new String[size];
            Iterator it = hashSet.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                strArr[i11] = (String) it.next();
                i11++;
            }
            dataOutput.writeShort(size);
            for (int i12 = 0; i12 < size; i12++) {
                dataOutput.writeUTF(strArr[i12]);
            }
            dataOutput.writeInt(length);
            for (int i13 = 0; i13 < length; i13++) {
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iTransitions[i13]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iWallOffsets[i13]);
                DateTimeZoneBuilder.writeMillis(dataOutput, this.iStandardOffsets[i13]);
                String str = this.iNameKeys[i13];
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    if (!strArr[i14].equals(str)) {
                        i14++;
                    } else if (size < 256) {
                        dataOutput.writeByte(i14);
                    } else {
                        dataOutput.writeShort(i14);
                    }
                }
            }
            dataOutput.writeBoolean(this.iTailZone != null);
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                dSTZone.writeTo(dataOutput);
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder$Recurrence.class */
    public static final class Recurrence {
        public final String iNameKey;
        public final OfYear iOfYear;
        public final int iSaveMillis;

        public Recurrence(OfYear ofYear, String str, int i10) {
            this.iOfYear = ofYear;
            this.iNameKey = str;
            this.iSaveMillis = i10;
        }

        public static Recurrence readFrom(DataInput dataInput) {
            return new Recurrence(OfYear.readFrom(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.readMillis(dataInput));
        }

        public boolean equals(Object obj) {
            boolean z10 = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            if (this.iSaveMillis != recurrence.iSaveMillis || !this.iNameKey.equals(recurrence.iNameKey) || !this.iOfYear.equals(recurrence.iOfYear)) {
                z10 = false;
            }
            return z10;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public OfYear getOfYear() {
            return this.iOfYear;
        }

        public int getSaveMillis() {
            return this.iSaveMillis;
        }

        public long next(long j10, int i10, int i11) {
            return this.iOfYear.next(j10, i10, i11);
        }

        public long previous(long j10, int i10, int i11) {
            return this.iOfYear.previous(j10, i10, i11);
        }

        public Recurrence rename(String str) {
            return new Recurrence(this.iOfYear, str, this.iSaveMillis);
        }

        public Recurrence renameAppend(String str) {
            return rename((this.iNameKey + str).intern());
        }

        public void writeTo(DataOutput dataOutput) {
            this.iOfYear.writeTo(dataOutput);
            dataOutput.writeUTF(this.iNameKey);
            DateTimeZoneBuilder.writeMillis(dataOutput, this.iSaveMillis);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder$Rule.class */
    public static final class Rule {
        public final int iFromYear;
        public final Recurrence iRecurrence;
        public final int iToYear;

        public Rule(Recurrence recurrence, int i10, int i11) {
            this.iRecurrence = recurrence;
            this.iFromYear = i10;
            this.iToYear = i11;
        }

        public int getFromYear() {
            return this.iFromYear;
        }

        public String getNameKey() {
            return this.iRecurrence.getNameKey();
        }

        public OfYear getOfYear() {
            return this.iRecurrence.getOfYear();
        }

        public int getSaveMillis() {
            return this.iRecurrence.getSaveMillis();
        }

        public int getToYear() {
            return this.iToYear;
        }

        public long next(long j10, int i10, int i11) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            int i12 = i10 + i11;
            long next = this.iRecurrence.next(((j10 > Long.MIN_VALUE ? 1 : (j10 == Long.MIN_VALUE ? 0 : -1)) == 0 ? Integer.MIN_VALUE : instanceUTC.year().get(((long) i12) + j10)) < this.iFromYear ? (instanceUTC.year().set(0L, this.iFromYear) - i12) - 1 : j10, i10, i11);
            if (next <= j10 || instanceUTC.year().get(i12 + next) <= this.iToYear) {
                j10 = next;
            }
            return j10;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder$RuleSet.class */
    public static final class RuleSet {
        private static final int YEAR_LIMIT = ISOChronology.getInstanceUTC().year().get(DateTimeUtils.currentTimeMillis()) + 100;
        private String iInitialNameKey;
        private int iInitialSaveMillis;
        private ArrayList<Rule> iRules;
        private int iStandardOffset;
        private OfYear iUpperOfYear;
        private int iUpperYear;

        public RuleSet() {
            this.iRules = new ArrayList<>(10);
            this.iUpperYear = Integer.MAX_VALUE;
        }

        public RuleSet(RuleSet ruleSet) {
            this.iStandardOffset = ruleSet.iStandardOffset;
            this.iRules = new ArrayList<>(ruleSet.iRules);
            this.iInitialNameKey = ruleSet.iInitialNameKey;
            this.iInitialSaveMillis = ruleSet.iInitialSaveMillis;
            this.iUpperYear = ruleSet.iUpperYear;
            this.iUpperOfYear = ruleSet.iUpperOfYear;
        }

        public void addRule(Rule rule) {
            if (this.iRules.contains(rule)) {
                return;
            }
            this.iRules.add(rule);
        }

        public DSTZone buildTailZone(String str) {
            if (this.iRules.size() != 2) {
                return null;
            }
            Rule rule = this.iRules.get(0);
            Rule rule2 = this.iRules.get(1);
            if (rule.getToYear() == Integer.MAX_VALUE && rule2.getToYear() == Integer.MAX_VALUE) {
                return new DSTZone(str, this.iStandardOffset, rule.iRecurrence, rule2.iRecurrence);
            }
            return null;
        }

        public Transition firstTransition(long j10) {
            Transition transition;
            String str = this.iInitialNameKey;
            if (str != null) {
                int i10 = this.iStandardOffset;
                return new Transition(j10, str, i10 + this.iInitialSaveMillis, i10);
            }
            ArrayList<Rule> arrayList = new ArrayList<>(this.iRules);
            long j11 = Long.MIN_VALUE;
            int i11 = 0;
            Transition transition2 = null;
            while (true) {
                Transition nextTransition = nextTransition(j11, i11);
                transition = transition2;
                if (nextTransition == null) {
                    break;
                }
                j11 = nextTransition.getMillis();
                if (j11 == j10) {
                    transition = new Transition(j10, nextTransition);
                    break;
                }
                if (j11 > j10) {
                    Transition transition3 = transition2;
                    if (transition2 == null) {
                        Iterator<Rule> it = arrayList.iterator();
                        while (true) {
                            transition3 = transition2;
                            if (!it.hasNext()) {
                                break;
                            }
                            Rule next = it.next();
                            if (next.getSaveMillis() == 0) {
                                transition3 = new Transition(j10, next, this.iStandardOffset);
                                break;
                            }
                        }
                    }
                    transition = transition3;
                    if (transition3 == null) {
                        String nameKey = nextTransition.getNameKey();
                        int i12 = this.iStandardOffset;
                        transition = new Transition(j10, nameKey, i12, i12);
                    }
                } else {
                    transition2 = new Transition(j10, nextTransition);
                    i11 = nextTransition.getSaveMillis();
                }
            }
            this.iRules = arrayList;
            return transition;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public long getUpperLimit(int i10) {
            int i11 = this.iUpperYear;
            if (i11 == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return this.iUpperOfYear.setInstant(i11, this.iStandardOffset, i10);
        }

        public Transition nextTransition(long j10, int i10) {
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            Iterator<Rule> it = this.iRules.iterator();
            long j11 = Long.MAX_VALUE;
            Rule rule = null;
            while (it.hasNext()) {
                Rule next = it.next();
                long next2 = next.next(j10, this.iStandardOffset, i10);
                if (next2 <= j10) {
                    it.remove();
                } else if (next2 <= j11) {
                    rule = next;
                    j11 = next2;
                }
            }
            if (rule == null || instanceUTC.year().get(j11) >= YEAR_LIMIT) {
                return null;
            }
            int i11 = this.iUpperYear;
            if (i11 >= Integer.MAX_VALUE || j11 < this.iUpperOfYear.setInstant(i11, this.iStandardOffset, i10)) {
                return new Transition(j11, rule, this.iStandardOffset);
            }
            return null;
        }

        public void setFixedSavings(String str, int i10) {
            this.iInitialNameKey = str;
            this.iInitialSaveMillis = i10;
        }

        public void setStandardOffset(int i10) {
            this.iStandardOffset = i10;
        }

        public void setUpperLimit(int i10, OfYear ofYear) {
            this.iUpperYear = i10;
            this.iUpperOfYear = ofYear;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/joda/time/tz/DateTimeZoneBuilder$Transition.class */
    public static final class Transition {
        private final long iMillis;
        private final String iNameKey;
        private final int iStandardOffset;
        private final int iWallOffset;

        public Transition(long j10, String str, int i10, int i11) {
            this.iMillis = j10;
            this.iNameKey = str;
            this.iWallOffset = i10;
            this.iStandardOffset = i11;
        }

        public Transition(long j10, Rule rule, int i10) {
            this.iMillis = j10;
            this.iNameKey = rule.getNameKey();
            this.iWallOffset = rule.getSaveMillis() + i10;
            this.iStandardOffset = i10;
        }

        public Transition(long j10, Transition transition) {
            this.iMillis = j10;
            this.iNameKey = transition.iNameKey;
            this.iWallOffset = transition.iWallOffset;
            this.iStandardOffset = transition.iStandardOffset;
        }

        public long getMillis() {
            return this.iMillis;
        }

        public String getNameKey() {
            return this.iNameKey;
        }

        public int getSaveMillis() {
            return this.iWallOffset - this.iStandardOffset;
        }

        public int getStandardOffset() {
            return this.iStandardOffset;
        }

        public int getWallOffset() {
            return this.iWallOffset;
        }

        public boolean isTransitionFrom(Transition transition) {
            boolean z10;
            if (transition == null) {
                return true;
            }
            if (this.iMillis > transition.iMillis) {
                z10 = true;
                if (this.iWallOffset == transition.iWallOffset) {
                    if (!this.iNameKey.equals(transition.iNameKey)) {
                        z10 = true;
                    }
                }
                return z10;
            }
            z10 = false;
            return z10;
        }
    }

    private boolean addTransition(ArrayList<Transition> arrayList, Transition transition) {
        int size = arrayList.size();
        if (size == 0) {
            arrayList.add(transition);
            return true;
        }
        int i10 = size - 1;
        Transition transition2 = arrayList.get(i10);
        int i11 = 0;
        if (!transition.isTransitionFrom(transition2)) {
            return false;
        }
        if (size >= 2) {
            i11 = arrayList.get(size - 2).getWallOffset();
        }
        if (transition.getMillis() + transition2.getWallOffset() != transition2.getMillis() + i11) {
            arrayList.add(transition);
            return true;
        }
        arrayList.remove(i10);
        return addTransition(arrayList, transition);
    }

    private static DateTimeZone buildFixedZone(String str, String str2, int i10, int i11) {
        return ("UTC".equals(str) && str.equals(str2) && i10 == 0 && i11 == 0) ? DateTimeZone.UTC : new FixedDateTimeZone(str, str2, i10, i11);
    }

    private RuleSet getLastRuleSet() {
        if (this.iRuleSets.size() == 0) {
            addCutover(NTLMEngineImpl.FLAG_REQUEST_56BIT_ENCRYPTION, 'w', 1, 1, 0, false, 0);
        }
        ArrayList<RuleSet> arrayList = this.iRuleSets;
        return arrayList.get(arrayList.size() - 1);
    }

    public static DateTimeZone readFrom(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (readUnsignedByte != 70) {
            if (readUnsignedByte == 80) {
                return PrecalculatedZone.readFrom(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) readMillis(dataInput), (int) readMillis(dataInput));
        Object obj = DateTimeZone.UTC;
        FixedDateTimeZone fixedDateTimeZone2 = fixedDateTimeZone;
        if (fixedDateTimeZone.equals(obj)) {
            fixedDateTimeZone2 = obj;
        }
        return fixedDateTimeZone2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DateTimeZone readFrom(InputStream inputStream, String str) {
        return inputStream instanceof DataInput ? readFrom((DataInput) inputStream, str) : readFrom((DataInput) new DataInputStream(inputStream), str);
    }

    public static long readMillis(DataInput dataInput) {
        long readUnsignedByte;
        long j10;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i10 = readUnsignedByte2 >> 6;
        if (i10 == 1) {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j10 = 60000;
        } else if (i10 == 2) {
            readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j10 = 1000;
        } else {
            if (i10 == 3) {
                return dataInput.readLong();
            }
            readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
            j10 = 1800000;
        }
        return readUnsignedByte * j10;
    }

    public static void writeMillis(DataOutput dataOutput, long j10) {
        if (j10 % 1800000 == 0) {
            long j11 = j10 / 1800000;
            if (((j11 << 58) >> 58) == j11) {
                dataOutput.writeByte((int) (j11 & 63));
                return;
            }
        }
        if (j10 % 60000 == 0) {
            long j12 = j10 / 60000;
            if (((j12 << 34) >> 34) == j12) {
                dataOutput.writeInt(1073741824 | ((int) (j12 & 1073741823)));
                return;
            }
        }
        if (j10 % 1000 == 0) {
            long j13 = j10 / 1000;
            if (((j13 << 26) >> 26) == j13) {
                dataOutput.writeByte(((int) ((j13 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) ((-1) & j13));
                return;
            }
        }
        dataOutput.writeByte(j10 < 0 ? 255 : 192);
        dataOutput.writeLong(j10);
    }

    public DateTimeZoneBuilder addCutover(int i10, char c10, int i11, int i12, int i13, boolean z10, int i14) {
        if (this.iRuleSets.size() > 0) {
            OfYear ofYear = new OfYear(c10, i11, i12, i13, z10, i14);
            ArrayList<RuleSet> arrayList = this.iRuleSets;
            arrayList.get(arrayList.size() - 1).setUpperLimit(i10, ofYear);
        }
        this.iRuleSets.add(new RuleSet());
        return this;
    }

    public DateTimeZoneBuilder addRecurringSavings(String str, int i10, int i11, int i12, char c10, int i13, int i14, int i15, boolean z10, int i16) {
        if (i11 <= i12) {
            getLastRuleSet().addRule(new Rule(new Recurrence(new OfYear(c10, i13, i14, i15, z10, i16), str, i10), i11, i12));
        }
        return this;
    }

    public DateTimeZoneBuilder setFixedSavings(String str, int i10) {
        getLastRuleSet().setFixedSavings(str, i10);
        return this;
    }

    public DateTimeZoneBuilder setStandardOffset(int i10) {
        getLastRuleSet().setStandardOffset(i10);
        return this;
    }

    public DateTimeZone toDateTimeZone(String str, boolean z10) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<Transition> arrayList = new ArrayList<>();
        DSTZone dSTZone = null;
        long j10 = Long.MIN_VALUE;
        int size = this.iRuleSets.size();
        for (int i10 = 0; i10 < size; i10++) {
            RuleSet ruleSet = this.iRuleSets.get(i10);
            Transition firstTransition = ruleSet.firstTransition(j10);
            if (firstTransition != null) {
                addTransition(arrayList, firstTransition);
                long millis = firstTransition.getMillis();
                int saveMillis = firstTransition.getSaveMillis();
                RuleSet ruleSet2 = new RuleSet(ruleSet);
                while (true) {
                    Transition nextTransition = ruleSet2.nextTransition(millis, saveMillis);
                    if (nextTransition == null || (addTransition(arrayList, nextTransition) && dSTZone != null)) {
                        break;
                    }
                    millis = nextTransition.getMillis();
                    saveMillis = nextTransition.getSaveMillis();
                    DSTZone dSTZone2 = dSTZone;
                    if (dSTZone == null) {
                        dSTZone2 = dSTZone;
                        if (i10 == size - 1) {
                            dSTZone2 = ruleSet2.buildTailZone(str);
                        }
                    }
                    dSTZone = dSTZone2;
                }
                j10 = ruleSet2.getUpperLimit(saveMillis);
            }
        }
        if (arrayList.size() == 0) {
            return dSTZone != null ? dSTZone : buildFixedZone(str, "UTC", 0, 0);
        }
        if (arrayList.size() == 1 && dSTZone == null) {
            Transition transition = arrayList.get(0);
            return buildFixedZone(str, transition.getNameKey(), transition.getWallOffset(), transition.getStandardOffset());
        }
        PrecalculatedZone create = PrecalculatedZone.create(str, z10, arrayList, dSTZone);
        DateTimeZone dateTimeZone = create;
        if (create.isCachable()) {
            dateTimeZone = CachedDateTimeZone.forZone(create);
        }
        return dateTimeZone;
    }

    public void writeTo(String str, DataOutput dataOutput) {
        DateTimeZone dateTimeZone = toDateTimeZone(str, false);
        if (dateTimeZone instanceof FixedDateTimeZone) {
            dataOutput.writeByte(70);
            dataOutput.writeUTF(dateTimeZone.getNameKey(0L));
            writeMillis(dataOutput, dateTimeZone.getOffset(0L));
            writeMillis(dataOutput, dateTimeZone.getStandardOffset(0L));
            return;
        }
        if (dateTimeZone instanceof CachedDateTimeZone) {
            dataOutput.writeByte(67);
            dateTimeZone = ((CachedDateTimeZone) dateTimeZone).getUncachedZone();
        } else {
            dataOutput.writeByte(80);
        }
        ((PrecalculatedZone) dateTimeZone).writeTo(dataOutput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeTo(String str, OutputStream outputStream) {
        if (outputStream instanceof DataOutput) {
            writeTo(str, (DataOutput) outputStream);
        } else {
            writeTo(str, (DataOutput) new DataOutputStream(outputStream));
        }
    }
}
