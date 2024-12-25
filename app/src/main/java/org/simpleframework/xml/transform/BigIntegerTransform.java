package org.simpleframework.xml.transform;

import java.math.BigInteger;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/BigIntegerTransform.class */
class BigIntegerTransform implements Transform<BigInteger> {
    @Override // org.simpleframework.xml.transform.Transform
    public BigInteger read(String str) {
        return new BigInteger(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(BigInteger bigInteger) {
        return bigInteger.toString();
    }
}
