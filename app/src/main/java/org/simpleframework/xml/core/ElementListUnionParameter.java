package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.stream.Format;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ElementListUnionParameter.class */
class ElementListUnionParameter extends TemplateParameter {
    private final Contact contact;
    private final Expression expression;
    private final int index;
    private final Object key;
    private final Label label;
    private final String name;
    private final String path;
    private final Class type;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/ElementListUnionParameter$Contact.class */
    public static class Contact extends ParameterContact<ElementList> {
        public Contact(ElementList elementList, Constructor constructor, int i10) {
            super(elementList, constructor, i10);
        }

        @Override // org.simpleframework.xml.core.ParameterContact, org.simpleframework.xml.core.Contact
        public String getName() {
            return ((ElementList) this.label).name();
        }
    }

    public ElementListUnionParameter(Constructor constructor, ElementListUnion elementListUnion, ElementList elementList, Format format, int i10) {
        Contact contact = new Contact(elementList, constructor, i10);
        this.contact = contact;
        ElementListUnionLabel elementListUnionLabel = new ElementListUnionLabel(contact, elementListUnion, elementList, format);
        this.label = elementListUnionLabel;
        this.expression = elementListUnionLabel.getExpression();
        this.path = elementListUnionLabel.getPath();
        this.type = elementListUnionLabel.getType();
        this.name = elementListUnionLabel.getName();
        this.key = elementListUnionLabel.getKey();
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
