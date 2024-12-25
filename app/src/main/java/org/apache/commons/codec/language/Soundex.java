package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/Soundex.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/Soundex.class */
public class Soundex implements StringEncoder {

    @Deprecated
    private int maxLength;
    private final char[] soundexMapping;
    public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
    private static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final Soundex US_ENGLISH = new Soundex();

    public Soundex() {
        this.maxLength = 4;
        this.soundexMapping = US_ENGLISH_MAPPING;
    }

    public Soundex(String str) {
        this.maxLength = 4;
        this.soundexMapping = str.toCharArray();
    }

    public Soundex(char[] cArr) {
        this.maxLength = 4;
        char[] cArr2 = new char[cArr.length];
        this.soundexMapping = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    private char getMappingCode(String str, int i10) {
        char charAt;
        char map = map(str.charAt(i10));
        if (i10 > 1 && map != '0' && ('H' == (charAt = str.charAt(i10 - 1)) || 'W' == charAt)) {
            char charAt2 = str.charAt(i10 - 2);
            if (map(charAt2) == map || 'H' == charAt2 || 'W' == charAt2) {
                return (char) 0;
            }
        }
        return map;
    }

    private char[] getSoundexMapping() {
        return this.soundexMapping;
    }

    private char map(char c10) {
        int i10 = c10 - 'A';
        if (i10 >= 0 && i10 < getSoundexMapping().length) {
            return getSoundexMapping()[i10];
        }
        throw new IllegalArgumentException("The character is not mapped: " + c10);
    }

    public int difference(String str, String str2) {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    @Deprecated
    public int getMaxLength() {
        return this.maxLength;
    }

    @Deprecated
    public void setMaxLength(int i10) {
        this.maxLength = i10;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String clean = SoundexUtils.clean(str);
        if (clean.length() == 0) {
            return clean;
        }
        char[] cArr = {'0', '0', '0', '0'};
        cArr[0] = clean.charAt(0);
        char mappingCode = getMappingCode(clean, 0);
        int i10 = 1;
        int i11 = 1;
        while (true) {
            int i12 = i11;
            if (i10 >= clean.length() || i12 >= 4) {
                break;
            }
            char mappingCode2 = getMappingCode(clean, i10);
            char c10 = mappingCode;
            int i13 = i12;
            if (mappingCode2 != 0) {
                i13 = i12;
                if (mappingCode2 != '0') {
                    i13 = i12;
                    if (mappingCode2 != mappingCode) {
                        cArr[i12] = mappingCode2;
                        i13 = i12 + 1;
                    }
                }
                c10 = mappingCode2;
            }
            i10++;
            mappingCode = c10;
            i11 = i13;
        }
        return new String(cArr);
    }
}
