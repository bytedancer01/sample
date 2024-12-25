package org.jsoup.safety;

import java.util.Iterator;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Cleaner.class */
public class Cleaner {
    private Whitelist whitelist;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Cleaner$CleaningVisitor.class */
    public final class CleaningVisitor implements NodeVisitor {
        private Element destination;
        private int numDiscarded;
        private final Element root;
        public final Cleaner this$0;

        private CleaningVisitor(Cleaner cleaner, Element element, Element element2) {
            this.this$0 = cleaner;
            this.numDiscarded = 0;
            this.root = element;
            this.destination = element2;
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i10) {
            Node dataNode;
            if (!(node instanceof Element)) {
                if (node instanceof TextNode) {
                    dataNode = new TextNode(((TextNode) node).getWholeText(), node.baseUri());
                } else if ((node instanceof DataNode) && this.this$0.whitelist.isSafeTag(node.parent().nodeName())) {
                    dataNode = new DataNode(((DataNode) node).getWholeData(), node.baseUri());
                }
                this.destination.appendChild(dataNode);
                return;
            }
            Element element = (Element) node;
            if (this.this$0.whitelist.isSafeTag(element.tagName())) {
                ElementMeta createSafeElement = this.this$0.createSafeElement(element);
                Element element2 = createSafeElement.f36203el;
                this.destination.appendChild(element2);
                this.numDiscarded += createSafeElement.numAttribsDiscarded;
                this.destination = element2;
                return;
            }
            if (node == this.root) {
                return;
            }
            this.numDiscarded++;
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i10) {
            if ((node instanceof Element) && this.this$0.whitelist.isSafeTag(node.nodeName())) {
                this.destination = this.destination.parent();
            }
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/safety/Cleaner$ElementMeta.class */
    public static class ElementMeta {

        /* renamed from: el */
        public Element f36203el;
        public int numAttribsDiscarded;

        public ElementMeta(Element element, int i10) {
            this.f36203el = element;
            this.numAttribsDiscarded = i10;
        }
    }

    public Cleaner(Whitelist whitelist) {
        Validate.notNull(whitelist);
        this.whitelist = whitelist;
    }

    private int copySafeNodes(Element element, Element element2) {
        CleaningVisitor cleaningVisitor = new CleaningVisitor(element, element2);
        new NodeTraversor(cleaningVisitor).traverse(element);
        return cleaningVisitor.numDiscarded;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ElementMeta createSafeElement(Element element) {
        String tagName = element.tagName();
        Attributes attributes = new Attributes();
        Element element2 = new Element(Tag.valueOf(tagName), element.baseUri(), attributes);
        Iterator<Attribute> it = element.attributes().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Attribute next = it.next();
            if (this.whitelist.isSafeAttribute(tagName, element, next)) {
                attributes.put(next);
            } else {
                i10++;
            }
        }
        attributes.addAll(this.whitelist.getEnforcedAttributes(tagName));
        return new ElementMeta(element2, i10);
    }

    public Document clean(Document document) {
        Validate.notNull(document);
        Document createShell = Document.createShell(document.baseUri());
        if (document.body() != null) {
            copySafeNodes(document.body(), createShell.body());
        }
        return createShell;
    }

    public boolean isValid(Document document) {
        Validate.notNull(document);
        return copySafeNodes(document.body(), Document.createShell(document.baseUri()).body()) == 0;
    }
}
