package org.simpleframework.xml.core;

import org.simpleframework.xml.stream.InputNode;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Repeater.class */
interface Repeater extends Converter {
    @Override // org.simpleframework.xml.core.Converter
    Object read(InputNode inputNode, Object obj);
}
