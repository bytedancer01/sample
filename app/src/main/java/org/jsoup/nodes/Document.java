package org.jsoup.nodes;

import com.amazonaws.mobileconnectors.appsync.BuildConfig;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import org.achartengine.ChartFactory;
import org.apache.http.cookie.ClientCookie;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Document.class */
public class Document extends Element {
    private String location;
    private OutputSettings outputSettings;
    private QuirksMode quirksMode;
    private boolean updateMetaCharset;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Document$OutputSettings.class */
    public static class OutputSettings implements Cloneable {
        private Charset charset;
        private CharsetEncoder charsetEncoder;
        private Entities.EscapeMode escapeMode = Entities.EscapeMode.base;
        private int indentAmount;
        private boolean outline;
        private boolean prettyPrint;
        private Syntax syntax;

        /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Document$OutputSettings$Syntax.class */
        public enum Syntax {
            html,
            xml
        }

        public OutputSettings() {
            Charset forName = Charset.forName("UTF-8");
            this.charset = forName;
            this.charsetEncoder = forName.newEncoder();
            this.prettyPrint = true;
            this.outline = false;
            this.indentAmount = 1;
            this.syntax = Syntax.html;
        }

        public Charset charset() {
            return this.charset;
        }

        public OutputSettings charset(String str) {
            charset(Charset.forName(str));
            return this;
        }

        public OutputSettings charset(Charset charset) {
            this.charset = charset;
            this.charsetEncoder = charset.newEncoder();
            return this;
        }

        public OutputSettings clone() {
            try {
                OutputSettings outputSettings = (OutputSettings) super.clone();
                outputSettings.charset(this.charset.name());
                outputSettings.escapeMode = Entities.EscapeMode.valueOf(this.escapeMode.name());
                return outputSettings;
            } catch (CloneNotSupportedException e10) {
                throw new RuntimeException(e10);
            }
        }

        public CharsetEncoder encoder() {
            return this.charsetEncoder;
        }

        public OutputSettings escapeMode(Entities.EscapeMode escapeMode) {
            this.escapeMode = escapeMode;
            return this;
        }

        public Entities.EscapeMode escapeMode() {
            return this.escapeMode;
        }

        public int indentAmount() {
            return this.indentAmount;
        }

        public OutputSettings indentAmount(int i10) {
            Validate.isTrue(i10 >= 0);
            this.indentAmount = i10;
            return this;
        }

        public OutputSettings outline(boolean z10) {
            this.outline = z10;
            return this;
        }

        public boolean outline() {
            return this.outline;
        }

        public OutputSettings prettyPrint(boolean z10) {
            this.prettyPrint = z10;
            return this;
        }

        public boolean prettyPrint() {
            return this.prettyPrint;
        }

        public Syntax syntax() {
            return this.syntax;
        }

        public OutputSettings syntax(Syntax syntax) {
            this.syntax = syntax;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Document$QuirksMode.class */
    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public Document(String str) {
        super(Tag.valueOf("#root"), str);
        this.outputSettings = new OutputSettings();
        this.quirksMode = QuirksMode.noQuirks;
        this.updateMetaCharset = false;
        this.location = str;
    }

    public static Document createShell(String str) {
        Validate.notNull(str);
        Document document = new Document(str);
        Element appendElement = document.appendElement("html");
        appendElement.appendElement("head");
        appendElement.appendElement("body");
        return document;
    }

    private void ensureMetaCharsetElement() {
        XmlDeclaration xmlDeclaration;
        if (this.updateMetaCharset) {
            OutputSettings.Syntax syntax = outputSettings().syntax();
            if (syntax == OutputSettings.Syntax.html) {
                Element first = select("meta[charset]").first();
                if (first == null) {
                    Element head = head();
                    if (head != null) {
                        first = head.appendElement("meta");
                    }
                    select("meta[name=charset]").remove();
                    return;
                }
                first.attr("charset", charset().displayName());
                select("meta[name=charset]").remove();
                return;
            }
            if (syntax == OutputSettings.Syntax.xml) {
                Node node = childNodes().get(0);
                if (node instanceof XmlDeclaration) {
                    XmlDeclaration xmlDeclaration2 = (XmlDeclaration) node;
                    if (xmlDeclaration2.attr(XmlDeclaration.DECL_KEY).equals("xml")) {
                        xmlDeclaration2.attr("encoding", charset().displayName());
                        if (xmlDeclaration2.attr(ClientCookie.VERSION_ATTR) != null) {
                            xmlDeclaration2.attr(ClientCookie.VERSION_ATTR, BuildConfig.VERSION_NAME);
                            return;
                        }
                        return;
                    }
                    xmlDeclaration = new XmlDeclaration("xml", this.baseUri, false);
                } else {
                    xmlDeclaration = new XmlDeclaration("xml", this.baseUri, false);
                }
                xmlDeclaration.attr(ClientCookie.VERSION_ATTR, BuildConfig.VERSION_NAME);
                xmlDeclaration.attr("encoding", charset().displayName());
                prependChild(xmlDeclaration);
            }
        }
    }

    private Element findFirstElementByTagName(String str, Node node) {
        if (node.nodeName().equals(str)) {
            return (Element) node;
        }
        Iterator<Node> it = node.childNodes.iterator();
        while (it.hasNext()) {
            Element findFirstElementByTagName = findFirstElementByTagName(str, it.next());
            if (findFirstElementByTagName != null) {
                return findFirstElementByTagName;
            }
        }
        return null;
    }

    private void normaliseStructure(String str, Element element) {
        Elements elementsByTag = getElementsByTag(str);
        Element first = elementsByTag.first();
        if (elementsByTag.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 1; i10 < elementsByTag.size(); i10++) {
                Element element2 = elementsByTag.get(i10);
                Iterator<Node> it = element2.childNodes.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                element2.remove();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                first.appendChild((Node) it2.next());
            }
        }
        if (first.parent().equals(element)) {
            return;
        }
        element.appendChild(first);
    }

    private void normaliseTextNodes(Element element) {
        ArrayList arrayList = new ArrayList();
        for (Node node : element.childNodes) {
            if (node instanceof TextNode) {
                TextNode textNode = (TextNode) node;
                if (!textNode.isBlank()) {
                    arrayList.add(textNode);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Node node2 = (Node) arrayList.get(size);
            element.removeChild(node2);
            body().prependChild(new TextNode(" ", ""));
            body().prependChild(node2);
        }
    }

    public Element body() {
        return findFirstElementByTagName("body", this);
    }

    public Charset charset() {
        return this.outputSettings.charset();
    }

    public void charset(Charset charset) {
        updateMetaCharsetElement(true);
        this.outputSettings.charset(charset);
        ensureMetaCharsetElement();
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Document mo45454clone() {
        Document document = (Document) super.mo45454clone();
        document.outputSettings = this.outputSettings.clone();
        return document;
    }

    public Element createElement(String str) {
        return new Element(Tag.valueOf(str), baseUri());
    }

    public Element head() {
        return findFirstElementByTagName("head", this);
    }

    public String location() {
        return this.location;
    }

    @Override // org.jsoup.nodes.Element, org.jsoup.nodes.Node
    public String nodeName() {
        return "#document";
    }

    public Document normalise() {
        Element findFirstElementByTagName = findFirstElementByTagName("html", this);
        Element element = findFirstElementByTagName;
        if (findFirstElementByTagName == null) {
            element = appendElement("html");
        }
        if (head() == null) {
            element.prependElement("head");
        }
        if (body() == null) {
            element.appendElement("body");
        }
        normaliseTextNodes(head());
        normaliseTextNodes(element);
        normaliseTextNodes(this);
        normaliseStructure("head", element);
        normaliseStructure("body", element);
        ensureMetaCharsetElement();
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public String outerHtml() {
        return super.html();
    }

    public OutputSettings outputSettings() {
        return this.outputSettings;
    }

    public Document outputSettings(OutputSettings outputSettings) {
        Validate.notNull(outputSettings);
        this.outputSettings = outputSettings;
        return this;
    }

    public QuirksMode quirksMode() {
        return this.quirksMode;
    }

    public Document quirksMode(QuirksMode quirksMode) {
        this.quirksMode = quirksMode;
        return this;
    }

    @Override // org.jsoup.nodes.Element
    public Element text(String str) {
        body().text(str);
        return this;
    }

    public String title() {
        Element first = getElementsByTag(ChartFactory.TITLE).first();
        return first != null ? StringUtil.normaliseWhitespace(first.text()).trim() : "";
    }

    public void title(String str) {
        Validate.notNull(str);
        Element first = getElementsByTag(ChartFactory.TITLE).first();
        if (first == null) {
            head().appendElement(ChartFactory.TITLE).text(str);
        } else {
            first.text(str);
        }
    }

    public void updateMetaCharsetElement(boolean z10) {
        this.updateMetaCharset = z10;
    }

    public boolean updateMetaCharsetElement() {
        return this.updateMetaCharset;
    }
}
