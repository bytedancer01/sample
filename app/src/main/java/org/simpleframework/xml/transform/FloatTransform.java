package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/FloatTransform.class */
class FloatTransform implements Transform<Float> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Float read(String str) {
        return Float.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Float f10) {
        return f10.toString();
    }
}
