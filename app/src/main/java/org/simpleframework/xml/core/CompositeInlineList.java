package org.simpleframework.xml.core;

import java.util.Collection;
import org.simpleframework.xml.strategy.Type;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/CompositeInlineList.class */
class CompositeInlineList implements Repeater {
    private final Type entry;
    private final CollectionFactory factory;
    private final String name;
    private final Traverser root;
    private final Type type;

    public CompositeInlineList(Context context, Type type, Type type2, String str) {
        this.factory = new CollectionFactory(context, type);
        this.root = new Traverser(context);
        this.entry = type2;
        this.type = type;
        this.name = str;
    }

    private Object read(InputNode inputNode, Class cls) {
        Object read = this.root.read(inputNode, cls);
        Class<?> cls2 = read.getClass();
        if (this.entry.getType().isAssignableFrom(cls2)) {
            return read;
        }
        throw new PersistenceException("Entry %s does not match %s for %s", cls2, this.entry, this.type);
    }

    private Object read(InputNode inputNode, Collection collection) {
        InputNode parent = inputNode.getParent();
        String name = inputNode.getName();
        while (inputNode != null) {
            Object read = read(inputNode, this.entry.getType());
            if (read != null) {
                collection.add(read);
            }
            inputNode = parent.getNext(name);
        }
        return collection;
    }

    @Override // org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode) {
        Collection collection = (Collection) this.factory.getInstance();
        if (collection != null) {
            return read(inputNode, collection);
        }
        return null;
    }

    @Override // org.simpleframework.xml.core.Repeater, org.simpleframework.xml.core.Converter
    public Object read(InputNode inputNode, Object obj) {
        Collection collection = (Collection) obj;
        return collection != null ? read(inputNode, collection) : read(inputNode);
    }

    @Override // org.simpleframework.xml.core.Converter
    public boolean validate(InputNode inputNode) {
        InputNode parent = inputNode.getParent();
        Class type = this.entry.getType();
        String name = inputNode.getName();
        while (inputNode != null) {
            if (!this.root.validate(inputNode, type)) {
                return false;
            }
            inputNode = parent.getNext(name);
        }
        return true;
    }

    @Override // org.simpleframework.xml.core.Converter
    public void write(OutputNode outputNode, Object obj) {
        Collection collection = (Collection) obj;
        OutputNode parent = outputNode.getParent();
        if (!outputNode.isCommitted()) {
            outputNode.remove();
        }
        write(parent, collection);
    }

    public void write(OutputNode outputNode, Collection collection) {
        for (Object obj : collection) {
            if (obj != null) {
                Class type = this.entry.getType();
                Class<?> cls = obj.getClass();
                if (!type.isAssignableFrom(cls)) {
                    throw new PersistenceException("Entry %s does not match %s for %s", cls, type, this.type);
                }
                this.root.write(outputNode, obj, type, this.name);
            }
        }
    }
}
