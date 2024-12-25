package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/PrimitiveMatcher.class */
class PrimitiveMatcher implements Matcher {
    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) {
        if (cls == Integer.TYPE) {
            return new IntegerTransform();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanTransform();
        }
        if (cls == Long.TYPE) {
            return new LongTransform();
        }
        if (cls == Double.TYPE) {
            return new DoubleTransform();
        }
        if (cls == Float.TYPE) {
            return new FloatTransform();
        }
        if (cls == Short.TYPE) {
            return new ShortTransform();
        }
        if (cls == Byte.TYPE) {
            return new ByteTransform();
        }
        if (cls == Character.TYPE) {
            return new CharacterTransform();
        }
        return null;
    }
}
