package org.jsoup.helper;

import java.io.StringWriter;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: combined.jar:classes3.jar:org/jsoup/helper/W3CDom.class */
public class W3CDom {
    public DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    /* loaded from: combined.jar:classes3.jar:org/jsoup/helper/W3CDom$W3CBuilder.class */
    public class W3CBuilder implements NodeVisitor {
        private Element dest;
        private final Document doc;
        public final W3CDom this$0;

        public W3CBuilder(W3CDom w3CDom, Document document) {
            this.this$0 = w3CDom;
            this.doc = document;
        }

        private void copyAttributes(Node node, Element element) {
            Iterator<Attribute> it = node.attributes().iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                element.setAttribute(next.getKey(), next.getValue());
            }
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i10) {
            Document document;
            String wholeData;
            org.w3c.dom.Node createComment;
            if (node instanceof org.jsoup.nodes.Element) {
                org.jsoup.nodes.Element element = (org.jsoup.nodes.Element) node;
                Element createElement = this.doc.createElement(element.tagName());
                copyAttributes(element, createElement);
                org.w3c.dom.Node node2 = this.dest;
                org.w3c.dom.Node node3 = node2;
                if (node2 == null) {
                    node3 = this.doc;
                }
                node3.appendChild(createElement);
                this.dest = createElement;
                return;
            }
            if (node instanceof TextNode) {
                document = this.doc;
                wholeData = ((TextNode) node).getWholeText();
            } else if (node instanceof Comment) {
                createComment = this.doc.createComment(((Comment) node).getData());
                this.dest.appendChild(createComment);
            } else {
                if (!(node instanceof DataNode)) {
                    return;
                }
                document = this.doc;
                wholeData = ((DataNode) node).getWholeData();
            }
            createComment = document.createTextNode(wholeData);
            this.dest.appendChild(createComment);
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i10) {
            if ((node instanceof org.jsoup.nodes.Element) && (this.dest.getParentNode() instanceof Element)) {
                this.dest = (Element) this.dest.getParentNode();
            }
        }
    }

    public String asString(Document document) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            TransformerFactory.newInstance().newTransformer().transform(dOMSource, new StreamResult(stringWriter));
            return stringWriter.toString();
        } catch (TransformerException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public void convert(org.jsoup.nodes.Document document, Document document2) {
        if (!StringUtil.isBlank(document.location())) {
            document2.setDocumentURI(document.location());
        }
        new NodeTraversor(new W3CBuilder(this, document2)).traverse(document.child(0));
    }

    public Document fromJsoup(org.jsoup.nodes.Document document) {
        Validate.notNull(document);
        try {
            Document newDocument = this.factory.newDocumentBuilder().newDocument();
            convert(document, newDocument);
            return newDocument;
        } catch (ParserConfigurationException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
