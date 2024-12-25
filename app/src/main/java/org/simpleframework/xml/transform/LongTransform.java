package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/LongTransform.class */
class LongTransform implements Transform<Long> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Long read(String str) {
        return Long.valueOf(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Long l10) {
        return l10.toString();
    }
}
