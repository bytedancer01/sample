package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Group.class */
interface Group {
    LabelMap getElements();

    Label getLabel(Class cls);

    Label getText();

    boolean isInline();

    boolean isTextList();

    String toString();
}
