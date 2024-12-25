package org.jsoup.select;

import com.amazonaws.services.p045s3.model.InstructionFileId;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.StructuralEvaluator;
import org.slf4j.Marker;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/QueryParser.class */
class QueryParser {
    private List<Evaluator> evals = new ArrayList();
    private String query;

    /* renamed from: tq */
    private TokenQueue f36207tq;
    private static final String[] combinators = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};
    private static final String[] AttributeEvals = {"=", "!=", "^=", "$=", "*=", "~="};
    private static final Pattern NTH_AB = Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", 2);
    private static final Pattern NTH_B = Pattern.compile("(\\+|-)?(\\d+)");

    private QueryParser(String str) {
        this.query = str;
        this.f36207tq = new TokenQueue(str);
    }

    private void allElements() {
        this.evals.add(new Evaluator.AllElements());
    }

    private void byAttribute() {
        List<Evaluator> list;
        Evaluator attributeWithValueMatching;
        List<Evaluator> list2;
        Evaluator attribute;
        TokenQueue tokenQueue = new TokenQueue(this.f36207tq.chompBalanced('[', ']'));
        String consumeToAny = tokenQueue.consumeToAny(AttributeEvals);
        Validate.notEmpty(consumeToAny);
        tokenQueue.consumeWhitespace();
        if (tokenQueue.isEmpty()) {
            if (consumeToAny.startsWith("^")) {
                list2 = this.evals;
                attribute = new Evaluator.AttributeStarting(consumeToAny.substring(1));
            } else {
                list2 = this.evals;
                attribute = new Evaluator.Attribute(consumeToAny);
            }
            list2.add(attribute);
            return;
        }
        if (tokenQueue.matchChomp("=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValue(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("!=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueNot(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("^=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueStarting(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("$=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueEnding(consumeToAny, tokenQueue.remainder());
        } else if (tokenQueue.matchChomp("*=")) {
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueContaining(consumeToAny, tokenQueue.remainder());
        } else {
            if (!tokenQueue.matchChomp("~=")) {
                throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.query, tokenQueue.remainder());
            }
            list = this.evals;
            attributeWithValueMatching = new Evaluator.AttributeWithValueMatching(consumeToAny, Pattern.compile(tokenQueue.remainder()));
        }
        list.add(attributeWithValueMatching);
    }

    private void byClass() {
        String consumeCssIdentifier = this.f36207tq.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.evals.add(new Evaluator.Class(consumeCssIdentifier.trim().toLowerCase()));
    }

    private void byId() {
        String consumeCssIdentifier = this.f36207tq.consumeCssIdentifier();
        Validate.notEmpty(consumeCssIdentifier);
        this.evals.add(new Evaluator.C7178Id(consumeCssIdentifier));
    }

    private void byTag() {
        String consumeElementSelector = this.f36207tq.consumeElementSelector();
        Validate.notEmpty(consumeElementSelector);
        String str = consumeElementSelector;
        if (consumeElementSelector.contains("|")) {
            str = consumeElementSelector.replace("|", ":");
        }
        this.evals.add(new Evaluator.Tag(str.trim().toLowerCase()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Type inference failed for: r0v56, types: [org.jsoup.select.Evaluator] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [org.jsoup.select.CombiningEvaluator$Or] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void combinator(char r10) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.combinator(char):void");
    }

    private int consumeIndex() {
        String trim = this.f36207tq.chompTo(")").trim();
        Validate.isTrue(StringUtil.isNumeric(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private String consumeSubQuery() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        while (!this.f36207tq.isEmpty()) {
            if (this.f36207tq.matches("(")) {
                sb2.append("(");
                sb2.append(this.f36207tq.chompBalanced('(', ')'));
                str = ")";
            } else if (this.f36207tq.matches("[")) {
                sb2.append("[");
                sb2.append(this.f36207tq.chompBalanced('[', ']'));
                str = "]";
            } else {
                if (this.f36207tq.matchesAny(combinators)) {
                    break;
                }
                sb2.append(this.f36207tq.consume());
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    private void contains(boolean z10) {
        List<Evaluator> list;
        Evaluator containsText;
        this.f36207tq.consume(z10 ? ":containsOwn" : ":contains");
        String unescape = TokenQueue.unescape(this.f36207tq.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, ":contains(text) query must not be empty");
        if (z10) {
            list = this.evals;
            containsText = new Evaluator.ContainsOwnText(unescape);
        } else {
            list = this.evals;
            containsText = new Evaluator.ContainsText(unescape);
        }
        list.add(containsText);
    }

    private void cssNthChild(boolean z10, boolean z11) {
        List<Evaluator> list;
        Evaluator isNthChild;
        String lowerCase = this.f36207tq.chompTo(")").trim().toLowerCase();
        Matcher matcher = NTH_AB.matcher(lowerCase);
        Matcher matcher2 = NTH_B.matcher(lowerCase);
        int i10 = 2;
        int i11 = 0;
        if ("odd".equals(lowerCase)) {
            i11 = 1;
        } else if ("even".equals(lowerCase)) {
            i11 = 0;
        } else if (matcher.matches()) {
            i10 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
            if (matcher.group(4) != null) {
                i11 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
            }
        } else {
            if (!matcher2.matches()) {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", lowerCase);
            }
            i11 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
            i10 = 0;
        }
        if (z11) {
            if (z10) {
                list = this.evals;
                isNthChild = new Evaluator.IsNthLastOfType(i10, i11);
            } else {
                list = this.evals;
                isNthChild = new Evaluator.IsNthOfType(i10, i11);
            }
        } else if (z10) {
            list = this.evals;
            isNthChild = new Evaluator.IsNthLastChild(i10, i11);
        } else {
            list = this.evals;
            isNthChild = new Evaluator.IsNthChild(i10, i11);
        }
        list.add(isNthChild);
    }

    private void findElements() {
        List<Evaluator> list;
        Evaluator isRoot;
        if (this.f36207tq.matchChomp(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            byId();
            return;
        }
        if (this.f36207tq.matchChomp(InstructionFileId.DOT)) {
            byClass();
            return;
        }
        if (this.f36207tq.matchesWord()) {
            byTag();
            return;
        }
        if (this.f36207tq.matches("[")) {
            byAttribute();
            return;
        }
        if (this.f36207tq.matchChomp(Marker.ANY_MARKER)) {
            allElements();
            return;
        }
        if (this.f36207tq.matchChomp(":lt(")) {
            indexLessThan();
            return;
        }
        if (this.f36207tq.matchChomp(":gt(")) {
            indexGreaterThan();
            return;
        }
        if (this.f36207tq.matchChomp(":eq(")) {
            indexEquals();
            return;
        }
        if (this.f36207tq.matches(":has(")) {
            has();
            return;
        }
        if (this.f36207tq.matches(":contains(")) {
            contains(false);
            return;
        }
        if (this.f36207tq.matches(":containsOwn(")) {
            contains(true);
            return;
        }
        if (this.f36207tq.matches(":matches(")) {
            matches(false);
            return;
        }
        if (this.f36207tq.matches(":matchesOwn(")) {
            matches(true);
            return;
        }
        if (this.f36207tq.matches(":not(")) {
            not();
            return;
        }
        if (this.f36207tq.matchChomp(":nth-child(")) {
            cssNthChild(false, false);
            return;
        }
        if (this.f36207tq.matchChomp(":nth-last-child(")) {
            cssNthChild(true, false);
            return;
        }
        if (this.f36207tq.matchChomp(":nth-of-type(")) {
            cssNthChild(false, true);
            return;
        }
        if (this.f36207tq.matchChomp(":nth-last-of-type(")) {
            cssNthChild(true, true);
            return;
        }
        if (this.f36207tq.matchChomp(":first-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsFirstChild();
        } else if (this.f36207tq.matchChomp(":last-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsLastChild();
        } else if (this.f36207tq.matchChomp(":first-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsFirstOfType();
        } else if (this.f36207tq.matchChomp(":last-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsLastOfType();
        } else if (this.f36207tq.matchChomp(":only-child")) {
            list = this.evals;
            isRoot = new Evaluator.IsOnlyChild();
        } else if (this.f36207tq.matchChomp(":only-of-type")) {
            list = this.evals;
            isRoot = new Evaluator.IsOnlyOfType();
        } else if (this.f36207tq.matchChomp(":empty")) {
            list = this.evals;
            isRoot = new Evaluator.IsEmpty();
        } else {
            if (!this.f36207tq.matchChomp(":root")) {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.query, this.f36207tq.remainder());
            }
            list = this.evals;
            isRoot = new Evaluator.IsRoot();
        }
        list.add(isRoot);
    }

    private void has() {
        this.f36207tq.consume(":has");
        String chompBalanced = this.f36207tq.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":has(el) subselect must not be empty");
        this.evals.add(new StructuralEvaluator.Has(parse(chompBalanced)));
    }

    private void indexEquals() {
        this.evals.add(new Evaluator.IndexEquals(consumeIndex()));
    }

    private void indexGreaterThan() {
        this.evals.add(new Evaluator.IndexGreaterThan(consumeIndex()));
    }

    private void indexLessThan() {
        this.evals.add(new Evaluator.IndexLessThan(consumeIndex()));
    }

    private void matches(boolean z10) {
        List<Evaluator> list;
        Evaluator matches;
        this.f36207tq.consume(z10 ? ":matchesOwn" : ":matches");
        String chompBalanced = this.f36207tq.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":matches(regex) query must not be empty");
        if (z10) {
            list = this.evals;
            matches = new Evaluator.MatchesOwn(Pattern.compile(chompBalanced));
        } else {
            list = this.evals;
            matches = new Evaluator.Matches(Pattern.compile(chompBalanced));
        }
        list.add(matches);
    }

    private void not() {
        this.f36207tq.consume(":not");
        String chompBalanced = this.f36207tq.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, ":not(selector) subselect must not be empty");
        this.evals.add(new StructuralEvaluator.Not(parse(chompBalanced)));
    }

    public static Evaluator parse(String str) {
        return new QueryParser(str).parse();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        findElements();
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0060 -> B:5:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0056 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.jsoup.select.Evaluator parse() {
        /*
            r4 = this;
            r0 = r4
            org.jsoup.parser.TokenQueue r0 = r0.f36207tq
            boolean r0 = r0.consumeWhitespace()
            r0 = r4
            org.jsoup.parser.TokenQueue r0 = r0.f36207tq
            java.lang.String[] r1 = org.jsoup.select.QueryParser.combinators
            boolean r0 = r0.matchesAny(r1)
            if (r0 == 0) goto L36
            r0 = r4
            java.util.List<org.jsoup.select.Evaluator> r0 = r0.evals
            org.jsoup.select.StructuralEvaluator$Root r1 = new org.jsoup.select.StructuralEvaluator$Root
            r2 = r1
            r2.<init>()
            boolean r0 = r0.add(r1)
        L26:
            r0 = r4
            org.jsoup.parser.TokenQueue r0 = r0.f36207tq
            char r0 = r0.consume()
            r5 = r0
        L2e:
            r0 = r4
            r1 = r5
            r0.combinator(r1)
            goto L3a
        L36:
            r0 = r4
            r0.findElements()
        L3a:
            r0 = r4
            org.jsoup.parser.TokenQueue r0 = r0.f36207tq
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L66
            r0 = r4
            org.jsoup.parser.TokenQueue r0 = r0.f36207tq
            boolean r0 = r0.consumeWhitespace()
            r6 = r0
            r0 = r4
            org.jsoup.parser.TokenQueue r0 = r0.f36207tq
            java.lang.String[] r1 = org.jsoup.select.QueryParser.combinators
            boolean r0 = r0.matchesAny(r1)
            if (r0 == 0) goto L5c
            goto L26
        L5c:
            r0 = r6
            if (r0 == 0) goto L36
            r0 = 32
            r5 = r0
            goto L2e
        L66:
            r0 = r4
            java.util.List<org.jsoup.select.Evaluator> r0 = r0.evals
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L81
            r0 = r4
            java.util.List<org.jsoup.select.Evaluator> r0 = r0.evals
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.jsoup.select.Evaluator r0 = (org.jsoup.select.Evaluator) r0
            return r0
        L81:
            org.jsoup.select.CombiningEvaluator$And r0 = new org.jsoup.select.CombiningEvaluator$And
            r1 = r0
            r2 = r4
            java.util.List<org.jsoup.select.Evaluator> r2 = r2.evals
            r1.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.parse():org.jsoup.select.Evaluator");
    }
}
