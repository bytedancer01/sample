package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/EventNode.class */
interface EventNode extends Iterable<Attribute> {
    int getLine();

    String getName();

    String getPrefix();

    String getReference();

    Object getSource();

    String getValue();

    boolean isEnd();

    boolean isStart();

    boolean isText();
}
