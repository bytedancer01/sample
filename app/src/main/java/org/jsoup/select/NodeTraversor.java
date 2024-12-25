package org.jsoup.select;

import org.jsoup.nodes.Node;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/NodeTraversor.class */
public class NodeTraversor {
    private NodeVisitor visitor;

    public NodeTraversor(NodeVisitor nodeVisitor) {
        this.visitor = nodeVisitor;
    }

    public void traverse(Node node) {
        Node node2 = node;
        int i10 = 0;
        while (node2 != null) {
            this.visitor.head(node2, i10);
            Node node3 = node2;
            int i11 = i10;
            if (node2.childNodeSize() > 0) {
                node2 = node2.childNode(0);
                i10++;
            } else {
                while (node3.nextSibling() == null && i11 > 0) {
                    this.visitor.tail(node3, i11);
                    node3 = node3.parentNode();
                    i11--;
                }
                this.visitor.tail(node3, i11);
                if (node3 == node) {
                    return;
                }
                node2 = node3.nextSibling();
                i10 = i11;
            }
        }
    }
}
