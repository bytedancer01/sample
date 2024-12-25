package org.simpleframework.xml.transform;

import java.lang.reflect.Array;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/ArrayTransform.class */
class ArrayTransform implements Transform {
    private final Transform delegate;
    private final Class entry;
    private final StringArrayTransform split = new StringArrayTransform();

    public ArrayTransform(Transform transform, Class cls) {
        this.delegate = transform;
        this.entry = cls;
    }

    private Object read(String[] strArr, int i10) {
        Object newInstance = Array.newInstance((Class<?>) this.entry, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object read = this.delegate.read(strArr[i11]);
            if (read != null) {
                Array.set(newInstance, i11, read);
            }
        }
        return newInstance;
    }

    private String write(Object obj, int i10) {
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj2 = Array.get(obj, i11);
            if (obj2 != null) {
                strArr[i11] = this.delegate.write(obj2);
            }
        }
        return this.split.write(strArr);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public Object read(String str) {
        String[] read = this.split.read(str);
        return read(read, read.length);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Object obj) {
        return write(obj, Array.getLength(obj));
    }
}
