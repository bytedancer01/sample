package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/ArrayMatcher.class */
class ArrayMatcher implements Matcher {
    private final Matcher primary;

    public ArrayMatcher(Matcher matcher) {
        this.primary = matcher;
    }

    private Transform matchArray(Class cls) {
        Transform match = this.primary.match(cls);
        if (match == null) {
            return null;
        }
        return new ArrayTransform(match, cls);
    }

    @Override // org.simpleframework.xml.transform.Matcher
    public Transform match(Class cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != Character.TYPE && componentType != Character.class) {
            return componentType == String.class ? new StringArrayTransform() : matchArray(componentType);
        }
        return new CharacterArrayTransform(componentType);
    }
}
