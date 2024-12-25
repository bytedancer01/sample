package org.jsoup.nodes;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/TextNode.class */
public class TextNode extends Node {
    private static final String TEXT_KEY = "text";
    public String text;

    public TextNode(String str, String str2) {
        this.baseUri = str2;
        this.text = str;
    }

    public static TextNode createFromEncoded(String str, String str2) {
        return new TextNode(Entities.unescape(str), str2);
    }

    private void ensureAttributes() {
        if (this.attributes == null) {
            Attributes attributes = new Attributes();
            this.attributes = attributes;
            attributes.put(TEXT_KEY, this.text);
        }
    }

    public static boolean lastCharIsWhitespace(StringBuilder sb2) {
        boolean z10 = true;
        if (sb2.length() == 0 || sb2.charAt(sb2.length() - 1) != ' ') {
            z10 = false;
        }
        return z10;
    }

    public static String normaliseWhitespace(String str) {
        return StringUtil.normaliseWhitespace(str);
    }

    public static String stripLeadingWhitespace(String str) {
        return str.replaceFirst("^\\s+", "");
    }

    @Override // org.jsoup.nodes.Node
    public String absUrl(String str) {
        ensureAttributes();
        return super.absUrl(str);
    }

    @Override // org.jsoup.nodes.Node
    public String attr(String str) {
        ensureAttributes();
        return super.attr(str);
    }

    @Override // org.jsoup.nodes.Node
    public Node attr(String str, String str2) {
        ensureAttributes();
        return super.attr(str, str2);
    }

    @Override // org.jsoup.nodes.Node
    public Attributes attributes() {
        ensureAttributes();
        return super.attributes();
    }

    @Override // org.jsoup.nodes.Node
    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.text;
        String str2 = ((TextNode) obj).text;
        if (str == null ? str2 != null : !str.equals(str2)) {
            z10 = false;
        }
        return z10;
    }

    public String getWholeText() {
        Attributes attributes = this.attributes;
        return attributes == null ? this.text : attributes.get(TEXT_KEY);
    }

    @Override // org.jsoup.nodes.Node
    public boolean hasAttr(String str) {
        ensureAttributes();
        return super.hasAttr(str);
    }

    @Override // org.jsoup.nodes.Node
    public int hashCode() {
        int hashCode = super.hashCode();
        String str = this.text;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean isBlank() {
        return StringUtil.isBlank(getWholeText());
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#text";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (isBlank() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        indent(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (isBlank() == false) goto L18;
     */
    @Override // org.jsoup.nodes.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void outerHtmlHead(java.lang.StringBuilder r8, int r9, org.jsoup.nodes.Document.OutputSettings r10) {
        /*
            r7 = this;
            r0 = r10
            boolean r0 = r0.prettyPrint()
            if (r0 == 0) goto L52
            r0 = r7
            int r0 = r0.siblingIndex()
            if (r0 != 0) goto L31
            r0 = r7
            org.jsoup.nodes.Node r0 = r0.parentNode
            r12 = r0
            r0 = r12
            boolean r0 = r0 instanceof org.jsoup.nodes.Element
            if (r0 == 0) goto L31
            r0 = r12
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            org.jsoup.parser.Tag r0 = r0.tag()
            boolean r0 = r0.formatAsBlock()
            if (r0 == 0) goto L31
            r0 = r7
            boolean r0 = r0.isBlank()
            if (r0 == 0) goto L4b
        L31:
            r0 = r10
            boolean r0 = r0.outline()
            if (r0 == 0) goto L52
            r0 = r7
            java.util.List r0 = r0.siblingNodes()
            int r0 = r0.size()
            if (r0 <= 0) goto L52
            r0 = r7
            boolean r0 = r0.isBlank()
            if (r0 != 0) goto L52
        L4b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.indent(r1, r2, r3)
        L52:
            r0 = r10
            boolean r0 = r0.prettyPrint()
            if (r0 == 0) goto L73
            r0 = r7
            org.jsoup.nodes.Node r0 = r0.parent()
            boolean r0 = r0 instanceof org.jsoup.nodes.Element
            if (r0 == 0) goto L73
            r0 = r7
            org.jsoup.nodes.Node r0 = r0.parent()
            boolean r0 = org.jsoup.nodes.Element.preserveWhitespace(r0)
            if (r0 != 0) goto L73
            r0 = 1
            r11 = r0
            goto L76
        L73:
            r0 = 0
            r11 = r0
        L76:
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.getWholeText()
            r2 = r10
            r3 = 0
            r4 = r11
            r5 = 0
            org.jsoup.nodes.Entities.escape(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.TextNode.outerHtmlHead(java.lang.StringBuilder, int, org.jsoup.nodes.Document$OutputSettings):void");
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public Node removeAttr(String str) {
        ensureAttributes();
        return super.removeAttr(str);
    }

    public TextNode splitText(int i10) {
        Validate.isTrue(i10 >= 0, "Split offset must be not be negative");
        Validate.isTrue(i10 < this.text.length(), "Split offset must not be greater than current text length");
        String substring = getWholeText().substring(0, i10);
        String substring2 = getWholeText().substring(i10);
        text(substring);
        TextNode textNode = new TextNode(substring2, baseUri());
        if (parent() != null) {
            parent().addChildren(siblingIndex() + 1, textNode);
        }
        return textNode;
    }

    public String text() {
        return normaliseWhitespace(getWholeText());
    }

    public TextNode text(String str) {
        this.text = str;
        Attributes attributes = this.attributes;
        if (attributes != null) {
            attributes.put(TEXT_KEY, str);
        }
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }
}
