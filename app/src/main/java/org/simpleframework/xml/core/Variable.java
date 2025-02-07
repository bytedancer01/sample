package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.stream.Position;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Variable.class */
class Variable implements Label {
    private final Label label;
    private final Object value;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Variable$Adapter.class */
    public static class Adapter implements Repeater {
        private final Label label;
        private final Converter reader;
        private final Object value;

        public Adapter(Converter converter, Label label, Object obj) {
            this.reader = converter;
            this.value = obj;
            this.label = label;
        }

        @Override // org.simpleframework.xml.core.Converter
        public Object read(InputNode inputNode) {
            return read(inputNode, this.value);
        }

        @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
        public Object read(InputNode inputNode, Object obj) {
            Position position = inputNode.getPosition();
            String name = inputNode.getName();
            Converter converter = this.reader;
            if (converter instanceof Repeater) {
                return ((Repeater) converter).read(inputNode, obj);
            }
            throw new PersistenceException("Element '%s' is already used with %s at %s", name, this.label, position);
        }

        @Override // org.simpleframework.xml.core.Converter
        public boolean validate(InputNode inputNode) {
            Position position = inputNode.getPosition();
            String name = inputNode.getName();
            Converter converter = this.reader;
            if (converter instanceof Repeater) {
                return ((Repeater) converter).validate(inputNode);
            }
            throw new PersistenceException("Element '%s' declared twice at %s", name, position);
        }

        @Override // org.simpleframework.xml.core.Converter
        public void write(OutputNode outputNode, Object obj) {
            write(outputNode, obj);
        }
    }

    public Variable(Label label, Object obj) {
        this.label = label;
        this.value = obj;
    }

    @Override // org.simpleframework.xml.core.Label
    public Annotation getAnnotation() {
        return this.label.getAnnotation();
    }

    @Override // org.simpleframework.xml.core.Label
    public Contact getContact() {
        return this.label.getContact();
    }

    @Override // org.simpleframework.xml.core.Label
    public Converter getConverter(Context context) {
        Converter converter = this.label.getConverter(context);
        return converter instanceof Adapter ? converter : new Adapter(converter, this.label, this.value);
    }

    @Override // org.simpleframework.xml.core.Label
    public Decorator getDecorator() {
        return this.label.getDecorator();
    }

    @Override // org.simpleframework.xml.core.Label
    public Type getDependent() {
        return this.label.getDependent();
    }

    @Override // org.simpleframework.xml.core.Label
    public Object getEmpty(Context context) {
        return this.label.getEmpty(context);
    }

    @Override // org.simpleframework.xml.core.Label
    public String getEntry() {
        return this.label.getEntry();
    }

    @Override // org.simpleframework.xml.core.Label
    public Expression getExpression() {
        return this.label.getExpression();
    }

    @Override // org.simpleframework.xml.core.Label
    public Object getKey() {
        return this.label.getKey();
    }

    @Override // org.simpleframework.xml.core.Label
    public Label getLabel(Class cls) {
        return this;
    }

    @Override // org.simpleframework.xml.core.Label
    public String getName() {
        return this.label.getName();
    }

    @Override // org.simpleframework.xml.core.Label
    public String[] getNames() {
        return this.label.getNames();
    }

    @Override // org.simpleframework.xml.core.Label
    public String getOverride() {
        return this.label.getOverride();
    }

    @Override // org.simpleframework.xml.core.Label
    public String getPath() {
        return this.label.getPath();
    }

    @Override // org.simpleframework.xml.core.Label
    public String[] getPaths() {
        return this.label.getPaths();
    }

    @Override // org.simpleframework.xml.core.Label
    public Class getType() {
        return this.label.getType();
    }

    @Override // org.simpleframework.xml.core.Label
    public Type getType(Class cls) {
        return this.label.getType(cls);
    }

    public Object getValue() {
        return this.value;
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isAttribute() {
        return this.label.isAttribute();
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isCollection() {
        return this.label.isCollection();
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isData() {
        return this.label.isData();
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isInline() {
        return this.label.isInline();
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isRequired() {
        return this.label.isRequired();
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isText() {
        return this.label.isText();
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isTextList() {
        return this.label.isTextList();
    }

    @Override // org.simpleframework.xml.core.Label
    public boolean isUnion() {
        return this.label.isUnion();
    }

    @Override // org.simpleframework.xml.core.Label
    public String toString() {
        return this.label.toString();
    }
}
