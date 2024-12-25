package org.simpleframework.xml.transform;

import java.math.BigDecimal;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/BigDecimalTransform.class */
class BigDecimalTransform implements Transform<BigDecimal> {
    @Override // org.simpleframework.xml.transform.Transform
    public BigDecimal read(String str) {
        return new BigDecimal(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(BigDecimal bigDecimal) {
        return bigDecimal.toString();
    }
}
