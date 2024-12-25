package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Extractor.class */
interface Extractor<T extends Annotation> {
    T[] getAnnotations();

    Label getLabel(T t10);

    Class getType(T t10);
}
