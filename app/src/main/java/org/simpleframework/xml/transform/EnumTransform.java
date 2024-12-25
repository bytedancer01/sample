package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/EnumTransform.class */
class EnumTransform implements Transform<Enum> {
    private final Class type;

    public EnumTransform(Class cls) {
        this.type = cls;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public Enum read(String str) {
        return Enum.valueOf(this.type, str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Enum r32) {
        return r32.name();
    }
}
