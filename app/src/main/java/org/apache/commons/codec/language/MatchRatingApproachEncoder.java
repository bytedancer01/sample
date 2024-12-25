package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/MatchRatingApproachEncoder.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/MatchRatingApproachEncoder.class */
public class MatchRatingApproachEncoder implements StringEncoder {
    private static final String[] DOUBLE_CONSONANT = {"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};
    private static final int EIGHT = 8;
    private static final int ELEVEN = 11;
    private static final String EMPTY = "";
    private static final int FIVE = 5;
    private static final int FOUR = 4;
    private static final int ONE = 1;
    private static final String PLAIN_ASCII = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final int SEVEN = 7;
    private static final int SIX = 6;
    private static final String SPACE = " ";
    private static final int THREE = 3;
    private static final int TWELVE = 12;
    private static final int TWO = 2;
    private static final String UNICODE = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű";

    public String cleanName(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        for (int i10 = 0; i10 < 5; i10++) {
            upperCase = upperCase.replaceAll(new String[]{"\\-", "[&]", "\\'", "\\.", "[\\,]"}[i10], "");
        }
        return removeAccents(upperCase).replaceAll("\\s+", "");
    }

    @Override // org.apache.commons.codec.Encoder
    public final Object encode(Object obj) {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final String encode(String str) {
        return (str == null || "".equalsIgnoreCase(str) || SPACE.equalsIgnoreCase(str) || str.length() == 1) ? "" : getFirst3Last3(removeDoubleConsonants(removeVowels(cleanName(str))));
    }

    public String getFirst3Last3(String str) {
        int length = str.length();
        String str2 = str;
        if (length > 6) {
            str2 = str.substring(0, 3) + str.substring(length - 3, length);
        }
        return str2;
    }

    public int getMinRating(int i10) {
        return i10 <= 4 ? 5 : (i10 < 5 || i10 > 7) ? (i10 < 8 || i10 > 11) ? i10 == 12 ? 2 : 1 : 3 : 4;
    }

    public boolean isEncodeEquals(String str, String str2) {
        boolean z10 = false;
        if (str != null) {
            z10 = false;
            if (!"".equalsIgnoreCase(str)) {
                if (SPACE.equalsIgnoreCase(str)) {
                    z10 = false;
                } else {
                    z10 = false;
                    if (str2 != null) {
                        z10 = false;
                        if (!"".equalsIgnoreCase(str2)) {
                            if (SPACE.equalsIgnoreCase(str2)) {
                                z10 = false;
                            } else {
                                z10 = false;
                                if (str.length() != 1) {
                                    if (str2.length() == 1) {
                                        z10 = false;
                                    } else {
                                        if (str.equalsIgnoreCase(str2)) {
                                            return true;
                                        }
                                        String cleanName = cleanName(str);
                                        String cleanName2 = cleanName(str2);
                                        String removeVowels = removeVowels(cleanName);
                                        String removeVowels2 = removeVowels(cleanName2);
                                        String removeDoubleConsonants = removeDoubleConsonants(removeVowels);
                                        String removeDoubleConsonants2 = removeDoubleConsonants(removeVowels2);
                                        String first3Last3 = getFirst3Last3(removeDoubleConsonants);
                                        String first3Last32 = getFirst3Last3(removeDoubleConsonants2);
                                        if (Math.abs(first3Last3.length() - first3Last32.length()) >= 3) {
                                            return false;
                                        }
                                        z10 = false;
                                        if (leftToRightThenRightToLeftProcessing(first3Last3, first3Last32) >= getMinRating(Math.abs(first3Last3.length() + first3Last32.length()))) {
                                            z10 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z10;
    }

    public boolean isVowel(String str) {
        return str.equalsIgnoreCase("E") || str.equalsIgnoreCase("A") || str.equalsIgnoreCase("O") || str.equalsIgnoreCase("I") || str.equalsIgnoreCase("U");
    }

    public int leftToRightThenRightToLeftProcessing(String str, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length = str.length();
        int length2 = str2.length() - 1;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= charArray.length || i11 > length2) {
                break;
            }
            int i12 = i11 + 1;
            String substring = str.substring(i11, i12);
            int i13 = (length - 1) - i11;
            String substring2 = str.substring(i13, i13 + 1);
            String substring3 = str2.substring(i11, i12);
            int i14 = length2 - i11;
            String substring4 = str2.substring(i14, i14 + 1);
            if (substring.equals(substring3)) {
                charArray[i11] = ' ';
                charArray2[i11] = ' ';
            }
            if (substring2.equals(substring4)) {
                charArray[i13] = ' ';
                charArray2[i14] = ' ';
            }
            i10 = i12;
        }
        String replaceAll = new String(charArray).replaceAll("\\s+", "");
        String replaceAll2 = new String(charArray2).replaceAll("\\s+", "");
        return Math.abs(6 - (replaceAll.length() > replaceAll2.length() ? replaceAll.length() : replaceAll2.length()));
    }

    public String removeAccents(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            int indexOf = UNICODE.indexOf(charAt);
            if (indexOf > -1) {
                charAt = PLAIN_ASCII.charAt(indexOf);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public String removeDoubleConsonants(String str) {
        String upperCase = str.toUpperCase();
        String[] strArr = DOUBLE_CONSONANT;
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            String str3 = upperCase;
            if (upperCase.contains(str2)) {
                str3 = upperCase.replace(str2, str2.substring(0, 1));
            }
            i10++;
            upperCase = str3;
        }
        return upperCase;
    }

    public String removeVowels(String str) {
        String substring = str.substring(0, 1);
        String replaceAll = str.replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "").replaceAll("U", "").replaceAll("\\s{2,}\\b", SPACE);
        String str2 = replaceAll;
        if (isVowel(substring)) {
            str2 = substring + replaceAll;
        }
        return str2;
    }
}
