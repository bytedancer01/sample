package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/DataNode.class */
public class DataNode extends Node {
    private static final String DATA_KEY = "data";

    public DataNode(String str, String str2) {
        super(str2);
        this.attributes.put(DATA_KEY, str);
    }

    public static DataNode createFromEncoded(String str, String str2) {
        return new DataNode(Entities.unescape(str), str2);
    }

    public String getWholeData() {
        return this.attributes.get(DATA_KEY);
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#data";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
        sb2.append(getWholeData());
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
    }

    public DataNode setWholeData(String str) {
        this.attributes.put(DATA_KEY, str);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }
}
