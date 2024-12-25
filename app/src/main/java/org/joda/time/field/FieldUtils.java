package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: combined.jar:classes3.jar:org/joda/time/field/FieldUtils.class */
public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int getWrappedValue(int i10, int i11, int i12) {
        if (i11 >= i12) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        int i13 = (i12 - i11) + 1;
        int i14 = i10 - i11;
        if (i14 >= 0) {
            return (i14 % i13) + i11;
        }
        int i15 = (-i14) % i13;
        return i15 == 0 ? i11 + 0 : (i13 - i15) + i11;
    }

    public static int getWrappedValue(int i10, int i11, int i12, int i13) {
        return getWrappedValue(i10 + i11, i12, i13);
    }

    public static int safeAdd(int i10, int i11) {
        int i12 = i10 + i11;
        if ((i10 ^ i12) >= 0 || (i10 ^ i11) < 0) {
            return i12;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + i10 + " + " + i11);
    }

    public static long safeAdd(long j10, long j11) {
        long j12 = j10 + j11;
        if ((j10 ^ j12) >= 0 || (j10 ^ j11) < 0) {
            return j12;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j10 + " + " + j11);
    }

    public static long safeDivide(long j10, long j11) {
        if (j10 != Long.MIN_VALUE || j11 != -1) {
            return j10 / j11;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j10 + " / " + j11);
    }

    public static int safeMultiply(int i10, int i11) {
        long j10 = i10 * i11;
        if (j10 >= -2147483648L && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new ArithmeticException("Multiplication overflows an int: " + i10 + " * " + i11);
    }

    public static long safeMultiply(long j10, int i10) {
        if (i10 == -1) {
            if (j10 != Long.MIN_VALUE) {
                return -j10;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
        }
        if (i10 == 0) {
            return 0L;
        }
        if (i10 == 1) {
            return j10;
        }
        long j11 = i10;
        long j12 = j10 * j11;
        if (j12 / j11 == j10) {
            return j12;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + i10);
    }

    public static long safeMultiply(long j10, long j11) {
        if (j11 == 1) {
            return j10;
        }
        if (j10 == 1) {
            return j11;
        }
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        long j12 = j10 * j11;
        if (j12 / j11 == j10 && ((j10 != Long.MIN_VALUE || j11 != -1) && (j11 != Long.MIN_VALUE || j10 != -1))) {
            return j12;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j10 + " * " + j11);
    }

    public static int safeMultiplyToInt(long j10, long j11) {
        return safeToInt(safeMultiply(j10, j11));
    }

    public static int safeNegate(int i10) {
        if (i10 != Integer.MIN_VALUE) {
            return -i10;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    public static long safeSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        if ((j10 ^ j12) >= 0 || (j10 ^ j11) >= 0) {
            return j12;
        }
        throw new ArithmeticException("The calculation caused an overflow: " + j10 + " - " + j11);
    }

    public static int safeToInt(long j10) {
        if (-2147483648L <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new ArithmeticException("Value cannot fit in an int: " + j10);
    }

    public static void verifyValueBounds(String str, int i10, int i11, int i12) {
        if (i10 < i11 || i10 > i12) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i10, int i11, int i12) {
        if (i10 < i11 || i10 > i12) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i10, int i11, int i12) {
        if (i10 < i11 || i10 > i12) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }
}
