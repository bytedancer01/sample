package org.simpleframework.xml.stream;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/PullReader.class */
class PullReader implements EventReader {
    private XmlPullParser parser;
    private EventNode peek;

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/PullReader$End.class */
    public static class End extends EventToken {
        private End() {
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isEnd() {
            return true;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/PullReader$Entry.class */
    public static class Entry extends EventAttribute {
        private final String name;
        private final String prefix;
        private final String reference;
        private final XmlPullParser source;
        private final String value;

        public Entry(XmlPullParser xmlPullParser, int i10) {
            this.reference = xmlPullParser.getAttributeNamespace(i10);
            this.prefix = xmlPullParser.getAttributePrefix(i10);
            this.value = xmlPullParser.getAttributeValue(i10);
            this.name = xmlPullParser.getAttributeName(i10);
            this.source = xmlPullParser;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getName() {
            return this.name;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getPrefix() {
            return this.prefix;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getReference() {
            return this.reference;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public Object getSource() {
            return this.source;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getValue() {
            return this.value;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
            return false;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/PullReader$Start.class */
    public static class Start extends EventElement {
        private final int line;
        private final String name;
        private final String prefix;
        private final String reference;
        private final XmlPullParser source;

        public Start(XmlPullParser xmlPullParser) {
            this.reference = xmlPullParser.getNamespace();
            this.line = xmlPullParser.getLineNumber();
            this.prefix = xmlPullParser.getPrefix();
            this.name = xmlPullParser.getName();
            this.source = xmlPullParser;
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
            return this.line;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getName() {
            return this.name;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getPrefix() {
            return this.prefix;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getReference() {
            return this.reference;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.source;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/PullReader$Text.class */
    public static class Text extends EventToken {
        private final XmlPullParser source;
        private final String text;

        public Text(XmlPullParser xmlPullParser) {
            this.text = xmlPullParser.getText();
            this.source = xmlPullParser;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.source;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public String getValue() {
            return this.text;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
            return true;
        }
    }

    public PullReader(XmlPullParser xmlPullParser) {
        this.parser = xmlPullParser;
    }

    private Entry attribute(int i10) {
        return new Entry(this.parser, i10);
    }

    private Start build(Start start) {
        int attributeCount = this.parser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            Entry attribute = attribute(i10);
            if (!attribute.isReserved()) {
                start.add(attribute);
            }
        }
        return start;
    }

    private End end() {
        return new End();
    }

    private EventNode read() {
        int next = this.parser.next();
        if (next != 1) {
            return next == 2 ? start() : next == 4 ? text() : next == 3 ? end() : read();
        }
        return null;
    }

    private Start start() {
        Start start = new Start(this.parser);
        Start start2 = start;
        if (start.isEmpty()) {
            start2 = build(start);
        }
        return start2;
    }

    private Text text() {
        return new Text(this.parser);
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode next() {
        EventNode eventNode = this.peek;
        if (eventNode == null) {
            eventNode = read();
        } else {
            this.peek = null;
        }
        return eventNode;
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode peek() {
        if (this.peek == null) {
            this.peek = next();
        }
        return this.peek;
    }
}
