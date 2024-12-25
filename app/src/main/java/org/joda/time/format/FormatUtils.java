package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;

/* loaded from: combined.jar:classes3.jar:org/joda/time/format/FormatUtils.class */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(Appendable appendable, int i10, int i11) {
        int i12;
        int i13 = i10;
        if (i10 < 0) {
            appendable.append('-');
            if (i10 == Integer.MIN_VALUE) {
                for (int i14 = i11; i14 > 10; i14--) {
                    appendable.append('0');
                }
                appendable.append("2147483648");
                return;
            }
            i13 = -i10;
        }
        if (i13 < 10) {
            while (true) {
                i12 = i13;
                if (i11 <= 1) {
                    break;
                }
                appendable.append('0');
                i11--;
            }
        } else {
            if (i13 >= 100) {
                int log = i13 < 1000 ? 3 : i13 < 10000 ? 4 : ((int) (Math.log(i13) / LOG_10)) + 1;
                while (i11 > log) {
                    appendable.append('0');
                    i11--;
                }
                appendable.append(Integer.toString(i13));
                return;
            }
            while (i11 > 2) {
                appendable.append('0');
                i11--;
            }
            int i15 = ((i13 + 1) * 13421772) >> 27;
            appendable.append((char) (i15 + 48));
            i12 = (i13 - (i15 << 3)) - (i15 << 1);
        }
        appendable.append((char) (i12 + 48));
    }

    public static void appendPaddedInteger(Appendable appendable, long j10, int i10) {
        int i11 = (int) j10;
        if (i11 == j10) {
            appendPaddedInteger(appendable, i11, i10);
            return;
        }
        if (i10 > 19) {
            long j11 = j10;
            if (j10 < 0) {
                appendable.append('-');
                if (j10 == Long.MIN_VALUE) {
                    for (int i12 = i10; i12 > 19; i12--) {
                        appendable.append('0');
                    }
                    appendable.append("9223372036854775808");
                    return;
                }
                j11 = -j10;
            }
            int log = (int) (Math.log(j11) / LOG_10);
            while (true) {
                j10 = j11;
                if (i10 <= log + 1) {
                    break;
                }
                appendable.append('0');
                i10--;
            }
        }
        appendable.append(Long.toString(j10));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i10, int i11) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i10, i11);
        } catch (IOException e10) {
        }
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j10, int i10) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j10, i10);
        } catch (IOException e10) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i10) {
        int i11 = i10;
        if (i10 < 0) {
            appendable.append('-');
            if (i10 == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i11 = -i10;
        }
        if (i11 >= 10) {
            if (i11 >= 100) {
                appendable.append(Integer.toString(i11));
                return;
            } else {
                int i12 = ((i11 + 1) * 13421772) >> 27;
                appendable.append((char) (i12 + 48));
                i11 = (i11 - (i12 << 3)) - (i12 << 1);
            }
        }
        appendable.append((char) (i11 + 48));
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            appendUnpaddedInteger(appendable, i10);
        } else {
            appendable.append(Long.toString(j10));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i10) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i10);
        } catch (IOException e10) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j10) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j10);
        } catch (IOException e10) {
        }
    }

    public static int calculateDigitCount(long j10) {
        int i10 = 1;
        if (j10 < 0) {
            if (j10 != Long.MIN_VALUE) {
                return calculateDigitCount(-j10) + 1;
            }
            return 20;
        }
        if (j10 >= 10) {
            i10 = j10 < 100 ? 2 : j10 < 1000 ? 3 : j10 < 10000 ? 4 : 1 + ((int) (Math.log(j10) / LOG_10));
        }
        return i10;
    }

    public static String createErrorMessage(String str, int i10) {
        StringBuilder sb2;
        int i11 = i10 + 32;
        String concat = str.length() <= i11 + 3 ? str : str.substring(0, i11).concat("...");
        if (i10 <= 0) {
            sb2 = new StringBuilder();
            sb2.append("Invalid format: \"");
            sb2.append(concat);
        } else {
            if (i10 >= str.length()) {
                sb2 = new StringBuilder();
                sb2.append("Invalid format: \"");
                sb2.append(concat);
                sb2.append("\" is too short");
                return sb2.toString();
            }
            sb2 = new StringBuilder();
            sb2.append("Invalid format: \"");
            sb2.append(concat);
            sb2.append("\" is malformed at \"");
            sb2.append(concat.substring(i10));
        }
        sb2.append('\"');
        return sb2.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i10) {
        int charAt = charSequence.charAt(i10) - '0';
        return (((charAt << 3) + (charAt << 1)) + charSequence.charAt(i10 + 1)) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i10, int i11) {
        int i12;
        int i13 = i10;
        if (i10 < 0) {
            writer.write(45);
            if (i10 == Integer.MIN_VALUE) {
                for (int i14 = i11; i14 > 10; i14--) {
                    writer.write(48);
                }
                writer.write("2147483648");
                return;
            }
            i13 = -i10;
        }
        if (i13 < 10) {
            while (true) {
                i12 = i13;
                if (i11 <= 1) {
                    break;
                }
                writer.write(48);
                i11--;
            }
        } else {
            if (i13 >= 100) {
                int log = i13 < 1000 ? 3 : i13 < 10000 ? 4 : ((int) (Math.log(i13) / LOG_10)) + 1;
                while (i11 > log) {
                    writer.write(48);
                    i11--;
                }
                writer.write(Integer.toString(i13));
                return;
            }
            while (i11 > 2) {
                writer.write(48);
                i11--;
            }
            int i15 = ((i13 + 1) * 13421772) >> 27;
            writer.write(i15 + 48);
            i12 = (i13 - (i15 << 3)) - (i15 << 1);
        }
        writer.write(i12 + 48);
    }

    public static void writePaddedInteger(Writer writer, long j10, int i10) {
        int i11 = (int) j10;
        if (i11 == j10) {
            writePaddedInteger(writer, i11, i10);
            return;
        }
        if (i10 > 19) {
            long j11 = j10;
            if (j10 < 0) {
                writer.write(45);
                if (j10 == Long.MIN_VALUE) {
                    for (int i12 = i10; i12 > 19; i12--) {
                        writer.write(48);
                    }
                    writer.write("9223372036854775808");
                    return;
                }
                j11 = -j10;
            }
            int log = (int) (Math.log(j11) / LOG_10);
            while (true) {
                j10 = j11;
                if (i10 <= log + 1) {
                    break;
                }
                writer.write(48);
                i10--;
            }
        }
        writer.write(Long.toString(j10));
    }

    public static void writeUnpaddedInteger(Writer writer, int i10) {
        int i11 = i10;
        if (i10 < 0) {
            writer.write(45);
            if (i10 == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i11 = -i10;
        }
        if (i11 >= 10) {
            if (i11 >= 100) {
                writer.write(Integer.toString(i11));
                return;
            } else {
                int i12 = ((i11 + 1) * 13421772) >> 27;
                writer.write(i12 + 48);
                i11 = (i11 - (i12 << 3)) - (i12 << 1);
            }
        }
        writer.write(i11 + 48);
    }

    public static void writeUnpaddedInteger(Writer writer, long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            writeUnpaddedInteger(writer, i10);
        } else {
            writer.write(Long.toString(j10));
        }
    }
}
