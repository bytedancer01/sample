package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.stream.Format;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ExtractorFactory.class */
class ExtractorFactory {
    private final Contact contact;
    private final Format format;
    private final Annotation label;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ExtractorFactory$ElementExtractor.class */
    public static class ElementExtractor implements Extractor<Element> {
        private final Contact contact;
        private final Format format;
        private final ElementUnion union;

        public ElementExtractor(Contact contact, ElementUnion elementUnion, Format format) {
            this.contact = contact;
            this.format = format;
            this.union = elementUnion;
        }

        @Override // org.simpleframework.xml.core.Extractor
        public Element[] getAnnotations() {
            return this.union.value();
        }

        @Override // org.simpleframework.xml.core.Extractor
        public Label getLabel(Element element) {
            return new ElementLabel(this.contact, element, this.format);
        }

        @Override // org.simpleframework.xml.core.Extractor
        public Class getType(Element element) {
            Class type = element.type();
            Class cls = type;
            if (type == Void.TYPE) {
                cls = this.contact.getType();
            }
            return cls;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ExtractorFactory$ElementListExtractor.class */
    public static class ElementListExtractor implements Extractor<ElementList> {
        private final Contact contact;
        private final Format format;
        private final ElementListUnion union;

        public ElementListExtractor(Contact contact, ElementListUnion elementListUnion, Format format) {
            this.contact = contact;
            this.format = format;
            this.union = elementListUnion;
        }

        @Override // org.simpleframework.xml.core.Extractor
        public ElementList[] getAnnotations() {
            return this.union.value();
        }

        @Override // org.simpleframework.xml.core.Extractor
        public Label getLabel(ElementList elementList) {
            return new ElementListLabel(this.contact, elementList, this.format);
        }

        @Override // org.simpleframework.xml.core.Extractor
        public Class getType(ElementList elementList) {
            return elementList.type();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ExtractorFactory$ElementMapExtractor.class */
    public static class ElementMapExtractor implements Extractor<ElementMap> {
        private final Contact contact;
        private final Format format;
        private final ElementMapUnion union;

        public ElementMapExtractor(Contact contact, ElementMapUnion elementMapUnion, Format format) {
            this.contact = contact;
            this.format = format;
            this.union = elementMapUnion;
        }

        @Override // org.simpleframework.xml.core.Extractor
        public ElementMap[] getAnnotations() {
            return this.union.value();
        }

        @Override // org.simpleframework.xml.core.Extractor
        public Label getLabel(ElementMap elementMap) {
            return new ElementMapLabel(this.contact, elementMap, this.format);
        }

        @Override // org.simpleframework.xml.core.Extractor
        public Class getType(ElementMap elementMap) {
            return elementMap.valueType();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ExtractorFactory$ExtractorBuilder.class */
    public static class ExtractorBuilder {
        private final Class label;
        private final Class type;

        public ExtractorBuilder(Class cls, Class cls2) {
            this.label = cls;
            this.type = cls2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Constructor getConstructor() {
            return this.type.getConstructor(Contact.class, this.label, Format.class);
        }
    }

    public ExtractorFactory(Contact contact, Annotation annotation, Format format) {
        this.contact = contact;
        this.format = format;
        this.label = annotation;
    }

    private ExtractorBuilder getBuilder(Annotation annotation) {
        if (annotation instanceof ElementUnion) {
            return new ExtractorBuilder(ElementUnion.class, ElementExtractor.class);
        }
        if (annotation instanceof ElementListUnion) {
            return new ExtractorBuilder(ElementListUnion.class, ElementListExtractor.class);
        }
        if (annotation instanceof ElementMapUnion) {
            return new ExtractorBuilder(ElementMapUnion.class, ElementMapExtractor.class);
        }
        throw new PersistenceException("Annotation %s is not a union", annotation);
    }

    private Object getInstance(Annotation annotation) {
        Constructor constructor = getBuilder(annotation).getConstructor();
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        return constructor.newInstance(this.contact, annotation, this.format);
    }

    public Extractor getInstance() {
        return (Extractor) getInstance(this.label);
    }
}
