package org.apache.commons.codec.digest;

import java.util.Random;
import org.jsoup.parser.CharacterReader;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/digest/B64.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/digest/B64.class */
class B64 {
    public static final String B64T = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static void b64from24bit(byte b10, byte b11, byte b12, int i10, StringBuilder sb2) {
        int i11 = ((b10 << 16) & 16777215) | ((b11 << 8) & CharacterReader.EOF) | (b12 & 255);
        while (i10 > 0) {
            sb2.append(B64T.charAt(i11 & 63));
            i11 >>= 6;
            i10--;
        }
    }

    public static String getRandomSalt(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 <= i10; i11++) {
            sb2.append(B64T.charAt(new Random().nextInt(64)));
        }
        return sb2.toString();
    }
}
