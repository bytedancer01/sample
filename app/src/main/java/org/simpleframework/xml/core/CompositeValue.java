package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.simpleframework.xml.stream.Style;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/CompositeValue.class */
class CompositeValue implements Converter {
    private final Context context;
    private final Entry entry;
    private final Traverser root;
    private final Style style;
    private final Type type;

    public CompositeValue(Context context, Entry entry, Type type) {
        this.root = new Traverser(context);
        this.style = context.getStyle();
        this.context = context;
        this.entry = entry;
        this.type = type;
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
        InputNode next = inputNode.getNext();
        Class type = this.type.getType();
        if (next == null || next.isEmpty()) {
            return null;
        }
        return this.root.read(next, type);
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
        String str = value;
        if (value == null) {
            str = this.context.getName(type);
        }
        return validate(inputNode, str);
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) {
        Class type = this.type.getType();
        String value = this.entry.getValue();
        String str = value;
        if (value == null) {
            str = this.context.getName(type);
        }
        this.root.write(outputNode, obj, type, this.style.getElement(str));
    }
}
