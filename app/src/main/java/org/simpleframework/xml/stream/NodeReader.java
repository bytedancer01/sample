package org.simpleframework.xml.stream;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/NodeReader.class */
class NodeReader {
    private final EventReader reader;
    private final StringBuilder text = new StringBuilder();
    private final InputStack stack = new InputStack();

    public NodeReader(EventReader eventReader) {
        this.reader = eventReader;
    }

    private void fillText(InputNode inputNode) {
        EventNode peek = this.reader.peek();
        if (peek.isText()) {
            this.text.append(peek.getValue());
        }
    }

    private boolean isName(EventNode eventNode, String str) {
        String name = eventNode.getName();
        if (name == null) {
            return false;
        }
        return name.equals(str);
    }

    private String readBuffer(InputNode inputNode) {
        if (this.text.length() <= 0) {
            return null;
        }
        String sb2 = this.text.toString();
        this.text.setLength(0);
        return sb2;
    }

    private InputNode readStart(InputNode inputNode, EventNode eventNode) {
        InputElement inputElement = new InputElement(inputNode, this, eventNode);
        if (this.text.length() > 0) {
            this.text.setLength(0);
        }
        return eventNode.isStart() ? this.stack.push(inputElement) : inputElement;
    }

    private String readText(InputNode inputNode) {
        while (true) {
            EventNode peek = this.reader.peek();
            if (this.stack.top() != inputNode || !peek.isText()) {
                break;
            }
            fillText(inputNode);
            this.reader.next();
        }
        return readBuffer(inputNode);
    }

    public boolean isEmpty(InputNode inputNode) {
        return this.stack.top() == inputNode && this.reader.peek().isEnd();
    }

    public boolean isRoot(InputNode inputNode) {
        return this.stack.bottom() == inputNode;
    }

    public InputNode readElement(InputNode inputNode) {
        if (!this.stack.isRelevant(inputNode)) {
            return null;
        }
        while (true) {
            EventNode next = this.reader.next();
            if (next == null) {
                return null;
            }
            if (next.isEnd()) {
                if (this.stack.pop() == inputNode) {
                    return null;
                }
            } else if (next.isStart()) {
                return readStart(inputNode, next);
            }
        }
    }

    public InputNode readElement(InputNode inputNode, String str) {
        if (!this.stack.isRelevant(inputNode)) {
            return null;
        }
        while (true) {
            EventNode peek = this.reader.peek();
            if (peek == null) {
                return null;
            }
            if (peek.isText()) {
                fillText(inputNode);
            } else if (peek.isEnd()) {
                if (this.stack.top() == inputNode) {
                    return null;
                }
                this.stack.pop();
            } else if (peek.isStart()) {
                if (isName(peek, str)) {
                    return readElement(inputNode);
                }
                return null;
            }
            this.reader.next();
        }
    }

    public InputNode readRoot() {
        if (!this.stack.isEmpty()) {
            return null;
        }
        InputNode readElement = readElement(null);
        if (readElement != null) {
            return readElement;
        }
        throw new NodeException("Document has no root element");
    }

    public String readValue(InputNode inputNode) {
        if (!this.stack.isRelevant(inputNode)) {
            return null;
        }
        if (this.text.length() <= 0 && this.reader.peek().isEnd()) {
            if (this.stack.top() == inputNode) {
                return null;
            }
            this.stack.pop();
            this.reader.next();
        }
        return readText(inputNode);
    }

    public void skipElement(InputNode inputNode) {
        while (readElement(inputNode) != null) {
        }
    }
}
