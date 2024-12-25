package org.simpleframework.xml.core;

import org.simpleframework.xml.stream.OutputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Decorator.class */
interface Decorator {
    void decorate(OutputNode outputNode);

    void decorate(OutputNode outputNode, Decorator decorator);
}
