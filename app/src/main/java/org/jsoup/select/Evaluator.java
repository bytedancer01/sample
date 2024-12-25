package org.jsoup.select;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.slf4j.Marker;

/* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator.class */
public abstract class Evaluator {

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AllElements.class */
    public static final class AllElements extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return Marker.ANY_MARKER;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$Attribute.class */
    public static final class Attribute extends Evaluator {
        private String key;

        public Attribute(String str) {
            this.key = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key);
        }

        public String toString() {
            return String.format("[%s]", this.key);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeKeyPair.class */
    public static abstract class AttributeKeyPair extends Evaluator {
        public String key;
        public String value;

        public AttributeKeyPair(String str, String str2) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            this.key = str.trim().toLowerCase();
            String str3 = str2;
            if (str2.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
                str3 = str2;
                if (str2.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR)) {
                    str3 = str2.substring(1, str2.length() - 1);
                }
            }
            this.value = str3.trim().toLowerCase();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeStarting.class */
    public static final class AttributeStarting extends Evaluator {
        private String keyPrefix;

        public AttributeStarting(String str) {
            this.keyPrefix = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Iterator<org.jsoup.nodes.Attribute> it = element2.attributes().asList().iterator();
            while (it.hasNext()) {
                if (it.next().getKey().startsWith(this.keyPrefix)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.keyPrefix);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeWithValue.class */
    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && this.value.equalsIgnoreCase(element2.attr(this.key).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.key, this.value);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeWithValueContaining.class */
    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && element2.attr(this.key).toLowerCase().contains(this.value);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.key, this.value);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeWithValueEnding.class */
    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && element2.attr(this.key).toLowerCase().endsWith(this.value);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.key, this.value);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeWithValueMatching.class */
    public static final class AttributeWithValueMatching extends Evaluator {
        public String key;
        public Pattern pattern;

        public AttributeWithValueMatching(String str, Pattern pattern) {
            this.key = str.trim().toLowerCase();
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && this.pattern.matcher(element2.attr(this.key)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.key, this.pattern.toString());
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeWithValueNot.class */
    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return !this.value.equalsIgnoreCase(element2.attr(this.key));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.key, this.value);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$AttributeWithValueStarting.class */
    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && element2.attr(this.key).toLowerCase().startsWith(this.value);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.key, this.value);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$Class.class */
    public static final class Class extends Evaluator {
        private String className;

        public Class(String str) {
            this.className = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.hasClass(this.className);
        }

        public String toString() {
            return String.format(".%s", this.className);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$ContainsOwnText.class */
    public static final class ContainsOwnText extends Evaluator {
        private String searchText;

        public ContainsOwnText(String str) {
            this.searchText = str.toLowerCase();
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.ownText().toLowerCase().contains(this.searchText);
        }

        public String toString() {
            return String.format(":containsOwn(%s", this.searchText);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$ContainsText.class */
    public static final class ContainsText extends Evaluator {
        private String searchText;

        public ContainsText(String str) {
            this.searchText = str.toLowerCase();
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.text().toLowerCase().contains(this.searchText);
        }

        public String toString() {
            return String.format(":contains(%s", this.searchText);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$CssNthEvaluator.class */
    public static abstract class CssNthEvaluator extends Evaluator {

        /* renamed from: a */
        public final int f36204a;

        /* renamed from: b */
        public final int f36205b;

        public CssNthEvaluator(int i10) {
            this(0, i10);
        }

        public CssNthEvaluator(int i10, int i11) {
            this.f36204a = i10;
            this.f36205b = i11;
        }

        public abstract int calculatePosition(Element element, Element element2);

        public abstract String getPseudoClass();

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            boolean z10 = false;
            if (parent != null) {
                if (parent instanceof Document) {
                    z10 = false;
                } else {
                    int calculatePosition = calculatePosition(element, element2);
                    int i10 = this.f36204a;
                    if (i10 == 0) {
                        boolean z11 = false;
                        if (calculatePosition == this.f36205b) {
                            z11 = true;
                        }
                        return z11;
                    }
                    int i11 = this.f36205b;
                    z10 = false;
                    if ((calculatePosition - i11) * i10 >= 0) {
                        z10 = false;
                        if ((calculatePosition - i11) % i10 == 0) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }

        public String toString() {
            return this.f36204a == 0 ? String.format(":%s(%d)", getPseudoClass(), Integer.valueOf(this.f36205b)) : this.f36205b == 0 ? String.format(":%s(%dn)", getPseudoClass(), Integer.valueOf(this.f36204a)) : String.format(":%s(%dn%+d)", getPseudoClass(), Integer.valueOf(this.f36204a), Integer.valueOf(this.f36205b));
        }
    }

    /* renamed from: org.jsoup.select.Evaluator$Id */
    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$Id.class */
    public static final class C7178Id extends Evaluator {

        /* renamed from: id */
        private String f36206id;

        public C7178Id(String str) {
            this.f36206id = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.f36206id.equals(element2.m32153id());
        }

        public String toString() {
            return String.format("#%s", this.f36206id);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IndexEquals.class */
    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() == this.index;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.index));
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IndexEvaluator.class */
    public static abstract class IndexEvaluator extends Evaluator {
        public int index;

        public IndexEvaluator(int i10) {
            this.index = i10;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IndexGreaterThan.class */
    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() > this.index;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.index));
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IndexLessThan.class */
    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i10) {
            super(i10);
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() < this.index;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.index));
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsEmpty.class */
    public static final class IsEmpty extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            List<Node> childNodes = element2.childNodes();
            for (int i10 = 0; i10 < childNodes.size(); i10++) {
                Node node = childNodes.get(i10);
                if (!(node instanceof Comment) && !(node instanceof XmlDeclaration) && !(node instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsFirstChild.class */
    public static final class IsFirstChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return (parent == null || (parent instanceof Document) || element2.elementSiblingIndex().intValue() != 0) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsFirstOfType.class */
    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":first-of-type";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsLastChild.class */
    public static final class IsLastChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            boolean z10 = true;
            if (parent == null || (parent instanceof Document) || element2.elementSiblingIndex().intValue() != parent.children().size() - 1) {
                z10 = false;
            }
            return z10;
        }

        public String toString() {
            return ":last-child";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsLastOfType.class */
    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String toString() {
            return ":last-of-type";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsNthChild.class */
    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() + 1;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-child";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsNthLastChild.class */
    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            return element2.parent().children().size() - element2.elementSiblingIndex().intValue();
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-last-child";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsNthLastOfType.class */
    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            Elements children = element2.parent().children();
            int intValue = element2.elementSiblingIndex().intValue();
            int i10 = 0;
            while (true) {
                int i11 = i10;
                if (intValue >= children.size()) {
                    return i11;
                }
                int i12 = i11;
                if (children.get(intValue).tag().equals(element2.tag())) {
                    i12 = i11 + 1;
                }
                intValue++;
                i10 = i12;
            }
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-last-of-type";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsNthOfType.class */
    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i10, int i11) {
            super(i10, i11);
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public int calculatePosition(Element element, Element element2) {
            int i10;
            Elements children = element2.parent().children();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i12;
                i10 = i13;
                if (i11 >= children.size()) {
                    break;
                }
                i10 = i13;
                if (children.get(i11).tag().equals(element2.tag())) {
                    i10 = i13 + 1;
                }
                if (children.get(i11) == element2) {
                    break;
                }
                i11++;
                i12 = i10;
            }
            return i10;
        }

        @Override // org.jsoup.select.Evaluator.CssNthEvaluator
        public String getPseudoClass() {
            return "nth-of-type";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsOnlyChild.class */
    public static final class IsOnlyChild extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return (parent == null || (parent instanceof Document) || element2.siblingElements().size() != 0) ? false : true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsOnlyOfType.class */
    public static final class IsOnlyOfType extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            int i10;
            Element parent = element2.parent();
            boolean z10 = false;
            if (parent != null) {
                if (parent instanceof Document) {
                    z10 = false;
                } else {
                    Elements children = parent.children();
                    int i11 = 0;
                    int i12 = 0;
                    while (true) {
                        i10 = i12;
                        if (i11 >= children.size()) {
                            break;
                        }
                        int i13 = i10;
                        if (children.get(i11).tag().equals(element2.tag())) {
                            i13 = i10 + 1;
                        }
                        i11++;
                        i12 = i13;
                    }
                    z10 = false;
                    if (i10 == 1) {
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$IsRoot.class */
    public static final class IsRoot extends Evaluator {
        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            boolean z10 = false;
            Element element3 = element;
            if (element instanceof Document) {
                element3 = element.child(0);
            }
            if (element2 == element3) {
                z10 = true;
            }
            return z10;
        }

        public String toString() {
            return ":root";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$Matches.class */
    public static final class Matches extends Evaluator {
        private Pattern pattern;

        public Matches(Pattern pattern) {
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.pattern.matcher(element2.text()).find();
        }

        public String toString() {
            return String.format(":matches(%s", this.pattern);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$MatchesOwn.class */
    public static final class MatchesOwn extends Evaluator {
        private Pattern pattern;

        public MatchesOwn(Pattern pattern) {
            this.pattern = pattern;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return this.pattern.matcher(element2.ownText()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s", this.pattern);
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/select/Evaluator$Tag.class */
    public static final class Tag extends Evaluator {
        private String tagName;

        public Tag(String str) {
            this.tagName = str;
        }

        @Override // org.jsoup.select.Evaluator
        public boolean matches(Element element, Element element2) {
            return element2.tagName().equals(this.tagName);
        }

        public String toString() {
            return String.format("%s", this.tagName);
        }
    }

    public abstract boolean matches(Element element, Element element2);
}
