package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/DoubleTransform.class */
class DoubleTransform implements Transform<Double> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Double read(String str) {
        return Double.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Double d10) {
        return d10.toString();
    }
}
