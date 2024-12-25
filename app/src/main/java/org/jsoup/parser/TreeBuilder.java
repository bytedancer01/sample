package org.jsoup.parser;

import java.util.ArrayList;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/TreeBuilder.class */
abstract class TreeBuilder {
    public String baseUri;
    public Token currentToken;
    public Document doc;
    public ParseErrorList errors;
    public CharacterReader reader;
    public ArrayList<Element> stack;
    public Tokeniser tokeniser;
    private Token.StartTag start = new Token.StartTag();
    private Token.EndTag end = new Token.EndTag();

    public Element currentElement() {
        int size = this.stack.size();
        return size > 0 ? this.stack.get(size - 1) : null;
    }

    public void initialiseParse(String str, String str2, ParseErrorList parseErrorList) {
        Validate.notNull(str, "String input must not be null");
        Validate.notNull(str2, "BaseURI must not be null");
        this.doc = new Document(str2);
        this.reader = new CharacterReader(str);
        this.errors = parseErrorList;
        this.tokeniser = new Tokeniser(this.reader, parseErrorList);
        this.stack = new ArrayList<>(32);
        this.baseUri = str2;
    }

    public Document parse(String str, String str2) {
        return parse(str, str2, ParseErrorList.noTracking());
    }

    public Document parse(String str, String str2, ParseErrorList parseErrorList) {
        initialiseParse(str, str2, parseErrorList);
        runParser();
        return this.doc;
    }

    public abstract boolean process(Token token);

    public boolean processEndTag(String str) {
        Token token = this.currentToken;
        Token.EndTag endTag = this.end;
        return process((token == endTag ? new Token.EndTag() : endTag.reset()).name(str));
    }

    public boolean processStartTag(String str) {
        Token token = this.currentToken;
        Token.StartTag startTag = this.start;
        return process((token == startTag ? new Token.StartTag() : startTag.reset()).name(str));
    }

    public boolean processStartTag(String str, Attributes attributes) {
        Token.StartTag startTag;
        Token token = this.currentToken;
        Token.StartTag startTag2 = this.start;
        if (token == startTag2) {
            startTag = new Token.StartTag().nameAttr(str, attributes);
        } else {
            startTag2.reset();
            this.start.nameAttr(str, attributes);
            startTag = this.start;
        }
        return process(startTag);
    }

    public void runParser() {
        Token read;
        do {
            read = this.tokeniser.read();
            process(read);
            read.reset();
        } while (read.type != Token.TokenType.EOF);
    }
}
