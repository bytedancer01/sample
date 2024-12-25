package org.jsoup.nodes;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.Selector;
import org.simpleframework.xml.strategy.Name;

/* loaded from: combined.jar:classes3.jar:org/jsoup/nodes/Element.class */
public class Element extends Node {
    private static final Pattern classSplit = Pattern.compile("\\s+");
    private Tag tag;

    public Element(Tag tag, String str) {
        this(tag, str, new Attributes());
    }

    public Element(Tag tag, String str, Attributes attributes) {
        super(str, attributes);
        Validate.notNull(tag);
        this.tag = tag;
    }

    private static void accumulateParents(Element element, Elements elements) {
        Element parent = element.parent();
        if (parent == null || parent.tagName().equals("#root")) {
            return;
        }
        elements.add(parent);
        accumulateParents(parent, elements);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendNormalisedText(StringBuilder sb2, TextNode textNode) {
        String wholeText = textNode.getWholeText();
        if (preserveWhitespace(textNode.parentNode)) {
            sb2.append(wholeText);
        } else {
            StringUtil.appendNormalisedWhitespace(sb2, wholeText, TextNode.lastCharIsWhitespace(sb2));
        }
    }

    private static void appendWhitespaceIfBr(Element element, StringBuilder sb2) {
        if (!element.tag.getName().equals("br") || TextNode.lastCharIsWhitespace(sb2)) {
            return;
        }
        sb2.append(" ");
    }

    private void html(StringBuilder sb2) {
        Iterator<Node> it = this.childNodes.iterator();
        while (it.hasNext()) {
            it.next().outerHtml(sb2);
        }
    }

    private static <E extends Element> Integer indexInList(Element element, List<E> list) {
        Validate.notNull(element);
        Validate.notNull(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10) == element) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    private void ownText(StringBuilder sb2) {
        for (Node node : this.childNodes) {
            if (node instanceof TextNode) {
                appendNormalisedText(sb2, (TextNode) node);
            } else if (node instanceof Element) {
                appendWhitespaceIfBr((Element) node, sb2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0.parent().tag.preserveWhitespace() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean preserveWhitespace(org.jsoup.nodes.Node r2) {
        /*
            r0 = 0
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r2
            if (r0 == 0) goto L3a
            r0 = r4
            r3 = r0
            r0 = r2
            boolean r0 = r0 instanceof org.jsoup.nodes.Element
            if (r0 == 0) goto L3a
            r0 = r2
            org.jsoup.nodes.Element r0 = (org.jsoup.nodes.Element) r0
            r2 = r0
            r0 = r2
            org.jsoup.parser.Tag r0 = r0.tag
            boolean r0 = r0.preserveWhitespace()
            if (r0 != 0) goto L38
            r0 = r4
            r3 = r0
            r0 = r2
            org.jsoup.nodes.Element r0 = r0.parent()
            if (r0 == 0) goto L3a
            r0 = r4
            r3 = r0
            r0 = r2
            org.jsoup.nodes.Element r0 = r0.parent()
            org.jsoup.parser.Tag r0 = r0.tag
            boolean r0 = r0.preserveWhitespace()
            if (r0 == 0) goto L3a
        L38:
            r0 = 1
            r3 = r0
        L3a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Element.preserveWhitespace(org.jsoup.nodes.Node):boolean");
    }

    public Element addClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.add(str);
        classNames(classNames);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element after(String str) {
        return (Element) super.after(str);
    }

    @Override // org.jsoup.nodes.Node
    public Element after(Node node) {
        return (Element) super.after(node);
    }

    public Element append(String str) {
        Validate.notNull(str);
        List<Node> parseFragment = Parser.parseFragment(str, this, baseUri());
        addChildren((Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
        return this;
    }

    public Element appendChild(Node node) {
        Validate.notNull(node);
        reparentChild(node);
        ensureChildNodes();
        this.childNodes.add(node);
        node.setSiblingIndex(this.childNodes.size() - 1);
        return this;
    }

    public Element appendElement(String str) {
        Element element = new Element(Tag.valueOf(str), baseUri());
        appendChild(element);
        return element;
    }

    public Element appendText(String str) {
        appendChild(new TextNode(str, baseUri()));
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element attr(String str, String str2) {
        super.attr(str, str2);
        return this;
    }

    public Element attr(String str, boolean z10) {
        this.attributes.put(str, z10);
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element before(String str) {
        return (Element) super.before(str);
    }

    @Override // org.jsoup.nodes.Node
    public Element before(Node node) {
        return (Element) super.before(node);
    }

    public Element child(int i10) {
        return children().get(i10);
    }

    public Elements children() {
        ArrayList arrayList = new ArrayList(this.childNodes.size());
        for (Node node : this.childNodes) {
            if (node instanceof Element) {
                arrayList.add((Element) node);
            }
        }
        return new Elements((List<Element>) arrayList);
    }

    public String className() {
        return attr(Name.LABEL).trim();
    }

    public Set<String> classNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(classSplit.split(className())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    public Element classNames(Set<String> set) {
        Validate.notNull(set);
        this.attributes.put(Name.LABEL, StringUtil.join(set, " "));
        return this;
    }

    @Override // org.jsoup.nodes.Node
    /* renamed from: clone */
    public Element mo45454clone() {
        return (Element) super.mo45454clone();
    }

    public String cssSelector() {
        if (m32153id().length() > 0) {
            return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + m32153id();
        }
        StringBuilder sb2 = new StringBuilder(tagName());
        String join = StringUtil.join(classNames(), InstructionFileId.DOT);
        if (join.length() > 0) {
            sb2.append('.');
            sb2.append(join);
        }
        if (parent() == null || (parent() instanceof Document)) {
            return sb2.toString();
        }
        sb2.insert(0, " > ");
        if (parent().select(sb2.toString()).size() > 1) {
            sb2.append(String.format(":nth-child(%d)", Integer.valueOf(elementSiblingIndex().intValue() + 1)));
        }
        return parent().cssSelector() + sb2.toString();
    }

    public String data() {
        String wholeData;
        StringBuilder sb2 = new StringBuilder();
        for (Node node : this.childNodes) {
            if (node instanceof DataNode) {
                wholeData = ((DataNode) node).getWholeData();
            } else if (node instanceof Element) {
                wholeData = ((Element) node).data();
            }
            sb2.append(wholeData);
        }
        return sb2.toString();
    }

    public List<DataNode> dataNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node node : this.childNodes) {
            if (node instanceof DataNode) {
                arrayList.add((DataNode) node);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Map<String, String> dataset() {
        return this.attributes.dataset();
    }

    public Integer elementSiblingIndex() {
        if (parent() == null) {
            return 0;
        }
        return indexInList(this, parent().children());
    }

    public Element empty() {
        this.childNodes.clear();
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return this.tag.equals(((Element) obj).tag);
        }
        return false;
    }

    public Element firstElementSibling() {
        Elements children = parent().children();
        return children.size() > 1 ? children.get(0) : null;
    }

    public Elements getAllElements() {
        return Collector.collect(new Evaluator.AllElements(), this);
    }

    public Element getElementById(String str) {
        Validate.notEmpty(str);
        Elements collect = Collector.collect(new Evaluator.C7178Id(str), this);
        if (collect.size() > 0) {
            return collect.get(0);
        }
        return null;
    }

    public Elements getElementsByAttribute(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Attribute(str.trim().toLowerCase()), this);
    }

    public Elements getElementsByAttributeStarting(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.AttributeStarting(str.trim().toLowerCase()), this);
    }

    public Elements getElementsByAttributeValue(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValue(str, str2), this);
    }

    public Elements getElementsByAttributeValueContaining(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueContaining(str, str2), this);
    }

    public Elements getElementsByAttributeValueEnding(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueEnding(str, str2), this);
    }

    public Elements getElementsByAttributeValueMatching(String str, String str2) {
        try {
            return getElementsByAttributeValueMatching(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e10);
        }
    }

    public Elements getElementsByAttributeValueMatching(String str, Pattern pattern) {
        return Collector.collect(new Evaluator.AttributeWithValueMatching(str, pattern), this);
    }

    public Elements getElementsByAttributeValueNot(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueNot(str, str2), this);
    }

    public Elements getElementsByAttributeValueStarting(String str, String str2) {
        return Collector.collect(new Evaluator.AttributeWithValueStarting(str, str2), this);
    }

    public Elements getElementsByClass(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Class(str), this);
    }

    public Elements getElementsByIndexEquals(int i10) {
        return Collector.collect(new Evaluator.IndexEquals(i10), this);
    }

    public Elements getElementsByIndexGreaterThan(int i10) {
        return Collector.collect(new Evaluator.IndexGreaterThan(i10), this);
    }

    public Elements getElementsByIndexLessThan(int i10) {
        return Collector.collect(new Evaluator.IndexLessThan(i10), this);
    }

    public Elements getElementsByTag(String str) {
        Validate.notEmpty(str);
        return Collector.collect(new Evaluator.Tag(str.toLowerCase().trim()), this);
    }

    public Elements getElementsContainingOwnText(String str) {
        return Collector.collect(new Evaluator.ContainsOwnText(str), this);
    }

    public Elements getElementsContainingText(String str) {
        return Collector.collect(new Evaluator.ContainsText(str), this);
    }

    public Elements getElementsMatchingOwnText(String str) {
        try {
            return getElementsMatchingOwnText(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e10);
        }
    }

    public Elements getElementsMatchingOwnText(Pattern pattern) {
        return Collector.collect(new Evaluator.MatchesOwn(pattern), this);
    }

    public Elements getElementsMatchingText(String str) {
        try {
            return getElementsMatchingText(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e10);
        }
    }

    public Elements getElementsMatchingText(Pattern pattern) {
        return Collector.collect(new Evaluator.Matches(pattern), this);
    }

    public boolean hasClass(String str) {
        String str2 = this.attributes.get(Name.LABEL);
        if (str2.equals("") || str2.length() < str.length()) {
            return false;
        }
        for (String str3 : classSplit.split(str2)) {
            if (str.equalsIgnoreCase(str3)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasText() {
        for (Node node : this.childNodes) {
            if (node instanceof TextNode) {
                if (!((TextNode) node).isBlank()) {
                    return true;
                }
            } else if ((node instanceof Element) && ((Element) node).hasText()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jsoup.nodes.Node
    public int hashCode() {
        int hashCode = super.hashCode();
        Tag tag = this.tag;
        return (hashCode * 31) + (tag != null ? tag.hashCode() : 0);
    }

    public String html() {
        StringBuilder sb2 = new StringBuilder();
        html(sb2);
        boolean prettyPrint = getOutputSettings().prettyPrint();
        String sb3 = sb2.toString();
        String str = sb3;
        if (prettyPrint) {
            str = sb3.trim();
        }
        return str;
    }

    public Element html(String str) {
        empty();
        append(str);
        return this;
    }

    /* renamed from: id */
    public String m32153id() {
        return this.attributes.get(Name.MARK);
    }

    public Element insertChildren(int i10, Collection<? extends Node> collection) {
        Validate.notNull(collection, "Children collection to be inserted must not be null.");
        int childNodeSize = childNodeSize();
        int i11 = i10;
        if (i10 < 0) {
            i11 = i10 + childNodeSize + 1;
        }
        Validate.isTrue(i11 >= 0 && i11 <= childNodeSize, "Insert position out of bounds.");
        ArrayList arrayList = new ArrayList(collection);
        addChildren(i11, (Node[]) arrayList.toArray(new Node[arrayList.size()]));
        return this;
    }

    public boolean isBlock() {
        return this.tag.isBlock();
    }

    public Element lastElementSibling() {
        Elements children = parent().children();
        return children.size() > 1 ? children.get(children.size() - 1) : null;
    }

    public Element nextElementSibling() {
        if (this.parentNode == null) {
            return null;
        }
        Elements children = parent().children();
        Integer indexInList = indexInList(this, children);
        Validate.notNull(indexInList);
        if (children.size() > indexInList.intValue() + 1) {
            return children.get(indexInList.intValue() + 1);
        }
        return null;
    }

    @Override // org.jsoup.nodes.Node
    public String nodeName() {
        return this.tag.getName();
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlHead(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
        String str;
        if (sb2.length() > 0 && outputSettings.prettyPrint() && (this.tag.formatAsBlock() || ((parent() != null && parent().tag().formatAsBlock()) || outputSettings.outline()))) {
            indent(sb2, i10, outputSettings);
        }
        sb2.append("<");
        sb2.append(tagName());
        this.attributes.html(sb2, outputSettings);
        if (!this.childNodes.isEmpty() || !this.tag.isSelfClosing()) {
            str = ">";
        } else {
            if (outputSettings.syntax() == Document.OutputSettings.Syntax.html && this.tag.isEmpty()) {
                sb2.append('>');
                return;
            }
            str = " />";
        }
        sb2.append(str);
    }

    @Override // org.jsoup.nodes.Node
    public void outerHtmlTail(StringBuilder sb2, int i10, Document.OutputSettings outputSettings) {
        if (this.childNodes.isEmpty() && this.tag.isSelfClosing()) {
            return;
        }
        if (outputSettings.prettyPrint() && !this.childNodes.isEmpty() && (this.tag.formatAsBlock() || (outputSettings.outline() && (this.childNodes.size() > 1 || (this.childNodes.size() == 1 && !(this.childNodes.get(0) instanceof TextNode)))))) {
            indent(sb2, i10, outputSettings);
        }
        sb2.append("</");
        sb2.append(tagName());
        sb2.append(">");
    }

    public String ownText() {
        StringBuilder sb2 = new StringBuilder();
        ownText(sb2);
        return sb2.toString().trim();
    }

    @Override // org.jsoup.nodes.Node
    public final Element parent() {
        return (Element) this.parentNode;
    }

    public Elements parents() {
        Elements elements = new Elements();
        accumulateParents(this, elements);
        return elements;
    }

    public Element prepend(String str) {
        Validate.notNull(str);
        List<Node> parseFragment = Parser.parseFragment(str, this, baseUri());
        addChildren(0, (Node[]) parseFragment.toArray(new Node[parseFragment.size()]));
        return this;
    }

    public Element prependChild(Node node) {
        Validate.notNull(node);
        addChildren(0, node);
        return this;
    }

    public Element prependElement(String str) {
        Element element = new Element(Tag.valueOf(str), baseUri());
        prependChild(element);
        return element;
    }

    public Element prependText(String str) {
        prependChild(new TextNode(str, baseUri()));
        return this;
    }

    public Element previousElementSibling() {
        if (this.parentNode == null) {
            return null;
        }
        Elements children = parent().children();
        Integer indexInList = indexInList(this, children);
        Validate.notNull(indexInList);
        if (indexInList.intValue() > 0) {
            return children.get(indexInList.intValue() - 1);
        }
        return null;
    }

    public Element removeClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        classNames.remove(str);
        classNames(classNames);
        return this;
    }

    public Elements select(String str) {
        return Selector.select(str, this);
    }

    public Elements siblingElements() {
        if (this.parentNode == null) {
            return new Elements(0);
        }
        Elements children = parent().children();
        Elements elements = new Elements(children.size() - 1);
        for (Element element : children) {
            if (element != this) {
                elements.add(element);
            }
        }
        return elements;
    }

    public Tag tag() {
        return this.tag;
    }

    public String tagName() {
        return this.tag.getName();
    }

    public Element tagName(String str) {
        Validate.notEmpty(str, "Tag name must not be empty.");
        this.tag = Tag.valueOf(str);
        return this;
    }

    public String text() {
        StringBuilder sb2 = new StringBuilder();
        new NodeTraversor(new NodeVisitor(this, sb2) { // from class: org.jsoup.nodes.Element.1
            public final Element this$0;
            public final StringBuilder val$accum;

            {
                this.this$0 = this;
                this.val$accum = sb2;
            }

            @Override // org.jsoup.select.NodeVisitor
            public void head(Node node, int i10) {
                if (node instanceof TextNode) {
                    Element.appendNormalisedText(this.val$accum, (TextNode) node);
                } else if (node instanceof Element) {
                    Element element = (Element) node;
                    if (this.val$accum.length() > 0) {
                        if ((element.isBlock() || element.tag.getName().equals("br")) && !TextNode.lastCharIsWhitespace(this.val$accum)) {
                            this.val$accum.append(" ");
                        }
                    }
                }
            }

            @Override // org.jsoup.select.NodeVisitor
            public void tail(Node node, int i10) {
            }
        }).traverse(this);
        return sb2.toString().trim();
    }

    public Element text(String str) {
        Validate.notNull(str);
        empty();
        appendChild(new TextNode(str, this.baseUri));
        return this;
    }

    public List<TextNode> textNodes() {
        ArrayList arrayList = new ArrayList();
        for (Node node : this.childNodes) {
            if (node instanceof TextNode) {
                arrayList.add((TextNode) node);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // org.jsoup.nodes.Node
    public String toString() {
        return outerHtml();
    }

    public Element toggleClass(String str) {
        Validate.notNull(str);
        Set<String> classNames = classNames();
        if (classNames.contains(str)) {
            classNames.remove(str);
        } else {
            classNames.add(str);
        }
        classNames(classNames);
        return this;
    }

    public String val() {
        return tagName().equals("textarea") ? text() : attr("value");
    }

    public Element val(String str) {
        if (tagName().equals("textarea")) {
            text(str);
        } else {
            attr("value", str);
        }
        return this;
    }

    @Override // org.jsoup.nodes.Node
    public Element wrap(String str) {
        return (Element) super.wrap(str);
    }
}
