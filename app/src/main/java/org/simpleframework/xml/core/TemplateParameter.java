package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/TemplateParameter.class */
abstract class TemplateParameter implements Parameter {
    @Override // org.simpleframework.xml.core.Parameter
    public boolean isAttribute() {
        return false;
    }

    @Override // org.simpleframework.xml.core.Parameter
    public boolean isText() {
        return false;
    }
}
