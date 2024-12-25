package org.jsoup.nodes;

import com.amplifyframework.core.model.ModelIdentifier;
import org.apache.http.cookie.ClientCookie;
import org.jsoup.nodes.Document;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/XmlDeclaration.class */
public class XmlDeclaration extends Node {
    public static final String DECL_KEY = "declaration";
    private final boolean isProcessingInstruction;

    public XmlDeclaration(String str, String str2, boolean z10) {
        super(str2);
        this.attributes.put(DECL_KEY, str);
        this.isProcessingInstruction = z10;
    }

    public String getWholeDeclaration() {
        String str = this.attributes.get(DECL_KEY);
        if (!str.equals("xml") || this.attributes.size() <= 1) {
            return this.attributes.get(DECL_KEY);
        }
        StringBuilder sb2 = new StringBuilder(str);
        String str2 = this.attributes.get(ClientCookie.VERSION_ATTR);
        if (str2 != null) {
            sb2.append(" version=\"");
            sb2.append(str2);
            sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        String str3 = this.attributes.get("encoding");
        if (str3 != null) {
            sb2.append(" encoding=\"");
            sb2.append(str3);
            sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        return sb2.toString();
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return "#declaration";
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
        sb2.append("<");
        sb2.append(this.isProcessingInstruction ? "!" : "?");
        sb2.append(getWholeDeclaration());
        sb2.append(">");
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }
}
