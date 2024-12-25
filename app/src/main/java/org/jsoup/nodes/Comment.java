package org.jsoup.nodes;

import org.jsoup.nodes.Document;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Comment.class */
public class Comment extends Node {
    private static final String COMMENT_KEY = "comment";

    public Comment(String str, String str2) {
        super(str2);
        this.attributes.put("comment", str);
    }

    public String getData() {
        return this.attributes.get("comment");
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#comment";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
        if (outputSettings.prettyPrint()) {
            indent(sb2, i10, outputSettings);
        }
        sb2.append("<!--");
        sb2.append(getData());
        sb2.append("-->");
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }
}
