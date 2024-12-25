package org.jsoup.parser;

import java.util.List;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Parser.class */
public class Parser {
    private static final int DEFAULT_MAX_ERRORS = 0;
    private ParseErrorList errors;
    private int maxErrors = 0;
    private TreeBuilder treeBuilder;

    public Parser(TreeBuilder treeBuilder) {
        this.treeBuilder = treeBuilder;
    }

    public static Parser htmlParser() {
        return new Parser(new HtmlTreeBuilder());
    }

    public static Document parse(String str, String str2) {
        return new HtmlTreeBuilder().parse(str, str2, ParseErrorList.noTracking());
    }

    public static Document parseBodyFragment(String str, String str2) {
        Document createShell = Document.createShell(str2);
        Element body = createShell.body();
        List<Node> parseFragment = parseFragment(str, body, str2);
        Node[] nodeArr = (Node[]) parseFragment.toArray(new Node[parseFragment.size()]);
        for (int length = nodeArr.length - 1; length > 0; length--) {
            nodeArr[length].remove();
        }
        for (Node node : nodeArr) {
            body.appendChild(node);
        }
        return createShell;
    }

    public static Document parseBodyFragmentRelaxed(String str, String str2) {
        return parse(str, str2);
    }

    public static List<Node> parseFragment(String str, Element element, String str2) {
        return new HtmlTreeBuilder().parseFragment(str, element, str2, ParseErrorList.noTracking());
    }

    public static List<Node> parseXmlFragment(String str, String str2) {
        return new XmlTreeBuilder().parseFragment(str, str2, ParseErrorList.noTracking());
    }

    public static String unescapeEntities(String str, boolean z10) {
        return new Tokeniser(new CharacterReader(str), ParseErrorList.noTracking()).unescapeEntities(z10);
    }

    public static Parser xmlParser() {
        return new Parser(new XmlTreeBuilder());
    }

    public List<ParseError> getErrors() {
        return this.errors;
    }

    public TreeBuilder getTreeBuilder() {
        return this.treeBuilder;
    }

    public boolean isTrackErrors() {
        return this.maxErrors > 0;
    }

    public Document parseInput(String str, String str2) {
        ParseErrorList tracking = isTrackErrors() ? ParseErrorList.tracking(this.maxErrors) : ParseErrorList.noTracking();
        this.errors = tracking;
        return this.treeBuilder.parse(str, str2, tracking);
    }

    public Parser setTrackErrors(int i10) {
        this.maxErrors = i10;
        return this;
    }

    public Parser setTreeBuilder(TreeBuilder treeBuilder) {
        this.treeBuilder = treeBuilder;
        return this;
    }
}
