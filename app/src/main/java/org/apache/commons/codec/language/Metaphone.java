package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/Metaphone.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/Metaphone.class */
public class Metaphone implements StringEncoder {
    private static final String FRONTV = "EIY";
    private static final String VARSON = "CSPTG";
    private static final String VOWELS = "AEIOU";
    private int maxCodeLen = 4;

    private boolean isLastChar(int i10, int i11) {
        boolean z10 = true;
        if (i11 + 1 != i10) {
            z10 = false;
        }
        return z10;
    }

    private boolean isNextChar(StringBuilder sb2, int i10, char c10) {
        boolean z10 = false;
        if (i10 >= 0) {
            z10 = false;
            if (i10 < sb2.length() - 1) {
                z10 = false;
                if (sb2.charAt(i10 + 1) == c10) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private boolean isPreviousChar(StringBuilder sb2, int i10, char c10) {
        boolean z10 = false;
        if (i10 > 0) {
            z10 = false;
            if (i10 < sb2.length()) {
                z10 = false;
                if (sb2.charAt(i10 - 1) == c10) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    private boolean isVowel(StringBuilder sb2, int i10) {
        return VOWELS.indexOf(sb2.charAt(i10)) >= 0;
    }

    private boolean regionMatch(StringBuilder sb2, int i10, String str) {
        return (i10 < 0 || (str.length() + i10) - 1 >= sb2.length()) ? false : sb2.substring(i10, str.length() + i10).equals(str);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return metaphone((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return metaphone(str);
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isMetaphoneEqual(String str, String str2) {
        return metaphone(str).equals(metaphone(str2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0407, code lost:
    
        if (isNextChar(r0, r9, 'H') != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0428, code lost:
    
        if (isVowel(r0, 2) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x044d, code lost:
    
        if (r9 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00b7, code lost:
    
        if (r0[1] == 'N') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x00c3, code lost:
    
        if (r0[1] == 'E') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b4, code lost:
    
        if (isVowel(r0, r9 + 1) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0229, code lost:
    
        if (regionMatch(r0, r9, "SIA") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0250, code lost:
    
        if (isNextChar(r0, r9, 'H') != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0265, code lost:
    
        if (isPreviousChar(r0, r9, 'C') == false) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String metaphone(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.Metaphone.metaphone(java.lang.String):java.lang.String");
    }

    public void setMaxCodeLen(int i10) {
        this.maxCodeLen = i10;
    }
}
