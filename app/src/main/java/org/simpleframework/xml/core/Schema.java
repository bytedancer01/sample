package org.simpleframework.xml.core;

import org.simpleframework.xml.Version;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Schema.class */
interface Schema {
    Caller getCaller();

    Decorator getDecorator();

    Instantiator getInstantiator();

    Version getRevision();

    Section getSection();

    Label getText();

    Label getVersion();

    boolean isPrimitive();
}
