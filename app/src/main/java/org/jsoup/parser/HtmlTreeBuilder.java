package org.jsoup.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.ChartFactory;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.jsoup.select.Elements;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/HtmlTreeBuilder.class */
public class HtmlTreeBuilder extends TreeBuilder {
    public static final boolean $assertionsDisabled = false;
    private Element contextElement;
    private FormElement formElement;
    private Element headElement;
    private HtmlTreeBuilderState originalState;
    private HtmlTreeBuilderState state;
    private static final String[] TagsScriptStyle = {"script", "style"};
    public static final String[] TagsSearchInScope = {"applet", "caption", "html", "table", "td", "th", "marquee", "object"};
    private static final String[] TagSearchList = {"ol", "ul"};
    private static final String[] TagSearchButton = {"button"};
    private static final String[] TagSearchTableScope = {"html", "table"};
    private static final String[] TagSearchSelectScope = {"optgroup", "option"};
    private static final String[] TagSearchEndTags = {"dd", "dt", "li", "option", "optgroup", "p", "rp", "rt"};
    private static final String[] TagSearchSpecial = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", ChartFactory.TITLE, "tr", "ul", "wbr", "xmp"};
    private boolean baseUriSetFromDoc = false;
    private ArrayList<Element> formattingElements = new ArrayList<>();
    private List<String> pendingTableCharacters = new ArrayList();
    private Token.EndTag emptyEnd = new Token.EndTag();
    private boolean framesetOk = true;
    private boolean fosterInserts = false;
    private boolean fragmentParsing = false;
    private String[] specificScopeTarget = {null};

    private void clearStackToContext(String... strArr) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element element = this.stack.get(size);
            if (StringUtil.m32152in(element.nodeName(), strArr) || element.nodeName().equals("html")) {
                return;
            }
            this.stack.remove(size);
        }
    }

    private boolean inSpecificScope(String str, String[] strArr, String[] strArr2) {
        String[] strArr3 = this.specificScopeTarget;
        strArr3[0] = str;
        return inSpecificScope(strArr3, strArr, strArr2);
    }

    private boolean inSpecificScope(String[] strArr, String[] strArr2, String[] strArr3) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            String nodeName = this.stack.get(size).nodeName();
            if (StringUtil.m32152in(nodeName, strArr)) {
                return true;
            }
            if (StringUtil.m32152in(nodeName, strArr2)) {
                return false;
            }
            if (strArr3 != null && StringUtil.m32152in(nodeName, strArr3)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void insertNode(org.jsoup.nodes.Node r4) {
        /*
            r3 = this;
            r0 = r3
            java.util.ArrayList<org.jsoup.nodes.Element> r0 = r0.stack
            int r0 = r0.size()
            if (r0 != 0) goto L18
            r0 = r3
            org.jsoup.nodes.Document r0 = r0.doc
            r5 = r0
        Lf:
            r0 = r5
            r1 = r4
            org.jsoup.nodes.Element r0 = r0.appendChild(r1)
            goto L2f
        L18:
            r0 = r3
            boolean r0 = r0.isFosterInserts()
            if (r0 == 0) goto L27
            r0 = r3
            r1 = r4
            r0.insertInFosterParent(r1)
            goto L2f
        L27:
            r0 = r3
            org.jsoup.nodes.Element r0 = r0.currentElement()
            r5 = r0
            goto Lf
        L2f:
            r0 = r4
            boolean r0 = r0 instanceof org.jsoup.nodes.Element
            if (r0 == 0) goto L54
            r0 = r4
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r4 = r0
            r0 = r4
            org.jsoup.parser.Tag r0 = r0.tag()
            boolean r0 = r0.isFormListed()
            if (r0 == 0) goto L54
            r0 = r3
            org.jsoup.nodes.FormElement r0 = r0.formElement
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L54
            r0 = r5
            r1 = r4
            org.jsoup.nodes.FormElement r0 = r0.addElement(r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.insertNode(org.jsoup.nodes.Node):void");
    }

    private boolean isElementInQueue(ArrayList<Element> arrayList, Element element) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == element) {
                return true;
            }
        }
        return false;
    }

    private boolean isSameFormattingElement(Element element, Element element2) {
        return element.nodeName().equals(element2.nodeName()) && element.attributes().equals(element2.attributes());
    }

    private void replaceInQueue(ArrayList<Element> arrayList, Element element, Element element2) {
        int lastIndexOf = arrayList.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        arrayList.set(lastIndexOf, element2);
    }

    public Element aboveOnStack(Element element) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            if (this.stack.get(size) == element) {
                return this.stack.get(size - 1);
            }
        }
        return null;
    }

    public void clearFormattingElementsToLastMarker() {
        while (!this.formattingElements.isEmpty() && removeLastFormattingElement() != null) {
        }
    }

    public void clearStackToTableBodyContext() {
        clearStackToContext("tbody", "tfoot", "thead");
    }

    public void clearStackToTableContext() {
        clearStackToContext("table");
    }

    public void clearStackToTableRowContext() {
        clearStackToContext("tr");
    }

    public void error(HtmlTreeBuilderState htmlTreeBuilderState) {
        if (this.errors.canAddError()) {
            this.errors.add(new ParseError(this.reader.pos(), "Unexpected token [%s] when in state [%s]", this.currentToken.tokenType(), htmlTreeBuilderState));
        }
    }

    public void framesetOk(boolean z10) {
        this.framesetOk = z10;
    }

    public boolean framesetOk() {
        return this.framesetOk;
    }

    public void generateImpliedEndTags() {
        generateImpliedEndTags(null);
    }

    public void generateImpliedEndTags(String str) {
        while (str != null && !currentElement().nodeName().equals(str) && StringUtil.m32152in(currentElement().nodeName(), TagSearchEndTags)) {
            pop();
        }
    }

    public Element getActiveFormattingElement(String str) {
        Element element;
        for (int size = this.formattingElements.size() - 1; size >= 0 && (element = this.formattingElements.get(size)) != null; size--) {
            if (element.nodeName().equals(str)) {
                return element;
            }
        }
        return null;
    }

    public String getBaseUri() {
        return this.baseUri;
    }

    public Document getDocument() {
        return this.doc;
    }

    public FormElement getFormElement() {
        return this.formElement;
    }

    public Element getFromStack(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element element = this.stack.get(size);
            if (element.nodeName().equals(str)) {
                return element;
            }
        }
        return null;
    }

    public Element getHeadElement() {
        return this.headElement;
    }

    public List<String> getPendingTableCharacters() {
        return this.pendingTableCharacters;
    }

    public ArrayList<Element> getStack() {
        return this.stack;
    }

    public boolean inButtonScope(String str) {
        return inScope(str, TagSearchButton);
    }

    public boolean inListItemScope(String str) {
        return inScope(str, TagSearchList);
    }

    public boolean inScope(String str) {
        return inScope(str, null);
    }

    public boolean inScope(String str, String[] strArr) {
        return inSpecificScope(str, TagsSearchInScope, strArr);
    }

    public boolean inScope(String[] strArr) {
        return inSpecificScope(strArr, TagsSearchInScope, (String[]) null);
    }

    public boolean inSelectScope(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            String nodeName = this.stack.get(size).nodeName();
            if (nodeName.equals(str)) {
                return true;
            }
            if (!StringUtil.m32152in(nodeName, TagSearchSelectScope)) {
                return false;
            }
        }
        Validate.fail("Should not be reachable");
        return false;
    }

    public boolean inTableScope(String str) {
        return inSpecificScope(str, TagSearchTableScope, (String[]) null);
    }

    public Element insert(Token.StartTag startTag) {
        if (!startTag.isSelfClosing()) {
            Element element = new Element(Tag.valueOf(startTag.name()), this.baseUri, startTag.attributes);
            insert(element);
            return element;
        }
        Element insertEmpty = insertEmpty(startTag);
        this.stack.add(insertEmpty);
        this.tokeniser.transition(TokeniserState.Data);
        this.tokeniser.emit(this.emptyEnd.reset().name(insertEmpty.tagName()));
        return insertEmpty;
    }

    public void insert(Element element) {
        insertNode(element);
        this.stack.add(element);
    }

    public void insert(Token.Character character) {
        String tagName = currentElement().tagName();
        currentElement().appendChild((tagName.equals("script") || tagName.equals("style")) ? new DataNode(character.getData(), this.baseUri) : new TextNode(character.getData(), this.baseUri));
    }

    public void insert(Token.Comment comment) {
        insertNode(new Comment(comment.getData(), this.baseUri));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r0.isSelfClosing() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.jsoup.nodes.Element insertEmpty(org.jsoup.parser.Token.StartTag r7) {
        /*
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.name()
            org.jsoup.parser.Tag r0 = org.jsoup.parser.Tag.valueOf(r0)
            r8 = r0
            org.jsoup.nodes.Element r0 = new org.jsoup.nodes.Element
            r1 = r0
            r2 = r8
            r3 = r6
            java.lang.String r3 = r3.baseUri
            r4 = r7
            org.jsoup.nodes.Attributes r4 = r4.attributes
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r6
            r1 = r9
            r0.insertNode(r1)
            r0 = r7
            boolean r0 = r0.isSelfClosing()
            if (r0 == 0) goto L42
            r0 = r8
            boolean r0 = r0.isKnownTag()
            if (r0 == 0) goto L36
            r0 = r8
            boolean r0 = r0.isSelfClosing()
            if (r0 == 0) goto L42
            goto L3b
        L36:
            r0 = r8
            org.jsoup.parser.Tag r0 = r0.setSelfClosing()
        L3b:
            r0 = r6
            org.jsoup.parser.Tokeniser r0 = r0.tokeniser
            r0.acknowledgeSelfClosingFlag()
        L42:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilder.insertEmpty(org.jsoup.parser.Token$StartTag):org.jsoup.nodes.Element");
    }

    public FormElement insertForm(Token.StartTag startTag, boolean z10) {
        FormElement formElement = new FormElement(Tag.valueOf(startTag.name()), this.baseUri, startTag.attributes);
        setFormElement(formElement);
        insertNode(formElement);
        if (z10) {
            this.stack.add(formElement);
        }
        return formElement;
    }

    public void insertInFosterParent(Node node) {
        Element element;
        Element fromStack = getFromStack("table");
        boolean z10 = false;
        if (fromStack == null) {
            element = this.stack.get(0);
        } else if (fromStack.parent() != null) {
            element = fromStack.parent();
            z10 = true;
        } else {
            element = aboveOnStack(fromStack);
        }
        if (!z10) {
            element.appendChild(node);
        } else {
            Validate.notNull(fromStack);
            fromStack.before(node);
        }
    }

    public void insertMarkerToFormattingElements() {
        this.formattingElements.add(null);
    }

    public void insertOnStackAfter(Element element, Element element2) {
        int lastIndexOf = this.stack.lastIndexOf(element);
        Validate.isTrue(lastIndexOf != -1);
        this.stack.add(lastIndexOf + 1, element2);
    }

    public Element insertStartTag(String str) {
        Element element = new Element(Tag.valueOf(str), this.baseUri);
        insert(element);
        return element;
    }

    public boolean isFosterInserts() {
        return this.fosterInserts;
    }

    public boolean isFragmentParsing() {
        return this.fragmentParsing;
    }

    public boolean isInActiveFormattingElements(Element element) {
        return isElementInQueue(this.formattingElements, element);
    }

    public boolean isSpecial(Element element) {
        return StringUtil.m32152in(element.nodeName(), TagSearchSpecial);
    }

    public Element lastFormattingElement() {
        Element element;
        if (this.formattingElements.size() > 0) {
            ArrayList<Element> arrayList = this.formattingElements;
            element = arrayList.get(arrayList.size() - 1);
        } else {
            element = null;
        }
        return element;
    }

    public void markInsertionMode() {
        this.originalState = this.state;
    }

    public void maybeSetBaseUri(Element element) {
        if (this.baseUriSetFromDoc) {
            return;
        }
        String absUrl = element.absUrl("href");
        if (absUrl.length() != 0) {
            this.baseUri = absUrl;
            this.baseUriSetFromDoc = true;
            this.doc.setBaseUri(absUrl);
        }
    }

    public void newPendingTableCharacters() {
        this.pendingTableCharacters = new ArrayList();
    }

    public boolean onStack(Element element) {
        return isElementInQueue(this.stack, element);
    }

    public HtmlTreeBuilderState originalState() {
        return this.originalState;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public Document parse(String str, String str2, ParseErrorList parseErrorList) {
        this.state = HtmlTreeBuilderState.Initial;
        this.baseUriSetFromDoc = false;
        return super.parse(str, str2, parseErrorList);
    }

    public List<Node> parseFragment(String str, Element element, String str2, ParseErrorList parseErrorList) {
        Element element2;
        Tokeniser tokeniser;
        TokeniserState tokeniserState;
        this.state = HtmlTreeBuilderState.Initial;
        initialiseParse(str, str2, parseErrorList);
        this.contextElement = element;
        this.fragmentParsing = true;
        if (element != null) {
            if (element.ownerDocument() != null) {
                this.doc.quirksMode(element.ownerDocument().quirksMode());
            }
            String tagName = element.tagName();
            if (StringUtil.m32152in(tagName, ChartFactory.TITLE, "textarea")) {
                tokeniser = this.tokeniser;
                tokeniserState = TokeniserState.Rcdata;
            } else if (StringUtil.m32152in(tagName, "iframe", "noembed", "noframes", "style", "xmp")) {
                tokeniser = this.tokeniser;
                tokeniserState = TokeniserState.Rawtext;
            } else if (tagName.equals("script")) {
                tokeniser = this.tokeniser;
                tokeniserState = TokeniserState.ScriptData;
            } else {
                if (!tagName.equals("noscript")) {
                    tagName.equals("plaintext");
                }
                tokeniser = this.tokeniser;
                tokeniserState = TokeniserState.Data;
            }
            tokeniser.transition(tokeniserState);
            Element element3 = new Element(Tag.valueOf("html"), str2);
            this.doc.appendChild(element3);
            this.stack.add(element3);
            resetInsertionMode();
            Elements parents = element.parents();
            parents.add(0, element);
            Iterator<Element> it = parents.iterator();
            while (true) {
                element2 = element3;
                if (!it.hasNext()) {
                    break;
                }
                Element next = it.next();
                if (next instanceof FormElement) {
                    this.formElement = (FormElement) next;
                    element2 = element3;
                    break;
                }
            }
        } else {
            element2 = null;
        }
        runParser();
        return (element == null || element2 == null) ? this.doc.childNodes() : element2.childNodes();
    }

    public Element pop() {
        return this.stack.remove(this.stack.size() - 1);
    }

    public void popStackToBefore(String str) {
        for (int size = this.stack.size() - 1; size >= 0 && !this.stack.get(size).nodeName().equals(str); size--) {
            this.stack.remove(size);
        }
    }

    public void popStackToClose(String str) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element element = this.stack.get(size);
            this.stack.remove(size);
            if (element.nodeName().equals(str)) {
                return;
            }
        }
    }

    public void popStackToClose(String... strArr) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element element = this.stack.get(size);
            this.stack.remove(size);
            if (StringUtil.m32152in(element.nodeName(), strArr)) {
                return;
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean process(Token token) {
        this.currentToken = token;
        return this.state.process(token, this);
    }

    public boolean process(Token token, HtmlTreeBuilderState htmlTreeBuilderState) {
        this.currentToken = token;
        return htmlTreeBuilderState.process(token, this);
    }

    @Override // org.jsoup.parser.TreeBuilder
    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }

    public void push(Element element) {
        this.stack.add(element);
    }

    public void pushActiveFormattingElements(Element element) {
        Element element2;
        int size = this.formattingElements.size() - 1;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (size < 0 || (element2 = this.formattingElements.get(size)) == null) {
                break;
            }
            int i12 = i11;
            if (isSameFormattingElement(element, element2)) {
                i12 = i11 + 1;
            }
            if (i12 == 3) {
                this.formattingElements.remove(size);
                break;
            } else {
                size--;
                i10 = i12;
            }
        }
        this.formattingElements.add(element);
    }

    public void reconstructFormattingElements() {
        Element lastFormattingElement = lastFormattingElement();
        if (lastFormattingElement == null || onStack(lastFormattingElement)) {
            return;
        }
        boolean z10 = true;
        int size = this.formattingElements.size() - 1;
        int i10 = size;
        while (i10 != 0) {
            int i11 = i10 - 1;
            Element element = this.formattingElements.get(i11);
            lastFormattingElement = element;
            i10 = i11;
            if (element != null) {
                lastFormattingElement = element;
                i10 = i11;
                if (onStack(element)) {
                    i10 = i11;
                    lastFormattingElement = element;
                }
            }
            z10 = false;
        }
        while (true) {
            int i12 = i10;
            if (!z10) {
                i12 = i10 + 1;
                lastFormattingElement = this.formattingElements.get(i12);
            }
            Validate.notNull(lastFormattingElement);
            Element insertStartTag = insertStartTag(lastFormattingElement.nodeName());
            insertStartTag.attributes().addAll(lastFormattingElement.attributes());
            this.formattingElements.set(i12, insertStartTag);
            i10 = i12;
            if (i12 == size) {
                return;
            } else {
                z10 = false;
            }
        }
    }

    public void removeFromActiveFormattingElements(Element element) {
        for (int size = this.formattingElements.size() - 1; size >= 0; size--) {
            if (this.formattingElements.get(size) == element) {
                this.formattingElements.remove(size);
                return;
            }
        }
    }

    public boolean removeFromStack(Element element) {
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            if (this.stack.get(size) == element) {
                this.stack.remove(size);
                return true;
            }
        }
        return false;
    }

    public Element removeLastFormattingElement() {
        int size = this.formattingElements.size();
        if (size > 0) {
            return this.formattingElements.remove(size - 1);
        }
        return null;
    }

    public void replaceActiveFormattingElement(Element element, Element element2) {
        replaceInQueue(this.formattingElements, element, element2);
    }

    public void replaceOnStack(Element element, Element element2) {
        replaceInQueue(this.stack, element, element2);
    }

    public void resetInsertionMode() {
        HtmlTreeBuilderState htmlTreeBuilderState;
        boolean z10 = false;
        for (int size = this.stack.size() - 1; size >= 0; size--) {
            Element element = this.stack.get(size);
            if (size == 0) {
                element = this.contextElement;
                z10 = true;
            }
            String nodeName = element.nodeName();
            if ("select".equals(nodeName)) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InSelect;
            } else if ("td".equals(nodeName) || ("th".equals(nodeName) && !z10)) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InCell;
            } else if ("tr".equals(nodeName)) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InRow;
            } else if ("tbody".equals(nodeName) || "thead".equals(nodeName) || "tfoot".equals(nodeName)) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InTableBody;
            } else if ("caption".equals(nodeName)) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InCaption;
            } else if ("colgroup".equals(nodeName)) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InColumnGroup;
            } else if ("table".equals(nodeName)) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
            } else {
                if (!"head".equals(nodeName) && !"body".equals(nodeName)) {
                    if ("frameset".equals(nodeName)) {
                        htmlTreeBuilderState = HtmlTreeBuilderState.InFrameset;
                    } else if ("html".equals(nodeName)) {
                        htmlTreeBuilderState = HtmlTreeBuilderState.BeforeHead;
                    } else if (!z10) {
                    }
                }
                htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
            }
            transition(htmlTreeBuilderState);
            return;
        }
    }

    public void setFormElement(FormElement formElement) {
        this.formElement = formElement;
    }

    public void setFosterInserts(boolean z10) {
        this.fosterInserts = z10;
    }

    public void setHeadElement(Element element) {
        this.headElement = element;
    }

    public void setPendingTableCharacters(List<String> list) {
        this.pendingTableCharacters = list;
    }

    public HtmlTreeBuilderState state() {
        return this.state;
    }

    public String toString() {
        return "TreeBuilder{currentToken=" + this.currentToken + ", state=" + this.state + ", currentElement=" + currentElement() + '}';
    }

    public void transition(HtmlTreeBuilderState htmlTreeBuilderState) {
        this.state = htmlTreeBuilderState;
    }
}
