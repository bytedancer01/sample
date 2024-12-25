package org.jsoup.nodes;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/BooleanAttribute.class */
public class BooleanAttribute extends Attribute {
    public BooleanAttribute(String str) {
        super(str, "");
    }

    @Override // org.jsoup.nodes.Attribute
    public boolean isBooleanAttribute() {
        return true;
    }
}
