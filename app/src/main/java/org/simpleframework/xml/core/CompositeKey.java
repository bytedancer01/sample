package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.stream.Position;
import org.simpleframework.xml.stream.Style;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/CompositeKey.class */
class CompositeKey implements Converter {
    private final Context context;
    private final Entry entry;
    private final Traverser root;
    private final Style style;
    private final Type type;

    public CompositeKey(Context context, Entry entry, Type type) {
        this.root = new Traverser(context);
        this.style = context.getStyle();
        this.context = context;
        this.entry = entry;
        this.type = type;
    }

    private Object read(InputNode inputNode, String str) {
        String element = this.style.getElement(str);
        Class type = this.type.getType();
        InputNode inputNode2 = inputNode;
        if (element != null) {
            inputNode2 = inputNode.getNext(element);
        }
        if (inputNode2 == null || inputNode2.isEmpty()) {
            return null;
        }
        return this.root.read(inputNode2, type);
    }

    private boolean validate(InputNode inputNode, String str) {
        InputNode next = inputNode.getNext(this.style.getElement(str));
        Class type = this.type.getType();
        if (next == null || next.isEmpty()) {
            return true;
        }
        return this.root.validate(next, type);
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode) {
        Position position = inputNode.getPosition();
        Class type = this.type.getType();
        String key = this.entry.getKey();
        String str = key;
        if (key == null) {
            str = this.context.getName(type);
        }
        if (this.entry.isAttribute()) {
            throw new AttributeException("Can not have %s as an attribute for %s at %s", type, this.entry, position);
        }
        return read(inputNode, str);
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode, Object obj) {
        Position position = inputNode.getPosition();
        Class type = this.type.getType();
        if (obj == null) {
            return read(inputNode);
        }
        throw new PersistenceException("Can not read key of %s for %s at %s", type, this.entry, position);
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(InputNode inputNode) {
        Position position = inputNode.getPosition();
        Class type = this.type.getType();
        String key = this.entry.getKey();
        String str = key;
        if (key == null) {
            str = this.context.getName(type);
        }
        if (this.entry.isAttribute()) {
            throw new ElementException("Can not have %s as an attribute for %s at %s", type, this.entry, position);
        }
        return validate(inputNode, str);
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) {
        Class type = this.type.getType();
        String key = this.entry.getKey();
        if (this.entry.isAttribute()) {
            throw new ElementException("Can not have %s as an attribute for %s", type, this.entry);
        }
        String str = key;
        if (key == null) {
            str = this.context.getName(type);
        }
        this.root.write(outputNode, obj, type, this.style.getElement(str));
    }
}
