package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Node.class */
public abstract class Node implements Cloneable {
    private static final List<Node> EMPTY_NODES = Collections.emptyList();
    public Attributes attributes;
    public String baseUri;
    public List<Node> childNodes;
    public Node parentNode;
    public int siblingIndex;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Node$OuterHtmlVisitor.class */
    public static class OuterHtmlVisitor implements NodeVisitor {
        private StringBuilder accum;
        private Document.OutputSettings out;

        public OuterHtmlVisitor(StringBuilder sb2, Document.OutputSettings outputSettings) {
            this.accum = sb2;
            this.out = outputSettings;
        }

        @Override // org.jsoup.select.NodeVisitor
        public void head(Node node, int i10) {
            node.outerHtmlHead(this.accum, i10, this.out);
        }

        @Override // org.jsoup.select.NodeVisitor
        public void tail(Node node, int i10) {
            if (node.nodeName().equals("#text")) {
                return;
            }
            node.outerHtmlTail(this.accum, i10, this.out);
        }
    }

    public Node() {
        this.childNodes = EMPTY_NODES;
        this.attributes = null;
    }

    public Node(String str) {
        this(str, new Attributes());
    }

    public Node(String str, Attributes attributes) {
        Validate.notNull(str);
        Validate.notNull(attributes);
        this.childNodes = EMPTY_NODES;
        this.baseUri = str.trim();
        this.attributes = attributes;
    }

    private void addSiblingHtml(int i10, String str) {
        Validate.notNull(str);
        Validate.notNull(this.parentNode);
        List<Node> parseFragment = Parser.parseFragment(str, parent() instanceof Element ? (Element) parent() : null, baseUri());
        this.parentNode.addChildren(i10, (Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
    }

    private Element getDeepChild(Element element) {
        Elements children = element.children();
        if (children.size() > 0) {
            element = getDeepChild(children.get(0));
        }
        return element;
    }

    private void reindexChildren(int i10) {
        while (i10 < this.childNodes.size()) {
            this.childNodes.get(i10).setSiblingIndex(i10);
            i10++;
        }
    }

    public String absUrl(String str) {
        Validate.notEmpty(str);
        return !hasAttr(str) ? "" : StringUtil.resolve(this.baseUri, attr(str));
    }

    public void addChildren(int i10, Node... nodeArr) {
        Validate.noNullElements(nodeArr);
        for (int length = nodeArr.length - 1; length >= 0; length--) {
            Node node = nodeArr[length];
            reparentChild(node);
            ensureChildNodes();
            this.childNodes.add(i10, node);
        }
        reindexChildren(i10);
    }

    public void addChildren(Node... nodeArr) {
        for (Node node : nodeArr) {
            reparentChild(node);
            ensureChildNodes();
            this.childNodes.add(node);
            node.setSiblingIndex(this.childNodes.size() - 1);
        }
    }

    public Node after(String str) {
        addSiblingHtml(this.siblingIndex + 1, str);
        return this;
    }

    public Node after(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        this.parentNode.addChildren(this.siblingIndex + 1, node);
        return this;
    }

    public String attr(String str) {
        Validate.notNull(str);
        return this.attributes.hasKey(str) ? this.attributes.get(str) : str.toLowerCase().startsWith("abs:") ? absUrl(str.substring(4)) : "";
    }

    public Node attr(String str, String str2) {
        this.attributes.put(str, str2);
        return this;
    }

    public Attributes attributes() {
        return this.attributes;
    }

    public String baseUri() {
        return this.baseUri;
    }

    public Node before(String str) {
        addSiblingHtml(this.siblingIndex, str);
        return this;
    }

    public Node before(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        this.parentNode.addChildren(this.siblingIndex, node);
        return this;
    }

    public Node childNode(int i10) {
        return this.childNodes.get(i10);
    }

    public final int childNodeSize() {
        return this.childNodes.size();
    }

    public List<Node> childNodes() {
        return Collections.unmodifiableList(this.childNodes);
    }

    public Node[] childNodesAsArray() {
        return (Node[]) this.childNodes.toArray(new Node[childNodeSize()]);
    }

    public List<Node> childNodesCopy() {
        ArrayList arrayList = new ArrayList(this.childNodes.size());
        Iterator<Node> it = this.childNodes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo45454clone());
        }
        return arrayList;
    }

    @Override // 
    /* renamed from: clone */
    public Node mo45454clone() {
        Node doClone = doClone(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(doClone);
        while (!linkedList.isEmpty()) {
            Node node = (Node) linkedList.remove();
            for (int i10 = 0; i10 < node.childNodes.size(); i10++) {
                Node doClone2 = node.childNodes.get(i10).doClone(node);
                node.childNodes.set(i10, doClone2);
                linkedList.add(doClone2);
            }
        }
        return doClone;
    }

    public Node doClone(Node node) {
        try {
            Node node2 = (Node) super.clone();
            node2.parentNode = node;
            node2.siblingIndex = node == null ? 0 : this.siblingIndex;
            Attributes attributes = this.attributes;
            node2.attributes = attributes != null ? attributes.clone() : null;
            node2.baseUri = this.baseUri;
            node2.childNodes = new ArrayList(this.childNodes.size());
            Iterator<Node> it = this.childNodes.iterator();
            while (it.hasNext()) {
                node2.childNodes.add(it.next());
            }
            return node2;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void ensureChildNodes() {
        if (this.childNodes == EMPTY_NODES) {
            this.childNodes = new ArrayList(4);
        }
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Node node = (Node) obj;
        List<Node> list = this.childNodes;
        if (list != null) {
            if (!list.equals(node.childNodes)) {
                return false;
            }
        } else if (node.childNodes != null) {
            return false;
        }
        Attributes attributes = this.attributes;
        Attributes attributes2 = node.attributes;
        if (attributes == null ? attributes2 != null : !attributes.equals(attributes2)) {
            z10 = false;
        }
        return z10;
    }

    public Document.OutputSettings getOutputSettings() {
        return (ownerDocument() != null ? ownerDocument() : new Document("")).outputSettings();
    }

    public boolean hasAttr(String str) {
        Validate.notNull(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (this.attributes.hasKey(substring) && !absUrl(substring).equals("")) {
                return true;
            }
        }
        return this.attributes.hasKey(str);
    }

    public int hashCode() {
        List<Node> list = this.childNodes;
        int i10 = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        Attributes attributes = this.attributes;
        if (attributes != null) {
            i10 = attributes.hashCode();
        }
        return (hashCode * 31) + i10;
    }

    public void indent(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
        sb2.append("\n");
        sb2.append(StringUtil.padding(i10 * outputSettings.indentAmount()));
    }

    public Node nextSibling() {
        Node node = this.parentNode;
        if (node == null) {
            return null;
        }
        List<Node> list = node.childNodes;
        int i10 = this.siblingIndex + 1;
        if (list.size() > i10) {
            return list.get(i10);
        }
        return null;
    }

    public abstract String nodeName();

    public String outerHtml() {
        StringBuilder sb2 = new StringBuilder(128);
        outerHtml(sb2);
        return sb2.toString();
    }

    public void outerHtml(StringBuilder sb2) {
        new NodeTraversor(new OuterHtmlVisitor(sb2, getOutputSettings())).traverse(this);
    }

    public abstract void outerHtmlHead(StringBuilder sb2, int i10, Document.OutputSettings outputSettings);

    public abstract void outerHtmlTail(StringBuilder sb2, int i10, Document.OutputSettings outputSettings);

    public Document ownerDocument() {
        if (this instanceof Document) {
            return (Document) this;
        }
        Node node = this.parentNode;
        if (node == null) {
            return null;
        }
        return node.ownerDocument();
    }

    public Node parent() {
        return this.parentNode;
    }

    public final Node parentNode() {
        return this.parentNode;
    }

    public Node previousSibling() {
        int i10;
        Node node = this.parentNode;
        if (node != null && (i10 = this.siblingIndex) > 0) {
            return node.childNodes.get(i10 - 1);
        }
        return null;
    }

    public void remove() {
        Validate.notNull(this.parentNode);
        this.parentNode.removeChild(this);
    }

    public Node removeAttr(String str) {
        Validate.notNull(str);
        this.attributes.remove(str);
        return this;
    }

    public void removeChild(Node node) {
        Validate.isTrue(node.parentNode == this);
        int i10 = node.siblingIndex;
        this.childNodes.remove(i10);
        reindexChildren(i10);
        node.parentNode = null;
    }

    public void reparentChild(Node node) {
        Node node2 = node.parentNode;
        if (node2 != null) {
            node2.removeChild(node);
        }
        node.setParentNode(this);
    }

    public void replaceChild(Node node, Node node2) {
        Validate.isTrue(node.parentNode == this);
        Validate.notNull(node2);
        Node node3 = node2.parentNode;
        if (node3 != null) {
            node3.removeChild(node2);
        }
        int i10 = node.siblingIndex;
        this.childNodes.set(i10, node2);
        node2.parentNode = this;
        node2.setSiblingIndex(i10);
        node.parentNode = null;
    }

    public void replaceWith(Node node) {
        Validate.notNull(node);
        Validate.notNull(this.parentNode);
        this.parentNode.replaceChild(this, node);
    }

    public void setBaseUri(String str) {
        Validate.notNull(str);
        traverse(new NodeVisitor(this, str) { // from class: org.jsoup.nodes.Node.1
            public final Node this$0;
            public final String val$baseUri;

            {
                this.this$0 = this;
                this.val$baseUri = str;
            }

            @Override // org.jsoup.select.NodeVisitor
            public void head(Node node, int i10) {
                node.baseUri = this.val$baseUri;
            }

            @Override // org.jsoup.select.NodeVisitor
            public void tail(Node node, int i10) {
            }
        });
    }

    public void setParentNode(Node node) {
        Node node2 = this.parentNode;
        if (node2 != null) {
            node2.removeChild(this);
        }
        this.parentNode = node;
    }

    public void setSiblingIndex(int i10) {
        this.siblingIndex = i10;
    }

    public int siblingIndex() {
        return this.siblingIndex;
    }

    public List<Node> siblingNodes() {
        Node node = this.parentNode;
        if (node == null) {
            return Collections.emptyList();
        }
        List<Node> list = node.childNodes;
        ArrayList arrayList = new ArrayList(list.size() - 1);
        for (Node node2 : list) {
            if (node2 != this) {
                arrayList.add(node2);
            }
        }
        return arrayList;
    }

    public String toString() {
        return outerHtml();
    }

    public Node traverse(NodeVisitor nodeVisitor) {
        Validate.notNull(nodeVisitor);
        new NodeTraversor(nodeVisitor).traverse(this);
        return this;
    }

    public Node unwrap() {
        Validate.notNull(this.parentNode);
        Node node = this.childNodes.size() > 0 ? this.childNodes.get(0) : null;
        this.parentNode.addChildren(this.siblingIndex, childNodesAsArray());
        remove();
        return node;
    }

    public Node wrap(String str) {
        Validate.notEmpty(str);
        List<Node> parseFragment = Parser.parseFragment(str, parent() instanceof Element ? (Element) parent() : null, baseUri());
        Node node = parseFragment.get(0);
        if (node == null || !(node instanceof Element)) {
            return null;
        }
        Element element = (Element) node;
        Element deepChild = getDeepChild(element);
        this.parentNode.replaceChild(this, element);
        deepChild.addChildren(this);
        if (parseFragment.size() > 0) {
            for (int i10 = 0; i10 < parseFragment.size(); i10++) {
                Node node2 = parseFragment.get(i10);
                node2.parentNode.removeChild(node2);
                element.appendChild(node2);
            }
        }
        return this;
    }
}
