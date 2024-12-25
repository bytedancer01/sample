package org.jsoup.parser;

import com.journeyapps.barcodescanner.C2582b;
import java.util.ArrayList;
import org.achartengine.ChartFactory;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/HtmlTreeBuilderState.class */
enum HtmlTreeBuilderState {
    Initial { // from class: org.jsoup.parser.HtmlTreeBuilderState.1
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (!token.isDoctype()) {
                htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
                return htmlTreeBuilder.process(token);
            }
            Token.Doctype asDoctype = token.asDoctype();
            htmlTreeBuilder.getDocument().appendChild(new DocumentType(asDoctype.getName(), asDoctype.getPublicIdentifier(), asDoctype.getSystemIdentifier(), htmlTreeBuilder.getBaseUri()));
            if (asDoctype.isForceQuirks()) {
                htmlTreeBuilder.getDocument().quirksMode(Document.QuirksMode.quirks);
            }
            htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHtml);
            return true;
        }
    },
    BeforeHtml { // from class: org.jsoup.parser.HtmlTreeBuilderState.2
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.insertStartTag("html");
            htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.isStartTag() && token.asStartTag().name().equals("html")) {
                htmlTreeBuilder.insert(token.asStartTag());
                htmlTreeBuilder.transition(HtmlTreeBuilderState.BeforeHead);
                return true;
            }
            if ((!token.isEndTag() || !StringUtil.m32152in(token.asEndTag().name(), "head", "body", "html", "br")) && token.isEndTag()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            return anythingElse(token, htmlTreeBuilder);
        }
    },
    BeforeHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.3
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().name().equals("html")) {
                return HtmlTreeBuilderState.InBody.process(token, htmlTreeBuilder);
            }
            if (token.isStartTag() && token.asStartTag().name().equals("head")) {
                htmlTreeBuilder.setHeadElement(htmlTreeBuilder.insert(token.asStartTag()));
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (token.isEndTag() && StringUtil.m32152in(token.asEndTag().name(), "head", "body", "html", "br")) {
                htmlTreeBuilder.processStartTag("head");
                return htmlTreeBuilder.process(token);
            }
            if (token.isEndTag()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.processStartTag("head");
            return htmlTreeBuilder.process(token);
        }
    },
    InHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.4
        private boolean anythingElse(Token token, TreeBuilder treeBuilder) {
            treeBuilder.processEndTag("head");
            return treeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState;
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insert(token.asCharacter());
                return true;
            }
            int i10 = C709924.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i10 == 1) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (i10 == 2) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (i10 == 3) {
                Token.StartTag asStartTag = token.asStartTag();
                String name = asStartTag.name();
                if (name.equals("html")) {
                    return HtmlTreeBuilderState.InBody.process(token, htmlTreeBuilder);
                }
                if (StringUtil.m32152in(name, "base", "basefont", "bgsound", "command", "link")) {
                    Element insertEmpty = htmlTreeBuilder.insertEmpty(asStartTag);
                    if (!name.equals("base") || !insertEmpty.hasAttr("href")) {
                        return true;
                    }
                    htmlTreeBuilder.maybeSetBaseUri(insertEmpty);
                    return true;
                }
                if (name.equals("meta")) {
                    htmlTreeBuilder.insertEmpty(asStartTag);
                    return true;
                }
                if (name.equals(ChartFactory.TITLE)) {
                    HtmlTreeBuilderState.handleRcData(asStartTag, htmlTreeBuilder);
                    return true;
                }
                if (StringUtil.m32152in(name, "noframes", "style")) {
                    HtmlTreeBuilderState.handleRawtext(asStartTag, htmlTreeBuilder);
                    return true;
                }
                if (!name.equals("noscript")) {
                    if (!name.equals("script")) {
                        if (!name.equals("head")) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilder.tokeniser.transition(TokeniserState.ScriptData);
                    htmlTreeBuilder.markInsertionMode();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.Text);
                    htmlTreeBuilder.insert(asStartTag);
                    return true;
                }
                htmlTreeBuilder.insert(asStartTag);
                htmlTreeBuilderState = HtmlTreeBuilderState.InHeadNoscript;
            } else {
                if (i10 != 4) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                String name2 = token.asEndTag().name();
                if (!name2.equals("head")) {
                    if (StringUtil.m32152in(name2, "body", "html", "br")) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.pop();
                htmlTreeBuilderState = HtmlTreeBuilderState.AfterHead;
            }
            htmlTreeBuilder.transition(htmlTreeBuilderState);
            return true;
        }
    },
    InHeadNoscript { // from class: org.jsoup.parser.HtmlTreeBuilderState.5
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.insert(new Token.Character().data(token.toString()));
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return true;
            }
            if (token.isStartTag() && token.asStartTag().name().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEndTag() && token.asEndTag().name().equals("noscript")) {
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InHead);
                return true;
            }
            if (HtmlTreeBuilderState.isWhitespace(token) || token.isComment() || (token.isStartTag() && StringUtil.m32152in(token.asStartTag().name(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
            }
            if (token.isEndTag() && token.asEndTag().name().equals("br")) {
                return anythingElse(token, htmlTreeBuilder);
            }
            if ((!token.isStartTag() || !StringUtil.m32152in(token.asStartTag().name(), "head", "noscript")) && !token.isEndTag()) {
                return anythingElse(token, htmlTreeBuilder);
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    AfterHead { // from class: org.jsoup.parser.HtmlTreeBuilderState.6
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.processStartTag("body");
            htmlTreeBuilder.framesetOk(true);
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState;
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insert(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return true;
            }
            if (token.isStartTag()) {
                Token.StartTag asStartTag = token.asStartTag();
                String name = asStartTag.name();
                if (name.equals("html")) {
                    return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                }
                if (name.equals("body")) {
                    htmlTreeBuilder.insert(asStartTag);
                    htmlTreeBuilder.framesetOk(false);
                    htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
                } else if (name.equals("frameset")) {
                    htmlTreeBuilder.insert(asStartTag);
                    htmlTreeBuilderState = HtmlTreeBuilderState.InFrameset;
                } else {
                    if (StringUtil.m32152in(name, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", ChartFactory.TITLE)) {
                        htmlTreeBuilder.error(this);
                        Element headElement = htmlTreeBuilder.getHeadElement();
                        htmlTreeBuilder.push(headElement);
                        htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                        htmlTreeBuilder.removeFromStack(headElement);
                        return true;
                    }
                    if (name.equals("head")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                }
                htmlTreeBuilder.transition(htmlTreeBuilderState);
                return true;
            }
            if (token.isEndTag() && !StringUtil.m32152in(token.asEndTag().name(), "body", "html")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            anythingElse(token, htmlTreeBuilder);
            return true;
        }
    },
    InBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.7
        public boolean anyOtherEndTag(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            String name = token.asEndTag().name();
            ArrayList<Element> stack = htmlTreeBuilder.getStack();
            for (int size = stack.size() - 1; size >= 0; size--) {
                Element element = stack.get(size);
                if (element.nodeName().equals(name)) {
                    htmlTreeBuilder.generateImpliedEndTags(name);
                    if (!name.equals(htmlTreeBuilder.currentElement().nodeName())) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(name);
                    return true;
                }
                if (htmlTreeBuilder.isSpecial(element)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:120:0x02d0, code lost:
        
            if (r7.currentElement().nodeName().equals(r0) == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x02d3, code lost:
        
            r7.error(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x02d8, code lost:
        
            r7.popStackToClose(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x031e, code lost:
        
            if (r7.currentElement().nodeName().equals(r0) == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x03e9, code lost:
        
            if (r7.currentElement().nodeName().equals(r0) == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:180:0x041c, code lost:
        
            if (r7.currentElement().nodeName().equals(r0) == false) goto L102;
         */
        /* JADX WARN: Code restructure failed: missing block: B:233:0x0566, code lost:
        
            if (r7.inButtonScope("p") != false) goto L212;
         */
        /* JADX WARN: Code restructure failed: missing block: B:234:0x0569, code lost:
        
            r7.processEndTag("p");
         */
        /* JADX WARN: Code restructure failed: missing block: B:253:0x05f3, code lost:
        
            if (r7.inButtonScope("p") != false) goto L212;
         */
        /* JADX WARN: Code restructure failed: missing block: B:360:0x085d, code lost:
        
            if (r7.inButtonScope("p") != false) goto L212;
         */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean process(org.jsoup.parser.Token r6, org.jsoup.parser.HtmlTreeBuilder r7) {
            /*
                Method dump skipped, instructions count: 3162
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C71047.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    Text { // from class: org.jsoup.parser.HtmlTreeBuilderState.8
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isCharacter()) {
                htmlTreeBuilder.insert(token.asCharacter());
                return true;
            }
            if (token.isEOF()) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
                return htmlTreeBuilder.process(token);
            }
            if (!token.isEndTag()) {
                return true;
            }
            htmlTreeBuilder.pop();
            htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
            return true;
        }
    },
    InTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.9
        public boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            boolean process;
            htmlTreeBuilder.error(this);
            if (StringUtil.m32152in(htmlTreeBuilder.currentElement().nodeName(), "table", "tbody", "tfoot", "thead", "tr")) {
                htmlTreeBuilder.setFosterInserts(true);
                process = htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                htmlTreeBuilder.setFosterInserts(false);
            } else {
                process = htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            return process;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState;
            if (token.isCharacter()) {
                htmlTreeBuilder.newPendingTableCharacters();
                htmlTreeBuilder.markInsertionMode();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableText);
                return htmlTreeBuilder.process(token);
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (!token.isStartTag()) {
                if (!token.isEndTag()) {
                    if (!token.isEOF()) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    if (!htmlTreeBuilder.currentElement().nodeName().equals("html")) {
                        return true;
                    }
                    htmlTreeBuilder.error(this);
                    return true;
                }
                String name = token.asEndTag().name();
                if (!name.equals("table")) {
                    if (!StringUtil.m32152in(name, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (!htmlTreeBuilder.inTableScope(name)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.popStackToClose("table");
                htmlTreeBuilder.resetInsertionMode();
                return true;
            }
            Token.StartTag asStartTag = token.asStartTag();
            String name2 = asStartTag.name();
            if (name2.equals("caption")) {
                htmlTreeBuilder.clearStackToTableContext();
                htmlTreeBuilder.insertMarkerToFormattingElements();
                htmlTreeBuilder.insert(asStartTag);
                htmlTreeBuilderState = HtmlTreeBuilderState.InCaption;
            } else if (name2.equals("colgroup")) {
                htmlTreeBuilder.clearStackToTableContext();
                htmlTreeBuilder.insert(asStartTag);
                htmlTreeBuilderState = HtmlTreeBuilderState.InColumnGroup;
            } else {
                if (name2.equals("col")) {
                    htmlTreeBuilder.processStartTag("colgroup");
                    return htmlTreeBuilder.process(token);
                }
                if (!StringUtil.m32152in(name2, "tbody", "tfoot", "thead")) {
                    if (StringUtil.m32152in(name2, "td", "th", "tr")) {
                        htmlTreeBuilder.processStartTag("tbody");
                        return htmlTreeBuilder.process(token);
                    }
                    if (name2.equals("table")) {
                        htmlTreeBuilder.error(this);
                        if (htmlTreeBuilder.processEndTag("table")) {
                            return htmlTreeBuilder.process(token);
                        }
                        return true;
                    }
                    if (StringUtil.m32152in(name2, "style", "script")) {
                        return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
                    }
                    if (name2.equals("input")) {
                        if (!asStartTag.attributes.get("type").equalsIgnoreCase("hidden")) {
                            return anythingElse(token, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.insertEmpty(asStartTag);
                        return true;
                    }
                    if (!name2.equals("form")) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.error(this);
                    if (htmlTreeBuilder.getFormElement() != null) {
                        return false;
                    }
                    htmlTreeBuilder.insertForm(asStartTag, false);
                    return true;
                }
                htmlTreeBuilder.clearStackToTableContext();
                htmlTreeBuilder.insert(asStartTag);
                htmlTreeBuilderState = HtmlTreeBuilderState.InTableBody;
            }
            htmlTreeBuilder.transition(htmlTreeBuilderState);
            return true;
        }
    },
    InTableText { // from class: org.jsoup.parser.HtmlTreeBuilderState.10
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (C709924.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()] == 5) {
                Token.Character asCharacter = token.asCharacter();
                if (asCharacter.getData().equals(HtmlTreeBuilderState.nullString)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.getPendingTableCharacters().add(asCharacter.getData());
                return true;
            }
            if (htmlTreeBuilder.getPendingTableCharacters().size() > 0) {
                for (String str : htmlTreeBuilder.getPendingTableCharacters()) {
                    if (HtmlTreeBuilderState.isWhitespace(str)) {
                        htmlTreeBuilder.insert(new Token.Character().data(str));
                    } else {
                        htmlTreeBuilder.error(this);
                        if (StringUtil.m32152in(htmlTreeBuilder.currentElement().nodeName(), "table", "tbody", "tfoot", "thead", "tr")) {
                            htmlTreeBuilder.setFosterInserts(true);
                            htmlTreeBuilder.process(new Token.Character().data(str), HtmlTreeBuilderState.InBody);
                            htmlTreeBuilder.setFosterInserts(false);
                        } else {
                            htmlTreeBuilder.process(new Token.Character().data(str), HtmlTreeBuilderState.InBody);
                        }
                    }
                }
                htmlTreeBuilder.newPendingTableCharacters();
            }
            htmlTreeBuilder.transition(htmlTreeBuilder.originalState());
            return htmlTreeBuilder.process(token);
        }
    },
    InCaption { // from class: org.jsoup.parser.HtmlTreeBuilderState.11
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isEndTag() && token.asEndTag().name().equals("caption")) {
                if (!htmlTreeBuilder.inTableScope(token.asEndTag().name())) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.generateImpliedEndTags();
                if (!htmlTreeBuilder.currentElement().nodeName().equals("caption")) {
                    htmlTreeBuilder.error(this);
                }
                htmlTreeBuilder.popStackToClose("caption");
                htmlTreeBuilder.clearFormattingElementsToLastMarker();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
                return true;
            }
            if ((token.isStartTag() && StringUtil.m32152in(token.asStartTag().name(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (token.isEndTag() && token.asEndTag().name().equals("table"))) {
                htmlTreeBuilder.error(this);
                if (htmlTreeBuilder.processEndTag("caption")) {
                    return htmlTreeBuilder.process(token);
                }
                return true;
            }
            if (!token.isEndTag() || !StringUtil.m32152in(token.asEndTag().name(), "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    InColumnGroup { // from class: org.jsoup.parser.HtmlTreeBuilderState.12
        private boolean anythingElse(Token token, TreeBuilder treeBuilder) {
            if (treeBuilder.processEndTag("colgroup")) {
                return treeBuilder.process(token);
            }
            return true;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insert(token.asCharacter());
                return true;
            }
            int i10 = C709924.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i10 == 1) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (i10 == 2) {
                htmlTreeBuilder.error(this);
                return true;
            }
            if (i10 == 3) {
                Token.StartTag asStartTag = token.asStartTag();
                String name = asStartTag.name();
                if (name.equals("html")) {
                    return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
                }
                if (!name.equals("col")) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.insertEmpty(asStartTag);
                return true;
            }
            if (i10 != 4) {
                if (i10 == 6 && htmlTreeBuilder.currentElement().nodeName().equals("html")) {
                    return true;
                }
                return anythingElse(token, htmlTreeBuilder);
            }
            if (!token.asEndTag().name().equals("colgroup")) {
                return anythingElse(token, htmlTreeBuilder);
            }
            if (htmlTreeBuilder.currentElement().nodeName().equals("html")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.pop();
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InTable);
            return true;
        }
    },
    InTableBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.13
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTable);
        }

        private boolean exitTableBody(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.inTableScope("tbody") && !htmlTreeBuilder.inTableScope("thead") && !htmlTreeBuilder.inScope("tfoot")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.clearStackToTableBodyContext();
            htmlTreeBuilder.processEndTag(htmlTreeBuilder.currentElement().nodeName());
            return htmlTreeBuilder.process(token);
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState;
            int i10 = C709924.$SwitchMap$org$jsoup$parser$Token$TokenType[token.type.ordinal()];
            if (i10 == 3) {
                Token.StartTag asStartTag = token.asStartTag();
                String name = asStartTag.name();
                if (!name.equals("tr")) {
                    if (!StringUtil.m32152in(name, "th", "td")) {
                        return StringUtil.m32152in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead") ? exitTableBody(token, htmlTreeBuilder) : anythingElse(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.error(this);
                    htmlTreeBuilder.processStartTag("tr");
                    return htmlTreeBuilder.process(asStartTag);
                }
                htmlTreeBuilder.clearStackToTableBodyContext();
                htmlTreeBuilder.insert(asStartTag);
                htmlTreeBuilderState = HtmlTreeBuilderState.InRow;
            } else {
                if (i10 != 4) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                String name2 = token.asEndTag().name();
                if (!StringUtil.m32152in(name2, "tbody", "tfoot", "thead")) {
                    if (name2.equals("table")) {
                        return exitTableBody(token, htmlTreeBuilder);
                    }
                    if (!StringUtil.m32152in(name2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                        return anythingElse(token, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (!htmlTreeBuilder.inTableScope(name2)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.clearStackToTableBodyContext();
                htmlTreeBuilder.pop();
                htmlTreeBuilderState = HtmlTreeBuilderState.InTable;
            }
            htmlTreeBuilder.transition(htmlTreeBuilderState);
            return true;
        }
    },
    InRow { // from class: org.jsoup.parser.HtmlTreeBuilderState.14
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InTable);
        }

        private boolean handleMissingTr(Token token, TreeBuilder treeBuilder) {
            if (treeBuilder.processEndTag("tr")) {
                return treeBuilder.process(token);
            }
            return false;
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isStartTag()) {
                Token.StartTag asStartTag = token.asStartTag();
                String name = asStartTag.name();
                if (!StringUtil.m32152in(name, "th", "td")) {
                    return StringUtil.m32152in(name, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr") ? handleMissingTr(token, htmlTreeBuilder) : anythingElse(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.clearStackToTableRowContext();
                htmlTreeBuilder.insert(asStartTag);
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InCell);
                htmlTreeBuilder.insertMarkerToFormattingElements();
                return true;
            }
            if (!token.isEndTag()) {
                return anythingElse(token, htmlTreeBuilder);
            }
            String name2 = token.asEndTag().name();
            if (name2.equals("tr")) {
                if (!htmlTreeBuilder.inTableScope(name2)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.clearStackToTableRowContext();
                htmlTreeBuilder.pop();
                htmlTreeBuilder.transition(HtmlTreeBuilderState.InTableBody);
                return true;
            }
            if (name2.equals("table")) {
                return handleMissingTr(token, htmlTreeBuilder);
            }
            if (!StringUtil.m32152in(name2, "tbody", "tfoot", "thead")) {
                if (!StringUtil.m32152in(name2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                htmlTreeBuilder.error(this);
                return false;
            }
            if (htmlTreeBuilder.inTableScope(name2)) {
                htmlTreeBuilder.processEndTag("tr");
                return htmlTreeBuilder.process(token);
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    InCell { // from class: org.jsoup.parser.HtmlTreeBuilderState.15
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
        }

        private void closeCell(HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.processEndTag(htmlTreeBuilder.inTableScope("td") ? "td" : "th");
        }

        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isEndTag()) {
                String name = token.asEndTag().name();
                if (StringUtil.m32152in(name, "td", "th")) {
                    if (!htmlTreeBuilder.inTableScope(name)) {
                        htmlTreeBuilder.error(this);
                        htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
                        return false;
                    }
                    htmlTreeBuilder.generateImpliedEndTags();
                    if (!htmlTreeBuilder.currentElement().nodeName().equals(name)) {
                        htmlTreeBuilder.error(this);
                    }
                    htmlTreeBuilder.popStackToClose(name);
                    htmlTreeBuilder.clearFormattingElementsToLastMarker();
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.InRow);
                    return true;
                }
                if (StringUtil.m32152in(name, "body", "caption", "col", "colgroup", "html")) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (!StringUtil.m32152in(name, "table", "tbody", "tfoot", "thead", "tr")) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.inTableScope(name)) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
            } else {
                if (!token.isStartTag() || !StringUtil.m32152in(token.asStartTag().name(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return anythingElse(token, htmlTreeBuilder);
                }
                if (!htmlTreeBuilder.inTableScope("td") && !htmlTreeBuilder.inTableScope("th")) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
            }
            closeCell(htmlTreeBuilder);
            return htmlTreeBuilder.process(token);
        }
    },
    InSelect { // from class: org.jsoup.parser.HtmlTreeBuilderState.16
        private boolean anythingElse(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.error(this);
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
        
            if (r8.currentElement().nodeName().equals("optgroup") != false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00de, code lost:
        
            r8.pop();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
        
            if (r8.currentElement().nodeName().equals("option") != false) goto L30;
         */
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean process(org.jsoup.parser.Token r7, org.jsoup.parser.HtmlTreeBuilder r8) {
            /*
                Method dump skipped, instructions count: 503
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C709016.process(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }
    },
    InSelectInTable { // from class: org.jsoup.parser.HtmlTreeBuilderState.17
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isStartTag() && StringUtil.m32152in(token.asStartTag().name(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                htmlTreeBuilder.error(this);
                htmlTreeBuilder.processEndTag("select");
                return htmlTreeBuilder.process(token);
            }
            if (!token.isEndTag() || !StringUtil.m32152in(token.asEndTag().name(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InSelect);
            }
            htmlTreeBuilder.error(this);
            if (!htmlTreeBuilder.inTableScope(token.asEndTag().name())) {
                return false;
            }
            htmlTreeBuilder.processEndTag("select");
            return htmlTreeBuilder.process(token);
        }
    },
    AfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.18
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().name().equals("html")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEndTag() && token.asEndTag().name().equals("html")) {
                if (htmlTreeBuilder.isFragmentParsing()) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterAfterBody);
                return true;
            }
            if (token.isEOF()) {
                return true;
            }
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InBody);
            return htmlTreeBuilder.process(token);
        }
    },
    InFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.19
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState;
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insert(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag()) {
                Token.StartTag asStartTag = token.asStartTag();
                String name = asStartTag.name();
                if (name.equals("html")) {
                    htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
                } else {
                    if (name.equals("frameset")) {
                        htmlTreeBuilder.insert(asStartTag);
                        return true;
                    }
                    if (name.equals("frame")) {
                        htmlTreeBuilder.insertEmpty(asStartTag);
                        return true;
                    }
                    if (!name.equals("noframes")) {
                        htmlTreeBuilder.error(this);
                        return false;
                    }
                    htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
                }
                return htmlTreeBuilder.process(asStartTag, htmlTreeBuilderState);
            }
            if (!token.isEndTag() || !token.asEndTag().name().equals("frameset")) {
                if (!token.isEOF()) {
                    htmlTreeBuilder.error(this);
                    return false;
                }
                if (htmlTreeBuilder.currentElement().nodeName().equals("html")) {
                    return true;
                }
                htmlTreeBuilder.error(this);
                return true;
            }
            if (htmlTreeBuilder.currentElement().nodeName().equals("html")) {
                htmlTreeBuilder.error(this);
                return false;
            }
            htmlTreeBuilder.pop();
            if (htmlTreeBuilder.isFragmentParsing() || htmlTreeBuilder.currentElement().nodeName().equals("frameset")) {
                return true;
            }
            htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterFrameset);
            return true;
        }
    },
    AfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.20
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            HtmlTreeBuilderState htmlTreeBuilderState;
            if (HtmlTreeBuilderState.isWhitespace(token)) {
                htmlTreeBuilder.insert(token.asCharacter());
                return true;
            }
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype()) {
                htmlTreeBuilder.error(this);
                return false;
            }
            if (token.isStartTag() && token.asStartTag().name().equals("html")) {
                htmlTreeBuilderState = HtmlTreeBuilderState.InBody;
            } else {
                if (token.isEndTag() && token.asEndTag().name().equals("html")) {
                    htmlTreeBuilder.transition(HtmlTreeBuilderState.AfterAfterFrameset);
                    return true;
                }
                if (!token.isStartTag() || !token.asStartTag().name().equals("noframes")) {
                    if (token.isEOF()) {
                        return true;
                    }
                    htmlTreeBuilder.error(this);
                    return false;
                }
                htmlTreeBuilderState = HtmlTreeBuilderState.InHead;
            }
            return htmlTreeBuilder.process(token, htmlTreeBuilderState);
        }
    },
    AfterAfterBody { // from class: org.jsoup.parser.HtmlTreeBuilderState.21
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype() || HtmlTreeBuilderState.isWhitespace(token) || (token.isStartTag() && token.asStartTag().name().equals("html"))) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEOF()) {
                return true;
            }
            htmlTreeBuilder.error(this);
            htmlTreeBuilder.transition(HtmlTreeBuilderState.InBody);
            return htmlTreeBuilder.process(token);
        }
    },
    AfterAfterFrameset { // from class: org.jsoup.parser.HtmlTreeBuilderState.22
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.isComment()) {
                htmlTreeBuilder.insert(token.asComment());
                return true;
            }
            if (token.isDoctype() || HtmlTreeBuilderState.isWhitespace(token) || (token.isStartTag() && token.asStartTag().name().equals("html"))) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InBody);
            }
            if (token.isEOF()) {
                return true;
            }
            if (token.isStartTag() && token.asStartTag().name().equals("noframes")) {
                return htmlTreeBuilder.process(token, HtmlTreeBuilderState.InHead);
            }
            htmlTreeBuilder.error(this);
            return false;
        }
    },
    ForeignContent { // from class: org.jsoup.parser.HtmlTreeBuilderState.23
        @Override // org.jsoup.parser.HtmlTreeBuilderState
        public boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            return true;
        }
    };

    private static String nullString = String.valueOf((char) 0);

    /* renamed from: org.jsoup.parser.HtmlTreeBuilderState$24 */
    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/HtmlTreeBuilderState$24.class */
    public static /* synthetic */ class C709924 {
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
                org.jsoup.parser.HtmlTreeBuilderState.C709924.$SwitchMap$org$jsoup$parser$Token$TokenType = r0
                r0 = r4
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Comment     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L14:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C709924.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L4d java.lang.NoSuchFieldError -> L51
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Doctype     // Catch: java.lang.NoSuchFieldError -> L51
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L51
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L51
            L1f:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C709924.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L51 java.lang.NoSuchFieldError -> L55
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.StartTag     // Catch: java.lang.NoSuchFieldError -> L55
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L55
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L55
            L2a:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C709924.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L55 java.lang.NoSuchFieldError -> L59
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.EndTag     // Catch: java.lang.NoSuchFieldError -> L59
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L59
            L35:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C709924.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L59 java.lang.NoSuchFieldError -> L5d
                org.jsoup.parser.Token$TokenType r1 = org.jsoup.parser.Token.TokenType.Character     // Catch: java.lang.NoSuchFieldError -> L5d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5d
            L40:
                int[] r0 = org.jsoup.parser.HtmlTreeBuilderState.C709924.$SwitchMap$org$jsoup$parser$Token$TokenType     // Catch: java.lang.NoSuchFieldError -> L5d java.lang.NoSuchFieldError -> L61
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
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.HtmlTreeBuilderState.C709924.m45466clinit():void");
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/HtmlTreeBuilderState$Constants.class */
    public static final class Constants {
        private static final String[] InBodyStartToHead = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", ChartFactory.TITLE};
        private static final String[] InBodyStartPClosers = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        private static final String[] Headings = {"h1", "h2", "h3", "h4", "h5", "h6"};
        private static final String[] InBodyStartPreListing = {"pre", "listing"};
        private static final String[] InBodyStartLiBreakers = {"address", "div", "p"};
        private static final String[] DdDt = {"dd", "dt"};
        private static final String[] Formatters = {C2582b.f15902o, "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
        private static final String[] InBodyStartApplets = {"applet", "marquee", "object"};
        private static final String[] InBodyStartEmptyFormatters = {"area", "br", "embed", "img", "keygen", "wbr"};
        private static final String[] InBodyStartMedia = {"param", "source", "track"};
        private static final String[] InBodyStartInputAttribs = {"name", "action", "prompt"};
        private static final String[] InBodyStartOptions = {"optgroup", "option"};
        private static final String[] InBodyStartRuby = {"rp", "rt"};
        private static final String[] InBodyStartDrop = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        private static final String[] InBodyEndClosers = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        private static final String[] InBodyEndAdoptionFormatters = {"a", C2582b.f15902o, "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
        private static final String[] InBodyEndTableFosters = {"table", "tbody", "tfoot", "thead", "tr"};

        private Constants() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRawtext(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.insert(startTag);
        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rawtext);
        htmlTreeBuilder.markInsertionMode();
        htmlTreeBuilder.transition(Text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleRcData(Token.StartTag startTag, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.insert(startTag);
        htmlTreeBuilder.tokeniser.transition(TokeniserState.Rcdata);
        htmlTreeBuilder.markInsertionMode();
        htmlTreeBuilder.transition(Text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!StringUtil.isWhitespace(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isWhitespace(Token token) {
        if (token.isCharacter()) {
            return isWhitespace(token.asCharacter().getData());
        }
        return false;
    }

    public abstract boolean process(Token token, HtmlTreeBuilder htmlTreeBuilder);
}
