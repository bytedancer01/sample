package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/StringTransform.class */
class StringTransform implements Transform<String> {
    @Override // org.simpleframework.xml.transform.Transform
    public String read(String str) {
        return str;
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(String str) {
        return str;
    }
}
