package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.stream.Style;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/PrimitiveValue.class */
class PrimitiveValue implements Converter {
    private final Context context;
    private final Entry entry;
    private final PrimitiveFactory factory;
    private final Primitive root;
    private final Style style;
    private final Type type;

    public PrimitiveValue(Context context, Entry entry, Type type) {
        this.factory = new PrimitiveFactory(context, type);
        this.root = new Primitive(context, type);
        this.style = context.getStyle();
        this.context = context;
        this.entry = entry;
        this.type = type;
    }

    private boolean isOverridden(OutputNode outputNode, Object obj) {
        return this.factory.setOverride(this.type, obj, outputNode);
    }

    private Object readAttribute(InputNode inputNode, String str) {
        InputNode inputNode2 = inputNode;
        if (str != null) {
            inputNode2 = inputNode.getAttribute(this.style.getAttribute(str));
        }
        if (inputNode2 == null) {
            return null;
        }
        return this.root.read(inputNode2);
    }

    private Object readElement(InputNode inputNode, String str) {
        InputNode next = inputNode.getNext(this.style.getAttribute(str));
        if (next == null) {
            return null;
        }
        return this.root.read(next);
    }

    private boolean validateAttribute(InputNode inputNode, String str) {
        InputNode inputNode2 = inputNode;
        if (str != null) {
            inputNode2 = inputNode.getNext(this.style.getAttribute(str));
        }
        if (inputNode2 == null) {
            return true;
        }
        return this.root.validate(inputNode2);
    }

    private boolean validateElement(InputNode inputNode, String str) {
        if (inputNode.getNext(this.style.getAttribute(str)) == null) {
            return true;
        }
        return this.root.validate(inputNode);
    }

    private void writeAttribute(OutputNode outputNode, Object obj, String str) {
        if (obj != null) {
            OutputNode outputNode2 = outputNode;
            if (str != null) {
                outputNode2 = outputNode.setAttribute(this.style.getAttribute(str), null);
            }
            this.root.write(outputNode2, obj);
        }
    }

    private void writeElement(OutputNode outputNode, Object obj, String str) {
        OutputNode child = outputNode.getChild(this.style.getAttribute(str));
        if (obj == null || isOverridden(child, obj)) {
            return;
        }
        this.root.write(child, obj);
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode) {
        Class type = this.type.getType();
        String value = this.entry.getValue();
        if (this.entry.isInline()) {
            return readAttribute(inputNode, value);
        }
        String str = value;
        if (value == null) {
            str = this.context.getName(type);
        }
        return readElement(inputNode, str);
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode, Object obj) {
        Class type = this.type.getType();
        if (obj == null) {
            return read(inputNode);
        }
        throw new PersistenceException("Can not read value of %s for %s", type, this.entry);
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(InputNode inputNode) {
        Class type = this.type.getType();
        String value = this.entry.getValue();
        if (this.entry.isInline()) {
            return validateAttribute(inputNode, value);
        }
        String str = value;
        if (value == null) {
            str = this.context.getName(type);
        }
        return validateElement(inputNode, str);
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) {
        Class type = this.type.getType();
        String value = this.entry.getValue();
        if (this.entry.isInline()) {
            writeAttribute(outputNode, obj, value);
            return;
        }
        String str = value;
        if (value == null) {
            str = this.context.getName(type);
        }
        writeElement(outputNode, obj, str);
    }
}
