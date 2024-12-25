package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.stream.Format;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ParameterFactory.class */
class ParameterFactory {
    private final Format format;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ParameterFactory$ParameterBuilder.class */
    public static class ParameterBuilder {
        private final Class entry;
        private final Class label;
        private final Class type;

        public ParameterBuilder(Class cls, Class cls2) {
            this(cls, cls2, null);
        }

        public ParameterBuilder(Class cls, Class cls2, Class cls3) {
            this.label = cls2;
            this.entry = cls3;
            this.type = cls;
        }

        private Constructor getConstructor(Class... clsArr) {
            return this.type.getConstructor(clsArr);
        }

        public Constructor getConstructor() {
            Class cls = this.entry;
            return cls != null ? getConstructor(this.label, cls) : getConstructor(this.label);
        }

        public Constructor getConstructor(Class cls) {
            return getConstructor(Constructor.class, cls, Format.class, Integer.TYPE);
        }

        public Constructor getConstructor(Class cls, Class cls2) {
            return getConstructor(Constructor.class, cls, cls2, Format.class, Integer.TYPE);
        }
    }

    public ParameterFactory(Support support) {
        this.format = support.getFormat();
    }

    private ParameterBuilder getBuilder(Annotation annotation) {
        if (annotation instanceof Element) {
            return new ParameterBuilder(ElementParameter.class, Element.class);
        }
        if (annotation instanceof ElementList) {
            return new ParameterBuilder(ElementListParameter.class, ElementList.class);
        }
        if (annotation instanceof ElementArray) {
            return new ParameterBuilder(ElementArrayParameter.class, ElementArray.class);
        }
        if (annotation instanceof ElementMapUnion) {
            return new ParameterBuilder(ElementMapUnionParameter.class, ElementMapUnion.class, ElementMap.class);
        }
        if (annotation instanceof ElementListUnion) {
            return new ParameterBuilder(ElementListUnionParameter.class, ElementListUnion.class, ElementList.class);
        }
        if (annotation instanceof ElementUnion) {
            return new ParameterBuilder(ElementUnionParameter.class, ElementUnion.class, Element.class);
        }
        if (annotation instanceof ElementMap) {
            return new ParameterBuilder(ElementMapParameter.class, ElementMap.class);
        }
        if (annotation instanceof Attribute) {
            return new ParameterBuilder(AttributeParameter.class, Attribute.class);
        }
        if (annotation instanceof Text) {
            return new ParameterBuilder(TextParameter.class, Text.class);
        }
        throw new PersistenceException("Annotation %s not supported", annotation);
    }

    private Constructor getConstructor(Annotation annotation) {
        Constructor constructor = getBuilder(annotation).getConstructor();
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor;
    }

    public Parameter getInstance(Constructor constructor, Annotation annotation, int i10) {
        return getInstance(constructor, annotation, null, i10);
    }

    public Parameter getInstance(Constructor constructor, Annotation annotation, Annotation annotation2, int i10) {
        Constructor constructor2 = getConstructor(annotation);
        return (Parameter) (annotation2 != null ? constructor2.newInstance(constructor, annotation, annotation2, this.format, Integer.valueOf(i10)) : constructor2.newInstance(constructor, annotation, this.format, Integer.valueOf(i10)));
    }
}
