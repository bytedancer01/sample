package org.simpleframework.xml.strategy;

import java.util.HashMap;
import org.simpleframework.xml.stream.Node;
import org.simpleframework.xml.stream.NodeMap;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/strategy/ReadGraph.class */
class ReadGraph extends HashMap {
    private final String label;
    private final String length;
    private final Loader loader;
    private final String mark;
    private final String refer;

    public ReadGraph(Contract contract, Loader loader) {
        this.refer = contract.getReference();
        this.mark = contract.getIdentity();
        this.length = contract.getLength();
        this.label = contract.getLabel();
        this.loader = loader;
    }

    private Value readArray(Type type, Class cls, NodeMap nodeMap) {
        Node remove = nodeMap.remove(this.length);
        return new ArrayValue(cls, remove != null ? Integer.parseInt(remove.getValue()) : 0);
    }

    private Value readInstance(Type type, Class cls, NodeMap nodeMap) {
        Node remove = nodeMap.remove(this.mark);
        if (remove == null) {
            return readReference(type, cls, nodeMap);
        }
        String value = remove.getValue();
        if (containsKey(value)) {
            throw new CycleException("Element '%s' already exists", value);
        }
        return readValue(type, cls, nodeMap, value);
    }

    private Value readReference(Type type, Class cls, NodeMap nodeMap) {
        Node remove = nodeMap.remove(this.refer);
        if (remove == null) {
            return readValue(type, cls, nodeMap);
        }
        String value = remove.getValue();
        V v10 = get(value);
        if (containsKey(value)) {
            return new Reference(v10, cls);
        }
        throw new CycleException("Invalid reference '%s' found", value);
    }

    private Value readValue(Type type, Class cls, NodeMap nodeMap) {
        return type.getType().isArray() ? readArray(type, cls, nodeMap) : new ObjectValue(cls);
    }

    private Value readValue(Type type, Class cls, NodeMap nodeMap, String str) {
        Value readValue = readValue(type, cls, nodeMap);
        return str != null ? new Allocate(readValue, this, str) : readValue;
    }

    public Value read(Type type, NodeMap nodeMap) {
        Node remove = nodeMap.remove(this.label);
        Class<?> type2 = type.getType();
        Class<?> cls = type2;
        if (type2.isArray()) {
            cls = type2.getComponentType();
        }
        if (remove != null) {
            cls = this.loader.load(remove.getValue());
        }
        return readInstance(type, cls, nodeMap);
    }
}
