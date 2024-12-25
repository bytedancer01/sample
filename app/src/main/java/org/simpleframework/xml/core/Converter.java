package org.simpleframework.xml.core;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Converter.class */
interface Converter {
    Object read(InputNode inputNode);

    Object read(InputNode inputNode, Object obj);

    boolean validate(InputNode inputNode);

    void write(OutputNode outputNode, Object obj);
}
