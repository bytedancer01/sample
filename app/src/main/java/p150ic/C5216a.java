package p150ic;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ic/a.class
 */
/* renamed from: ic.a */
/* loaded from: combined.jar:classes2.jar:ic/a.class */
public final class C5216a {

    /* renamed from: a */
    public static final BigInteger f29897a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    public static final double f29898b = Math.log(10.0d);

    /* renamed from: c */
    public static final double f29899c = Math.log(2.0d);

    /* renamed from: a */
    public static BigInteger m26066a(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }
}
