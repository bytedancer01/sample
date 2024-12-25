package org.simpleframework.xml.core;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/core/Expression.class */
interface Expression extends Iterable<String> {
    String getAttribute(String str);

    String getElement(String str);

    String getFirst();

    int getIndex();

    String getLast();

    String getPath();

    Expression getPath(int i10);

    Expression getPath(int i10, int i11);

    String getPrefix();

    boolean isAttribute();

    boolean isEmpty();

    boolean isPath();

    String toString();
}
