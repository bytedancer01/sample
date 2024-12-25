package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/InputStack.class */
class InputStack extends Stack<InputNode> {
    public InputStack() {
        super(6);
    }

    public boolean isRelevant(InputNode inputNode) {
        return contains(inputNode) || isEmpty();
    }
}
