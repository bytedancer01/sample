package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/RefinedSoundex.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/RefinedSoundex.class */
public class RefinedSoundex implements StringEncoder {
    private final char[] soundexMapping;
    public static final String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";
    private static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();

    public RefinedSoundex() {
        this.soundexMapping = US_ENGLISH_MAPPING;
    }

    public RefinedSoundex(String str) {
        this.soundexMapping = str.toCharArray();
    }

    public RefinedSoundex(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        this.soundexMapping = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public int difference(String str, String str2) {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public char getMappingCode(char c10) {
        if (Character.isLetter(c10)) {
            return this.soundexMapping[Character.toUpperCase(c10) - 'A'];
        }
        return (char) 0;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String clean = SoundexUtils.clean(str);
        if (clean.length() == 0) {
            return clean;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(clean.charAt(0));
        char c10 = '*';
        for (int i10 = 0; i10 < clean.length(); i10++) {
            char mappingCode = getMappingCode(clean.charAt(i10));
            if (mappingCode != c10) {
                if (mappingCode != 0) {
                    sb2.append(mappingCode);
                }
                c10 = mappingCode;
            }
        }
        return sb2.toString();
    }
}
