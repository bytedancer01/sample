package org.simpleframework.xml.stream;

import java.util.LinkedList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* loaded from: combined.jar:classes3.jar:org/simpleframework/xml/stream/NodeExtractor.class */
class NodeExtractor extends LinkedList<org.w3c.dom.Node> {
    public NodeExtractor(Document document) {
        extract(document);
    }

    private void extract(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null) {
            offer(documentElement);
            extract(documentElement);
        }
    }

    private void extract(org.w3c.dom.Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            org.w3c.dom.Node item = childNodes.item(i10);
            if (item.getNodeType() != 8) {
                offer(item);
                extract(item);
            }
        }
    }
}
