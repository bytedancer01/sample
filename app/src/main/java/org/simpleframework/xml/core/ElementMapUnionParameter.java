package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.stream.Format;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ElementMapUnionParameter.class */
class ElementMapUnionParameter extends TemplateParameter {
    private final Contact contact;
    private final Expression expression;
    private final int index;
    private final Object key;
    private final Label label;
    private final String name;
    private final String path;
    private final Class type;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ElementMapUnionParameter$Contact.class */
    public static class Contact extends ParameterContact<ElementMap> {
        public Contact(ElementMap elementMap, Constructor constructor, int i10) {
            super(elementMap, constructor, i10);
        }

        @Override // org.simpleframework.xml.core.ParameterContact, org.simpleframework.xml.core.Contact
        public String getName() {
            return ((ElementMap) this.label).name();
        }
    }

    public ElementMapUnionParameter(Constructor constructor, ElementMapUnion elementMapUnion, ElementMap elementMap, Format format, int i10) {
        Contact contact = new Contact(elementMap, constructor, i10);
        this.contact = contact;
        ElementMapUnionLabel elementMapUnionLabel = new ElementMapUnionLabel(contact, elementMapUnion, elementMap, format);
        this.label = elementMapUnionLabel;
        this.expression = elementMapUnionLabel.getExpression();
        this.path = elementMapUnionLabel.getPath();
        this.type = elementMapUnionLabel.getType();
        this.name = elementMapUnionLabel.getName();
        this.key = elementMapUnionLabel.getKey();
        this.index = i10;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public Annotation getAnnotation() {
        return this.contact.getAnnotation();
    }

    @Override // org.simpleframework.xml.core.Parameter
    public Expression getExpression() {
        return this.expression;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public int getIndex() {
        return this.index;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public Object getKey() {
        return this.key;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public String getName() {
        return this.name;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public String getPath() {
        return this.path;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public Class getType() {
        return this.type;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isPrimitive() {
        return this.type.isPrimitive();
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isRequired() {
        return this.label.isRequired();
    }

    @Override // org.simpleframework.xml.core.Parameter
    public String toString() {
        return this.contact.toString();
    }
}
