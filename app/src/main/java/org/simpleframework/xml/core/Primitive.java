package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Primitive.class */
class Primitive implements Converter {
    private final Context context;
    private final String empty;
    private final Class expect;
    private final PrimitiveFactory factory;
    private final Type type;

    public Primitive(Context context, Type type) {
        this(context, type, null);
    }

    public Primitive(Context context, Type type, String str) {
        this.factory = new PrimitiveFactory(context, type);
        this.expect = type.getType();
        this.context = context;
        this.empty = str;
        this.type = type;
    }

    private Object readElement(InputNode inputNode) {
        Instance primitiveFactory = this.factory.getInstance(inputNode);
        return !primitiveFactory.isReference() ? readElement(inputNode, primitiveFactory) : primitiveFactory.getInstance();
    }

    private Object readElement(InputNode inputNode, Instance instance) {
        Object read = read(inputNode, this.expect);
        if (instance != null) {
            instance.setInstance(read);
        }
        return read;
    }

    private Object readTemplate(String str, Class cls) {
        String property = this.context.getProperty(str);
        if (property != null) {
            return this.factory.getInstance(property, cls);
        }
        return null;
    }

    private boolean validateElement(InputNode inputNode) {
        Instance primitiveFactory = this.factory.getInstance(inputNode);
        if (primitiveFactory.isReference()) {
            return true;
        }
        primitiveFactory.setInstance(null);
        return true;
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode) {
        return inputNode.isElement() ? readElement(inputNode) : read(inputNode, this.expect);
    }

    public Object read(InputNode inputNode, Class cls) {
        String value = inputNode.getValue();
        if (value == null) {
            return null;
        }
        String str = this.empty;
        return (str == null || !value.equals(str)) ? readTemplate(value, cls) : this.empty;
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode, Object obj) {
        if (obj == null) {
            return read(inputNode);
        }
        throw new PersistenceException("Can not read existing %s for %s", this.expect, this.type);
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(InputNode inputNode) {
        if (inputNode.isElement()) {
            validateElement(inputNode);
            return true;
        }
        inputNode.getValue();
        return true;
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) {
        String text = this.factory.getText(obj);
        if (text != null) {
            outputNode.setValue(text);
        }
    }
}
