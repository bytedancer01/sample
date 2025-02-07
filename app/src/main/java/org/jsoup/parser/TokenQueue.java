package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/TokenQueue.class */
public class TokenQueue {
    private static final char ESC = '\\';
    private int pos = 0;
    private String queue;

    public TokenQueue(String str) {
        Validate.notNull(str);
        this.queue = str;
    }

    private int remainingLength() {
        return this.queue.length() - this.pos;
    }

    public static String unescape(String str) {
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (true) {
            char c11 = c10;
            if (i10 >= length) {
                return sb2.toString();
            }
            char c12 = charArray[i10];
            if (c12 != '\\' || (c11 != 0 && c11 == '\\')) {
                sb2.append(c12);
            }
            i10++;
            c10 = c12;
        }
    }

    public void addFirst(Character ch2) {
        addFirst(ch2.toString());
    }

    public void addFirst(String str) {
        this.queue = str + this.queue.substring(this.pos);
        this.pos = 0;
    }

    public void advance() {
        if (isEmpty()) {
            return;
        }
        this.pos++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (r12 != '\\') goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String chompBalanced(char r5, char r6) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokenQueue.chompBalanced(char, char):java.lang.String");
    }

    public String chompTo(String str) {
        String consumeTo = consumeTo(str);
        matchChomp(str);
        return consumeTo;
    }

    public String chompToIgnoreCase(String str) {
        String consumeToIgnoreCase = consumeToIgnoreCase(str);
        matchChomp(str);
        return consumeToIgnoreCase;
    }

    public char consume() {
        String str = this.queue;
        int i10 = this.pos;
        this.pos = i10 + 1;
        return str.charAt(i10);
    }

    public void consume(String str) {
        if (!matches(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > remainingLength()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.pos += length;
    }

    public String consumeAttributeKey() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_', ':'))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeCssIdentifier() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('-', '_'))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeElementSelector() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny('|', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeTagName() {
        int i10 = this.pos;
        while (!isEmpty() && (matchesWord() || matchesAny(':', '_', '-'))) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeTo(String str) {
        int indexOf = this.queue.indexOf(str, this.pos);
        if (indexOf == -1) {
            return remainder();
        }
        String substring = this.queue.substring(this.pos, indexOf);
        this.pos += substring.length();
        return substring;
    }

    public String consumeToAny(String... strArr) {
        int i10 = this.pos;
        while (!isEmpty() && !matchesAny(strArr)) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public String consumeToIgnoreCase(String str) {
        int i10;
        int i11;
        int i12 = this.pos;
        String substring = str.substring(0, 1);
        boolean equals = substring.toLowerCase().equals(substring.toUpperCase());
        while (!isEmpty() && !matches(str)) {
            if (equals) {
                int indexOf = this.queue.indexOf(substring, this.pos);
                int i13 = this.pos;
                int i14 = indexOf - i13;
                if (i14 == 0) {
                    i11 = i13 + 1;
                } else if (i14 < 0) {
                    i10 = this.queue.length();
                } else {
                    i11 = i13 + i14;
                }
                this.pos = i11;
            } else {
                i10 = this.pos + 1;
            }
            this.pos = i10;
        }
        return this.queue.substring(i12, this.pos);
    }

    public boolean consumeWhitespace() {
        boolean z10 = false;
        while (true) {
            boolean z11 = z10;
            if (!matchesWhitespace()) {
                return z11;
            }
            this.pos++;
            z10 = true;
        }
    }

    public String consumeWord() {
        int i10 = this.pos;
        while (matchesWord()) {
            this.pos++;
        }
        return this.queue.substring(i10, this.pos);
    }

    public boolean isEmpty() {
        return remainingLength() == 0;
    }

    public boolean matchChomp(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matches(String str) {
        return this.queue.regionMatches(true, this.pos, str, 0, str.length());
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        for (char c10 : cArr) {
            if (this.queue.charAt(this.pos) == c10) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAny(String... strArr) {
        for (String str : strArr) {
            if (matches(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesCS(String str) {
        return this.queue.startsWith(str, this.pos);
    }

    public boolean matchesStartTag() {
        boolean z10 = true;
        if (remainingLength() < 2 || this.queue.charAt(this.pos) != '<' || !Character.isLetter(this.queue.charAt(this.pos + 1))) {
            z10 = false;
        }
        return z10;
    }

    public boolean matchesWhitespace() {
        return !isEmpty() && StringUtil.isWhitespace(this.queue.charAt(this.pos));
    }

    public boolean matchesWord() {
        return !isEmpty() && Character.isLetterOrDigit(this.queue.charAt(this.pos));
    }

    public char peek() {
        return isEmpty() ? (char) 0 : this.queue.charAt(this.pos);
    }

    public String remainder() {
        String str = this.queue;
        String substring = str.substring(this.pos, str.length());
        this.pos = this.queue.length();
        return substring;
    }

    public String toString() {
        return this.queue.substring(this.pos);
    }
}
