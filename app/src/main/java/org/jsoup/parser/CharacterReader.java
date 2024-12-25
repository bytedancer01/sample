package org.jsoup.parser;

import java.util.Arrays;
import java.util.Locale;
import org.jsoup.helper.Validate;

/* loaded from: combined.jar:classes3.jar:org/jsoup/parser/CharacterReader.class */
final class CharacterReader {
    public static final char EOF = 65535;
    private static final int maxCacheLen = 12;
    private final char[] input;
    private final int length;
    private int pos = 0;
    private int mark = 0;
    private final String[] stringCache = new String[512];

    public CharacterReader(String str) {
        Validate.notNull(str);
        char[] charArray = str.toCharArray();
        this.input = charArray;
        this.length = charArray.length;
    }

    private String cacheString(int i10, int i11) {
        String str;
        char[] cArr = this.input;
        String[] strArr = this.stringCache;
        if (i11 > 12) {
            return new String(cArr, i10, i11);
        }
        int i12 = 0;
        int i13 = i10;
        int i14 = 0;
        while (i12 < i11) {
            i14 = (i14 * 31) + cArr[i13];
            i12++;
            i13++;
        }
        int length = (strArr.length - 1) & i14;
        String str2 = strArr[length];
        if (str2 == null) {
            str = new String(cArr, i10, i11);
            strArr[length] = str;
        } else {
            if (rangeEquals(i10, i11, str2)) {
                return str2;
            }
            str = new String(cArr, i10, i11);
        }
        return str;
    }

    public void advance() {
        this.pos++;
    }

    public char consume() {
        int i10 = this.pos;
        char c10 = i10 >= this.length ? (char) 65535 : this.input[i10];
        this.pos = i10 + 1;
        return c10;
    }

    public String consumeAsString() {
        char[] cArr = this.input;
        int i10 = this.pos;
        this.pos = i10 + 1;
        return new String(cArr, i10, 1);
    }

    public String consumeData() {
        int i10;
        char c10;
        int i11 = this.pos;
        int i12 = this.length;
        char[] cArr = this.input;
        while (true) {
            i10 = this.pos;
            if (i10 >= i12 || (c10 = cArr[i10]) == '&' || c10 == '<' || c10 == 0) {
                break;
            }
            this.pos = i10 + 1;
        }
        return i10 > i11 ? cacheString(i11, i10 - i11) : "";
    }

    public String consumeDigitSequence() {
        int i10;
        char c10;
        int i11 = this.pos;
        while (true) {
            i10 = this.pos;
            if (i10 >= this.length || (c10 = this.input[i10]) < '0' || c10 > '9') {
                break;
            }
            this.pos = i10 + 1;
        }
        return cacheString(i11, i10 - i11);
    }

    public String consumeHexSequence() {
        int i10;
        char c10;
        int i11 = this.pos;
        while (true) {
            i10 = this.pos;
            if (i10 >= this.length || (((c10 = this.input[i10]) < '0' || c10 > '9') && ((c10 < 'A' || c10 > 'F') && (c10 < 'a' || c10 > 'f')))) {
                break;
            }
            this.pos = i10 + 1;
        }
        return cacheString(i11, i10 - i11);
    }

    public String consumeLetterSequence() {
        int i10;
        char c10;
        int i11 = this.pos;
        while (true) {
            i10 = this.pos;
            if (i10 >= this.length || (((c10 = this.input[i10]) < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z'))) {
                break;
            }
            this.pos = i10 + 1;
        }
        return cacheString(i11, i10 - i11);
    }

    public String consumeLetterThenDigitSequence() {
        char c10;
        int i10 = this.pos;
        while (true) {
            int i11 = this.pos;
            if (i11 >= this.length || (((c10 = this.input[i11]) < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z'))) {
                break;
            }
            this.pos = i11 + 1;
        }
        while (!isEmpty()) {
            char[] cArr = this.input;
            int i12 = this.pos;
            char c11 = cArr[i12];
            if (c11 < '0' || c11 > '9') {
                break;
            }
            this.pos = i12 + 1;
        }
        return cacheString(i10, this.pos - i10);
    }

    public String consumeTagName() {
        int i10;
        char c10;
        int i11 = this.pos;
        int i12 = this.length;
        char[] cArr = this.input;
        while (true) {
            i10 = this.pos;
            if (i10 >= i12 || (c10 = cArr[i10]) == '\t' || c10 == '\n' || c10 == '\r' || c10 == '\f' || c10 == ' ' || c10 == '/' || c10 == '>' || c10 == 0) {
                break;
            }
            this.pos = i10 + 1;
        }
        return i10 > i11 ? cacheString(i11, i10 - i11) : "";
    }

    public String consumeTo(char c10) {
        int nextIndexOf = nextIndexOf(c10);
        if (nextIndexOf == -1) {
            return consumeToEnd();
        }
        String cacheString = cacheString(this.pos, nextIndexOf);
        this.pos += nextIndexOf;
        return cacheString;
    }

    public String consumeTo(String str) {
        int nextIndexOf = nextIndexOf(str);
        if (nextIndexOf == -1) {
            return consumeToEnd();
        }
        String cacheString = cacheString(this.pos, nextIndexOf);
        this.pos += nextIndexOf;
        return cacheString;
    }

    public String consumeToAny(char... cArr) {
        int i10 = this.pos;
        int i11 = this.length;
        loop0: while (this.pos < i11) {
            for (char c10 : cArr) {
                if (this.input[this.pos] == c10) {
                    break loop0;
                }
            }
            this.pos++;
        }
        int i12 = this.pos;
        return i12 > i10 ? cacheString(i10, i12 - i10) : "";
    }

    public String consumeToAnySorted(char... cArr) {
        int i10 = this.pos;
        int i11 = this.length;
        char[] cArr2 = this.input;
        while (true) {
            int i12 = this.pos;
            if (i12 >= i11 || Arrays.binarySearch(cArr, cArr2[i12]) >= 0) {
                break;
            }
            this.pos++;
        }
        int i13 = this.pos;
        return i13 > i10 ? cacheString(i10, i13 - i10) : "";
    }

    public String consumeToEnd() {
        int i10 = this.pos;
        String cacheString = cacheString(i10, this.length - i10);
        this.pos = this.length;
        return cacheString;
    }

    public boolean containsIgnoreCase(String str) {
        Locale locale = Locale.ENGLISH;
        return nextIndexOf(str.toLowerCase(locale)) > -1 || nextIndexOf(str.toUpperCase(locale)) > -1;
    }

    public char current() {
        int i10 = this.pos;
        return i10 >= this.length ? (char) 65535 : this.input[i10];
    }

    public boolean isEmpty() {
        return this.pos >= this.length;
    }

    public void mark() {
        this.mark = this.pos;
    }

    public boolean matchConsume(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matchConsumeIgnoreCase(String str) {
        if (!matchesIgnoreCase(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    public boolean matches(char c10) {
        return !isEmpty() && this.input[this.pos] == c10;
    }

    public boolean matches(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != this.input[this.pos + i10]) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        char c10 = this.input[this.pos];
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAnySorted(char[] cArr) {
        return !isEmpty() && Arrays.binarySearch(cArr, this.input[this.pos]) >= 0;
    }

    public boolean matchesDigit() {
        if (isEmpty()) {
            return false;
        }
        char c10 = this.input[this.pos];
        boolean z10 = false;
        if (c10 >= '0') {
            z10 = false;
            if (c10 <= '9') {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean matchesIgnoreCase(String str) {
        int length = str.length();
        if (length > this.length - this.pos) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (Character.toUpperCase(str.charAt(i10)) != Character.toUpperCase(this.input[this.pos + i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r0 <= 'z') goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean matchesLetter() {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.isEmpty()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r3
            char[] r0 = r0.input
            r1 = r3
            int r1 = r1.pos
            char r0 = r0[r1]
            r4 = r0
            r0 = r4
            r1 = 65
            if (r0 < r1) goto L23
            r0 = r4
            r1 = 90
            if (r0 <= r1) goto L33
        L23:
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 97
            if (r0 < r1) goto L35
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 > r1) goto L35
        L33:
            r0 = 1
            r5 = r0
        L35:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.matchesLetter():boolean");
    }

    public int nextIndexOf(char c10) {
        for (int i10 = this.pos; i10 < this.length; i10++) {
            if (c10 == this.input[i10]) {
                return i10 - this.pos;
            }
        }
        return -1;
    }

    public int nextIndexOf(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        int i10 = this.pos;
        while (i10 < this.length) {
            int i11 = i10;
            if (charAt != this.input[i10]) {
                do {
                    i10++;
                    i11 = i10;
                    if (i10 >= this.length) {
                        break;
                    }
                    i11 = i10;
                } while (charAt != this.input[i10]);
            }
            i10 = i11 + 1;
            int length = (charSequence.length() + i10) - 1;
            int i12 = this.length;
            if (i11 < i12 && length <= i12) {
                int i13 = i10;
                for (int i14 = 1; i13 < length && charSequence.charAt(i14) == this.input[i13]; i14++) {
                    i13++;
                }
                if (i13 == length) {
                    return i11 - this.pos;
                }
            }
        }
        return -1;
    }

    public int pos() {
        return this.pos;
    }

    public boolean rangeEquals(int i10, int i11, String str) {
        if (i11 != str.length()) {
            return false;
        }
        char[] cArr = this.input;
        int i12 = 0;
        while (i11 != 0) {
            if (cArr[i10] != str.charAt(i12)) {
                return false;
            }
            i10++;
            i11--;
            i12++;
        }
        return true;
    }

    public void rewindToMark() {
        this.pos = this.mark;
    }

    public String toString() {
        char[] cArr = this.input;
        int i10 = this.pos;
        return new String(cArr, i10, this.length - i10);
    }

    public void unconsume() {
        this.pos--;
    }
}
