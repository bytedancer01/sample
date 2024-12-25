package org.simpleframework.xml.strategy;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.NodeMap;
import org.simpleframework.xml.stream.OutputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/strategy/Visitor.class */
public interface Visitor {
    void read(Type type, NodeMap<InputNode> nodeMap);

    void write(Type type, NodeMap<OutputNode> nodeMap);
}
