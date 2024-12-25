package org.apache.commons.codec.language;

import java.util.regex.Pattern;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/Nysiis.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/Nysiis.class */
public class Nysiis implements StringEncoder {
    private static final char SPACE = ' ';
    private static final int TRUE_LENGTH = 6;
    private final boolean strict;
    private static final char[] CHARS_A = {'A'};
    private static final char[] CHARS_AF = {'A', 'F'};
    private static final char[] CHARS_C = {'C'};
    private static final char[] CHARS_FF = {'F', 'F'};
    private static final char[] CHARS_G = {'G'};
    private static final char[] CHARS_N = {'N'};
    private static final char[] CHARS_NN = {'N', 'N'};
    private static final char[] CHARS_S = {'S'};
    private static final char[] CHARS_SSS = {'S', 'S', 'S'};
    private static final Pattern PAT_MAC = Pattern.compile("^MAC");
    private static final Pattern PAT_KN = Pattern.compile("^KN");
    private static final Pattern PAT_K = Pattern.compile("^K");
    private static final Pattern PAT_PH_PF = Pattern.compile("^(PH|PF)");
    private static final Pattern PAT_SCH = Pattern.compile("^SCH");
    private static final Pattern PAT_EE_IE = Pattern.compile("(EE|IE)$");
    private static final Pattern PAT_DT_ETC = Pattern.compile("(DT|RT|RD|NT|ND)$");

    public Nysiis() {
        this(true);
    }

    public Nysiis(boolean z10) {
        this.strict = z10;
    }

    private static boolean isVowel(char c10) {
        return c10 == 'A' || c10 == 'E' || c10 == 'I' || c10 == 'O' || c10 == 'U';
    }

    private static char[] transcodeRemaining(char c10, char c11, char c12, char c13) {
        return (c11 == 'E' && c12 == 'V') ? CHARS_AF : isVowel(c11) ? CHARS_A : c11 == 'Q' ? CHARS_G : c11 == 'Z' ? CHARS_S : c11 == 'M' ? CHARS_N : c11 == 'K' ? c12 == 'N' ? CHARS_NN : CHARS_C : (c11 == 'S' && c12 == 'C' && c13 == 'H') ? CHARS_SSS : (c11 == 'P' && c12 == 'H') ? CHARS_FF : (c11 != 'H' || (isVowel(c10) && isVowel(c12))) ? (c11 == 'W' && isVowel(c10)) ? new char[]{c10} : new char[]{c11} : new char[]{c10};
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return nysiis((String) obj);
        }
        throw new EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return nysiis(str);
    }

    public boolean isStrict() {
        return this.strict;
    }

    public String nysiis(String str) {
        if (str == null) {
            return null;
        }
        String clean = SoundexUtils.clean(str);
        if (clean.length() == 0) {
            return clean;
        }
        String replaceFirst = PAT_DT_ETC.matcher(PAT_EE_IE.matcher(PAT_SCH.matcher(PAT_PH_PF.matcher(PAT_K.matcher(PAT_KN.matcher(PAT_MAC.matcher(clean).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst("C")).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        StringBuilder sb2 = new StringBuilder(replaceFirst.length());
        sb2.append(replaceFirst.charAt(0));
        char[] charArray = replaceFirst.toCharArray();
        int length = charArray.length;
        int i10 = 1;
        while (i10 < length) {
            char c10 = ' ';
            char c11 = i10 < length - 1 ? charArray[i10 + 1] : ' ';
            if (i10 < length - 2) {
                c10 = charArray[i10 + 2];
            }
            int i11 = i10 - 1;
            char[] transcodeRemaining = transcodeRemaining(charArray[i11], charArray[i10], c11, c10);
            System.arraycopy(transcodeRemaining, 0, charArray, i10, transcodeRemaining.length);
            char c12 = charArray[i10];
            if (c12 != charArray[i11]) {
                sb2.append(c12);
            }
            i10++;
        }
        if (sb2.length() > 1) {
            char charAt = sb2.charAt(sb2.length() - 1);
            char c13 = charAt;
            if (charAt == 'S') {
                sb2.deleteCharAt(sb2.length() - 1);
                c13 = sb2.charAt(sb2.length() - 1);
            }
            if (sb2.length() > 2 && sb2.charAt(sb2.length() - 2) == 'A' && c13 == 'Y') {
                sb2.deleteCharAt(sb2.length() - 2);
            }
            if (c13 == 'A') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        String sb3 = sb2.toString();
        String str2 = sb3;
        if (isStrict()) {
            str2 = sb3.substring(0, Math.min(6, sb3.length()));
        }
        return str2;
    }
}
