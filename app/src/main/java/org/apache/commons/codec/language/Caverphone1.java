package org.apache.commons.codec.language;

import com.journeyapps.barcodescanner.C2582b;
import java.util.Locale;
import p354ue.AbstractC9172q;
import p354ue.C9163h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:org/apache/commons/codec/language/Caverphone1.class
 */
/* loaded from: combined.jar:classes2.jar:org/apache/commons/codec/language/Caverphone1.class */
public class Caverphone1 extends AbstractCaverphone {
    private static final String SIX_1 = "111111";

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null || str.length() == 0) {
            return SIX_1;
        }
        return (str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replaceAll("cq", "2q").replaceAll("ci", "si").replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll("c", "k").replaceAll(AbstractC9172q.f41940a, "k").replaceAll("x", "k").replaceAll("v", "f").replaceAll("dg", "2g").replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll("d", "t").replaceAll("ph", "fh").replaceAll(C2582b.f15902o, "p").replaceAll("sh", "s2").replaceAll("z", "s").replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", "3").replaceAll("3gh3", "3kh3").replaceAll("gh", "22").replaceAll("g", "k").replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wy", "Wy").replaceAll("wh3", "Wh3").replaceAll("why", "Why").replaceAll("w", "2").replaceAll("^h", "A").replaceAll(C9163h.f41901n, "2").replaceAll("r3", "R3").replaceAll("ry", "Ry").replaceAll("r", "2").replaceAll("l3", "L3").replaceAll("ly", "Ly").replaceAll("l", "2").replaceAll("j", "y").replaceAll("y3", "Y3").replaceAll("y", "2").replaceAll("2", "").replaceAll("3", "") + SIX_1).substring(0, 6);
    }
}