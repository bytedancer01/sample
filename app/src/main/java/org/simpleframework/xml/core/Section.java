package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Section.class */
interface Section extends Iterable<String> {
    String getAttribute(String str);

    LabelMap getAttributes();

    Label getElement(String str);

    LabelMap getElements();

    String getName();

    String getPath(String str);

    String getPrefix();

    Section getSection(String str);

    Label getText();

    boolean isSection(String str);
}
