package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/OutputNode.class */
public interface OutputNode extends Node {
    void commit();

    NodeMap<OutputNode> getAttributes();

    OutputNode getChild(String str);

    String getComment();

    Mode getMode();

    NamespaceMap getNamespaces();

    @Override // org.simpleframework.xml.stream.Node
    OutputNode getParent();

    String getPrefix();

    String getPrefix(boolean z10);

    String getReference();

    boolean isCommitted();

    boolean isRoot();

    void remove();

    OutputNode setAttribute(String str, String str2);

    void setComment(String str);

    void setData(boolean z10);

    void setMode(Mode mode);

    void setName(String str);

    void setReference(String str);

    void setValue(String str);
}
