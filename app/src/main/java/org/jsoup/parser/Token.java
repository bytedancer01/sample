package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.BooleanAttribute;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token.class */
abstract class Token {
    public TokenType type;

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$Character.class */
    public static final class Character extends Token {
        private String data;

        public Character() {
            super();
            this.type = TokenType.Character;
        }

        public Character data(String str) {
            this.data = str;
            return this;
        }

        public String getData() {
            return this.data;
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            this.data = null;
            return this;
        }

        public String toString() {
            return getData();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$Comment.class */
    public static final class Comment extends Token {
        public boolean bogus;
        public final StringBuilder data;

        public Comment() {
            super();
            this.data = new StringBuilder();
            this.bogus = false;
            this.type = TokenType.Comment;
        }

        public String getData() {
            return this.data.toString();
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            Token.reset(this.data);
            this.bogus = false;
            return this;
        }

        public String toString() {
            return "<!--" + getData() + "-->";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$Doctype.class */
    public static final class Doctype extends Token {
        public boolean forceQuirks;
        public final StringBuilder name;
        public final StringBuilder publicIdentifier;
        public final StringBuilder systemIdentifier;

        public Doctype() {
            super();
            this.name = new StringBuilder();
            this.publicIdentifier = new StringBuilder();
            this.systemIdentifier = new StringBuilder();
            this.forceQuirks = false;
            this.type = TokenType.Doctype;
        }

        public String getName() {
            return this.name.toString();
        }

        public String getPublicIdentifier() {
            return this.publicIdentifier.toString();
        }

        public String getSystemIdentifier() {
            return this.systemIdentifier.toString();
        }

        public boolean isForceQuirks() {
            return this.forceQuirks;
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            Token.reset(this.name);
            Token.reset(this.publicIdentifier);
            Token.reset(this.systemIdentifier);
            this.forceQuirks = false;
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$EOF.class */
    public static final class EOF extends Token {
        public EOF() {
            super();
            this.type = TokenType.EOF;
        }

        @Override // org.jsoup.parser.Token
        public Token reset() {
            return this;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$EndTag.class */
    public static final class EndTag extends Tag {
        public EndTag() {
            this.type = TokenType.EndTag;
        }

        public String toString() {
            return "</" + name() + ">";
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$StartTag.class */
    public static final class StartTag extends Tag {
        public StartTag() {
            this.attributes = new Attributes();
            this.type = TokenType.StartTag;
        }

        public StartTag nameAttr(String str, Attributes attributes) {
            this.tagName = str;
            this.attributes = attributes;
            return this;
        }

        @Override // org.jsoup.parser.Token.Tag, org.jsoup.parser.Token
        public Tag reset() {
            super.reset();
            this.attributes = new Attributes();
            return this;
        }

        public String toString() {
            StringBuilder sb2;
            String name;
            Attributes attributes = this.attributes;
            if (attributes == null || attributes.size() <= 0) {
                sb2 = new StringBuilder();
                sb2.append("<");
                name = name();
            } else {
                sb2 = new StringBuilder();
                sb2.append("<");
                sb2.append(name());
                sb2.append(" ");
                name = this.attributes.toString();
            }
            sb2.append(name);
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$Tag.class */
    public static abstract class Tag extends Token {
        public Attributes attributes;
        private boolean hasEmptyAttributeValue;
        private boolean hasPendingAttributeValue;
        private String pendingAttributeName;
        private StringBuilder pendingAttributeValue;
        public boolean selfClosing;
        public String tagName;

        public Tag() {
            super();
            this.pendingAttributeValue = new StringBuilder();
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            this.selfClosing = false;
        }

        private void ensureAttributeValue() {
            this.hasPendingAttributeValue = true;
        }

        public final void appendAttributeName(char c10) {
            appendAttributeName(String.valueOf(c10));
        }

        public final void appendAttributeName(String str) {
            String str2 = this.pendingAttributeName;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.pendingAttributeName = str;
        }

        public final void appendAttributeValue(char c10) {
            ensureAttributeValue();
            this.pendingAttributeValue.append(c10);
        }

        public final void appendAttributeValue(String str) {
            ensureAttributeValue();
            this.pendingAttributeValue.append(str);
        }

        public final void appendAttributeValue(char[] cArr) {
            ensureAttributeValue();
            this.pendingAttributeValue.append(cArr);
        }

        public final void appendTagName(char c10) {
            appendTagName(String.valueOf(c10));
        }

        public final void appendTagName(String str) {
            String str2 = this.tagName;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.tagName = str;
        }

        public final void finaliseTag() {
            if (this.pendingAttributeName != null) {
                newAttribute();
            }
        }

        public final Attributes getAttributes() {
            return this.attributes;
        }

        public final boolean isSelfClosing() {
            return this.selfClosing;
        }

        public final String name() {
            String str = this.tagName;
            Validate.isFalse(str == null || str.length() == 0);
            return this.tagName;
        }

        public final Tag name(String str) {
            this.tagName = str;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v14, types: [org.jsoup.nodes.Attribute] */
        /* JADX WARN: Type inference failed for: r0v17, types: [org.jsoup.nodes.Attribute] */
        public final void newAttribute() {
            if (this.attributes == null) {
                this.attributes = new Attributes();
            }
            if (this.pendingAttributeName != null) {
                this.attributes.put(this.hasPendingAttributeValue ? new Attribute(this.pendingAttributeName, this.pendingAttributeValue.toString()) : this.hasEmptyAttributeValue ? new Attribute(this.pendingAttributeName, "") : new BooleanAttribute(this.pendingAttributeName));
            }
            this.pendingAttributeName = null;
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            Token.reset(this.pendingAttributeValue);
        }

        @Override // org.jsoup.parser.Token
        public Tag reset() {
            this.tagName = null;
            this.pendingAttributeName = null;
            Token.reset(this.pendingAttributeValue);
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            this.selfClosing = false;
            this.attributes = null;
            return this;
        }

        public final void setEmptyAttributeValue() {
            this.hasEmptyAttributeValue = true;
        }
    }

    /* loaded from: combined.jar:classes3.jar:org/jsoup/parser/Token$TokenType.class */
    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    private Token() {
    }

    public static void reset(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public final Character asCharacter() {
        return (Character) this;
    }

    public final Comment asComment() {
        return (Comment) this;
    }

    public final Doctype asDoctype() {
        return (Doctype) this;
    }

    public final EndTag asEndTag() {
        return (EndTag) this;
    }

    public final StartTag asStartTag() {
        return (StartTag) this;
    }

    public final boolean isCharacter() {
        return this.type == TokenType.Character;
    }

    public final boolean isComment() {
        return this.type == TokenType.Comment;
    }

    public final boolean isDoctype() {
        return this.type == TokenType.Doctype;
    }

    public final boolean isEOF() {
        return this.type == TokenType.EOF;
    }

    public final boolean isEndTag() {
        return this.type == TokenType.EndTag;
    }

    public final boolean isStartTag() {
        return this.type == TokenType.StartTag;
    }

    public abstract Token reset();

    public String tokenType() {
        return getClass().getSimpleName();
    }
}
