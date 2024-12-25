package org.jsoup.parser;

import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/XmlTreeBuilder.class */
public class XmlTreeBuilder extends TreeBuilder {

    /* renamed from: org.jsoup.parser.XmlTreeBuilder$1 */
    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/XmlTreeBuilder$1.class */
    public static /* synthetic */ class C71751 {
        public static final int[] $SwitchMap$org$jsoup$parser$Token$TokenType;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x005d
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                org.jsoup.parser.Token$TokenType[] r0 = org.jsoup.parser.Token.TokenType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                org.jsoup.parser.XmlTreeBuilder.C71751.$SwitchMap$org$jsoup$parser$Token$TokenType = r0
                r0 = r4
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.StartTag     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L14:
                int[] r0 = org.jsoup.parser.XmlTreeBuilder.C71751.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EndTag     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L1f:
                int[] r0 = org.jsoup.parser.XmlTreeBuilder.C71751.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L51 java.lang.NoSuchFieldError -> L55
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Comment     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L2a:
                int[] r0 = org.jsoup.parser.XmlTreeBuilder.C71751.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Character     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L35:
                int[] r0 = org.jsoup.parser.XmlTreeBuilder.C71751.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Doctype     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L40:
                int[] r0 = org.jsoup.parser.XmlTreeBuilder.C71751.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EOF     // Catch: java.lang.NoSuchFieldError -> L61
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L61
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L61
            L4c:
                return
            L4d:
                r4 = move-exception
                goto L14
            L51:
                r4 = move-exception
                goto L1f
            L55:
                r4 = move-exception
                goto L2a
            L59:
                r4 = move-exception
                goto L35
            L5d:
                r4 = move-exception
                goto L40
            L61:
                r4 = move-exception
                goto L4c
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.XmlTreeBuilder.C71751.m45472clinit():void");
        }
    }

    private void insertNode(Node node) {
        currentElement().appendChild(node);
    }

    private void popStackToClose(Token.EndTag endTag) {
        Element element;
        String name = endTag.name();
        int size = this.stack.size() - 1;
        while (true) {
            if (size < 0) {
                element = null;
                break;
            }
            element = this.stack.get(size);
            if (element.nodeName().equals(name)) {
                break;
            } else {
                size--;
            }
        }
        if (element == null) {
            return;
        }
        for (int size2 = this.stack.size() - 1; size2 >= 0; size2--) {
            Element element2 = this.stack.get(size2);
            this.stack.remove(size2);
            if (element2 == element) {
                return;
            }
        }
    }

    @Override // org.jsoup.parser.TreeBuilder
    public void initialiseParse(String str, String str2, ParseErrorList parseErrorList) {
        super.initialiseParse(str, str2, parseErrorList);
        this.stack.add(this.doc);
        this.doc.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
    }

    public Element insert(Token.StartTag startTag) {
        Tag valueOf = Tag.valueOf(startTag.name());
        Element element = new Element(valueOf, this.baseUri, startTag.attributes);
        insertNode(element);
        if (startTag.isSelfClosing()) {
            this.tokeniser.acknowledgeSelfClosingFlag();
            if (!valueOf.isKnownTag()) {
                valueOf.setSelfClosing();
            }
        } else {
            this.stack.add(element);
        }
        return element;
    }

    public void insert(Token.Character character) {
        insertNode(new TextNode(character.getData(), this.baseUri));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0.startsWith("?") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void insert(org.jsoup.parser.Token.Comment r8) {
        /*
            r7 = this;
            org.jsoup.nodes.Comment r0 = new org.jsoup.nodes.Comment
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getData()
            r3 = r7
            java.lang.String r3 = r3.baseUri
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r8
            boolean r0 = r0.bogus
            if (r0 == 0) goto L53
            r0 = r10
            java.lang.String r0 = r0.getData()
            r8 = r0
            r0 = r10
            r9 = r0
            r0 = r8
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto L53
            r0 = r8
            java.lang.String r1 = "!"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L3c
            r0 = r10
            r9 = r0
            r0 = r8
            java.lang.String r1 = "?"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L53
        L3c:
            org.jsoup.nodes.XmlDeclaration r0 = new org.jsoup.nodes.XmlDeclaration
            r1 = r0
            r2 = r8
            r3 = 1
            java.lang.String r2 = r2.substring(r3)
            r3 = r10
            java.lang.String r3 = r3.baseUri()
            r4 = r8
            java.lang.String r5 = "!"
            boolean r4 = r4.startsWith(r5)
            r1.<init>(r2, r3, r4)
            r9 = r0
        L53:
            r0 = r7
            r1 = r9
            r0.insertNode(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.XmlTreeBuilder.insert(org.jsoup.parser.Token$Comment):void");
    }

    public void insert(Token.Doctype doctype) {
        insertNode(new DocumentType(doctype.getName(), doctype.getPublicIdentifier(), doctype.getSystemIdentifier(), this.baseUri));
    }

    public List<Node> parseFragment(String str, String str2, ParseErrorList parseErrorList) {
        initialiseParse(str, str2, parseErrorList);
        runParser();
        return this.doc.childNodes();
    }

    @Override // org.jsoup.parser.TreeBuilder
    public boolean process(Token token) {
        switch (C71751.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()]) {
            case 1:
                insert(token.asStartTag());
                break;
            case 2:
                popStackToClose(token.asEndTag());
                break;
            case 3:
                insert(token.asComment());
                break;
            case 4:
                insert(token.asCharacter());
                break;
            case 5:
                insert(token.asDoctype());
                break;
            case 6:
                break;
            default:
                Validate.fail("Unexpected token type: " + token.type);
                break;
        }
        return true;
    }

    @Override // org.jsoup.parser.TreeBuilder
    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }
}
