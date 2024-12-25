package org.simpleframework.xml.core;

import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/CompositeUnion.class */
class CompositeUnion implements Converter {
    private final Context context;
    private final LabelMap elements;
    private final Group group;
    private final Expression path;
    private final Type type;

    public CompositeUnion(Context context, Group group, Expression expression, Type type) {
        this.elements = group.getElements();
        this.context = context;
        this.group = group;
        this.type = type;
        this.path = expression;
    }

    private void write(OutputNode outputNode, Object obj, Label label) {
        label.getConverter(this.context).write(outputNode, obj);
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode) {
        return this.elements.get(this.path.getElement(inputNode.getName())).getConverter(this.context).read(inputNode);
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode, Object obj) {
        return this.elements.get(this.path.getElement(inputNode.getName())).getConverter(this.context).read(inputNode, obj);
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(InputNode inputNode) {
        return this.elements.get(this.path.getElement(inputNode.getName())).getConverter(this.context).validate(inputNode);
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) {
        Class<?> cls = obj.getClass();
        Label label = this.group.getLabel(cls);
        if (label == null) {
            throw new UnionException("Value of %s not declared in %s with annotation %s", cls, this.type, this.group);
        }
        write(outputNode, obj, label);
    }
}
