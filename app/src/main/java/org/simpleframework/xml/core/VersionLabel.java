package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.Version;
import org.simpleframework.xml.stream.Format;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/VersionLabel.class */
class VersionLabel extends TemplateLabel {
    private Decorator decorator;
    private Introspector detail;
    private Format format;
    private Version label;
    private String name;
    private Expression path;
    private boolean required;
    private Class type;

    public VersionLabel(Contact contact, Version version, Format format) {
        this.detail = new Introspector(contact, this, format);
        this.decorator = new Qualifier(contact);
        this.required = version.required();
        this.type = contact.getType();
        this.name = version.name();
        this.format = format;
        this.label = version;
    }

    @Override // org.simpleframework.xml.core.Label
    public Annotation getAnnotation() {
        return this.label;
    }

    @Override // org.simpleframework.xml.core.Label
    public Contact getContact() {
        return this.detail.getContact();
    }

    @Override // org.simpleframework.xml.core.Label
    public Converter getConverter(Context context) {
        String empty = getEmpty(context);
        Contact contact = getContact();
        if (context.isFloat(contact)) {
            return new Primitive(context, contact, empty);
        }
        throw new AttributeException("Cannot use %s to represent %s", this.label, contact);
    }

    @Override // org.simpleframework.xml.core.Label
    public Decorator getDecorator() {
        return this.decorator;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getEmpty(Context context) {
        return null;
    }

    @Override // org.simpleframework.xml.core.Label
    public Expression getExpression() {
        if (this.path == null) {
            this.path = this.detail.getExpression();
        }
        return this.path;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getName() {
        return this.format.getStyle().getAttribute(this.detail.getName());
    }

    @Override // org.simpleframework.xml.core.Label
    public String getOverride() {
        return this.name;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getPath() {
        return getExpression().getAttribute(getName());
    }

    @Override // org.simpleframework.xml.core.Label
    public Class getType() {
        return this.type;
    }

    @Override // org.simpleframework.xml.core.TemplateLabel, org.simpleframework.xml.core.Label
    public boolean isAttribute() {
        return true;
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
        return false;
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
        return this.required;
    }

    @Override // org.simpleframework.xml.core.Label
    public String toString() {
        return this.detail.toString();
    }
}
