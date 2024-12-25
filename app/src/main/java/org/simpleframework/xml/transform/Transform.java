package org.simpleframework.xml.transform;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/transform/Transform.class */
public interface Transform<T> {
    T read(String str);

    String write(T t10);
}
